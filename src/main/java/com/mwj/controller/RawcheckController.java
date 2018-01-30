package com.mwj.controller;


import com.mwj.service.RawcheckService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RequestMapping("/")
@Controller
public class RawcheckController {

@Resource
    private RawcheckService rawcheckService;

@RequestMapping("checknum.do")
public String display(String checknum, Model model){

    final List<Map> maps = rawcheckService.displayRawcheckByChecknum(checknum);
    model.addAttribute("maps",maps);
    return "Raw/RawCheck/retriveRawCheck";


}


}
