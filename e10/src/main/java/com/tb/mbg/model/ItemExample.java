package com.tb.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemExample() {
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

        public Criteria andItemBusinessIdIsNull() {
            addCriterion("ITEM_BUSINESS_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemBusinessIdIsNotNull() {
            addCriterion("ITEM_BUSINESS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemBusinessIdEqualTo(String value) {
            addCriterion("ITEM_BUSINESS_ID =", value, "itemBusinessId");
            return (Criteria) this;
        }

        public Criteria andItemBusinessIdNotEqualTo(String value) {
            addCriterion("ITEM_BUSINESS_ID <>", value, "itemBusinessId");
            return (Criteria) this;
        }

        public Criteria andItemBusinessIdGreaterThan(String value) {
            addCriterion("ITEM_BUSINESS_ID >", value, "itemBusinessId");
            return (Criteria) this;
        }

        public Criteria andItemBusinessIdGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_BUSINESS_ID >=", value, "itemBusinessId");
            return (Criteria) this;
        }

        public Criteria andItemBusinessIdLessThan(String value) {
            addCriterion("ITEM_BUSINESS_ID <", value, "itemBusinessId");
            return (Criteria) this;
        }

        public Criteria andItemBusinessIdLessThanOrEqualTo(String value) {
            addCriterion("ITEM_BUSINESS_ID <=", value, "itemBusinessId");
            return (Criteria) this;
        }

        public Criteria andItemBusinessIdLike(String value) {
            addCriterion("ITEM_BUSINESS_ID like", value, "itemBusinessId");
            return (Criteria) this;
        }

        public Criteria andItemBusinessIdNotLike(String value) {
            addCriterion("ITEM_BUSINESS_ID not like", value, "itemBusinessId");
            return (Criteria) this;
        }

        public Criteria andItemBusinessIdIn(List<String> values) {
            addCriterion("ITEM_BUSINESS_ID in", values, "itemBusinessId");
            return (Criteria) this;
        }

        public Criteria andItemBusinessIdNotIn(List<String> values) {
            addCriterion("ITEM_BUSINESS_ID not in", values, "itemBusinessId");
            return (Criteria) this;
        }

        public Criteria andItemBusinessIdBetween(String value1, String value2) {
            addCriterion("ITEM_BUSINESS_ID between", value1, value2, "itemBusinessId");
            return (Criteria) this;
        }

        public Criteria andItemBusinessIdNotBetween(String value1, String value2) {
            addCriterion("ITEM_BUSINESS_ID not between", value1, value2, "itemBusinessId");
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

        public Criteria andInventoryManagementIsNull() {
            addCriterion("INVENTORY_MANAGEMENT is null");
            return (Criteria) this;
        }

        public Criteria andInventoryManagementIsNotNull() {
            addCriterion("INVENTORY_MANAGEMENT is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryManagementEqualTo(Boolean value) {
            addCriterion("INVENTORY_MANAGEMENT =", value, "inventoryManagement");
            return (Criteria) this;
        }

        public Criteria andInventoryManagementNotEqualTo(Boolean value) {
            addCriterion("INVENTORY_MANAGEMENT <>", value, "inventoryManagement");
            return (Criteria) this;
        }

        public Criteria andInventoryManagementGreaterThan(Boolean value) {
            addCriterion("INVENTORY_MANAGEMENT >", value, "inventoryManagement");
            return (Criteria) this;
        }

        public Criteria andInventoryManagementGreaterThanOrEqualTo(Boolean value) {
            addCriterion("INVENTORY_MANAGEMENT >=", value, "inventoryManagement");
            return (Criteria) this;
        }

        public Criteria andInventoryManagementLessThan(Boolean value) {
            addCriterion("INVENTORY_MANAGEMENT <", value, "inventoryManagement");
            return (Criteria) this;
        }

        public Criteria andInventoryManagementLessThanOrEqualTo(Boolean value) {
            addCriterion("INVENTORY_MANAGEMENT <=", value, "inventoryManagement");
            return (Criteria) this;
        }

        public Criteria andInventoryManagementIn(List<Boolean> values) {
            addCriterion("INVENTORY_MANAGEMENT in", values, "inventoryManagement");
            return (Criteria) this;
        }

        public Criteria andInventoryManagementNotIn(List<Boolean> values) {
            addCriterion("INVENTORY_MANAGEMENT not in", values, "inventoryManagement");
            return (Criteria) this;
        }

        public Criteria andInventoryManagementBetween(Boolean value1, Boolean value2) {
            addCriterion("INVENTORY_MANAGEMENT between", value1, value2, "inventoryManagement");
            return (Criteria) this;
        }

        public Criteria andInventoryManagementNotBetween(Boolean value1, Boolean value2) {
            addCriterion("INVENTORY_MANAGEMENT not between", value1, value2, "inventoryManagement");
            return (Criteria) this;
        }

        public Criteria andItemCodeIsNull() {
            addCriterion("ITEM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andItemCodeIsNotNull() {
            addCriterion("ITEM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andItemCodeEqualTo(String value) {
            addCriterion("ITEM_CODE =", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotEqualTo(String value) {
            addCriterion("ITEM_CODE <>", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeGreaterThan(String value) {
            addCriterion("ITEM_CODE >", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_CODE >=", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeLessThan(String value) {
            addCriterion("ITEM_CODE <", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeLessThanOrEqualTo(String value) {
            addCriterion("ITEM_CODE <=", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeLike(String value) {
            addCriterion("ITEM_CODE like", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotLike(String value) {
            addCriterion("ITEM_CODE not like", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeIn(List<String> values) {
            addCriterion("ITEM_CODE in", values, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotIn(List<String> values) {
            addCriterion("ITEM_CODE not in", values, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeBetween(String value1, String value2) {
            addCriterion("ITEM_CODE between", value1, value2, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotBetween(String value1, String value2) {
            addCriterion("ITEM_CODE not between", value1, value2, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("ITEM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("ITEM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("ITEM_NAME =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("ITEM_NAME <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("ITEM_NAME >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_NAME >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("ITEM_NAME <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("ITEM_NAME <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("ITEM_NAME like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("ITEM_NAME not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("ITEM_NAME in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("ITEM_NAME not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("ITEM_NAME between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("ITEM_NAME not between", value1, value2, "itemName");
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

        public Criteria andChangeItemSpecIsNull() {
            addCriterion("CHANGE_ITEM_SPEC is null");
            return (Criteria) this;
        }

        public Criteria andChangeItemSpecIsNotNull() {
            addCriterion("CHANGE_ITEM_SPEC is not null");
            return (Criteria) this;
        }

        public Criteria andChangeItemSpecEqualTo(Boolean value) {
            addCriterion("CHANGE_ITEM_SPEC =", value, "changeItemSpec");
            return (Criteria) this;
        }

        public Criteria andChangeItemSpecNotEqualTo(Boolean value) {
            addCriterion("CHANGE_ITEM_SPEC <>", value, "changeItemSpec");
            return (Criteria) this;
        }

        public Criteria andChangeItemSpecGreaterThan(Boolean value) {
            addCriterion("CHANGE_ITEM_SPEC >", value, "changeItemSpec");
            return (Criteria) this;
        }

        public Criteria andChangeItemSpecGreaterThanOrEqualTo(Boolean value) {
            addCriterion("CHANGE_ITEM_SPEC >=", value, "changeItemSpec");
            return (Criteria) this;
        }

        public Criteria andChangeItemSpecLessThan(Boolean value) {
            addCriterion("CHANGE_ITEM_SPEC <", value, "changeItemSpec");
            return (Criteria) this;
        }

        public Criteria andChangeItemSpecLessThanOrEqualTo(Boolean value) {
            addCriterion("CHANGE_ITEM_SPEC <=", value, "changeItemSpec");
            return (Criteria) this;
        }

        public Criteria andChangeItemSpecIn(List<Boolean> values) {
            addCriterion("CHANGE_ITEM_SPEC in", values, "changeItemSpec");
            return (Criteria) this;
        }

        public Criteria andChangeItemSpecNotIn(List<Boolean> values) {
            addCriterion("CHANGE_ITEM_SPEC not in", values, "changeItemSpec");
            return (Criteria) this;
        }

        public Criteria andChangeItemSpecBetween(Boolean value1, Boolean value2) {
            addCriterion("CHANGE_ITEM_SPEC between", value1, value2, "changeItemSpec");
            return (Criteria) this;
        }

        public Criteria andChangeItemSpecNotBetween(Boolean value1, Boolean value2) {
            addCriterion("CHANGE_ITEM_SPEC not between", value1, value2, "changeItemSpec");
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

        public Criteria andLotControlIsNull() {
            addCriterion("LOT_CONTROL is null");
            return (Criteria) this;
        }

        public Criteria andLotControlIsNotNull() {
            addCriterion("LOT_CONTROL is not null");
            return (Criteria) this;
        }

        public Criteria andLotControlEqualTo(String value) {
            addCriterion("LOT_CONTROL =", value, "lotControl");
            return (Criteria) this;
        }

        public Criteria andLotControlNotEqualTo(String value) {
            addCriterion("LOT_CONTROL <>", value, "lotControl");
            return (Criteria) this;
        }

        public Criteria andLotControlGreaterThan(String value) {
            addCriterion("LOT_CONTROL >", value, "lotControl");
            return (Criteria) this;
        }

        public Criteria andLotControlGreaterThanOrEqualTo(String value) {
            addCriterion("LOT_CONTROL >=", value, "lotControl");
            return (Criteria) this;
        }

        public Criteria andLotControlLessThan(String value) {
            addCriterion("LOT_CONTROL <", value, "lotControl");
            return (Criteria) this;
        }

        public Criteria andLotControlLessThanOrEqualTo(String value) {
            addCriterion("LOT_CONTROL <=", value, "lotControl");
            return (Criteria) this;
        }

        public Criteria andLotControlLike(String value) {
            addCriterion("LOT_CONTROL like", value, "lotControl");
            return (Criteria) this;
        }

        public Criteria andLotControlNotLike(String value) {
            addCriterion("LOT_CONTROL not like", value, "lotControl");
            return (Criteria) this;
        }

        public Criteria andLotControlIn(List<String> values) {
            addCriterion("LOT_CONTROL in", values, "lotControl");
            return (Criteria) this;
        }

        public Criteria andLotControlNotIn(List<String> values) {
            addCriterion("LOT_CONTROL not in", values, "lotControl");
            return (Criteria) this;
        }

        public Criteria andLotControlBetween(String value1, String value2) {
            addCriterion("LOT_CONTROL between", value1, value2, "lotControl");
            return (Criteria) this;
        }

        public Criteria andLotControlNotBetween(String value1, String value2) {
            addCriterion("LOT_CONTROL not between", value1, value2, "lotControl");
            return (Criteria) this;
        }

        public Criteria andLotExpireDayIsNull() {
            addCriterion("LOT_EXPIRE_DAY is null");
            return (Criteria) this;
        }

        public Criteria andLotExpireDayIsNotNull() {
            addCriterion("LOT_EXPIRE_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andLotExpireDayEqualTo(Integer value) {
            addCriterion("LOT_EXPIRE_DAY =", value, "lotExpireDay");
            return (Criteria) this;
        }

        public Criteria andLotExpireDayNotEqualTo(Integer value) {
            addCriterion("LOT_EXPIRE_DAY <>", value, "lotExpireDay");
            return (Criteria) this;
        }

        public Criteria andLotExpireDayGreaterThan(Integer value) {
            addCriterion("LOT_EXPIRE_DAY >", value, "lotExpireDay");
            return (Criteria) this;
        }

        public Criteria andLotExpireDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOT_EXPIRE_DAY >=", value, "lotExpireDay");
            return (Criteria) this;
        }

        public Criteria andLotExpireDayLessThan(Integer value) {
            addCriterion("LOT_EXPIRE_DAY <", value, "lotExpireDay");
            return (Criteria) this;
        }

        public Criteria andLotExpireDayLessThanOrEqualTo(Integer value) {
            addCriterion("LOT_EXPIRE_DAY <=", value, "lotExpireDay");
            return (Criteria) this;
        }

        public Criteria andLotExpireDayIn(List<Integer> values) {
            addCriterion("LOT_EXPIRE_DAY in", values, "lotExpireDay");
            return (Criteria) this;
        }

        public Criteria andLotExpireDayNotIn(List<Integer> values) {
            addCriterion("LOT_EXPIRE_DAY not in", values, "lotExpireDay");
            return (Criteria) this;
        }

        public Criteria andLotExpireDayBetween(Integer value1, Integer value2) {
            addCriterion("LOT_EXPIRE_DAY between", value1, value2, "lotExpireDay");
            return (Criteria) this;
        }

        public Criteria andLotExpireDayNotBetween(Integer value1, Integer value2) {
            addCriterion("LOT_EXPIRE_DAY not between", value1, value2, "lotExpireDay");
            return (Criteria) this;
        }

        public Criteria andLotWaitingDayIsNull() {
            addCriterion("LOT_WAITING_DAY is null");
            return (Criteria) this;
        }

        public Criteria andLotWaitingDayIsNotNull() {
            addCriterion("LOT_WAITING_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andLotWaitingDayEqualTo(Integer value) {
            addCriterion("LOT_WAITING_DAY =", value, "lotWaitingDay");
            return (Criteria) this;
        }

        public Criteria andLotWaitingDayNotEqualTo(Integer value) {
            addCriterion("LOT_WAITING_DAY <>", value, "lotWaitingDay");
            return (Criteria) this;
        }

        public Criteria andLotWaitingDayGreaterThan(Integer value) {
            addCriterion("LOT_WAITING_DAY >", value, "lotWaitingDay");
            return (Criteria) this;
        }

        public Criteria andLotWaitingDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOT_WAITING_DAY >=", value, "lotWaitingDay");
            return (Criteria) this;
        }

        public Criteria andLotWaitingDayLessThan(Integer value) {
            addCriterion("LOT_WAITING_DAY <", value, "lotWaitingDay");
            return (Criteria) this;
        }

        public Criteria andLotWaitingDayLessThanOrEqualTo(Integer value) {
            addCriterion("LOT_WAITING_DAY <=", value, "lotWaitingDay");
            return (Criteria) this;
        }

        public Criteria andLotWaitingDayIn(List<Integer> values) {
            addCriterion("LOT_WAITING_DAY in", values, "lotWaitingDay");
            return (Criteria) this;
        }

        public Criteria andLotWaitingDayNotIn(List<Integer> values) {
            addCriterion("LOT_WAITING_DAY not in", values, "lotWaitingDay");
            return (Criteria) this;
        }

        public Criteria andLotWaitingDayBetween(Integer value1, Integer value2) {
            addCriterion("LOT_WAITING_DAY between", value1, value2, "lotWaitingDay");
            return (Criteria) this;
        }

        public Criteria andLotWaitingDayNotBetween(Integer value1, Integer value2) {
            addCriterion("LOT_WAITING_DAY not between", value1, value2, "lotWaitingDay");
            return (Criteria) this;
        }

        public Criteria andLotReinspectionDayIsNull() {
            addCriterion("LOT_REINSPECTION_DAY is null");
            return (Criteria) this;
        }

        public Criteria andLotReinspectionDayIsNotNull() {
            addCriterion("LOT_REINSPECTION_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andLotReinspectionDayEqualTo(Integer value) {
            addCriterion("LOT_REINSPECTION_DAY =", value, "lotReinspectionDay");
            return (Criteria) this;
        }

        public Criteria andLotReinspectionDayNotEqualTo(Integer value) {
            addCriterion("LOT_REINSPECTION_DAY <>", value, "lotReinspectionDay");
            return (Criteria) this;
        }

        public Criteria andLotReinspectionDayGreaterThan(Integer value) {
            addCriterion("LOT_REINSPECTION_DAY >", value, "lotReinspectionDay");
            return (Criteria) this;
        }

        public Criteria andLotReinspectionDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOT_REINSPECTION_DAY >=", value, "lotReinspectionDay");
            return (Criteria) this;
        }

        public Criteria andLotReinspectionDayLessThan(Integer value) {
            addCriterion("LOT_REINSPECTION_DAY <", value, "lotReinspectionDay");
            return (Criteria) this;
        }

        public Criteria andLotReinspectionDayLessThanOrEqualTo(Integer value) {
            addCriterion("LOT_REINSPECTION_DAY <=", value, "lotReinspectionDay");
            return (Criteria) this;
        }

        public Criteria andLotReinspectionDayIn(List<Integer> values) {
            addCriterion("LOT_REINSPECTION_DAY in", values, "lotReinspectionDay");
            return (Criteria) this;
        }

        public Criteria andLotReinspectionDayNotIn(List<Integer> values) {
            addCriterion("LOT_REINSPECTION_DAY not in", values, "lotReinspectionDay");
            return (Criteria) this;
        }

        public Criteria andLotReinspectionDayBetween(Integer value1, Integer value2) {
            addCriterion("LOT_REINSPECTION_DAY between", value1, value2, "lotReinspectionDay");
            return (Criteria) this;
        }

        public Criteria andLotReinspectionDayNotBetween(Integer value1, Integer value2) {
            addCriterion("LOT_REINSPECTION_DAY not between", value1, value2, "lotReinspectionDay");
            return (Criteria) this;
        }

        public Criteria andLotFailureControlIsNull() {
            addCriterion("LOT_FAILURE_CONTROL is null");
            return (Criteria) this;
        }

        public Criteria andLotFailureControlIsNotNull() {
            addCriterion("LOT_FAILURE_CONTROL is not null");
            return (Criteria) this;
        }

        public Criteria andLotFailureControlEqualTo(String value) {
            addCriterion("LOT_FAILURE_CONTROL =", value, "lotFailureControl");
            return (Criteria) this;
        }

        public Criteria andLotFailureControlNotEqualTo(String value) {
            addCriterion("LOT_FAILURE_CONTROL <>", value, "lotFailureControl");
            return (Criteria) this;
        }

        public Criteria andLotFailureControlGreaterThan(String value) {
            addCriterion("LOT_FAILURE_CONTROL >", value, "lotFailureControl");
            return (Criteria) this;
        }

        public Criteria andLotFailureControlGreaterThanOrEqualTo(String value) {
            addCriterion("LOT_FAILURE_CONTROL >=", value, "lotFailureControl");
            return (Criteria) this;
        }

        public Criteria andLotFailureControlLessThan(String value) {
            addCriterion("LOT_FAILURE_CONTROL <", value, "lotFailureControl");
            return (Criteria) this;
        }

        public Criteria andLotFailureControlLessThanOrEqualTo(String value) {
            addCriterion("LOT_FAILURE_CONTROL <=", value, "lotFailureControl");
            return (Criteria) this;
        }

        public Criteria andLotFailureControlLike(String value) {
            addCriterion("LOT_FAILURE_CONTROL like", value, "lotFailureControl");
            return (Criteria) this;
        }

        public Criteria andLotFailureControlNotLike(String value) {
            addCriterion("LOT_FAILURE_CONTROL not like", value, "lotFailureControl");
            return (Criteria) this;
        }

        public Criteria andLotFailureControlIn(List<String> values) {
            addCriterion("LOT_FAILURE_CONTROL in", values, "lotFailureControl");
            return (Criteria) this;
        }

        public Criteria andLotFailureControlNotIn(List<String> values) {
            addCriterion("LOT_FAILURE_CONTROL not in", values, "lotFailureControl");
            return (Criteria) this;
        }

        public Criteria andLotFailureControlBetween(String value1, String value2) {
            addCriterion("LOT_FAILURE_CONTROL between", value1, value2, "lotFailureControl");
            return (Criteria) this;
        }

        public Criteria andLotFailureControlNotBetween(String value1, String value2) {
            addCriterion("LOT_FAILURE_CONTROL not between", value1, value2, "lotFailureControl");
            return (Criteria) this;
        }

        public Criteria andUnitModeIsNull() {
            addCriterion("UNIT_MODE is null");
            return (Criteria) this;
        }

        public Criteria andUnitModeIsNotNull() {
            addCriterion("UNIT_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andUnitModeEqualTo(String value) {
            addCriterion("UNIT_MODE =", value, "unitMode");
            return (Criteria) this;
        }

        public Criteria andUnitModeNotEqualTo(String value) {
            addCriterion("UNIT_MODE <>", value, "unitMode");
            return (Criteria) this;
        }

        public Criteria andUnitModeGreaterThan(String value) {
            addCriterion("UNIT_MODE >", value, "unitMode");
            return (Criteria) this;
        }

        public Criteria andUnitModeGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT_MODE >=", value, "unitMode");
            return (Criteria) this;
        }

        public Criteria andUnitModeLessThan(String value) {
            addCriterion("UNIT_MODE <", value, "unitMode");
            return (Criteria) this;
        }

        public Criteria andUnitModeLessThanOrEqualTo(String value) {
            addCriterion("UNIT_MODE <=", value, "unitMode");
            return (Criteria) this;
        }

        public Criteria andUnitModeLike(String value) {
            addCriterion("UNIT_MODE like", value, "unitMode");
            return (Criteria) this;
        }

        public Criteria andUnitModeNotLike(String value) {
            addCriterion("UNIT_MODE not like", value, "unitMode");
            return (Criteria) this;
        }

        public Criteria andUnitModeIn(List<String> values) {
            addCriterion("UNIT_MODE in", values, "unitMode");
            return (Criteria) this;
        }

        public Criteria andUnitModeNotIn(List<String> values) {
            addCriterion("UNIT_MODE not in", values, "unitMode");
            return (Criteria) this;
        }

        public Criteria andUnitModeBetween(String value1, String value2) {
            addCriterion("UNIT_MODE between", value1, value2, "unitMode");
            return (Criteria) this;
        }

        public Criteria andUnitModeNotBetween(String value1, String value2) {
            addCriterion("UNIT_MODE not between", value1, value2, "unitMode");
            return (Criteria) this;
        }

        public Criteria andInventoryCheckByIsNull() {
            addCriterion("INVENTORY_CHECK_BY is null");
            return (Criteria) this;
        }

        public Criteria andInventoryCheckByIsNotNull() {
            addCriterion("INVENTORY_CHECK_BY is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryCheckByEqualTo(String value) {
            addCriterion("INVENTORY_CHECK_BY =", value, "inventoryCheckBy");
            return (Criteria) this;
        }

        public Criteria andInventoryCheckByNotEqualTo(String value) {
            addCriterion("INVENTORY_CHECK_BY <>", value, "inventoryCheckBy");
            return (Criteria) this;
        }

        public Criteria andInventoryCheckByGreaterThan(String value) {
            addCriterion("INVENTORY_CHECK_BY >", value, "inventoryCheckBy");
            return (Criteria) this;
        }

        public Criteria andInventoryCheckByGreaterThanOrEqualTo(String value) {
            addCriterion("INVENTORY_CHECK_BY >=", value, "inventoryCheckBy");
            return (Criteria) this;
        }

        public Criteria andInventoryCheckByLessThan(String value) {
            addCriterion("INVENTORY_CHECK_BY <", value, "inventoryCheckBy");
            return (Criteria) this;
        }

        public Criteria andInventoryCheckByLessThanOrEqualTo(String value) {
            addCriterion("INVENTORY_CHECK_BY <=", value, "inventoryCheckBy");
            return (Criteria) this;
        }

        public Criteria andInventoryCheckByLike(String value) {
            addCriterion("INVENTORY_CHECK_BY like", value, "inventoryCheckBy");
            return (Criteria) this;
        }

        public Criteria andInventoryCheckByNotLike(String value) {
            addCriterion("INVENTORY_CHECK_BY not like", value, "inventoryCheckBy");
            return (Criteria) this;
        }

        public Criteria andInventoryCheckByIn(List<String> values) {
            addCriterion("INVENTORY_CHECK_BY in", values, "inventoryCheckBy");
            return (Criteria) this;
        }

        public Criteria andInventoryCheckByNotIn(List<String> values) {
            addCriterion("INVENTORY_CHECK_BY not in", values, "inventoryCheckBy");
            return (Criteria) this;
        }

        public Criteria andInventoryCheckByBetween(String value1, String value2) {
            addCriterion("INVENTORY_CHECK_BY between", value1, value2, "inventoryCheckBy");
            return (Criteria) this;
        }

        public Criteria andInventoryCheckByNotBetween(String value1, String value2) {
            addCriterion("INVENTORY_CHECK_BY not between", value1, value2, "inventoryCheckBy");
            return (Criteria) this;
        }

        public Criteria andItemSnManagementIsNull() {
            addCriterion("ITEM_SN_MANAGEMENT is null");
            return (Criteria) this;
        }

        public Criteria andItemSnManagementIsNotNull() {
            addCriterion("ITEM_SN_MANAGEMENT is not null");
            return (Criteria) this;
        }

        public Criteria andItemSnManagementEqualTo(Boolean value) {
            addCriterion("ITEM_SN_MANAGEMENT =", value, "itemSnManagement");
            return (Criteria) this;
        }

        public Criteria andItemSnManagementNotEqualTo(Boolean value) {
            addCriterion("ITEM_SN_MANAGEMENT <>", value, "itemSnManagement");
            return (Criteria) this;
        }

        public Criteria andItemSnManagementGreaterThan(Boolean value) {
            addCriterion("ITEM_SN_MANAGEMENT >", value, "itemSnManagement");
            return (Criteria) this;
        }

        public Criteria andItemSnManagementGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ITEM_SN_MANAGEMENT >=", value, "itemSnManagement");
            return (Criteria) this;
        }

        public Criteria andItemSnManagementLessThan(Boolean value) {
            addCriterion("ITEM_SN_MANAGEMENT <", value, "itemSnManagement");
            return (Criteria) this;
        }

        public Criteria andItemSnManagementLessThanOrEqualTo(Boolean value) {
            addCriterion("ITEM_SN_MANAGEMENT <=", value, "itemSnManagement");
            return (Criteria) this;
        }

        public Criteria andItemSnManagementIn(List<Boolean> values) {
            addCriterion("ITEM_SN_MANAGEMENT in", values, "itemSnManagement");
            return (Criteria) this;
        }

        public Criteria andItemSnManagementNotIn(List<Boolean> values) {
            addCriterion("ITEM_SN_MANAGEMENT not in", values, "itemSnManagement");
            return (Criteria) this;
        }

        public Criteria andItemSnManagementBetween(Boolean value1, Boolean value2) {
            addCriterion("ITEM_SN_MANAGEMENT between", value1, value2, "itemSnManagement");
            return (Criteria) this;
        }

        public Criteria andItemSnManagementNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ITEM_SN_MANAGEMENT not between", value1, value2, "itemSnManagement");
            return (Criteria) this;
        }

        public Criteria andSnEntryModeIsNull() {
            addCriterion("SN_ENTRY_MODE is null");
            return (Criteria) this;
        }

        public Criteria andSnEntryModeIsNotNull() {
            addCriterion("SN_ENTRY_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andSnEntryModeEqualTo(String value) {
            addCriterion("SN_ENTRY_MODE =", value, "snEntryMode");
            return (Criteria) this;
        }

        public Criteria andSnEntryModeNotEqualTo(String value) {
            addCriterion("SN_ENTRY_MODE <>", value, "snEntryMode");
            return (Criteria) this;
        }

        public Criteria andSnEntryModeGreaterThan(String value) {
            addCriterion("SN_ENTRY_MODE >", value, "snEntryMode");
            return (Criteria) this;
        }

        public Criteria andSnEntryModeGreaterThanOrEqualTo(String value) {
            addCriterion("SN_ENTRY_MODE >=", value, "snEntryMode");
            return (Criteria) this;
        }

        public Criteria andSnEntryModeLessThan(String value) {
            addCriterion("SN_ENTRY_MODE <", value, "snEntryMode");
            return (Criteria) this;
        }

        public Criteria andSnEntryModeLessThanOrEqualTo(String value) {
            addCriterion("SN_ENTRY_MODE <=", value, "snEntryMode");
            return (Criteria) this;
        }

        public Criteria andSnEntryModeLike(String value) {
            addCriterion("SN_ENTRY_MODE like", value, "snEntryMode");
            return (Criteria) this;
        }

        public Criteria andSnEntryModeNotLike(String value) {
            addCriterion("SN_ENTRY_MODE not like", value, "snEntryMode");
            return (Criteria) this;
        }

        public Criteria andSnEntryModeIn(List<String> values) {
            addCriterion("SN_ENTRY_MODE in", values, "snEntryMode");
            return (Criteria) this;
        }

        public Criteria andSnEntryModeNotIn(List<String> values) {
            addCriterion("SN_ENTRY_MODE not in", values, "snEntryMode");
            return (Criteria) this;
        }

        public Criteria andSnEntryModeBetween(String value1, String value2) {
            addCriterion("SN_ENTRY_MODE between", value1, value2, "snEntryMode");
            return (Criteria) this;
        }

        public Criteria andSnEntryModeNotBetween(String value1, String value2) {
            addCriterion("SN_ENTRY_MODE not between", value1, value2, "snEntryMode");
            return (Criteria) this;
        }

        public Criteria andItemFeatureControlIsNull() {
            addCriterion("ITEM_FEATURE_CONTROL is null");
            return (Criteria) this;
        }

        public Criteria andItemFeatureControlIsNotNull() {
            addCriterion("ITEM_FEATURE_CONTROL is not null");
            return (Criteria) this;
        }

        public Criteria andItemFeatureControlEqualTo(Boolean value) {
            addCriterion("ITEM_FEATURE_CONTROL =", value, "itemFeatureControl");
            return (Criteria) this;
        }

        public Criteria andItemFeatureControlNotEqualTo(Boolean value) {
            addCriterion("ITEM_FEATURE_CONTROL <>", value, "itemFeatureControl");
            return (Criteria) this;
        }

        public Criteria andItemFeatureControlGreaterThan(Boolean value) {
            addCriterion("ITEM_FEATURE_CONTROL >", value, "itemFeatureControl");
            return (Criteria) this;
        }

        public Criteria andItemFeatureControlGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ITEM_FEATURE_CONTROL >=", value, "itemFeatureControl");
            return (Criteria) this;
        }

        public Criteria andItemFeatureControlLessThan(Boolean value) {
            addCriterion("ITEM_FEATURE_CONTROL <", value, "itemFeatureControl");
            return (Criteria) this;
        }

        public Criteria andItemFeatureControlLessThanOrEqualTo(Boolean value) {
            addCriterion("ITEM_FEATURE_CONTROL <=", value, "itemFeatureControl");
            return (Criteria) this;
        }

        public Criteria andItemFeatureControlIn(List<Boolean> values) {
            addCriterion("ITEM_FEATURE_CONTROL in", values, "itemFeatureControl");
            return (Criteria) this;
        }

        public Criteria andItemFeatureControlNotIn(List<Boolean> values) {
            addCriterion("ITEM_FEATURE_CONTROL not in", values, "itemFeatureControl");
            return (Criteria) this;
        }

        public Criteria andItemFeatureControlBetween(Boolean value1, Boolean value2) {
            addCriterion("ITEM_FEATURE_CONTROL between", value1, value2, "itemFeatureControl");
            return (Criteria) this;
        }

        public Criteria andItemFeatureControlNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ITEM_FEATURE_CONTROL not between", value1, value2, "itemFeatureControl");
            return (Criteria) this;
        }

        public Criteria andPackingUnitIsNull() {
            addCriterion("PACKING_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andPackingUnitIsNotNull() {
            addCriterion("PACKING_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andPackingUnitEqualTo(Boolean value) {
            addCriterion("PACKING_UNIT =", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitNotEqualTo(Boolean value) {
            addCriterion("PACKING_UNIT <>", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitGreaterThan(Boolean value) {
            addCriterion("PACKING_UNIT >", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitGreaterThanOrEqualTo(Boolean value) {
            addCriterion("PACKING_UNIT >=", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitLessThan(Boolean value) {
            addCriterion("PACKING_UNIT <", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitLessThanOrEqualTo(Boolean value) {
            addCriterion("PACKING_UNIT <=", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitIn(List<Boolean> values) {
            addCriterion("PACKING_UNIT in", values, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitNotIn(List<Boolean> values) {
            addCriterion("PACKING_UNIT not in", values, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitBetween(Boolean value1, Boolean value2) {
            addCriterion("PACKING_UNIT between", value1, value2, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitNotBetween(Boolean value1, Boolean value2) {
            addCriterion("PACKING_UNIT not between", value1, value2, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andEItemIsNull() {
            addCriterion("E_ITEM is null");
            return (Criteria) this;
        }

        public Criteria andEItemIsNotNull() {
            addCriterion("E_ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andEItemEqualTo(String value) {
            addCriterion("E_ITEM =", value, "eItem");
            return (Criteria) this;
        }

        public Criteria andEItemNotEqualTo(String value) {
            addCriterion("E_ITEM <>", value, "eItem");
            return (Criteria) this;
        }

        public Criteria andEItemGreaterThan(String value) {
            addCriterion("E_ITEM >", value, "eItem");
            return (Criteria) this;
        }

        public Criteria andEItemGreaterThanOrEqualTo(String value) {
            addCriterion("E_ITEM >=", value, "eItem");
            return (Criteria) this;
        }

        public Criteria andEItemLessThan(String value) {
            addCriterion("E_ITEM <", value, "eItem");
            return (Criteria) this;
        }

        public Criteria andEItemLessThanOrEqualTo(String value) {
            addCriterion("E_ITEM <=", value, "eItem");
            return (Criteria) this;
        }

        public Criteria andEItemLike(String value) {
            addCriterion("E_ITEM like", value, "eItem");
            return (Criteria) this;
        }

        public Criteria andEItemNotLike(String value) {
            addCriterion("E_ITEM not like", value, "eItem");
            return (Criteria) this;
        }

        public Criteria andEItemIn(List<String> values) {
            addCriterion("E_ITEM in", values, "eItem");
            return (Criteria) this;
        }

        public Criteria andEItemNotIn(List<String> values) {
            addCriterion("E_ITEM not in", values, "eItem");
            return (Criteria) this;
        }

        public Criteria andEItemBetween(String value1, String value2) {
            addCriterion("E_ITEM between", value1, value2, "eItem");
            return (Criteria) this;
        }

        public Criteria andEItemNotBetween(String value1, String value2) {
            addCriterion("E_ITEM not between", value1, value2, "eItem");
            return (Criteria) this;
        }

        public Criteria andECodeIsNull() {
            addCriterion("E_CODE is null");
            return (Criteria) this;
        }

        public Criteria andECodeIsNotNull() {
            addCriterion("E_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andECodeEqualTo(String value) {
            addCriterion("E_CODE =", value, "eCode");
            return (Criteria) this;
        }

        public Criteria andECodeNotEqualTo(String value) {
            addCriterion("E_CODE <>", value, "eCode");
            return (Criteria) this;
        }

        public Criteria andECodeGreaterThan(String value) {
            addCriterion("E_CODE >", value, "eCode");
            return (Criteria) this;
        }

        public Criteria andECodeGreaterThanOrEqualTo(String value) {
            addCriterion("E_CODE >=", value, "eCode");
            return (Criteria) this;
        }

        public Criteria andECodeLessThan(String value) {
            addCriterion("E_CODE <", value, "eCode");
            return (Criteria) this;
        }

        public Criteria andECodeLessThanOrEqualTo(String value) {
            addCriterion("E_CODE <=", value, "eCode");
            return (Criteria) this;
        }

        public Criteria andECodeLike(String value) {
            addCriterion("E_CODE like", value, "eCode");
            return (Criteria) this;
        }

        public Criteria andECodeNotLike(String value) {
            addCriterion("E_CODE not like", value, "eCode");
            return (Criteria) this;
        }

        public Criteria andECodeIn(List<String> values) {
            addCriterion("E_CODE in", values, "eCode");
            return (Criteria) this;
        }

        public Criteria andECodeNotIn(List<String> values) {
            addCriterion("E_CODE not in", values, "eCode");
            return (Criteria) this;
        }

        public Criteria andECodeBetween(String value1, String value2) {
            addCriterion("E_CODE between", value1, value2, "eCode");
            return (Criteria) this;
        }

        public Criteria andECodeNotBetween(String value1, String value2) {
            addCriterion("E_CODE not between", value1, value2, "eCode");
            return (Criteria) this;
        }

        public Criteria andFeatureGenerateModeIsNull() {
            addCriterion("FEATURE_GENERATE_MODE is null");
            return (Criteria) this;
        }

        public Criteria andFeatureGenerateModeIsNotNull() {
            addCriterion("FEATURE_GENERATE_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureGenerateModeEqualTo(String value) {
            addCriterion("FEATURE_GENERATE_MODE =", value, "featureGenerateMode");
            return (Criteria) this;
        }

        public Criteria andFeatureGenerateModeNotEqualTo(String value) {
            addCriterion("FEATURE_GENERATE_MODE <>", value, "featureGenerateMode");
            return (Criteria) this;
        }

        public Criteria andFeatureGenerateModeGreaterThan(String value) {
            addCriterion("FEATURE_GENERATE_MODE >", value, "featureGenerateMode");
            return (Criteria) this;
        }

        public Criteria andFeatureGenerateModeGreaterThanOrEqualTo(String value) {
            addCriterion("FEATURE_GENERATE_MODE >=", value, "featureGenerateMode");
            return (Criteria) this;
        }

        public Criteria andFeatureGenerateModeLessThan(String value) {
            addCriterion("FEATURE_GENERATE_MODE <", value, "featureGenerateMode");
            return (Criteria) this;
        }

        public Criteria andFeatureGenerateModeLessThanOrEqualTo(String value) {
            addCriterion("FEATURE_GENERATE_MODE <=", value, "featureGenerateMode");
            return (Criteria) this;
        }

        public Criteria andFeatureGenerateModeLike(String value) {
            addCriterion("FEATURE_GENERATE_MODE like", value, "featureGenerateMode");
            return (Criteria) this;
        }

        public Criteria andFeatureGenerateModeNotLike(String value) {
            addCriterion("FEATURE_GENERATE_MODE not like", value, "featureGenerateMode");
            return (Criteria) this;
        }

        public Criteria andFeatureGenerateModeIn(List<String> values) {
            addCriterion("FEATURE_GENERATE_MODE in", values, "featureGenerateMode");
            return (Criteria) this;
        }

        public Criteria andFeatureGenerateModeNotIn(List<String> values) {
            addCriterion("FEATURE_GENERATE_MODE not in", values, "featureGenerateMode");
            return (Criteria) this;
        }

        public Criteria andFeatureGenerateModeBetween(String value1, String value2) {
            addCriterion("FEATURE_GENERATE_MODE between", value1, value2, "featureGenerateMode");
            return (Criteria) this;
        }

        public Criteria andFeatureGenerateModeNotBetween(String value1, String value2) {
            addCriterion("FEATURE_GENERATE_MODE not between", value1, value2, "featureGenerateMode");
            return (Criteria) this;
        }

        public Criteria andCkdIsNull() {
            addCriterion("CKD is null");
            return (Criteria) this;
        }

        public Criteria andCkdIsNotNull() {
            addCriterion("CKD is not null");
            return (Criteria) this;
        }

        public Criteria andCkdEqualTo(Boolean value) {
            addCriterion("CKD =", value, "ckd");
            return (Criteria) this;
        }

        public Criteria andCkdNotEqualTo(Boolean value) {
            addCriterion("CKD <>", value, "ckd");
            return (Criteria) this;
        }

        public Criteria andCkdGreaterThan(Boolean value) {
            addCriterion("CKD >", value, "ckd");
            return (Criteria) this;
        }

        public Criteria andCkdGreaterThanOrEqualTo(Boolean value) {
            addCriterion("CKD >=", value, "ckd");
            return (Criteria) this;
        }

        public Criteria andCkdLessThan(Boolean value) {
            addCriterion("CKD <", value, "ckd");
            return (Criteria) this;
        }

        public Criteria andCkdLessThanOrEqualTo(Boolean value) {
            addCriterion("CKD <=", value, "ckd");
            return (Criteria) this;
        }

        public Criteria andCkdIn(List<Boolean> values) {
            addCriterion("CKD in", values, "ckd");
            return (Criteria) this;
        }

        public Criteria andCkdNotIn(List<Boolean> values) {
            addCriterion("CKD not in", values, "ckd");
            return (Criteria) this;
        }

        public Criteria andCkdBetween(Boolean value1, Boolean value2) {
            addCriterion("CKD between", value1, value2, "ckd");
            return (Criteria) this;
        }

        public Criteria andCkdNotBetween(Boolean value1, Boolean value2) {
            addCriterion("CKD not between", value1, value2, "ckd");
            return (Criteria) this;
        }

        public Criteria andItemPictureIsNull() {
            addCriterion("ITEM_PICTURE is null");
            return (Criteria) this;
        }

        public Criteria andItemPictureIsNotNull() {
            addCriterion("ITEM_PICTURE is not null");
            return (Criteria) this;
        }

        public Criteria andItemPictureEqualTo(String value) {
            addCriterion("ITEM_PICTURE =", value, "itemPicture");
            return (Criteria) this;
        }

        public Criteria andItemPictureNotEqualTo(String value) {
            addCriterion("ITEM_PICTURE <>", value, "itemPicture");
            return (Criteria) this;
        }

        public Criteria andItemPictureGreaterThan(String value) {
            addCriterion("ITEM_PICTURE >", value, "itemPicture");
            return (Criteria) this;
        }

        public Criteria andItemPictureGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_PICTURE >=", value, "itemPicture");
            return (Criteria) this;
        }

        public Criteria andItemPictureLessThan(String value) {
            addCriterion("ITEM_PICTURE <", value, "itemPicture");
            return (Criteria) this;
        }

        public Criteria andItemPictureLessThanOrEqualTo(String value) {
            addCriterion("ITEM_PICTURE <=", value, "itemPicture");
            return (Criteria) this;
        }

        public Criteria andItemPictureLike(String value) {
            addCriterion("ITEM_PICTURE like", value, "itemPicture");
            return (Criteria) this;
        }

        public Criteria andItemPictureNotLike(String value) {
            addCriterion("ITEM_PICTURE not like", value, "itemPicture");
            return (Criteria) this;
        }

        public Criteria andItemPictureIn(List<String> values) {
            addCriterion("ITEM_PICTURE in", values, "itemPicture");
            return (Criteria) this;
        }

        public Criteria andItemPictureNotIn(List<String> values) {
            addCriterion("ITEM_PICTURE not in", values, "itemPicture");
            return (Criteria) this;
        }

        public Criteria andItemPictureBetween(String value1, String value2) {
            addCriterion("ITEM_PICTURE between", value1, value2, "itemPicture");
            return (Criteria) this;
        }

        public Criteria andItemPictureNotBetween(String value1, String value2) {
            addCriterion("ITEM_PICTURE not between", value1, value2, "itemPicture");
            return (Criteria) this;
        }

        public Criteria andJointProductControlIsNull() {
            addCriterion("JOINT_PRODUCT_CONTROL is null");
            return (Criteria) this;
        }

        public Criteria andJointProductControlIsNotNull() {
            addCriterion("JOINT_PRODUCT_CONTROL is not null");
            return (Criteria) this;
        }

        public Criteria andJointProductControlEqualTo(Boolean value) {
            addCriterion("JOINT_PRODUCT_CONTROL =", value, "jointProductControl");
            return (Criteria) this;
        }

        public Criteria andJointProductControlNotEqualTo(Boolean value) {
            addCriterion("JOINT_PRODUCT_CONTROL <>", value, "jointProductControl");
            return (Criteria) this;
        }

        public Criteria andJointProductControlGreaterThan(Boolean value) {
            addCriterion("JOINT_PRODUCT_CONTROL >", value, "jointProductControl");
            return (Criteria) this;
        }

        public Criteria andJointProductControlGreaterThanOrEqualTo(Boolean value) {
            addCriterion("JOINT_PRODUCT_CONTROL >=", value, "jointProductControl");
            return (Criteria) this;
        }

        public Criteria andJointProductControlLessThan(Boolean value) {
            addCriterion("JOINT_PRODUCT_CONTROL <", value, "jointProductControl");
            return (Criteria) this;
        }

        public Criteria andJointProductControlLessThanOrEqualTo(Boolean value) {
            addCriterion("JOINT_PRODUCT_CONTROL <=", value, "jointProductControl");
            return (Criteria) this;
        }

        public Criteria andJointProductControlIn(List<Boolean> values) {
            addCriterion("JOINT_PRODUCT_CONTROL in", values, "jointProductControl");
            return (Criteria) this;
        }

        public Criteria andJointProductControlNotIn(List<Boolean> values) {
            addCriterion("JOINT_PRODUCT_CONTROL not in", values, "jointProductControl");
            return (Criteria) this;
        }

        public Criteria andJointProductControlBetween(Boolean value1, Boolean value2) {
            addCriterion("JOINT_PRODUCT_CONTROL between", value1, value2, "jointProductControl");
            return (Criteria) this;
        }

        public Criteria andJointProductControlNotBetween(Boolean value1, Boolean value2) {
            addCriterion("JOINT_PRODUCT_CONTROL not between", value1, value2, "jointProductControl");
            return (Criteria) this;
        }

        public Criteria andNeedCertificationIsNull() {
            addCriterion("NEED_CERTIFICATION is null");
            return (Criteria) this;
        }

        public Criteria andNeedCertificationIsNotNull() {
            addCriterion("NEED_CERTIFICATION is not null");
            return (Criteria) this;
        }

        public Criteria andNeedCertificationEqualTo(Boolean value) {
            addCriterion("NEED_CERTIFICATION =", value, "needCertification");
            return (Criteria) this;
        }

        public Criteria andNeedCertificationNotEqualTo(Boolean value) {
            addCriterion("NEED_CERTIFICATION <>", value, "needCertification");
            return (Criteria) this;
        }

        public Criteria andNeedCertificationGreaterThan(Boolean value) {
            addCriterion("NEED_CERTIFICATION >", value, "needCertification");
            return (Criteria) this;
        }

        public Criteria andNeedCertificationGreaterThanOrEqualTo(Boolean value) {
            addCriterion("NEED_CERTIFICATION >=", value, "needCertification");
            return (Criteria) this;
        }

        public Criteria andNeedCertificationLessThan(Boolean value) {
            addCriterion("NEED_CERTIFICATION <", value, "needCertification");
            return (Criteria) this;
        }

        public Criteria andNeedCertificationLessThanOrEqualTo(Boolean value) {
            addCriterion("NEED_CERTIFICATION <=", value, "needCertification");
            return (Criteria) this;
        }

        public Criteria andNeedCertificationIn(List<Boolean> values) {
            addCriterion("NEED_CERTIFICATION in", values, "needCertification");
            return (Criteria) this;
        }

        public Criteria andNeedCertificationNotIn(List<Boolean> values) {
            addCriterion("NEED_CERTIFICATION not in", values, "needCertification");
            return (Criteria) this;
        }

        public Criteria andNeedCertificationBetween(Boolean value1, Boolean value2) {
            addCriterion("NEED_CERTIFICATION between", value1, value2, "needCertification");
            return (Criteria) this;
        }

        public Criteria andNeedCertificationNotBetween(Boolean value1, Boolean value2) {
            addCriterion("NEED_CERTIFICATION not between", value1, value2, "needCertification");
            return (Criteria) this;
        }

        public Criteria andLotNoRuleIdIsNull() {
            addCriterion("LOT_NO_RULE_ID is null");
            return (Criteria) this;
        }

        public Criteria andLotNoRuleIdIsNotNull() {
            addCriterion("LOT_NO_RULE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLotNoRuleIdEqualTo(String value) {
            addCriterion("LOT_NO_RULE_ID =", value, "lotNoRuleId");
            return (Criteria) this;
        }

        public Criteria andLotNoRuleIdNotEqualTo(String value) {
            addCriterion("LOT_NO_RULE_ID <>", value, "lotNoRuleId");
            return (Criteria) this;
        }

        public Criteria andLotNoRuleIdGreaterThan(String value) {
            addCriterion("LOT_NO_RULE_ID >", value, "lotNoRuleId");
            return (Criteria) this;
        }

        public Criteria andLotNoRuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("LOT_NO_RULE_ID >=", value, "lotNoRuleId");
            return (Criteria) this;
        }

        public Criteria andLotNoRuleIdLessThan(String value) {
            addCriterion("LOT_NO_RULE_ID <", value, "lotNoRuleId");
            return (Criteria) this;
        }

        public Criteria andLotNoRuleIdLessThanOrEqualTo(String value) {
            addCriterion("LOT_NO_RULE_ID <=", value, "lotNoRuleId");
            return (Criteria) this;
        }

        public Criteria andLotNoRuleIdLike(String value) {
            addCriterion("LOT_NO_RULE_ID like", value, "lotNoRuleId");
            return (Criteria) this;
        }

        public Criteria andLotNoRuleIdNotLike(String value) {
            addCriterion("LOT_NO_RULE_ID not like", value, "lotNoRuleId");
            return (Criteria) this;
        }

        public Criteria andLotNoRuleIdIn(List<String> values) {
            addCriterion("LOT_NO_RULE_ID in", values, "lotNoRuleId");
            return (Criteria) this;
        }

        public Criteria andLotNoRuleIdNotIn(List<String> values) {
            addCriterion("LOT_NO_RULE_ID not in", values, "lotNoRuleId");
            return (Criteria) this;
        }

        public Criteria andLotNoRuleIdBetween(String value1, String value2) {
            addCriterion("LOT_NO_RULE_ID between", value1, value2, "lotNoRuleId");
            return (Criteria) this;
        }

        public Criteria andLotNoRuleIdNotBetween(String value1, String value2) {
            addCriterion("LOT_NO_RULE_ID not between", value1, value2, "lotNoRuleId");
            return (Criteria) this;
        }

        public Criteria andSnNoRuleIdIsNull() {
            addCriterion("SN_NO_RULE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSnNoRuleIdIsNotNull() {
            addCriterion("SN_NO_RULE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSnNoRuleIdEqualTo(String value) {
            addCriterion("SN_NO_RULE_ID =", value, "snNoRuleId");
            return (Criteria) this;
        }

        public Criteria andSnNoRuleIdNotEqualTo(String value) {
            addCriterion("SN_NO_RULE_ID <>", value, "snNoRuleId");
            return (Criteria) this;
        }

        public Criteria andSnNoRuleIdGreaterThan(String value) {
            addCriterion("SN_NO_RULE_ID >", value, "snNoRuleId");
            return (Criteria) this;
        }

        public Criteria andSnNoRuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("SN_NO_RULE_ID >=", value, "snNoRuleId");
            return (Criteria) this;
        }

        public Criteria andSnNoRuleIdLessThan(String value) {
            addCriterion("SN_NO_RULE_ID <", value, "snNoRuleId");
            return (Criteria) this;
        }

        public Criteria andSnNoRuleIdLessThanOrEqualTo(String value) {
            addCriterion("SN_NO_RULE_ID <=", value, "snNoRuleId");
            return (Criteria) this;
        }

        public Criteria andSnNoRuleIdLike(String value) {
            addCriterion("SN_NO_RULE_ID like", value, "snNoRuleId");
            return (Criteria) this;
        }

        public Criteria andSnNoRuleIdNotLike(String value) {
            addCriterion("SN_NO_RULE_ID not like", value, "snNoRuleId");
            return (Criteria) this;
        }

        public Criteria andSnNoRuleIdIn(List<String> values) {
            addCriterion("SN_NO_RULE_ID in", values, "snNoRuleId");
            return (Criteria) this;
        }

        public Criteria andSnNoRuleIdNotIn(List<String> values) {
            addCriterion("SN_NO_RULE_ID not in", values, "snNoRuleId");
            return (Criteria) this;
        }

        public Criteria andSnNoRuleIdBetween(String value1, String value2) {
            addCriterion("SN_NO_RULE_ID between", value1, value2, "snNoRuleId");
            return (Criteria) this;
        }

        public Criteria andSnNoRuleIdNotBetween(String value1, String value2) {
            addCriterion("SN_NO_RULE_ID not between", value1, value2, "snNoRuleId");
            return (Criteria) this;
        }

        public Criteria andFeatureGroupIdIsNull() {
            addCriterion("FEATURE_GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andFeatureGroupIdIsNotNull() {
            addCriterion("FEATURE_GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureGroupIdEqualTo(String value) {
            addCriterion("FEATURE_GROUP_ID =", value, "featureGroupId");
            return (Criteria) this;
        }

        public Criteria andFeatureGroupIdNotEqualTo(String value) {
            addCriterion("FEATURE_GROUP_ID <>", value, "featureGroupId");
            return (Criteria) this;
        }

        public Criteria andFeatureGroupIdGreaterThan(String value) {
            addCriterion("FEATURE_GROUP_ID >", value, "featureGroupId");
            return (Criteria) this;
        }

        public Criteria andFeatureGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("FEATURE_GROUP_ID >=", value, "featureGroupId");
            return (Criteria) this;
        }

        public Criteria andFeatureGroupIdLessThan(String value) {
            addCriterion("FEATURE_GROUP_ID <", value, "featureGroupId");
            return (Criteria) this;
        }

        public Criteria andFeatureGroupIdLessThanOrEqualTo(String value) {
            addCriterion("FEATURE_GROUP_ID <=", value, "featureGroupId");
            return (Criteria) this;
        }

        public Criteria andFeatureGroupIdLike(String value) {
            addCriterion("FEATURE_GROUP_ID like", value, "featureGroupId");
            return (Criteria) this;
        }

        public Criteria andFeatureGroupIdNotLike(String value) {
            addCriterion("FEATURE_GROUP_ID not like", value, "featureGroupId");
            return (Criteria) this;
        }

        public Criteria andFeatureGroupIdIn(List<String> values) {
            addCriterion("FEATURE_GROUP_ID in", values, "featureGroupId");
            return (Criteria) this;
        }

        public Criteria andFeatureGroupIdNotIn(List<String> values) {
            addCriterion("FEATURE_GROUP_ID not in", values, "featureGroupId");
            return (Criteria) this;
        }

        public Criteria andFeatureGroupIdBetween(String value1, String value2) {
            addCriterion("FEATURE_GROUP_ID between", value1, value2, "featureGroupId");
            return (Criteria) this;
        }

        public Criteria andFeatureGroupIdNotBetween(String value1, String value2) {
            addCriterion("FEATURE_GROUP_ID not between", value1, value2, "featureGroupId");
            return (Criteria) this;
        }

        public Criteria andSecondUnitIdIsNull() {
            addCriterion("SECOND_UNIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andSecondUnitIdIsNotNull() {
            addCriterion("SECOND_UNIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSecondUnitIdEqualTo(String value) {
            addCriterion("SECOND_UNIT_ID =", value, "secondUnitId");
            return (Criteria) this;
        }

        public Criteria andSecondUnitIdNotEqualTo(String value) {
            addCriterion("SECOND_UNIT_ID <>", value, "secondUnitId");
            return (Criteria) this;
        }

        public Criteria andSecondUnitIdGreaterThan(String value) {
            addCriterion("SECOND_UNIT_ID >", value, "secondUnitId");
            return (Criteria) this;
        }

        public Criteria andSecondUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("SECOND_UNIT_ID >=", value, "secondUnitId");
            return (Criteria) this;
        }

        public Criteria andSecondUnitIdLessThan(String value) {
            addCriterion("SECOND_UNIT_ID <", value, "secondUnitId");
            return (Criteria) this;
        }

        public Criteria andSecondUnitIdLessThanOrEqualTo(String value) {
            addCriterion("SECOND_UNIT_ID <=", value, "secondUnitId");
            return (Criteria) this;
        }

        public Criteria andSecondUnitIdLike(String value) {
            addCriterion("SECOND_UNIT_ID like", value, "secondUnitId");
            return (Criteria) this;
        }

        public Criteria andSecondUnitIdNotLike(String value) {
            addCriterion("SECOND_UNIT_ID not like", value, "secondUnitId");
            return (Criteria) this;
        }

        public Criteria andSecondUnitIdIn(List<String> values) {
            addCriterion("SECOND_UNIT_ID in", values, "secondUnitId");
            return (Criteria) this;
        }

        public Criteria andSecondUnitIdNotIn(List<String> values) {
            addCriterion("SECOND_UNIT_ID not in", values, "secondUnitId");
            return (Criteria) this;
        }

        public Criteria andSecondUnitIdBetween(String value1, String value2) {
            addCriterion("SECOND_UNIT_ID between", value1, value2, "secondUnitId");
            return (Criteria) this;
        }

        public Criteria andSecondUnitIdNotBetween(String value1, String value2) {
            addCriterion("SECOND_UNIT_ID not between", value1, value2, "secondUnitId");
            return (Criteria) this;
        }

        public Criteria andStockUnitIdIsNull() {
            addCriterion("STOCK_UNIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andStockUnitIdIsNotNull() {
            addCriterion("STOCK_UNIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStockUnitIdEqualTo(String value) {
            addCriterion("STOCK_UNIT_ID =", value, "stockUnitId");
            return (Criteria) this;
        }

        public Criteria andStockUnitIdNotEqualTo(String value) {
            addCriterion("STOCK_UNIT_ID <>", value, "stockUnitId");
            return (Criteria) this;
        }

        public Criteria andStockUnitIdGreaterThan(String value) {
            addCriterion("STOCK_UNIT_ID >", value, "stockUnitId");
            return (Criteria) this;
        }

        public Criteria andStockUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("STOCK_UNIT_ID >=", value, "stockUnitId");
            return (Criteria) this;
        }

        public Criteria andStockUnitIdLessThan(String value) {
            addCriterion("STOCK_UNIT_ID <", value, "stockUnitId");
            return (Criteria) this;
        }

        public Criteria andStockUnitIdLessThanOrEqualTo(String value) {
            addCriterion("STOCK_UNIT_ID <=", value, "stockUnitId");
            return (Criteria) this;
        }

        public Criteria andStockUnitIdLike(String value) {
            addCriterion("STOCK_UNIT_ID like", value, "stockUnitId");
            return (Criteria) this;
        }

        public Criteria andStockUnitIdNotLike(String value) {
            addCriterion("STOCK_UNIT_ID not like", value, "stockUnitId");
            return (Criteria) this;
        }

        public Criteria andStockUnitIdIn(List<String> values) {
            addCriterion("STOCK_UNIT_ID in", values, "stockUnitId");
            return (Criteria) this;
        }

        public Criteria andStockUnitIdNotIn(List<String> values) {
            addCriterion("STOCK_UNIT_ID not in", values, "stockUnitId");
            return (Criteria) this;
        }

        public Criteria andStockUnitIdBetween(String value1, String value2) {
            addCriterion("STOCK_UNIT_ID between", value1, value2, "stockUnitId");
            return (Criteria) this;
        }

        public Criteria andStockUnitIdNotBetween(String value1, String value2) {
            addCriterion("STOCK_UNIT_ID not between", value1, value2, "stockUnitId");
            return (Criteria) this;
        }

        public Criteria andLifecycleIdIsNull() {
            addCriterion("LIFECYCLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andLifecycleIdIsNotNull() {
            addCriterion("LIFECYCLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLifecycleIdEqualTo(String value) {
            addCriterion("LIFECYCLE_ID =", value, "lifecycleId");
            return (Criteria) this;
        }

        public Criteria andLifecycleIdNotEqualTo(String value) {
            addCriterion("LIFECYCLE_ID <>", value, "lifecycleId");
            return (Criteria) this;
        }

        public Criteria andLifecycleIdGreaterThan(String value) {
            addCriterion("LIFECYCLE_ID >", value, "lifecycleId");
            return (Criteria) this;
        }

        public Criteria andLifecycleIdGreaterThanOrEqualTo(String value) {
            addCriterion("LIFECYCLE_ID >=", value, "lifecycleId");
            return (Criteria) this;
        }

        public Criteria andLifecycleIdLessThan(String value) {
            addCriterion("LIFECYCLE_ID <", value, "lifecycleId");
            return (Criteria) this;
        }

        public Criteria andLifecycleIdLessThanOrEqualTo(String value) {
            addCriterion("LIFECYCLE_ID <=", value, "lifecycleId");
            return (Criteria) this;
        }

        public Criteria andLifecycleIdLike(String value) {
            addCriterion("LIFECYCLE_ID like", value, "lifecycleId");
            return (Criteria) this;
        }

        public Criteria andLifecycleIdNotLike(String value) {
            addCriterion("LIFECYCLE_ID not like", value, "lifecycleId");
            return (Criteria) this;
        }

        public Criteria andLifecycleIdIn(List<String> values) {
            addCriterion("LIFECYCLE_ID in", values, "lifecycleId");
            return (Criteria) this;
        }

        public Criteria andLifecycleIdNotIn(List<String> values) {
            addCriterion("LIFECYCLE_ID not in", values, "lifecycleId");
            return (Criteria) this;
        }

        public Criteria andLifecycleIdBetween(String value1, String value2) {
            addCriterion("LIFECYCLE_ID between", value1, value2, "lifecycleId");
            return (Criteria) this;
        }

        public Criteria andLifecycleIdNotBetween(String value1, String value2) {
            addCriterion("LIFECYCLE_ID not between", value1, value2, "lifecycleId");
            return (Criteria) this;
        }

        public Criteria andLogisticUnitIdIsNull() {
            addCriterion("LOGISTIC_UNIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andLogisticUnitIdIsNotNull() {
            addCriterion("LOGISTIC_UNIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticUnitIdEqualTo(String value) {
            addCriterion("LOGISTIC_UNIT_ID =", value, "logisticUnitId");
            return (Criteria) this;
        }

        public Criteria andLogisticUnitIdNotEqualTo(String value) {
            addCriterion("LOGISTIC_UNIT_ID <>", value, "logisticUnitId");
            return (Criteria) this;
        }

        public Criteria andLogisticUnitIdGreaterThan(String value) {
            addCriterion("LOGISTIC_UNIT_ID >", value, "logisticUnitId");
            return (Criteria) this;
        }

        public Criteria andLogisticUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("LOGISTIC_UNIT_ID >=", value, "logisticUnitId");
            return (Criteria) this;
        }

        public Criteria andLogisticUnitIdLessThan(String value) {
            addCriterion("LOGISTIC_UNIT_ID <", value, "logisticUnitId");
            return (Criteria) this;
        }

        public Criteria andLogisticUnitIdLessThanOrEqualTo(String value) {
            addCriterion("LOGISTIC_UNIT_ID <=", value, "logisticUnitId");
            return (Criteria) this;
        }

        public Criteria andLogisticUnitIdLike(String value) {
            addCriterion("LOGISTIC_UNIT_ID like", value, "logisticUnitId");
            return (Criteria) this;
        }

        public Criteria andLogisticUnitIdNotLike(String value) {
            addCriterion("LOGISTIC_UNIT_ID not like", value, "logisticUnitId");
            return (Criteria) this;
        }

        public Criteria andLogisticUnitIdIn(List<String> values) {
            addCriterion("LOGISTIC_UNIT_ID in", values, "logisticUnitId");
            return (Criteria) this;
        }

        public Criteria andLogisticUnitIdNotIn(List<String> values) {
            addCriterion("LOGISTIC_UNIT_ID not in", values, "logisticUnitId");
            return (Criteria) this;
        }

        public Criteria andLogisticUnitIdBetween(String value1, String value2) {
            addCriterion("LOGISTIC_UNIT_ID between", value1, value2, "logisticUnitId");
            return (Criteria) this;
        }

        public Criteria andLogisticUnitIdNotBetween(String value1, String value2) {
            addCriterion("LOGISTIC_UNIT_ID not between", value1, value2, "logisticUnitId");
            return (Criteria) this;
        }

        public Criteria andIsweightIsNull() {
            addCriterion("ISWEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andIsweightIsNotNull() {
            addCriterion("ISWEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andIsweightEqualTo(Boolean value) {
            addCriterion("ISWEIGHT =", value, "isweight");
            return (Criteria) this;
        }

        public Criteria andIsweightNotEqualTo(Boolean value) {
            addCriterion("ISWEIGHT <>", value, "isweight");
            return (Criteria) this;
        }

        public Criteria andIsweightGreaterThan(Boolean value) {
            addCriterion("ISWEIGHT >", value, "isweight");
            return (Criteria) this;
        }

        public Criteria andIsweightGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ISWEIGHT >=", value, "isweight");
            return (Criteria) this;
        }

        public Criteria andIsweightLessThan(Boolean value) {
            addCriterion("ISWEIGHT <", value, "isweight");
            return (Criteria) this;
        }

        public Criteria andIsweightLessThanOrEqualTo(Boolean value) {
            addCriterion("ISWEIGHT <=", value, "isweight");
            return (Criteria) this;
        }

        public Criteria andIsweightIn(List<Boolean> values) {
            addCriterion("ISWEIGHT in", values, "isweight");
            return (Criteria) this;
        }

        public Criteria andIsweightNotIn(List<Boolean> values) {
            addCriterion("ISWEIGHT not in", values, "isweight");
            return (Criteria) this;
        }

        public Criteria andIsweightBetween(Boolean value1, Boolean value2) {
            addCriterion("ISWEIGHT between", value1, value2, "isweight");
            return (Criteria) this;
        }

        public Criteria andIsweightNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ISWEIGHT not between", value1, value2, "isweight");
            return (Criteria) this;
        }

        public Criteria andWeightPriceIsNull() {
            addCriterion("WEIGHT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andWeightPriceIsNotNull() {
            addCriterion("WEIGHT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andWeightPriceEqualTo(Boolean value) {
            addCriterion("WEIGHT_PRICE =", value, "weightPrice");
            return (Criteria) this;
        }

        public Criteria andWeightPriceNotEqualTo(Boolean value) {
            addCriterion("WEIGHT_PRICE <>", value, "weightPrice");
            return (Criteria) this;
        }

        public Criteria andWeightPriceGreaterThan(Boolean value) {
            addCriterion("WEIGHT_PRICE >", value, "weightPrice");
            return (Criteria) this;
        }

        public Criteria andWeightPriceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("WEIGHT_PRICE >=", value, "weightPrice");
            return (Criteria) this;
        }

        public Criteria andWeightPriceLessThan(Boolean value) {
            addCriterion("WEIGHT_PRICE <", value, "weightPrice");
            return (Criteria) this;
        }

        public Criteria andWeightPriceLessThanOrEqualTo(Boolean value) {
            addCriterion("WEIGHT_PRICE <=", value, "weightPrice");
            return (Criteria) this;
        }

        public Criteria andWeightPriceIn(List<Boolean> values) {
            addCriterion("WEIGHT_PRICE in", values, "weightPrice");
            return (Criteria) this;
        }

        public Criteria andWeightPriceNotIn(List<Boolean> values) {
            addCriterion("WEIGHT_PRICE not in", values, "weightPrice");
            return (Criteria) this;
        }

        public Criteria andWeightPriceBetween(Boolean value1, Boolean value2) {
            addCriterion("WEIGHT_PRICE between", value1, value2, "weightPrice");
            return (Criteria) this;
        }

        public Criteria andWeightPriceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("WEIGHT_PRICE not between", value1, value2, "weightPrice");
            return (Criteria) this;
        }

        public Criteria andWeightPluIsNull() {
            addCriterion("WEIGHT_PLU is null");
            return (Criteria) this;
        }

        public Criteria andWeightPluIsNotNull() {
            addCriterion("WEIGHT_PLU is not null");
            return (Criteria) this;
        }

        public Criteria andWeightPluEqualTo(String value) {
            addCriterion("WEIGHT_PLU =", value, "weightPlu");
            return (Criteria) this;
        }

        public Criteria andWeightPluNotEqualTo(String value) {
            addCriterion("WEIGHT_PLU <>", value, "weightPlu");
            return (Criteria) this;
        }

        public Criteria andWeightPluGreaterThan(String value) {
            addCriterion("WEIGHT_PLU >", value, "weightPlu");
            return (Criteria) this;
        }

        public Criteria andWeightPluGreaterThanOrEqualTo(String value) {
            addCriterion("WEIGHT_PLU >=", value, "weightPlu");
            return (Criteria) this;
        }

        public Criteria andWeightPluLessThan(String value) {
            addCriterion("WEIGHT_PLU <", value, "weightPlu");
            return (Criteria) this;
        }

        public Criteria andWeightPluLessThanOrEqualTo(String value) {
            addCriterion("WEIGHT_PLU <=", value, "weightPlu");
            return (Criteria) this;
        }

        public Criteria andWeightPluLike(String value) {
            addCriterion("WEIGHT_PLU like", value, "weightPlu");
            return (Criteria) this;
        }

        public Criteria andWeightPluNotLike(String value) {
            addCriterion("WEIGHT_PLU not like", value, "weightPlu");
            return (Criteria) this;
        }

        public Criteria andWeightPluIn(List<String> values) {
            addCriterion("WEIGHT_PLU in", values, "weightPlu");
            return (Criteria) this;
        }

        public Criteria andWeightPluNotIn(List<String> values) {
            addCriterion("WEIGHT_PLU not in", values, "weightPlu");
            return (Criteria) this;
        }

        public Criteria andWeightPluBetween(String value1, String value2) {
            addCriterion("WEIGHT_PLU between", value1, value2, "weightPlu");
            return (Criteria) this;
        }

        public Criteria andWeightPluNotBetween(String value1, String value2) {
            addCriterion("WEIGHT_PLU not between", value1, value2, "weightPlu");
            return (Criteria) this;
        }

        public Criteria andWeightUnitIdIsNull() {
            addCriterion("WEIGHT_UNIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andWeightUnitIdIsNotNull() {
            addCriterion("WEIGHT_UNIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWeightUnitIdEqualTo(String value) {
            addCriterion("WEIGHT_UNIT_ID =", value, "weightUnitId");
            return (Criteria) this;
        }

        public Criteria andWeightUnitIdNotEqualTo(String value) {
            addCriterion("WEIGHT_UNIT_ID <>", value, "weightUnitId");
            return (Criteria) this;
        }

        public Criteria andWeightUnitIdGreaterThan(String value) {
            addCriterion("WEIGHT_UNIT_ID >", value, "weightUnitId");
            return (Criteria) this;
        }

        public Criteria andWeightUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("WEIGHT_UNIT_ID >=", value, "weightUnitId");
            return (Criteria) this;
        }

        public Criteria andWeightUnitIdLessThan(String value) {
            addCriterion("WEIGHT_UNIT_ID <", value, "weightUnitId");
            return (Criteria) this;
        }

        public Criteria andWeightUnitIdLessThanOrEqualTo(String value) {
            addCriterion("WEIGHT_UNIT_ID <=", value, "weightUnitId");
            return (Criteria) this;
        }

        public Criteria andWeightUnitIdLike(String value) {
            addCriterion("WEIGHT_UNIT_ID like", value, "weightUnitId");
            return (Criteria) this;
        }

        public Criteria andWeightUnitIdNotLike(String value) {
            addCriterion("WEIGHT_UNIT_ID not like", value, "weightUnitId");
            return (Criteria) this;
        }

        public Criteria andWeightUnitIdIn(List<String> values) {
            addCriterion("WEIGHT_UNIT_ID in", values, "weightUnitId");
            return (Criteria) this;
        }

        public Criteria andWeightUnitIdNotIn(List<String> values) {
            addCriterion("WEIGHT_UNIT_ID not in", values, "weightUnitId");
            return (Criteria) this;
        }

        public Criteria andWeightUnitIdBetween(String value1, String value2) {
            addCriterion("WEIGHT_UNIT_ID between", value1, value2, "weightUnitId");
            return (Criteria) this;
        }

        public Criteria andWeightUnitIdNotBetween(String value1, String value2) {
            addCriterion("WEIGHT_UNIT_ID not between", value1, value2, "weightUnitId");
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

        public Criteria andPlmDatakeyIsNull() {
            addCriterion("PLM_DATAKEY is null");
            return (Criteria) this;
        }

        public Criteria andPlmDatakeyIsNotNull() {
            addCriterion("PLM_DATAKEY is not null");
            return (Criteria) this;
        }

        public Criteria andPlmDatakeyEqualTo(String value) {
            addCriterion("PLM_DATAKEY =", value, "plmDatakey");
            return (Criteria) this;
        }

        public Criteria andPlmDatakeyNotEqualTo(String value) {
            addCriterion("PLM_DATAKEY <>", value, "plmDatakey");
            return (Criteria) this;
        }

        public Criteria andPlmDatakeyGreaterThan(String value) {
            addCriterion("PLM_DATAKEY >", value, "plmDatakey");
            return (Criteria) this;
        }

        public Criteria andPlmDatakeyGreaterThanOrEqualTo(String value) {
            addCriterion("PLM_DATAKEY >=", value, "plmDatakey");
            return (Criteria) this;
        }

        public Criteria andPlmDatakeyLessThan(String value) {
            addCriterion("PLM_DATAKEY <", value, "plmDatakey");
            return (Criteria) this;
        }

        public Criteria andPlmDatakeyLessThanOrEqualTo(String value) {
            addCriterion("PLM_DATAKEY <=", value, "plmDatakey");
            return (Criteria) this;
        }

        public Criteria andPlmDatakeyLike(String value) {
            addCriterion("PLM_DATAKEY like", value, "plmDatakey");
            return (Criteria) this;
        }

        public Criteria andPlmDatakeyNotLike(String value) {
            addCriterion("PLM_DATAKEY not like", value, "plmDatakey");
            return (Criteria) this;
        }

        public Criteria andPlmDatakeyIn(List<String> values) {
            addCriterion("PLM_DATAKEY in", values, "plmDatakey");
            return (Criteria) this;
        }

        public Criteria andPlmDatakeyNotIn(List<String> values) {
            addCriterion("PLM_DATAKEY not in", values, "plmDatakey");
            return (Criteria) this;
        }

        public Criteria andPlmDatakeyBetween(String value1, String value2) {
            addCriterion("PLM_DATAKEY between", value1, value2, "plmDatakey");
            return (Criteria) this;
        }

        public Criteria andPlmDatakeyNotBetween(String value1, String value2) {
            addCriterion("PLM_DATAKEY not between", value1, value2, "plmDatakey");
            return (Criteria) this;
        }

        public Criteria andItemPicIsNull() {
            addCriterion("ITEM_PIC is null");
            return (Criteria) this;
        }

        public Criteria andItemPicIsNotNull() {
            addCriterion("ITEM_PIC is not null");
            return (Criteria) this;
        }

        public Criteria andItemPicEqualTo(String value) {
            addCriterion("ITEM_PIC =", value, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicNotEqualTo(String value) {
            addCriterion("ITEM_PIC <>", value, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicGreaterThan(String value) {
            addCriterion("ITEM_PIC >", value, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_PIC >=", value, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicLessThan(String value) {
            addCriterion("ITEM_PIC <", value, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicLessThanOrEqualTo(String value) {
            addCriterion("ITEM_PIC <=", value, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicLike(String value) {
            addCriterion("ITEM_PIC like", value, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicNotLike(String value) {
            addCriterion("ITEM_PIC not like", value, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicIn(List<String> values) {
            addCriterion("ITEM_PIC in", values, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicNotIn(List<String> values) {
            addCriterion("ITEM_PIC not in", values, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicBetween(String value1, String value2) {
            addCriterion("ITEM_PIC between", value1, value2, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemPicNotBetween(String value1, String value2) {
            addCriterion("ITEM_PIC not between", value1, value2, "itemPic");
            return (Criteria) this;
        }

        public Criteria andItemDescIsNull() {
            addCriterion("ITEM_DESC is null");
            return (Criteria) this;
        }

        public Criteria andItemDescIsNotNull() {
            addCriterion("ITEM_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andItemDescEqualTo(String value) {
            addCriterion("ITEM_DESC =", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotEqualTo(String value) {
            addCriterion("ITEM_DESC <>", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescGreaterThan(String value) {
            addCriterion("ITEM_DESC >", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_DESC >=", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLessThan(String value) {
            addCriterion("ITEM_DESC <", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLessThanOrEqualTo(String value) {
            addCriterion("ITEM_DESC <=", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLike(String value) {
            addCriterion("ITEM_DESC like", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotLike(String value) {
            addCriterion("ITEM_DESC not like", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescIn(List<String> values) {
            addCriterion("ITEM_DESC in", values, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotIn(List<String> values) {
            addCriterion("ITEM_DESC not in", values, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescBetween(String value1, String value2) {
            addCriterion("ITEM_DESC between", value1, value2, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotBetween(String value1, String value2) {
            addCriterion("ITEM_DESC not between", value1, value2, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andDrawingNoIsNull() {
            addCriterion("DRAWING_NO is null");
            return (Criteria) this;
        }

        public Criteria andDrawingNoIsNotNull() {
            addCriterion("DRAWING_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDrawingNoEqualTo(String value) {
            addCriterion("DRAWING_NO =", value, "drawingNo");
            return (Criteria) this;
        }

        public Criteria andDrawingNoNotEqualTo(String value) {
            addCriterion("DRAWING_NO <>", value, "drawingNo");
            return (Criteria) this;
        }

        public Criteria andDrawingNoGreaterThan(String value) {
            addCriterion("DRAWING_NO >", value, "drawingNo");
            return (Criteria) this;
        }

        public Criteria andDrawingNoGreaterThanOrEqualTo(String value) {
            addCriterion("DRAWING_NO >=", value, "drawingNo");
            return (Criteria) this;
        }

        public Criteria andDrawingNoLessThan(String value) {
            addCriterion("DRAWING_NO <", value, "drawingNo");
            return (Criteria) this;
        }

        public Criteria andDrawingNoLessThanOrEqualTo(String value) {
            addCriterion("DRAWING_NO <=", value, "drawingNo");
            return (Criteria) this;
        }

        public Criteria andDrawingNoLike(String value) {
            addCriterion("DRAWING_NO like", value, "drawingNo");
            return (Criteria) this;
        }

        public Criteria andDrawingNoNotLike(String value) {
            addCriterion("DRAWING_NO not like", value, "drawingNo");
            return (Criteria) this;
        }

        public Criteria andDrawingNoIn(List<String> values) {
            addCriterion("DRAWING_NO in", values, "drawingNo");
            return (Criteria) this;
        }

        public Criteria andDrawingNoNotIn(List<String> values) {
            addCriterion("DRAWING_NO not in", values, "drawingNo");
            return (Criteria) this;
        }

        public Criteria andDrawingNoBetween(String value1, String value2) {
            addCriterion("DRAWING_NO between", value1, value2, "drawingNo");
            return (Criteria) this;
        }

        public Criteria andDrawingNoNotBetween(String value1, String value2) {
            addCriterion("DRAWING_NO not between", value1, value2, "drawingNo");
            return (Criteria) this;
        }

        public Criteria andDrawingNoFromIsNull() {
            addCriterion("DRAWING_NO_FROM is null");
            return (Criteria) this;
        }

        public Criteria andDrawingNoFromIsNotNull() {
            addCriterion("DRAWING_NO_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andDrawingNoFromEqualTo(String value) {
            addCriterion("DRAWING_NO_FROM =", value, "drawingNoFrom");
            return (Criteria) this;
        }

        public Criteria andDrawingNoFromNotEqualTo(String value) {
            addCriterion("DRAWING_NO_FROM <>", value, "drawingNoFrom");
            return (Criteria) this;
        }

        public Criteria andDrawingNoFromGreaterThan(String value) {
            addCriterion("DRAWING_NO_FROM >", value, "drawingNoFrom");
            return (Criteria) this;
        }

        public Criteria andDrawingNoFromGreaterThanOrEqualTo(String value) {
            addCriterion("DRAWING_NO_FROM >=", value, "drawingNoFrom");
            return (Criteria) this;
        }

        public Criteria andDrawingNoFromLessThan(String value) {
            addCriterion("DRAWING_NO_FROM <", value, "drawingNoFrom");
            return (Criteria) this;
        }

        public Criteria andDrawingNoFromLessThanOrEqualTo(String value) {
            addCriterion("DRAWING_NO_FROM <=", value, "drawingNoFrom");
            return (Criteria) this;
        }

        public Criteria andDrawingNoFromLike(String value) {
            addCriterion("DRAWING_NO_FROM like", value, "drawingNoFrom");
            return (Criteria) this;
        }

        public Criteria andDrawingNoFromNotLike(String value) {
            addCriterion("DRAWING_NO_FROM not like", value, "drawingNoFrom");
            return (Criteria) this;
        }

        public Criteria andDrawingNoFromIn(List<String> values) {
            addCriterion("DRAWING_NO_FROM in", values, "drawingNoFrom");
            return (Criteria) this;
        }

        public Criteria andDrawingNoFromNotIn(List<String> values) {
            addCriterion("DRAWING_NO_FROM not in", values, "drawingNoFrom");
            return (Criteria) this;
        }

        public Criteria andDrawingNoFromBetween(String value1, String value2) {
            addCriterion("DRAWING_NO_FROM between", value1, value2, "drawingNoFrom");
            return (Criteria) this;
        }

        public Criteria andDrawingNoFromNotBetween(String value1, String value2) {
            addCriterion("DRAWING_NO_FROM not between", value1, value2, "drawingNoFrom");
            return (Criteria) this;
        }

        public Criteria andItemNetWeightIsNull() {
            addCriterion("ITEM_NET_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andItemNetWeightIsNotNull() {
            addCriterion("ITEM_NET_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andItemNetWeightEqualTo(BigDecimal value) {
            addCriterion("ITEM_NET_WEIGHT =", value, "itemNetWeight");
            return (Criteria) this;
        }

        public Criteria andItemNetWeightNotEqualTo(BigDecimal value) {
            addCriterion("ITEM_NET_WEIGHT <>", value, "itemNetWeight");
            return (Criteria) this;
        }

        public Criteria andItemNetWeightGreaterThan(BigDecimal value) {
            addCriterion("ITEM_NET_WEIGHT >", value, "itemNetWeight");
            return (Criteria) this;
        }

        public Criteria andItemNetWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ITEM_NET_WEIGHT >=", value, "itemNetWeight");
            return (Criteria) this;
        }

        public Criteria andItemNetWeightLessThan(BigDecimal value) {
            addCriterion("ITEM_NET_WEIGHT <", value, "itemNetWeight");
            return (Criteria) this;
        }

        public Criteria andItemNetWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ITEM_NET_WEIGHT <=", value, "itemNetWeight");
            return (Criteria) this;
        }

        public Criteria andItemNetWeightIn(List<BigDecimal> values) {
            addCriterion("ITEM_NET_WEIGHT in", values, "itemNetWeight");
            return (Criteria) this;
        }

        public Criteria andItemNetWeightNotIn(List<BigDecimal> values) {
            addCriterion("ITEM_NET_WEIGHT not in", values, "itemNetWeight");
            return (Criteria) this;
        }

        public Criteria andItemNetWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ITEM_NET_WEIGHT between", value1, value2, "itemNetWeight");
            return (Criteria) this;
        }

        public Criteria andItemNetWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ITEM_NET_WEIGHT not between", value1, value2, "itemNetWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightUnitIdIsNull() {
            addCriterion("NET_WEIGHT_UNIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andNetWeightUnitIdIsNotNull() {
            addCriterion("NET_WEIGHT_UNIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNetWeightUnitIdEqualTo(String value) {
            addCriterion("NET_WEIGHT_UNIT_ID =", value, "netWeightUnitId");
            return (Criteria) this;
        }

        public Criteria andNetWeightUnitIdNotEqualTo(String value) {
            addCriterion("NET_WEIGHT_UNIT_ID <>", value, "netWeightUnitId");
            return (Criteria) this;
        }

        public Criteria andNetWeightUnitIdGreaterThan(String value) {
            addCriterion("NET_WEIGHT_UNIT_ID >", value, "netWeightUnitId");
            return (Criteria) this;
        }

        public Criteria andNetWeightUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("NET_WEIGHT_UNIT_ID >=", value, "netWeightUnitId");
            return (Criteria) this;
        }

        public Criteria andNetWeightUnitIdLessThan(String value) {
            addCriterion("NET_WEIGHT_UNIT_ID <", value, "netWeightUnitId");
            return (Criteria) this;
        }

        public Criteria andNetWeightUnitIdLessThanOrEqualTo(String value) {
            addCriterion("NET_WEIGHT_UNIT_ID <=", value, "netWeightUnitId");
            return (Criteria) this;
        }

        public Criteria andNetWeightUnitIdLike(String value) {
            addCriterion("NET_WEIGHT_UNIT_ID like", value, "netWeightUnitId");
            return (Criteria) this;
        }

        public Criteria andNetWeightUnitIdNotLike(String value) {
            addCriterion("NET_WEIGHT_UNIT_ID not like", value, "netWeightUnitId");
            return (Criteria) this;
        }

        public Criteria andNetWeightUnitIdIn(List<String> values) {
            addCriterion("NET_WEIGHT_UNIT_ID in", values, "netWeightUnitId");
            return (Criteria) this;
        }

        public Criteria andNetWeightUnitIdNotIn(List<String> values) {
            addCriterion("NET_WEIGHT_UNIT_ID not in", values, "netWeightUnitId");
            return (Criteria) this;
        }

        public Criteria andNetWeightUnitIdBetween(String value1, String value2) {
            addCriterion("NET_WEIGHT_UNIT_ID between", value1, value2, "netWeightUnitId");
            return (Criteria) this;
        }

        public Criteria andNetWeightUnitIdNotBetween(String value1, String value2) {
            addCriterion("NET_WEIGHT_UNIT_ID not between", value1, value2, "netWeightUnitId");
            return (Criteria) this;
        }

        public Criteria andServiceItemIsNull() {
            addCriterion("SERVICE_ITEM is null");
            return (Criteria) this;
        }

        public Criteria andServiceItemIsNotNull() {
            addCriterion("SERVICE_ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andServiceItemEqualTo(Boolean value) {
            addCriterion("SERVICE_ITEM =", value, "serviceItem");
            return (Criteria) this;
        }

        public Criteria andServiceItemNotEqualTo(Boolean value) {
            addCriterion("SERVICE_ITEM <>", value, "serviceItem");
            return (Criteria) this;
        }

        public Criteria andServiceItemGreaterThan(Boolean value) {
            addCriterion("SERVICE_ITEM >", value, "serviceItem");
            return (Criteria) this;
        }

        public Criteria andServiceItemGreaterThanOrEqualTo(Boolean value) {
            addCriterion("SERVICE_ITEM >=", value, "serviceItem");
            return (Criteria) this;
        }

        public Criteria andServiceItemLessThan(Boolean value) {
            addCriterion("SERVICE_ITEM <", value, "serviceItem");
            return (Criteria) this;
        }

        public Criteria andServiceItemLessThanOrEqualTo(Boolean value) {
            addCriterion("SERVICE_ITEM <=", value, "serviceItem");
            return (Criteria) this;
        }

        public Criteria andServiceItemIn(List<Boolean> values) {
            addCriterion("SERVICE_ITEM in", values, "serviceItem");
            return (Criteria) this;
        }

        public Criteria andServiceItemNotIn(List<Boolean> values) {
            addCriterion("SERVICE_ITEM not in", values, "serviceItem");
            return (Criteria) this;
        }

        public Criteria andServiceItemBetween(Boolean value1, Boolean value2) {
            addCriterion("SERVICE_ITEM between", value1, value2, "serviceItem");
            return (Criteria) this;
        }

        public Criteria andServiceItemNotBetween(Boolean value1, Boolean value2) {
            addCriterion("SERVICE_ITEM not between", value1, value2, "serviceItem");
            return (Criteria) this;
        }

        public Criteria andAssetIsNull() {
            addCriterion("ASSET is null");
            return (Criteria) this;
        }

        public Criteria andAssetIsNotNull() {
            addCriterion("ASSET is not null");
            return (Criteria) this;
        }

        public Criteria andAssetEqualTo(Boolean value) {
            addCriterion("ASSET =", value, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetNotEqualTo(Boolean value) {
            addCriterion("ASSET <>", value, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetGreaterThan(Boolean value) {
            addCriterion("ASSET >", value, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ASSET >=", value, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetLessThan(Boolean value) {
            addCriterion("ASSET <", value, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetLessThanOrEqualTo(Boolean value) {
            addCriterion("ASSET <=", value, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetIn(List<Boolean> values) {
            addCriterion("ASSET in", values, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetNotIn(List<Boolean> values) {
            addCriterion("ASSET not in", values, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetBetween(Boolean value1, Boolean value2) {
            addCriterion("ASSET between", value1, value2, "asset");
            return (Criteria) this;
        }

        public Criteria andAssetNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ASSET not between", value1, value2, "asset");
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