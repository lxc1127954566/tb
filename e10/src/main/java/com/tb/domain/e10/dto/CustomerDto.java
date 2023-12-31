package com.tb.domain.e10.dto;

import com.tb.mbg.model.Customer;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CustomerDto {

    List<Customer> customerList;
}
