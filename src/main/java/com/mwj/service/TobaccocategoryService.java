package com.mwj.service;


import com.mwj.dao.TobaccocategoryDao;
import com.mwj.model.Tobaccocategory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TobaccocategoryService {

    @Resource
    private TobaccocategoryDao tobaccocategoryDao;



    //烟叶品种
    public List<Tobaccocategory> selectByPrimaryKey(){

        List<Tobaccocategory> tobaccocategories = tobaccocategoryDao.selectByPrimaryKey();
        return  tobaccocategories;
    }


}
