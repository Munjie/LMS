package com.mwj.controller;


import com.mwj.model.*;
import com.mwj.service.*;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

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
    @Resource
    private RawentryService rawentryService;

    @InitBinder
    public void bindDate(ServletRequestDataBinder requestDataBinder) {
        requestDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), false));
    }


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
    @RequestMapping("addRowentry.do")
    public String addRowentry(Rawentry rawentry,Model model){
        final boolean b = rawentryService.addRawentry(rawentry);
        final int id = rawentry.getId();
        final Map map = rawentryService.displayRawentry(id);
        model.addAttribute("map",map);
        if (b)
            return "table/RawEntrySheet";
        else
            return  null;
    }

}
