package com.tb.common.enu;

public enum ApiEnum {
    DingTalk_TOKEN_GET_API("yida", "/gettoken", 1),
    XBB_PRODUCTSORT_SAVE_API("xbb", "/pro/v2/api/product/categoryAdd", 2),
    XBB_PRODUCTSORT_DEL_API("xbb", "/pro/v2/api/product/categoryDel",2),
    XBB_PRODUCTSORT_LIST_API("xbb", "/pro/v2/api/product/categoryList", 2),
    XBB_PRODUCT_SAVE_API("xbb", "/pro/v2/api/product/add", 2),
    XBB_CUSTOM_SAVE_API("xbb", "/pro/v2/api/customer/add", 2),
    XBB_USER_LIST_API("xbb", "/pro/v2/api/user/list", 2),
    XBB_FORM_LIST_API("xbb", "/pro/v2/api/form/list", 2),
    XBB_CUSTOM_LIST_API("xbb", "/pro/v2/api/customer/list", 2)
    ;

    private String apiSort;
    private String api;
    private int sortCode;

    ApiEnum(String apiSort, String api, int sortCode) {
        this.apiSort = apiSort;
        this.api = api;
        this.sortCode = sortCode;
    }

    public String getApiSort() {
        return apiSort;
    }

    public String getApi() {
        return api;
    }

    public int getSortCode() {
        return sortCode;
    }
}
