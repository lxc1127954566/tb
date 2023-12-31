package com.tb.domain.yida.request;

import lombok.Getter;

/**
 * 批量新增表单model
 *
 * @author linxc
 * */
@Getter
public class BatchSaveFormRequest implements Request {

    private String formUuid;
    private Boolean asynchronousExecution;
    private String appType;
    private String systemToken;
    private String[] formDataJsonList;
    private Boolean noExecuteExpression;
    private Boolean keepRunningAfterException;
    private String userId;

    public BatchSaveFormRequest setFormUuid(String formUuid){
        this.formUuid = formUuid;
        return this;
    }

    public BatchSaveFormRequest setAsynchronousExecution(Boolean asynchronousExecution){
        this.asynchronousExecution = asynchronousExecution;
        return this;
    }

    public BatchSaveFormRequest setAppType(String appType){
        this.appType = appType;
        return this;
    }

    public BatchSaveFormRequest setSystemToken(String systemToken){
        this.systemToken = systemToken;
        return this;
    }

    public BatchSaveFormRequest setFormDataJsonList(String[] formDataJsonList){
        this.formDataJsonList = formDataJsonList;
        return this;
    }

    public BatchSaveFormRequest setNoExecuteExpression(Boolean noExecuteExpression){
        this.noExecuteExpression = noExecuteExpression;
        return this;
    }

    public BatchSaveFormRequest setKeepRunningAfterException(Boolean keepRunningAfterException){
        this.keepRunningAfterException = keepRunningAfterException;
        return this;
    }

    public BatchSaveFormRequest setUserId(String userId){
        this.userId = userId;
        return this;
    }
}
