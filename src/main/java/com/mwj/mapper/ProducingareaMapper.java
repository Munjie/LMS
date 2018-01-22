package com.mwj.mapper;

import com.mwj.model.Producingarea;
import java.math.BigDecimal;

public interface ProducingareaMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(Producingarea record);

    int insertSelective(Producingarea record);

    Producingarea selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(Producingarea record);

    int updateByPrimaryKey(Producingarea record);
}