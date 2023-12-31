package com.tb.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.ObjectUtil;
import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.tb.common.exception.TBConcreteException;
import com.tb.common.exception.TBE10ExceptionEnum;
import com.tb.domain.e10.request.FeatureGroupManagerRequest;
import com.tb.domain.e10.request.ItemManagerRequest;
import com.tb.domain.e10.request.ProductInfoRequest;
import com.tb.domain.e10.request.UnitManagerRequest;
import com.tb.domain.xbb.request.ProductManagerRequest;
import com.tb.domain.xbb.request.ProductRequest;
import com.tb.domain.xbb.vo.ProductVo;
import com.tb.interfaceManager.xbb.ProductManager;
import com.tb.manager.FeatureGroupManager;
import com.tb.manager.ItemManager;
import com.tb.manager.UnitManager;
import com.tb.mbg.model.FeatureGroup;
import com.tb.mbg.model.Item;
import com.tb.mbg.model.Unit;
import com.tb.service.E10AndXBBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class E10AndXBBServiceImpl implements E10AndXBBService {

    @Autowired
    private ItemManager itemManager;
    @Autowired
    private FeatureGroupManager featureGroupManager;
    @Autowired
    private UnitManager unitManager;
    @Autowired
    private ProductManager productManager;

    @Override
    public ProductVo getProductInfoToXBB(ProductInfoRequest request) {
        //获取E10通用品号信息
        ItemManagerRequest itemManagerRequest = new ItemManagerRequest();
        itemManagerRequest.setCreateTime(request.getCreateDate());
        List<Item> itemList = itemManager.getItemManagerByCondition(itemManagerRequest).getItemList();
        Item first = CollectionUtil.getFirst(itemList);
        if (CollectionUtil.isEmpty(itemList)){
            throw new TBConcreteException(TBE10ExceptionEnum.NO_DATA_WAS_OBTAINED);
        }
        FeatureGroupManagerRequest featureGroupManagerRequest = new FeatureGroupManagerRequest();
        featureGroupManagerRequest.setFeatureGroupId(first.getFeatureGroupId());
        List<FeatureGroup> featureGroupList = featureGroupManager.getFeatureGroupListByCondition(featureGroupManagerRequest).getFeatureGroupList();
        if (ObjectUtil.isEmpty(featureGroupList)){
            throw new TBConcreteException(TBE10ExceptionEnum.NO_DATA_WAS_OBTAINED);
        }
        UnitManagerRequest unitManagerRequest = new UnitManagerRequest();
        unitManagerRequest.setUnitId(first.getStockUnitId());
        List<Unit> unitList = unitManager.getUnitListByCondition(unitManagerRequest).getUnitList();
        if (ObjectUtil.isEmpty(unitList)){
            throw new TBConcreteException(TBE10ExceptionEnum.NO_DATA_WAS_OBTAINED);
        }
        ProductRequest productRequest = new ProductRequest();
        productRequest.setName(first.getItemName());
        productRequest.setSerialNo(first.getItemCode());
        productRequest.setUnit(StringUtils.isEmpty(CollectionUtil.getFirst(unitList).getUnitName()) ? null : CollectionUtil.getFirst(unitList).getUnitName());
        productRequest.setSort(StringUtils.isEmpty(CollectionUtil.getFirst(featureGroupList).getFeatureGroupName()) ? null : CollectionUtil.getFirst(featureGroupList).getFeatureGroupName());
        ProductManagerRequest productManagerRequest = new ProductManagerRequest();
        productManagerRequest.setProduct(productRequest);
        JSONObject save = productManager.save(productManagerRequest);
        ProductVo vo = new ProductVo();
        vo.setCode(save.getInteger("code"));
        vo.setFormDataId(save.getLongValue("formDataId"));
        vo.setFormDataId(save.getLongValue("dataId"));
        vo.setMsg(save.getString("msg"));
        return vo;
    }
}
