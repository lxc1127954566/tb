package com.tb.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class User implements Serializable {
    private String userId;

    private String ownerDept;

    private String ownerEmp;

    private String logonname;

    private String userName;

    private String userType;

    private String securityidentity;

    private String domainusername;

    private String securitydomainusername;

    private Date logontime;

    private Date availableDate;

    private Date unavailableDate;

    private String remark;

    private String defLanguage;

    private String itemShortcut;

    private String customerShortcut;

    private String supplierShortcut;

    private String dateFormat;

    private String dateArea;

    private String firstDayOfWeek;

    private String defCompanyId;

    private String defPlantId;

    private String defSalesCenterId;

    private String defServiceCenterId;

    private String defSupplyCenterId;

    private String defOperationCenterId;

    private String defUserMenuId;

    private String defShotcutMenuId;

    private String defShotcutProgramid;

    private String defShotcutDisplayname;

    private String defShotcutHelpid;

    private String userPreferences;

    private String employeeId;

    private Date createdate;

    private Date lastmodifieddate;

    private Date modifieddate;

    private String createby;

    private String lastmodifiedby;

    private String modifiedby;

    private String processinstanceid;

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

    private String ownerOrgRtk;

    private String ownerOrgRoid;

    private byte[] version;

    private String attachments;

    private static final long serialVersionUID = 1L;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getLogonname() {
        return logonname;
    }

    public void setLogonname(String logonname) {
        this.logonname = logonname;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getSecurityidentity() {
        return securityidentity;
    }

    public void setSecurityidentity(String securityidentity) {
        this.securityidentity = securityidentity;
    }

    public String getDomainusername() {
        return domainusername;
    }

    public void setDomainusername(String domainusername) {
        this.domainusername = domainusername;
    }

    public String getSecuritydomainusername() {
        return securitydomainusername;
    }

    public void setSecuritydomainusername(String securitydomainusername) {
        this.securitydomainusername = securitydomainusername;
    }

    public Date getLogontime() {
        return logontime;
    }

    public void setLogontime(Date logontime) {
        this.logontime = logontime;
    }

    public Date getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(Date availableDate) {
        this.availableDate = availableDate;
    }

    public Date getUnavailableDate() {
        return unavailableDate;
    }

    public void setUnavailableDate(Date unavailableDate) {
        this.unavailableDate = unavailableDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDefLanguage() {
        return defLanguage;
    }

    public void setDefLanguage(String defLanguage) {
        this.defLanguage = defLanguage;
    }

    public String getItemShortcut() {
        return itemShortcut;
    }

    public void setItemShortcut(String itemShortcut) {
        this.itemShortcut = itemShortcut;
    }

    public String getCustomerShortcut() {
        return customerShortcut;
    }

    public void setCustomerShortcut(String customerShortcut) {
        this.customerShortcut = customerShortcut;
    }

    public String getSupplierShortcut() {
        return supplierShortcut;
    }

    public void setSupplierShortcut(String supplierShortcut) {
        this.supplierShortcut = supplierShortcut;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getDateArea() {
        return dateArea;
    }

    public void setDateArea(String dateArea) {
        this.dateArea = dateArea;
    }

    public String getFirstDayOfWeek() {
        return firstDayOfWeek;
    }

    public void setFirstDayOfWeek(String firstDayOfWeek) {
        this.firstDayOfWeek = firstDayOfWeek;
    }

    public String getDefCompanyId() {
        return defCompanyId;
    }

    public void setDefCompanyId(String defCompanyId) {
        this.defCompanyId = defCompanyId;
    }

    public String getDefPlantId() {
        return defPlantId;
    }

    public void setDefPlantId(String defPlantId) {
        this.defPlantId = defPlantId;
    }

    public String getDefSalesCenterId() {
        return defSalesCenterId;
    }

    public void setDefSalesCenterId(String defSalesCenterId) {
        this.defSalesCenterId = defSalesCenterId;
    }

    public String getDefServiceCenterId() {
        return defServiceCenterId;
    }

    public void setDefServiceCenterId(String defServiceCenterId) {
        this.defServiceCenterId = defServiceCenterId;
    }

    public String getDefSupplyCenterId() {
        return defSupplyCenterId;
    }

    public void setDefSupplyCenterId(String defSupplyCenterId) {
        this.defSupplyCenterId = defSupplyCenterId;
    }

    public String getDefOperationCenterId() {
        return defOperationCenterId;
    }

    public void setDefOperationCenterId(String defOperationCenterId) {
        this.defOperationCenterId = defOperationCenterId;
    }

    public String getDefUserMenuId() {
        return defUserMenuId;
    }

    public void setDefUserMenuId(String defUserMenuId) {
        this.defUserMenuId = defUserMenuId;
    }

    public String getDefShotcutMenuId() {
        return defShotcutMenuId;
    }

    public void setDefShotcutMenuId(String defShotcutMenuId) {
        this.defShotcutMenuId = defShotcutMenuId;
    }

    public String getDefShotcutProgramid() {
        return defShotcutProgramid;
    }

    public void setDefShotcutProgramid(String defShotcutProgramid) {
        this.defShotcutProgramid = defShotcutProgramid;
    }

    public String getDefShotcutDisplayname() {
        return defShotcutDisplayname;
    }

    public void setDefShotcutDisplayname(String defShotcutDisplayname) {
        this.defShotcutDisplayname = defShotcutDisplayname;
    }

    public String getDefShotcutHelpid() {
        return defShotcutHelpid;
    }

    public void setDefShotcutHelpid(String defShotcutHelpid) {
        this.defShotcutHelpid = defShotcutHelpid;
    }

    public String getUserPreferences() {
        return userPreferences;
    }

    public void setUserPreferences(String userPreferences) {
        this.userPreferences = userPreferences;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
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
        sb.append(", userId=").append(userId);
        sb.append(", ownerDept=").append(ownerDept);
        sb.append(", ownerEmp=").append(ownerEmp);
        sb.append(", logonname=").append(logonname);
        sb.append(", userName=").append(userName);
        sb.append(", userType=").append(userType);
        sb.append(", securityidentity=").append(securityidentity);
        sb.append(", domainusername=").append(domainusername);
        sb.append(", securitydomainusername=").append(securitydomainusername);
        sb.append(", logontime=").append(logontime);
        sb.append(", availableDate=").append(availableDate);
        sb.append(", unavailableDate=").append(unavailableDate);
        sb.append(", remark=").append(remark);
        sb.append(", defLanguage=").append(defLanguage);
        sb.append(", itemShortcut=").append(itemShortcut);
        sb.append(", customerShortcut=").append(customerShortcut);
        sb.append(", supplierShortcut=").append(supplierShortcut);
        sb.append(", dateFormat=").append(dateFormat);
        sb.append(", dateArea=").append(dateArea);
        sb.append(", firstDayOfWeek=").append(firstDayOfWeek);
        sb.append(", defCompanyId=").append(defCompanyId);
        sb.append(", defPlantId=").append(defPlantId);
        sb.append(", defSalesCenterId=").append(defSalesCenterId);
        sb.append(", defServiceCenterId=").append(defServiceCenterId);
        sb.append(", defSupplyCenterId=").append(defSupplyCenterId);
        sb.append(", defOperationCenterId=").append(defOperationCenterId);
        sb.append(", defUserMenuId=").append(defUserMenuId);
        sb.append(", defShotcutMenuId=").append(defShotcutMenuId);
        sb.append(", defShotcutProgramid=").append(defShotcutProgramid);
        sb.append(", defShotcutDisplayname=").append(defShotcutDisplayname);
        sb.append(", defShotcutHelpid=").append(defShotcutHelpid);
        sb.append(", userPreferences=").append(userPreferences);
        sb.append(", employeeId=").append(employeeId);
        sb.append(", createdate=").append(createdate);
        sb.append(", lastmodifieddate=").append(lastmodifieddate);
        sb.append(", modifieddate=").append(modifieddate);
        sb.append(", createby=").append(createby);
        sb.append(", lastmodifiedby=").append(lastmodifiedby);
        sb.append(", modifiedby=").append(modifiedby);
        sb.append(", processinstanceid=").append(processinstanceid);
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
        sb.append(", ownerOrgRtk=").append(ownerOrgRtk);
        sb.append(", ownerOrgRoid=").append(ownerOrgRoid);
        sb.append(", version=").append(version);
        sb.append(", attachments=").append(attachments);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}