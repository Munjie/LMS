package com.mwj.service;


import com.mwj.dao.TobaccolevelDao;
import com.mwj.model.Tobaccolevel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TobaccolevelService {

    @Resource
    private TobaccolevelDao tobaccolevelDao;



    //烟叶等级
    public List<Tobaccolevel> selectByPrimaryKey(){

        List<Tobaccolevel> tobaccolevels = tobaccolevelDao.selectByPrimaryKey();
        return  tobaccolevels;
    }
}
