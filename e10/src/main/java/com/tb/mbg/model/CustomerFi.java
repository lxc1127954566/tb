package com.tb.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CustomerFi implements Serializable {
    private String customerFiId;

    private String ownerDept;

    private String ownerEmp;

    private String remark;

    private String invoiceInfo1;

    private String invoiceInfo2;

    private String invoiceInfo3;

    private String invoiceInfo4;

    private String invoiceInfo5;

    private String invoiceInfo6;

    private String taxInvoiceCategoryId;

    private String settlementMethodId;

    private String customerId;

    private String paymentTermId;

    private String receiverId;

    private String customerCreditRatingId;

    private String customerFicategoryId;

    private Boolean otherClearingHouseFlag;

    private String currencyId;

    private String roleRemark;

    private String cswarrCategoryId;

    private Integer customerNature;

    private String tweinThirdId;

    private Integer einInvoiceCategory;

    private Boolean thirdSendInvoiceFlag;

    private Boolean sellerIssueCreditFlag;

    private Boolean w055NoInvoiceFlag;

    private String w055InvoiceRuleId;

    private String w055EipaEmail1;

    private String w055EipaEmail2;

    private String w055EipaEmail3;

    private String w055EipaEmail4;

    private String w055EipaEmail5;

    private String w055EipaMp1;

    private String w055EipaMp2;

    private String w055EipaMp3;

    private String w055EipaMp4;

    private String w055EipaMp5;

    private String w055EipaRemark1;

    private String w055EipaRemark2;

    private String w055EipaRemark3;

    private String w055EipaRemark4;

    private String w055EipaRemark5;

    private String w061CustRrCategoryId;

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

    private String processinstanceid;

    private Date createdate;

    private Date lastmodifieddate;

    private Date modifieddate;

    private String createby;

    private String lastmodifiedby;

    private String modifiedby;

    private String approvestatus;

    private Date approvedate;

    private String approveby;

    private String ownerOrgRtk;

    private String ownerOrgRoid;

    private String attachments;

    private byte[] version;

    private static final long serialVersionUID = 1L;

    public String getCustomerFiId() {
        return customerFiId;
    }

    public void setCustomerFiId(String customerFiId) {
        this.customerFiId = customerFiId;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getInvoiceInfo1() {
        return invoiceInfo1;
    }

    public void setInvoiceInfo1(String invoiceInfo1) {
        this.invoiceInfo1 = invoiceInfo1;
    }

    public String getInvoiceInfo2() {
        return invoiceInfo2;
    }

    public void setInvoiceInfo2(String invoiceInfo2) {
        this.invoiceInfo2 = invoiceInfo2;
    }

    public String getInvoiceInfo3() {
        return invoiceInfo3;
    }

    public void setInvoiceInfo3(String invoiceInfo3) {
        this.invoiceInfo3 = invoiceInfo3;
    }

    public String getInvoiceInfo4() {
        return invoiceInfo4;
    }

    public void setInvoiceInfo4(String invoiceInfo4) {
        this.invoiceInfo4 = invoiceInfo4;
    }

    public String getInvoiceInfo5() {
        return invoiceInfo5;
    }

    public void setInvoiceInfo5(String invoiceInfo5) {
        this.invoiceInfo5 = invoiceInfo5;
    }

    public String getInvoiceInfo6() {
        return invoiceInfo6;
    }

    public void setInvoiceInfo6(String invoiceInfo6) {
        this.invoiceInfo6 = invoiceInfo6;
    }

    public String getTaxInvoiceCategoryId() {
        return taxInvoiceCategoryId;
    }

    public void setTaxInvoiceCategoryId(String taxInvoiceCategoryId) {
        this.taxInvoiceCategoryId = taxInvoiceCategoryId;
    }

    public String getSettlementMethodId() {
        return settlementMethodId;
    }

    public void setSettlementMethodId(String settlementMethodId) {
        this.settlementMethodId = settlementMethodId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPaymentTermId() {
        return paymentTermId;
    }

    public void setPaymentTermId(String paymentTermId) {
        this.paymentTermId = paymentTermId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public String getCustomerCreditRatingId() {
        return customerCreditRatingId;
    }

    public void setCustomerCreditRatingId(String customerCreditRatingId) {
        this.customerCreditRatingId = customerCreditRatingId;
    }

    public String getCustomerFicategoryId() {
        return customerFicategoryId;
    }

    public void setCustomerFicategoryId(String customerFicategoryId) {
        this.customerFicategoryId = customerFicategoryId;
    }

    public Boolean getOtherClearingHouseFlag() {
        return otherClearingHouseFlag;
    }

    public void setOtherClearingHouseFlag(Boolean otherClearingHouseFlag) {
        this.otherClearingHouseFlag = otherClearingHouseFlag;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getRoleRemark() {
        return roleRemark;
    }

    public void setRoleRemark(String roleRemark) {
        this.roleRemark = roleRemark;
    }

    public String getCswarrCategoryId() {
        return cswarrCategoryId;
    }

    public void setCswarrCategoryId(String cswarrCategoryId) {
        this.cswarrCategoryId = cswarrCategoryId;
    }

    public Integer getCustomerNature() {
        return customerNature;
    }

    public void setCustomerNature(Integer customerNature) {
        this.customerNature = customerNature;
    }

    public String getTweinThirdId() {
        return tweinThirdId;
    }

    public void setTweinThirdId(String tweinThirdId) {
        this.tweinThirdId = tweinThirdId;
    }

    public Integer getEinInvoiceCategory() {
        return einInvoiceCategory;
    }

    public void setEinInvoiceCategory(Integer einInvoiceCategory) {
        this.einInvoiceCategory = einInvoiceCategory;
    }

    public Boolean getThirdSendInvoiceFlag() {
        return thirdSendInvoiceFlag;
    }

    public void setThirdSendInvoiceFlag(Boolean thirdSendInvoiceFlag) {
        this.thirdSendInvoiceFlag = thirdSendInvoiceFlag;
    }

    public Boolean getSellerIssueCreditFlag() {
        return sellerIssueCreditFlag;
    }

    public void setSellerIssueCreditFlag(Boolean sellerIssueCreditFlag) {
        this.sellerIssueCreditFlag = sellerIssueCreditFlag;
    }

    public Boolean getW055NoInvoiceFlag() {
        return w055NoInvoiceFlag;
    }

    public void setW055NoInvoiceFlag(Boolean w055NoInvoiceFlag) {
        this.w055NoInvoiceFlag = w055NoInvoiceFlag;
    }

    public String getW055InvoiceRuleId() {
        return w055InvoiceRuleId;
    }

    public void setW055InvoiceRuleId(String w055InvoiceRuleId) {
        this.w055InvoiceRuleId = w055InvoiceRuleId;
    }

    public String getW055EipaEmail1() {
        return w055EipaEmail1;
    }

    public void setW055EipaEmail1(String w055EipaEmail1) {
        this.w055EipaEmail1 = w055EipaEmail1;
    }

    public String getW055EipaEmail2() {
        return w055EipaEmail2;
    }

    public void setW055EipaEmail2(String w055EipaEmail2) {
        this.w055EipaEmail2 = w055EipaEmail2;
    }

    public String getW055EipaEmail3() {
        return w055EipaEmail3;
    }

    public void setW055EipaEmail3(String w055EipaEmail3) {
        this.w055EipaEmail3 = w055EipaEmail3;
    }

    public String getW055EipaEmail4() {
        return w055EipaEmail4;
    }

    public void setW055EipaEmail4(String w055EipaEmail4) {
        this.w055EipaEmail4 = w055EipaEmail4;
    }

    public String getW055EipaEmail5() {
        return w055EipaEmail5;
    }

    public void setW055EipaEmail5(String w055EipaEmail5) {
        this.w055EipaEmail5 = w055EipaEmail5;
    }

    public String getW055EipaMp1() {
        return w055EipaMp1;
    }

    public void setW055EipaMp1(String w055EipaMp1) {
        this.w055EipaMp1 = w055EipaMp1;
    }

    public String getW055EipaMp2() {
        return w055EipaMp2;
    }

    public void setW055EipaMp2(String w055EipaMp2) {
        this.w055EipaMp2 = w055EipaMp2;
    }

    public String getW055EipaMp3() {
        return w055EipaMp3;
    }

    public void setW055EipaMp3(String w055EipaMp3) {
        this.w055EipaMp3 = w055EipaMp3;
    }

    public String getW055EipaMp4() {
        return w055EipaMp4;
    }

    public void setW055EipaMp4(String w055EipaMp4) {
        this.w055EipaMp4 = w055EipaMp4;
    }

    public String getW055EipaMp5() {
        return w055EipaMp5;
    }

    public void setW055EipaMp5(String w055EipaMp5) {
        this.w055EipaMp5 = w055EipaMp5;
    }

    public String getW055EipaRemark1() {
        return w055EipaRemark1;
    }

    public void setW055EipaRemark1(String w055EipaRemark1) {
        this.w055EipaRemark1 = w055EipaRemark1;
    }

    public String getW055EipaRemark2() {
        return w055EipaRemark2;
    }

    public void setW055EipaRemark2(String w055EipaRemark2) {
        this.w055EipaRemark2 = w055EipaRemark2;
    }

    public String getW055EipaRemark3() {
        return w055EipaRemark3;
    }

    public void setW055EipaRemark3(String w055EipaRemark3) {
        this.w055EipaRemark3 = w055EipaRemark3;
    }

    public String getW055EipaRemark4() {
        return w055EipaRemark4;
    }

    public void setW055EipaRemark4(String w055EipaRemark4) {
        this.w055EipaRemark4 = w055EipaRemark4;
    }

    public String getW055EipaRemark5() {
        return w055EipaRemark5;
    }

    public void setW055EipaRemark5(String w055EipaRemark5) {
        this.w055EipaRemark5 = w055EipaRemark5;
    }

    public String getW061CustRrCategoryId() {
        return w061CustRrCategoryId;
    }

    public void setW061CustRrCategoryId(String w061CustRrCategoryId) {
        this.w061CustRrCategoryId = w061CustRrCategoryId;
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

    public String getProcessinstanceid() {
        return processinstanceid;
    }

    public void setProcessinstanceid(String processinstanceid) {
        this.processinstanceid = processinstanceid;
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
        sb.append(", customerFiId=").append(customerFiId);
        sb.append(", ownerDept=").append(ownerDept);
        sb.append(", ownerEmp=").append(ownerEmp);
        sb.append(", remark=").append(remark);
        sb.append(", invoiceInfo1=").append(invoiceInfo1);
        sb.append(", invoiceInfo2=").append(invoiceInfo2);
        sb.append(", invoiceInfo3=").append(invoiceInfo3);
        sb.append(", invoiceInfo4=").append(invoiceInfo4);
        sb.append(", invoiceInfo5=").append(invoiceInfo5);
        sb.append(", invoiceInfo6=").append(invoiceInfo6);
        sb.append(", taxInvoiceCategoryId=").append(taxInvoiceCategoryId);
        sb.append(", settlementMethodId=").append(settlementMethodId);
        sb.append(", customerId=").append(customerId);
        sb.append(", paymentTermId=").append(paymentTermId);
        sb.append(", receiverId=").append(receiverId);
        sb.append(", customerCreditRatingId=").append(customerCreditRatingId);
        sb.append(", customerFicategoryId=").append(customerFicategoryId);
        sb.append(", otherClearingHouseFlag=").append(otherClearingHouseFlag);
        sb.append(", currencyId=").append(currencyId);
        sb.append(", roleRemark=").append(roleRemark);
        sb.append(", cswarrCategoryId=").append(cswarrCategoryId);
        sb.append(", customerNature=").append(customerNature);
        sb.append(", tweinThirdId=").append(tweinThirdId);
        sb.append(", einInvoiceCategory=").append(einInvoiceCategory);
        sb.append(", thirdSendInvoiceFlag=").append(thirdSendInvoiceFlag);
        sb.append(", sellerIssueCreditFlag=").append(sellerIssueCreditFlag);
        sb.append(", w055NoInvoiceFlag=").append(w055NoInvoiceFlag);
        sb.append(", w055InvoiceRuleId=").append(w055InvoiceRuleId);
        sb.append(", w055EipaEmail1=").append(w055EipaEmail1);
        sb.append(", w055EipaEmail2=").append(w055EipaEmail2);
        sb.append(", w055EipaEmail3=").append(w055EipaEmail3);
        sb.append(", w055EipaEmail4=").append(w055EipaEmail4);
        sb.append(", w055EipaEmail5=").append(w055EipaEmail5);
        sb.append(", w055EipaMp1=").append(w055EipaMp1);
        sb.append(", w055EipaMp2=").append(w055EipaMp2);
        sb.append(", w055EipaMp3=").append(w055EipaMp3);
        sb.append(", w055EipaMp4=").append(w055EipaMp4);
        sb.append(", w055EipaMp5=").append(w055EipaMp5);
        sb.append(", w055EipaRemark1=").append(w055EipaRemark1);
        sb.append(", w055EipaRemark2=").append(w055EipaRemark2);
        sb.append(", w055EipaRemark3=").append(w055EipaRemark3);
        sb.append(", w055EipaRemark4=").append(w055EipaRemark4);
        sb.append(", w055EipaRemark5=").append(w055EipaRemark5);
        sb.append(", w061CustRrCategoryId=").append(w061CustRrCategoryId);
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
        sb.append(", processinstanceid=").append(processinstanceid);
        sb.append(", createdate=").append(createdate);
        sb.append(", lastmodifieddate=").append(lastmodifieddate);
        sb.append(", modifieddate=").append(modifieddate);
        sb.append(", createby=").append(createby);
        sb.append(", lastmodifiedby=").append(lastmodifiedby);
        sb.append(", modifiedby=").append(modifiedby);
        sb.append(", approvestatus=").append(approvestatus);
        sb.append(", approvedate=").append(approvedate);
        sb.append(", approveby=").append(approveby);
        sb.append(", ownerOrgRtk=").append(ownerOrgRtk);
        sb.append(", ownerOrgRoid=").append(ownerOrgRoid);
        sb.append(", attachments=").append(attachments);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}