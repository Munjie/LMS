package com.mwj.mapper;

import com.mwj.model.Rawentry;

import java.util.List;
import java.util.Map;

public interface RawentryMapper {

   //增加入库信息
    int addRawentry(Rawentry record);
    //显示入库信息
    Map displayRawentry(int rawentryId);
    //ajax显示抽检信息
    List<Map> checkNemberInfo(String checkNumber);
}