package com.tb.domain.yida.request;

import lombok.Getter;

import java.util.List;

/**
 * 批量删除表单model
 *
 * @author linxc
 * */
@Getter
public class BatchRemoveFormRequest<T> implements Request{

    private String formUuid;
    private Boolean asynchronousExecution;
    private String appType;
    private String systemToken;
    private List<String> formInstanceIdList;
    private Boolean executeExpression;
    private String userId;

    public BatchRemoveFormRequest setFormUuid(String formUuid){
        this.formUuid = formUuid;
        return this;
    }

    public BatchRemoveFormRequest setAsynchronousExecution(Boolean asynchronousExecution){
        this.asynchronousExecution = asynchronousExecution;
        return this;
    }

    public BatchRemoveFormRequest setAppType(String appType){
        this.appType = appType;
        return this;
    }

    public BatchRemoveFormRequest setSystemToken(String systemToken){
        this.systemToken = systemToken;
        return this;
    }

    public BatchRemoveFormRequest setFormInstanceIdList(List<String> formInstanceIdList){
        this.formInstanceIdList = formInstanceIdList;
        return this;
    }

    public BatchRemoveFormRequest setUserId(String userId){
        this.userId = userId;
        return this;
    }

    public BatchRemoveFormRequest setExecuteExpression(Boolean executeExpression){
        this.executeExpression = executeExpression;
        return this;
    }
}
