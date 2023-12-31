package com.tb.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerFiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerFiExample() {
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

        public Criteria andCustomerFiIdIsNull() {
            addCriterion("CUSTOMER_FI_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerFiIdIsNotNull() {
            addCriterion("CUSTOMER_FI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerFiIdEqualTo(String value) {
            addCriterion("CUSTOMER_FI_ID =", value, "customerFiId");
            return (Criteria) this;
        }

        public Criteria andCustomerFiIdNotEqualTo(String value) {
            addCriterion("CUSTOMER_FI_ID <>", value, "customerFiId");
            return (Criteria) this;
        }

        public Criteria andCustomerFiIdGreaterThan(String value) {
            addCriterion("CUSTOMER_FI_ID >", value, "customerFiId");
            return (Criteria) this;
        }

        public Criteria andCustomerFiIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_FI_ID >=", value, "customerFiId");
            return (Criteria) this;
        }

        public Criteria andCustomerFiIdLessThan(String value) {
            addCriterion("CUSTOMER_FI_ID <", value, "customerFiId");
            return (Criteria) this;
        }

        public Criteria andCustomerFiIdLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_FI_ID <=", value, "customerFiId");
            return (Criteria) this;
        }

        public Criteria andCustomerFiIdLike(String value) {
            addCriterion("CUSTOMER_FI_ID like", value, "customerFiId");
            return (Criteria) this;
        }

        public Criteria andCustomerFiIdNotLike(String value) {
            addCriterion("CUSTOMER_FI_ID not like", value, "customerFiId");
            return (Criteria) this;
        }

        public Criteria andCustomerFiIdIn(List<String> values) {
            addCriterion("CUSTOMER_FI_ID in", values, "customerFiId");
            return (Criteria) this;
        }

        public Criteria andCustomerFiIdNotIn(List<String> values) {
            addCriterion("CUSTOMER_FI_ID not in", values, "customerFiId");
            return (Criteria) this;
        }

        public Criteria andCustomerFiIdBetween(String value1, String value2) {
            addCriterion("CUSTOMER_FI_ID between", value1, value2, "customerFiId");
            return (Criteria) this;
        }

        public Criteria andCustomerFiIdNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_FI_ID not between", value1, value2, "customerFiId");
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

        public Criteria andInvoiceInfo1IsNull() {
            addCriterion("INVOICE_INFO1 is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo1IsNotNull() {
            addCriterion("INVOICE_INFO1 is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo1EqualTo(String value) {
            addCriterion("INVOICE_INFO1 =", value, "invoiceInfo1");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo1NotEqualTo(String value) {
            addCriterion("INVOICE_INFO1 <>", value, "invoiceInfo1");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo1GreaterThan(String value) {
            addCriterion("INVOICE_INFO1 >", value, "invoiceInfo1");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo1GreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_INFO1 >=", value, "invoiceInfo1");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo1LessThan(String value) {
            addCriterion("INVOICE_INFO1 <", value, "invoiceInfo1");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo1LessThanOrEqualTo(String value) {
            addCriterion("INVOICE_INFO1 <=", value, "invoiceInfo1");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo1Like(String value) {
            addCriterion("INVOICE_INFO1 like", value, "invoiceInfo1");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo1NotLike(String value) {
            addCriterion("INVOICE_INFO1 not like", value, "invoiceInfo1");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo1In(List<String> values) {
            addCriterion("INVOICE_INFO1 in", values, "invoiceInfo1");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo1NotIn(List<String> values) {
            addCriterion("INVOICE_INFO1 not in", values, "invoiceInfo1");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo1Between(String value1, String value2) {
            addCriterion("INVOICE_INFO1 between", value1, value2, "invoiceInfo1");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo1NotBetween(String value1, String value2) {
            addCriterion("INVOICE_INFO1 not between", value1, value2, "invoiceInfo1");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo2IsNull() {
            addCriterion("INVOICE_INFO2 is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo2IsNotNull() {
            addCriterion("INVOICE_INFO2 is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo2EqualTo(String value) {
            addCriterion("INVOICE_INFO2 =", value, "invoiceInfo2");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo2NotEqualTo(String value) {
            addCriterion("INVOICE_INFO2 <>", value, "invoiceInfo2");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo2GreaterThan(String value) {
            addCriterion("INVOICE_INFO2 >", value, "invoiceInfo2");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo2GreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_INFO2 >=", value, "invoiceInfo2");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo2LessThan(String value) {
            addCriterion("INVOICE_INFO2 <", value, "invoiceInfo2");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo2LessThanOrEqualTo(String value) {
            addCriterion("INVOICE_INFO2 <=", value, "invoiceInfo2");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo2Like(String value) {
            addCriterion("INVOICE_INFO2 like", value, "invoiceInfo2");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo2NotLike(String value) {
            addCriterion("INVOICE_INFO2 not like", value, "invoiceInfo2");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo2In(List<String> values) {
            addCriterion("INVOICE_INFO2 in", values, "invoiceInfo2");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo2NotIn(List<String> values) {
            addCriterion("INVOICE_INFO2 not in", values, "invoiceInfo2");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo2Between(String value1, String value2) {
            addCriterion("INVOICE_INFO2 between", value1, value2, "invoiceInfo2");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo2NotBetween(String value1, String value2) {
            addCriterion("INVOICE_INFO2 not between", value1, value2, "invoiceInfo2");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo3IsNull() {
            addCriterion("INVOICE_INFO3 is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo3IsNotNull() {
            addCriterion("INVOICE_INFO3 is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo3EqualTo(String value) {
            addCriterion("INVOICE_INFO3 =", value, "invoiceInfo3");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo3NotEqualTo(String value) {
            addCriterion("INVOICE_INFO3 <>", value, "invoiceInfo3");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo3GreaterThan(String value) {
            addCriterion("INVOICE_INFO3 >", value, "invoiceInfo3");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo3GreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_INFO3 >=", value, "invoiceInfo3");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo3LessThan(String value) {
            addCriterion("INVOICE_INFO3 <", value, "invoiceInfo3");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo3LessThanOrEqualTo(String value) {
            addCriterion("INVOICE_INFO3 <=", value, "invoiceInfo3");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo3Like(String value) {
            addCriterion("INVOICE_INFO3 like", value, "invoiceInfo3");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo3NotLike(String value) {
            addCriterion("INVOICE_INFO3 not like", value, "invoiceInfo3");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo3In(List<String> values) {
            addCriterion("INVOICE_INFO3 in", values, "invoiceInfo3");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo3NotIn(List<String> values) {
            addCriterion("INVOICE_INFO3 not in", values, "invoiceInfo3");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo3Between(String value1, String value2) {
            addCriterion("INVOICE_INFO3 between", value1, value2, "invoiceInfo3");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo3NotBetween(String value1, String value2) {
            addCriterion("INVOICE_INFO3 not between", value1, value2, "invoiceInfo3");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo4IsNull() {
            addCriterion("INVOICE_INFO4 is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo4IsNotNull() {
            addCriterion("INVOICE_INFO4 is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo4EqualTo(String value) {
            addCriterion("INVOICE_INFO4 =", value, "invoiceInfo4");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo4NotEqualTo(String value) {
            addCriterion("INVOICE_INFO4 <>", value, "invoiceInfo4");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo4GreaterThan(String value) {
            addCriterion("INVOICE_INFO4 >", value, "invoiceInfo4");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo4GreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_INFO4 >=", value, "invoiceInfo4");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo4LessThan(String value) {
            addCriterion("INVOICE_INFO4 <", value, "invoiceInfo4");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo4LessThanOrEqualTo(String value) {
            addCriterion("INVOICE_INFO4 <=", value, "invoiceInfo4");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo4Like(String value) {
            addCriterion("INVOICE_INFO4 like", value, "invoiceInfo4");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo4NotLike(String value) {
            addCriterion("INVOICE_INFO4 not like", value, "invoiceInfo4");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo4In(List<String> values) {
            addCriterion("INVOICE_INFO4 in", values, "invoiceInfo4");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo4NotIn(List<String> values) {
            addCriterion("INVOICE_INFO4 not in", values, "invoiceInfo4");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo4Between(String value1, String value2) {
            addCriterion("INVOICE_INFO4 between", value1, value2, "invoiceInfo4");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo4NotBetween(String value1, String value2) {
            addCriterion("INVOICE_INFO4 not between", value1, value2, "invoiceInfo4");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo5IsNull() {
            addCriterion("INVOICE_INFO5 is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo5IsNotNull() {
            addCriterion("INVOICE_INFO5 is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo5EqualTo(String value) {
            addCriterion("INVOICE_INFO5 =", value, "invoiceInfo5");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo5NotEqualTo(String value) {
            addCriterion("INVOICE_INFO5 <>", value, "invoiceInfo5");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo5GreaterThan(String value) {
            addCriterion("INVOICE_INFO5 >", value, "invoiceInfo5");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo5GreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_INFO5 >=", value, "invoiceInfo5");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo5LessThan(String value) {
            addCriterion("INVOICE_INFO5 <", value, "invoiceInfo5");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo5LessThanOrEqualTo(String value) {
            addCriterion("INVOICE_INFO5 <=", value, "invoiceInfo5");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo5Like(String value) {
            addCriterion("INVOICE_INFO5 like", value, "invoiceInfo5");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo5NotLike(String value) {
            addCriterion("INVOICE_INFO5 not like", value, "invoiceInfo5");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo5In(List<String> values) {
            addCriterion("INVOICE_INFO5 in", values, "invoiceInfo5");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo5NotIn(List<String> values) {
            addCriterion("INVOICE_INFO5 not in", values, "invoiceInfo5");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo5Between(String value1, String value2) {
            addCriterion("INVOICE_INFO5 between", value1, value2, "invoiceInfo5");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo5NotBetween(String value1, String value2) {
            addCriterion("INVOICE_INFO5 not between", value1, value2, "invoiceInfo5");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo6IsNull() {
            addCriterion("INVOICE_INFO6 is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo6IsNotNull() {
            addCriterion("INVOICE_INFO6 is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo6EqualTo(String value) {
            addCriterion("INVOICE_INFO6 =", value, "invoiceInfo6");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo6NotEqualTo(String value) {
            addCriterion("INVOICE_INFO6 <>", value, "invoiceInfo6");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo6GreaterThan(String value) {
            addCriterion("INVOICE_INFO6 >", value, "invoiceInfo6");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo6GreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_INFO6 >=", value, "invoiceInfo6");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo6LessThan(String value) {
            addCriterion("INVOICE_INFO6 <", value, "invoiceInfo6");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo6LessThanOrEqualTo(String value) {
            addCriterion("INVOICE_INFO6 <=", value, "invoiceInfo6");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo6Like(String value) {
            addCriterion("INVOICE_INFO6 like", value, "invoiceInfo6");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo6NotLike(String value) {
            addCriterion("INVOICE_INFO6 not like", value, "invoiceInfo6");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo6In(List<String> values) {
            addCriterion("INVOICE_INFO6 in", values, "invoiceInfo6");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo6NotIn(List<String> values) {
            addCriterion("INVOICE_INFO6 not in", values, "invoiceInfo6");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo6Between(String value1, String value2) {
            addCriterion("INVOICE_INFO6 between", value1, value2, "invoiceInfo6");
            return (Criteria) this;
        }

        public Criteria andInvoiceInfo6NotBetween(String value1, String value2) {
            addCriterion("INVOICE_INFO6 not between", value1, value2, "invoiceInfo6");
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

        public Criteria andSettlementMethodIdIsNull() {
            addCriterion("SETTLEMENT_METHOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andSettlementMethodIdIsNotNull() {
            addCriterion("SETTLEMENT_METHOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementMethodIdEqualTo(String value) {
            addCriterion("SETTLEMENT_METHOD_ID =", value, "settlementMethodId");
            return (Criteria) this;
        }

        public Criteria andSettlementMethodIdNotEqualTo(String value) {
            addCriterion("SETTLEMENT_METHOD_ID <>", value, "settlementMethodId");
            return (Criteria) this;
        }

        public Criteria andSettlementMethodIdGreaterThan(String value) {
            addCriterion("SETTLEMENT_METHOD_ID >", value, "settlementMethodId");
            return (Criteria) this;
        }

        public Criteria andSettlementMethodIdGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_METHOD_ID >=", value, "settlementMethodId");
            return (Criteria) this;
        }

        public Criteria andSettlementMethodIdLessThan(String value) {
            addCriterion("SETTLEMENT_METHOD_ID <", value, "settlementMethodId");
            return (Criteria) this;
        }

        public Criteria andSettlementMethodIdLessThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_METHOD_ID <=", value, "settlementMethodId");
            return (Criteria) this;
        }

        public Criteria andSettlementMethodIdLike(String value) {
            addCriterion("SETTLEMENT_METHOD_ID like", value, "settlementMethodId");
            return (Criteria) this;
        }

        public Criteria andSettlementMethodIdNotLike(String value) {
            addCriterion("SETTLEMENT_METHOD_ID not like", value, "settlementMethodId");
            return (Criteria) this;
        }

        public Criteria andSettlementMethodIdIn(List<String> values) {
            addCriterion("SETTLEMENT_METHOD_ID in", values, "settlementMethodId");
            return (Criteria) this;
        }

        public Criteria andSettlementMethodIdNotIn(List<String> values) {
            addCriterion("SETTLEMENT_METHOD_ID not in", values, "settlementMethodId");
            return (Criteria) this;
        }

        public Criteria andSettlementMethodIdBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_METHOD_ID between", value1, value2, "settlementMethodId");
            return (Criteria) this;
        }

        public Criteria andSettlementMethodIdNotBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_METHOD_ID not between", value1, value2, "settlementMethodId");
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

        public Criteria andReceiverIdIsNull() {
            addCriterion("RECEIVER_ID is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIsNotNull() {
            addCriterion("RECEIVER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdEqualTo(String value) {
            addCriterion("RECEIVER_ID =", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotEqualTo(String value) {
            addCriterion("RECEIVER_ID <>", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdGreaterThan(String value) {
            addCriterion("RECEIVER_ID >", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER_ID >=", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdLessThan(String value) {
            addCriterion("RECEIVER_ID <", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER_ID <=", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdLike(String value) {
            addCriterion("RECEIVER_ID like", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotLike(String value) {
            addCriterion("RECEIVER_ID not like", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIn(List<String> values) {
            addCriterion("RECEIVER_ID in", values, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotIn(List<String> values) {
            addCriterion("RECEIVER_ID not in", values, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdBetween(String value1, String value2) {
            addCriterion("RECEIVER_ID between", value1, value2, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotBetween(String value1, String value2) {
            addCriterion("RECEIVER_ID not between", value1, value2, "receiverId");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditRatingIdIsNull() {
            addCriterion("CUSTOMER_CREDIT_RATING_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditRatingIdIsNotNull() {
            addCriterion("CUSTOMER_CREDIT_RATING_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditRatingIdEqualTo(String value) {
            addCriterion("CUSTOMER_CREDIT_RATING_ID =", value, "customerCreditRatingId");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditRatingIdNotEqualTo(String value) {
            addCriterion("CUSTOMER_CREDIT_RATING_ID <>", value, "customerCreditRatingId");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditRatingIdGreaterThan(String value) {
            addCriterion("CUSTOMER_CREDIT_RATING_ID >", value, "customerCreditRatingId");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditRatingIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_CREDIT_RATING_ID >=", value, "customerCreditRatingId");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditRatingIdLessThan(String value) {
            addCriterion("CUSTOMER_CREDIT_RATING_ID <", value, "customerCreditRatingId");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditRatingIdLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_CREDIT_RATING_ID <=", value, "customerCreditRatingId");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditRatingIdLike(String value) {
            addCriterion("CUSTOMER_CREDIT_RATING_ID like", value, "customerCreditRatingId");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditRatingIdNotLike(String value) {
            addCriterion("CUSTOMER_CREDIT_RATING_ID not like", value, "customerCreditRatingId");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditRatingIdIn(List<String> values) {
            addCriterion("CUSTOMER_CREDIT_RATING_ID in", values, "customerCreditRatingId");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditRatingIdNotIn(List<String> values) {
            addCriterion("CUSTOMER_CREDIT_RATING_ID not in", values, "customerCreditRatingId");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditRatingIdBetween(String value1, String value2) {
            addCriterion("CUSTOMER_CREDIT_RATING_ID between", value1, value2, "customerCreditRatingId");
            return (Criteria) this;
        }

        public Criteria andCustomerCreditRatingIdNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_CREDIT_RATING_ID not between", value1, value2, "customerCreditRatingId");
            return (Criteria) this;
        }

        public Criteria andCustomerFicategoryIdIsNull() {
            addCriterion("CUSTOMER_FICATEGORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerFicategoryIdIsNotNull() {
            addCriterion("CUSTOMER_FICATEGORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerFicategoryIdEqualTo(String value) {
            addCriterion("CUSTOMER_FICATEGORY_ID =", value, "customerFicategoryId");
            return (Criteria) this;
        }

        public Criteria andCustomerFicategoryIdNotEqualTo(String value) {
            addCriterion("CUSTOMER_FICATEGORY_ID <>", value, "customerFicategoryId");
            return (Criteria) this;
        }

        public Criteria andCustomerFicategoryIdGreaterThan(String value) {
            addCriterion("CUSTOMER_FICATEGORY_ID >", value, "customerFicategoryId");
            return (Criteria) this;
        }

        public Criteria andCustomerFicategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_FICATEGORY_ID >=", value, "customerFicategoryId");
            return (Criteria) this;
        }

        public Criteria andCustomerFicategoryIdLessThan(String value) {
            addCriterion("CUSTOMER_FICATEGORY_ID <", value, "customerFicategoryId");
            return (Criteria) this;
        }

        public Criteria andCustomerFicategoryIdLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_FICATEGORY_ID <=", value, "customerFicategoryId");
            return (Criteria) this;
        }

        public Criteria andCustomerFicategoryIdLike(String value) {
            addCriterion("CUSTOMER_FICATEGORY_ID like", value, "customerFicategoryId");
            return (Criteria) this;
        }

        public Criteria andCustomerFicategoryIdNotLike(String value) {
            addCriterion("CUSTOMER_FICATEGORY_ID not like", value, "customerFicategoryId");
            return (Criteria) this;
        }

        public Criteria andCustomerFicategoryIdIn(List<String> values) {
            addCriterion("CUSTOMER_FICATEGORY_ID in", values, "customerFicategoryId");
            return (Criteria) this;
        }

        public Criteria andCustomerFicategoryIdNotIn(List<String> values) {
            addCriterion("CUSTOMER_FICATEGORY_ID not in", values, "customerFicategoryId");
            return (Criteria) this;
        }

        public Criteria andCustomerFicategoryIdBetween(String value1, String value2) {
            addCriterion("CUSTOMER_FICATEGORY_ID between", value1, value2, "customerFicategoryId");
            return (Criteria) this;
        }

        public Criteria andCustomerFicategoryIdNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_FICATEGORY_ID not between", value1, value2, "customerFicategoryId");
            return (Criteria) this;
        }

        public Criteria andOtherClearingHouseFlagIsNull() {
            addCriterion("OTHER_CLEARING_HOUSE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andOtherClearingHouseFlagIsNotNull() {
            addCriterion("OTHER_CLEARING_HOUSE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andOtherClearingHouseFlagEqualTo(Boolean value) {
            addCriterion("OTHER_CLEARING_HOUSE_FLAG =", value, "otherClearingHouseFlag");
            return (Criteria) this;
        }

        public Criteria andOtherClearingHouseFlagNotEqualTo(Boolean value) {
            addCriterion("OTHER_CLEARING_HOUSE_FLAG <>", value, "otherClearingHouseFlag");
            return (Criteria) this;
        }

        public Criteria andOtherClearingHouseFlagGreaterThan(Boolean value) {
            addCriterion("OTHER_CLEARING_HOUSE_FLAG >", value, "otherClearingHouseFlag");
            return (Criteria) this;
        }

        public Criteria andOtherClearingHouseFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("OTHER_CLEARING_HOUSE_FLAG >=", value, "otherClearingHouseFlag");
            return (Criteria) this;
        }

        public Criteria andOtherClearingHouseFlagLessThan(Boolean value) {
            addCriterion("OTHER_CLEARING_HOUSE_FLAG <", value, "otherClearingHouseFlag");
            return (Criteria) this;
        }

        public Criteria andOtherClearingHouseFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("OTHER_CLEARING_HOUSE_FLAG <=", value, "otherClearingHouseFlag");
            return (Criteria) this;
        }

        public Criteria andOtherClearingHouseFlagIn(List<Boolean> values) {
            addCriterion("OTHER_CLEARING_HOUSE_FLAG in", values, "otherClearingHouseFlag");
            return (Criteria) this;
        }

        public Criteria andOtherClearingHouseFlagNotIn(List<Boolean> values) {
            addCriterion("OTHER_CLEARING_HOUSE_FLAG not in", values, "otherClearingHouseFlag");
            return (Criteria) this;
        }

        public Criteria andOtherClearingHouseFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("OTHER_CLEARING_HOUSE_FLAG between", value1, value2, "otherClearingHouseFlag");
            return (Criteria) this;
        }

        public Criteria andOtherClearingHouseFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("OTHER_CLEARING_HOUSE_FLAG not between", value1, value2, "otherClearingHouseFlag");
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

        public Criteria andRoleRemarkIsNull() {
            addCriterion("ROLE_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkIsNotNull() {
            addCriterion("ROLE_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkEqualTo(String value) {
            addCriterion("ROLE_REMARK =", value, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkNotEqualTo(String value) {
            addCriterion("ROLE_REMARK <>", value, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkGreaterThan(String value) {
            addCriterion("ROLE_REMARK >", value, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_REMARK >=", value, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkLessThan(String value) {
            addCriterion("ROLE_REMARK <", value, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkLessThanOrEqualTo(String value) {
            addCriterion("ROLE_REMARK <=", value, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkLike(String value) {
            addCriterion("ROLE_REMARK like", value, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkNotLike(String value) {
            addCriterion("ROLE_REMARK not like", value, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkIn(List<String> values) {
            addCriterion("ROLE_REMARK in", values, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkNotIn(List<String> values) {
            addCriterion("ROLE_REMARK not in", values, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkBetween(String value1, String value2) {
            addCriterion("ROLE_REMARK between", value1, value2, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkNotBetween(String value1, String value2) {
            addCriterion("ROLE_REMARK not between", value1, value2, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andCswarrCategoryIdIsNull() {
            addCriterion("CSWARR_CATEGORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCswarrCategoryIdIsNotNull() {
            addCriterion("CSWARR_CATEGORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCswarrCategoryIdEqualTo(String value) {
            addCriterion("CSWARR_CATEGORY_ID =", value, "cswarrCategoryId");
            return (Criteria) this;
        }

        public Criteria andCswarrCategoryIdNotEqualTo(String value) {
            addCriterion("CSWARR_CATEGORY_ID <>", value, "cswarrCategoryId");
            return (Criteria) this;
        }

        public Criteria andCswarrCategoryIdGreaterThan(String value) {
            addCriterion("CSWARR_CATEGORY_ID >", value, "cswarrCategoryId");
            return (Criteria) this;
        }

        public Criteria andCswarrCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("CSWARR_CATEGORY_ID >=", value, "cswarrCategoryId");
            return (Criteria) this;
        }

        public Criteria andCswarrCategoryIdLessThan(String value) {
            addCriterion("CSWARR_CATEGORY_ID <", value, "cswarrCategoryId");
            return (Criteria) this;
        }

        public Criteria andCswarrCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("CSWARR_CATEGORY_ID <=", value, "cswarrCategoryId");
            return (Criteria) this;
        }

        public Criteria andCswarrCategoryIdLike(String value) {
            addCriterion("CSWARR_CATEGORY_ID like", value, "cswarrCategoryId");
            return (Criteria) this;
        }

        public Criteria andCswarrCategoryIdNotLike(String value) {
            addCriterion("CSWARR_CATEGORY_ID not like", value, "cswarrCategoryId");
            return (Criteria) this;
        }

        public Criteria andCswarrCategoryIdIn(List<String> values) {
            addCriterion("CSWARR_CATEGORY_ID in", values, "cswarrCategoryId");
            return (Criteria) this;
        }

        public Criteria andCswarrCategoryIdNotIn(List<String> values) {
            addCriterion("CSWARR_CATEGORY_ID not in", values, "cswarrCategoryId");
            return (Criteria) this;
        }

        public Criteria andCswarrCategoryIdBetween(String value1, String value2) {
            addCriterion("CSWARR_CATEGORY_ID between", value1, value2, "cswarrCategoryId");
            return (Criteria) this;
        }

        public Criteria andCswarrCategoryIdNotBetween(String value1, String value2) {
            addCriterion("CSWARR_CATEGORY_ID not between", value1, value2, "cswarrCategoryId");
            return (Criteria) this;
        }

        public Criteria andCustomerNatureIsNull() {
            addCriterion("CUSTOMER_NATURE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNatureIsNotNull() {
            addCriterion("CUSTOMER_NATURE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNatureEqualTo(Integer value) {
            addCriterion("CUSTOMER_NATURE =", value, "customerNature");
            return (Criteria) this;
        }

        public Criteria andCustomerNatureNotEqualTo(Integer value) {
            addCriterion("CUSTOMER_NATURE <>", value, "customerNature");
            return (Criteria) this;
        }

        public Criteria andCustomerNatureGreaterThan(Integer value) {
            addCriterion("CUSTOMER_NATURE >", value, "customerNature");
            return (Criteria) this;
        }

        public Criteria andCustomerNatureGreaterThanOrEqualTo(Integer value) {
            addCriterion("CUSTOMER_NATURE >=", value, "customerNature");
            return (Criteria) this;
        }

        public Criteria andCustomerNatureLessThan(Integer value) {
            addCriterion("CUSTOMER_NATURE <", value, "customerNature");
            return (Criteria) this;
        }

        public Criteria andCustomerNatureLessThanOrEqualTo(Integer value) {
            addCriterion("CUSTOMER_NATURE <=", value, "customerNature");
            return (Criteria) this;
        }

        public Criteria andCustomerNatureIn(List<Integer> values) {
            addCriterion("CUSTOMER_NATURE in", values, "customerNature");
            return (Criteria) this;
        }

        public Criteria andCustomerNatureNotIn(List<Integer> values) {
            addCriterion("CUSTOMER_NATURE not in", values, "customerNature");
            return (Criteria) this;
        }

        public Criteria andCustomerNatureBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOMER_NATURE between", value1, value2, "customerNature");
            return (Criteria) this;
        }

        public Criteria andCustomerNatureNotBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOMER_NATURE not between", value1, value2, "customerNature");
            return (Criteria) this;
        }

        public Criteria andTweinThirdIdIsNull() {
            addCriterion("TWEIN_THIRD_ID is null");
            return (Criteria) this;
        }

        public Criteria andTweinThirdIdIsNotNull() {
            addCriterion("TWEIN_THIRD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTweinThirdIdEqualTo(String value) {
            addCriterion("TWEIN_THIRD_ID =", value, "tweinThirdId");
            return (Criteria) this;
        }

        public Criteria andTweinThirdIdNotEqualTo(String value) {
            addCriterion("TWEIN_THIRD_ID <>", value, "tweinThirdId");
            return (Criteria) this;
        }

        public Criteria andTweinThirdIdGreaterThan(String value) {
            addCriterion("TWEIN_THIRD_ID >", value, "tweinThirdId");
            return (Criteria) this;
        }

        public Criteria andTweinThirdIdGreaterThanOrEqualTo(String value) {
            addCriterion("TWEIN_THIRD_ID >=", value, "tweinThirdId");
            return (Criteria) this;
        }

        public Criteria andTweinThirdIdLessThan(String value) {
            addCriterion("TWEIN_THIRD_ID <", value, "tweinThirdId");
            return (Criteria) this;
        }

        public Criteria andTweinThirdIdLessThanOrEqualTo(String value) {
            addCriterion("TWEIN_THIRD_ID <=", value, "tweinThirdId");
            return (Criteria) this;
        }

        public Criteria andTweinThirdIdLike(String value) {
            addCriterion("TWEIN_THIRD_ID like", value, "tweinThirdId");
            return (Criteria) this;
        }

        public Criteria andTweinThirdIdNotLike(String value) {
            addCriterion("TWEIN_THIRD_ID not like", value, "tweinThirdId");
            return (Criteria) this;
        }

        public Criteria andTweinThirdIdIn(List<String> values) {
            addCriterion("TWEIN_THIRD_ID in", values, "tweinThirdId");
            return (Criteria) this;
        }

        public Criteria andTweinThirdIdNotIn(List<String> values) {
            addCriterion("TWEIN_THIRD_ID not in", values, "tweinThirdId");
            return (Criteria) this;
        }

        public Criteria andTweinThirdIdBetween(String value1, String value2) {
            addCriterion("TWEIN_THIRD_ID between", value1, value2, "tweinThirdId");
            return (Criteria) this;
        }

        public Criteria andTweinThirdIdNotBetween(String value1, String value2) {
            addCriterion("TWEIN_THIRD_ID not between", value1, value2, "tweinThirdId");
            return (Criteria) this;
        }

        public Criteria andEinInvoiceCategoryIsNull() {
            addCriterion("EIN_INVOICE_CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andEinInvoiceCategoryIsNotNull() {
            addCriterion("EIN_INVOICE_CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andEinInvoiceCategoryEqualTo(Integer value) {
            addCriterion("EIN_INVOICE_CATEGORY =", value, "einInvoiceCategory");
            return (Criteria) this;
        }

        public Criteria andEinInvoiceCategoryNotEqualTo(Integer value) {
            addCriterion("EIN_INVOICE_CATEGORY <>", value, "einInvoiceCategory");
            return (Criteria) this;
        }

        public Criteria andEinInvoiceCategoryGreaterThan(Integer value) {
            addCriterion("EIN_INVOICE_CATEGORY >", value, "einInvoiceCategory");
            return (Criteria) this;
        }

        public Criteria andEinInvoiceCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("EIN_INVOICE_CATEGORY >=", value, "einInvoiceCategory");
            return (Criteria) this;
        }

        public Criteria andEinInvoiceCategoryLessThan(Integer value) {
            addCriterion("EIN_INVOICE_CATEGORY <", value, "einInvoiceCategory");
            return (Criteria) this;
        }

        public Criteria andEinInvoiceCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("EIN_INVOICE_CATEGORY <=", value, "einInvoiceCategory");
            return (Criteria) this;
        }

        public Criteria andEinInvoiceCategoryIn(List<Integer> values) {
            addCriterion("EIN_INVOICE_CATEGORY in", values, "einInvoiceCategory");
            return (Criteria) this;
        }

        public Criteria andEinInvoiceCategoryNotIn(List<Integer> values) {
            addCriterion("EIN_INVOICE_CATEGORY not in", values, "einInvoiceCategory");
            return (Criteria) this;
        }

        public Criteria andEinInvoiceCategoryBetween(Integer value1, Integer value2) {
            addCriterion("EIN_INVOICE_CATEGORY between", value1, value2, "einInvoiceCategory");
            return (Criteria) this;
        }

        public Criteria andEinInvoiceCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("EIN_INVOICE_CATEGORY not between", value1, value2, "einInvoiceCategory");
            return (Criteria) this;
        }

        public Criteria andThirdSendInvoiceFlagIsNull() {
            addCriterion("THIRD_SEND_INVOICE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andThirdSendInvoiceFlagIsNotNull() {
            addCriterion("THIRD_SEND_INVOICE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andThirdSendInvoiceFlagEqualTo(Boolean value) {
            addCriterion("THIRD_SEND_INVOICE_FLAG =", value, "thirdSendInvoiceFlag");
            return (Criteria) this;
        }

        public Criteria andThirdSendInvoiceFlagNotEqualTo(Boolean value) {
            addCriterion("THIRD_SEND_INVOICE_FLAG <>", value, "thirdSendInvoiceFlag");
            return (Criteria) this;
        }

        public Criteria andThirdSendInvoiceFlagGreaterThan(Boolean value) {
            addCriterion("THIRD_SEND_INVOICE_FLAG >", value, "thirdSendInvoiceFlag");
            return (Criteria) this;
        }

        public Criteria andThirdSendInvoiceFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("THIRD_SEND_INVOICE_FLAG >=", value, "thirdSendInvoiceFlag");
            return (Criteria) this;
        }

        public Criteria andThirdSendInvoiceFlagLessThan(Boolean value) {
            addCriterion("THIRD_SEND_INVOICE_FLAG <", value, "thirdSendInvoiceFlag");
            return (Criteria) this;
        }

        public Criteria andThirdSendInvoiceFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("THIRD_SEND_INVOICE_FLAG <=", value, "thirdSendInvoiceFlag");
            return (Criteria) this;
        }

        public Criteria andThirdSendInvoiceFlagIn(List<Boolean> values) {
            addCriterion("THIRD_SEND_INVOICE_FLAG in", values, "thirdSendInvoiceFlag");
            return (Criteria) this;
        }

        public Criteria andThirdSendInvoiceFlagNotIn(List<Boolean> values) {
            addCriterion("THIRD_SEND_INVOICE_FLAG not in", values, "thirdSendInvoiceFlag");
            return (Criteria) this;
        }

        public Criteria andThirdSendInvoiceFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("THIRD_SEND_INVOICE_FLAG between", value1, value2, "thirdSendInvoiceFlag");
            return (Criteria) this;
        }

        public Criteria andThirdSendInvoiceFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("THIRD_SEND_INVOICE_FLAG not between", value1, value2, "thirdSendInvoiceFlag");
            return (Criteria) this;
        }

        public Criteria andSellerIssueCreditFlagIsNull() {
            addCriterion("SELLER_ISSUE_CREDIT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andSellerIssueCreditFlagIsNotNull() {
            addCriterion("SELLER_ISSUE_CREDIT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIssueCreditFlagEqualTo(Boolean value) {
            addCriterion("SELLER_ISSUE_CREDIT_FLAG =", value, "sellerIssueCreditFlag");
            return (Criteria) this;
        }

        public Criteria andSellerIssueCreditFlagNotEqualTo(Boolean value) {
            addCriterion("SELLER_ISSUE_CREDIT_FLAG <>", value, "sellerIssueCreditFlag");
            return (Criteria) this;
        }

        public Criteria andSellerIssueCreditFlagGreaterThan(Boolean value) {
            addCriterion("SELLER_ISSUE_CREDIT_FLAG >", value, "sellerIssueCreditFlag");
            return (Criteria) this;
        }

        public Criteria andSellerIssueCreditFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("SELLER_ISSUE_CREDIT_FLAG >=", value, "sellerIssueCreditFlag");
            return (Criteria) this;
        }

        public Criteria andSellerIssueCreditFlagLessThan(Boolean value) {
            addCriterion("SELLER_ISSUE_CREDIT_FLAG <", value, "sellerIssueCreditFlag");
            return (Criteria) this;
        }

        public Criteria andSellerIssueCreditFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("SELLER_ISSUE_CREDIT_FLAG <=", value, "sellerIssueCreditFlag");
            return (Criteria) this;
        }

        public Criteria andSellerIssueCreditFlagIn(List<Boolean> values) {
            addCriterion("SELLER_ISSUE_CREDIT_FLAG in", values, "sellerIssueCreditFlag");
            return (Criteria) this;
        }

        public Criteria andSellerIssueCreditFlagNotIn(List<Boolean> values) {
            addCriterion("SELLER_ISSUE_CREDIT_FLAG not in", values, "sellerIssueCreditFlag");
            return (Criteria) this;
        }

        public Criteria andSellerIssueCreditFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("SELLER_ISSUE_CREDIT_FLAG between", value1, value2, "sellerIssueCreditFlag");
            return (Criteria) this;
        }

        public Criteria andSellerIssueCreditFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("SELLER_ISSUE_CREDIT_FLAG not between", value1, value2, "sellerIssueCreditFlag");
            return (Criteria) this;
        }

        public Criteria andW055NoInvoiceFlagIsNull() {
            addCriterion("W055_NO_INVOICE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andW055NoInvoiceFlagIsNotNull() {
            addCriterion("W055_NO_INVOICE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andW055NoInvoiceFlagEqualTo(Boolean value) {
            addCriterion("W055_NO_INVOICE_FLAG =", value, "w055NoInvoiceFlag");
            return (Criteria) this;
        }

        public Criteria andW055NoInvoiceFlagNotEqualTo(Boolean value) {
            addCriterion("W055_NO_INVOICE_FLAG <>", value, "w055NoInvoiceFlag");
            return (Criteria) this;
        }

        public Criteria andW055NoInvoiceFlagGreaterThan(Boolean value) {
            addCriterion("W055_NO_INVOICE_FLAG >", value, "w055NoInvoiceFlag");
            return (Criteria) this;
        }

        public Criteria andW055NoInvoiceFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("W055_NO_INVOICE_FLAG >=", value, "w055NoInvoiceFlag");
            return (Criteria) this;
        }

        public Criteria andW055NoInvoiceFlagLessThan(Boolean value) {
            addCriterion("W055_NO_INVOICE_FLAG <", value, "w055NoInvoiceFlag");
            return (Criteria) this;
        }

        public Criteria andW055NoInvoiceFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("W055_NO_INVOICE_FLAG <=", value, "w055NoInvoiceFlag");
            return (Criteria) this;
        }

        public Criteria andW055NoInvoiceFlagIn(List<Boolean> values) {
            addCriterion("W055_NO_INVOICE_FLAG in", values, "w055NoInvoiceFlag");
            return (Criteria) this;
        }

        public Criteria andW055NoInvoiceFlagNotIn(List<Boolean> values) {
            addCriterion("W055_NO_INVOICE_FLAG not in", values, "w055NoInvoiceFlag");
            return (Criteria) this;
        }

        public Criteria andW055NoInvoiceFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("W055_NO_INVOICE_FLAG between", value1, value2, "w055NoInvoiceFlag");
            return (Criteria) this;
        }

        public Criteria andW055NoInvoiceFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("W055_NO_INVOICE_FLAG not between", value1, value2, "w055NoInvoiceFlag");
            return (Criteria) this;
        }

        public Criteria andW055InvoiceRuleIdIsNull() {
            addCriterion("W055_INVOICE_RULE_ID is null");
            return (Criteria) this;
        }

        public Criteria andW055InvoiceRuleIdIsNotNull() {
            addCriterion("W055_INVOICE_RULE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andW055InvoiceRuleIdEqualTo(String value) {
            addCriterion("W055_INVOICE_RULE_ID =", value, "w055InvoiceRuleId");
            return (Criteria) this;
        }

        public Criteria andW055InvoiceRuleIdNotEqualTo(String value) {
            addCriterion("W055_INVOICE_RULE_ID <>", value, "w055InvoiceRuleId");
            return (Criteria) this;
        }

        public Criteria andW055InvoiceRuleIdGreaterThan(String value) {
            addCriterion("W055_INVOICE_RULE_ID >", value, "w055InvoiceRuleId");
            return (Criteria) this;
        }

        public Criteria andW055InvoiceRuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("W055_INVOICE_RULE_ID >=", value, "w055InvoiceRuleId");
            return (Criteria) this;
        }

        public Criteria andW055InvoiceRuleIdLessThan(String value) {
            addCriterion("W055_INVOICE_RULE_ID <", value, "w055InvoiceRuleId");
            return (Criteria) this;
        }

        public Criteria andW055InvoiceRuleIdLessThanOrEqualTo(String value) {
            addCriterion("W055_INVOICE_RULE_ID <=", value, "w055InvoiceRuleId");
            return (Criteria) this;
        }

        public Criteria andW055InvoiceRuleIdLike(String value) {
            addCriterion("W055_INVOICE_RULE_ID like", value, "w055InvoiceRuleId");
            return (Criteria) this;
        }

        public Criteria andW055InvoiceRuleIdNotLike(String value) {
            addCriterion("W055_INVOICE_RULE_ID not like", value, "w055InvoiceRuleId");
            return (Criteria) this;
        }

        public Criteria andW055InvoiceRuleIdIn(List<String> values) {
            addCriterion("W055_INVOICE_RULE_ID in", values, "w055InvoiceRuleId");
            return (Criteria) this;
        }

        public Criteria andW055InvoiceRuleIdNotIn(List<String> values) {
            addCriterion("W055_INVOICE_RULE_ID not in", values, "w055InvoiceRuleId");
            return (Criteria) this;
        }

        public Criteria andW055InvoiceRuleIdBetween(String value1, String value2) {
            addCriterion("W055_INVOICE_RULE_ID between", value1, value2, "w055InvoiceRuleId");
            return (Criteria) this;
        }

        public Criteria andW055InvoiceRuleIdNotBetween(String value1, String value2) {
            addCriterion("W055_INVOICE_RULE_ID not between", value1, value2, "w055InvoiceRuleId");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail1IsNull() {
            addCriterion("W055_EIPA_EMAIL1 is null");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail1IsNotNull() {
            addCriterion("W055_EIPA_EMAIL1 is not null");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail1EqualTo(String value) {
            addCriterion("W055_EIPA_EMAIL1 =", value, "w055EipaEmail1");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail1NotEqualTo(String value) {
            addCriterion("W055_EIPA_EMAIL1 <>", value, "w055EipaEmail1");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail1GreaterThan(String value) {
            addCriterion("W055_EIPA_EMAIL1 >", value, "w055EipaEmail1");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail1GreaterThanOrEqualTo(String value) {
            addCriterion("W055_EIPA_EMAIL1 >=", value, "w055EipaEmail1");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail1LessThan(String value) {
            addCriterion("W055_EIPA_EMAIL1 <", value, "w055EipaEmail1");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail1LessThanOrEqualTo(String value) {
            addCriterion("W055_EIPA_EMAIL1 <=", value, "w055EipaEmail1");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail1Like(String value) {
            addCriterion("W055_EIPA_EMAIL1 like", value, "w055EipaEmail1");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail1NotLike(String value) {
            addCriterion("W055_EIPA_EMAIL1 not like", value, "w055EipaEmail1");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail1In(List<String> values) {
            addCriterion("W055_EIPA_EMAIL1 in", values, "w055EipaEmail1");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail1NotIn(List<String> values) {
            addCriterion("W055_EIPA_EMAIL1 not in", values, "w055EipaEmail1");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail1Between(String value1, String value2) {
            addCriterion("W055_EIPA_EMAIL1 between", value1, value2, "w055EipaEmail1");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail1NotBetween(String value1, String value2) {
            addCriterion("W055_EIPA_EMAIL1 not between", value1, value2, "w055EipaEmail1");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail2IsNull() {
            addCriterion("W055_EIPA_EMAIL2 is null");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail2IsNotNull() {
            addCriterion("W055_EIPA_EMAIL2 is not null");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail2EqualTo(String value) {
            addCriterion("W055_EIPA_EMAIL2 =", value, "w055EipaEmail2");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail2NotEqualTo(String value) {
            addCriterion("W055_EIPA_EMAIL2 <>", value, "w055EipaEmail2");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail2GreaterThan(String value) {
            addCriterion("W055_EIPA_EMAIL2 >", value, "w055EipaEmail2");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail2GreaterThanOrEqualTo(String value) {
            addCriterion("W055_EIPA_EMAIL2 >=", value, "w055EipaEmail2");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail2LessThan(String value) {
            addCriterion("W055_EIPA_EMAIL2 <", value, "w055EipaEmail2");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail2LessThanOrEqualTo(String value) {
            addCriterion("W055_EIPA_EMAIL2 <=", value, "w055EipaEmail2");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail2Like(String value) {
            addCriterion("W055_EIPA_EMAIL2 like", value, "w055EipaEmail2");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail2NotLike(String value) {
            addCriterion("W055_EIPA_EMAIL2 not like", value, "w055EipaEmail2");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail2In(List<String> values) {
            addCriterion("W055_EIPA_EMAIL2 in", values, "w055EipaEmail2");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail2NotIn(List<String> values) {
            addCriterion("W055_EIPA_EMAIL2 not in", values, "w055EipaEmail2");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail2Between(String value1, String value2) {
            addCriterion("W055_EIPA_EMAIL2 between", value1, value2, "w055EipaEmail2");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail2NotBetween(String value1, String value2) {
            addCriterion("W055_EIPA_EMAIL2 not between", value1, value2, "w055EipaEmail2");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail3IsNull() {
            addCriterion("W055_EIPA_EMAIL3 is null");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail3IsNotNull() {
            addCriterion("W055_EIPA_EMAIL3 is not null");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail3EqualTo(String value) {
            addCriterion("W055_EIPA_EMAIL3 =", value, "w055EipaEmail3");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail3NotEqualTo(String value) {
            addCriterion("W055_EIPA_EMAIL3 <>", value, "w055EipaEmail3");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail3GreaterThan(String value) {
            addCriterion("W055_EIPA_EMAIL3 >", value, "w055EipaEmail3");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail3GreaterThanOrEqualTo(String value) {
            addCriterion("W055_EIPA_EMAIL3 >=", value, "w055EipaEmail3");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail3LessThan(String value) {
            addCriterion("W055_EIPA_EMAIL3 <", value, "w055EipaEmail3");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail3LessThanOrEqualTo(String value) {
            addCriterion("W055_EIPA_EMAIL3 <=", value, "w055EipaEmail3");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail3Like(String value) {
            addCriterion("W055_EIPA_EMAIL3 like", value, "w055EipaEmail3");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail3NotLike(String value) {
            addCriterion("W055_EIPA_EMAIL3 not like", value, "w055EipaEmail3");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail3In(List<String> values) {
            addCriterion("W055_EIPA_EMAIL3 in", values, "w055EipaEmail3");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail3NotIn(List<String> values) {
            addCriterion("W055_EIPA_EMAIL3 not in", values, "w055EipaEmail3");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail3Between(String value1, String value2) {
            addCriterion("W055_EIPA_EMAIL3 between", value1, value2, "w055EipaEmail3");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail3NotBetween(String value1, String value2) {
            addCriterion("W055_EIPA_EMAIL3 not between", value1, value2, "w055EipaEmail3");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail4IsNull() {
            addCriterion("W055_EIPA_EMAIL4 is null");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail4IsNotNull() {
            addCriterion("W055_EIPA_EMAIL4 is not null");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail4EqualTo(String value) {
            addCriterion("W055_EIPA_EMAIL4 =", value, "w055EipaEmail4");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail4NotEqualTo(String value) {
            addCriterion("W055_EIPA_EMAIL4 <>", value, "w055EipaEmail4");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail4GreaterThan(String value) {
            addCriterion("W055_EIPA_EMAIL4 >", value, "w055EipaEmail4");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail4GreaterThanOrEqualTo(String value) {
            addCriterion("W055_EIPA_EMAIL4 >=", value, "w055EipaEmail4");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail4LessThan(String value) {
            addCriterion("W055_EIPA_EMAIL4 <", value, "w055EipaEmail4");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail4LessThanOrEqualTo(String value) {
            addCriterion("W055_EIPA_EMAIL4 <=", value, "w055EipaEmail4");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail4Like(String value) {
            addCriterion("W055_EIPA_EMAIL4 like", value, "w055EipaEmail4");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail4NotLike(String value) {
            addCriterion("W055_EIPA_EMAIL4 not like", value, "w055EipaEmail4");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail4In(List<String> values) {
            addCriterion("W055_EIPA_EMAIL4 in", values, "w055EipaEmail4");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail4NotIn(List<String> values) {
            addCriterion("W055_EIPA_EMAIL4 not in", values, "w055EipaEmail4");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail4Between(String value1, String value2) {
            addCriterion("W055_EIPA_EMAIL4 between", value1, value2, "w055EipaEmail4");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail4NotBetween(String value1, String value2) {
            addCriterion("W055_EIPA_EMAIL4 not between", value1, value2, "w055EipaEmail4");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail5IsNull() {
            addCriterion("W055_EIPA_EMAIL5 is null");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail5IsNotNull() {
            addCriterion("W055_EIPA_EMAIL5 is not null");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail5EqualTo(String value) {
            addCriterion("W055_EIPA_EMAIL5 =", value, "w055EipaEmail5");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail5NotEqualTo(String value) {
            addCriterion("W055_EIPA_EMAIL5 <>", value, "w055EipaEmail5");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail5GreaterThan(String value) {
            addCriterion("W055_EIPA_EMAIL5 >", value, "w055EipaEmail5");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail5GreaterThanOrEqualTo(String value) {
            addCriterion("W055_EIPA_EMAIL5 >=", value, "w055EipaEmail5");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail5LessThan(String value) {
            addCriterion("W055_EIPA_EMAIL5 <", value, "w055EipaEmail5");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail5LessThanOrEqualTo(String value) {
            addCriterion("W055_EIPA_EMAIL5 <=", value, "w055EipaEmail5");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail5Like(String value) {
            addCriterion("W055_EIPA_EMAIL5 like", value, "w055EipaEmail5");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail5NotLike(String value) {
            addCriterion("W055_EIPA_EMAIL5 not like", value, "w055EipaEmail5");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail5In(List<String> values) {
            addCriterion("W055_EIPA_EMAIL5 in", values, "w055EipaEmail5");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail5NotIn(List<String> values) {
            addCriterion("W055_EIPA_EMAIL5 not in", values, "w055EipaEmail5");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail5Between(String value1, String value2) {
            addCriterion("W055_EIPA_EMAIL5 between", value1, value2, "w055EipaEmail5");
            return (Criteria) this;
        }

        public Criteria andW055EipaEmail5NotBetween(String value1, String value2) {
            addCriterion("W055_EIPA_EMAIL5 not between", value1, value2, "w055EipaEmail5");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp1IsNull() {
            addCriterion("W055_EIPA_MP1 is null");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp1IsNotNull() {
            addCriterion("W055_EIPA_MP1 is not null");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp1EqualTo(String value) {
            addCriterion("W055_EIPA_MP1 =", value, "w055EipaMp1");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp1NotEqualTo(String value) {
            addCriterion("W055_EIPA_MP1 <>", value, "w055EipaMp1");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp1GreaterThan(String value) {
            addCriterion("W055_EIPA_MP1 >", value, "w055EipaMp1");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp1GreaterThanOrEqualTo(String value) {
            addCriterion("W055_EIPA_MP1 >=", value, "w055EipaMp1");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp1LessThan(String value) {
            addCriterion("W055_EIPA_MP1 <", value, "w055EipaMp1");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp1LessThanOrEqualTo(String value) {
            addCriterion("W055_EIPA_MP1 <=", value, "w055EipaMp1");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp1Like(String value) {
            addCriterion("W055_EIPA_MP1 like", value, "w055EipaMp1");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp1NotLike(String value) {
            addCriterion("W055_EIPA_MP1 not like", value, "w055EipaMp1");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp1In(List<String> values) {
            addCriterion("W055_EIPA_MP1 in", values, "w055EipaMp1");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp1NotIn(List<String> values) {
            addCriterion("W055_EIPA_MP1 not in", values, "w055EipaMp1");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp1Between(String value1, String value2) {
            addCriterion("W055_EIPA_MP1 between", value1, value2, "w055EipaMp1");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp1NotBetween(String value1, String value2) {
            addCriterion("W055_EIPA_MP1 not between", value1, value2, "w055EipaMp1");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp2IsNull() {
            addCriterion("W055_EIPA_MP2 is null");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp2IsNotNull() {
            addCriterion("W055_EIPA_MP2 is not null");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp2EqualTo(String value) {
            addCriterion("W055_EIPA_MP2 =", value, "w055EipaMp2");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp2NotEqualTo(String value) {
            addCriterion("W055_EIPA_MP2 <>", value, "w055EipaMp2");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp2GreaterThan(String value) {
            addCriterion("W055_EIPA_MP2 >", value, "w055EipaMp2");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp2GreaterThanOrEqualTo(String value) {
            addCriterion("W055_EIPA_MP2 >=", value, "w055EipaMp2");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp2LessThan(String value) {
            addCriterion("W055_EIPA_MP2 <", value, "w055EipaMp2");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp2LessThanOrEqualTo(String value) {
            addCriterion("W055_EIPA_MP2 <=", value, "w055EipaMp2");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp2Like(String value) {
            addCriterion("W055_EIPA_MP2 like", value, "w055EipaMp2");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp2NotLike(String value) {
            addCriterion("W055_EIPA_MP2 not like", value, "w055EipaMp2");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp2In(List<String> values) {
            addCriterion("W055_EIPA_MP2 in", values, "w055EipaMp2");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp2NotIn(List<String> values) {
            addCriterion("W055_EIPA_MP2 not in", values, "w055EipaMp2");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp2Between(String value1, String value2) {
            addCriterion("W055_EIPA_MP2 between", value1, value2, "w055EipaMp2");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp2NotBetween(String value1, String value2) {
            addCriterion("W055_EIPA_MP2 not between", value1, value2, "w055EipaMp2");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp3IsNull() {
            addCriterion("W055_EIPA_MP3 is null");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp3IsNotNull() {
            addCriterion("W055_EIPA_MP3 is not null");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp3EqualTo(String value) {
            addCriterion("W055_EIPA_MP3 =", value, "w055EipaMp3");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp3NotEqualTo(String value) {
            addCriterion("W055_EIPA_MP3 <>", value, "w055EipaMp3");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp3GreaterThan(String value) {
            addCriterion("W055_EIPA_MP3 >", value, "w055EipaMp3");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp3GreaterThanOrEqualTo(String value) {
            addCriterion("W055_EIPA_MP3 >=", value, "w055EipaMp3");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp3LessThan(String value) {
            addCriterion("W055_EIPA_MP3 <", value, "w055EipaMp3");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp3LessThanOrEqualTo(String value) {
            addCriterion("W055_EIPA_MP3 <=", value, "w055EipaMp3");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp3Like(String value) {
            addCriterion("W055_EIPA_MP3 like", value, "w055EipaMp3");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp3NotLike(String value) {
            addCriterion("W055_EIPA_MP3 not like", value, "w055EipaMp3");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp3In(List<String> values) {
            addCriterion("W055_EIPA_MP3 in", values, "w055EipaMp3");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp3NotIn(List<String> values) {
            addCriterion("W055_EIPA_MP3 not in", values, "w055EipaMp3");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp3Between(String value1, String value2) {
            addCriterion("W055_EIPA_MP3 between", value1, value2, "w055EipaMp3");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp3NotBetween(String value1, String value2) {
            addCriterion("W055_EIPA_MP3 not between", value1, value2, "w055EipaMp3");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp4IsNull() {
            addCriterion("W055_EIPA_MP4 is null");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp4IsNotNull() {
            addCriterion("W055_EIPA_MP4 is not null");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp4EqualTo(String value) {
            addCriterion("W055_EIPA_MP4 =", value, "w055EipaMp4");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp4NotEqualTo(String value) {
            addCriterion("W055_EIPA_MP4 <>", value, "w055EipaMp4");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp4GreaterThan(String value) {
            addCriterion("W055_EIPA_MP4 >", value, "w055EipaMp4");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp4GreaterThanOrEqualTo(String value) {
            addCriterion("W055_EIPA_MP4 >=", value, "w055EipaMp4");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp4LessThan(String value) {
            addCriterion("W055_EIPA_MP4 <", value, "w055EipaMp4");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp4LessThanOrEqualTo(String value) {
            addCriterion("W055_EIPA_MP4 <=", value, "w055EipaMp4");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp4Like(String value) {
            addCriterion("W055_EIPA_MP4 like", value, "w055EipaMp4");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp4NotLike(String value) {
            addCriterion("W055_EIPA_MP4 not like", value, "w055EipaMp4");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp4In(List<String> values) {
            addCriterion("W055_EIPA_MP4 in", values, "w055EipaMp4");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp4NotIn(List<String> values) {
            addCriterion("W055_EIPA_MP4 not in", values, "w055EipaMp4");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp4Between(String value1, String value2) {
            addCriterion("W055_EIPA_MP4 between", value1, value2, "w055EipaMp4");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp4NotBetween(String value1, String value2) {
            addCriterion("W055_EIPA_MP4 not between", value1, value2, "w055EipaMp4");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp5IsNull() {
            addCriterion("W055_EIPA_MP5 is null");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp5IsNotNull() {
            addCriterion("W055_EIPA_MP5 is not null");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp5EqualTo(String value) {
            addCriterion("W055_EIPA_MP5 =", value, "w055EipaMp5");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp5NotEqualTo(String value) {
            addCriterion("W055_EIPA_MP5 <>", value, "w055EipaMp5");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp5GreaterThan(String value) {
            addCriterion("W055_EIPA_MP5 >", value, "w055EipaMp5");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp5GreaterThanOrEqualTo(String value) {
            addCriterion("W055_EIPA_MP5 >=", value, "w055EipaMp5");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp5LessThan(String value) {
            addCriterion("W055_EIPA_MP5 <", value, "w055EipaMp5");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp5LessThanOrEqualTo(String value) {
            addCriterion("W055_EIPA_MP5 <=", value, "w055EipaMp5");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp5Like(String value) {
            addCriterion("W055_EIPA_MP5 like", value, "w055EipaMp5");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp5NotLike(String value) {
            addCriterion("W055_EIPA_MP5 not like", value, "w055EipaMp5");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp5In(List<String> values) {
            addCriterion("W055_EIPA_MP5 in", values, "w055EipaMp5");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp5NotIn(List<String> values) {
            addCriterion("W055_EIPA_MP5 not in", values, "w055EipaMp5");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp5Between(String value1, String value2) {
            addCriterion("W055_EIPA_MP5 between", value1, value2, "w055EipaMp5");
            return (Criteria) this;
        }

        public Criteria andW055EipaMp5NotBetween(String value1, String value2) {
            addCriterion("W055_EIPA_MP5 not between", value1, value2, "w055EipaMp5");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark1IsNull() {
            addCriterion("W055_EIPA_REMARK1 is null");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark1IsNotNull() {
            addCriterion("W055_EIPA_REMARK1 is not null");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark1EqualTo(String value) {
            addCriterion("W055_EIPA_REMARK1 =", value, "w055EipaRemark1");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark1NotEqualTo(String value) {
            addCriterion("W055_EIPA_REMARK1 <>", value, "w055EipaRemark1");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark1GreaterThan(String value) {
            addCriterion("W055_EIPA_REMARK1 >", value, "w055EipaRemark1");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("W055_EIPA_REMARK1 >=", value, "w055EipaRemark1");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark1LessThan(String value) {
            addCriterion("W055_EIPA_REMARK1 <", value, "w055EipaRemark1");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark1LessThanOrEqualTo(String value) {
            addCriterion("W055_EIPA_REMARK1 <=", value, "w055EipaRemark1");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark1Like(String value) {
            addCriterion("W055_EIPA_REMARK1 like", value, "w055EipaRemark1");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark1NotLike(String value) {
            addCriterion("W055_EIPA_REMARK1 not like", value, "w055EipaRemark1");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark1In(List<String> values) {
            addCriterion("W055_EIPA_REMARK1 in", values, "w055EipaRemark1");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark1NotIn(List<String> values) {
            addCriterion("W055_EIPA_REMARK1 not in", values, "w055EipaRemark1");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark1Between(String value1, String value2) {
            addCriterion("W055_EIPA_REMARK1 between", value1, value2, "w055EipaRemark1");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark1NotBetween(String value1, String value2) {
            addCriterion("W055_EIPA_REMARK1 not between", value1, value2, "w055EipaRemark1");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark2IsNull() {
            addCriterion("W055_EIPA_REMARK2 is null");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark2IsNotNull() {
            addCriterion("W055_EIPA_REMARK2 is not null");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark2EqualTo(String value) {
            addCriterion("W055_EIPA_REMARK2 =", value, "w055EipaRemark2");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark2NotEqualTo(String value) {
            addCriterion("W055_EIPA_REMARK2 <>", value, "w055EipaRemark2");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark2GreaterThan(String value) {
            addCriterion("W055_EIPA_REMARK2 >", value, "w055EipaRemark2");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("W055_EIPA_REMARK2 >=", value, "w055EipaRemark2");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark2LessThan(String value) {
            addCriterion("W055_EIPA_REMARK2 <", value, "w055EipaRemark2");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark2LessThanOrEqualTo(String value) {
            addCriterion("W055_EIPA_REMARK2 <=", value, "w055EipaRemark2");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark2Like(String value) {
            addCriterion("W055_EIPA_REMARK2 like", value, "w055EipaRemark2");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark2NotLike(String value) {
            addCriterion("W055_EIPA_REMARK2 not like", value, "w055EipaRemark2");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark2In(List<String> values) {
            addCriterion("W055_EIPA_REMARK2 in", values, "w055EipaRemark2");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark2NotIn(List<String> values) {
            addCriterion("W055_EIPA_REMARK2 not in", values, "w055EipaRemark2");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark2Between(String value1, String value2) {
            addCriterion("W055_EIPA_REMARK2 between", value1, value2, "w055EipaRemark2");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark2NotBetween(String value1, String value2) {
            addCriterion("W055_EIPA_REMARK2 not between", value1, value2, "w055EipaRemark2");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark3IsNull() {
            addCriterion("W055_EIPA_REMARK3 is null");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark3IsNotNull() {
            addCriterion("W055_EIPA_REMARK3 is not null");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark3EqualTo(String value) {
            addCriterion("W055_EIPA_REMARK3 =", value, "w055EipaRemark3");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark3NotEqualTo(String value) {
            addCriterion("W055_EIPA_REMARK3 <>", value, "w055EipaRemark3");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark3GreaterThan(String value) {
            addCriterion("W055_EIPA_REMARK3 >", value, "w055EipaRemark3");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark3GreaterThanOrEqualTo(String value) {
            addCriterion("W055_EIPA_REMARK3 >=", value, "w055EipaRemark3");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark3LessThan(String value) {
            addCriterion("W055_EIPA_REMARK3 <", value, "w055EipaRemark3");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark3LessThanOrEqualTo(String value) {
            addCriterion("W055_EIPA_REMARK3 <=", value, "w055EipaRemark3");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark3Like(String value) {
            addCriterion("W055_EIPA_REMARK3 like", value, "w055EipaRemark3");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark3NotLike(String value) {
            addCriterion("W055_EIPA_REMARK3 not like", value, "w055EipaRemark3");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark3In(List<String> values) {
            addCriterion("W055_EIPA_REMARK3 in", values, "w055EipaRemark3");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark3NotIn(List<String> values) {
            addCriterion("W055_EIPA_REMARK3 not in", values, "w055EipaRemark3");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark3Between(String value1, String value2) {
            addCriterion("W055_EIPA_REMARK3 between", value1, value2, "w055EipaRemark3");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark3NotBetween(String value1, String value2) {
            addCriterion("W055_EIPA_REMARK3 not between", value1, value2, "w055EipaRemark3");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark4IsNull() {
            addCriterion("W055_EIPA_REMARK4 is null");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark4IsNotNull() {
            addCriterion("W055_EIPA_REMARK4 is not null");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark4EqualTo(String value) {
            addCriterion("W055_EIPA_REMARK4 =", value, "w055EipaRemark4");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark4NotEqualTo(String value) {
            addCriterion("W055_EIPA_REMARK4 <>", value, "w055EipaRemark4");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark4GreaterThan(String value) {
            addCriterion("W055_EIPA_REMARK4 >", value, "w055EipaRemark4");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark4GreaterThanOrEqualTo(String value) {
            addCriterion("W055_EIPA_REMARK4 >=", value, "w055EipaRemark4");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark4LessThan(String value) {
            addCriterion("W055_EIPA_REMARK4 <", value, "w055EipaRemark4");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark4LessThanOrEqualTo(String value) {
            addCriterion("W055_EIPA_REMARK4 <=", value, "w055EipaRemark4");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark4Like(String value) {
            addCriterion("W055_EIPA_REMARK4 like", value, "w055EipaRemark4");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark4NotLike(String value) {
            addCriterion("W055_EIPA_REMARK4 not like", value, "w055EipaRemark4");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark4In(List<String> values) {
            addCriterion("W055_EIPA_REMARK4 in", values, "w055EipaRemark4");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark4NotIn(List<String> values) {
            addCriterion("W055_EIPA_REMARK4 not in", values, "w055EipaRemark4");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark4Between(String value1, String value2) {
            addCriterion("W055_EIPA_REMARK4 between", value1, value2, "w055EipaRemark4");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark4NotBetween(String value1, String value2) {
            addCriterion("W055_EIPA_REMARK4 not between", value1, value2, "w055EipaRemark4");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark5IsNull() {
            addCriterion("W055_EIPA_REMARK5 is null");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark5IsNotNull() {
            addCriterion("W055_EIPA_REMARK5 is not null");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark5EqualTo(String value) {
            addCriterion("W055_EIPA_REMARK5 =", value, "w055EipaRemark5");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark5NotEqualTo(String value) {
            addCriterion("W055_EIPA_REMARK5 <>", value, "w055EipaRemark5");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark5GreaterThan(String value) {
            addCriterion("W055_EIPA_REMARK5 >", value, "w055EipaRemark5");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark5GreaterThanOrEqualTo(String value) {
            addCriterion("W055_EIPA_REMARK5 >=", value, "w055EipaRemark5");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark5LessThan(String value) {
            addCriterion("W055_EIPA_REMARK5 <", value, "w055EipaRemark5");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark5LessThanOrEqualTo(String value) {
            addCriterion("W055_EIPA_REMARK5 <=", value, "w055EipaRemark5");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark5Like(String value) {
            addCriterion("W055_EIPA_REMARK5 like", value, "w055EipaRemark5");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark5NotLike(String value) {
            addCriterion("W055_EIPA_REMARK5 not like", value, "w055EipaRemark5");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark5In(List<String> values) {
            addCriterion("W055_EIPA_REMARK5 in", values, "w055EipaRemark5");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark5NotIn(List<String> values) {
            addCriterion("W055_EIPA_REMARK5 not in", values, "w055EipaRemark5");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark5Between(String value1, String value2) {
            addCriterion("W055_EIPA_REMARK5 between", value1, value2, "w055EipaRemark5");
            return (Criteria) this;
        }

        public Criteria andW055EipaRemark5NotBetween(String value1, String value2) {
            addCriterion("W055_EIPA_REMARK5 not between", value1, value2, "w055EipaRemark5");
            return (Criteria) this;
        }

        public Criteria andW061CustRrCategoryIdIsNull() {
            addCriterion("W061_CUST_RR_CATEGORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andW061CustRrCategoryIdIsNotNull() {
            addCriterion("W061_CUST_RR_CATEGORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andW061CustRrCategoryIdEqualTo(String value) {
            addCriterion("W061_CUST_RR_CATEGORY_ID =", value, "w061CustRrCategoryId");
            return (Criteria) this;
        }

        public Criteria andW061CustRrCategoryIdNotEqualTo(String value) {
            addCriterion("W061_CUST_RR_CATEGORY_ID <>", value, "w061CustRrCategoryId");
            return (Criteria) this;
        }

        public Criteria andW061CustRrCategoryIdGreaterThan(String value) {
            addCriterion("W061_CUST_RR_CATEGORY_ID >", value, "w061CustRrCategoryId");
            return (Criteria) this;
        }

        public Criteria andW061CustRrCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("W061_CUST_RR_CATEGORY_ID >=", value, "w061CustRrCategoryId");
            return (Criteria) this;
        }

        public Criteria andW061CustRrCategoryIdLessThan(String value) {
            addCriterion("W061_CUST_RR_CATEGORY_ID <", value, "w061CustRrCategoryId");
            return (Criteria) this;
        }

        public Criteria andW061CustRrCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("W061_CUST_RR_CATEGORY_ID <=", value, "w061CustRrCategoryId");
            return (Criteria) this;
        }

        public Criteria andW061CustRrCategoryIdLike(String value) {
            addCriterion("W061_CUST_RR_CATEGORY_ID like", value, "w061CustRrCategoryId");
            return (Criteria) this;
        }

        public Criteria andW061CustRrCategoryIdNotLike(String value) {
            addCriterion("W061_CUST_RR_CATEGORY_ID not like", value, "w061CustRrCategoryId");
            return (Criteria) this;
        }

        public Criteria andW061CustRrCategoryIdIn(List<String> values) {
            addCriterion("W061_CUST_RR_CATEGORY_ID in", values, "w061CustRrCategoryId");
            return (Criteria) this;
        }

        public Criteria andW061CustRrCategoryIdNotIn(List<String> values) {
            addCriterion("W061_CUST_RR_CATEGORY_ID not in", values, "w061CustRrCategoryId");
            return (Criteria) this;
        }

        public Criteria andW061CustRrCategoryIdBetween(String value1, String value2) {
            addCriterion("W061_CUST_RR_CATEGORY_ID between", value1, value2, "w061CustRrCategoryId");
            return (Criteria) this;
        }

        public Criteria andW061CustRrCategoryIdNotBetween(String value1, String value2) {
            addCriterion("W061_CUST_RR_CATEGORY_ID not between", value1, value2, "w061CustRrCategoryId");
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