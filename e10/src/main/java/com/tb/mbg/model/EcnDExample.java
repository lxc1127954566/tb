package com.tb.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EcnDExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EcnDExample() {
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

        public Criteria andEcnDIdIsNull() {
            addCriterion("ECN_D_ID is null");
            return (Criteria) this;
        }

        public Criteria andEcnDIdIsNotNull() {
            addCriterion("ECN_D_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEcnDIdEqualTo(String value) {
            addCriterion("ECN_D_ID =", value, "ecnDId");
            return (Criteria) this;
        }

        public Criteria andEcnDIdNotEqualTo(String value) {
            addCriterion("ECN_D_ID <>", value, "ecnDId");
            return (Criteria) this;
        }

        public Criteria andEcnDIdGreaterThan(String value) {
            addCriterion("ECN_D_ID >", value, "ecnDId");
            return (Criteria) this;
        }

        public Criteria andEcnDIdGreaterThanOrEqualTo(String value) {
            addCriterion("ECN_D_ID >=", value, "ecnDId");
            return (Criteria) this;
        }

        public Criteria andEcnDIdLessThan(String value) {
            addCriterion("ECN_D_ID <", value, "ecnDId");
            return (Criteria) this;
        }

        public Criteria andEcnDIdLessThanOrEqualTo(String value) {
            addCriterion("ECN_D_ID <=", value, "ecnDId");
            return (Criteria) this;
        }

        public Criteria andEcnDIdLike(String value) {
            addCriterion("ECN_D_ID like", value, "ecnDId");
            return (Criteria) this;
        }

        public Criteria andEcnDIdNotLike(String value) {
            addCriterion("ECN_D_ID not like", value, "ecnDId");
            return (Criteria) this;
        }

        public Criteria andEcnDIdIn(List<String> values) {
            addCriterion("ECN_D_ID in", values, "ecnDId");
            return (Criteria) this;
        }

        public Criteria andEcnDIdNotIn(List<String> values) {
            addCriterion("ECN_D_ID not in", values, "ecnDId");
            return (Criteria) this;
        }

        public Criteria andEcnDIdBetween(String value1, String value2) {
            addCriterion("ECN_D_ID between", value1, value2, "ecnDId");
            return (Criteria) this;
        }

        public Criteria andEcnDIdNotBetween(String value1, String value2) {
            addCriterion("ECN_D_ID not between", value1, value2, "ecnDId");
            return (Criteria) this;
        }

        public Criteria andSequencenumberIsNull() {
            addCriterion("SequenceNumber is null");
            return (Criteria) this;
        }

        public Criteria andSequencenumberIsNotNull() {
            addCriterion("SequenceNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSequencenumberEqualTo(Integer value) {
            addCriterion("SequenceNumber =", value, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberNotEqualTo(Integer value) {
            addCriterion("SequenceNumber <>", value, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberGreaterThan(Integer value) {
            addCriterion("SequenceNumber >", value, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("SequenceNumber >=", value, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberLessThan(Integer value) {
            addCriterion("SequenceNumber <", value, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberLessThanOrEqualTo(Integer value) {
            addCriterion("SequenceNumber <=", value, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberIn(List<Integer> values) {
            addCriterion("SequenceNumber in", values, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberNotIn(List<Integer> values) {
            addCriterion("SequenceNumber not in", values, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberBetween(Integer value1, Integer value2) {
            addCriterion("SequenceNumber between", value1, value2, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("SequenceNumber not between", value1, value2, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andVersionTimesIsNull() {
            addCriterion("VERSION_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andVersionTimesIsNotNull() {
            addCriterion("VERSION_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andVersionTimesEqualTo(String value) {
            addCriterion("VERSION_TIMES =", value, "versionTimes");
            return (Criteria) this;
        }

        public Criteria andVersionTimesNotEqualTo(String value) {
            addCriterion("VERSION_TIMES <>", value, "versionTimes");
            return (Criteria) this;
        }

        public Criteria andVersionTimesGreaterThan(String value) {
            addCriterion("VERSION_TIMES >", value, "versionTimes");
            return (Criteria) this;
        }

        public Criteria andVersionTimesGreaterThanOrEqualTo(String value) {
            addCriterion("VERSION_TIMES >=", value, "versionTimes");
            return (Criteria) this;
        }

        public Criteria andVersionTimesLessThan(String value) {
            addCriterion("VERSION_TIMES <", value, "versionTimes");
            return (Criteria) this;
        }

        public Criteria andVersionTimesLessThanOrEqualTo(String value) {
            addCriterion("VERSION_TIMES <=", value, "versionTimes");
            return (Criteria) this;
        }

        public Criteria andVersionTimesLike(String value) {
            addCriterion("VERSION_TIMES like", value, "versionTimes");
            return (Criteria) this;
        }

        public Criteria andVersionTimesNotLike(String value) {
            addCriterion("VERSION_TIMES not like", value, "versionTimes");
            return (Criteria) this;
        }

        public Criteria andVersionTimesIn(List<String> values) {
            addCriterion("VERSION_TIMES in", values, "versionTimes");
            return (Criteria) this;
        }

        public Criteria andVersionTimesNotIn(List<String> values) {
            addCriterion("VERSION_TIMES not in", values, "versionTimes");
            return (Criteria) this;
        }

        public Criteria andVersionTimesBetween(String value1, String value2) {
            addCriterion("VERSION_TIMES between", value1, value2, "versionTimes");
            return (Criteria) this;
        }

        public Criteria andVersionTimesNotBetween(String value1, String value2) {
            addCriterion("VERSION_TIMES not between", value1, value2, "versionTimes");
            return (Criteria) this;
        }

        public Criteria andStandardBatchQtyIsNull() {
            addCriterion("STANDARD_BATCH_QTY is null");
            return (Criteria) this;
        }

        public Criteria andStandardBatchQtyIsNotNull() {
            addCriterion("STANDARD_BATCH_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andStandardBatchQtyEqualTo(BigDecimal value) {
            addCriterion("STANDARD_BATCH_QTY =", value, "standardBatchQty");
            return (Criteria) this;
        }

        public Criteria andStandardBatchQtyNotEqualTo(BigDecimal value) {
            addCriterion("STANDARD_BATCH_QTY <>", value, "standardBatchQty");
            return (Criteria) this;
        }

        public Criteria andStandardBatchQtyGreaterThan(BigDecimal value) {
            addCriterion("STANDARD_BATCH_QTY >", value, "standardBatchQty");
            return (Criteria) this;
        }

        public Criteria andStandardBatchQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STANDARD_BATCH_QTY >=", value, "standardBatchQty");
            return (Criteria) this;
        }

        public Criteria andStandardBatchQtyLessThan(BigDecimal value) {
            addCriterion("STANDARD_BATCH_QTY <", value, "standardBatchQty");
            return (Criteria) this;
        }

        public Criteria andStandardBatchQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STANDARD_BATCH_QTY <=", value, "standardBatchQty");
            return (Criteria) this;
        }

        public Criteria andStandardBatchQtyIn(List<BigDecimal> values) {
            addCriterion("STANDARD_BATCH_QTY in", values, "standardBatchQty");
            return (Criteria) this;
        }

        public Criteria andStandardBatchQtyNotIn(List<BigDecimal> values) {
            addCriterion("STANDARD_BATCH_QTY not in", values, "standardBatchQty");
            return (Criteria) this;
        }

        public Criteria andStandardBatchQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STANDARD_BATCH_QTY between", value1, value2, "standardBatchQty");
            return (Criteria) this;
        }

        public Criteria andStandardBatchQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STANDARD_BATCH_QTY not between", value1, value2, "standardBatchQty");
            return (Criteria) this;
        }

        public Criteria andYieldRateIsNull() {
            addCriterion("YIELD_RATE is null");
            return (Criteria) this;
        }

        public Criteria andYieldRateIsNotNull() {
            addCriterion("YIELD_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andYieldRateEqualTo(BigDecimal value) {
            addCriterion("YIELD_RATE =", value, "yieldRate");
            return (Criteria) this;
        }

        public Criteria andYieldRateNotEqualTo(BigDecimal value) {
            addCriterion("YIELD_RATE <>", value, "yieldRate");
            return (Criteria) this;
        }

        public Criteria andYieldRateGreaterThan(BigDecimal value) {
            addCriterion("YIELD_RATE >", value, "yieldRate");
            return (Criteria) this;
        }

        public Criteria andYieldRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YIELD_RATE >=", value, "yieldRate");
            return (Criteria) this;
        }

        public Criteria andYieldRateLessThan(BigDecimal value) {
            addCriterion("YIELD_RATE <", value, "yieldRate");
            return (Criteria) this;
        }

        public Criteria andYieldRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YIELD_RATE <=", value, "yieldRate");
            return (Criteria) this;
        }

        public Criteria andYieldRateIn(List<BigDecimal> values) {
            addCriterion("YIELD_RATE in", values, "yieldRate");
            return (Criteria) this;
        }

        public Criteria andYieldRateNotIn(List<BigDecimal> values) {
            addCriterion("YIELD_RATE not in", values, "yieldRate");
            return (Criteria) this;
        }

        public Criteria andYieldRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YIELD_RATE between", value1, value2, "yieldRate");
            return (Criteria) this;
        }

        public Criteria andYieldRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YIELD_RATE not between", value1, value2, "yieldRate");
            return (Criteria) this;
        }

        public Criteria andSecretItemIsNull() {
            addCriterion("SECRET_ITEM is null");
            return (Criteria) this;
        }

        public Criteria andSecretItemIsNotNull() {
            addCriterion("SECRET_ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andSecretItemEqualTo(Boolean value) {
            addCriterion("SECRET_ITEM =", value, "secretItem");
            return (Criteria) this;
        }

        public Criteria andSecretItemNotEqualTo(Boolean value) {
            addCriterion("SECRET_ITEM <>", value, "secretItem");
            return (Criteria) this;
        }

        public Criteria andSecretItemGreaterThan(Boolean value) {
            addCriterion("SECRET_ITEM >", value, "secretItem");
            return (Criteria) this;
        }

        public Criteria andSecretItemGreaterThanOrEqualTo(Boolean value) {
            addCriterion("SECRET_ITEM >=", value, "secretItem");
            return (Criteria) this;
        }

        public Criteria andSecretItemLessThan(Boolean value) {
            addCriterion("SECRET_ITEM <", value, "secretItem");
            return (Criteria) this;
        }

        public Criteria andSecretItemLessThanOrEqualTo(Boolean value) {
            addCriterion("SECRET_ITEM <=", value, "secretItem");
            return (Criteria) this;
        }

        public Criteria andSecretItemIn(List<Boolean> values) {
            addCriterion("SECRET_ITEM in", values, "secretItem");
            return (Criteria) this;
        }

        public Criteria andSecretItemNotIn(List<Boolean> values) {
            addCriterion("SECRET_ITEM not in", values, "secretItem");
            return (Criteria) this;
        }

        public Criteria andSecretItemBetween(Boolean value1, Boolean value2) {
            addCriterion("SECRET_ITEM between", value1, value2, "secretItem");
            return (Criteria) this;
        }

        public Criteria andSecretItemNotBetween(Boolean value1, Boolean value2) {
            addCriterion("SECRET_ITEM not between", value1, value2, "secretItem");
            return (Criteria) this;
        }

        public Criteria andSecretLevelIsNull() {
            addCriterion("SECRET_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andSecretLevelIsNotNull() {
            addCriterion("SECRET_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andSecretLevelEqualTo(String value) {
            addCriterion("SECRET_LEVEL =", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelNotEqualTo(String value) {
            addCriterion("SECRET_LEVEL <>", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelGreaterThan(String value) {
            addCriterion("SECRET_LEVEL >", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelGreaterThanOrEqualTo(String value) {
            addCriterion("SECRET_LEVEL >=", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelLessThan(String value) {
            addCriterion("SECRET_LEVEL <", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelLessThanOrEqualTo(String value) {
            addCriterion("SECRET_LEVEL <=", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelLike(String value) {
            addCriterion("SECRET_LEVEL like", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelNotLike(String value) {
            addCriterion("SECRET_LEVEL not like", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelIn(List<String> values) {
            addCriterion("SECRET_LEVEL in", values, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelNotIn(List<String> values) {
            addCriterion("SECRET_LEVEL not in", values, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelBetween(String value1, String value2) {
            addCriterion("SECRET_LEVEL between", value1, value2, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelNotBetween(String value1, String value2) {
            addCriterion("SECRET_LEVEL not between", value1, value2, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andReasonIdIsNull() {
            addCriterion("REASON_ID is null");
            return (Criteria) this;
        }

        public Criteria andReasonIdIsNotNull() {
            addCriterion("REASON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReasonIdEqualTo(String value) {
            addCriterion("REASON_ID =", value, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdNotEqualTo(String value) {
            addCriterion("REASON_ID <>", value, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdGreaterThan(String value) {
            addCriterion("REASON_ID >", value, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdGreaterThanOrEqualTo(String value) {
            addCriterion("REASON_ID >=", value, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdLessThan(String value) {
            addCriterion("REASON_ID <", value, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdLessThanOrEqualTo(String value) {
            addCriterion("REASON_ID <=", value, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdLike(String value) {
            addCriterion("REASON_ID like", value, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdNotLike(String value) {
            addCriterion("REASON_ID not like", value, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdIn(List<String> values) {
            addCriterion("REASON_ID in", values, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdNotIn(List<String> values) {
            addCriterion("REASON_ID not in", values, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdBetween(String value1, String value2) {
            addCriterion("REASON_ID between", value1, value2, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdNotBetween(String value1, String value2) {
            addCriterion("REASON_ID not between", value1, value2, "reasonId");
            return (Criteria) this;
        }

        public Criteria andOriginalVersionTimesIsNull() {
            addCriterion("ORIGINAL_VERSION_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andOriginalVersionTimesIsNotNull() {
            addCriterion("ORIGINAL_VERSION_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalVersionTimesEqualTo(String value) {
            addCriterion("ORIGINAL_VERSION_TIMES =", value, "originalVersionTimes");
            return (Criteria) this;
        }

        public Criteria andOriginalVersionTimesNotEqualTo(String value) {
            addCriterion("ORIGINAL_VERSION_TIMES <>", value, "originalVersionTimes");
            return (Criteria) this;
        }

        public Criteria andOriginalVersionTimesGreaterThan(String value) {
            addCriterion("ORIGINAL_VERSION_TIMES >", value, "originalVersionTimes");
            return (Criteria) this;
        }

        public Criteria andOriginalVersionTimesGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGINAL_VERSION_TIMES >=", value, "originalVersionTimes");
            return (Criteria) this;
        }

        public Criteria andOriginalVersionTimesLessThan(String value) {
            addCriterion("ORIGINAL_VERSION_TIMES <", value, "originalVersionTimes");
            return (Criteria) this;
        }

        public Criteria andOriginalVersionTimesLessThanOrEqualTo(String value) {
            addCriterion("ORIGINAL_VERSION_TIMES <=", value, "originalVersionTimes");
            return (Criteria) this;
        }

        public Criteria andOriginalVersionTimesLike(String value) {
            addCriterion("ORIGINAL_VERSION_TIMES like", value, "originalVersionTimes");
            return (Criteria) this;
        }

        public Criteria andOriginalVersionTimesNotLike(String value) {
            addCriterion("ORIGINAL_VERSION_TIMES not like", value, "originalVersionTimes");
            return (Criteria) this;
        }

        public Criteria andOriginalVersionTimesIn(List<String> values) {
            addCriterion("ORIGINAL_VERSION_TIMES in", values, "originalVersionTimes");
            return (Criteria) this;
        }

        public Criteria andOriginalVersionTimesNotIn(List<String> values) {
            addCriterion("ORIGINAL_VERSION_TIMES not in", values, "originalVersionTimes");
            return (Criteria) this;
        }

        public Criteria andOriginalVersionTimesBetween(String value1, String value2) {
            addCriterion("ORIGINAL_VERSION_TIMES between", value1, value2, "originalVersionTimes");
            return (Criteria) this;
        }

        public Criteria andOriginalVersionTimesNotBetween(String value1, String value2) {
            addCriterion("ORIGINAL_VERSION_TIMES not between", value1, value2, "originalVersionTimes");
            return (Criteria) this;
        }

        public Criteria andOriginalStandardBatchQtyIsNull() {
            addCriterion("ORIGINAL_STANDARD_BATCH_QTY is null");
            return (Criteria) this;
        }

        public Criteria andOriginalStandardBatchQtyIsNotNull() {
            addCriterion("ORIGINAL_STANDARD_BATCH_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalStandardBatchQtyEqualTo(BigDecimal value) {
            addCriterion("ORIGINAL_STANDARD_BATCH_QTY =", value, "originalStandardBatchQty");
            return (Criteria) this;
        }

        public Criteria andOriginalStandardBatchQtyNotEqualTo(BigDecimal value) {
            addCriterion("ORIGINAL_STANDARD_BATCH_QTY <>", value, "originalStandardBatchQty");
            return (Criteria) this;
        }

        public Criteria andOriginalStandardBatchQtyGreaterThan(BigDecimal value) {
            addCriterion("ORIGINAL_STANDARD_BATCH_QTY >", value, "originalStandardBatchQty");
            return (Criteria) this;
        }

        public Criteria andOriginalStandardBatchQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORIGINAL_STANDARD_BATCH_QTY >=", value, "originalStandardBatchQty");
            return (Criteria) this;
        }

        public Criteria andOriginalStandardBatchQtyLessThan(BigDecimal value) {
            addCriterion("ORIGINAL_STANDARD_BATCH_QTY <", value, "originalStandardBatchQty");
            return (Criteria) this;
        }

        public Criteria andOriginalStandardBatchQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORIGINAL_STANDARD_BATCH_QTY <=", value, "originalStandardBatchQty");
            return (Criteria) this;
        }

        public Criteria andOriginalStandardBatchQtyIn(List<BigDecimal> values) {
            addCriterion("ORIGINAL_STANDARD_BATCH_QTY in", values, "originalStandardBatchQty");
            return (Criteria) this;
        }

        public Criteria andOriginalStandardBatchQtyNotIn(List<BigDecimal> values) {
            addCriterion("ORIGINAL_STANDARD_BATCH_QTY not in", values, "originalStandardBatchQty");
            return (Criteria) this;
        }

        public Criteria andOriginalStandardBatchQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORIGINAL_STANDARD_BATCH_QTY between", value1, value2, "originalStandardBatchQty");
            return (Criteria) this;
        }

        public Criteria andOriginalStandardBatchQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORIGINAL_STANDARD_BATCH_QTY not between", value1, value2, "originalStandardBatchQty");
            return (Criteria) this;
        }

        public Criteria andOriginalYieldRateIsNull() {
            addCriterion("ORIGINAL_YIELD_RATE is null");
            return (Criteria) this;
        }

        public Criteria andOriginalYieldRateIsNotNull() {
            addCriterion("ORIGINAL_YIELD_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalYieldRateEqualTo(BigDecimal value) {
            addCriterion("ORIGINAL_YIELD_RATE =", value, "originalYieldRate");
            return (Criteria) this;
        }

        public Criteria andOriginalYieldRateNotEqualTo(BigDecimal value) {
            addCriterion("ORIGINAL_YIELD_RATE <>", value, "originalYieldRate");
            return (Criteria) this;
        }

        public Criteria andOriginalYieldRateGreaterThan(BigDecimal value) {
            addCriterion("ORIGINAL_YIELD_RATE >", value, "originalYieldRate");
            return (Criteria) this;
        }

        public Criteria andOriginalYieldRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORIGINAL_YIELD_RATE >=", value, "originalYieldRate");
            return (Criteria) this;
        }

        public Criteria andOriginalYieldRateLessThan(BigDecimal value) {
            addCriterion("ORIGINAL_YIELD_RATE <", value, "originalYieldRate");
            return (Criteria) this;
        }

        public Criteria andOriginalYieldRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORIGINAL_YIELD_RATE <=", value, "originalYieldRate");
            return (Criteria) this;
        }

        public Criteria andOriginalYieldRateIn(List<BigDecimal> values) {
            addCriterion("ORIGINAL_YIELD_RATE in", values, "originalYieldRate");
            return (Criteria) this;
        }

        public Criteria andOriginalYieldRateNotIn(List<BigDecimal> values) {
            addCriterion("ORIGINAL_YIELD_RATE not in", values, "originalYieldRate");
            return (Criteria) this;
        }

        public Criteria andOriginalYieldRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORIGINAL_YIELD_RATE between", value1, value2, "originalYieldRate");
            return (Criteria) this;
        }

        public Criteria andOriginalYieldRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORIGINAL_YIELD_RATE not between", value1, value2, "originalYieldRate");
            return (Criteria) this;
        }

        public Criteria andOriginalSecretItemIsNull() {
            addCriterion("ORIGINAL_SECRET_ITEM is null");
            return (Criteria) this;
        }

        public Criteria andOriginalSecretItemIsNotNull() {
            addCriterion("ORIGINAL_SECRET_ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalSecretItemEqualTo(Boolean value) {
            addCriterion("ORIGINAL_SECRET_ITEM =", value, "originalSecretItem");
            return (Criteria) this;
        }

        public Criteria andOriginalSecretItemNotEqualTo(Boolean value) {
            addCriterion("ORIGINAL_SECRET_ITEM <>", value, "originalSecretItem");
            return (Criteria) this;
        }

        public Criteria andOriginalSecretItemGreaterThan(Boolean value) {
            addCriterion("ORIGINAL_SECRET_ITEM >", value, "originalSecretItem");
            return (Criteria) this;
        }

        public Criteria andOriginalSecretItemGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ORIGINAL_SECRET_ITEM >=", value, "originalSecretItem");
            return (Criteria) this;
        }

        public Criteria andOriginalSecretItemLessThan(Boolean value) {
            addCriterion("ORIGINAL_SECRET_ITEM <", value, "originalSecretItem");
            return (Criteria) this;
        }

        public Criteria andOriginalSecretItemLessThanOrEqualTo(Boolean value) {
            addCriterion("ORIGINAL_SECRET_ITEM <=", value, "originalSecretItem");
            return (Criteria) this;
        }

        public Criteria andOriginalSecretItemIn(List<Boolean> values) {
            addCriterion("ORIGINAL_SECRET_ITEM in", values, "originalSecretItem");
            return (Criteria) this;
        }

        public Criteria andOriginalSecretItemNotIn(List<Boolean> values) {
            addCriterion("ORIGINAL_SECRET_ITEM not in", values, "originalSecretItem");
            return (Criteria) this;
        }

        public Criteria andOriginalSecretItemBetween(Boolean value1, Boolean value2) {
            addCriterion("ORIGINAL_SECRET_ITEM between", value1, value2, "originalSecretItem");
            return (Criteria) this;
        }

        public Criteria andOriginalSecretItemNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ORIGINAL_SECRET_ITEM not between", value1, value2, "originalSecretItem");
            return (Criteria) this;
        }

        public Criteria andOriginalSecretLevelIsNull() {
            addCriterion("ORIGINAL_SECRET_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andOriginalSecretLevelIsNotNull() {
            addCriterion("ORIGINAL_SECRET_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalSecretLevelEqualTo(String value) {
            addCriterion("ORIGINAL_SECRET_LEVEL =", value, "originalSecretLevel");
            return (Criteria) this;
        }

        public Criteria andOriginalSecretLevelNotEqualTo(String value) {
            addCriterion("ORIGINAL_SECRET_LEVEL <>", value, "originalSecretLevel");
            return (Criteria) this;
        }

        public Criteria andOriginalSecretLevelGreaterThan(String value) {
            addCriterion("ORIGINAL_SECRET_LEVEL >", value, "originalSecretLevel");
            return (Criteria) this;
        }

        public Criteria andOriginalSecretLevelGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGINAL_SECRET_LEVEL >=", value, "originalSecretLevel");
            return (Criteria) this;
        }

        public Criteria andOriginalSecretLevelLessThan(String value) {
            addCriterion("ORIGINAL_SECRET_LEVEL <", value, "originalSecretLevel");
            return (Criteria) this;
        }

        public Criteria andOriginalSecretLevelLessThanOrEqualTo(String value) {
            addCriterion("ORIGINAL_SECRET_LEVEL <=", value, "originalSecretLevel");
            return (Criteria) this;
        }

        public Criteria andOriginalSecretLevelLike(String value) {
            addCriterion("ORIGINAL_SECRET_LEVEL like", value, "originalSecretLevel");
            return (Criteria) this;
        }

        public Criteria andOriginalSecretLevelNotLike(String value) {
            addCriterion("ORIGINAL_SECRET_LEVEL not like", value, "originalSecretLevel");
            return (Criteria) this;
        }

        public Criteria andOriginalSecretLevelIn(List<String> values) {
            addCriterion("ORIGINAL_SECRET_LEVEL in", values, "originalSecretLevel");
            return (Criteria) this;
        }

        public Criteria andOriginalSecretLevelNotIn(List<String> values) {
            addCriterion("ORIGINAL_SECRET_LEVEL not in", values, "originalSecretLevel");
            return (Criteria) this;
        }

        public Criteria andOriginalSecretLevelBetween(String value1, String value2) {
            addCriterion("ORIGINAL_SECRET_LEVEL between", value1, value2, "originalSecretLevel");
            return (Criteria) this;
        }

        public Criteria andOriginalSecretLevelNotBetween(String value1, String value2) {
            addCriterion("ORIGINAL_SECRET_LEVEL not between", value1, value2, "originalSecretLevel");
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

        public Criteria andOriginalRemarkIsNull() {
            addCriterion("ORIGINAL_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andOriginalRemarkIsNotNull() {
            addCriterion("ORIGINAL_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalRemarkEqualTo(String value) {
            addCriterion("ORIGINAL_REMARK =", value, "originalRemark");
            return (Criteria) this;
        }

        public Criteria andOriginalRemarkNotEqualTo(String value) {
            addCriterion("ORIGINAL_REMARK <>", value, "originalRemark");
            return (Criteria) this;
        }

        public Criteria andOriginalRemarkGreaterThan(String value) {
            addCriterion("ORIGINAL_REMARK >", value, "originalRemark");
            return (Criteria) this;
        }

        public Criteria andOriginalRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGINAL_REMARK >=", value, "originalRemark");
            return (Criteria) this;
        }

        public Criteria andOriginalRemarkLessThan(String value) {
            addCriterion("ORIGINAL_REMARK <", value, "originalRemark");
            return (Criteria) this;
        }

        public Criteria andOriginalRemarkLessThanOrEqualTo(String value) {
            addCriterion("ORIGINAL_REMARK <=", value, "originalRemark");
            return (Criteria) this;
        }

        public Criteria andOriginalRemarkLike(String value) {
            addCriterion("ORIGINAL_REMARK like", value, "originalRemark");
            return (Criteria) this;
        }

        public Criteria andOriginalRemarkNotLike(String value) {
            addCriterion("ORIGINAL_REMARK not like", value, "originalRemark");
            return (Criteria) this;
        }

        public Criteria andOriginalRemarkIn(List<String> values) {
            addCriterion("ORIGINAL_REMARK in", values, "originalRemark");
            return (Criteria) this;
        }

        public Criteria andOriginalRemarkNotIn(List<String> values) {
            addCriterion("ORIGINAL_REMARK not in", values, "originalRemark");
            return (Criteria) this;
        }

        public Criteria andOriginalRemarkBetween(String value1, String value2) {
            addCriterion("ORIGINAL_REMARK between", value1, value2, "originalRemark");
            return (Criteria) this;
        }

        public Criteria andOriginalRemarkNotBetween(String value1, String value2) {
            addCriterion("ORIGINAL_REMARK not between", value1, value2, "originalRemark");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIsNull() {
            addCriterion("CHANGE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIsNotNull() {
            addCriterion("CHANGE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTypeEqualTo(String value) {
            addCriterion("CHANGE_TYPE =", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotEqualTo(String value) {
            addCriterion("CHANGE_TYPE <>", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeGreaterThan(String value) {
            addCriterion("CHANGE_TYPE >", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANGE_TYPE >=", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLessThan(String value) {
            addCriterion("CHANGE_TYPE <", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLessThanOrEqualTo(String value) {
            addCriterion("CHANGE_TYPE <=", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLike(String value) {
            addCriterion("CHANGE_TYPE like", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotLike(String value) {
            addCriterion("CHANGE_TYPE not like", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIn(List<String> values) {
            addCriterion("CHANGE_TYPE in", values, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotIn(List<String> values) {
            addCriterion("CHANGE_TYPE not in", values, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeBetween(String value1, String value2) {
            addCriterion("CHANGE_TYPE between", value1, value2, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotBetween(String value1, String value2) {
            addCriterion("CHANGE_TYPE not between", value1, value2, "changeType");
            return (Criteria) this;
        }

        public Criteria andParentItemIdIsNull() {
            addCriterion("PARENT_ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentItemIdIsNotNull() {
            addCriterion("PARENT_ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentItemIdEqualTo(String value) {
            addCriterion("PARENT_ITEM_ID =", value, "parentItemId");
            return (Criteria) this;
        }

        public Criteria andParentItemIdNotEqualTo(String value) {
            addCriterion("PARENT_ITEM_ID <>", value, "parentItemId");
            return (Criteria) this;
        }

        public Criteria andParentItemIdGreaterThan(String value) {
            addCriterion("PARENT_ITEM_ID >", value, "parentItemId");
            return (Criteria) this;
        }

        public Criteria andParentItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_ITEM_ID >=", value, "parentItemId");
            return (Criteria) this;
        }

        public Criteria andParentItemIdLessThan(String value) {
            addCriterion("PARENT_ITEM_ID <", value, "parentItemId");
            return (Criteria) this;
        }

        public Criteria andParentItemIdLessThanOrEqualTo(String value) {
            addCriterion("PARENT_ITEM_ID <=", value, "parentItemId");
            return (Criteria) this;
        }

        public Criteria andParentItemIdLike(String value) {
            addCriterion("PARENT_ITEM_ID like", value, "parentItemId");
            return (Criteria) this;
        }

        public Criteria andParentItemIdNotLike(String value) {
            addCriterion("PARENT_ITEM_ID not like", value, "parentItemId");
            return (Criteria) this;
        }

        public Criteria andParentItemIdIn(List<String> values) {
            addCriterion("PARENT_ITEM_ID in", values, "parentItemId");
            return (Criteria) this;
        }

        public Criteria andParentItemIdNotIn(List<String> values) {
            addCriterion("PARENT_ITEM_ID not in", values, "parentItemId");
            return (Criteria) this;
        }

        public Criteria andParentItemIdBetween(String value1, String value2) {
            addCriterion("PARENT_ITEM_ID between", value1, value2, "parentItemId");
            return (Criteria) this;
        }

        public Criteria andParentItemIdNotBetween(String value1, String value2) {
            addCriterion("PARENT_ITEM_ID not between", value1, value2, "parentItemId");
            return (Criteria) this;
        }

        public Criteria andParentItemFeatureIdIsNull() {
            addCriterion("PARENT_ITEM_FEATURE_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentItemFeatureIdIsNotNull() {
            addCriterion("PARENT_ITEM_FEATURE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentItemFeatureIdEqualTo(String value) {
            addCriterion("PARENT_ITEM_FEATURE_ID =", value, "parentItemFeatureId");
            return (Criteria) this;
        }

        public Criteria andParentItemFeatureIdNotEqualTo(String value) {
            addCriterion("PARENT_ITEM_FEATURE_ID <>", value, "parentItemFeatureId");
            return (Criteria) this;
        }

        public Criteria andParentItemFeatureIdGreaterThan(String value) {
            addCriterion("PARENT_ITEM_FEATURE_ID >", value, "parentItemFeatureId");
            return (Criteria) this;
        }

        public Criteria andParentItemFeatureIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_ITEM_FEATURE_ID >=", value, "parentItemFeatureId");
            return (Criteria) this;
        }

        public Criteria andParentItemFeatureIdLessThan(String value) {
            addCriterion("PARENT_ITEM_FEATURE_ID <", value, "parentItemFeatureId");
            return (Criteria) this;
        }

        public Criteria andParentItemFeatureIdLessThanOrEqualTo(String value) {
            addCriterion("PARENT_ITEM_FEATURE_ID <=", value, "parentItemFeatureId");
            return (Criteria) this;
        }

        public Criteria andParentItemFeatureIdLike(String value) {
            addCriterion("PARENT_ITEM_FEATURE_ID like", value, "parentItemFeatureId");
            return (Criteria) this;
        }

        public Criteria andParentItemFeatureIdNotLike(String value) {
            addCriterion("PARENT_ITEM_FEATURE_ID not like", value, "parentItemFeatureId");
            return (Criteria) this;
        }

        public Criteria andParentItemFeatureIdIn(List<String> values) {
            addCriterion("PARENT_ITEM_FEATURE_ID in", values, "parentItemFeatureId");
            return (Criteria) this;
        }

        public Criteria andParentItemFeatureIdNotIn(List<String> values) {
            addCriterion("PARENT_ITEM_FEATURE_ID not in", values, "parentItemFeatureId");
            return (Criteria) this;
        }

        public Criteria andParentItemFeatureIdBetween(String value1, String value2) {
            addCriterion("PARENT_ITEM_FEATURE_ID between", value1, value2, "parentItemFeatureId");
            return (Criteria) this;
        }

        public Criteria andParentItemFeatureIdNotBetween(String value1, String value2) {
            addCriterion("PARENT_ITEM_FEATURE_ID not between", value1, value2, "parentItemFeatureId");
            return (Criteria) this;
        }

        public Criteria andOriginalParentItemIdIsNull() {
            addCriterion("ORIGINAL_PARENT_ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andOriginalParentItemIdIsNotNull() {
            addCriterion("ORIGINAL_PARENT_ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalParentItemIdEqualTo(String value) {
            addCriterion("ORIGINAL_PARENT_ITEM_ID =", value, "originalParentItemId");
            return (Criteria) this;
        }

        public Criteria andOriginalParentItemIdNotEqualTo(String value) {
            addCriterion("ORIGINAL_PARENT_ITEM_ID <>", value, "originalParentItemId");
            return (Criteria) this;
        }

        public Criteria andOriginalParentItemIdGreaterThan(String value) {
            addCriterion("ORIGINAL_PARENT_ITEM_ID >", value, "originalParentItemId");
            return (Criteria) this;
        }

        public Criteria andOriginalParentItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGINAL_PARENT_ITEM_ID >=", value, "originalParentItemId");
            return (Criteria) this;
        }

        public Criteria andOriginalParentItemIdLessThan(String value) {
            addCriterion("ORIGINAL_PARENT_ITEM_ID <", value, "originalParentItemId");
            return (Criteria) this;
        }

        public Criteria andOriginalParentItemIdLessThanOrEqualTo(String value) {
            addCriterion("ORIGINAL_PARENT_ITEM_ID <=", value, "originalParentItemId");
            return (Criteria) this;
        }

        public Criteria andOriginalParentItemIdLike(String value) {
            addCriterion("ORIGINAL_PARENT_ITEM_ID like", value, "originalParentItemId");
            return (Criteria) this;
        }

        public Criteria andOriginalParentItemIdNotLike(String value) {
            addCriterion("ORIGINAL_PARENT_ITEM_ID not like", value, "originalParentItemId");
            return (Criteria) this;
        }

        public Criteria andOriginalParentItemIdIn(List<String> values) {
            addCriterion("ORIGINAL_PARENT_ITEM_ID in", values, "originalParentItemId");
            return (Criteria) this;
        }

        public Criteria andOriginalParentItemIdNotIn(List<String> values) {
            addCriterion("ORIGINAL_PARENT_ITEM_ID not in", values, "originalParentItemId");
            return (Criteria) this;
        }

        public Criteria andOriginalParentItemIdBetween(String value1, String value2) {
            addCriterion("ORIGINAL_PARENT_ITEM_ID between", value1, value2, "originalParentItemId");
            return (Criteria) this;
        }

        public Criteria andOriginalParentItemIdNotBetween(String value1, String value2) {
            addCriterion("ORIGINAL_PARENT_ITEM_ID not between", value1, value2, "originalParentItemId");
            return (Criteria) this;
        }

        public Criteria andOriginalOrderEcnIdIsNull() {
            addCriterion("ORIGINAL_ORDER_ECN_ID is null");
            return (Criteria) this;
        }

        public Criteria andOriginalOrderEcnIdIsNotNull() {
            addCriterion("ORIGINAL_ORDER_ECN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalOrderEcnIdEqualTo(String value) {
            addCriterion("ORIGINAL_ORDER_ECN_ID =", value, "originalOrderEcnId");
            return (Criteria) this;
        }

        public Criteria andOriginalOrderEcnIdNotEqualTo(String value) {
            addCriterion("ORIGINAL_ORDER_ECN_ID <>", value, "originalOrderEcnId");
            return (Criteria) this;
        }

        public Criteria andOriginalOrderEcnIdGreaterThan(String value) {
            addCriterion("ORIGINAL_ORDER_ECN_ID >", value, "originalOrderEcnId");
            return (Criteria) this;
        }

        public Criteria andOriginalOrderEcnIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGINAL_ORDER_ECN_ID >=", value, "originalOrderEcnId");
            return (Criteria) this;
        }

        public Criteria andOriginalOrderEcnIdLessThan(String value) {
            addCriterion("ORIGINAL_ORDER_ECN_ID <", value, "originalOrderEcnId");
            return (Criteria) this;
        }

        public Criteria andOriginalOrderEcnIdLessThanOrEqualTo(String value) {
            addCriterion("ORIGINAL_ORDER_ECN_ID <=", value, "originalOrderEcnId");
            return (Criteria) this;
        }

        public Criteria andOriginalOrderEcnIdLike(String value) {
            addCriterion("ORIGINAL_ORDER_ECN_ID like", value, "originalOrderEcnId");
            return (Criteria) this;
        }

        public Criteria andOriginalOrderEcnIdNotLike(String value) {
            addCriterion("ORIGINAL_ORDER_ECN_ID not like", value, "originalOrderEcnId");
            return (Criteria) this;
        }

        public Criteria andOriginalOrderEcnIdIn(List<String> values) {
            addCriterion("ORIGINAL_ORDER_ECN_ID in", values, "originalOrderEcnId");
            return (Criteria) this;
        }

        public Criteria andOriginalOrderEcnIdNotIn(List<String> values) {
            addCriterion("ORIGINAL_ORDER_ECN_ID not in", values, "originalOrderEcnId");
            return (Criteria) this;
        }

        public Criteria andOriginalOrderEcnIdBetween(String value1, String value2) {
            addCriterion("ORIGINAL_ORDER_ECN_ID between", value1, value2, "originalOrderEcnId");
            return (Criteria) this;
        }

        public Criteria andOriginalOrderEcnIdNotBetween(String value1, String value2) {
            addCriterion("ORIGINAL_ORDER_ECN_ID not between", value1, value2, "originalOrderEcnId");
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

        public Criteria andReferencePlantIdIsNull() {
            addCriterion("REFERENCE_PLANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andReferencePlantIdIsNotNull() {
            addCriterion("REFERENCE_PLANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReferencePlantIdEqualTo(String value) {
            addCriterion("REFERENCE_PLANT_ID =", value, "referencePlantId");
            return (Criteria) this;
        }

        public Criteria andReferencePlantIdNotEqualTo(String value) {
            addCriterion("REFERENCE_PLANT_ID <>", value, "referencePlantId");
            return (Criteria) this;
        }

        public Criteria andReferencePlantIdGreaterThan(String value) {
            addCriterion("REFERENCE_PLANT_ID >", value, "referencePlantId");
            return (Criteria) this;
        }

        public Criteria andReferencePlantIdGreaterThanOrEqualTo(String value) {
            addCriterion("REFERENCE_PLANT_ID >=", value, "referencePlantId");
            return (Criteria) this;
        }

        public Criteria andReferencePlantIdLessThan(String value) {
            addCriterion("REFERENCE_PLANT_ID <", value, "referencePlantId");
            return (Criteria) this;
        }

        public Criteria andReferencePlantIdLessThanOrEqualTo(String value) {
            addCriterion("REFERENCE_PLANT_ID <=", value, "referencePlantId");
            return (Criteria) this;
        }

        public Criteria andReferencePlantIdLike(String value) {
            addCriterion("REFERENCE_PLANT_ID like", value, "referencePlantId");
            return (Criteria) this;
        }

        public Criteria andReferencePlantIdNotLike(String value) {
            addCriterion("REFERENCE_PLANT_ID not like", value, "referencePlantId");
            return (Criteria) this;
        }

        public Criteria andReferencePlantIdIn(List<String> values) {
            addCriterion("REFERENCE_PLANT_ID in", values, "referencePlantId");
            return (Criteria) this;
        }

        public Criteria andReferencePlantIdNotIn(List<String> values) {
            addCriterion("REFERENCE_PLANT_ID not in", values, "referencePlantId");
            return (Criteria) this;
        }

        public Criteria andReferencePlantIdBetween(String value1, String value2) {
            addCriterion("REFERENCE_PLANT_ID between", value1, value2, "referencePlantId");
            return (Criteria) this;
        }

        public Criteria andReferencePlantIdNotBetween(String value1, String value2) {
            addCriterion("REFERENCE_PLANT_ID not between", value1, value2, "referencePlantId");
            return (Criteria) this;
        }

        public Criteria andOriginalReferencePlantIdIsNull() {
            addCriterion("ORIGINAL_REFERENCE_PLANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andOriginalReferencePlantIdIsNotNull() {
            addCriterion("ORIGINAL_REFERENCE_PLANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalReferencePlantIdEqualTo(String value) {
            addCriterion("ORIGINAL_REFERENCE_PLANT_ID =", value, "originalReferencePlantId");
            return (Criteria) this;
        }

        public Criteria andOriginalReferencePlantIdNotEqualTo(String value) {
            addCriterion("ORIGINAL_REFERENCE_PLANT_ID <>", value, "originalReferencePlantId");
            return (Criteria) this;
        }

        public Criteria andOriginalReferencePlantIdGreaterThan(String value) {
            addCriterion("ORIGINAL_REFERENCE_PLANT_ID >", value, "originalReferencePlantId");
            return (Criteria) this;
        }

        public Criteria andOriginalReferencePlantIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGINAL_REFERENCE_PLANT_ID >=", value, "originalReferencePlantId");
            return (Criteria) this;
        }

        public Criteria andOriginalReferencePlantIdLessThan(String value) {
            addCriterion("ORIGINAL_REFERENCE_PLANT_ID <", value, "originalReferencePlantId");
            return (Criteria) this;
        }

        public Criteria andOriginalReferencePlantIdLessThanOrEqualTo(String value) {
            addCriterion("ORIGINAL_REFERENCE_PLANT_ID <=", value, "originalReferencePlantId");
            return (Criteria) this;
        }

        public Criteria andOriginalReferencePlantIdLike(String value) {
            addCriterion("ORIGINAL_REFERENCE_PLANT_ID like", value, "originalReferencePlantId");
            return (Criteria) this;
        }

        public Criteria andOriginalReferencePlantIdNotLike(String value) {
            addCriterion("ORIGINAL_REFERENCE_PLANT_ID not like", value, "originalReferencePlantId");
            return (Criteria) this;
        }

        public Criteria andOriginalReferencePlantIdIn(List<String> values) {
            addCriterion("ORIGINAL_REFERENCE_PLANT_ID in", values, "originalReferencePlantId");
            return (Criteria) this;
        }

        public Criteria andOriginalReferencePlantIdNotIn(List<String> values) {
            addCriterion("ORIGINAL_REFERENCE_PLANT_ID not in", values, "originalReferencePlantId");
            return (Criteria) this;
        }

        public Criteria andOriginalReferencePlantIdBetween(String value1, String value2) {
            addCriterion("ORIGINAL_REFERENCE_PLANT_ID between", value1, value2, "originalReferencePlantId");
            return (Criteria) this;
        }

        public Criteria andOriginalReferencePlantIdNotBetween(String value1, String value2) {
            addCriterion("ORIGINAL_REFERENCE_PLANT_ID not between", value1, value2, "originalReferencePlantId");
            return (Criteria) this;
        }

        public Criteria andOldPlmDatakeyIsNull() {
            addCriterion("OLD_PLM_DATAKEY is null");
            return (Criteria) this;
        }

        public Criteria andOldPlmDatakeyIsNotNull() {
            addCriterion("OLD_PLM_DATAKEY is not null");
            return (Criteria) this;
        }

        public Criteria andOldPlmDatakeyEqualTo(String value) {
            addCriterion("OLD_PLM_DATAKEY =", value, "oldPlmDatakey");
            return (Criteria) this;
        }

        public Criteria andOldPlmDatakeyNotEqualTo(String value) {
            addCriterion("OLD_PLM_DATAKEY <>", value, "oldPlmDatakey");
            return (Criteria) this;
        }

        public Criteria andOldPlmDatakeyGreaterThan(String value) {
            addCriterion("OLD_PLM_DATAKEY >", value, "oldPlmDatakey");
            return (Criteria) this;
        }

        public Criteria andOldPlmDatakeyGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_PLM_DATAKEY >=", value, "oldPlmDatakey");
            return (Criteria) this;
        }

        public Criteria andOldPlmDatakeyLessThan(String value) {
            addCriterion("OLD_PLM_DATAKEY <", value, "oldPlmDatakey");
            return (Criteria) this;
        }

        public Criteria andOldPlmDatakeyLessThanOrEqualTo(String value) {
            addCriterion("OLD_PLM_DATAKEY <=", value, "oldPlmDatakey");
            return (Criteria) this;
        }

        public Criteria andOldPlmDatakeyLike(String value) {
            addCriterion("OLD_PLM_DATAKEY like", value, "oldPlmDatakey");
            return (Criteria) this;
        }

        public Criteria andOldPlmDatakeyNotLike(String value) {
            addCriterion("OLD_PLM_DATAKEY not like", value, "oldPlmDatakey");
            return (Criteria) this;
        }

        public Criteria andOldPlmDatakeyIn(List<String> values) {
            addCriterion("OLD_PLM_DATAKEY in", values, "oldPlmDatakey");
            return (Criteria) this;
        }

        public Criteria andOldPlmDatakeyNotIn(List<String> values) {
            addCriterion("OLD_PLM_DATAKEY not in", values, "oldPlmDatakey");
            return (Criteria) this;
        }

        public Criteria andOldPlmDatakeyBetween(String value1, String value2) {
            addCriterion("OLD_PLM_DATAKEY between", value1, value2, "oldPlmDatakey");
            return (Criteria) this;
        }

        public Criteria andOldPlmDatakeyNotBetween(String value1, String value2) {
            addCriterion("OLD_PLM_DATAKEY not between", value1, value2, "oldPlmDatakey");
            return (Criteria) this;
        }

        public Criteria andNewPlmDatakeyIsNull() {
            addCriterion("NEW_PLM_DATAKEY is null");
            return (Criteria) this;
        }

        public Criteria andNewPlmDatakeyIsNotNull() {
            addCriterion("NEW_PLM_DATAKEY is not null");
            return (Criteria) this;
        }

        public Criteria andNewPlmDatakeyEqualTo(String value) {
            addCriterion("NEW_PLM_DATAKEY =", value, "newPlmDatakey");
            return (Criteria) this;
        }

        public Criteria andNewPlmDatakeyNotEqualTo(String value) {
            addCriterion("NEW_PLM_DATAKEY <>", value, "newPlmDatakey");
            return (Criteria) this;
        }

        public Criteria andNewPlmDatakeyGreaterThan(String value) {
            addCriterion("NEW_PLM_DATAKEY >", value, "newPlmDatakey");
            return (Criteria) this;
        }

        public Criteria andNewPlmDatakeyGreaterThanOrEqualTo(String value) {
            addCriterion("NEW_PLM_DATAKEY >=", value, "newPlmDatakey");
            return (Criteria) this;
        }

        public Criteria andNewPlmDatakeyLessThan(String value) {
            addCriterion("NEW_PLM_DATAKEY <", value, "newPlmDatakey");
            return (Criteria) this;
        }

        public Criteria andNewPlmDatakeyLessThanOrEqualTo(String value) {
            addCriterion("NEW_PLM_DATAKEY <=", value, "newPlmDatakey");
            return (Criteria) this;
        }

        public Criteria andNewPlmDatakeyLike(String value) {
            addCriterion("NEW_PLM_DATAKEY like", value, "newPlmDatakey");
            return (Criteria) this;
        }

        public Criteria andNewPlmDatakeyNotLike(String value) {
            addCriterion("NEW_PLM_DATAKEY not like", value, "newPlmDatakey");
            return (Criteria) this;
        }

        public Criteria andNewPlmDatakeyIn(List<String> values) {
            addCriterion("NEW_PLM_DATAKEY in", values, "newPlmDatakey");
            return (Criteria) this;
        }

        public Criteria andNewPlmDatakeyNotIn(List<String> values) {
            addCriterion("NEW_PLM_DATAKEY not in", values, "newPlmDatakey");
            return (Criteria) this;
        }

        public Criteria andNewPlmDatakeyBetween(String value1, String value2) {
            addCriterion("NEW_PLM_DATAKEY between", value1, value2, "newPlmDatakey");
            return (Criteria) this;
        }

        public Criteria andNewPlmDatakeyNotBetween(String value1, String value2) {
            addCriterion("NEW_PLM_DATAKEY not between", value1, value2, "newPlmDatakey");
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

        public Criteria andEcnIdIsNull() {
            addCriterion("ECN_ID is null");
            return (Criteria) this;
        }

        public Criteria andEcnIdIsNotNull() {
            addCriterion("ECN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEcnIdEqualTo(String value) {
            addCriterion("ECN_ID =", value, "ecnId");
            return (Criteria) this;
        }

        public Criteria andEcnIdNotEqualTo(String value) {
            addCriterion("ECN_ID <>", value, "ecnId");
            return (Criteria) this;
        }

        public Criteria andEcnIdGreaterThan(String value) {
            addCriterion("ECN_ID >", value, "ecnId");
            return (Criteria) this;
        }

        public Criteria andEcnIdGreaterThanOrEqualTo(String value) {
            addCriterion("ECN_ID >=", value, "ecnId");
            return (Criteria) this;
        }

        public Criteria andEcnIdLessThan(String value) {
            addCriterion("ECN_ID <", value, "ecnId");
            return (Criteria) this;
        }

        public Criteria andEcnIdLessThanOrEqualTo(String value) {
            addCriterion("ECN_ID <=", value, "ecnId");
            return (Criteria) this;
        }

        public Criteria andEcnIdLike(String value) {
            addCriterion("ECN_ID like", value, "ecnId");
            return (Criteria) this;
        }

        public Criteria andEcnIdNotLike(String value) {
            addCriterion("ECN_ID not like", value, "ecnId");
            return (Criteria) this;
        }

        public Criteria andEcnIdIn(List<String> values) {
            addCriterion("ECN_ID in", values, "ecnId");
            return (Criteria) this;
        }

        public Criteria andEcnIdNotIn(List<String> values) {
            addCriterion("ECN_ID not in", values, "ecnId");
            return (Criteria) this;
        }

        public Criteria andEcnIdBetween(String value1, String value2) {
            addCriterion("ECN_ID between", value1, value2, "ecnId");
            return (Criteria) this;
        }

        public Criteria andEcnIdNotBetween(String value1, String value2) {
            addCriterion("ECN_ID not between", value1, value2, "ecnId");
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