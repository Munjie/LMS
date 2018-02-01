package com.mwj.service;


import com.mwj.dao.RawentrydetailDao;
import com.mwj.model.Rawentrydetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RawentrydetailService {

    @Resource
    private RawentrydetailDao rawentrydetailDao;



    //添加入库重量信息
    public boolean addRawentryDetail(Rawentrydetail record){

     return  rawentrydetailDao.addRawentryDetail(record);


    }



}
