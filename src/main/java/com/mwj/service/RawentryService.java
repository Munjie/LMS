package com.mwj.service;


import com.mwj.dao.RawentryDao;
import com.mwj.model.Rawentry;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
}
