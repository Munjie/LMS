package com.mwj.controller;


import com.mwj.model.Company;
import com.mwj.model.Rawcheck;
import com.mwj.model.Rawcheckdetail;
import com.mwj.model.Rawtobacco;
import com.mwj.service.CompanyService;
import com.mwj.service.RawcheckService;
import com.mwj.service.RawcheckdetailService;
import com.mwj.service.RawtobaccoService;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RequestMapping("/")
@Controller
public class RawtobaccoController {


    @Resource
    private RawtobaccoService rawtobaccoService;

    @Resource
    private RawcheckService rawcheckService;
    @Resource
    private RawcheckdetailService rawcheckdetailService;
    @Resource
    private CompanyService companyService;


    @InitBinder
    public void bindDate(ServletRequestDataBinder requestDataBinder) {
        requestDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), false));
    }

    @RequestMapping("addRawtobacco.do")
    public String addRawtobacco(Rawtobacco record, Rawcheck rawcheck, @RequestParam("tempdata") String tempdata, Model model) {
       Rawcheckdetail rawcheckdetail = new Rawcheckdetail();
        boolean b = rawtobaccoService.addRawtobacco(record);
        rawcheck.setRawtobacco(record.getId());
        boolean b1 = rawcheckService.addRocheck(rawcheck);
        int rawcheckId = rawcheck.getId();
        rawcheckdetail.setCheckinfo(rawcheckId);
        String[] split = tempdata.split(",");
        List<Rawcheckdetail> list = new ArrayList<>();
        for (int i = 0; i < split.length / 2; i++) {
            rawcheckdetail.setSequence(Integer.parseInt(split[2 * i]));
            rawcheckdetail.setCheckweight(split[2 * i + 1]);
            rawcheckdetailService.addRawcheckdetail(rawcheckdetail);
            list.add(rawcheckdetail);
        }
         model.addAttribute("",record);
        final List<Rawcheck> rawchecks = rawcheckService.showRawChcekById(rawcheckId);

        final Map maps = rawcheckService.displayRawcheckByCheckId(rawcheckId);
        model.addAttribute("map",maps);
         model.addAttribute("list",list);
         model.addAttribute("rawchecks",rawchecks);
         return "table/RawCheckSheet";

    }



}
