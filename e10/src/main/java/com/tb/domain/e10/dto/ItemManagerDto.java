package com.tb.domain.e10.dto;

import com.tb.mbg.model.Item;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ItemManagerDto {

    private List<Item> itemList;
}
