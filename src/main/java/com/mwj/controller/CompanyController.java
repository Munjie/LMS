package com.mwj.controller;


import com.mwj.model.*;
import com.mwj.service.*;
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
    @Resource
     private ProducingareaService producingareaService;
    @Resource
    private UserService userService;


    @RequestMapping("createRawCheck.do")
    public  String createRawCheck(Model model){
         List<Company> companies = companyService.showAllCompany();
         List<Tobaccolevel> tobaccolevels = tobaccolevelService.selectByPrimaryKey();
         List<Tobaccocategory> tobaccocategories = tobaccocategoryService.selectByPrimaryKey();
         List<Producingarea> producingareas = producingareaService.selectByPrimaryKey();
         List<Users> users = userService.showUser();


        model.addAttribute("companies",companies);
        model.addAttribute("tobaccoleve",tobaccolevels);
        model.addAttribute("tobaccocategories",tobaccocategories);
        model.addAttribute("producingareas",producingareas);
        model.addAttribute("users",users);

        System.out.println(companies.get(0).getName());
        if (companies != null)

            return  "Raw/RawCheck/createRawCheck";
        else
            return null;



    }

}
