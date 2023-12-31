package com.tb.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PurchaseArrivalD implements Serializable {
    private String purchaseArrivalDId;

    private Integer sequencenumber;

    private String itemType;

    private String itemId;

    private String itemDescription;

    private String itemFeatureId;

    private String itemSpecification;

    private String packingQty;

    private BigDecimal priceQty;

    private BigDecimal inventoryQty;

    private BigDecimal secondQty;

    private BigDecimal packingQty1;

    private BigDecimal packingQty2;

    private BigDecimal packingQty3;

    private BigDecimal packingQty4;

    private BigDecimal price;

    private BigDecimal discountRate;

    private BigDecimal discountAmt;

    private BigDecimal discountedPrice;

    private BigDecimal standardPrice;

    private BigDecimal taxRate;

    private BigDecimal amountUnincludeTaxOc;

    private BigDecimal taxOc;

    private BigDecimal amountUnincludeTaxBc;

    private BigDecimal taxBc;

    private BigDecimal amount;

    private BigDecimal acceptedBusinessQty;

    private BigDecimal acceptedInventoryQty;

    private BigDecimal returnBusinessQty;

    private BigDecimal scrapBusinessQty;

    private Boolean overdueIndicator;

    private String inspectionStatus;

    private Integer pieces;

    private BigDecimal returnedBusinessQty;

    private BigDecimal receiptedBusinessQty;

    private String receiptClose;

    private BigDecimal scrapedBusinessQty;

    private String remark;

    private String purchaseType;

    private BigDecimal inspectedQty;

    private BigDecimal spReceiptBusinessQty;

    private BigDecimal spReceiptInventoryQty;

    private String manufacturer;

    private Boolean paymentPended;

    private BigDecimal qualifiedBusinessQty;

    private BigDecimal unqualifiedBusinessQty;

    private BigDecimal inDestroyedBusinessQty;

    private String priceUnitId;

    private String businessUnitId;

    private BigDecimal businessQty;

    private String packingModeId;

    private String packing1UnitId;

    private String packing2UnitId;

    private String packing3UnitId;

    private String packing4UnitId;

    private String taxId;

    private String warehouseId;

    private String operationId;

    private String binId;

    private String itemLotId;

    private String itemCertificationDId;

    private String moId;

    private BigDecimal settlementPriceQty;

    private BigDecimal settlementAmtUnTaxOc;

    private BigDecimal settlementTaxOc;

    private String purchaseOrderId;

    private String signType;

    private String returnReasonId;

    private BigDecimal suppIndemBusinessQty;

    private BigDecimal suppIndemPriceQty;

    private BigDecimal lossBusinessQty;

    private BigDecimal lossPriceQty;

    private BigDecimal shouldSettlePriceQty;

    private BigDecimal judgedQty;

    private Boolean spApproveFlag;

    private String projectId;

    private Boolean deductArrivedQty;

    private BigDecimal snCollectedQty;

    private String snCollectedStatus;

    private String wipDocno;

    private String budgetAdminUnitId;

    private String budgetGroupId;

    private String budgetItemId;

    private String budgetId;

    private String budgetDId;

    private String preBudgetId;

    private String preBudgetDId;

    private String innerOrderDocSdId;

    private String generateSource;

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

    private String approvestatus;

    private Date approvedate;

    private String approveby;

    private Date createdate;

    private Date lastmodifieddate;

    private Date modifieddate;

    private String createby;

    private String lastmodifiedby;

    private String modifiedby;

    private String referenceSourceIdRtk;

    private String referenceSourceIdRoid;

    private String sourceIdRtk;

    private String sourceIdRoid;

    private String sourceOrderRtk;

    private String sourceOrderRoid;

    private String synergySourceIdRtk;

    private String synergySourceIdRoid;

    private String purchaseArrivalId;

    private byte[] version;

    private static final long serialVersionUID = 1L;

    public String getPurchaseArrivalDId() {
        return purchaseArrivalDId;
    }

    public void setPurchaseArrivalDId(String purchaseArrivalDId) {
        this.purchaseArrivalDId = purchaseArrivalDId;
    }

    public Integer getSequencenumber() {
        return sequencenumber;
    }

    public void setSequencenumber(Integer sequencenumber) {
        this.sequencenumber = sequencenumber;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
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

    public String getPackingQty() {
        return packingQty;
    }

    public void setPackingQty(String packingQty) {
        this.packingQty = packingQty;
    }

    public BigDecimal getPriceQty() {
        return priceQty;
    }

    public void setPriceQty(BigDecimal priceQty) {
        this.priceQty = priceQty;
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

    public BigDecimal getPackingQty1() {
        return packingQty1;
    }

    public void setPackingQty1(BigDecimal packingQty1) {
        this.packingQty1 = packingQty1;
    }

    public BigDecimal getPackingQty2() {
        return packingQty2;
    }

    public void setPackingQty2(BigDecimal packingQty2) {
        this.packingQty2 = packingQty2;
    }

    public BigDecimal getPackingQty3() {
        return packingQty3;
    }

    public void setPackingQty3(BigDecimal packingQty3) {
        this.packingQty3 = packingQty3;
    }

    public BigDecimal getPackingQty4() {
        return packingQty4;
    }

    public void setPackingQty4(BigDecimal packingQty4) {
        this.packingQty4 = packingQty4;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(BigDecimal discountRate) {
        this.discountRate = discountRate;
    }

    public BigDecimal getDiscountAmt() {
        return discountAmt;
    }

    public void setDiscountAmt(BigDecimal discountAmt) {
        this.discountAmt = discountAmt;
    }

    public BigDecimal getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(BigDecimal discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public BigDecimal getStandardPrice() {
        return standardPrice;
    }

    public void setStandardPrice(BigDecimal standardPrice) {
        this.standardPrice = standardPrice;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public BigDecimal getAmountUnincludeTaxOc() {
        return amountUnincludeTaxOc;
    }

    public void setAmountUnincludeTaxOc(BigDecimal amountUnincludeTaxOc) {
        this.amountUnincludeTaxOc = amountUnincludeTaxOc;
    }

    public BigDecimal getTaxOc() {
        return taxOc;
    }

    public void setTaxOc(BigDecimal taxOc) {
        this.taxOc = taxOc;
    }

    public BigDecimal getAmountUnincludeTaxBc() {
        return amountUnincludeTaxBc;
    }

    public void setAmountUnincludeTaxBc(BigDecimal amountUnincludeTaxBc) {
        this.amountUnincludeTaxBc = amountUnincludeTaxBc;
    }

    public BigDecimal getTaxBc() {
        return taxBc;
    }

    public void setTaxBc(BigDecimal taxBc) {
        this.taxBc = taxBc;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAcceptedBusinessQty() {
        return acceptedBusinessQty;
    }

    public void setAcceptedBusinessQty(BigDecimal acceptedBusinessQty) {
        this.acceptedBusinessQty = acceptedBusinessQty;
    }

    public BigDecimal getAcceptedInventoryQty() {
        return acceptedInventoryQty;
    }

    public void setAcceptedInventoryQty(BigDecimal acceptedInventoryQty) {
        this.acceptedInventoryQty = acceptedInventoryQty;
    }

    public BigDecimal getReturnBusinessQty() {
        return returnBusinessQty;
    }

    public void setReturnBusinessQty(BigDecimal returnBusinessQty) {
        this.returnBusinessQty = returnBusinessQty;
    }

    public BigDecimal getScrapBusinessQty() {
        return scrapBusinessQty;
    }

    public void setScrapBusinessQty(BigDecimal scrapBusinessQty) {
        this.scrapBusinessQty = scrapBusinessQty;
    }

    public Boolean getOverdueIndicator() {
        return overdueIndicator;
    }

    public void setOverdueIndicator(Boolean overdueIndicator) {
        this.overdueIndicator = overdueIndicator;
    }

    public String getInspectionStatus() {
        return inspectionStatus;
    }

    public void setInspectionStatus(String inspectionStatus) {
        this.inspectionStatus = inspectionStatus;
    }

    public Integer getPieces() {
        return pieces;
    }

    public void setPieces(Integer pieces) {
        this.pieces = pieces;
    }

    public BigDecimal getReturnedBusinessQty() {
        return returnedBusinessQty;
    }

    public void setReturnedBusinessQty(BigDecimal returnedBusinessQty) {
        this.returnedBusinessQty = returnedBusinessQty;
    }

    public BigDecimal getReceiptedBusinessQty() {
        return receiptedBusinessQty;
    }

    public void setReceiptedBusinessQty(BigDecimal receiptedBusinessQty) {
        this.receiptedBusinessQty = receiptedBusinessQty;
    }

    public String getReceiptClose() {
        return receiptClose;
    }

    public void setReceiptClose(String receiptClose) {
        this.receiptClose = receiptClose;
    }

    public BigDecimal getScrapedBusinessQty() {
        return scrapedBusinessQty;
    }

    public void setScrapedBusinessQty(BigDecimal scrapedBusinessQty) {
        this.scrapedBusinessQty = scrapedBusinessQty;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }

    public BigDecimal getInspectedQty() {
        return inspectedQty;
    }

    public void setInspectedQty(BigDecimal inspectedQty) {
        this.inspectedQty = inspectedQty;
    }

    public BigDecimal getSpReceiptBusinessQty() {
        return spReceiptBusinessQty;
    }

    public void setSpReceiptBusinessQty(BigDecimal spReceiptBusinessQty) {
        this.spReceiptBusinessQty = spReceiptBusinessQty;
    }

    public BigDecimal getSpReceiptInventoryQty() {
        return spReceiptInventoryQty;
    }

    public void setSpReceiptInventoryQty(BigDecimal spReceiptInventoryQty) {
        this.spReceiptInventoryQty = spReceiptInventoryQty;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Boolean getPaymentPended() {
        return paymentPended;
    }

    public void setPaymentPended(Boolean paymentPended) {
        this.paymentPended = paymentPended;
    }

    public BigDecimal getQualifiedBusinessQty() {
        return qualifiedBusinessQty;
    }

    public void setQualifiedBusinessQty(BigDecimal qualifiedBusinessQty) {
        this.qualifiedBusinessQty = qualifiedBusinessQty;
    }

    public BigDecimal getUnqualifiedBusinessQty() {
        return unqualifiedBusinessQty;
    }

    public void setUnqualifiedBusinessQty(BigDecimal unqualifiedBusinessQty) {
        this.unqualifiedBusinessQty = unqualifiedBusinessQty;
    }

    public BigDecimal getInDestroyedBusinessQty() {
        return inDestroyedBusinessQty;
    }

    public void setInDestroyedBusinessQty(BigDecimal inDestroyedBusinessQty) {
        this.inDestroyedBusinessQty = inDestroyedBusinessQty;
    }

    public String getPriceUnitId() {
        return priceUnitId;
    }

    public void setPriceUnitId(String priceUnitId) {
        this.priceUnitId = priceUnitId;
    }

    public String getBusinessUnitId() {
        return businessUnitId;
    }

    public void setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
    }

    public BigDecimal getBusinessQty() {
        return businessQty;
    }

    public void setBusinessQty(BigDecimal businessQty) {
        this.businessQty = businessQty;
    }

    public String getPackingModeId() {
        return packingModeId;
    }

    public void setPackingModeId(String packingModeId) {
        this.packingModeId = packingModeId;
    }

    public String getPacking1UnitId() {
        return packing1UnitId;
    }

    public void setPacking1UnitId(String packing1UnitId) {
        this.packing1UnitId = packing1UnitId;
    }

    public String getPacking2UnitId() {
        return packing2UnitId;
    }

    public void setPacking2UnitId(String packing2UnitId) {
        this.packing2UnitId = packing2UnitId;
    }

    public String getPacking3UnitId() {
        return packing3UnitId;
    }

    public void setPacking3UnitId(String packing3UnitId) {
        this.packing3UnitId = packing3UnitId;
    }

    public String getPacking4UnitId() {
        return packing4UnitId;
    }

    public void setPacking4UnitId(String packing4UnitId) {
        this.packing4UnitId = packing4UnitId;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public String getBinId() {
        return binId;
    }

    public void setBinId(String binId) {
        this.binId = binId;
    }

    public String getItemLotId() {
        return itemLotId;
    }

    public void setItemLotId(String itemLotId) {
        this.itemLotId = itemLotId;
    }

    public String getItemCertificationDId() {
        return itemCertificationDId;
    }

    public void setItemCertificationDId(String itemCertificationDId) {
        this.itemCertificationDId = itemCertificationDId;
    }

    public String getMoId() {
        return moId;
    }

    public void setMoId(String moId) {
        this.moId = moId;
    }

    public BigDecimal getSettlementPriceQty() {
        return settlementPriceQty;
    }

    public void setSettlementPriceQty(BigDecimal settlementPriceQty) {
        this.settlementPriceQty = settlementPriceQty;
    }

    public BigDecimal getSettlementAmtUnTaxOc() {
        return settlementAmtUnTaxOc;
    }

    public void setSettlementAmtUnTaxOc(BigDecimal settlementAmtUnTaxOc) {
        this.settlementAmtUnTaxOc = settlementAmtUnTaxOc;
    }

    public BigDecimal getSettlementTaxOc() {
        return settlementTaxOc;
    }

    public void setSettlementTaxOc(BigDecimal settlementTaxOc) {
        this.settlementTaxOc = settlementTaxOc;
    }

    public String getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getReturnReasonId() {
        return returnReasonId;
    }

    public void setReturnReasonId(String returnReasonId) {
        this.returnReasonId = returnReasonId;
    }

    public BigDecimal getSuppIndemBusinessQty() {
        return suppIndemBusinessQty;
    }

    public void setSuppIndemBusinessQty(BigDecimal suppIndemBusinessQty) {
        this.suppIndemBusinessQty = suppIndemBusinessQty;
    }

    public BigDecimal getSuppIndemPriceQty() {
        return suppIndemPriceQty;
    }

    public void setSuppIndemPriceQty(BigDecimal suppIndemPriceQty) {
        this.suppIndemPriceQty = suppIndemPriceQty;
    }

    public BigDecimal getLossBusinessQty() {
        return lossBusinessQty;
    }

    public void setLossBusinessQty(BigDecimal lossBusinessQty) {
        this.lossBusinessQty = lossBusinessQty;
    }

    public BigDecimal getLossPriceQty() {
        return lossPriceQty;
    }

    public void setLossPriceQty(BigDecimal lossPriceQty) {
        this.lossPriceQty = lossPriceQty;
    }

    public BigDecimal getShouldSettlePriceQty() {
        return shouldSettlePriceQty;
    }

    public void setShouldSettlePriceQty(BigDecimal shouldSettlePriceQty) {
        this.shouldSettlePriceQty = shouldSettlePriceQty;
    }

    public BigDecimal getJudgedQty() {
        return judgedQty;
    }

    public void setJudgedQty(BigDecimal judgedQty) {
        this.judgedQty = judgedQty;
    }

    public Boolean getSpApproveFlag() {
        return spApproveFlag;
    }

    public void setSpApproveFlag(Boolean spApproveFlag) {
        this.spApproveFlag = spApproveFlag;
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

    public BigDecimal getSnCollectedQty() {
        return snCollectedQty;
    }

    public void setSnCollectedQty(BigDecimal snCollectedQty) {
        this.snCollectedQty = snCollectedQty;
    }

    public String getSnCollectedStatus() {
        return snCollectedStatus;
    }

    public void setSnCollectedStatus(String snCollectedStatus) {
        this.snCollectedStatus = snCollectedStatus;
    }

    public String getWipDocno() {
        return wipDocno;
    }

    public void setWipDocno(String wipDocno) {
        this.wipDocno = wipDocno;
    }

    public String getBudgetAdminUnitId() {
        return budgetAdminUnitId;
    }

    public void setBudgetAdminUnitId(String budgetAdminUnitId) {
        this.budgetAdminUnitId = budgetAdminUnitId;
    }

    public String getBudgetGroupId() {
        return budgetGroupId;
    }

    public void setBudgetGroupId(String budgetGroupId) {
        this.budgetGroupId = budgetGroupId;
    }

    public String getBudgetItemId() {
        return budgetItemId;
    }

    public void setBudgetItemId(String budgetItemId) {
        this.budgetItemId = budgetItemId;
    }

    public String getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }

    public String getBudgetDId() {
        return budgetDId;
    }

    public void setBudgetDId(String budgetDId) {
        this.budgetDId = budgetDId;
    }

    public String getPreBudgetId() {
        return preBudgetId;
    }

    public void setPreBudgetId(String preBudgetId) {
        this.preBudgetId = preBudgetId;
    }

    public String getPreBudgetDId() {
        return preBudgetDId;
    }

    public void setPreBudgetDId(String preBudgetDId) {
        this.preBudgetDId = preBudgetDId;
    }

    public String getInnerOrderDocSdId() {
        return innerOrderDocSdId;
    }

    public void setInnerOrderDocSdId(String innerOrderDocSdId) {
        this.innerOrderDocSdId = innerOrderDocSdId;
    }

    public String getGenerateSource() {
        return generateSource;
    }

    public void setGenerateSource(String generateSource) {
        this.generateSource = generateSource;
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

    public String getReferenceSourceIdRtk() {
        return referenceSourceIdRtk;
    }

    public void setReferenceSourceIdRtk(String referenceSourceIdRtk) {
        this.referenceSourceIdRtk = referenceSourceIdRtk;
    }

    public String getReferenceSourceIdRoid() {
        return referenceSourceIdRoid;
    }

    public void setReferenceSourceIdRoid(String referenceSourceIdRoid) {
        this.referenceSourceIdRoid = referenceSourceIdRoid;
    }

    public String getSourceIdRtk() {
        return sourceIdRtk;
    }

    public void setSourceIdRtk(String sourceIdRtk) {
        this.sourceIdRtk = sourceIdRtk;
    }

    public String getSourceIdRoid() {
        return sourceIdRoid;
    }

    public void setSourceIdRoid(String sourceIdRoid) {
        this.sourceIdRoid = sourceIdRoid;
    }

    public String getSourceOrderRtk() {
        return sourceOrderRtk;
    }

    public void setSourceOrderRtk(String sourceOrderRtk) {
        this.sourceOrderRtk = sourceOrderRtk;
    }

    public String getSourceOrderRoid() {
        return sourceOrderRoid;
    }

    public void setSourceOrderRoid(String sourceOrderRoid) {
        this.sourceOrderRoid = sourceOrderRoid;
    }

    public String getSynergySourceIdRtk() {
        return synergySourceIdRtk;
    }

    public void setSynergySourceIdRtk(String synergySourceIdRtk) {
        this.synergySourceIdRtk = synergySourceIdRtk;
    }

    public String getSynergySourceIdRoid() {
        return synergySourceIdRoid;
    }

    public void setSynergySourceIdRoid(String synergySourceIdRoid) {
        this.synergySourceIdRoid = synergySourceIdRoid;
    }

    public String getPurchaseArrivalId() {
        return purchaseArrivalId;
    }

    public void setPurchaseArrivalId(String purchaseArrivalId) {
        this.purchaseArrivalId = purchaseArrivalId;
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
        sb.append(", purchaseArrivalDId=").append(purchaseArrivalDId);
        sb.append(", sequencenumber=").append(sequencenumber);
        sb.append(", itemType=").append(itemType);
        sb.append(", itemId=").append(itemId);
        sb.append(", itemDescription=").append(itemDescription);
        sb.append(", itemFeatureId=").append(itemFeatureId);
        sb.append(", itemSpecification=").append(itemSpecification);
        sb.append(", packingQty=").append(packingQty);
        sb.append(", priceQty=").append(priceQty);
        sb.append(", inventoryQty=").append(inventoryQty);
        sb.append(", secondQty=").append(secondQty);
        sb.append(", packingQty1=").append(packingQty1);
        sb.append(", packingQty2=").append(packingQty2);
        sb.append(", packingQty3=").append(packingQty3);
        sb.append(", packingQty4=").append(packingQty4);
        sb.append(", price=").append(price);
        sb.append(", discountRate=").append(discountRate);
        sb.append(", discountAmt=").append(discountAmt);
        sb.append(", discountedPrice=").append(discountedPrice);
        sb.append(", standardPrice=").append(standardPrice);
        sb.append(", taxRate=").append(taxRate);
        sb.append(", amountUnincludeTaxOc=").append(amountUnincludeTaxOc);
        sb.append(", taxOc=").append(taxOc);
        sb.append(", amountUnincludeTaxBc=").append(amountUnincludeTaxBc);
        sb.append(", taxBc=").append(taxBc);
        sb.append(", amount=").append(amount);
        sb.append(", acceptedBusinessQty=").append(acceptedBusinessQty);
        sb.append(", acceptedInventoryQty=").append(acceptedInventoryQty);
        sb.append(", returnBusinessQty=").append(returnBusinessQty);
        sb.append(", scrapBusinessQty=").append(scrapBusinessQty);
        sb.append(", overdueIndicator=").append(overdueIndicator);
        sb.append(", inspectionStatus=").append(inspectionStatus);
        sb.append(", pieces=").append(pieces);
        sb.append(", returnedBusinessQty=").append(returnedBusinessQty);
        sb.append(", receiptedBusinessQty=").append(receiptedBusinessQty);
        sb.append(", receiptClose=").append(receiptClose);
        sb.append(", scrapedBusinessQty=").append(scrapedBusinessQty);
        sb.append(", remark=").append(remark);
        sb.append(", purchaseType=").append(purchaseType);
        sb.append(", inspectedQty=").append(inspectedQty);
        sb.append(", spReceiptBusinessQty=").append(spReceiptBusinessQty);
        sb.append(", spReceiptInventoryQty=").append(spReceiptInventoryQty);
        sb.append(", manufacturer=").append(manufacturer);
        sb.append(", paymentPended=").append(paymentPended);
        sb.append(", qualifiedBusinessQty=").append(qualifiedBusinessQty);
        sb.append(", unqualifiedBusinessQty=").append(unqualifiedBusinessQty);
        sb.append(", inDestroyedBusinessQty=").append(inDestroyedBusinessQty);
        sb.append(", priceUnitId=").append(priceUnitId);
        sb.append(", businessUnitId=").append(businessUnitId);
        sb.append(", businessQty=").append(businessQty);
        sb.append(", packingModeId=").append(packingModeId);
        sb.append(", packing1UnitId=").append(packing1UnitId);
        sb.append(", packing2UnitId=").append(packing2UnitId);
        sb.append(", packing3UnitId=").append(packing3UnitId);
        sb.append(", packing4UnitId=").append(packing4UnitId);
        sb.append(", taxId=").append(taxId);
        sb.append(", warehouseId=").append(warehouseId);
        sb.append(", operationId=").append(operationId);
        sb.append(", binId=").append(binId);
        sb.append(", itemLotId=").append(itemLotId);
        sb.append(", itemCertificationDId=").append(itemCertificationDId);
        sb.append(", moId=").append(moId);
        sb.append(", settlementPriceQty=").append(settlementPriceQty);
        sb.append(", settlementAmtUnTaxOc=").append(settlementAmtUnTaxOc);
        sb.append(", settlementTaxOc=").append(settlementTaxOc);
        sb.append(", purchaseOrderId=").append(purchaseOrderId);
        sb.append(", signType=").append(signType);
        sb.append(", returnReasonId=").append(returnReasonId);
        sb.append(", suppIndemBusinessQty=").append(suppIndemBusinessQty);
        sb.append(", suppIndemPriceQty=").append(suppIndemPriceQty);
        sb.append(", lossBusinessQty=").append(lossBusinessQty);
        sb.append(", lossPriceQty=").append(lossPriceQty);
        sb.append(", shouldSettlePriceQty=").append(shouldSettlePriceQty);
        sb.append(", judgedQty=").append(judgedQty);
        sb.append(", spApproveFlag=").append(spApproveFlag);
        sb.append(", projectId=").append(projectId);
        sb.append(", deductArrivedQty=").append(deductArrivedQty);
        sb.append(", snCollectedQty=").append(snCollectedQty);
        sb.append(", snCollectedStatus=").append(snCollectedStatus);
        sb.append(", wipDocno=").append(wipDocno);
        sb.append(", budgetAdminUnitId=").append(budgetAdminUnitId);
        sb.append(", budgetGroupId=").append(budgetGroupId);
        sb.append(", budgetItemId=").append(budgetItemId);
        sb.append(", budgetId=").append(budgetId);
        sb.append(", budgetDId=").append(budgetDId);
        sb.append(", preBudgetId=").append(preBudgetId);
        sb.append(", preBudgetDId=").append(preBudgetDId);
        sb.append(", innerOrderDocSdId=").append(innerOrderDocSdId);
        sb.append(", generateSource=").append(generateSource);
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
        sb.append(", approvestatus=").append(approvestatus);
        sb.append(", approvedate=").append(approvedate);
        sb.append(", approveby=").append(approveby);
        sb.append(", createdate=").append(createdate);
        sb.append(", lastmodifieddate=").append(lastmodifieddate);
        sb.append(", modifieddate=").append(modifieddate);
        sb.append(", createby=").append(createby);
        sb.append(", lastmodifiedby=").append(lastmodifiedby);
        sb.append(", modifiedby=").append(modifiedby);
        sb.append(", referenceSourceIdRtk=").append(referenceSourceIdRtk);
        sb.append(", referenceSourceIdRoid=").append(referenceSourceIdRoid);
        sb.append(", sourceIdRtk=").append(sourceIdRtk);
        sb.append(", sourceIdRoid=").append(sourceIdRoid);
        sb.append(", sourceOrderRtk=").append(sourceOrderRtk);
        sb.append(", sourceOrderRoid=").append(sourceOrderRoid);
        sb.append(", synergySourceIdRtk=").append(synergySourceIdRtk);
        sb.append(", synergySourceIdRoid=").append(synergySourceIdRoid);
        sb.append(", purchaseArrivalId=").append(purchaseArrivalId);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}