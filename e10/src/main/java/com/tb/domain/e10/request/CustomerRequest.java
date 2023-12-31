package com.tb.domain.e10.request;

import com.tb.domain.e10.vo.AttributeVo;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author linxc
 * @description 客户信息请求
 * */
@Getter
@Setter
public class CustomerRequest implements Serializable {

    private static final long serialVersionUID = 5643343936916439545L;
    private String username;
    private Date date;
    private String company;
    private String companyCode;
    private String customerCode;
    private String simpleName;
    private String allName;
    private String shortcut;
    private String group;
    private Date setUpDate;
    private Date shutoutDate;
    private List<AttributeVo> attributeList;
    private String principal;
    private String currency;
    private BigDecimal capital;
    private BigDecimal turnover;
    private Integer staffs;
    private Integer branches;
    private int innerCustomer;
    private String regAddress;
    private String remark;
    private String taxSort;
    private String accountingSort;
    private Map<String, String> contactSort;
    private Map<String, Object> address;

    @Override
    public String toString() {
        return "CustomerRequest{" +
                "username='" + username + '\'' +
                ", date=" + date +
                ", company='" + company + '\'' +
                ", companyCode='" + companyCode + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", simpleName='" + simpleName + '\'' +
                ", allName='" + allName + '\'' +
                ", shortcut='" + shortcut + '\'' +
                ", group='" + group + '\'' +
                ", setUpDate=" + setUpDate +
                ", shutoutDate=" + shutoutDate +
                ", attributeList=" + attributeList +
                ", principal='" + principal + '\'' +
                ", currency='" + currency + '\'' +
                ", capital=" + capital +
                ", turnover=" + turnover +
                ", staffs=" + staffs +
                ", branches=" + branches +
                ", innerCustomer=" + innerCustomer +
                ", regAddress='" + regAddress + '\'' +
                ", remark='" + remark + '\'' +
                ", taxSort='" + taxSort + '\'' +
                ", accountingSort='" + accountingSort + '\'' +
                '}';
    }
}
