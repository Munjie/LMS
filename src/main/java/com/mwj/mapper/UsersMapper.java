package com.mwj.mapper;

import com.mwj.model.Users;
import java.math.BigDecimal;
import java.util.List;

public interface UsersMapper {


//登录
    Users login(Users users);
    //显示员工
    List<Users> showUser();




}