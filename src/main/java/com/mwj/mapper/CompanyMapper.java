package com.mwj.mapper;

import com.mwj.model.Company;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface CompanyMapper {


    //显示所有公司详细信息
    List<Company> showAllCompany();
    //显示委托方
    Company  showClient(int showClientId);
    //显示发货方
    Company showDeliver(int showDeliverId);


}