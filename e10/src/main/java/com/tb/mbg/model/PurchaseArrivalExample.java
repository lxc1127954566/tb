package com.tb.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseArrivalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseArrivalExample() {
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

        public Criteria andPurchaseArrivalIdIsNull() {
            addCriterion("PURCHASE_ARRIVAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseArrivalIdIsNotNull() {
            addCriterion("PURCHASE_ARRIVAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseArrivalIdEqualTo(String value) {
            addCriterion("PURCHASE_ARRIVAL_ID =", value, "purchaseArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurchaseArrivalIdNotEqualTo(String value) {
            addCriterion("PURCHASE_ARRIVAL_ID <>", value, "purchaseArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurchaseArrivalIdGreaterThan(String value) {
            addCriterion("PURCHASE_ARRIVAL_ID >", value, "purchaseArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurchaseArrivalIdGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_ARRIVAL_ID >=", value, "purchaseArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurchaseArrivalIdLessThan(String value) {
            addCriterion("PURCHASE_ARRIVAL_ID <", value, "purchaseArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurchaseArrivalIdLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_ARRIVAL_ID <=", value, "purchaseArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurchaseArrivalIdLike(String value) {
            addCriterion("PURCHASE_ARRIVAL_ID like", value, "purchaseArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurchaseArrivalIdNotLike(String value) {
            addCriterion("PURCHASE_ARRIVAL_ID not like", value, "purchaseArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurchaseArrivalIdIn(List<String> values) {
            addCriterion("PURCHASE_ARRIVAL_ID in", values, "purchaseArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurchaseArrivalIdNotIn(List<String> values) {
            addCriterion("PURCHASE_ARRIVAL_ID not in", values, "purchaseArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurchaseArrivalIdBetween(String value1, String value2) {
            addCriterion("PURCHASE_ARRIVAL_ID between", value1, value2, "purchaseArrivalId");
            return (Criteria) this;
        }

        public Criteria andPurchaseArrivalIdNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_ARRIVAL_ID not between", value1, value2, "purchaseArrivalId");
            return (Criteria) this;
        }

        public Criteria andDocNoIsNull() {
            addCriterion("DOC_NO is null");
            return (Criteria) this;
        }

        public Criteria andDocNoIsNotNull() {
            addCriterion("DOC_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDocNoEqualTo(String value) {
            addCriterion("DOC_NO =", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoNotEqualTo(String value) {
            addCriterion("DOC_NO <>", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoGreaterThan(String value) {
            addCriterion("DOC_NO >", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoGreaterThanOrEqualTo(String value) {
            addCriterion("DOC_NO >=", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoLessThan(String value) {
            addCriterion("DOC_NO <", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoLessThanOrEqualTo(String value) {
            addCriterion("DOC_NO <=", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoLike(String value) {
            addCriterion("DOC_NO like", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoNotLike(String value) {
            addCriterion("DOC_NO not like", value, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoIn(List<String> values) {
            addCriterion("DOC_NO in", values, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoNotIn(List<String> values) {
            addCriterion("DOC_NO not in", values, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoBetween(String value1, String value2) {
            addCriterion("DOC_NO between", value1, value2, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocNoNotBetween(String value1, String value2) {
            addCriterion("DOC_NO not between", value1, value2, "docNo");
            return (Criteria) this;
        }

        public Criteria andDocDateIsNull() {
            addCriterion("DOC_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDocDateIsNotNull() {
            addCriterion("DOC_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDocDateEqualTo(Date value) {
            addCriterion("DOC_DATE =", value, "docDate");
            return (Criteria) this;
        }

        public Criteria andDocDateNotEqualTo(Date value) {
            addCriterion("DOC_DATE <>", value, "docDate");
            return (Criteria) this;
        }

        public Criteria andDocDateGreaterThan(Date value) {
            addCriterion("DOC_DATE >", value, "docDate");
            return (Criteria) this;
        }

        public Criteria andDocDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DOC_DATE >=", value, "docDate");
            return (Criteria) this;
        }

        public Criteria andDocDateLessThan(Date value) {
            addCriterion("DOC_DATE <", value, "docDate");
            return (Criteria) this;
        }

        public Criteria andDocDateLessThanOrEqualTo(Date value) {
            addCriterion("DOC_DATE <=", value, "docDate");
            return (Criteria) this;
        }

        public Criteria andDocDateIn(List<Date> values) {
            addCriterion("DOC_DATE in", values, "docDate");
            return (Criteria) this;
        }

        public Criteria andDocDateNotIn(List<Date> values) {
            addCriterion("DOC_DATE not in", values, "docDate");
            return (Criteria) this;
        }

        public Criteria andDocDateBetween(Date value1, Date value2) {
            addCriterion("DOC_DATE between", value1, value2, "docDate");
            return (Criteria) this;
        }

        public Criteria andDocDateNotBetween(Date value1, Date value2) {
            addCriterion("DOC_DATE not between", value1, value2, "docDate");
            return (Criteria) this;
        }

        public Criteria andDocIdIsNull() {
            addCriterion("DOC_ID is null");
            return (Criteria) this;
        }

        public Criteria andDocIdIsNotNull() {
            addCriterion("DOC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDocIdEqualTo(String value) {
            addCriterion("DOC_ID =", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdNotEqualTo(String value) {
            addCriterion("DOC_ID <>", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdGreaterThan(String value) {
            addCriterion("DOC_ID >", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdGreaterThanOrEqualTo(String value) {
            addCriterion("DOC_ID >=", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdLessThan(String value) {
            addCriterion("DOC_ID <", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdLessThanOrEqualTo(String value) {
            addCriterion("DOC_ID <=", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdLike(String value) {
            addCriterion("DOC_ID like", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdNotLike(String value) {
            addCriterion("DOC_ID not like", value, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdIn(List<String> values) {
            addCriterion("DOC_ID in", values, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdNotIn(List<String> values) {
            addCriterion("DOC_ID not in", values, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdBetween(String value1, String value2) {
            addCriterion("DOC_ID between", value1, value2, "docId");
            return (Criteria) this;
        }

        public Criteria andDocIdNotBetween(String value1, String value2) {
            addCriterion("DOC_ID not between", value1, value2, "docId");
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

        public Criteria andCategoryIsNull() {
            addCriterion("CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("CATEGORY =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("CATEGORY <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("CATEGORY >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("CATEGORY <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("CATEGORY <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("CATEGORY like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("CATEGORY not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("CATEGORY in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("CATEGORY not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("CATEGORY between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("CATEGORY not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andArrivalDateIsNull() {
            addCriterion("ARRIVAL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andArrivalDateIsNotNull() {
            addCriterion("ARRIVAL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalDateEqualTo(Date value) {
            addCriterion("ARRIVAL_DATE =", value, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateNotEqualTo(Date value) {
            addCriterion("ARRIVAL_DATE <>", value, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateGreaterThan(Date value) {
            addCriterion("ARRIVAL_DATE >", value, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ARRIVAL_DATE >=", value, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateLessThan(Date value) {
            addCriterion("ARRIVAL_DATE <", value, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateLessThanOrEqualTo(Date value) {
            addCriterion("ARRIVAL_DATE <=", value, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateIn(List<Date> values) {
            addCriterion("ARRIVAL_DATE in", values, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateNotIn(List<Date> values) {
            addCriterion("ARRIVAL_DATE not in", values, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateBetween(Date value1, Date value2) {
            addCriterion("ARRIVAL_DATE between", value1, value2, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andArrivalDateNotBetween(Date value1, Date value2) {
            addCriterion("ARRIVAL_DATE not between", value1, value2, "arrivalDate");
            return (Criteria) this;
        }

        public Criteria andSupplierFullNameIsNull() {
            addCriterion("SUPPLIER_FULL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSupplierFullNameIsNotNull() {
            addCriterion("SUPPLIER_FULL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierFullNameEqualTo(String value) {
            addCriterion("SUPPLIER_FULL_NAME =", value, "supplierFullName");
            return (Criteria) this;
        }

        public Criteria andSupplierFullNameNotEqualTo(String value) {
            addCriterion("SUPPLIER_FULL_NAME <>", value, "supplierFullName");
            return (Criteria) this;
        }

        public Criteria andSupplierFullNameGreaterThan(String value) {
            addCriterion("SUPPLIER_FULL_NAME >", value, "supplierFullName");
            return (Criteria) this;
        }

        public Criteria andSupplierFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_FULL_NAME >=", value, "supplierFullName");
            return (Criteria) this;
        }

        public Criteria andSupplierFullNameLessThan(String value) {
            addCriterion("SUPPLIER_FULL_NAME <", value, "supplierFullName");
            return (Criteria) this;
        }

        public Criteria andSupplierFullNameLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_FULL_NAME <=", value, "supplierFullName");
            return (Criteria) this;
        }

        public Criteria andSupplierFullNameLike(String value) {
            addCriterion("SUPPLIER_FULL_NAME like", value, "supplierFullName");
            return (Criteria) this;
        }

        public Criteria andSupplierFullNameNotLike(String value) {
            addCriterion("SUPPLIER_FULL_NAME not like", value, "supplierFullName");
            return (Criteria) this;
        }

        public Criteria andSupplierFullNameIn(List<String> values) {
            addCriterion("SUPPLIER_FULL_NAME in", values, "supplierFullName");
            return (Criteria) this;
        }

        public Criteria andSupplierFullNameNotIn(List<String> values) {
            addCriterion("SUPPLIER_FULL_NAME not in", values, "supplierFullName");
            return (Criteria) this;
        }

        public Criteria andSupplierFullNameBetween(String value1, String value2) {
            addCriterion("SUPPLIER_FULL_NAME between", value1, value2, "supplierFullName");
            return (Criteria) this;
        }

        public Criteria andSupplierFullNameNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_FULL_NAME not between", value1, value2, "supplierFullName");
            return (Criteria) this;
        }

        public Criteria andSupplierOrderNoIsNull() {
            addCriterion("SUPPLIER_ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andSupplierOrderNoIsNotNull() {
            addCriterion("SUPPLIER_ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierOrderNoEqualTo(String value) {
            addCriterion("SUPPLIER_ORDER_NO =", value, "supplierOrderNo");
            return (Criteria) this;
        }

        public Criteria andSupplierOrderNoNotEqualTo(String value) {
            addCriterion("SUPPLIER_ORDER_NO <>", value, "supplierOrderNo");
            return (Criteria) this;
        }

        public Criteria andSupplierOrderNoGreaterThan(String value) {
            addCriterion("SUPPLIER_ORDER_NO >", value, "supplierOrderNo");
            return (Criteria) this;
        }

        public Criteria andSupplierOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_ORDER_NO >=", value, "supplierOrderNo");
            return (Criteria) this;
        }

        public Criteria andSupplierOrderNoLessThan(String value) {
            addCriterion("SUPPLIER_ORDER_NO <", value, "supplierOrderNo");
            return (Criteria) this;
        }

        public Criteria andSupplierOrderNoLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_ORDER_NO <=", value, "supplierOrderNo");
            return (Criteria) this;
        }

        public Criteria andSupplierOrderNoLike(String value) {
            addCriterion("SUPPLIER_ORDER_NO like", value, "supplierOrderNo");
            return (Criteria) this;
        }

        public Criteria andSupplierOrderNoNotLike(String value) {
            addCriterion("SUPPLIER_ORDER_NO not like", value, "supplierOrderNo");
            return (Criteria) this;
        }

        public Criteria andSupplierOrderNoIn(List<String> values) {
            addCriterion("SUPPLIER_ORDER_NO in", values, "supplierOrderNo");
            return (Criteria) this;
        }

        public Criteria andSupplierOrderNoNotIn(List<String> values) {
            addCriterion("SUPPLIER_ORDER_NO not in", values, "supplierOrderNo");
            return (Criteria) this;
        }

        public Criteria andSupplierOrderNoBetween(String value1, String value2) {
            addCriterion("SUPPLIER_ORDER_NO between", value1, value2, "supplierOrderNo");
            return (Criteria) this;
        }

        public Criteria andSupplierOrderNoNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_ORDER_NO not between", value1, value2, "supplierOrderNo");
            return (Criteria) this;
        }

        public Criteria andExchangeRateIsNull() {
            addCriterion("EXCHANGE_RATE is null");
            return (Criteria) this;
        }

        public Criteria andExchangeRateIsNotNull() {
            addCriterion("EXCHANGE_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeRateEqualTo(BigDecimal value) {
            addCriterion("EXCHANGE_RATE =", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotEqualTo(BigDecimal value) {
            addCriterion("EXCHANGE_RATE <>", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateGreaterThan(BigDecimal value) {
            addCriterion("EXCHANGE_RATE >", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHANGE_RATE >=", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateLessThan(BigDecimal value) {
            addCriterion("EXCHANGE_RATE <", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHANGE_RATE <=", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateIn(List<BigDecimal> values) {
            addCriterion("EXCHANGE_RATE in", values, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotIn(List<BigDecimal> values) {
            addCriterion("EXCHANGE_RATE not in", values, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHANGE_RATE between", value1, value2, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHANGE_RATE not between", value1, value2, "exchangeRate");
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

        public Criteria andPiecesIsNull() {
            addCriterion("PIECES is null");
            return (Criteria) this;
        }

        public Criteria andPiecesIsNotNull() {
            addCriterion("PIECES is not null");
            return (Criteria) this;
        }

        public Criteria andPiecesEqualTo(Integer value) {
            addCriterion("PIECES =", value, "pieces");
            return (Criteria) this;
        }

        public Criteria andPiecesNotEqualTo(Integer value) {
            addCriterion("PIECES <>", value, "pieces");
            return (Criteria) this;
        }

        public Criteria andPiecesGreaterThan(Integer value) {
            addCriterion("PIECES >", value, "pieces");
            return (Criteria) this;
        }

        public Criteria andPiecesGreaterThanOrEqualTo(Integer value) {
            addCriterion("PIECES >=", value, "pieces");
            return (Criteria) this;
        }

        public Criteria andPiecesLessThan(Integer value) {
            addCriterion("PIECES <", value, "pieces");
            return (Criteria) this;
        }

        public Criteria andPiecesLessThanOrEqualTo(Integer value) {
            addCriterion("PIECES <=", value, "pieces");
            return (Criteria) this;
        }

        public Criteria andPiecesIn(List<Integer> values) {
            addCriterion("PIECES in", values, "pieces");
            return (Criteria) this;
        }

        public Criteria andPiecesNotIn(List<Integer> values) {
            addCriterion("PIECES not in", values, "pieces");
            return (Criteria) this;
        }

        public Criteria andPiecesBetween(Integer value1, Integer value2) {
            addCriterion("PIECES between", value1, value2, "pieces");
            return (Criteria) this;
        }

        public Criteria andPiecesNotBetween(Integer value1, Integer value2) {
            addCriterion("PIECES not between", value1, value2, "pieces");
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

        public Criteria andSupplierContactNameIsNull() {
            addCriterion("SUPPLIER_CONTACT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNameIsNotNull() {
            addCriterion("SUPPLIER_CONTACT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNameEqualTo(String value) {
            addCriterion("SUPPLIER_CONTACT_NAME =", value, "supplierContactName");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNameNotEqualTo(String value) {
            addCriterion("SUPPLIER_CONTACT_NAME <>", value, "supplierContactName");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNameGreaterThan(String value) {
            addCriterion("SUPPLIER_CONTACT_NAME >", value, "supplierContactName");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_CONTACT_NAME >=", value, "supplierContactName");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNameLessThan(String value) {
            addCriterion("SUPPLIER_CONTACT_NAME <", value, "supplierContactName");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNameLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_CONTACT_NAME <=", value, "supplierContactName");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNameLike(String value) {
            addCriterion("SUPPLIER_CONTACT_NAME like", value, "supplierContactName");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNameNotLike(String value) {
            addCriterion("SUPPLIER_CONTACT_NAME not like", value, "supplierContactName");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNameIn(List<String> values) {
            addCriterion("SUPPLIER_CONTACT_NAME in", values, "supplierContactName");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNameNotIn(List<String> values) {
            addCriterion("SUPPLIER_CONTACT_NAME not in", values, "supplierContactName");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNameBetween(String value1, String value2) {
            addCriterion("SUPPLIER_CONTACT_NAME between", value1, value2, "supplierContactName");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNameNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_CONTACT_NAME not between", value1, value2, "supplierContactName");
            return (Criteria) this;
        }

        public Criteria andSupplierAddrNameIsNull() {
            addCriterion("SUPPLIER_ADDR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSupplierAddrNameIsNotNull() {
            addCriterion("SUPPLIER_ADDR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierAddrNameEqualTo(String value) {
            addCriterion("SUPPLIER_ADDR_NAME =", value, "supplierAddrName");
            return (Criteria) this;
        }

        public Criteria andSupplierAddrNameNotEqualTo(String value) {
            addCriterion("SUPPLIER_ADDR_NAME <>", value, "supplierAddrName");
            return (Criteria) this;
        }

        public Criteria andSupplierAddrNameGreaterThan(String value) {
            addCriterion("SUPPLIER_ADDR_NAME >", value, "supplierAddrName");
            return (Criteria) this;
        }

        public Criteria andSupplierAddrNameGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_ADDR_NAME >=", value, "supplierAddrName");
            return (Criteria) this;
        }

        public Criteria andSupplierAddrNameLessThan(String value) {
            addCriterion("SUPPLIER_ADDR_NAME <", value, "supplierAddrName");
            return (Criteria) this;
        }

        public Criteria andSupplierAddrNameLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_ADDR_NAME <=", value, "supplierAddrName");
            return (Criteria) this;
        }

        public Criteria andSupplierAddrNameLike(String value) {
            addCriterion("SUPPLIER_ADDR_NAME like", value, "supplierAddrName");
            return (Criteria) this;
        }

        public Criteria andSupplierAddrNameNotLike(String value) {
            addCriterion("SUPPLIER_ADDR_NAME not like", value, "supplierAddrName");
            return (Criteria) this;
        }

        public Criteria andSupplierAddrNameIn(List<String> values) {
            addCriterion("SUPPLIER_ADDR_NAME in", values, "supplierAddrName");
            return (Criteria) this;
        }

        public Criteria andSupplierAddrNameNotIn(List<String> values) {
            addCriterion("SUPPLIER_ADDR_NAME not in", values, "supplierAddrName");
            return (Criteria) this;
        }

        public Criteria andSupplierAddrNameBetween(String value1, String value2) {
            addCriterion("SUPPLIER_ADDR_NAME between", value1, value2, "supplierAddrName");
            return (Criteria) this;
        }

        public Criteria andSupplierAddrNameNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_ADDR_NAME not between", value1, value2, "supplierAddrName");
            return (Criteria) this;
        }

        public Criteria andInvoiceContactNameIsNull() {
            addCriterion("INVOICE_CONTACT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceContactNameIsNotNull() {
            addCriterion("INVOICE_CONTACT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceContactNameEqualTo(String value) {
            addCriterion("INVOICE_CONTACT_NAME =", value, "invoiceContactName");
            return (Criteria) this;
        }

        public Criteria andInvoiceContactNameNotEqualTo(String value) {
            addCriterion("INVOICE_CONTACT_NAME <>", value, "invoiceContactName");
            return (Criteria) this;
        }

        public Criteria andInvoiceContactNameGreaterThan(String value) {
            addCriterion("INVOICE_CONTACT_NAME >", value, "invoiceContactName");
            return (Criteria) this;
        }

        public Criteria andInvoiceContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_CONTACT_NAME >=", value, "invoiceContactName");
            return (Criteria) this;
        }

        public Criteria andInvoiceContactNameLessThan(String value) {
            addCriterion("INVOICE_CONTACT_NAME <", value, "invoiceContactName");
            return (Criteria) this;
        }

        public Criteria andInvoiceContactNameLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_CONTACT_NAME <=", value, "invoiceContactName");
            return (Criteria) this;
        }

        public Criteria andInvoiceContactNameLike(String value) {
            addCriterion("INVOICE_CONTACT_NAME like", value, "invoiceContactName");
            return (Criteria) this;
        }

        public Criteria andInvoiceContactNameNotLike(String value) {
            addCriterion("INVOICE_CONTACT_NAME not like", value, "invoiceContactName");
            return (Criteria) this;
        }

        public Criteria andInvoiceContactNameIn(List<String> values) {
            addCriterion("INVOICE_CONTACT_NAME in", values, "invoiceContactName");
            return (Criteria) this;
        }

        public Criteria andInvoiceContactNameNotIn(List<String> values) {
            addCriterion("INVOICE_CONTACT_NAME not in", values, "invoiceContactName");
            return (Criteria) this;
        }

        public Criteria andInvoiceContactNameBetween(String value1, String value2) {
            addCriterion("INVOICE_CONTACT_NAME between", value1, value2, "invoiceContactName");
            return (Criteria) this;
        }

        public Criteria andInvoiceContactNameNotBetween(String value1, String value2) {
            addCriterion("INVOICE_CONTACT_NAME not between", value1, value2, "invoiceContactName");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrNameIsNull() {
            addCriterion("INVOICE_ADDR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrNameIsNotNull() {
            addCriterion("INVOICE_ADDR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrNameEqualTo(String value) {
            addCriterion("INVOICE_ADDR_NAME =", value, "invoiceAddrName");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrNameNotEqualTo(String value) {
            addCriterion("INVOICE_ADDR_NAME <>", value, "invoiceAddrName");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrNameGreaterThan(String value) {
            addCriterion("INVOICE_ADDR_NAME >", value, "invoiceAddrName");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrNameGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_ADDR_NAME >=", value, "invoiceAddrName");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrNameLessThan(String value) {
            addCriterion("INVOICE_ADDR_NAME <", value, "invoiceAddrName");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrNameLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_ADDR_NAME <=", value, "invoiceAddrName");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrNameLike(String value) {
            addCriterion("INVOICE_ADDR_NAME like", value, "invoiceAddrName");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrNameNotLike(String value) {
            addCriterion("INVOICE_ADDR_NAME not like", value, "invoiceAddrName");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrNameIn(List<String> values) {
            addCriterion("INVOICE_ADDR_NAME in", values, "invoiceAddrName");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrNameNotIn(List<String> values) {
            addCriterion("INVOICE_ADDR_NAME not in", values, "invoiceAddrName");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrNameBetween(String value1, String value2) {
            addCriterion("INVOICE_ADDR_NAME between", value1, value2, "invoiceAddrName");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrNameNotBetween(String value1, String value2) {
            addCriterion("INVOICE_ADDR_NAME not between", value1, value2, "invoiceAddrName");
            return (Criteria) this;
        }

        public Criteria andAmountUnincludeTaxOcIsNull() {
            addCriterion("AMOUNT_UNINCLUDE_TAX_OC is null");
            return (Criteria) this;
        }

        public Criteria andAmountUnincludeTaxOcIsNotNull() {
            addCriterion("AMOUNT_UNINCLUDE_TAX_OC is not null");
            return (Criteria) this;
        }

        public Criteria andAmountUnincludeTaxOcEqualTo(BigDecimal value) {
            addCriterion("AMOUNT_UNINCLUDE_TAX_OC =", value, "amountUnincludeTaxOc");
            return (Criteria) this;
        }

        public Criteria andAmountUnincludeTaxOcNotEqualTo(BigDecimal value) {
            addCriterion("AMOUNT_UNINCLUDE_TAX_OC <>", value, "amountUnincludeTaxOc");
            return (Criteria) this;
        }

        public Criteria andAmountUnincludeTaxOcGreaterThan(BigDecimal value) {
            addCriterion("AMOUNT_UNINCLUDE_TAX_OC >", value, "amountUnincludeTaxOc");
            return (Criteria) this;
        }

        public Criteria andAmountUnincludeTaxOcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT_UNINCLUDE_TAX_OC >=", value, "amountUnincludeTaxOc");
            return (Criteria) this;
        }

        public Criteria andAmountUnincludeTaxOcLessThan(BigDecimal value) {
            addCriterion("AMOUNT_UNINCLUDE_TAX_OC <", value, "amountUnincludeTaxOc");
            return (Criteria) this;
        }

        public Criteria andAmountUnincludeTaxOcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT_UNINCLUDE_TAX_OC <=", value, "amountUnincludeTaxOc");
            return (Criteria) this;
        }

        public Criteria andAmountUnincludeTaxOcIn(List<BigDecimal> values) {
            addCriterion("AMOUNT_UNINCLUDE_TAX_OC in", values, "amountUnincludeTaxOc");
            return (Criteria) this;
        }

        public Criteria andAmountUnincludeTaxOcNotIn(List<BigDecimal> values) {
            addCriterion("AMOUNT_UNINCLUDE_TAX_OC not in", values, "amountUnincludeTaxOc");
            return (Criteria) this;
        }

        public Criteria andAmountUnincludeTaxOcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT_UNINCLUDE_TAX_OC between", value1, value2, "amountUnincludeTaxOc");
            return (Criteria) this;
        }

        public Criteria andAmountUnincludeTaxOcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT_UNINCLUDE_TAX_OC not between", value1, value2, "amountUnincludeTaxOc");
            return (Criteria) this;
        }

        public Criteria andTaxOcIsNull() {
            addCriterion("TAX_OC is null");
            return (Criteria) this;
        }

        public Criteria andTaxOcIsNotNull() {
            addCriterion("TAX_OC is not null");
            return (Criteria) this;
        }

        public Criteria andTaxOcEqualTo(BigDecimal value) {
            addCriterion("TAX_OC =", value, "taxOc");
            return (Criteria) this;
        }

        public Criteria andTaxOcNotEqualTo(BigDecimal value) {
            addCriterion("TAX_OC <>", value, "taxOc");
            return (Criteria) this;
        }

        public Criteria andTaxOcGreaterThan(BigDecimal value) {
            addCriterion("TAX_OC >", value, "taxOc");
            return (Criteria) this;
        }

        public Criteria andTaxOcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_OC >=", value, "taxOc");
            return (Criteria) this;
        }

        public Criteria andTaxOcLessThan(BigDecimal value) {
            addCriterion("TAX_OC <", value, "taxOc");
            return (Criteria) this;
        }

        public Criteria andTaxOcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_OC <=", value, "taxOc");
            return (Criteria) this;
        }

        public Criteria andTaxOcIn(List<BigDecimal> values) {
            addCriterion("TAX_OC in", values, "taxOc");
            return (Criteria) this;
        }

        public Criteria andTaxOcNotIn(List<BigDecimal> values) {
            addCriterion("TAX_OC not in", values, "taxOc");
            return (Criteria) this;
        }

        public Criteria andTaxOcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_OC between", value1, value2, "taxOc");
            return (Criteria) this;
        }

        public Criteria andTaxOcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_OC not between", value1, value2, "taxOc");
            return (Criteria) this;
        }

        public Criteria andAmountUnincludeTaxBcIsNull() {
            addCriterion("AMOUNT_UNINCLUDE_TAX_BC is null");
            return (Criteria) this;
        }

        public Criteria andAmountUnincludeTaxBcIsNotNull() {
            addCriterion("AMOUNT_UNINCLUDE_TAX_BC is not null");
            return (Criteria) this;
        }

        public Criteria andAmountUnincludeTaxBcEqualTo(BigDecimal value) {
            addCriterion("AMOUNT_UNINCLUDE_TAX_BC =", value, "amountUnincludeTaxBc");
            return (Criteria) this;
        }

        public Criteria andAmountUnincludeTaxBcNotEqualTo(BigDecimal value) {
            addCriterion("AMOUNT_UNINCLUDE_TAX_BC <>", value, "amountUnincludeTaxBc");
            return (Criteria) this;
        }

        public Criteria andAmountUnincludeTaxBcGreaterThan(BigDecimal value) {
            addCriterion("AMOUNT_UNINCLUDE_TAX_BC >", value, "amountUnincludeTaxBc");
            return (Criteria) this;
        }

        public Criteria andAmountUnincludeTaxBcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT_UNINCLUDE_TAX_BC >=", value, "amountUnincludeTaxBc");
            return (Criteria) this;
        }

        public Criteria andAmountUnincludeTaxBcLessThan(BigDecimal value) {
            addCriterion("AMOUNT_UNINCLUDE_TAX_BC <", value, "amountUnincludeTaxBc");
            return (Criteria) this;
        }

        public Criteria andAmountUnincludeTaxBcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT_UNINCLUDE_TAX_BC <=", value, "amountUnincludeTaxBc");
            return (Criteria) this;
        }

        public Criteria andAmountUnincludeTaxBcIn(List<BigDecimal> values) {
            addCriterion("AMOUNT_UNINCLUDE_TAX_BC in", values, "amountUnincludeTaxBc");
            return (Criteria) this;
        }

        public Criteria andAmountUnincludeTaxBcNotIn(List<BigDecimal> values) {
            addCriterion("AMOUNT_UNINCLUDE_TAX_BC not in", values, "amountUnincludeTaxBc");
            return (Criteria) this;
        }

        public Criteria andAmountUnincludeTaxBcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT_UNINCLUDE_TAX_BC between", value1, value2, "amountUnincludeTaxBc");
            return (Criteria) this;
        }

        public Criteria andAmountUnincludeTaxBcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT_UNINCLUDE_TAX_BC not between", value1, value2, "amountUnincludeTaxBc");
            return (Criteria) this;
        }

        public Criteria andTaxBcIsNull() {
            addCriterion("TAX_BC is null");
            return (Criteria) this;
        }

        public Criteria andTaxBcIsNotNull() {
            addCriterion("TAX_BC is not null");
            return (Criteria) this;
        }

        public Criteria andTaxBcEqualTo(BigDecimal value) {
            addCriterion("TAX_BC =", value, "taxBc");
            return (Criteria) this;
        }

        public Criteria andTaxBcNotEqualTo(BigDecimal value) {
            addCriterion("TAX_BC <>", value, "taxBc");
            return (Criteria) this;
        }

        public Criteria andTaxBcGreaterThan(BigDecimal value) {
            addCriterion("TAX_BC >", value, "taxBc");
            return (Criteria) this;
        }

        public Criteria andTaxBcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_BC >=", value, "taxBc");
            return (Criteria) this;
        }

        public Criteria andTaxBcLessThan(BigDecimal value) {
            addCriterion("TAX_BC <", value, "taxBc");
            return (Criteria) this;
        }

        public Criteria andTaxBcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_BC <=", value, "taxBc");
            return (Criteria) this;
        }

        public Criteria andTaxBcIn(List<BigDecimal> values) {
            addCriterion("TAX_BC in", values, "taxBc");
            return (Criteria) this;
        }

        public Criteria andTaxBcNotIn(List<BigDecimal> values) {
            addCriterion("TAX_BC not in", values, "taxBc");
            return (Criteria) this;
        }

        public Criteria andTaxBcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_BC between", value1, value2, "taxBc");
            return (Criteria) this;
        }

        public Criteria andTaxBcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_BC not between", value1, value2, "taxBc");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNull() {
            addCriterion("SOURCE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNotNull() {
            addCriterion("SOURCE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeEqualTo(String value) {
            addCriterion("SOURCE_TYPE =", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotEqualTo(String value) {
            addCriterion("SOURCE_TYPE <>", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThan(String value) {
            addCriterion("SOURCE_TYPE >", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_TYPE >=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThan(String value) {
            addCriterion("SOURCE_TYPE <", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_TYPE <=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLike(String value) {
            addCriterion("SOURCE_TYPE like", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotLike(String value) {
            addCriterion("SOURCE_TYPE not like", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIn(List<String> values) {
            addCriterion("SOURCE_TYPE in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotIn(List<String> values) {
            addCriterion("SOURCE_TYPE not in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeBetween(String value1, String value2) {
            addCriterion("SOURCE_TYPE between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotBetween(String value1, String value2) {
            addCriterion("SOURCE_TYPE not between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andTaxInvoiceNoIsNull() {
            addCriterion("TAX_INVOICE_NO is null");
            return (Criteria) this;
        }

        public Criteria andTaxInvoiceNoIsNotNull() {
            addCriterion("TAX_INVOICE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTaxInvoiceNoEqualTo(String value) {
            addCriterion("TAX_INVOICE_NO =", value, "taxInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andTaxInvoiceNoNotEqualTo(String value) {
            addCriterion("TAX_INVOICE_NO <>", value, "taxInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andTaxInvoiceNoGreaterThan(String value) {
            addCriterion("TAX_INVOICE_NO >", value, "taxInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andTaxInvoiceNoGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_INVOICE_NO >=", value, "taxInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andTaxInvoiceNoLessThan(String value) {
            addCriterion("TAX_INVOICE_NO <", value, "taxInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andTaxInvoiceNoLessThanOrEqualTo(String value) {
            addCriterion("TAX_INVOICE_NO <=", value, "taxInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andTaxInvoiceNoLike(String value) {
            addCriterion("TAX_INVOICE_NO like", value, "taxInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andTaxInvoiceNoNotLike(String value) {
            addCriterion("TAX_INVOICE_NO not like", value, "taxInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andTaxInvoiceNoIn(List<String> values) {
            addCriterion("TAX_INVOICE_NO in", values, "taxInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andTaxInvoiceNoNotIn(List<String> values) {
            addCriterion("TAX_INVOICE_NO not in", values, "taxInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andTaxInvoiceNoBetween(String value1, String value2) {
            addCriterion("TAX_INVOICE_NO between", value1, value2, "taxInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andTaxInvoiceNoNotBetween(String value1, String value2) {
            addCriterion("TAX_INVOICE_NO not between", value1, value2, "taxInvoiceNo");
            return (Criteria) this;
        }

        public Criteria andDeductibleIndicatorIsNull() {
            addCriterion("DEDUCTIBLE_INDICATOR is null");
            return (Criteria) this;
        }

        public Criteria andDeductibleIndicatorIsNotNull() {
            addCriterion("DEDUCTIBLE_INDICATOR is not null");
            return (Criteria) this;
        }

        public Criteria andDeductibleIndicatorEqualTo(Boolean value) {
            addCriterion("DEDUCTIBLE_INDICATOR =", value, "deductibleIndicator");
            return (Criteria) this;
        }

        public Criteria andDeductibleIndicatorNotEqualTo(Boolean value) {
            addCriterion("DEDUCTIBLE_INDICATOR <>", value, "deductibleIndicator");
            return (Criteria) this;
        }

        public Criteria andDeductibleIndicatorGreaterThan(Boolean value) {
            addCriterion("DEDUCTIBLE_INDICATOR >", value, "deductibleIndicator");
            return (Criteria) this;
        }

        public Criteria andDeductibleIndicatorGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DEDUCTIBLE_INDICATOR >=", value, "deductibleIndicator");
            return (Criteria) this;
        }

        public Criteria andDeductibleIndicatorLessThan(Boolean value) {
            addCriterion("DEDUCTIBLE_INDICATOR <", value, "deductibleIndicator");
            return (Criteria) this;
        }

        public Criteria andDeductibleIndicatorLessThanOrEqualTo(Boolean value) {
            addCriterion("DEDUCTIBLE_INDICATOR <=", value, "deductibleIndicator");
            return (Criteria) this;
        }

        public Criteria andDeductibleIndicatorIn(List<Boolean> values) {
            addCriterion("DEDUCTIBLE_INDICATOR in", values, "deductibleIndicator");
            return (Criteria) this;
        }

        public Criteria andDeductibleIndicatorNotIn(List<Boolean> values) {
            addCriterion("DEDUCTIBLE_INDICATOR not in", values, "deductibleIndicator");
            return (Criteria) this;
        }

        public Criteria andDeductibleIndicatorBetween(Boolean value1, Boolean value2) {
            addCriterion("DEDUCTIBLE_INDICATOR between", value1, value2, "deductibleIndicator");
            return (Criteria) this;
        }

        public Criteria andDeductibleIndicatorNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DEDUCTIBLE_INDICATOR not between", value1, value2, "deductibleIndicator");
            return (Criteria) this;
        }

        public Criteria andTaxInvoiceCategoryIdIsNull() {
            addCriterion("TAX_INVOICE_CATEGORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaxInvoiceCategoryIdIsNotNull() {
            addCriterion("TAX_INVOICE_CATEGORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaxInvoiceCategoryIdEqualTo(String value) {
            addCriterion("TAX_INVOICE_CATEGORY_ID =", value, "taxInvoiceCategoryId");
            return (Criteria) this;
        }

        public Criteria andTaxInvoiceCategoryIdNotEqualTo(String value) {
            addCriterion("TAX_INVOICE_CATEGORY_ID <>", value, "taxInvoiceCategoryId");
            return (Criteria) this;
        }

        public Criteria andTaxInvoiceCategoryIdGreaterThan(String value) {
            addCriterion("TAX_INVOICE_CATEGORY_ID >", value, "taxInvoiceCategoryId");
            return (Criteria) this;
        }

        public Criteria andTaxInvoiceCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_INVOICE_CATEGORY_ID >=", value, "taxInvoiceCategoryId");
            return (Criteria) this;
        }

        public Criteria andTaxInvoiceCategoryIdLessThan(String value) {
            addCriterion("TAX_INVOICE_CATEGORY_ID <", value, "taxInvoiceCategoryId");
            return (Criteria) this;
        }

        public Criteria andTaxInvoiceCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("TAX_INVOICE_CATEGORY_ID <=", value, "taxInvoiceCategoryId");
            return (Criteria) this;
        }

        public Criteria andTaxInvoiceCategoryIdLike(String value) {
            addCriterion("TAX_INVOICE_CATEGORY_ID like", value, "taxInvoiceCategoryId");
            return (Criteria) this;
        }

        public Criteria andTaxInvoiceCategoryIdNotLike(String value) {
            addCriterion("TAX_INVOICE_CATEGORY_ID not like", value, "taxInvoiceCategoryId");
            return (Criteria) this;
        }

        public Criteria andTaxInvoiceCategoryIdIn(List<String> values) {
            addCriterion("TAX_INVOICE_CATEGORY_ID in", values, "taxInvoiceCategoryId");
            return (Criteria) this;
        }

        public Criteria andTaxInvoiceCategoryIdNotIn(List<String> values) {
            addCriterion("TAX_INVOICE_CATEGORY_ID not in", values, "taxInvoiceCategoryId");
            return (Criteria) this;
        }

        public Criteria andTaxInvoiceCategoryIdBetween(String value1, String value2) {
            addCriterion("TAX_INVOICE_CATEGORY_ID between", value1, value2, "taxInvoiceCategoryId");
            return (Criteria) this;
        }

        public Criteria andTaxInvoiceCategoryIdNotBetween(String value1, String value2) {
            addCriterion("TAX_INVOICE_CATEGORY_ID not between", value1, value2, "taxInvoiceCategoryId");
            return (Criteria) this;
        }

        public Criteria andSupplierAddrIdIsNull() {
            addCriterion("SUPPLIER_ADDR_ID is null");
            return (Criteria) this;
        }

        public Criteria andSupplierAddrIdIsNotNull() {
            addCriterion("SUPPLIER_ADDR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierAddrIdEqualTo(String value) {
            addCriterion("SUPPLIER_ADDR_ID =", value, "supplierAddrId");
            return (Criteria) this;
        }

        public Criteria andSupplierAddrIdNotEqualTo(String value) {
            addCriterion("SUPPLIER_ADDR_ID <>", value, "supplierAddrId");
            return (Criteria) this;
        }

        public Criteria andSupplierAddrIdGreaterThan(String value) {
            addCriterion("SUPPLIER_ADDR_ID >", value, "supplierAddrId");
            return (Criteria) this;
        }

        public Criteria andSupplierAddrIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_ADDR_ID >=", value, "supplierAddrId");
            return (Criteria) this;
        }

        public Criteria andSupplierAddrIdLessThan(String value) {
            addCriterion("SUPPLIER_ADDR_ID <", value, "supplierAddrId");
            return (Criteria) this;
        }

        public Criteria andSupplierAddrIdLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_ADDR_ID <=", value, "supplierAddrId");
            return (Criteria) this;
        }

        public Criteria andSupplierAddrIdLike(String value) {
            addCriterion("SUPPLIER_ADDR_ID like", value, "supplierAddrId");
            return (Criteria) this;
        }

        public Criteria andSupplierAddrIdNotLike(String value) {
            addCriterion("SUPPLIER_ADDR_ID not like", value, "supplierAddrId");
            return (Criteria) this;
        }

        public Criteria andSupplierAddrIdIn(List<String> values) {
            addCriterion("SUPPLIER_ADDR_ID in", values, "supplierAddrId");
            return (Criteria) this;
        }

        public Criteria andSupplierAddrIdNotIn(List<String> values) {
            addCriterion("SUPPLIER_ADDR_ID not in", values, "supplierAddrId");
            return (Criteria) this;
        }

        public Criteria andSupplierAddrIdBetween(String value1, String value2) {
            addCriterion("SUPPLIER_ADDR_ID between", value1, value2, "supplierAddrId");
            return (Criteria) this;
        }

        public Criteria andSupplierAddrIdNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_ADDR_ID not between", value1, value2, "supplierAddrId");
            return (Criteria) this;
        }

        public Criteria andInvoiceContactIdIsNull() {
            addCriterion("INVOICE_CONTACT_ID is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceContactIdIsNotNull() {
            addCriterion("INVOICE_CONTACT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceContactIdEqualTo(String value) {
            addCriterion("INVOICE_CONTACT_ID =", value, "invoiceContactId");
            return (Criteria) this;
        }

        public Criteria andInvoiceContactIdNotEqualTo(String value) {
            addCriterion("INVOICE_CONTACT_ID <>", value, "invoiceContactId");
            return (Criteria) this;
        }

        public Criteria andInvoiceContactIdGreaterThan(String value) {
            addCriterion("INVOICE_CONTACT_ID >", value, "invoiceContactId");
            return (Criteria) this;
        }

        public Criteria andInvoiceContactIdGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_CONTACT_ID >=", value, "invoiceContactId");
            return (Criteria) this;
        }

        public Criteria andInvoiceContactIdLessThan(String value) {
            addCriterion("INVOICE_CONTACT_ID <", value, "invoiceContactId");
            return (Criteria) this;
        }

        public Criteria andInvoiceContactIdLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_CONTACT_ID <=", value, "invoiceContactId");
            return (Criteria) this;
        }

        public Criteria andInvoiceContactIdLike(String value) {
            addCriterion("INVOICE_CONTACT_ID like", value, "invoiceContactId");
            return (Criteria) this;
        }

        public Criteria andInvoiceContactIdNotLike(String value) {
            addCriterion("INVOICE_CONTACT_ID not like", value, "invoiceContactId");
            return (Criteria) this;
        }

        public Criteria andInvoiceContactIdIn(List<String> values) {
            addCriterion("INVOICE_CONTACT_ID in", values, "invoiceContactId");
            return (Criteria) this;
        }

        public Criteria andInvoiceContactIdNotIn(List<String> values) {
            addCriterion("INVOICE_CONTACT_ID not in", values, "invoiceContactId");
            return (Criteria) this;
        }

        public Criteria andInvoiceContactIdBetween(String value1, String value2) {
            addCriterion("INVOICE_CONTACT_ID between", value1, value2, "invoiceContactId");
            return (Criteria) this;
        }

        public Criteria andInvoiceContactIdNotBetween(String value1, String value2) {
            addCriterion("INVOICE_CONTACT_ID not between", value1, value2, "invoiceContactId");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrIdIsNull() {
            addCriterion("INVOICE_ADDR_ID is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrIdIsNotNull() {
            addCriterion("INVOICE_ADDR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrIdEqualTo(String value) {
            addCriterion("INVOICE_ADDR_ID =", value, "invoiceAddrId");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrIdNotEqualTo(String value) {
            addCriterion("INVOICE_ADDR_ID <>", value, "invoiceAddrId");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrIdGreaterThan(String value) {
            addCriterion("INVOICE_ADDR_ID >", value, "invoiceAddrId");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrIdGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_ADDR_ID >=", value, "invoiceAddrId");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrIdLessThan(String value) {
            addCriterion("INVOICE_ADDR_ID <", value, "invoiceAddrId");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrIdLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_ADDR_ID <=", value, "invoiceAddrId");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrIdLike(String value) {
            addCriterion("INVOICE_ADDR_ID like", value, "invoiceAddrId");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrIdNotLike(String value) {
            addCriterion("INVOICE_ADDR_ID not like", value, "invoiceAddrId");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrIdIn(List<String> values) {
            addCriterion("INVOICE_ADDR_ID in", values, "invoiceAddrId");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrIdNotIn(List<String> values) {
            addCriterion("INVOICE_ADDR_ID not in", values, "invoiceAddrId");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrIdBetween(String value1, String value2) {
            addCriterion("INVOICE_ADDR_ID between", value1, value2, "invoiceAddrId");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrIdNotBetween(String value1, String value2) {
            addCriterion("INVOICE_ADDR_ID not between", value1, value2, "invoiceAddrId");
            return (Criteria) this;
        }

        public Criteria andReceiptEmployeeIdIsNull() {
            addCriterion("RECEIPT_EMPLOYEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andReceiptEmployeeIdIsNotNull() {
            addCriterion("RECEIPT_EMPLOYEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptEmployeeIdEqualTo(String value) {
            addCriterion("RECEIPT_EMPLOYEE_ID =", value, "receiptEmployeeId");
            return (Criteria) this;
        }

        public Criteria andReceiptEmployeeIdNotEqualTo(String value) {
            addCriterion("RECEIPT_EMPLOYEE_ID <>", value, "receiptEmployeeId");
            return (Criteria) this;
        }

        public Criteria andReceiptEmployeeIdGreaterThan(String value) {
            addCriterion("RECEIPT_EMPLOYEE_ID >", value, "receiptEmployeeId");
            return (Criteria) this;
        }

        public Criteria andReceiptEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIPT_EMPLOYEE_ID >=", value, "receiptEmployeeId");
            return (Criteria) this;
        }

        public Criteria andReceiptEmployeeIdLessThan(String value) {
            addCriterion("RECEIPT_EMPLOYEE_ID <", value, "receiptEmployeeId");
            return (Criteria) this;
        }

        public Criteria andReceiptEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("RECEIPT_EMPLOYEE_ID <=", value, "receiptEmployeeId");
            return (Criteria) this;
        }

        public Criteria andReceiptEmployeeIdLike(String value) {
            addCriterion("RECEIPT_EMPLOYEE_ID like", value, "receiptEmployeeId");
            return (Criteria) this;
        }

        public Criteria andReceiptEmployeeIdNotLike(String value) {
            addCriterion("RECEIPT_EMPLOYEE_ID not like", value, "receiptEmployeeId");
            return (Criteria) this;
        }

        public Criteria andReceiptEmployeeIdIn(List<String> values) {
            addCriterion("RECEIPT_EMPLOYEE_ID in", values, "receiptEmployeeId");
            return (Criteria) this;
        }

        public Criteria andReceiptEmployeeIdNotIn(List<String> values) {
            addCriterion("RECEIPT_EMPLOYEE_ID not in", values, "receiptEmployeeId");
            return (Criteria) this;
        }

        public Criteria andReceiptEmployeeIdBetween(String value1, String value2) {
            addCriterion("RECEIPT_EMPLOYEE_ID between", value1, value2, "receiptEmployeeId");
            return (Criteria) this;
        }

        public Criteria andReceiptEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("RECEIPT_EMPLOYEE_ID not between", value1, value2, "receiptEmployeeId");
            return (Criteria) this;
        }

        public Criteria andPlantIdIsNull() {
            addCriterion("PLANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPlantIdIsNotNull() {
            addCriterion("PLANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPlantIdEqualTo(String value) {
            addCriterion("PLANT_ID =", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdNotEqualTo(String value) {
            addCriterion("PLANT_ID <>", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdGreaterThan(String value) {
            addCriterion("PLANT_ID >", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdGreaterThanOrEqualTo(String value) {
            addCriterion("PLANT_ID >=", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdLessThan(String value) {
            addCriterion("PLANT_ID <", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdLessThanOrEqualTo(String value) {
            addCriterion("PLANT_ID <=", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdLike(String value) {
            addCriterion("PLANT_ID like", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdNotLike(String value) {
            addCriterion("PLANT_ID not like", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdIn(List<String> values) {
            addCriterion("PLANT_ID in", values, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdNotIn(List<String> values) {
            addCriterion("PLANT_ID not in", values, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdBetween(String value1, String value2) {
            addCriterion("PLANT_ID between", value1, value2, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdNotBetween(String value1, String value2) {
            addCriterion("PLANT_ID not between", value1, value2, "plantId");
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

        public Criteria andSupplierIdIsNull() {
            addCriterion("SUPPLIER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("SUPPLIER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(String value) {
            addCriterion("SUPPLIER_ID =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(String value) {
            addCriterion("SUPPLIER_ID <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(String value) {
            addCriterion("SUPPLIER_ID >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_ID >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(String value) {
            addCriterion("SUPPLIER_ID <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_ID <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLike(String value) {
            addCriterion("SUPPLIER_ID like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotLike(String value) {
            addCriterion("SUPPLIER_ID not like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<String> values) {
            addCriterion("SUPPLIER_ID in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<String> values) {
            addCriterion("SUPPLIER_ID not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(String value1, String value2) {
            addCriterion("SUPPLIER_ID between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_ID not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierContactIdIsNull() {
            addCriterion("SUPPLIER_CONTACT_ID is null");
            return (Criteria) this;
        }

        public Criteria andSupplierContactIdIsNotNull() {
            addCriterion("SUPPLIER_CONTACT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierContactIdEqualTo(String value) {
            addCriterion("SUPPLIER_CONTACT_ID =", value, "supplierContactId");
            return (Criteria) this;
        }

        public Criteria andSupplierContactIdNotEqualTo(String value) {
            addCriterion("SUPPLIER_CONTACT_ID <>", value, "supplierContactId");
            return (Criteria) this;
        }

        public Criteria andSupplierContactIdGreaterThan(String value) {
            addCriterion("SUPPLIER_CONTACT_ID >", value, "supplierContactId");
            return (Criteria) this;
        }

        public Criteria andSupplierContactIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_CONTACT_ID >=", value, "supplierContactId");
            return (Criteria) this;
        }

        public Criteria andSupplierContactIdLessThan(String value) {
            addCriterion("SUPPLIER_CONTACT_ID <", value, "supplierContactId");
            return (Criteria) this;
        }

        public Criteria andSupplierContactIdLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_CONTACT_ID <=", value, "supplierContactId");
            return (Criteria) this;
        }

        public Criteria andSupplierContactIdLike(String value) {
            addCriterion("SUPPLIER_CONTACT_ID like", value, "supplierContactId");
            return (Criteria) this;
        }

        public Criteria andSupplierContactIdNotLike(String value) {
            addCriterion("SUPPLIER_CONTACT_ID not like", value, "supplierContactId");
            return (Criteria) this;
        }

        public Criteria andSupplierContactIdIn(List<String> values) {
            addCriterion("SUPPLIER_CONTACT_ID in", values, "supplierContactId");
            return (Criteria) this;
        }

        public Criteria andSupplierContactIdNotIn(List<String> values) {
            addCriterion("SUPPLIER_CONTACT_ID not in", values, "supplierContactId");
            return (Criteria) this;
        }

        public Criteria andSupplierContactIdBetween(String value1, String value2) {
            addCriterion("SUPPLIER_CONTACT_ID between", value1, value2, "supplierContactId");
            return (Criteria) this;
        }

        public Criteria andSupplierContactIdNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_CONTACT_ID not between", value1, value2, "supplierContactId");
            return (Criteria) this;
        }

        public Criteria andInvoiceSupplierIdIsNull() {
            addCriterion("INVOICE_SUPPLIER_ID is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceSupplierIdIsNotNull() {
            addCriterion("INVOICE_SUPPLIER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceSupplierIdEqualTo(String value) {
            addCriterion("INVOICE_SUPPLIER_ID =", value, "invoiceSupplierId");
            return (Criteria) this;
        }

        public Criteria andInvoiceSupplierIdNotEqualTo(String value) {
            addCriterion("INVOICE_SUPPLIER_ID <>", value, "invoiceSupplierId");
            return (Criteria) this;
        }

        public Criteria andInvoiceSupplierIdGreaterThan(String value) {
            addCriterion("INVOICE_SUPPLIER_ID >", value, "invoiceSupplierId");
            return (Criteria) this;
        }

        public Criteria andInvoiceSupplierIdGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_SUPPLIER_ID >=", value, "invoiceSupplierId");
            return (Criteria) this;
        }

        public Criteria andInvoiceSupplierIdLessThan(String value) {
            addCriterion("INVOICE_SUPPLIER_ID <", value, "invoiceSupplierId");
            return (Criteria) this;
        }

        public Criteria andInvoiceSupplierIdLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_SUPPLIER_ID <=", value, "invoiceSupplierId");
            return (Criteria) this;
        }

        public Criteria andInvoiceSupplierIdLike(String value) {
            addCriterion("INVOICE_SUPPLIER_ID like", value, "invoiceSupplierId");
            return (Criteria) this;
        }

        public Criteria andInvoiceSupplierIdNotLike(String value) {
            addCriterion("INVOICE_SUPPLIER_ID not like", value, "invoiceSupplierId");
            return (Criteria) this;
        }

        public Criteria andInvoiceSupplierIdIn(List<String> values) {
            addCriterion("INVOICE_SUPPLIER_ID in", values, "invoiceSupplierId");
            return (Criteria) this;
        }

        public Criteria andInvoiceSupplierIdNotIn(List<String> values) {
            addCriterion("INVOICE_SUPPLIER_ID not in", values, "invoiceSupplierId");
            return (Criteria) this;
        }

        public Criteria andInvoiceSupplierIdBetween(String value1, String value2) {
            addCriterion("INVOICE_SUPPLIER_ID between", value1, value2, "invoiceSupplierId");
            return (Criteria) this;
        }

        public Criteria andInvoiceSupplierIdNotBetween(String value1, String value2) {
            addCriterion("INVOICE_SUPPLIER_ID not between", value1, value2, "invoiceSupplierId");
            return (Criteria) this;
        }

        public Criteria andInvoiceCompanyIdIsNull() {
            addCriterion("INVOICE_COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceCompanyIdIsNotNull() {
            addCriterion("INVOICE_COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceCompanyIdEqualTo(String value) {
            addCriterion("INVOICE_COMPANY_ID =", value, "invoiceCompanyId");
            return (Criteria) this;
        }

        public Criteria andInvoiceCompanyIdNotEqualTo(String value) {
            addCriterion("INVOICE_COMPANY_ID <>", value, "invoiceCompanyId");
            return (Criteria) this;
        }

        public Criteria andInvoiceCompanyIdGreaterThan(String value) {
            addCriterion("INVOICE_COMPANY_ID >", value, "invoiceCompanyId");
            return (Criteria) this;
        }

        public Criteria andInvoiceCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_COMPANY_ID >=", value, "invoiceCompanyId");
            return (Criteria) this;
        }

        public Criteria andInvoiceCompanyIdLessThan(String value) {
            addCriterion("INVOICE_COMPANY_ID <", value, "invoiceCompanyId");
            return (Criteria) this;
        }

        public Criteria andInvoiceCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_COMPANY_ID <=", value, "invoiceCompanyId");
            return (Criteria) this;
        }

        public Criteria andInvoiceCompanyIdLike(String value) {
            addCriterion("INVOICE_COMPANY_ID like", value, "invoiceCompanyId");
            return (Criteria) this;
        }

        public Criteria andInvoiceCompanyIdNotLike(String value) {
            addCriterion("INVOICE_COMPANY_ID not like", value, "invoiceCompanyId");
            return (Criteria) this;
        }

        public Criteria andInvoiceCompanyIdIn(List<String> values) {
            addCriterion("INVOICE_COMPANY_ID in", values, "invoiceCompanyId");
            return (Criteria) this;
        }

        public Criteria andInvoiceCompanyIdNotIn(List<String> values) {
            addCriterion("INVOICE_COMPANY_ID not in", values, "invoiceCompanyId");
            return (Criteria) this;
        }

        public Criteria andInvoiceCompanyIdBetween(String value1, String value2) {
            addCriterion("INVOICE_COMPANY_ID between", value1, value2, "invoiceCompanyId");
            return (Criteria) this;
        }

        public Criteria andInvoiceCompanyIdNotBetween(String value1, String value2) {
            addCriterion("INVOICE_COMPANY_ID not between", value1, value2, "invoiceCompanyId");
            return (Criteria) this;
        }

        public Criteria andSynergyIdIsNull() {
            addCriterion("SYNERGY_ID is null");
            return (Criteria) this;
        }

        public Criteria andSynergyIdIsNotNull() {
            addCriterion("SYNERGY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSynergyIdEqualTo(String value) {
            addCriterion("SYNERGY_ID =", value, "synergyId");
            return (Criteria) this;
        }

        public Criteria andSynergyIdNotEqualTo(String value) {
            addCriterion("SYNERGY_ID <>", value, "synergyId");
            return (Criteria) this;
        }

        public Criteria andSynergyIdGreaterThan(String value) {
            addCriterion("SYNERGY_ID >", value, "synergyId");
            return (Criteria) this;
        }

        public Criteria andSynergyIdGreaterThanOrEqualTo(String value) {
            addCriterion("SYNERGY_ID >=", value, "synergyId");
            return (Criteria) this;
        }

        public Criteria andSynergyIdLessThan(String value) {
            addCriterion("SYNERGY_ID <", value, "synergyId");
            return (Criteria) this;
        }

        public Criteria andSynergyIdLessThanOrEqualTo(String value) {
            addCriterion("SYNERGY_ID <=", value, "synergyId");
            return (Criteria) this;
        }

        public Criteria andSynergyIdLike(String value) {
            addCriterion("SYNERGY_ID like", value, "synergyId");
            return (Criteria) this;
        }

        public Criteria andSynergyIdNotLike(String value) {
            addCriterion("SYNERGY_ID not like", value, "synergyId");
            return (Criteria) this;
        }

        public Criteria andSynergyIdIn(List<String> values) {
            addCriterion("SYNERGY_ID in", values, "synergyId");
            return (Criteria) this;
        }

        public Criteria andSynergyIdNotIn(List<String> values) {
            addCriterion("SYNERGY_ID not in", values, "synergyId");
            return (Criteria) this;
        }

        public Criteria andSynergyIdBetween(String value1, String value2) {
            addCriterion("SYNERGY_ID between", value1, value2, "synergyId");
            return (Criteria) this;
        }

        public Criteria andSynergyIdNotBetween(String value1, String value2) {
            addCriterion("SYNERGY_ID not between", value1, value2, "synergyId");
            return (Criteria) this;
        }

        public Criteria andSynergyDIdIsNull() {
            addCriterion("SYNERGY_D_ID is null");
            return (Criteria) this;
        }

        public Criteria andSynergyDIdIsNotNull() {
            addCriterion("SYNERGY_D_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSynergyDIdEqualTo(String value) {
            addCriterion("SYNERGY_D_ID =", value, "synergyDId");
            return (Criteria) this;
        }

        public Criteria andSynergyDIdNotEqualTo(String value) {
            addCriterion("SYNERGY_D_ID <>", value, "synergyDId");
            return (Criteria) this;
        }

        public Criteria andSynergyDIdGreaterThan(String value) {
            addCriterion("SYNERGY_D_ID >", value, "synergyDId");
            return (Criteria) this;
        }

        public Criteria andSynergyDIdGreaterThanOrEqualTo(String value) {
            addCriterion("SYNERGY_D_ID >=", value, "synergyDId");
            return (Criteria) this;
        }

        public Criteria andSynergyDIdLessThan(String value) {
            addCriterion("SYNERGY_D_ID <", value, "synergyDId");
            return (Criteria) this;
        }

        public Criteria andSynergyDIdLessThanOrEqualTo(String value) {
            addCriterion("SYNERGY_D_ID <=", value, "synergyDId");
            return (Criteria) this;
        }

        public Criteria andSynergyDIdLike(String value) {
            addCriterion("SYNERGY_D_ID like", value, "synergyDId");
            return (Criteria) this;
        }

        public Criteria andSynergyDIdNotLike(String value) {
            addCriterion("SYNERGY_D_ID not like", value, "synergyDId");
            return (Criteria) this;
        }

        public Criteria andSynergyDIdIn(List<String> values) {
            addCriterion("SYNERGY_D_ID in", values, "synergyDId");
            return (Criteria) this;
        }

        public Criteria andSynergyDIdNotIn(List<String> values) {
            addCriterion("SYNERGY_D_ID not in", values, "synergyDId");
            return (Criteria) this;
        }

        public Criteria andSynergyDIdBetween(String value1, String value2) {
            addCriterion("SYNERGY_D_ID between", value1, value2, "synergyDId");
            return (Criteria) this;
        }

        public Criteria andSynergyDIdNotBetween(String value1, String value2) {
            addCriterion("SYNERGY_D_ID not between", value1, value2, "synergyDId");
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

        public Criteria andOffsetDepositIndicatorIsNull() {
            addCriterion("OFFSET_DEPOSIT_INDICATOR is null");
            return (Criteria) this;
        }

        public Criteria andOffsetDepositIndicatorIsNotNull() {
            addCriterion("OFFSET_DEPOSIT_INDICATOR is not null");
            return (Criteria) this;
        }

        public Criteria andOffsetDepositIndicatorEqualTo(Boolean value) {
            addCriterion("OFFSET_DEPOSIT_INDICATOR =", value, "offsetDepositIndicator");
            return (Criteria) this;
        }

        public Criteria andOffsetDepositIndicatorNotEqualTo(Boolean value) {
            addCriterion("OFFSET_DEPOSIT_INDICATOR <>", value, "offsetDepositIndicator");
            return (Criteria) this;
        }

        public Criteria andOffsetDepositIndicatorGreaterThan(Boolean value) {
            addCriterion("OFFSET_DEPOSIT_INDICATOR >", value, "offsetDepositIndicator");
            return (Criteria) this;
        }

        public Criteria andOffsetDepositIndicatorGreaterThanOrEqualTo(Boolean value) {
            addCriterion("OFFSET_DEPOSIT_INDICATOR >=", value, "offsetDepositIndicator");
            return (Criteria) this;
        }

        public Criteria andOffsetDepositIndicatorLessThan(Boolean value) {
            addCriterion("OFFSET_DEPOSIT_INDICATOR <", value, "offsetDepositIndicator");
            return (Criteria) this;
        }

        public Criteria andOffsetDepositIndicatorLessThanOrEqualTo(Boolean value) {
            addCriterion("OFFSET_DEPOSIT_INDICATOR <=", value, "offsetDepositIndicator");
            return (Criteria) this;
        }

        public Criteria andOffsetDepositIndicatorIn(List<Boolean> values) {
            addCriterion("OFFSET_DEPOSIT_INDICATOR in", values, "offsetDepositIndicator");
            return (Criteria) this;
        }

        public Criteria andOffsetDepositIndicatorNotIn(List<Boolean> values) {
            addCriterion("OFFSET_DEPOSIT_INDICATOR not in", values, "offsetDepositIndicator");
            return (Criteria) this;
        }

        public Criteria andOffsetDepositIndicatorBetween(Boolean value1, Boolean value2) {
            addCriterion("OFFSET_DEPOSIT_INDICATOR between", value1, value2, "offsetDepositIndicator");
            return (Criteria) this;
        }

        public Criteria andOffsetDepositIndicatorNotBetween(Boolean value1, Boolean value2) {
            addCriterion("OFFSET_DEPOSIT_INDICATOR not between", value1, value2, "offsetDepositIndicator");
            return (Criteria) this;
        }

        public Criteria andReceiptedStatusIsNull() {
            addCriterion("RECEIPTED_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andReceiptedStatusIsNotNull() {
            addCriterion("RECEIPTED_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptedStatusEqualTo(String value) {
            addCriterion("RECEIPTED_STATUS =", value, "receiptedStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptedStatusNotEqualTo(String value) {
            addCriterion("RECEIPTED_STATUS <>", value, "receiptedStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptedStatusGreaterThan(String value) {
            addCriterion("RECEIPTED_STATUS >", value, "receiptedStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptedStatusGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIPTED_STATUS >=", value, "receiptedStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptedStatusLessThan(String value) {
            addCriterion("RECEIPTED_STATUS <", value, "receiptedStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptedStatusLessThanOrEqualTo(String value) {
            addCriterion("RECEIPTED_STATUS <=", value, "receiptedStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptedStatusLike(String value) {
            addCriterion("RECEIPTED_STATUS like", value, "receiptedStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptedStatusNotLike(String value) {
            addCriterion("RECEIPTED_STATUS not like", value, "receiptedStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptedStatusIn(List<String> values) {
            addCriterion("RECEIPTED_STATUS in", values, "receiptedStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptedStatusNotIn(List<String> values) {
            addCriterion("RECEIPTED_STATUS not in", values, "receiptedStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptedStatusBetween(String value1, String value2) {
            addCriterion("RECEIPTED_STATUS between", value1, value2, "receiptedStatus");
            return (Criteria) this;
        }

        public Criteria andReceiptedStatusNotBetween(String value1, String value2) {
            addCriterion("RECEIPTED_STATUS not between", value1, value2, "receiptedStatus");
            return (Criteria) this;
        }

        public Criteria andSettlementIndicatorIsNull() {
            addCriterion("SETTLEMENT_INDICATOR is null");
            return (Criteria) this;
        }

        public Criteria andSettlementIndicatorIsNotNull() {
            addCriterion("SETTLEMENT_INDICATOR is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementIndicatorEqualTo(Boolean value) {
            addCriterion("SETTLEMENT_INDICATOR =", value, "settlementIndicator");
            return (Criteria) this;
        }

        public Criteria andSettlementIndicatorNotEqualTo(Boolean value) {
            addCriterion("SETTLEMENT_INDICATOR <>", value, "settlementIndicator");
            return (Criteria) this;
        }

        public Criteria andSettlementIndicatorGreaterThan(Boolean value) {
            addCriterion("SETTLEMENT_INDICATOR >", value, "settlementIndicator");
            return (Criteria) this;
        }

        public Criteria andSettlementIndicatorGreaterThanOrEqualTo(Boolean value) {
            addCriterion("SETTLEMENT_INDICATOR >=", value, "settlementIndicator");
            return (Criteria) this;
        }

        public Criteria andSettlementIndicatorLessThan(Boolean value) {
            addCriterion("SETTLEMENT_INDICATOR <", value, "settlementIndicator");
            return (Criteria) this;
        }

        public Criteria andSettlementIndicatorLessThanOrEqualTo(Boolean value) {
            addCriterion("SETTLEMENT_INDICATOR <=", value, "settlementIndicator");
            return (Criteria) this;
        }

        public Criteria andSettlementIndicatorIn(List<Boolean> values) {
            addCriterion("SETTLEMENT_INDICATOR in", values, "settlementIndicator");
            return (Criteria) this;
        }

        public Criteria andSettlementIndicatorNotIn(List<Boolean> values) {
            addCriterion("SETTLEMENT_INDICATOR not in", values, "settlementIndicator");
            return (Criteria) this;
        }

        public Criteria andSettlementIndicatorBetween(Boolean value1, Boolean value2) {
            addCriterion("SETTLEMENT_INDICATOR between", value1, value2, "settlementIndicator");
            return (Criteria) this;
        }

        public Criteria andSettlementIndicatorNotBetween(Boolean value1, Boolean value2) {
            addCriterion("SETTLEMENT_INDICATOR not between", value1, value2, "settlementIndicator");
            return (Criteria) this;
        }

        public Criteria andSignDateIsNull() {
            addCriterion("SIGN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSignDateIsNotNull() {
            addCriterion("SIGN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSignDateEqualTo(Date value) {
            addCriterion("SIGN_DATE =", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotEqualTo(Date value) {
            addCriterion("SIGN_DATE <>", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateGreaterThan(Date value) {
            addCriterion("SIGN_DATE >", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SIGN_DATE >=", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateLessThan(Date value) {
            addCriterion("SIGN_DATE <", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateLessThanOrEqualTo(Date value) {
            addCriterion("SIGN_DATE <=", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateIn(List<Date> values) {
            addCriterion("SIGN_DATE in", values, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotIn(List<Date> values) {
            addCriterion("SIGN_DATE not in", values, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateBetween(Date value1, Date value2) {
            addCriterion("SIGN_DATE between", value1, value2, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotBetween(Date value1, Date value2) {
            addCriterion("SIGN_DATE not between", value1, value2, "signDate");
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

        public Criteria andWipNoIsNull() {
            addCriterion("WIP_NO is null");
            return (Criteria) this;
        }

        public Criteria andWipNoIsNotNull() {
            addCriterion("WIP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andWipNoEqualTo(String value) {
            addCriterion("WIP_NO =", value, "wipNo");
            return (Criteria) this;
        }

        public Criteria andWipNoNotEqualTo(String value) {
            addCriterion("WIP_NO <>", value, "wipNo");
            return (Criteria) this;
        }

        public Criteria andWipNoGreaterThan(String value) {
            addCriterion("WIP_NO >", value, "wipNo");
            return (Criteria) this;
        }

        public Criteria andWipNoGreaterThanOrEqualTo(String value) {
            addCriterion("WIP_NO >=", value, "wipNo");
            return (Criteria) this;
        }

        public Criteria andWipNoLessThan(String value) {
            addCriterion("WIP_NO <", value, "wipNo");
            return (Criteria) this;
        }

        public Criteria andWipNoLessThanOrEqualTo(String value) {
            addCriterion("WIP_NO <=", value, "wipNo");
            return (Criteria) this;
        }

        public Criteria andWipNoLike(String value) {
            addCriterion("WIP_NO like", value, "wipNo");
            return (Criteria) this;
        }

        public Criteria andWipNoNotLike(String value) {
            addCriterion("WIP_NO not like", value, "wipNo");
            return (Criteria) this;
        }

        public Criteria andWipNoIn(List<String> values) {
            addCriterion("WIP_NO in", values, "wipNo");
            return (Criteria) this;
        }

        public Criteria andWipNoNotIn(List<String> values) {
            addCriterion("WIP_NO not in", values, "wipNo");
            return (Criteria) this;
        }

        public Criteria andWipNoBetween(String value1, String value2) {
            addCriterion("WIP_NO between", value1, value2, "wipNo");
            return (Criteria) this;
        }

        public Criteria andWipNoNotBetween(String value1, String value2) {
            addCriterion("WIP_NO not between", value1, value2, "wipNo");
            return (Criteria) this;
        }

        public Criteria andWipE10InspectionIsNull() {
            addCriterion("WIP_E10_INSPECTION is null");
            return (Criteria) this;
        }

        public Criteria andWipE10InspectionIsNotNull() {
            addCriterion("WIP_E10_INSPECTION is not null");
            return (Criteria) this;
        }

        public Criteria andWipE10InspectionEqualTo(Boolean value) {
            addCriterion("WIP_E10_INSPECTION =", value, "wipE10Inspection");
            return (Criteria) this;
        }

        public Criteria andWipE10InspectionNotEqualTo(Boolean value) {
            addCriterion("WIP_E10_INSPECTION <>", value, "wipE10Inspection");
            return (Criteria) this;
        }

        public Criteria andWipE10InspectionGreaterThan(Boolean value) {
            addCriterion("WIP_E10_INSPECTION >", value, "wipE10Inspection");
            return (Criteria) this;
        }

        public Criteria andWipE10InspectionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("WIP_E10_INSPECTION >=", value, "wipE10Inspection");
            return (Criteria) this;
        }

        public Criteria andWipE10InspectionLessThan(Boolean value) {
            addCriterion("WIP_E10_INSPECTION <", value, "wipE10Inspection");
            return (Criteria) this;
        }

        public Criteria andWipE10InspectionLessThanOrEqualTo(Boolean value) {
            addCriterion("WIP_E10_INSPECTION <=", value, "wipE10Inspection");
            return (Criteria) this;
        }

        public Criteria andWipE10InspectionIn(List<Boolean> values) {
            addCriterion("WIP_E10_INSPECTION in", values, "wipE10Inspection");
            return (Criteria) this;
        }

        public Criteria andWipE10InspectionNotIn(List<Boolean> values) {
            addCriterion("WIP_E10_INSPECTION not in", values, "wipE10Inspection");
            return (Criteria) this;
        }

        public Criteria andWipE10InspectionBetween(Boolean value1, Boolean value2) {
            addCriterion("WIP_E10_INSPECTION between", value1, value2, "wipE10Inspection");
            return (Criteria) this;
        }

        public Criteria andWipE10InspectionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("WIP_E10_INSPECTION not between", value1, value2, "wipE10Inspection");
            return (Criteria) this;
        }

        public Criteria andAllSynergyIsNull() {
            addCriterion("ALL_SYNERGY is null");
            return (Criteria) this;
        }

        public Criteria andAllSynergyIsNotNull() {
            addCriterion("ALL_SYNERGY is not null");
            return (Criteria) this;
        }

        public Criteria andAllSynergyEqualTo(Boolean value) {
            addCriterion("ALL_SYNERGY =", value, "allSynergy");
            return (Criteria) this;
        }

        public Criteria andAllSynergyNotEqualTo(Boolean value) {
            addCriterion("ALL_SYNERGY <>", value, "allSynergy");
            return (Criteria) this;
        }

        public Criteria andAllSynergyGreaterThan(Boolean value) {
            addCriterion("ALL_SYNERGY >", value, "allSynergy");
            return (Criteria) this;
        }

        public Criteria andAllSynergyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ALL_SYNERGY >=", value, "allSynergy");
            return (Criteria) this;
        }

        public Criteria andAllSynergyLessThan(Boolean value) {
            addCriterion("ALL_SYNERGY <", value, "allSynergy");
            return (Criteria) this;
        }

        public Criteria andAllSynergyLessThanOrEqualTo(Boolean value) {
            addCriterion("ALL_SYNERGY <=", value, "allSynergy");
            return (Criteria) this;
        }

        public Criteria andAllSynergyIn(List<Boolean> values) {
            addCriterion("ALL_SYNERGY in", values, "allSynergy");
            return (Criteria) this;
        }

        public Criteria andAllSynergyNotIn(List<Boolean> values) {
            addCriterion("ALL_SYNERGY not in", values, "allSynergy");
            return (Criteria) this;
        }

        public Criteria andAllSynergyBetween(Boolean value1, Boolean value2) {
            addCriterion("ALL_SYNERGY between", value1, value2, "allSynergy");
            return (Criteria) this;
        }

        public Criteria andAllSynergyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ALL_SYNERGY not between", value1, value2, "allSynergy");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyDIdIsNull() {
            addCriterion("GROUP_SYNERGY_D_ID is null");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyDIdIsNotNull() {
            addCriterion("GROUP_SYNERGY_D_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyDIdEqualTo(String value) {
            addCriterion("GROUP_SYNERGY_D_ID =", value, "groupSynergyDId");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyDIdNotEqualTo(String value) {
            addCriterion("GROUP_SYNERGY_D_ID <>", value, "groupSynergyDId");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyDIdGreaterThan(String value) {
            addCriterion("GROUP_SYNERGY_D_ID >", value, "groupSynergyDId");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyDIdGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_SYNERGY_D_ID >=", value, "groupSynergyDId");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyDIdLessThan(String value) {
            addCriterion("GROUP_SYNERGY_D_ID <", value, "groupSynergyDId");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyDIdLessThanOrEqualTo(String value) {
            addCriterion("GROUP_SYNERGY_D_ID <=", value, "groupSynergyDId");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyDIdLike(String value) {
            addCriterion("GROUP_SYNERGY_D_ID like", value, "groupSynergyDId");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyDIdNotLike(String value) {
            addCriterion("GROUP_SYNERGY_D_ID not like", value, "groupSynergyDId");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyDIdIn(List<String> values) {
            addCriterion("GROUP_SYNERGY_D_ID in", values, "groupSynergyDId");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyDIdNotIn(List<String> values) {
            addCriterion("GROUP_SYNERGY_D_ID not in", values, "groupSynergyDId");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyDIdBetween(String value1, String value2) {
            addCriterion("GROUP_SYNERGY_D_ID between", value1, value2, "groupSynergyDId");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyDIdNotBetween(String value1, String value2) {
            addCriterion("GROUP_SYNERGY_D_ID not between", value1, value2, "groupSynergyDId");
            return (Criteria) this;
        }

        public Criteria andGenerateNoIsNull() {
            addCriterion("GENERATE_NO is null");
            return (Criteria) this;
        }

        public Criteria andGenerateNoIsNotNull() {
            addCriterion("GENERATE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andGenerateNoEqualTo(String value) {
            addCriterion("GENERATE_NO =", value, "generateNo");
            return (Criteria) this;
        }

        public Criteria andGenerateNoNotEqualTo(String value) {
            addCriterion("GENERATE_NO <>", value, "generateNo");
            return (Criteria) this;
        }

        public Criteria andGenerateNoGreaterThan(String value) {
            addCriterion("GENERATE_NO >", value, "generateNo");
            return (Criteria) this;
        }

        public Criteria andGenerateNoGreaterThanOrEqualTo(String value) {
            addCriterion("GENERATE_NO >=", value, "generateNo");
            return (Criteria) this;
        }

        public Criteria andGenerateNoLessThan(String value) {
            addCriterion("GENERATE_NO <", value, "generateNo");
            return (Criteria) this;
        }

        public Criteria andGenerateNoLessThanOrEqualTo(String value) {
            addCriterion("GENERATE_NO <=", value, "generateNo");
            return (Criteria) this;
        }

        public Criteria andGenerateNoLike(String value) {
            addCriterion("GENERATE_NO like", value, "generateNo");
            return (Criteria) this;
        }

        public Criteria andGenerateNoNotLike(String value) {
            addCriterion("GENERATE_NO not like", value, "generateNo");
            return (Criteria) this;
        }

        public Criteria andGenerateNoIn(List<String> values) {
            addCriterion("GENERATE_NO in", values, "generateNo");
            return (Criteria) this;
        }

        public Criteria andGenerateNoNotIn(List<String> values) {
            addCriterion("GENERATE_NO not in", values, "generateNo");
            return (Criteria) this;
        }

        public Criteria andGenerateNoBetween(String value1, String value2) {
            addCriterion("GENERATE_NO between", value1, value2, "generateNo");
            return (Criteria) this;
        }

        public Criteria andGenerateNoNotBetween(String value1, String value2) {
            addCriterion("GENERATE_NO not between", value1, value2, "generateNo");
            return (Criteria) this;
        }

        public Criteria andGenerateStatusIsNull() {
            addCriterion("GENERATE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andGenerateStatusIsNotNull() {
            addCriterion("GENERATE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andGenerateStatusEqualTo(Boolean value) {
            addCriterion("GENERATE_STATUS =", value, "generateStatus");
            return (Criteria) this;
        }

        public Criteria andGenerateStatusNotEqualTo(Boolean value) {
            addCriterion("GENERATE_STATUS <>", value, "generateStatus");
            return (Criteria) this;
        }

        public Criteria andGenerateStatusGreaterThan(Boolean value) {
            addCriterion("GENERATE_STATUS >", value, "generateStatus");
            return (Criteria) this;
        }

        public Criteria andGenerateStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("GENERATE_STATUS >=", value, "generateStatus");
            return (Criteria) this;
        }

        public Criteria andGenerateStatusLessThan(Boolean value) {
            addCriterion("GENERATE_STATUS <", value, "generateStatus");
            return (Criteria) this;
        }

        public Criteria andGenerateStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("GENERATE_STATUS <=", value, "generateStatus");
            return (Criteria) this;
        }

        public Criteria andGenerateStatusIn(List<Boolean> values) {
            addCriterion("GENERATE_STATUS in", values, "generateStatus");
            return (Criteria) this;
        }

        public Criteria andGenerateStatusNotIn(List<Boolean> values) {
            addCriterion("GENERATE_STATUS not in", values, "generateStatus");
            return (Criteria) this;
        }

        public Criteria andGenerateStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("GENERATE_STATUS between", value1, value2, "generateStatus");
            return (Criteria) this;
        }

        public Criteria andGenerateStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("GENERATE_STATUS not between", value1, value2, "generateStatus");
            return (Criteria) this;
        }

        public Criteria andDocSequenceIsNull() {
            addCriterion("DOC_Sequence is null");
            return (Criteria) this;
        }

        public Criteria andDocSequenceIsNotNull() {
            addCriterion("DOC_Sequence is not null");
            return (Criteria) this;
        }

        public Criteria andDocSequenceEqualTo(Integer value) {
            addCriterion("DOC_Sequence =", value, "docSequence");
            return (Criteria) this;
        }

        public Criteria andDocSequenceNotEqualTo(Integer value) {
            addCriterion("DOC_Sequence <>", value, "docSequence");
            return (Criteria) this;
        }

        public Criteria andDocSequenceGreaterThan(Integer value) {
            addCriterion("DOC_Sequence >", value, "docSequence");
            return (Criteria) this;
        }

        public Criteria andDocSequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("DOC_Sequence >=", value, "docSequence");
            return (Criteria) this;
        }

        public Criteria andDocSequenceLessThan(Integer value) {
            addCriterion("DOC_Sequence <", value, "docSequence");
            return (Criteria) this;
        }

        public Criteria andDocSequenceLessThanOrEqualTo(Integer value) {
            addCriterion("DOC_Sequence <=", value, "docSequence");
            return (Criteria) this;
        }

        public Criteria andDocSequenceIn(List<Integer> values) {
            addCriterion("DOC_Sequence in", values, "docSequence");
            return (Criteria) this;
        }

        public Criteria andDocSequenceNotIn(List<Integer> values) {
            addCriterion("DOC_Sequence not in", values, "docSequence");
            return (Criteria) this;
        }

        public Criteria andDocSequenceBetween(Integer value1, Integer value2) {
            addCriterion("DOC_Sequence between", value1, value2, "docSequence");
            return (Criteria) this;
        }

        public Criteria andDocSequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("DOC_Sequence not between", value1, value2, "docSequence");
            return (Criteria) this;
        }

        public Criteria andSourceSupplierIdIsNull() {
            addCriterion("SOURCE_SUPPLIER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSourceSupplierIdIsNotNull() {
            addCriterion("SOURCE_SUPPLIER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSourceSupplierIdEqualTo(String value) {
            addCriterion("SOURCE_SUPPLIER_ID =", value, "sourceSupplierId");
            return (Criteria) this;
        }

        public Criteria andSourceSupplierIdNotEqualTo(String value) {
            addCriterion("SOURCE_SUPPLIER_ID <>", value, "sourceSupplierId");
            return (Criteria) this;
        }

        public Criteria andSourceSupplierIdGreaterThan(String value) {
            addCriterion("SOURCE_SUPPLIER_ID >", value, "sourceSupplierId");
            return (Criteria) this;
        }

        public Criteria andSourceSupplierIdGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_SUPPLIER_ID >=", value, "sourceSupplierId");
            return (Criteria) this;
        }

        public Criteria andSourceSupplierIdLessThan(String value) {
            addCriterion("SOURCE_SUPPLIER_ID <", value, "sourceSupplierId");
            return (Criteria) this;
        }

        public Criteria andSourceSupplierIdLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_SUPPLIER_ID <=", value, "sourceSupplierId");
            return (Criteria) this;
        }

        public Criteria andSourceSupplierIdLike(String value) {
            addCriterion("SOURCE_SUPPLIER_ID like", value, "sourceSupplierId");
            return (Criteria) this;
        }

        public Criteria andSourceSupplierIdNotLike(String value) {
            addCriterion("SOURCE_SUPPLIER_ID not like", value, "sourceSupplierId");
            return (Criteria) this;
        }

        public Criteria andSourceSupplierIdIn(List<String> values) {
            addCriterion("SOURCE_SUPPLIER_ID in", values, "sourceSupplierId");
            return (Criteria) this;
        }

        public Criteria andSourceSupplierIdNotIn(List<String> values) {
            addCriterion("SOURCE_SUPPLIER_ID not in", values, "sourceSupplierId");
            return (Criteria) this;
        }

        public Criteria andSourceSupplierIdBetween(String value1, String value2) {
            addCriterion("SOURCE_SUPPLIER_ID between", value1, value2, "sourceSupplierId");
            return (Criteria) this;
        }

        public Criteria andSourceSupplierIdNotBetween(String value1, String value2) {
            addCriterion("SOURCE_SUPPLIER_ID not between", value1, value2, "sourceSupplierId");
            return (Criteria) this;
        }

        public Criteria andGenerateSourceIsNull() {
            addCriterion("GENERATE_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andGenerateSourceIsNotNull() {
            addCriterion("GENERATE_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andGenerateSourceEqualTo(String value) {
            addCriterion("GENERATE_SOURCE =", value, "generateSource");
            return (Criteria) this;
        }

        public Criteria andGenerateSourceNotEqualTo(String value) {
            addCriterion("GENERATE_SOURCE <>", value, "generateSource");
            return (Criteria) this;
        }

        public Criteria andGenerateSourceGreaterThan(String value) {
            addCriterion("GENERATE_SOURCE >", value, "generateSource");
            return (Criteria) this;
        }

        public Criteria andGenerateSourceGreaterThanOrEqualTo(String value) {
            addCriterion("GENERATE_SOURCE >=", value, "generateSource");
            return (Criteria) this;
        }

        public Criteria andGenerateSourceLessThan(String value) {
            addCriterion("GENERATE_SOURCE <", value, "generateSource");
            return (Criteria) this;
        }

        public Criteria andGenerateSourceLessThanOrEqualTo(String value) {
            addCriterion("GENERATE_SOURCE <=", value, "generateSource");
            return (Criteria) this;
        }

        public Criteria andGenerateSourceLike(String value) {
            addCriterion("GENERATE_SOURCE like", value, "generateSource");
            return (Criteria) this;
        }

        public Criteria andGenerateSourceNotLike(String value) {
            addCriterion("GENERATE_SOURCE not like", value, "generateSource");
            return (Criteria) this;
        }

        public Criteria andGenerateSourceIn(List<String> values) {
            addCriterion("GENERATE_SOURCE in", values, "generateSource");
            return (Criteria) this;
        }

        public Criteria andGenerateSourceNotIn(List<String> values) {
            addCriterion("GENERATE_SOURCE not in", values, "generateSource");
            return (Criteria) this;
        }

        public Criteria andGenerateSourceBetween(String value1, String value2) {
            addCriterion("GENERATE_SOURCE between", value1, value2, "generateSource");
            return (Criteria) this;
        }

        public Criteria andGenerateSourceNotBetween(String value1, String value2) {
            addCriterion("GENERATE_SOURCE not between", value1, value2, "generateSource");
            return (Criteria) this;
        }

        public Criteria andDeliveryDocNoIsNull() {
            addCriterion("DELIVERY_DOC_NO is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDocNoIsNotNull() {
            addCriterion("DELIVERY_DOC_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDocNoEqualTo(String value) {
            addCriterion("DELIVERY_DOC_NO =", value, "deliveryDocNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryDocNoNotEqualTo(String value) {
            addCriterion("DELIVERY_DOC_NO <>", value, "deliveryDocNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryDocNoGreaterThan(String value) {
            addCriterion("DELIVERY_DOC_NO >", value, "deliveryDocNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryDocNoGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERY_DOC_NO >=", value, "deliveryDocNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryDocNoLessThan(String value) {
            addCriterion("DELIVERY_DOC_NO <", value, "deliveryDocNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryDocNoLessThanOrEqualTo(String value) {
            addCriterion("DELIVERY_DOC_NO <=", value, "deliveryDocNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryDocNoLike(String value) {
            addCriterion("DELIVERY_DOC_NO like", value, "deliveryDocNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryDocNoNotLike(String value) {
            addCriterion("DELIVERY_DOC_NO not like", value, "deliveryDocNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryDocNoIn(List<String> values) {
            addCriterion("DELIVERY_DOC_NO in", values, "deliveryDocNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryDocNoNotIn(List<String> values) {
            addCriterion("DELIVERY_DOC_NO not in", values, "deliveryDocNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryDocNoBetween(String value1, String value2) {
            addCriterion("DELIVERY_DOC_NO between", value1, value2, "deliveryDocNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryDocNoNotBetween(String value1, String value2) {
            addCriterion("DELIVERY_DOC_NO not between", value1, value2, "deliveryDocNo");
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

        public Criteria andEfnetstatusIsNull() {
            addCriterion("EFNETStatus is null");
            return (Criteria) this;
        }

        public Criteria andEfnetstatusIsNotNull() {
            addCriterion("EFNETStatus is not null");
            return (Criteria) this;
        }

        public Criteria andEfnetstatusEqualTo(String value) {
            addCriterion("EFNETStatus =", value, "efnetstatus");
            return (Criteria) this;
        }

        public Criteria andEfnetstatusNotEqualTo(String value) {
            addCriterion("EFNETStatus <>", value, "efnetstatus");
            return (Criteria) this;
        }

        public Criteria andEfnetstatusGreaterThan(String value) {
            addCriterion("EFNETStatus >", value, "efnetstatus");
            return (Criteria) this;
        }

        public Criteria andEfnetstatusGreaterThanOrEqualTo(String value) {
            addCriterion("EFNETStatus >=", value, "efnetstatus");
            return (Criteria) this;
        }

        public Criteria andEfnetstatusLessThan(String value) {
            addCriterion("EFNETStatus <", value, "efnetstatus");
            return (Criteria) this;
        }

        public Criteria andEfnetstatusLessThanOrEqualTo(String value) {
            addCriterion("EFNETStatus <=", value, "efnetstatus");
            return (Criteria) this;
        }

        public Criteria andEfnetstatusLike(String value) {
            addCriterion("EFNETStatus like", value, "efnetstatus");
            return (Criteria) this;
        }

        public Criteria andEfnetstatusNotLike(String value) {
            addCriterion("EFNETStatus not like", value, "efnetstatus");
            return (Criteria) this;
        }

        public Criteria andEfnetstatusIn(List<String> values) {
            addCriterion("EFNETStatus in", values, "efnetstatus");
            return (Criteria) this;
        }

        public Criteria andEfnetstatusNotIn(List<String> values) {
            addCriterion("EFNETStatus not in", values, "efnetstatus");
            return (Criteria) this;
        }

        public Criteria andEfnetstatusBetween(String value1, String value2) {
            addCriterion("EFNETStatus between", value1, value2, "efnetstatus");
            return (Criteria) this;
        }

        public Criteria andEfnetstatusNotBetween(String value1, String value2) {
            addCriterion("EFNETStatus not between", value1, value2, "efnetstatus");
            return (Criteria) this;
        }

        public Criteria andEfnetactionIsNull() {
            addCriterion("EFNETAction is null");
            return (Criteria) this;
        }

        public Criteria andEfnetactionIsNotNull() {
            addCriterion("EFNETAction is not null");
            return (Criteria) this;
        }

        public Criteria andEfnetactionEqualTo(String value) {
            addCriterion("EFNETAction =", value, "efnetaction");
            return (Criteria) this;
        }

        public Criteria andEfnetactionNotEqualTo(String value) {
            addCriterion("EFNETAction <>", value, "efnetaction");
            return (Criteria) this;
        }

        public Criteria andEfnetactionGreaterThan(String value) {
            addCriterion("EFNETAction >", value, "efnetaction");
            return (Criteria) this;
        }

        public Criteria andEfnetactionGreaterThanOrEqualTo(String value) {
            addCriterion("EFNETAction >=", value, "efnetaction");
            return (Criteria) this;
        }

        public Criteria andEfnetactionLessThan(String value) {
            addCriterion("EFNETAction <", value, "efnetaction");
            return (Criteria) this;
        }

        public Criteria andEfnetactionLessThanOrEqualTo(String value) {
            addCriterion("EFNETAction <=", value, "efnetaction");
            return (Criteria) this;
        }

        public Criteria andEfnetactionLike(String value) {
            addCriterion("EFNETAction like", value, "efnetaction");
            return (Criteria) this;
        }

        public Criteria andEfnetactionNotLike(String value) {
            addCriterion("EFNETAction not like", value, "efnetaction");
            return (Criteria) this;
        }

        public Criteria andEfnetactionIn(List<String> values) {
            addCriterion("EFNETAction in", values, "efnetaction");
            return (Criteria) this;
        }

        public Criteria andEfnetactionNotIn(List<String> values) {
            addCriterion("EFNETAction not in", values, "efnetaction");
            return (Criteria) this;
        }

        public Criteria andEfnetactionBetween(String value1, String value2) {
            addCriterion("EFNETAction between", value1, value2, "efnetaction");
            return (Criteria) this;
        }

        public Criteria andEfnetactionNotBetween(String value1, String value2) {
            addCriterion("EFNETAction not between", value1, value2, "efnetaction");
            return (Criteria) this;
        }

        public Criteria andEfnetdoccategoryIsNull() {
            addCriterion("EFNETDOCCategory is null");
            return (Criteria) this;
        }

        public Criteria andEfnetdoccategoryIsNotNull() {
            addCriterion("EFNETDOCCategory is not null");
            return (Criteria) this;
        }

        public Criteria andEfnetdoccategoryEqualTo(String value) {
            addCriterion("EFNETDOCCategory =", value, "efnetdoccategory");
            return (Criteria) this;
        }

        public Criteria andEfnetdoccategoryNotEqualTo(String value) {
            addCriterion("EFNETDOCCategory <>", value, "efnetdoccategory");
            return (Criteria) this;
        }

        public Criteria andEfnetdoccategoryGreaterThan(String value) {
            addCriterion("EFNETDOCCategory >", value, "efnetdoccategory");
            return (Criteria) this;
        }

        public Criteria andEfnetdoccategoryGreaterThanOrEqualTo(String value) {
            addCriterion("EFNETDOCCategory >=", value, "efnetdoccategory");
            return (Criteria) this;
        }

        public Criteria andEfnetdoccategoryLessThan(String value) {
            addCriterion("EFNETDOCCategory <", value, "efnetdoccategory");
            return (Criteria) this;
        }

        public Criteria andEfnetdoccategoryLessThanOrEqualTo(String value) {
            addCriterion("EFNETDOCCategory <=", value, "efnetdoccategory");
            return (Criteria) this;
        }

        public Criteria andEfnetdoccategoryLike(String value) {
            addCriterion("EFNETDOCCategory like", value, "efnetdoccategory");
            return (Criteria) this;
        }

        public Criteria andEfnetdoccategoryNotLike(String value) {
            addCriterion("EFNETDOCCategory not like", value, "efnetdoccategory");
            return (Criteria) this;
        }

        public Criteria andEfnetdoccategoryIn(List<String> values) {
            addCriterion("EFNETDOCCategory in", values, "efnetdoccategory");
            return (Criteria) this;
        }

        public Criteria andEfnetdoccategoryNotIn(List<String> values) {
            addCriterion("EFNETDOCCategory not in", values, "efnetdoccategory");
            return (Criteria) this;
        }

        public Criteria andEfnetdoccategoryBetween(String value1, String value2) {
            addCriterion("EFNETDOCCategory between", value1, value2, "efnetdoccategory");
            return (Criteria) this;
        }

        public Criteria andEfnetdoccategoryNotBetween(String value1, String value2) {
            addCriterion("EFNETDOCCategory not between", value1, value2, "efnetdoccategory");
            return (Criteria) this;
        }

        public Criteria andEfnetdocnumberIsNull() {
            addCriterion("EFNETDOCNumber is null");
            return (Criteria) this;
        }

        public Criteria andEfnetdocnumberIsNotNull() {
            addCriterion("EFNETDOCNumber is not null");
            return (Criteria) this;
        }

        public Criteria andEfnetdocnumberEqualTo(String value) {
            addCriterion("EFNETDOCNumber =", value, "efnetdocnumber");
            return (Criteria) this;
        }

        public Criteria andEfnetdocnumberNotEqualTo(String value) {
            addCriterion("EFNETDOCNumber <>", value, "efnetdocnumber");
            return (Criteria) this;
        }

        public Criteria andEfnetdocnumberGreaterThan(String value) {
            addCriterion("EFNETDOCNumber >", value, "efnetdocnumber");
            return (Criteria) this;
        }

        public Criteria andEfnetdocnumberGreaterThanOrEqualTo(String value) {
            addCriterion("EFNETDOCNumber >=", value, "efnetdocnumber");
            return (Criteria) this;
        }

        public Criteria andEfnetdocnumberLessThan(String value) {
            addCriterion("EFNETDOCNumber <", value, "efnetdocnumber");
            return (Criteria) this;
        }

        public Criteria andEfnetdocnumberLessThanOrEqualTo(String value) {
            addCriterion("EFNETDOCNumber <=", value, "efnetdocnumber");
            return (Criteria) this;
        }

        public Criteria andEfnetdocnumberLike(String value) {
            addCriterion("EFNETDOCNumber like", value, "efnetdocnumber");
            return (Criteria) this;
        }

        public Criteria andEfnetdocnumberNotLike(String value) {
            addCriterion("EFNETDOCNumber not like", value, "efnetdocnumber");
            return (Criteria) this;
        }

        public Criteria andEfnetdocnumberIn(List<String> values) {
            addCriterion("EFNETDOCNumber in", values, "efnetdocnumber");
            return (Criteria) this;
        }

        public Criteria andEfnetdocnumberNotIn(List<String> values) {
            addCriterion("EFNETDOCNumber not in", values, "efnetdocnumber");
            return (Criteria) this;
        }

        public Criteria andEfnetdocnumberBetween(String value1, String value2) {
            addCriterion("EFNETDOCNumber between", value1, value2, "efnetdocnumber");
            return (Criteria) this;
        }

        public Criteria andEfnetdocnumberNotBetween(String value1, String value2) {
            addCriterion("EFNETDOCNumber not between", value1, value2, "efnetdocnumber");
            return (Criteria) this;
        }

        public Criteria andPrintcountIsNull() {
            addCriterion("PrintCount is null");
            return (Criteria) this;
        }

        public Criteria andPrintcountIsNotNull() {
            addCriterion("PrintCount is not null");
            return (Criteria) this;
        }

        public Criteria andPrintcountEqualTo(Integer value) {
            addCriterion("PrintCount =", value, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountNotEqualTo(Integer value) {
            addCriterion("PrintCount <>", value, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountGreaterThan(Integer value) {
            addCriterion("PrintCount >", value, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("PrintCount >=", value, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountLessThan(Integer value) {
            addCriterion("PrintCount <", value, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountLessThanOrEqualTo(Integer value) {
            addCriterion("PrintCount <=", value, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountIn(List<Integer> values) {
            addCriterion("PrintCount in", values, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountNotIn(List<Integer> values) {
            addCriterion("PrintCount not in", values, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountBetween(Integer value1, Integer value2) {
            addCriterion("PrintCount between", value1, value2, "printcount");
            return (Criteria) this;
        }

        public Criteria andPrintcountNotBetween(Integer value1, Integer value2) {
            addCriterion("PrintCount not between", value1, value2, "printcount");
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

        public Criteria andSourceIdRtkIsNull() {
            addCriterion("SOURCE_ID_RTK is null");
            return (Criteria) this;
        }

        public Criteria andSourceIdRtkIsNotNull() {
            addCriterion("SOURCE_ID_RTK is not null");
            return (Criteria) this;
        }

        public Criteria andSourceIdRtkEqualTo(String value) {
            addCriterion("SOURCE_ID_RTK =", value, "sourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andSourceIdRtkNotEqualTo(String value) {
            addCriterion("SOURCE_ID_RTK <>", value, "sourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andSourceIdRtkGreaterThan(String value) {
            addCriterion("SOURCE_ID_RTK >", value, "sourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andSourceIdRtkGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_ID_RTK >=", value, "sourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andSourceIdRtkLessThan(String value) {
            addCriterion("SOURCE_ID_RTK <", value, "sourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andSourceIdRtkLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_ID_RTK <=", value, "sourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andSourceIdRtkLike(String value) {
            addCriterion("SOURCE_ID_RTK like", value, "sourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andSourceIdRtkNotLike(String value) {
            addCriterion("SOURCE_ID_RTK not like", value, "sourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andSourceIdRtkIn(List<String> values) {
            addCriterion("SOURCE_ID_RTK in", values, "sourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andSourceIdRtkNotIn(List<String> values) {
            addCriterion("SOURCE_ID_RTK not in", values, "sourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andSourceIdRtkBetween(String value1, String value2) {
            addCriterion("SOURCE_ID_RTK between", value1, value2, "sourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andSourceIdRtkNotBetween(String value1, String value2) {
            addCriterion("SOURCE_ID_RTK not between", value1, value2, "sourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andSourceIdRoidIsNull() {
            addCriterion("SOURCE_ID_ROid is null");
            return (Criteria) this;
        }

        public Criteria andSourceIdRoidIsNotNull() {
            addCriterion("SOURCE_ID_ROid is not null");
            return (Criteria) this;
        }

        public Criteria andSourceIdRoidEqualTo(String value) {
            addCriterion("SOURCE_ID_ROid =", value, "sourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andSourceIdRoidNotEqualTo(String value) {
            addCriterion("SOURCE_ID_ROid <>", value, "sourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andSourceIdRoidGreaterThan(String value) {
            addCriterion("SOURCE_ID_ROid >", value, "sourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andSourceIdRoidGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_ID_ROid >=", value, "sourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andSourceIdRoidLessThan(String value) {
            addCriterion("SOURCE_ID_ROid <", value, "sourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andSourceIdRoidLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_ID_ROid <=", value, "sourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andSourceIdRoidLike(String value) {
            addCriterion("SOURCE_ID_ROid like", value, "sourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andSourceIdRoidNotLike(String value) {
            addCriterion("SOURCE_ID_ROid not like", value, "sourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andSourceIdRoidIn(List<String> values) {
            addCriterion("SOURCE_ID_ROid in", values, "sourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andSourceIdRoidNotIn(List<String> values) {
            addCriterion("SOURCE_ID_ROid not in", values, "sourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andSourceIdRoidBetween(String value1, String value2) {
            addCriterion("SOURCE_ID_ROid between", value1, value2, "sourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andSourceIdRoidNotBetween(String value1, String value2) {
            addCriterion("SOURCE_ID_ROid not between", value1, value2, "sourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andReceiveOwnerOrgRtkIsNull() {
            addCriterion("RECEIVE_Owner_Org_RTK is null");
            return (Criteria) this;
        }

        public Criteria andReceiveOwnerOrgRtkIsNotNull() {
            addCriterion("RECEIVE_Owner_Org_RTK is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveOwnerOrgRtkEqualTo(String value) {
            addCriterion("RECEIVE_Owner_Org_RTK =", value, "receiveOwnerOrgRtk");
            return (Criteria) this;
        }

        public Criteria andReceiveOwnerOrgRtkNotEqualTo(String value) {
            addCriterion("RECEIVE_Owner_Org_RTK <>", value, "receiveOwnerOrgRtk");
            return (Criteria) this;
        }

        public Criteria andReceiveOwnerOrgRtkGreaterThan(String value) {
            addCriterion("RECEIVE_Owner_Org_RTK >", value, "receiveOwnerOrgRtk");
            return (Criteria) this;
        }

        public Criteria andReceiveOwnerOrgRtkGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVE_Owner_Org_RTK >=", value, "receiveOwnerOrgRtk");
            return (Criteria) this;
        }

        public Criteria andReceiveOwnerOrgRtkLessThan(String value) {
            addCriterion("RECEIVE_Owner_Org_RTK <", value, "receiveOwnerOrgRtk");
            return (Criteria) this;
        }

        public Criteria andReceiveOwnerOrgRtkLessThanOrEqualTo(String value) {
            addCriterion("RECEIVE_Owner_Org_RTK <=", value, "receiveOwnerOrgRtk");
            return (Criteria) this;
        }

        public Criteria andReceiveOwnerOrgRtkLike(String value) {
            addCriterion("RECEIVE_Owner_Org_RTK like", value, "receiveOwnerOrgRtk");
            return (Criteria) this;
        }

        public Criteria andReceiveOwnerOrgRtkNotLike(String value) {
            addCriterion("RECEIVE_Owner_Org_RTK not like", value, "receiveOwnerOrgRtk");
            return (Criteria) this;
        }

        public Criteria andReceiveOwnerOrgRtkIn(List<String> values) {
            addCriterion("RECEIVE_Owner_Org_RTK in", values, "receiveOwnerOrgRtk");
            return (Criteria) this;
        }

        public Criteria andReceiveOwnerOrgRtkNotIn(List<String> values) {
            addCriterion("RECEIVE_Owner_Org_RTK not in", values, "receiveOwnerOrgRtk");
            return (Criteria) this;
        }

        public Criteria andReceiveOwnerOrgRtkBetween(String value1, String value2) {
            addCriterion("RECEIVE_Owner_Org_RTK between", value1, value2, "receiveOwnerOrgRtk");
            return (Criteria) this;
        }

        public Criteria andReceiveOwnerOrgRtkNotBetween(String value1, String value2) {
            addCriterion("RECEIVE_Owner_Org_RTK not between", value1, value2, "receiveOwnerOrgRtk");
            return (Criteria) this;
        }

        public Criteria andReceiveOwnerOrgRoidIsNull() {
            addCriterion("RECEIVE_Owner_Org_ROid is null");
            return (Criteria) this;
        }

        public Criteria andReceiveOwnerOrgRoidIsNotNull() {
            addCriterion("RECEIVE_Owner_Org_ROid is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveOwnerOrgRoidEqualTo(String value) {
            addCriterion("RECEIVE_Owner_Org_ROid =", value, "receiveOwnerOrgRoid");
            return (Criteria) this;
        }

        public Criteria andReceiveOwnerOrgRoidNotEqualTo(String value) {
            addCriterion("RECEIVE_Owner_Org_ROid <>", value, "receiveOwnerOrgRoid");
            return (Criteria) this;
        }

        public Criteria andReceiveOwnerOrgRoidGreaterThan(String value) {
            addCriterion("RECEIVE_Owner_Org_ROid >", value, "receiveOwnerOrgRoid");
            return (Criteria) this;
        }

        public Criteria andReceiveOwnerOrgRoidGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVE_Owner_Org_ROid >=", value, "receiveOwnerOrgRoid");
            return (Criteria) this;
        }

        public Criteria andReceiveOwnerOrgRoidLessThan(String value) {
            addCriterion("RECEIVE_Owner_Org_ROid <", value, "receiveOwnerOrgRoid");
            return (Criteria) this;
        }

        public Criteria andReceiveOwnerOrgRoidLessThanOrEqualTo(String value) {
            addCriterion("RECEIVE_Owner_Org_ROid <=", value, "receiveOwnerOrgRoid");
            return (Criteria) this;
        }

        public Criteria andReceiveOwnerOrgRoidLike(String value) {
            addCriterion("RECEIVE_Owner_Org_ROid like", value, "receiveOwnerOrgRoid");
            return (Criteria) this;
        }

        public Criteria andReceiveOwnerOrgRoidNotLike(String value) {
            addCriterion("RECEIVE_Owner_Org_ROid not like", value, "receiveOwnerOrgRoid");
            return (Criteria) this;
        }

        public Criteria andReceiveOwnerOrgRoidIn(List<String> values) {
            addCriterion("RECEIVE_Owner_Org_ROid in", values, "receiveOwnerOrgRoid");
            return (Criteria) this;
        }

        public Criteria andReceiveOwnerOrgRoidNotIn(List<String> values) {
            addCriterion("RECEIVE_Owner_Org_ROid not in", values, "receiveOwnerOrgRoid");
            return (Criteria) this;
        }

        public Criteria andReceiveOwnerOrgRoidBetween(String value1, String value2) {
            addCriterion("RECEIVE_Owner_Org_ROid between", value1, value2, "receiveOwnerOrgRoid");
            return (Criteria) this;
        }

        public Criteria andReceiveOwnerOrgRoidNotBetween(String value1, String value2) {
            addCriterion("RECEIVE_Owner_Org_ROid not between", value1, value2, "receiveOwnerOrgRoid");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyIdRtkIsNull() {
            addCriterion("GROUP_SYNERGY_ID_RTK is null");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyIdRtkIsNotNull() {
            addCriterion("GROUP_SYNERGY_ID_RTK is not null");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyIdRtkEqualTo(String value) {
            addCriterion("GROUP_SYNERGY_ID_RTK =", value, "groupSynergyIdRtk");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyIdRtkNotEqualTo(String value) {
            addCriterion("GROUP_SYNERGY_ID_RTK <>", value, "groupSynergyIdRtk");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyIdRtkGreaterThan(String value) {
            addCriterion("GROUP_SYNERGY_ID_RTK >", value, "groupSynergyIdRtk");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyIdRtkGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_SYNERGY_ID_RTK >=", value, "groupSynergyIdRtk");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyIdRtkLessThan(String value) {
            addCriterion("GROUP_SYNERGY_ID_RTK <", value, "groupSynergyIdRtk");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyIdRtkLessThanOrEqualTo(String value) {
            addCriterion("GROUP_SYNERGY_ID_RTK <=", value, "groupSynergyIdRtk");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyIdRtkLike(String value) {
            addCriterion("GROUP_SYNERGY_ID_RTK like", value, "groupSynergyIdRtk");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyIdRtkNotLike(String value) {
            addCriterion("GROUP_SYNERGY_ID_RTK not like", value, "groupSynergyIdRtk");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyIdRtkIn(List<String> values) {
            addCriterion("GROUP_SYNERGY_ID_RTK in", values, "groupSynergyIdRtk");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyIdRtkNotIn(List<String> values) {
            addCriterion("GROUP_SYNERGY_ID_RTK not in", values, "groupSynergyIdRtk");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyIdRtkBetween(String value1, String value2) {
            addCriterion("GROUP_SYNERGY_ID_RTK between", value1, value2, "groupSynergyIdRtk");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyIdRtkNotBetween(String value1, String value2) {
            addCriterion("GROUP_SYNERGY_ID_RTK not between", value1, value2, "groupSynergyIdRtk");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyIdRoidIsNull() {
            addCriterion("GROUP_SYNERGY_ID_ROid is null");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyIdRoidIsNotNull() {
            addCriterion("GROUP_SYNERGY_ID_ROid is not null");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyIdRoidEqualTo(String value) {
            addCriterion("GROUP_SYNERGY_ID_ROid =", value, "groupSynergyIdRoid");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyIdRoidNotEqualTo(String value) {
            addCriterion("GROUP_SYNERGY_ID_ROid <>", value, "groupSynergyIdRoid");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyIdRoidGreaterThan(String value) {
            addCriterion("GROUP_SYNERGY_ID_ROid >", value, "groupSynergyIdRoid");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyIdRoidGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_SYNERGY_ID_ROid >=", value, "groupSynergyIdRoid");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyIdRoidLessThan(String value) {
            addCriterion("GROUP_SYNERGY_ID_ROid <", value, "groupSynergyIdRoid");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyIdRoidLessThanOrEqualTo(String value) {
            addCriterion("GROUP_SYNERGY_ID_ROid <=", value, "groupSynergyIdRoid");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyIdRoidLike(String value) {
            addCriterion("GROUP_SYNERGY_ID_ROid like", value, "groupSynergyIdRoid");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyIdRoidNotLike(String value) {
            addCriterion("GROUP_SYNERGY_ID_ROid not like", value, "groupSynergyIdRoid");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyIdRoidIn(List<String> values) {
            addCriterion("GROUP_SYNERGY_ID_ROid in", values, "groupSynergyIdRoid");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyIdRoidNotIn(List<String> values) {
            addCriterion("GROUP_SYNERGY_ID_ROid not in", values, "groupSynergyIdRoid");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyIdRoidBetween(String value1, String value2) {
            addCriterion("GROUP_SYNERGY_ID_ROid between", value1, value2, "groupSynergyIdRoid");
            return (Criteria) this;
        }

        public Criteria andGroupSynergyIdRoidNotBetween(String value1, String value2) {
            addCriterion("GROUP_SYNERGY_ID_ROid not between", value1, value2, "groupSynergyIdRoid");
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