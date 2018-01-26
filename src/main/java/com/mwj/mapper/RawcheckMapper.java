package com.mwj.mapper;

import com.mwj.model.Rawcheck;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface RawcheckMapper {


    //新增抽检
    int addRocheck(Rawcheck record);



    Rawcheck selectByPrimaryKey(BigDecimal id);

    List<Map> showRocheck();


}