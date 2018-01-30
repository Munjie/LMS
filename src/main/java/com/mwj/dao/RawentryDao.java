package com.mwj.dao;


import com.mwj.mapper.RawentryMapper;
import com.mwj.model.Rawentry;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Map;

@Repository
public class RawentryDao {

    @Resource
    private RawentryMapper rawentryMapper;

    //增加入库信息
    public  boolean addRawentry(Rawentry record){

        final int i = rawentryMapper.addRawentry(record);
        return  i > 0;


    }
    //显示入库信息
   public  Map displayRawentry(int rawentryId){
        return rawentryMapper.displayRawentry(rawentryId);

   }
}
