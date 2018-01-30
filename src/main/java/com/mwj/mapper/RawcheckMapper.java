package com.mwj.mapper;

import com.mwj.model.Rawcheck;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface RawcheckMapper {


    //新增抽检
    int addRocheck(Rawcheck record);



    Rawcheck selectByPrimaryKey(BigDecimal id);


    //查询抽检信息
    List<Rawcheck> showRawChcekById(int id);

    //根据抽检单号查询信息
    List<Map> displayRawcheckByChecknum(String checknum);

    //根据抽检ID查询信息
    Map displayRawcheckByCheckId(int checkId);


}