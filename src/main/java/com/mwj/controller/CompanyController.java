package com.mwj.controller;


import com.mwj.model.Company;
import com.mwj.service.CompanyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/")
@Controller
public class CompanyController {


    @Resource
    private CompanyService companyService;


    @RequestMapping("createRawCheck.do")
    public  String createRawCheck(Model model){
         List<Company> companies = companyService.showAllCompany();
        model.addAttribute("companies",companies);
        System.out.println(companies.get(0).getName());
        if (companies != null)

            return  "Raw/RawCheck/createRawCheck";
        else
            return null;



    }

}
