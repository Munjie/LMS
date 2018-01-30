package com.mwj.mapper;

import com.mwj.model.Rawentry;

import java.util.Map;

public interface RawentryMapper {

   //增加入库信息
    int addRawentry(Rawentry record);
    //显示入库信息
    Map displayRawentry(int rawentryId);


}