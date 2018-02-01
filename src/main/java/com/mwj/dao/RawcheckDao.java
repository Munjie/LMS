package com.mwj.dao;

import com.mwj.mapper.RawcheckMapper;
import com.mwj.model.Rawcheck;
import org.springframework.stereotype.Repository;
import sun.dc.pr.PRError;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository
public class RawcheckDao {

    @Resource
    private RawcheckMapper rawcheckMapper;


    //新增抽检
     public  boolean  addRocheck(Rawcheck record){


         final int insert = rawcheckMapper.addRocheck(record);

         return  insert > 0;
     }

    //查询抽检信息
   public List<Rawcheck> showRawChcekById(int id){

        final List<Rawcheck> rawchecks = rawcheckMapper.showRawChcekById(id);
        return  rawchecks;
    }

    //根据抽检单号查询信息
    public  List<Map> displayRawcheckByChecknum(String checknum){

       return  rawcheckMapper.displayRawcheckByChecknum(checknum);
    }
    //根据抽检ID查询信息
      public   Map displayRawcheckByCheckId(int checkId){

        return  rawcheckMapper.displayRawcheckByCheckId(checkId);

  }
    //查询抽检单号根据抽检单
   public int queryRawChcekId (String checknum){

         return rawcheckMapper.queryRawChcekId(checknum);
   }

}
