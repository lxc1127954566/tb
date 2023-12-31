package com.tb.mbg.mapper;

import com.tb.mbg.model.CustomerFi;
import com.tb.mbg.model.CustomerFiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerFiMapper {
    long countByExample(CustomerFiExample example);

    int deleteByExample(CustomerFiExample example);

    int deleteByPrimaryKey(String customerFiId);

    int insert(CustomerFi row);

    int insertSelective(CustomerFi row);

    List<CustomerFi> selectByExampleWithBLOBs(CustomerFiExample example);

    List<CustomerFi> selectByExample(CustomerFiExample example);

    CustomerFi selectByPrimaryKey(String customerFiId);

    int updateByExampleSelective(@Param("row") CustomerFi row, @Param("example") CustomerFiExample example);

    int updateByExampleWithBLOBs(@Param("row") CustomerFi row, @Param("example") CustomerFiExample example);

    int updateByExample(@Param("row") CustomerFi row, @Param("example") CustomerFiExample example);

    int updateByPrimaryKeySelective(CustomerFi row);

    int updateByPrimaryKeyWithBLOBs(CustomerFi row);

    int updateByPrimaryKey(CustomerFi row);
}