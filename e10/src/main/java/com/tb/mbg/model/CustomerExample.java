package com.tb.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCustomerBusinessIdIsNull() {
            addCriterion("CUSTOMER_BUSINESS_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerBusinessIdIsNotNull() {
            addCriterion("CUSTOMER_BUSINESS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerBusinessIdEqualTo(String value) {
            addCriterion("CUSTOMER_BUSINESS_ID =", value, "customerBusinessId");
            return (Criteria) this;
        }

        public Criteria andCustomerBusinessIdNotEqualTo(String value) {
            addCriterion("CUSTOMER_BUSINESS_ID <>", value, "customerBusinessId");
            return (Criteria) this;
        }

        public Criteria andCustomerBusinessIdGreaterThan(String value) {
            addCriterion("CUSTOMER_BUSINESS_ID >", value, "customerBusinessId");
            return (Criteria) this;
        }

        public Criteria andCustomerBusinessIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_BUSINESS_ID >=", value, "customerBusinessId");
            return (Criteria) this;
        }

        public Criteria andCustomerBusinessIdLessThan(String value) {
            addCriterion("CUSTOMER_BUSINESS_ID <", value, "customerBusinessId");
            return (Criteria) this;
        }

        public Criteria andCustomerBusinessIdLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_BUSINESS_ID <=", value, "customerBusinessId");
            return (Criteria) this;
        }

        public Criteria andCustomerBusinessIdLike(String value) {
            addCriterion("CUSTOMER_BUSINESS_ID like", value, "customerBusinessId");
            return (Criteria) this;
        }

        public Criteria andCustomerBusinessIdNotLike(String value) {
            addCriterion("CUSTOMER_BUSINESS_ID not like", value, "customerBusinessId");
            return (Criteria) this;
        }

        public Criteria andCustomerBusinessIdIn(List<String> values) {
            addCriterion("CUSTOMER_BUSINESS_ID in", values, "customerBusinessId");
            return (Criteria) this;
        }

        public Criteria andCustomerBusinessIdNotIn(List<String> values) {
            addCriterion("CUSTOMER_BUSINESS_ID not in", values, "customerBusinessId");
            return (Criteria) this;
        }

        public Criteria andCustomerBusinessIdBetween(String value1, String value2) {
            addCriterion("CUSTOMER_BUSINESS_ID between", value1, value2, "customerBusinessId");
            return (Criteria) this;
        }

        public Criteria andCustomerBusinessIdNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_BUSINESS_ID not between", value1, value2, "customerBusinessId");
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

        public Criteria andCustomerCodeIsNull() {
            addCriterion("CUSTOMER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIsNotNull() {
            addCriterion("CUSTOMER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeEqualTo(String value) {
            addCriterion("CUSTOMER_CODE =", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotEqualTo(String value) {
            addCriterion("CUSTOMER_CODE <>", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeGreaterThan(String value) {
            addCriterion("CUSTOMER_CODE >", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_CODE >=", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLessThan(String value) {
            addCriterion("CUSTOMER_CODE <", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_CODE <=", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLike(String value) {
            addCriterion("CUSTOMER_CODE like", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotLike(String value) {
            addCriterion("CUSTOMER_CODE not like", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIn(List<String> values) {
            addCriterion("CUSTOMER_CODE in", values, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotIn(List<String> values) {
            addCriterion("CUSTOMER_CODE not in", values, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeBetween(String value1, String value2) {
            addCriterion("CUSTOMER_CODE between", value1, value2, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_CODE not between", value1, value2, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("CUSTOMER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("CUSTOMER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("CUSTOMER_NAME =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("CUSTOMER_NAME >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("CUSTOMER_NAME <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("CUSTOMER_NAME like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("CUSTOMER_NAME not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("CUSTOMER_NAME in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("CUSTOMER_NAME not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andShortcutIsNull() {
            addCriterion("SHORTCUT is null");
            return (Criteria) this;
        }

        public Criteria andShortcutIsNotNull() {
            addCriterion("SHORTCUT is not null");
            return (Criteria) this;
        }

        public Criteria andShortcutEqualTo(String value) {
            addCriterion("SHORTCUT =", value, "shortcut");
            return (Criteria) this;
        }

        public Criteria andShortcutNotEqualTo(String value) {
            addCriterion("SHORTCUT <>", value, "shortcut");
            return (Criteria) this;
        }

        public Criteria andShortcutGreaterThan(String value) {
            addCriterion("SHORTCUT >", value, "shortcut");
            return (Criteria) this;
        }

        public Criteria andShortcutGreaterThanOrEqualTo(String value) {
            addCriterion("SHORTCUT >=", value, "shortcut");
            return (Criteria) this;
        }

        public Criteria andShortcutLessThan(String value) {
            addCriterion("SHORTCUT <", value, "shortcut");
            return (Criteria) this;
        }

        public Criteria andShortcutLessThanOrEqualTo(String value) {
            addCriterion("SHORTCUT <=", value, "shortcut");
            return (Criteria) this;
        }

        public Criteria andShortcutLike(String value) {
            addCriterion("SHORTCUT like", value, "shortcut");
            return (Criteria) this;
        }

        public Criteria andShortcutNotLike(String value) {
            addCriterion("SHORTCUT not like", value, "shortcut");
            return (Criteria) this;
        }

        public Criteria andShortcutIn(List<String> values) {
            addCriterion("SHORTCUT in", values, "shortcut");
            return (Criteria) this;
        }

        public Criteria andShortcutNotIn(List<String> values) {
            addCriterion("SHORTCUT not in", values, "shortcut");
            return (Criteria) this;
        }

        public Criteria andShortcutBetween(String value1, String value2) {
            addCriterion("SHORTCUT between", value1, value2, "shortcut");
            return (Criteria) this;
        }

        public Criteria andShortcutNotBetween(String value1, String value2) {
            addCriterion("SHORTCUT not between", value1, value2, "shortcut");
            return (Criteria) this;
        }

        public Criteria andCapitalIsNull() {
            addCriterion("CAPITAL is null");
            return (Criteria) this;
        }

        public Criteria andCapitalIsNotNull() {
            addCriterion("CAPITAL is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalEqualTo(BigDecimal value) {
            addCriterion("CAPITAL =", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotEqualTo(BigDecimal value) {
            addCriterion("CAPITAL <>", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThan(BigDecimal value) {
            addCriterion("CAPITAL >", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CAPITAL >=", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThan(BigDecimal value) {
            addCriterion("CAPITAL <", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CAPITAL <=", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalIn(List<BigDecimal> values) {
            addCriterion("CAPITAL in", values, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotIn(List<BigDecimal> values) {
            addCriterion("CAPITAL not in", values, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CAPITAL between", value1, value2, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CAPITAL not between", value1, value2, "capital");
            return (Criteria) this;
        }

        public Criteria andTurnoverIsNull() {
            addCriterion("TURNOVER is null");
            return (Criteria) this;
        }

        public Criteria andTurnoverIsNotNull() {
            addCriterion("TURNOVER is not null");
            return (Criteria) this;
        }

        public Criteria andTurnoverEqualTo(BigDecimal value) {
            addCriterion("TURNOVER =", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverNotEqualTo(BigDecimal value) {
            addCriterion("TURNOVER <>", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverGreaterThan(BigDecimal value) {
            addCriterion("TURNOVER >", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TURNOVER >=", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverLessThan(BigDecimal value) {
            addCriterion("TURNOVER <", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TURNOVER <=", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverIn(List<BigDecimal> values) {
            addCriterion("TURNOVER in", values, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverNotIn(List<BigDecimal> values) {
            addCriterion("TURNOVER not in", values, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TURNOVER between", value1, value2, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TURNOVER not between", value1, value2, "turnover");
            return (Criteria) this;
        }

        public Criteria andStaffsIsNull() {
            addCriterion("STAFFS is null");
            return (Criteria) this;
        }

        public Criteria andStaffsIsNotNull() {
            addCriterion("STAFFS is not null");
            return (Criteria) this;
        }

        public Criteria andStaffsEqualTo(Integer value) {
            addCriterion("STAFFS =", value, "staffs");
            return (Criteria) this;
        }

        public Criteria andStaffsNotEqualTo(Integer value) {
            addCriterion("STAFFS <>", value, "staffs");
            return (Criteria) this;
        }

        public Criteria andStaffsGreaterThan(Integer value) {
            addCriterion("STAFFS >", value, "staffs");
            return (Criteria) this;
        }

        public Criteria andStaffsGreaterThanOrEqualTo(Integer value) {
            addCriterion("STAFFS >=", value, "staffs");
            return (Criteria) this;
        }

        public Criteria andStaffsLessThan(Integer value) {
            addCriterion("STAFFS <", value, "staffs");
            return (Criteria) this;
        }

        public Criteria andStaffsLessThanOrEqualTo(Integer value) {
            addCriterion("STAFFS <=", value, "staffs");
            return (Criteria) this;
        }

        public Criteria andStaffsIn(List<Integer> values) {
            addCriterion("STAFFS in", values, "staffs");
            return (Criteria) this;
        }

        public Criteria andStaffsNotIn(List<Integer> values) {
            addCriterion("STAFFS not in", values, "staffs");
            return (Criteria) this;
        }

        public Criteria andStaffsBetween(Integer value1, Integer value2) {
            addCriterion("STAFFS between", value1, value2, "staffs");
            return (Criteria) this;
        }

        public Criteria andStaffsNotBetween(Integer value1, Integer value2) {
            addCriterion("STAFFS not between", value1, value2, "staffs");
            return (Criteria) this;
        }

        public Criteria andSetupDateIsNull() {
            addCriterion("SETUP_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSetupDateIsNotNull() {
            addCriterion("SETUP_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSetupDateEqualTo(Date value) {
            addCriterion("SETUP_DATE =", value, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateNotEqualTo(Date value) {
            addCriterion("SETUP_DATE <>", value, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateGreaterThan(Date value) {
            addCriterion("SETUP_DATE >", value, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SETUP_DATE >=", value, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateLessThan(Date value) {
            addCriterion("SETUP_DATE <", value, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateLessThanOrEqualTo(Date value) {
            addCriterion("SETUP_DATE <=", value, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateIn(List<Date> values) {
            addCriterion("SETUP_DATE in", values, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateNotIn(List<Date> values) {
            addCriterion("SETUP_DATE not in", values, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateBetween(Date value1, Date value2) {
            addCriterion("SETUP_DATE between", value1, value2, "setupDate");
            return (Criteria) this;
        }

        public Criteria andSetupDateNotBetween(Date value1, Date value2) {
            addCriterion("SETUP_DATE not between", value1, value2, "setupDate");
            return (Criteria) this;
        }

        public Criteria andShutoutDateIsNull() {
            addCriterion("SHUTOUT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andShutoutDateIsNotNull() {
            addCriterion("SHUTOUT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andShutoutDateEqualTo(Date value) {
            addCriterion("SHUTOUT_DATE =", value, "shutoutDate");
            return (Criteria) this;
        }

        public Criteria andShutoutDateNotEqualTo(Date value) {
            addCriterion("SHUTOUT_DATE <>", value, "shutoutDate");
            return (Criteria) this;
        }

        public Criteria andShutoutDateGreaterThan(Date value) {
            addCriterion("SHUTOUT_DATE >", value, "shutoutDate");
            return (Criteria) this;
        }

        public Criteria andShutoutDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SHUTOUT_DATE >=", value, "shutoutDate");
            return (Criteria) this;
        }

        public Criteria andShutoutDateLessThan(Date value) {
            addCriterion("SHUTOUT_DATE <", value, "shutoutDate");
            return (Criteria) this;
        }

        public Criteria andShutoutDateLessThanOrEqualTo(Date value) {
            addCriterion("SHUTOUT_DATE <=", value, "shutoutDate");
            return (Criteria) this;
        }

        public Criteria andShutoutDateIn(List<Date> values) {
            addCriterion("SHUTOUT_DATE in", values, "shutoutDate");
            return (Criteria) this;
        }

        public Criteria andShutoutDateNotIn(List<Date> values) {
            addCriterion("SHUTOUT_DATE not in", values, "shutoutDate");
            return (Criteria) this;
        }

        public Criteria andShutoutDateBetween(Date value1, Date value2) {
            addCriterion("SHUTOUT_DATE between", value1, value2, "shutoutDate");
            return (Criteria) this;
        }

        public Criteria andShutoutDateNotBetween(Date value1, Date value2) {
            addCriterion("SHUTOUT_DATE not between", value1, value2, "shutoutDate");
            return (Criteria) this;
        }

        public Criteria andBranchesIsNull() {
            addCriterion("BRANCHES is null");
            return (Criteria) this;
        }

        public Criteria andBranchesIsNotNull() {
            addCriterion("BRANCHES is not null");
            return (Criteria) this;
        }

        public Criteria andBranchesEqualTo(Integer value) {
            addCriterion("BRANCHES =", value, "branches");
            return (Criteria) this;
        }

        public Criteria andBranchesNotEqualTo(Integer value) {
            addCriterion("BRANCHES <>", value, "branches");
            return (Criteria) this;
        }

        public Criteria andBranchesGreaterThan(Integer value) {
            addCriterion("BRANCHES >", value, "branches");
            return (Criteria) this;
        }

        public Criteria andBranchesGreaterThanOrEqualTo(Integer value) {
            addCriterion("BRANCHES >=", value, "branches");
            return (Criteria) this;
        }

        public Criteria andBranchesLessThan(Integer value) {
            addCriterion("BRANCHES <", value, "branches");
            return (Criteria) this;
        }

        public Criteria andBranchesLessThanOrEqualTo(Integer value) {
            addCriterion("BRANCHES <=", value, "branches");
            return (Criteria) this;
        }

        public Criteria andBranchesIn(List<Integer> values) {
            addCriterion("BRANCHES in", values, "branches");
            return (Criteria) this;
        }

        public Criteria andBranchesNotIn(List<Integer> values) {
            addCriterion("BRANCHES not in", values, "branches");
            return (Criteria) this;
        }

        public Criteria andBranchesBetween(Integer value1, Integer value2) {
            addCriterion("BRANCHES between", value1, value2, "branches");
            return (Criteria) this;
        }

        public Criteria andBranchesNotBetween(Integer value1, Integer value2) {
            addCriterion("BRANCHES not between", value1, value2, "branches");
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

        public Criteria andCustomerFullNameIsNull() {
            addCriterion("CUSTOMER_FULL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomerFullNameIsNotNull() {
            addCriterion("CUSTOMER_FULL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerFullNameEqualTo(String value) {
            addCriterion("CUSTOMER_FULL_NAME =", value, "customerFullName");
            return (Criteria) this;
        }

        public Criteria andCustomerFullNameNotEqualTo(String value) {
            addCriterion("CUSTOMER_FULL_NAME <>", value, "customerFullName");
            return (Criteria) this;
        }

        public Criteria andCustomerFullNameGreaterThan(String value) {
            addCriterion("CUSTOMER_FULL_NAME >", value, "customerFullName");
            return (Criteria) this;
        }

        public Criteria andCustomerFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_FULL_NAME >=", value, "customerFullName");
            return (Criteria) this;
        }

        public Criteria andCustomerFullNameLessThan(String value) {
            addCriterion("CUSTOMER_FULL_NAME <", value, "customerFullName");
            return (Criteria) this;
        }

        public Criteria andCustomerFullNameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_FULL_NAME <=", value, "customerFullName");
            return (Criteria) this;
        }

        public Criteria andCustomerFullNameLike(String value) {
            addCriterion("CUSTOMER_FULL_NAME like", value, "customerFullName");
            return (Criteria) this;
        }

        public Criteria andCustomerFullNameNotLike(String value) {
            addCriterion("CUSTOMER_FULL_NAME not like", value, "customerFullName");
            return (Criteria) this;
        }

        public Criteria andCustomerFullNameIn(List<String> values) {
            addCriterion("CUSTOMER_FULL_NAME in", values, "customerFullName");
            return (Criteria) this;
        }

        public Criteria andCustomerFullNameNotIn(List<String> values) {
            addCriterion("CUSTOMER_FULL_NAME not in", values, "customerFullName");
            return (Criteria) this;
        }

        public Criteria andCustomerFullNameBetween(String value1, String value2) {
            addCriterion("CUSTOMER_FULL_NAME between", value1, value2, "customerFullName");
            return (Criteria) this;
        }

        public Criteria andCustomerFullNameNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_FULL_NAME not between", value1, value2, "customerFullName");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNull() {
            addCriterion("PRINCIPAL is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNotNull() {
            addCriterion("PRINCIPAL is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalEqualTo(String value) {
            addCriterion("PRINCIPAL =", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotEqualTo(String value) {
            addCriterion("PRINCIPAL <>", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThan(String value) {
            addCriterion("PRINCIPAL >", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("PRINCIPAL >=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThan(String value) {
            addCriterion("PRINCIPAL <", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThanOrEqualTo(String value) {
            addCriterion("PRINCIPAL <=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLike(String value) {
            addCriterion("PRINCIPAL like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotLike(String value) {
            addCriterion("PRINCIPAL not like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalIn(List<String> values) {
            addCriterion("PRINCIPAL in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotIn(List<String> values) {
            addCriterion("PRINCIPAL not in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalBetween(String value1, String value2) {
            addCriterion("PRINCIPAL between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotBetween(String value1, String value2) {
            addCriterion("PRINCIPAL not between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andRegAddressIsNull() {
            addCriterion("REG_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andRegAddressIsNotNull() {
            addCriterion("REG_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andRegAddressEqualTo(String value) {
            addCriterion("REG_ADDRESS =", value, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressNotEqualTo(String value) {
            addCriterion("REG_ADDRESS <>", value, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressGreaterThan(String value) {
            addCriterion("REG_ADDRESS >", value, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressGreaterThanOrEqualTo(String value) {
            addCriterion("REG_ADDRESS >=", value, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressLessThan(String value) {
            addCriterion("REG_ADDRESS <", value, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressLessThanOrEqualTo(String value) {
            addCriterion("REG_ADDRESS <=", value, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressLike(String value) {
            addCriterion("REG_ADDRESS like", value, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressNotLike(String value) {
            addCriterion("REG_ADDRESS not like", value, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressIn(List<String> values) {
            addCriterion("REG_ADDRESS in", values, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressNotIn(List<String> values) {
            addCriterion("REG_ADDRESS not in", values, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressBetween(String value1, String value2) {
            addCriterion("REG_ADDRESS between", value1, value2, "regAddress");
            return (Criteria) this;
        }

        public Criteria andRegAddressNotBetween(String value1, String value2) {
            addCriterion("REG_ADDRESS not between", value1, value2, "regAddress");
            return (Criteria) this;
        }

        public Criteria andInnerCustomerIsNull() {
            addCriterion("INNER_CUSTOMER is null");
            return (Criteria) this;
        }

        public Criteria andInnerCustomerIsNotNull() {
            addCriterion("INNER_CUSTOMER is not null");
            return (Criteria) this;
        }

        public Criteria andInnerCustomerEqualTo(Boolean value) {
            addCriterion("INNER_CUSTOMER =", value, "innerCustomer");
            return (Criteria) this;
        }

        public Criteria andInnerCustomerNotEqualTo(Boolean value) {
            addCriterion("INNER_CUSTOMER <>", value, "innerCustomer");
            return (Criteria) this;
        }

        public Criteria andInnerCustomerGreaterThan(Boolean value) {
            addCriterion("INNER_CUSTOMER >", value, "innerCustomer");
            return (Criteria) this;
        }

        public Criteria andInnerCustomerGreaterThanOrEqualTo(Boolean value) {
            addCriterion("INNER_CUSTOMER >=", value, "innerCustomer");
            return (Criteria) this;
        }

        public Criteria andInnerCustomerLessThan(Boolean value) {
            addCriterion("INNER_CUSTOMER <", value, "innerCustomer");
            return (Criteria) this;
        }

        public Criteria andInnerCustomerLessThanOrEqualTo(Boolean value) {
            addCriterion("INNER_CUSTOMER <=", value, "innerCustomer");
            return (Criteria) this;
        }

        public Criteria andInnerCustomerIn(List<Boolean> values) {
            addCriterion("INNER_CUSTOMER in", values, "innerCustomer");
            return (Criteria) this;
        }

        public Criteria andInnerCustomerNotIn(List<Boolean> values) {
            addCriterion("INNER_CUSTOMER not in", values, "innerCustomer");
            return (Criteria) this;
        }

        public Criteria andInnerCustomerBetween(Boolean value1, Boolean value2) {
            addCriterion("INNER_CUSTOMER between", value1, value2, "innerCustomer");
            return (Criteria) this;
        }

        public Criteria andInnerCustomerNotBetween(Boolean value1, Boolean value2) {
            addCriterion("INNER_CUSTOMER not between", value1, value2, "innerCustomer");
            return (Criteria) this;
        }

        public Criteria andBpClusterIdIsNull() {
            addCriterion("BP_CLUSTER_ID is null");
            return (Criteria) this;
        }

        public Criteria andBpClusterIdIsNotNull() {
            addCriterion("BP_CLUSTER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBpClusterIdEqualTo(String value) {
            addCriterion("BP_CLUSTER_ID =", value, "bpClusterId");
            return (Criteria) this;
        }

        public Criteria andBpClusterIdNotEqualTo(String value) {
            addCriterion("BP_CLUSTER_ID <>", value, "bpClusterId");
            return (Criteria) this;
        }

        public Criteria andBpClusterIdGreaterThan(String value) {
            addCriterion("BP_CLUSTER_ID >", value, "bpClusterId");
            return (Criteria) this;
        }

        public Criteria andBpClusterIdGreaterThanOrEqualTo(String value) {
            addCriterion("BP_CLUSTER_ID >=", value, "bpClusterId");
            return (Criteria) this;
        }

        public Criteria andBpClusterIdLessThan(String value) {
            addCriterion("BP_CLUSTER_ID <", value, "bpClusterId");
            return (Criteria) this;
        }

        public Criteria andBpClusterIdLessThanOrEqualTo(String value) {
            addCriterion("BP_CLUSTER_ID <=", value, "bpClusterId");
            return (Criteria) this;
        }

        public Criteria andBpClusterIdLike(String value) {
            addCriterion("BP_CLUSTER_ID like", value, "bpClusterId");
            return (Criteria) this;
        }

        public Criteria andBpClusterIdNotLike(String value) {
            addCriterion("BP_CLUSTER_ID not like", value, "bpClusterId");
            return (Criteria) this;
        }

        public Criteria andBpClusterIdIn(List<String> values) {
            addCriterion("BP_CLUSTER_ID in", values, "bpClusterId");
            return (Criteria) this;
        }

        public Criteria andBpClusterIdNotIn(List<String> values) {
            addCriterion("BP_CLUSTER_ID not in", values, "bpClusterId");
            return (Criteria) this;
        }

        public Criteria andBpClusterIdBetween(String value1, String value2) {
            addCriterion("BP_CLUSTER_ID between", value1, value2, "bpClusterId");
            return (Criteria) this;
        }

        public Criteria andBpClusterIdNotBetween(String value1, String value2) {
            addCriterion("BP_CLUSTER_ID not between", value1, value2, "bpClusterId");
            return (Criteria) this;
        }

        public Criteria andCapitalCurrencyIdIsNull() {
            addCriterion("CAPITAL_CURRENCY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCapitalCurrencyIdIsNotNull() {
            addCriterion("CAPITAL_CURRENCY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalCurrencyIdEqualTo(String value) {
            addCriterion("CAPITAL_CURRENCY_ID =", value, "capitalCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCapitalCurrencyIdNotEqualTo(String value) {
            addCriterion("CAPITAL_CURRENCY_ID <>", value, "capitalCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCapitalCurrencyIdGreaterThan(String value) {
            addCriterion("CAPITAL_CURRENCY_ID >", value, "capitalCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCapitalCurrencyIdGreaterThanOrEqualTo(String value) {
            addCriterion("CAPITAL_CURRENCY_ID >=", value, "capitalCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCapitalCurrencyIdLessThan(String value) {
            addCriterion("CAPITAL_CURRENCY_ID <", value, "capitalCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCapitalCurrencyIdLessThanOrEqualTo(String value) {
            addCriterion("CAPITAL_CURRENCY_ID <=", value, "capitalCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCapitalCurrencyIdLike(String value) {
            addCriterion("CAPITAL_CURRENCY_ID like", value, "capitalCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCapitalCurrencyIdNotLike(String value) {
            addCriterion("CAPITAL_CURRENCY_ID not like", value, "capitalCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCapitalCurrencyIdIn(List<String> values) {
            addCriterion("CAPITAL_CURRENCY_ID in", values, "capitalCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCapitalCurrencyIdNotIn(List<String> values) {
            addCriterion("CAPITAL_CURRENCY_ID not in", values, "capitalCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCapitalCurrencyIdBetween(String value1, String value2) {
            addCriterion("CAPITAL_CURRENCY_ID between", value1, value2, "capitalCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCapitalCurrencyIdNotBetween(String value1, String value2) {
            addCriterion("CAPITAL_CURRENCY_ID not between", value1, value2, "capitalCurrencyId");
            return (Criteria) this;
        }

        public Criteria andTurnoverCurrencyIdIsNull() {
            addCriterion("TURNOVER_CURRENCY_ID is null");
            return (Criteria) this;
        }

        public Criteria andTurnoverCurrencyIdIsNotNull() {
            addCriterion("TURNOVER_CURRENCY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTurnoverCurrencyIdEqualTo(String value) {
            addCriterion("TURNOVER_CURRENCY_ID =", value, "turnoverCurrencyId");
            return (Criteria) this;
        }

        public Criteria andTurnoverCurrencyIdNotEqualTo(String value) {
            addCriterion("TURNOVER_CURRENCY_ID <>", value, "turnoverCurrencyId");
            return (Criteria) this;
        }

        public Criteria andTurnoverCurrencyIdGreaterThan(String value) {
            addCriterion("TURNOVER_CURRENCY_ID >", value, "turnoverCurrencyId");
            return (Criteria) this;
        }

        public Criteria andTurnoverCurrencyIdGreaterThanOrEqualTo(String value) {
            addCriterion("TURNOVER_CURRENCY_ID >=", value, "turnoverCurrencyId");
            return (Criteria) this;
        }

        public Criteria andTurnoverCurrencyIdLessThan(String value) {
            addCriterion("TURNOVER_CURRENCY_ID <", value, "turnoverCurrencyId");
            return (Criteria) this;
        }

        public Criteria andTurnoverCurrencyIdLessThanOrEqualTo(String value) {
            addCriterion("TURNOVER_CURRENCY_ID <=", value, "turnoverCurrencyId");
            return (Criteria) this;
        }

        public Criteria andTurnoverCurrencyIdLike(String value) {
            addCriterion("TURNOVER_CURRENCY_ID like", value, "turnoverCurrencyId");
            return (Criteria) this;
        }

        public Criteria andTurnoverCurrencyIdNotLike(String value) {
            addCriterion("TURNOVER_CURRENCY_ID not like", value, "turnoverCurrencyId");
            return (Criteria) this;
        }

        public Criteria andTurnoverCurrencyIdIn(List<String> values) {
            addCriterion("TURNOVER_CURRENCY_ID in", values, "turnoverCurrencyId");
            return (Criteria) this;
        }

        public Criteria andTurnoverCurrencyIdNotIn(List<String> values) {
            addCriterion("TURNOVER_CURRENCY_ID not in", values, "turnoverCurrencyId");
            return (Criteria) this;
        }

        public Criteria andTurnoverCurrencyIdBetween(String value1, String value2) {
            addCriterion("TURNOVER_CURRENCY_ID between", value1, value2, "turnoverCurrencyId");
            return (Criteria) this;
        }

        public Criteria andTurnoverCurrencyIdNotBetween(String value1, String value2) {
            addCriterion("TURNOVER_CURRENCY_ID not between", value1, value2, "turnoverCurrencyId");
            return (Criteria) this;
        }

        public Criteria andInnerCompanyIdIsNull() {
            addCriterion("INNER_COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andInnerCompanyIdIsNotNull() {
            addCriterion("INNER_COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInnerCompanyIdEqualTo(String value) {
            addCriterion("INNER_COMPANY_ID =", value, "innerCompanyId");
            return (Criteria) this;
        }

        public Criteria andInnerCompanyIdNotEqualTo(String value) {
            addCriterion("INNER_COMPANY_ID <>", value, "innerCompanyId");
            return (Criteria) this;
        }

        public Criteria andInnerCompanyIdGreaterThan(String value) {
            addCriterion("INNER_COMPANY_ID >", value, "innerCompanyId");
            return (Criteria) this;
        }

        public Criteria andInnerCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("INNER_COMPANY_ID >=", value, "innerCompanyId");
            return (Criteria) this;
        }

        public Criteria andInnerCompanyIdLessThan(String value) {
            addCriterion("INNER_COMPANY_ID <", value, "innerCompanyId");
            return (Criteria) this;
        }

        public Criteria andInnerCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("INNER_COMPANY_ID <=", value, "innerCompanyId");
            return (Criteria) this;
        }

        public Criteria andInnerCompanyIdLike(String value) {
            addCriterion("INNER_COMPANY_ID like", value, "innerCompanyId");
            return (Criteria) this;
        }

        public Criteria andInnerCompanyIdNotLike(String value) {
            addCriterion("INNER_COMPANY_ID not like", value, "innerCompanyId");
            return (Criteria) this;
        }

        public Criteria andInnerCompanyIdIn(List<String> values) {
            addCriterion("INNER_COMPANY_ID in", values, "innerCompanyId");
            return (Criteria) this;
        }

        public Criteria andInnerCompanyIdNotIn(List<String> values) {
            addCriterion("INNER_COMPANY_ID not in", values, "innerCompanyId");
            return (Criteria) this;
        }

        public Criteria andInnerCompanyIdBetween(String value1, String value2) {
            addCriterion("INNER_COMPANY_ID between", value1, value2, "innerCompanyId");
            return (Criteria) this;
        }

        public Criteria andInnerCompanyIdNotBetween(String value1, String value2) {
            addCriterion("INNER_COMPANY_ID not between", value1, value2, "innerCompanyId");
            return (Criteria) this;
        }

        public Criteria andGeneralCurrencyIdIsNull() {
            addCriterion("GENERAL_CURRENCY_ID is null");
            return (Criteria) this;
        }

        public Criteria andGeneralCurrencyIdIsNotNull() {
            addCriterion("GENERAL_CURRENCY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGeneralCurrencyIdEqualTo(String value) {
            addCriterion("GENERAL_CURRENCY_ID =", value, "generalCurrencyId");
            return (Criteria) this;
        }

        public Criteria andGeneralCurrencyIdNotEqualTo(String value) {
            addCriterion("GENERAL_CURRENCY_ID <>", value, "generalCurrencyId");
            return (Criteria) this;
        }

        public Criteria andGeneralCurrencyIdGreaterThan(String value) {
            addCriterion("GENERAL_CURRENCY_ID >", value, "generalCurrencyId");
            return (Criteria) this;
        }

        public Criteria andGeneralCurrencyIdGreaterThanOrEqualTo(String value) {
            addCriterion("GENERAL_CURRENCY_ID >=", value, "generalCurrencyId");
            return (Criteria) this;
        }

        public Criteria andGeneralCurrencyIdLessThan(String value) {
            addCriterion("GENERAL_CURRENCY_ID <", value, "generalCurrencyId");
            return (Criteria) this;
        }

        public Criteria andGeneralCurrencyIdLessThanOrEqualTo(String value) {
            addCriterion("GENERAL_CURRENCY_ID <=", value, "generalCurrencyId");
            return (Criteria) this;
        }

        public Criteria andGeneralCurrencyIdLike(String value) {
            addCriterion("GENERAL_CURRENCY_ID like", value, "generalCurrencyId");
            return (Criteria) this;
        }

        public Criteria andGeneralCurrencyIdNotLike(String value) {
            addCriterion("GENERAL_CURRENCY_ID not like", value, "generalCurrencyId");
            return (Criteria) this;
        }

        public Criteria andGeneralCurrencyIdIn(List<String> values) {
            addCriterion("GENERAL_CURRENCY_ID in", values, "generalCurrencyId");
            return (Criteria) this;
        }

        public Criteria andGeneralCurrencyIdNotIn(List<String> values) {
            addCriterion("GENERAL_CURRENCY_ID not in", values, "generalCurrencyId");
            return (Criteria) this;
        }

        public Criteria andGeneralCurrencyIdBetween(String value1, String value2) {
            addCriterion("GENERAL_CURRENCY_ID between", value1, value2, "generalCurrencyId");
            return (Criteria) this;
        }

        public Criteria andGeneralCurrencyIdNotBetween(String value1, String value2) {
            addCriterion("GENERAL_CURRENCY_ID not between", value1, value2, "generalCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCrmCustomerWebsiteIsNull() {
            addCriterion("CRM_CUSTOMER_WEBSITE is null");
            return (Criteria) this;
        }

        public Criteria andCrmCustomerWebsiteIsNotNull() {
            addCriterion("CRM_CUSTOMER_WEBSITE is not null");
            return (Criteria) this;
        }

        public Criteria andCrmCustomerWebsiteEqualTo(String value) {
            addCriterion("CRM_CUSTOMER_WEBSITE =", value, "crmCustomerWebsite");
            return (Criteria) this;
        }

        public Criteria andCrmCustomerWebsiteNotEqualTo(String value) {
            addCriterion("CRM_CUSTOMER_WEBSITE <>", value, "crmCustomerWebsite");
            return (Criteria) this;
        }

        public Criteria andCrmCustomerWebsiteGreaterThan(String value) {
            addCriterion("CRM_CUSTOMER_WEBSITE >", value, "crmCustomerWebsite");
            return (Criteria) this;
        }

        public Criteria andCrmCustomerWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("CRM_CUSTOMER_WEBSITE >=", value, "crmCustomerWebsite");
            return (Criteria) this;
        }

        public Criteria andCrmCustomerWebsiteLessThan(String value) {
            addCriterion("CRM_CUSTOMER_WEBSITE <", value, "crmCustomerWebsite");
            return (Criteria) this;
        }

        public Criteria andCrmCustomerWebsiteLessThanOrEqualTo(String value) {
            addCriterion("CRM_CUSTOMER_WEBSITE <=", value, "crmCustomerWebsite");
            return (Criteria) this;
        }

        public Criteria andCrmCustomerWebsiteLike(String value) {
            addCriterion("CRM_CUSTOMER_WEBSITE like", value, "crmCustomerWebsite");
            return (Criteria) this;
        }

        public Criteria andCrmCustomerWebsiteNotLike(String value) {
            addCriterion("CRM_CUSTOMER_WEBSITE not like", value, "crmCustomerWebsite");
            return (Criteria) this;
        }

        public Criteria andCrmCustomerWebsiteIn(List<String> values) {
            addCriterion("CRM_CUSTOMER_WEBSITE in", values, "crmCustomerWebsite");
            return (Criteria) this;
        }

        public Criteria andCrmCustomerWebsiteNotIn(List<String> values) {
            addCriterion("CRM_CUSTOMER_WEBSITE not in", values, "crmCustomerWebsite");
            return (Criteria) this;
        }

        public Criteria andCrmCustomerWebsiteBetween(String value1, String value2) {
            addCriterion("CRM_CUSTOMER_WEBSITE between", value1, value2, "crmCustomerWebsite");
            return (Criteria) this;
        }

        public Criteria andCrmCustomerWebsiteNotBetween(String value1, String value2) {
            addCriterion("CRM_CUSTOMER_WEBSITE not between", value1, value2, "crmCustomerWebsite");
            return (Criteria) this;
        }

        public Criteria andCrmParentCustomerIdIsNull() {
            addCriterion("CRM_PARENT_CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCrmParentCustomerIdIsNotNull() {
            addCriterion("CRM_PARENT_CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCrmParentCustomerIdEqualTo(String value) {
            addCriterion("CRM_PARENT_CUSTOMER_ID =", value, "crmParentCustomerId");
            return (Criteria) this;
        }

        public Criteria andCrmParentCustomerIdNotEqualTo(String value) {
            addCriterion("CRM_PARENT_CUSTOMER_ID <>", value, "crmParentCustomerId");
            return (Criteria) this;
        }

        public Criteria andCrmParentCustomerIdGreaterThan(String value) {
            addCriterion("CRM_PARENT_CUSTOMER_ID >", value, "crmParentCustomerId");
            return (Criteria) this;
        }

        public Criteria andCrmParentCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("CRM_PARENT_CUSTOMER_ID >=", value, "crmParentCustomerId");
            return (Criteria) this;
        }

        public Criteria andCrmParentCustomerIdLessThan(String value) {
            addCriterion("CRM_PARENT_CUSTOMER_ID <", value, "crmParentCustomerId");
            return (Criteria) this;
        }

        public Criteria andCrmParentCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("CRM_PARENT_CUSTOMER_ID <=", value, "crmParentCustomerId");
            return (Criteria) this;
        }

        public Criteria andCrmParentCustomerIdLike(String value) {
            addCriterion("CRM_PARENT_CUSTOMER_ID like", value, "crmParentCustomerId");
            return (Criteria) this;
        }

        public Criteria andCrmParentCustomerIdNotLike(String value) {
            addCriterion("CRM_PARENT_CUSTOMER_ID not like", value, "crmParentCustomerId");
            return (Criteria) this;
        }

        public Criteria andCrmParentCustomerIdIn(List<String> values) {
            addCriterion("CRM_PARENT_CUSTOMER_ID in", values, "crmParentCustomerId");
            return (Criteria) this;
        }

        public Criteria andCrmParentCustomerIdNotIn(List<String> values) {
            addCriterion("CRM_PARENT_CUSTOMER_ID not in", values, "crmParentCustomerId");
            return (Criteria) this;
        }

        public Criteria andCrmParentCustomerIdBetween(String value1, String value2) {
            addCriterion("CRM_PARENT_CUSTOMER_ID between", value1, value2, "crmParentCustomerId");
            return (Criteria) this;
        }

        public Criteria andCrmParentCustomerIdNotBetween(String value1, String value2) {
            addCriterion("CRM_PARENT_CUSTOMER_ID not between", value1, value2, "crmParentCustomerId");
            return (Criteria) this;
        }

        public Criteria andCrmPotentialCustomerIsNull() {
            addCriterion("CRM_POTENTIAL_CUSTOMER is null");
            return (Criteria) this;
        }

        public Criteria andCrmPotentialCustomerIsNotNull() {
            addCriterion("CRM_POTENTIAL_CUSTOMER is not null");
            return (Criteria) this;
        }

        public Criteria andCrmPotentialCustomerEqualTo(Boolean value) {
            addCriterion("CRM_POTENTIAL_CUSTOMER =", value, "crmPotentialCustomer");
            return (Criteria) this;
        }

        public Criteria andCrmPotentialCustomerNotEqualTo(Boolean value) {
            addCriterion("CRM_POTENTIAL_CUSTOMER <>", value, "crmPotentialCustomer");
            return (Criteria) this;
        }

        public Criteria andCrmPotentialCustomerGreaterThan(Boolean value) {
            addCriterion("CRM_POTENTIAL_CUSTOMER >", value, "crmPotentialCustomer");
            return (Criteria) this;
        }

        public Criteria andCrmPotentialCustomerGreaterThanOrEqualTo(Boolean value) {
            addCriterion("CRM_POTENTIAL_CUSTOMER >=", value, "crmPotentialCustomer");
            return (Criteria) this;
        }

        public Criteria andCrmPotentialCustomerLessThan(Boolean value) {
            addCriterion("CRM_POTENTIAL_CUSTOMER <", value, "crmPotentialCustomer");
            return (Criteria) this;
        }

        public Criteria andCrmPotentialCustomerLessThanOrEqualTo(Boolean value) {
            addCriterion("CRM_POTENTIAL_CUSTOMER <=", value, "crmPotentialCustomer");
            return (Criteria) this;
        }

        public Criteria andCrmPotentialCustomerIn(List<Boolean> values) {
            addCriterion("CRM_POTENTIAL_CUSTOMER in", values, "crmPotentialCustomer");
            return (Criteria) this;
        }

        public Criteria andCrmPotentialCustomerNotIn(List<Boolean> values) {
            addCriterion("CRM_POTENTIAL_CUSTOMER not in", values, "crmPotentialCustomer");
            return (Criteria) this;
        }

        public Criteria andCrmPotentialCustomerBetween(Boolean value1, Boolean value2) {
            addCriterion("CRM_POTENTIAL_CUSTOMER between", value1, value2, "crmPotentialCustomer");
            return (Criteria) this;
        }

        public Criteria andCrmPotentialCustomerNotBetween(Boolean value1, Boolean value2) {
            addCriterion("CRM_POTENTIAL_CUSTOMER not between", value1, value2, "crmPotentialCustomer");
            return (Criteria) this;
        }

        public Criteria andCrmPotenCustomerCodeIsNull() {
            addCriterion("CRM_POTEN_CUSTOMER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCrmPotenCustomerCodeIsNotNull() {
            addCriterion("CRM_POTEN_CUSTOMER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCrmPotenCustomerCodeEqualTo(String value) {
            addCriterion("CRM_POTEN_CUSTOMER_CODE =", value, "crmPotenCustomerCode");
            return (Criteria) this;
        }

        public Criteria andCrmPotenCustomerCodeNotEqualTo(String value) {
            addCriterion("CRM_POTEN_CUSTOMER_CODE <>", value, "crmPotenCustomerCode");
            return (Criteria) this;
        }

        public Criteria andCrmPotenCustomerCodeGreaterThan(String value) {
            addCriterion("CRM_POTEN_CUSTOMER_CODE >", value, "crmPotenCustomerCode");
            return (Criteria) this;
        }

        public Criteria andCrmPotenCustomerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CRM_POTEN_CUSTOMER_CODE >=", value, "crmPotenCustomerCode");
            return (Criteria) this;
        }

        public Criteria andCrmPotenCustomerCodeLessThan(String value) {
            addCriterion("CRM_POTEN_CUSTOMER_CODE <", value, "crmPotenCustomerCode");
            return (Criteria) this;
        }

        public Criteria andCrmPotenCustomerCodeLessThanOrEqualTo(String value) {
            addCriterion("CRM_POTEN_CUSTOMER_CODE <=", value, "crmPotenCustomerCode");
            return (Criteria) this;
        }

        public Criteria andCrmPotenCustomerCodeLike(String value) {
            addCriterion("CRM_POTEN_CUSTOMER_CODE like", value, "crmPotenCustomerCode");
            return (Criteria) this;
        }

        public Criteria andCrmPotenCustomerCodeNotLike(String value) {
            addCriterion("CRM_POTEN_CUSTOMER_CODE not like", value, "crmPotenCustomerCode");
            return (Criteria) this;
        }

        public Criteria andCrmPotenCustomerCodeIn(List<String> values) {
            addCriterion("CRM_POTEN_CUSTOMER_CODE in", values, "crmPotenCustomerCode");
            return (Criteria) this;
        }

        public Criteria andCrmPotenCustomerCodeNotIn(List<String> values) {
            addCriterion("CRM_POTEN_CUSTOMER_CODE not in", values, "crmPotenCustomerCode");
            return (Criteria) this;
        }

        public Criteria andCrmPotenCustomerCodeBetween(String value1, String value2) {
            addCriterion("CRM_POTEN_CUSTOMER_CODE between", value1, value2, "crmPotenCustomerCode");
            return (Criteria) this;
        }

        public Criteria andCrmPotenCustomerCodeNotBetween(String value1, String value2) {
            addCriterion("CRM_POTEN_CUSTOMER_CODE not between", value1, value2, "crmPotenCustomerCode");
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