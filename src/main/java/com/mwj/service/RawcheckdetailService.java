package com.mwj.service;


import com.mwj.dao.RawcheckdetailDao;
import com.mwj.model.Rawcheckdetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RawcheckdetailService {

    @Resource
    private RawcheckdetailDao rawcheckdetailDao;


    //新增原料抽检详细表
    public boolean addRawcheckdetail(Rawcheckdetail record){

        return rawcheckdetailDao.addRawcheckdetail(record);

    }


}
