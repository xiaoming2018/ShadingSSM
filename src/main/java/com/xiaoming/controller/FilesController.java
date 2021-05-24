package com.xiaoming.controller;

import com.sun.javaws.IconUtil;
import com.xiaoming.model.model;
import com.xiaoming.service.Impl.ModelServiceImpl;
import com.xiaoming.utils.FileProcess;
import com.xiaoming.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 文件控制器-上传等相关配置
 */

@Controller
public class FilesController {

    @Autowired
    private ModelServiceImpl modelService;
    
    FileProcess fileProcess = new FileProcess();

    @ResponseBody
    @RequestMapping("files/upload")
    public Msg fileUpload(MultipartFile file, HttpSession session, HttpServletRequest request){
        /**
         * 文件上传处理
         * return 文件路径
         * test 数据库
         */

        String ModelFilePath = "E:\\upload";
        String ModelFileIndex;
        String filePath;
        try{
            filePath = fileProcess.myUploadfile(file, request);
            String[] suffixNameArr = filePath.split("\\.");
            ModelFileIndex = suffixNameArr[suffixNameArr.length - 1];
            if (ModelFileIndex.equals("mtl") || ModelFileIndex.equals("obj") || ModelFileIndex.equals("doc")) {
                String sufferBuffer = suffixNameArr[0];
                String []paths = sufferBuffer.split("\\\\");
                ModelFileIndex = paths[paths.length - 1];
                //ModelFilePath = paths[0];
            }else {
                ModelFileIndex = "";
            }
            System.out.println(ModelFilePath);
            System.out.println(ModelFileIndex);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return Msg.fail();
        }

        // 数据库更新操作
        // 需要做数据库重复性校验-操作入库
        model model = new model();
        model.setModelId(1);
        model.setModelFileindex(ModelFileIndex); // 文件名前缀
        model.setModelFilepath(ModelFilePath);   // 相对路径下的文件路径 -- resource/modelfile/  

        try{
            int count = modelService.insertSelectiveModel(model);
            System.out.println("插入行数：" + count);
            return Msg.success();
        }catch(Exception e){
            return Msg.fail();
        }
    }
}
