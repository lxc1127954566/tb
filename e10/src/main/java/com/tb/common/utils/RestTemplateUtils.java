package com.tb.common.utils;

import cn.hutool.core.map.MapUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;

/**
 * @author linxc
 * @date 2023/11/29
 * */
@Component
public class RestTemplateUtils {

    private static final Logger log = LoggerFactory.getLogger(RestTemplateUtils.class);

    /**
     * 生成get参数请求url
     * */
    public static String generateRequestParameters(String protocol, String url, Map<String, String> params){
        log.info("generate the getUrl");
        StringBuilder sb = new StringBuilder(protocol).append("://").append(url);
        if (MapUtil.isNotEmpty(params)){
            sb.append("?");
            for (Map.Entry map : params.entrySet()){
                sb.append(map.getKey())
                        .append("=")
                        .append(map.getValue())
                        .append("&");
            }
            url = sb.substring(0, sb.length() - 1);
            return url;
        }
        return sb.toString();
    }

    /**
     * 生成post请求的JSON请求参数
     */
    public static HttpEntity<Map<String, Object>> generatePostJson(Map<String, Map<String, Object>> jsonMap) {
        log.info("generate the postJson");
        //如果需要其它的请求头信息、都可以在这里追加
        Map<String, Object> header = jsonMap.get("header");
        HttpHeaders httpHeaders = new HttpHeaders();
        if (MapUtil.isNotEmpty(header)){
            MediaType type = MediaType.parseMediaType((String) jsonMap.get("header").get("Content-Type"));
            httpHeaders.setContentType(type);
            Set keys = header.entrySet();
            for(Object key : keys){
                Map.Entry entry = (Map.Entry) key;
                httpHeaders.add((String)entry.getKey(), (String)entry.getValue());
            }
        }
        Map<String, Object> body = jsonMap.get("body");
        HttpEntity<Map<String, Object>> httpEntity = new HttpEntity<Map<String, Object>>(body, httpHeaders);
        return httpEntity;
    }
}
