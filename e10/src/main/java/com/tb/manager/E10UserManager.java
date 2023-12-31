package com.tb.manager;

import com.tb.domain.e10.dto.UserManagrDto;

/**
 * @author linxc
 * @description 登录用户业务接口
 * */
public interface E10UserManager {

    /**
     * 通过用户名查询用户信息
     * */
    UserManagrDto getUserByUsername(String username);
}
