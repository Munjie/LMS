package com.mwj.controller;


import com.mwj.model.Users;
import com.mwj.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@RequestMapping("/")
@Controller
public class UserController {


    @Resource
    private  UserService userService;

@RequestMapping("login.do")
    public  String login(Users users, Model model){

    final Users login = userService.login(users);

    model.addAttribute("login",login);
    if (login.getUsername().equals(users.getUsername()) && login.getPassword().equals(users.getPassword()))
             return
             "main";
         else
             return
                     "index";

    }
}
