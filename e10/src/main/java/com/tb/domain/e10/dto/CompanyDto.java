package com.tb.domain.e10.dto;

import com.tb.mbg.model.Company;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CompanyDto {

    List<Company> companyList;
}
