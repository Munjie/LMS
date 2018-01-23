package com.mwj.service;


import com.mwj.dao.RawcheckDao;
import com.mwj.model.Rawcheck;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RawcheckService {

    @Resource
    private RawcheckDao rawcheckDao;

    //新增抽检
    public  boolean  addRocheck(Rawcheck record){


     return  rawcheckDao.addRocheck(record);


    }



}
