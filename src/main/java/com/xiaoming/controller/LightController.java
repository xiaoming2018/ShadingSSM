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
    public Msg getLightById(Integer lightId){
        MyLight light =  lightService.getLightById(lightId);
        if(light != null){
            return Msg.success().add("light", light);
        } else{
            return Msg.fail().add("message", "no light with this id");
        }
    }
    
    @ResponseBody
    @RequestMapping("/AddLight")
    public Msg addLight(MyLight light){
        Date date = new Date();
        light.setUpdateTime(date);
        light.setCreateTime(date);
        
        int flag = 0;
        
        // 动态场景ID
        light.setSceneId(1);
        try{
            flag = lightService.insertSelectiveLight(light);
            if(flag == 1){
                return Msg.success();
            } else {
                return Msg.fail();  
            }
        }catch (Exception e) {
            e.printStackTrace();
            return Msg.fail();
        }
    }
    
}
