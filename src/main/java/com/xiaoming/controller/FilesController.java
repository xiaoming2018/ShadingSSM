package com.xiaoming.controller;

import com.alibaba.fastjson.JSONObject;
import com.xiaoming.model.MyCamera;
import com.xiaoming.model.MyLight;
import com.xiaoming.model.MyModel;
import com.xiaoming.service.Impl.CameraServiceImpl;
import com.xiaoming.service.Impl.LightServiceImpl;
import com.xiaoming.service.Impl.ModelServiceImpl;
import com.xiaoming.utils.FileProcess;
import com.xiaoming.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 文件控制器-上传等相关配置
 */

@Controller
@RequestMapping("files")
public class FilesController {

    @Autowired
    private ModelServiceImpl modelService;

    @Autowired
    private CameraServiceImpl cameraService;

    @Autowired
    private LightServiceImpl lightService;

    FileProcess fileProcess = new FileProcess();

    @ResponseBody
    @RequestMapping("/upload")
    public Msg fileUpload(MultipartFile modelfile, HttpServletRequest request) {

        /**
         * 文件上传处理
         * return 文件路径
         * test 数据库
         */
        String ModelFilePath = "E:\\upload";
        String ModelFileIndex;
        String filePath;
        try {
            filePath = fileProcess.myUploadfile(modelfile, request);
            String[] suffixNameArr = filePath.split("\\.");
            ModelFileIndex = suffixNameArr[suffixNameArr.length - 1];
            if (ModelFileIndex.equals("mtl") || ModelFileIndex.equals("obj") || ModelFileIndex.equals("doc")) {
                String sufferBuffer = suffixNameArr[0];
                String[] paths = sufferBuffer.split("\\\\");
                ModelFileIndex = paths[paths.length - 1];
            } else {
                ModelFileIndex = "";
            }
            filePath = "/upload/" + filePath;
            ModelFileIndex = "/upload/" + ModelFileIndex;
            return Msg.success().add("filePath", filePath).add("fileIndex", ModelFileIndex);
        } catch (Exception e) {
            return Msg.fail();
        }
    }

    /**
     * json 配置文件导出
     */
    @RequestMapping("/downFile")
    public ResponseEntity<byte[]> testdownFile(HttpSession session) throws IOException {
        String jsonString = createDataJson();
        String fullpath = "E:/upload/scene.json";
        File file;
        try {
            file = new File(fullpath);
            if (file.exists())
                file.delete();
            file.createNewFile();

            // 将格式化后的字符串写入文件
            Writer write = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
            write.write(jsonString);
            write.flush();
            write.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        InputStream in = new BufferedInputStream(new FileInputStream(new File("E:/upload/scene.json")));
        byte[] bytes = FileCopyUtils.copyToByteArray(in);
        HttpHeaders header = new HttpHeaders();
        header.add("Content-Disposition", "attachment;filename=scene.json");
        ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(bytes, header, HttpStatus.OK);
        return entity;
    }

    private String createDataJson() {
        JSONObject mes = new JSONObject();

        // meshs;
        List<JSONObject> meshs = new ArrayList<>();
        List<MyModel> models = modelService.getModelBySceneID(1);
        for (MyModel tmpModel : models) {
            JSONObject mol = new JSONObject();
            mol.put("file", tmpModel.getModelFilePath());
            mol.put("mtl_file", tmpModel.getModelFileIndex() + ".mtl");
            mol.put("translate", new Float[]{tmpModel.getModelPositionX(), tmpModel.getModelPositionY(), tmpModel.getModelPositionZ()});
            meshs.add(mol);
        }
        mes.put("meshs", meshs);

        // cameras;
        List<JSONObject> cameras = new ArrayList<>();
        List<MyCamera> cameraList = cameraService.getCameraBySceneID(1);
        for (MyCamera tmpCam : cameraList) {
            JSONObject cam = new JSONObject();
            if (tmpCam.getCameraId() == 1101)
                continue;
            cam.put("eye", new Float[]{tmpCam.getCameraPositionX(), tmpCam.getCameraPositionY(), tmpCam.getCameraPositionZ()});
            cam.put("lookat", new Float[]{Float.valueOf(0), Float.valueOf(0), Float.valueOf(0)});
            cam.put("up", new Float[]{Float.valueOf(0), Float.valueOf(1), Float.valueOf(0)});
            cameras.add(cam);
        }
        mes.put("cameras", cameras);

        // lights;
        List<JSONObject> lights = new ArrayList<>();
        List<MyLight> lightList = lightService.getLightBySceneID(1);
        for (MyLight tmplight : lightList) {
            JSONObject lig = new JSONObject();
            lig.put("pos", new Float[]{tmplight.getLightPositionX(), tmplight.getLightPositionY(), tmplight.getLightPositionZ()});
            lig.put("color", tmplight.getLightColor());
            lig.put("casts_shadow", tmplight.getLightCastsShadow() == "true" ? 1 : 0);
            lights.add(lig);
        }
        mes.put("lights", lights);
        return mes.toString();
    }
}
    