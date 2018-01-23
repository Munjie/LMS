package com.mwj.dao;

import com.mwj.mapper.RawcheckMapper;
import com.mwj.model.Rawcheck;
import org.springframework.stereotype.Repository;
import sun.dc.pr.PRError;

import javax.annotation.Resource;

@Repository
public class RawcheckDao {

    @Resource
    private RawcheckMapper rawcheckMapper;


    //新增抽检
     public  boolean  addRocheck(Rawcheck record){


         final int insert = rawcheckMapper.addRocheck(record);

         return  insert > 0;
     }


}
