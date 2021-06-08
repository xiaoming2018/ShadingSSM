package com.xiaoming.controller;

import com.alibaba.fastjson.JSONArray;
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

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
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
    public Msg fileUpload(MultipartFile modelfile, HttpSession session, HttpServletRequest request) {
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
                //ModelFilePath = paths[0];
            } else {
                ModelFileIndex = "";
            }
            System.out.println(ModelFilePath);
            filePath = "/upload/" + filePath;
            return Msg.success().add("filePath", filePath);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return Msg.fail();
        }
    }

    /**
     * json 配置文件导出
     */

    @RequestMapping("/downFile")
    public ResponseEntity<byte[]> testdownFile(HttpSession session) throws IOException {

        String jsonString = createDataJson();
        // 文件是否成功
        boolean flag = true;

        // 文件路径
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
            flag = false;
            e.printStackTrace();
        }

        ServletContext servletContext = session.getServletContext();
        InputStream in = servletContext.getResourceAsStream("E:/upload/scene.json");

        byte[] bytes = FileCopyUtils.copyToByteArray(in);
        HttpHeaders header = new HttpHeaders();
        header.add("Content-Disposition", "attachment;filename=scene.json");
        ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(bytes, header, HttpStatus.OK);
        return entity;
    }

    private String createDataJson() {
        List<JSONArray> list = new ArrayList<>();
       
        // meshs;
        List<MyModel> modelList = modelService.getModelBySceneID(1);
        JSONArray array = new JSONArray(Collections.singletonList(modelList));
        list.add(array);
       
        // cameras;
        List<MyCamera> cameraList = cameraService.getCameraBySceneID(1);
        JSONArray array1 = new JSONArray(Collections.singletonList(cameraList));
        list.add(array1);
        
        // lights;
        List<MyLight> lightList = lightService.getLightBySceneID(1);
        JSONArray array2 = new JSONArray(Collections.singletonList(lightList));
        list.add(array2);
        
        System.out.println(list.toString());
        return list.toString();
    }
}
    