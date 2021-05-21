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

    // 获取 文件名
    public String getFileName(MultipartFile file, HttpServletRequest request, HttpSession session) {
        String fileName = file.getOriginalFilename();
        String[] suffixNameArr = fileName.split("\\.");
        String suffixName = suffixNameArr[suffixNameArr.length - 1];
        // String userName = SecurityContextHolder.getContext().getAuthentication().getName();
        String userName = "xiaoming";
        return getTime() + userName + "." + suffixName;
    }
    
    // 文件上传，返回文件路径
    public String uploadFile(MultipartFile file, HttpServletRequest request, HttpSession session) throws IOException{
        String FILE_PATH = session.getServletContext().getRealPath("/") + "resource\\upload";
        String fileName = getFileName(file, request, session);
        File tempFile = new File(FILE_PATH, fileName);

        if (!tempFile.getParentFile().exists()) {
            tempFile.getParentFile().mkdir();
        }
        if (!tempFile.exists()) {
            tempFile.createNewFile();
        }
        file.transferTo(tempFile);  //将上传文件写到服务器上指定的文件。
        return "resource\\upload\\" + tempFile.getName();
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
