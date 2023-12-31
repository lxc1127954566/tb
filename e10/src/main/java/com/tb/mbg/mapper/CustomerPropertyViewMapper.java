package com.tb.mbg.mapper;

import com.tb.mbg.model.CustomerPropertyView;
import com.tb.mbg.model.CustomerPropertyViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerPropertyViewMapper {
    long countByExample(CustomerPropertyViewExample example);

    int deleteByExample(CustomerPropertyViewExample example);

    int deleteByPrimaryKey(String customerPropertyViewId);

    int insert(CustomerPropertyView row);

    int insertSelective(CustomerPropertyView row);

    List<CustomerPropertyView> selectByExampleWithBLOBs(CustomerPropertyViewExample example);

    List<CustomerPropertyView> selectByExample(CustomerPropertyViewExample example);

    CustomerPropertyView selectByPrimaryKey(String customerPropertyViewId);

    int updateByExampleSelective(@Param("row") CustomerPropertyView row, @Param("example") CustomerPropertyViewExample example);

    int updateByExampleWithBLOBs(@Param("row") CustomerPropertyView row, @Param("example") CustomerPropertyViewExample example);

    int updateByExample(@Param("row") CustomerPropertyView row, @Param("example") CustomerPropertyViewExample example);

    int updateByPrimaryKeySelective(CustomerPropertyView row);

    int updateByPrimaryKeyWithBLOBs(CustomerPropertyView row);

    int updateByPrimaryKey(CustomerPropertyView row);
}