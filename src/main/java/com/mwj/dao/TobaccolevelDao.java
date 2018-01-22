package com.mwj.dao;


import com.mwj.mapper.TobaccolevelMapper;
import com.mwj.model.Tobaccolevel;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class TobaccolevelDao {

    @Resource
    private TobaccolevelMapper tobaccolevelMapper;


    //烟叶等级
   public List<Tobaccolevel> selectByPrimaryKey(){

        List<Tobaccolevel> tobaccolevels = tobaccolevelMapper.selectByPrimaryKey();
        return  tobaccolevels;
   }
}
