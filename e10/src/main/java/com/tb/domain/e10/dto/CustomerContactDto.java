package com.tb.domain.e10.dto;

import com.tb.mbg.model.CustomerContact;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CustomerContactDto {

    List<CustomerContact> customerContactList;
}
