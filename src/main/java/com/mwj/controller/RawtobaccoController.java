package com.mwj.controller;


import com.mwj.model.Rawtobacco;
import com.mwj.service.RawtobaccoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@RequestMapping("/")
@Controller
public class RawtobaccoController {


    @Resource
    private RawtobaccoService rawtobaccoService;

    @RequestMapping("addRawtobacco.do")
    @ResponseBody
    public  String addRawtobacco(Rawtobacco record){

        final boolean b = rawtobaccoService.addRawtobacco(record);
        int i = record.getId();
        System.out.println(i + "a");
        if (b)
            return "{'msg','okla'}";
            /*return "Raw/RawCheck/RawCheckSheet";*/
        else
            return "";


    }
}
