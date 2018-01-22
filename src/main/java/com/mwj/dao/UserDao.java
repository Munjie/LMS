package com.mwj.dao;


import com.mwj.mapper.UsersMapper;
import com.mwj.model.Users;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class UserDao {


    @Resource
    private UsersMapper usersMapper;

//登录
    public boolean login(Users users){


         int login = usersMapper.login(users);
         return  login > 0;
    }





}
