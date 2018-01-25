package com.mwj.controller;


import com.mwj.model.Rawcheck;
import com.mwj.service.RawcheckService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@RequestMapping("/")
@Controller
public class RawcheckController {

@Resource
    private RawcheckService rawcheckService;





}
