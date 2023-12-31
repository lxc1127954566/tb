package com.tb.domain.yida.request;

import com.tb.common.api.CommonHeader;
import lombok.Data;

@Data
public class DingTalkRequest {

    private CommonHeader header;
    private Request body;
}
