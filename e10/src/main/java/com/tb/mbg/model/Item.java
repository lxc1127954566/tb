package com.tb.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Item implements Serializable {
    private String itemBusinessId;

    private String ownerDept;

    private String ownerEmp;

    private Boolean inventoryManagement;

    private String itemCode;

    private String itemName;

    private String remark;

    private Boolean changeItemSpec;

    private String shortcut;

    private String itemSpecification;

    private String lotControl;

    private Integer lotExpireDay;

    private Integer lotWaitingDay;

    private Integer lotReinspectionDay;

    private String lotFailureControl;

    private String unitMode;

    private String inventoryCheckBy;

    private Boolean itemSnManagement;

    private String snEntryMode;

    private Boolean itemFeatureControl;

    private Boolean packingUnit;

    private String status;

    private String eItem;

    private String eCode;

    private String featureGenerateMode;

    private Boolean ckd;

    private String itemPicture;

    private Boolean jointProductControl;

    private Boolean needCertification;

    private String lotNoRuleId;

    private String snNoRuleId;

    private String featureGroupId;

    private String secondUnitId;

    private String stockUnitId;

    private String lifecycleId;

    private String logisticUnitId;

    private Boolean isweight;

    private Boolean weightPrice;

    private String weightPlu;

    private String weightUnitId;

    private String source;

    private String plmDatakey;

    private String itemPic;

    private String itemDesc;

    private String drawingNo;

    private String drawingNoFrom;

    private BigDecimal itemNetWeight;

    private String netWeightUnitId;

    private Boolean serviceItem;

    private Boolean asset;

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

    private String processinstanceid;

    private String approvestatus;

    private Date approvedate;

    private String approveby;

    private String ownerOrgRtk;

    private String ownerOrgRoid;

    private String itemDesc2;

    private String attachments;

    private byte[] version;

    private static final long serialVersionUID = 1L;

    public String getItemBusinessId() {
        return itemBusinessId;
    }

    public void setItemBusinessId(String itemBusinessId) {
        this.itemBusinessId = itemBusinessId;
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

    public Boolean getInventoryManagement() {
        return inventoryManagement;
    }

    public void setInventoryManagement(Boolean inventoryManagement) {
        this.inventoryManagement = inventoryManagement;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Boolean getChangeItemSpec() {
        return changeItemSpec;
    }

    public void setChangeItemSpec(Boolean changeItemSpec) {
        this.changeItemSpec = changeItemSpec;
    }

    public String getShortcut() {
        return shortcut;
    }

    public void setShortcut(String shortcut) {
        this.shortcut = shortcut;
    }

    public String getItemSpecification() {
        return itemSpecification;
    }

    public void setItemSpecification(String itemSpecification) {
        this.itemSpecification = itemSpecification;
    }

    public String getLotControl() {
        return lotControl;
    }

    public void setLotControl(String lotControl) {
        this.lotControl = lotControl;
    }

    public Integer getLotExpireDay() {
        return lotExpireDay;
    }

    public void setLotExpireDay(Integer lotExpireDay) {
        this.lotExpireDay = lotExpireDay;
    }

    public Integer getLotWaitingDay() {
        return lotWaitingDay;
    }

    public void setLotWaitingDay(Integer lotWaitingDay) {
        this.lotWaitingDay = lotWaitingDay;
    }

    public Integer getLotReinspectionDay() {
        return lotReinspectionDay;
    }

    public void setLotReinspectionDay(Integer lotReinspectionDay) {
        this.lotReinspectionDay = lotReinspectionDay;
    }

    public String getLotFailureControl() {
        return lotFailureControl;
    }

    public void setLotFailureControl(String lotFailureControl) {
        this.lotFailureControl = lotFailureControl;
    }

    public String getUnitMode() {
        return unitMode;
    }

    public void setUnitMode(String unitMode) {
        this.unitMode = unitMode;
    }

    public String getInventoryCheckBy() {
        return inventoryCheckBy;
    }

    public void setInventoryCheckBy(String inventoryCheckBy) {
        this.inventoryCheckBy = inventoryCheckBy;
    }

    public Boolean getItemSnManagement() {
        return itemSnManagement;
    }

    public void setItemSnManagement(Boolean itemSnManagement) {
        this.itemSnManagement = itemSnManagement;
    }

    public String getSnEntryMode() {
        return snEntryMode;
    }

    public void setSnEntryMode(String snEntryMode) {
        this.snEntryMode = snEntryMode;
    }

    public Boolean getItemFeatureControl() {
        return itemFeatureControl;
    }

    public void setItemFeatureControl(Boolean itemFeatureControl) {
        this.itemFeatureControl = itemFeatureControl;
    }

    public Boolean getPackingUnit() {
        return packingUnit;
    }

    public void setPackingUnit(Boolean packingUnit) {
        this.packingUnit = packingUnit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String geteItem() {
        return eItem;
    }

    public void seteItem(String eItem) {
        this.eItem = eItem;
    }

    public String geteCode() {
        return eCode;
    }

    public void seteCode(String eCode) {
        this.eCode = eCode;
    }

    public String getFeatureGenerateMode() {
        return featureGenerateMode;
    }

    public void setFeatureGenerateMode(String featureGenerateMode) {
        this.featureGenerateMode = featureGenerateMode;
    }

    public Boolean getCkd() {
        return ckd;
    }

    public void setCkd(Boolean ckd) {
        this.ckd = ckd;
    }

    public String getItemPicture() {
        return itemPicture;
    }

    public void setItemPicture(String itemPicture) {
        this.itemPicture = itemPicture;
    }

    public Boolean getJointProductControl() {
        return jointProductControl;
    }

    public void setJointProductControl(Boolean jointProductControl) {
        this.jointProductControl = jointProductControl;
    }

    public Boolean getNeedCertification() {
        return needCertification;
    }

    public void setNeedCertification(Boolean needCertification) {
        this.needCertification = needCertification;
    }

    public String getLotNoRuleId() {
        return lotNoRuleId;
    }

    public void setLotNoRuleId(String lotNoRuleId) {
        this.lotNoRuleId = lotNoRuleId;
    }

    public String getSnNoRuleId() {
        return snNoRuleId;
    }

    public void setSnNoRuleId(String snNoRuleId) {
        this.snNoRuleId = snNoRuleId;
    }

    public String getFeatureGroupId() {
        return featureGroupId;
    }

    public void setFeatureGroupId(String featureGroupId) {
        this.featureGroupId = featureGroupId;
    }

    public String getSecondUnitId() {
        return secondUnitId;
    }

    public void setSecondUnitId(String secondUnitId) {
        this.secondUnitId = secondUnitId;
    }

    public String getStockUnitId() {
        return stockUnitId;
    }

    public void setStockUnitId(String stockUnitId) {
        this.stockUnitId = stockUnitId;
    }

    public String getLifecycleId() {
        return lifecycleId;
    }

    public void setLifecycleId(String lifecycleId) {
        this.lifecycleId = lifecycleId;
    }

    public String getLogisticUnitId() {
        return logisticUnitId;
    }

    public void setLogisticUnitId(String logisticUnitId) {
        this.logisticUnitId = logisticUnitId;
    }

    public Boolean getIsweight() {
        return isweight;
    }

    public void setIsweight(Boolean isweight) {
        this.isweight = isweight;
    }

    public Boolean getWeightPrice() {
        return weightPrice;
    }

    public void setWeightPrice(Boolean weightPrice) {
        this.weightPrice = weightPrice;
    }

    public String getWeightPlu() {
        return weightPlu;
    }

    public void setWeightPlu(String weightPlu) {
        this.weightPlu = weightPlu;
    }

    public String getWeightUnitId() {
        return weightUnitId;
    }

    public void setWeightUnitId(String weightUnitId) {
        this.weightUnitId = weightUnitId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getPlmDatakey() {
        return plmDatakey;
    }

    public void setPlmDatakey(String plmDatakey) {
        this.plmDatakey = plmDatakey;
    }

    public String getItemPic() {
        return itemPic;
    }

    public void setItemPic(String itemPic) {
        this.itemPic = itemPic;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getDrawingNo() {
        return drawingNo;
    }

    public void setDrawingNo(String drawingNo) {
        this.drawingNo = drawingNo;
    }

    public String getDrawingNoFrom() {
        return drawingNoFrom;
    }

    public void setDrawingNoFrom(String drawingNoFrom) {
        this.drawingNoFrom = drawingNoFrom;
    }

    public BigDecimal getItemNetWeight() {
        return itemNetWeight;
    }

    public void setItemNetWeight(BigDecimal itemNetWeight) {
        this.itemNetWeight = itemNetWeight;
    }

    public String getNetWeightUnitId() {
        return netWeightUnitId;
    }

    public void setNetWeightUnitId(String netWeightUnitId) {
        this.netWeightUnitId = netWeightUnitId;
    }

    public Boolean getServiceItem() {
        return serviceItem;
    }

    public void setServiceItem(Boolean serviceItem) {
        this.serviceItem = serviceItem;
    }

    public Boolean getAsset() {
        return asset;
    }

    public void setAsset(Boolean asset) {
        this.asset = asset;
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

    public String getProcessinstanceid() {
        return processinstanceid;
    }

    public void setProcessinstanceid(String processinstanceid) {
        this.processinstanceid = processinstanceid;
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

    public String getItemDesc2() {
        return itemDesc2;
    }

    public void setItemDesc2(String itemDesc2) {
        this.itemDesc2 = itemDesc2;
    }

    public String getAttachments() {
        return attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments;
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
        sb.append(", itemBusinessId=").append(itemBusinessId);
        sb.append(", ownerDept=").append(ownerDept);
        sb.append(", ownerEmp=").append(ownerEmp);
        sb.append(", inventoryManagement=").append(inventoryManagement);
        sb.append(", itemCode=").append(itemCode);
        sb.append(", itemName=").append(itemName);
        sb.append(", remark=").append(remark);
        sb.append(", changeItemSpec=").append(changeItemSpec);
        sb.append(", shortcut=").append(shortcut);
        sb.append(", itemSpecification=").append(itemSpecification);
        sb.append(", lotControl=").append(lotControl);
        sb.append(", lotExpireDay=").append(lotExpireDay);
        sb.append(", lotWaitingDay=").append(lotWaitingDay);
        sb.append(", lotReinspectionDay=").append(lotReinspectionDay);
        sb.append(", lotFailureControl=").append(lotFailureControl);
        sb.append(", unitMode=").append(unitMode);
        sb.append(", inventoryCheckBy=").append(inventoryCheckBy);
        sb.append(", itemSnManagement=").append(itemSnManagement);
        sb.append(", snEntryMode=").append(snEntryMode);
        sb.append(", itemFeatureControl=").append(itemFeatureControl);
        sb.append(", packingUnit=").append(packingUnit);
        sb.append(", status=").append(status);
        sb.append(", eItem=").append(eItem);
        sb.append(", eCode=").append(eCode);
        sb.append(", featureGenerateMode=").append(featureGenerateMode);
        sb.append(", ckd=").append(ckd);
        sb.append(", itemPicture=").append(itemPicture);
        sb.append(", jointProductControl=").append(jointProductControl);
        sb.append(", needCertification=").append(needCertification);
        sb.append(", lotNoRuleId=").append(lotNoRuleId);
        sb.append(", snNoRuleId=").append(snNoRuleId);
        sb.append(", featureGroupId=").append(featureGroupId);
        sb.append(", secondUnitId=").append(secondUnitId);
        sb.append(", stockUnitId=").append(stockUnitId);
        sb.append(", lifecycleId=").append(lifecycleId);
        sb.append(", logisticUnitId=").append(logisticUnitId);
        sb.append(", isweight=").append(isweight);
        sb.append(", weightPrice=").append(weightPrice);
        sb.append(", weightPlu=").append(weightPlu);
        sb.append(", weightUnitId=").append(weightUnitId);
        sb.append(", source=").append(source);
        sb.append(", plmDatakey=").append(plmDatakey);
        sb.append(", itemPic=").append(itemPic);
        sb.append(", itemDesc=").append(itemDesc);
        sb.append(", drawingNo=").append(drawingNo);
        sb.append(", drawingNoFrom=").append(drawingNoFrom);
        sb.append(", itemNetWeight=").append(itemNetWeight);
        sb.append(", netWeightUnitId=").append(netWeightUnitId);
        sb.append(", serviceItem=").append(serviceItem);
        sb.append(", asset=").append(asset);
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
        sb.append(", processinstanceid=").append(processinstanceid);
        sb.append(", approvestatus=").append(approvestatus);
        sb.append(", approvedate=").append(approvedate);
        sb.append(", approveby=").append(approveby);
        sb.append(", ownerOrgRtk=").append(ownerOrgRtk);
        sb.append(", ownerOrgRoid=").append(ownerOrgRoid);
        sb.append(", itemDesc2=").append(itemDesc2);
        sb.append(", attachments=").append(attachments);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}