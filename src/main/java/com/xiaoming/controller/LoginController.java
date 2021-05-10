package com.xiaoming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("user")
public class LoginController {

    @RequestMapping(value = "login")
    public String login(String username, String password){
        System.out.println("username : " + username);
        System.out.println("password : " + password);
        return "success";
    }
}
