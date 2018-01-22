package com.mwj.mapper;

import com.mwj.model.Producingarea;
import java.math.BigDecimal;
import java.util.List;

public interface ProducingareaMapper {

//显示烟叶产地
   List<Producingarea>  selectByPrimaryKey();

}