package com.mwj.dao;


import com.mwj.mapper.UsersMapper;
import com.mwj.model.Users;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class UserDao {


    @Resource
    private UsersMapper usersMapper;

//登录
    public boolean login(Users users){


         int login = usersMapper.login(users);
         return  login > 0;
    }

    //显示员工
   public List<Users> showUser(){

       final List<Users> users = usersMapper.showUser();
       return users;

   }


}
