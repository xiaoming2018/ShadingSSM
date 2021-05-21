package com.xiaoming.controller;

import com.alibaba.fastjson.JSONObject;
import com.xiaoming.utils.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("user")
public class LoginController {

    @RequestMapping(value = "/login")
    @ResponseBody
    public Msg login(String ins) {

        // layui tree data package
        System.out.println(ins);
        // model
        List<JSONObject> modellist = new ArrayList<>();
        JSONObject model1 = new JSONObject();
        model1.put("id", "201");
        model1.put("title", "模型1");
        JSONObject model2 = new JSONObject();
        model2.put("id", "202");
        model2.put("title", "模型2");
        modellist.add(model1);
        modellist.add(model2);

        JSONObject model = new JSONObject();
        model.put("id","模型");
        model.put("title", "模型");
        model.put("spread", true);
        model.put("children", modellist);

        List<JSONObject> cameraList = new ArrayList<>();
        JSONObject camera1 = new JSONObject();
        camera1.put("id", "211");
        camera1.put("title", "相机1");
        cameraList.add(camera1);

        JSONObject camera = new JSONObject();
        camera.put("id", "220");
        camera.put("title", "相机");
        camera.put("children", cameraList);


        List<JSONObject> ls = new ArrayList<>();
        ls.add(model);
        ls.add(camera);

        JSONObject scene = new JSONObject();
        scene.put("id", "101"); // scene id
        scene.put("title", "默认场景"); // scene title
        scene.put("spread", true); //
        scene.put("children", ls);

        System.out.println("information" + scene);
        return Msg.success().add("data", scene);
    }

}
