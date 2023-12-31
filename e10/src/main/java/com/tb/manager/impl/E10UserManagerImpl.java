package com.tb.manager.impl;

import com.tb.annotation.Manager;
import com.tb.domain.e10.dto.UserManagrDto;
import com.tb.manager.E10UserManager;
import com.tb.mbg.mapper.UserMapper;
import com.tb.mbg.model.User;
import com.tb.mbg.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Manager
public class E10UserManagerImpl implements E10UserManager {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserManagrDto getUserByUsername(String username) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(username);
        List<User> users = userMapper.selectByExample(example);
        UserManagrDto dto = new UserManagrDto();
        dto.setUserList(users);
        return dto;
    }
}
