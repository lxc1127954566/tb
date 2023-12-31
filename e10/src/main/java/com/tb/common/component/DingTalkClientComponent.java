package com.tb.common.component;

import com.aliyun.dingtalkyida_1_0.Client;
import com.aliyun.teaopenapi.models.Config;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Getter
public class DingTalkClientComponent {

    @Value("${ding_talk.app_key}")
    private String appKey;

    @Value("${ding_talk.app_secret}")
    private String appSecret;

    @Bean
    public Client client() throws Exception{
        Config config = new Config();
        config.protocol = "https";
        config.regionId = "central";
        return new Client(config);
    }
}
