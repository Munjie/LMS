package com.mwj.controller;


import com.mwj.model.*;
import com.mwj.service.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
    public String addRowentry(Rawentry rawentry,@RequestParam("rawentryData")String rawentryData, Model model){
        String[] temp = rawentryData.split(",");

        for (int i = 0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
        final boolean b = rawentryService.addRawentry(rawentry);
        final int id = rawentry.getId();
        final Map map = rawentryService.displayRawentry(id);
        model.addAttribute("map",map);
        if (b)
            return "table/RawEntrySheet";
        else
            return  null;
    }

    @RequestMapping("checknuminfo.do")
    @ResponseBody
    public  List<Map> checkNumInfo(String checkNum){

        List<Map> mapList = rawentryService.checkNemberInfo(checkNum);

       for (int i = 0;i<mapList.size();i++){

           System.out.println(mapList.get(i));
       }

        return mapList;

    }

}
