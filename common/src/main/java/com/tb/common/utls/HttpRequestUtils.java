package com.tb.common.utls;

import cn.hutool.core.util.ObjectUtil;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * http请求工具类
 *
 * @author linxc
 * @date 2023/12/22
 **/
public class HttpRequestUtils {

    public static String post(String url, String param){
        return post(url, param, null);
    }

    /**
     * 发起Post请求
     * @param url 请求url
     * @param param 请求参数(JSON格式)
     * @param sign 签名
     * @return 请求回参
     * */
    public static String post(String url, String param, String sign){
        String body = null;
        //创建默认的httpClient实例
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建http post
        HttpPost httpPost = new HttpPost(url);
        httpPost.addHeader("sign", sign);

        //参数设置
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(10000)
                .setSocketTimeout(10000)
                .build();
        httpPost.setConfig(requestConfig);
        try{
            //TODO 注意：请求格式为JSON，请求内容以UTF-8编码
            StringEntity uefEntity = new StringEntity(param, "UTF-8");
            uefEntity.setContentType("application/json");
            httpPost.setEntity(uefEntity);
            CloseableHttpResponse response = httpClient.execute(httpPost);
            try{
                HttpEntity entity = response.getEntity();
                if (ObjectUtil.isNotEmpty(entity)){
                    body = EntityUtils.toString(entity, "UTF-8");
                }
            } finally {
                response.close();
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            //关闭连接，释放资源
            try{
                httpClient.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        return body;
    }
}
