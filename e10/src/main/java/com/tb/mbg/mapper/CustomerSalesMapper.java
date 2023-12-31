package com.tb.mbg.mapper;

import com.tb.mbg.model.CustomerSales;
import com.tb.mbg.model.CustomerSalesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerSalesMapper {
    long countByExample(CustomerSalesExample example);

    int deleteByExample(CustomerSalesExample example);

    int deleteByPrimaryKey(String customerBusinessId);

    int insert(CustomerSales row);

    int insertSelective(CustomerSales row);

    List<CustomerSales> selectByExampleWithBLOBs(CustomerSalesExample example);

    List<CustomerSales> selectByExample(CustomerSalesExample example);

    CustomerSales selectByPrimaryKey(String customerBusinessId);

    int updateByExampleSelective(@Param("row") CustomerSales row, @Param("example") CustomerSalesExample example);

    int updateByExampleWithBLOBs(@Param("row") CustomerSales row, @Param("example") CustomerSalesExample example);

    int updateByExample(@Param("row") CustomerSales row, @Param("example") CustomerSalesExample example);

    int updateByPrimaryKeySelective(CustomerSales row);

    int updateByPrimaryKeyWithBLOBs(CustomerSales row);

    int updateByPrimaryKey(CustomerSales row);
}