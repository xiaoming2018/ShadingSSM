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
    public Msg fileUpload(MultipartFile file, HttpSession session){
        /**
         * 文件上传处理
         * return 文件路径
         * test 数据库
         */

        String ModelFilePath = "resource/modelFile/";
        String ModelFileIndex;
        String filePath;
        try{
            filePath = fileProcess.uploadFiles(file, session);
            String[] suffixNameArr = filePath.split("\\.");
            ModelFileIndex = suffixNameArr[suffixNameArr.length - 1];
            if (ModelFileIndex.equals("mtl") || ModelFileIndex.equals("obj") || ModelFileIndex.equals("doc")) {
                String sufferBuffer = suffixNameArr[0];
                String []paths = sufferBuffer.split("\\\\");
                ModelFileIndex = paths[paths.length - 1];
            }else {
                ModelFileIndex = "";
            }
            System.out.println(ModelFilePath);
            System.out.println(ModelFileIndex);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return Msg.fail();
        }

        model model = new model();
        model.setModelId(1);

        try{
            int count = modelService.insertSelectiveModel(model);
            System.out.println("插入行数：" + count);
            return Msg.success();
        }catch(Exception e){
            return Msg.fail();
        }
    }
}
