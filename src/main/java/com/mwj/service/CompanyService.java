package com.mwj.service;


import com.mwj.dao.CompanyDao;
import com.mwj.model.Company;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CompanyService {


    @Resource
    private CompanyDao companyDao;



    //显示所有公司详细信息
    public List<Company> showAllCompany(){

        return  companyDao.showAllCompany();
    }

    //显示委托方
    public  Company  showClient(int id){

        return companyDao.showClient(id);

    }
    //显示发货方
    public Company showDeliver(int id){

        return companyDao.showDeliver(id);


    }

}
