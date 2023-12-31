package com.tb.domain.yida.request;

import lombok.Data;

@Data
public class CreateOrUpdateFormRequest implements Request {

    private String appType;
    private String formDataJson;
    private String formUuid;
    private Boolean noExecuteExpression;
    private String[] searchCondition;
    private String systemToken;
    private String userId;

    public CreateOrUpdateFormRequest setAppType(String appType){
        this.appType = appType;
        return this;
    }

    public CreateOrUpdateFormRequest setFormDataJson(String formDataJson){
        this.formDataJson = formDataJson;
        return this;
    }

    public CreateOrUpdateFormRequest setFormUuid(String formUuid){
        this.formUuid = formUuid;
        return this;
    }

    public CreateOrUpdateFormRequest setNoExecuteExpression(Boolean noExecuteExpression){
        this.noExecuteExpression = noExecuteExpression;
        return this;
    }

    public CreateOrUpdateFormRequest setUserId(String userId){
        this.userId = userId;
        return this;
    }

    public CreateOrUpdateFormRequest setSearchCondition(String[] searchCondition){
        this.searchCondition = searchCondition;
        return this;
    }

    public CreateOrUpdateFormRequest setSystemToken(String systemToken){
        this.systemToken = systemToken;
        return this;
    }
}
