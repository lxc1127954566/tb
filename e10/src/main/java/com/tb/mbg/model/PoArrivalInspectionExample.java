package com.tb.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PoArrivalInspectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PoArrivalInspectionExample() {
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

        public Criteria andPoArrivalInspectionIdIsNull() {
            addCriterion("PO_ARRIVAL_INSPECTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andPoArrivalInspectionIdIsNotNull() {
            addCriterion("PO_ARRIVAL_INSPECTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPoArrivalInspectionIdEqualTo(String value) {
            addCriterion("PO_ARRIVAL_INSPECTION_ID =", value, "poArrivalInspectionId");
            return (Criteria) this;
        }

        public Criteria andPoArrivalInspectionIdNotEqualTo(String value) {
            addCriterion("PO_ARRIVAL_INSPECTION_ID <>", value, "poArrivalInspectionId");
            return (Criteria) this;
        }

        public Criteria andPoArrivalInspectionIdGreaterThan(String value) {
            addCriterion("PO_ARRIVAL_INSPECTION_ID >", value, "poArrivalInspectionId");
            return (Criteria) this;
        }

        public Criteria andPoArrivalInspectionIdGreaterThanOrEqualTo(String value) {
            addCriterion("PO_ARRIVAL_INSPECTION_ID >=", value, "poArrivalInspectionId");
            return (Criteria) this;
        }

        public Criteria andPoArrivalInspectionIdLessThan(String value) {
            addCriterion("PO_ARRIVAL_INSPECTION_ID <", value, "poArrivalInspectionId");
            return (Criteria) this;
        }

        public Criteria andPoArrivalInspectionIdLessThanOrEqualTo(String value) {
            addCriterion("PO_ARRIVAL_INSPECTION_ID <=", value, "poArrivalInspectionId");
            return (Criteria) this;
        }

        public Criteria andPoArrivalInspectionIdLike(String value) {
            addCriterion("PO_ARRIVAL_INSPECTION_ID like", value, "poArrivalInspectionId");
            return (Criteria) this;
        }

        public Criteria andPoArrivalInspectionIdNotLike(String value) {
            addCriterion("PO_ARRIVAL_INSPECTION_ID not like", value, "poArrivalInspectionId");
            return (Criteria) this;
        }

        public Criteria andPoArrivalInspectionIdIn(List<String> values) {
            addCriterion("PO_ARRIVAL_INSPECTION_ID in", values, "poArrivalInspectionId");
            return (Criteria) this;
        }

        public Criteria andPoArrivalInspectionIdNotIn(List<String> values) {
            addCriterion("PO_ARRIVAL_INSPECTION_ID not in", values, "poArrivalInspectionId");
            return (Criteria) this;
        }

        public Criteria andPoArrivalInspectionIdBetween(String value1, String value2) {
            addCriterion("PO_ARRIVAL_INSPECTION_ID between", value1, value2, "poArrivalInspectionId");
            return (Criteria) this;
        }

        public Criteria andPoArrivalInspectionIdNotBetween(String value1, String value2) {
            addCriterion("PO_ARRIVAL_INSPECTION_ID not between", value1, value2, "poArrivalInspectionId");
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

        public Criteria andInspectionDateIsNull() {
            addCriterion("INSPECTION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andInspectionDateIsNotNull() {
            addCriterion("INSPECTION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionDateEqualTo(Date value) {
            addCriterion("INSPECTION_DATE =", value, "inspectionDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDateNotEqualTo(Date value) {
            addCriterion("INSPECTION_DATE <>", value, "inspectionDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDateGreaterThan(Date value) {
            addCriterion("INSPECTION_DATE >", value, "inspectionDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDateGreaterThanOrEqualTo(Date value) {
            addCriterion("INSPECTION_DATE >=", value, "inspectionDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDateLessThan(Date value) {
            addCriterion("INSPECTION_DATE <", value, "inspectionDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDateLessThanOrEqualTo(Date value) {
            addCriterion("INSPECTION_DATE <=", value, "inspectionDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDateIn(List<Date> values) {
            addCriterion("INSPECTION_DATE in", values, "inspectionDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDateNotIn(List<Date> values) {
            addCriterion("INSPECTION_DATE not in", values, "inspectionDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDateBetween(Date value1, Date value2) {
            addCriterion("INSPECTION_DATE between", value1, value2, "inspectionDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDateNotBetween(Date value1, Date value2) {
            addCriterion("INSPECTION_DATE not between", value1, value2, "inspectionDate");
            return (Criteria) this;
        }

        public Criteria andQcTimesIsNull() {
            addCriterion("QC_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andQcTimesIsNotNull() {
            addCriterion("QC_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andQcTimesEqualTo(Integer value) {
            addCriterion("QC_TIMES =", value, "qcTimes");
            return (Criteria) this;
        }

        public Criteria andQcTimesNotEqualTo(Integer value) {
            addCriterion("QC_TIMES <>", value, "qcTimes");
            return (Criteria) this;
        }

        public Criteria andQcTimesGreaterThan(Integer value) {
            addCriterion("QC_TIMES >", value, "qcTimes");
            return (Criteria) this;
        }

        public Criteria andQcTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("QC_TIMES >=", value, "qcTimes");
            return (Criteria) this;
        }

        public Criteria andQcTimesLessThan(Integer value) {
            addCriterion("QC_TIMES <", value, "qcTimes");
            return (Criteria) this;
        }

        public Criteria andQcTimesLessThanOrEqualTo(Integer value) {
            addCriterion("QC_TIMES <=", value, "qcTimes");
            return (Criteria) this;
        }

        public Criteria andQcTimesIn(List<Integer> values) {
            addCriterion("QC_TIMES in", values, "qcTimes");
            return (Criteria) this;
        }

        public Criteria andQcTimesNotIn(List<Integer> values) {
            addCriterion("QC_TIMES not in", values, "qcTimes");
            return (Criteria) this;
        }

        public Criteria andQcTimesBetween(Integer value1, Integer value2) {
            addCriterion("QC_TIMES between", value1, value2, "qcTimes");
            return (Criteria) this;
        }

        public Criteria andQcTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("QC_TIMES not between", value1, value2, "qcTimes");
            return (Criteria) this;
        }

        public Criteria andInspectionTimesIsNull() {
            addCriterion("INSPECTION_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andInspectionTimesIsNotNull() {
            addCriterion("INSPECTION_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionTimesEqualTo(String value) {
            addCriterion("INSPECTION_TIMES =", value, "inspectionTimes");
            return (Criteria) this;
        }

        public Criteria andInspectionTimesNotEqualTo(String value) {
            addCriterion("INSPECTION_TIMES <>", value, "inspectionTimes");
            return (Criteria) this;
        }

        public Criteria andInspectionTimesGreaterThan(String value) {
            addCriterion("INSPECTION_TIMES >", value, "inspectionTimes");
            return (Criteria) this;
        }

        public Criteria andInspectionTimesGreaterThanOrEqualTo(String value) {
            addCriterion("INSPECTION_TIMES >=", value, "inspectionTimes");
            return (Criteria) this;
        }

        public Criteria andInspectionTimesLessThan(String value) {
            addCriterion("INSPECTION_TIMES <", value, "inspectionTimes");
            return (Criteria) this;
        }

        public Criteria andInspectionTimesLessThanOrEqualTo(String value) {
            addCriterion("INSPECTION_TIMES <=", value, "inspectionTimes");
            return (Criteria) this;
        }

        public Criteria andInspectionTimesLike(String value) {
            addCriterion("INSPECTION_TIMES like", value, "inspectionTimes");
            return (Criteria) this;
        }

        public Criteria andInspectionTimesNotLike(String value) {
            addCriterion("INSPECTION_TIMES not like", value, "inspectionTimes");
            return (Criteria) this;
        }

        public Criteria andInspectionTimesIn(List<String> values) {
            addCriterion("INSPECTION_TIMES in", values, "inspectionTimes");
            return (Criteria) this;
        }

        public Criteria andInspectionTimesNotIn(List<String> values) {
            addCriterion("INSPECTION_TIMES not in", values, "inspectionTimes");
            return (Criteria) this;
        }

        public Criteria andInspectionTimesBetween(String value1, String value2) {
            addCriterion("INSPECTION_TIMES between", value1, value2, "inspectionTimes");
            return (Criteria) this;
        }

        public Criteria andInspectionTimesNotBetween(String value1, String value2) {
            addCriterion("INSPECTION_TIMES not between", value1, value2, "inspectionTimes");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(String value) {
            addCriterion("ITEM_ID =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(String value) {
            addCriterion("ITEM_ID <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(String value) {
            addCriterion("ITEM_ID >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_ID >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(String value) {
            addCriterion("ITEM_ID <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(String value) {
            addCriterion("ITEM_ID <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLike(String value) {
            addCriterion("ITEM_ID like", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotLike(String value) {
            addCriterion("ITEM_ID not like", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<String> values) {
            addCriterion("ITEM_ID in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<String> values) {
            addCriterion("ITEM_ID not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(String value1, String value2) {
            addCriterion("ITEM_ID between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(String value1, String value2) {
            addCriterion("ITEM_ID not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionIsNull() {
            addCriterion("ITEM_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionIsNotNull() {
            addCriterion("ITEM_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionEqualTo(String value) {
            addCriterion("ITEM_DESCRIPTION =", value, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionNotEqualTo(String value) {
            addCriterion("ITEM_DESCRIPTION <>", value, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionGreaterThan(String value) {
            addCriterion("ITEM_DESCRIPTION >", value, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_DESCRIPTION >=", value, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionLessThan(String value) {
            addCriterion("ITEM_DESCRIPTION <", value, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionLessThanOrEqualTo(String value) {
            addCriterion("ITEM_DESCRIPTION <=", value, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionLike(String value) {
            addCriterion("ITEM_DESCRIPTION like", value, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionNotLike(String value) {
            addCriterion("ITEM_DESCRIPTION not like", value, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionIn(List<String> values) {
            addCriterion("ITEM_DESCRIPTION in", values, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionNotIn(List<String> values) {
            addCriterion("ITEM_DESCRIPTION not in", values, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionBetween(String value1, String value2) {
            addCriterion("ITEM_DESCRIPTION between", value1, value2, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionNotBetween(String value1, String value2) {
            addCriterion("ITEM_DESCRIPTION not between", value1, value2, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemFeatureIdIsNull() {
            addCriterion("ITEM_FEATURE_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemFeatureIdIsNotNull() {
            addCriterion("ITEM_FEATURE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemFeatureIdEqualTo(String value) {
            addCriterion("ITEM_FEATURE_ID =", value, "itemFeatureId");
            return (Criteria) this;
        }

        public Criteria andItemFeatureIdNotEqualTo(String value) {
            addCriterion("ITEM_FEATURE_ID <>", value, "itemFeatureId");
            return (Criteria) this;
        }

        public Criteria andItemFeatureIdGreaterThan(String value) {
            addCriterion("ITEM_FEATURE_ID >", value, "itemFeatureId");
            return (Criteria) this;
        }

        public Criteria andItemFeatureIdGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_FEATURE_ID >=", value, "itemFeatureId");
            return (Criteria) this;
        }

        public Criteria andItemFeatureIdLessThan(String value) {
            addCriterion("ITEM_FEATURE_ID <", value, "itemFeatureId");
            return (Criteria) this;
        }

        public Criteria andItemFeatureIdLessThanOrEqualTo(String value) {
            addCriterion("ITEM_FEATURE_ID <=", value, "itemFeatureId");
            return (Criteria) this;
        }

        public Criteria andItemFeatureIdLike(String value) {
            addCriterion("ITEM_FEATURE_ID like", value, "itemFeatureId");
            return (Criteria) this;
        }

        public Criteria andItemFeatureIdNotLike(String value) {
            addCriterion("ITEM_FEATURE_ID not like", value, "itemFeatureId");
            return (Criteria) this;
        }

        public Criteria andItemFeatureIdIn(List<String> values) {
            addCriterion("ITEM_FEATURE_ID in", values, "itemFeatureId");
            return (Criteria) this;
        }

        public Criteria andItemFeatureIdNotIn(List<String> values) {
            addCriterion("ITEM_FEATURE_ID not in", values, "itemFeatureId");
            return (Criteria) this;
        }

        public Criteria andItemFeatureIdBetween(String value1, String value2) {
            addCriterion("ITEM_FEATURE_ID between", value1, value2, "itemFeatureId");
            return (Criteria) this;
        }

        public Criteria andItemFeatureIdNotBetween(String value1, String value2) {
            addCriterion("ITEM_FEATURE_ID not between", value1, value2, "itemFeatureId");
            return (Criteria) this;
        }

        public Criteria andItemSpecificationIsNull() {
            addCriterion("ITEM_SPECIFICATION is null");
            return (Criteria) this;
        }

        public Criteria andItemSpecificationIsNotNull() {
            addCriterion("ITEM_SPECIFICATION is not null");
            return (Criteria) this;
        }

        public Criteria andItemSpecificationEqualTo(String value) {
            addCriterion("ITEM_SPECIFICATION =", value, "itemSpecification");
            return (Criteria) this;
        }

        public Criteria andItemSpecificationNotEqualTo(String value) {
            addCriterion("ITEM_SPECIFICATION <>", value, "itemSpecification");
            return (Criteria) this;
        }

        public Criteria andItemSpecificationGreaterThan(String value) {
            addCriterion("ITEM_SPECIFICATION >", value, "itemSpecification");
            return (Criteria) this;
        }

        public Criteria andItemSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_SPECIFICATION >=", value, "itemSpecification");
            return (Criteria) this;
        }

        public Criteria andItemSpecificationLessThan(String value) {
            addCriterion("ITEM_SPECIFICATION <", value, "itemSpecification");
            return (Criteria) this;
        }

        public Criteria andItemSpecificationLessThanOrEqualTo(String value) {
            addCriterion("ITEM_SPECIFICATION <=", value, "itemSpecification");
            return (Criteria) this;
        }

        public Criteria andItemSpecificationLike(String value) {
            addCriterion("ITEM_SPECIFICATION like", value, "itemSpecification");
            return (Criteria) this;
        }

        public Criteria andItemSpecificationNotLike(String value) {
            addCriterion("ITEM_SPECIFICATION not like", value, "itemSpecification");
            return (Criteria) this;
        }

        public Criteria andItemSpecificationIn(List<String> values) {
            addCriterion("ITEM_SPECIFICATION in", values, "itemSpecification");
            return (Criteria) this;
        }

        public Criteria andItemSpecificationNotIn(List<String> values) {
            addCriterion("ITEM_SPECIFICATION not in", values, "itemSpecification");
            return (Criteria) this;
        }

        public Criteria andItemSpecificationBetween(String value1, String value2) {
            addCriterion("ITEM_SPECIFICATION between", value1, value2, "itemSpecification");
            return (Criteria) this;
        }

        public Criteria andItemSpecificationNotBetween(String value1, String value2) {
            addCriterion("ITEM_SPECIFICATION not between", value1, value2, "itemSpecification");
            return (Criteria) this;
        }

        public Criteria andItemLotIdIsNull() {
            addCriterion("ITEM_LOT_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemLotIdIsNotNull() {
            addCriterion("ITEM_LOT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemLotIdEqualTo(String value) {
            addCriterion("ITEM_LOT_ID =", value, "itemLotId");
            return (Criteria) this;
        }

        public Criteria andItemLotIdNotEqualTo(String value) {
            addCriterion("ITEM_LOT_ID <>", value, "itemLotId");
            return (Criteria) this;
        }

        public Criteria andItemLotIdGreaterThan(String value) {
            addCriterion("ITEM_LOT_ID >", value, "itemLotId");
            return (Criteria) this;
        }

        public Criteria andItemLotIdGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_LOT_ID >=", value, "itemLotId");
            return (Criteria) this;
        }

        public Criteria andItemLotIdLessThan(String value) {
            addCriterion("ITEM_LOT_ID <", value, "itemLotId");
            return (Criteria) this;
        }

        public Criteria andItemLotIdLessThanOrEqualTo(String value) {
            addCriterion("ITEM_LOT_ID <=", value, "itemLotId");
            return (Criteria) this;
        }

        public Criteria andItemLotIdLike(String value) {
            addCriterion("ITEM_LOT_ID like", value, "itemLotId");
            return (Criteria) this;
        }

        public Criteria andItemLotIdNotLike(String value) {
            addCriterion("ITEM_LOT_ID not like", value, "itemLotId");
            return (Criteria) this;
        }

        public Criteria andItemLotIdIn(List<String> values) {
            addCriterion("ITEM_LOT_ID in", values, "itemLotId");
            return (Criteria) this;
        }

        public Criteria andItemLotIdNotIn(List<String> values) {
            addCriterion("ITEM_LOT_ID not in", values, "itemLotId");
            return (Criteria) this;
        }

        public Criteria andItemLotIdBetween(String value1, String value2) {
            addCriterion("ITEM_LOT_ID between", value1, value2, "itemLotId");
            return (Criteria) this;
        }

        public Criteria andItemLotIdNotBetween(String value1, String value2) {
            addCriterion("ITEM_LOT_ID not between", value1, value2, "itemLotId");
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

        public Criteria andInspectionQtyIsNull() {
            addCriterion("INSPECTION_QTY is null");
            return (Criteria) this;
        }

        public Criteria andInspectionQtyIsNotNull() {
            addCriterion("INSPECTION_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionQtyEqualTo(BigDecimal value) {
            addCriterion("INSPECTION_QTY =", value, "inspectionQty");
            return (Criteria) this;
        }

        public Criteria andInspectionQtyNotEqualTo(BigDecimal value) {
            addCriterion("INSPECTION_QTY <>", value, "inspectionQty");
            return (Criteria) this;
        }

        public Criteria andInspectionQtyGreaterThan(BigDecimal value) {
            addCriterion("INSPECTION_QTY >", value, "inspectionQty");
            return (Criteria) this;
        }

        public Criteria andInspectionQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INSPECTION_QTY >=", value, "inspectionQty");
            return (Criteria) this;
        }

        public Criteria andInspectionQtyLessThan(BigDecimal value) {
            addCriterion("INSPECTION_QTY <", value, "inspectionQty");
            return (Criteria) this;
        }

        public Criteria andInspectionQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INSPECTION_QTY <=", value, "inspectionQty");
            return (Criteria) this;
        }

        public Criteria andInspectionQtyIn(List<BigDecimal> values) {
            addCriterion("INSPECTION_QTY in", values, "inspectionQty");
            return (Criteria) this;
        }

        public Criteria andInspectionQtyNotIn(List<BigDecimal> values) {
            addCriterion("INSPECTION_QTY not in", values, "inspectionQty");
            return (Criteria) this;
        }

        public Criteria andInspectionQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSPECTION_QTY between", value1, value2, "inspectionQty");
            return (Criteria) this;
        }

        public Criteria andInspectionQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSPECTION_QTY not between", value1, value2, "inspectionQty");
            return (Criteria) this;
        }

        public Criteria andInspectionUnitIdIsNull() {
            addCriterion("INSPECTION_UNIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andInspectionUnitIdIsNotNull() {
            addCriterion("INSPECTION_UNIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionUnitIdEqualTo(String value) {
            addCriterion("INSPECTION_UNIT_ID =", value, "inspectionUnitId");
            return (Criteria) this;
        }

        public Criteria andInspectionUnitIdNotEqualTo(String value) {
            addCriterion("INSPECTION_UNIT_ID <>", value, "inspectionUnitId");
            return (Criteria) this;
        }

        public Criteria andInspectionUnitIdGreaterThan(String value) {
            addCriterion("INSPECTION_UNIT_ID >", value, "inspectionUnitId");
            return (Criteria) this;
        }

        public Criteria andInspectionUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("INSPECTION_UNIT_ID >=", value, "inspectionUnitId");
            return (Criteria) this;
        }

        public Criteria andInspectionUnitIdLessThan(String value) {
            addCriterion("INSPECTION_UNIT_ID <", value, "inspectionUnitId");
            return (Criteria) this;
        }

        public Criteria andInspectionUnitIdLessThanOrEqualTo(String value) {
            addCriterion("INSPECTION_UNIT_ID <=", value, "inspectionUnitId");
            return (Criteria) this;
        }

        public Criteria andInspectionUnitIdLike(String value) {
            addCriterion("INSPECTION_UNIT_ID like", value, "inspectionUnitId");
            return (Criteria) this;
        }

        public Criteria andInspectionUnitIdNotLike(String value) {
            addCriterion("INSPECTION_UNIT_ID not like", value, "inspectionUnitId");
            return (Criteria) this;
        }

        public Criteria andInspectionUnitIdIn(List<String> values) {
            addCriterion("INSPECTION_UNIT_ID in", values, "inspectionUnitId");
            return (Criteria) this;
        }

        public Criteria andInspectionUnitIdNotIn(List<String> values) {
            addCriterion("INSPECTION_UNIT_ID not in", values, "inspectionUnitId");
            return (Criteria) this;
        }

        public Criteria andInspectionUnitIdBetween(String value1, String value2) {
            addCriterion("INSPECTION_UNIT_ID between", value1, value2, "inspectionUnitId");
            return (Criteria) this;
        }

        public Criteria andInspectionUnitIdNotBetween(String value1, String value2) {
            addCriterion("INSPECTION_UNIT_ID not between", value1, value2, "inspectionUnitId");
            return (Criteria) this;
        }

        public Criteria andStrictnessDegreeIsNull() {
            addCriterion("STRICTNESS_DEGREE is null");
            return (Criteria) this;
        }

        public Criteria andStrictnessDegreeIsNotNull() {
            addCriterion("STRICTNESS_DEGREE is not null");
            return (Criteria) this;
        }

        public Criteria andStrictnessDegreeEqualTo(String value) {
            addCriterion("STRICTNESS_DEGREE =", value, "strictnessDegree");
            return (Criteria) this;
        }

        public Criteria andStrictnessDegreeNotEqualTo(String value) {
            addCriterion("STRICTNESS_DEGREE <>", value, "strictnessDegree");
            return (Criteria) this;
        }

        public Criteria andStrictnessDegreeGreaterThan(String value) {
            addCriterion("STRICTNESS_DEGREE >", value, "strictnessDegree");
            return (Criteria) this;
        }

        public Criteria andStrictnessDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("STRICTNESS_DEGREE >=", value, "strictnessDegree");
            return (Criteria) this;
        }

        public Criteria andStrictnessDegreeLessThan(String value) {
            addCriterion("STRICTNESS_DEGREE <", value, "strictnessDegree");
            return (Criteria) this;
        }

        public Criteria andStrictnessDegreeLessThanOrEqualTo(String value) {
            addCriterion("STRICTNESS_DEGREE <=", value, "strictnessDegree");
            return (Criteria) this;
        }

        public Criteria andStrictnessDegreeLike(String value) {
            addCriterion("STRICTNESS_DEGREE like", value, "strictnessDegree");
            return (Criteria) this;
        }

        public Criteria andStrictnessDegreeNotLike(String value) {
            addCriterion("STRICTNESS_DEGREE not like", value, "strictnessDegree");
            return (Criteria) this;
        }

        public Criteria andStrictnessDegreeIn(List<String> values) {
            addCriterion("STRICTNESS_DEGREE in", values, "strictnessDegree");
            return (Criteria) this;
        }

        public Criteria andStrictnessDegreeNotIn(List<String> values) {
            addCriterion("STRICTNESS_DEGREE not in", values, "strictnessDegree");
            return (Criteria) this;
        }

        public Criteria andStrictnessDegreeBetween(String value1, String value2) {
            addCriterion("STRICTNESS_DEGREE between", value1, value2, "strictnessDegree");
            return (Criteria) this;
        }

        public Criteria andStrictnessDegreeNotBetween(String value1, String value2) {
            addCriterion("STRICTNESS_DEGREE not between", value1, value2, "strictnessDegree");
            return (Criteria) this;
        }

        public Criteria andInspectionDueDateIsNull() {
            addCriterion("INSPECTION_DUE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andInspectionDueDateIsNotNull() {
            addCriterion("INSPECTION_DUE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionDueDateEqualTo(Date value) {
            addCriterion("INSPECTION_DUE_DATE =", value, "inspectionDueDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDueDateNotEqualTo(Date value) {
            addCriterion("INSPECTION_DUE_DATE <>", value, "inspectionDueDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDueDateGreaterThan(Date value) {
            addCriterion("INSPECTION_DUE_DATE >", value, "inspectionDueDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDueDateGreaterThanOrEqualTo(Date value) {
            addCriterion("INSPECTION_DUE_DATE >=", value, "inspectionDueDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDueDateLessThan(Date value) {
            addCriterion("INSPECTION_DUE_DATE <", value, "inspectionDueDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDueDateLessThanOrEqualTo(Date value) {
            addCriterion("INSPECTION_DUE_DATE <=", value, "inspectionDueDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDueDateIn(List<Date> values) {
            addCriterion("INSPECTION_DUE_DATE in", values, "inspectionDueDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDueDateNotIn(List<Date> values) {
            addCriterion("INSPECTION_DUE_DATE not in", values, "inspectionDueDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDueDateBetween(Date value1, Date value2) {
            addCriterion("INSPECTION_DUE_DATE between", value1, value2, "inspectionDueDate");
            return (Criteria) this;
        }

        public Criteria andInspectionDueDateNotBetween(Date value1, Date value2) {
            addCriterion("INSPECTION_DUE_DATE not between", value1, value2, "inspectionDueDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDeptIdIsNull() {
            addCriterion("SUBMIT_DEPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andSubmitDeptIdIsNotNull() {
            addCriterion("SUBMIT_DEPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitDeptIdEqualTo(String value) {
            addCriterion("SUBMIT_DEPT_ID =", value, "submitDeptId");
            return (Criteria) this;
        }

        public Criteria andSubmitDeptIdNotEqualTo(String value) {
            addCriterion("SUBMIT_DEPT_ID <>", value, "submitDeptId");
            return (Criteria) this;
        }

        public Criteria andSubmitDeptIdGreaterThan(String value) {
            addCriterion("SUBMIT_DEPT_ID >", value, "submitDeptId");
            return (Criteria) this;
        }

        public Criteria andSubmitDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUBMIT_DEPT_ID >=", value, "submitDeptId");
            return (Criteria) this;
        }

        public Criteria andSubmitDeptIdLessThan(String value) {
            addCriterion("SUBMIT_DEPT_ID <", value, "submitDeptId");
            return (Criteria) this;
        }

        public Criteria andSubmitDeptIdLessThanOrEqualTo(String value) {
            addCriterion("SUBMIT_DEPT_ID <=", value, "submitDeptId");
            return (Criteria) this;
        }

        public Criteria andSubmitDeptIdLike(String value) {
            addCriterion("SUBMIT_DEPT_ID like", value, "submitDeptId");
            return (Criteria) this;
        }

        public Criteria andSubmitDeptIdNotLike(String value) {
            addCriterion("SUBMIT_DEPT_ID not like", value, "submitDeptId");
            return (Criteria) this;
        }

        public Criteria andSubmitDeptIdIn(List<String> values) {
            addCriterion("SUBMIT_DEPT_ID in", values, "submitDeptId");
            return (Criteria) this;
        }

        public Criteria andSubmitDeptIdNotIn(List<String> values) {
            addCriterion("SUBMIT_DEPT_ID not in", values, "submitDeptId");
            return (Criteria) this;
        }

        public Criteria andSubmitDeptIdBetween(String value1, String value2) {
            addCriterion("SUBMIT_DEPT_ID between", value1, value2, "submitDeptId");
            return (Criteria) this;
        }

        public Criteria andSubmitDeptIdNotBetween(String value1, String value2) {
            addCriterion("SUBMIT_DEPT_ID not between", value1, value2, "submitDeptId");
            return (Criteria) this;
        }

        public Criteria andSubmitEmpIdIsNull() {
            addCriterion("SUBMIT_EMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andSubmitEmpIdIsNotNull() {
            addCriterion("SUBMIT_EMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitEmpIdEqualTo(String value) {
            addCriterion("SUBMIT_EMP_ID =", value, "submitEmpId");
            return (Criteria) this;
        }

        public Criteria andSubmitEmpIdNotEqualTo(String value) {
            addCriterion("SUBMIT_EMP_ID <>", value, "submitEmpId");
            return (Criteria) this;
        }

        public Criteria andSubmitEmpIdGreaterThan(String value) {
            addCriterion("SUBMIT_EMP_ID >", value, "submitEmpId");
            return (Criteria) this;
        }

        public Criteria andSubmitEmpIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUBMIT_EMP_ID >=", value, "submitEmpId");
            return (Criteria) this;
        }

        public Criteria andSubmitEmpIdLessThan(String value) {
            addCriterion("SUBMIT_EMP_ID <", value, "submitEmpId");
            return (Criteria) this;
        }

        public Criteria andSubmitEmpIdLessThanOrEqualTo(String value) {
            addCriterion("SUBMIT_EMP_ID <=", value, "submitEmpId");
            return (Criteria) this;
        }

        public Criteria andSubmitEmpIdLike(String value) {
            addCriterion("SUBMIT_EMP_ID like", value, "submitEmpId");
            return (Criteria) this;
        }

        public Criteria andSubmitEmpIdNotLike(String value) {
            addCriterion("SUBMIT_EMP_ID not like", value, "submitEmpId");
            return (Criteria) this;
        }

        public Criteria andSubmitEmpIdIn(List<String> values) {
            addCriterion("SUBMIT_EMP_ID in", values, "submitEmpId");
            return (Criteria) this;
        }

        public Criteria andSubmitEmpIdNotIn(List<String> values) {
            addCriterion("SUBMIT_EMP_ID not in", values, "submitEmpId");
            return (Criteria) this;
        }

        public Criteria andSubmitEmpIdBetween(String value1, String value2) {
            addCriterion("SUBMIT_EMP_ID between", value1, value2, "submitEmpId");
            return (Criteria) this;
        }

        public Criteria andSubmitEmpIdNotBetween(String value1, String value2) {
            addCriterion("SUBMIT_EMP_ID not between", value1, value2, "submitEmpId");
            return (Criteria) this;
        }

        public Criteria andInventoryQtyIsNull() {
            addCriterion("INVENTORY_QTY is null");
            return (Criteria) this;
        }

        public Criteria andInventoryQtyIsNotNull() {
            addCriterion("INVENTORY_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryQtyEqualTo(BigDecimal value) {
            addCriterion("INVENTORY_QTY =", value, "inventoryQty");
            return (Criteria) this;
        }

        public Criteria andInventoryQtyNotEqualTo(BigDecimal value) {
            addCriterion("INVENTORY_QTY <>", value, "inventoryQty");
            return (Criteria) this;
        }

        public Criteria andInventoryQtyGreaterThan(BigDecimal value) {
            addCriterion("INVENTORY_QTY >", value, "inventoryQty");
            return (Criteria) this;
        }

        public Criteria andInventoryQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVENTORY_QTY >=", value, "inventoryQty");
            return (Criteria) this;
        }

        public Criteria andInventoryQtyLessThan(BigDecimal value) {
            addCriterion("INVENTORY_QTY <", value, "inventoryQty");
            return (Criteria) this;
        }

        public Criteria andInventoryQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVENTORY_QTY <=", value, "inventoryQty");
            return (Criteria) this;
        }

        public Criteria andInventoryQtyIn(List<BigDecimal> values) {
            addCriterion("INVENTORY_QTY in", values, "inventoryQty");
            return (Criteria) this;
        }

        public Criteria andInventoryQtyNotIn(List<BigDecimal> values) {
            addCriterion("INVENTORY_QTY not in", values, "inventoryQty");
            return (Criteria) this;
        }

        public Criteria andInventoryQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVENTORY_QTY between", value1, value2, "inventoryQty");
            return (Criteria) this;
        }

        public Criteria andInventoryQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVENTORY_QTY not between", value1, value2, "inventoryQty");
            return (Criteria) this;
        }

        public Criteria andSecondQtyIsNull() {
            addCriterion("SECOND_QTY is null");
            return (Criteria) this;
        }

        public Criteria andSecondQtyIsNotNull() {
            addCriterion("SECOND_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andSecondQtyEqualTo(BigDecimal value) {
            addCriterion("SECOND_QTY =", value, "secondQty");
            return (Criteria) this;
        }

        public Criteria andSecondQtyNotEqualTo(BigDecimal value) {
            addCriterion("SECOND_QTY <>", value, "secondQty");
            return (Criteria) this;
        }

        public Criteria andSecondQtyGreaterThan(BigDecimal value) {
            addCriterion("SECOND_QTY >", value, "secondQty");
            return (Criteria) this;
        }

        public Criteria andSecondQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SECOND_QTY >=", value, "secondQty");
            return (Criteria) this;
        }

        public Criteria andSecondQtyLessThan(BigDecimal value) {
            addCriterion("SECOND_QTY <", value, "secondQty");
            return (Criteria) this;
        }

        public Criteria andSecondQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SECOND_QTY <=", value, "secondQty");
            return (Criteria) this;
        }

        public Criteria andSecondQtyIn(List<BigDecimal> values) {
            addCriterion("SECOND_QTY in", values, "secondQty");
            return (Criteria) this;
        }

        public Criteria andSecondQtyNotIn(List<BigDecimal> values) {
            addCriterion("SECOND_QTY not in", values, "secondQty");
            return (Criteria) this;
        }

        public Criteria andSecondQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SECOND_QTY between", value1, value2, "secondQty");
            return (Criteria) this;
        }

        public Criteria andSecondQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SECOND_QTY not between", value1, value2, "secondQty");
            return (Criteria) this;
        }

        public Criteria andAcceptableQtyIsNull() {
            addCriterion("ACCEPTABLE_QTY is null");
            return (Criteria) this;
        }

        public Criteria andAcceptableQtyIsNotNull() {
            addCriterion("ACCEPTABLE_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptableQtyEqualTo(BigDecimal value) {
            addCriterion("ACCEPTABLE_QTY =", value, "acceptableQty");
            return (Criteria) this;
        }

        public Criteria andAcceptableQtyNotEqualTo(BigDecimal value) {
            addCriterion("ACCEPTABLE_QTY <>", value, "acceptableQty");
            return (Criteria) this;
        }

        public Criteria andAcceptableQtyGreaterThan(BigDecimal value) {
            addCriterion("ACCEPTABLE_QTY >", value, "acceptableQty");
            return (Criteria) this;
        }

        public Criteria andAcceptableQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCEPTABLE_QTY >=", value, "acceptableQty");
            return (Criteria) this;
        }

        public Criteria andAcceptableQtyLessThan(BigDecimal value) {
            addCriterion("ACCEPTABLE_QTY <", value, "acceptableQty");
            return (Criteria) this;
        }

        public Criteria andAcceptableQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCEPTABLE_QTY <=", value, "acceptableQty");
            return (Criteria) this;
        }

        public Criteria andAcceptableQtyIn(List<BigDecimal> values) {
            addCriterion("ACCEPTABLE_QTY in", values, "acceptableQty");
            return (Criteria) this;
        }

        public Criteria andAcceptableQtyNotIn(List<BigDecimal> values) {
            addCriterion("ACCEPTABLE_QTY not in", values, "acceptableQty");
            return (Criteria) this;
        }

        public Criteria andAcceptableQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCEPTABLE_QTY between", value1, value2, "acceptableQty");
            return (Criteria) this;
        }

        public Criteria andAcceptableQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCEPTABLE_QTY not between", value1, value2, "acceptableQty");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedQtyIsNull() {
            addCriterion("UNQUALIFIED_QTY is null");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedQtyIsNotNull() {
            addCriterion("UNQUALIFIED_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedQtyEqualTo(BigDecimal value) {
            addCriterion("UNQUALIFIED_QTY =", value, "unqualifiedQty");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedQtyNotEqualTo(BigDecimal value) {
            addCriterion("UNQUALIFIED_QTY <>", value, "unqualifiedQty");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedQtyGreaterThan(BigDecimal value) {
            addCriterion("UNQUALIFIED_QTY >", value, "unqualifiedQty");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UNQUALIFIED_QTY >=", value, "unqualifiedQty");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedQtyLessThan(BigDecimal value) {
            addCriterion("UNQUALIFIED_QTY <", value, "unqualifiedQty");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UNQUALIFIED_QTY <=", value, "unqualifiedQty");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedQtyIn(List<BigDecimal> values) {
            addCriterion("UNQUALIFIED_QTY in", values, "unqualifiedQty");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedQtyNotIn(List<BigDecimal> values) {
            addCriterion("UNQUALIFIED_QTY not in", values, "unqualifiedQty");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNQUALIFIED_QTY between", value1, value2, "unqualifiedQty");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNQUALIFIED_QTY not between", value1, value2, "unqualifiedQty");
            return (Criteria) this;
        }

        public Criteria andDestroyedQtyIsNull() {
            addCriterion("DESTROYED_QTY is null");
            return (Criteria) this;
        }

        public Criteria andDestroyedQtyIsNotNull() {
            addCriterion("DESTROYED_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andDestroyedQtyEqualTo(BigDecimal value) {
            addCriterion("DESTROYED_QTY =", value, "destroyedQty");
            return (Criteria) this;
        }

        public Criteria andDestroyedQtyNotEqualTo(BigDecimal value) {
            addCriterion("DESTROYED_QTY <>", value, "destroyedQty");
            return (Criteria) this;
        }

        public Criteria andDestroyedQtyGreaterThan(BigDecimal value) {
            addCriterion("DESTROYED_QTY >", value, "destroyedQty");
            return (Criteria) this;
        }

        public Criteria andDestroyedQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DESTROYED_QTY >=", value, "destroyedQty");
            return (Criteria) this;
        }

        public Criteria andDestroyedQtyLessThan(BigDecimal value) {
            addCriterion("DESTROYED_QTY <", value, "destroyedQty");
            return (Criteria) this;
        }

        public Criteria andDestroyedQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DESTROYED_QTY <=", value, "destroyedQty");
            return (Criteria) this;
        }

        public Criteria andDestroyedQtyIn(List<BigDecimal> values) {
            addCriterion("DESTROYED_QTY in", values, "destroyedQty");
            return (Criteria) this;
        }

        public Criteria andDestroyedQtyNotIn(List<BigDecimal> values) {
            addCriterion("DESTROYED_QTY not in", values, "destroyedQty");
            return (Criteria) this;
        }

        public Criteria andDestroyedQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DESTROYED_QTY between", value1, value2, "destroyedQty");
            return (Criteria) this;
        }

        public Criteria andDestroyedQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DESTROYED_QTY not between", value1, value2, "destroyedQty");
            return (Criteria) this;
        }

        public Criteria andDecisionIsNull() {
            addCriterion("DECISION is null");
            return (Criteria) this;
        }

        public Criteria andDecisionIsNotNull() {
            addCriterion("DECISION is not null");
            return (Criteria) this;
        }

        public Criteria andDecisionEqualTo(String value) {
            addCriterion("DECISION =", value, "decision");
            return (Criteria) this;
        }

        public Criteria andDecisionNotEqualTo(String value) {
            addCriterion("DECISION <>", value, "decision");
            return (Criteria) this;
        }

        public Criteria andDecisionGreaterThan(String value) {
            addCriterion("DECISION >", value, "decision");
            return (Criteria) this;
        }

        public Criteria andDecisionGreaterThanOrEqualTo(String value) {
            addCriterion("DECISION >=", value, "decision");
            return (Criteria) this;
        }

        public Criteria andDecisionLessThan(String value) {
            addCriterion("DECISION <", value, "decision");
            return (Criteria) this;
        }

        public Criteria andDecisionLessThanOrEqualTo(String value) {
            addCriterion("DECISION <=", value, "decision");
            return (Criteria) this;
        }

        public Criteria andDecisionLike(String value) {
            addCriterion("DECISION like", value, "decision");
            return (Criteria) this;
        }

        public Criteria andDecisionNotLike(String value) {
            addCriterion("DECISION not like", value, "decision");
            return (Criteria) this;
        }

        public Criteria andDecisionIn(List<String> values) {
            addCriterion("DECISION in", values, "decision");
            return (Criteria) this;
        }

        public Criteria andDecisionNotIn(List<String> values) {
            addCriterion("DECISION not in", values, "decision");
            return (Criteria) this;
        }

        public Criteria andDecisionBetween(String value1, String value2) {
            addCriterion("DECISION between", value1, value2, "decision");
            return (Criteria) this;
        }

        public Criteria andDecisionNotBetween(String value1, String value2) {
            addCriterion("DECISION not between", value1, value2, "decision");
            return (Criteria) this;
        }

        public Criteria andDecisionDescriptionIsNull() {
            addCriterion("DECISION_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDecisionDescriptionIsNotNull() {
            addCriterion("DECISION_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDecisionDescriptionEqualTo(String value) {
            addCriterion("DECISION_DESCRIPTION =", value, "decisionDescription");
            return (Criteria) this;
        }

        public Criteria andDecisionDescriptionNotEqualTo(String value) {
            addCriterion("DECISION_DESCRIPTION <>", value, "decisionDescription");
            return (Criteria) this;
        }

        public Criteria andDecisionDescriptionGreaterThan(String value) {
            addCriterion("DECISION_DESCRIPTION >", value, "decisionDescription");
            return (Criteria) this;
        }

        public Criteria andDecisionDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DECISION_DESCRIPTION >=", value, "decisionDescription");
            return (Criteria) this;
        }

        public Criteria andDecisionDescriptionLessThan(String value) {
            addCriterion("DECISION_DESCRIPTION <", value, "decisionDescription");
            return (Criteria) this;
        }

        public Criteria andDecisionDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DECISION_DESCRIPTION <=", value, "decisionDescription");
            return (Criteria) this;
        }

        public Criteria andDecisionDescriptionLike(String value) {
            addCriterion("DECISION_DESCRIPTION like", value, "decisionDescription");
            return (Criteria) this;
        }

        public Criteria andDecisionDescriptionNotLike(String value) {
            addCriterion("DECISION_DESCRIPTION not like", value, "decisionDescription");
            return (Criteria) this;
        }

        public Criteria andDecisionDescriptionIn(List<String> values) {
            addCriterion("DECISION_DESCRIPTION in", values, "decisionDescription");
            return (Criteria) this;
        }

        public Criteria andDecisionDescriptionNotIn(List<String> values) {
            addCriterion("DECISION_DESCRIPTION not in", values, "decisionDescription");
            return (Criteria) this;
        }

        public Criteria andDecisionDescriptionBetween(String value1, String value2) {
            addCriterion("DECISION_DESCRIPTION between", value1, value2, "decisionDescription");
            return (Criteria) this;
        }

        public Criteria andDecisionDescriptionNotBetween(String value1, String value2) {
            addCriterion("DECISION_DESCRIPTION not between", value1, value2, "decisionDescription");
            return (Criteria) this;
        }

        public Criteria andResultStatusIsNull() {
            addCriterion("RESULT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andResultStatusIsNotNull() {
            addCriterion("RESULT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andResultStatusEqualTo(String value) {
            addCriterion("RESULT_STATUS =", value, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusNotEqualTo(String value) {
            addCriterion("RESULT_STATUS <>", value, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusGreaterThan(String value) {
            addCriterion("RESULT_STATUS >", value, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT_STATUS >=", value, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusLessThan(String value) {
            addCriterion("RESULT_STATUS <", value, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusLessThanOrEqualTo(String value) {
            addCriterion("RESULT_STATUS <=", value, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusLike(String value) {
            addCriterion("RESULT_STATUS like", value, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusNotLike(String value) {
            addCriterion("RESULT_STATUS not like", value, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusIn(List<String> values) {
            addCriterion("RESULT_STATUS in", values, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusNotIn(List<String> values) {
            addCriterion("RESULT_STATUS not in", values, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusBetween(String value1, String value2) {
            addCriterion("RESULT_STATUS between", value1, value2, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andResultStatusNotBetween(String value1, String value2) {
            addCriterion("RESULT_STATUS not between", value1, value2, "resultStatus");
            return (Criteria) this;
        }

        public Criteria andReinspectionIsNull() {
            addCriterion("REINSPECTION is null");
            return (Criteria) this;
        }

        public Criteria andReinspectionIsNotNull() {
            addCriterion("REINSPECTION is not null");
            return (Criteria) this;
        }

        public Criteria andReinspectionEqualTo(Boolean value) {
            addCriterion("REINSPECTION =", value, "reinspection");
            return (Criteria) this;
        }

        public Criteria andReinspectionNotEqualTo(Boolean value) {
            addCriterion("REINSPECTION <>", value, "reinspection");
            return (Criteria) this;
        }

        public Criteria andReinspectionGreaterThan(Boolean value) {
            addCriterion("REINSPECTION >", value, "reinspection");
            return (Criteria) this;
        }

        public Criteria andReinspectionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("REINSPECTION >=", value, "reinspection");
            return (Criteria) this;
        }

        public Criteria andReinspectionLessThan(Boolean value) {
            addCriterion("REINSPECTION <", value, "reinspection");
            return (Criteria) this;
        }

        public Criteria andReinspectionLessThanOrEqualTo(Boolean value) {
            addCriterion("REINSPECTION <=", value, "reinspection");
            return (Criteria) this;
        }

        public Criteria andReinspectionIn(List<Boolean> values) {
            addCriterion("REINSPECTION in", values, "reinspection");
            return (Criteria) this;
        }

        public Criteria andReinspectionNotIn(List<Boolean> values) {
            addCriterion("REINSPECTION not in", values, "reinspection");
            return (Criteria) this;
        }

        public Criteria andReinspectionBetween(Boolean value1, Boolean value2) {
            addCriterion("REINSPECTION between", value1, value2, "reinspection");
            return (Criteria) this;
        }

        public Criteria andReinspectionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("REINSPECTION not between", value1, value2, "reinspection");
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

        public Criteria andInspectionPlanIdIsNull() {
            addCriterion("INSPECTION_PLAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andInspectionPlanIdIsNotNull() {
            addCriterion("INSPECTION_PLAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionPlanIdEqualTo(String value) {
            addCriterion("INSPECTION_PLAN_ID =", value, "inspectionPlanId");
            return (Criteria) this;
        }

        public Criteria andInspectionPlanIdNotEqualTo(String value) {
            addCriterion("INSPECTION_PLAN_ID <>", value, "inspectionPlanId");
            return (Criteria) this;
        }

        public Criteria andInspectionPlanIdGreaterThan(String value) {
            addCriterion("INSPECTION_PLAN_ID >", value, "inspectionPlanId");
            return (Criteria) this;
        }

        public Criteria andInspectionPlanIdGreaterThanOrEqualTo(String value) {
            addCriterion("INSPECTION_PLAN_ID >=", value, "inspectionPlanId");
            return (Criteria) this;
        }

        public Criteria andInspectionPlanIdLessThan(String value) {
            addCriterion("INSPECTION_PLAN_ID <", value, "inspectionPlanId");
            return (Criteria) this;
        }

        public Criteria andInspectionPlanIdLessThanOrEqualTo(String value) {
            addCriterion("INSPECTION_PLAN_ID <=", value, "inspectionPlanId");
            return (Criteria) this;
        }

        public Criteria andInspectionPlanIdLike(String value) {
            addCriterion("INSPECTION_PLAN_ID like", value, "inspectionPlanId");
            return (Criteria) this;
        }

        public Criteria andInspectionPlanIdNotLike(String value) {
            addCriterion("INSPECTION_PLAN_ID not like", value, "inspectionPlanId");
            return (Criteria) this;
        }

        public Criteria andInspectionPlanIdIn(List<String> values) {
            addCriterion("INSPECTION_PLAN_ID in", values, "inspectionPlanId");
            return (Criteria) this;
        }

        public Criteria andInspectionPlanIdNotIn(List<String> values) {
            addCriterion("INSPECTION_PLAN_ID not in", values, "inspectionPlanId");
            return (Criteria) this;
        }

        public Criteria andInspectionPlanIdBetween(String value1, String value2) {
            addCriterion("INSPECTION_PLAN_ID between", value1, value2, "inspectionPlanId");
            return (Criteria) this;
        }

        public Criteria andInspectionPlanIdNotBetween(String value1, String value2) {
            addCriterion("INSPECTION_PLAN_ID not between", value1, value2, "inspectionPlanId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("COMPANY_ID =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("COMPANY_ID <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("COMPANY_ID >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_ID >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("COMPANY_ID <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_ID <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("COMPANY_ID like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("COMPANY_ID not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("COMPANY_ID in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("COMPANY_ID not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("COMPANY_ID between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("COMPANY_ID not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andSourceIdIsNull() {
            addCriterion("SOURCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSourceIdIsNotNull() {
            addCriterion("SOURCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSourceIdEqualTo(String value) {
            addCriterion("SOURCE_ID =", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotEqualTo(String value) {
            addCriterion("SOURCE_ID <>", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdGreaterThan(String value) {
            addCriterion("SOURCE_ID >", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_ID >=", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLessThan(String value) {
            addCriterion("SOURCE_ID <", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_ID <=", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLike(String value) {
            addCriterion("SOURCE_ID like", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotLike(String value) {
            addCriterion("SOURCE_ID not like", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdIn(List<String> values) {
            addCriterion("SOURCE_ID in", values, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotIn(List<String> values) {
            addCriterion("SOURCE_ID not in", values, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdBetween(String value1, String value2) {
            addCriterion("SOURCE_ID between", value1, value2, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotBetween(String value1, String value2) {
            addCriterion("SOURCE_ID not between", value1, value2, "sourceId");
            return (Criteria) this;
        }

        public Criteria andMoRoutingDIdIsNull() {
            addCriterion("MO_ROUTING_D_ID is null");
            return (Criteria) this;
        }

        public Criteria andMoRoutingDIdIsNotNull() {
            addCriterion("MO_ROUTING_D_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMoRoutingDIdEqualTo(String value) {
            addCriterion("MO_ROUTING_D_ID =", value, "moRoutingDId");
            return (Criteria) this;
        }

        public Criteria andMoRoutingDIdNotEqualTo(String value) {
            addCriterion("MO_ROUTING_D_ID <>", value, "moRoutingDId");
            return (Criteria) this;
        }

        public Criteria andMoRoutingDIdGreaterThan(String value) {
            addCriterion("MO_ROUTING_D_ID >", value, "moRoutingDId");
            return (Criteria) this;
        }

        public Criteria andMoRoutingDIdGreaterThanOrEqualTo(String value) {
            addCriterion("MO_ROUTING_D_ID >=", value, "moRoutingDId");
            return (Criteria) this;
        }

        public Criteria andMoRoutingDIdLessThan(String value) {
            addCriterion("MO_ROUTING_D_ID <", value, "moRoutingDId");
            return (Criteria) this;
        }

        public Criteria andMoRoutingDIdLessThanOrEqualTo(String value) {
            addCriterion("MO_ROUTING_D_ID <=", value, "moRoutingDId");
            return (Criteria) this;
        }

        public Criteria andMoRoutingDIdLike(String value) {
            addCriterion("MO_ROUTING_D_ID like", value, "moRoutingDId");
            return (Criteria) this;
        }

        public Criteria andMoRoutingDIdNotLike(String value) {
            addCriterion("MO_ROUTING_D_ID not like", value, "moRoutingDId");
            return (Criteria) this;
        }

        public Criteria andMoRoutingDIdIn(List<String> values) {
            addCriterion("MO_ROUTING_D_ID in", values, "moRoutingDId");
            return (Criteria) this;
        }

        public Criteria andMoRoutingDIdNotIn(List<String> values) {
            addCriterion("MO_ROUTING_D_ID not in", values, "moRoutingDId");
            return (Criteria) this;
        }

        public Criteria andMoRoutingDIdBetween(String value1, String value2) {
            addCriterion("MO_ROUTING_D_ID between", value1, value2, "moRoutingDId");
            return (Criteria) this;
        }

        public Criteria andMoRoutingDIdNotBetween(String value1, String value2) {
            addCriterion("MO_ROUTING_D_ID not between", value1, value2, "moRoutingDId");
            return (Criteria) this;
        }

        public Criteria andOperationIdIsNull() {
            addCriterion("OPERATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperationIdIsNotNull() {
            addCriterion("OPERATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperationIdEqualTo(String value) {
            addCriterion("OPERATION_ID =", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdNotEqualTo(String value) {
            addCriterion("OPERATION_ID <>", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdGreaterThan(String value) {
            addCriterion("OPERATION_ID >", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATION_ID >=", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdLessThan(String value) {
            addCriterion("OPERATION_ID <", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdLessThanOrEqualTo(String value) {
            addCriterion("OPERATION_ID <=", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdLike(String value) {
            addCriterion("OPERATION_ID like", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdNotLike(String value) {
            addCriterion("OPERATION_ID not like", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdIn(List<String> values) {
            addCriterion("OPERATION_ID in", values, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdNotIn(List<String> values) {
            addCriterion("OPERATION_ID not in", values, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdBetween(String value1, String value2) {
            addCriterion("OPERATION_ID between", value1, value2, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdNotBetween(String value1, String value2) {
            addCriterion("OPERATION_ID not between", value1, value2, "operationId");
            return (Criteria) this;
        }

        public Criteria andToMoRoutingDIdIsNull() {
            addCriterion("TO_MO_ROUTING_D_ID is null");
            return (Criteria) this;
        }

        public Criteria andToMoRoutingDIdIsNotNull() {
            addCriterion("TO_MO_ROUTING_D_ID is not null");
            return (Criteria) this;
        }

        public Criteria andToMoRoutingDIdEqualTo(String value) {
            addCriterion("TO_MO_ROUTING_D_ID =", value, "toMoRoutingDId");
            return (Criteria) this;
        }

        public Criteria andToMoRoutingDIdNotEqualTo(String value) {
            addCriterion("TO_MO_ROUTING_D_ID <>", value, "toMoRoutingDId");
            return (Criteria) this;
        }

        public Criteria andToMoRoutingDIdGreaterThan(String value) {
            addCriterion("TO_MO_ROUTING_D_ID >", value, "toMoRoutingDId");
            return (Criteria) this;
        }

        public Criteria andToMoRoutingDIdGreaterThanOrEqualTo(String value) {
            addCriterion("TO_MO_ROUTING_D_ID >=", value, "toMoRoutingDId");
            return (Criteria) this;
        }

        public Criteria andToMoRoutingDIdLessThan(String value) {
            addCriterion("TO_MO_ROUTING_D_ID <", value, "toMoRoutingDId");
            return (Criteria) this;
        }

        public Criteria andToMoRoutingDIdLessThanOrEqualTo(String value) {
            addCriterion("TO_MO_ROUTING_D_ID <=", value, "toMoRoutingDId");
            return (Criteria) this;
        }

        public Criteria andToMoRoutingDIdLike(String value) {
            addCriterion("TO_MO_ROUTING_D_ID like", value, "toMoRoutingDId");
            return (Criteria) this;
        }

        public Criteria andToMoRoutingDIdNotLike(String value) {
            addCriterion("TO_MO_ROUTING_D_ID not like", value, "toMoRoutingDId");
            return (Criteria) this;
        }

        public Criteria andToMoRoutingDIdIn(List<String> values) {
            addCriterion("TO_MO_ROUTING_D_ID in", values, "toMoRoutingDId");
            return (Criteria) this;
        }

        public Criteria andToMoRoutingDIdNotIn(List<String> values) {
            addCriterion("TO_MO_ROUTING_D_ID not in", values, "toMoRoutingDId");
            return (Criteria) this;
        }

        public Criteria andToMoRoutingDIdBetween(String value1, String value2) {
            addCriterion("TO_MO_ROUTING_D_ID between", value1, value2, "toMoRoutingDId");
            return (Criteria) this;
        }

        public Criteria andToMoRoutingDIdNotBetween(String value1, String value2) {
            addCriterion("TO_MO_ROUTING_D_ID not between", value1, value2, "toMoRoutingDId");
            return (Criteria) this;
        }

        public Criteria andToOperationIdIsNull() {
            addCriterion("TO_OPERATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andToOperationIdIsNotNull() {
            addCriterion("TO_OPERATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andToOperationIdEqualTo(String value) {
            addCriterion("TO_OPERATION_ID =", value, "toOperationId");
            return (Criteria) this;
        }

        public Criteria andToOperationIdNotEqualTo(String value) {
            addCriterion("TO_OPERATION_ID <>", value, "toOperationId");
            return (Criteria) this;
        }

        public Criteria andToOperationIdGreaterThan(String value) {
            addCriterion("TO_OPERATION_ID >", value, "toOperationId");
            return (Criteria) this;
        }

        public Criteria andToOperationIdGreaterThanOrEqualTo(String value) {
            addCriterion("TO_OPERATION_ID >=", value, "toOperationId");
            return (Criteria) this;
        }

        public Criteria andToOperationIdLessThan(String value) {
            addCriterion("TO_OPERATION_ID <", value, "toOperationId");
            return (Criteria) this;
        }

        public Criteria andToOperationIdLessThanOrEqualTo(String value) {
            addCriterion("TO_OPERATION_ID <=", value, "toOperationId");
            return (Criteria) this;
        }

        public Criteria andToOperationIdLike(String value) {
            addCriterion("TO_OPERATION_ID like", value, "toOperationId");
            return (Criteria) this;
        }

        public Criteria andToOperationIdNotLike(String value) {
            addCriterion("TO_OPERATION_ID not like", value, "toOperationId");
            return (Criteria) this;
        }

        public Criteria andToOperationIdIn(List<String> values) {
            addCriterion("TO_OPERATION_ID in", values, "toOperationId");
            return (Criteria) this;
        }

        public Criteria andToOperationIdNotIn(List<String> values) {
            addCriterion("TO_OPERATION_ID not in", values, "toOperationId");
            return (Criteria) this;
        }

        public Criteria andToOperationIdBetween(String value1, String value2) {
            addCriterion("TO_OPERATION_ID between", value1, value2, "toOperationId");
            return (Criteria) this;
        }

        public Criteria andToOperationIdNotBetween(String value1, String value2) {
            addCriterion("TO_OPERATION_ID not between", value1, value2, "toOperationId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("PROJECT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("PROJECT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(String value) {
            addCriterion("PROJECT_ID =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(String value) {
            addCriterion("PROJECT_ID <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(String value) {
            addCriterion("PROJECT_ID >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_ID >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(String value) {
            addCriterion("PROJECT_ID <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_ID <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLike(String value) {
            addCriterion("PROJECT_ID like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotLike(String value) {
            addCriterion("PROJECT_ID not like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<String> values) {
            addCriterion("PROJECT_ID in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<String> values) {
            addCriterion("PROJECT_ID not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(String value1, String value2) {
            addCriterion("PROJECT_ID between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(String value1, String value2) {
            addCriterion("PROJECT_ID not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andDeductArrivedQtyIsNull() {
            addCriterion("DEDUCT_ARRIVED_QTY is null");
            return (Criteria) this;
        }

        public Criteria andDeductArrivedQtyIsNotNull() {
            addCriterion("DEDUCT_ARRIVED_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andDeductArrivedQtyEqualTo(Boolean value) {
            addCriterion("DEDUCT_ARRIVED_QTY =", value, "deductArrivedQty");
            return (Criteria) this;
        }

        public Criteria andDeductArrivedQtyNotEqualTo(Boolean value) {
            addCriterion("DEDUCT_ARRIVED_QTY <>", value, "deductArrivedQty");
            return (Criteria) this;
        }

        public Criteria andDeductArrivedQtyGreaterThan(Boolean value) {
            addCriterion("DEDUCT_ARRIVED_QTY >", value, "deductArrivedQty");
            return (Criteria) this;
        }

        public Criteria andDeductArrivedQtyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DEDUCT_ARRIVED_QTY >=", value, "deductArrivedQty");
            return (Criteria) this;
        }

        public Criteria andDeductArrivedQtyLessThan(Boolean value) {
            addCriterion("DEDUCT_ARRIVED_QTY <", value, "deductArrivedQty");
            return (Criteria) this;
        }

        public Criteria andDeductArrivedQtyLessThanOrEqualTo(Boolean value) {
            addCriterion("DEDUCT_ARRIVED_QTY <=", value, "deductArrivedQty");
            return (Criteria) this;
        }

        public Criteria andDeductArrivedQtyIn(List<Boolean> values) {
            addCriterion("DEDUCT_ARRIVED_QTY in", values, "deductArrivedQty");
            return (Criteria) this;
        }

        public Criteria andDeductArrivedQtyNotIn(List<Boolean> values) {
            addCriterion("DEDUCT_ARRIVED_QTY not in", values, "deductArrivedQty");
            return (Criteria) this;
        }

        public Criteria andDeductArrivedQtyBetween(Boolean value1, Boolean value2) {
            addCriterion("DEDUCT_ARRIVED_QTY between", value1, value2, "deductArrivedQty");
            return (Criteria) this;
        }

        public Criteria andDeductArrivedQtyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DEDUCT_ARRIVED_QTY not between", value1, value2, "deductArrivedQty");
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