package com.mwj.controller;


import com.mwj.model.Rawcheck;
import com.mwj.model.Rawcheckdetail;
import com.mwj.model.Rawtobacco;
import com.mwj.service.RawcheckService;
import com.mwj.service.RawcheckdetailService;
import com.mwj.service.RawtobaccoService;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RequestMapping("/")
@Controller
public class RawtobaccoController {


    @Resource
    private RawtobaccoService rawtobaccoService;

    @Resource
    private RawcheckService rawcheckService;
    @Resource
    private RawcheckdetailService rawcheckdetailService;



    @InitBinder
    public  void  bindDate(ServletRequestDataBinder requestDataBinder){
        requestDataBinder.registerCustomEditor(Date.class,new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),false));
    }

    @RequestMapping("addRawtobacco.do")
    @ResponseBody
    public  String addRawtobacco(Rawtobacco record, Rawcheck rawcheck, Rawcheckdetail rawcheckdetail){


        final boolean b = rawtobaccoService.addRawtobacco(record);
        int i = record.getId();
        System.out.println(i);
        rawcheck.setRawtobacco(i);
       if (i > 0) {
           final boolean b1 = rawcheckService.addRocheck(rawcheck);
           int rawcheckId = rawcheck.getId();
           System.out.println(rawcheckId);
           if (rawcheckId > 0)
               rawcheckdetail.setCheckinfo(rawcheckId);
               rawcheckdetailService.addRawcheckdetail(rawcheckdetail);
       }
        if (b)
            return "{'msg':'Add Successs'}";

           /* return "Raw/RawCheck/RawCheckSheet";*/
        else
            return "";


    }
}
