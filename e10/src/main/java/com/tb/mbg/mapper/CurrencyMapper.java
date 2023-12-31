package com.tb.mbg.mapper;

import com.tb.mbg.model.Currency;
import com.tb.mbg.model.CurrencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CurrencyMapper {
    long countByExample(CurrencyExample example);

    int deleteByExample(CurrencyExample example);

    int deleteByPrimaryKey(String currencyId);

    int insert(Currency row);

    int insertSelective(Currency row);

    List<Currency> selectByExampleWithBLOBs(CurrencyExample example);

    List<Currency> selectByExample(CurrencyExample example);

    Currency selectByPrimaryKey(String currencyId);

    int updateByExampleSelective(@Param("row") Currency row, @Param("example") CurrencyExample example);

    int updateByExampleWithBLOBs(@Param("row") Currency row, @Param("example") CurrencyExample example);

    int updateByExample(@Param("row") Currency row, @Param("example") CurrencyExample example);

    int updateByPrimaryKeySelective(Currency row);

    int updateByPrimaryKeyWithBLOBs(Currency row);

    int updateByPrimaryKey(Currency row);
}