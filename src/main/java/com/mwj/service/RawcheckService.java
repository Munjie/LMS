package com.mwj.service;


import com.mwj.dao.RawcheckDao;
import com.mwj.model.Rawcheck;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class RawcheckService {

    @Resource
    private RawcheckDao rawcheckDao;

    //新增抽检
    public  boolean  addRocheck(Rawcheck record){

     record.setChecknum(RawcheckService.getRawCheckId());
     return  rawcheckDao.addRocheck(record);


    }
    //查询抽检信息
    public  List<Rawcheck> showRawChcekById(int id){
       return rawcheckDao.showRawChcekById(id);
    }

    //根据抽检单号查询信息
   public List<Map> displayRawcheckByChecknum(String checknum){

        return  rawcheckDao.displayRawcheckByChecknum(checknum);
    }

    //根据抽检ID查询信息
    public   Map displayRawcheckByCheckId(int checkId){

        return  rawcheckDao.displayRawcheckByCheckId(checkId);

    }

    //查询抽检单号根据抽检单
    public int queryRawChcekId (String checknum){

        return rawcheckDao.queryRawChcekId(checknum);
    }

   public  static String getRawCheckId(){

       Date date = new Date();
       DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSSS");
       String tempDate = dateFormat.format(date);
       String racheckId = "CJ" + tempDate;
       return  racheckId;

   }
}
