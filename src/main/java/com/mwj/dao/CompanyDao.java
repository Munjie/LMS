package com.mwj.dao;


import com.mwj.mapper.CompanyMapper;
import com.mwj.model.Company;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class CompanyDao {

    @Resource
    private CompanyMapper companyMapper;



  //显示所有公司详细信息
    public List<Company> showAllCompany(){

        return  companyMapper.showAllCompany();
    }
    //显示委托方
    public  Company  showClient(int id){

        return companyMapper.showClient(id);

    }
    //显示发货方
    public  Company showDeliver(int id){

   return companyMapper.showDeliver(id);

    }

}
