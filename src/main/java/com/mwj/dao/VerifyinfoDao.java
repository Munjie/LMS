package com.mwj.dao;


import com.mwj.mapper.VerifyinfoMapper;
import com.mwj.model.Verifyinfo;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class VerifyinfoDao {

    @Resource
    private VerifyinfoMapper verifyinfoMapper;

    //添加新入库审核信息
   public boolean addVerifyinfo(Verifyinfo record){

       final int i = verifyinfoMapper.addVerifyinfo(record);
       return  i > 0;


   }
}
