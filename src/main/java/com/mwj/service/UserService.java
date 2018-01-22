package com.mwj.service;

import com.mwj.dao.UserDao;
import com.mwj.model.Users;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserService {


    @Resource
    private UserDao userDao;



//登录
    public boolean login(Users users){


        return  userDao.login(users);

    }
}
