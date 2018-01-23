package com.mwj.dao;


import com.mwj.mapper.RawtobaccoMapper;
import com.mwj.model.Rawtobacco;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class RawtobaccoDao {

    @Resource
    private RawtobaccoMapper rawtobaccoMapper;

    //新增原料抽检详细表(烟叶等级和烟叶年度等)
    public  boolean addRawtobacco(Rawtobacco record){
       /* int ins = Integer.parseInt(rawtobaccoMapper.addRawtobacco(record) + "");
        int id = record.getId();
        System.out.println(id);
        System.out.println(ins);*/
        final int i = rawtobaccoMapper.addRawtobacco(record);


        return  i >  0;


    }


}
