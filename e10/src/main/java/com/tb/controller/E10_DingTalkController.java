package com.tb.controller;

import com.tb.common.api.CommonResult;
import com.tb.service.E10DingTalkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/e10_dingtalk")
public class E10_DingTalkController {

    @Autowired
    private E10DingTalkService e10DingTalkService;

    @GetMapping("/getQuantityOfShipment")
    public CommonResult getQuantityOfShipment(){
        e10DingTalkService.setQuantityOfShipment();
        return CommonResult.success(null);
    }

    @GetMapping("/getNoA519SaleOrder")
    public CommonResult getNoA519SaleOrder(){
        List<String> noA519SaleOrderToYiDa = e10DingTalkService.getNoA519SaleOrderToYiDa();
        return CommonResult.success(noA519SaleOrderToYiDa);
    }
}
