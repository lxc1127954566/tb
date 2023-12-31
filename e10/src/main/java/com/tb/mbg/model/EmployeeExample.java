package com.tb.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andEmployeeIdIsNull() {
            addCriterion("EMPLOYEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("EMPLOYEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(String value) {
            addCriterion("EMPLOYEE_ID =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(String value) {
            addCriterion("EMPLOYEE_ID <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(String value) {
            addCriterion("EMPLOYEE_ID >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_ID >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(String value) {
            addCriterion("EMPLOYEE_ID <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_ID <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLike(String value) {
            addCriterion("EMPLOYEE_ID like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotLike(String value) {
            addCriterion("EMPLOYEE_ID not like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<String> values) {
            addCriterion("EMPLOYEE_ID in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<String> values) {
            addCriterion("EMPLOYEE_ID not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_ID between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_ID not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andOwnerDeptIsNull() {
            addCriterion("Owner_Dept is null");
            return (Criteria) this;
        }

        public Criteria andOwnerDeptIsNotNull() {
            addCriterion("Owner_Dept is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerDeptEqualTo(String value) {
            addCriterion("Owner_Dept =", value, "ownerDept");
            return (Criteria) this;
        }

        public Criteria andOwnerDeptNotEqualTo(String value) {
            addCriterion("Owner_Dept <>", value, "ownerDept");
            return (Criteria) this;
        }

        public Criteria andOwnerDeptGreaterThan(String value) {
            addCriterion("Owner_Dept >", value, "ownerDept");
            return (Criteria) this;
        }

        public Criteria andOwnerDeptGreaterThanOrEqualTo(String value) {
            addCriterion("Owner_Dept >=", value, "ownerDept");
            return (Criteria) this;
        }

        public Criteria andOwnerDeptLessThan(String value) {
            addCriterion("Owner_Dept <", value, "ownerDept");
            return (Criteria) this;
        }

        public Criteria andOwnerDeptLessThanOrEqualTo(String value) {
            addCriterion("Owner_Dept <=", value, "ownerDept");
            return (Criteria) this;
        }

        public Criteria andOwnerDeptLike(String value) {
            addCriterion("Owner_Dept like", value, "ownerDept");
            return (Criteria) this;
        }

        public Criteria andOwnerDeptNotLike(String value) {
            addCriterion("Owner_Dept not like", value, "ownerDept");
            return (Criteria) this;
        }

        public Criteria andOwnerDeptIn(List<String> values) {
            addCriterion("Owner_Dept in", values, "ownerDept");
            return (Criteria) this;
        }

        public Criteria andOwnerDeptNotIn(List<String> values) {
            addCriterion("Owner_Dept not in", values, "ownerDept");
            return (Criteria) this;
        }

        public Criteria andOwnerDeptBetween(String value1, String value2) {
            addCriterion("Owner_Dept between", value1, value2, "ownerDept");
            return (Criteria) this;
        }

        public Criteria andOwnerDeptNotBetween(String value1, String value2) {
            addCriterion("Owner_Dept not between", value1, value2, "ownerDept");
            return (Criteria) this;
        }

        public Criteria andOwnerEmpIsNull() {
            addCriterion("Owner_Emp is null");
            return (Criteria) this;
        }

        public Criteria andOwnerEmpIsNotNull() {
            addCriterion("Owner_Emp is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEmpEqualTo(String value) {
            addCriterion("Owner_Emp =", value, "ownerEmp");
            return (Criteria) this;
        }

        public Criteria andOwnerEmpNotEqualTo(String value) {
            addCriterion("Owner_Emp <>", value, "ownerEmp");
            return (Criteria) this;
        }

        public Criteria andOwnerEmpGreaterThan(String value) {
            addCriterion("Owner_Emp >", value, "ownerEmp");
            return (Criteria) this;
        }

        public Criteria andOwnerEmpGreaterThanOrEqualTo(String value) {
            addCriterion("Owner_Emp >=", value, "ownerEmp");
            return (Criteria) this;
        }

        public Criteria andOwnerEmpLessThan(String value) {
            addCriterion("Owner_Emp <", value, "ownerEmp");
            return (Criteria) this;
        }

        public Criteria andOwnerEmpLessThanOrEqualTo(String value) {
            addCriterion("Owner_Emp <=", value, "ownerEmp");
            return (Criteria) this;
        }

        public Criteria andOwnerEmpLike(String value) {
            addCriterion("Owner_Emp like", value, "ownerEmp");
            return (Criteria) this;
        }

        public Criteria andOwnerEmpNotLike(String value) {
            addCriterion("Owner_Emp not like", value, "ownerEmp");
            return (Criteria) this;
        }

        public Criteria andOwnerEmpIn(List<String> values) {
            addCriterion("Owner_Emp in", values, "ownerEmp");
            return (Criteria) this;
        }

        public Criteria andOwnerEmpNotIn(List<String> values) {
            addCriterion("Owner_Emp not in", values, "ownerEmp");
            return (Criteria) this;
        }

        public Criteria andOwnerEmpBetween(String value1, String value2) {
            addCriterion("Owner_Emp between", value1, value2, "ownerEmp");
            return (Criteria) this;
        }

        public Criteria andOwnerEmpNotBetween(String value1, String value2) {
            addCriterion("Owner_Emp not between", value1, value2, "ownerEmp");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeIsNull() {
            addCriterion("EMPLOYEE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeIsNotNull() {
            addCriterion("EMPLOYEE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeEqualTo(String value) {
            addCriterion("EMPLOYEE_CODE =", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeNotEqualTo(String value) {
            addCriterion("EMPLOYEE_CODE <>", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeGreaterThan(String value) {
            addCriterion("EMPLOYEE_CODE >", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_CODE >=", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeLessThan(String value) {
            addCriterion("EMPLOYEE_CODE <", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_CODE <=", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeLike(String value) {
            addCriterion("EMPLOYEE_CODE like", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeNotLike(String value) {
            addCriterion("EMPLOYEE_CODE not like", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeIn(List<String> values) {
            addCriterion("EMPLOYEE_CODE in", values, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeNotIn(List<String> values) {
            addCriterion("EMPLOYEE_CODE not in", values, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_CODE between", value1, value2, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_CODE not between", value1, value2, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNull() {
            addCriterion("EMPLOYEE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNotNull() {
            addCriterion("EMPLOYEE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameEqualTo(String value) {
            addCriterion("EMPLOYEE_NAME =", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotEqualTo(String value) {
            addCriterion("EMPLOYEE_NAME <>", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThan(String value) {
            addCriterion("EMPLOYEE_NAME >", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_NAME >=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThan(String value) {
            addCriterion("EMPLOYEE_NAME <", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_NAME <=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLike(String value) {
            addCriterion("EMPLOYEE_NAME like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotLike(String value) {
            addCriterion("EMPLOYEE_NAME not like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIn(List<String> values) {
            addCriterion("EMPLOYEE_NAME in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotIn(List<String> values) {
            addCriterion("EMPLOYEE_NAME not in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_NAME between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_NAME not between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNameIsNull() {
            addCriterion("EMAIL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEmailNameIsNotNull() {
            addCriterion("EMAIL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEmailNameEqualTo(String value) {
            addCriterion("EMAIL_NAME =", value, "emailName");
            return (Criteria) this;
        }

        public Criteria andEmailNameNotEqualTo(String value) {
            addCriterion("EMAIL_NAME <>", value, "emailName");
            return (Criteria) this;
        }

        public Criteria andEmailNameGreaterThan(String value) {
            addCriterion("EMAIL_NAME >", value, "emailName");
            return (Criteria) this;
        }

        public Criteria andEmailNameGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL_NAME >=", value, "emailName");
            return (Criteria) this;
        }

        public Criteria andEmailNameLessThan(String value) {
            addCriterion("EMAIL_NAME <", value, "emailName");
            return (Criteria) this;
        }

        public Criteria andEmailNameLessThanOrEqualTo(String value) {
            addCriterion("EMAIL_NAME <=", value, "emailName");
            return (Criteria) this;
        }

        public Criteria andEmailNameLike(String value) {
            addCriterion("EMAIL_NAME like", value, "emailName");
            return (Criteria) this;
        }

        public Criteria andEmailNameNotLike(String value) {
            addCriterion("EMAIL_NAME not like", value, "emailName");
            return (Criteria) this;
        }

        public Criteria andEmailNameIn(List<String> values) {
            addCriterion("EMAIL_NAME in", values, "emailName");
            return (Criteria) this;
        }

        public Criteria andEmailNameNotIn(List<String> values) {
            addCriterion("EMAIL_NAME not in", values, "emailName");
            return (Criteria) this;
        }

        public Criteria andEmailNameBetween(String value1, String value2) {
            addCriterion("EMAIL_NAME between", value1, value2, "emailName");
            return (Criteria) this;
        }

        public Criteria andEmailNameNotBetween(String value1, String value2) {
            addCriterion("EMAIL_NAME not between", value1, value2, "emailName");
            return (Criteria) this;
        }

        public Criteria andMobileNoIsNull() {
            addCriterion("MOBILE_NO is null");
            return (Criteria) this;
        }

        public Criteria andMobileNoIsNotNull() {
            addCriterion("MOBILE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMobileNoEqualTo(String value) {
            addCriterion("MOBILE_NO =", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotEqualTo(String value) {
            addCriterion("MOBILE_NO <>", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoGreaterThan(String value) {
            addCriterion("MOBILE_NO >", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE_NO >=", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLessThan(String value) {
            addCriterion("MOBILE_NO <", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLessThanOrEqualTo(String value) {
            addCriterion("MOBILE_NO <=", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLike(String value) {
            addCriterion("MOBILE_NO like", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotLike(String value) {
            addCriterion("MOBILE_NO not like", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoIn(List<String> values) {
            addCriterion("MOBILE_NO in", values, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotIn(List<String> values) {
            addCriterion("MOBILE_NO not in", values, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoBetween(String value1, String value2) {
            addCriterion("MOBILE_NO between", value1, value2, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotBetween(String value1, String value2) {
            addCriterion("MOBILE_NO not between", value1, value2, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andOnjobDateIsNull() {
            addCriterion("ONJOB_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOnjobDateIsNotNull() {
            addCriterion("ONJOB_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOnjobDateEqualTo(Date value) {
            addCriterion("ONJOB_DATE =", value, "onjobDate");
            return (Criteria) this;
        }

        public Criteria andOnjobDateNotEqualTo(Date value) {
            addCriterion("ONJOB_DATE <>", value, "onjobDate");
            return (Criteria) this;
        }

        public Criteria andOnjobDateGreaterThan(Date value) {
            addCriterion("ONJOB_DATE >", value, "onjobDate");
            return (Criteria) this;
        }

        public Criteria andOnjobDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ONJOB_DATE >=", value, "onjobDate");
            return (Criteria) this;
        }

        public Criteria andOnjobDateLessThan(Date value) {
            addCriterion("ONJOB_DATE <", value, "onjobDate");
            return (Criteria) this;
        }

        public Criteria andOnjobDateLessThanOrEqualTo(Date value) {
            addCriterion("ONJOB_DATE <=", value, "onjobDate");
            return (Criteria) this;
        }

        public Criteria andOnjobDateIn(List<Date> values) {
            addCriterion("ONJOB_DATE in", values, "onjobDate");
            return (Criteria) this;
        }

        public Criteria andOnjobDateNotIn(List<Date> values) {
            addCriterion("ONJOB_DATE not in", values, "onjobDate");
            return (Criteria) this;
        }

        public Criteria andOnjobDateBetween(Date value1, Date value2) {
            addCriterion("ONJOB_DATE between", value1, value2, "onjobDate");
            return (Criteria) this;
        }

        public Criteria andOnjobDateNotBetween(Date value1, Date value2) {
            addCriterion("ONJOB_DATE not between", value1, value2, "onjobDate");
            return (Criteria) this;
        }

        public Criteria andDimissionDateIsNull() {
            addCriterion("DIMISSION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDimissionDateIsNotNull() {
            addCriterion("DIMISSION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDimissionDateEqualTo(Date value) {
            addCriterion("DIMISSION_DATE =", value, "dimissionDate");
            return (Criteria) this;
        }

        public Criteria andDimissionDateNotEqualTo(Date value) {
            addCriterion("DIMISSION_DATE <>", value, "dimissionDate");
            return (Criteria) this;
        }

        public Criteria andDimissionDateGreaterThan(Date value) {
            addCriterion("DIMISSION_DATE >", value, "dimissionDate");
            return (Criteria) this;
        }

        public Criteria andDimissionDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DIMISSION_DATE >=", value, "dimissionDate");
            return (Criteria) this;
        }

        public Criteria andDimissionDateLessThan(Date value) {
            addCriterion("DIMISSION_DATE <", value, "dimissionDate");
            return (Criteria) this;
        }

        public Criteria andDimissionDateLessThanOrEqualTo(Date value) {
            addCriterion("DIMISSION_DATE <=", value, "dimissionDate");
            return (Criteria) this;
        }

        public Criteria andDimissionDateIn(List<Date> values) {
            addCriterion("DIMISSION_DATE in", values, "dimissionDate");
            return (Criteria) this;
        }

        public Criteria andDimissionDateNotIn(List<Date> values) {
            addCriterion("DIMISSION_DATE not in", values, "dimissionDate");
            return (Criteria) this;
        }

        public Criteria andDimissionDateBetween(Date value1, Date value2) {
            addCriterion("DIMISSION_DATE between", value1, value2, "dimissionDate");
            return (Criteria) this;
        }

        public Criteria andDimissionDateNotBetween(Date value1, Date value2) {
            addCriterion("DIMISSION_DATE not between", value1, value2, "dimissionDate");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNull() {
            addCriterion("AGENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("AGENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(String value) {
            addCriterion("AGENT_ID =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(String value) {
            addCriterion("AGENT_ID <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(String value) {
            addCriterion("AGENT_ID >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(String value) {
            addCriterion("AGENT_ID >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(String value) {
            addCriterion("AGENT_ID <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(String value) {
            addCriterion("AGENT_ID <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLike(String value) {
            addCriterion("AGENT_ID like", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotLike(String value) {
            addCriterion("AGENT_ID not like", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<String> values) {
            addCriterion("AGENT_ID in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<String> values) {
            addCriterion("AGENT_ID not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(String value1, String value2) {
            addCriterion("AGENT_ID between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(String value1, String value2) {
            addCriterion("AGENT_ID not between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("SHOP_ID is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("SHOP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(String value) {
            addCriterion("SHOP_ID =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(String value) {
            addCriterion("SHOP_ID <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(String value) {
            addCriterion("SHOP_ID >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_ID >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(String value) {
            addCriterion("SHOP_ID <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(String value) {
            addCriterion("SHOP_ID <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLike(String value) {
            addCriterion("SHOP_ID like", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotLike(String value) {
            addCriterion("SHOP_ID not like", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<String> values) {
            addCriterion("SHOP_ID in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<String> values) {
            addCriterion("SHOP_ID not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(String value1, String value2) {
            addCriterion("SHOP_ID between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(String value1, String value2) {
            addCriterion("SHOP_ID not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNull() {
            addCriterion("CERTIFICATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNotNull() {
            addCriterion("CERTIFICATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeEqualTo(Integer value) {
            addCriterion("CERTIFICATE_TYPE =", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotEqualTo(Integer value) {
            addCriterion("CERTIFICATE_TYPE <>", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThan(Integer value) {
            addCriterion("CERTIFICATE_TYPE >", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CERTIFICATE_TYPE >=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThan(Integer value) {
            addCriterion("CERTIFICATE_TYPE <", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThanOrEqualTo(Integer value) {
            addCriterion("CERTIFICATE_TYPE <=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIn(List<Integer> values) {
            addCriterion("CERTIFICATE_TYPE in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotIn(List<Integer> values) {
            addCriterion("CERTIFICATE_TYPE not in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeBetween(Integer value1, Integer value2) {
            addCriterion("CERTIFICATE_TYPE between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CERTIFICATE_TYPE not between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateCodeIsNull() {
            addCriterion("CERTIFICATE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCertificateCodeIsNotNull() {
            addCriterion("CERTIFICATE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateCodeEqualTo(String value) {
            addCriterion("CERTIFICATE_CODE =", value, "certificateCode");
            return (Criteria) this;
        }

        public Criteria andCertificateCodeNotEqualTo(String value) {
            addCriterion("CERTIFICATE_CODE <>", value, "certificateCode");
            return (Criteria) this;
        }

        public Criteria andCertificateCodeGreaterThan(String value) {
            addCriterion("CERTIFICATE_CODE >", value, "certificateCode");
            return (Criteria) this;
        }

        public Criteria andCertificateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_CODE >=", value, "certificateCode");
            return (Criteria) this;
        }

        public Criteria andCertificateCodeLessThan(String value) {
            addCriterion("CERTIFICATE_CODE <", value, "certificateCode");
            return (Criteria) this;
        }

        public Criteria andCertificateCodeLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_CODE <=", value, "certificateCode");
            return (Criteria) this;
        }

        public Criteria andCertificateCodeLike(String value) {
            addCriterion("CERTIFICATE_CODE like", value, "certificateCode");
            return (Criteria) this;
        }

        public Criteria andCertificateCodeNotLike(String value) {
            addCriterion("CERTIFICATE_CODE not like", value, "certificateCode");
            return (Criteria) this;
        }

        public Criteria andCertificateCodeIn(List<String> values) {
            addCriterion("CERTIFICATE_CODE in", values, "certificateCode");
            return (Criteria) this;
        }

        public Criteria andCertificateCodeNotIn(List<String> values) {
            addCriterion("CERTIFICATE_CODE not in", values, "certificateCode");
            return (Criteria) this;
        }

        public Criteria andCertificateCodeBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_CODE between", value1, value2, "certificateCode");
            return (Criteria) this;
        }

        public Criteria andCertificateCodeNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_CODE not between", value1, value2, "certificateCode");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("SOURCE =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("SOURCE <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("SOURCE >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("SOURCE <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("SOURCE <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("SOURCE like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("SOURCE not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("SOURCE in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("SOURCE not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("SOURCE between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("SOURCE not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andHrmDatakeyIsNull() {
            addCriterion("HRM_DATAKEY is null");
            return (Criteria) this;
        }

        public Criteria andHrmDatakeyIsNotNull() {
            addCriterion("HRM_DATAKEY is not null");
            return (Criteria) this;
        }

        public Criteria andHrmDatakeyEqualTo(String value) {
            addCriterion("HRM_DATAKEY =", value, "hrmDatakey");
            return (Criteria) this;
        }

        public Criteria andHrmDatakeyNotEqualTo(String value) {
            addCriterion("HRM_DATAKEY <>", value, "hrmDatakey");
            return (Criteria) this;
        }

        public Criteria andHrmDatakeyGreaterThan(String value) {
            addCriterion("HRM_DATAKEY >", value, "hrmDatakey");
            return (Criteria) this;
        }

        public Criteria andHrmDatakeyGreaterThanOrEqualTo(String value) {
            addCriterion("HRM_DATAKEY >=", value, "hrmDatakey");
            return (Criteria) this;
        }

        public Criteria andHrmDatakeyLessThan(String value) {
            addCriterion("HRM_DATAKEY <", value, "hrmDatakey");
            return (Criteria) this;
        }

        public Criteria andHrmDatakeyLessThanOrEqualTo(String value) {
            addCriterion("HRM_DATAKEY <=", value, "hrmDatakey");
            return (Criteria) this;
        }

        public Criteria andHrmDatakeyLike(String value) {
            addCriterion("HRM_DATAKEY like", value, "hrmDatakey");
            return (Criteria) this;
        }

        public Criteria andHrmDatakeyNotLike(String value) {
            addCriterion("HRM_DATAKEY not like", value, "hrmDatakey");
            return (Criteria) this;
        }

        public Criteria andHrmDatakeyIn(List<String> values) {
            addCriterion("HRM_DATAKEY in", values, "hrmDatakey");
            return (Criteria) this;
        }

        public Criteria andHrmDatakeyNotIn(List<String> values) {
            addCriterion("HRM_DATAKEY not in", values, "hrmDatakey");
            return (Criteria) this;
        }

        public Criteria andHrmDatakeyBetween(String value1, String value2) {
            addCriterion("HRM_DATAKEY between", value1, value2, "hrmDatakey");
            return (Criteria) this;
        }

        public Criteria andHrmDatakeyNotBetween(String value1, String value2) {
            addCriterion("HRM_DATAKEY not between", value1, value2, "hrmDatakey");
            return (Criteria) this;
        }

        public Criteria andFinInstitutionIdIsNull() {
            addCriterion("FIN_INSTITUTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andFinInstitutionIdIsNotNull() {
            addCriterion("FIN_INSTITUTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFinInstitutionIdEqualTo(String value) {
            addCriterion("FIN_INSTITUTION_ID =", value, "finInstitutionId");
            return (Criteria) this;
        }

        public Criteria andFinInstitutionIdNotEqualTo(String value) {
            addCriterion("FIN_INSTITUTION_ID <>", value, "finInstitutionId");
            return (Criteria) this;
        }

        public Criteria andFinInstitutionIdGreaterThan(String value) {
            addCriterion("FIN_INSTITUTION_ID >", value, "finInstitutionId");
            return (Criteria) this;
        }

        public Criteria andFinInstitutionIdGreaterThanOrEqualTo(String value) {
            addCriterion("FIN_INSTITUTION_ID >=", value, "finInstitutionId");
            return (Criteria) this;
        }

        public Criteria andFinInstitutionIdLessThan(String value) {
            addCriterion("FIN_INSTITUTION_ID <", value, "finInstitutionId");
            return (Criteria) this;
        }

        public Criteria andFinInstitutionIdLessThanOrEqualTo(String value) {
            addCriterion("FIN_INSTITUTION_ID <=", value, "finInstitutionId");
            return (Criteria) this;
        }

        public Criteria andFinInstitutionIdLike(String value) {
            addCriterion("FIN_INSTITUTION_ID like", value, "finInstitutionId");
            return (Criteria) this;
        }

        public Criteria andFinInstitutionIdNotLike(String value) {
            addCriterion("FIN_INSTITUTION_ID not like", value, "finInstitutionId");
            return (Criteria) this;
        }

        public Criteria andFinInstitutionIdIn(List<String> values) {
            addCriterion("FIN_INSTITUTION_ID in", values, "finInstitutionId");
            return (Criteria) this;
        }

        public Criteria andFinInstitutionIdNotIn(List<String> values) {
            addCriterion("FIN_INSTITUTION_ID not in", values, "finInstitutionId");
            return (Criteria) this;
        }

        public Criteria andFinInstitutionIdBetween(String value1, String value2) {
            addCriterion("FIN_INSTITUTION_ID between", value1, value2, "finInstitutionId");
            return (Criteria) this;
        }

        public Criteria andFinInstitutionIdNotBetween(String value1, String value2) {
            addCriterion("FIN_INSTITUTION_ID not between", value1, value2, "finInstitutionId");
            return (Criteria) this;
        }

        public Criteria andFinInstitutionAccountNoIsNull() {
            addCriterion("FIN_INSTITUTION_ACCOUNT_NO is null");
            return (Criteria) this;
        }

        public Criteria andFinInstitutionAccountNoIsNotNull() {
            addCriterion("FIN_INSTITUTION_ACCOUNT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andFinInstitutionAccountNoEqualTo(String value) {
            addCriterion("FIN_INSTITUTION_ACCOUNT_NO =", value, "finInstitutionAccountNo");
            return (Criteria) this;
        }

        public Criteria andFinInstitutionAccountNoNotEqualTo(String value) {
            addCriterion("FIN_INSTITUTION_ACCOUNT_NO <>", value, "finInstitutionAccountNo");
            return (Criteria) this;
        }

        public Criteria andFinInstitutionAccountNoGreaterThan(String value) {
            addCriterion("FIN_INSTITUTION_ACCOUNT_NO >", value, "finInstitutionAccountNo");
            return (Criteria) this;
        }

        public Criteria andFinInstitutionAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("FIN_INSTITUTION_ACCOUNT_NO >=", value, "finInstitutionAccountNo");
            return (Criteria) this;
        }

        public Criteria andFinInstitutionAccountNoLessThan(String value) {
            addCriterion("FIN_INSTITUTION_ACCOUNT_NO <", value, "finInstitutionAccountNo");
            return (Criteria) this;
        }

        public Criteria andFinInstitutionAccountNoLessThanOrEqualTo(String value) {
            addCriterion("FIN_INSTITUTION_ACCOUNT_NO <=", value, "finInstitutionAccountNo");
            return (Criteria) this;
        }

        public Criteria andFinInstitutionAccountNoLike(String value) {
            addCriterion("FIN_INSTITUTION_ACCOUNT_NO like", value, "finInstitutionAccountNo");
            return (Criteria) this;
        }

        public Criteria andFinInstitutionAccountNoNotLike(String value) {
            addCriterion("FIN_INSTITUTION_ACCOUNT_NO not like", value, "finInstitutionAccountNo");
            return (Criteria) this;
        }

        public Criteria andFinInstitutionAccountNoIn(List<String> values) {
            addCriterion("FIN_INSTITUTION_ACCOUNT_NO in", values, "finInstitutionAccountNo");
            return (Criteria) this;
        }

        public Criteria andFinInstitutionAccountNoNotIn(List<String> values) {
            addCriterion("FIN_INSTITUTION_ACCOUNT_NO not in", values, "finInstitutionAccountNo");
            return (Criteria) this;
        }

        public Criteria andFinInstitutionAccountNoBetween(String value1, String value2) {
            addCriterion("FIN_INSTITUTION_ACCOUNT_NO between", value1, value2, "finInstitutionAccountNo");
            return (Criteria) this;
        }

        public Criteria andFinInstitutionAccountNoNotBetween(String value1, String value2) {
            addCriterion("FIN_INSTITUTION_ACCOUNT_NO not between", value1, value2, "finInstitutionAccountNo");
            return (Criteria) this;
        }

        public Criteria andUdf001IsNull() {
            addCriterion("UDF001 is null");
            return (Criteria) this;
        }

        public Criteria andUdf001IsNotNull() {
            addCriterion("UDF001 is not null");
            return (Criteria) this;
        }

        public Criteria andUdf001EqualTo(BigDecimal value) {
            addCriterion("UDF001 =", value, "udf001");
            return (Criteria) this;
        }

        public Criteria andUdf001NotEqualTo(BigDecimal value) {
            addCriterion("UDF001 <>", value, "udf001");
            return (Criteria) this;
        }

        public Criteria andUdf001GreaterThan(BigDecimal value) {
            addCriterion("UDF001 >", value, "udf001");
            return (Criteria) this;
        }

        public Criteria andUdf001GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UDF001 >=", value, "udf001");
            return (Criteria) this;
        }

        public Criteria andUdf001LessThan(BigDecimal value) {
            addCriterion("UDF001 <", value, "udf001");
            return (Criteria) this;
        }

        public Criteria andUdf001LessThanOrEqualTo(BigDecimal value) {
            addCriterion("UDF001 <=", value, "udf001");
            return (Criteria) this;
        }

        public Criteria andUdf001In(List<BigDecimal> values) {
            addCriterion("UDF001 in", values, "udf001");
            return (Criteria) this;
        }

        public Criteria andUdf001NotIn(List<BigDecimal> values) {
            addCriterion("UDF001 not in", values, "udf001");
            return (Criteria) this;
        }

        public Criteria andUdf001Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("UDF001 between", value1, value2, "udf001");
            return (Criteria) this;
        }

        public Criteria andUdf001NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UDF001 not between", value1, value2, "udf001");
            return (Criteria) this;
        }

        public Criteria andUdf002IsNull() {
            addCriterion("UDF002 is null");
            return (Criteria) this;
        }

        public Criteria andUdf002IsNotNull() {
            addCriterion("UDF002 is not null");
            return (Criteria) this;
        }

        public Criteria andUdf002EqualTo(BigDecimal value) {
            addCriterion("UDF002 =", value, "udf002");
            return (Criteria) this;
        }

        public Criteria andUdf002NotEqualTo(BigDecimal value) {
            addCriterion("UDF002 <>", value, "udf002");
            return (Criteria) this;
        }

        public Criteria andUdf002GreaterThan(BigDecimal value) {
            addCriterion("UDF002 >", value, "udf002");
            return (Criteria) this;
        }

        public Criteria andUdf002GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UDF002 >=", value, "udf002");
            return (Criteria) this;
        }

        public Criteria andUdf002LessThan(BigDecimal value) {
            addCriterion("UDF002 <", value, "udf002");
            return (Criteria) this;
        }

        public Criteria andUdf002LessThanOrEqualTo(BigDecimal value) {
            addCriterion("UDF002 <=", value, "udf002");
            return (Criteria) this;
        }

        public Criteria andUdf002In(List<BigDecimal> values) {
            addCriterion("UDF002 in", values, "udf002");
            return (Criteria) this;
        }

        public Criteria andUdf002NotIn(List<BigDecimal> values) {
            addCriterion("UDF002 not in", values, "udf002");
            return (Criteria) this;
        }

        public Criteria andUdf002Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("UDF002 between", value1, value2, "udf002");
            return (Criteria) this;
        }

        public Criteria andUdf002NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UDF002 not between", value1, value2, "udf002");
            return (Criteria) this;
        }

        public Criteria andUdf003IsNull() {
            addCriterion("UDF003 is null");
            return (Criteria) this;
        }

        public Criteria andUdf003IsNotNull() {
            addCriterion("UDF003 is not null");
            return (Criteria) this;
        }

        public Criteria andUdf003EqualTo(BigDecimal value) {
            addCriterion("UDF003 =", value, "udf003");
            return (Criteria) this;
        }

        public Criteria andUdf003NotEqualTo(BigDecimal value) {
            addCriterion("UDF003 <>", value, "udf003");
            return (Criteria) this;
        }

        public Criteria andUdf003GreaterThan(BigDecimal value) {
            addCriterion("UDF003 >", value, "udf003");
            return (Criteria) this;
        }

        public Criteria andUdf003GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UDF003 >=", value, "udf003");
            return (Criteria) this;
        }

        public Criteria andUdf003LessThan(BigDecimal value) {
            addCriterion("UDF003 <", value, "udf003");
            return (Criteria) this;
        }

        public Criteria andUdf003LessThanOrEqualTo(BigDecimal value) {
            addCriterion("UDF003 <=", value, "udf003");
            return (Criteria) this;
        }

        public Criteria andUdf003In(List<BigDecimal> values) {
            addCriterion("UDF003 in", values, "udf003");
            return (Criteria) this;
        }

        public Criteria andUdf003NotIn(List<BigDecimal> values) {
            addCriterion("UDF003 not in", values, "udf003");
            return (Criteria) this;
        }

        public Criteria andUdf003Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("UDF003 between", value1, value2, "udf003");
            return (Criteria) this;
        }

        public Criteria andUdf003NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UDF003 not between", value1, value2, "udf003");
            return (Criteria) this;
        }

        public Criteria andUdf011IsNull() {
            addCriterion("UDF011 is null");
            return (Criteria) this;
        }

        public Criteria andUdf011IsNotNull() {
            addCriterion("UDF011 is not null");
            return (Criteria) this;
        }

        public Criteria andUdf011EqualTo(BigDecimal value) {
            addCriterion("UDF011 =", value, "udf011");
            return (Criteria) this;
        }

        public Criteria andUdf011NotEqualTo(BigDecimal value) {
            addCriterion("UDF011 <>", value, "udf011");
            return (Criteria) this;
        }

        public Criteria andUdf011GreaterThan(BigDecimal value) {
            addCriterion("UDF011 >", value, "udf011");
            return (Criteria) this;
        }

        public Criteria andUdf011GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UDF011 >=", value, "udf011");
            return (Criteria) this;
        }

        public Criteria andUdf011LessThan(BigDecimal value) {
            addCriterion("UDF011 <", value, "udf011");
            return (Criteria) this;
        }

        public Criteria andUdf011LessThanOrEqualTo(BigDecimal value) {
            addCriterion("UDF011 <=", value, "udf011");
            return (Criteria) this;
        }

        public Criteria andUdf011In(List<BigDecimal> values) {
            addCriterion("UDF011 in", values, "udf011");
            return (Criteria) this;
        }

        public Criteria andUdf011NotIn(List<BigDecimal> values) {
            addCriterion("UDF011 not in", values, "udf011");
            return (Criteria) this;
        }

        public Criteria andUdf011Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("UDF011 between", value1, value2, "udf011");
            return (Criteria) this;
        }

        public Criteria andUdf011NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UDF011 not between", value1, value2, "udf011");
            return (Criteria) this;
        }

        public Criteria andUdf012IsNull() {
            addCriterion("UDF012 is null");
            return (Criteria) this;
        }

        public Criteria andUdf012IsNotNull() {
            addCriterion("UDF012 is not null");
            return (Criteria) this;
        }

        public Criteria andUdf012EqualTo(BigDecimal value) {
            addCriterion("UDF012 =", value, "udf012");
            return (Criteria) this;
        }

        public Criteria andUdf012NotEqualTo(BigDecimal value) {
            addCriterion("UDF012 <>", value, "udf012");
            return (Criteria) this;
        }

        public Criteria andUdf012GreaterThan(BigDecimal value) {
            addCriterion("UDF012 >", value, "udf012");
            return (Criteria) this;
        }

        public Criteria andUdf012GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UDF012 >=", value, "udf012");
            return (Criteria) this;
        }

        public Criteria andUdf012LessThan(BigDecimal value) {
            addCriterion("UDF012 <", value, "udf012");
            return (Criteria) this;
        }

        public Criteria andUdf012LessThanOrEqualTo(BigDecimal value) {
            addCriterion("UDF012 <=", value, "udf012");
            return (Criteria) this;
        }

        public Criteria andUdf012In(List<BigDecimal> values) {
            addCriterion("UDF012 in", values, "udf012");
            return (Criteria) this;
        }

        public Criteria andUdf012NotIn(List<BigDecimal> values) {
            addCriterion("UDF012 not in", values, "udf012");
            return (Criteria) this;
        }

        public Criteria andUdf012Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("UDF012 between", value1, value2, "udf012");
            return (Criteria) this;
        }

        public Criteria andUdf012NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UDF012 not between", value1, value2, "udf012");
            return (Criteria) this;
        }

        public Criteria andUdf013IsNull() {
            addCriterion("UDF013 is null");
            return (Criteria) this;
        }

        public Criteria andUdf013IsNotNull() {
            addCriterion("UDF013 is not null");
            return (Criteria) this;
        }

        public Criteria andUdf013EqualTo(BigDecimal value) {
            addCriterion("UDF013 =", value, "udf013");
            return (Criteria) this;
        }

        public Criteria andUdf013NotEqualTo(BigDecimal value) {
            addCriterion("UDF013 <>", value, "udf013");
            return (Criteria) this;
        }

        public Criteria andUdf013GreaterThan(BigDecimal value) {
            addCriterion("UDF013 >", value, "udf013");
            return (Criteria) this;
        }

        public Criteria andUdf013GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UDF013 >=", value, "udf013");
            return (Criteria) this;
        }

        public Criteria andUdf013LessThan(BigDecimal value) {
            addCriterion("UDF013 <", value, "udf013");
            return (Criteria) this;
        }

        public Criteria andUdf013LessThanOrEqualTo(BigDecimal value) {
            addCriterion("UDF013 <=", value, "udf013");
            return (Criteria) this;
        }

        public Criteria andUdf013In(List<BigDecimal> values) {
            addCriterion("UDF013 in", values, "udf013");
            return (Criteria) this;
        }

        public Criteria andUdf013NotIn(List<BigDecimal> values) {
            addCriterion("UDF013 not in", values, "udf013");
            return (Criteria) this;
        }

        public Criteria andUdf013Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("UDF013 between", value1, value2, "udf013");
            return (Criteria) this;
        }

        public Criteria andUdf013NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UDF013 not between", value1, value2, "udf013");
            return (Criteria) this;
        }

        public Criteria andUdf021IsNull() {
            addCriterion("UDF021 is null");
            return (Criteria) this;
        }

        public Criteria andUdf021IsNotNull() {
            addCriterion("UDF021 is not null");
            return (Criteria) this;
        }

        public Criteria andUdf021EqualTo(String value) {
            addCriterion("UDF021 =", value, "udf021");
            return (Criteria) this;
        }

        public Criteria andUdf021NotEqualTo(String value) {
            addCriterion("UDF021 <>", value, "udf021");
            return (Criteria) this;
        }

        public Criteria andUdf021GreaterThan(String value) {
            addCriterion("UDF021 >", value, "udf021");
            return (Criteria) this;
        }

        public Criteria andUdf021GreaterThanOrEqualTo(String value) {
            addCriterion("UDF021 >=", value, "udf021");
            return (Criteria) this;
        }

        public Criteria andUdf021LessThan(String value) {
            addCriterion("UDF021 <", value, "udf021");
            return (Criteria) this;
        }

        public Criteria andUdf021LessThanOrEqualTo(String value) {
            addCriterion("UDF021 <=", value, "udf021");
            return (Criteria) this;
        }

        public Criteria andUdf021Like(String value) {
            addCriterion("UDF021 like", value, "udf021");
            return (Criteria) this;
        }

        public Criteria andUdf021NotLike(String value) {
            addCriterion("UDF021 not like", value, "udf021");
            return (Criteria) this;
        }

        public Criteria andUdf021In(List<String> values) {
            addCriterion("UDF021 in", values, "udf021");
            return (Criteria) this;
        }

        public Criteria andUdf021NotIn(List<String> values) {
            addCriterion("UDF021 not in", values, "udf021");
            return (Criteria) this;
        }

        public Criteria andUdf021Between(String value1, String value2) {
            addCriterion("UDF021 between", value1, value2, "udf021");
            return (Criteria) this;
        }

        public Criteria andUdf021NotBetween(String value1, String value2) {
            addCriterion("UDF021 not between", value1, value2, "udf021");
            return (Criteria) this;
        }

        public Criteria andUdf022IsNull() {
            addCriterion("UDF022 is null");
            return (Criteria) this;
        }

        public Criteria andUdf022IsNotNull() {
            addCriterion("UDF022 is not null");
            return (Criteria) this;
        }

        public Criteria andUdf022EqualTo(String value) {
            addCriterion("UDF022 =", value, "udf022");
            return (Criteria) this;
        }

        public Criteria andUdf022NotEqualTo(String value) {
            addCriterion("UDF022 <>", value, "udf022");
            return (Criteria) this;
        }

        public Criteria andUdf022GreaterThan(String value) {
            addCriterion("UDF022 >", value, "udf022");
            return (Criteria) this;
        }

        public Criteria andUdf022GreaterThanOrEqualTo(String value) {
            addCriterion("UDF022 >=", value, "udf022");
            return (Criteria) this;
        }

        public Criteria andUdf022LessThan(String value) {
            addCriterion("UDF022 <", value, "udf022");
            return (Criteria) this;
        }

        public Criteria andUdf022LessThanOrEqualTo(String value) {
            addCriterion("UDF022 <=", value, "udf022");
            return (Criteria) this;
        }

        public Criteria andUdf022Like(String value) {
            addCriterion("UDF022 like", value, "udf022");
            return (Criteria) this;
        }

        public Criteria andUdf022NotLike(String value) {
            addCriterion("UDF022 not like", value, "udf022");
            return (Criteria) this;
        }

        public Criteria andUdf022In(List<String> values) {
            addCriterion("UDF022 in", values, "udf022");
            return (Criteria) this;
        }

        public Criteria andUdf022NotIn(List<String> values) {
            addCriterion("UDF022 not in", values, "udf022");
            return (Criteria) this;
        }

        public Criteria andUdf022Between(String value1, String value2) {
            addCriterion("UDF022 between", value1, value2, "udf022");
            return (Criteria) this;
        }

        public Criteria andUdf022NotBetween(String value1, String value2) {
            addCriterion("UDF022 not between", value1, value2, "udf022");
            return (Criteria) this;
        }

        public Criteria andUdf023IsNull() {
            addCriterion("UDF023 is null");
            return (Criteria) this;
        }

        public Criteria andUdf023IsNotNull() {
            addCriterion("UDF023 is not null");
            return (Criteria) this;
        }

        public Criteria andUdf023EqualTo(String value) {
            addCriterion("UDF023 =", value, "udf023");
            return (Criteria) this;
        }

        public Criteria andUdf023NotEqualTo(String value) {
            addCriterion("UDF023 <>", value, "udf023");
            return (Criteria) this;
        }

        public Criteria andUdf023GreaterThan(String value) {
            addCriterion("UDF023 >", value, "udf023");
            return (Criteria) this;
        }

        public Criteria andUdf023GreaterThanOrEqualTo(String value) {
            addCriterion("UDF023 >=", value, "udf023");
            return (Criteria) this;
        }

        public Criteria andUdf023LessThan(String value) {
            addCriterion("UDF023 <", value, "udf023");
            return (Criteria) this;
        }

        public Criteria andUdf023LessThanOrEqualTo(String value) {
            addCriterion("UDF023 <=", value, "udf023");
            return (Criteria) this;
        }

        public Criteria andUdf023Like(String value) {
            addCriterion("UDF023 like", value, "udf023");
            return (Criteria) this;
        }

        public Criteria andUdf023NotLike(String value) {
            addCriterion("UDF023 not like", value, "udf023");
            return (Criteria) this;
        }

        public Criteria andUdf023In(List<String> values) {
            addCriterion("UDF023 in", values, "udf023");
            return (Criteria) this;
        }

        public Criteria andUdf023NotIn(List<String> values) {
            addCriterion("UDF023 not in", values, "udf023");
            return (Criteria) this;
        }

        public Criteria andUdf023Between(String value1, String value2) {
            addCriterion("UDF023 between", value1, value2, "udf023");
            return (Criteria) this;
        }

        public Criteria andUdf023NotBetween(String value1, String value2) {
            addCriterion("UDF023 not between", value1, value2, "udf023");
            return (Criteria) this;
        }

        public Criteria andUdf024IsNull() {
            addCriterion("UDF024 is null");
            return (Criteria) this;
        }

        public Criteria andUdf024IsNotNull() {
            addCriterion("UDF024 is not null");
            return (Criteria) this;
        }

        public Criteria andUdf024EqualTo(String value) {
            addCriterion("UDF024 =", value, "udf024");
            return (Criteria) this;
        }

        public Criteria andUdf024NotEqualTo(String value) {
            addCriterion("UDF024 <>", value, "udf024");
            return (Criteria) this;
        }

        public Criteria andUdf024GreaterThan(String value) {
            addCriterion("UDF024 >", value, "udf024");
            return (Criteria) this;
        }

        public Criteria andUdf024GreaterThanOrEqualTo(String value) {
            addCriterion("UDF024 >=", value, "udf024");
            return (Criteria) this;
        }

        public Criteria andUdf024LessThan(String value) {
            addCriterion("UDF024 <", value, "udf024");
            return (Criteria) this;
        }

        public Criteria andUdf024LessThanOrEqualTo(String value) {
            addCriterion("UDF024 <=", value, "udf024");
            return (Criteria) this;
        }

        public Criteria andUdf024Like(String value) {
            addCriterion("UDF024 like", value, "udf024");
            return (Criteria) this;
        }

        public Criteria andUdf024NotLike(String value) {
            addCriterion("UDF024 not like", value, "udf024");
            return (Criteria) this;
        }

        public Criteria andUdf024In(List<String> values) {
            addCriterion("UDF024 in", values, "udf024");
            return (Criteria) this;
        }

        public Criteria andUdf024NotIn(List<String> values) {
            addCriterion("UDF024 not in", values, "udf024");
            return (Criteria) this;
        }

        public Criteria andUdf024Between(String value1, String value2) {
            addCriterion("UDF024 between", value1, value2, "udf024");
            return (Criteria) this;
        }

        public Criteria andUdf024NotBetween(String value1, String value2) {
            addCriterion("UDF024 not between", value1, value2, "udf024");
            return (Criteria) this;
        }

        public Criteria andUdf025IsNull() {
            addCriterion("UDF025 is null");
            return (Criteria) this;
        }

        public Criteria andUdf025IsNotNull() {
            addCriterion("UDF025 is not null");
            return (Criteria) this;
        }

        public Criteria andUdf025EqualTo(String value) {
            addCriterion("UDF025 =", value, "udf025");
            return (Criteria) this;
        }

        public Criteria andUdf025NotEqualTo(String value) {
            addCriterion("UDF025 <>", value, "udf025");
            return (Criteria) this;
        }

        public Criteria andUdf025GreaterThan(String value) {
            addCriterion("UDF025 >", value, "udf025");
            return (Criteria) this;
        }

        public Criteria andUdf025GreaterThanOrEqualTo(String value) {
            addCriterion("UDF025 >=", value, "udf025");
            return (Criteria) this;
        }

        public Criteria andUdf025LessThan(String value) {
            addCriterion("UDF025 <", value, "udf025");
            return (Criteria) this;
        }

        public Criteria andUdf025LessThanOrEqualTo(String value) {
            addCriterion("UDF025 <=", value, "udf025");
            return (Criteria) this;
        }

        public Criteria andUdf025Like(String value) {
            addCriterion("UDF025 like", value, "udf025");
            return (Criteria) this;
        }

        public Criteria andUdf025NotLike(String value) {
            addCriterion("UDF025 not like", value, "udf025");
            return (Criteria) this;
        }

        public Criteria andUdf025In(List<String> values) {
            addCriterion("UDF025 in", values, "udf025");
            return (Criteria) this;
        }

        public Criteria andUdf025NotIn(List<String> values) {
            addCriterion("UDF025 not in", values, "udf025");
            return (Criteria) this;
        }

        public Criteria andUdf025Between(String value1, String value2) {
            addCriterion("UDF025 between", value1, value2, "udf025");
            return (Criteria) this;
        }

        public Criteria andUdf025NotBetween(String value1, String value2) {
            addCriterion("UDF025 not between", value1, value2, "udf025");
            return (Criteria) this;
        }

        public Criteria andUdf026IsNull() {
            addCriterion("UDF026 is null");
            return (Criteria) this;
        }

        public Criteria andUdf026IsNotNull() {
            addCriterion("UDF026 is not null");
            return (Criteria) this;
        }

        public Criteria andUdf026EqualTo(String value) {
            addCriterion("UDF026 =", value, "udf026");
            return (Criteria) this;
        }

        public Criteria andUdf026NotEqualTo(String value) {
            addCriterion("UDF026 <>", value, "udf026");
            return (Criteria) this;
        }

        public Criteria andUdf026GreaterThan(String value) {
            addCriterion("UDF026 >", value, "udf026");
            return (Criteria) this;
        }

        public Criteria andUdf026GreaterThanOrEqualTo(String value) {
            addCriterion("UDF026 >=", value, "udf026");
            return (Criteria) this;
        }

        public Criteria andUdf026LessThan(String value) {
            addCriterion("UDF026 <", value, "udf026");
            return (Criteria) this;
        }

        public Criteria andUdf026LessThanOrEqualTo(String value) {
            addCriterion("UDF026 <=", value, "udf026");
            return (Criteria) this;
        }

        public Criteria andUdf026Like(String value) {
            addCriterion("UDF026 like", value, "udf026");
            return (Criteria) this;
        }

        public Criteria andUdf026NotLike(String value) {
            addCriterion("UDF026 not like", value, "udf026");
            return (Criteria) this;
        }

        public Criteria andUdf026In(List<String> values) {
            addCriterion("UDF026 in", values, "udf026");
            return (Criteria) this;
        }

        public Criteria andUdf026NotIn(List<String> values) {
            addCriterion("UDF026 not in", values, "udf026");
            return (Criteria) this;
        }

        public Criteria andUdf026Between(String value1, String value2) {
            addCriterion("UDF026 between", value1, value2, "udf026");
            return (Criteria) this;
        }

        public Criteria andUdf026NotBetween(String value1, String value2) {
            addCriterion("UDF026 not between", value1, value2, "udf026");
            return (Criteria) this;
        }

        public Criteria andUdf041IsNull() {
            addCriterion("UDF041 is null");
            return (Criteria) this;
        }

        public Criteria andUdf041IsNotNull() {
            addCriterion("UDF041 is not null");
            return (Criteria) this;
        }

        public Criteria andUdf041EqualTo(Date value) {
            addCriterion("UDF041 =", value, "udf041");
            return (Criteria) this;
        }

        public Criteria andUdf041NotEqualTo(Date value) {
            addCriterion("UDF041 <>", value, "udf041");
            return (Criteria) this;
        }

        public Criteria andUdf041GreaterThan(Date value) {
            addCriterion("UDF041 >", value, "udf041");
            return (Criteria) this;
        }

        public Criteria andUdf041GreaterThanOrEqualTo(Date value) {
            addCriterion("UDF041 >=", value, "udf041");
            return (Criteria) this;
        }

        public Criteria andUdf041LessThan(Date value) {
            addCriterion("UDF041 <", value, "udf041");
            return (Criteria) this;
        }

        public Criteria andUdf041LessThanOrEqualTo(Date value) {
            addCriterion("UDF041 <=", value, "udf041");
            return (Criteria) this;
        }

        public Criteria andUdf041In(List<Date> values) {
            addCriterion("UDF041 in", values, "udf041");
            return (Criteria) this;
        }

        public Criteria andUdf041NotIn(List<Date> values) {
            addCriterion("UDF041 not in", values, "udf041");
            return (Criteria) this;
        }

        public Criteria andUdf041Between(Date value1, Date value2) {
            addCriterion("UDF041 between", value1, value2, "udf041");
            return (Criteria) this;
        }

        public Criteria andUdf041NotBetween(Date value1, Date value2) {
            addCriterion("UDF041 not between", value1, value2, "udf041");
            return (Criteria) this;
        }

        public Criteria andUdf042IsNull() {
            addCriterion("UDF042 is null");
            return (Criteria) this;
        }

        public Criteria andUdf042IsNotNull() {
            addCriterion("UDF042 is not null");
            return (Criteria) this;
        }

        public Criteria andUdf042EqualTo(Date value) {
            addCriterion("UDF042 =", value, "udf042");
            return (Criteria) this;
        }

        public Criteria andUdf042NotEqualTo(Date value) {
            addCriterion("UDF042 <>", value, "udf042");
            return (Criteria) this;
        }

        public Criteria andUdf042GreaterThan(Date value) {
            addCriterion("UDF042 >", value, "udf042");
            return (Criteria) this;
        }

        public Criteria andUdf042GreaterThanOrEqualTo(Date value) {
            addCriterion("UDF042 >=", value, "udf042");
            return (Criteria) this;
        }

        public Criteria andUdf042LessThan(Date value) {
            addCriterion("UDF042 <", value, "udf042");
            return (Criteria) this;
        }

        public Criteria andUdf042LessThanOrEqualTo(Date value) {
            addCriterion("UDF042 <=", value, "udf042");
            return (Criteria) this;
        }

        public Criteria andUdf042In(List<Date> values) {
            addCriterion("UDF042 in", values, "udf042");
            return (Criteria) this;
        }

        public Criteria andUdf042NotIn(List<Date> values) {
            addCriterion("UDF042 not in", values, "udf042");
            return (Criteria) this;
        }

        public Criteria andUdf042Between(Date value1, Date value2) {
            addCriterion("UDF042 between", value1, value2, "udf042");
            return (Criteria) this;
        }

        public Criteria andUdf042NotBetween(Date value1, Date value2) {
            addCriterion("UDF042 not between", value1, value2, "udf042");
            return (Criteria) this;
        }

        public Criteria andUdf051IsNull() {
            addCriterion("UDF051 is null");
            return (Criteria) this;
        }

        public Criteria andUdf051IsNotNull() {
            addCriterion("UDF051 is not null");
            return (Criteria) this;
        }

        public Criteria andUdf051EqualTo(String value) {
            addCriterion("UDF051 =", value, "udf051");
            return (Criteria) this;
        }

        public Criteria andUdf051NotEqualTo(String value) {
            addCriterion("UDF051 <>", value, "udf051");
            return (Criteria) this;
        }

        public Criteria andUdf051GreaterThan(String value) {
            addCriterion("UDF051 >", value, "udf051");
            return (Criteria) this;
        }

        public Criteria andUdf051GreaterThanOrEqualTo(String value) {
            addCriterion("UDF051 >=", value, "udf051");
            return (Criteria) this;
        }

        public Criteria andUdf051LessThan(String value) {
            addCriterion("UDF051 <", value, "udf051");
            return (Criteria) this;
        }

        public Criteria andUdf051LessThanOrEqualTo(String value) {
            addCriterion("UDF051 <=", value, "udf051");
            return (Criteria) this;
        }

        public Criteria andUdf051Like(String value) {
            addCriterion("UDF051 like", value, "udf051");
            return (Criteria) this;
        }

        public Criteria andUdf051NotLike(String value) {
            addCriterion("UDF051 not like", value, "udf051");
            return (Criteria) this;
        }

        public Criteria andUdf051In(List<String> values) {
            addCriterion("UDF051 in", values, "udf051");
            return (Criteria) this;
        }

        public Criteria andUdf051NotIn(List<String> values) {
            addCriterion("UDF051 not in", values, "udf051");
            return (Criteria) this;
        }

        public Criteria andUdf051Between(String value1, String value2) {
            addCriterion("UDF051 between", value1, value2, "udf051");
            return (Criteria) this;
        }

        public Criteria andUdf051NotBetween(String value1, String value2) {
            addCriterion("UDF051 not between", value1, value2, "udf051");
            return (Criteria) this;
        }

        public Criteria andUdf052IsNull() {
            addCriterion("UDF052 is null");
            return (Criteria) this;
        }

        public Criteria andUdf052IsNotNull() {
            addCriterion("UDF052 is not null");
            return (Criteria) this;
        }

        public Criteria andUdf052EqualTo(String value) {
            addCriterion("UDF052 =", value, "udf052");
            return (Criteria) this;
        }

        public Criteria andUdf052NotEqualTo(String value) {
            addCriterion("UDF052 <>", value, "udf052");
            return (Criteria) this;
        }

        public Criteria andUdf052GreaterThan(String value) {
            addCriterion("UDF052 >", value, "udf052");
            return (Criteria) this;
        }

        public Criteria andUdf052GreaterThanOrEqualTo(String value) {
            addCriterion("UDF052 >=", value, "udf052");
            return (Criteria) this;
        }

        public Criteria andUdf052LessThan(String value) {
            addCriterion("UDF052 <", value, "udf052");
            return (Criteria) this;
        }

        public Criteria andUdf052LessThanOrEqualTo(String value) {
            addCriterion("UDF052 <=", value, "udf052");
            return (Criteria) this;
        }

        public Criteria andUdf052Like(String value) {
            addCriterion("UDF052 like", value, "udf052");
            return (Criteria) this;
        }

        public Criteria andUdf052NotLike(String value) {
            addCriterion("UDF052 not like", value, "udf052");
            return (Criteria) this;
        }

        public Criteria andUdf052In(List<String> values) {
            addCriterion("UDF052 in", values, "udf052");
            return (Criteria) this;
        }

        public Criteria andUdf052NotIn(List<String> values) {
            addCriterion("UDF052 not in", values, "udf052");
            return (Criteria) this;
        }

        public Criteria andUdf052Between(String value1, String value2) {
            addCriterion("UDF052 between", value1, value2, "udf052");
            return (Criteria) this;
        }

        public Criteria andUdf052NotBetween(String value1, String value2) {
            addCriterion("UDF052 not between", value1, value2, "udf052");
            return (Criteria) this;
        }

        public Criteria andUdf053IsNull() {
            addCriterion("UDF053 is null");
            return (Criteria) this;
        }

        public Criteria andUdf053IsNotNull() {
            addCriterion("UDF053 is not null");
            return (Criteria) this;
        }

        public Criteria andUdf053EqualTo(String value) {
            addCriterion("UDF053 =", value, "udf053");
            return (Criteria) this;
        }

        public Criteria andUdf053NotEqualTo(String value) {
            addCriterion("UDF053 <>", value, "udf053");
            return (Criteria) this;
        }

        public Criteria andUdf053GreaterThan(String value) {
            addCriterion("UDF053 >", value, "udf053");
            return (Criteria) this;
        }

        public Criteria andUdf053GreaterThanOrEqualTo(String value) {
            addCriterion("UDF053 >=", value, "udf053");
            return (Criteria) this;
        }

        public Criteria andUdf053LessThan(String value) {
            addCriterion("UDF053 <", value, "udf053");
            return (Criteria) this;
        }

        public Criteria andUdf053LessThanOrEqualTo(String value) {
            addCriterion("UDF053 <=", value, "udf053");
            return (Criteria) this;
        }

        public Criteria andUdf053Like(String value) {
            addCriterion("UDF053 like", value, "udf053");
            return (Criteria) this;
        }

        public Criteria andUdf053NotLike(String value) {
            addCriterion("UDF053 not like", value, "udf053");
            return (Criteria) this;
        }

        public Criteria andUdf053In(List<String> values) {
            addCriterion("UDF053 in", values, "udf053");
            return (Criteria) this;
        }

        public Criteria andUdf053NotIn(List<String> values) {
            addCriterion("UDF053 not in", values, "udf053");
            return (Criteria) this;
        }

        public Criteria andUdf053Between(String value1, String value2) {
            addCriterion("UDF053 between", value1, value2, "udf053");
            return (Criteria) this;
        }

        public Criteria andUdf053NotBetween(String value1, String value2) {
            addCriterion("UDF053 not between", value1, value2, "udf053");
            return (Criteria) this;
        }

        public Criteria andUdf054IsNull() {
            addCriterion("UDF054 is null");
            return (Criteria) this;
        }

        public Criteria andUdf054IsNotNull() {
            addCriterion("UDF054 is not null");
            return (Criteria) this;
        }

        public Criteria andUdf054EqualTo(String value) {
            addCriterion("UDF054 =", value, "udf054");
            return (Criteria) this;
        }

        public Criteria andUdf054NotEqualTo(String value) {
            addCriterion("UDF054 <>", value, "udf054");
            return (Criteria) this;
        }

        public Criteria andUdf054GreaterThan(String value) {
            addCriterion("UDF054 >", value, "udf054");
            return (Criteria) this;
        }

        public Criteria andUdf054GreaterThanOrEqualTo(String value) {
            addCriterion("UDF054 >=", value, "udf054");
            return (Criteria) this;
        }

        public Criteria andUdf054LessThan(String value) {
            addCriterion("UDF054 <", value, "udf054");
            return (Criteria) this;
        }

        public Criteria andUdf054LessThanOrEqualTo(String value) {
            addCriterion("UDF054 <=", value, "udf054");
            return (Criteria) this;
        }

        public Criteria andUdf054Like(String value) {
            addCriterion("UDF054 like", value, "udf054");
            return (Criteria) this;
        }

        public Criteria andUdf054NotLike(String value) {
            addCriterion("UDF054 not like", value, "udf054");
            return (Criteria) this;
        }

        public Criteria andUdf054In(List<String> values) {
            addCriterion("UDF054 in", values, "udf054");
            return (Criteria) this;
        }

        public Criteria andUdf054NotIn(List<String> values) {
            addCriterion("UDF054 not in", values, "udf054");
            return (Criteria) this;
        }

        public Criteria andUdf054Between(String value1, String value2) {
            addCriterion("UDF054 between", value1, value2, "udf054");
            return (Criteria) this;
        }

        public Criteria andUdf054NotBetween(String value1, String value2) {
            addCriterion("UDF054 not between", value1, value2, "udf054");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidIsNull() {
            addCriterion("ProcessInstanceId is null");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidIsNotNull() {
            addCriterion("ProcessInstanceId is not null");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidEqualTo(String value) {
            addCriterion("ProcessInstanceId =", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidNotEqualTo(String value) {
            addCriterion("ProcessInstanceId <>", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidGreaterThan(String value) {
            addCriterion("ProcessInstanceId >", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidGreaterThanOrEqualTo(String value) {
            addCriterion("ProcessInstanceId >=", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidLessThan(String value) {
            addCriterion("ProcessInstanceId <", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidLessThanOrEqualTo(String value) {
            addCriterion("ProcessInstanceId <=", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidLike(String value) {
            addCriterion("ProcessInstanceId like", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidNotLike(String value) {
            addCriterion("ProcessInstanceId not like", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidIn(List<String> values) {
            addCriterion("ProcessInstanceId in", values, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidNotIn(List<String> values) {
            addCriterion("ProcessInstanceId not in", values, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidBetween(String value1, String value2) {
            addCriterion("ProcessInstanceId between", value1, value2, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidNotBetween(String value1, String value2) {
            addCriterion("ProcessInstanceId not between", value1, value2, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CreateDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("CreateDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("CreateDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("CreateDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("CreateDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("CreateDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("CreateDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("CreateDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("CreateDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("CreateDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateIsNull() {
            addCriterion("LastModifiedDate is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateIsNotNull() {
            addCriterion("LastModifiedDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateEqualTo(Date value) {
            addCriterion("LastModifiedDate =", value, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateNotEqualTo(Date value) {
            addCriterion("LastModifiedDate <>", value, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateGreaterThan(Date value) {
            addCriterion("LastModifiedDate >", value, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateGreaterThanOrEqualTo(Date value) {
            addCriterion("LastModifiedDate >=", value, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateLessThan(Date value) {
            addCriterion("LastModifiedDate <", value, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateLessThanOrEqualTo(Date value) {
            addCriterion("LastModifiedDate <=", value, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateIn(List<Date> values) {
            addCriterion("LastModifiedDate in", values, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateNotIn(List<Date> values) {
            addCriterion("LastModifiedDate not in", values, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateBetween(Date value1, Date value2) {
            addCriterion("LastModifiedDate between", value1, value2, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andLastmodifieddateNotBetween(Date value1, Date value2) {
            addCriterion("LastModifiedDate not between", value1, value2, "lastmodifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateIsNull() {
            addCriterion("ModifiedDate is null");
            return (Criteria) this;
        }

        public Criteria andModifieddateIsNotNull() {
            addCriterion("ModifiedDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifieddateEqualTo(Date value) {
            addCriterion("ModifiedDate =", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateNotEqualTo(Date value) {
            addCriterion("ModifiedDate <>", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateGreaterThan(Date value) {
            addCriterion("ModifiedDate >", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateGreaterThanOrEqualTo(Date value) {
            addCriterion("ModifiedDate >=", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateLessThan(Date value) {
            addCriterion("ModifiedDate <", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateLessThanOrEqualTo(Date value) {
            addCriterion("ModifiedDate <=", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateIn(List<Date> values) {
            addCriterion("ModifiedDate in", values, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateNotIn(List<Date> values) {
            addCriterion("ModifiedDate not in", values, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateBetween(Date value1, Date value2) {
            addCriterion("ModifiedDate between", value1, value2, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateNotBetween(Date value1, Date value2) {
            addCriterion("ModifiedDate not between", value1, value2, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNull() {
            addCriterion("CreateBy is null");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNotNull() {
            addCriterion("CreateBy is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebyEqualTo(String value) {
            addCriterion("CreateBy =", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotEqualTo(String value) {
            addCriterion("CreateBy <>", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThan(String value) {
            addCriterion("CreateBy >", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThanOrEqualTo(String value) {
            addCriterion("CreateBy >=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThan(String value) {
            addCriterion("CreateBy <", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThanOrEqualTo(String value) {
            addCriterion("CreateBy <=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLike(String value) {
            addCriterion("CreateBy like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotLike(String value) {
            addCriterion("CreateBy not like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyIn(List<String> values) {
            addCriterion("CreateBy in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotIn(List<String> values) {
            addCriterion("CreateBy not in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyBetween(String value1, String value2) {
            addCriterion("CreateBy between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotBetween(String value1, String value2) {
            addCriterion("CreateBy not between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyIsNull() {
            addCriterion("LastModifiedBy is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyIsNotNull() {
            addCriterion("LastModifiedBy is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyEqualTo(String value) {
            addCriterion("LastModifiedBy =", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyNotEqualTo(String value) {
            addCriterion("LastModifiedBy <>", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyGreaterThan(String value) {
            addCriterion("LastModifiedBy >", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyGreaterThanOrEqualTo(String value) {
            addCriterion("LastModifiedBy >=", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyLessThan(String value) {
            addCriterion("LastModifiedBy <", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyLessThanOrEqualTo(String value) {
            addCriterion("LastModifiedBy <=", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyLike(String value) {
            addCriterion("LastModifiedBy like", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyNotLike(String value) {
            addCriterion("LastModifiedBy not like", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyIn(List<String> values) {
            addCriterion("LastModifiedBy in", values, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyNotIn(List<String> values) {
            addCriterion("LastModifiedBy not in", values, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyBetween(String value1, String value2) {
            addCriterion("LastModifiedBy between", value1, value2, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyNotBetween(String value1, String value2) {
            addCriterion("LastModifiedBy not between", value1, value2, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andModifiedbyIsNull() {
            addCriterion("ModifiedBy is null");
            return (Criteria) this;
        }

        public Criteria andModifiedbyIsNotNull() {
            addCriterion("ModifiedBy is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedbyEqualTo(String value) {
            addCriterion("ModifiedBy =", value, "modifiedby");
            return (Criteria) this;
        }

        public Criteria andModifiedbyNotEqualTo(String value) {
            addCriterion("ModifiedBy <>", value, "modifiedby");
            return (Criteria) this;
        }

        public Criteria andModifiedbyGreaterThan(String value) {
            addCriterion("ModifiedBy >", value, "modifiedby");
            return (Criteria) this;
        }

        public Criteria andModifiedbyGreaterThanOrEqualTo(String value) {
            addCriterion("ModifiedBy >=", value, "modifiedby");
            return (Criteria) this;
        }

        public Criteria andModifiedbyLessThan(String value) {
            addCriterion("ModifiedBy <", value, "modifiedby");
            return (Criteria) this;
        }

        public Criteria andModifiedbyLessThanOrEqualTo(String value) {
            addCriterion("ModifiedBy <=", value, "modifiedby");
            return (Criteria) this;
        }

        public Criteria andModifiedbyLike(String value) {
            addCriterion("ModifiedBy like", value, "modifiedby");
            return (Criteria) this;
        }

        public Criteria andModifiedbyNotLike(String value) {
            addCriterion("ModifiedBy not like", value, "modifiedby");
            return (Criteria) this;
        }

        public Criteria andModifiedbyIn(List<String> values) {
            addCriterion("ModifiedBy in", values, "modifiedby");
            return (Criteria) this;
        }

        public Criteria andModifiedbyNotIn(List<String> values) {
            addCriterion("ModifiedBy not in", values, "modifiedby");
            return (Criteria) this;
        }

        public Criteria andModifiedbyBetween(String value1, String value2) {
            addCriterion("ModifiedBy between", value1, value2, "modifiedby");
            return (Criteria) this;
        }

        public Criteria andModifiedbyNotBetween(String value1, String value2) {
            addCriterion("ModifiedBy not between", value1, value2, "modifiedby");
            return (Criteria) this;
        }

        public Criteria andApprovestatusIsNull() {
            addCriterion("ApproveStatus is null");
            return (Criteria) this;
        }

        public Criteria andApprovestatusIsNotNull() {
            addCriterion("ApproveStatus is not null");
            return (Criteria) this;
        }

        public Criteria andApprovestatusEqualTo(String value) {
            addCriterion("ApproveStatus =", value, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusNotEqualTo(String value) {
            addCriterion("ApproveStatus <>", value, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusGreaterThan(String value) {
            addCriterion("ApproveStatus >", value, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusGreaterThanOrEqualTo(String value) {
            addCriterion("ApproveStatus >=", value, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusLessThan(String value) {
            addCriterion("ApproveStatus <", value, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusLessThanOrEqualTo(String value) {
            addCriterion("ApproveStatus <=", value, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusLike(String value) {
            addCriterion("ApproveStatus like", value, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusNotLike(String value) {
            addCriterion("ApproveStatus not like", value, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusIn(List<String> values) {
            addCriterion("ApproveStatus in", values, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusNotIn(List<String> values) {
            addCriterion("ApproveStatus not in", values, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusBetween(String value1, String value2) {
            addCriterion("ApproveStatus between", value1, value2, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusNotBetween(String value1, String value2) {
            addCriterion("ApproveStatus not between", value1, value2, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovedateIsNull() {
            addCriterion("ApproveDate is null");
            return (Criteria) this;
        }

        public Criteria andApprovedateIsNotNull() {
            addCriterion("ApproveDate is not null");
            return (Criteria) this;
        }

        public Criteria andApprovedateEqualTo(Date value) {
            addCriterion("ApproveDate =", value, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateNotEqualTo(Date value) {
            addCriterion("ApproveDate <>", value, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateGreaterThan(Date value) {
            addCriterion("ApproveDate >", value, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateGreaterThanOrEqualTo(Date value) {
            addCriterion("ApproveDate >=", value, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateLessThan(Date value) {
            addCriterion("ApproveDate <", value, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateLessThanOrEqualTo(Date value) {
            addCriterion("ApproveDate <=", value, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateIn(List<Date> values) {
            addCriterion("ApproveDate in", values, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateNotIn(List<Date> values) {
            addCriterion("ApproveDate not in", values, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateBetween(Date value1, Date value2) {
            addCriterion("ApproveDate between", value1, value2, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateNotBetween(Date value1, Date value2) {
            addCriterion("ApproveDate not between", value1, value2, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovebyIsNull() {
            addCriterion("ApproveBy is null");
            return (Criteria) this;
        }

        public Criteria andApprovebyIsNotNull() {
            addCriterion("ApproveBy is not null");
            return (Criteria) this;
        }

        public Criteria andApprovebyEqualTo(String value) {
            addCriterion("ApproveBy =", value, "approveby");
            return (Criteria) this;
        }

        public Criteria andApprovebyNotEqualTo(String value) {
            addCriterion("ApproveBy <>", value, "approveby");
            return (Criteria) this;
        }

        public Criteria andApprovebyGreaterThan(String value) {
            addCriterion("ApproveBy >", value, "approveby");
            return (Criteria) this;
        }

        public Criteria andApprovebyGreaterThanOrEqualTo(String value) {
            addCriterion("ApproveBy >=", value, "approveby");
            return (Criteria) this;
        }

        public Criteria andApprovebyLessThan(String value) {
            addCriterion("ApproveBy <", value, "approveby");
            return (Criteria) this;
        }

        public Criteria andApprovebyLessThanOrEqualTo(String value) {
            addCriterion("ApproveBy <=", value, "approveby");
            return (Criteria) this;
        }

        public Criteria andApprovebyLike(String value) {
            addCriterion("ApproveBy like", value, "approveby");
            return (Criteria) this;
        }

        public Criteria andApprovebyNotLike(String value) {
            addCriterion("ApproveBy not like", value, "approveby");
            return (Criteria) this;
        }

        public Criteria andApprovebyIn(List<String> values) {
            addCriterion("ApproveBy in", values, "approveby");
            return (Criteria) this;
        }

        public Criteria andApprovebyNotIn(List<String> values) {
            addCriterion("ApproveBy not in", values, "approveby");
            return (Criteria) this;
        }

        public Criteria andApprovebyBetween(String value1, String value2) {
            addCriterion("ApproveBy between", value1, value2, "approveby");
            return (Criteria) this;
        }

        public Criteria andApprovebyNotBetween(String value1, String value2) {
            addCriterion("ApproveBy not between", value1, value2, "approveby");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgRtkIsNull() {
            addCriterion("Owner_Org_RTK is null");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgRtkIsNotNull() {
            addCriterion("Owner_Org_RTK is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgRtkEqualTo(String value) {
            addCriterion("Owner_Org_RTK =", value, "ownerOrgRtk");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgRtkNotEqualTo(String value) {
            addCriterion("Owner_Org_RTK <>", value, "ownerOrgRtk");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgRtkGreaterThan(String value) {
            addCriterion("Owner_Org_RTK >", value, "ownerOrgRtk");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgRtkGreaterThanOrEqualTo(String value) {
            addCriterion("Owner_Org_RTK >=", value, "ownerOrgRtk");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgRtkLessThan(String value) {
            addCriterion("Owner_Org_RTK <", value, "ownerOrgRtk");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgRtkLessThanOrEqualTo(String value) {
            addCriterion("Owner_Org_RTK <=", value, "ownerOrgRtk");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgRtkLike(String value) {
            addCriterion("Owner_Org_RTK like", value, "ownerOrgRtk");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgRtkNotLike(String value) {
            addCriterion("Owner_Org_RTK not like", value, "ownerOrgRtk");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgRtkIn(List<String> values) {
            addCriterion("Owner_Org_RTK in", values, "ownerOrgRtk");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgRtkNotIn(List<String> values) {
            addCriterion("Owner_Org_RTK not in", values, "ownerOrgRtk");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgRtkBetween(String value1, String value2) {
            addCriterion("Owner_Org_RTK between", value1, value2, "ownerOrgRtk");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgRtkNotBetween(String value1, String value2) {
            addCriterion("Owner_Org_RTK not between", value1, value2, "ownerOrgRtk");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgRoidIsNull() {
            addCriterion("Owner_Org_ROid is null");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgRoidIsNotNull() {
            addCriterion("Owner_Org_ROid is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgRoidEqualTo(String value) {
            addCriterion("Owner_Org_ROid =", value, "ownerOrgRoid");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgRoidNotEqualTo(String value) {
            addCriterion("Owner_Org_ROid <>", value, "ownerOrgRoid");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgRoidGreaterThan(String value) {
            addCriterion("Owner_Org_ROid >", value, "ownerOrgRoid");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgRoidGreaterThanOrEqualTo(String value) {
            addCriterion("Owner_Org_ROid >=", value, "ownerOrgRoid");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgRoidLessThan(String value) {
            addCriterion("Owner_Org_ROid <", value, "ownerOrgRoid");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgRoidLessThanOrEqualTo(String value) {
            addCriterion("Owner_Org_ROid <=", value, "ownerOrgRoid");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgRoidLike(String value) {
            addCriterion("Owner_Org_ROid like", value, "ownerOrgRoid");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgRoidNotLike(String value) {
            addCriterion("Owner_Org_ROid not like", value, "ownerOrgRoid");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgRoidIn(List<String> values) {
            addCriterion("Owner_Org_ROid in", values, "ownerOrgRoid");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgRoidNotIn(List<String> values) {
            addCriterion("Owner_Org_ROid not in", values, "ownerOrgRoid");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgRoidBetween(String value1, String value2) {
            addCriterion("Owner_Org_ROid between", value1, value2, "ownerOrgRoid");
            return (Criteria) this;
        }

        public Criteria andOwnerOrgRoidNotBetween(String value1, String value2) {
            addCriterion("Owner_Org_ROid not between", value1, value2, "ownerOrgRoid");
            return (Criteria) this;
        }

        public Criteria andBpmLdapIsNull() {
            addCriterion("BPM_LDAP is null");
            return (Criteria) this;
        }

        public Criteria andBpmLdapIsNotNull() {
            addCriterion("BPM_LDAP is not null");
            return (Criteria) this;
        }

        public Criteria andBpmLdapEqualTo(String value) {
            addCriterion("BPM_LDAP =", value, "bpmLdap");
            return (Criteria) this;
        }

        public Criteria andBpmLdapNotEqualTo(String value) {
            addCriterion("BPM_LDAP <>", value, "bpmLdap");
            return (Criteria) this;
        }

        public Criteria andBpmLdapGreaterThan(String value) {
            addCriterion("BPM_LDAP >", value, "bpmLdap");
            return (Criteria) this;
        }

        public Criteria andBpmLdapGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_LDAP >=", value, "bpmLdap");
            return (Criteria) this;
        }

        public Criteria andBpmLdapLessThan(String value) {
            addCriterion("BPM_LDAP <", value, "bpmLdap");
            return (Criteria) this;
        }

        public Criteria andBpmLdapLessThanOrEqualTo(String value) {
            addCriterion("BPM_LDAP <=", value, "bpmLdap");
            return (Criteria) this;
        }

        public Criteria andBpmLdapLike(String value) {
            addCriterion("BPM_LDAP like", value, "bpmLdap");
            return (Criteria) this;
        }

        public Criteria andBpmLdapNotLike(String value) {
            addCriterion("BPM_LDAP not like", value, "bpmLdap");
            return (Criteria) this;
        }

        public Criteria andBpmLdapIn(List<String> values) {
            addCriterion("BPM_LDAP in", values, "bpmLdap");
            return (Criteria) this;
        }

        public Criteria andBpmLdapNotIn(List<String> values) {
            addCriterion("BPM_LDAP not in", values, "bpmLdap");
            return (Criteria) this;
        }

        public Criteria andBpmLdapBetween(String value1, String value2) {
            addCriterion("BPM_LDAP between", value1, value2, "bpmLdap");
            return (Criteria) this;
        }

        public Criteria andBpmLdapNotBetween(String value1, String value2) {
            addCriterion("BPM_LDAP not between", value1, value2, "bpmLdap");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}