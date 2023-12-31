package com.tb.domain.e10.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class EcnDto {

    private String ecnId;

    private String docNo;

    private Date docDate;

    private String docId;

    private String ownerDept;

    private String ownerEmp;

    private String reasonDesc;

    private String content;

    private String reasonId;

    private String personId;

    private String urgentId;

    private String pmcStatus;

    private Integer printcount;

    private String efnetstatus;

    private String efnetaction;

    private String efnetdoccategory;

    private String efnetdocnumber;

    private Date createdate;

    private Date lastmodifieddate;

    private Date modifieddate;

    private String createby;

    private String lastmodifiedby;

    private String modifiedby;

    private String approvestatus;

    private Date approvedate;

    private String approveby;

    private String processinstanceid;

    private String ownerOrgRtk;

    private String ownerOrgRoid;

    private String attachments;
}
