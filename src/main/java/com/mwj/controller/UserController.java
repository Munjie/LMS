package com.mwj.controller;


import com.mwj.model.Users;
import com.mwj.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@RequestMapping("/")
@Controller
public class UserController {


    @Resource
    private  UserService userService;

@RequestMapping("login.do")
    public  String login(Users users){

         boolean login = userService.login(users);

         if (login)
             return
             "main";
         else
             return
             "index";

    }
}
