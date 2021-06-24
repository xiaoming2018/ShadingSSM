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
    public Msg addModel(MyModel model) {

        // model file index 
        Date date = new Date();
        model.setCreateTime(date);
        model.setUpdateTime(date);

        // 动态获取 场景ID
        model.setSceneId(1);
        model.setModelPositionX(new Float(0));
        model.setModelPositionY(new Float(0));
        model.setModelPositionZ(new Float(0));

        model.setModelRotationX(new Float(0));
        model.setModelRotationY(new Float(0));
        model.setModelRotationZ(new Float(0));

        model.setModelScaleX(new Float(0));
        model.setModelScaleY(new Float(0));
        model.setModelScaleZ(new Float(0));

        try {
            int flag = modelService.insertSelectiveModel(model);
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
    @RequestMapping("UpdateModel")
    public Msg updateModel(MyModel model) {
        Date date = new Date();
        model.setUpdateTime(date);
        try {
            int flag = modelService.updateModel(model);
            if (flag == 1) {
                return Msg.success().add("meaage", "update model success");
            } else {
                return Msg.fail().add("message", "update model failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return Msg.fail().add("message", "update model error");
        }
    }

    @ResponseBody
    @RequestMapping("DeleteModel")
    public Msg deleteMode(Integer modelId) {
        try {
            int flag = modelService.deleteModelByModelId(modelId);
            if (flag == 1) {
                return Msg.success().add("message", "delete model sucess");
            } else {
                return Msg.fail().add("message", "delete model error");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return Msg.fail().add("message", "delet model in database error");
        }
    }


    @ResponseBody
    @RequestMapping("/GetModelById")
    public Msg getModelById(Integer modelId) {
        MyModel model = modelService.getModelByID(modelId);
        if (model != null) {
            return Msg.success().add("model", model);
        } else {
            return Msg.fail().add("message", "no model with this id");
        }
    }

    @ResponseBody
    @RequestMapping("/GetAllModels")
    public Msg getAllModels() {
        List<MyModel> models = modelService.getAllModels();
        return Msg.success().add("models", models);
    }

}
