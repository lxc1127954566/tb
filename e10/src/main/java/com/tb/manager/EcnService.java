package com.tb.manager;

import com.tb.domain.e10.dto.EcnDto;
import com.tb.mbg.model.Ecn;
import com.tb.mbg.model.EcnD;

import java.util.List;

public interface EcnService {

    List<EcnD> getEcnDByEcnID(String ecnId);

    List<Ecn> getAuditedECNWithinLastModifiedTime(EcnDto ecnDto) throws ClassNotFoundException;
}
