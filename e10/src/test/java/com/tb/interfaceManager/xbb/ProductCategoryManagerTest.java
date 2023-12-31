package com.tb.interfaceManager.xbb;

import com.tb.domain.xbb.request.ProductCategoryManagerRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class ProductCategoryManagerTest {

    @Autowired
    private ProductCategoryManager manager;

    @Test
    public void testSave(){
        ProductCategoryManagerRequest request = new ProductCategoryManagerRequest();
        List<String> list = new ArrayList<>();
        list.add("成品缓冲垫类");
        list.add("成品绝缘垫片类");
        list.add("成品胶带类");
        list.add("成品标签标牌类");
        list.add("成品其他加工类");
        request.setNameList(list);
        request.setParentId(0);
        request.setCorpId("ding8a8fe2db510b10db35c2f4657eb6378f");
        request.setUserId("16756439299807099");
        manager.batchSave(request);
    }
}
