package com.mwj.mapper;

import com.mwj.model.Users;
import java.math.BigDecimal;

public interface UsersMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}