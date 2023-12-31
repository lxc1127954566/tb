package com.tb.domain.yida.dto;

import com.tb.domain.yida.request.BatchRemoveFormRequest;
import com.tb.domain.yida.request.BatchSaveFormRequest;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductionOfHasInventoryDto {

    private BatchRemoveFormRequest batchRemoveFormRequest;
    private BatchSaveFormRequest batchSaveFormRequest;
    private String warehouseId;
}
