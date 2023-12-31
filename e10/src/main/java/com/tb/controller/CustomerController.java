package com.tb.controller;

import com.alibaba.druid.util.StringUtils;
import com.tb.common.api.CommonResult;
import com.tb.domain.e10.request.CustomerRequest;
import com.tb.domain.e10.request.ValidateCodeRequest;
import com.tb.domain.xbb.request.XBBCustomRequest;
import com.tb.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linxc
 * @description 客户表接口
 * */
@RestController
@RequestMapping("/v1/tb/customer")
@Slf4j
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/e10/save")
    public CommonResult e10Save(@RequestBody CustomerRequest request){
        String id = customerService.e10Save(request);
        if (StringUtils.isEmpty(id)){
            return CommonResult.failed("插入失败");
        }
        return CommonResult.success(id);
    }

    @PostMapping("/e10/generatorCustomerCode")
    public CommonResult e10ValidateCode(@RequestBody ValidateCodeRequest request){
        String serial = customerService.e10ValidateCode(request.getCode());
        if (StringUtils.isEmpty(serial)){
            return CommonResult.failed("未获取到自动生成客户编号");
        }
        return CommonResult.success(serial);
    }

    @PostMapping("/xbb/save")
    public CommonResult xbbSave(@RequestBody XBBCustomRequest request){
        String id = customerService.xbbSave(request);
        if (StringUtils.isEmpty(id)){
            return CommonResult.failed("插入失败");
        }
        return CommonResult.success(id);
    }
}
