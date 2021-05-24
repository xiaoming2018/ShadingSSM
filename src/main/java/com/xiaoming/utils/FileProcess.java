package com.xiaoming.utils;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * 文件处理类
 * 1) 文件名分割
 * 2）文件路径处理
 */

public class FileProcess {

    // 使用外部配置路径进行模型文件上传 E:\\upload
    public String myUploadfile(MultipartFile file, HttpServletRequest request){
        String path = "E://upload";
        //String path = request.getServletContext().getRealPath("/upload");
        String oldFileName = file.getOriginalFilename();
        String[] suffixNameArr = oldFileName.split("\\."); 
        String suffixName = suffixNameArr[suffixNameArr.length - 1]; // 文件后缀名
        // 新文件名
        String fileName = getTime() + "xiaoming"+ "."+ suffixName;
        File targetFile = new File(path, fileName);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }
        try{
            file.transferTo(targetFile);
        }catch (Exception e){
            e.printStackTrace();
        }
        return fileName;
    }
    
    // 获取 以时间戳拼接的文件名
    public String getFileName(MultipartFile file) {
        String fileName = file.getOriginalFilename();
        String[] suffixNameArr = fileName.split("\\.");
        String suffixName = suffixNameArr[suffixNameArr.length - 1];
        // String userName = SecurityContextHolder.getContext().getAuthentication().getName();
        String userName = "xiaoming";
        return getTime() + userName + "." + suffixName;
    }
    
    // 文件上传，返回文件路径
    public String uploadFile(MultipartFile file, HttpSession session) throws IOException{
        String FILE_PATH = session.getServletContext().getRealPath("/") + "resource\\modelfile\\";
        String fileName = getFileName(file);
        File tempFile = new File(FILE_PATH, fileName);

        if (!tempFile.getParentFile().exists()) {
            tempFile.getParentFile().mkdir();
        }
        if (!tempFile.exists()) {
            tempFile.createNewFile();
        }
        file.transferTo(tempFile);  //将上传文件写到服务器上指定的文件。
        return "resource\\model\\" + tempFile.getName();
    }

    // uploadFiles
    public String uploadFiles(MultipartFile file, HttpSession session) throws IOException {
        String fileName = file.getOriginalFilename();
        String FILE_PATH = session.getServletContext().getRealPath("/") + "resource\\modelfile\\";
        File tempFile = new File(FILE_PATH, fileName);
        if (!tempFile.getParentFile().exists()) {
            tempFile.getParentFile().mkdir();
        }
        if (!tempFile.exists()) {
            tempFile.createNewFile();
        }
        file.transferTo(tempFile);  //将上传文件写到服务器上指定的文件。
        return "resource\\modelfile\\" + tempFile.getName();
    }
    

    public String getTime() {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        String nowTime = df.format(date);
        return nowTime;
    }
}
