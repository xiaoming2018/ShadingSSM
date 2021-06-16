package com.xiaoming.controller;

import com.xiaoming.model.MyLight;
import com.xiaoming.service.Impl.LightServiceImpl;
import com.xiaoming.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("Light")
public class LightController {

    @Autowired
    private LightServiceImpl lightService;


    @ResponseBody
    @RequestMapping("/GetLightById")
    public Msg getLightById(Integer lightId) {
        MyLight light = lightService.getLightById(lightId);
        if (light != null) {
            return Msg.success().add("light", light);
        } else {
            return Msg.fail().add("message", "no light with this id");
        }
    }

    @ResponseBody
    @RequestMapping("/AddLight")
    public Msg addLight(MyLight light) {
        Date date = new Date();
        light.setUpdateTime(date);
        light.setCreateTime(date);
        
        // 动态场景ID
        light.setSceneId(1);
        try {
            int flag = lightService.insertSelectiveLight(light);
            if (flag == 1) {
                return Msg.success();
            } else {
                return Msg.fail();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return Msg.fail();
        }
    }

    @ResponseBody
    @RequestMapping("/UpdateLight")
    public Msg updateLight(MyLight light) {
        System.out.println(light);
        try {
            int flag = lightService.updateLight(light);
            if (flag == 1) {
                return Msg.success().add("message", "update light success");
            } else {
                return Msg.fail().add("message", "update light failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return Msg.fail().add("message", "update light error");
        }
    }

    @ResponseBody
    @RequestMapping("/DeleteLight")
    public Msg deleteLight(Integer lightId) {
        System.out.println(lightId);
        try {
            int flag = lightService.deleteLight(lightId);
            if (flag == 1) {
                return Msg.success().add("message", "delete light success");
            } else {
                return Msg.fail().add("message", "delete light failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return Msg.fail().add("message", "delete light failed " + e.getMessage());
        }
    }

}
