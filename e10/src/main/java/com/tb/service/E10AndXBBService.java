package com.tb.service;

import com.tb.domain.e10.request.ProductInfoRequest;
import com.tb.domain.xbb.vo.ProductVo;

/**
 * e10和销帮帮数据传输具体业务接口
 *
 * */
public interface E10AndXBBService {

    /**
     * E10品号通用信息进入销帮帮
     */
    ProductVo getProductInfoToXBB(ProductInfoRequest request);
}
