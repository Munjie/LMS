package com.mwj.controller;


import com.mwj.model.Rawcheckdetail;
import com.mwj.service.RawcheckdetailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@RequestMapping("/")
@Controller
public class RawcheckdetailController {



    @Resource
    private RawcheckdetailService rawcheckdetailService;

    //新增原料抽检详细表
    @RequestMapping("addRawcheckdetail.do")
    public  String addRawcheckdetail(Rawcheckdetail record){


         boolean b = rawcheckdetailService.addRawcheckdetail(record);
         if (b)
             return "";
         else
             return null;


    }
}
