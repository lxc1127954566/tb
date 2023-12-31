package com.tb.scheduler;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.ObjectUtil;
import com.tb.common.component.RedisService;
import com.tb.common.enu.WarehouseEnum;
import com.tb.domain.yida.dto.ProductionOfHasInventoryDto;
import com.tb.domain.yida.request.BatchRemoveFormRequest;
import com.tb.domain.yida.request.BatchSaveFormRequest;
import com.tb.service.E10DingTalkService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
@Slf4j
public class Task {

    private static final String LAST_RECORDED_TIME = "lastRecordedTime:date";

    @Autowired
    private E10DingTalkService e10DingTalkService;

    @Autowired
    private RedisService redisService;

    /**
     * 5分钟刷新任务
     * */
    @Scheduled(cron = "0 */5 * * * ?")
    public void refreshTask(){
        log.info("5分钟刷新任务开启");
        Date date = ObjectUtil.isEmpty(redisService.get(LAST_RECORDED_TIME)) ?
                new Date(System.currentTimeMillis() - (5 * 60 * 1000)) : new Date((Long) redisService.get(LAST_RECORDED_TIME));
        redisService.set(LAST_RECORDED_TIME, System.currentTimeMillis());
        e10DingTalkService.getPurchaseArrivalListToYiDa(date);
        e10DingTalkService.getEngineeringChangeListToYiDa(date);
        e10DingTalkService.getBomDetailListToYiDa(date);
        e10DingTalkService.getIQCListToYiDa(date);
    }

    /**
     * 每天 9点定时任务
     * */
    @Scheduled(cron = "0 0 9 * * ?")
    public void ScheduledTasksDaily(){
        log.info("执行每日9点定时任务");
        List<String> noA519SaleOrderToYiDa = e10DingTalkService.getNoA519SaleOrderToYiDa();
        if (CollectionUtil.isEmpty(noA519SaleOrderToYiDa)){
            log.info("销售订单中未获取没开过A519的品号！");
            return ;
        }
        log.info("结束执行每日9点定时任务");
    }

    /**
     * 每周一 9点定时任务
     * */
    @Scheduled(cron = "0 0 9 * * 1")
    public void ScheduledTaskWeekly(){
        log.info("每周一 9点 定时任务执行");
        e10DingTalkService.getProductionOfHasInventoryListToYiDa(getPOILRequestParams(WarehouseEnum.DEFECTIVE_WAREHOUSE.getId()));
        e10DingTalkService.getProductionOfHasInventoryListToYiDa(getPOILRequestParams(WarehouseEnum.RETURN_PADDING_WAREHOUSE.getId()));
        e10DingTalkService.getProductionOfHasInventoryListToYiDa(getPOILRequestParams(WarehouseEnum.YiBin_ON_WAY_WAREHOUSE.getId()));
    }

    private ProductionOfHasInventoryDto getPOILRequestParams(String warehouseId){
        BatchSaveFormRequest batchSaveFormRequest = new BatchSaveFormRequest()
                .setUserId("16756439299807099")
                .setAppType("APP_PH1T78RDMR5CCSCQYXE0")
                .setSystemToken("3T866P61PCNFYOT89WFFE5N0SGXT2F2TECJOLT1")
                .setKeepRunningAfterException(false)
                .setFormUuid("FORM-NO9667911KZFC5QJD9X6WB1Z6ED63G77JF3PLQ2")
                .setNoExecuteExpression(false)
                .setAsynchronousExecution(false);
        BatchRemoveFormRequest batchRemoveFormRequest = new BatchRemoveFormRequest()
                .setExecuteExpression(false)
                .setFormUuid("FORM-NO9667911KZFC5QJD9X6WB1Z6ED63G77JF3PLQ2")
                .setAsynchronousExecution(false)
                .setUserId("16756439299807099")
                .setSystemToken("3T866P61PCNFYOT89WFFE5N0SGXT2F2TECJOLT1")
                .setAppType("APP_PH1T78RDMR5CCSCQYXE0");
        ProductionOfHasInventoryDto dto = new ProductionOfHasInventoryDto();
        dto.setBatchSaveFormRequest(batchSaveFormRequest);
        dto.setBatchRemoveFormRequest(batchRemoveFormRequest);
        dto.setWarehouseId(warehouseId);
        return dto;
    }


}
