package com.tb.manager.impl;

import com.tb.manager.E10AssociatedQueryManager;
import com.tb.mbg.mapper.E10AssociateQueryMapper;
import com.tb.mbg.mapper.EcnMapper;
import com.tb.mbg.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * E10数据处理业务层
 *
 * @author linxc
 * @date 2023/11/09
 * */
@Service
public class E10AssociatedQueryManagerImpl implements E10AssociatedQueryManager {

    @Autowired
    private E10AssociateQueryMapper e10AssociatedQueryMapper;

    @Autowired
    private EcnMapper ecnMapper;

    @Override
    public List<HasntA519OrderModel> getHastA519OrderList(Date date) {
        return e10AssociatedQueryMapper.getHastA519OrderList(date);
    }

    @Override
    public List<QuantityOfShipment> getQuantityOfShipment(String itemName){
        return e10AssociatedQueryMapper.getQuantityOfShipment(itemName);
    }

    @Override
    public List<ProductionOfHasInventory> getProductionOfHasInventoryList(String warehouseId) {
        return e10AssociatedQueryMapper.getProductionOfHasInventoryList(warehouseId);
    }

    @Override
    public List<PurchaseArrivalModel> getPurchaseArrivalList(Date date) {
        return e10AssociatedQueryMapper.getPurchaseArrivalList(date);
    }

    @Override
    public List<EngineeringChange> getEngineeringChangeList(Date date) {
        return e10AssociatedQueryMapper.getEngineeringChangeList(date);
    }

    @Override
    public List<EngineeringChangeBOMChange> getEngineeringChangeBOMChangeList(String ecnId){
        return e10AssociatedQueryMapper.getEngineeringChangeBOMChangeList(ecnId);
    }

    @Override
    public List<Bom> getNewBom(Date date){
        return e10AssociatedQueryMapper.getNewBom(date);
    }

    @Override
    public List<BomD> getBomDByBomId(String bomId){
        return e10AssociatedQueryMapper.getBomDByBomId(bomId);
    }
}
