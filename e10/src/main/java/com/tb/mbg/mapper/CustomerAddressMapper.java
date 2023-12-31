package com.tb.mbg.mapper;

import com.tb.mbg.model.CustomerAddress;
import com.tb.mbg.model.CustomerAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerAddressMapper {
    long countByExample(CustomerAddressExample example);

    int deleteByExample(CustomerAddressExample example);

    int deleteByPrimaryKey(String customerAddressId);

    int insert(CustomerAddress row);

    int insertSelective(CustomerAddress row);

    List<CustomerAddress> selectByExampleWithBLOBs(CustomerAddressExample example);

    List<CustomerAddress> selectByExample(CustomerAddressExample example);

    CustomerAddress selectByPrimaryKey(String customerAddressId);

    int updateByExampleSelective(@Param("row") CustomerAddress row, @Param("example") CustomerAddressExample example);

    int updateByExampleWithBLOBs(@Param("row") CustomerAddress row, @Param("example") CustomerAddressExample example);

    int updateByExample(@Param("row") CustomerAddress row, @Param("example") CustomerAddressExample example);

    int updateByPrimaryKeySelective(CustomerAddress row);

    int updateByPrimaryKeyWithBLOBs(CustomerAddress row);

    int updateByPrimaryKey(CustomerAddress row);
}