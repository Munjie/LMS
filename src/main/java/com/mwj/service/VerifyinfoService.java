package com.mwj.service;


import com.mwj.dao.VerifyinfoDao;
import com.mwj.model.Verifyinfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class VerifyinfoService {

    @Resource
    private VerifyinfoDao verifyinfoDao;


    //添加新入库审核信息
    public boolean addVerifyinfo(Verifyinfo record){

      return verifyinfoDao.addVerifyinfo(record);


    }
}
