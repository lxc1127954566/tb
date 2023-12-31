package com.tb.interfaceManager.yida;

import com.aliyun.dingtalkyida_1_0.models.BatchSaveFormDataResponse;
import com.aliyun.dingtalkyida_1_0.models.CreateOrUpdateFormDataResponse;
import com.aliyun.dingtalkyida_1_0.models.SearchFormDataSecondGenerationResponse;
import com.tb.domain.yida.request.DingTalkRequest;

public interface YidaApiService {

    /**
     * 获取钉钉token
     *
     * @return String
     * */
    void updateDingTalkToken();

    /**
     * 批量删除表单实例
     *
     * @param request
     * */
    void batchRemove(DingTalkRequest request);

    /**
     * 批量新增
     *
     * @param request
     * @return BatchSaveFormDataResponse
     * */
    BatchSaveFormDataResponse batchSave(DingTalkRequest request);

    /**
     * 通过高级查询条件获取表单实例数据
     *
     * @param request
     * @return SearchFormDataSecondGenerationResponse
     * */
    SearchFormDataSecondGenerationResponse queryAll(DingTalkRequest request);

    /**
     * 新增或更新表单实例
     *
     * @param request
     * @return CreateOrUpdateFormDataResponse
     * */
    CreateOrUpdateFormDataResponse insertOrUpdate(DingTalkRequest request);
}
