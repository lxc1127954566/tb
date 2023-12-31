package com.tb.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PoArrivalInspection implements Serializable {
    private String poArrivalInspectionId;

    private String docNo;

    private Date docDate;

    private String docId;

    private String ownerDept;

    private String ownerEmp;

    private String category;

    private Date inspectionDate;

    private Integer qcTimes;

    private String inspectionTimes;

    private String itemId;

    private String itemDescription;

    private String itemFeatureId;

    private String itemSpecification;

    private String itemLotId;

    private String supplierId;

    private BigDecimal inspectionQty;

    private String inspectionUnitId;

    private String strictnessDegree;

    private Date inspectionDueDate;

    private String submitDeptId;

    private String submitEmpId;

    private BigDecimal inventoryQty;

    private BigDecimal secondQty;

    private BigDecimal acceptableQty;

    private BigDecimal unqualifiedQty;

    private BigDecimal destroyedQty;

    private String decision;

    private String decisionDescription;

    private String resultStatus;

    private Boolean reinspection;

    private String remark;

    private String inspectionPlanId;

    private String companyId;

    private String sourceId;

    private String moRoutingDId;

    private String operationId;

    private String toMoRoutingDId;

    private String toOperationId;

    private String projectId;

    private Boolean deductArrivedQty;

    private String generateSource;

    private String processinstanceid;

    private Integer printcount;

    private String efnetstatus;

    private String efnetaction;

    private String efnetdoccategory;

    private String efnetdocnumber;

    private String approvestatus;

    private Date approvedate;

    private String approveby;

    private Date createdate;

    private Date lastmodifieddate;

    private Date modifieddate;

    private String createby;

    private String lastmodifiedby;

    private String modifiedby;

    private BigDecimal udf001;

    private BigDecimal udf002;

    private BigDecimal udf003;

    private BigDecimal udf011;

    private BigDecimal udf012;

    private BigDecimal udf013;

    private String udf021;

    private String udf022;

    private String udf023;

    private String udf024;

    private String udf025;

    private String udf026;

    private Date udf041;

    private Date udf042;

    private String udf051;

    private String udf052;

    private String udf053;

    private String udf054;

    private String ownerOrgRtk;

    private String ownerOrgRoid;

    private byte[] version;

    private String attachments;

    private static final long serialVersionUID = 1L;

    public String getPoArrivalInspectionId() {
        return poArrivalInspectionId;
    }

    public void setPoArrivalInspectionId(String poArrivalInspectionId) {
        this.poArrivalInspectionId = poArrivalInspectionId;
    }

    public String getDocNo() {
        return docNo;
    }

    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getOwnerDept() {
        return ownerDept;
    }

    public void setOwnerDept(String ownerDept) {
        this.ownerDept = ownerDept;
    }

    public String getOwnerEmp() {
        return ownerEmp;
    }

    public void setOwnerEmp(String ownerEmp) {
        this.ownerEmp = ownerEmp;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(Date inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public Integer getQcTimes() {
        return qcTimes;
    }

    public void setQcTimes(Integer qcTimes) {
        this.qcTimes = qcTimes;
    }

    public String getInspectionTimes() {
        return inspectionTimes;
    }

    public void setInspectionTimes(String inspectionTimes) {
        this.inspectionTimes = inspectionTimes;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemFeatureId() {
        return itemFeatureId;
    }

    public void setItemFeatureId(String itemFeatureId) {
        this.itemFeatureId = itemFeatureId;
    }

    public String getItemSpecification() {
        return itemSpecification;
    }

    public void setItemSpecification(String itemSpecification) {
        this.itemSpecification = itemSpecification;
    }

    public String getItemLotId() {
        return itemLotId;
    }

    public void setItemLotId(String itemLotId) {
        this.itemLotId = itemLotId;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public BigDecimal getInspectionQty() {
        return inspectionQty;
    }

    public void setInspectionQty(BigDecimal inspectionQty) {
        this.inspectionQty = inspectionQty;
    }

    public String getInspectionUnitId() {
        return inspectionUnitId;
    }

    public void setInspectionUnitId(String inspectionUnitId) {
        this.inspectionUnitId = inspectionUnitId;
    }

    public String getStrictnessDegree() {
        return strictnessDegree;
    }

    public void setStrictnessDegree(String strictnessDegree) {
        this.strictnessDegree = strictnessDegree;
    }

    public Date getInspectionDueDate() {
        return inspectionDueDate;
    }

    public void setInspectionDueDate(Date inspectionDueDate) {
        this.inspectionDueDate = inspectionDueDate;
    }

    public String getSubmitDeptId() {
        return submitDeptId;
    }

    public void setSubmitDeptId(String submitDeptId) {
        this.submitDeptId = submitDeptId;
    }

    public String getSubmitEmpId() {
        return submitEmpId;
    }

    public void setSubmitEmpId(String submitEmpId) {
        this.submitEmpId = submitEmpId;
    }

    public BigDecimal getInventoryQty() {
        return inventoryQty;
    }

    public void setInventoryQty(BigDecimal inventoryQty) {
        this.inventoryQty = inventoryQty;
    }

    public BigDecimal getSecondQty() {
        return secondQty;
    }

    public void setSecondQty(BigDecimal secondQty) {
        this.secondQty = secondQty;
    }

    public BigDecimal getAcceptableQty() {
        return acceptableQty;
    }

    public void setAcceptableQty(BigDecimal acceptableQty) {
        this.acceptableQty = acceptableQty;
    }

    public BigDecimal getUnqualifiedQty() {
        return unqualifiedQty;
    }

    public void setUnqualifiedQty(BigDecimal unqualifiedQty) {
        this.unqualifiedQty = unqualifiedQty;
    }

    public BigDecimal getDestroyedQty() {
        return destroyedQty;
    }

    public void setDestroyedQty(BigDecimal destroyedQty) {
        this.destroyedQty = destroyedQty;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public String getDecisionDescription() {
        return decisionDescription;
    }

    public void setDecisionDescription(String decisionDescription) {
        this.decisionDescription = decisionDescription;
    }

    public String getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(String resultStatus) {
        this.resultStatus = resultStatus;
    }

    public Boolean getReinspection() {
        return reinspection;
    }

    public void setReinspection(Boolean reinspection) {
        this.reinspection = reinspection;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getInspectionPlanId() {
        return inspectionPlanId;
    }

    public void setInspectionPlanId(String inspectionPlanId) {
        this.inspectionPlanId = inspectionPlanId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getMoRoutingDId() {
        return moRoutingDId;
    }

    public void setMoRoutingDId(String moRoutingDId) {
        this.moRoutingDId = moRoutingDId;
    }

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public String getToMoRoutingDId() {
        return toMoRoutingDId;
    }

    public void setToMoRoutingDId(String toMoRoutingDId) {
        this.toMoRoutingDId = toMoRoutingDId;
    }

    public String getToOperationId() {
        return toOperationId;
    }

    public void setToOperationId(String toOperationId) {
        this.toOperationId = toOperationId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Boolean getDeductArrivedQty() {
        return deductArrivedQty;
    }

    public void setDeductArrivedQty(Boolean deductArrivedQty) {
        this.deductArrivedQty = deductArrivedQty;
    }

    public String getGenerateSource() {
        return generateSource;
    }

    public void setGenerateSource(String generateSource) {
        this.generateSource = generateSource;
    }

    public String getProcessinstanceid() {
        return processinstanceid;
    }

    public void setProcessinstanceid(String processinstanceid) {
        this.processinstanceid = processinstanceid;
    }

    public Integer getPrintcount() {
        return printcount;
    }

    public void setPrintcount(Integer printcount) {
        this.printcount = printcount;
    }

    public String getEfnetstatus() {
        return efnetstatus;
    }

    public void setEfnetstatus(String efnetstatus) {
        this.efnetstatus = efnetstatus;
    }

    public String getEfnetaction() {
        return efnetaction;
    }

    public void setEfnetaction(String efnetaction) {
        this.efnetaction = efnetaction;
    }

    public String getEfnetdoccategory() {
        return efnetdoccategory;
    }

    public void setEfnetdoccategory(String efnetdoccategory) {
        this.efnetdoccategory = efnetdoccategory;
    }

    public String getEfnetdocnumber() {
        return efnetdocnumber;
    }

    public void setEfnetdocnumber(String efnetdocnumber) {
        this.efnetdocnumber = efnetdocnumber;
    }

    public String getApprovestatus() {
        return approvestatus;
    }

    public void setApprovestatus(String approvestatus) {
        this.approvestatus = approvestatus;
    }

    public Date getApprovedate() {
        return approvedate;
    }

    public void setApprovedate(Date approvedate) {
        this.approvedate = approvedate;
    }

    public String getApproveby() {
        return approveby;
    }

    public void setApproveby(String approveby) {
        this.approveby = approveby;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getLastmodifieddate() {
        return lastmodifieddate;
    }

    public void setLastmodifieddate(Date lastmodifieddate) {
        this.lastmodifieddate = lastmodifieddate;
    }

    public Date getModifieddate() {
        return modifieddate;
    }

    public void setModifieddate(Date modifieddate) {
        this.modifieddate = modifieddate;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }

    public String getLastmodifiedby() {
        return lastmodifiedby;
    }

    public void setLastmodifiedby(String lastmodifiedby) {
        this.lastmodifiedby = lastmodifiedby;
    }

    public String getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }

    public BigDecimal getUdf001() {
        return udf001;
    }

    public void setUdf001(BigDecimal udf001) {
        this.udf001 = udf001;
    }

    public BigDecimal getUdf002() {
        return udf002;
    }

    public void setUdf002(BigDecimal udf002) {
        this.udf002 = udf002;
    }

    public BigDecimal getUdf003() {
        return udf003;
    }

    public void setUdf003(BigDecimal udf003) {
        this.udf003 = udf003;
    }

    public BigDecimal getUdf011() {
        return udf011;
    }

    public void setUdf011(BigDecimal udf011) {
        this.udf011 = udf011;
    }

    public BigDecimal getUdf012() {
        return udf012;
    }

    public void setUdf012(BigDecimal udf012) {
        this.udf012 = udf012;
    }

    public BigDecimal getUdf013() {
        return udf013;
    }

    public void setUdf013(BigDecimal udf013) {
        this.udf013 = udf013;
    }

    public String getUdf021() {
        return udf021;
    }

    public void setUdf021(String udf021) {
        this.udf021 = udf021;
    }

    public String getUdf022() {
        return udf022;
    }

    public void setUdf022(String udf022) {
        this.udf022 = udf022;
    }

    public String getUdf023() {
        return udf023;
    }

    public void setUdf023(String udf023) {
        this.udf023 = udf023;
    }

    public String getUdf024() {
        return udf024;
    }

    public void setUdf024(String udf024) {
        this.udf024 = udf024;
    }

    public String getUdf025() {
        return udf025;
    }

    public void setUdf025(String udf025) {
        this.udf025 = udf025;
    }

    public String getUdf026() {
        return udf026;
    }

    public void setUdf026(String udf026) {
        this.udf026 = udf026;
    }

    public Date getUdf041() {
        return udf041;
    }

    public void setUdf041(Date udf041) {
        this.udf041 = udf041;
    }

    public Date getUdf042() {
        return udf042;
    }

    public void setUdf042(Date udf042) {
        this.udf042 = udf042;
    }

    public String getUdf051() {
        return udf051;
    }

    public void setUdf051(String udf051) {
        this.udf051 = udf051;
    }

    public String getUdf052() {
        return udf052;
    }

    public void setUdf052(String udf052) {
        this.udf052 = udf052;
    }

    public String getUdf053() {
        return udf053;
    }

    public void setUdf053(String udf053) {
        this.udf053 = udf053;
    }

    public String getUdf054() {
        return udf054;
    }

    public void setUdf054(String udf054) {
        this.udf054 = udf054;
    }

    public String getOwnerOrgRtk() {
        return ownerOrgRtk;
    }

    public void setOwnerOrgRtk(String ownerOrgRtk) {
        this.ownerOrgRtk = ownerOrgRtk;
    }

    public String getOwnerOrgRoid() {
        return ownerOrgRoid;
    }

    public void setOwnerOrgRoid(String ownerOrgRoid) {
        this.ownerOrgRoid = ownerOrgRoid;
    }

    public byte[] getVersion() {
        return version;
    }

    public void setVersion(byte[] version) {
        this.version = version;
    }

    public String getAttachments() {
        return attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", poArrivalInspectionId=").append(poArrivalInspectionId);
        sb.append(", docNo=").append(docNo);
        sb.append(", docDate=").append(docDate);
        sb.append(", docId=").append(docId);
        sb.append(", ownerDept=").append(ownerDept);
        sb.append(", ownerEmp=").append(ownerEmp);
        sb.append(", category=").append(category);
        sb.append(", inspectionDate=").append(inspectionDate);
        sb.append(", qcTimes=").append(qcTimes);
        sb.append(", inspectionTimes=").append(inspectionTimes);
        sb.append(", itemId=").append(itemId);
        sb.append(", itemDescription=").append(itemDescription);
        sb.append(", itemFeatureId=").append(itemFeatureId);
        sb.append(", itemSpecification=").append(itemSpecification);
        sb.append(", itemLotId=").append(itemLotId);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", inspectionQty=").append(inspectionQty);
        sb.append(", inspectionUnitId=").append(inspectionUnitId);
        sb.append(", strictnessDegree=").append(strictnessDegree);
        sb.append(", inspectionDueDate=").append(inspectionDueDate);
        sb.append(", submitDeptId=").append(submitDeptId);
        sb.append(", submitEmpId=").append(submitEmpId);
        sb.append(", inventoryQty=").append(inventoryQty);
        sb.append(", secondQty=").append(secondQty);
        sb.append(", acceptableQty=").append(acceptableQty);
        sb.append(", unqualifiedQty=").append(unqualifiedQty);
        sb.append(", destroyedQty=").append(destroyedQty);
        sb.append(", decision=").append(decision);
        sb.append(", decisionDescription=").append(decisionDescription);
        sb.append(", resultStatus=").append(resultStatus);
        sb.append(", reinspection=").append(reinspection);
        sb.append(", remark=").append(remark);
        sb.append(", inspectionPlanId=").append(inspectionPlanId);
        sb.append(", companyId=").append(companyId);
        sb.append(", sourceId=").append(sourceId);
        sb.append(", moRoutingDId=").append(moRoutingDId);
        sb.append(", operationId=").append(operationId);
        sb.append(", toMoRoutingDId=").append(toMoRoutingDId);
        sb.append(", toOperationId=").append(toOperationId);
        sb.append(", projectId=").append(projectId);
        sb.append(", deductArrivedQty=").append(deductArrivedQty);
        sb.append(", generateSource=").append(generateSource);
        sb.append(", processinstanceid=").append(processinstanceid);
        sb.append(", printcount=").append(printcount);
        sb.append(", efnetstatus=").append(efnetstatus);
        sb.append(", efnetaction=").append(efnetaction);
        sb.append(", efnetdoccategory=").append(efnetdoccategory);
        sb.append(", efnetdocnumber=").append(efnetdocnumber);
        sb.append(", approvestatus=").append(approvestatus);
        sb.append(", approvedate=").append(approvedate);
        sb.append(", approveby=").append(approveby);
        sb.append(", createdate=").append(createdate);
        sb.append(", lastmodifieddate=").append(lastmodifieddate);
        sb.append(", modifieddate=").append(modifieddate);
        sb.append(", createby=").append(createby);
        sb.append(", lastmodifiedby=").append(lastmodifiedby);
        sb.append(", modifiedby=").append(modifiedby);
        sb.append(", udf001=").append(udf001);
        sb.append(", udf002=").append(udf002);
        sb.append(", udf003=").append(udf003);
        sb.append(", udf011=").append(udf011);
        sb.append(", udf012=").append(udf012);
        sb.append(", udf013=").append(udf013);
        sb.append(", udf021=").append(udf021);
        sb.append(", udf022=").append(udf022);
        sb.append(", udf023=").append(udf023);
        sb.append(", udf024=").append(udf024);
        sb.append(", udf025=").append(udf025);
        sb.append(", udf026=").append(udf026);
        sb.append(", udf041=").append(udf041);
        sb.append(", udf042=").append(udf042);
        sb.append(", udf051=").append(udf051);
        sb.append(", udf052=").append(udf052);
        sb.append(", udf053=").append(udf053);
        sb.append(", udf054=").append(udf054);
        sb.append(", ownerOrgRtk=").append(ownerOrgRtk);
        sb.append(", ownerOrgRoid=").append(ownerOrgRoid);
        sb.append(", version=").append(version);
        sb.append(", attachments=").append(attachments);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}