package com.tb.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class EcnD implements Serializable {
    private String ecnDId;

    private Integer sequencenumber;

    private String versionTimes;

    private BigDecimal standardBatchQty;

    private BigDecimal yieldRate;

    private Boolean secretItem;

    private String secretLevel;

    private String reasonId;

    private String originalVersionTimes;

    private BigDecimal originalStandardBatchQty;

    private BigDecimal originalYieldRate;

    private Boolean originalSecretItem;

    private String originalSecretLevel;

    private String remark;

    private String originalRemark;

    private String changeType;

    private String parentItemId;

    private String parentItemFeatureId;

    private String originalParentItemId;

    private String originalOrderEcnId;

    private String plantId;

    private String referencePlantId;

    private String originalReferencePlantId;

    private String oldPlmDatakey;

    private String newPlmDatakey;

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

    private Date createdate;

    private Date lastmodifieddate;

    private Date modifieddate;

    private String createby;

    private String lastmodifiedby;

    private String modifiedby;

    private String approvestatus;

    private Date approvedate;

    private String approveby;

    private String ecnId;

    private byte[] version;

    private static final long serialVersionUID = 1L;

    public String getEcnDId() {
        return ecnDId;
    }

    public void setEcnDId(String ecnDId) {
        this.ecnDId = ecnDId;
    }

    public Integer getSequencenumber() {
        return sequencenumber;
    }

    public void setSequencenumber(Integer sequencenumber) {
        this.sequencenumber = sequencenumber;
    }

    public String getVersionTimes() {
        return versionTimes;
    }

    public void setVersionTimes(String versionTimes) {
        this.versionTimes = versionTimes;
    }

    public BigDecimal getStandardBatchQty() {
        return standardBatchQty;
    }

    public void setStandardBatchQty(BigDecimal standardBatchQty) {
        this.standardBatchQty = standardBatchQty;
    }

    public BigDecimal getYieldRate() {
        return yieldRate;
    }

    public void setYieldRate(BigDecimal yieldRate) {
        this.yieldRate = yieldRate;
    }

    public Boolean getSecretItem() {
        return secretItem;
    }

    public void setSecretItem(Boolean secretItem) {
        this.secretItem = secretItem;
    }

    public String getSecretLevel() {
        return secretLevel;
    }

    public void setSecretLevel(String secretLevel) {
        this.secretLevel = secretLevel;
    }

    public String getReasonId() {
        return reasonId;
    }

    public void setReasonId(String reasonId) {
        this.reasonId = reasonId;
    }

    public String getOriginalVersionTimes() {
        return originalVersionTimes;
    }

    public void setOriginalVersionTimes(String originalVersionTimes) {
        this.originalVersionTimes = originalVersionTimes;
    }

    public BigDecimal getOriginalStandardBatchQty() {
        return originalStandardBatchQty;
    }

    public void setOriginalStandardBatchQty(BigDecimal originalStandardBatchQty) {
        this.originalStandardBatchQty = originalStandardBatchQty;
    }

    public BigDecimal getOriginalYieldRate() {
        return originalYieldRate;
    }

    public void setOriginalYieldRate(BigDecimal originalYieldRate) {
        this.originalYieldRate = originalYieldRate;
    }

    public Boolean getOriginalSecretItem() {
        return originalSecretItem;
    }

    public void setOriginalSecretItem(Boolean originalSecretItem) {
        this.originalSecretItem = originalSecretItem;
    }

    public String getOriginalSecretLevel() {
        return originalSecretLevel;
    }

    public void setOriginalSecretLevel(String originalSecretLevel) {
        this.originalSecretLevel = originalSecretLevel;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOriginalRemark() {
        return originalRemark;
    }

    public void setOriginalRemark(String originalRemark) {
        this.originalRemark = originalRemark;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public String getParentItemId() {
        return parentItemId;
    }

    public void setParentItemId(String parentItemId) {
        this.parentItemId = parentItemId;
    }

    public String getParentItemFeatureId() {
        return parentItemFeatureId;
    }

    public void setParentItemFeatureId(String parentItemFeatureId) {
        this.parentItemFeatureId = parentItemFeatureId;
    }

    public String getOriginalParentItemId() {
        return originalParentItemId;
    }

    public void setOriginalParentItemId(String originalParentItemId) {
        this.originalParentItemId = originalParentItemId;
    }

    public String getOriginalOrderEcnId() {
        return originalOrderEcnId;
    }

    public void setOriginalOrderEcnId(String originalOrderEcnId) {
        this.originalOrderEcnId = originalOrderEcnId;
    }

    public String getPlantId() {
        return plantId;
    }

    public void setPlantId(String plantId) {
        this.plantId = plantId;
    }

    public String getReferencePlantId() {
        return referencePlantId;
    }

    public void setReferencePlantId(String referencePlantId) {
        this.referencePlantId = referencePlantId;
    }

    public String getOriginalReferencePlantId() {
        return originalReferencePlantId;
    }

    public void setOriginalReferencePlantId(String originalReferencePlantId) {
        this.originalReferencePlantId = originalReferencePlantId;
    }

    public String getOldPlmDatakey() {
        return oldPlmDatakey;
    }

    public void setOldPlmDatakey(String oldPlmDatakey) {
        this.oldPlmDatakey = oldPlmDatakey;
    }

    public String getNewPlmDatakey() {
        return newPlmDatakey;
    }

    public void setNewPlmDatakey(String newPlmDatakey) {
        this.newPlmDatakey = newPlmDatakey;
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

    public String getEcnId() {
        return ecnId;
    }

    public void setEcnId(String ecnId) {
        this.ecnId = ecnId;
    }

    public byte[] getVersion() {
        return version;
    }

    public void setVersion(byte[] version) {
        this.version = version;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ecnDId=").append(ecnDId);
        sb.append(", sequencenumber=").append(sequencenumber);
        sb.append(", versionTimes=").append(versionTimes);
        sb.append(", standardBatchQty=").append(standardBatchQty);
        sb.append(", yieldRate=").append(yieldRate);
        sb.append(", secretItem=").append(secretItem);
        sb.append(", secretLevel=").append(secretLevel);
        sb.append(", reasonId=").append(reasonId);
        sb.append(", originalVersionTimes=").append(originalVersionTimes);
        sb.append(", originalStandardBatchQty=").append(originalStandardBatchQty);
        sb.append(", originalYieldRate=").append(originalYieldRate);
        sb.append(", originalSecretItem=").append(originalSecretItem);
        sb.append(", originalSecretLevel=").append(originalSecretLevel);
        sb.append(", remark=").append(remark);
        sb.append(", originalRemark=").append(originalRemark);
        sb.append(", changeType=").append(changeType);
        sb.append(", parentItemId=").append(parentItemId);
        sb.append(", parentItemFeatureId=").append(parentItemFeatureId);
        sb.append(", originalParentItemId=").append(originalParentItemId);
        sb.append(", originalOrderEcnId=").append(originalOrderEcnId);
        sb.append(", plantId=").append(plantId);
        sb.append(", referencePlantId=").append(referencePlantId);
        sb.append(", originalReferencePlantId=").append(originalReferencePlantId);
        sb.append(", oldPlmDatakey=").append(oldPlmDatakey);
        sb.append(", newPlmDatakey=").append(newPlmDatakey);
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
        sb.append(", createdate=").append(createdate);
        sb.append(", lastmodifieddate=").append(lastmodifieddate);
        sb.append(", modifieddate=").append(modifieddate);
        sb.append(", createby=").append(createby);
        sb.append(", lastmodifiedby=").append(lastmodifiedby);
        sb.append(", modifiedby=").append(modifiedby);
        sb.append(", approvestatus=").append(approvestatus);
        sb.append(", approvedate=").append(approvedate);
        sb.append(", approveby=").append(approveby);
        sb.append(", ecnId=").append(ecnId);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}