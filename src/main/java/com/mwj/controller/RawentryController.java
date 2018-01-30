package com.mwj.controller;


import com.mwj.model.Company;
import com.mwj.model.Producingarea;
import com.mwj.model.Storagelocation;
import com.mwj.model.Users;
import com.mwj.service.CompanyService;
import com.mwj.service.ProducingareaService;
import com.mwj.service.StoragelocationService;
import com.mwj.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/")
@Controller
public class RawentryController {


    @Resource
    private CompanyService companyService;
    @Resource
    private StoragelocationService storagelocationService;
    @Resource
    private UserService userService;
    @Resource
    private ProducingareaService producingareaService;


    @RequestMapping("creteRowentry.do")
    public String rawEntry(Model model){

        final List<Company> companies = companyService.showAllCompany();
        final List<Storagelocation> storagelocations = storagelocationService.displayStoragelocation();
        final List<Users> users = userService.showUser();
        final List<Producingarea> producingareas = producingareaService.selectByPrimaryKey();
        model.addAttribute("company",companies);
        model.addAttribute("storagelocations",storagelocations);
        model.addAttribute("producingareas",producingareas);

        model.addAttribute("users",users);
        if (companies != null && storagelocations != null && users != null && producingareas != null)
            return "Raw/RawEntry/createRawEntry";
        else
            return null;


    }
}
