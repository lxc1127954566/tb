package com.tb.domain.e10.dto;

import com.tb.mbg.model.Supplier;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class SupplierDto {

    List<Supplier> supplierList;
}
