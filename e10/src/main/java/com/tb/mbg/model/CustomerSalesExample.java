package com.tb.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerSalesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerSalesExample() {
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

        public Criteria andTaxIncludedIsNull() {
            addCriterion("TAX_INCLUDED is null");
            return (Criteria) this;
        }

        public Criteria andTaxIncludedIsNotNull() {
            addCriterion("TAX_INCLUDED is not null");
            return (Criteria) this;
        }

        public Criteria andTaxIncludedEqualTo(Boolean value) {
            addCriterion("TAX_INCLUDED =", value, "taxIncluded");
            return (Criteria) this;
        }

        public Criteria andTaxIncludedNotEqualTo(Boolean value) {
            addCriterion("TAX_INCLUDED <>", value, "taxIncluded");
            return (Criteria) this;
        }

        public Criteria andTaxIncludedGreaterThan(Boolean value) {
            addCriterion("TAX_INCLUDED >", value, "taxIncluded");
            return (Criteria) this;
        }

        public Criteria andTaxIncludedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("TAX_INCLUDED >=", value, "taxIncluded");
            return (Criteria) this;
        }

        public Criteria andTaxIncludedLessThan(Boolean value) {
            addCriterion("TAX_INCLUDED <", value, "taxIncluded");
            return (Criteria) this;
        }

        public Criteria andTaxIncludedLessThanOrEqualTo(Boolean value) {
            addCriterion("TAX_INCLUDED <=", value, "taxIncluded");
            return (Criteria) this;
        }

        public Criteria andTaxIncludedIn(List<Boolean> values) {
            addCriterion("TAX_INCLUDED in", values, "taxIncluded");
            return (Criteria) this;
        }

        public Criteria andTaxIncludedNotIn(List<Boolean> values) {
            addCriterion("TAX_INCLUDED not in", values, "taxIncluded");
            return (Criteria) this;
        }

        public Criteria andTaxIncludedBetween(Boolean value1, Boolean value2) {
            addCriterion("TAX_INCLUDED between", value1, value2, "taxIncluded");
            return (Criteria) this;
        }

        public Criteria andTaxIncludedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("TAX_INCLUDED not between", value1, value2, "taxIncluded");
            return (Criteria) this;
        }

        public Criteria andEarnestRateIsNull() {
            addCriterion("EARNEST_RATE is null");
            return (Criteria) this;
        }

        public Criteria andEarnestRateIsNotNull() {
            addCriterion("EARNEST_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andEarnestRateEqualTo(BigDecimal value) {
            addCriterion("EARNEST_RATE =", value, "earnestRate");
            return (Criteria) this;
        }

        public Criteria andEarnestRateNotEqualTo(BigDecimal value) {
            addCriterion("EARNEST_RATE <>", value, "earnestRate");
            return (Criteria) this;
        }

        public Criteria andEarnestRateGreaterThan(BigDecimal value) {
            addCriterion("EARNEST_RATE >", value, "earnestRate");
            return (Criteria) this;
        }

        public Criteria andEarnestRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EARNEST_RATE >=", value, "earnestRate");
            return (Criteria) this;
        }

        public Criteria andEarnestRateLessThan(BigDecimal value) {
            addCriterion("EARNEST_RATE <", value, "earnestRate");
            return (Criteria) this;
        }

        public Criteria andEarnestRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EARNEST_RATE <=", value, "earnestRate");
            return (Criteria) this;
        }

        public Criteria andEarnestRateIn(List<BigDecimal> values) {
            addCriterion("EARNEST_RATE in", values, "earnestRate");
            return (Criteria) this;
        }

        public Criteria andEarnestRateNotIn(List<BigDecimal> values) {
            addCriterion("EARNEST_RATE not in", values, "earnestRate");
            return (Criteria) this;
        }

        public Criteria andEarnestRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EARNEST_RATE between", value1, value2, "earnestRate");
            return (Criteria) this;
        }

        public Criteria andEarnestRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EARNEST_RATE not between", value1, value2, "earnestRate");
            return (Criteria) this;
        }

        public Criteria andSignRequiredIsNull() {
            addCriterion("SIGN_REQUIRED is null");
            return (Criteria) this;
        }

        public Criteria andSignRequiredIsNotNull() {
            addCriterion("SIGN_REQUIRED is not null");
            return (Criteria) this;
        }

        public Criteria andSignRequiredEqualTo(Boolean value) {
            addCriterion("SIGN_REQUIRED =", value, "signRequired");
            return (Criteria) this;
        }

        public Criteria andSignRequiredNotEqualTo(Boolean value) {
            addCriterion("SIGN_REQUIRED <>", value, "signRequired");
            return (Criteria) this;
        }

        public Criteria andSignRequiredGreaterThan(Boolean value) {
            addCriterion("SIGN_REQUIRED >", value, "signRequired");
            return (Criteria) this;
        }

        public Criteria andSignRequiredGreaterThanOrEqualTo(Boolean value) {
            addCriterion("SIGN_REQUIRED >=", value, "signRequired");
            return (Criteria) this;
        }

        public Criteria andSignRequiredLessThan(Boolean value) {
            addCriterion("SIGN_REQUIRED <", value, "signRequired");
            return (Criteria) this;
        }

        public Criteria andSignRequiredLessThanOrEqualTo(Boolean value) {
            addCriterion("SIGN_REQUIRED <=", value, "signRequired");
            return (Criteria) this;
        }

        public Criteria andSignRequiredIn(List<Boolean> values) {
            addCriterion("SIGN_REQUIRED in", values, "signRequired");
            return (Criteria) this;
        }

        public Criteria andSignRequiredNotIn(List<Boolean> values) {
            addCriterion("SIGN_REQUIRED not in", values, "signRequired");
            return (Criteria) this;
        }

        public Criteria andSignRequiredBetween(Boolean value1, Boolean value2) {
            addCriterion("SIGN_REQUIRED between", value1, value2, "signRequired");
            return (Criteria) this;
        }

        public Criteria andSignRequiredNotBetween(Boolean value1, Boolean value2) {
            addCriterion("SIGN_REQUIRED not between", value1, value2, "signRequired");
            return (Criteria) this;
        }

        public Criteria andInvoiceBySignIsNull() {
            addCriterion("INVOICE_BY_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceBySignIsNotNull() {
            addCriterion("INVOICE_BY_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceBySignEqualTo(Boolean value) {
            addCriterion("INVOICE_BY_SIGN =", value, "invoiceBySign");
            return (Criteria) this;
        }

        public Criteria andInvoiceBySignNotEqualTo(Boolean value) {
            addCriterion("INVOICE_BY_SIGN <>", value, "invoiceBySign");
            return (Criteria) this;
        }

        public Criteria andInvoiceBySignGreaterThan(Boolean value) {
            addCriterion("INVOICE_BY_SIGN >", value, "invoiceBySign");
            return (Criteria) this;
        }

        public Criteria andInvoiceBySignGreaterThanOrEqualTo(Boolean value) {
            addCriterion("INVOICE_BY_SIGN >=", value, "invoiceBySign");
            return (Criteria) this;
        }

        public Criteria andInvoiceBySignLessThan(Boolean value) {
            addCriterion("INVOICE_BY_SIGN <", value, "invoiceBySign");
            return (Criteria) this;
        }

        public Criteria andInvoiceBySignLessThanOrEqualTo(Boolean value) {
            addCriterion("INVOICE_BY_SIGN <=", value, "invoiceBySign");
            return (Criteria) this;
        }

        public Criteria andInvoiceBySignIn(List<Boolean> values) {
            addCriterion("INVOICE_BY_SIGN in", values, "invoiceBySign");
            return (Criteria) this;
        }

        public Criteria andInvoiceBySignNotIn(List<Boolean> values) {
            addCriterion("INVOICE_BY_SIGN not in", values, "invoiceBySign");
            return (Criteria) this;
        }

        public Criteria andInvoiceBySignBetween(Boolean value1, Boolean value2) {
            addCriterion("INVOICE_BY_SIGN between", value1, value2, "invoiceBySign");
            return (Criteria) this;
        }

        public Criteria andInvoiceBySignNotBetween(Boolean value1, Boolean value2) {
            addCriterion("INVOICE_BY_SIGN not between", value1, value2, "invoiceBySign");
            return (Criteria) this;
        }

        public Criteria andAdvancedDeliveryIsNull() {
            addCriterion("ADVANCED_DELIVERY is null");
            return (Criteria) this;
        }

        public Criteria andAdvancedDeliveryIsNotNull() {
            addCriterion("ADVANCED_DELIVERY is not null");
            return (Criteria) this;
        }

        public Criteria andAdvancedDeliveryEqualTo(Boolean value) {
            addCriterion("ADVANCED_DELIVERY =", value, "advancedDelivery");
            return (Criteria) this;
        }

        public Criteria andAdvancedDeliveryNotEqualTo(Boolean value) {
            addCriterion("ADVANCED_DELIVERY <>", value, "advancedDelivery");
            return (Criteria) this;
        }

        public Criteria andAdvancedDeliveryGreaterThan(Boolean value) {
            addCriterion("ADVANCED_DELIVERY >", value, "advancedDelivery");
            return (Criteria) this;
        }

        public Criteria andAdvancedDeliveryGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ADVANCED_DELIVERY >=", value, "advancedDelivery");
            return (Criteria) this;
        }

        public Criteria andAdvancedDeliveryLessThan(Boolean value) {
            addCriterion("ADVANCED_DELIVERY <", value, "advancedDelivery");
            return (Criteria) this;
        }

        public Criteria andAdvancedDeliveryLessThanOrEqualTo(Boolean value) {
            addCriterion("ADVANCED_DELIVERY <=", value, "advancedDelivery");
            return (Criteria) this;
        }

        public Criteria andAdvancedDeliveryIn(List<Boolean> values) {
            addCriterion("ADVANCED_DELIVERY in", values, "advancedDelivery");
            return (Criteria) this;
        }

        public Criteria andAdvancedDeliveryNotIn(List<Boolean> values) {
            addCriterion("ADVANCED_DELIVERY not in", values, "advancedDelivery");
            return (Criteria) this;
        }

        public Criteria andAdvancedDeliveryBetween(Boolean value1, Boolean value2) {
            addCriterion("ADVANCED_DELIVERY between", value1, value2, "advancedDelivery");
            return (Criteria) this;
        }

        public Criteria andAdvancedDeliveryNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ADVANCED_DELIVERY not between", value1, value2, "advancedDelivery");
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

        public Criteria andSettlementBaseDateTypeIsNull() {
            addCriterion("SETTLEMENT_BASE_DATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSettlementBaseDateTypeIsNotNull() {
            addCriterion("SETTLEMENT_BASE_DATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementBaseDateTypeEqualTo(String value) {
            addCriterion("SETTLEMENT_BASE_DATE_TYPE =", value, "settlementBaseDateType");
            return (Criteria) this;
        }

        public Criteria andSettlementBaseDateTypeNotEqualTo(String value) {
            addCriterion("SETTLEMENT_BASE_DATE_TYPE <>", value, "settlementBaseDateType");
            return (Criteria) this;
        }

        public Criteria andSettlementBaseDateTypeGreaterThan(String value) {
            addCriterion("SETTLEMENT_BASE_DATE_TYPE >", value, "settlementBaseDateType");
            return (Criteria) this;
        }

        public Criteria andSettlementBaseDateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_BASE_DATE_TYPE >=", value, "settlementBaseDateType");
            return (Criteria) this;
        }

        public Criteria andSettlementBaseDateTypeLessThan(String value) {
            addCriterion("SETTLEMENT_BASE_DATE_TYPE <", value, "settlementBaseDateType");
            return (Criteria) this;
        }

        public Criteria andSettlementBaseDateTypeLessThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_BASE_DATE_TYPE <=", value, "settlementBaseDateType");
            return (Criteria) this;
        }

        public Criteria andSettlementBaseDateTypeLike(String value) {
            addCriterion("SETTLEMENT_BASE_DATE_TYPE like", value, "settlementBaseDateType");
            return (Criteria) this;
        }

        public Criteria andSettlementBaseDateTypeNotLike(String value) {
            addCriterion("SETTLEMENT_BASE_DATE_TYPE not like", value, "settlementBaseDateType");
            return (Criteria) this;
        }

        public Criteria andSettlementBaseDateTypeIn(List<String> values) {
            addCriterion("SETTLEMENT_BASE_DATE_TYPE in", values, "settlementBaseDateType");
            return (Criteria) this;
        }

        public Criteria andSettlementBaseDateTypeNotIn(List<String> values) {
            addCriterion("SETTLEMENT_BASE_DATE_TYPE not in", values, "settlementBaseDateType");
            return (Criteria) this;
        }

        public Criteria andSettlementBaseDateTypeBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_BASE_DATE_TYPE between", value1, value2, "settlementBaseDateType");
            return (Criteria) this;
        }

        public Criteria andSettlementBaseDateTypeNotBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_BASE_DATE_TYPE not between", value1, value2, "settlementBaseDateType");
            return (Criteria) this;
        }

        public Criteria andIsMonthPlusIsNull() {
            addCriterion("IS_MONTH_PLUS is null");
            return (Criteria) this;
        }

        public Criteria andIsMonthPlusIsNotNull() {
            addCriterion("IS_MONTH_PLUS is not null");
            return (Criteria) this;
        }

        public Criteria andIsMonthPlusEqualTo(Boolean value) {
            addCriterion("IS_MONTH_PLUS =", value, "isMonthPlus");
            return (Criteria) this;
        }

        public Criteria andIsMonthPlusNotEqualTo(Boolean value) {
            addCriterion("IS_MONTH_PLUS <>", value, "isMonthPlus");
            return (Criteria) this;
        }

        public Criteria andIsMonthPlusGreaterThan(Boolean value) {
            addCriterion("IS_MONTH_PLUS >", value, "isMonthPlus");
            return (Criteria) this;
        }

        public Criteria andIsMonthPlusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_MONTH_PLUS >=", value, "isMonthPlus");
            return (Criteria) this;
        }

        public Criteria andIsMonthPlusLessThan(Boolean value) {
            addCriterion("IS_MONTH_PLUS <", value, "isMonthPlus");
            return (Criteria) this;
        }

        public Criteria andIsMonthPlusLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_MONTH_PLUS <=", value, "isMonthPlus");
            return (Criteria) this;
        }

        public Criteria andIsMonthPlusIn(List<Boolean> values) {
            addCriterion("IS_MONTH_PLUS in", values, "isMonthPlus");
            return (Criteria) this;
        }

        public Criteria andIsMonthPlusNotIn(List<Boolean> values) {
            addCriterion("IS_MONTH_PLUS not in", values, "isMonthPlus");
            return (Criteria) this;
        }

        public Criteria andIsMonthPlusBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_MONTH_PLUS between", value1, value2, "isMonthPlus");
            return (Criteria) this;
        }

        public Criteria andIsMonthPlusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_MONTH_PLUS not between", value1, value2, "isMonthPlus");
            return (Criteria) this;
        }

        public Criteria andMonthsIsNull() {
            addCriterion("MONTHS is null");
            return (Criteria) this;
        }

        public Criteria andMonthsIsNotNull() {
            addCriterion("MONTHS is not null");
            return (Criteria) this;
        }

        public Criteria andMonthsEqualTo(Integer value) {
            addCriterion("MONTHS =", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsNotEqualTo(Integer value) {
            addCriterion("MONTHS <>", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsGreaterThan(Integer value) {
            addCriterion("MONTHS >", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsGreaterThanOrEqualTo(Integer value) {
            addCriterion("MONTHS >=", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsLessThan(Integer value) {
            addCriterion("MONTHS <", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsLessThanOrEqualTo(Integer value) {
            addCriterion("MONTHS <=", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsIn(List<Integer> values) {
            addCriterion("MONTHS in", values, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsNotIn(List<Integer> values) {
            addCriterion("MONTHS not in", values, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsBetween(Integer value1, Integer value2) {
            addCriterion("MONTHS between", value1, value2, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsNotBetween(Integer value1, Integer value2) {
            addCriterion("MONTHS not between", value1, value2, "months");
            return (Criteria) this;
        }

        public Criteria andIsDayPlusIsNull() {
            addCriterion("IS_DAY_PLUS is null");
            return (Criteria) this;
        }

        public Criteria andIsDayPlusIsNotNull() {
            addCriterion("IS_DAY_PLUS is not null");
            return (Criteria) this;
        }

        public Criteria andIsDayPlusEqualTo(Boolean value) {
            addCriterion("IS_DAY_PLUS =", value, "isDayPlus");
            return (Criteria) this;
        }

        public Criteria andIsDayPlusNotEqualTo(Boolean value) {
            addCriterion("IS_DAY_PLUS <>", value, "isDayPlus");
            return (Criteria) this;
        }

        public Criteria andIsDayPlusGreaterThan(Boolean value) {
            addCriterion("IS_DAY_PLUS >", value, "isDayPlus");
            return (Criteria) this;
        }

        public Criteria andIsDayPlusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_DAY_PLUS >=", value, "isDayPlus");
            return (Criteria) this;
        }

        public Criteria andIsDayPlusLessThan(Boolean value) {
            addCriterion("IS_DAY_PLUS <", value, "isDayPlus");
            return (Criteria) this;
        }

        public Criteria andIsDayPlusLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_DAY_PLUS <=", value, "isDayPlus");
            return (Criteria) this;
        }

        public Criteria andIsDayPlusIn(List<Boolean> values) {
            addCriterion("IS_DAY_PLUS in", values, "isDayPlus");
            return (Criteria) this;
        }

        public Criteria andIsDayPlusNotIn(List<Boolean> values) {
            addCriterion("IS_DAY_PLUS not in", values, "isDayPlus");
            return (Criteria) this;
        }

        public Criteria andIsDayPlusBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_DAY_PLUS between", value1, value2, "isDayPlus");
            return (Criteria) this;
        }

        public Criteria andIsDayPlusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_DAY_PLUS not between", value1, value2, "isDayPlus");
            return (Criteria) this;
        }

        public Criteria andDaysIsNull() {
            addCriterion("DAYS is null");
            return (Criteria) this;
        }

        public Criteria andDaysIsNotNull() {
            addCriterion("DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andDaysEqualTo(Integer value) {
            addCriterion("DAYS =", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotEqualTo(Integer value) {
            addCriterion("DAYS <>", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThan(Integer value) {
            addCriterion("DAYS >", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("DAYS >=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThan(Integer value) {
            addCriterion("DAYS <", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThanOrEqualTo(Integer value) {
            addCriterion("DAYS <=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysIn(List<Integer> values) {
            addCriterion("DAYS in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotIn(List<Integer> values) {
            addCriterion("DAYS not in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysBetween(Integer value1, Integer value2) {
            addCriterion("DAYS between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("DAYS not between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andIsEveryDayIsNull() {
            addCriterion("IS_EVERY_DAY is null");
            return (Criteria) this;
        }

        public Criteria andIsEveryDayIsNotNull() {
            addCriterion("IS_EVERY_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andIsEveryDayEqualTo(Boolean value) {
            addCriterion("IS_EVERY_DAY =", value, "isEveryDay");
            return (Criteria) this;
        }

        public Criteria andIsEveryDayNotEqualTo(Boolean value) {
            addCriterion("IS_EVERY_DAY <>", value, "isEveryDay");
            return (Criteria) this;
        }

        public Criteria andIsEveryDayGreaterThan(Boolean value) {
            addCriterion("IS_EVERY_DAY >", value, "isEveryDay");
            return (Criteria) this;
        }

        public Criteria andIsEveryDayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_EVERY_DAY >=", value, "isEveryDay");
            return (Criteria) this;
        }

        public Criteria andIsEveryDayLessThan(Boolean value) {
            addCriterion("IS_EVERY_DAY <", value, "isEveryDay");
            return (Criteria) this;
        }

        public Criteria andIsEveryDayLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_EVERY_DAY <=", value, "isEveryDay");
            return (Criteria) this;
        }

        public Criteria andIsEveryDayIn(List<Boolean> values) {
            addCriterion("IS_EVERY_DAY in", values, "isEveryDay");
            return (Criteria) this;
        }

        public Criteria andIsEveryDayNotIn(List<Boolean> values) {
            addCriterion("IS_EVERY_DAY not in", values, "isEveryDay");
            return (Criteria) this;
        }

        public Criteria andIsEveryDayBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_EVERY_DAY between", value1, value2, "isEveryDay");
            return (Criteria) this;
        }

        public Criteria andIsEveryDayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_EVERY_DAY not between", value1, value2, "isEveryDay");
            return (Criteria) this;
        }

        public Criteria andEveryDayIsNull() {
            addCriterion("EVERY_DAY is null");
            return (Criteria) this;
        }

        public Criteria andEveryDayIsNotNull() {
            addCriterion("EVERY_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andEveryDayEqualTo(Integer value) {
            addCriterion("EVERY_DAY =", value, "everyDay");
            return (Criteria) this;
        }

        public Criteria andEveryDayNotEqualTo(Integer value) {
            addCriterion("EVERY_DAY <>", value, "everyDay");
            return (Criteria) this;
        }

        public Criteria andEveryDayGreaterThan(Integer value) {
            addCriterion("EVERY_DAY >", value, "everyDay");
            return (Criteria) this;
        }

        public Criteria andEveryDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("EVERY_DAY >=", value, "everyDay");
            return (Criteria) this;
        }

        public Criteria andEveryDayLessThan(Integer value) {
            addCriterion("EVERY_DAY <", value, "everyDay");
            return (Criteria) this;
        }

        public Criteria andEveryDayLessThanOrEqualTo(Integer value) {
            addCriterion("EVERY_DAY <=", value, "everyDay");
            return (Criteria) this;
        }

        public Criteria andEveryDayIn(List<Integer> values) {
            addCriterion("EVERY_DAY in", values, "everyDay");
            return (Criteria) this;
        }

        public Criteria andEveryDayNotIn(List<Integer> values) {
            addCriterion("EVERY_DAY not in", values, "everyDay");
            return (Criteria) this;
        }

        public Criteria andEveryDayBetween(Integer value1, Integer value2) {
            addCriterion("EVERY_DAY between", value1, value2, "everyDay");
            return (Criteria) this;
        }

        public Criteria andEveryDayNotBetween(Integer value1, Integer value2) {
            addCriterion("EVERY_DAY not between", value1, value2, "everyDay");
            return (Criteria) this;
        }

        public Criteria andPartialDeliveryIsNull() {
            addCriterion("PARTIAL_DELIVERY is null");
            return (Criteria) this;
        }

        public Criteria andPartialDeliveryIsNotNull() {
            addCriterion("PARTIAL_DELIVERY is not null");
            return (Criteria) this;
        }

        public Criteria andPartialDeliveryEqualTo(Boolean value) {
            addCriterion("PARTIAL_DELIVERY =", value, "partialDelivery");
            return (Criteria) this;
        }

        public Criteria andPartialDeliveryNotEqualTo(Boolean value) {
            addCriterion("PARTIAL_DELIVERY <>", value, "partialDelivery");
            return (Criteria) this;
        }

        public Criteria andPartialDeliveryGreaterThan(Boolean value) {
            addCriterion("PARTIAL_DELIVERY >", value, "partialDelivery");
            return (Criteria) this;
        }

        public Criteria andPartialDeliveryGreaterThanOrEqualTo(Boolean value) {
            addCriterion("PARTIAL_DELIVERY >=", value, "partialDelivery");
            return (Criteria) this;
        }

        public Criteria andPartialDeliveryLessThan(Boolean value) {
            addCriterion("PARTIAL_DELIVERY <", value, "partialDelivery");
            return (Criteria) this;
        }

        public Criteria andPartialDeliveryLessThanOrEqualTo(Boolean value) {
            addCriterion("PARTIAL_DELIVERY <=", value, "partialDelivery");
            return (Criteria) this;
        }

        public Criteria andPartialDeliveryIn(List<Boolean> values) {
            addCriterion("PARTIAL_DELIVERY in", values, "partialDelivery");
            return (Criteria) this;
        }

        public Criteria andPartialDeliveryNotIn(List<Boolean> values) {
            addCriterion("PARTIAL_DELIVERY not in", values, "partialDelivery");
            return (Criteria) this;
        }

        public Criteria andPartialDeliveryBetween(Boolean value1, Boolean value2) {
            addCriterion("PARTIAL_DELIVERY between", value1, value2, "partialDelivery");
            return (Criteria) this;
        }

        public Criteria andPartialDeliveryNotBetween(Boolean value1, Boolean value2) {
            addCriterion("PARTIAL_DELIVERY not between", value1, value2, "partialDelivery");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("CUSTOMER_ID =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("CUSTOMER_ID <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("CUSTOMER_ID >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ID >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("CUSTOMER_ID <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ID <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("CUSTOMER_ID like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("CUSTOMER_ID not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("CUSTOMER_ID in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("CUSTOMER_ID not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ID between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ID not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIsNull() {
            addCriterion("CURRENCY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIsNotNull() {
            addCriterion("CURRENCY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdEqualTo(String value) {
            addCriterion("CURRENCY_ID =", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotEqualTo(String value) {
            addCriterion("CURRENCY_ID <>", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdGreaterThan(String value) {
            addCriterion("CURRENCY_ID >", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCY_ID >=", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdLessThan(String value) {
            addCriterion("CURRENCY_ID <", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdLessThanOrEqualTo(String value) {
            addCriterion("CURRENCY_ID <=", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdLike(String value) {
            addCriterion("CURRENCY_ID like", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotLike(String value) {
            addCriterion("CURRENCY_ID not like", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIn(List<String> values) {
            addCriterion("CURRENCY_ID in", values, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotIn(List<String> values) {
            addCriterion("CURRENCY_ID not in", values, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdBetween(String value1, String value2) {
            addCriterion("CURRENCY_ID between", value1, value2, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotBetween(String value1, String value2) {
            addCriterion("CURRENCY_ID not between", value1, value2, "currencyId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTermIdIsNull() {
            addCriterion("DELIVERY_TERM_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTermIdIsNotNull() {
            addCriterion("DELIVERY_TERM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTermIdEqualTo(String value) {
            addCriterion("DELIVERY_TERM_ID =", value, "deliveryTermId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTermIdNotEqualTo(String value) {
            addCriterion("DELIVERY_TERM_ID <>", value, "deliveryTermId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTermIdGreaterThan(String value) {
            addCriterion("DELIVERY_TERM_ID >", value, "deliveryTermId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTermIdGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERY_TERM_ID >=", value, "deliveryTermId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTermIdLessThan(String value) {
            addCriterion("DELIVERY_TERM_ID <", value, "deliveryTermId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTermIdLessThanOrEqualTo(String value) {
            addCriterion("DELIVERY_TERM_ID <=", value, "deliveryTermId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTermIdLike(String value) {
            addCriterion("DELIVERY_TERM_ID like", value, "deliveryTermId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTermIdNotLike(String value) {
            addCriterion("DELIVERY_TERM_ID not like", value, "deliveryTermId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTermIdIn(List<String> values) {
            addCriterion("DELIVERY_TERM_ID in", values, "deliveryTermId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTermIdNotIn(List<String> values) {
            addCriterion("DELIVERY_TERM_ID not in", values, "deliveryTermId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTermIdBetween(String value1, String value2) {
            addCriterion("DELIVERY_TERM_ID between", value1, value2, "deliveryTermId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTermIdNotBetween(String value1, String value2) {
            addCriterion("DELIVERY_TERM_ID not between", value1, value2, "deliveryTermId");
            return (Criteria) this;
        }

        public Criteria andPaymentTermIdIsNull() {
            addCriterion("PAYMENT_TERM_ID is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTermIdIsNotNull() {
            addCriterion("PAYMENT_TERM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTermIdEqualTo(String value) {
            addCriterion("PAYMENT_TERM_ID =", value, "paymentTermId");
            return (Criteria) this;
        }

        public Criteria andPaymentTermIdNotEqualTo(String value) {
            addCriterion("PAYMENT_TERM_ID <>", value, "paymentTermId");
            return (Criteria) this;
        }

        public Criteria andPaymentTermIdGreaterThan(String value) {
            addCriterion("PAYMENT_TERM_ID >", value, "paymentTermId");
            return (Criteria) this;
        }

        public Criteria andPaymentTermIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_TERM_ID >=", value, "paymentTermId");
            return (Criteria) this;
        }

        public Criteria andPaymentTermIdLessThan(String value) {
            addCriterion("PAYMENT_TERM_ID <", value, "paymentTermId");
            return (Criteria) this;
        }

        public Criteria andPaymentTermIdLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_TERM_ID <=", value, "paymentTermId");
            return (Criteria) this;
        }

        public Criteria andPaymentTermIdLike(String value) {
            addCriterion("PAYMENT_TERM_ID like", value, "paymentTermId");
            return (Criteria) this;
        }

        public Criteria andPaymentTermIdNotLike(String value) {
            addCriterion("PAYMENT_TERM_ID not like", value, "paymentTermId");
            return (Criteria) this;
        }

        public Criteria andPaymentTermIdIn(List<String> values) {
            addCriterion("PAYMENT_TERM_ID in", values, "paymentTermId");
            return (Criteria) this;
        }

        public Criteria andPaymentTermIdNotIn(List<String> values) {
            addCriterion("PAYMENT_TERM_ID not in", values, "paymentTermId");
            return (Criteria) this;
        }

        public Criteria andPaymentTermIdBetween(String value1, String value2) {
            addCriterion("PAYMENT_TERM_ID between", value1, value2, "paymentTermId");
            return (Criteria) this;
        }

        public Criteria andPaymentTermIdNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_TERM_ID not between", value1, value2, "paymentTermId");
            return (Criteria) this;
        }

        public Criteria andShipToCustomerIdIsNull() {
            addCriterion("SHIP_TO_CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andShipToCustomerIdIsNotNull() {
            addCriterion("SHIP_TO_CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShipToCustomerIdEqualTo(String value) {
            addCriterion("SHIP_TO_CUSTOMER_ID =", value, "shipToCustomerId");
            return (Criteria) this;
        }

        public Criteria andShipToCustomerIdNotEqualTo(String value) {
            addCriterion("SHIP_TO_CUSTOMER_ID <>", value, "shipToCustomerId");
            return (Criteria) this;
        }

        public Criteria andShipToCustomerIdGreaterThan(String value) {
            addCriterion("SHIP_TO_CUSTOMER_ID >", value, "shipToCustomerId");
            return (Criteria) this;
        }

        public Criteria andShipToCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("SHIP_TO_CUSTOMER_ID >=", value, "shipToCustomerId");
            return (Criteria) this;
        }

        public Criteria andShipToCustomerIdLessThan(String value) {
            addCriterion("SHIP_TO_CUSTOMER_ID <", value, "shipToCustomerId");
            return (Criteria) this;
        }

        public Criteria andShipToCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("SHIP_TO_CUSTOMER_ID <=", value, "shipToCustomerId");
            return (Criteria) this;
        }

        public Criteria andShipToCustomerIdLike(String value) {
            addCriterion("SHIP_TO_CUSTOMER_ID like", value, "shipToCustomerId");
            return (Criteria) this;
        }

        public Criteria andShipToCustomerIdNotLike(String value) {
            addCriterion("SHIP_TO_CUSTOMER_ID not like", value, "shipToCustomerId");
            return (Criteria) this;
        }

        public Criteria andShipToCustomerIdIn(List<String> values) {
            addCriterion("SHIP_TO_CUSTOMER_ID in", values, "shipToCustomerId");
            return (Criteria) this;
        }

        public Criteria andShipToCustomerIdNotIn(List<String> values) {
            addCriterion("SHIP_TO_CUSTOMER_ID not in", values, "shipToCustomerId");
            return (Criteria) this;
        }

        public Criteria andShipToCustomerIdBetween(String value1, String value2) {
            addCriterion("SHIP_TO_CUSTOMER_ID between", value1, value2, "shipToCustomerId");
            return (Criteria) this;
        }

        public Criteria andShipToCustomerIdNotBetween(String value1, String value2) {
            addCriterion("SHIP_TO_CUSTOMER_ID not between", value1, value2, "shipToCustomerId");
            return (Criteria) this;
        }

        public Criteria andInvoiceCustomerIdIsNull() {
            addCriterion("INVOICE_CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceCustomerIdIsNotNull() {
            addCriterion("INVOICE_CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceCustomerIdEqualTo(String value) {
            addCriterion("INVOICE_CUSTOMER_ID =", value, "invoiceCustomerId");
            return (Criteria) this;
        }

        public Criteria andInvoiceCustomerIdNotEqualTo(String value) {
            addCriterion("INVOICE_CUSTOMER_ID <>", value, "invoiceCustomerId");
            return (Criteria) this;
        }

        public Criteria andInvoiceCustomerIdGreaterThan(String value) {
            addCriterion("INVOICE_CUSTOMER_ID >", value, "invoiceCustomerId");
            return (Criteria) this;
        }

        public Criteria andInvoiceCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_CUSTOMER_ID >=", value, "invoiceCustomerId");
            return (Criteria) this;
        }

        public Criteria andInvoiceCustomerIdLessThan(String value) {
            addCriterion("INVOICE_CUSTOMER_ID <", value, "invoiceCustomerId");
            return (Criteria) this;
        }

        public Criteria andInvoiceCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_CUSTOMER_ID <=", value, "invoiceCustomerId");
            return (Criteria) this;
        }

        public Criteria andInvoiceCustomerIdLike(String value) {
            addCriterion("INVOICE_CUSTOMER_ID like", value, "invoiceCustomerId");
            return (Criteria) this;
        }

        public Criteria andInvoiceCustomerIdNotLike(String value) {
            addCriterion("INVOICE_CUSTOMER_ID not like", value, "invoiceCustomerId");
            return (Criteria) this;
        }

        public Criteria andInvoiceCustomerIdIn(List<String> values) {
            addCriterion("INVOICE_CUSTOMER_ID in", values, "invoiceCustomerId");
            return (Criteria) this;
        }

        public Criteria andInvoiceCustomerIdNotIn(List<String> values) {
            addCriterion("INVOICE_CUSTOMER_ID not in", values, "invoiceCustomerId");
            return (Criteria) this;
        }

        public Criteria andInvoiceCustomerIdBetween(String value1, String value2) {
            addCriterion("INVOICE_CUSTOMER_ID between", value1, value2, "invoiceCustomerId");
            return (Criteria) this;
        }

        public Criteria andInvoiceCustomerIdNotBetween(String value1, String value2) {
            addCriterion("INVOICE_CUSTOMER_ID not between", value1, value2, "invoiceCustomerId");
            return (Criteria) this;
        }

        public Criteria andCsTaxClassificationIdIsNull() {
            addCriterion("CS_TAX_CLASSIFICATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andCsTaxClassificationIdIsNotNull() {
            addCriterion("CS_TAX_CLASSIFICATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCsTaxClassificationIdEqualTo(String value) {
            addCriterion("CS_TAX_CLASSIFICATION_ID =", value, "csTaxClassificationId");
            return (Criteria) this;
        }

        public Criteria andCsTaxClassificationIdNotEqualTo(String value) {
            addCriterion("CS_TAX_CLASSIFICATION_ID <>", value, "csTaxClassificationId");
            return (Criteria) this;
        }

        public Criteria andCsTaxClassificationIdGreaterThan(String value) {
            addCriterion("CS_TAX_CLASSIFICATION_ID >", value, "csTaxClassificationId");
            return (Criteria) this;
        }

        public Criteria andCsTaxClassificationIdGreaterThanOrEqualTo(String value) {
            addCriterion("CS_TAX_CLASSIFICATION_ID >=", value, "csTaxClassificationId");
            return (Criteria) this;
        }

        public Criteria andCsTaxClassificationIdLessThan(String value) {
            addCriterion("CS_TAX_CLASSIFICATION_ID <", value, "csTaxClassificationId");
            return (Criteria) this;
        }

        public Criteria andCsTaxClassificationIdLessThanOrEqualTo(String value) {
            addCriterion("CS_TAX_CLASSIFICATION_ID <=", value, "csTaxClassificationId");
            return (Criteria) this;
        }

        public Criteria andCsTaxClassificationIdLike(String value) {
            addCriterion("CS_TAX_CLASSIFICATION_ID like", value, "csTaxClassificationId");
            return (Criteria) this;
        }

        public Criteria andCsTaxClassificationIdNotLike(String value) {
            addCriterion("CS_TAX_CLASSIFICATION_ID not like", value, "csTaxClassificationId");
            return (Criteria) this;
        }

        public Criteria andCsTaxClassificationIdIn(List<String> values) {
            addCriterion("CS_TAX_CLASSIFICATION_ID in", values, "csTaxClassificationId");
            return (Criteria) this;
        }

        public Criteria andCsTaxClassificationIdNotIn(List<String> values) {
            addCriterion("CS_TAX_CLASSIFICATION_ID not in", values, "csTaxClassificationId");
            return (Criteria) this;
        }

        public Criteria andCsTaxClassificationIdBetween(String value1, String value2) {
            addCriterion("CS_TAX_CLASSIFICATION_ID between", value1, value2, "csTaxClassificationId");
            return (Criteria) this;
        }

        public Criteria andCsTaxClassificationIdNotBetween(String value1, String value2) {
            addCriterion("CS_TAX_CLASSIFICATION_ID not between", value1, value2, "csTaxClassificationId");
            return (Criteria) this;
        }

        public Criteria andDirectSettlementIndicatorIsNull() {
            addCriterion("DIRECT_SETTLEMENT_INDICATOR is null");
            return (Criteria) this;
        }

        public Criteria andDirectSettlementIndicatorIsNotNull() {
            addCriterion("DIRECT_SETTLEMENT_INDICATOR is not null");
            return (Criteria) this;
        }

        public Criteria andDirectSettlementIndicatorEqualTo(Boolean value) {
            addCriterion("DIRECT_SETTLEMENT_INDICATOR =", value, "directSettlementIndicator");
            return (Criteria) this;
        }

        public Criteria andDirectSettlementIndicatorNotEqualTo(Boolean value) {
            addCriterion("DIRECT_SETTLEMENT_INDICATOR <>", value, "directSettlementIndicator");
            return (Criteria) this;
        }

        public Criteria andDirectSettlementIndicatorGreaterThan(Boolean value) {
            addCriterion("DIRECT_SETTLEMENT_INDICATOR >", value, "directSettlementIndicator");
            return (Criteria) this;
        }

        public Criteria andDirectSettlementIndicatorGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DIRECT_SETTLEMENT_INDICATOR >=", value, "directSettlementIndicator");
            return (Criteria) this;
        }

        public Criteria andDirectSettlementIndicatorLessThan(Boolean value) {
            addCriterion("DIRECT_SETTLEMENT_INDICATOR <", value, "directSettlementIndicator");
            return (Criteria) this;
        }

        public Criteria andDirectSettlementIndicatorLessThanOrEqualTo(Boolean value) {
            addCriterion("DIRECT_SETTLEMENT_INDICATOR <=", value, "directSettlementIndicator");
            return (Criteria) this;
        }

        public Criteria andDirectSettlementIndicatorIn(List<Boolean> values) {
            addCriterion("DIRECT_SETTLEMENT_INDICATOR in", values, "directSettlementIndicator");
            return (Criteria) this;
        }

        public Criteria andDirectSettlementIndicatorNotIn(List<Boolean> values) {
            addCriterion("DIRECT_SETTLEMENT_INDICATOR not in", values, "directSettlementIndicator");
            return (Criteria) this;
        }

        public Criteria andDirectSettlementIndicatorBetween(Boolean value1, Boolean value2) {
            addCriterion("DIRECT_SETTLEMENT_INDICATOR between", value1, value2, "directSettlementIndicator");
            return (Criteria) this;
        }

        public Criteria andDirectSettlementIndicatorNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DIRECT_SETTLEMENT_INDICATOR not between", value1, value2, "directSettlementIndicator");
            return (Criteria) this;
        }

        public Criteria andDirectInvoicingIndicatorIsNull() {
            addCriterion("DIRECT_INVOICING_INDICATOR is null");
            return (Criteria) this;
        }

        public Criteria andDirectInvoicingIndicatorIsNotNull() {
            addCriterion("DIRECT_INVOICING_INDICATOR is not null");
            return (Criteria) this;
        }

        public Criteria andDirectInvoicingIndicatorEqualTo(Boolean value) {
            addCriterion("DIRECT_INVOICING_INDICATOR =", value, "directInvoicingIndicator");
            return (Criteria) this;
        }

        public Criteria andDirectInvoicingIndicatorNotEqualTo(Boolean value) {
            addCriterion("DIRECT_INVOICING_INDICATOR <>", value, "directInvoicingIndicator");
            return (Criteria) this;
        }

        public Criteria andDirectInvoicingIndicatorGreaterThan(Boolean value) {
            addCriterion("DIRECT_INVOICING_INDICATOR >", value, "directInvoicingIndicator");
            return (Criteria) this;
        }

        public Criteria andDirectInvoicingIndicatorGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DIRECT_INVOICING_INDICATOR >=", value, "directInvoicingIndicator");
            return (Criteria) this;
        }

        public Criteria andDirectInvoicingIndicatorLessThan(Boolean value) {
            addCriterion("DIRECT_INVOICING_INDICATOR <", value, "directInvoicingIndicator");
            return (Criteria) this;
        }

        public Criteria andDirectInvoicingIndicatorLessThanOrEqualTo(Boolean value) {
            addCriterion("DIRECT_INVOICING_INDICATOR <=", value, "directInvoicingIndicator");
            return (Criteria) this;
        }

        public Criteria andDirectInvoicingIndicatorIn(List<Boolean> values) {
            addCriterion("DIRECT_INVOICING_INDICATOR in", values, "directInvoicingIndicator");
            return (Criteria) this;
        }

        public Criteria andDirectInvoicingIndicatorNotIn(List<Boolean> values) {
            addCriterion("DIRECT_INVOICING_INDICATOR not in", values, "directInvoicingIndicator");
            return (Criteria) this;
        }

        public Criteria andDirectInvoicingIndicatorBetween(Boolean value1, Boolean value2) {
            addCriterion("DIRECT_INVOICING_INDICATOR between", value1, value2, "directInvoicingIndicator");
            return (Criteria) this;
        }

        public Criteria andDirectInvoicingIndicatorNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DIRECT_INVOICING_INDICATOR not between", value1, value2, "directInvoicingIndicator");
            return (Criteria) this;
        }

        public Criteria andCashSettlementIndicatorIsNull() {
            addCriterion("CASH_SETTLEMENT_INDICATOR is null");
            return (Criteria) this;
        }

        public Criteria andCashSettlementIndicatorIsNotNull() {
            addCriterion("CASH_SETTLEMENT_INDICATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCashSettlementIndicatorEqualTo(Boolean value) {
            addCriterion("CASH_SETTLEMENT_INDICATOR =", value, "cashSettlementIndicator");
            return (Criteria) this;
        }

        public Criteria andCashSettlementIndicatorNotEqualTo(Boolean value) {
            addCriterion("CASH_SETTLEMENT_INDICATOR <>", value, "cashSettlementIndicator");
            return (Criteria) this;
        }

        public Criteria andCashSettlementIndicatorGreaterThan(Boolean value) {
            addCriterion("CASH_SETTLEMENT_INDICATOR >", value, "cashSettlementIndicator");
            return (Criteria) this;
        }

        public Criteria andCashSettlementIndicatorGreaterThanOrEqualTo(Boolean value) {
            addCriterion("CASH_SETTLEMENT_INDICATOR >=", value, "cashSettlementIndicator");
            return (Criteria) this;
        }

        public Criteria andCashSettlementIndicatorLessThan(Boolean value) {
            addCriterion("CASH_SETTLEMENT_INDICATOR <", value, "cashSettlementIndicator");
            return (Criteria) this;
        }

        public Criteria andCashSettlementIndicatorLessThanOrEqualTo(Boolean value) {
            addCriterion("CASH_SETTLEMENT_INDICATOR <=", value, "cashSettlementIndicator");
            return (Criteria) this;
        }

        public Criteria andCashSettlementIndicatorIn(List<Boolean> values) {
            addCriterion("CASH_SETTLEMENT_INDICATOR in", values, "cashSettlementIndicator");
            return (Criteria) this;
        }

        public Criteria andCashSettlementIndicatorNotIn(List<Boolean> values) {
            addCriterion("CASH_SETTLEMENT_INDICATOR not in", values, "cashSettlementIndicator");
            return (Criteria) this;
        }

        public Criteria andCashSettlementIndicatorBetween(Boolean value1, Boolean value2) {
            addCriterion("CASH_SETTLEMENT_INDICATOR between", value1, value2, "cashSettlementIndicator");
            return (Criteria) this;
        }

        public Criteria andCashSettlementIndicatorNotBetween(Boolean value1, Boolean value2) {
            addCriterion("CASH_SETTLEMENT_INDICATOR not between", value1, value2, "cashSettlementIndicator");
            return (Criteria) this;
        }

        public Criteria andCrmTrackStatusIsNull() {
            addCriterion("CRM_TRACK_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCrmTrackStatusIsNotNull() {
            addCriterion("CRM_TRACK_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCrmTrackStatusEqualTo(String value) {
            addCriterion("CRM_TRACK_STATUS =", value, "crmTrackStatus");
            return (Criteria) this;
        }

        public Criteria andCrmTrackStatusNotEqualTo(String value) {
            addCriterion("CRM_TRACK_STATUS <>", value, "crmTrackStatus");
            return (Criteria) this;
        }

        public Criteria andCrmTrackStatusGreaterThan(String value) {
            addCriterion("CRM_TRACK_STATUS >", value, "crmTrackStatus");
            return (Criteria) this;
        }

        public Criteria andCrmTrackStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CRM_TRACK_STATUS >=", value, "crmTrackStatus");
            return (Criteria) this;
        }

        public Criteria andCrmTrackStatusLessThan(String value) {
            addCriterion("CRM_TRACK_STATUS <", value, "crmTrackStatus");
            return (Criteria) this;
        }

        public Criteria andCrmTrackStatusLessThanOrEqualTo(String value) {
            addCriterion("CRM_TRACK_STATUS <=", value, "crmTrackStatus");
            return (Criteria) this;
        }

        public Criteria andCrmTrackStatusLike(String value) {
            addCriterion("CRM_TRACK_STATUS like", value, "crmTrackStatus");
            return (Criteria) this;
        }

        public Criteria andCrmTrackStatusNotLike(String value) {
            addCriterion("CRM_TRACK_STATUS not like", value, "crmTrackStatus");
            return (Criteria) this;
        }

        public Criteria andCrmTrackStatusIn(List<String> values) {
            addCriterion("CRM_TRACK_STATUS in", values, "crmTrackStatus");
            return (Criteria) this;
        }

        public Criteria andCrmTrackStatusNotIn(List<String> values) {
            addCriterion("CRM_TRACK_STATUS not in", values, "crmTrackStatus");
            return (Criteria) this;
        }

        public Criteria andCrmTrackStatusBetween(String value1, String value2) {
            addCriterion("CRM_TRACK_STATUS between", value1, value2, "crmTrackStatus");
            return (Criteria) this;
        }

        public Criteria andCrmTrackStatusNotBetween(String value1, String value2) {
            addCriterion("CRM_TRACK_STATUS not between", value1, value2, "crmTrackStatus");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("BRAND is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("BRAND is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("BRAND =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("BRAND <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("BRAND >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("BRAND >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("BRAND <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("BRAND <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("BRAND like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("BRAND not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("BRAND in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("BRAND not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("BRAND between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("BRAND not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNull() {
            addCriterion("DESTINATION is null");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNotNull() {
            addCriterion("DESTINATION is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationEqualTo(String value) {
            addCriterion("DESTINATION =", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotEqualTo(String value) {
            addCriterion("DESTINATION <>", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThan(String value) {
            addCriterion("DESTINATION >", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("DESTINATION >=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThan(String value) {
            addCriterion("DESTINATION <", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThanOrEqualTo(String value) {
            addCriterion("DESTINATION <=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLike(String value) {
            addCriterion("DESTINATION like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotLike(String value) {
            addCriterion("DESTINATION not like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationIn(List<String> values) {
            addCriterion("DESTINATION in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotIn(List<String> values) {
            addCriterion("DESTINATION not in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationBetween(String value1, String value2) {
            addCriterion("DESTINATION between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotBetween(String value1, String value2) {
            addCriterion("DESTINATION not between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andShippingPortIsNull() {
            addCriterion("SHIPPING_PORT is null");
            return (Criteria) this;
        }

        public Criteria andShippingPortIsNotNull() {
            addCriterion("SHIPPING_PORT is not null");
            return (Criteria) this;
        }

        public Criteria andShippingPortEqualTo(String value) {
            addCriterion("SHIPPING_PORT =", value, "shippingPort");
            return (Criteria) this;
        }

        public Criteria andShippingPortNotEqualTo(String value) {
            addCriterion("SHIPPING_PORT <>", value, "shippingPort");
            return (Criteria) this;
        }

        public Criteria andShippingPortGreaterThan(String value) {
            addCriterion("SHIPPING_PORT >", value, "shippingPort");
            return (Criteria) this;
        }

        public Criteria andShippingPortGreaterThanOrEqualTo(String value) {
            addCriterion("SHIPPING_PORT >=", value, "shippingPort");
            return (Criteria) this;
        }

        public Criteria andShippingPortLessThan(String value) {
            addCriterion("SHIPPING_PORT <", value, "shippingPort");
            return (Criteria) this;
        }

        public Criteria andShippingPortLessThanOrEqualTo(String value) {
            addCriterion("SHIPPING_PORT <=", value, "shippingPort");
            return (Criteria) this;
        }

        public Criteria andShippingPortLike(String value) {
            addCriterion("SHIPPING_PORT like", value, "shippingPort");
            return (Criteria) this;
        }

        public Criteria andShippingPortNotLike(String value) {
            addCriterion("SHIPPING_PORT not like", value, "shippingPort");
            return (Criteria) this;
        }

        public Criteria andShippingPortIn(List<String> values) {
            addCriterion("SHIPPING_PORT in", values, "shippingPort");
            return (Criteria) this;
        }

        public Criteria andShippingPortNotIn(List<String> values) {
            addCriterion("SHIPPING_PORT not in", values, "shippingPort");
            return (Criteria) this;
        }

        public Criteria andShippingPortBetween(String value1, String value2) {
            addCriterion("SHIPPING_PORT between", value1, value2, "shippingPort");
            return (Criteria) this;
        }

        public Criteria andShippingPortNotBetween(String value1, String value2) {
            addCriterion("SHIPPING_PORT not between", value1, value2, "shippingPort");
            return (Criteria) this;
        }

        public Criteria andAirPortIsNull() {
            addCriterion("AIR_PORT is null");
            return (Criteria) this;
        }

        public Criteria andAirPortIsNotNull() {
            addCriterion("AIR_PORT is not null");
            return (Criteria) this;
        }

        public Criteria andAirPortEqualTo(String value) {
            addCriterion("AIR_PORT =", value, "airPort");
            return (Criteria) this;
        }

        public Criteria andAirPortNotEqualTo(String value) {
            addCriterion("AIR_PORT <>", value, "airPort");
            return (Criteria) this;
        }

        public Criteria andAirPortGreaterThan(String value) {
            addCriterion("AIR_PORT >", value, "airPort");
            return (Criteria) this;
        }

        public Criteria andAirPortGreaterThanOrEqualTo(String value) {
            addCriterion("AIR_PORT >=", value, "airPort");
            return (Criteria) this;
        }

        public Criteria andAirPortLessThan(String value) {
            addCriterion("AIR_PORT <", value, "airPort");
            return (Criteria) this;
        }

        public Criteria andAirPortLessThanOrEqualTo(String value) {
            addCriterion("AIR_PORT <=", value, "airPort");
            return (Criteria) this;
        }

        public Criteria andAirPortLike(String value) {
            addCriterion("AIR_PORT like", value, "airPort");
            return (Criteria) this;
        }

        public Criteria andAirPortNotLike(String value) {
            addCriterion("AIR_PORT not like", value, "airPort");
            return (Criteria) this;
        }

        public Criteria andAirPortIn(List<String> values) {
            addCriterion("AIR_PORT in", values, "airPort");
            return (Criteria) this;
        }

        public Criteria andAirPortNotIn(List<String> values) {
            addCriterion("AIR_PORT not in", values, "airPort");
            return (Criteria) this;
        }

        public Criteria andAirPortBetween(String value1, String value2) {
            addCriterion("AIR_PORT between", value1, value2, "airPort");
            return (Criteria) this;
        }

        public Criteria andAirPortNotBetween(String value1, String value2) {
            addCriterion("AIR_PORT not between", value1, value2, "airPort");
            return (Criteria) this;
        }

        public Criteria andAgentCustomerIdIsNull() {
            addCriterion("AGENT_CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andAgentCustomerIdIsNotNull() {
            addCriterion("AGENT_CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAgentCustomerIdEqualTo(String value) {
            addCriterion("AGENT_CUSTOMER_ID =", value, "agentCustomerId");
            return (Criteria) this;
        }

        public Criteria andAgentCustomerIdNotEqualTo(String value) {
            addCriterion("AGENT_CUSTOMER_ID <>", value, "agentCustomerId");
            return (Criteria) this;
        }

        public Criteria andAgentCustomerIdGreaterThan(String value) {
            addCriterion("AGENT_CUSTOMER_ID >", value, "agentCustomerId");
            return (Criteria) this;
        }

        public Criteria andAgentCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("AGENT_CUSTOMER_ID >=", value, "agentCustomerId");
            return (Criteria) this;
        }

        public Criteria andAgentCustomerIdLessThan(String value) {
            addCriterion("AGENT_CUSTOMER_ID <", value, "agentCustomerId");
            return (Criteria) this;
        }

        public Criteria andAgentCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("AGENT_CUSTOMER_ID <=", value, "agentCustomerId");
            return (Criteria) this;
        }

        public Criteria andAgentCustomerIdLike(String value) {
            addCriterion("AGENT_CUSTOMER_ID like", value, "agentCustomerId");
            return (Criteria) this;
        }

        public Criteria andAgentCustomerIdNotLike(String value) {
            addCriterion("AGENT_CUSTOMER_ID not like", value, "agentCustomerId");
            return (Criteria) this;
        }

        public Criteria andAgentCustomerIdIn(List<String> values) {
            addCriterion("AGENT_CUSTOMER_ID in", values, "agentCustomerId");
            return (Criteria) this;
        }

        public Criteria andAgentCustomerIdNotIn(List<String> values) {
            addCriterion("AGENT_CUSTOMER_ID not in", values, "agentCustomerId");
            return (Criteria) this;
        }

        public Criteria andAgentCustomerIdBetween(String value1, String value2) {
            addCriterion("AGENT_CUSTOMER_ID between", value1, value2, "agentCustomerId");
            return (Criteria) this;
        }

        public Criteria andAgentCustomerIdNotBetween(String value1, String value2) {
            addCriterion("AGENT_CUSTOMER_ID not between", value1, value2, "agentCustomerId");
            return (Criteria) this;
        }

        public Criteria andBrokersSupplierIdIsNull() {
            addCriterion("BROKERS_SUPPLIER_ID is null");
            return (Criteria) this;
        }

        public Criteria andBrokersSupplierIdIsNotNull() {
            addCriterion("BROKERS_SUPPLIER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBrokersSupplierIdEqualTo(String value) {
            addCriterion("BROKERS_SUPPLIER_ID =", value, "brokersSupplierId");
            return (Criteria) this;
        }

        public Criteria andBrokersSupplierIdNotEqualTo(String value) {
            addCriterion("BROKERS_SUPPLIER_ID <>", value, "brokersSupplierId");
            return (Criteria) this;
        }

        public Criteria andBrokersSupplierIdGreaterThan(String value) {
            addCriterion("BROKERS_SUPPLIER_ID >", value, "brokersSupplierId");
            return (Criteria) this;
        }

        public Criteria andBrokersSupplierIdGreaterThanOrEqualTo(String value) {
            addCriterion("BROKERS_SUPPLIER_ID >=", value, "brokersSupplierId");
            return (Criteria) this;
        }

        public Criteria andBrokersSupplierIdLessThan(String value) {
            addCriterion("BROKERS_SUPPLIER_ID <", value, "brokersSupplierId");
            return (Criteria) this;
        }

        public Criteria andBrokersSupplierIdLessThanOrEqualTo(String value) {
            addCriterion("BROKERS_SUPPLIER_ID <=", value, "brokersSupplierId");
            return (Criteria) this;
        }

        public Criteria andBrokersSupplierIdLike(String value) {
            addCriterion("BROKERS_SUPPLIER_ID like", value, "brokersSupplierId");
            return (Criteria) this;
        }

        public Criteria andBrokersSupplierIdNotLike(String value) {
            addCriterion("BROKERS_SUPPLIER_ID not like", value, "brokersSupplierId");
            return (Criteria) this;
        }

        public Criteria andBrokersSupplierIdIn(List<String> values) {
            addCriterion("BROKERS_SUPPLIER_ID in", values, "brokersSupplierId");
            return (Criteria) this;
        }

        public Criteria andBrokersSupplierIdNotIn(List<String> values) {
            addCriterion("BROKERS_SUPPLIER_ID not in", values, "brokersSupplierId");
            return (Criteria) this;
        }

        public Criteria andBrokersSupplierIdBetween(String value1, String value2) {
            addCriterion("BROKERS_SUPPLIER_ID between", value1, value2, "brokersSupplierId");
            return (Criteria) this;
        }

        public Criteria andBrokersSupplierIdNotBetween(String value1, String value2) {
            addCriterion("BROKERS_SUPPLIER_ID not between", value1, value2, "brokersSupplierId");
            return (Criteria) this;
        }

        public Criteria andInspectionSupplierIdIsNull() {
            addCriterion("INSPECTION_SUPPLIER_ID is null");
            return (Criteria) this;
        }

        public Criteria andInspectionSupplierIdIsNotNull() {
            addCriterion("INSPECTION_SUPPLIER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionSupplierIdEqualTo(String value) {
            addCriterion("INSPECTION_SUPPLIER_ID =", value, "inspectionSupplierId");
            return (Criteria) this;
        }

        public Criteria andInspectionSupplierIdNotEqualTo(String value) {
            addCriterion("INSPECTION_SUPPLIER_ID <>", value, "inspectionSupplierId");
            return (Criteria) this;
        }

        public Criteria andInspectionSupplierIdGreaterThan(String value) {
            addCriterion("INSPECTION_SUPPLIER_ID >", value, "inspectionSupplierId");
            return (Criteria) this;
        }

        public Criteria andInspectionSupplierIdGreaterThanOrEqualTo(String value) {
            addCriterion("INSPECTION_SUPPLIER_ID >=", value, "inspectionSupplierId");
            return (Criteria) this;
        }

        public Criteria andInspectionSupplierIdLessThan(String value) {
            addCriterion("INSPECTION_SUPPLIER_ID <", value, "inspectionSupplierId");
            return (Criteria) this;
        }

        public Criteria andInspectionSupplierIdLessThanOrEqualTo(String value) {
            addCriterion("INSPECTION_SUPPLIER_ID <=", value, "inspectionSupplierId");
            return (Criteria) this;
        }

        public Criteria andInspectionSupplierIdLike(String value) {
            addCriterion("INSPECTION_SUPPLIER_ID like", value, "inspectionSupplierId");
            return (Criteria) this;
        }

        public Criteria andInspectionSupplierIdNotLike(String value) {
            addCriterion("INSPECTION_SUPPLIER_ID not like", value, "inspectionSupplierId");
            return (Criteria) this;
        }

        public Criteria andInspectionSupplierIdIn(List<String> values) {
            addCriterion("INSPECTION_SUPPLIER_ID in", values, "inspectionSupplierId");
            return (Criteria) this;
        }

        public Criteria andInspectionSupplierIdNotIn(List<String> values) {
            addCriterion("INSPECTION_SUPPLIER_ID not in", values, "inspectionSupplierId");
            return (Criteria) this;
        }

        public Criteria andInspectionSupplierIdBetween(String value1, String value2) {
            addCriterion("INSPECTION_SUPPLIER_ID between", value1, value2, "inspectionSupplierId");
            return (Criteria) this;
        }

        public Criteria andInspectionSupplierIdNotBetween(String value1, String value2) {
            addCriterion("INSPECTION_SUPPLIER_ID not between", value1, value2, "inspectionSupplierId");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIsNull() {
            addCriterion("COMMISSION_RATE is null");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIsNotNull() {
            addCriterion("COMMISSION_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionRateEqualTo(BigDecimal value) {
            addCriterion("COMMISSION_RATE =", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotEqualTo(BigDecimal value) {
            addCriterion("COMMISSION_RATE <>", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateGreaterThan(BigDecimal value) {
            addCriterion("COMMISSION_RATE >", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMISSION_RATE >=", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateLessThan(BigDecimal value) {
            addCriterion("COMMISSION_RATE <", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMISSION_RATE <=", value, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateIn(List<BigDecimal> values) {
            addCriterion("COMMISSION_RATE in", values, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotIn(List<BigDecimal> values) {
            addCriterion("COMMISSION_RATE not in", values, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMISSION_RATE between", value1, value2, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andCommissionRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMISSION_RATE not between", value1, value2, "commissionRate");
            return (Criteria) this;
        }

        public Criteria andInsuranceRateIsNull() {
            addCriterion("INSURANCE_RATE is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceRateIsNotNull() {
            addCriterion("INSURANCE_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceRateEqualTo(BigDecimal value) {
            addCriterion("INSURANCE_RATE =", value, "insuranceRate");
            return (Criteria) this;
        }

        public Criteria andInsuranceRateNotEqualTo(BigDecimal value) {
            addCriterion("INSURANCE_RATE <>", value, "insuranceRate");
            return (Criteria) this;
        }

        public Criteria andInsuranceRateGreaterThan(BigDecimal value) {
            addCriterion("INSURANCE_RATE >", value, "insuranceRate");
            return (Criteria) this;
        }

        public Criteria andInsuranceRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INSURANCE_RATE >=", value, "insuranceRate");
            return (Criteria) this;
        }

        public Criteria andInsuranceRateLessThan(BigDecimal value) {
            addCriterion("INSURANCE_RATE <", value, "insuranceRate");
            return (Criteria) this;
        }

        public Criteria andInsuranceRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INSURANCE_RATE <=", value, "insuranceRate");
            return (Criteria) this;
        }

        public Criteria andInsuranceRateIn(List<BigDecimal> values) {
            addCriterion("INSURANCE_RATE in", values, "insuranceRate");
            return (Criteria) this;
        }

        public Criteria andInsuranceRateNotIn(List<BigDecimal> values) {
            addCriterion("INSURANCE_RATE not in", values, "insuranceRate");
            return (Criteria) this;
        }

        public Criteria andInsuranceRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSURANCE_RATE between", value1, value2, "insuranceRate");
            return (Criteria) this;
        }

        public Criteria andInsuranceRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSURANCE_RATE not between", value1, value2, "insuranceRate");
            return (Criteria) this;
        }

        public Criteria andTransportSupplierIdIsNull() {
            addCriterion("TRANSPORT_SUPPLIER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTransportSupplierIdIsNotNull() {
            addCriterion("TRANSPORT_SUPPLIER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTransportSupplierIdEqualTo(String value) {
            addCriterion("TRANSPORT_SUPPLIER_ID =", value, "transportSupplierId");
            return (Criteria) this;
        }

        public Criteria andTransportSupplierIdNotEqualTo(String value) {
            addCriterion("TRANSPORT_SUPPLIER_ID <>", value, "transportSupplierId");
            return (Criteria) this;
        }

        public Criteria andTransportSupplierIdGreaterThan(String value) {
            addCriterion("TRANSPORT_SUPPLIER_ID >", value, "transportSupplierId");
            return (Criteria) this;
        }

        public Criteria andTransportSupplierIdGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSPORT_SUPPLIER_ID >=", value, "transportSupplierId");
            return (Criteria) this;
        }

        public Criteria andTransportSupplierIdLessThan(String value) {
            addCriterion("TRANSPORT_SUPPLIER_ID <", value, "transportSupplierId");
            return (Criteria) this;
        }

        public Criteria andTransportSupplierIdLessThanOrEqualTo(String value) {
            addCriterion("TRANSPORT_SUPPLIER_ID <=", value, "transportSupplierId");
            return (Criteria) this;
        }

        public Criteria andTransportSupplierIdLike(String value) {
            addCriterion("TRANSPORT_SUPPLIER_ID like", value, "transportSupplierId");
            return (Criteria) this;
        }

        public Criteria andTransportSupplierIdNotLike(String value) {
            addCriterion("TRANSPORT_SUPPLIER_ID not like", value, "transportSupplierId");
            return (Criteria) this;
        }

        public Criteria andTransportSupplierIdIn(List<String> values) {
            addCriterion("TRANSPORT_SUPPLIER_ID in", values, "transportSupplierId");
            return (Criteria) this;
        }

        public Criteria andTransportSupplierIdNotIn(List<String> values) {
            addCriterion("TRANSPORT_SUPPLIER_ID not in", values, "transportSupplierId");
            return (Criteria) this;
        }

        public Criteria andTransportSupplierIdBetween(String value1, String value2) {
            addCriterion("TRANSPORT_SUPPLIER_ID between", value1, value2, "transportSupplierId");
            return (Criteria) this;
        }

        public Criteria andTransportSupplierIdNotBetween(String value1, String value2) {
            addCriterion("TRANSPORT_SUPPLIER_ID not between", value1, value2, "transportSupplierId");
            return (Criteria) this;
        }

        public Criteria andPriceTermsIdIsNull() {
            addCriterion("PRICE_TERMS_ID is null");
            return (Criteria) this;
        }

        public Criteria andPriceTermsIdIsNotNull() {
            addCriterion("PRICE_TERMS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPriceTermsIdEqualTo(String value) {
            addCriterion("PRICE_TERMS_ID =", value, "priceTermsId");
            return (Criteria) this;
        }

        public Criteria andPriceTermsIdNotEqualTo(String value) {
            addCriterion("PRICE_TERMS_ID <>", value, "priceTermsId");
            return (Criteria) this;
        }

        public Criteria andPriceTermsIdGreaterThan(String value) {
            addCriterion("PRICE_TERMS_ID >", value, "priceTermsId");
            return (Criteria) this;
        }

        public Criteria andPriceTermsIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRICE_TERMS_ID >=", value, "priceTermsId");
            return (Criteria) this;
        }

        public Criteria andPriceTermsIdLessThan(String value) {
            addCriterion("PRICE_TERMS_ID <", value, "priceTermsId");
            return (Criteria) this;
        }

        public Criteria andPriceTermsIdLessThanOrEqualTo(String value) {
            addCriterion("PRICE_TERMS_ID <=", value, "priceTermsId");
            return (Criteria) this;
        }

        public Criteria andPriceTermsIdLike(String value) {
            addCriterion("PRICE_TERMS_ID like", value, "priceTermsId");
            return (Criteria) this;
        }

        public Criteria andPriceTermsIdNotLike(String value) {
            addCriterion("PRICE_TERMS_ID not like", value, "priceTermsId");
            return (Criteria) this;
        }

        public Criteria andPriceTermsIdIn(List<String> values) {
            addCriterion("PRICE_TERMS_ID in", values, "priceTermsId");
            return (Criteria) this;
        }

        public Criteria andPriceTermsIdNotIn(List<String> values) {
            addCriterion("PRICE_TERMS_ID not in", values, "priceTermsId");
            return (Criteria) this;
        }

        public Criteria andPriceTermsIdBetween(String value1, String value2) {
            addCriterion("PRICE_TERMS_ID between", value1, value2, "priceTermsId");
            return (Criteria) this;
        }

        public Criteria andPriceTermsIdNotBetween(String value1, String value2) {
            addCriterion("PRICE_TERMS_ID not between", value1, value2, "priceTermsId");
            return (Criteria) this;
        }

        public Criteria andTaxModeIsNull() {
            addCriterion("TAX_MODE is null");
            return (Criteria) this;
        }

        public Criteria andTaxModeIsNotNull() {
            addCriterion("TAX_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxModeEqualTo(String value) {
            addCriterion("TAX_MODE =", value, "taxMode");
            return (Criteria) this;
        }

        public Criteria andTaxModeNotEqualTo(String value) {
            addCriterion("TAX_MODE <>", value, "taxMode");
            return (Criteria) this;
        }

        public Criteria andTaxModeGreaterThan(String value) {
            addCriterion("TAX_MODE >", value, "taxMode");
            return (Criteria) this;
        }

        public Criteria andTaxModeGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_MODE >=", value, "taxMode");
            return (Criteria) this;
        }

        public Criteria andTaxModeLessThan(String value) {
            addCriterion("TAX_MODE <", value, "taxMode");
            return (Criteria) this;
        }

        public Criteria andTaxModeLessThanOrEqualTo(String value) {
            addCriterion("TAX_MODE <=", value, "taxMode");
            return (Criteria) this;
        }

        public Criteria andTaxModeLike(String value) {
            addCriterion("TAX_MODE like", value, "taxMode");
            return (Criteria) this;
        }

        public Criteria andTaxModeNotLike(String value) {
            addCriterion("TAX_MODE not like", value, "taxMode");
            return (Criteria) this;
        }

        public Criteria andTaxModeIn(List<String> values) {
            addCriterion("TAX_MODE in", values, "taxMode");
            return (Criteria) this;
        }

        public Criteria andTaxModeNotIn(List<String> values) {
            addCriterion("TAX_MODE not in", values, "taxMode");
            return (Criteria) this;
        }

        public Criteria andTaxModeBetween(String value1, String value2) {
            addCriterion("TAX_MODE between", value1, value2, "taxMode");
            return (Criteria) this;
        }

        public Criteria andTaxModeNotBetween(String value1, String value2) {
            addCriterion("TAX_MODE not between", value1, value2, "taxMode");
            return (Criteria) this;
        }

        public Criteria andTaxIdIsNull() {
            addCriterion("TAX_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaxIdIsNotNull() {
            addCriterion("TAX_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaxIdEqualTo(String value) {
            addCriterion("TAX_ID =", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdNotEqualTo(String value) {
            addCriterion("TAX_ID <>", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdGreaterThan(String value) {
            addCriterion("TAX_ID >", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_ID >=", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdLessThan(String value) {
            addCriterion("TAX_ID <", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdLessThanOrEqualTo(String value) {
            addCriterion("TAX_ID <=", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdLike(String value) {
            addCriterion("TAX_ID like", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdNotLike(String value) {
            addCriterion("TAX_ID not like", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdIn(List<String> values) {
            addCriterion("TAX_ID in", values, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdNotIn(List<String> values) {
            addCriterion("TAX_ID not in", values, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdBetween(String value1, String value2) {
            addCriterion("TAX_ID between", value1, value2, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdNotBetween(String value1, String value2) {
            addCriterion("TAX_ID not between", value1, value2, "taxId");
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