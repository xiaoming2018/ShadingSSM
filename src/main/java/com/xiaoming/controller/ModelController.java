package com.xiaoming.controller;

import com.xiaoming.model.MyModel;
import com.xiaoming.service.Impl.ModelServiceImpl;
import com.xiaoming.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("Model")
public class ModelController {
    
    @Autowired
    private ModelServiceImpl modelService;
    
    @ResponseBody
    @RequestMapping("/AddModel")
    public Msg addModel(MyModel model){
        Date date = new Date();
        System.out.println(model);
        model.setCreateTime(date);
        model.setUpdateTime(date);
        
        // 动态获取 场景ID
        model.setSceneId(1);
        try{
            int flag = modelService.insertSelectiveModel(model);
            if(flag == 1){
                return Msg.success();
            }else {
                return Msg.fail();
            }
        }catch (Exception e){
            e.printStackTrace();
            return Msg.fail();
        }
    }
    
    @ResponseBody
    @RequestMapping("/GetModelById")
    public Msg getModelById(Integer modelId){
        MyModel model = modelService.getModelByID(modelId);
        return Msg.success().add("model", model);
    }
    
    @ResponseBody
    @RequestMapping("/GetAllModels")
    public Msg getAllModels(){
        List<MyModel> models = modelService.getAllModels();
        return Msg.success().add("models", models);
    }
    
    
}
