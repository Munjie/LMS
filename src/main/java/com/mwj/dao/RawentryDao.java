package com.mwj.dao;


import com.mwj.mapper.RawentryMapper;
import com.mwj.model.Rawentry;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
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

    //ajax显示抽检信息
   public List<Map> checkNemberInfo(String checkNumber){

       return  rawentryMapper.checkNemberInfo(checkNumber);
    }
    //回显入库信息打印表
    public  List<Map> showRawentrySheet(String entryNumber){

      return rawentryMapper.showRawentrySheet(entryNumber);
    }


}
