package com.mwj.dao;


import com.mwj.mapper.TobaccocategoryMapper;
import com.mwj.model.Tobaccocategory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class TobaccocategoryDao {

    @Resource
    private TobaccocategoryMapper tobaccocategoryMapper;


    //烟叶品种
   public  List<Tobaccocategory> selectByPrimaryKey(){

        List<Tobaccocategory> tobaccocategories = tobaccocategoryMapper.selectByPrimaryKey();
       return  tobaccocategories;
   }
}
