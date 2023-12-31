package com.tb.mbg.mapper;

import com.tb.mbg.model.Company;
import com.tb.mbg.model.CompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyMapper {
    long countByExample(CompanyExample example);

    int deleteByExample(CompanyExample example);

    int deleteByPrimaryKey(String companyId);

    int insert(Company row);

    int insertSelective(Company row);

    List<Company> selectByExampleWithBLOBs(CompanyExample example);

    List<Company> selectByExample(CompanyExample example);

    Company selectByPrimaryKey(String companyId);

    int updateByExampleSelective(@Param("row") Company row, @Param("example") CompanyExample example);

    int updateByExampleWithBLOBs(@Param("row") Company row, @Param("example") CompanyExample example);

    int updateByExample(@Param("row") Company row, @Param("example") CompanyExample example);

    int updateByPrimaryKeySelective(Company row);

    int updateByPrimaryKeyWithBLOBs(Company row);

    int updateByPrimaryKey(Company row);
}