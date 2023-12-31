package com.tb.domain.e10.dto;

import com.tb.mbg.model.FeatureGroup;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FeatureGroupManagerDto {

    private List<FeatureGroup> featureGroupList;
}
