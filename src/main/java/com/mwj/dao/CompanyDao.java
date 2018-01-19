package com.mwj.dao;


import com.mwj.mapper.CompanyMapper;
import com.mwj.model.Company;
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


}
