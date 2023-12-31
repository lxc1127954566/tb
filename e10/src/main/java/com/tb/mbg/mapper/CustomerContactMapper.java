package com.tb.mbg.mapper;

import com.tb.mbg.model.CustomerContact;
import com.tb.mbg.model.CustomerContactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerContactMapper {
    long countByExample(CustomerContactExample example);

    int deleteByExample(CustomerContactExample example);

    int deleteByPrimaryKey(String customerContactId);

    int insert(CustomerContact row);

    int insertSelective(CustomerContact row);

    List<CustomerContact> selectByExampleWithBLOBs(CustomerContactExample example);

    List<CustomerContact> selectByExample(CustomerContactExample example);

    CustomerContact selectByPrimaryKey(String customerContactId);

    int updateByExampleSelective(@Param("row") CustomerContact row, @Param("example") CustomerContactExample example);

    int updateByExampleWithBLOBs(@Param("row") CustomerContact row, @Param("example") CustomerContactExample example);

    int updateByExample(@Param("row") CustomerContact row, @Param("example") CustomerContactExample example);

    int updateByPrimaryKeySelective(CustomerContact row);

    int updateByPrimaryKeyWithBLOBs(CustomerContact row);

    int updateByPrimaryKey(CustomerContact row);
}