package com.tb.mbg.mapper;

import com.tb.mbg.model.PurchaseArrival;
import com.tb.mbg.model.PurchaseArrivalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseArrivalMapper {
    long countByExample(PurchaseArrivalExample example);

    int deleteByExample(PurchaseArrivalExample example);

    int deleteByPrimaryKey(String purchaseArrivalId);

    int insert(PurchaseArrival row);

    int insertSelective(PurchaseArrival row);

    List<PurchaseArrival> selectByExampleWithBLOBs(PurchaseArrivalExample example);

    List<PurchaseArrival> selectByExample(PurchaseArrivalExample example);

    PurchaseArrival selectByPrimaryKey(String purchaseArrivalId);

    int updateByExampleSelective(@Param("row") PurchaseArrival row, @Param("example") PurchaseArrivalExample example);

    int updateByExampleWithBLOBs(@Param("row") PurchaseArrival row, @Param("example") PurchaseArrivalExample example);

    int updateByExample(@Param("row") PurchaseArrival row, @Param("example") PurchaseArrivalExample example);

    int updateByPrimaryKeySelective(PurchaseArrival row);

    int updateByPrimaryKeyWithBLOBs(PurchaseArrival row);

    int updateByPrimaryKey(PurchaseArrival row);
}