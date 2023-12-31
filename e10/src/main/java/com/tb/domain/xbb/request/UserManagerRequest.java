package com.tb.domain.xbb.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserManagerRequest {

    private String corpId;
    private String userId;
    private String username;
    private List<String> userIdList;
}
