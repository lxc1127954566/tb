package com.tb.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CustomerContact implements Serializable {
    private String customerContactId;

    private String ownerDept;

    private String ownerEmp;

    private String contact;

    private Boolean mainOrderContact;

    private Boolean mainShipToContact;

    private Boolean mainInvoiceContact;

    private Boolean mainPayContact;

    private String position;

    private String department;

    private String officePhone;

    private String mobilePhone;

    private String fax;

    private String email;

    private String remark;

    private String crmRole;

    private String crmTitle;

    private String crmSex;

    private Boolean crmSdAvailable;

    private Boolean crmMainContact;

    private String crmHomePhone;

    private String crmQqMsn;

    private Date crmBirthday;

    private String crmHobby;

    private String crmFamilyInfo;

    private String crmCustomerId;

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

    private String customerBusinessId;

    private String processinstanceid;

    private byte[] version;

    private String attachments;

    private static final long serialVersionUID = 1L;

    public String getCustomerContactId() {
        return customerContactId;
    }

    public void setCustomerContactId(String customerContactId) {
        this.customerContactId = customerContactId;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Boolean getMainOrderContact() {
        return mainOrderContact;
    }

    public void setMainOrderContact(Boolean mainOrderContact) {
        this.mainOrderContact = mainOrderContact;
    }

    public Boolean getMainShipToContact() {
        return mainShipToContact;
    }

    public void setMainShipToContact(Boolean mainShipToContact) {
        this.mainShipToContact = mainShipToContact;
    }

    public Boolean getMainInvoiceContact() {
        return mainInvoiceContact;
    }

    public void setMainInvoiceContact(Boolean mainInvoiceContact) {
        this.mainInvoiceContact = mainInvoiceContact;
    }

    public Boolean getMainPayContact() {
        return mainPayContact;
    }

    public void setMainPayContact(Boolean mainPayContact) {
        this.mainPayContact = mainPayContact;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCrmRole() {
        return crmRole;
    }

    public void setCrmRole(String crmRole) {
        this.crmRole = crmRole;
    }

    public String getCrmTitle() {
        return crmTitle;
    }

    public void setCrmTitle(String crmTitle) {
        this.crmTitle = crmTitle;
    }

    public String getCrmSex() {
        return crmSex;
    }

    public void setCrmSex(String crmSex) {
        this.crmSex = crmSex;
    }

    public Boolean getCrmSdAvailable() {
        return crmSdAvailable;
    }

    public void setCrmSdAvailable(Boolean crmSdAvailable) {
        this.crmSdAvailable = crmSdAvailable;
    }

    public Boolean getCrmMainContact() {
        return crmMainContact;
    }

    public void setCrmMainContact(Boolean crmMainContact) {
        this.crmMainContact = crmMainContact;
    }

    public String getCrmHomePhone() {
        return crmHomePhone;
    }

    public void setCrmHomePhone(String crmHomePhone) {
        this.crmHomePhone = crmHomePhone;
    }

    public String getCrmQqMsn() {
        return crmQqMsn;
    }

    public void setCrmQqMsn(String crmQqMsn) {
        this.crmQqMsn = crmQqMsn;
    }

    public Date getCrmBirthday() {
        return crmBirthday;
    }

    public void setCrmBirthday(Date crmBirthday) {
        this.crmBirthday = crmBirthday;
    }

    public String getCrmHobby() {
        return crmHobby;
    }

    public void setCrmHobby(String crmHobby) {
        this.crmHobby = crmHobby;
    }

    public String getCrmFamilyInfo() {
        return crmFamilyInfo;
    }

    public void setCrmFamilyInfo(String crmFamilyInfo) {
        this.crmFamilyInfo = crmFamilyInfo;
    }

    public String getCrmCustomerId() {
        return crmCustomerId;
    }

    public void setCrmCustomerId(String crmCustomerId) {
        this.crmCustomerId = crmCustomerId;
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

    public String getCustomerBusinessId() {
        return customerBusinessId;
    }

    public void setCustomerBusinessId(String customerBusinessId) {
        this.customerBusinessId = customerBusinessId;
    }

    public String getProcessinstanceid() {
        return processinstanceid;
    }

    public void setProcessinstanceid(String processinstanceid) {
        this.processinstanceid = processinstanceid;
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
        sb.append(", customerContactId=").append(customerContactId);
        sb.append(", ownerDept=").append(ownerDept);
        sb.append(", ownerEmp=").append(ownerEmp);
        sb.append(", contact=").append(contact);
        sb.append(", mainOrderContact=").append(mainOrderContact);
        sb.append(", mainShipToContact=").append(mainShipToContact);
        sb.append(", mainInvoiceContact=").append(mainInvoiceContact);
        sb.append(", mainPayContact=").append(mainPayContact);
        sb.append(", position=").append(position);
        sb.append(", department=").append(department);
        sb.append(", officePhone=").append(officePhone);
        sb.append(", mobilePhone=").append(mobilePhone);
        sb.append(", fax=").append(fax);
        sb.append(", email=").append(email);
        sb.append(", remark=").append(remark);
        sb.append(", crmRole=").append(crmRole);
        sb.append(", crmTitle=").append(crmTitle);
        sb.append(", crmSex=").append(crmSex);
        sb.append(", crmSdAvailable=").append(crmSdAvailable);
        sb.append(", crmMainContact=").append(crmMainContact);
        sb.append(", crmHomePhone=").append(crmHomePhone);
        sb.append(", crmQqMsn=").append(crmQqMsn);
        sb.append(", crmBirthday=").append(crmBirthday);
        sb.append(", crmHobby=").append(crmHobby);
        sb.append(", crmFamilyInfo=").append(crmFamilyInfo);
        sb.append(", crmCustomerId=").append(crmCustomerId);
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
        sb.append(", customerBusinessId=").append(customerBusinessId);
        sb.append(", processinstanceid=").append(processinstanceid);
        sb.append(", version=").append(version);
        sb.append(", attachments=").append(attachments);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}