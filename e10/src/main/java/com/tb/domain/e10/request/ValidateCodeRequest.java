package com.tb.domain.e10.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ValidateCodeRequest implements Serializable {

    private static final long serialVersionUID = 4849343921861795842L;
    private String code;
}
