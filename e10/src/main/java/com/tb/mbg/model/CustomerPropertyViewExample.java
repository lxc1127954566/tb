package com.tb.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerPropertyViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerPropertyViewExample() {
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

        public Criteria andCustomerPropertyViewIdIsNull() {
            addCriterion("CUSTOMER_PROPERTY_VIEW_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPropertyViewIdIsNotNull() {
            addCriterion("CUSTOMER_PROPERTY_VIEW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPropertyViewIdEqualTo(String value) {
            addCriterion("CUSTOMER_PROPERTY_VIEW_ID =", value, "customerPropertyViewId");
            return (Criteria) this;
        }

        public Criteria andCustomerPropertyViewIdNotEqualTo(String value) {
            addCriterion("CUSTOMER_PROPERTY_VIEW_ID <>", value, "customerPropertyViewId");
            return (Criteria) this;
        }

        public Criteria andCustomerPropertyViewIdGreaterThan(String value) {
            addCriterion("CUSTOMER_PROPERTY_VIEW_ID >", value, "customerPropertyViewId");
            return (Criteria) this;
        }

        public Criteria andCustomerPropertyViewIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_PROPERTY_VIEW_ID >=", value, "customerPropertyViewId");
            return (Criteria) this;
        }

        public Criteria andCustomerPropertyViewIdLessThan(String value) {
            addCriterion("CUSTOMER_PROPERTY_VIEW_ID <", value, "customerPropertyViewId");
            return (Criteria) this;
        }

        public Criteria andCustomerPropertyViewIdLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_PROPERTY_VIEW_ID <=", value, "customerPropertyViewId");
            return (Criteria) this;
        }

        public Criteria andCustomerPropertyViewIdLike(String value) {
            addCriterion("CUSTOMER_PROPERTY_VIEW_ID like", value, "customerPropertyViewId");
            return (Criteria) this;
        }

        public Criteria andCustomerPropertyViewIdNotLike(String value) {
            addCriterion("CUSTOMER_PROPERTY_VIEW_ID not like", value, "customerPropertyViewId");
            return (Criteria) this;
        }

        public Criteria andCustomerPropertyViewIdIn(List<String> values) {
            addCriterion("CUSTOMER_PROPERTY_VIEW_ID in", values, "customerPropertyViewId");
            return (Criteria) this;
        }

        public Criteria andCustomerPropertyViewIdNotIn(List<String> values) {
            addCriterion("CUSTOMER_PROPERTY_VIEW_ID not in", values, "customerPropertyViewId");
            return (Criteria) this;
        }

        public Criteria andCustomerPropertyViewIdBetween(String value1, String value2) {
            addCriterion("CUSTOMER_PROPERTY_VIEW_ID between", value1, value2, "customerPropertyViewId");
            return (Criteria) this;
        }

        public Criteria andCustomerPropertyViewIdNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_PROPERTY_VIEW_ID not between", value1, value2, "customerPropertyViewId");
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

        public Criteria andP1IsNull() {
            addCriterion("P1 is null");
            return (Criteria) this;
        }

        public Criteria andP1IsNotNull() {
            addCriterion("P1 is not null");
            return (Criteria) this;
        }

        public Criteria andP1EqualTo(String value) {
            addCriterion("P1 =", value, "p1");
            return (Criteria) this;
        }

        public Criteria andP1NotEqualTo(String value) {
            addCriterion("P1 <>", value, "p1");
            return (Criteria) this;
        }

        public Criteria andP1GreaterThan(String value) {
            addCriterion("P1 >", value, "p1");
            return (Criteria) this;
        }

        public Criteria andP1GreaterThanOrEqualTo(String value) {
            addCriterion("P1 >=", value, "p1");
            return (Criteria) this;
        }

        public Criteria andP1LessThan(String value) {
            addCriterion("P1 <", value, "p1");
            return (Criteria) this;
        }

        public Criteria andP1LessThanOrEqualTo(String value) {
            addCriterion("P1 <=", value, "p1");
            return (Criteria) this;
        }

        public Criteria andP1Like(String value) {
            addCriterion("P1 like", value, "p1");
            return (Criteria) this;
        }

        public Criteria andP1NotLike(String value) {
            addCriterion("P1 not like", value, "p1");
            return (Criteria) this;
        }

        public Criteria andP1In(List<String> values) {
            addCriterion("P1 in", values, "p1");
            return (Criteria) this;
        }

        public Criteria andP1NotIn(List<String> values) {
            addCriterion("P1 not in", values, "p1");
            return (Criteria) this;
        }

        public Criteria andP1Between(String value1, String value2) {
            addCriterion("P1 between", value1, value2, "p1");
            return (Criteria) this;
        }

        public Criteria andP1NotBetween(String value1, String value2) {
            addCriterion("P1 not between", value1, value2, "p1");
            return (Criteria) this;
        }

        public Criteria andP2IsNull() {
            addCriterion("P2 is null");
            return (Criteria) this;
        }

        public Criteria andP2IsNotNull() {
            addCriterion("P2 is not null");
            return (Criteria) this;
        }

        public Criteria andP2EqualTo(String value) {
            addCriterion("P2 =", value, "p2");
            return (Criteria) this;
        }

        public Criteria andP2NotEqualTo(String value) {
            addCriterion("P2 <>", value, "p2");
            return (Criteria) this;
        }

        public Criteria andP2GreaterThan(String value) {
            addCriterion("P2 >", value, "p2");
            return (Criteria) this;
        }

        public Criteria andP2GreaterThanOrEqualTo(String value) {
            addCriterion("P2 >=", value, "p2");
            return (Criteria) this;
        }

        public Criteria andP2LessThan(String value) {
            addCriterion("P2 <", value, "p2");
            return (Criteria) this;
        }

        public Criteria andP2LessThanOrEqualTo(String value) {
            addCriterion("P2 <=", value, "p2");
            return (Criteria) this;
        }

        public Criteria andP2Like(String value) {
            addCriterion("P2 like", value, "p2");
            return (Criteria) this;
        }

        public Criteria andP2NotLike(String value) {
            addCriterion("P2 not like", value, "p2");
            return (Criteria) this;
        }

        public Criteria andP2In(List<String> values) {
            addCriterion("P2 in", values, "p2");
            return (Criteria) this;
        }

        public Criteria andP2NotIn(List<String> values) {
            addCriterion("P2 not in", values, "p2");
            return (Criteria) this;
        }

        public Criteria andP2Between(String value1, String value2) {
            addCriterion("P2 between", value1, value2, "p2");
            return (Criteria) this;
        }

        public Criteria andP2NotBetween(String value1, String value2) {
            addCriterion("P2 not between", value1, value2, "p2");
            return (Criteria) this;
        }

        public Criteria andP3IsNull() {
            addCriterion("P3 is null");
            return (Criteria) this;
        }

        public Criteria andP3IsNotNull() {
            addCriterion("P3 is not null");
            return (Criteria) this;
        }

        public Criteria andP3EqualTo(String value) {
            addCriterion("P3 =", value, "p3");
            return (Criteria) this;
        }

        public Criteria andP3NotEqualTo(String value) {
            addCriterion("P3 <>", value, "p3");
            return (Criteria) this;
        }

        public Criteria andP3GreaterThan(String value) {
            addCriterion("P3 >", value, "p3");
            return (Criteria) this;
        }

        public Criteria andP3GreaterThanOrEqualTo(String value) {
            addCriterion("P3 >=", value, "p3");
            return (Criteria) this;
        }

        public Criteria andP3LessThan(String value) {
            addCriterion("P3 <", value, "p3");
            return (Criteria) this;
        }

        public Criteria andP3LessThanOrEqualTo(String value) {
            addCriterion("P3 <=", value, "p3");
            return (Criteria) this;
        }

        public Criteria andP3Like(String value) {
            addCriterion("P3 like", value, "p3");
            return (Criteria) this;
        }

        public Criteria andP3NotLike(String value) {
            addCriterion("P3 not like", value, "p3");
            return (Criteria) this;
        }

        public Criteria andP3In(List<String> values) {
            addCriterion("P3 in", values, "p3");
            return (Criteria) this;
        }

        public Criteria andP3NotIn(List<String> values) {
            addCriterion("P3 not in", values, "p3");
            return (Criteria) this;
        }

        public Criteria andP3Between(String value1, String value2) {
            addCriterion("P3 between", value1, value2, "p3");
            return (Criteria) this;
        }

        public Criteria andP3NotBetween(String value1, String value2) {
            addCriterion("P3 not between", value1, value2, "p3");
            return (Criteria) this;
        }

        public Criteria andP4IsNull() {
            addCriterion("P4 is null");
            return (Criteria) this;
        }

        public Criteria andP4IsNotNull() {
            addCriterion("P4 is not null");
            return (Criteria) this;
        }

        public Criteria andP4EqualTo(String value) {
            addCriterion("P4 =", value, "p4");
            return (Criteria) this;
        }

        public Criteria andP4NotEqualTo(String value) {
            addCriterion("P4 <>", value, "p4");
            return (Criteria) this;
        }

        public Criteria andP4GreaterThan(String value) {
            addCriterion("P4 >", value, "p4");
            return (Criteria) this;
        }

        public Criteria andP4GreaterThanOrEqualTo(String value) {
            addCriterion("P4 >=", value, "p4");
            return (Criteria) this;
        }

        public Criteria andP4LessThan(String value) {
            addCriterion("P4 <", value, "p4");
            return (Criteria) this;
        }

        public Criteria andP4LessThanOrEqualTo(String value) {
            addCriterion("P4 <=", value, "p4");
            return (Criteria) this;
        }

        public Criteria andP4Like(String value) {
            addCriterion("P4 like", value, "p4");
            return (Criteria) this;
        }

        public Criteria andP4NotLike(String value) {
            addCriterion("P4 not like", value, "p4");
            return (Criteria) this;
        }

        public Criteria andP4In(List<String> values) {
            addCriterion("P4 in", values, "p4");
            return (Criteria) this;
        }

        public Criteria andP4NotIn(List<String> values) {
            addCriterion("P4 not in", values, "p4");
            return (Criteria) this;
        }

        public Criteria andP4Between(String value1, String value2) {
            addCriterion("P4 between", value1, value2, "p4");
            return (Criteria) this;
        }

        public Criteria andP4NotBetween(String value1, String value2) {
            addCriterion("P4 not between", value1, value2, "p4");
            return (Criteria) this;
        }

        public Criteria andP5IsNull() {
            addCriterion("P5 is null");
            return (Criteria) this;
        }

        public Criteria andP5IsNotNull() {
            addCriterion("P5 is not null");
            return (Criteria) this;
        }

        public Criteria andP5EqualTo(String value) {
            addCriterion("P5 =", value, "p5");
            return (Criteria) this;
        }

        public Criteria andP5NotEqualTo(String value) {
            addCriterion("P5 <>", value, "p5");
            return (Criteria) this;
        }

        public Criteria andP5GreaterThan(String value) {
            addCriterion("P5 >", value, "p5");
            return (Criteria) this;
        }

        public Criteria andP5GreaterThanOrEqualTo(String value) {
            addCriterion("P5 >=", value, "p5");
            return (Criteria) this;
        }

        public Criteria andP5LessThan(String value) {
            addCriterion("P5 <", value, "p5");
            return (Criteria) this;
        }

        public Criteria andP5LessThanOrEqualTo(String value) {
            addCriterion("P5 <=", value, "p5");
            return (Criteria) this;
        }

        public Criteria andP5Like(String value) {
            addCriterion("P5 like", value, "p5");
            return (Criteria) this;
        }

        public Criteria andP5NotLike(String value) {
            addCriterion("P5 not like", value, "p5");
            return (Criteria) this;
        }

        public Criteria andP5In(List<String> values) {
            addCriterion("P5 in", values, "p5");
            return (Criteria) this;
        }

        public Criteria andP5NotIn(List<String> values) {
            addCriterion("P5 not in", values, "p5");
            return (Criteria) this;
        }

        public Criteria andP5Between(String value1, String value2) {
            addCriterion("P5 between", value1, value2, "p5");
            return (Criteria) this;
        }

        public Criteria andP5NotBetween(String value1, String value2) {
            addCriterion("P5 not between", value1, value2, "p5");
            return (Criteria) this;
        }

        public Criteria andP6IsNull() {
            addCriterion("P6 is null");
            return (Criteria) this;
        }

        public Criteria andP6IsNotNull() {
            addCriterion("P6 is not null");
            return (Criteria) this;
        }

        public Criteria andP6EqualTo(String value) {
            addCriterion("P6 =", value, "p6");
            return (Criteria) this;
        }

        public Criteria andP6NotEqualTo(String value) {
            addCriterion("P6 <>", value, "p6");
            return (Criteria) this;
        }

        public Criteria andP6GreaterThan(String value) {
            addCriterion("P6 >", value, "p6");
            return (Criteria) this;
        }

        public Criteria andP6GreaterThanOrEqualTo(String value) {
            addCriterion("P6 >=", value, "p6");
            return (Criteria) this;
        }

        public Criteria andP6LessThan(String value) {
            addCriterion("P6 <", value, "p6");
            return (Criteria) this;
        }

        public Criteria andP6LessThanOrEqualTo(String value) {
            addCriterion("P6 <=", value, "p6");
            return (Criteria) this;
        }

        public Criteria andP6Like(String value) {
            addCriterion("P6 like", value, "p6");
            return (Criteria) this;
        }

        public Criteria andP6NotLike(String value) {
            addCriterion("P6 not like", value, "p6");
            return (Criteria) this;
        }

        public Criteria andP6In(List<String> values) {
            addCriterion("P6 in", values, "p6");
            return (Criteria) this;
        }

        public Criteria andP6NotIn(List<String> values) {
            addCriterion("P6 not in", values, "p6");
            return (Criteria) this;
        }

        public Criteria andP6Between(String value1, String value2) {
            addCriterion("P6 between", value1, value2, "p6");
            return (Criteria) this;
        }

        public Criteria andP6NotBetween(String value1, String value2) {
            addCriterion("P6 not between", value1, value2, "p6");
            return (Criteria) this;
        }

        public Criteria andP7IsNull() {
            addCriterion("P7 is null");
            return (Criteria) this;
        }

        public Criteria andP7IsNotNull() {
            addCriterion("P7 is not null");
            return (Criteria) this;
        }

        public Criteria andP7EqualTo(String value) {
            addCriterion("P7 =", value, "p7");
            return (Criteria) this;
        }

        public Criteria andP7NotEqualTo(String value) {
            addCriterion("P7 <>", value, "p7");
            return (Criteria) this;
        }

        public Criteria andP7GreaterThan(String value) {
            addCriterion("P7 >", value, "p7");
            return (Criteria) this;
        }

        public Criteria andP7GreaterThanOrEqualTo(String value) {
            addCriterion("P7 >=", value, "p7");
            return (Criteria) this;
        }

        public Criteria andP7LessThan(String value) {
            addCriterion("P7 <", value, "p7");
            return (Criteria) this;
        }

        public Criteria andP7LessThanOrEqualTo(String value) {
            addCriterion("P7 <=", value, "p7");
            return (Criteria) this;
        }

        public Criteria andP7Like(String value) {
            addCriterion("P7 like", value, "p7");
            return (Criteria) this;
        }

        public Criteria andP7NotLike(String value) {
            addCriterion("P7 not like", value, "p7");
            return (Criteria) this;
        }

        public Criteria andP7In(List<String> values) {
            addCriterion("P7 in", values, "p7");
            return (Criteria) this;
        }

        public Criteria andP7NotIn(List<String> values) {
            addCriterion("P7 not in", values, "p7");
            return (Criteria) this;
        }

        public Criteria andP7Between(String value1, String value2) {
            addCriterion("P7 between", value1, value2, "p7");
            return (Criteria) this;
        }

        public Criteria andP7NotBetween(String value1, String value2) {
            addCriterion("P7 not between", value1, value2, "p7");
            return (Criteria) this;
        }

        public Criteria andP8IsNull() {
            addCriterion("P8 is null");
            return (Criteria) this;
        }

        public Criteria andP8IsNotNull() {
            addCriterion("P8 is not null");
            return (Criteria) this;
        }

        public Criteria andP8EqualTo(String value) {
            addCriterion("P8 =", value, "p8");
            return (Criteria) this;
        }

        public Criteria andP8NotEqualTo(String value) {
            addCriterion("P8 <>", value, "p8");
            return (Criteria) this;
        }

        public Criteria andP8GreaterThan(String value) {
            addCriterion("P8 >", value, "p8");
            return (Criteria) this;
        }

        public Criteria andP8GreaterThanOrEqualTo(String value) {
            addCriterion("P8 >=", value, "p8");
            return (Criteria) this;
        }

        public Criteria andP8LessThan(String value) {
            addCriterion("P8 <", value, "p8");
            return (Criteria) this;
        }

        public Criteria andP8LessThanOrEqualTo(String value) {
            addCriterion("P8 <=", value, "p8");
            return (Criteria) this;
        }

        public Criteria andP8Like(String value) {
            addCriterion("P8 like", value, "p8");
            return (Criteria) this;
        }

        public Criteria andP8NotLike(String value) {
            addCriterion("P8 not like", value, "p8");
            return (Criteria) this;
        }

        public Criteria andP8In(List<String> values) {
            addCriterion("P8 in", values, "p8");
            return (Criteria) this;
        }

        public Criteria andP8NotIn(List<String> values) {
            addCriterion("P8 not in", values, "p8");
            return (Criteria) this;
        }

        public Criteria andP8Between(String value1, String value2) {
            addCriterion("P8 between", value1, value2, "p8");
            return (Criteria) this;
        }

        public Criteria andP8NotBetween(String value1, String value2) {
            addCriterion("P8 not between", value1, value2, "p8");
            return (Criteria) this;
        }

        public Criteria andP9IsNull() {
            addCriterion("P9 is null");
            return (Criteria) this;
        }

        public Criteria andP9IsNotNull() {
            addCriterion("P9 is not null");
            return (Criteria) this;
        }

        public Criteria andP9EqualTo(String value) {
            addCriterion("P9 =", value, "p9");
            return (Criteria) this;
        }

        public Criteria andP9NotEqualTo(String value) {
            addCriterion("P9 <>", value, "p9");
            return (Criteria) this;
        }

        public Criteria andP9GreaterThan(String value) {
            addCriterion("P9 >", value, "p9");
            return (Criteria) this;
        }

        public Criteria andP9GreaterThanOrEqualTo(String value) {
            addCriterion("P9 >=", value, "p9");
            return (Criteria) this;
        }

        public Criteria andP9LessThan(String value) {
            addCriterion("P9 <", value, "p9");
            return (Criteria) this;
        }

        public Criteria andP9LessThanOrEqualTo(String value) {
            addCriterion("P9 <=", value, "p9");
            return (Criteria) this;
        }

        public Criteria andP9Like(String value) {
            addCriterion("P9 like", value, "p9");
            return (Criteria) this;
        }

        public Criteria andP9NotLike(String value) {
            addCriterion("P9 not like", value, "p9");
            return (Criteria) this;
        }

        public Criteria andP9In(List<String> values) {
            addCriterion("P9 in", values, "p9");
            return (Criteria) this;
        }

        public Criteria andP9NotIn(List<String> values) {
            addCriterion("P9 not in", values, "p9");
            return (Criteria) this;
        }

        public Criteria andP9Between(String value1, String value2) {
            addCriterion("P9 between", value1, value2, "p9");
            return (Criteria) this;
        }

        public Criteria andP9NotBetween(String value1, String value2) {
            addCriterion("P9 not between", value1, value2, "p9");
            return (Criteria) this;
        }

        public Criteria andP10IsNull() {
            addCriterion("P10 is null");
            return (Criteria) this;
        }

        public Criteria andP10IsNotNull() {
            addCriterion("P10 is not null");
            return (Criteria) this;
        }

        public Criteria andP10EqualTo(String value) {
            addCriterion("P10 =", value, "p10");
            return (Criteria) this;
        }

        public Criteria andP10NotEqualTo(String value) {
            addCriterion("P10 <>", value, "p10");
            return (Criteria) this;
        }

        public Criteria andP10GreaterThan(String value) {
            addCriterion("P10 >", value, "p10");
            return (Criteria) this;
        }

        public Criteria andP10GreaterThanOrEqualTo(String value) {
            addCriterion("P10 >=", value, "p10");
            return (Criteria) this;
        }

        public Criteria andP10LessThan(String value) {
            addCriterion("P10 <", value, "p10");
            return (Criteria) this;
        }

        public Criteria andP10LessThanOrEqualTo(String value) {
            addCriterion("P10 <=", value, "p10");
            return (Criteria) this;
        }

        public Criteria andP10Like(String value) {
            addCriterion("P10 like", value, "p10");
            return (Criteria) this;
        }

        public Criteria andP10NotLike(String value) {
            addCriterion("P10 not like", value, "p10");
            return (Criteria) this;
        }

        public Criteria andP10In(List<String> values) {
            addCriterion("P10 in", values, "p10");
            return (Criteria) this;
        }

        public Criteria andP10NotIn(List<String> values) {
            addCriterion("P10 not in", values, "p10");
            return (Criteria) this;
        }

        public Criteria andP10Between(String value1, String value2) {
            addCriterion("P10 between", value1, value2, "p10");
            return (Criteria) this;
        }

        public Criteria andP10NotBetween(String value1, String value2) {
            addCriterion("P10 not between", value1, value2, "p10");
            return (Criteria) this;
        }

        public Criteria andP11IsNull() {
            addCriterion("P11 is null");
            return (Criteria) this;
        }

        public Criteria andP11IsNotNull() {
            addCriterion("P11 is not null");
            return (Criteria) this;
        }

        public Criteria andP11EqualTo(String value) {
            addCriterion("P11 =", value, "p11");
            return (Criteria) this;
        }

        public Criteria andP11NotEqualTo(String value) {
            addCriterion("P11 <>", value, "p11");
            return (Criteria) this;
        }

        public Criteria andP11GreaterThan(String value) {
            addCriterion("P11 >", value, "p11");
            return (Criteria) this;
        }

        public Criteria andP11GreaterThanOrEqualTo(String value) {
            addCriterion("P11 >=", value, "p11");
            return (Criteria) this;
        }

        public Criteria andP11LessThan(String value) {
            addCriterion("P11 <", value, "p11");
            return (Criteria) this;
        }

        public Criteria andP11LessThanOrEqualTo(String value) {
            addCriterion("P11 <=", value, "p11");
            return (Criteria) this;
        }

        public Criteria andP11Like(String value) {
            addCriterion("P11 like", value, "p11");
            return (Criteria) this;
        }

        public Criteria andP11NotLike(String value) {
            addCriterion("P11 not like", value, "p11");
            return (Criteria) this;
        }

        public Criteria andP11In(List<String> values) {
            addCriterion("P11 in", values, "p11");
            return (Criteria) this;
        }

        public Criteria andP11NotIn(List<String> values) {
            addCriterion("P11 not in", values, "p11");
            return (Criteria) this;
        }

        public Criteria andP11Between(String value1, String value2) {
            addCriterion("P11 between", value1, value2, "p11");
            return (Criteria) this;
        }

        public Criteria andP11NotBetween(String value1, String value2) {
            addCriterion("P11 not between", value1, value2, "p11");
            return (Criteria) this;
        }

        public Criteria andP12IsNull() {
            addCriterion("P12 is null");
            return (Criteria) this;
        }

        public Criteria andP12IsNotNull() {
            addCriterion("P12 is not null");
            return (Criteria) this;
        }

        public Criteria andP12EqualTo(String value) {
            addCriterion("P12 =", value, "p12");
            return (Criteria) this;
        }

        public Criteria andP12NotEqualTo(String value) {
            addCriterion("P12 <>", value, "p12");
            return (Criteria) this;
        }

        public Criteria andP12GreaterThan(String value) {
            addCriterion("P12 >", value, "p12");
            return (Criteria) this;
        }

        public Criteria andP12GreaterThanOrEqualTo(String value) {
            addCriterion("P12 >=", value, "p12");
            return (Criteria) this;
        }

        public Criteria andP12LessThan(String value) {
            addCriterion("P12 <", value, "p12");
            return (Criteria) this;
        }

        public Criteria andP12LessThanOrEqualTo(String value) {
            addCriterion("P12 <=", value, "p12");
            return (Criteria) this;
        }

        public Criteria andP12Like(String value) {
            addCriterion("P12 like", value, "p12");
            return (Criteria) this;
        }

        public Criteria andP12NotLike(String value) {
            addCriterion("P12 not like", value, "p12");
            return (Criteria) this;
        }

        public Criteria andP12In(List<String> values) {
            addCriterion("P12 in", values, "p12");
            return (Criteria) this;
        }

        public Criteria andP12NotIn(List<String> values) {
            addCriterion("P12 not in", values, "p12");
            return (Criteria) this;
        }

        public Criteria andP12Between(String value1, String value2) {
            addCriterion("P12 between", value1, value2, "p12");
            return (Criteria) this;
        }

        public Criteria andP12NotBetween(String value1, String value2) {
            addCriterion("P12 not between", value1, value2, "p12");
            return (Criteria) this;
        }

        public Criteria andP13IsNull() {
            addCriterion("P13 is null");
            return (Criteria) this;
        }

        public Criteria andP13IsNotNull() {
            addCriterion("P13 is not null");
            return (Criteria) this;
        }

        public Criteria andP13EqualTo(String value) {
            addCriterion("P13 =", value, "p13");
            return (Criteria) this;
        }

        public Criteria andP13NotEqualTo(String value) {
            addCriterion("P13 <>", value, "p13");
            return (Criteria) this;
        }

        public Criteria andP13GreaterThan(String value) {
            addCriterion("P13 >", value, "p13");
            return (Criteria) this;
        }

        public Criteria andP13GreaterThanOrEqualTo(String value) {
            addCriterion("P13 >=", value, "p13");
            return (Criteria) this;
        }

        public Criteria andP13LessThan(String value) {
            addCriterion("P13 <", value, "p13");
            return (Criteria) this;
        }

        public Criteria andP13LessThanOrEqualTo(String value) {
            addCriterion("P13 <=", value, "p13");
            return (Criteria) this;
        }

        public Criteria andP13Like(String value) {
            addCriterion("P13 like", value, "p13");
            return (Criteria) this;
        }

        public Criteria andP13NotLike(String value) {
            addCriterion("P13 not like", value, "p13");
            return (Criteria) this;
        }

        public Criteria andP13In(List<String> values) {
            addCriterion("P13 in", values, "p13");
            return (Criteria) this;
        }

        public Criteria andP13NotIn(List<String> values) {
            addCriterion("P13 not in", values, "p13");
            return (Criteria) this;
        }

        public Criteria andP13Between(String value1, String value2) {
            addCriterion("P13 between", value1, value2, "p13");
            return (Criteria) this;
        }

        public Criteria andP13NotBetween(String value1, String value2) {
            addCriterion("P13 not between", value1, value2, "p13");
            return (Criteria) this;
        }

        public Criteria andP14IsNull() {
            addCriterion("P14 is null");
            return (Criteria) this;
        }

        public Criteria andP14IsNotNull() {
            addCriterion("P14 is not null");
            return (Criteria) this;
        }

        public Criteria andP14EqualTo(String value) {
            addCriterion("P14 =", value, "p14");
            return (Criteria) this;
        }

        public Criteria andP14NotEqualTo(String value) {
            addCriterion("P14 <>", value, "p14");
            return (Criteria) this;
        }

        public Criteria andP14GreaterThan(String value) {
            addCriterion("P14 >", value, "p14");
            return (Criteria) this;
        }

        public Criteria andP14GreaterThanOrEqualTo(String value) {
            addCriterion("P14 >=", value, "p14");
            return (Criteria) this;
        }

        public Criteria andP14LessThan(String value) {
            addCriterion("P14 <", value, "p14");
            return (Criteria) this;
        }

        public Criteria andP14LessThanOrEqualTo(String value) {
            addCriterion("P14 <=", value, "p14");
            return (Criteria) this;
        }

        public Criteria andP14Like(String value) {
            addCriterion("P14 like", value, "p14");
            return (Criteria) this;
        }

        public Criteria andP14NotLike(String value) {
            addCriterion("P14 not like", value, "p14");
            return (Criteria) this;
        }

        public Criteria andP14In(List<String> values) {
            addCriterion("P14 in", values, "p14");
            return (Criteria) this;
        }

        public Criteria andP14NotIn(List<String> values) {
            addCriterion("P14 not in", values, "p14");
            return (Criteria) this;
        }

        public Criteria andP14Between(String value1, String value2) {
            addCriterion("P14 between", value1, value2, "p14");
            return (Criteria) this;
        }

        public Criteria andP14NotBetween(String value1, String value2) {
            addCriterion("P14 not between", value1, value2, "p14");
            return (Criteria) this;
        }

        public Criteria andP15IsNull() {
            addCriterion("P15 is null");
            return (Criteria) this;
        }

        public Criteria andP15IsNotNull() {
            addCriterion("P15 is not null");
            return (Criteria) this;
        }

        public Criteria andP15EqualTo(String value) {
            addCriterion("P15 =", value, "p15");
            return (Criteria) this;
        }

        public Criteria andP15NotEqualTo(String value) {
            addCriterion("P15 <>", value, "p15");
            return (Criteria) this;
        }

        public Criteria andP15GreaterThan(String value) {
            addCriterion("P15 >", value, "p15");
            return (Criteria) this;
        }

        public Criteria andP15GreaterThanOrEqualTo(String value) {
            addCriterion("P15 >=", value, "p15");
            return (Criteria) this;
        }

        public Criteria andP15LessThan(String value) {
            addCriterion("P15 <", value, "p15");
            return (Criteria) this;
        }

        public Criteria andP15LessThanOrEqualTo(String value) {
            addCriterion("P15 <=", value, "p15");
            return (Criteria) this;
        }

        public Criteria andP15Like(String value) {
            addCriterion("P15 like", value, "p15");
            return (Criteria) this;
        }

        public Criteria andP15NotLike(String value) {
            addCriterion("P15 not like", value, "p15");
            return (Criteria) this;
        }

        public Criteria andP15In(List<String> values) {
            addCriterion("P15 in", values, "p15");
            return (Criteria) this;
        }

        public Criteria andP15NotIn(List<String> values) {
            addCriterion("P15 not in", values, "p15");
            return (Criteria) this;
        }

        public Criteria andP15Between(String value1, String value2) {
            addCriterion("P15 between", value1, value2, "p15");
            return (Criteria) this;
        }

        public Criteria andP15NotBetween(String value1, String value2) {
            addCriterion("P15 not between", value1, value2, "p15");
            return (Criteria) this;
        }

        public Criteria andP16IsNull() {
            addCriterion("P16 is null");
            return (Criteria) this;
        }

        public Criteria andP16IsNotNull() {
            addCriterion("P16 is not null");
            return (Criteria) this;
        }

        public Criteria andP16EqualTo(String value) {
            addCriterion("P16 =", value, "p16");
            return (Criteria) this;
        }

        public Criteria andP16NotEqualTo(String value) {
            addCriterion("P16 <>", value, "p16");
            return (Criteria) this;
        }

        public Criteria andP16GreaterThan(String value) {
            addCriterion("P16 >", value, "p16");
            return (Criteria) this;
        }

        public Criteria andP16GreaterThanOrEqualTo(String value) {
            addCriterion("P16 >=", value, "p16");
            return (Criteria) this;
        }

        public Criteria andP16LessThan(String value) {
            addCriterion("P16 <", value, "p16");
            return (Criteria) this;
        }

        public Criteria andP16LessThanOrEqualTo(String value) {
            addCriterion("P16 <=", value, "p16");
            return (Criteria) this;
        }

        public Criteria andP16Like(String value) {
            addCriterion("P16 like", value, "p16");
            return (Criteria) this;
        }

        public Criteria andP16NotLike(String value) {
            addCriterion("P16 not like", value, "p16");
            return (Criteria) this;
        }

        public Criteria andP16In(List<String> values) {
            addCriterion("P16 in", values, "p16");
            return (Criteria) this;
        }

        public Criteria andP16NotIn(List<String> values) {
            addCriterion("P16 not in", values, "p16");
            return (Criteria) this;
        }

        public Criteria andP16Between(String value1, String value2) {
            addCriterion("P16 between", value1, value2, "p16");
            return (Criteria) this;
        }

        public Criteria andP16NotBetween(String value1, String value2) {
            addCriterion("P16 not between", value1, value2, "p16");
            return (Criteria) this;
        }

        public Criteria andP17IsNull() {
            addCriterion("P17 is null");
            return (Criteria) this;
        }

        public Criteria andP17IsNotNull() {
            addCriterion("P17 is not null");
            return (Criteria) this;
        }

        public Criteria andP17EqualTo(String value) {
            addCriterion("P17 =", value, "p17");
            return (Criteria) this;
        }

        public Criteria andP17NotEqualTo(String value) {
            addCriterion("P17 <>", value, "p17");
            return (Criteria) this;
        }

        public Criteria andP17GreaterThan(String value) {
            addCriterion("P17 >", value, "p17");
            return (Criteria) this;
        }

        public Criteria andP17GreaterThanOrEqualTo(String value) {
            addCriterion("P17 >=", value, "p17");
            return (Criteria) this;
        }

        public Criteria andP17LessThan(String value) {
            addCriterion("P17 <", value, "p17");
            return (Criteria) this;
        }

        public Criteria andP17LessThanOrEqualTo(String value) {
            addCriterion("P17 <=", value, "p17");
            return (Criteria) this;
        }

        public Criteria andP17Like(String value) {
            addCriterion("P17 like", value, "p17");
            return (Criteria) this;
        }

        public Criteria andP17NotLike(String value) {
            addCriterion("P17 not like", value, "p17");
            return (Criteria) this;
        }

        public Criteria andP17In(List<String> values) {
            addCriterion("P17 in", values, "p17");
            return (Criteria) this;
        }

        public Criteria andP17NotIn(List<String> values) {
            addCriterion("P17 not in", values, "p17");
            return (Criteria) this;
        }

        public Criteria andP17Between(String value1, String value2) {
            addCriterion("P17 between", value1, value2, "p17");
            return (Criteria) this;
        }

        public Criteria andP17NotBetween(String value1, String value2) {
            addCriterion("P17 not between", value1, value2, "p17");
            return (Criteria) this;
        }

        public Criteria andP18IsNull() {
            addCriterion("P18 is null");
            return (Criteria) this;
        }

        public Criteria andP18IsNotNull() {
            addCriterion("P18 is not null");
            return (Criteria) this;
        }

        public Criteria andP18EqualTo(String value) {
            addCriterion("P18 =", value, "p18");
            return (Criteria) this;
        }

        public Criteria andP18NotEqualTo(String value) {
            addCriterion("P18 <>", value, "p18");
            return (Criteria) this;
        }

        public Criteria andP18GreaterThan(String value) {
            addCriterion("P18 >", value, "p18");
            return (Criteria) this;
        }

        public Criteria andP18GreaterThanOrEqualTo(String value) {
            addCriterion("P18 >=", value, "p18");
            return (Criteria) this;
        }

        public Criteria andP18LessThan(String value) {
            addCriterion("P18 <", value, "p18");
            return (Criteria) this;
        }

        public Criteria andP18LessThanOrEqualTo(String value) {
            addCriterion("P18 <=", value, "p18");
            return (Criteria) this;
        }

        public Criteria andP18Like(String value) {
            addCriterion("P18 like", value, "p18");
            return (Criteria) this;
        }

        public Criteria andP18NotLike(String value) {
            addCriterion("P18 not like", value, "p18");
            return (Criteria) this;
        }

        public Criteria andP18In(List<String> values) {
            addCriterion("P18 in", values, "p18");
            return (Criteria) this;
        }

        public Criteria andP18NotIn(List<String> values) {
            addCriterion("P18 not in", values, "p18");
            return (Criteria) this;
        }

        public Criteria andP18Between(String value1, String value2) {
            addCriterion("P18 between", value1, value2, "p18");
            return (Criteria) this;
        }

        public Criteria andP18NotBetween(String value1, String value2) {
            addCriterion("P18 not between", value1, value2, "p18");
            return (Criteria) this;
        }

        public Criteria andP19IsNull() {
            addCriterion("P19 is null");
            return (Criteria) this;
        }

        public Criteria andP19IsNotNull() {
            addCriterion("P19 is not null");
            return (Criteria) this;
        }

        public Criteria andP19EqualTo(String value) {
            addCriterion("P19 =", value, "p19");
            return (Criteria) this;
        }

        public Criteria andP19NotEqualTo(String value) {
            addCriterion("P19 <>", value, "p19");
            return (Criteria) this;
        }

        public Criteria andP19GreaterThan(String value) {
            addCriterion("P19 >", value, "p19");
            return (Criteria) this;
        }

        public Criteria andP19GreaterThanOrEqualTo(String value) {
            addCriterion("P19 >=", value, "p19");
            return (Criteria) this;
        }

        public Criteria andP19LessThan(String value) {
            addCriterion("P19 <", value, "p19");
            return (Criteria) this;
        }

        public Criteria andP19LessThanOrEqualTo(String value) {
            addCriterion("P19 <=", value, "p19");
            return (Criteria) this;
        }

        public Criteria andP19Like(String value) {
            addCriterion("P19 like", value, "p19");
            return (Criteria) this;
        }

        public Criteria andP19NotLike(String value) {
            addCriterion("P19 not like", value, "p19");
            return (Criteria) this;
        }

        public Criteria andP19In(List<String> values) {
            addCriterion("P19 in", values, "p19");
            return (Criteria) this;
        }

        public Criteria andP19NotIn(List<String> values) {
            addCriterion("P19 not in", values, "p19");
            return (Criteria) this;
        }

        public Criteria andP19Between(String value1, String value2) {
            addCriterion("P19 between", value1, value2, "p19");
            return (Criteria) this;
        }

        public Criteria andP19NotBetween(String value1, String value2) {
            addCriterion("P19 not between", value1, value2, "p19");
            return (Criteria) this;
        }

        public Criteria andP20IsNull() {
            addCriterion("P20 is null");
            return (Criteria) this;
        }

        public Criteria andP20IsNotNull() {
            addCriterion("P20 is not null");
            return (Criteria) this;
        }

        public Criteria andP20EqualTo(String value) {
            addCriterion("P20 =", value, "p20");
            return (Criteria) this;
        }

        public Criteria andP20NotEqualTo(String value) {
            addCriterion("P20 <>", value, "p20");
            return (Criteria) this;
        }

        public Criteria andP20GreaterThan(String value) {
            addCriterion("P20 >", value, "p20");
            return (Criteria) this;
        }

        public Criteria andP20GreaterThanOrEqualTo(String value) {
            addCriterion("P20 >=", value, "p20");
            return (Criteria) this;
        }

        public Criteria andP20LessThan(String value) {
            addCriterion("P20 <", value, "p20");
            return (Criteria) this;
        }

        public Criteria andP20LessThanOrEqualTo(String value) {
            addCriterion("P20 <=", value, "p20");
            return (Criteria) this;
        }

        public Criteria andP20Like(String value) {
            addCriterion("P20 like", value, "p20");
            return (Criteria) this;
        }

        public Criteria andP20NotLike(String value) {
            addCriterion("P20 not like", value, "p20");
            return (Criteria) this;
        }

        public Criteria andP20In(List<String> values) {
            addCriterion("P20 in", values, "p20");
            return (Criteria) this;
        }

        public Criteria andP20NotIn(List<String> values) {
            addCriterion("P20 not in", values, "p20");
            return (Criteria) this;
        }

        public Criteria andP20Between(String value1, String value2) {
            addCriterion("P20 between", value1, value2, "p20");
            return (Criteria) this;
        }

        public Criteria andP20NotBetween(String value1, String value2) {
            addCriterion("P20 not between", value1, value2, "p20");
            return (Criteria) this;
        }

        public Criteria andP21IsNull() {
            addCriterion("P21 is null");
            return (Criteria) this;
        }

        public Criteria andP21IsNotNull() {
            addCriterion("P21 is not null");
            return (Criteria) this;
        }

        public Criteria andP21EqualTo(String value) {
            addCriterion("P21 =", value, "p21");
            return (Criteria) this;
        }

        public Criteria andP21NotEqualTo(String value) {
            addCriterion("P21 <>", value, "p21");
            return (Criteria) this;
        }

        public Criteria andP21GreaterThan(String value) {
            addCriterion("P21 >", value, "p21");
            return (Criteria) this;
        }

        public Criteria andP21GreaterThanOrEqualTo(String value) {
            addCriterion("P21 >=", value, "p21");
            return (Criteria) this;
        }

        public Criteria andP21LessThan(String value) {
            addCriterion("P21 <", value, "p21");
            return (Criteria) this;
        }

        public Criteria andP21LessThanOrEqualTo(String value) {
            addCriterion("P21 <=", value, "p21");
            return (Criteria) this;
        }

        public Criteria andP21Like(String value) {
            addCriterion("P21 like", value, "p21");
            return (Criteria) this;
        }

        public Criteria andP21NotLike(String value) {
            addCriterion("P21 not like", value, "p21");
            return (Criteria) this;
        }

        public Criteria andP21In(List<String> values) {
            addCriterion("P21 in", values, "p21");
            return (Criteria) this;
        }

        public Criteria andP21NotIn(List<String> values) {
            addCriterion("P21 not in", values, "p21");
            return (Criteria) this;
        }

        public Criteria andP21Between(String value1, String value2) {
            addCriterion("P21 between", value1, value2, "p21");
            return (Criteria) this;
        }

        public Criteria andP21NotBetween(String value1, String value2) {
            addCriterion("P21 not between", value1, value2, "p21");
            return (Criteria) this;
        }

        public Criteria andP22IsNull() {
            addCriterion("P22 is null");
            return (Criteria) this;
        }

        public Criteria andP22IsNotNull() {
            addCriterion("P22 is not null");
            return (Criteria) this;
        }

        public Criteria andP22EqualTo(String value) {
            addCriterion("P22 =", value, "p22");
            return (Criteria) this;
        }

        public Criteria andP22NotEqualTo(String value) {
            addCriterion("P22 <>", value, "p22");
            return (Criteria) this;
        }

        public Criteria andP22GreaterThan(String value) {
            addCriterion("P22 >", value, "p22");
            return (Criteria) this;
        }

        public Criteria andP22GreaterThanOrEqualTo(String value) {
            addCriterion("P22 >=", value, "p22");
            return (Criteria) this;
        }

        public Criteria andP22LessThan(String value) {
            addCriterion("P22 <", value, "p22");
            return (Criteria) this;
        }

        public Criteria andP22LessThanOrEqualTo(String value) {
            addCriterion("P22 <=", value, "p22");
            return (Criteria) this;
        }

        public Criteria andP22Like(String value) {
            addCriterion("P22 like", value, "p22");
            return (Criteria) this;
        }

        public Criteria andP22NotLike(String value) {
            addCriterion("P22 not like", value, "p22");
            return (Criteria) this;
        }

        public Criteria andP22In(List<String> values) {
            addCriterion("P22 in", values, "p22");
            return (Criteria) this;
        }

        public Criteria andP22NotIn(List<String> values) {
            addCriterion("P22 not in", values, "p22");
            return (Criteria) this;
        }

        public Criteria andP22Between(String value1, String value2) {
            addCriterion("P22 between", value1, value2, "p22");
            return (Criteria) this;
        }

        public Criteria andP22NotBetween(String value1, String value2) {
            addCriterion("P22 not between", value1, value2, "p22");
            return (Criteria) this;
        }

        public Criteria andP23IsNull() {
            addCriterion("P23 is null");
            return (Criteria) this;
        }

        public Criteria andP23IsNotNull() {
            addCriterion("P23 is not null");
            return (Criteria) this;
        }

        public Criteria andP23EqualTo(String value) {
            addCriterion("P23 =", value, "p23");
            return (Criteria) this;
        }

        public Criteria andP23NotEqualTo(String value) {
            addCriterion("P23 <>", value, "p23");
            return (Criteria) this;
        }

        public Criteria andP23GreaterThan(String value) {
            addCriterion("P23 >", value, "p23");
            return (Criteria) this;
        }

        public Criteria andP23GreaterThanOrEqualTo(String value) {
            addCriterion("P23 >=", value, "p23");
            return (Criteria) this;
        }

        public Criteria andP23LessThan(String value) {
            addCriterion("P23 <", value, "p23");
            return (Criteria) this;
        }

        public Criteria andP23LessThanOrEqualTo(String value) {
            addCriterion("P23 <=", value, "p23");
            return (Criteria) this;
        }

        public Criteria andP23Like(String value) {
            addCriterion("P23 like", value, "p23");
            return (Criteria) this;
        }

        public Criteria andP23NotLike(String value) {
            addCriterion("P23 not like", value, "p23");
            return (Criteria) this;
        }

        public Criteria andP23In(List<String> values) {
            addCriterion("P23 in", values, "p23");
            return (Criteria) this;
        }

        public Criteria andP23NotIn(List<String> values) {
            addCriterion("P23 not in", values, "p23");
            return (Criteria) this;
        }

        public Criteria andP23Between(String value1, String value2) {
            addCriterion("P23 between", value1, value2, "p23");
            return (Criteria) this;
        }

        public Criteria andP23NotBetween(String value1, String value2) {
            addCriterion("P23 not between", value1, value2, "p23");
            return (Criteria) this;
        }

        public Criteria andP24IsNull() {
            addCriterion("P24 is null");
            return (Criteria) this;
        }

        public Criteria andP24IsNotNull() {
            addCriterion("P24 is not null");
            return (Criteria) this;
        }

        public Criteria andP24EqualTo(String value) {
            addCriterion("P24 =", value, "p24");
            return (Criteria) this;
        }

        public Criteria andP24NotEqualTo(String value) {
            addCriterion("P24 <>", value, "p24");
            return (Criteria) this;
        }

        public Criteria andP24GreaterThan(String value) {
            addCriterion("P24 >", value, "p24");
            return (Criteria) this;
        }

        public Criteria andP24GreaterThanOrEqualTo(String value) {
            addCriterion("P24 >=", value, "p24");
            return (Criteria) this;
        }

        public Criteria andP24LessThan(String value) {
            addCriterion("P24 <", value, "p24");
            return (Criteria) this;
        }

        public Criteria andP24LessThanOrEqualTo(String value) {
            addCriterion("P24 <=", value, "p24");
            return (Criteria) this;
        }

        public Criteria andP24Like(String value) {
            addCriterion("P24 like", value, "p24");
            return (Criteria) this;
        }

        public Criteria andP24NotLike(String value) {
            addCriterion("P24 not like", value, "p24");
            return (Criteria) this;
        }

        public Criteria andP24In(List<String> values) {
            addCriterion("P24 in", values, "p24");
            return (Criteria) this;
        }

        public Criteria andP24NotIn(List<String> values) {
            addCriterion("P24 not in", values, "p24");
            return (Criteria) this;
        }

        public Criteria andP24Between(String value1, String value2) {
            addCriterion("P24 between", value1, value2, "p24");
            return (Criteria) this;
        }

        public Criteria andP24NotBetween(String value1, String value2) {
            addCriterion("P24 not between", value1, value2, "p24");
            return (Criteria) this;
        }

        public Criteria andP25IsNull() {
            addCriterion("P25 is null");
            return (Criteria) this;
        }

        public Criteria andP25IsNotNull() {
            addCriterion("P25 is not null");
            return (Criteria) this;
        }

        public Criteria andP25EqualTo(String value) {
            addCriterion("P25 =", value, "p25");
            return (Criteria) this;
        }

        public Criteria andP25NotEqualTo(String value) {
            addCriterion("P25 <>", value, "p25");
            return (Criteria) this;
        }

        public Criteria andP25GreaterThan(String value) {
            addCriterion("P25 >", value, "p25");
            return (Criteria) this;
        }

        public Criteria andP25GreaterThanOrEqualTo(String value) {
            addCriterion("P25 >=", value, "p25");
            return (Criteria) this;
        }

        public Criteria andP25LessThan(String value) {
            addCriterion("P25 <", value, "p25");
            return (Criteria) this;
        }

        public Criteria andP25LessThanOrEqualTo(String value) {
            addCriterion("P25 <=", value, "p25");
            return (Criteria) this;
        }

        public Criteria andP25Like(String value) {
            addCriterion("P25 like", value, "p25");
            return (Criteria) this;
        }

        public Criteria andP25NotLike(String value) {
            addCriterion("P25 not like", value, "p25");
            return (Criteria) this;
        }

        public Criteria andP25In(List<String> values) {
            addCriterion("P25 in", values, "p25");
            return (Criteria) this;
        }

        public Criteria andP25NotIn(List<String> values) {
            addCriterion("P25 not in", values, "p25");
            return (Criteria) this;
        }

        public Criteria andP25Between(String value1, String value2) {
            addCriterion("P25 between", value1, value2, "p25");
            return (Criteria) this;
        }

        public Criteria andP25NotBetween(String value1, String value2) {
            addCriterion("P25 not between", value1, value2, "p25");
            return (Criteria) this;
        }

        public Criteria andP26IsNull() {
            addCriterion("P26 is null");
            return (Criteria) this;
        }

        public Criteria andP26IsNotNull() {
            addCriterion("P26 is not null");
            return (Criteria) this;
        }

        public Criteria andP26EqualTo(String value) {
            addCriterion("P26 =", value, "p26");
            return (Criteria) this;
        }

        public Criteria andP26NotEqualTo(String value) {
            addCriterion("P26 <>", value, "p26");
            return (Criteria) this;
        }

        public Criteria andP26GreaterThan(String value) {
            addCriterion("P26 >", value, "p26");
            return (Criteria) this;
        }

        public Criteria andP26GreaterThanOrEqualTo(String value) {
            addCriterion("P26 >=", value, "p26");
            return (Criteria) this;
        }

        public Criteria andP26LessThan(String value) {
            addCriterion("P26 <", value, "p26");
            return (Criteria) this;
        }

        public Criteria andP26LessThanOrEqualTo(String value) {
            addCriterion("P26 <=", value, "p26");
            return (Criteria) this;
        }

        public Criteria andP26Like(String value) {
            addCriterion("P26 like", value, "p26");
            return (Criteria) this;
        }

        public Criteria andP26NotLike(String value) {
            addCriterion("P26 not like", value, "p26");
            return (Criteria) this;
        }

        public Criteria andP26In(List<String> values) {
            addCriterion("P26 in", values, "p26");
            return (Criteria) this;
        }

        public Criteria andP26NotIn(List<String> values) {
            addCriterion("P26 not in", values, "p26");
            return (Criteria) this;
        }

        public Criteria andP26Between(String value1, String value2) {
            addCriterion("P26 between", value1, value2, "p26");
            return (Criteria) this;
        }

        public Criteria andP26NotBetween(String value1, String value2) {
            addCriterion("P26 not between", value1, value2, "p26");
            return (Criteria) this;
        }

        public Criteria andP27IsNull() {
            addCriterion("P27 is null");
            return (Criteria) this;
        }

        public Criteria andP27IsNotNull() {
            addCriterion("P27 is not null");
            return (Criteria) this;
        }

        public Criteria andP27EqualTo(String value) {
            addCriterion("P27 =", value, "p27");
            return (Criteria) this;
        }

        public Criteria andP27NotEqualTo(String value) {
            addCriterion("P27 <>", value, "p27");
            return (Criteria) this;
        }

        public Criteria andP27GreaterThan(String value) {
            addCriterion("P27 >", value, "p27");
            return (Criteria) this;
        }

        public Criteria andP27GreaterThanOrEqualTo(String value) {
            addCriterion("P27 >=", value, "p27");
            return (Criteria) this;
        }

        public Criteria andP27LessThan(String value) {
            addCriterion("P27 <", value, "p27");
            return (Criteria) this;
        }

        public Criteria andP27LessThanOrEqualTo(String value) {
            addCriterion("P27 <=", value, "p27");
            return (Criteria) this;
        }

        public Criteria andP27Like(String value) {
            addCriterion("P27 like", value, "p27");
            return (Criteria) this;
        }

        public Criteria andP27NotLike(String value) {
            addCriterion("P27 not like", value, "p27");
            return (Criteria) this;
        }

        public Criteria andP27In(List<String> values) {
            addCriterion("P27 in", values, "p27");
            return (Criteria) this;
        }

        public Criteria andP27NotIn(List<String> values) {
            addCriterion("P27 not in", values, "p27");
            return (Criteria) this;
        }

        public Criteria andP27Between(String value1, String value2) {
            addCriterion("P27 between", value1, value2, "p27");
            return (Criteria) this;
        }

        public Criteria andP27NotBetween(String value1, String value2) {
            addCriterion("P27 not between", value1, value2, "p27");
            return (Criteria) this;
        }

        public Criteria andP28IsNull() {
            addCriterion("P28 is null");
            return (Criteria) this;
        }

        public Criteria andP28IsNotNull() {
            addCriterion("P28 is not null");
            return (Criteria) this;
        }

        public Criteria andP28EqualTo(String value) {
            addCriterion("P28 =", value, "p28");
            return (Criteria) this;
        }

        public Criteria andP28NotEqualTo(String value) {
            addCriterion("P28 <>", value, "p28");
            return (Criteria) this;
        }

        public Criteria andP28GreaterThan(String value) {
            addCriterion("P28 >", value, "p28");
            return (Criteria) this;
        }

        public Criteria andP28GreaterThanOrEqualTo(String value) {
            addCriterion("P28 >=", value, "p28");
            return (Criteria) this;
        }

        public Criteria andP28LessThan(String value) {
            addCriterion("P28 <", value, "p28");
            return (Criteria) this;
        }

        public Criteria andP28LessThanOrEqualTo(String value) {
            addCriterion("P28 <=", value, "p28");
            return (Criteria) this;
        }

        public Criteria andP28Like(String value) {
            addCriterion("P28 like", value, "p28");
            return (Criteria) this;
        }

        public Criteria andP28NotLike(String value) {
            addCriterion("P28 not like", value, "p28");
            return (Criteria) this;
        }

        public Criteria andP28In(List<String> values) {
            addCriterion("P28 in", values, "p28");
            return (Criteria) this;
        }

        public Criteria andP28NotIn(List<String> values) {
            addCriterion("P28 not in", values, "p28");
            return (Criteria) this;
        }

        public Criteria andP28Between(String value1, String value2) {
            addCriterion("P28 between", value1, value2, "p28");
            return (Criteria) this;
        }

        public Criteria andP28NotBetween(String value1, String value2) {
            addCriterion("P28 not between", value1, value2, "p28");
            return (Criteria) this;
        }

        public Criteria andP29IsNull() {
            addCriterion("P29 is null");
            return (Criteria) this;
        }

        public Criteria andP29IsNotNull() {
            addCriterion("P29 is not null");
            return (Criteria) this;
        }

        public Criteria andP29EqualTo(String value) {
            addCriterion("P29 =", value, "p29");
            return (Criteria) this;
        }

        public Criteria andP29NotEqualTo(String value) {
            addCriterion("P29 <>", value, "p29");
            return (Criteria) this;
        }

        public Criteria andP29GreaterThan(String value) {
            addCriterion("P29 >", value, "p29");
            return (Criteria) this;
        }

        public Criteria andP29GreaterThanOrEqualTo(String value) {
            addCriterion("P29 >=", value, "p29");
            return (Criteria) this;
        }

        public Criteria andP29LessThan(String value) {
            addCriterion("P29 <", value, "p29");
            return (Criteria) this;
        }

        public Criteria andP29LessThanOrEqualTo(String value) {
            addCriterion("P29 <=", value, "p29");
            return (Criteria) this;
        }

        public Criteria andP29Like(String value) {
            addCriterion("P29 like", value, "p29");
            return (Criteria) this;
        }

        public Criteria andP29NotLike(String value) {
            addCriterion("P29 not like", value, "p29");
            return (Criteria) this;
        }

        public Criteria andP29In(List<String> values) {
            addCriterion("P29 in", values, "p29");
            return (Criteria) this;
        }

        public Criteria andP29NotIn(List<String> values) {
            addCriterion("P29 not in", values, "p29");
            return (Criteria) this;
        }

        public Criteria andP29Between(String value1, String value2) {
            addCriterion("P29 between", value1, value2, "p29");
            return (Criteria) this;
        }

        public Criteria andP29NotBetween(String value1, String value2) {
            addCriterion("P29 not between", value1, value2, "p29");
            return (Criteria) this;
        }

        public Criteria andP30IsNull() {
            addCriterion("P30 is null");
            return (Criteria) this;
        }

        public Criteria andP30IsNotNull() {
            addCriterion("P30 is not null");
            return (Criteria) this;
        }

        public Criteria andP30EqualTo(String value) {
            addCriterion("P30 =", value, "p30");
            return (Criteria) this;
        }

        public Criteria andP30NotEqualTo(String value) {
            addCriterion("P30 <>", value, "p30");
            return (Criteria) this;
        }

        public Criteria andP30GreaterThan(String value) {
            addCriterion("P30 >", value, "p30");
            return (Criteria) this;
        }

        public Criteria andP30GreaterThanOrEqualTo(String value) {
            addCriterion("P30 >=", value, "p30");
            return (Criteria) this;
        }

        public Criteria andP30LessThan(String value) {
            addCriterion("P30 <", value, "p30");
            return (Criteria) this;
        }

        public Criteria andP30LessThanOrEqualTo(String value) {
            addCriterion("P30 <=", value, "p30");
            return (Criteria) this;
        }

        public Criteria andP30Like(String value) {
            addCriterion("P30 like", value, "p30");
            return (Criteria) this;
        }

        public Criteria andP30NotLike(String value) {
            addCriterion("P30 not like", value, "p30");
            return (Criteria) this;
        }

        public Criteria andP30In(List<String> values) {
            addCriterion("P30 in", values, "p30");
            return (Criteria) this;
        }

        public Criteria andP30NotIn(List<String> values) {
            addCriterion("P30 not in", values, "p30");
            return (Criteria) this;
        }

        public Criteria andP30Between(String value1, String value2) {
            addCriterion("P30 between", value1, value2, "p30");
            return (Criteria) this;
        }

        public Criteria andP30NotBetween(String value1, String value2) {
            addCriterion("P30 not between", value1, value2, "p30");
            return (Criteria) this;
        }

        public Criteria andP31IsNull() {
            addCriterion("P31 is null");
            return (Criteria) this;
        }

        public Criteria andP31IsNotNull() {
            addCriterion("P31 is not null");
            return (Criteria) this;
        }

        public Criteria andP31EqualTo(String value) {
            addCriterion("P31 =", value, "p31");
            return (Criteria) this;
        }

        public Criteria andP31NotEqualTo(String value) {
            addCriterion("P31 <>", value, "p31");
            return (Criteria) this;
        }

        public Criteria andP31GreaterThan(String value) {
            addCriterion("P31 >", value, "p31");
            return (Criteria) this;
        }

        public Criteria andP31GreaterThanOrEqualTo(String value) {
            addCriterion("P31 >=", value, "p31");
            return (Criteria) this;
        }

        public Criteria andP31LessThan(String value) {
            addCriterion("P31 <", value, "p31");
            return (Criteria) this;
        }

        public Criteria andP31LessThanOrEqualTo(String value) {
            addCriterion("P31 <=", value, "p31");
            return (Criteria) this;
        }

        public Criteria andP31Like(String value) {
            addCriterion("P31 like", value, "p31");
            return (Criteria) this;
        }

        public Criteria andP31NotLike(String value) {
            addCriterion("P31 not like", value, "p31");
            return (Criteria) this;
        }

        public Criteria andP31In(List<String> values) {
            addCriterion("P31 in", values, "p31");
            return (Criteria) this;
        }

        public Criteria andP31NotIn(List<String> values) {
            addCriterion("P31 not in", values, "p31");
            return (Criteria) this;
        }

        public Criteria andP31Between(String value1, String value2) {
            addCriterion("P31 between", value1, value2, "p31");
            return (Criteria) this;
        }

        public Criteria andP31NotBetween(String value1, String value2) {
            addCriterion("P31 not between", value1, value2, "p31");
            return (Criteria) this;
        }

        public Criteria andP32IsNull() {
            addCriterion("P32 is null");
            return (Criteria) this;
        }

        public Criteria andP32IsNotNull() {
            addCriterion("P32 is not null");
            return (Criteria) this;
        }

        public Criteria andP32EqualTo(String value) {
            addCriterion("P32 =", value, "p32");
            return (Criteria) this;
        }

        public Criteria andP32NotEqualTo(String value) {
            addCriterion("P32 <>", value, "p32");
            return (Criteria) this;
        }

        public Criteria andP32GreaterThan(String value) {
            addCriterion("P32 >", value, "p32");
            return (Criteria) this;
        }

        public Criteria andP32GreaterThanOrEqualTo(String value) {
            addCriterion("P32 >=", value, "p32");
            return (Criteria) this;
        }

        public Criteria andP32LessThan(String value) {
            addCriterion("P32 <", value, "p32");
            return (Criteria) this;
        }

        public Criteria andP32LessThanOrEqualTo(String value) {
            addCriterion("P32 <=", value, "p32");
            return (Criteria) this;
        }

        public Criteria andP32Like(String value) {
            addCriterion("P32 like", value, "p32");
            return (Criteria) this;
        }

        public Criteria andP32NotLike(String value) {
            addCriterion("P32 not like", value, "p32");
            return (Criteria) this;
        }

        public Criteria andP32In(List<String> values) {
            addCriterion("P32 in", values, "p32");
            return (Criteria) this;
        }

        public Criteria andP32NotIn(List<String> values) {
            addCriterion("P32 not in", values, "p32");
            return (Criteria) this;
        }

        public Criteria andP32Between(String value1, String value2) {
            addCriterion("P32 between", value1, value2, "p32");
            return (Criteria) this;
        }

        public Criteria andP32NotBetween(String value1, String value2) {
            addCriterion("P32 not between", value1, value2, "p32");
            return (Criteria) this;
        }

        public Criteria andP33IsNull() {
            addCriterion("P33 is null");
            return (Criteria) this;
        }

        public Criteria andP33IsNotNull() {
            addCriterion("P33 is not null");
            return (Criteria) this;
        }

        public Criteria andP33EqualTo(String value) {
            addCriterion("P33 =", value, "p33");
            return (Criteria) this;
        }

        public Criteria andP33NotEqualTo(String value) {
            addCriterion("P33 <>", value, "p33");
            return (Criteria) this;
        }

        public Criteria andP33GreaterThan(String value) {
            addCriterion("P33 >", value, "p33");
            return (Criteria) this;
        }

        public Criteria andP33GreaterThanOrEqualTo(String value) {
            addCriterion("P33 >=", value, "p33");
            return (Criteria) this;
        }

        public Criteria andP33LessThan(String value) {
            addCriterion("P33 <", value, "p33");
            return (Criteria) this;
        }

        public Criteria andP33LessThanOrEqualTo(String value) {
            addCriterion("P33 <=", value, "p33");
            return (Criteria) this;
        }

        public Criteria andP33Like(String value) {
            addCriterion("P33 like", value, "p33");
            return (Criteria) this;
        }

        public Criteria andP33NotLike(String value) {
            addCriterion("P33 not like", value, "p33");
            return (Criteria) this;
        }

        public Criteria andP33In(List<String> values) {
            addCriterion("P33 in", values, "p33");
            return (Criteria) this;
        }

        public Criteria andP33NotIn(List<String> values) {
            addCriterion("P33 not in", values, "p33");
            return (Criteria) this;
        }

        public Criteria andP33Between(String value1, String value2) {
            addCriterion("P33 between", value1, value2, "p33");
            return (Criteria) this;
        }

        public Criteria andP33NotBetween(String value1, String value2) {
            addCriterion("P33 not between", value1, value2, "p33");
            return (Criteria) this;
        }

        public Criteria andP34IsNull() {
            addCriterion("P34 is null");
            return (Criteria) this;
        }

        public Criteria andP34IsNotNull() {
            addCriterion("P34 is not null");
            return (Criteria) this;
        }

        public Criteria andP34EqualTo(String value) {
            addCriterion("P34 =", value, "p34");
            return (Criteria) this;
        }

        public Criteria andP34NotEqualTo(String value) {
            addCriterion("P34 <>", value, "p34");
            return (Criteria) this;
        }

        public Criteria andP34GreaterThan(String value) {
            addCriterion("P34 >", value, "p34");
            return (Criteria) this;
        }

        public Criteria andP34GreaterThanOrEqualTo(String value) {
            addCriterion("P34 >=", value, "p34");
            return (Criteria) this;
        }

        public Criteria andP34LessThan(String value) {
            addCriterion("P34 <", value, "p34");
            return (Criteria) this;
        }

        public Criteria andP34LessThanOrEqualTo(String value) {
            addCriterion("P34 <=", value, "p34");
            return (Criteria) this;
        }

        public Criteria andP34Like(String value) {
            addCriterion("P34 like", value, "p34");
            return (Criteria) this;
        }

        public Criteria andP34NotLike(String value) {
            addCriterion("P34 not like", value, "p34");
            return (Criteria) this;
        }

        public Criteria andP34In(List<String> values) {
            addCriterion("P34 in", values, "p34");
            return (Criteria) this;
        }

        public Criteria andP34NotIn(List<String> values) {
            addCriterion("P34 not in", values, "p34");
            return (Criteria) this;
        }

        public Criteria andP34Between(String value1, String value2) {
            addCriterion("P34 between", value1, value2, "p34");
            return (Criteria) this;
        }

        public Criteria andP34NotBetween(String value1, String value2) {
            addCriterion("P34 not between", value1, value2, "p34");
            return (Criteria) this;
        }

        public Criteria andP35IsNull() {
            addCriterion("P35 is null");
            return (Criteria) this;
        }

        public Criteria andP35IsNotNull() {
            addCriterion("P35 is not null");
            return (Criteria) this;
        }

        public Criteria andP35EqualTo(String value) {
            addCriterion("P35 =", value, "p35");
            return (Criteria) this;
        }

        public Criteria andP35NotEqualTo(String value) {
            addCriterion("P35 <>", value, "p35");
            return (Criteria) this;
        }

        public Criteria andP35GreaterThan(String value) {
            addCriterion("P35 >", value, "p35");
            return (Criteria) this;
        }

        public Criteria andP35GreaterThanOrEqualTo(String value) {
            addCriterion("P35 >=", value, "p35");
            return (Criteria) this;
        }

        public Criteria andP35LessThan(String value) {
            addCriterion("P35 <", value, "p35");
            return (Criteria) this;
        }

        public Criteria andP35LessThanOrEqualTo(String value) {
            addCriterion("P35 <=", value, "p35");
            return (Criteria) this;
        }

        public Criteria andP35Like(String value) {
            addCriterion("P35 like", value, "p35");
            return (Criteria) this;
        }

        public Criteria andP35NotLike(String value) {
            addCriterion("P35 not like", value, "p35");
            return (Criteria) this;
        }

        public Criteria andP35In(List<String> values) {
            addCriterion("P35 in", values, "p35");
            return (Criteria) this;
        }

        public Criteria andP35NotIn(List<String> values) {
            addCriterion("P35 not in", values, "p35");
            return (Criteria) this;
        }

        public Criteria andP35Between(String value1, String value2) {
            addCriterion("P35 between", value1, value2, "p35");
            return (Criteria) this;
        }

        public Criteria andP35NotBetween(String value1, String value2) {
            addCriterion("P35 not between", value1, value2, "p35");
            return (Criteria) this;
        }

        public Criteria andP36IsNull() {
            addCriterion("P36 is null");
            return (Criteria) this;
        }

        public Criteria andP36IsNotNull() {
            addCriterion("P36 is not null");
            return (Criteria) this;
        }

        public Criteria andP36EqualTo(String value) {
            addCriterion("P36 =", value, "p36");
            return (Criteria) this;
        }

        public Criteria andP36NotEqualTo(String value) {
            addCriterion("P36 <>", value, "p36");
            return (Criteria) this;
        }

        public Criteria andP36GreaterThan(String value) {
            addCriterion("P36 >", value, "p36");
            return (Criteria) this;
        }

        public Criteria andP36GreaterThanOrEqualTo(String value) {
            addCriterion("P36 >=", value, "p36");
            return (Criteria) this;
        }

        public Criteria andP36LessThan(String value) {
            addCriterion("P36 <", value, "p36");
            return (Criteria) this;
        }

        public Criteria andP36LessThanOrEqualTo(String value) {
            addCriterion("P36 <=", value, "p36");
            return (Criteria) this;
        }

        public Criteria andP36Like(String value) {
            addCriterion("P36 like", value, "p36");
            return (Criteria) this;
        }

        public Criteria andP36NotLike(String value) {
            addCriterion("P36 not like", value, "p36");
            return (Criteria) this;
        }

        public Criteria andP36In(List<String> values) {
            addCriterion("P36 in", values, "p36");
            return (Criteria) this;
        }

        public Criteria andP36NotIn(List<String> values) {
            addCriterion("P36 not in", values, "p36");
            return (Criteria) this;
        }

        public Criteria andP36Between(String value1, String value2) {
            addCriterion("P36 between", value1, value2, "p36");
            return (Criteria) this;
        }

        public Criteria andP36NotBetween(String value1, String value2) {
            addCriterion("P36 not between", value1, value2, "p36");
            return (Criteria) this;
        }

        public Criteria andP37IsNull() {
            addCriterion("P37 is null");
            return (Criteria) this;
        }

        public Criteria andP37IsNotNull() {
            addCriterion("P37 is not null");
            return (Criteria) this;
        }

        public Criteria andP37EqualTo(String value) {
            addCriterion("P37 =", value, "p37");
            return (Criteria) this;
        }

        public Criteria andP37NotEqualTo(String value) {
            addCriterion("P37 <>", value, "p37");
            return (Criteria) this;
        }

        public Criteria andP37GreaterThan(String value) {
            addCriterion("P37 >", value, "p37");
            return (Criteria) this;
        }

        public Criteria andP37GreaterThanOrEqualTo(String value) {
            addCriterion("P37 >=", value, "p37");
            return (Criteria) this;
        }

        public Criteria andP37LessThan(String value) {
            addCriterion("P37 <", value, "p37");
            return (Criteria) this;
        }

        public Criteria andP37LessThanOrEqualTo(String value) {
            addCriterion("P37 <=", value, "p37");
            return (Criteria) this;
        }

        public Criteria andP37Like(String value) {
            addCriterion("P37 like", value, "p37");
            return (Criteria) this;
        }

        public Criteria andP37NotLike(String value) {
            addCriterion("P37 not like", value, "p37");
            return (Criteria) this;
        }

        public Criteria andP37In(List<String> values) {
            addCriterion("P37 in", values, "p37");
            return (Criteria) this;
        }

        public Criteria andP37NotIn(List<String> values) {
            addCriterion("P37 not in", values, "p37");
            return (Criteria) this;
        }

        public Criteria andP37Between(String value1, String value2) {
            addCriterion("P37 between", value1, value2, "p37");
            return (Criteria) this;
        }

        public Criteria andP37NotBetween(String value1, String value2) {
            addCriterion("P37 not between", value1, value2, "p37");
            return (Criteria) this;
        }

        public Criteria andP38IsNull() {
            addCriterion("P38 is null");
            return (Criteria) this;
        }

        public Criteria andP38IsNotNull() {
            addCriterion("P38 is not null");
            return (Criteria) this;
        }

        public Criteria andP38EqualTo(String value) {
            addCriterion("P38 =", value, "p38");
            return (Criteria) this;
        }

        public Criteria andP38NotEqualTo(String value) {
            addCriterion("P38 <>", value, "p38");
            return (Criteria) this;
        }

        public Criteria andP38GreaterThan(String value) {
            addCriterion("P38 >", value, "p38");
            return (Criteria) this;
        }

        public Criteria andP38GreaterThanOrEqualTo(String value) {
            addCriterion("P38 >=", value, "p38");
            return (Criteria) this;
        }

        public Criteria andP38LessThan(String value) {
            addCriterion("P38 <", value, "p38");
            return (Criteria) this;
        }

        public Criteria andP38LessThanOrEqualTo(String value) {
            addCriterion("P38 <=", value, "p38");
            return (Criteria) this;
        }

        public Criteria andP38Like(String value) {
            addCriterion("P38 like", value, "p38");
            return (Criteria) this;
        }

        public Criteria andP38NotLike(String value) {
            addCriterion("P38 not like", value, "p38");
            return (Criteria) this;
        }

        public Criteria andP38In(List<String> values) {
            addCriterion("P38 in", values, "p38");
            return (Criteria) this;
        }

        public Criteria andP38NotIn(List<String> values) {
            addCriterion("P38 not in", values, "p38");
            return (Criteria) this;
        }

        public Criteria andP38Between(String value1, String value2) {
            addCriterion("P38 between", value1, value2, "p38");
            return (Criteria) this;
        }

        public Criteria andP38NotBetween(String value1, String value2) {
            addCriterion("P38 not between", value1, value2, "p38");
            return (Criteria) this;
        }

        public Criteria andP39IsNull() {
            addCriterion("P39 is null");
            return (Criteria) this;
        }

        public Criteria andP39IsNotNull() {
            addCriterion("P39 is not null");
            return (Criteria) this;
        }

        public Criteria andP39EqualTo(String value) {
            addCriterion("P39 =", value, "p39");
            return (Criteria) this;
        }

        public Criteria andP39NotEqualTo(String value) {
            addCriterion("P39 <>", value, "p39");
            return (Criteria) this;
        }

        public Criteria andP39GreaterThan(String value) {
            addCriterion("P39 >", value, "p39");
            return (Criteria) this;
        }

        public Criteria andP39GreaterThanOrEqualTo(String value) {
            addCriterion("P39 >=", value, "p39");
            return (Criteria) this;
        }

        public Criteria andP39LessThan(String value) {
            addCriterion("P39 <", value, "p39");
            return (Criteria) this;
        }

        public Criteria andP39LessThanOrEqualTo(String value) {
            addCriterion("P39 <=", value, "p39");
            return (Criteria) this;
        }

        public Criteria andP39Like(String value) {
            addCriterion("P39 like", value, "p39");
            return (Criteria) this;
        }

        public Criteria andP39NotLike(String value) {
            addCriterion("P39 not like", value, "p39");
            return (Criteria) this;
        }

        public Criteria andP39In(List<String> values) {
            addCriterion("P39 in", values, "p39");
            return (Criteria) this;
        }

        public Criteria andP39NotIn(List<String> values) {
            addCriterion("P39 not in", values, "p39");
            return (Criteria) this;
        }

        public Criteria andP39Between(String value1, String value2) {
            addCriterion("P39 between", value1, value2, "p39");
            return (Criteria) this;
        }

        public Criteria andP39NotBetween(String value1, String value2) {
            addCriterion("P39 not between", value1, value2, "p39");
            return (Criteria) this;
        }

        public Criteria andP40IsNull() {
            addCriterion("P40 is null");
            return (Criteria) this;
        }

        public Criteria andP40IsNotNull() {
            addCriterion("P40 is not null");
            return (Criteria) this;
        }

        public Criteria andP40EqualTo(String value) {
            addCriterion("P40 =", value, "p40");
            return (Criteria) this;
        }

        public Criteria andP40NotEqualTo(String value) {
            addCriterion("P40 <>", value, "p40");
            return (Criteria) this;
        }

        public Criteria andP40GreaterThan(String value) {
            addCriterion("P40 >", value, "p40");
            return (Criteria) this;
        }

        public Criteria andP40GreaterThanOrEqualTo(String value) {
            addCriterion("P40 >=", value, "p40");
            return (Criteria) this;
        }

        public Criteria andP40LessThan(String value) {
            addCriterion("P40 <", value, "p40");
            return (Criteria) this;
        }

        public Criteria andP40LessThanOrEqualTo(String value) {
            addCriterion("P40 <=", value, "p40");
            return (Criteria) this;
        }

        public Criteria andP40Like(String value) {
            addCriterion("P40 like", value, "p40");
            return (Criteria) this;
        }

        public Criteria andP40NotLike(String value) {
            addCriterion("P40 not like", value, "p40");
            return (Criteria) this;
        }

        public Criteria andP40In(List<String> values) {
            addCriterion("P40 in", values, "p40");
            return (Criteria) this;
        }

        public Criteria andP40NotIn(List<String> values) {
            addCriterion("P40 not in", values, "p40");
            return (Criteria) this;
        }

        public Criteria andP40Between(String value1, String value2) {
            addCriterion("P40 between", value1, value2, "p40");
            return (Criteria) this;
        }

        public Criteria andP40NotBetween(String value1, String value2) {
            addCriterion("P40 not between", value1, value2, "p40");
            return (Criteria) this;
        }

        public Criteria andP41IsNull() {
            addCriterion("P41 is null");
            return (Criteria) this;
        }

        public Criteria andP41IsNotNull() {
            addCriterion("P41 is not null");
            return (Criteria) this;
        }

        public Criteria andP41EqualTo(String value) {
            addCriterion("P41 =", value, "p41");
            return (Criteria) this;
        }

        public Criteria andP41NotEqualTo(String value) {
            addCriterion("P41 <>", value, "p41");
            return (Criteria) this;
        }

        public Criteria andP41GreaterThan(String value) {
            addCriterion("P41 >", value, "p41");
            return (Criteria) this;
        }

        public Criteria andP41GreaterThanOrEqualTo(String value) {
            addCriterion("P41 >=", value, "p41");
            return (Criteria) this;
        }

        public Criteria andP41LessThan(String value) {
            addCriterion("P41 <", value, "p41");
            return (Criteria) this;
        }

        public Criteria andP41LessThanOrEqualTo(String value) {
            addCriterion("P41 <=", value, "p41");
            return (Criteria) this;
        }

        public Criteria andP41Like(String value) {
            addCriterion("P41 like", value, "p41");
            return (Criteria) this;
        }

        public Criteria andP41NotLike(String value) {
            addCriterion("P41 not like", value, "p41");
            return (Criteria) this;
        }

        public Criteria andP41In(List<String> values) {
            addCriterion("P41 in", values, "p41");
            return (Criteria) this;
        }

        public Criteria andP41NotIn(List<String> values) {
            addCriterion("P41 not in", values, "p41");
            return (Criteria) this;
        }

        public Criteria andP41Between(String value1, String value2) {
            addCriterion("P41 between", value1, value2, "p41");
            return (Criteria) this;
        }

        public Criteria andP41NotBetween(String value1, String value2) {
            addCriterion("P41 not between", value1, value2, "p41");
            return (Criteria) this;
        }

        public Criteria andP42IsNull() {
            addCriterion("P42 is null");
            return (Criteria) this;
        }

        public Criteria andP42IsNotNull() {
            addCriterion("P42 is not null");
            return (Criteria) this;
        }

        public Criteria andP42EqualTo(String value) {
            addCriterion("P42 =", value, "p42");
            return (Criteria) this;
        }

        public Criteria andP42NotEqualTo(String value) {
            addCriterion("P42 <>", value, "p42");
            return (Criteria) this;
        }

        public Criteria andP42GreaterThan(String value) {
            addCriterion("P42 >", value, "p42");
            return (Criteria) this;
        }

        public Criteria andP42GreaterThanOrEqualTo(String value) {
            addCriterion("P42 >=", value, "p42");
            return (Criteria) this;
        }

        public Criteria andP42LessThan(String value) {
            addCriterion("P42 <", value, "p42");
            return (Criteria) this;
        }

        public Criteria andP42LessThanOrEqualTo(String value) {
            addCriterion("P42 <=", value, "p42");
            return (Criteria) this;
        }

        public Criteria andP42Like(String value) {
            addCriterion("P42 like", value, "p42");
            return (Criteria) this;
        }

        public Criteria andP42NotLike(String value) {
            addCriterion("P42 not like", value, "p42");
            return (Criteria) this;
        }

        public Criteria andP42In(List<String> values) {
            addCriterion("P42 in", values, "p42");
            return (Criteria) this;
        }

        public Criteria andP42NotIn(List<String> values) {
            addCriterion("P42 not in", values, "p42");
            return (Criteria) this;
        }

        public Criteria andP42Between(String value1, String value2) {
            addCriterion("P42 between", value1, value2, "p42");
            return (Criteria) this;
        }

        public Criteria andP42NotBetween(String value1, String value2) {
            addCriterion("P42 not between", value1, value2, "p42");
            return (Criteria) this;
        }

        public Criteria andP43IsNull() {
            addCriterion("P43 is null");
            return (Criteria) this;
        }

        public Criteria andP43IsNotNull() {
            addCriterion("P43 is not null");
            return (Criteria) this;
        }

        public Criteria andP43EqualTo(String value) {
            addCriterion("P43 =", value, "p43");
            return (Criteria) this;
        }

        public Criteria andP43NotEqualTo(String value) {
            addCriterion("P43 <>", value, "p43");
            return (Criteria) this;
        }

        public Criteria andP43GreaterThan(String value) {
            addCriterion("P43 >", value, "p43");
            return (Criteria) this;
        }

        public Criteria andP43GreaterThanOrEqualTo(String value) {
            addCriterion("P43 >=", value, "p43");
            return (Criteria) this;
        }

        public Criteria andP43LessThan(String value) {
            addCriterion("P43 <", value, "p43");
            return (Criteria) this;
        }

        public Criteria andP43LessThanOrEqualTo(String value) {
            addCriterion("P43 <=", value, "p43");
            return (Criteria) this;
        }

        public Criteria andP43Like(String value) {
            addCriterion("P43 like", value, "p43");
            return (Criteria) this;
        }

        public Criteria andP43NotLike(String value) {
            addCriterion("P43 not like", value, "p43");
            return (Criteria) this;
        }

        public Criteria andP43In(List<String> values) {
            addCriterion("P43 in", values, "p43");
            return (Criteria) this;
        }

        public Criteria andP43NotIn(List<String> values) {
            addCriterion("P43 not in", values, "p43");
            return (Criteria) this;
        }

        public Criteria andP43Between(String value1, String value2) {
            addCriterion("P43 between", value1, value2, "p43");
            return (Criteria) this;
        }

        public Criteria andP43NotBetween(String value1, String value2) {
            addCriterion("P43 not between", value1, value2, "p43");
            return (Criteria) this;
        }

        public Criteria andP44IsNull() {
            addCriterion("P44 is null");
            return (Criteria) this;
        }

        public Criteria andP44IsNotNull() {
            addCriterion("P44 is not null");
            return (Criteria) this;
        }

        public Criteria andP44EqualTo(String value) {
            addCriterion("P44 =", value, "p44");
            return (Criteria) this;
        }

        public Criteria andP44NotEqualTo(String value) {
            addCriterion("P44 <>", value, "p44");
            return (Criteria) this;
        }

        public Criteria andP44GreaterThan(String value) {
            addCriterion("P44 >", value, "p44");
            return (Criteria) this;
        }

        public Criteria andP44GreaterThanOrEqualTo(String value) {
            addCriterion("P44 >=", value, "p44");
            return (Criteria) this;
        }

        public Criteria andP44LessThan(String value) {
            addCriterion("P44 <", value, "p44");
            return (Criteria) this;
        }

        public Criteria andP44LessThanOrEqualTo(String value) {
            addCriterion("P44 <=", value, "p44");
            return (Criteria) this;
        }

        public Criteria andP44Like(String value) {
            addCriterion("P44 like", value, "p44");
            return (Criteria) this;
        }

        public Criteria andP44NotLike(String value) {
            addCriterion("P44 not like", value, "p44");
            return (Criteria) this;
        }

        public Criteria andP44In(List<String> values) {
            addCriterion("P44 in", values, "p44");
            return (Criteria) this;
        }

        public Criteria andP44NotIn(List<String> values) {
            addCriterion("P44 not in", values, "p44");
            return (Criteria) this;
        }

        public Criteria andP44Between(String value1, String value2) {
            addCriterion("P44 between", value1, value2, "p44");
            return (Criteria) this;
        }

        public Criteria andP44NotBetween(String value1, String value2) {
            addCriterion("P44 not between", value1, value2, "p44");
            return (Criteria) this;
        }

        public Criteria andP45IsNull() {
            addCriterion("P45 is null");
            return (Criteria) this;
        }

        public Criteria andP45IsNotNull() {
            addCriterion("P45 is not null");
            return (Criteria) this;
        }

        public Criteria andP45EqualTo(String value) {
            addCriterion("P45 =", value, "p45");
            return (Criteria) this;
        }

        public Criteria andP45NotEqualTo(String value) {
            addCriterion("P45 <>", value, "p45");
            return (Criteria) this;
        }

        public Criteria andP45GreaterThan(String value) {
            addCriterion("P45 >", value, "p45");
            return (Criteria) this;
        }

        public Criteria andP45GreaterThanOrEqualTo(String value) {
            addCriterion("P45 >=", value, "p45");
            return (Criteria) this;
        }

        public Criteria andP45LessThan(String value) {
            addCriterion("P45 <", value, "p45");
            return (Criteria) this;
        }

        public Criteria andP45LessThanOrEqualTo(String value) {
            addCriterion("P45 <=", value, "p45");
            return (Criteria) this;
        }

        public Criteria andP45Like(String value) {
            addCriterion("P45 like", value, "p45");
            return (Criteria) this;
        }

        public Criteria andP45NotLike(String value) {
            addCriterion("P45 not like", value, "p45");
            return (Criteria) this;
        }

        public Criteria andP45In(List<String> values) {
            addCriterion("P45 in", values, "p45");
            return (Criteria) this;
        }

        public Criteria andP45NotIn(List<String> values) {
            addCriterion("P45 not in", values, "p45");
            return (Criteria) this;
        }

        public Criteria andP45Between(String value1, String value2) {
            addCriterion("P45 between", value1, value2, "p45");
            return (Criteria) this;
        }

        public Criteria andP45NotBetween(String value1, String value2) {
            addCriterion("P45 not between", value1, value2, "p45");
            return (Criteria) this;
        }

        public Criteria andP46IsNull() {
            addCriterion("P46 is null");
            return (Criteria) this;
        }

        public Criteria andP46IsNotNull() {
            addCriterion("P46 is not null");
            return (Criteria) this;
        }

        public Criteria andP46EqualTo(String value) {
            addCriterion("P46 =", value, "p46");
            return (Criteria) this;
        }

        public Criteria andP46NotEqualTo(String value) {
            addCriterion("P46 <>", value, "p46");
            return (Criteria) this;
        }

        public Criteria andP46GreaterThan(String value) {
            addCriterion("P46 >", value, "p46");
            return (Criteria) this;
        }

        public Criteria andP46GreaterThanOrEqualTo(String value) {
            addCriterion("P46 >=", value, "p46");
            return (Criteria) this;
        }

        public Criteria andP46LessThan(String value) {
            addCriterion("P46 <", value, "p46");
            return (Criteria) this;
        }

        public Criteria andP46LessThanOrEqualTo(String value) {
            addCriterion("P46 <=", value, "p46");
            return (Criteria) this;
        }

        public Criteria andP46Like(String value) {
            addCriterion("P46 like", value, "p46");
            return (Criteria) this;
        }

        public Criteria andP46NotLike(String value) {
            addCriterion("P46 not like", value, "p46");
            return (Criteria) this;
        }

        public Criteria andP46In(List<String> values) {
            addCriterion("P46 in", values, "p46");
            return (Criteria) this;
        }

        public Criteria andP46NotIn(List<String> values) {
            addCriterion("P46 not in", values, "p46");
            return (Criteria) this;
        }

        public Criteria andP46Between(String value1, String value2) {
            addCriterion("P46 between", value1, value2, "p46");
            return (Criteria) this;
        }

        public Criteria andP46NotBetween(String value1, String value2) {
            addCriterion("P46 not between", value1, value2, "p46");
            return (Criteria) this;
        }

        public Criteria andP47IsNull() {
            addCriterion("P47 is null");
            return (Criteria) this;
        }

        public Criteria andP47IsNotNull() {
            addCriterion("P47 is not null");
            return (Criteria) this;
        }

        public Criteria andP47EqualTo(String value) {
            addCriterion("P47 =", value, "p47");
            return (Criteria) this;
        }

        public Criteria andP47NotEqualTo(String value) {
            addCriterion("P47 <>", value, "p47");
            return (Criteria) this;
        }

        public Criteria andP47GreaterThan(String value) {
            addCriterion("P47 >", value, "p47");
            return (Criteria) this;
        }

        public Criteria andP47GreaterThanOrEqualTo(String value) {
            addCriterion("P47 >=", value, "p47");
            return (Criteria) this;
        }

        public Criteria andP47LessThan(String value) {
            addCriterion("P47 <", value, "p47");
            return (Criteria) this;
        }

        public Criteria andP47LessThanOrEqualTo(String value) {
            addCriterion("P47 <=", value, "p47");
            return (Criteria) this;
        }

        public Criteria andP47Like(String value) {
            addCriterion("P47 like", value, "p47");
            return (Criteria) this;
        }

        public Criteria andP47NotLike(String value) {
            addCriterion("P47 not like", value, "p47");
            return (Criteria) this;
        }

        public Criteria andP47In(List<String> values) {
            addCriterion("P47 in", values, "p47");
            return (Criteria) this;
        }

        public Criteria andP47NotIn(List<String> values) {
            addCriterion("P47 not in", values, "p47");
            return (Criteria) this;
        }

        public Criteria andP47Between(String value1, String value2) {
            addCriterion("P47 between", value1, value2, "p47");
            return (Criteria) this;
        }

        public Criteria andP47NotBetween(String value1, String value2) {
            addCriterion("P47 not between", value1, value2, "p47");
            return (Criteria) this;
        }

        public Criteria andP48IsNull() {
            addCriterion("P48 is null");
            return (Criteria) this;
        }

        public Criteria andP48IsNotNull() {
            addCriterion("P48 is not null");
            return (Criteria) this;
        }

        public Criteria andP48EqualTo(String value) {
            addCriterion("P48 =", value, "p48");
            return (Criteria) this;
        }

        public Criteria andP48NotEqualTo(String value) {
            addCriterion("P48 <>", value, "p48");
            return (Criteria) this;
        }

        public Criteria andP48GreaterThan(String value) {
            addCriterion("P48 >", value, "p48");
            return (Criteria) this;
        }

        public Criteria andP48GreaterThanOrEqualTo(String value) {
            addCriterion("P48 >=", value, "p48");
            return (Criteria) this;
        }

        public Criteria andP48LessThan(String value) {
            addCriterion("P48 <", value, "p48");
            return (Criteria) this;
        }

        public Criteria andP48LessThanOrEqualTo(String value) {
            addCriterion("P48 <=", value, "p48");
            return (Criteria) this;
        }

        public Criteria andP48Like(String value) {
            addCriterion("P48 like", value, "p48");
            return (Criteria) this;
        }

        public Criteria andP48NotLike(String value) {
            addCriterion("P48 not like", value, "p48");
            return (Criteria) this;
        }

        public Criteria andP48In(List<String> values) {
            addCriterion("P48 in", values, "p48");
            return (Criteria) this;
        }

        public Criteria andP48NotIn(List<String> values) {
            addCriterion("P48 not in", values, "p48");
            return (Criteria) this;
        }

        public Criteria andP48Between(String value1, String value2) {
            addCriterion("P48 between", value1, value2, "p48");
            return (Criteria) this;
        }

        public Criteria andP48NotBetween(String value1, String value2) {
            addCriterion("P48 not between", value1, value2, "p48");
            return (Criteria) this;
        }

        public Criteria andP49IsNull() {
            addCriterion("P49 is null");
            return (Criteria) this;
        }

        public Criteria andP49IsNotNull() {
            addCriterion("P49 is not null");
            return (Criteria) this;
        }

        public Criteria andP49EqualTo(String value) {
            addCriterion("P49 =", value, "p49");
            return (Criteria) this;
        }

        public Criteria andP49NotEqualTo(String value) {
            addCriterion("P49 <>", value, "p49");
            return (Criteria) this;
        }

        public Criteria andP49GreaterThan(String value) {
            addCriterion("P49 >", value, "p49");
            return (Criteria) this;
        }

        public Criteria andP49GreaterThanOrEqualTo(String value) {
            addCriterion("P49 >=", value, "p49");
            return (Criteria) this;
        }

        public Criteria andP49LessThan(String value) {
            addCriterion("P49 <", value, "p49");
            return (Criteria) this;
        }

        public Criteria andP49LessThanOrEqualTo(String value) {
            addCriterion("P49 <=", value, "p49");
            return (Criteria) this;
        }

        public Criteria andP49Like(String value) {
            addCriterion("P49 like", value, "p49");
            return (Criteria) this;
        }

        public Criteria andP49NotLike(String value) {
            addCriterion("P49 not like", value, "p49");
            return (Criteria) this;
        }

        public Criteria andP49In(List<String> values) {
            addCriterion("P49 in", values, "p49");
            return (Criteria) this;
        }

        public Criteria andP49NotIn(List<String> values) {
            addCriterion("P49 not in", values, "p49");
            return (Criteria) this;
        }

        public Criteria andP49Between(String value1, String value2) {
            addCriterion("P49 between", value1, value2, "p49");
            return (Criteria) this;
        }

        public Criteria andP49NotBetween(String value1, String value2) {
            addCriterion("P49 not between", value1, value2, "p49");
            return (Criteria) this;
        }

        public Criteria andP50IsNull() {
            addCriterion("P50 is null");
            return (Criteria) this;
        }

        public Criteria andP50IsNotNull() {
            addCriterion("P50 is not null");
            return (Criteria) this;
        }

        public Criteria andP50EqualTo(String value) {
            addCriterion("P50 =", value, "p50");
            return (Criteria) this;
        }

        public Criteria andP50NotEqualTo(String value) {
            addCriterion("P50 <>", value, "p50");
            return (Criteria) this;
        }

        public Criteria andP50GreaterThan(String value) {
            addCriterion("P50 >", value, "p50");
            return (Criteria) this;
        }

        public Criteria andP50GreaterThanOrEqualTo(String value) {
            addCriterion("P50 >=", value, "p50");
            return (Criteria) this;
        }

        public Criteria andP50LessThan(String value) {
            addCriterion("P50 <", value, "p50");
            return (Criteria) this;
        }

        public Criteria andP50LessThanOrEqualTo(String value) {
            addCriterion("P50 <=", value, "p50");
            return (Criteria) this;
        }

        public Criteria andP50Like(String value) {
            addCriterion("P50 like", value, "p50");
            return (Criteria) this;
        }

        public Criteria andP50NotLike(String value) {
            addCriterion("P50 not like", value, "p50");
            return (Criteria) this;
        }

        public Criteria andP50In(List<String> values) {
            addCriterion("P50 in", values, "p50");
            return (Criteria) this;
        }

        public Criteria andP50NotIn(List<String> values) {
            addCriterion("P50 not in", values, "p50");
            return (Criteria) this;
        }

        public Criteria andP50Between(String value1, String value2) {
            addCriterion("P50 between", value1, value2, "p50");
            return (Criteria) this;
        }

        public Criteria andP50NotBetween(String value1, String value2) {
            addCriterion("P50 not between", value1, value2, "p50");
            return (Criteria) this;
        }

        public Criteria andP51IsNull() {
            addCriterion("P51 is null");
            return (Criteria) this;
        }

        public Criteria andP51IsNotNull() {
            addCriterion("P51 is not null");
            return (Criteria) this;
        }

        public Criteria andP51EqualTo(String value) {
            addCriterion("P51 =", value, "p51");
            return (Criteria) this;
        }

        public Criteria andP51NotEqualTo(String value) {
            addCriterion("P51 <>", value, "p51");
            return (Criteria) this;
        }

        public Criteria andP51GreaterThan(String value) {
            addCriterion("P51 >", value, "p51");
            return (Criteria) this;
        }

        public Criteria andP51GreaterThanOrEqualTo(String value) {
            addCriterion("P51 >=", value, "p51");
            return (Criteria) this;
        }

        public Criteria andP51LessThan(String value) {
            addCriterion("P51 <", value, "p51");
            return (Criteria) this;
        }

        public Criteria andP51LessThanOrEqualTo(String value) {
            addCriterion("P51 <=", value, "p51");
            return (Criteria) this;
        }

        public Criteria andP51Like(String value) {
            addCriterion("P51 like", value, "p51");
            return (Criteria) this;
        }

        public Criteria andP51NotLike(String value) {
            addCriterion("P51 not like", value, "p51");
            return (Criteria) this;
        }

        public Criteria andP51In(List<String> values) {
            addCriterion("P51 in", values, "p51");
            return (Criteria) this;
        }

        public Criteria andP51NotIn(List<String> values) {
            addCriterion("P51 not in", values, "p51");
            return (Criteria) this;
        }

        public Criteria andP51Between(String value1, String value2) {
            addCriterion("P51 between", value1, value2, "p51");
            return (Criteria) this;
        }

        public Criteria andP51NotBetween(String value1, String value2) {
            addCriterion("P51 not between", value1, value2, "p51");
            return (Criteria) this;
        }

        public Criteria andP52IsNull() {
            addCriterion("P52 is null");
            return (Criteria) this;
        }

        public Criteria andP52IsNotNull() {
            addCriterion("P52 is not null");
            return (Criteria) this;
        }

        public Criteria andP52EqualTo(String value) {
            addCriterion("P52 =", value, "p52");
            return (Criteria) this;
        }

        public Criteria andP52NotEqualTo(String value) {
            addCriterion("P52 <>", value, "p52");
            return (Criteria) this;
        }

        public Criteria andP52GreaterThan(String value) {
            addCriterion("P52 >", value, "p52");
            return (Criteria) this;
        }

        public Criteria andP52GreaterThanOrEqualTo(String value) {
            addCriterion("P52 >=", value, "p52");
            return (Criteria) this;
        }

        public Criteria andP52LessThan(String value) {
            addCriterion("P52 <", value, "p52");
            return (Criteria) this;
        }

        public Criteria andP52LessThanOrEqualTo(String value) {
            addCriterion("P52 <=", value, "p52");
            return (Criteria) this;
        }

        public Criteria andP52Like(String value) {
            addCriterion("P52 like", value, "p52");
            return (Criteria) this;
        }

        public Criteria andP52NotLike(String value) {
            addCriterion("P52 not like", value, "p52");
            return (Criteria) this;
        }

        public Criteria andP52In(List<String> values) {
            addCriterion("P52 in", values, "p52");
            return (Criteria) this;
        }

        public Criteria andP52NotIn(List<String> values) {
            addCriterion("P52 not in", values, "p52");
            return (Criteria) this;
        }

        public Criteria andP52Between(String value1, String value2) {
            addCriterion("P52 between", value1, value2, "p52");
            return (Criteria) this;
        }

        public Criteria andP52NotBetween(String value1, String value2) {
            addCriterion("P52 not between", value1, value2, "p52");
            return (Criteria) this;
        }

        public Criteria andP53IsNull() {
            addCriterion("P53 is null");
            return (Criteria) this;
        }

        public Criteria andP53IsNotNull() {
            addCriterion("P53 is not null");
            return (Criteria) this;
        }

        public Criteria andP53EqualTo(String value) {
            addCriterion("P53 =", value, "p53");
            return (Criteria) this;
        }

        public Criteria andP53NotEqualTo(String value) {
            addCriterion("P53 <>", value, "p53");
            return (Criteria) this;
        }

        public Criteria andP53GreaterThan(String value) {
            addCriterion("P53 >", value, "p53");
            return (Criteria) this;
        }

        public Criteria andP53GreaterThanOrEqualTo(String value) {
            addCriterion("P53 >=", value, "p53");
            return (Criteria) this;
        }

        public Criteria andP53LessThan(String value) {
            addCriterion("P53 <", value, "p53");
            return (Criteria) this;
        }

        public Criteria andP53LessThanOrEqualTo(String value) {
            addCriterion("P53 <=", value, "p53");
            return (Criteria) this;
        }

        public Criteria andP53Like(String value) {
            addCriterion("P53 like", value, "p53");
            return (Criteria) this;
        }

        public Criteria andP53NotLike(String value) {
            addCriterion("P53 not like", value, "p53");
            return (Criteria) this;
        }

        public Criteria andP53In(List<String> values) {
            addCriterion("P53 in", values, "p53");
            return (Criteria) this;
        }

        public Criteria andP53NotIn(List<String> values) {
            addCriterion("P53 not in", values, "p53");
            return (Criteria) this;
        }

        public Criteria andP53Between(String value1, String value2) {
            addCriterion("P53 between", value1, value2, "p53");
            return (Criteria) this;
        }

        public Criteria andP53NotBetween(String value1, String value2) {
            addCriterion("P53 not between", value1, value2, "p53");
            return (Criteria) this;
        }

        public Criteria andP54IsNull() {
            addCriterion("P54 is null");
            return (Criteria) this;
        }

        public Criteria andP54IsNotNull() {
            addCriterion("P54 is not null");
            return (Criteria) this;
        }

        public Criteria andP54EqualTo(String value) {
            addCriterion("P54 =", value, "p54");
            return (Criteria) this;
        }

        public Criteria andP54NotEqualTo(String value) {
            addCriterion("P54 <>", value, "p54");
            return (Criteria) this;
        }

        public Criteria andP54GreaterThan(String value) {
            addCriterion("P54 >", value, "p54");
            return (Criteria) this;
        }

        public Criteria andP54GreaterThanOrEqualTo(String value) {
            addCriterion("P54 >=", value, "p54");
            return (Criteria) this;
        }

        public Criteria andP54LessThan(String value) {
            addCriterion("P54 <", value, "p54");
            return (Criteria) this;
        }

        public Criteria andP54LessThanOrEqualTo(String value) {
            addCriterion("P54 <=", value, "p54");
            return (Criteria) this;
        }

        public Criteria andP54Like(String value) {
            addCriterion("P54 like", value, "p54");
            return (Criteria) this;
        }

        public Criteria andP54NotLike(String value) {
            addCriterion("P54 not like", value, "p54");
            return (Criteria) this;
        }

        public Criteria andP54In(List<String> values) {
            addCriterion("P54 in", values, "p54");
            return (Criteria) this;
        }

        public Criteria andP54NotIn(List<String> values) {
            addCriterion("P54 not in", values, "p54");
            return (Criteria) this;
        }

        public Criteria andP54Between(String value1, String value2) {
            addCriterion("P54 between", value1, value2, "p54");
            return (Criteria) this;
        }

        public Criteria andP54NotBetween(String value1, String value2) {
            addCriterion("P54 not between", value1, value2, "p54");
            return (Criteria) this;
        }

        public Criteria andP55IsNull() {
            addCriterion("P55 is null");
            return (Criteria) this;
        }

        public Criteria andP55IsNotNull() {
            addCriterion("P55 is not null");
            return (Criteria) this;
        }

        public Criteria andP55EqualTo(String value) {
            addCriterion("P55 =", value, "p55");
            return (Criteria) this;
        }

        public Criteria andP55NotEqualTo(String value) {
            addCriterion("P55 <>", value, "p55");
            return (Criteria) this;
        }

        public Criteria andP55GreaterThan(String value) {
            addCriterion("P55 >", value, "p55");
            return (Criteria) this;
        }

        public Criteria andP55GreaterThanOrEqualTo(String value) {
            addCriterion("P55 >=", value, "p55");
            return (Criteria) this;
        }

        public Criteria andP55LessThan(String value) {
            addCriterion("P55 <", value, "p55");
            return (Criteria) this;
        }

        public Criteria andP55LessThanOrEqualTo(String value) {
            addCriterion("P55 <=", value, "p55");
            return (Criteria) this;
        }

        public Criteria andP55Like(String value) {
            addCriterion("P55 like", value, "p55");
            return (Criteria) this;
        }

        public Criteria andP55NotLike(String value) {
            addCriterion("P55 not like", value, "p55");
            return (Criteria) this;
        }

        public Criteria andP55In(List<String> values) {
            addCriterion("P55 in", values, "p55");
            return (Criteria) this;
        }

        public Criteria andP55NotIn(List<String> values) {
            addCriterion("P55 not in", values, "p55");
            return (Criteria) this;
        }

        public Criteria andP55Between(String value1, String value2) {
            addCriterion("P55 between", value1, value2, "p55");
            return (Criteria) this;
        }

        public Criteria andP55NotBetween(String value1, String value2) {
            addCriterion("P55 not between", value1, value2, "p55");
            return (Criteria) this;
        }

        public Criteria andP56IsNull() {
            addCriterion("P56 is null");
            return (Criteria) this;
        }

        public Criteria andP56IsNotNull() {
            addCriterion("P56 is not null");
            return (Criteria) this;
        }

        public Criteria andP56EqualTo(String value) {
            addCriterion("P56 =", value, "p56");
            return (Criteria) this;
        }

        public Criteria andP56NotEqualTo(String value) {
            addCriterion("P56 <>", value, "p56");
            return (Criteria) this;
        }

        public Criteria andP56GreaterThan(String value) {
            addCriterion("P56 >", value, "p56");
            return (Criteria) this;
        }

        public Criteria andP56GreaterThanOrEqualTo(String value) {
            addCriterion("P56 >=", value, "p56");
            return (Criteria) this;
        }

        public Criteria andP56LessThan(String value) {
            addCriterion("P56 <", value, "p56");
            return (Criteria) this;
        }

        public Criteria andP56LessThanOrEqualTo(String value) {
            addCriterion("P56 <=", value, "p56");
            return (Criteria) this;
        }

        public Criteria andP56Like(String value) {
            addCriterion("P56 like", value, "p56");
            return (Criteria) this;
        }

        public Criteria andP56NotLike(String value) {
            addCriterion("P56 not like", value, "p56");
            return (Criteria) this;
        }

        public Criteria andP56In(List<String> values) {
            addCriterion("P56 in", values, "p56");
            return (Criteria) this;
        }

        public Criteria andP56NotIn(List<String> values) {
            addCriterion("P56 not in", values, "p56");
            return (Criteria) this;
        }

        public Criteria andP56Between(String value1, String value2) {
            addCriterion("P56 between", value1, value2, "p56");
            return (Criteria) this;
        }

        public Criteria andP56NotBetween(String value1, String value2) {
            addCriterion("P56 not between", value1, value2, "p56");
            return (Criteria) this;
        }

        public Criteria andP57IsNull() {
            addCriterion("P57 is null");
            return (Criteria) this;
        }

        public Criteria andP57IsNotNull() {
            addCriterion("P57 is not null");
            return (Criteria) this;
        }

        public Criteria andP57EqualTo(String value) {
            addCriterion("P57 =", value, "p57");
            return (Criteria) this;
        }

        public Criteria andP57NotEqualTo(String value) {
            addCriterion("P57 <>", value, "p57");
            return (Criteria) this;
        }

        public Criteria andP57GreaterThan(String value) {
            addCriterion("P57 >", value, "p57");
            return (Criteria) this;
        }

        public Criteria andP57GreaterThanOrEqualTo(String value) {
            addCriterion("P57 >=", value, "p57");
            return (Criteria) this;
        }

        public Criteria andP57LessThan(String value) {
            addCriterion("P57 <", value, "p57");
            return (Criteria) this;
        }

        public Criteria andP57LessThanOrEqualTo(String value) {
            addCriterion("P57 <=", value, "p57");
            return (Criteria) this;
        }

        public Criteria andP57Like(String value) {
            addCriterion("P57 like", value, "p57");
            return (Criteria) this;
        }

        public Criteria andP57NotLike(String value) {
            addCriterion("P57 not like", value, "p57");
            return (Criteria) this;
        }

        public Criteria andP57In(List<String> values) {
            addCriterion("P57 in", values, "p57");
            return (Criteria) this;
        }

        public Criteria andP57NotIn(List<String> values) {
            addCriterion("P57 not in", values, "p57");
            return (Criteria) this;
        }

        public Criteria andP57Between(String value1, String value2) {
            addCriterion("P57 between", value1, value2, "p57");
            return (Criteria) this;
        }

        public Criteria andP57NotBetween(String value1, String value2) {
            addCriterion("P57 not between", value1, value2, "p57");
            return (Criteria) this;
        }

        public Criteria andP58IsNull() {
            addCriterion("P58 is null");
            return (Criteria) this;
        }

        public Criteria andP58IsNotNull() {
            addCriterion("P58 is not null");
            return (Criteria) this;
        }

        public Criteria andP58EqualTo(String value) {
            addCriterion("P58 =", value, "p58");
            return (Criteria) this;
        }

        public Criteria andP58NotEqualTo(String value) {
            addCriterion("P58 <>", value, "p58");
            return (Criteria) this;
        }

        public Criteria andP58GreaterThan(String value) {
            addCriterion("P58 >", value, "p58");
            return (Criteria) this;
        }

        public Criteria andP58GreaterThanOrEqualTo(String value) {
            addCriterion("P58 >=", value, "p58");
            return (Criteria) this;
        }

        public Criteria andP58LessThan(String value) {
            addCriterion("P58 <", value, "p58");
            return (Criteria) this;
        }

        public Criteria andP58LessThanOrEqualTo(String value) {
            addCriterion("P58 <=", value, "p58");
            return (Criteria) this;
        }

        public Criteria andP58Like(String value) {
            addCriterion("P58 like", value, "p58");
            return (Criteria) this;
        }

        public Criteria andP58NotLike(String value) {
            addCriterion("P58 not like", value, "p58");
            return (Criteria) this;
        }

        public Criteria andP58In(List<String> values) {
            addCriterion("P58 in", values, "p58");
            return (Criteria) this;
        }

        public Criteria andP58NotIn(List<String> values) {
            addCriterion("P58 not in", values, "p58");
            return (Criteria) this;
        }

        public Criteria andP58Between(String value1, String value2) {
            addCriterion("P58 between", value1, value2, "p58");
            return (Criteria) this;
        }

        public Criteria andP58NotBetween(String value1, String value2) {
            addCriterion("P58 not between", value1, value2, "p58");
            return (Criteria) this;
        }

        public Criteria andP59IsNull() {
            addCriterion("P59 is null");
            return (Criteria) this;
        }

        public Criteria andP59IsNotNull() {
            addCriterion("P59 is not null");
            return (Criteria) this;
        }

        public Criteria andP59EqualTo(String value) {
            addCriterion("P59 =", value, "p59");
            return (Criteria) this;
        }

        public Criteria andP59NotEqualTo(String value) {
            addCriterion("P59 <>", value, "p59");
            return (Criteria) this;
        }

        public Criteria andP59GreaterThan(String value) {
            addCriterion("P59 >", value, "p59");
            return (Criteria) this;
        }

        public Criteria andP59GreaterThanOrEqualTo(String value) {
            addCriterion("P59 >=", value, "p59");
            return (Criteria) this;
        }

        public Criteria andP59LessThan(String value) {
            addCriterion("P59 <", value, "p59");
            return (Criteria) this;
        }

        public Criteria andP59LessThanOrEqualTo(String value) {
            addCriterion("P59 <=", value, "p59");
            return (Criteria) this;
        }

        public Criteria andP59Like(String value) {
            addCriterion("P59 like", value, "p59");
            return (Criteria) this;
        }

        public Criteria andP59NotLike(String value) {
            addCriterion("P59 not like", value, "p59");
            return (Criteria) this;
        }

        public Criteria andP59In(List<String> values) {
            addCriterion("P59 in", values, "p59");
            return (Criteria) this;
        }

        public Criteria andP59NotIn(List<String> values) {
            addCriterion("P59 not in", values, "p59");
            return (Criteria) this;
        }

        public Criteria andP59Between(String value1, String value2) {
            addCriterion("P59 between", value1, value2, "p59");
            return (Criteria) this;
        }

        public Criteria andP59NotBetween(String value1, String value2) {
            addCriterion("P59 not between", value1, value2, "p59");
            return (Criteria) this;
        }

        public Criteria andP60IsNull() {
            addCriterion("P60 is null");
            return (Criteria) this;
        }

        public Criteria andP60IsNotNull() {
            addCriterion("P60 is not null");
            return (Criteria) this;
        }

        public Criteria andP60EqualTo(String value) {
            addCriterion("P60 =", value, "p60");
            return (Criteria) this;
        }

        public Criteria andP60NotEqualTo(String value) {
            addCriterion("P60 <>", value, "p60");
            return (Criteria) this;
        }

        public Criteria andP60GreaterThan(String value) {
            addCriterion("P60 >", value, "p60");
            return (Criteria) this;
        }

        public Criteria andP60GreaterThanOrEqualTo(String value) {
            addCriterion("P60 >=", value, "p60");
            return (Criteria) this;
        }

        public Criteria andP60LessThan(String value) {
            addCriterion("P60 <", value, "p60");
            return (Criteria) this;
        }

        public Criteria andP60LessThanOrEqualTo(String value) {
            addCriterion("P60 <=", value, "p60");
            return (Criteria) this;
        }

        public Criteria andP60Like(String value) {
            addCriterion("P60 like", value, "p60");
            return (Criteria) this;
        }

        public Criteria andP60NotLike(String value) {
            addCriterion("P60 not like", value, "p60");
            return (Criteria) this;
        }

        public Criteria andP60In(List<String> values) {
            addCriterion("P60 in", values, "p60");
            return (Criteria) this;
        }

        public Criteria andP60NotIn(List<String> values) {
            addCriterion("P60 not in", values, "p60");
            return (Criteria) this;
        }

        public Criteria andP60Between(String value1, String value2) {
            addCriterion("P60 between", value1, value2, "p60");
            return (Criteria) this;
        }

        public Criteria andP60NotBetween(String value1, String value2) {
            addCriterion("P60 not between", value1, value2, "p60");
            return (Criteria) this;
        }

        public Criteria andP61IsNull() {
            addCriterion("P61 is null");
            return (Criteria) this;
        }

        public Criteria andP61IsNotNull() {
            addCriterion("P61 is not null");
            return (Criteria) this;
        }

        public Criteria andP61EqualTo(BigDecimal value) {
            addCriterion("P61 =", value, "p61");
            return (Criteria) this;
        }

        public Criteria andP61NotEqualTo(BigDecimal value) {
            addCriterion("P61 <>", value, "p61");
            return (Criteria) this;
        }

        public Criteria andP61GreaterThan(BigDecimal value) {
            addCriterion("P61 >", value, "p61");
            return (Criteria) this;
        }

        public Criteria andP61GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P61 >=", value, "p61");
            return (Criteria) this;
        }

        public Criteria andP61LessThan(BigDecimal value) {
            addCriterion("P61 <", value, "p61");
            return (Criteria) this;
        }

        public Criteria andP61LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P61 <=", value, "p61");
            return (Criteria) this;
        }

        public Criteria andP61In(List<BigDecimal> values) {
            addCriterion("P61 in", values, "p61");
            return (Criteria) this;
        }

        public Criteria andP61NotIn(List<BigDecimal> values) {
            addCriterion("P61 not in", values, "p61");
            return (Criteria) this;
        }

        public Criteria andP61Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P61 between", value1, value2, "p61");
            return (Criteria) this;
        }

        public Criteria andP61NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P61 not between", value1, value2, "p61");
            return (Criteria) this;
        }

        public Criteria andP62IsNull() {
            addCriterion("P62 is null");
            return (Criteria) this;
        }

        public Criteria andP62IsNotNull() {
            addCriterion("P62 is not null");
            return (Criteria) this;
        }

        public Criteria andP62EqualTo(BigDecimal value) {
            addCriterion("P62 =", value, "p62");
            return (Criteria) this;
        }

        public Criteria andP62NotEqualTo(BigDecimal value) {
            addCriterion("P62 <>", value, "p62");
            return (Criteria) this;
        }

        public Criteria andP62GreaterThan(BigDecimal value) {
            addCriterion("P62 >", value, "p62");
            return (Criteria) this;
        }

        public Criteria andP62GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P62 >=", value, "p62");
            return (Criteria) this;
        }

        public Criteria andP62LessThan(BigDecimal value) {
            addCriterion("P62 <", value, "p62");
            return (Criteria) this;
        }

        public Criteria andP62LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P62 <=", value, "p62");
            return (Criteria) this;
        }

        public Criteria andP62In(List<BigDecimal> values) {
            addCriterion("P62 in", values, "p62");
            return (Criteria) this;
        }

        public Criteria andP62NotIn(List<BigDecimal> values) {
            addCriterion("P62 not in", values, "p62");
            return (Criteria) this;
        }

        public Criteria andP62Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P62 between", value1, value2, "p62");
            return (Criteria) this;
        }

        public Criteria andP62NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P62 not between", value1, value2, "p62");
            return (Criteria) this;
        }

        public Criteria andP63IsNull() {
            addCriterion("P63 is null");
            return (Criteria) this;
        }

        public Criteria andP63IsNotNull() {
            addCriterion("P63 is not null");
            return (Criteria) this;
        }

        public Criteria andP63EqualTo(BigDecimal value) {
            addCriterion("P63 =", value, "p63");
            return (Criteria) this;
        }

        public Criteria andP63NotEqualTo(BigDecimal value) {
            addCriterion("P63 <>", value, "p63");
            return (Criteria) this;
        }

        public Criteria andP63GreaterThan(BigDecimal value) {
            addCriterion("P63 >", value, "p63");
            return (Criteria) this;
        }

        public Criteria andP63GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P63 >=", value, "p63");
            return (Criteria) this;
        }

        public Criteria andP63LessThan(BigDecimal value) {
            addCriterion("P63 <", value, "p63");
            return (Criteria) this;
        }

        public Criteria andP63LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P63 <=", value, "p63");
            return (Criteria) this;
        }

        public Criteria andP63In(List<BigDecimal> values) {
            addCriterion("P63 in", values, "p63");
            return (Criteria) this;
        }

        public Criteria andP63NotIn(List<BigDecimal> values) {
            addCriterion("P63 not in", values, "p63");
            return (Criteria) this;
        }

        public Criteria andP63Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P63 between", value1, value2, "p63");
            return (Criteria) this;
        }

        public Criteria andP63NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P63 not between", value1, value2, "p63");
            return (Criteria) this;
        }

        public Criteria andP64IsNull() {
            addCriterion("P64 is null");
            return (Criteria) this;
        }

        public Criteria andP64IsNotNull() {
            addCriterion("P64 is not null");
            return (Criteria) this;
        }

        public Criteria andP64EqualTo(BigDecimal value) {
            addCriterion("P64 =", value, "p64");
            return (Criteria) this;
        }

        public Criteria andP64NotEqualTo(BigDecimal value) {
            addCriterion("P64 <>", value, "p64");
            return (Criteria) this;
        }

        public Criteria andP64GreaterThan(BigDecimal value) {
            addCriterion("P64 >", value, "p64");
            return (Criteria) this;
        }

        public Criteria andP64GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P64 >=", value, "p64");
            return (Criteria) this;
        }

        public Criteria andP64LessThan(BigDecimal value) {
            addCriterion("P64 <", value, "p64");
            return (Criteria) this;
        }

        public Criteria andP64LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P64 <=", value, "p64");
            return (Criteria) this;
        }

        public Criteria andP64In(List<BigDecimal> values) {
            addCriterion("P64 in", values, "p64");
            return (Criteria) this;
        }

        public Criteria andP64NotIn(List<BigDecimal> values) {
            addCriterion("P64 not in", values, "p64");
            return (Criteria) this;
        }

        public Criteria andP64Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P64 between", value1, value2, "p64");
            return (Criteria) this;
        }

        public Criteria andP64NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P64 not between", value1, value2, "p64");
            return (Criteria) this;
        }

        public Criteria andP65IsNull() {
            addCriterion("P65 is null");
            return (Criteria) this;
        }

        public Criteria andP65IsNotNull() {
            addCriterion("P65 is not null");
            return (Criteria) this;
        }

        public Criteria andP65EqualTo(BigDecimal value) {
            addCriterion("P65 =", value, "p65");
            return (Criteria) this;
        }

        public Criteria andP65NotEqualTo(BigDecimal value) {
            addCriterion("P65 <>", value, "p65");
            return (Criteria) this;
        }

        public Criteria andP65GreaterThan(BigDecimal value) {
            addCriterion("P65 >", value, "p65");
            return (Criteria) this;
        }

        public Criteria andP65GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P65 >=", value, "p65");
            return (Criteria) this;
        }

        public Criteria andP65LessThan(BigDecimal value) {
            addCriterion("P65 <", value, "p65");
            return (Criteria) this;
        }

        public Criteria andP65LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P65 <=", value, "p65");
            return (Criteria) this;
        }

        public Criteria andP65In(List<BigDecimal> values) {
            addCriterion("P65 in", values, "p65");
            return (Criteria) this;
        }

        public Criteria andP65NotIn(List<BigDecimal> values) {
            addCriterion("P65 not in", values, "p65");
            return (Criteria) this;
        }

        public Criteria andP65Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P65 between", value1, value2, "p65");
            return (Criteria) this;
        }

        public Criteria andP65NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P65 not between", value1, value2, "p65");
            return (Criteria) this;
        }

        public Criteria andP66IsNull() {
            addCriterion("P66 is null");
            return (Criteria) this;
        }

        public Criteria andP66IsNotNull() {
            addCriterion("P66 is not null");
            return (Criteria) this;
        }

        public Criteria andP66EqualTo(BigDecimal value) {
            addCriterion("P66 =", value, "p66");
            return (Criteria) this;
        }

        public Criteria andP66NotEqualTo(BigDecimal value) {
            addCriterion("P66 <>", value, "p66");
            return (Criteria) this;
        }

        public Criteria andP66GreaterThan(BigDecimal value) {
            addCriterion("P66 >", value, "p66");
            return (Criteria) this;
        }

        public Criteria andP66GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P66 >=", value, "p66");
            return (Criteria) this;
        }

        public Criteria andP66LessThan(BigDecimal value) {
            addCriterion("P66 <", value, "p66");
            return (Criteria) this;
        }

        public Criteria andP66LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P66 <=", value, "p66");
            return (Criteria) this;
        }

        public Criteria andP66In(List<BigDecimal> values) {
            addCriterion("P66 in", values, "p66");
            return (Criteria) this;
        }

        public Criteria andP66NotIn(List<BigDecimal> values) {
            addCriterion("P66 not in", values, "p66");
            return (Criteria) this;
        }

        public Criteria andP66Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P66 between", value1, value2, "p66");
            return (Criteria) this;
        }

        public Criteria andP66NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P66 not between", value1, value2, "p66");
            return (Criteria) this;
        }

        public Criteria andP67IsNull() {
            addCriterion("P67 is null");
            return (Criteria) this;
        }

        public Criteria andP67IsNotNull() {
            addCriterion("P67 is not null");
            return (Criteria) this;
        }

        public Criteria andP67EqualTo(BigDecimal value) {
            addCriterion("P67 =", value, "p67");
            return (Criteria) this;
        }

        public Criteria andP67NotEqualTo(BigDecimal value) {
            addCriterion("P67 <>", value, "p67");
            return (Criteria) this;
        }

        public Criteria andP67GreaterThan(BigDecimal value) {
            addCriterion("P67 >", value, "p67");
            return (Criteria) this;
        }

        public Criteria andP67GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P67 >=", value, "p67");
            return (Criteria) this;
        }

        public Criteria andP67LessThan(BigDecimal value) {
            addCriterion("P67 <", value, "p67");
            return (Criteria) this;
        }

        public Criteria andP67LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P67 <=", value, "p67");
            return (Criteria) this;
        }

        public Criteria andP67In(List<BigDecimal> values) {
            addCriterion("P67 in", values, "p67");
            return (Criteria) this;
        }

        public Criteria andP67NotIn(List<BigDecimal> values) {
            addCriterion("P67 not in", values, "p67");
            return (Criteria) this;
        }

        public Criteria andP67Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P67 between", value1, value2, "p67");
            return (Criteria) this;
        }

        public Criteria andP67NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P67 not between", value1, value2, "p67");
            return (Criteria) this;
        }

        public Criteria andP68IsNull() {
            addCriterion("P68 is null");
            return (Criteria) this;
        }

        public Criteria andP68IsNotNull() {
            addCriterion("P68 is not null");
            return (Criteria) this;
        }

        public Criteria andP68EqualTo(BigDecimal value) {
            addCriterion("P68 =", value, "p68");
            return (Criteria) this;
        }

        public Criteria andP68NotEqualTo(BigDecimal value) {
            addCriterion("P68 <>", value, "p68");
            return (Criteria) this;
        }

        public Criteria andP68GreaterThan(BigDecimal value) {
            addCriterion("P68 >", value, "p68");
            return (Criteria) this;
        }

        public Criteria andP68GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P68 >=", value, "p68");
            return (Criteria) this;
        }

        public Criteria andP68LessThan(BigDecimal value) {
            addCriterion("P68 <", value, "p68");
            return (Criteria) this;
        }

        public Criteria andP68LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P68 <=", value, "p68");
            return (Criteria) this;
        }

        public Criteria andP68In(List<BigDecimal> values) {
            addCriterion("P68 in", values, "p68");
            return (Criteria) this;
        }

        public Criteria andP68NotIn(List<BigDecimal> values) {
            addCriterion("P68 not in", values, "p68");
            return (Criteria) this;
        }

        public Criteria andP68Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P68 between", value1, value2, "p68");
            return (Criteria) this;
        }

        public Criteria andP68NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P68 not between", value1, value2, "p68");
            return (Criteria) this;
        }

        public Criteria andP69IsNull() {
            addCriterion("P69 is null");
            return (Criteria) this;
        }

        public Criteria andP69IsNotNull() {
            addCriterion("P69 is not null");
            return (Criteria) this;
        }

        public Criteria andP69EqualTo(BigDecimal value) {
            addCriterion("P69 =", value, "p69");
            return (Criteria) this;
        }

        public Criteria andP69NotEqualTo(BigDecimal value) {
            addCriterion("P69 <>", value, "p69");
            return (Criteria) this;
        }

        public Criteria andP69GreaterThan(BigDecimal value) {
            addCriterion("P69 >", value, "p69");
            return (Criteria) this;
        }

        public Criteria andP69GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P69 >=", value, "p69");
            return (Criteria) this;
        }

        public Criteria andP69LessThan(BigDecimal value) {
            addCriterion("P69 <", value, "p69");
            return (Criteria) this;
        }

        public Criteria andP69LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P69 <=", value, "p69");
            return (Criteria) this;
        }

        public Criteria andP69In(List<BigDecimal> values) {
            addCriterion("P69 in", values, "p69");
            return (Criteria) this;
        }

        public Criteria andP69NotIn(List<BigDecimal> values) {
            addCriterion("P69 not in", values, "p69");
            return (Criteria) this;
        }

        public Criteria andP69Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P69 between", value1, value2, "p69");
            return (Criteria) this;
        }

        public Criteria andP69NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P69 not between", value1, value2, "p69");
            return (Criteria) this;
        }

        public Criteria andP70IsNull() {
            addCriterion("P70 is null");
            return (Criteria) this;
        }

        public Criteria andP70IsNotNull() {
            addCriterion("P70 is not null");
            return (Criteria) this;
        }

        public Criteria andP70EqualTo(BigDecimal value) {
            addCriterion("P70 =", value, "p70");
            return (Criteria) this;
        }

        public Criteria andP70NotEqualTo(BigDecimal value) {
            addCriterion("P70 <>", value, "p70");
            return (Criteria) this;
        }

        public Criteria andP70GreaterThan(BigDecimal value) {
            addCriterion("P70 >", value, "p70");
            return (Criteria) this;
        }

        public Criteria andP70GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P70 >=", value, "p70");
            return (Criteria) this;
        }

        public Criteria andP70LessThan(BigDecimal value) {
            addCriterion("P70 <", value, "p70");
            return (Criteria) this;
        }

        public Criteria andP70LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P70 <=", value, "p70");
            return (Criteria) this;
        }

        public Criteria andP70In(List<BigDecimal> values) {
            addCriterion("P70 in", values, "p70");
            return (Criteria) this;
        }

        public Criteria andP70NotIn(List<BigDecimal> values) {
            addCriterion("P70 not in", values, "p70");
            return (Criteria) this;
        }

        public Criteria andP70Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P70 between", value1, value2, "p70");
            return (Criteria) this;
        }

        public Criteria andP70NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P70 not between", value1, value2, "p70");
            return (Criteria) this;
        }

        public Criteria andP71IsNull() {
            addCriterion("P71 is null");
            return (Criteria) this;
        }

        public Criteria andP71IsNotNull() {
            addCriterion("P71 is not null");
            return (Criteria) this;
        }

        public Criteria andP71EqualTo(BigDecimal value) {
            addCriterion("P71 =", value, "p71");
            return (Criteria) this;
        }

        public Criteria andP71NotEqualTo(BigDecimal value) {
            addCriterion("P71 <>", value, "p71");
            return (Criteria) this;
        }

        public Criteria andP71GreaterThan(BigDecimal value) {
            addCriterion("P71 >", value, "p71");
            return (Criteria) this;
        }

        public Criteria andP71GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P71 >=", value, "p71");
            return (Criteria) this;
        }

        public Criteria andP71LessThan(BigDecimal value) {
            addCriterion("P71 <", value, "p71");
            return (Criteria) this;
        }

        public Criteria andP71LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P71 <=", value, "p71");
            return (Criteria) this;
        }

        public Criteria andP71In(List<BigDecimal> values) {
            addCriterion("P71 in", values, "p71");
            return (Criteria) this;
        }

        public Criteria andP71NotIn(List<BigDecimal> values) {
            addCriterion("P71 not in", values, "p71");
            return (Criteria) this;
        }

        public Criteria andP71Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P71 between", value1, value2, "p71");
            return (Criteria) this;
        }

        public Criteria andP71NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P71 not between", value1, value2, "p71");
            return (Criteria) this;
        }

        public Criteria andP72IsNull() {
            addCriterion("P72 is null");
            return (Criteria) this;
        }

        public Criteria andP72IsNotNull() {
            addCriterion("P72 is not null");
            return (Criteria) this;
        }

        public Criteria andP72EqualTo(BigDecimal value) {
            addCriterion("P72 =", value, "p72");
            return (Criteria) this;
        }

        public Criteria andP72NotEqualTo(BigDecimal value) {
            addCriterion("P72 <>", value, "p72");
            return (Criteria) this;
        }

        public Criteria andP72GreaterThan(BigDecimal value) {
            addCriterion("P72 >", value, "p72");
            return (Criteria) this;
        }

        public Criteria andP72GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P72 >=", value, "p72");
            return (Criteria) this;
        }

        public Criteria andP72LessThan(BigDecimal value) {
            addCriterion("P72 <", value, "p72");
            return (Criteria) this;
        }

        public Criteria andP72LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P72 <=", value, "p72");
            return (Criteria) this;
        }

        public Criteria andP72In(List<BigDecimal> values) {
            addCriterion("P72 in", values, "p72");
            return (Criteria) this;
        }

        public Criteria andP72NotIn(List<BigDecimal> values) {
            addCriterion("P72 not in", values, "p72");
            return (Criteria) this;
        }

        public Criteria andP72Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P72 between", value1, value2, "p72");
            return (Criteria) this;
        }

        public Criteria andP72NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P72 not between", value1, value2, "p72");
            return (Criteria) this;
        }

        public Criteria andP73IsNull() {
            addCriterion("P73 is null");
            return (Criteria) this;
        }

        public Criteria andP73IsNotNull() {
            addCriterion("P73 is not null");
            return (Criteria) this;
        }

        public Criteria andP73EqualTo(BigDecimal value) {
            addCriterion("P73 =", value, "p73");
            return (Criteria) this;
        }

        public Criteria andP73NotEqualTo(BigDecimal value) {
            addCriterion("P73 <>", value, "p73");
            return (Criteria) this;
        }

        public Criteria andP73GreaterThan(BigDecimal value) {
            addCriterion("P73 >", value, "p73");
            return (Criteria) this;
        }

        public Criteria andP73GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P73 >=", value, "p73");
            return (Criteria) this;
        }

        public Criteria andP73LessThan(BigDecimal value) {
            addCriterion("P73 <", value, "p73");
            return (Criteria) this;
        }

        public Criteria andP73LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P73 <=", value, "p73");
            return (Criteria) this;
        }

        public Criteria andP73In(List<BigDecimal> values) {
            addCriterion("P73 in", values, "p73");
            return (Criteria) this;
        }

        public Criteria andP73NotIn(List<BigDecimal> values) {
            addCriterion("P73 not in", values, "p73");
            return (Criteria) this;
        }

        public Criteria andP73Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P73 between", value1, value2, "p73");
            return (Criteria) this;
        }

        public Criteria andP73NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P73 not between", value1, value2, "p73");
            return (Criteria) this;
        }

        public Criteria andP74IsNull() {
            addCriterion("P74 is null");
            return (Criteria) this;
        }

        public Criteria andP74IsNotNull() {
            addCriterion("P74 is not null");
            return (Criteria) this;
        }

        public Criteria andP74EqualTo(BigDecimal value) {
            addCriterion("P74 =", value, "p74");
            return (Criteria) this;
        }

        public Criteria andP74NotEqualTo(BigDecimal value) {
            addCriterion("P74 <>", value, "p74");
            return (Criteria) this;
        }

        public Criteria andP74GreaterThan(BigDecimal value) {
            addCriterion("P74 >", value, "p74");
            return (Criteria) this;
        }

        public Criteria andP74GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P74 >=", value, "p74");
            return (Criteria) this;
        }

        public Criteria andP74LessThan(BigDecimal value) {
            addCriterion("P74 <", value, "p74");
            return (Criteria) this;
        }

        public Criteria andP74LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P74 <=", value, "p74");
            return (Criteria) this;
        }

        public Criteria andP74In(List<BigDecimal> values) {
            addCriterion("P74 in", values, "p74");
            return (Criteria) this;
        }

        public Criteria andP74NotIn(List<BigDecimal> values) {
            addCriterion("P74 not in", values, "p74");
            return (Criteria) this;
        }

        public Criteria andP74Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P74 between", value1, value2, "p74");
            return (Criteria) this;
        }

        public Criteria andP74NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P74 not between", value1, value2, "p74");
            return (Criteria) this;
        }

        public Criteria andP75IsNull() {
            addCriterion("P75 is null");
            return (Criteria) this;
        }

        public Criteria andP75IsNotNull() {
            addCriterion("P75 is not null");
            return (Criteria) this;
        }

        public Criteria andP75EqualTo(BigDecimal value) {
            addCriterion("P75 =", value, "p75");
            return (Criteria) this;
        }

        public Criteria andP75NotEqualTo(BigDecimal value) {
            addCriterion("P75 <>", value, "p75");
            return (Criteria) this;
        }

        public Criteria andP75GreaterThan(BigDecimal value) {
            addCriterion("P75 >", value, "p75");
            return (Criteria) this;
        }

        public Criteria andP75GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P75 >=", value, "p75");
            return (Criteria) this;
        }

        public Criteria andP75LessThan(BigDecimal value) {
            addCriterion("P75 <", value, "p75");
            return (Criteria) this;
        }

        public Criteria andP75LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P75 <=", value, "p75");
            return (Criteria) this;
        }

        public Criteria andP75In(List<BigDecimal> values) {
            addCriterion("P75 in", values, "p75");
            return (Criteria) this;
        }

        public Criteria andP75NotIn(List<BigDecimal> values) {
            addCriterion("P75 not in", values, "p75");
            return (Criteria) this;
        }

        public Criteria andP75Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P75 between", value1, value2, "p75");
            return (Criteria) this;
        }

        public Criteria andP75NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P75 not between", value1, value2, "p75");
            return (Criteria) this;
        }

        public Criteria andP76IsNull() {
            addCriterion("P76 is null");
            return (Criteria) this;
        }

        public Criteria andP76IsNotNull() {
            addCriterion("P76 is not null");
            return (Criteria) this;
        }

        public Criteria andP76EqualTo(BigDecimal value) {
            addCriterion("P76 =", value, "p76");
            return (Criteria) this;
        }

        public Criteria andP76NotEqualTo(BigDecimal value) {
            addCriterion("P76 <>", value, "p76");
            return (Criteria) this;
        }

        public Criteria andP76GreaterThan(BigDecimal value) {
            addCriterion("P76 >", value, "p76");
            return (Criteria) this;
        }

        public Criteria andP76GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P76 >=", value, "p76");
            return (Criteria) this;
        }

        public Criteria andP76LessThan(BigDecimal value) {
            addCriterion("P76 <", value, "p76");
            return (Criteria) this;
        }

        public Criteria andP76LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P76 <=", value, "p76");
            return (Criteria) this;
        }

        public Criteria andP76In(List<BigDecimal> values) {
            addCriterion("P76 in", values, "p76");
            return (Criteria) this;
        }

        public Criteria andP76NotIn(List<BigDecimal> values) {
            addCriterion("P76 not in", values, "p76");
            return (Criteria) this;
        }

        public Criteria andP76Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P76 between", value1, value2, "p76");
            return (Criteria) this;
        }

        public Criteria andP76NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P76 not between", value1, value2, "p76");
            return (Criteria) this;
        }

        public Criteria andP77IsNull() {
            addCriterion("P77 is null");
            return (Criteria) this;
        }

        public Criteria andP77IsNotNull() {
            addCriterion("P77 is not null");
            return (Criteria) this;
        }

        public Criteria andP77EqualTo(BigDecimal value) {
            addCriterion("P77 =", value, "p77");
            return (Criteria) this;
        }

        public Criteria andP77NotEqualTo(BigDecimal value) {
            addCriterion("P77 <>", value, "p77");
            return (Criteria) this;
        }

        public Criteria andP77GreaterThan(BigDecimal value) {
            addCriterion("P77 >", value, "p77");
            return (Criteria) this;
        }

        public Criteria andP77GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P77 >=", value, "p77");
            return (Criteria) this;
        }

        public Criteria andP77LessThan(BigDecimal value) {
            addCriterion("P77 <", value, "p77");
            return (Criteria) this;
        }

        public Criteria andP77LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P77 <=", value, "p77");
            return (Criteria) this;
        }

        public Criteria andP77In(List<BigDecimal> values) {
            addCriterion("P77 in", values, "p77");
            return (Criteria) this;
        }

        public Criteria andP77NotIn(List<BigDecimal> values) {
            addCriterion("P77 not in", values, "p77");
            return (Criteria) this;
        }

        public Criteria andP77Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P77 between", value1, value2, "p77");
            return (Criteria) this;
        }

        public Criteria andP77NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P77 not between", value1, value2, "p77");
            return (Criteria) this;
        }

        public Criteria andP78IsNull() {
            addCriterion("P78 is null");
            return (Criteria) this;
        }

        public Criteria andP78IsNotNull() {
            addCriterion("P78 is not null");
            return (Criteria) this;
        }

        public Criteria andP78EqualTo(BigDecimal value) {
            addCriterion("P78 =", value, "p78");
            return (Criteria) this;
        }

        public Criteria andP78NotEqualTo(BigDecimal value) {
            addCriterion("P78 <>", value, "p78");
            return (Criteria) this;
        }

        public Criteria andP78GreaterThan(BigDecimal value) {
            addCriterion("P78 >", value, "p78");
            return (Criteria) this;
        }

        public Criteria andP78GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P78 >=", value, "p78");
            return (Criteria) this;
        }

        public Criteria andP78LessThan(BigDecimal value) {
            addCriterion("P78 <", value, "p78");
            return (Criteria) this;
        }

        public Criteria andP78LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P78 <=", value, "p78");
            return (Criteria) this;
        }

        public Criteria andP78In(List<BigDecimal> values) {
            addCriterion("P78 in", values, "p78");
            return (Criteria) this;
        }

        public Criteria andP78NotIn(List<BigDecimal> values) {
            addCriterion("P78 not in", values, "p78");
            return (Criteria) this;
        }

        public Criteria andP78Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P78 between", value1, value2, "p78");
            return (Criteria) this;
        }

        public Criteria andP78NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P78 not between", value1, value2, "p78");
            return (Criteria) this;
        }

        public Criteria andP79IsNull() {
            addCriterion("P79 is null");
            return (Criteria) this;
        }

        public Criteria andP79IsNotNull() {
            addCriterion("P79 is not null");
            return (Criteria) this;
        }

        public Criteria andP79EqualTo(BigDecimal value) {
            addCriterion("P79 =", value, "p79");
            return (Criteria) this;
        }

        public Criteria andP79NotEqualTo(BigDecimal value) {
            addCriterion("P79 <>", value, "p79");
            return (Criteria) this;
        }

        public Criteria andP79GreaterThan(BigDecimal value) {
            addCriterion("P79 >", value, "p79");
            return (Criteria) this;
        }

        public Criteria andP79GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P79 >=", value, "p79");
            return (Criteria) this;
        }

        public Criteria andP79LessThan(BigDecimal value) {
            addCriterion("P79 <", value, "p79");
            return (Criteria) this;
        }

        public Criteria andP79LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P79 <=", value, "p79");
            return (Criteria) this;
        }

        public Criteria andP79In(List<BigDecimal> values) {
            addCriterion("P79 in", values, "p79");
            return (Criteria) this;
        }

        public Criteria andP79NotIn(List<BigDecimal> values) {
            addCriterion("P79 not in", values, "p79");
            return (Criteria) this;
        }

        public Criteria andP79Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P79 between", value1, value2, "p79");
            return (Criteria) this;
        }

        public Criteria andP79NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P79 not between", value1, value2, "p79");
            return (Criteria) this;
        }

        public Criteria andP80IsNull() {
            addCriterion("P80 is null");
            return (Criteria) this;
        }

        public Criteria andP80IsNotNull() {
            addCriterion("P80 is not null");
            return (Criteria) this;
        }

        public Criteria andP80EqualTo(BigDecimal value) {
            addCriterion("P80 =", value, "p80");
            return (Criteria) this;
        }

        public Criteria andP80NotEqualTo(BigDecimal value) {
            addCriterion("P80 <>", value, "p80");
            return (Criteria) this;
        }

        public Criteria andP80GreaterThan(BigDecimal value) {
            addCriterion("P80 >", value, "p80");
            return (Criteria) this;
        }

        public Criteria andP80GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P80 >=", value, "p80");
            return (Criteria) this;
        }

        public Criteria andP80LessThan(BigDecimal value) {
            addCriterion("P80 <", value, "p80");
            return (Criteria) this;
        }

        public Criteria andP80LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P80 <=", value, "p80");
            return (Criteria) this;
        }

        public Criteria andP80In(List<BigDecimal> values) {
            addCriterion("P80 in", values, "p80");
            return (Criteria) this;
        }

        public Criteria andP80NotIn(List<BigDecimal> values) {
            addCriterion("P80 not in", values, "p80");
            return (Criteria) this;
        }

        public Criteria andP80Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P80 between", value1, value2, "p80");
            return (Criteria) this;
        }

        public Criteria andP80NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P80 not between", value1, value2, "p80");
            return (Criteria) this;
        }

        public Criteria andP81IsNull() {
            addCriterion("P81 is null");
            return (Criteria) this;
        }

        public Criteria andP81IsNotNull() {
            addCriterion("P81 is not null");
            return (Criteria) this;
        }

        public Criteria andP81EqualTo(BigDecimal value) {
            addCriterion("P81 =", value, "p81");
            return (Criteria) this;
        }

        public Criteria andP81NotEqualTo(BigDecimal value) {
            addCriterion("P81 <>", value, "p81");
            return (Criteria) this;
        }

        public Criteria andP81GreaterThan(BigDecimal value) {
            addCriterion("P81 >", value, "p81");
            return (Criteria) this;
        }

        public Criteria andP81GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P81 >=", value, "p81");
            return (Criteria) this;
        }

        public Criteria andP81LessThan(BigDecimal value) {
            addCriterion("P81 <", value, "p81");
            return (Criteria) this;
        }

        public Criteria andP81LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P81 <=", value, "p81");
            return (Criteria) this;
        }

        public Criteria andP81In(List<BigDecimal> values) {
            addCriterion("P81 in", values, "p81");
            return (Criteria) this;
        }

        public Criteria andP81NotIn(List<BigDecimal> values) {
            addCriterion("P81 not in", values, "p81");
            return (Criteria) this;
        }

        public Criteria andP81Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P81 between", value1, value2, "p81");
            return (Criteria) this;
        }

        public Criteria andP81NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P81 not between", value1, value2, "p81");
            return (Criteria) this;
        }

        public Criteria andP82IsNull() {
            addCriterion("P82 is null");
            return (Criteria) this;
        }

        public Criteria andP82IsNotNull() {
            addCriterion("P82 is not null");
            return (Criteria) this;
        }

        public Criteria andP82EqualTo(BigDecimal value) {
            addCriterion("P82 =", value, "p82");
            return (Criteria) this;
        }

        public Criteria andP82NotEqualTo(BigDecimal value) {
            addCriterion("P82 <>", value, "p82");
            return (Criteria) this;
        }

        public Criteria andP82GreaterThan(BigDecimal value) {
            addCriterion("P82 >", value, "p82");
            return (Criteria) this;
        }

        public Criteria andP82GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P82 >=", value, "p82");
            return (Criteria) this;
        }

        public Criteria andP82LessThan(BigDecimal value) {
            addCriterion("P82 <", value, "p82");
            return (Criteria) this;
        }

        public Criteria andP82LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P82 <=", value, "p82");
            return (Criteria) this;
        }

        public Criteria andP82In(List<BigDecimal> values) {
            addCriterion("P82 in", values, "p82");
            return (Criteria) this;
        }

        public Criteria andP82NotIn(List<BigDecimal> values) {
            addCriterion("P82 not in", values, "p82");
            return (Criteria) this;
        }

        public Criteria andP82Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P82 between", value1, value2, "p82");
            return (Criteria) this;
        }

        public Criteria andP82NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P82 not between", value1, value2, "p82");
            return (Criteria) this;
        }

        public Criteria andP83IsNull() {
            addCriterion("P83 is null");
            return (Criteria) this;
        }

        public Criteria andP83IsNotNull() {
            addCriterion("P83 is not null");
            return (Criteria) this;
        }

        public Criteria andP83EqualTo(BigDecimal value) {
            addCriterion("P83 =", value, "p83");
            return (Criteria) this;
        }

        public Criteria andP83NotEqualTo(BigDecimal value) {
            addCriterion("P83 <>", value, "p83");
            return (Criteria) this;
        }

        public Criteria andP83GreaterThan(BigDecimal value) {
            addCriterion("P83 >", value, "p83");
            return (Criteria) this;
        }

        public Criteria andP83GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P83 >=", value, "p83");
            return (Criteria) this;
        }

        public Criteria andP83LessThan(BigDecimal value) {
            addCriterion("P83 <", value, "p83");
            return (Criteria) this;
        }

        public Criteria andP83LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P83 <=", value, "p83");
            return (Criteria) this;
        }

        public Criteria andP83In(List<BigDecimal> values) {
            addCriterion("P83 in", values, "p83");
            return (Criteria) this;
        }

        public Criteria andP83NotIn(List<BigDecimal> values) {
            addCriterion("P83 not in", values, "p83");
            return (Criteria) this;
        }

        public Criteria andP83Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P83 between", value1, value2, "p83");
            return (Criteria) this;
        }

        public Criteria andP83NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P83 not between", value1, value2, "p83");
            return (Criteria) this;
        }

        public Criteria andP84IsNull() {
            addCriterion("P84 is null");
            return (Criteria) this;
        }

        public Criteria andP84IsNotNull() {
            addCriterion("P84 is not null");
            return (Criteria) this;
        }

        public Criteria andP84EqualTo(BigDecimal value) {
            addCriterion("P84 =", value, "p84");
            return (Criteria) this;
        }

        public Criteria andP84NotEqualTo(BigDecimal value) {
            addCriterion("P84 <>", value, "p84");
            return (Criteria) this;
        }

        public Criteria andP84GreaterThan(BigDecimal value) {
            addCriterion("P84 >", value, "p84");
            return (Criteria) this;
        }

        public Criteria andP84GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P84 >=", value, "p84");
            return (Criteria) this;
        }

        public Criteria andP84LessThan(BigDecimal value) {
            addCriterion("P84 <", value, "p84");
            return (Criteria) this;
        }

        public Criteria andP84LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P84 <=", value, "p84");
            return (Criteria) this;
        }

        public Criteria andP84In(List<BigDecimal> values) {
            addCriterion("P84 in", values, "p84");
            return (Criteria) this;
        }

        public Criteria andP84NotIn(List<BigDecimal> values) {
            addCriterion("P84 not in", values, "p84");
            return (Criteria) this;
        }

        public Criteria andP84Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P84 between", value1, value2, "p84");
            return (Criteria) this;
        }

        public Criteria andP84NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P84 not between", value1, value2, "p84");
            return (Criteria) this;
        }

        public Criteria andP85IsNull() {
            addCriterion("P85 is null");
            return (Criteria) this;
        }

        public Criteria andP85IsNotNull() {
            addCriterion("P85 is not null");
            return (Criteria) this;
        }

        public Criteria andP85EqualTo(BigDecimal value) {
            addCriterion("P85 =", value, "p85");
            return (Criteria) this;
        }

        public Criteria andP85NotEqualTo(BigDecimal value) {
            addCriterion("P85 <>", value, "p85");
            return (Criteria) this;
        }

        public Criteria andP85GreaterThan(BigDecimal value) {
            addCriterion("P85 >", value, "p85");
            return (Criteria) this;
        }

        public Criteria andP85GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P85 >=", value, "p85");
            return (Criteria) this;
        }

        public Criteria andP85LessThan(BigDecimal value) {
            addCriterion("P85 <", value, "p85");
            return (Criteria) this;
        }

        public Criteria andP85LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P85 <=", value, "p85");
            return (Criteria) this;
        }

        public Criteria andP85In(List<BigDecimal> values) {
            addCriterion("P85 in", values, "p85");
            return (Criteria) this;
        }

        public Criteria andP85NotIn(List<BigDecimal> values) {
            addCriterion("P85 not in", values, "p85");
            return (Criteria) this;
        }

        public Criteria andP85Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P85 between", value1, value2, "p85");
            return (Criteria) this;
        }

        public Criteria andP85NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P85 not between", value1, value2, "p85");
            return (Criteria) this;
        }

        public Criteria andP86IsNull() {
            addCriterion("P86 is null");
            return (Criteria) this;
        }

        public Criteria andP86IsNotNull() {
            addCriterion("P86 is not null");
            return (Criteria) this;
        }

        public Criteria andP86EqualTo(BigDecimal value) {
            addCriterion("P86 =", value, "p86");
            return (Criteria) this;
        }

        public Criteria andP86NotEqualTo(BigDecimal value) {
            addCriterion("P86 <>", value, "p86");
            return (Criteria) this;
        }

        public Criteria andP86GreaterThan(BigDecimal value) {
            addCriterion("P86 >", value, "p86");
            return (Criteria) this;
        }

        public Criteria andP86GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P86 >=", value, "p86");
            return (Criteria) this;
        }

        public Criteria andP86LessThan(BigDecimal value) {
            addCriterion("P86 <", value, "p86");
            return (Criteria) this;
        }

        public Criteria andP86LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P86 <=", value, "p86");
            return (Criteria) this;
        }

        public Criteria andP86In(List<BigDecimal> values) {
            addCriterion("P86 in", values, "p86");
            return (Criteria) this;
        }

        public Criteria andP86NotIn(List<BigDecimal> values) {
            addCriterion("P86 not in", values, "p86");
            return (Criteria) this;
        }

        public Criteria andP86Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P86 between", value1, value2, "p86");
            return (Criteria) this;
        }

        public Criteria andP86NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P86 not between", value1, value2, "p86");
            return (Criteria) this;
        }

        public Criteria andP87IsNull() {
            addCriterion("P87 is null");
            return (Criteria) this;
        }

        public Criteria andP87IsNotNull() {
            addCriterion("P87 is not null");
            return (Criteria) this;
        }

        public Criteria andP87EqualTo(BigDecimal value) {
            addCriterion("P87 =", value, "p87");
            return (Criteria) this;
        }

        public Criteria andP87NotEqualTo(BigDecimal value) {
            addCriterion("P87 <>", value, "p87");
            return (Criteria) this;
        }

        public Criteria andP87GreaterThan(BigDecimal value) {
            addCriterion("P87 >", value, "p87");
            return (Criteria) this;
        }

        public Criteria andP87GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P87 >=", value, "p87");
            return (Criteria) this;
        }

        public Criteria andP87LessThan(BigDecimal value) {
            addCriterion("P87 <", value, "p87");
            return (Criteria) this;
        }

        public Criteria andP87LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P87 <=", value, "p87");
            return (Criteria) this;
        }

        public Criteria andP87In(List<BigDecimal> values) {
            addCriterion("P87 in", values, "p87");
            return (Criteria) this;
        }

        public Criteria andP87NotIn(List<BigDecimal> values) {
            addCriterion("P87 not in", values, "p87");
            return (Criteria) this;
        }

        public Criteria andP87Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P87 between", value1, value2, "p87");
            return (Criteria) this;
        }

        public Criteria andP87NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P87 not between", value1, value2, "p87");
            return (Criteria) this;
        }

        public Criteria andP88IsNull() {
            addCriterion("P88 is null");
            return (Criteria) this;
        }

        public Criteria andP88IsNotNull() {
            addCriterion("P88 is not null");
            return (Criteria) this;
        }

        public Criteria andP88EqualTo(BigDecimal value) {
            addCriterion("P88 =", value, "p88");
            return (Criteria) this;
        }

        public Criteria andP88NotEqualTo(BigDecimal value) {
            addCriterion("P88 <>", value, "p88");
            return (Criteria) this;
        }

        public Criteria andP88GreaterThan(BigDecimal value) {
            addCriterion("P88 >", value, "p88");
            return (Criteria) this;
        }

        public Criteria andP88GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P88 >=", value, "p88");
            return (Criteria) this;
        }

        public Criteria andP88LessThan(BigDecimal value) {
            addCriterion("P88 <", value, "p88");
            return (Criteria) this;
        }

        public Criteria andP88LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P88 <=", value, "p88");
            return (Criteria) this;
        }

        public Criteria andP88In(List<BigDecimal> values) {
            addCriterion("P88 in", values, "p88");
            return (Criteria) this;
        }

        public Criteria andP88NotIn(List<BigDecimal> values) {
            addCriterion("P88 not in", values, "p88");
            return (Criteria) this;
        }

        public Criteria andP88Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P88 between", value1, value2, "p88");
            return (Criteria) this;
        }

        public Criteria andP88NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P88 not between", value1, value2, "p88");
            return (Criteria) this;
        }

        public Criteria andP89IsNull() {
            addCriterion("P89 is null");
            return (Criteria) this;
        }

        public Criteria andP89IsNotNull() {
            addCriterion("P89 is not null");
            return (Criteria) this;
        }

        public Criteria andP89EqualTo(BigDecimal value) {
            addCriterion("P89 =", value, "p89");
            return (Criteria) this;
        }

        public Criteria andP89NotEqualTo(BigDecimal value) {
            addCriterion("P89 <>", value, "p89");
            return (Criteria) this;
        }

        public Criteria andP89GreaterThan(BigDecimal value) {
            addCriterion("P89 >", value, "p89");
            return (Criteria) this;
        }

        public Criteria andP89GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P89 >=", value, "p89");
            return (Criteria) this;
        }

        public Criteria andP89LessThan(BigDecimal value) {
            addCriterion("P89 <", value, "p89");
            return (Criteria) this;
        }

        public Criteria andP89LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P89 <=", value, "p89");
            return (Criteria) this;
        }

        public Criteria andP89In(List<BigDecimal> values) {
            addCriterion("P89 in", values, "p89");
            return (Criteria) this;
        }

        public Criteria andP89NotIn(List<BigDecimal> values) {
            addCriterion("P89 not in", values, "p89");
            return (Criteria) this;
        }

        public Criteria andP89Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P89 between", value1, value2, "p89");
            return (Criteria) this;
        }

        public Criteria andP89NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P89 not between", value1, value2, "p89");
            return (Criteria) this;
        }

        public Criteria andP90IsNull() {
            addCriterion("P90 is null");
            return (Criteria) this;
        }

        public Criteria andP90IsNotNull() {
            addCriterion("P90 is not null");
            return (Criteria) this;
        }

        public Criteria andP90EqualTo(BigDecimal value) {
            addCriterion("P90 =", value, "p90");
            return (Criteria) this;
        }

        public Criteria andP90NotEqualTo(BigDecimal value) {
            addCriterion("P90 <>", value, "p90");
            return (Criteria) this;
        }

        public Criteria andP90GreaterThan(BigDecimal value) {
            addCriterion("P90 >", value, "p90");
            return (Criteria) this;
        }

        public Criteria andP90GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P90 >=", value, "p90");
            return (Criteria) this;
        }

        public Criteria andP90LessThan(BigDecimal value) {
            addCriterion("P90 <", value, "p90");
            return (Criteria) this;
        }

        public Criteria andP90LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P90 <=", value, "p90");
            return (Criteria) this;
        }

        public Criteria andP90In(List<BigDecimal> values) {
            addCriterion("P90 in", values, "p90");
            return (Criteria) this;
        }

        public Criteria andP90NotIn(List<BigDecimal> values) {
            addCriterion("P90 not in", values, "p90");
            return (Criteria) this;
        }

        public Criteria andP90Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P90 between", value1, value2, "p90");
            return (Criteria) this;
        }

        public Criteria andP90NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P90 not between", value1, value2, "p90");
            return (Criteria) this;
        }

        public Criteria andP91IsNull() {
            addCriterion("P91 is null");
            return (Criteria) this;
        }

        public Criteria andP91IsNotNull() {
            addCriterion("P91 is not null");
            return (Criteria) this;
        }

        public Criteria andP91EqualTo(BigDecimal value) {
            addCriterion("P91 =", value, "p91");
            return (Criteria) this;
        }

        public Criteria andP91NotEqualTo(BigDecimal value) {
            addCriterion("P91 <>", value, "p91");
            return (Criteria) this;
        }

        public Criteria andP91GreaterThan(BigDecimal value) {
            addCriterion("P91 >", value, "p91");
            return (Criteria) this;
        }

        public Criteria andP91GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P91 >=", value, "p91");
            return (Criteria) this;
        }

        public Criteria andP91LessThan(BigDecimal value) {
            addCriterion("P91 <", value, "p91");
            return (Criteria) this;
        }

        public Criteria andP91LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P91 <=", value, "p91");
            return (Criteria) this;
        }

        public Criteria andP91In(List<BigDecimal> values) {
            addCriterion("P91 in", values, "p91");
            return (Criteria) this;
        }

        public Criteria andP91NotIn(List<BigDecimal> values) {
            addCriterion("P91 not in", values, "p91");
            return (Criteria) this;
        }

        public Criteria andP91Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P91 between", value1, value2, "p91");
            return (Criteria) this;
        }

        public Criteria andP91NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P91 not between", value1, value2, "p91");
            return (Criteria) this;
        }

        public Criteria andP92IsNull() {
            addCriterion("P92 is null");
            return (Criteria) this;
        }

        public Criteria andP92IsNotNull() {
            addCriterion("P92 is not null");
            return (Criteria) this;
        }

        public Criteria andP92EqualTo(BigDecimal value) {
            addCriterion("P92 =", value, "p92");
            return (Criteria) this;
        }

        public Criteria andP92NotEqualTo(BigDecimal value) {
            addCriterion("P92 <>", value, "p92");
            return (Criteria) this;
        }

        public Criteria andP92GreaterThan(BigDecimal value) {
            addCriterion("P92 >", value, "p92");
            return (Criteria) this;
        }

        public Criteria andP92GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P92 >=", value, "p92");
            return (Criteria) this;
        }

        public Criteria andP92LessThan(BigDecimal value) {
            addCriterion("P92 <", value, "p92");
            return (Criteria) this;
        }

        public Criteria andP92LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P92 <=", value, "p92");
            return (Criteria) this;
        }

        public Criteria andP92In(List<BigDecimal> values) {
            addCriterion("P92 in", values, "p92");
            return (Criteria) this;
        }

        public Criteria andP92NotIn(List<BigDecimal> values) {
            addCriterion("P92 not in", values, "p92");
            return (Criteria) this;
        }

        public Criteria andP92Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P92 between", value1, value2, "p92");
            return (Criteria) this;
        }

        public Criteria andP92NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P92 not between", value1, value2, "p92");
            return (Criteria) this;
        }

        public Criteria andP93IsNull() {
            addCriterion("P93 is null");
            return (Criteria) this;
        }

        public Criteria andP93IsNotNull() {
            addCriterion("P93 is not null");
            return (Criteria) this;
        }

        public Criteria andP93EqualTo(BigDecimal value) {
            addCriterion("P93 =", value, "p93");
            return (Criteria) this;
        }

        public Criteria andP93NotEqualTo(BigDecimal value) {
            addCriterion("P93 <>", value, "p93");
            return (Criteria) this;
        }

        public Criteria andP93GreaterThan(BigDecimal value) {
            addCriterion("P93 >", value, "p93");
            return (Criteria) this;
        }

        public Criteria andP93GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P93 >=", value, "p93");
            return (Criteria) this;
        }

        public Criteria andP93LessThan(BigDecimal value) {
            addCriterion("P93 <", value, "p93");
            return (Criteria) this;
        }

        public Criteria andP93LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P93 <=", value, "p93");
            return (Criteria) this;
        }

        public Criteria andP93In(List<BigDecimal> values) {
            addCriterion("P93 in", values, "p93");
            return (Criteria) this;
        }

        public Criteria andP93NotIn(List<BigDecimal> values) {
            addCriterion("P93 not in", values, "p93");
            return (Criteria) this;
        }

        public Criteria andP93Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P93 between", value1, value2, "p93");
            return (Criteria) this;
        }

        public Criteria andP93NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P93 not between", value1, value2, "p93");
            return (Criteria) this;
        }

        public Criteria andP94IsNull() {
            addCriterion("P94 is null");
            return (Criteria) this;
        }

        public Criteria andP94IsNotNull() {
            addCriterion("P94 is not null");
            return (Criteria) this;
        }

        public Criteria andP94EqualTo(BigDecimal value) {
            addCriterion("P94 =", value, "p94");
            return (Criteria) this;
        }

        public Criteria andP94NotEqualTo(BigDecimal value) {
            addCriterion("P94 <>", value, "p94");
            return (Criteria) this;
        }

        public Criteria andP94GreaterThan(BigDecimal value) {
            addCriterion("P94 >", value, "p94");
            return (Criteria) this;
        }

        public Criteria andP94GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P94 >=", value, "p94");
            return (Criteria) this;
        }

        public Criteria andP94LessThan(BigDecimal value) {
            addCriterion("P94 <", value, "p94");
            return (Criteria) this;
        }

        public Criteria andP94LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P94 <=", value, "p94");
            return (Criteria) this;
        }

        public Criteria andP94In(List<BigDecimal> values) {
            addCriterion("P94 in", values, "p94");
            return (Criteria) this;
        }

        public Criteria andP94NotIn(List<BigDecimal> values) {
            addCriterion("P94 not in", values, "p94");
            return (Criteria) this;
        }

        public Criteria andP94Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P94 between", value1, value2, "p94");
            return (Criteria) this;
        }

        public Criteria andP94NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P94 not between", value1, value2, "p94");
            return (Criteria) this;
        }

        public Criteria andP95IsNull() {
            addCriterion("P95 is null");
            return (Criteria) this;
        }

        public Criteria andP95IsNotNull() {
            addCriterion("P95 is not null");
            return (Criteria) this;
        }

        public Criteria andP95EqualTo(BigDecimal value) {
            addCriterion("P95 =", value, "p95");
            return (Criteria) this;
        }

        public Criteria andP95NotEqualTo(BigDecimal value) {
            addCriterion("P95 <>", value, "p95");
            return (Criteria) this;
        }

        public Criteria andP95GreaterThan(BigDecimal value) {
            addCriterion("P95 >", value, "p95");
            return (Criteria) this;
        }

        public Criteria andP95GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P95 >=", value, "p95");
            return (Criteria) this;
        }

        public Criteria andP95LessThan(BigDecimal value) {
            addCriterion("P95 <", value, "p95");
            return (Criteria) this;
        }

        public Criteria andP95LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P95 <=", value, "p95");
            return (Criteria) this;
        }

        public Criteria andP95In(List<BigDecimal> values) {
            addCriterion("P95 in", values, "p95");
            return (Criteria) this;
        }

        public Criteria andP95NotIn(List<BigDecimal> values) {
            addCriterion("P95 not in", values, "p95");
            return (Criteria) this;
        }

        public Criteria andP95Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P95 between", value1, value2, "p95");
            return (Criteria) this;
        }

        public Criteria andP95NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P95 not between", value1, value2, "p95");
            return (Criteria) this;
        }

        public Criteria andP96IsNull() {
            addCriterion("P96 is null");
            return (Criteria) this;
        }

        public Criteria andP96IsNotNull() {
            addCriterion("P96 is not null");
            return (Criteria) this;
        }

        public Criteria andP96EqualTo(BigDecimal value) {
            addCriterion("P96 =", value, "p96");
            return (Criteria) this;
        }

        public Criteria andP96NotEqualTo(BigDecimal value) {
            addCriterion("P96 <>", value, "p96");
            return (Criteria) this;
        }

        public Criteria andP96GreaterThan(BigDecimal value) {
            addCriterion("P96 >", value, "p96");
            return (Criteria) this;
        }

        public Criteria andP96GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P96 >=", value, "p96");
            return (Criteria) this;
        }

        public Criteria andP96LessThan(BigDecimal value) {
            addCriterion("P96 <", value, "p96");
            return (Criteria) this;
        }

        public Criteria andP96LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P96 <=", value, "p96");
            return (Criteria) this;
        }

        public Criteria andP96In(List<BigDecimal> values) {
            addCriterion("P96 in", values, "p96");
            return (Criteria) this;
        }

        public Criteria andP96NotIn(List<BigDecimal> values) {
            addCriterion("P96 not in", values, "p96");
            return (Criteria) this;
        }

        public Criteria andP96Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P96 between", value1, value2, "p96");
            return (Criteria) this;
        }

        public Criteria andP96NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P96 not between", value1, value2, "p96");
            return (Criteria) this;
        }

        public Criteria andP97IsNull() {
            addCriterion("P97 is null");
            return (Criteria) this;
        }

        public Criteria andP97IsNotNull() {
            addCriterion("P97 is not null");
            return (Criteria) this;
        }

        public Criteria andP97EqualTo(BigDecimal value) {
            addCriterion("P97 =", value, "p97");
            return (Criteria) this;
        }

        public Criteria andP97NotEqualTo(BigDecimal value) {
            addCriterion("P97 <>", value, "p97");
            return (Criteria) this;
        }

        public Criteria andP97GreaterThan(BigDecimal value) {
            addCriterion("P97 >", value, "p97");
            return (Criteria) this;
        }

        public Criteria andP97GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P97 >=", value, "p97");
            return (Criteria) this;
        }

        public Criteria andP97LessThan(BigDecimal value) {
            addCriterion("P97 <", value, "p97");
            return (Criteria) this;
        }

        public Criteria andP97LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P97 <=", value, "p97");
            return (Criteria) this;
        }

        public Criteria andP97In(List<BigDecimal> values) {
            addCriterion("P97 in", values, "p97");
            return (Criteria) this;
        }

        public Criteria andP97NotIn(List<BigDecimal> values) {
            addCriterion("P97 not in", values, "p97");
            return (Criteria) this;
        }

        public Criteria andP97Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P97 between", value1, value2, "p97");
            return (Criteria) this;
        }

        public Criteria andP97NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P97 not between", value1, value2, "p97");
            return (Criteria) this;
        }

        public Criteria andP98IsNull() {
            addCriterion("P98 is null");
            return (Criteria) this;
        }

        public Criteria andP98IsNotNull() {
            addCriterion("P98 is not null");
            return (Criteria) this;
        }

        public Criteria andP98EqualTo(BigDecimal value) {
            addCriterion("P98 =", value, "p98");
            return (Criteria) this;
        }

        public Criteria andP98NotEqualTo(BigDecimal value) {
            addCriterion("P98 <>", value, "p98");
            return (Criteria) this;
        }

        public Criteria andP98GreaterThan(BigDecimal value) {
            addCriterion("P98 >", value, "p98");
            return (Criteria) this;
        }

        public Criteria andP98GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P98 >=", value, "p98");
            return (Criteria) this;
        }

        public Criteria andP98LessThan(BigDecimal value) {
            addCriterion("P98 <", value, "p98");
            return (Criteria) this;
        }

        public Criteria andP98LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P98 <=", value, "p98");
            return (Criteria) this;
        }

        public Criteria andP98In(List<BigDecimal> values) {
            addCriterion("P98 in", values, "p98");
            return (Criteria) this;
        }

        public Criteria andP98NotIn(List<BigDecimal> values) {
            addCriterion("P98 not in", values, "p98");
            return (Criteria) this;
        }

        public Criteria andP98Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P98 between", value1, value2, "p98");
            return (Criteria) this;
        }

        public Criteria andP98NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P98 not between", value1, value2, "p98");
            return (Criteria) this;
        }

        public Criteria andP99IsNull() {
            addCriterion("P99 is null");
            return (Criteria) this;
        }

        public Criteria andP99IsNotNull() {
            addCriterion("P99 is not null");
            return (Criteria) this;
        }

        public Criteria andP99EqualTo(BigDecimal value) {
            addCriterion("P99 =", value, "p99");
            return (Criteria) this;
        }

        public Criteria andP99NotEqualTo(BigDecimal value) {
            addCriterion("P99 <>", value, "p99");
            return (Criteria) this;
        }

        public Criteria andP99GreaterThan(BigDecimal value) {
            addCriterion("P99 >", value, "p99");
            return (Criteria) this;
        }

        public Criteria andP99GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P99 >=", value, "p99");
            return (Criteria) this;
        }

        public Criteria andP99LessThan(BigDecimal value) {
            addCriterion("P99 <", value, "p99");
            return (Criteria) this;
        }

        public Criteria andP99LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P99 <=", value, "p99");
            return (Criteria) this;
        }

        public Criteria andP99In(List<BigDecimal> values) {
            addCriterion("P99 in", values, "p99");
            return (Criteria) this;
        }

        public Criteria andP99NotIn(List<BigDecimal> values) {
            addCriterion("P99 not in", values, "p99");
            return (Criteria) this;
        }

        public Criteria andP99Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P99 between", value1, value2, "p99");
            return (Criteria) this;
        }

        public Criteria andP99NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P99 not between", value1, value2, "p99");
            return (Criteria) this;
        }

        public Criteria andP100IsNull() {
            addCriterion("P100 is null");
            return (Criteria) this;
        }

        public Criteria andP100IsNotNull() {
            addCriterion("P100 is not null");
            return (Criteria) this;
        }

        public Criteria andP100EqualTo(BigDecimal value) {
            addCriterion("P100 =", value, "p100");
            return (Criteria) this;
        }

        public Criteria andP100NotEqualTo(BigDecimal value) {
            addCriterion("P100 <>", value, "p100");
            return (Criteria) this;
        }

        public Criteria andP100GreaterThan(BigDecimal value) {
            addCriterion("P100 >", value, "p100");
            return (Criteria) this;
        }

        public Criteria andP100GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P100 >=", value, "p100");
            return (Criteria) this;
        }

        public Criteria andP100LessThan(BigDecimal value) {
            addCriterion("P100 <", value, "p100");
            return (Criteria) this;
        }

        public Criteria andP100LessThanOrEqualTo(BigDecimal value) {
            addCriterion("P100 <=", value, "p100");
            return (Criteria) this;
        }

        public Criteria andP100In(List<BigDecimal> values) {
            addCriterion("P100 in", values, "p100");
            return (Criteria) this;
        }

        public Criteria andP100NotIn(List<BigDecimal> values) {
            addCriterion("P100 not in", values, "p100");
            return (Criteria) this;
        }

        public Criteria andP100Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("P100 between", value1, value2, "p100");
            return (Criteria) this;
        }

        public Criteria andP100NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P100 not between", value1, value2, "p100");
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

        public Criteria andOrgIdRtkIsNull() {
            addCriterion("ORG_ID_RTK is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdRtkIsNotNull() {
            addCriterion("ORG_ID_RTK is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdRtkEqualTo(String value) {
            addCriterion("ORG_ID_RTK =", value, "orgIdRtk");
            return (Criteria) this;
        }

        public Criteria andOrgIdRtkNotEqualTo(String value) {
            addCriterion("ORG_ID_RTK <>", value, "orgIdRtk");
            return (Criteria) this;
        }

        public Criteria andOrgIdRtkGreaterThan(String value) {
            addCriterion("ORG_ID_RTK >", value, "orgIdRtk");
            return (Criteria) this;
        }

        public Criteria andOrgIdRtkGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_ID_RTK >=", value, "orgIdRtk");
            return (Criteria) this;
        }

        public Criteria andOrgIdRtkLessThan(String value) {
            addCriterion("ORG_ID_RTK <", value, "orgIdRtk");
            return (Criteria) this;
        }

        public Criteria andOrgIdRtkLessThanOrEqualTo(String value) {
            addCriterion("ORG_ID_RTK <=", value, "orgIdRtk");
            return (Criteria) this;
        }

        public Criteria andOrgIdRtkLike(String value) {
            addCriterion("ORG_ID_RTK like", value, "orgIdRtk");
            return (Criteria) this;
        }

        public Criteria andOrgIdRtkNotLike(String value) {
            addCriterion("ORG_ID_RTK not like", value, "orgIdRtk");
            return (Criteria) this;
        }

        public Criteria andOrgIdRtkIn(List<String> values) {
            addCriterion("ORG_ID_RTK in", values, "orgIdRtk");
            return (Criteria) this;
        }

        public Criteria andOrgIdRtkNotIn(List<String> values) {
            addCriterion("ORG_ID_RTK not in", values, "orgIdRtk");
            return (Criteria) this;
        }

        public Criteria andOrgIdRtkBetween(String value1, String value2) {
            addCriterion("ORG_ID_RTK between", value1, value2, "orgIdRtk");
            return (Criteria) this;
        }

        public Criteria andOrgIdRtkNotBetween(String value1, String value2) {
            addCriterion("ORG_ID_RTK not between", value1, value2, "orgIdRtk");
            return (Criteria) this;
        }

        public Criteria andOrgIdRoidIsNull() {
            addCriterion("ORG_ID_ROid is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdRoidIsNotNull() {
            addCriterion("ORG_ID_ROid is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdRoidEqualTo(String value) {
            addCriterion("ORG_ID_ROid =", value, "orgIdRoid");
            return (Criteria) this;
        }

        public Criteria andOrgIdRoidNotEqualTo(String value) {
            addCriterion("ORG_ID_ROid <>", value, "orgIdRoid");
            return (Criteria) this;
        }

        public Criteria andOrgIdRoidGreaterThan(String value) {
            addCriterion("ORG_ID_ROid >", value, "orgIdRoid");
            return (Criteria) this;
        }

        public Criteria andOrgIdRoidGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_ID_ROid >=", value, "orgIdRoid");
            return (Criteria) this;
        }

        public Criteria andOrgIdRoidLessThan(String value) {
            addCriterion("ORG_ID_ROid <", value, "orgIdRoid");
            return (Criteria) this;
        }

        public Criteria andOrgIdRoidLessThanOrEqualTo(String value) {
            addCriterion("ORG_ID_ROid <=", value, "orgIdRoid");
            return (Criteria) this;
        }

        public Criteria andOrgIdRoidLike(String value) {
            addCriterion("ORG_ID_ROid like", value, "orgIdRoid");
            return (Criteria) this;
        }

        public Criteria andOrgIdRoidNotLike(String value) {
            addCriterion("ORG_ID_ROid not like", value, "orgIdRoid");
            return (Criteria) this;
        }

        public Criteria andOrgIdRoidIn(List<String> values) {
            addCriterion("ORG_ID_ROid in", values, "orgIdRoid");
            return (Criteria) this;
        }

        public Criteria andOrgIdRoidNotIn(List<String> values) {
            addCriterion("ORG_ID_ROid not in", values, "orgIdRoid");
            return (Criteria) this;
        }

        public Criteria andOrgIdRoidBetween(String value1, String value2) {
            addCriterion("ORG_ID_ROid between", value1, value2, "orgIdRoid");
            return (Criteria) this;
        }

        public Criteria andOrgIdRoidNotBetween(String value1, String value2) {
            addCriterion("ORG_ID_ROid not between", value1, value2, "orgIdRoid");
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