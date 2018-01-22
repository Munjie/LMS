package com.mwj.controller;


import com.mwj.model.Company;
import com.mwj.model.Tobaccocategory;
import com.mwj.model.Tobaccolevel;
import com.mwj.service.CompanyService;
import com.mwj.service.TobaccocategoryService;
import com.mwj.service.TobaccolevelService;
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
    @Resource
    private TobaccolevelService tobaccolevelService;
    @Resource
    private TobaccocategoryService tobaccocategoryService;


    @RequestMapping("createRawCheck.do")
    public  String createRawCheck(Model model){
         List<Company> companies = companyService.showAllCompany();
         List<Tobaccolevel> tobaccolevels = tobaccolevelService.selectByPrimaryKey();
         List<Tobaccocategory> tobaccocategories = tobaccocategoryService.selectByPrimaryKey();

        model.addAttribute("companies",companies);
        model.addAttribute("tobaccoleve",tobaccolevels);
        model.addAttribute("tobaccocategories",tobaccocategories);
        System.out.println(companies.get(0).getName());
        if (companies != null)

            return  "Raw/RawCheck/createRawCheck";
        else
            return null;



    }

}
