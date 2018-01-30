package com.mwj.mapper;

import java.math.BigDecimal;

public interface RawentryMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(Rawentry record);

    int insertSelective(Rawentry record);

    Rawentry selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(Rawentry record);

    int updateByPrimaryKey(Rawentry record);
}