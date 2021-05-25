package com.xiaoming.controller;

import com.xiaoming.utils.FileProcess;
import com.xiaoming.utils.Msg;
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
    
    FileProcess fileProcess = new FileProcess();

    @ResponseBody
    @RequestMapping("files/upload")
    public Msg fileUpload(MultipartFile modelfile, HttpSession session, HttpServletRequest request){
        /**
         * 文件上传处理
         * return 文件路径
         * test 数据库
         */

        String ModelFilePath = "E:\\upload";
        String ModelFileIndex;
        String filePath;
        try{
            filePath = fileProcess.myUploadfile(modelfile, request);
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
            filePath = "/upload/" + filePath;
            return Msg.success().add("filePath", filePath);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return Msg.fail();
        }
    }
}
