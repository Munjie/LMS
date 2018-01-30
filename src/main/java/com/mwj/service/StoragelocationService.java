package com.mwj.service;


import com.mwj.dao.StoragelocationDao;
import com.mwj.model.Storagelocation;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StoragelocationService {


    @Resource
    private StoragelocationDao storagelocationDao;

    //显示所有的仓库
    public List<Storagelocation> displayStoragelocation(){

        return  storagelocationDao.displayStoragelocation();
    }
}
