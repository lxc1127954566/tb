package com.tb.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class PurchaseArrival implements Serializable {
    private String purchaseArrivalId;

    private String docNo;

    private Date docDate;

    private String docId;

    private String ownerDept;

    private String ownerEmp;

    private String category;

    private Date arrivalDate;

    private String supplierFullName;

    private String supplierOrderNo;

    private BigDecimal exchangeRate;

    private Boolean taxIncluded;

    private Integer pieces;

    private String remark;

    private String supplierContactName;

    private String supplierAddrName;

    private String invoiceContactName;

    private String invoiceAddrName;

    private BigDecimal amountUnincludeTaxOc;

    private BigDecimal taxOc;

    private BigDecimal amountUnincludeTaxBc;

    private BigDecimal taxBc;

    private String sourceType;

    private String taxInvoiceNo;

    private Boolean deductibleIndicator;

    private String taxInvoiceCategoryId;

    private String supplierAddrId;

    private String invoiceContactId;

    private String invoiceAddrId;

    private String receiptEmployeeId;

    private String plantId;

    private String currencyId;

    private String paymentTermId;

    private String deliveryTermId;

    private String supplierId;

    private String supplierContactId;

    private String invoiceSupplierId;

    private String invoiceCompanyId;

    private String synergyId;

    private String synergyDId;

    private Boolean directSettlementIndicator;

    private Boolean directInvoicingIndicator;

    private Boolean offsetDepositIndicator;

    private String receiptedStatus;

    private Boolean settlementIndicator;

    private Date signDate;

    private String taxId;

    private String wipNo;

    private Boolean wipE10Inspection;

    private Boolean allSynergy;

    private String groupSynergyDId;

    private String generateNo;

    private Boolean generateStatus;

    private Integer docSequence;

    private String sourceSupplierId;

    private String generateSource;

    private String deliveryDocNo;

    private String processinstanceid;

    private String efnetstatus;

    private String efnetaction;

    private String efnetdoccategory;

    private String efnetdocnumber;

    private Integer printcount;

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

    private String ownerOrgRtk;

    private String ownerOrgRoid;

    private String sourceIdRtk;

    private String sourceIdRoid;

    private String receiveOwnerOrgRtk;

    private String receiveOwnerOrgRoid;

    private String groupSynergyIdRtk;

    private String groupSynergyIdRoid;

    private byte[] version;

    private String attachments;

    private static final long serialVersionUID = 1L;

    public String getPurchaseArrivalId() {
        return purchaseArrivalId;
    }

    public void setPurchaseArrivalId(String purchaseArrivalId) {
        this.purchaseArrivalId = purchaseArrivalId;
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

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getSupplierFullName() {
        return supplierFullName;
    }

    public void setSupplierFullName(String supplierFullName) {
        this.supplierFullName = supplierFullName;
    }

    public String getSupplierOrderNo() {
        return supplierOrderNo;
    }

    public void setSupplierOrderNo(String supplierOrderNo) {
        this.supplierOrderNo = supplierOrderNo;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Boolean getTaxIncluded() {
        return taxIncluded;
    }

    public void setTaxIncluded(Boolean taxIncluded) {
        this.taxIncluded = taxIncluded;
    }

    public Integer getPieces() {
        return pieces;
    }

    public void setPieces(Integer pieces) {
        this.pieces = pieces;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSupplierContactName() {
        return supplierContactName;
    }

    public void setSupplierContactName(String supplierContactName) {
        this.supplierContactName = supplierContactName;
    }

    public String getSupplierAddrName() {
        return supplierAddrName;
    }

    public void setSupplierAddrName(String supplierAddrName) {
        this.supplierAddrName = supplierAddrName;
    }

    public String getInvoiceContactName() {
        return invoiceContactName;
    }

    public void setInvoiceContactName(String invoiceContactName) {
        this.invoiceContactName = invoiceContactName;
    }

    public String getInvoiceAddrName() {
        return invoiceAddrName;
    }

    public void setInvoiceAddrName(String invoiceAddrName) {
        this.invoiceAddrName = invoiceAddrName;
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

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getTaxInvoiceNo() {
        return taxInvoiceNo;
    }

    public void setTaxInvoiceNo(String taxInvoiceNo) {
        this.taxInvoiceNo = taxInvoiceNo;
    }

    public Boolean getDeductibleIndicator() {
        return deductibleIndicator;
    }

    public void setDeductibleIndicator(Boolean deductibleIndicator) {
        this.deductibleIndicator = deductibleIndicator;
    }

    public String getTaxInvoiceCategoryId() {
        return taxInvoiceCategoryId;
    }

    public void setTaxInvoiceCategoryId(String taxInvoiceCategoryId) {
        this.taxInvoiceCategoryId = taxInvoiceCategoryId;
    }

    public String getSupplierAddrId() {
        return supplierAddrId;
    }

    public void setSupplierAddrId(String supplierAddrId) {
        this.supplierAddrId = supplierAddrId;
    }

    public String getInvoiceContactId() {
        return invoiceContactId;
    }

    public void setInvoiceContactId(String invoiceContactId) {
        this.invoiceContactId = invoiceContactId;
    }

    public String getInvoiceAddrId() {
        return invoiceAddrId;
    }

    public void setInvoiceAddrId(String invoiceAddrId) {
        this.invoiceAddrId = invoiceAddrId;
    }

    public String getReceiptEmployeeId() {
        return receiptEmployeeId;
    }

    public void setReceiptEmployeeId(String receiptEmployeeId) {
        this.receiptEmployeeId = receiptEmployeeId;
    }

    public String getPlantId() {
        return plantId;
    }

    public void setPlantId(String plantId) {
        this.plantId = plantId;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getPaymentTermId() {
        return paymentTermId;
    }

    public void setPaymentTermId(String paymentTermId) {
        this.paymentTermId = paymentTermId;
    }

    public String getDeliveryTermId() {
        return deliveryTermId;
    }

    public void setDeliveryTermId(String deliveryTermId) {
        this.deliveryTermId = deliveryTermId;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierContactId() {
        return supplierContactId;
    }

    public void setSupplierContactId(String supplierContactId) {
        this.supplierContactId = supplierContactId;
    }

    public String getInvoiceSupplierId() {
        return invoiceSupplierId;
    }

    public void setInvoiceSupplierId(String invoiceSupplierId) {
        this.invoiceSupplierId = invoiceSupplierId;
    }

    public String getInvoiceCompanyId() {
        return invoiceCompanyId;
    }

    public void setInvoiceCompanyId(String invoiceCompanyId) {
        this.invoiceCompanyId = invoiceCompanyId;
    }

    public String getSynergyId() {
        return synergyId;
    }

    public void setSynergyId(String synergyId) {
        this.synergyId = synergyId;
    }

    public String getSynergyDId() {
        return synergyDId;
    }

    public void setSynergyDId(String synergyDId) {
        this.synergyDId = synergyDId;
    }

    public Boolean getDirectSettlementIndicator() {
        return directSettlementIndicator;
    }

    public void setDirectSettlementIndicator(Boolean directSettlementIndicator) {
        this.directSettlementIndicator = directSettlementIndicator;
    }

    public Boolean getDirectInvoicingIndicator() {
        return directInvoicingIndicator;
    }

    public void setDirectInvoicingIndicator(Boolean directInvoicingIndicator) {
        this.directInvoicingIndicator = directInvoicingIndicator;
    }

    public Boolean getOffsetDepositIndicator() {
        return offsetDepositIndicator;
    }

    public void setOffsetDepositIndicator(Boolean offsetDepositIndicator) {
        this.offsetDepositIndicator = offsetDepositIndicator;
    }

    public String getReceiptedStatus() {
        return receiptedStatus;
    }

    public void setReceiptedStatus(String receiptedStatus) {
        this.receiptedStatus = receiptedStatus;
    }

    public Boolean getSettlementIndicator() {
        return settlementIndicator;
    }

    public void setSettlementIndicator(Boolean settlementIndicator) {
        this.settlementIndicator = settlementIndicator;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getWipNo() {
        return wipNo;
    }

    public void setWipNo(String wipNo) {
        this.wipNo = wipNo;
    }

    public Boolean getWipE10Inspection() {
        return wipE10Inspection;
    }

    public void setWipE10Inspection(Boolean wipE10Inspection) {
        this.wipE10Inspection = wipE10Inspection;
    }

    public Boolean getAllSynergy() {
        return allSynergy;
    }

    public void setAllSynergy(Boolean allSynergy) {
        this.allSynergy = allSynergy;
    }

    public String getGroupSynergyDId() {
        return groupSynergyDId;
    }

    public void setGroupSynergyDId(String groupSynergyDId) {
        this.groupSynergyDId = groupSynergyDId;
    }

    public String getGenerateNo() {
        return generateNo;
    }

    public void setGenerateNo(String generateNo) {
        this.generateNo = generateNo;
    }

    public Boolean getGenerateStatus() {
        return generateStatus;
    }

    public void setGenerateStatus(Boolean generateStatus) {
        this.generateStatus = generateStatus;
    }

    public Integer getDocSequence() {
        return docSequence;
    }

    public void setDocSequence(Integer docSequence) {
        this.docSequence = docSequence;
    }

    public String getSourceSupplierId() {
        return sourceSupplierId;
    }

    public void setSourceSupplierId(String sourceSupplierId) {
        this.sourceSupplierId = sourceSupplierId;
    }

    public String getGenerateSource() {
        return generateSource;
    }

    public void setGenerateSource(String generateSource) {
        this.generateSource = generateSource;
    }

    public String getDeliveryDocNo() {
        return deliveryDocNo;
    }

    public void setDeliveryDocNo(String deliveryDocNo) {
        this.deliveryDocNo = deliveryDocNo;
    }

    public String getProcessinstanceid() {
        return processinstanceid;
    }

    public void setProcessinstanceid(String processinstanceid) {
        this.processinstanceid = processinstanceid;
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

    public Integer getPrintcount() {
        return printcount;
    }

    public void setPrintcount(Integer printcount) {
        this.printcount = printcount;
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

    public String getReceiveOwnerOrgRtk() {
        return receiveOwnerOrgRtk;
    }

    public void setReceiveOwnerOrgRtk(String receiveOwnerOrgRtk) {
        this.receiveOwnerOrgRtk = receiveOwnerOrgRtk;
    }

    public String getReceiveOwnerOrgRoid() {
        return receiveOwnerOrgRoid;
    }

    public void setReceiveOwnerOrgRoid(String receiveOwnerOrgRoid) {
        this.receiveOwnerOrgRoid = receiveOwnerOrgRoid;
    }

    public String getGroupSynergyIdRtk() {
        return groupSynergyIdRtk;
    }

    public void setGroupSynergyIdRtk(String groupSynergyIdRtk) {
        this.groupSynergyIdRtk = groupSynergyIdRtk;
    }

    public String getGroupSynergyIdRoid() {
        return groupSynergyIdRoid;
    }

    public void setGroupSynergyIdRoid(String groupSynergyIdRoid) {
        this.groupSynergyIdRoid = groupSynergyIdRoid;
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
        sb.append(", purchaseArrivalId=").append(purchaseArrivalId);
        sb.append(", docNo=").append(docNo);
        sb.append(", docDate=").append(docDate);
        sb.append(", docId=").append(docId);
        sb.append(", ownerDept=").append(ownerDept);
        sb.append(", ownerEmp=").append(ownerEmp);
        sb.append(", category=").append(category);
        sb.append(", arrivalDate=").append(arrivalDate);
        sb.append(", supplierFullName=").append(supplierFullName);
        sb.append(", supplierOrderNo=").append(supplierOrderNo);
        sb.append(", exchangeRate=").append(exchangeRate);
        sb.append(", taxIncluded=").append(taxIncluded);
        sb.append(", pieces=").append(pieces);
        sb.append(", remark=").append(remark);
        sb.append(", supplierContactName=").append(supplierContactName);
        sb.append(", supplierAddrName=").append(supplierAddrName);
        sb.append(", invoiceContactName=").append(invoiceContactName);
        sb.append(", invoiceAddrName=").append(invoiceAddrName);
        sb.append(", amountUnincludeTaxOc=").append(amountUnincludeTaxOc);
        sb.append(", taxOc=").append(taxOc);
        sb.append(", amountUnincludeTaxBc=").append(amountUnincludeTaxBc);
        sb.append(", taxBc=").append(taxBc);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", taxInvoiceNo=").append(taxInvoiceNo);
        sb.append(", deductibleIndicator=").append(deductibleIndicator);
        sb.append(", taxInvoiceCategoryId=").append(taxInvoiceCategoryId);
        sb.append(", supplierAddrId=").append(supplierAddrId);
        sb.append(", invoiceContactId=").append(invoiceContactId);
        sb.append(", invoiceAddrId=").append(invoiceAddrId);
        sb.append(", receiptEmployeeId=").append(receiptEmployeeId);
        sb.append(", plantId=").append(plantId);
        sb.append(", currencyId=").append(currencyId);
        sb.append(", paymentTermId=").append(paymentTermId);
        sb.append(", deliveryTermId=").append(deliveryTermId);
        sb.append(", supplierId=").append(supplierId);
        sb.append(", supplierContactId=").append(supplierContactId);
        sb.append(", invoiceSupplierId=").append(invoiceSupplierId);
        sb.append(", invoiceCompanyId=").append(invoiceCompanyId);
        sb.append(", synergyId=").append(synergyId);
        sb.append(", synergyDId=").append(synergyDId);
        sb.append(", directSettlementIndicator=").append(directSettlementIndicator);
        sb.append(", directInvoicingIndicator=").append(directInvoicingIndicator);
        sb.append(", offsetDepositIndicator=").append(offsetDepositIndicator);
        sb.append(", receiptedStatus=").append(receiptedStatus);
        sb.append(", settlementIndicator=").append(settlementIndicator);
        sb.append(", signDate=").append(signDate);
        sb.append(", taxId=").append(taxId);
        sb.append(", wipNo=").append(wipNo);
        sb.append(", wipE10Inspection=").append(wipE10Inspection);
        sb.append(", allSynergy=").append(allSynergy);
        sb.append(", groupSynergyDId=").append(groupSynergyDId);
        sb.append(", generateNo=").append(generateNo);
        sb.append(", generateStatus=").append(generateStatus);
        sb.append(", docSequence=").append(docSequence);
        sb.append(", sourceSupplierId=").append(sourceSupplierId);
        sb.append(", generateSource=").append(generateSource);
        sb.append(", deliveryDocNo=").append(deliveryDocNo);
        sb.append(", processinstanceid=").append(processinstanceid);
        sb.append(", efnetstatus=").append(efnetstatus);
        sb.append(", efnetaction=").append(efnetaction);
        sb.append(", efnetdoccategory=").append(efnetdoccategory);
        sb.append(", efnetdocnumber=").append(efnetdocnumber);
        sb.append(", printcount=").append(printcount);
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
        sb.append(", ownerOrgRtk=").append(ownerOrgRtk);
        sb.append(", ownerOrgRoid=").append(ownerOrgRoid);
        sb.append(", sourceIdRtk=").append(sourceIdRtk);
        sb.append(", sourceIdRoid=").append(sourceIdRoid);
        sb.append(", receiveOwnerOrgRtk=").append(receiveOwnerOrgRtk);
        sb.append(", receiveOwnerOrgRoid=").append(receiveOwnerOrgRoid);
        sb.append(", groupSynergyIdRtk=").append(groupSynergyIdRtk);
        sb.append(", groupSynergyIdRoid=").append(groupSynergyIdRoid);
        sb.append(", version=").append(version);
        sb.append(", attachments=").append(attachments);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}