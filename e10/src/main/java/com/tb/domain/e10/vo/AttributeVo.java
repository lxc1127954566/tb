package com.tb.domain.e10.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class AttributeVo implements Serializable {

    private static final long serialVersionUID = -9102915333466969856L;
    private String id;
    private String code;
    private String value;
    private String remark;
}
