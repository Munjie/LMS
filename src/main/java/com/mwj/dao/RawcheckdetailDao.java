package com.mwj.dao;


import com.mwj.mapper.RawcheckdetailMapper;
import com.mwj.model.Rawcheckdetail;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class RawcheckdetailDao {

    @Resource
    private RawcheckdetailMapper rawcheckdetailMapper;

    //新增原料抽检详细表
    public boolean addRawcheckdetail(Rawcheckdetail record){

        final int i = rawcheckdetailMapper.addRawcheckdetail(record);
        return  i > 0;
    }
}
