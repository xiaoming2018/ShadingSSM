package com.xiaoming.controller;

import com.xiaoming.model.MyCamera;
import com.xiaoming.service.Impl.CameraServiceImpl;
import com.xiaoming.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("Camera")
public class CameraController {

    @Autowired
    private CameraServiceImpl cameraService;

    @ResponseBody
    @RequestMapping("/AddCamera")
    public Msg addCamera(MyCamera camera) {
        Date date = new Date();
        camera.setCreateTime(date);
        camera.setUpdateTime(date);

        // 获取当前场景id
        camera.setSceneId(1);
        camera.setCameraNear(0.1F);
        camera.setCameraFar(1000F);
        camera.setCameraVisibility("true");
        camera.setCameraFieldOfView(45);
        try {
            int flag = cameraService.insertSelectiveCamera(camera);
            if (flag == 1) {
                return Msg.success().add("message", "插入camera成功");
            } else {
                return Msg.fail().add("message", "插入数据库失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return Msg.fail().add("message", "添加camera失败");
        }
    }

    @ResponseBody
    @RequestMapping("/UpdateCamera")
    public Msg updateCamera(MyCamera camera) {
        Date date = new Date();
        camera.setUpdateTime(date);
        try {
            int flag = cameraService.updateCamera(camera);
            if (flag == 1) {
                return Msg.success().add("message", "update camera success");
            } else {
                return Msg.fail().add("message", "update camera failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return Msg.fail().add("message", "update camera failed");
        }
    }

    @ResponseBody
    @RequestMapping("/DeleteCamera")
    public Msg deleteCamera(Integer cameraId) {
        try {
            int flag = cameraService.deleteCameraById(cameraId);
            if (flag == 1) {
                return Msg.success().add("message", "delete camera success");
            } else {
                return Msg.fail().add("message", "delete camera faield");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return Msg.fail().add("message", "delete camera failed");
        }
    }

    @ResponseBody
    @RequestMapping("/GetCameraById")
    public Msg getCameraById(Integer cameraId) {
        MyCamera camera = cameraService.getCameraById(cameraId);
        if (camera != null) {
            return Msg.success().add("camera", camera);
        } else {
            return Msg.fail().add("message", "no camera with this id");
        }
    }
}
