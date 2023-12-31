package com.tb.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CustomerSales implements Serializable {
    private String customerBusinessId;

    private String ownerDept;

    private String ownerEmp;

    private Boolean taxIncluded;

    private BigDecimal earnestRate;

    private Boolean signRequired;

    private Boolean invoiceBySign;

    private Boolean advancedDelivery;

    private String remark;

    private String settlementBaseDateType;

    private Boolean isMonthPlus;

    private Integer months;

    private Boolean isDayPlus;

    private Integer days;

    private Boolean isEveryDay;

    private Integer everyDay;

    private Boolean partialDelivery;

    private String customerId;

    private String currencyId;

    private String deliveryTermId;

    private String paymentTermId;

    private String shipToCustomerId;

    private String invoiceCustomerId;

    private String csTaxClassificationId;

    private Boolean directSettlementIndicator;

    private Boolean directInvoicingIndicator;

    private Boolean cashSettlementIndicator;

    private String crmTrackStatus;

    private String brand;

    private String destination;

    private String shippingPort;

    private String airPort;

    private String agentCustomerId;

    private String brokersSupplierId;

    private String inspectionSupplierId;

    private BigDecimal commissionRate;

    private BigDecimal insuranceRate;

    private String transportSupplierId;

    private String priceTermsId;

    private String taxMode;

    private String taxId;

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

    private String processinstanceid;

    private String ownerOrgRtk;

    private String ownerOrgRoid;

    private String attachments;

    private byte[] version;

    private static final long serialVersionUID = 1L;

    public String getCustomerBusinessId() {
        return customerBusinessId;
    }

    public void setCustomerBusinessId(String customerBusinessId) {
        this.customerBusinessId = customerBusinessId;
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

    public Boolean getTaxIncluded() {
        return taxIncluded;
    }

    public void setTaxIncluded(Boolean taxIncluded) {
        this.taxIncluded = taxIncluded;
    }

    public BigDecimal getEarnestRate() {
        return earnestRate;
    }

    public void setEarnestRate(BigDecimal earnestRate) {
        this.earnestRate = earnestRate;
    }

    public Boolean getSignRequired() {
        return signRequired;
    }

    public void setSignRequired(Boolean signRequired) {
        this.signRequired = signRequired;
    }

    public Boolean getInvoiceBySign() {
        return invoiceBySign;
    }

    public void setInvoiceBySign(Boolean invoiceBySign) {
        this.invoiceBySign = invoiceBySign;
    }

    public Boolean getAdvancedDelivery() {
        return advancedDelivery;
    }

    public void setAdvancedDelivery(Boolean advancedDelivery) {
        this.advancedDelivery = advancedDelivery;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSettlementBaseDateType() {
        return settlementBaseDateType;
    }

    public void setSettlementBaseDateType(String settlementBaseDateType) {
        this.settlementBaseDateType = settlementBaseDateType;
    }

    public Boolean getIsMonthPlus() {
        return isMonthPlus;
    }

    public void setIsMonthPlus(Boolean isMonthPlus) {
        this.isMonthPlus = isMonthPlus;
    }

    public Integer getMonths() {
        return months;
    }

    public void setMonths(Integer months) {
        this.months = months;
    }

    public Boolean getIsDayPlus() {
        return isDayPlus;
    }

    public void setIsDayPlus(Boolean isDayPlus) {
        this.isDayPlus = isDayPlus;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Boolean getIsEveryDay() {
        return isEveryDay;
    }

    public void setIsEveryDay(Boolean isEveryDay) {
        this.isEveryDay = isEveryDay;
    }

    public Integer getEveryDay() {
        return everyDay;
    }

    public void setEveryDay(Integer everyDay) {
        this.everyDay = everyDay;
    }

    public Boolean getPartialDelivery() {
        return partialDelivery;
    }

    public void setPartialDelivery(Boolean partialDelivery) {
        this.partialDelivery = partialDelivery;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getDeliveryTermId() {
        return deliveryTermId;
    }

    public void setDeliveryTermId(String deliveryTermId) {
        this.deliveryTermId = deliveryTermId;
    }

    public String getPaymentTermId() {
        return paymentTermId;
    }

    public void setPaymentTermId(String paymentTermId) {
        this.paymentTermId = paymentTermId;
    }

    public String getShipToCustomerId() {
        return shipToCustomerId;
    }

    public void setShipToCustomerId(String shipToCustomerId) {
        this.shipToCustomerId = shipToCustomerId;
    }

    public String getInvoiceCustomerId() {
        return invoiceCustomerId;
    }

    public void setInvoiceCustomerId(String invoiceCustomerId) {
        this.invoiceCustomerId = invoiceCustomerId;
    }

    public String getCsTaxClassificationId() {
        return csTaxClassificationId;
    }

    public void setCsTaxClassificationId(String csTaxClassificationId) {
        this.csTaxClassificationId = csTaxClassificationId;
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

    public Boolean getCashSettlementIndicator() {
        return cashSettlementIndicator;
    }

    public void setCashSettlementIndicator(Boolean cashSettlementIndicator) {
        this.cashSettlementIndicator = cashSettlementIndicator;
    }

    public String getCrmTrackStatus() {
        return crmTrackStatus;
    }

    public void setCrmTrackStatus(String crmTrackStatus) {
        this.crmTrackStatus = crmTrackStatus;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getShippingPort() {
        return shippingPort;
    }

    public void setShippingPort(String shippingPort) {
        this.shippingPort = shippingPort;
    }

    public String getAirPort() {
        return airPort;
    }

    public void setAirPort(String airPort) {
        this.airPort = airPort;
    }

    public String getAgentCustomerId() {
        return agentCustomerId;
    }

    public void setAgentCustomerId(String agentCustomerId) {
        this.agentCustomerId = agentCustomerId;
    }

    public String getBrokersSupplierId() {
        return brokersSupplierId;
    }

    public void setBrokersSupplierId(String brokersSupplierId) {
        this.brokersSupplierId = brokersSupplierId;
    }

    public String getInspectionSupplierId() {
        return inspectionSupplierId;
    }

    public void setInspectionSupplierId(String inspectionSupplierId) {
        this.inspectionSupplierId = inspectionSupplierId;
    }

    public BigDecimal getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(BigDecimal commissionRate) {
        this.commissionRate = commissionRate;
    }

    public BigDecimal getInsuranceRate() {
        return insuranceRate;
    }

    public void setInsuranceRate(BigDecimal insuranceRate) {
        this.insuranceRate = insuranceRate;
    }

    public String getTransportSupplierId() {
        return transportSupplierId;
    }

    public void setTransportSupplierId(String transportSupplierId) {
        this.transportSupplierId = transportSupplierId;
    }

    public String getPriceTermsId() {
        return priceTermsId;
    }

    public void setPriceTermsId(String priceTermsId) {
        this.priceTermsId = priceTermsId;
    }

    public String getTaxMode() {
        return taxMode;
    }

    public void setTaxMode(String taxMode) {
        this.taxMode = taxMode;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
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

    public String getProcessinstanceid() {
        return processinstanceid;
    }

    public void setProcessinstanceid(String processinstanceid) {
        this.processinstanceid = processinstanceid;
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
        sb.append(", customerBusinessId=").append(customerBusinessId);
        sb.append(", ownerDept=").append(ownerDept);
        sb.append(", ownerEmp=").append(ownerEmp);
        sb.append(", taxIncluded=").append(taxIncluded);
        sb.append(", earnestRate=").append(earnestRate);
        sb.append(", signRequired=").append(signRequired);
        sb.append(", invoiceBySign=").append(invoiceBySign);
        sb.append(", advancedDelivery=").append(advancedDelivery);
        sb.append(", remark=").append(remark);
        sb.append(", settlementBaseDateType=").append(settlementBaseDateType);
        sb.append(", isMonthPlus=").append(isMonthPlus);
        sb.append(", months=").append(months);
        sb.append(", isDayPlus=").append(isDayPlus);
        sb.append(", days=").append(days);
        sb.append(", isEveryDay=").append(isEveryDay);
        sb.append(", everyDay=").append(everyDay);
        sb.append(", partialDelivery=").append(partialDelivery);
        sb.append(", customerId=").append(customerId);
        sb.append(", currencyId=").append(currencyId);
        sb.append(", deliveryTermId=").append(deliveryTermId);
        sb.append(", paymentTermId=").append(paymentTermId);
        sb.append(", shipToCustomerId=").append(shipToCustomerId);
        sb.append(", invoiceCustomerId=").append(invoiceCustomerId);
        sb.append(", csTaxClassificationId=").append(csTaxClassificationId);
        sb.append(", directSettlementIndicator=").append(directSettlementIndicator);
        sb.append(", directInvoicingIndicator=").append(directInvoicingIndicator);
        sb.append(", cashSettlementIndicator=").append(cashSettlementIndicator);
        sb.append(", crmTrackStatus=").append(crmTrackStatus);
        sb.append(", brand=").append(brand);
        sb.append(", destination=").append(destination);
        sb.append(", shippingPort=").append(shippingPort);
        sb.append(", airPort=").append(airPort);
        sb.append(", agentCustomerId=").append(agentCustomerId);
        sb.append(", brokersSupplierId=").append(brokersSupplierId);
        sb.append(", inspectionSupplierId=").append(inspectionSupplierId);
        sb.append(", commissionRate=").append(commissionRate);
        sb.append(", insuranceRate=").append(insuranceRate);
        sb.append(", transportSupplierId=").append(transportSupplierId);
        sb.append(", priceTermsId=").append(priceTermsId);
        sb.append(", taxMode=").append(taxMode);
        sb.append(", taxId=").append(taxId);
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
        sb.append(", processinstanceid=").append(processinstanceid);
        sb.append(", ownerOrgRtk=").append(ownerOrgRtk);
        sb.append(", ownerOrgRoid=").append(ownerOrgRoid);
        sb.append(", attachments=").append(attachments);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}