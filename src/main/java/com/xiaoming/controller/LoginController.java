package com.xiaoming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("user")
public class LoginController {

    @RequestMapping(value = "/login")
    @ResponseBody
    public String login(String ins){
        System.out.println("information : " + ins);
        return "success";
    }
}
