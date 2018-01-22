package com.mwj.service;


import com.mwj.dao.RawtobaccoDao;
import com.mwj.model.Rawtobacco;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RawtobaccoService {

    @Resource
    private RawtobaccoDao rawtobaccoDao;

    //新增原料抽检详细表(烟叶等级和烟叶年度等)
    public  boolean addRawtobacco(Rawtobacco record){

     return  rawtobaccoDao.addRawtobacco(record);



    }


}
