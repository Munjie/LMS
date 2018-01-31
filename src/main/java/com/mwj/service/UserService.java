package com.mwj.service;

import com.mwj.dao.UserDao;
import com.mwj.model.Users;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserService {


    @Resource
    private UserDao userDao;



//登录
    public Users login(Users users){

        return  userDao.login(users);
    }

    //显示员工
    public List<Users> showUser(){

        final List<Users> users = userDao.showUser();
        return users;

    }
}
