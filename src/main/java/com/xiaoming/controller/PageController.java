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
        List<JSONObject> sceneList = new ArrayList<>();
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
        List<MyModel> modelList = modelService.getAllModels();
        JSONArray array = new JSONArray(Collections.singletonList(modelList));
        model.addAttribute("models", array);
        return "index";
    }

    /**
     * 根据 sceneID 进行 节点拼装
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
        model.put("title", "模型");
        model.put("spread", true);
        model.put("children", modelList);
        ls.add(model);

        // 封装 camera package
        List<JSONObject> cameraList = new ArrayList<>();
        List<MyCamera> cameras = cameraService.getCameraBySceneID(sceneID);
        for (MyCamera tmpCam : cameras){
            JSONObject came = new JSONObject();
            came.put("id", tmpCam.getCameraId());
            came.put("title", tmpCam.getCameraTitle());
            came.put("spread", true);
            cameraList.add(came);
        }
        
        JSONObject camera = new JSONObject();
        camera.put("id", 201);
        camera.put("title", "相机");
        camera.put("spread", true);
        camera.put("children", cameraList);
        ls.add(camera);
        
        // 封装 light package
        List<JSONObject> lightList = new ArrayList<>();
        List<MyLight> lights = lightService.getLightBySceneID(sceneID);
        for(MyLight tmplight: lights){
            JSONObject lig = new JSONObject();
            lig.put("id", tmplight.getLightId());
            lig.put("title", tmplight.getLightTitle());
            lig.put("spread", true);
            lightList.add(lig);
        }
        JSONObject light = new JSONObject();
        light.put("id", 301);
        light.put("title", "光源");
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
     * 请求相机加载页面
     */
    @RequestMapping("/getCameraAdd")
    public String getCameraAdd(){
        return "CameraBaseAdd";
    }
    
}
