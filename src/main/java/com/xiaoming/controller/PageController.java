package com.xiaoming.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.xiaoming.model.*;
import com.xiaoming.service.Impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("page")
public class PageController {

    @Autowired
    private ModelTypeServiceImpl modelTypeService;

    // 场景 scene serviceImpl
    @Autowired
    private SceneServiceImpl sceneService;

    @Autowired
    private ModelServiceImpl modelService;

    @Autowired
    private CameraServiceImpl cameraService;

    @Autowired
    private LightServiceImpl lightService;

    /**
     * 获取页面参数
     */
    @RequestMapping("/toIndex")
    public String ToIndexJSP(Model model) {
        Integer sceneID = 1; // 默认场景ID
        List<JSONObject> sceneList = new ArrayList<>();
        // 默认相机设置
        JSONObject initcamera = new JSONObject();
        MyCamera initcam = cameraService.getCameraById(1101);
        model.addAttribute("initcam", new JSONObject().toJSONString(initcam));
        if (initcam == null) {
            model.addAttribute("message", "get init camera error");
            return "error";
        }
        initcamera.put("id", initcam.getCameraId());
        initcamera.put("title", initcam.getCameraTitle());
        sceneList.add(initcamera);

        List<MyScene> scenes = sceneService.getScence();
        for (MyScene tmpScene : scenes) {
            JSONObject sce = new JSONObject();
            sce.put("id", tmpScene.getSceneId()); // 场景id
            sce.put("title", tmpScene.getSceneTitle()); // 场景title
            sce.put("spread", true);
            List<JSONObject> tmp = getSceneChildenByID(tmpScene.getSceneId());
            sce.put("children", tmp);
            sceneList.add(sce);
        }
        model.addAttribute("treeData", sceneList);

        // JSON数组 给前端js处理
        List<MyModel> modelList = modelService.getAllModels();
        JSONArray modelArray = new JSONArray(Collections.singletonList(modelList));
        model.addAttribute("models", modelArray); // 

        List<MyCamera> cameraList = cameraService.getCameraBySceneID(sceneID);
        JSONArray cameraArray = new JSONArray(Collections.singletonList(cameraList));
        model.addAttribute("cameras", cameraArray);

        List<MyLight> lightList = lightService.getLightBySceneID(sceneID);
        JSONArray lightArray = new JSONArray(Collections.singletonList(lightList));
        model.addAttribute("lights", lightArray);
        return "index";
    }

    /**
     * 根据 sceneID 进行 节点拼装
     *
     * @param sceneID
     * @return
     */
    public List<JSONObject> getSceneChildenByID(Integer sceneID) {
        List<JSONObject> ls = new ArrayList<>(); // 基础包含三组数据
        // 封装 model package
        List<JSONObject> modelList = new ArrayList<>();
        List<MyModel> models = modelService.getModelBySceneID(sceneID);
        for (MyModel tmpModel : models) {
            JSONObject mol = new JSONObject();
            mol.put("id", tmpModel.getModelId());
            mol.put("title", tmpModel.getModelTitle());
            mol.put("spread", true);
            modelList.add(mol);
        }

        JSONObject model = new JSONObject();
        model.put("id", 101);
        model.put("title", "Model");
        model.put("spread", true);
        model.put("children", modelList);
        ls.add(model);

        // 封装 camera package
        List<JSONObject> cameraList = new ArrayList<>();
        List<MyCamera> cameras = cameraService.getCameraBySceneID(sceneID);
        for (MyCamera tmpCam : cameras) {
            if (tmpCam.getCameraId() == 1101)
                continue;
            JSONObject came = new JSONObject();
            came.put("id", tmpCam.getCameraId());
            came.put("title", tmpCam.getCameraTitle());
            came.put("spread", true);
            cameraList.add(came);
        }

        JSONObject camera = new JSONObject();
        camera.put("id", 201);
        camera.put("title", "Camera");
        camera.put("spread", true);
        camera.put("children", cameraList);
        ls.add(camera);

        // 封装 light package
        List<JSONObject> lightList = new ArrayList<>();
        List<MyLight> lights = lightService.getLightBySceneID(sceneID);
        for (MyLight tmplight : lights) {
            JSONObject lig = new JSONObject();
            lig.put("id", tmplight.getLightId());
            lig.put("title", tmplight.getLightTitle());
            lig.put("spread", true);
            lightList.add(lig);
        }
        JSONObject light = new JSONObject();
        light.put("id", 301);
        light.put("title", "Lights");
        light.put("spread", true);
        light.put("children", lightList);
        ls.add(light);
        return ls;
    }

    /**
     * 请求模型文件添加页面
     *
     * @param model
     * @return 模型添加明细页面
     */
    @RequestMapping("/getModelAdd")
    public String getModelAdd(Model model) {
        List<MyModelType> modelTypeList = modelTypeService.selectAll();
        model.addAttribute("modelTypeList", modelTypeList);
        return "ModelBaseAdd";
    }

    /**
     * index 请求模型文件修改页面
     */
    @RequestMapping("/getModelEdit")
    public String getModelEdit(Integer modelId, Model model) {
        MyModel myModel = modelService.getModelByID(modelId);
        List<MyModelType> modelTypeList = modelTypeService.selectAll();
        model.addAttribute("modelTypeList", modelTypeList);
        model.addAttribute("model", myModel);
        return "ModelBaseEdit";
    }

    /**
     * index 请求camera 修改界面
     */
    @RequestMapping("/getCameraEdit")
    public String getCameraEdit(Integer cameraId, Model model) {
        MyCamera myCamera = cameraService.getCameraById(cameraId);
        model.addAttribute("camera", myCamera);
        return "CameraBaseEdit";
    }

    /**
     * index 请求light 修改页面
     */
    @RequestMapping("/getLightEdit")
    public String getLightEdit(Integer lightId, Model model) {
        MyLight myLight = lightService.getLightById(lightId);
        model.addAttribute("light", myLight);
        return "LightBaseEdit";
    }


    /**
     * 请求相机加载页面
     */
    @RequestMapping("/getCameraAdd")
    public String getCameraAdd() {
        return "CameraBaseAdd";
    }

    /**
     * 请求光源加载页面
     */
    @RequestMapping("/getLightAdd")
    public String getLightAdd() {
        return "LightBaseAdd";
    }

}
