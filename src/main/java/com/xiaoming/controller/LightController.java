package com.xiaoming.controller;

import com.xiaoming.model.MyLight;
import com.xiaoming.service.Impl.LightServiceImpl;
import com.xiaoming.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    
}
