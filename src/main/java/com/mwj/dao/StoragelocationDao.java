package com.mwj.dao;


import com.mwj.mapper.StoragelocationMapper;
import com.mwj.model.Storagelocation;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class StoragelocationDao {

    @Resource
    private StoragelocationMapper storagelocationMapper;


    //显示所有的仓库
   public  List<Storagelocation> displayStoragelocation(){

       return  storagelocationMapper.displayStoragelocation();
   }


}
