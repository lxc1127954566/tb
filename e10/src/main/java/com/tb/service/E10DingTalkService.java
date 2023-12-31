package com.tb.service;

import com.tb.domain.yida.dto.ProductionOfHasInventoryDto;

import java.util.Date;
import java.util.List;

/**
 * E10 钉钉 数据处理业务接口
 *
 * @author linxc
 * @date 2023/11/09
 * */
public interface E10DingTalkService {

    /**
     * 获取销售订单品号中无开具A519工单
     */
    List<String> getNoA519SaleOrderToYiDa();

    /**
     * 宜搭设置品号出货量
     */
    void setQuantityOfShipment();

    /**
     * 获取仓库有库存品号清单推送到宜搭
     */
    List<String> getProductionOfHasInventoryListToYiDa(ProductionOfHasInventoryDto productionOfHasInventoryDto);

    /**
     * 获取待检采购订单明细列表推送宜搭
     **/
    List<String> getPurchaseArrivalListToYiDa(Date date);

    /**
     * 获取审核后的工程变更单(包含BOM详情)列表推送宜搭
     */
    List<String> getEngineeringChangeListToYiDa(Date date);

    /**
     * 获取新增BOM信息（及BOM明细）列表推送宜搭
     */
    List<String> getBomDetailListToYiDa(Date date);

    /**
     * 获取新增IQC数据推送宜搭
     * */
    List<String> getIQCListToYiDa(Date date);
}