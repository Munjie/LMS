package com.mwj.dao;


import com.mwj.mapper.ProducingareaMapper;
import com.mwj.model.Producingarea;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class ProducingareaDao {

    @Resource
    private ProducingareaMapper producingareaMapper;

    //显示烟叶产地
   public  List<Producingarea> selectByPrimaryKey(){

       final List<Producingarea> producingareas = producingareaMapper.selectByPrimaryKey();
       return  producingareas;
   }
}
