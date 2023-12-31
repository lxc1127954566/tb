package com.tb.domain.e10.dto;

import com.tb.mbg.model.CustomerProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CustomerPropertyDto {

    private List<CustomerProperty> customerPropertyList;
}
