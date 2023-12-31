package com.tb.domain.xbb.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class CustomManagerRequest {

    private String corpId;
    private String userId;
    private String formId;
    private XBBRequest request;
    private List<Map<String, Object>> condition;
    private int pageSize;
    private int page;
    private int isPublic;
    private int del;
}
