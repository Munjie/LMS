package com.mwj.controller;


import com.mwj.model.Rawtobacco;
import com.mwj.service.RawtobaccoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@RequestMapping("/")
@Controller
public class RawtobaccoController {


    @Resource
    private RawtobaccoService rawtobaccoService;

    @RequestMapping("addRawtobacco.do")
    public  String addRawtobacco(Rawtobacco record){

        final boolean b = rawtobaccoService.addRawtobacco(record);
        if (b)
            return "";
        else
            return "";


    }
}
