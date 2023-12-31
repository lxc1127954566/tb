package com.tb.mbg.mapper;

import com.tb.mbg.model.Item;
import com.tb.mbg.model.ItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemMapper {
    long countByExample(ItemExample example);

    int deleteByExample(ItemExample example);

    int deleteByPrimaryKey(String itemBusinessId);

    int insert(Item row);

    int insertSelective(Item row);

    List<Item> selectByExampleWithBLOBs(ItemExample example);

    List<Item> selectByExample(ItemExample example);

    Item selectByPrimaryKey(String itemBusinessId);

    int updateByExampleSelective(@Param("row") Item row, @Param("example") ItemExample example);

    int updateByExampleWithBLOBs(@Param("row") Item row, @Param("example") ItemExample example);

    int updateByExample(@Param("row") Item row, @Param("example") ItemExample example);

    int updateByPrimaryKeySelective(Item row);

    int updateByPrimaryKeyWithBLOBs(Item row);

    int updateByPrimaryKey(Item row);
}