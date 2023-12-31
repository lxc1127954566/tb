package com.tb.mbg.mapper;

import com.tb.mbg.model.User;
import com.tb.mbg.model.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(User row);

    int insertSelective(User row);

    List<User> selectByExampleWithBLOBs(UserExample example);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("row") User row, @Param("example") UserExample example);

    int updateByExampleWithBLOBs(@Param("row") User row, @Param("example") UserExample example);

    int updateByExample(@Param("row") User row, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User row);

    int updateByPrimaryKeyWithBLOBs(User row);

    int updateByPrimaryKey(User row);
}