package com.tb.mbg.mapper;

import com.tb.mbg.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

/**
 * @author linxc
 * @date 2023/11/04
 * */
@Mapper
public interface E10AssociateQueryMapper {

    /**
     * 获取无A519的销售订单
     * */
    List<HasntA519OrderModel> getHastA519OrderList(Date date);

    /**
     * 获取当前品号的总出货量
     * */
    List<QuantityOfShipment> getQuantityOfShipment(String itemName);

    /**
     * 获取仓库中有库存的品号清单
     * */
    List<ProductionOfHasInventory> getProductionOfHasInventoryList(String warehouseId);

    /**
     * 获取待检采购订单明细列表
     * */
    List<PurchaseArrivalModel> getPurchaseArrivalList(Date date);

    /**
     * 获取审核后的工程变更单列表
     * */
    List<EngineeringChange> getEngineeringChangeList(Date date);

    /**
     * 通过变更单id获取BOM变更明细
     * */
    List<EngineeringChangeBOMChange> getEngineeringChangeBOMChangeList(String ecnId);

    /**
     * 获取时间段内新增的BOM
     * */
    List<Bom> getNewBom(Date date);

    /**
     * 通过bomId获取Bom变更明细
     * */
    List<BomD> getBomDByBomId(String bomId);
}
