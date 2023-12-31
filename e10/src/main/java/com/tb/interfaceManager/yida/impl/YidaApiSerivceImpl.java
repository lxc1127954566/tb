package com.tb.interfaceManager.yida.impl;

import com.alibaba.fastjson.JSON;
import com.aliyun.dingtalkyida_1_0.Client;
import com.aliyun.dingtalkyida_1_0.models.*;
import com.aliyun.tea.TeaException;
import com.aliyun.teautil.Common;
import com.aliyun.teautil.models.RuntimeOptions;
import com.tb.annotation.Manager;
import com.tb.common.component.DingTalkClientComponent;
import com.tb.common.component.RedisService;
import com.tb.common.enu.ApiEnum;
import com.tb.common.exception.TBConcreteException;
import com.tb.common.exception.YiDaConcreteExceptionEnum;
import com.tb.common.utils.RestTemplateUtils;
import com.tb.interfaceManager.yida.YidaApiService;
import com.tb.domain.yida.dto.TokenResponseDto;
import com.tb.domain.yida.request.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Manager
public class YidaApiSerivceImpl implements YidaApiService {

    private static final String PROTOCOL = "https";

    private static final String DING_TALK_URL = "oapi.dingtalk.com";

    private static final String DINGTALK_TOEKN = "dingtalk:token";

    @Autowired
    private DingTalkClientComponent config;

    @Autowired
    private Client client;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private RedisService redisService;

    @Override
    public void updateDingTalkToken() {
        ResponseEntity<TokenResponseDto> responseEntity = restTemplate.getForEntity(
                RestTemplateUtils.generateRequestParameters(PROTOCOL, DING_TALK_URL + ApiEnum.DingTalk_TOKEN_GET_API.getApi(), getDingTalkTokenParams()), TokenResponseDto.class
        );
        log.info("调用方法生成新的Access_token：【{}】", Thread.currentThread().getStackTrace(), PROTOCOL + "://" + DING_TALK_URL + ApiEnum.DingTalk_TOKEN_GET_API.getApi());
        TokenResponseDto tokenResponseDto = responseEntity.getBody();
        if (tokenResponseDto.getErrcode() != 0){
            throw new TBConcreteException(YiDaConcreteExceptionEnum.TOKEN_GET_FAILED);
        }
        redisService.set(DINGTALK_TOEKN, tokenResponseDto.getAccess_token());
    }

    @Override
    public void batchRemove(DingTalkRequest request) {
        BatchRemoveFormRequest body = (BatchRemoveFormRequest) request.getBody();
        BatchRemovalByFormInstanceIdListHeaders headers = new BatchRemovalByFormInstanceIdListHeaders();
        headers.setXAcsDingtalkAccessToken(getAccessToken());
        BatchRemovalByFormInstanceIdListRequest request1 = new BatchRemovalByFormInstanceIdListRequest()
                .setAppType(body.getAppType())
                .setAsynchronousExecution(body.getAsynchronousExecution())
                .setExecuteExpression(body.getExecuteExpression())
                .setFormUuid(body.getFormUuid())
                .setSystemToken(body.getSystemToken())
                .setUserId(body.getUserId())
                .setFormInstanceIdList(body.getFormInstanceIdList());
        try {
            client.batchRemovalByFormInstanceIdListWithOptions(request1, headers, new RuntimeOptions());
            log.info("发送钉钉批量删除数据请求");
        } catch (TeaException err) {
            if (!com.aliyun.teautil.Common.empty(err.code) && !com.aliyun.teautil.Common.empty(err.message)) {
                log.info("errCode:{},errMsg:{}", err.code, err.message);
                if (StringUtils.equals(err.code,"InvalidAuthentication")){
                    updateDingTalkToken();
                    this.batchRemove(request);
                }
            }
        } catch (Exception _err) {
            TeaException err = new TeaException(_err.getMessage(), _err);
            if (!com.aliyun.teautil.Common.empty(err.code) && !com.aliyun.teautil.Common.empty(err.message)) {
                log.info("errCode:{},errMsg:{}", err.code, err.message);
            }
        }
    }

    @Override
    public BatchSaveFormDataResponse batchSave(DingTalkRequest request) {
        BatchSaveFormDataResponse batchSaveFormDataResponse;
        BatchSaveFormRequest body = (BatchSaveFormRequest) request.getBody();
        BatchSaveFormDataHeaders batchSaveFormDataHeaders = new BatchSaveFormDataHeaders();
        batchSaveFormDataHeaders.setXAcsDingtalkAccessToken(getAccessToken());
        System.out.println("获取到AccessToken：" + getAccessToken());
        BatchSaveFormDataRequest batchSaveFormDataRequest = new BatchSaveFormDataRequest()
                .setNoExecuteExpression(body.getNoExecuteExpression())
                .setFormUuid(body.getFormUuid())
                .setAsynchronousExecution(body.getAsynchronousExecution())
                .setAppType(body.getAppType())
                .setSystemToken(body.getSystemToken())
                .setKeepRunningAfterException(body.getKeepRunningAfterException())
                .setUserId(body.getUserId())
                .setFormDataJsonList(Arrays.asList(body.getFormDataJsonList()));
        try {
            batchSaveFormDataResponse = client.batchSaveFormDataWithOptions(batchSaveFormDataRequest, batchSaveFormDataHeaders, new RuntimeOptions());
            log.info("发送钉钉批量新增数据请求，返回结果【{}】", JSON.toJSONString(batchSaveFormDataResponse));
        } catch (TeaException err) {
            if (!com.aliyun.teautil.Common.empty(err.code) && !com.aliyun.teautil.Common.empty(err.message)) {
                log.info("errCode:{},errMsg:{}", err.code, err.message);
            }
            if (StringUtils.equals(err.code,"InvalidAuthentication")){
                updateDingTalkToken();
                batchSaveFormDataResponse = this.batchSave(request);
            } else {
                batchSaveFormDataResponse = new BatchSaveFormDataResponse();
            }
        } catch (Exception _err) {
            TeaException err = new TeaException(_err.getMessage(), _err);
            if (!com.aliyun.teautil.Common.empty(err.code) && !com.aliyun.teautil.Common.empty(err.message)) {
                log.info("errCode:{},errMsg:{}", err.code, err.message);
            }
            batchSaveFormDataResponse = new BatchSaveFormDataResponse();
        }
        return batchSaveFormDataResponse;
    }

    @Override
    public SearchFormDataSecondGenerationResponse queryAll(DingTalkRequest request){
        SearchFormDataSecondGenerationResponse searchFormDataSecondGenerationResponse;
        SearchFormDataSecondGenerationHeaders headers = new SearchFormDataSecondGenerationHeaders();
        headers.setXAcsDingtalkAccessToken(getAccessToken());
        SearchFormRequest body = (SearchFormRequest) request.getBody();
        SearchFormDataSecondGenerationRequest searchFormDataSecondGenerationRequest = new SearchFormDataSecondGenerationRequest()
                .setFormUuid(body.getFormUuid())
                .setAppType(body.getAppType())
                .setSystemToken(body.getSystemToken())
                .setUserId(body.getUserId())
                .setSearchCondition(body.getSearchCondition())
                .setCreateFromTimeGMT(body.getCreateFromTimeGMT())
                .setCreateToTimeGMT(body.getCreateToTimeGMT())
                .setModifiedFromTimeGMT(body.getModifiedFromTimeGMT())
                .setModifiedToTimeGMT(body.getModifiedToTimeGMT())
                .setOrderConfigJson(body.getOrderConfigJson())
                .setOriginatorId(body.getOriginatorId())
                .setPageSize(body.getPageSize())
                .setPageNumber(body.getPageNumber());
        try{
            searchFormDataSecondGenerationResponse = client.searchFormDataSecondGenerationWithOptions(searchFormDataSecondGenerationRequest, headers, new RuntimeOptions());
        } catch (TeaException err){
            if (!Common.empty(err.code) && Common.empty(err.message)){
                log.info("errCode:{},errMsg:{}", err.code, err.message);
            }
            if (StringUtils.equals(err.code,"InvalidAuthentication")){
                updateDingTalkToken();
                searchFormDataSecondGenerationResponse = this.queryAll(request);
            } else {
                searchFormDataSecondGenerationResponse = new SearchFormDataSecondGenerationResponse();
            }
        } catch (Exception _err){
            TeaException err = new TeaException(_err.getMessage(), _err);
            if (!Common.empty(err.code) && Common.empty(err.message)){
                log.info("errCode:{},errMsg:{}", err.code, err.message);
            }
            searchFormDataSecondGenerationResponse = new SearchFormDataSecondGenerationResponse();
        }
        return searchFormDataSecondGenerationResponse;
    }

    @Override
    public CreateOrUpdateFormDataResponse insertOrUpdate(DingTalkRequest request) {
        CreateOrUpdateFormDataResponse createOrUpdateFormDataResponse;
        CreateOrUpdateFormDataHeaders headers = new CreateOrUpdateFormDataHeaders();
        headers.setXAcsDingtalkAccessToken(getAccessToken());
        CreateOrUpdateFormRequest body = (CreateOrUpdateFormRequest) request.getBody();
        CreateOrUpdateFormDataRequest createOrUpdateFormDataRequest = new CreateOrUpdateFormDataRequest()
                .setFormUuid(body.getFormUuid())
                .setAppType(body.getAppType())
                .setSystemToken(body.getSystemToken())
                .setUserId(body.getUserId())
                .setNoExecuteExpression(body.getNoExecuteExpression())
                .setFormDataJson(body.getFormDataJson())
                .setSearchCondition(Arrays.toString(body.getSearchCondition()));
        try {
            createOrUpdateFormDataResponse = client.createOrUpdateFormDataWithOptions(createOrUpdateFormDataRequest, headers, new RuntimeOptions());
        } catch (TeaException err) {
            if (!Common.empty(err.code) && Common.empty(err.message)) {
                log.info("errCode:{},errMsg:{}", err.code, err.message);
            }
            if (StringUtils.equals(err.code,"InvalidAuthentication")){
                updateDingTalkToken();
                createOrUpdateFormDataResponse = this.insertOrUpdate(request);
            } else {
                createOrUpdateFormDataResponse = new CreateOrUpdateFormDataResponse();
            }
        } catch (Exception _err) {
            TeaException err = new TeaException(_err.getMessage(), _err);
            if (!Common.empty(err.code) && Common.empty(err.message)) {
                log.info("errCode:{},errMsg:{}", err.code, err.message);
            }
            createOrUpdateFormDataResponse = new CreateOrUpdateFormDataResponse();
        }
        return createOrUpdateFormDataResponse;
    }

    private Map<String, String> getDingTalkTokenParams(){
        Map<String, String> params = new HashMap<>();
        params.put("appkey",config.getAppKey());
        params.put("appsecret",config.getAppSecret());
        return params;
    }

    private String getAccessToken(){
        return (String) redisService.get(DINGTALK_TOEKN);
    }
}
