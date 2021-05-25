package com.xiaoming.controller;

import com.xiaoming.utils.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("Model")
public class ModelController {
    
    // 
    
    
    @ResponseBody
    @RequestMapping("/AddModel")
    public Msg addModel(model model){
        Date date = new Date();
        System.out.println(model);
        model.setCreateTime(date);
        model.setUpdateTime(date);
        try{
            
        }catch (Exception e){
            
        }
        return Msg.success();
    }
}
