package com.xiaoming.controller;

import com.xiaoming.model.ModelTypes;
import com.xiaoming.service.Impl.ModelTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("page")
public class PageController {
    
    @Autowired
    private ModelTypeServiceImpl modelTypeService;
    
    @RequestMapping("/getModelAdd")
    public String getModelAdd(Model model) {
        List<ModelTypes> modelTypeList = modelTypeService.selectAll();
        model.addAttribute("modelTypeList", modelTypeList);
        return "ModelBaseAdd";
    }
}
