package com.tb.mbg.mapper;

import com.tb.mbg.model.CustomerProperty;
import com.tb.mbg.model.CustomerPropertyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerPropertyMapper {
    long countByExample(CustomerPropertyExample example);

    int deleteByExample(CustomerPropertyExample example);

    int deleteByPrimaryKey(String customerPropertyId);

    int insert(CustomerProperty row);

    int insertSelective(CustomerProperty row);

    List<CustomerProperty> selectByExampleWithBLOBs(CustomerPropertyExample example);

    List<CustomerProperty> selectByExample(CustomerPropertyExample example);

    CustomerProperty selectByPrimaryKey(String customerPropertyId);

    int updateByExampleSelective(@Param("row") CustomerProperty row, @Param("example") CustomerPropertyExample example);

    int updateByExampleWithBLOBs(@Param("row") CustomerProperty row, @Param("example") CustomerPropertyExample example);

    int updateByExample(@Param("row") CustomerProperty row, @Param("example") CustomerPropertyExample example);

    int updateByPrimaryKeySelective(CustomerProperty row);

    int updateByPrimaryKeyWithBLOBs(CustomerProperty row);

    int updateByPrimaryKey(CustomerProperty row);
}