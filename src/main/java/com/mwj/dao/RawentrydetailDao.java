package com.mwj.dao;


import com.mwj.mapper.RawentrydetailMapper;
import com.mwj.model.Rawentrydetail;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class RawentrydetailDao {

    @Resource
    private RawentrydetailMapper rawentrydetailMapper;



    //添加入库重量信息
    public boolean addRawentryDetail(Rawentrydetail record){

        final int i = rawentrydetailMapper.addRawentryDetail(record);
        return  i > 0;

    }
}
