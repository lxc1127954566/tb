package com.tb.domain.xbb.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProductCategoryManagerRequest {

    private String userId;
    private String corpId;
    private List<String> nameList;
    private int parentId;
    private List<Integer> dataIdList;
}
