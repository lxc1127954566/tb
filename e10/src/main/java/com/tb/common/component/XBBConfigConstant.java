package com.tb.common.component;

import com.alibaba.fastjson.JSONObject;
import com.tb.common.exception.TBConcreteException;
import com.tb.common.utils.EncryptUtil;
import com.tb.common.utils.HttpRequestUtils;
import lombok.Getter;

/**
 * 销帮帮接口全局配置与常量
 */
@Getter
public class XBBConfigConstant {

    /**
     * 销帮帮接口根域名
     */
    public static final String XBB_API_ROOT = "https://proapi.xbongbong.com";

    /**
     * 本公司corpid。接口基础参数，接口请求必传
     * 管理员账号登录销帮帮WEB版后台后，访问https://pfweb.xbongbong.com/#/apiToken/index查看
     */
    public static final String CORP_ID = "ding8a8fe2db510b10db35c2f4657eb6378f";

    /**
     * 本公司访问接口的token,该值相当于密钥，请妥善保管，不要泄露，可以下列url中重置token
     * 管理员账号登录销帮帮WEB版后台后，访问https://pfweb.xbongbong.com/#/apiToken/index查看
     */
    public static final String TOKEN = "422dec342d91cfed63eaccd70b028363";

    /**
     * 接口操作人userId,接口基础参数。不传默认取超管角色
     */
    public static final String USER_ID = "186444222032310044";
//
//    /* ---------------------------------------------表单模块接口地址------------------------------------------------*/
//    /**
//     * 表单模板列表接口
//     */
//    public static final String FORM_LIST = "/pro/v2/api/form/list";
//
//    /**
//     * 表单模板字段解释接口
//     */
//    public static final String FORM_GET = "/pro/v2/api/form/get";
//
//
//    /* ---------------------------------------------客户模块接口地址------------------------------------------------*/
//    /**
//     * 客户列表接口
//     */
//    public static final String CUSTOMER__LIST = "/pro/v2/api/customer/list";
//
//    /**
//     * 客户新建接口
//     */
//    public static final String CUSTOMER__ADD = "/pro/v2/api/customer/add";

    /**
     * 获取接口地址
     * @param restApiUrl 请求url
     * @return 请求回参
     */
    public static String getApiUrl(String restApiUrl) {
        return XBB_API_ROOT + restApiUrl;
    }

    /**
     * 获取签名
     * @param data 请求参数(JSON格式)
     * @param token 令牌
     * @return 接口回参
     */
    public static String getDataSign(JSONObject data, String token) {
        return getDataSign(data.toJSONString(), token);
    }

    /**
     * 获取签名
     * @param data 请求参数(JSON格式)
     * @param token 令牌
     * @return 接口回参
     */
    public static String getDataSign(String data, String token) {
        return  EncryptUtil.getEncrypt(data + token, "SHA-256");
    }

    /**
     * 调用xbb api，生成签名 ，发起HTTP POST请求
     * @param url,xbb api的接口url，不包含域名,从/开始，例如"/pro/v2/api/form/list"
     * @param data 请求参数(JSON格式)
     * @return 接口回参
     */
    public static String xbbApi(String url,JSONObject data) {
        String absoluteUrl = XBBConfigConstant.getApiUrl(url);
        //签名规则:将访问接口所需的参数集data + token字符串拼接后进行SHA256运算得到最后的签名,然后将签名参数sign(参数名为sign)放入http header中;
        // 			将访问接口所需的参数集data(参数名为data)放入http body。
        // 			算法为 sha-256 ( data+token ),使用utf-8编码
        String sign = XBBConfigConstant.getDataSign(data, TOKEN);
        String response ;
        try {
            //发起post请求，data作为 request body，sign在 http-header中传输
            response = HttpRequestUtils.post(absoluteUrl, data.toJSONString(), sign);
        } catch(Exception e) {
            throw new TBConcreteException("http post访问出错");
        }
        return response;
    }
}
