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
import java.util.*;

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
    @Resource
    private RawentrydetailService rawentrydetailService;
    @Resource
    private  RawcheckService rawcheckService;

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
    //入库
    @RequestMapping("addRowentry.do")
    public String addRowentry(Rawentry rawentry,@RequestParam("rawentryData")String rawentryData, Model model){
        final boolean b = rawentryService.addRawentry(rawentry);
         String[] temp = rawentryData.split(",");
         Rawentrydetail rawentrydetail = new Rawentrydetail();

         List<RawentryDetailSheet> list = new ArrayList<>();
        int rawentryId = rawentry.getId();
        for (int i = 0;i<temp.length/8;i++){

            rawentrydetail.setId(Integer.parseInt(temp[8*i]));//入库详细id
            rawentrydetail.setStandard(temp[8*i+2]);//入库规格
            rawentrydetail.setAmount(Integer.parseInt(temp[8*i+3]));//入库数量
            rawentrydetail.setLocation(Integer.parseInt(temp[8*i+4]));//库位
            rawentrydetail.setWeight(temp[8*i+7]);//重量
            rawentrydetail.setEntryinfo(rawentryId);//入库关联id
            rawentrydetail.setRawcheck(rawcheckService.queryRawChcekId(temp[8*i+1]));//入库关联抽检id
            final boolean b1 = rawentrydetailService.addRawentryDetail(rawentrydetail);

        }
        for(int j = 0; j < temp.length/8;j++){
            RawentryDetailSheet rawentryDetailSheet = new RawentryDetailSheet();
            rawentryDetailSheet.setId(j);//序号
            rawentryDetailSheet.setRawcheck(temp[8*j+1]);
            rawentryDetailSheet.setStandard(temp[8*j+2]);//规格
            rawentryDetailSheet.setAmount(Integer.parseInt(temp[8*j+3]));//数量
            rawentryDetailSheet.setLocation(Integer.parseInt(temp[8*j+4]));//库位
            rawentryDetailSheet.setLeaveName(temp[8*j+5]);//等级
            rawentryDetailSheet.setTobaccoGory(temp[8*j+6]);//品种
            rawentryDetailSheet.setWeight(temp[8*j+7]);//重量
            list.add(rawentryDetailSheet);

        }

        final Map map = rawentryService.displayRawentry(rawentryId);
        model.addAttribute("map",map);
        model.addAttribute("sheetlist",list);
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

    //回显入库打印表
    @RequestMapping("displayRawentrySheet")
    public String showRawentrySheet(String entrynum,Model model){

        final List<Map> mapList = rawentryService.showRawentrySheet(entrynum);

        model.addAttribute("maplist",mapList);
        return
                "Raw/RawEntry/retriveRawEntry";


    }

}
