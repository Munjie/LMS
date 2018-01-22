package com.mwj.service;


import com.mwj.dao.ProducingareaDao;
import com.mwj.model.Producingarea;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProducingareaService {

@Resource
private ProducingareaDao producingareaDao;

    //显示烟叶产地
    public List<Producingarea> selectByPrimaryKey(){

     return    producingareaDao.selectByPrimaryKey();

    }
}
