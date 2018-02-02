package com.mwj.service;


import com.mwj.dao.RawentryDao;
import com.mwj.model.Rawentry;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class RawentryService {

    @Resource
    private RawentryDao rawentryDao;


    //增加入库信息
    public  boolean addRawentry(Rawentry record){

        return  rawentryDao.addRawentry(record);


    }
    //显示入库信息
    public Map displayRawentry(int rawentryId){
        return rawentryDao.displayRawentry(rawentryId);

    }

    //ajax显示抽检信息
    public List<Map> checkNemberInfo(String checkNumber){

        return  rawentryDao.checkNemberInfo(checkNumber);
    }
    //回显入库信息打印表
    public  List<Map> showRawentrySheet(String entryNumber){

        return rawentryDao.showRawentrySheet(entryNumber);
    }

    //入库审核显示
    public  List<Map> allRawentry(){

        return  rawentryDao.allRawentry();
    }
}
