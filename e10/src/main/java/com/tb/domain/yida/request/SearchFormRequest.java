package com.tb.domain.yida.request;

import lombok.Getter;

@Getter
public class SearchFormRequest implements Request {

    private Integer pageNumber;
    private String formUuid;
    private String searchCondition;
    private String modifiedToTimeGMT;
    private String systemToken;
    private String modifiedFromTimeGMT;
    private Integer pageSize;
    private String userId;
    private String appType;
    private String orderConfigJson;
    private String originatorId;
    private String createToTimeGMT;
    private String createFromTimeGMT;

    public SearchFormRequest setFormUuid(String formUuid){
        this.formUuid = formUuid;
        return this;
    }
    public SearchFormRequest setPageNumber(Integer pageNumber){
        this.pageNumber = pageNumber;
        return this;
    }
    public SearchFormRequest setSearchCondition(String searchCondition){
        this.searchCondition = searchCondition;
        return this;
    }
    public SearchFormRequest setModifiedToTimeGMT(String modifiedToTimeGMT){
        this.modifiedToTimeGMT = modifiedToTimeGMT;
        return this;
    }
    public SearchFormRequest setSystemToken(String systemToken){
        this.systemToken = systemToken;
        return this;
    }
    public SearchFormRequest setModifiedFromTimeGMT(String modifiedFromTimeGMT){
        this.modifiedFromTimeGMT = modifiedFromTimeGMT;
        return this;
    }
    public SearchFormRequest setPageSize(Integer pageSize){
        this.pageSize = pageSize;
        return this;
    }
    public SearchFormRequest setUserId(String userId){
        this.userId = userId;
        return this;
    }
    public SearchFormRequest setAppType(String appType){
        this.appType = appType;
        return this;
    }
    public SearchFormRequest setOrderConfigJson(String orderConfigJson){
        this.orderConfigJson = orderConfigJson;
        return this;
    }
    public SearchFormRequest setOriginatorId(String originatorId){
        this.originatorId = originatorId;
        return this;
    }
    public SearchFormRequest setCreateToTimeGMT(String createToTimeGMT){
        this.createToTimeGMT = createToTimeGMT;
        return this;
    }
    public SearchFormRequest setCreateFromTimeGMT(String createFromTimeGMT){
        this.createFromTimeGMT = createFromTimeGMT;
        return this;
    }

}
