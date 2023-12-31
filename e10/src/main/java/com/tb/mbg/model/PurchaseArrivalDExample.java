package com.tb.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseArrivalDExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseArrivalDExample() {
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

        public Criteria andPurchaseArrivalDIdIsNull() {
            addCriterion("PURCHASE_ARRIVAL_D_ID is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseArrivalDIdIsNotNull() {
            addCriterion("PURCHASE_ARRIVAL_D_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseArrivalDIdEqualTo(String value) {
            addCriterion("PURCHASE_ARRIVAL_D_ID =", value, "purchaseArrivalDId");
            return (Criteria) this;
        }

        public Criteria andPurchaseArrivalDIdNotEqualTo(String value) {
            addCriterion("PURCHASE_ARRIVAL_D_ID <>", value, "purchaseArrivalDId");
            return (Criteria) this;
        }

        public Criteria andPurchaseArrivalDIdGreaterThan(String value) {
            addCriterion("PURCHASE_ARRIVAL_D_ID >", value, "purchaseArrivalDId");
            return (Criteria) this;
        }

        public Criteria andPurchaseArrivalDIdGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_ARRIVAL_D_ID >=", value, "purchaseArrivalDId");
            return (Criteria) this;
        }

        public Criteria andPurchaseArrivalDIdLessThan(String value) {
            addCriterion("PURCHASE_ARRIVAL_D_ID <", value, "purchaseArrivalDId");
            return (Criteria) this;
        }

        public Criteria andPurchaseArrivalDIdLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_ARRIVAL_D_ID <=", value, "purchaseArrivalDId");
            return (Criteria) this;
        }

        public Criteria andPurchaseArrivalDIdLike(String value) {
            addCriterion("PURCHASE_ARRIVAL_D_ID like", value, "purchaseArrivalDId");
            return (Criteria) this;
        }

        public Criteria andPurchaseArrivalDIdNotLike(String value) {
            addCriterion("PURCHASE_ARRIVAL_D_ID not like", value, "purchaseArrivalDId");
            return (Criteria) this;
        }

        public Criteria andPurchaseArrivalDIdIn(List<String> values) {
            addCriterion("PURCHASE_ARRIVAL_D_ID in", values, "purchaseArrivalDId");
            return (Criteria) this;
        }

        public Criteria andPurchaseArrivalDIdNotIn(List<String> values) {
            addCriterion("PURCHASE_ARRIVAL_D_ID not in", values, "purchaseArrivalDId");
            return (Criteria) this;
        }

        public Criteria andPurchaseArrivalDIdBetween(String value1, String value2) {
            addCriterion("PURCHASE_ARRIVAL_D_ID between", value1, value2, "purchaseArrivalDId");
            return (Criteria) this;
        }

        public Criteria andPurchaseArrivalDIdNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_ARRIVAL_D_ID not between", value1, value2, "purchaseArrivalDId");
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

        public Criteria andItemTypeIsNull() {
            addCriterion("ITEM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNotNull() {
            addCriterion("ITEM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andItemTypeEqualTo(String value) {
            addCriterion("ITEM_TYPE =", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotEqualTo(String value) {
            addCriterion("ITEM_TYPE <>", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThan(String value) {
            addCriterion("ITEM_TYPE >", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_TYPE >=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThan(String value) {
            addCriterion("ITEM_TYPE <", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThanOrEqualTo(String value) {
            addCriterion("ITEM_TYPE <=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLike(String value) {
            addCriterion("ITEM_TYPE like", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotLike(String value) {
            addCriterion("ITEM_TYPE not like", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeIn(List<String> values) {
            addCriterion("ITEM_TYPE in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotIn(List<String> values) {
            addCriterion("ITEM_TYPE not in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeBetween(String value1, String value2) {
            addCriterion("ITEM_TYPE between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotBetween(String value1, String value2) {
            addCriterion("ITEM_TYPE not between", value1, value2, "itemType");
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

        public Criteria andPackingQtyIsNull() {
            addCriterion("PACKING_QTY is null");
            return (Criteria) this;
        }

        public Criteria andPackingQtyIsNotNull() {
            addCriterion("PACKING_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andPackingQtyEqualTo(String value) {
            addCriterion("PACKING_QTY =", value, "packingQty");
            return (Criteria) this;
        }

        public Criteria andPackingQtyNotEqualTo(String value) {
            addCriterion("PACKING_QTY <>", value, "packingQty");
            return (Criteria) this;
        }

        public Criteria andPackingQtyGreaterThan(String value) {
            addCriterion("PACKING_QTY >", value, "packingQty");
            return (Criteria) this;
        }

        public Criteria andPackingQtyGreaterThanOrEqualTo(String value) {
            addCriterion("PACKING_QTY >=", value, "packingQty");
            return (Criteria) this;
        }

        public Criteria andPackingQtyLessThan(String value) {
            addCriterion("PACKING_QTY <", value, "packingQty");
            return (Criteria) this;
        }

        public Criteria andPackingQtyLessThanOrEqualTo(String value) {
            addCriterion("PACKING_QTY <=", value, "packingQty");
            return (Criteria) this;
        }

        public Criteria andPackingQtyLike(String value) {
            addCriterion("PACKING_QTY like", value, "packingQty");
            return (Criteria) this;
        }

        public Criteria andPackingQtyNotLike(String value) {
            addCriterion("PACKING_QTY not like", value, "packingQty");
            return (Criteria) this;
        }

        public Criteria andPackingQtyIn(List<String> values) {
            addCriterion("PACKING_QTY in", values, "packingQty");
            return (Criteria) this;
        }

        public Criteria andPackingQtyNotIn(List<String> values) {
            addCriterion("PACKING_QTY not in", values, "packingQty");
            return (Criteria) this;
        }

        public Criteria andPackingQtyBetween(String value1, String value2) {
            addCriterion("PACKING_QTY between", value1, value2, "packingQty");
            return (Criteria) this;
        }

        public Criteria andPackingQtyNotBetween(String value1, String value2) {
            addCriterion("PACKING_QTY not between", value1, value2, "packingQty");
            return (Criteria) this;
        }

        public Criteria andPriceQtyIsNull() {
            addCriterion("PRICE_QTY is null");
            return (Criteria) this;
        }

        public Criteria andPriceQtyIsNotNull() {
            addCriterion("PRICE_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andPriceQtyEqualTo(BigDecimal value) {
            addCriterion("PRICE_QTY =", value, "priceQty");
            return (Criteria) this;
        }

        public Criteria andPriceQtyNotEqualTo(BigDecimal value) {
            addCriterion("PRICE_QTY <>", value, "priceQty");
            return (Criteria) this;
        }

        public Criteria andPriceQtyGreaterThan(BigDecimal value) {
            addCriterion("PRICE_QTY >", value, "priceQty");
            return (Criteria) this;
        }

        public Criteria andPriceQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE_QTY >=", value, "priceQty");
            return (Criteria) this;
        }

        public Criteria andPriceQtyLessThan(BigDecimal value) {
            addCriterion("PRICE_QTY <", value, "priceQty");
            return (Criteria) this;
        }

        public Criteria andPriceQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE_QTY <=", value, "priceQty");
            return (Criteria) this;
        }

        public Criteria andPriceQtyIn(List<BigDecimal> values) {
            addCriterion("PRICE_QTY in", values, "priceQty");
            return (Criteria) this;
        }

        public Criteria andPriceQtyNotIn(List<BigDecimal> values) {
            addCriterion("PRICE_QTY not in", values, "priceQty");
            return (Criteria) this;
        }

        public Criteria andPriceQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE_QTY between", value1, value2, "priceQty");
            return (Criteria) this;
        }

        public Criteria andPriceQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE_QTY not between", value1, value2, "priceQty");
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

        public Criteria andPackingQty1IsNull() {
            addCriterion("PACKING_QTY1 is null");
            return (Criteria) this;
        }

        public Criteria andPackingQty1IsNotNull() {
            addCriterion("PACKING_QTY1 is not null");
            return (Criteria) this;
        }

        public Criteria andPackingQty1EqualTo(BigDecimal value) {
            addCriterion("PACKING_QTY1 =", value, "packingQty1");
            return (Criteria) this;
        }

        public Criteria andPackingQty1NotEqualTo(BigDecimal value) {
            addCriterion("PACKING_QTY1 <>", value, "packingQty1");
            return (Criteria) this;
        }

        public Criteria andPackingQty1GreaterThan(BigDecimal value) {
            addCriterion("PACKING_QTY1 >", value, "packingQty1");
            return (Criteria) this;
        }

        public Criteria andPackingQty1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKING_QTY1 >=", value, "packingQty1");
            return (Criteria) this;
        }

        public Criteria andPackingQty1LessThan(BigDecimal value) {
            addCriterion("PACKING_QTY1 <", value, "packingQty1");
            return (Criteria) this;
        }

        public Criteria andPackingQty1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKING_QTY1 <=", value, "packingQty1");
            return (Criteria) this;
        }

        public Criteria andPackingQty1In(List<BigDecimal> values) {
            addCriterion("PACKING_QTY1 in", values, "packingQty1");
            return (Criteria) this;
        }

        public Criteria andPackingQty1NotIn(List<BigDecimal> values) {
            addCriterion("PACKING_QTY1 not in", values, "packingQty1");
            return (Criteria) this;
        }

        public Criteria andPackingQty1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKING_QTY1 between", value1, value2, "packingQty1");
            return (Criteria) this;
        }

        public Criteria andPackingQty1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKING_QTY1 not between", value1, value2, "packingQty1");
            return (Criteria) this;
        }

        public Criteria andPackingQty2IsNull() {
            addCriterion("PACKING_QTY2 is null");
            return (Criteria) this;
        }

        public Criteria andPackingQty2IsNotNull() {
            addCriterion("PACKING_QTY2 is not null");
            return (Criteria) this;
        }

        public Criteria andPackingQty2EqualTo(BigDecimal value) {
            addCriterion("PACKING_QTY2 =", value, "packingQty2");
            return (Criteria) this;
        }

        public Criteria andPackingQty2NotEqualTo(BigDecimal value) {
            addCriterion("PACKING_QTY2 <>", value, "packingQty2");
            return (Criteria) this;
        }

        public Criteria andPackingQty2GreaterThan(BigDecimal value) {
            addCriterion("PACKING_QTY2 >", value, "packingQty2");
            return (Criteria) this;
        }

        public Criteria andPackingQty2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKING_QTY2 >=", value, "packingQty2");
            return (Criteria) this;
        }

        public Criteria andPackingQty2LessThan(BigDecimal value) {
            addCriterion("PACKING_QTY2 <", value, "packingQty2");
            return (Criteria) this;
        }

        public Criteria andPackingQty2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKING_QTY2 <=", value, "packingQty2");
            return (Criteria) this;
        }

        public Criteria andPackingQty2In(List<BigDecimal> values) {
            addCriterion("PACKING_QTY2 in", values, "packingQty2");
            return (Criteria) this;
        }

        public Criteria andPackingQty2NotIn(List<BigDecimal> values) {
            addCriterion("PACKING_QTY2 not in", values, "packingQty2");
            return (Criteria) this;
        }

        public Criteria andPackingQty2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKING_QTY2 between", value1, value2, "packingQty2");
            return (Criteria) this;
        }

        public Criteria andPackingQty2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKING_QTY2 not between", value1, value2, "packingQty2");
            return (Criteria) this;
        }

        public Criteria andPackingQty3IsNull() {
            addCriterion("PACKING_QTY3 is null");
            return (Criteria) this;
        }

        public Criteria andPackingQty3IsNotNull() {
            addCriterion("PACKING_QTY3 is not null");
            return (Criteria) this;
        }

        public Criteria andPackingQty3EqualTo(BigDecimal value) {
            addCriterion("PACKING_QTY3 =", value, "packingQty3");
            return (Criteria) this;
        }

        public Criteria andPackingQty3NotEqualTo(BigDecimal value) {
            addCriterion("PACKING_QTY3 <>", value, "packingQty3");
            return (Criteria) this;
        }

        public Criteria andPackingQty3GreaterThan(BigDecimal value) {
            addCriterion("PACKING_QTY3 >", value, "packingQty3");
            return (Criteria) this;
        }

        public Criteria andPackingQty3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKING_QTY3 >=", value, "packingQty3");
            return (Criteria) this;
        }

        public Criteria andPackingQty3LessThan(BigDecimal value) {
            addCriterion("PACKING_QTY3 <", value, "packingQty3");
            return (Criteria) this;
        }

        public Criteria andPackingQty3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKING_QTY3 <=", value, "packingQty3");
            return (Criteria) this;
        }

        public Criteria andPackingQty3In(List<BigDecimal> values) {
            addCriterion("PACKING_QTY3 in", values, "packingQty3");
            return (Criteria) this;
        }

        public Criteria andPackingQty3NotIn(List<BigDecimal> values) {
            addCriterion("PACKING_QTY3 not in", values, "packingQty3");
            return (Criteria) this;
        }

        public Criteria andPackingQty3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKING_QTY3 between", value1, value2, "packingQty3");
            return (Criteria) this;
        }

        public Criteria andPackingQty3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKING_QTY3 not between", value1, value2, "packingQty3");
            return (Criteria) this;
        }

        public Criteria andPackingQty4IsNull() {
            addCriterion("PACKING_QTY4 is null");
            return (Criteria) this;
        }

        public Criteria andPackingQty4IsNotNull() {
            addCriterion("PACKING_QTY4 is not null");
            return (Criteria) this;
        }

        public Criteria andPackingQty4EqualTo(BigDecimal value) {
            addCriterion("PACKING_QTY4 =", value, "packingQty4");
            return (Criteria) this;
        }

        public Criteria andPackingQty4NotEqualTo(BigDecimal value) {
            addCriterion("PACKING_QTY4 <>", value, "packingQty4");
            return (Criteria) this;
        }

        public Criteria andPackingQty4GreaterThan(BigDecimal value) {
            addCriterion("PACKING_QTY4 >", value, "packingQty4");
            return (Criteria) this;
        }

        public Criteria andPackingQty4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKING_QTY4 >=", value, "packingQty4");
            return (Criteria) this;
        }

        public Criteria andPackingQty4LessThan(BigDecimal value) {
            addCriterion("PACKING_QTY4 <", value, "packingQty4");
            return (Criteria) this;
        }

        public Criteria andPackingQty4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKING_QTY4 <=", value, "packingQty4");
            return (Criteria) this;
        }

        public Criteria andPackingQty4In(List<BigDecimal> values) {
            addCriterion("PACKING_QTY4 in", values, "packingQty4");
            return (Criteria) this;
        }

        public Criteria andPackingQty4NotIn(List<BigDecimal> values) {
            addCriterion("PACKING_QTY4 not in", values, "packingQty4");
            return (Criteria) this;
        }

        public Criteria andPackingQty4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKING_QTY4 between", value1, value2, "packingQty4");
            return (Criteria) this;
        }

        public Criteria andPackingQty4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKING_QTY4 not between", value1, value2, "packingQty4");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIsNull() {
            addCriterion("DISCOUNT_RATE is null");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIsNotNull() {
            addCriterion("DISCOUNT_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountRateEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_RATE =", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_RATE <>", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateGreaterThan(BigDecimal value) {
            addCriterion("DISCOUNT_RATE >", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_RATE >=", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateLessThan(BigDecimal value) {
            addCriterion("DISCOUNT_RATE <", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_RATE <=", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT_RATE in", values, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT_RATE not in", values, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT_RATE between", value1, value2, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT_RATE not between", value1, value2, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountAmtIsNull() {
            addCriterion("DISCOUNT_AMT is null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmtIsNotNull() {
            addCriterion("DISCOUNT_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmtEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_AMT =", value, "discountAmt");
            return (Criteria) this;
        }

        public Criteria andDiscountAmtNotEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_AMT <>", value, "discountAmt");
            return (Criteria) this;
        }

        public Criteria andDiscountAmtGreaterThan(BigDecimal value) {
            addCriterion("DISCOUNT_AMT >", value, "discountAmt");
            return (Criteria) this;
        }

        public Criteria andDiscountAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_AMT >=", value, "discountAmt");
            return (Criteria) this;
        }

        public Criteria andDiscountAmtLessThan(BigDecimal value) {
            addCriterion("DISCOUNT_AMT <", value, "discountAmt");
            return (Criteria) this;
        }

        public Criteria andDiscountAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_AMT <=", value, "discountAmt");
            return (Criteria) this;
        }

        public Criteria andDiscountAmtIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT_AMT in", values, "discountAmt");
            return (Criteria) this;
        }

        public Criteria andDiscountAmtNotIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT_AMT not in", values, "discountAmt");
            return (Criteria) this;
        }

        public Criteria andDiscountAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT_AMT between", value1, value2, "discountAmt");
            return (Criteria) this;
        }

        public Criteria andDiscountAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT_AMT not between", value1, value2, "discountAmt");
            return (Criteria) this;
        }

        public Criteria andDiscountedPriceIsNull() {
            addCriterion("DISCOUNTED_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andDiscountedPriceIsNotNull() {
            addCriterion("DISCOUNTED_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountedPriceEqualTo(BigDecimal value) {
            addCriterion("DISCOUNTED_PRICE =", value, "discountedPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountedPriceNotEqualTo(BigDecimal value) {
            addCriterion("DISCOUNTED_PRICE <>", value, "discountedPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountedPriceGreaterThan(BigDecimal value) {
            addCriterion("DISCOUNTED_PRICE >", value, "discountedPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountedPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNTED_PRICE >=", value, "discountedPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountedPriceLessThan(BigDecimal value) {
            addCriterion("DISCOUNTED_PRICE <", value, "discountedPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountedPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNTED_PRICE <=", value, "discountedPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountedPriceIn(List<BigDecimal> values) {
            addCriterion("DISCOUNTED_PRICE in", values, "discountedPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountedPriceNotIn(List<BigDecimal> values) {
            addCriterion("DISCOUNTED_PRICE not in", values, "discountedPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountedPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNTED_PRICE between", value1, value2, "discountedPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountedPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNTED_PRICE not between", value1, value2, "discountedPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceIsNull() {
            addCriterion("STANDARD_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andStandardPriceIsNotNull() {
            addCriterion("STANDARD_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andStandardPriceEqualTo(BigDecimal value) {
            addCriterion("STANDARD_PRICE =", value, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceNotEqualTo(BigDecimal value) {
            addCriterion("STANDARD_PRICE <>", value, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceGreaterThan(BigDecimal value) {
            addCriterion("STANDARD_PRICE >", value, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STANDARD_PRICE >=", value, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceLessThan(BigDecimal value) {
            addCriterion("STANDARD_PRICE <", value, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STANDARD_PRICE <=", value, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceIn(List<BigDecimal> values) {
            addCriterion("STANDARD_PRICE in", values, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceNotIn(List<BigDecimal> values) {
            addCriterion("STANDARD_PRICE not in", values, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STANDARD_PRICE between", value1, value2, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andStandardPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STANDARD_PRICE not between", value1, value2, "standardPrice");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNull() {
            addCriterion("TAX_RATE is null");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNotNull() {
            addCriterion("TAX_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRateEqualTo(BigDecimal value) {
            addCriterion("TAX_RATE =", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotEqualTo(BigDecimal value) {
            addCriterion("TAX_RATE <>", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThan(BigDecimal value) {
            addCriterion("TAX_RATE >", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_RATE >=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThan(BigDecimal value) {
            addCriterion("TAX_RATE <", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_RATE <=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateIn(List<BigDecimal> values) {
            addCriterion("TAX_RATE in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotIn(List<BigDecimal> values) {
            addCriterion("TAX_RATE not in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_RATE between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_RATE not between", value1, value2, "taxRate");
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

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAcceptedBusinessQtyIsNull() {
            addCriterion("ACCEPTED_BUSINESS_QTY is null");
            return (Criteria) this;
        }

        public Criteria andAcceptedBusinessQtyIsNotNull() {
            addCriterion("ACCEPTED_BUSINESS_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptedBusinessQtyEqualTo(BigDecimal value) {
            addCriterion("ACCEPTED_BUSINESS_QTY =", value, "acceptedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andAcceptedBusinessQtyNotEqualTo(BigDecimal value) {
            addCriterion("ACCEPTED_BUSINESS_QTY <>", value, "acceptedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andAcceptedBusinessQtyGreaterThan(BigDecimal value) {
            addCriterion("ACCEPTED_BUSINESS_QTY >", value, "acceptedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andAcceptedBusinessQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCEPTED_BUSINESS_QTY >=", value, "acceptedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andAcceptedBusinessQtyLessThan(BigDecimal value) {
            addCriterion("ACCEPTED_BUSINESS_QTY <", value, "acceptedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andAcceptedBusinessQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCEPTED_BUSINESS_QTY <=", value, "acceptedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andAcceptedBusinessQtyIn(List<BigDecimal> values) {
            addCriterion("ACCEPTED_BUSINESS_QTY in", values, "acceptedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andAcceptedBusinessQtyNotIn(List<BigDecimal> values) {
            addCriterion("ACCEPTED_BUSINESS_QTY not in", values, "acceptedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andAcceptedBusinessQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCEPTED_BUSINESS_QTY between", value1, value2, "acceptedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andAcceptedBusinessQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCEPTED_BUSINESS_QTY not between", value1, value2, "acceptedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andAcceptedInventoryQtyIsNull() {
            addCriterion("ACCEPTED_INVENTORY_QTY is null");
            return (Criteria) this;
        }

        public Criteria andAcceptedInventoryQtyIsNotNull() {
            addCriterion("ACCEPTED_INVENTORY_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptedInventoryQtyEqualTo(BigDecimal value) {
            addCriterion("ACCEPTED_INVENTORY_QTY =", value, "acceptedInventoryQty");
            return (Criteria) this;
        }

        public Criteria andAcceptedInventoryQtyNotEqualTo(BigDecimal value) {
            addCriterion("ACCEPTED_INVENTORY_QTY <>", value, "acceptedInventoryQty");
            return (Criteria) this;
        }

        public Criteria andAcceptedInventoryQtyGreaterThan(BigDecimal value) {
            addCriterion("ACCEPTED_INVENTORY_QTY >", value, "acceptedInventoryQty");
            return (Criteria) this;
        }

        public Criteria andAcceptedInventoryQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCEPTED_INVENTORY_QTY >=", value, "acceptedInventoryQty");
            return (Criteria) this;
        }

        public Criteria andAcceptedInventoryQtyLessThan(BigDecimal value) {
            addCriterion("ACCEPTED_INVENTORY_QTY <", value, "acceptedInventoryQty");
            return (Criteria) this;
        }

        public Criteria andAcceptedInventoryQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCEPTED_INVENTORY_QTY <=", value, "acceptedInventoryQty");
            return (Criteria) this;
        }

        public Criteria andAcceptedInventoryQtyIn(List<BigDecimal> values) {
            addCriterion("ACCEPTED_INVENTORY_QTY in", values, "acceptedInventoryQty");
            return (Criteria) this;
        }

        public Criteria andAcceptedInventoryQtyNotIn(List<BigDecimal> values) {
            addCriterion("ACCEPTED_INVENTORY_QTY not in", values, "acceptedInventoryQty");
            return (Criteria) this;
        }

        public Criteria andAcceptedInventoryQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCEPTED_INVENTORY_QTY between", value1, value2, "acceptedInventoryQty");
            return (Criteria) this;
        }

        public Criteria andAcceptedInventoryQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCEPTED_INVENTORY_QTY not between", value1, value2, "acceptedInventoryQty");
            return (Criteria) this;
        }

        public Criteria andReturnBusinessQtyIsNull() {
            addCriterion("RETURN_BUSINESS_QTY is null");
            return (Criteria) this;
        }

        public Criteria andReturnBusinessQtyIsNotNull() {
            addCriterion("RETURN_BUSINESS_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andReturnBusinessQtyEqualTo(BigDecimal value) {
            addCriterion("RETURN_BUSINESS_QTY =", value, "returnBusinessQty");
            return (Criteria) this;
        }

        public Criteria andReturnBusinessQtyNotEqualTo(BigDecimal value) {
            addCriterion("RETURN_BUSINESS_QTY <>", value, "returnBusinessQty");
            return (Criteria) this;
        }

        public Criteria andReturnBusinessQtyGreaterThan(BigDecimal value) {
            addCriterion("RETURN_BUSINESS_QTY >", value, "returnBusinessQty");
            return (Criteria) this;
        }

        public Criteria andReturnBusinessQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RETURN_BUSINESS_QTY >=", value, "returnBusinessQty");
            return (Criteria) this;
        }

        public Criteria andReturnBusinessQtyLessThan(BigDecimal value) {
            addCriterion("RETURN_BUSINESS_QTY <", value, "returnBusinessQty");
            return (Criteria) this;
        }

        public Criteria andReturnBusinessQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RETURN_BUSINESS_QTY <=", value, "returnBusinessQty");
            return (Criteria) this;
        }

        public Criteria andReturnBusinessQtyIn(List<BigDecimal> values) {
            addCriterion("RETURN_BUSINESS_QTY in", values, "returnBusinessQty");
            return (Criteria) this;
        }

        public Criteria andReturnBusinessQtyNotIn(List<BigDecimal> values) {
            addCriterion("RETURN_BUSINESS_QTY not in", values, "returnBusinessQty");
            return (Criteria) this;
        }

        public Criteria andReturnBusinessQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETURN_BUSINESS_QTY between", value1, value2, "returnBusinessQty");
            return (Criteria) this;
        }

        public Criteria andReturnBusinessQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETURN_BUSINESS_QTY not between", value1, value2, "returnBusinessQty");
            return (Criteria) this;
        }

        public Criteria andScrapBusinessQtyIsNull() {
            addCriterion("SCRAP_BUSINESS_QTY is null");
            return (Criteria) this;
        }

        public Criteria andScrapBusinessQtyIsNotNull() {
            addCriterion("SCRAP_BUSINESS_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andScrapBusinessQtyEqualTo(BigDecimal value) {
            addCriterion("SCRAP_BUSINESS_QTY =", value, "scrapBusinessQty");
            return (Criteria) this;
        }

        public Criteria andScrapBusinessQtyNotEqualTo(BigDecimal value) {
            addCriterion("SCRAP_BUSINESS_QTY <>", value, "scrapBusinessQty");
            return (Criteria) this;
        }

        public Criteria andScrapBusinessQtyGreaterThan(BigDecimal value) {
            addCriterion("SCRAP_BUSINESS_QTY >", value, "scrapBusinessQty");
            return (Criteria) this;
        }

        public Criteria andScrapBusinessQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCRAP_BUSINESS_QTY >=", value, "scrapBusinessQty");
            return (Criteria) this;
        }

        public Criteria andScrapBusinessQtyLessThan(BigDecimal value) {
            addCriterion("SCRAP_BUSINESS_QTY <", value, "scrapBusinessQty");
            return (Criteria) this;
        }

        public Criteria andScrapBusinessQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCRAP_BUSINESS_QTY <=", value, "scrapBusinessQty");
            return (Criteria) this;
        }

        public Criteria andScrapBusinessQtyIn(List<BigDecimal> values) {
            addCriterion("SCRAP_BUSINESS_QTY in", values, "scrapBusinessQty");
            return (Criteria) this;
        }

        public Criteria andScrapBusinessQtyNotIn(List<BigDecimal> values) {
            addCriterion("SCRAP_BUSINESS_QTY not in", values, "scrapBusinessQty");
            return (Criteria) this;
        }

        public Criteria andScrapBusinessQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCRAP_BUSINESS_QTY between", value1, value2, "scrapBusinessQty");
            return (Criteria) this;
        }

        public Criteria andScrapBusinessQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCRAP_BUSINESS_QTY not between", value1, value2, "scrapBusinessQty");
            return (Criteria) this;
        }

        public Criteria andOverdueIndicatorIsNull() {
            addCriterion("OVERDUE_INDICATOR is null");
            return (Criteria) this;
        }

        public Criteria andOverdueIndicatorIsNotNull() {
            addCriterion("OVERDUE_INDICATOR is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueIndicatorEqualTo(Boolean value) {
            addCriterion("OVERDUE_INDICATOR =", value, "overdueIndicator");
            return (Criteria) this;
        }

        public Criteria andOverdueIndicatorNotEqualTo(Boolean value) {
            addCriterion("OVERDUE_INDICATOR <>", value, "overdueIndicator");
            return (Criteria) this;
        }

        public Criteria andOverdueIndicatorGreaterThan(Boolean value) {
            addCriterion("OVERDUE_INDICATOR >", value, "overdueIndicator");
            return (Criteria) this;
        }

        public Criteria andOverdueIndicatorGreaterThanOrEqualTo(Boolean value) {
            addCriterion("OVERDUE_INDICATOR >=", value, "overdueIndicator");
            return (Criteria) this;
        }

        public Criteria andOverdueIndicatorLessThan(Boolean value) {
            addCriterion("OVERDUE_INDICATOR <", value, "overdueIndicator");
            return (Criteria) this;
        }

        public Criteria andOverdueIndicatorLessThanOrEqualTo(Boolean value) {
            addCriterion("OVERDUE_INDICATOR <=", value, "overdueIndicator");
            return (Criteria) this;
        }

        public Criteria andOverdueIndicatorIn(List<Boolean> values) {
            addCriterion("OVERDUE_INDICATOR in", values, "overdueIndicator");
            return (Criteria) this;
        }

        public Criteria andOverdueIndicatorNotIn(List<Boolean> values) {
            addCriterion("OVERDUE_INDICATOR not in", values, "overdueIndicator");
            return (Criteria) this;
        }

        public Criteria andOverdueIndicatorBetween(Boolean value1, Boolean value2) {
            addCriterion("OVERDUE_INDICATOR between", value1, value2, "overdueIndicator");
            return (Criteria) this;
        }

        public Criteria andOverdueIndicatorNotBetween(Boolean value1, Boolean value2) {
            addCriterion("OVERDUE_INDICATOR not between", value1, value2, "overdueIndicator");
            return (Criteria) this;
        }

        public Criteria andInspectionStatusIsNull() {
            addCriterion("INSPECTION_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andInspectionStatusIsNotNull() {
            addCriterion("INSPECTION_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionStatusEqualTo(String value) {
            addCriterion("INSPECTION_STATUS =", value, "inspectionStatus");
            return (Criteria) this;
        }

        public Criteria andInspectionStatusNotEqualTo(String value) {
            addCriterion("INSPECTION_STATUS <>", value, "inspectionStatus");
            return (Criteria) this;
        }

        public Criteria andInspectionStatusGreaterThan(String value) {
            addCriterion("INSPECTION_STATUS >", value, "inspectionStatus");
            return (Criteria) this;
        }

        public Criteria andInspectionStatusGreaterThanOrEqualTo(String value) {
            addCriterion("INSPECTION_STATUS >=", value, "inspectionStatus");
            return (Criteria) this;
        }

        public Criteria andInspectionStatusLessThan(String value) {
            addCriterion("INSPECTION_STATUS <", value, "inspectionStatus");
            return (Criteria) this;
        }

        public Criteria andInspectionStatusLessThanOrEqualTo(String value) {
            addCriterion("INSPECTION_STATUS <=", value, "inspectionStatus");
            return (Criteria) this;
        }

        public Criteria andInspectionStatusLike(String value) {
            addCriterion("INSPECTION_STATUS like", value, "inspectionStatus");
            return (Criteria) this;
        }

        public Criteria andInspectionStatusNotLike(String value) {
            addCriterion("INSPECTION_STATUS not like", value, "inspectionStatus");
            return (Criteria) this;
        }

        public Criteria andInspectionStatusIn(List<String> values) {
            addCriterion("INSPECTION_STATUS in", values, "inspectionStatus");
            return (Criteria) this;
        }

        public Criteria andInspectionStatusNotIn(List<String> values) {
            addCriterion("INSPECTION_STATUS not in", values, "inspectionStatus");
            return (Criteria) this;
        }

        public Criteria andInspectionStatusBetween(String value1, String value2) {
            addCriterion("INSPECTION_STATUS between", value1, value2, "inspectionStatus");
            return (Criteria) this;
        }

        public Criteria andInspectionStatusNotBetween(String value1, String value2) {
            addCriterion("INSPECTION_STATUS not between", value1, value2, "inspectionStatus");
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

        public Criteria andReturnedBusinessQtyIsNull() {
            addCriterion("RETURNED_BUSINESS_QTY is null");
            return (Criteria) this;
        }

        public Criteria andReturnedBusinessQtyIsNotNull() {
            addCriterion("RETURNED_BUSINESS_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andReturnedBusinessQtyEqualTo(BigDecimal value) {
            addCriterion("RETURNED_BUSINESS_QTY =", value, "returnedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andReturnedBusinessQtyNotEqualTo(BigDecimal value) {
            addCriterion("RETURNED_BUSINESS_QTY <>", value, "returnedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andReturnedBusinessQtyGreaterThan(BigDecimal value) {
            addCriterion("RETURNED_BUSINESS_QTY >", value, "returnedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andReturnedBusinessQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RETURNED_BUSINESS_QTY >=", value, "returnedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andReturnedBusinessQtyLessThan(BigDecimal value) {
            addCriterion("RETURNED_BUSINESS_QTY <", value, "returnedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andReturnedBusinessQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RETURNED_BUSINESS_QTY <=", value, "returnedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andReturnedBusinessQtyIn(List<BigDecimal> values) {
            addCriterion("RETURNED_BUSINESS_QTY in", values, "returnedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andReturnedBusinessQtyNotIn(List<BigDecimal> values) {
            addCriterion("RETURNED_BUSINESS_QTY not in", values, "returnedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andReturnedBusinessQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETURNED_BUSINESS_QTY between", value1, value2, "returnedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andReturnedBusinessQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETURNED_BUSINESS_QTY not between", value1, value2, "returnedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andReceiptedBusinessQtyIsNull() {
            addCriterion("RECEIPTED_BUSINESS_QTY is null");
            return (Criteria) this;
        }

        public Criteria andReceiptedBusinessQtyIsNotNull() {
            addCriterion("RECEIPTED_BUSINESS_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptedBusinessQtyEqualTo(BigDecimal value) {
            addCriterion("RECEIPTED_BUSINESS_QTY =", value, "receiptedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andReceiptedBusinessQtyNotEqualTo(BigDecimal value) {
            addCriterion("RECEIPTED_BUSINESS_QTY <>", value, "receiptedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andReceiptedBusinessQtyGreaterThan(BigDecimal value) {
            addCriterion("RECEIPTED_BUSINESS_QTY >", value, "receiptedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andReceiptedBusinessQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIPTED_BUSINESS_QTY >=", value, "receiptedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andReceiptedBusinessQtyLessThan(BigDecimal value) {
            addCriterion("RECEIPTED_BUSINESS_QTY <", value, "receiptedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andReceiptedBusinessQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIPTED_BUSINESS_QTY <=", value, "receiptedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andReceiptedBusinessQtyIn(List<BigDecimal> values) {
            addCriterion("RECEIPTED_BUSINESS_QTY in", values, "receiptedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andReceiptedBusinessQtyNotIn(List<BigDecimal> values) {
            addCriterion("RECEIPTED_BUSINESS_QTY not in", values, "receiptedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andReceiptedBusinessQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIPTED_BUSINESS_QTY between", value1, value2, "receiptedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andReceiptedBusinessQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIPTED_BUSINESS_QTY not between", value1, value2, "receiptedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andReceiptCloseIsNull() {
            addCriterion("RECEIPT_CLOSE is null");
            return (Criteria) this;
        }

        public Criteria andReceiptCloseIsNotNull() {
            addCriterion("RECEIPT_CLOSE is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptCloseEqualTo(String value) {
            addCriterion("RECEIPT_CLOSE =", value, "receiptClose");
            return (Criteria) this;
        }

        public Criteria andReceiptCloseNotEqualTo(String value) {
            addCriterion("RECEIPT_CLOSE <>", value, "receiptClose");
            return (Criteria) this;
        }

        public Criteria andReceiptCloseGreaterThan(String value) {
            addCriterion("RECEIPT_CLOSE >", value, "receiptClose");
            return (Criteria) this;
        }

        public Criteria andReceiptCloseGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIPT_CLOSE >=", value, "receiptClose");
            return (Criteria) this;
        }

        public Criteria andReceiptCloseLessThan(String value) {
            addCriterion("RECEIPT_CLOSE <", value, "receiptClose");
            return (Criteria) this;
        }

        public Criteria andReceiptCloseLessThanOrEqualTo(String value) {
            addCriterion("RECEIPT_CLOSE <=", value, "receiptClose");
            return (Criteria) this;
        }

        public Criteria andReceiptCloseLike(String value) {
            addCriterion("RECEIPT_CLOSE like", value, "receiptClose");
            return (Criteria) this;
        }

        public Criteria andReceiptCloseNotLike(String value) {
            addCriterion("RECEIPT_CLOSE not like", value, "receiptClose");
            return (Criteria) this;
        }

        public Criteria andReceiptCloseIn(List<String> values) {
            addCriterion("RECEIPT_CLOSE in", values, "receiptClose");
            return (Criteria) this;
        }

        public Criteria andReceiptCloseNotIn(List<String> values) {
            addCriterion("RECEIPT_CLOSE not in", values, "receiptClose");
            return (Criteria) this;
        }

        public Criteria andReceiptCloseBetween(String value1, String value2) {
            addCriterion("RECEIPT_CLOSE between", value1, value2, "receiptClose");
            return (Criteria) this;
        }

        public Criteria andReceiptCloseNotBetween(String value1, String value2) {
            addCriterion("RECEIPT_CLOSE not between", value1, value2, "receiptClose");
            return (Criteria) this;
        }

        public Criteria andScrapedBusinessQtyIsNull() {
            addCriterion("SCRAPED_BUSINESS_QTY is null");
            return (Criteria) this;
        }

        public Criteria andScrapedBusinessQtyIsNotNull() {
            addCriterion("SCRAPED_BUSINESS_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andScrapedBusinessQtyEqualTo(BigDecimal value) {
            addCriterion("SCRAPED_BUSINESS_QTY =", value, "scrapedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andScrapedBusinessQtyNotEqualTo(BigDecimal value) {
            addCriterion("SCRAPED_BUSINESS_QTY <>", value, "scrapedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andScrapedBusinessQtyGreaterThan(BigDecimal value) {
            addCriterion("SCRAPED_BUSINESS_QTY >", value, "scrapedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andScrapedBusinessQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCRAPED_BUSINESS_QTY >=", value, "scrapedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andScrapedBusinessQtyLessThan(BigDecimal value) {
            addCriterion("SCRAPED_BUSINESS_QTY <", value, "scrapedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andScrapedBusinessQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCRAPED_BUSINESS_QTY <=", value, "scrapedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andScrapedBusinessQtyIn(List<BigDecimal> values) {
            addCriterion("SCRAPED_BUSINESS_QTY in", values, "scrapedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andScrapedBusinessQtyNotIn(List<BigDecimal> values) {
            addCriterion("SCRAPED_BUSINESS_QTY not in", values, "scrapedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andScrapedBusinessQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCRAPED_BUSINESS_QTY between", value1, value2, "scrapedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andScrapedBusinessQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCRAPED_BUSINESS_QTY not between", value1, value2, "scrapedBusinessQty");
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

        public Criteria andPurchaseTypeIsNull() {
            addCriterion("PURCHASE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIsNotNull() {
            addCriterion("PURCHASE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeEqualTo(String value) {
            addCriterion("PURCHASE_TYPE =", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotEqualTo(String value) {
            addCriterion("PURCHASE_TYPE <>", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeGreaterThan(String value) {
            addCriterion("PURCHASE_TYPE >", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_TYPE >=", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeLessThan(String value) {
            addCriterion("PURCHASE_TYPE <", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_TYPE <=", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeLike(String value) {
            addCriterion("PURCHASE_TYPE like", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotLike(String value) {
            addCriterion("PURCHASE_TYPE not like", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIn(List<String> values) {
            addCriterion("PURCHASE_TYPE in", values, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotIn(List<String> values) {
            addCriterion("PURCHASE_TYPE not in", values, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeBetween(String value1, String value2) {
            addCriterion("PURCHASE_TYPE between", value1, value2, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_TYPE not between", value1, value2, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andInspectedQtyIsNull() {
            addCriterion("INSPECTED_QTY is null");
            return (Criteria) this;
        }

        public Criteria andInspectedQtyIsNotNull() {
            addCriterion("INSPECTED_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andInspectedQtyEqualTo(BigDecimal value) {
            addCriterion("INSPECTED_QTY =", value, "inspectedQty");
            return (Criteria) this;
        }

        public Criteria andInspectedQtyNotEqualTo(BigDecimal value) {
            addCriterion("INSPECTED_QTY <>", value, "inspectedQty");
            return (Criteria) this;
        }

        public Criteria andInspectedQtyGreaterThan(BigDecimal value) {
            addCriterion("INSPECTED_QTY >", value, "inspectedQty");
            return (Criteria) this;
        }

        public Criteria andInspectedQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INSPECTED_QTY >=", value, "inspectedQty");
            return (Criteria) this;
        }

        public Criteria andInspectedQtyLessThan(BigDecimal value) {
            addCriterion("INSPECTED_QTY <", value, "inspectedQty");
            return (Criteria) this;
        }

        public Criteria andInspectedQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INSPECTED_QTY <=", value, "inspectedQty");
            return (Criteria) this;
        }

        public Criteria andInspectedQtyIn(List<BigDecimal> values) {
            addCriterion("INSPECTED_QTY in", values, "inspectedQty");
            return (Criteria) this;
        }

        public Criteria andInspectedQtyNotIn(List<BigDecimal> values) {
            addCriterion("INSPECTED_QTY not in", values, "inspectedQty");
            return (Criteria) this;
        }

        public Criteria andInspectedQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSPECTED_QTY between", value1, value2, "inspectedQty");
            return (Criteria) this;
        }

        public Criteria andInspectedQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSPECTED_QTY not between", value1, value2, "inspectedQty");
            return (Criteria) this;
        }

        public Criteria andSpReceiptBusinessQtyIsNull() {
            addCriterion("SP_RECEIPT_BUSINESS_QTY is null");
            return (Criteria) this;
        }

        public Criteria andSpReceiptBusinessQtyIsNotNull() {
            addCriterion("SP_RECEIPT_BUSINESS_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andSpReceiptBusinessQtyEqualTo(BigDecimal value) {
            addCriterion("SP_RECEIPT_BUSINESS_QTY =", value, "spReceiptBusinessQty");
            return (Criteria) this;
        }

        public Criteria andSpReceiptBusinessQtyNotEqualTo(BigDecimal value) {
            addCriterion("SP_RECEIPT_BUSINESS_QTY <>", value, "spReceiptBusinessQty");
            return (Criteria) this;
        }

        public Criteria andSpReceiptBusinessQtyGreaterThan(BigDecimal value) {
            addCriterion("SP_RECEIPT_BUSINESS_QTY >", value, "spReceiptBusinessQty");
            return (Criteria) this;
        }

        public Criteria andSpReceiptBusinessQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SP_RECEIPT_BUSINESS_QTY >=", value, "spReceiptBusinessQty");
            return (Criteria) this;
        }

        public Criteria andSpReceiptBusinessQtyLessThan(BigDecimal value) {
            addCriterion("SP_RECEIPT_BUSINESS_QTY <", value, "spReceiptBusinessQty");
            return (Criteria) this;
        }

        public Criteria andSpReceiptBusinessQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SP_RECEIPT_BUSINESS_QTY <=", value, "spReceiptBusinessQty");
            return (Criteria) this;
        }

        public Criteria andSpReceiptBusinessQtyIn(List<BigDecimal> values) {
            addCriterion("SP_RECEIPT_BUSINESS_QTY in", values, "spReceiptBusinessQty");
            return (Criteria) this;
        }

        public Criteria andSpReceiptBusinessQtyNotIn(List<BigDecimal> values) {
            addCriterion("SP_RECEIPT_BUSINESS_QTY not in", values, "spReceiptBusinessQty");
            return (Criteria) this;
        }

        public Criteria andSpReceiptBusinessQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SP_RECEIPT_BUSINESS_QTY between", value1, value2, "spReceiptBusinessQty");
            return (Criteria) this;
        }

        public Criteria andSpReceiptBusinessQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SP_RECEIPT_BUSINESS_QTY not between", value1, value2, "spReceiptBusinessQty");
            return (Criteria) this;
        }

        public Criteria andSpReceiptInventoryQtyIsNull() {
            addCriterion("SP_RECEIPT_INVENTORY_QTY is null");
            return (Criteria) this;
        }

        public Criteria andSpReceiptInventoryQtyIsNotNull() {
            addCriterion("SP_RECEIPT_INVENTORY_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andSpReceiptInventoryQtyEqualTo(BigDecimal value) {
            addCriterion("SP_RECEIPT_INVENTORY_QTY =", value, "spReceiptInventoryQty");
            return (Criteria) this;
        }

        public Criteria andSpReceiptInventoryQtyNotEqualTo(BigDecimal value) {
            addCriterion("SP_RECEIPT_INVENTORY_QTY <>", value, "spReceiptInventoryQty");
            return (Criteria) this;
        }

        public Criteria andSpReceiptInventoryQtyGreaterThan(BigDecimal value) {
            addCriterion("SP_RECEIPT_INVENTORY_QTY >", value, "spReceiptInventoryQty");
            return (Criteria) this;
        }

        public Criteria andSpReceiptInventoryQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SP_RECEIPT_INVENTORY_QTY >=", value, "spReceiptInventoryQty");
            return (Criteria) this;
        }

        public Criteria andSpReceiptInventoryQtyLessThan(BigDecimal value) {
            addCriterion("SP_RECEIPT_INVENTORY_QTY <", value, "spReceiptInventoryQty");
            return (Criteria) this;
        }

        public Criteria andSpReceiptInventoryQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SP_RECEIPT_INVENTORY_QTY <=", value, "spReceiptInventoryQty");
            return (Criteria) this;
        }

        public Criteria andSpReceiptInventoryQtyIn(List<BigDecimal> values) {
            addCriterion("SP_RECEIPT_INVENTORY_QTY in", values, "spReceiptInventoryQty");
            return (Criteria) this;
        }

        public Criteria andSpReceiptInventoryQtyNotIn(List<BigDecimal> values) {
            addCriterion("SP_RECEIPT_INVENTORY_QTY not in", values, "spReceiptInventoryQty");
            return (Criteria) this;
        }

        public Criteria andSpReceiptInventoryQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SP_RECEIPT_INVENTORY_QTY between", value1, value2, "spReceiptInventoryQty");
            return (Criteria) this;
        }

        public Criteria andSpReceiptInventoryQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SP_RECEIPT_INVENTORY_QTY not between", value1, value2, "spReceiptInventoryQty");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNull() {
            addCriterion("MANUFACTURER is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNotNull() {
            addCriterion("MANUFACTURER is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerEqualTo(String value) {
            addCriterion("MANUFACTURER =", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotEqualTo(String value) {
            addCriterion("MANUFACTURER <>", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThan(String value) {
            addCriterion("MANUFACTURER >", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("MANUFACTURER >=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThan(String value) {
            addCriterion("MANUFACTURER <", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThanOrEqualTo(String value) {
            addCriterion("MANUFACTURER <=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLike(String value) {
            addCriterion("MANUFACTURER like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotLike(String value) {
            addCriterion("MANUFACTURER not like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerIn(List<String> values) {
            addCriterion("MANUFACTURER in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotIn(List<String> values) {
            addCriterion("MANUFACTURER not in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerBetween(String value1, String value2) {
            addCriterion("MANUFACTURER between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotBetween(String value1, String value2) {
            addCriterion("MANUFACTURER not between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andPaymentPendedIsNull() {
            addCriterion("PAYMENT_PENDED is null");
            return (Criteria) this;
        }

        public Criteria andPaymentPendedIsNotNull() {
            addCriterion("PAYMENT_PENDED is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentPendedEqualTo(Boolean value) {
            addCriterion("PAYMENT_PENDED =", value, "paymentPended");
            return (Criteria) this;
        }

        public Criteria andPaymentPendedNotEqualTo(Boolean value) {
            addCriterion("PAYMENT_PENDED <>", value, "paymentPended");
            return (Criteria) this;
        }

        public Criteria andPaymentPendedGreaterThan(Boolean value) {
            addCriterion("PAYMENT_PENDED >", value, "paymentPended");
            return (Criteria) this;
        }

        public Criteria andPaymentPendedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("PAYMENT_PENDED >=", value, "paymentPended");
            return (Criteria) this;
        }

        public Criteria andPaymentPendedLessThan(Boolean value) {
            addCriterion("PAYMENT_PENDED <", value, "paymentPended");
            return (Criteria) this;
        }

        public Criteria andPaymentPendedLessThanOrEqualTo(Boolean value) {
            addCriterion("PAYMENT_PENDED <=", value, "paymentPended");
            return (Criteria) this;
        }

        public Criteria andPaymentPendedIn(List<Boolean> values) {
            addCriterion("PAYMENT_PENDED in", values, "paymentPended");
            return (Criteria) this;
        }

        public Criteria andPaymentPendedNotIn(List<Boolean> values) {
            addCriterion("PAYMENT_PENDED not in", values, "paymentPended");
            return (Criteria) this;
        }

        public Criteria andPaymentPendedBetween(Boolean value1, Boolean value2) {
            addCriterion("PAYMENT_PENDED between", value1, value2, "paymentPended");
            return (Criteria) this;
        }

        public Criteria andPaymentPendedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("PAYMENT_PENDED not between", value1, value2, "paymentPended");
            return (Criteria) this;
        }

        public Criteria andQualifiedBusinessQtyIsNull() {
            addCriterion("QUALIFIED_BUSINESS_QTY is null");
            return (Criteria) this;
        }

        public Criteria andQualifiedBusinessQtyIsNotNull() {
            addCriterion("QUALIFIED_BUSINESS_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andQualifiedBusinessQtyEqualTo(BigDecimal value) {
            addCriterion("QUALIFIED_BUSINESS_QTY =", value, "qualifiedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andQualifiedBusinessQtyNotEqualTo(BigDecimal value) {
            addCriterion("QUALIFIED_BUSINESS_QTY <>", value, "qualifiedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andQualifiedBusinessQtyGreaterThan(BigDecimal value) {
            addCriterion("QUALIFIED_BUSINESS_QTY >", value, "qualifiedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andQualifiedBusinessQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QUALIFIED_BUSINESS_QTY >=", value, "qualifiedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andQualifiedBusinessQtyLessThan(BigDecimal value) {
            addCriterion("QUALIFIED_BUSINESS_QTY <", value, "qualifiedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andQualifiedBusinessQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QUALIFIED_BUSINESS_QTY <=", value, "qualifiedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andQualifiedBusinessQtyIn(List<BigDecimal> values) {
            addCriterion("QUALIFIED_BUSINESS_QTY in", values, "qualifiedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andQualifiedBusinessQtyNotIn(List<BigDecimal> values) {
            addCriterion("QUALIFIED_BUSINESS_QTY not in", values, "qualifiedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andQualifiedBusinessQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUALIFIED_BUSINESS_QTY between", value1, value2, "qualifiedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andQualifiedBusinessQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUALIFIED_BUSINESS_QTY not between", value1, value2, "qualifiedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedBusinessQtyIsNull() {
            addCriterion("UNQUALIFIED_BUSINESS_QTY is null");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedBusinessQtyIsNotNull() {
            addCriterion("UNQUALIFIED_BUSINESS_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedBusinessQtyEqualTo(BigDecimal value) {
            addCriterion("UNQUALIFIED_BUSINESS_QTY =", value, "unqualifiedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedBusinessQtyNotEqualTo(BigDecimal value) {
            addCriterion("UNQUALIFIED_BUSINESS_QTY <>", value, "unqualifiedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedBusinessQtyGreaterThan(BigDecimal value) {
            addCriterion("UNQUALIFIED_BUSINESS_QTY >", value, "unqualifiedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedBusinessQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UNQUALIFIED_BUSINESS_QTY >=", value, "unqualifiedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedBusinessQtyLessThan(BigDecimal value) {
            addCriterion("UNQUALIFIED_BUSINESS_QTY <", value, "unqualifiedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedBusinessQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UNQUALIFIED_BUSINESS_QTY <=", value, "unqualifiedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedBusinessQtyIn(List<BigDecimal> values) {
            addCriterion("UNQUALIFIED_BUSINESS_QTY in", values, "unqualifiedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedBusinessQtyNotIn(List<BigDecimal> values) {
            addCriterion("UNQUALIFIED_BUSINESS_QTY not in", values, "unqualifiedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedBusinessQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNQUALIFIED_BUSINESS_QTY between", value1, value2, "unqualifiedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andUnqualifiedBusinessQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNQUALIFIED_BUSINESS_QTY not between", value1, value2, "unqualifiedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andInDestroyedBusinessQtyIsNull() {
            addCriterion("IN_DESTROYED_BUSINESS_QTY is null");
            return (Criteria) this;
        }

        public Criteria andInDestroyedBusinessQtyIsNotNull() {
            addCriterion("IN_DESTROYED_BUSINESS_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andInDestroyedBusinessQtyEqualTo(BigDecimal value) {
            addCriterion("IN_DESTROYED_BUSINESS_QTY =", value, "inDestroyedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andInDestroyedBusinessQtyNotEqualTo(BigDecimal value) {
            addCriterion("IN_DESTROYED_BUSINESS_QTY <>", value, "inDestroyedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andInDestroyedBusinessQtyGreaterThan(BigDecimal value) {
            addCriterion("IN_DESTROYED_BUSINESS_QTY >", value, "inDestroyedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andInDestroyedBusinessQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IN_DESTROYED_BUSINESS_QTY >=", value, "inDestroyedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andInDestroyedBusinessQtyLessThan(BigDecimal value) {
            addCriterion("IN_DESTROYED_BUSINESS_QTY <", value, "inDestroyedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andInDestroyedBusinessQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IN_DESTROYED_BUSINESS_QTY <=", value, "inDestroyedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andInDestroyedBusinessQtyIn(List<BigDecimal> values) {
            addCriterion("IN_DESTROYED_BUSINESS_QTY in", values, "inDestroyedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andInDestroyedBusinessQtyNotIn(List<BigDecimal> values) {
            addCriterion("IN_DESTROYED_BUSINESS_QTY not in", values, "inDestroyedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andInDestroyedBusinessQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IN_DESTROYED_BUSINESS_QTY between", value1, value2, "inDestroyedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andInDestroyedBusinessQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IN_DESTROYED_BUSINESS_QTY not between", value1, value2, "inDestroyedBusinessQty");
            return (Criteria) this;
        }

        public Criteria andPriceUnitIdIsNull() {
            addCriterion("PRICE_UNIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPriceUnitIdIsNotNull() {
            addCriterion("PRICE_UNIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPriceUnitIdEqualTo(String value) {
            addCriterion("PRICE_UNIT_ID =", value, "priceUnitId");
            return (Criteria) this;
        }

        public Criteria andPriceUnitIdNotEqualTo(String value) {
            addCriterion("PRICE_UNIT_ID <>", value, "priceUnitId");
            return (Criteria) this;
        }

        public Criteria andPriceUnitIdGreaterThan(String value) {
            addCriterion("PRICE_UNIT_ID >", value, "priceUnitId");
            return (Criteria) this;
        }

        public Criteria andPriceUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRICE_UNIT_ID >=", value, "priceUnitId");
            return (Criteria) this;
        }

        public Criteria andPriceUnitIdLessThan(String value) {
            addCriterion("PRICE_UNIT_ID <", value, "priceUnitId");
            return (Criteria) this;
        }

        public Criteria andPriceUnitIdLessThanOrEqualTo(String value) {
            addCriterion("PRICE_UNIT_ID <=", value, "priceUnitId");
            return (Criteria) this;
        }

        public Criteria andPriceUnitIdLike(String value) {
            addCriterion("PRICE_UNIT_ID like", value, "priceUnitId");
            return (Criteria) this;
        }

        public Criteria andPriceUnitIdNotLike(String value) {
            addCriterion("PRICE_UNIT_ID not like", value, "priceUnitId");
            return (Criteria) this;
        }

        public Criteria andPriceUnitIdIn(List<String> values) {
            addCriterion("PRICE_UNIT_ID in", values, "priceUnitId");
            return (Criteria) this;
        }

        public Criteria andPriceUnitIdNotIn(List<String> values) {
            addCriterion("PRICE_UNIT_ID not in", values, "priceUnitId");
            return (Criteria) this;
        }

        public Criteria andPriceUnitIdBetween(String value1, String value2) {
            addCriterion("PRICE_UNIT_ID between", value1, value2, "priceUnitId");
            return (Criteria) this;
        }

        public Criteria andPriceUnitIdNotBetween(String value1, String value2) {
            addCriterion("PRICE_UNIT_ID not between", value1, value2, "priceUnitId");
            return (Criteria) this;
        }

        public Criteria andBusinessUnitIdIsNull() {
            addCriterion("BUSINESS_UNIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andBusinessUnitIdIsNotNull() {
            addCriterion("BUSINESS_UNIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessUnitIdEqualTo(String value) {
            addCriterion("BUSINESS_UNIT_ID =", value, "businessUnitId");
            return (Criteria) this;
        }

        public Criteria andBusinessUnitIdNotEqualTo(String value) {
            addCriterion("BUSINESS_UNIT_ID <>", value, "businessUnitId");
            return (Criteria) this;
        }

        public Criteria andBusinessUnitIdGreaterThan(String value) {
            addCriterion("BUSINESS_UNIT_ID >", value, "businessUnitId");
            return (Criteria) this;
        }

        public Criteria andBusinessUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_UNIT_ID >=", value, "businessUnitId");
            return (Criteria) this;
        }

        public Criteria andBusinessUnitIdLessThan(String value) {
            addCriterion("BUSINESS_UNIT_ID <", value, "businessUnitId");
            return (Criteria) this;
        }

        public Criteria andBusinessUnitIdLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_UNIT_ID <=", value, "businessUnitId");
            return (Criteria) this;
        }

        public Criteria andBusinessUnitIdLike(String value) {
            addCriterion("BUSINESS_UNIT_ID like", value, "businessUnitId");
            return (Criteria) this;
        }

        public Criteria andBusinessUnitIdNotLike(String value) {
            addCriterion("BUSINESS_UNIT_ID not like", value, "businessUnitId");
            return (Criteria) this;
        }

        public Criteria andBusinessUnitIdIn(List<String> values) {
            addCriterion("BUSINESS_UNIT_ID in", values, "businessUnitId");
            return (Criteria) this;
        }

        public Criteria andBusinessUnitIdNotIn(List<String> values) {
            addCriterion("BUSINESS_UNIT_ID not in", values, "businessUnitId");
            return (Criteria) this;
        }

        public Criteria andBusinessUnitIdBetween(String value1, String value2) {
            addCriterion("BUSINESS_UNIT_ID between", value1, value2, "businessUnitId");
            return (Criteria) this;
        }

        public Criteria andBusinessUnitIdNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_UNIT_ID not between", value1, value2, "businessUnitId");
            return (Criteria) this;
        }

        public Criteria andBusinessQtyIsNull() {
            addCriterion("BUSINESS_QTY is null");
            return (Criteria) this;
        }

        public Criteria andBusinessQtyIsNotNull() {
            addCriterion("BUSINESS_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessQtyEqualTo(BigDecimal value) {
            addCriterion("BUSINESS_QTY =", value, "businessQty");
            return (Criteria) this;
        }

        public Criteria andBusinessQtyNotEqualTo(BigDecimal value) {
            addCriterion("BUSINESS_QTY <>", value, "businessQty");
            return (Criteria) this;
        }

        public Criteria andBusinessQtyGreaterThan(BigDecimal value) {
            addCriterion("BUSINESS_QTY >", value, "businessQty");
            return (Criteria) this;
        }

        public Criteria andBusinessQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUSINESS_QTY >=", value, "businessQty");
            return (Criteria) this;
        }

        public Criteria andBusinessQtyLessThan(BigDecimal value) {
            addCriterion("BUSINESS_QTY <", value, "businessQty");
            return (Criteria) this;
        }

        public Criteria andBusinessQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUSINESS_QTY <=", value, "businessQty");
            return (Criteria) this;
        }

        public Criteria andBusinessQtyIn(List<BigDecimal> values) {
            addCriterion("BUSINESS_QTY in", values, "businessQty");
            return (Criteria) this;
        }

        public Criteria andBusinessQtyNotIn(List<BigDecimal> values) {
            addCriterion("BUSINESS_QTY not in", values, "businessQty");
            return (Criteria) this;
        }

        public Criteria andBusinessQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUSINESS_QTY between", value1, value2, "businessQty");
            return (Criteria) this;
        }

        public Criteria andBusinessQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUSINESS_QTY not between", value1, value2, "businessQty");
            return (Criteria) this;
        }

        public Criteria andPackingModeIdIsNull() {
            addCriterion("PACKING_MODE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPackingModeIdIsNotNull() {
            addCriterion("PACKING_MODE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPackingModeIdEqualTo(String value) {
            addCriterion("PACKING_MODE_ID =", value, "packingModeId");
            return (Criteria) this;
        }

        public Criteria andPackingModeIdNotEqualTo(String value) {
            addCriterion("PACKING_MODE_ID <>", value, "packingModeId");
            return (Criteria) this;
        }

        public Criteria andPackingModeIdGreaterThan(String value) {
            addCriterion("PACKING_MODE_ID >", value, "packingModeId");
            return (Criteria) this;
        }

        public Criteria andPackingModeIdGreaterThanOrEqualTo(String value) {
            addCriterion("PACKING_MODE_ID >=", value, "packingModeId");
            return (Criteria) this;
        }

        public Criteria andPackingModeIdLessThan(String value) {
            addCriterion("PACKING_MODE_ID <", value, "packingModeId");
            return (Criteria) this;
        }

        public Criteria andPackingModeIdLessThanOrEqualTo(String value) {
            addCriterion("PACKING_MODE_ID <=", value, "packingModeId");
            return (Criteria) this;
        }

        public Criteria andPackingModeIdLike(String value) {
            addCriterion("PACKING_MODE_ID like", value, "packingModeId");
            return (Criteria) this;
        }

        public Criteria andPackingModeIdNotLike(String value) {
            addCriterion("PACKING_MODE_ID not like", value, "packingModeId");
            return (Criteria) this;
        }

        public Criteria andPackingModeIdIn(List<String> values) {
            addCriterion("PACKING_MODE_ID in", values, "packingModeId");
            return (Criteria) this;
        }

        public Criteria andPackingModeIdNotIn(List<String> values) {
            addCriterion("PACKING_MODE_ID not in", values, "packingModeId");
            return (Criteria) this;
        }

        public Criteria andPackingModeIdBetween(String value1, String value2) {
            addCriterion("PACKING_MODE_ID between", value1, value2, "packingModeId");
            return (Criteria) this;
        }

        public Criteria andPackingModeIdNotBetween(String value1, String value2) {
            addCriterion("PACKING_MODE_ID not between", value1, value2, "packingModeId");
            return (Criteria) this;
        }

        public Criteria andPacking1UnitIdIsNull() {
            addCriterion("PACKING1_UNIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPacking1UnitIdIsNotNull() {
            addCriterion("PACKING1_UNIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPacking1UnitIdEqualTo(String value) {
            addCriterion("PACKING1_UNIT_ID =", value, "packing1UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking1UnitIdNotEqualTo(String value) {
            addCriterion("PACKING1_UNIT_ID <>", value, "packing1UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking1UnitIdGreaterThan(String value) {
            addCriterion("PACKING1_UNIT_ID >", value, "packing1UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking1UnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("PACKING1_UNIT_ID >=", value, "packing1UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking1UnitIdLessThan(String value) {
            addCriterion("PACKING1_UNIT_ID <", value, "packing1UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking1UnitIdLessThanOrEqualTo(String value) {
            addCriterion("PACKING1_UNIT_ID <=", value, "packing1UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking1UnitIdLike(String value) {
            addCriterion("PACKING1_UNIT_ID like", value, "packing1UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking1UnitIdNotLike(String value) {
            addCriterion("PACKING1_UNIT_ID not like", value, "packing1UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking1UnitIdIn(List<String> values) {
            addCriterion("PACKING1_UNIT_ID in", values, "packing1UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking1UnitIdNotIn(List<String> values) {
            addCriterion("PACKING1_UNIT_ID not in", values, "packing1UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking1UnitIdBetween(String value1, String value2) {
            addCriterion("PACKING1_UNIT_ID between", value1, value2, "packing1UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking1UnitIdNotBetween(String value1, String value2) {
            addCriterion("PACKING1_UNIT_ID not between", value1, value2, "packing1UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking2UnitIdIsNull() {
            addCriterion("PACKING2_UNIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPacking2UnitIdIsNotNull() {
            addCriterion("PACKING2_UNIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPacking2UnitIdEqualTo(String value) {
            addCriterion("PACKING2_UNIT_ID =", value, "packing2UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking2UnitIdNotEqualTo(String value) {
            addCriterion("PACKING2_UNIT_ID <>", value, "packing2UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking2UnitIdGreaterThan(String value) {
            addCriterion("PACKING2_UNIT_ID >", value, "packing2UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking2UnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("PACKING2_UNIT_ID >=", value, "packing2UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking2UnitIdLessThan(String value) {
            addCriterion("PACKING2_UNIT_ID <", value, "packing2UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking2UnitIdLessThanOrEqualTo(String value) {
            addCriterion("PACKING2_UNIT_ID <=", value, "packing2UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking2UnitIdLike(String value) {
            addCriterion("PACKING2_UNIT_ID like", value, "packing2UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking2UnitIdNotLike(String value) {
            addCriterion("PACKING2_UNIT_ID not like", value, "packing2UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking2UnitIdIn(List<String> values) {
            addCriterion("PACKING2_UNIT_ID in", values, "packing2UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking2UnitIdNotIn(List<String> values) {
            addCriterion("PACKING2_UNIT_ID not in", values, "packing2UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking2UnitIdBetween(String value1, String value2) {
            addCriterion("PACKING2_UNIT_ID between", value1, value2, "packing2UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking2UnitIdNotBetween(String value1, String value2) {
            addCriterion("PACKING2_UNIT_ID not between", value1, value2, "packing2UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking3UnitIdIsNull() {
            addCriterion("PACKING3_UNIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPacking3UnitIdIsNotNull() {
            addCriterion("PACKING3_UNIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPacking3UnitIdEqualTo(String value) {
            addCriterion("PACKING3_UNIT_ID =", value, "packing3UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking3UnitIdNotEqualTo(String value) {
            addCriterion("PACKING3_UNIT_ID <>", value, "packing3UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking3UnitIdGreaterThan(String value) {
            addCriterion("PACKING3_UNIT_ID >", value, "packing3UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking3UnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("PACKING3_UNIT_ID >=", value, "packing3UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking3UnitIdLessThan(String value) {
            addCriterion("PACKING3_UNIT_ID <", value, "packing3UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking3UnitIdLessThanOrEqualTo(String value) {
            addCriterion("PACKING3_UNIT_ID <=", value, "packing3UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking3UnitIdLike(String value) {
            addCriterion("PACKING3_UNIT_ID like", value, "packing3UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking3UnitIdNotLike(String value) {
            addCriterion("PACKING3_UNIT_ID not like", value, "packing3UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking3UnitIdIn(List<String> values) {
            addCriterion("PACKING3_UNIT_ID in", values, "packing3UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking3UnitIdNotIn(List<String> values) {
            addCriterion("PACKING3_UNIT_ID not in", values, "packing3UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking3UnitIdBetween(String value1, String value2) {
            addCriterion("PACKING3_UNIT_ID between", value1, value2, "packing3UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking3UnitIdNotBetween(String value1, String value2) {
            addCriterion("PACKING3_UNIT_ID not between", value1, value2, "packing3UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking4UnitIdIsNull() {
            addCriterion("PACKING4_UNIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPacking4UnitIdIsNotNull() {
            addCriterion("PACKING4_UNIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPacking4UnitIdEqualTo(String value) {
            addCriterion("PACKING4_UNIT_ID =", value, "packing4UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking4UnitIdNotEqualTo(String value) {
            addCriterion("PACKING4_UNIT_ID <>", value, "packing4UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking4UnitIdGreaterThan(String value) {
            addCriterion("PACKING4_UNIT_ID >", value, "packing4UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking4UnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("PACKING4_UNIT_ID >=", value, "packing4UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking4UnitIdLessThan(String value) {
            addCriterion("PACKING4_UNIT_ID <", value, "packing4UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking4UnitIdLessThanOrEqualTo(String value) {
            addCriterion("PACKING4_UNIT_ID <=", value, "packing4UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking4UnitIdLike(String value) {
            addCriterion("PACKING4_UNIT_ID like", value, "packing4UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking4UnitIdNotLike(String value) {
            addCriterion("PACKING4_UNIT_ID not like", value, "packing4UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking4UnitIdIn(List<String> values) {
            addCriterion("PACKING4_UNIT_ID in", values, "packing4UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking4UnitIdNotIn(List<String> values) {
            addCriterion("PACKING4_UNIT_ID not in", values, "packing4UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking4UnitIdBetween(String value1, String value2) {
            addCriterion("PACKING4_UNIT_ID between", value1, value2, "packing4UnitId");
            return (Criteria) this;
        }

        public Criteria andPacking4UnitIdNotBetween(String value1, String value2) {
            addCriterion("PACKING4_UNIT_ID not between", value1, value2, "packing4UnitId");
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

        public Criteria andWarehouseIdIsNull() {
            addCriterion("WAREHOUSE_ID is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNotNull() {
            addCriterion("WAREHOUSE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdEqualTo(String value) {
            addCriterion("WAREHOUSE_ID =", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotEqualTo(String value) {
            addCriterion("WAREHOUSE_ID <>", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThan(String value) {
            addCriterion("WAREHOUSE_ID >", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThanOrEqualTo(String value) {
            addCriterion("WAREHOUSE_ID >=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThan(String value) {
            addCriterion("WAREHOUSE_ID <", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThanOrEqualTo(String value) {
            addCriterion("WAREHOUSE_ID <=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLike(String value) {
            addCriterion("WAREHOUSE_ID like", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotLike(String value) {
            addCriterion("WAREHOUSE_ID not like", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIn(List<String> values) {
            addCriterion("WAREHOUSE_ID in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotIn(List<String> values) {
            addCriterion("WAREHOUSE_ID not in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdBetween(String value1, String value2) {
            addCriterion("WAREHOUSE_ID between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotBetween(String value1, String value2) {
            addCriterion("WAREHOUSE_ID not between", value1, value2, "warehouseId");
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

        public Criteria andBinIdIsNull() {
            addCriterion("BIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andBinIdIsNotNull() {
            addCriterion("BIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBinIdEqualTo(String value) {
            addCriterion("BIN_ID =", value, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdNotEqualTo(String value) {
            addCriterion("BIN_ID <>", value, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdGreaterThan(String value) {
            addCriterion("BIN_ID >", value, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdGreaterThanOrEqualTo(String value) {
            addCriterion("BIN_ID >=", value, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdLessThan(String value) {
            addCriterion("BIN_ID <", value, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdLessThanOrEqualTo(String value) {
            addCriterion("BIN_ID <=", value, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdLike(String value) {
            addCriterion("BIN_ID like", value, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdNotLike(String value) {
            addCriterion("BIN_ID not like", value, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdIn(List<String> values) {
            addCriterion("BIN_ID in", values, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdNotIn(List<String> values) {
            addCriterion("BIN_ID not in", values, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdBetween(String value1, String value2) {
            addCriterion("BIN_ID between", value1, value2, "binId");
            return (Criteria) this;
        }

        public Criteria andBinIdNotBetween(String value1, String value2) {
            addCriterion("BIN_ID not between", value1, value2, "binId");
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

        public Criteria andItemCertificationDIdIsNull() {
            addCriterion("ITEM_CERTIFICATION_D_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemCertificationDIdIsNotNull() {
            addCriterion("ITEM_CERTIFICATION_D_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemCertificationDIdEqualTo(String value) {
            addCriterion("ITEM_CERTIFICATION_D_ID =", value, "itemCertificationDId");
            return (Criteria) this;
        }

        public Criteria andItemCertificationDIdNotEqualTo(String value) {
            addCriterion("ITEM_CERTIFICATION_D_ID <>", value, "itemCertificationDId");
            return (Criteria) this;
        }

        public Criteria andItemCertificationDIdGreaterThan(String value) {
            addCriterion("ITEM_CERTIFICATION_D_ID >", value, "itemCertificationDId");
            return (Criteria) this;
        }

        public Criteria andItemCertificationDIdGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_CERTIFICATION_D_ID >=", value, "itemCertificationDId");
            return (Criteria) this;
        }

        public Criteria andItemCertificationDIdLessThan(String value) {
            addCriterion("ITEM_CERTIFICATION_D_ID <", value, "itemCertificationDId");
            return (Criteria) this;
        }

        public Criteria andItemCertificationDIdLessThanOrEqualTo(String value) {
            addCriterion("ITEM_CERTIFICATION_D_ID <=", value, "itemCertificationDId");
            return (Criteria) this;
        }

        public Criteria andItemCertificationDIdLike(String value) {
            addCriterion("ITEM_CERTIFICATION_D_ID like", value, "itemCertificationDId");
            return (Criteria) this;
        }

        public Criteria andItemCertificationDIdNotLike(String value) {
            addCriterion("ITEM_CERTIFICATION_D_ID not like", value, "itemCertificationDId");
            return (Criteria) this;
        }

        public Criteria andItemCertificationDIdIn(List<String> values) {
            addCriterion("ITEM_CERTIFICATION_D_ID in", values, "itemCertificationDId");
            return (Criteria) this;
        }

        public Criteria andItemCertificationDIdNotIn(List<String> values) {
            addCriterion("ITEM_CERTIFICATION_D_ID not in", values, "itemCertificationDId");
            return (Criteria) this;
        }

        public Criteria andItemCertificationDIdBetween(String value1, String value2) {
            addCriterion("ITEM_CERTIFICATION_D_ID between", value1, value2, "itemCertificationDId");
            return (Criteria) this;
        }

        public Criteria andItemCertificationDIdNotBetween(String value1, String value2) {
            addCriterion("ITEM_CERTIFICATION_D_ID not between", value1, value2, "itemCertificationDId");
            return (Criteria) this;
        }

        public Criteria andMoIdIsNull() {
            addCriterion("MO_ID is null");
            return (Criteria) this;
        }

        public Criteria andMoIdIsNotNull() {
            addCriterion("MO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMoIdEqualTo(String value) {
            addCriterion("MO_ID =", value, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdNotEqualTo(String value) {
            addCriterion("MO_ID <>", value, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdGreaterThan(String value) {
            addCriterion("MO_ID >", value, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdGreaterThanOrEqualTo(String value) {
            addCriterion("MO_ID >=", value, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdLessThan(String value) {
            addCriterion("MO_ID <", value, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdLessThanOrEqualTo(String value) {
            addCriterion("MO_ID <=", value, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdLike(String value) {
            addCriterion("MO_ID like", value, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdNotLike(String value) {
            addCriterion("MO_ID not like", value, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdIn(List<String> values) {
            addCriterion("MO_ID in", values, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdNotIn(List<String> values) {
            addCriterion("MO_ID not in", values, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdBetween(String value1, String value2) {
            addCriterion("MO_ID between", value1, value2, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdNotBetween(String value1, String value2) {
            addCriterion("MO_ID not between", value1, value2, "moId");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceQtyIsNull() {
            addCriterion("SETTLEMENT_PRICE_QTY is null");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceQtyIsNotNull() {
            addCriterion("SETTLEMENT_PRICE_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceQtyEqualTo(BigDecimal value) {
            addCriterion("SETTLEMENT_PRICE_QTY =", value, "settlementPriceQty");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceQtyNotEqualTo(BigDecimal value) {
            addCriterion("SETTLEMENT_PRICE_QTY <>", value, "settlementPriceQty");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceQtyGreaterThan(BigDecimal value) {
            addCriterion("SETTLEMENT_PRICE_QTY >", value, "settlementPriceQty");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SETTLEMENT_PRICE_QTY >=", value, "settlementPriceQty");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceQtyLessThan(BigDecimal value) {
            addCriterion("SETTLEMENT_PRICE_QTY <", value, "settlementPriceQty");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SETTLEMENT_PRICE_QTY <=", value, "settlementPriceQty");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceQtyIn(List<BigDecimal> values) {
            addCriterion("SETTLEMENT_PRICE_QTY in", values, "settlementPriceQty");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceQtyNotIn(List<BigDecimal> values) {
            addCriterion("SETTLEMENT_PRICE_QTY not in", values, "settlementPriceQty");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SETTLEMENT_PRICE_QTY between", value1, value2, "settlementPriceQty");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SETTLEMENT_PRICE_QTY not between", value1, value2, "settlementPriceQty");
            return (Criteria) this;
        }

        public Criteria andSettlementAmtUnTaxOcIsNull() {
            addCriterion("SETTLEMENT_AMT_UN_TAX_OC is null");
            return (Criteria) this;
        }

        public Criteria andSettlementAmtUnTaxOcIsNotNull() {
            addCriterion("SETTLEMENT_AMT_UN_TAX_OC is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementAmtUnTaxOcEqualTo(BigDecimal value) {
            addCriterion("SETTLEMENT_AMT_UN_TAX_OC =", value, "settlementAmtUnTaxOc");
            return (Criteria) this;
        }

        public Criteria andSettlementAmtUnTaxOcNotEqualTo(BigDecimal value) {
            addCriterion("SETTLEMENT_AMT_UN_TAX_OC <>", value, "settlementAmtUnTaxOc");
            return (Criteria) this;
        }

        public Criteria andSettlementAmtUnTaxOcGreaterThan(BigDecimal value) {
            addCriterion("SETTLEMENT_AMT_UN_TAX_OC >", value, "settlementAmtUnTaxOc");
            return (Criteria) this;
        }

        public Criteria andSettlementAmtUnTaxOcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SETTLEMENT_AMT_UN_TAX_OC >=", value, "settlementAmtUnTaxOc");
            return (Criteria) this;
        }

        public Criteria andSettlementAmtUnTaxOcLessThan(BigDecimal value) {
            addCriterion("SETTLEMENT_AMT_UN_TAX_OC <", value, "settlementAmtUnTaxOc");
            return (Criteria) this;
        }

        public Criteria andSettlementAmtUnTaxOcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SETTLEMENT_AMT_UN_TAX_OC <=", value, "settlementAmtUnTaxOc");
            return (Criteria) this;
        }

        public Criteria andSettlementAmtUnTaxOcIn(List<BigDecimal> values) {
            addCriterion("SETTLEMENT_AMT_UN_TAX_OC in", values, "settlementAmtUnTaxOc");
            return (Criteria) this;
        }

        public Criteria andSettlementAmtUnTaxOcNotIn(List<BigDecimal> values) {
            addCriterion("SETTLEMENT_AMT_UN_TAX_OC not in", values, "settlementAmtUnTaxOc");
            return (Criteria) this;
        }

        public Criteria andSettlementAmtUnTaxOcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SETTLEMENT_AMT_UN_TAX_OC between", value1, value2, "settlementAmtUnTaxOc");
            return (Criteria) this;
        }

        public Criteria andSettlementAmtUnTaxOcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SETTLEMENT_AMT_UN_TAX_OC not between", value1, value2, "settlementAmtUnTaxOc");
            return (Criteria) this;
        }

        public Criteria andSettlementTaxOcIsNull() {
            addCriterion("SETTLEMENT_TAX_OC is null");
            return (Criteria) this;
        }

        public Criteria andSettlementTaxOcIsNotNull() {
            addCriterion("SETTLEMENT_TAX_OC is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementTaxOcEqualTo(BigDecimal value) {
            addCriterion("SETTLEMENT_TAX_OC =", value, "settlementTaxOc");
            return (Criteria) this;
        }

        public Criteria andSettlementTaxOcNotEqualTo(BigDecimal value) {
            addCriterion("SETTLEMENT_TAX_OC <>", value, "settlementTaxOc");
            return (Criteria) this;
        }

        public Criteria andSettlementTaxOcGreaterThan(BigDecimal value) {
            addCriterion("SETTLEMENT_TAX_OC >", value, "settlementTaxOc");
            return (Criteria) this;
        }

        public Criteria andSettlementTaxOcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SETTLEMENT_TAX_OC >=", value, "settlementTaxOc");
            return (Criteria) this;
        }

        public Criteria andSettlementTaxOcLessThan(BigDecimal value) {
            addCriterion("SETTLEMENT_TAX_OC <", value, "settlementTaxOc");
            return (Criteria) this;
        }

        public Criteria andSettlementTaxOcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SETTLEMENT_TAX_OC <=", value, "settlementTaxOc");
            return (Criteria) this;
        }

        public Criteria andSettlementTaxOcIn(List<BigDecimal> values) {
            addCriterion("SETTLEMENT_TAX_OC in", values, "settlementTaxOc");
            return (Criteria) this;
        }

        public Criteria andSettlementTaxOcNotIn(List<BigDecimal> values) {
            addCriterion("SETTLEMENT_TAX_OC not in", values, "settlementTaxOc");
            return (Criteria) this;
        }

        public Criteria andSettlementTaxOcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SETTLEMENT_TAX_OC between", value1, value2, "settlementTaxOc");
            return (Criteria) this;
        }

        public Criteria andSettlementTaxOcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SETTLEMENT_TAX_OC not between", value1, value2, "settlementTaxOc");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdIsNull() {
            addCriterion("PURCHASE_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdIsNotNull() {
            addCriterion("PURCHASE_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdEqualTo(String value) {
            addCriterion("PURCHASE_ORDER_ID =", value, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdNotEqualTo(String value) {
            addCriterion("PURCHASE_ORDER_ID <>", value, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdGreaterThan(String value) {
            addCriterion("PURCHASE_ORDER_ID >", value, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_ORDER_ID >=", value, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdLessThan(String value) {
            addCriterion("PURCHASE_ORDER_ID <", value, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_ORDER_ID <=", value, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdLike(String value) {
            addCriterion("PURCHASE_ORDER_ID like", value, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdNotLike(String value) {
            addCriterion("PURCHASE_ORDER_ID not like", value, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdIn(List<String> values) {
            addCriterion("PURCHASE_ORDER_ID in", values, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdNotIn(List<String> values) {
            addCriterion("PURCHASE_ORDER_ID not in", values, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdBetween(String value1, String value2) {
            addCriterion("PURCHASE_ORDER_ID between", value1, value2, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_ORDER_ID not between", value1, value2, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andSignTypeIsNull() {
            addCriterion("SIGN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSignTypeIsNotNull() {
            addCriterion("SIGN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSignTypeEqualTo(String value) {
            addCriterion("SIGN_TYPE =", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotEqualTo(String value) {
            addCriterion("SIGN_TYPE <>", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeGreaterThan(String value) {
            addCriterion("SIGN_TYPE >", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_TYPE >=", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeLessThan(String value) {
            addCriterion("SIGN_TYPE <", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeLessThanOrEqualTo(String value) {
            addCriterion("SIGN_TYPE <=", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeLike(String value) {
            addCriterion("SIGN_TYPE like", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotLike(String value) {
            addCriterion("SIGN_TYPE not like", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeIn(List<String> values) {
            addCriterion("SIGN_TYPE in", values, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotIn(List<String> values) {
            addCriterion("SIGN_TYPE not in", values, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeBetween(String value1, String value2) {
            addCriterion("SIGN_TYPE between", value1, value2, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotBetween(String value1, String value2) {
            addCriterion("SIGN_TYPE not between", value1, value2, "signType");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIdIsNull() {
            addCriterion("RETURN_REASON_ID is null");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIdIsNotNull() {
            addCriterion("RETURN_REASON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIdEqualTo(String value) {
            addCriterion("RETURN_REASON_ID =", value, "returnReasonId");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIdNotEqualTo(String value) {
            addCriterion("RETURN_REASON_ID <>", value, "returnReasonId");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIdGreaterThan(String value) {
            addCriterion("RETURN_REASON_ID >", value, "returnReasonId");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIdGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_REASON_ID >=", value, "returnReasonId");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIdLessThan(String value) {
            addCriterion("RETURN_REASON_ID <", value, "returnReasonId");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIdLessThanOrEqualTo(String value) {
            addCriterion("RETURN_REASON_ID <=", value, "returnReasonId");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIdLike(String value) {
            addCriterion("RETURN_REASON_ID like", value, "returnReasonId");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIdNotLike(String value) {
            addCriterion("RETURN_REASON_ID not like", value, "returnReasonId");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIdIn(List<String> values) {
            addCriterion("RETURN_REASON_ID in", values, "returnReasonId");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIdNotIn(List<String> values) {
            addCriterion("RETURN_REASON_ID not in", values, "returnReasonId");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIdBetween(String value1, String value2) {
            addCriterion("RETURN_REASON_ID between", value1, value2, "returnReasonId");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIdNotBetween(String value1, String value2) {
            addCriterion("RETURN_REASON_ID not between", value1, value2, "returnReasonId");
            return (Criteria) this;
        }

        public Criteria andSuppIndemBusinessQtyIsNull() {
            addCriterion("SUPP_INDEM_BUSINESS_QTY is null");
            return (Criteria) this;
        }

        public Criteria andSuppIndemBusinessQtyIsNotNull() {
            addCriterion("SUPP_INDEM_BUSINESS_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andSuppIndemBusinessQtyEqualTo(BigDecimal value) {
            addCriterion("SUPP_INDEM_BUSINESS_QTY =", value, "suppIndemBusinessQty");
            return (Criteria) this;
        }

        public Criteria andSuppIndemBusinessQtyNotEqualTo(BigDecimal value) {
            addCriterion("SUPP_INDEM_BUSINESS_QTY <>", value, "suppIndemBusinessQty");
            return (Criteria) this;
        }

        public Criteria andSuppIndemBusinessQtyGreaterThan(BigDecimal value) {
            addCriterion("SUPP_INDEM_BUSINESS_QTY >", value, "suppIndemBusinessQty");
            return (Criteria) this;
        }

        public Criteria andSuppIndemBusinessQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUPP_INDEM_BUSINESS_QTY >=", value, "suppIndemBusinessQty");
            return (Criteria) this;
        }

        public Criteria andSuppIndemBusinessQtyLessThan(BigDecimal value) {
            addCriterion("SUPP_INDEM_BUSINESS_QTY <", value, "suppIndemBusinessQty");
            return (Criteria) this;
        }

        public Criteria andSuppIndemBusinessQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUPP_INDEM_BUSINESS_QTY <=", value, "suppIndemBusinessQty");
            return (Criteria) this;
        }

        public Criteria andSuppIndemBusinessQtyIn(List<BigDecimal> values) {
            addCriterion("SUPP_INDEM_BUSINESS_QTY in", values, "suppIndemBusinessQty");
            return (Criteria) this;
        }

        public Criteria andSuppIndemBusinessQtyNotIn(List<BigDecimal> values) {
            addCriterion("SUPP_INDEM_BUSINESS_QTY not in", values, "suppIndemBusinessQty");
            return (Criteria) this;
        }

        public Criteria andSuppIndemBusinessQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUPP_INDEM_BUSINESS_QTY between", value1, value2, "suppIndemBusinessQty");
            return (Criteria) this;
        }

        public Criteria andSuppIndemBusinessQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUPP_INDEM_BUSINESS_QTY not between", value1, value2, "suppIndemBusinessQty");
            return (Criteria) this;
        }

        public Criteria andSuppIndemPriceQtyIsNull() {
            addCriterion("SUPP_INDEM_PRICE_QTY is null");
            return (Criteria) this;
        }

        public Criteria andSuppIndemPriceQtyIsNotNull() {
            addCriterion("SUPP_INDEM_PRICE_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andSuppIndemPriceQtyEqualTo(BigDecimal value) {
            addCriterion("SUPP_INDEM_PRICE_QTY =", value, "suppIndemPriceQty");
            return (Criteria) this;
        }

        public Criteria andSuppIndemPriceQtyNotEqualTo(BigDecimal value) {
            addCriterion("SUPP_INDEM_PRICE_QTY <>", value, "suppIndemPriceQty");
            return (Criteria) this;
        }

        public Criteria andSuppIndemPriceQtyGreaterThan(BigDecimal value) {
            addCriterion("SUPP_INDEM_PRICE_QTY >", value, "suppIndemPriceQty");
            return (Criteria) this;
        }

        public Criteria andSuppIndemPriceQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUPP_INDEM_PRICE_QTY >=", value, "suppIndemPriceQty");
            return (Criteria) this;
        }

        public Criteria andSuppIndemPriceQtyLessThan(BigDecimal value) {
            addCriterion("SUPP_INDEM_PRICE_QTY <", value, "suppIndemPriceQty");
            return (Criteria) this;
        }

        public Criteria andSuppIndemPriceQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUPP_INDEM_PRICE_QTY <=", value, "suppIndemPriceQty");
            return (Criteria) this;
        }

        public Criteria andSuppIndemPriceQtyIn(List<BigDecimal> values) {
            addCriterion("SUPP_INDEM_PRICE_QTY in", values, "suppIndemPriceQty");
            return (Criteria) this;
        }

        public Criteria andSuppIndemPriceQtyNotIn(List<BigDecimal> values) {
            addCriterion("SUPP_INDEM_PRICE_QTY not in", values, "suppIndemPriceQty");
            return (Criteria) this;
        }

        public Criteria andSuppIndemPriceQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUPP_INDEM_PRICE_QTY between", value1, value2, "suppIndemPriceQty");
            return (Criteria) this;
        }

        public Criteria andSuppIndemPriceQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUPP_INDEM_PRICE_QTY not between", value1, value2, "suppIndemPriceQty");
            return (Criteria) this;
        }

        public Criteria andLossBusinessQtyIsNull() {
            addCriterion("LOSS_BUSINESS_QTY is null");
            return (Criteria) this;
        }

        public Criteria andLossBusinessQtyIsNotNull() {
            addCriterion("LOSS_BUSINESS_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andLossBusinessQtyEqualTo(BigDecimal value) {
            addCriterion("LOSS_BUSINESS_QTY =", value, "lossBusinessQty");
            return (Criteria) this;
        }

        public Criteria andLossBusinessQtyNotEqualTo(BigDecimal value) {
            addCriterion("LOSS_BUSINESS_QTY <>", value, "lossBusinessQty");
            return (Criteria) this;
        }

        public Criteria andLossBusinessQtyGreaterThan(BigDecimal value) {
            addCriterion("LOSS_BUSINESS_QTY >", value, "lossBusinessQty");
            return (Criteria) this;
        }

        public Criteria andLossBusinessQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOSS_BUSINESS_QTY >=", value, "lossBusinessQty");
            return (Criteria) this;
        }

        public Criteria andLossBusinessQtyLessThan(BigDecimal value) {
            addCriterion("LOSS_BUSINESS_QTY <", value, "lossBusinessQty");
            return (Criteria) this;
        }

        public Criteria andLossBusinessQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOSS_BUSINESS_QTY <=", value, "lossBusinessQty");
            return (Criteria) this;
        }

        public Criteria andLossBusinessQtyIn(List<BigDecimal> values) {
            addCriterion("LOSS_BUSINESS_QTY in", values, "lossBusinessQty");
            return (Criteria) this;
        }

        public Criteria andLossBusinessQtyNotIn(List<BigDecimal> values) {
            addCriterion("LOSS_BUSINESS_QTY not in", values, "lossBusinessQty");
            return (Criteria) this;
        }

        public Criteria andLossBusinessQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOSS_BUSINESS_QTY between", value1, value2, "lossBusinessQty");
            return (Criteria) this;
        }

        public Criteria andLossBusinessQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOSS_BUSINESS_QTY not between", value1, value2, "lossBusinessQty");
            return (Criteria) this;
        }

        public Criteria andLossPriceQtyIsNull() {
            addCriterion("LOSS_PRICE_QTY is null");
            return (Criteria) this;
        }

        public Criteria andLossPriceQtyIsNotNull() {
            addCriterion("LOSS_PRICE_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andLossPriceQtyEqualTo(BigDecimal value) {
            addCriterion("LOSS_PRICE_QTY =", value, "lossPriceQty");
            return (Criteria) this;
        }

        public Criteria andLossPriceQtyNotEqualTo(BigDecimal value) {
            addCriterion("LOSS_PRICE_QTY <>", value, "lossPriceQty");
            return (Criteria) this;
        }

        public Criteria andLossPriceQtyGreaterThan(BigDecimal value) {
            addCriterion("LOSS_PRICE_QTY >", value, "lossPriceQty");
            return (Criteria) this;
        }

        public Criteria andLossPriceQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOSS_PRICE_QTY >=", value, "lossPriceQty");
            return (Criteria) this;
        }

        public Criteria andLossPriceQtyLessThan(BigDecimal value) {
            addCriterion("LOSS_PRICE_QTY <", value, "lossPriceQty");
            return (Criteria) this;
        }

        public Criteria andLossPriceQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOSS_PRICE_QTY <=", value, "lossPriceQty");
            return (Criteria) this;
        }

        public Criteria andLossPriceQtyIn(List<BigDecimal> values) {
            addCriterion("LOSS_PRICE_QTY in", values, "lossPriceQty");
            return (Criteria) this;
        }

        public Criteria andLossPriceQtyNotIn(List<BigDecimal> values) {
            addCriterion("LOSS_PRICE_QTY not in", values, "lossPriceQty");
            return (Criteria) this;
        }

        public Criteria andLossPriceQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOSS_PRICE_QTY between", value1, value2, "lossPriceQty");
            return (Criteria) this;
        }

        public Criteria andLossPriceQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOSS_PRICE_QTY not between", value1, value2, "lossPriceQty");
            return (Criteria) this;
        }

        public Criteria andShouldSettlePriceQtyIsNull() {
            addCriterion("SHOULD_SETTLE_PRICE_QTY is null");
            return (Criteria) this;
        }

        public Criteria andShouldSettlePriceQtyIsNotNull() {
            addCriterion("SHOULD_SETTLE_PRICE_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andShouldSettlePriceQtyEqualTo(BigDecimal value) {
            addCriterion("SHOULD_SETTLE_PRICE_QTY =", value, "shouldSettlePriceQty");
            return (Criteria) this;
        }

        public Criteria andShouldSettlePriceQtyNotEqualTo(BigDecimal value) {
            addCriterion("SHOULD_SETTLE_PRICE_QTY <>", value, "shouldSettlePriceQty");
            return (Criteria) this;
        }

        public Criteria andShouldSettlePriceQtyGreaterThan(BigDecimal value) {
            addCriterion("SHOULD_SETTLE_PRICE_QTY >", value, "shouldSettlePriceQty");
            return (Criteria) this;
        }

        public Criteria andShouldSettlePriceQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOULD_SETTLE_PRICE_QTY >=", value, "shouldSettlePriceQty");
            return (Criteria) this;
        }

        public Criteria andShouldSettlePriceQtyLessThan(BigDecimal value) {
            addCriterion("SHOULD_SETTLE_PRICE_QTY <", value, "shouldSettlePriceQty");
            return (Criteria) this;
        }

        public Criteria andShouldSettlePriceQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOULD_SETTLE_PRICE_QTY <=", value, "shouldSettlePriceQty");
            return (Criteria) this;
        }

        public Criteria andShouldSettlePriceQtyIn(List<BigDecimal> values) {
            addCriterion("SHOULD_SETTLE_PRICE_QTY in", values, "shouldSettlePriceQty");
            return (Criteria) this;
        }

        public Criteria andShouldSettlePriceQtyNotIn(List<BigDecimal> values) {
            addCriterion("SHOULD_SETTLE_PRICE_QTY not in", values, "shouldSettlePriceQty");
            return (Criteria) this;
        }

        public Criteria andShouldSettlePriceQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOULD_SETTLE_PRICE_QTY between", value1, value2, "shouldSettlePriceQty");
            return (Criteria) this;
        }

        public Criteria andShouldSettlePriceQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOULD_SETTLE_PRICE_QTY not between", value1, value2, "shouldSettlePriceQty");
            return (Criteria) this;
        }

        public Criteria andJudgedQtyIsNull() {
            addCriterion("JUDGED_QTY is null");
            return (Criteria) this;
        }

        public Criteria andJudgedQtyIsNotNull() {
            addCriterion("JUDGED_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andJudgedQtyEqualTo(BigDecimal value) {
            addCriterion("JUDGED_QTY =", value, "judgedQty");
            return (Criteria) this;
        }

        public Criteria andJudgedQtyNotEqualTo(BigDecimal value) {
            addCriterion("JUDGED_QTY <>", value, "judgedQty");
            return (Criteria) this;
        }

        public Criteria andJudgedQtyGreaterThan(BigDecimal value) {
            addCriterion("JUDGED_QTY >", value, "judgedQty");
            return (Criteria) this;
        }

        public Criteria andJudgedQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JUDGED_QTY >=", value, "judgedQty");
            return (Criteria) this;
        }

        public Criteria andJudgedQtyLessThan(BigDecimal value) {
            addCriterion("JUDGED_QTY <", value, "judgedQty");
            return (Criteria) this;
        }

        public Criteria andJudgedQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JUDGED_QTY <=", value, "judgedQty");
            return (Criteria) this;
        }

        public Criteria andJudgedQtyIn(List<BigDecimal> values) {
            addCriterion("JUDGED_QTY in", values, "judgedQty");
            return (Criteria) this;
        }

        public Criteria andJudgedQtyNotIn(List<BigDecimal> values) {
            addCriterion("JUDGED_QTY not in", values, "judgedQty");
            return (Criteria) this;
        }

        public Criteria andJudgedQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JUDGED_QTY between", value1, value2, "judgedQty");
            return (Criteria) this;
        }

        public Criteria andJudgedQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JUDGED_QTY not between", value1, value2, "judgedQty");
            return (Criteria) this;
        }

        public Criteria andSpApproveFlagIsNull() {
            addCriterion("SP_APPROVE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andSpApproveFlagIsNotNull() {
            addCriterion("SP_APPROVE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSpApproveFlagEqualTo(Boolean value) {
            addCriterion("SP_APPROVE_FLAG =", value, "spApproveFlag");
            return (Criteria) this;
        }

        public Criteria andSpApproveFlagNotEqualTo(Boolean value) {
            addCriterion("SP_APPROVE_FLAG <>", value, "spApproveFlag");
            return (Criteria) this;
        }

        public Criteria andSpApproveFlagGreaterThan(Boolean value) {
            addCriterion("SP_APPROVE_FLAG >", value, "spApproveFlag");
            return (Criteria) this;
        }

        public Criteria andSpApproveFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("SP_APPROVE_FLAG >=", value, "spApproveFlag");
            return (Criteria) this;
        }

        public Criteria andSpApproveFlagLessThan(Boolean value) {
            addCriterion("SP_APPROVE_FLAG <", value, "spApproveFlag");
            return (Criteria) this;
        }

        public Criteria andSpApproveFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("SP_APPROVE_FLAG <=", value, "spApproveFlag");
            return (Criteria) this;
        }

        public Criteria andSpApproveFlagIn(List<Boolean> values) {
            addCriterion("SP_APPROVE_FLAG in", values, "spApproveFlag");
            return (Criteria) this;
        }

        public Criteria andSpApproveFlagNotIn(List<Boolean> values) {
            addCriterion("SP_APPROVE_FLAG not in", values, "spApproveFlag");
            return (Criteria) this;
        }

        public Criteria andSpApproveFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("SP_APPROVE_FLAG between", value1, value2, "spApproveFlag");
            return (Criteria) this;
        }

        public Criteria andSpApproveFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("SP_APPROVE_FLAG not between", value1, value2, "spApproveFlag");
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

        public Criteria andSnCollectedQtyIsNull() {
            addCriterion("SN_COLLECTED_QTY is null");
            return (Criteria) this;
        }

        public Criteria andSnCollectedQtyIsNotNull() {
            addCriterion("SN_COLLECTED_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andSnCollectedQtyEqualTo(BigDecimal value) {
            addCriterion("SN_COLLECTED_QTY =", value, "snCollectedQty");
            return (Criteria) this;
        }

        public Criteria andSnCollectedQtyNotEqualTo(BigDecimal value) {
            addCriterion("SN_COLLECTED_QTY <>", value, "snCollectedQty");
            return (Criteria) this;
        }

        public Criteria andSnCollectedQtyGreaterThan(BigDecimal value) {
            addCriterion("SN_COLLECTED_QTY >", value, "snCollectedQty");
            return (Criteria) this;
        }

        public Criteria andSnCollectedQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SN_COLLECTED_QTY >=", value, "snCollectedQty");
            return (Criteria) this;
        }

        public Criteria andSnCollectedQtyLessThan(BigDecimal value) {
            addCriterion("SN_COLLECTED_QTY <", value, "snCollectedQty");
            return (Criteria) this;
        }

        public Criteria andSnCollectedQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SN_COLLECTED_QTY <=", value, "snCollectedQty");
            return (Criteria) this;
        }

        public Criteria andSnCollectedQtyIn(List<BigDecimal> values) {
            addCriterion("SN_COLLECTED_QTY in", values, "snCollectedQty");
            return (Criteria) this;
        }

        public Criteria andSnCollectedQtyNotIn(List<BigDecimal> values) {
            addCriterion("SN_COLLECTED_QTY not in", values, "snCollectedQty");
            return (Criteria) this;
        }

        public Criteria andSnCollectedQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SN_COLLECTED_QTY between", value1, value2, "snCollectedQty");
            return (Criteria) this;
        }

        public Criteria andSnCollectedQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SN_COLLECTED_QTY not between", value1, value2, "snCollectedQty");
            return (Criteria) this;
        }

        public Criteria andSnCollectedStatusIsNull() {
            addCriterion("SN_COLLECTED_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSnCollectedStatusIsNotNull() {
            addCriterion("SN_COLLECTED_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSnCollectedStatusEqualTo(String value) {
            addCriterion("SN_COLLECTED_STATUS =", value, "snCollectedStatus");
            return (Criteria) this;
        }

        public Criteria andSnCollectedStatusNotEqualTo(String value) {
            addCriterion("SN_COLLECTED_STATUS <>", value, "snCollectedStatus");
            return (Criteria) this;
        }

        public Criteria andSnCollectedStatusGreaterThan(String value) {
            addCriterion("SN_COLLECTED_STATUS >", value, "snCollectedStatus");
            return (Criteria) this;
        }

        public Criteria andSnCollectedStatusGreaterThanOrEqualTo(String value) {
            addCriterion("SN_COLLECTED_STATUS >=", value, "snCollectedStatus");
            return (Criteria) this;
        }

        public Criteria andSnCollectedStatusLessThan(String value) {
            addCriterion("SN_COLLECTED_STATUS <", value, "snCollectedStatus");
            return (Criteria) this;
        }

        public Criteria andSnCollectedStatusLessThanOrEqualTo(String value) {
            addCriterion("SN_COLLECTED_STATUS <=", value, "snCollectedStatus");
            return (Criteria) this;
        }

        public Criteria andSnCollectedStatusLike(String value) {
            addCriterion("SN_COLLECTED_STATUS like", value, "snCollectedStatus");
            return (Criteria) this;
        }

        public Criteria andSnCollectedStatusNotLike(String value) {
            addCriterion("SN_COLLECTED_STATUS not like", value, "snCollectedStatus");
            return (Criteria) this;
        }

        public Criteria andSnCollectedStatusIn(List<String> values) {
            addCriterion("SN_COLLECTED_STATUS in", values, "snCollectedStatus");
            return (Criteria) this;
        }

        public Criteria andSnCollectedStatusNotIn(List<String> values) {
            addCriterion("SN_COLLECTED_STATUS not in", values, "snCollectedStatus");
            return (Criteria) this;
        }

        public Criteria andSnCollectedStatusBetween(String value1, String value2) {
            addCriterion("SN_COLLECTED_STATUS between", value1, value2, "snCollectedStatus");
            return (Criteria) this;
        }

        public Criteria andSnCollectedStatusNotBetween(String value1, String value2) {
            addCriterion("SN_COLLECTED_STATUS not between", value1, value2, "snCollectedStatus");
            return (Criteria) this;
        }

        public Criteria andWipDocnoIsNull() {
            addCriterion("WIP_DOCNO is null");
            return (Criteria) this;
        }

        public Criteria andWipDocnoIsNotNull() {
            addCriterion("WIP_DOCNO is not null");
            return (Criteria) this;
        }

        public Criteria andWipDocnoEqualTo(String value) {
            addCriterion("WIP_DOCNO =", value, "wipDocno");
            return (Criteria) this;
        }

        public Criteria andWipDocnoNotEqualTo(String value) {
            addCriterion("WIP_DOCNO <>", value, "wipDocno");
            return (Criteria) this;
        }

        public Criteria andWipDocnoGreaterThan(String value) {
            addCriterion("WIP_DOCNO >", value, "wipDocno");
            return (Criteria) this;
        }

        public Criteria andWipDocnoGreaterThanOrEqualTo(String value) {
            addCriterion("WIP_DOCNO >=", value, "wipDocno");
            return (Criteria) this;
        }

        public Criteria andWipDocnoLessThan(String value) {
            addCriterion("WIP_DOCNO <", value, "wipDocno");
            return (Criteria) this;
        }

        public Criteria andWipDocnoLessThanOrEqualTo(String value) {
            addCriterion("WIP_DOCNO <=", value, "wipDocno");
            return (Criteria) this;
        }

        public Criteria andWipDocnoLike(String value) {
            addCriterion("WIP_DOCNO like", value, "wipDocno");
            return (Criteria) this;
        }

        public Criteria andWipDocnoNotLike(String value) {
            addCriterion("WIP_DOCNO not like", value, "wipDocno");
            return (Criteria) this;
        }

        public Criteria andWipDocnoIn(List<String> values) {
            addCriterion("WIP_DOCNO in", values, "wipDocno");
            return (Criteria) this;
        }

        public Criteria andWipDocnoNotIn(List<String> values) {
            addCriterion("WIP_DOCNO not in", values, "wipDocno");
            return (Criteria) this;
        }

        public Criteria andWipDocnoBetween(String value1, String value2) {
            addCriterion("WIP_DOCNO between", value1, value2, "wipDocno");
            return (Criteria) this;
        }

        public Criteria andWipDocnoNotBetween(String value1, String value2) {
            addCriterion("WIP_DOCNO not between", value1, value2, "wipDocno");
            return (Criteria) this;
        }

        public Criteria andBudgetAdminUnitIdIsNull() {
            addCriterion("BUDGET_ADMIN_UNIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andBudgetAdminUnitIdIsNotNull() {
            addCriterion("BUDGET_ADMIN_UNIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetAdminUnitIdEqualTo(String value) {
            addCriterion("BUDGET_ADMIN_UNIT_ID =", value, "budgetAdminUnitId");
            return (Criteria) this;
        }

        public Criteria andBudgetAdminUnitIdNotEqualTo(String value) {
            addCriterion("BUDGET_ADMIN_UNIT_ID <>", value, "budgetAdminUnitId");
            return (Criteria) this;
        }

        public Criteria andBudgetAdminUnitIdGreaterThan(String value) {
            addCriterion("BUDGET_ADMIN_UNIT_ID >", value, "budgetAdminUnitId");
            return (Criteria) this;
        }

        public Criteria andBudgetAdminUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("BUDGET_ADMIN_UNIT_ID >=", value, "budgetAdminUnitId");
            return (Criteria) this;
        }

        public Criteria andBudgetAdminUnitIdLessThan(String value) {
            addCriterion("BUDGET_ADMIN_UNIT_ID <", value, "budgetAdminUnitId");
            return (Criteria) this;
        }

        public Criteria andBudgetAdminUnitIdLessThanOrEqualTo(String value) {
            addCriterion("BUDGET_ADMIN_UNIT_ID <=", value, "budgetAdminUnitId");
            return (Criteria) this;
        }

        public Criteria andBudgetAdminUnitIdLike(String value) {
            addCriterion("BUDGET_ADMIN_UNIT_ID like", value, "budgetAdminUnitId");
            return (Criteria) this;
        }

        public Criteria andBudgetAdminUnitIdNotLike(String value) {
            addCriterion("BUDGET_ADMIN_UNIT_ID not like", value, "budgetAdminUnitId");
            return (Criteria) this;
        }

        public Criteria andBudgetAdminUnitIdIn(List<String> values) {
            addCriterion("BUDGET_ADMIN_UNIT_ID in", values, "budgetAdminUnitId");
            return (Criteria) this;
        }

        public Criteria andBudgetAdminUnitIdNotIn(List<String> values) {
            addCriterion("BUDGET_ADMIN_UNIT_ID not in", values, "budgetAdminUnitId");
            return (Criteria) this;
        }

        public Criteria andBudgetAdminUnitIdBetween(String value1, String value2) {
            addCriterion("BUDGET_ADMIN_UNIT_ID between", value1, value2, "budgetAdminUnitId");
            return (Criteria) this;
        }

        public Criteria andBudgetAdminUnitIdNotBetween(String value1, String value2) {
            addCriterion("BUDGET_ADMIN_UNIT_ID not between", value1, value2, "budgetAdminUnitId");
            return (Criteria) this;
        }

        public Criteria andBudgetGroupIdIsNull() {
            addCriterion("BUDGET_GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andBudgetGroupIdIsNotNull() {
            addCriterion("BUDGET_GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetGroupIdEqualTo(String value) {
            addCriterion("BUDGET_GROUP_ID =", value, "budgetGroupId");
            return (Criteria) this;
        }

        public Criteria andBudgetGroupIdNotEqualTo(String value) {
            addCriterion("BUDGET_GROUP_ID <>", value, "budgetGroupId");
            return (Criteria) this;
        }

        public Criteria andBudgetGroupIdGreaterThan(String value) {
            addCriterion("BUDGET_GROUP_ID >", value, "budgetGroupId");
            return (Criteria) this;
        }

        public Criteria andBudgetGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("BUDGET_GROUP_ID >=", value, "budgetGroupId");
            return (Criteria) this;
        }

        public Criteria andBudgetGroupIdLessThan(String value) {
            addCriterion("BUDGET_GROUP_ID <", value, "budgetGroupId");
            return (Criteria) this;
        }

        public Criteria andBudgetGroupIdLessThanOrEqualTo(String value) {
            addCriterion("BUDGET_GROUP_ID <=", value, "budgetGroupId");
            return (Criteria) this;
        }

        public Criteria andBudgetGroupIdLike(String value) {
            addCriterion("BUDGET_GROUP_ID like", value, "budgetGroupId");
            return (Criteria) this;
        }

        public Criteria andBudgetGroupIdNotLike(String value) {
            addCriterion("BUDGET_GROUP_ID not like", value, "budgetGroupId");
            return (Criteria) this;
        }

        public Criteria andBudgetGroupIdIn(List<String> values) {
            addCriterion("BUDGET_GROUP_ID in", values, "budgetGroupId");
            return (Criteria) this;
        }

        public Criteria andBudgetGroupIdNotIn(List<String> values) {
            addCriterion("BUDGET_GROUP_ID not in", values, "budgetGroupId");
            return (Criteria) this;
        }

        public Criteria andBudgetGroupIdBetween(String value1, String value2) {
            addCriterion("BUDGET_GROUP_ID between", value1, value2, "budgetGroupId");
            return (Criteria) this;
        }

        public Criteria andBudgetGroupIdNotBetween(String value1, String value2) {
            addCriterion("BUDGET_GROUP_ID not between", value1, value2, "budgetGroupId");
            return (Criteria) this;
        }

        public Criteria andBudgetItemIdIsNull() {
            addCriterion("BUDGET_ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andBudgetItemIdIsNotNull() {
            addCriterion("BUDGET_ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetItemIdEqualTo(String value) {
            addCriterion("BUDGET_ITEM_ID =", value, "budgetItemId");
            return (Criteria) this;
        }

        public Criteria andBudgetItemIdNotEqualTo(String value) {
            addCriterion("BUDGET_ITEM_ID <>", value, "budgetItemId");
            return (Criteria) this;
        }

        public Criteria andBudgetItemIdGreaterThan(String value) {
            addCriterion("BUDGET_ITEM_ID >", value, "budgetItemId");
            return (Criteria) this;
        }

        public Criteria andBudgetItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("BUDGET_ITEM_ID >=", value, "budgetItemId");
            return (Criteria) this;
        }

        public Criteria andBudgetItemIdLessThan(String value) {
            addCriterion("BUDGET_ITEM_ID <", value, "budgetItemId");
            return (Criteria) this;
        }

        public Criteria andBudgetItemIdLessThanOrEqualTo(String value) {
            addCriterion("BUDGET_ITEM_ID <=", value, "budgetItemId");
            return (Criteria) this;
        }

        public Criteria andBudgetItemIdLike(String value) {
            addCriterion("BUDGET_ITEM_ID like", value, "budgetItemId");
            return (Criteria) this;
        }

        public Criteria andBudgetItemIdNotLike(String value) {
            addCriterion("BUDGET_ITEM_ID not like", value, "budgetItemId");
            return (Criteria) this;
        }

        public Criteria andBudgetItemIdIn(List<String> values) {
            addCriterion("BUDGET_ITEM_ID in", values, "budgetItemId");
            return (Criteria) this;
        }

        public Criteria andBudgetItemIdNotIn(List<String> values) {
            addCriterion("BUDGET_ITEM_ID not in", values, "budgetItemId");
            return (Criteria) this;
        }

        public Criteria andBudgetItemIdBetween(String value1, String value2) {
            addCriterion("BUDGET_ITEM_ID between", value1, value2, "budgetItemId");
            return (Criteria) this;
        }

        public Criteria andBudgetItemIdNotBetween(String value1, String value2) {
            addCriterion("BUDGET_ITEM_ID not between", value1, value2, "budgetItemId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdIsNull() {
            addCriterion("BUDGET_ID is null");
            return (Criteria) this;
        }

        public Criteria andBudgetIdIsNotNull() {
            addCriterion("BUDGET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetIdEqualTo(String value) {
            addCriterion("BUDGET_ID =", value, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdNotEqualTo(String value) {
            addCriterion("BUDGET_ID <>", value, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdGreaterThan(String value) {
            addCriterion("BUDGET_ID >", value, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdGreaterThanOrEqualTo(String value) {
            addCriterion("BUDGET_ID >=", value, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdLessThan(String value) {
            addCriterion("BUDGET_ID <", value, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdLessThanOrEqualTo(String value) {
            addCriterion("BUDGET_ID <=", value, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdLike(String value) {
            addCriterion("BUDGET_ID like", value, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdNotLike(String value) {
            addCriterion("BUDGET_ID not like", value, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdIn(List<String> values) {
            addCriterion("BUDGET_ID in", values, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdNotIn(List<String> values) {
            addCriterion("BUDGET_ID not in", values, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdBetween(String value1, String value2) {
            addCriterion("BUDGET_ID between", value1, value2, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdNotBetween(String value1, String value2) {
            addCriterion("BUDGET_ID not between", value1, value2, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetDIdIsNull() {
            addCriterion("BUDGET_D_ID is null");
            return (Criteria) this;
        }

        public Criteria andBudgetDIdIsNotNull() {
            addCriterion("BUDGET_D_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetDIdEqualTo(String value) {
            addCriterion("BUDGET_D_ID =", value, "budgetDId");
            return (Criteria) this;
        }

        public Criteria andBudgetDIdNotEqualTo(String value) {
            addCriterion("BUDGET_D_ID <>", value, "budgetDId");
            return (Criteria) this;
        }

        public Criteria andBudgetDIdGreaterThan(String value) {
            addCriterion("BUDGET_D_ID >", value, "budgetDId");
            return (Criteria) this;
        }

        public Criteria andBudgetDIdGreaterThanOrEqualTo(String value) {
            addCriterion("BUDGET_D_ID >=", value, "budgetDId");
            return (Criteria) this;
        }

        public Criteria andBudgetDIdLessThan(String value) {
            addCriterion("BUDGET_D_ID <", value, "budgetDId");
            return (Criteria) this;
        }

        public Criteria andBudgetDIdLessThanOrEqualTo(String value) {
            addCriterion("BUDGET_D_ID <=", value, "budgetDId");
            return (Criteria) this;
        }

        public Criteria andBudgetDIdLike(String value) {
            addCriterion("BUDGET_D_ID like", value, "budgetDId");
            return (Criteria) this;
        }

        public Criteria andBudgetDIdNotLike(String value) {
            addCriterion("BUDGET_D_ID not like", value, "budgetDId");
            return (Criteria) this;
        }

        public Criteria andBudgetDIdIn(List<String> values) {
            addCriterion("BUDGET_D_ID in", values, "budgetDId");
            return (Criteria) this;
        }

        public Criteria andBudgetDIdNotIn(List<String> values) {
            addCriterion("BUDGET_D_ID not in", values, "budgetDId");
            return (Criteria) this;
        }

        public Criteria andBudgetDIdBetween(String value1, String value2) {
            addCriterion("BUDGET_D_ID between", value1, value2, "budgetDId");
            return (Criteria) this;
        }

        public Criteria andBudgetDIdNotBetween(String value1, String value2) {
            addCriterion("BUDGET_D_ID not between", value1, value2, "budgetDId");
            return (Criteria) this;
        }

        public Criteria andPreBudgetIdIsNull() {
            addCriterion("PRE_BUDGET_ID is null");
            return (Criteria) this;
        }

        public Criteria andPreBudgetIdIsNotNull() {
            addCriterion("PRE_BUDGET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPreBudgetIdEqualTo(String value) {
            addCriterion("PRE_BUDGET_ID =", value, "preBudgetId");
            return (Criteria) this;
        }

        public Criteria andPreBudgetIdNotEqualTo(String value) {
            addCriterion("PRE_BUDGET_ID <>", value, "preBudgetId");
            return (Criteria) this;
        }

        public Criteria andPreBudgetIdGreaterThan(String value) {
            addCriterion("PRE_BUDGET_ID >", value, "preBudgetId");
            return (Criteria) this;
        }

        public Criteria andPreBudgetIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRE_BUDGET_ID >=", value, "preBudgetId");
            return (Criteria) this;
        }

        public Criteria andPreBudgetIdLessThan(String value) {
            addCriterion("PRE_BUDGET_ID <", value, "preBudgetId");
            return (Criteria) this;
        }

        public Criteria andPreBudgetIdLessThanOrEqualTo(String value) {
            addCriterion("PRE_BUDGET_ID <=", value, "preBudgetId");
            return (Criteria) this;
        }

        public Criteria andPreBudgetIdLike(String value) {
            addCriterion("PRE_BUDGET_ID like", value, "preBudgetId");
            return (Criteria) this;
        }

        public Criteria andPreBudgetIdNotLike(String value) {
            addCriterion("PRE_BUDGET_ID not like", value, "preBudgetId");
            return (Criteria) this;
        }

        public Criteria andPreBudgetIdIn(List<String> values) {
            addCriterion("PRE_BUDGET_ID in", values, "preBudgetId");
            return (Criteria) this;
        }

        public Criteria andPreBudgetIdNotIn(List<String> values) {
            addCriterion("PRE_BUDGET_ID not in", values, "preBudgetId");
            return (Criteria) this;
        }

        public Criteria andPreBudgetIdBetween(String value1, String value2) {
            addCriterion("PRE_BUDGET_ID between", value1, value2, "preBudgetId");
            return (Criteria) this;
        }

        public Criteria andPreBudgetIdNotBetween(String value1, String value2) {
            addCriterion("PRE_BUDGET_ID not between", value1, value2, "preBudgetId");
            return (Criteria) this;
        }

        public Criteria andPreBudgetDIdIsNull() {
            addCriterion("PRE_BUDGET_D_ID is null");
            return (Criteria) this;
        }

        public Criteria andPreBudgetDIdIsNotNull() {
            addCriterion("PRE_BUDGET_D_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPreBudgetDIdEqualTo(String value) {
            addCriterion("PRE_BUDGET_D_ID =", value, "preBudgetDId");
            return (Criteria) this;
        }

        public Criteria andPreBudgetDIdNotEqualTo(String value) {
            addCriterion("PRE_BUDGET_D_ID <>", value, "preBudgetDId");
            return (Criteria) this;
        }

        public Criteria andPreBudgetDIdGreaterThan(String value) {
            addCriterion("PRE_BUDGET_D_ID >", value, "preBudgetDId");
            return (Criteria) this;
        }

        public Criteria andPreBudgetDIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRE_BUDGET_D_ID >=", value, "preBudgetDId");
            return (Criteria) this;
        }

        public Criteria andPreBudgetDIdLessThan(String value) {
            addCriterion("PRE_BUDGET_D_ID <", value, "preBudgetDId");
            return (Criteria) this;
        }

        public Criteria andPreBudgetDIdLessThanOrEqualTo(String value) {
            addCriterion("PRE_BUDGET_D_ID <=", value, "preBudgetDId");
            return (Criteria) this;
        }

        public Criteria andPreBudgetDIdLike(String value) {
            addCriterion("PRE_BUDGET_D_ID like", value, "preBudgetDId");
            return (Criteria) this;
        }

        public Criteria andPreBudgetDIdNotLike(String value) {
            addCriterion("PRE_BUDGET_D_ID not like", value, "preBudgetDId");
            return (Criteria) this;
        }

        public Criteria andPreBudgetDIdIn(List<String> values) {
            addCriterion("PRE_BUDGET_D_ID in", values, "preBudgetDId");
            return (Criteria) this;
        }

        public Criteria andPreBudgetDIdNotIn(List<String> values) {
            addCriterion("PRE_BUDGET_D_ID not in", values, "preBudgetDId");
            return (Criteria) this;
        }

        public Criteria andPreBudgetDIdBetween(String value1, String value2) {
            addCriterion("PRE_BUDGET_D_ID between", value1, value2, "preBudgetDId");
            return (Criteria) this;
        }

        public Criteria andPreBudgetDIdNotBetween(String value1, String value2) {
            addCriterion("PRE_BUDGET_D_ID not between", value1, value2, "preBudgetDId");
            return (Criteria) this;
        }

        public Criteria andInnerOrderDocSdIdIsNull() {
            addCriterion("INNER_ORDER_DOC_SD_ID is null");
            return (Criteria) this;
        }

        public Criteria andInnerOrderDocSdIdIsNotNull() {
            addCriterion("INNER_ORDER_DOC_SD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInnerOrderDocSdIdEqualTo(String value) {
            addCriterion("INNER_ORDER_DOC_SD_ID =", value, "innerOrderDocSdId");
            return (Criteria) this;
        }

        public Criteria andInnerOrderDocSdIdNotEqualTo(String value) {
            addCriterion("INNER_ORDER_DOC_SD_ID <>", value, "innerOrderDocSdId");
            return (Criteria) this;
        }

        public Criteria andInnerOrderDocSdIdGreaterThan(String value) {
            addCriterion("INNER_ORDER_DOC_SD_ID >", value, "innerOrderDocSdId");
            return (Criteria) this;
        }

        public Criteria andInnerOrderDocSdIdGreaterThanOrEqualTo(String value) {
            addCriterion("INNER_ORDER_DOC_SD_ID >=", value, "innerOrderDocSdId");
            return (Criteria) this;
        }

        public Criteria andInnerOrderDocSdIdLessThan(String value) {
            addCriterion("INNER_ORDER_DOC_SD_ID <", value, "innerOrderDocSdId");
            return (Criteria) this;
        }

        public Criteria andInnerOrderDocSdIdLessThanOrEqualTo(String value) {
            addCriterion("INNER_ORDER_DOC_SD_ID <=", value, "innerOrderDocSdId");
            return (Criteria) this;
        }

        public Criteria andInnerOrderDocSdIdLike(String value) {
            addCriterion("INNER_ORDER_DOC_SD_ID like", value, "innerOrderDocSdId");
            return (Criteria) this;
        }

        public Criteria andInnerOrderDocSdIdNotLike(String value) {
            addCriterion("INNER_ORDER_DOC_SD_ID not like", value, "innerOrderDocSdId");
            return (Criteria) this;
        }

        public Criteria andInnerOrderDocSdIdIn(List<String> values) {
            addCriterion("INNER_ORDER_DOC_SD_ID in", values, "innerOrderDocSdId");
            return (Criteria) this;
        }

        public Criteria andInnerOrderDocSdIdNotIn(List<String> values) {
            addCriterion("INNER_ORDER_DOC_SD_ID not in", values, "innerOrderDocSdId");
            return (Criteria) this;
        }

        public Criteria andInnerOrderDocSdIdBetween(String value1, String value2) {
            addCriterion("INNER_ORDER_DOC_SD_ID between", value1, value2, "innerOrderDocSdId");
            return (Criteria) this;
        }

        public Criteria andInnerOrderDocSdIdNotBetween(String value1, String value2) {
            addCriterion("INNER_ORDER_DOC_SD_ID not between", value1, value2, "innerOrderDocSdId");
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

        public Criteria andReferenceSourceIdRtkIsNull() {
            addCriterion("REFERENCE_SOURCE_ID_RTK is null");
            return (Criteria) this;
        }

        public Criteria andReferenceSourceIdRtkIsNotNull() {
            addCriterion("REFERENCE_SOURCE_ID_RTK is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceSourceIdRtkEqualTo(String value) {
            addCriterion("REFERENCE_SOURCE_ID_RTK =", value, "referenceSourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andReferenceSourceIdRtkNotEqualTo(String value) {
            addCriterion("REFERENCE_SOURCE_ID_RTK <>", value, "referenceSourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andReferenceSourceIdRtkGreaterThan(String value) {
            addCriterion("REFERENCE_SOURCE_ID_RTK >", value, "referenceSourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andReferenceSourceIdRtkGreaterThanOrEqualTo(String value) {
            addCriterion("REFERENCE_SOURCE_ID_RTK >=", value, "referenceSourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andReferenceSourceIdRtkLessThan(String value) {
            addCriterion("REFERENCE_SOURCE_ID_RTK <", value, "referenceSourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andReferenceSourceIdRtkLessThanOrEqualTo(String value) {
            addCriterion("REFERENCE_SOURCE_ID_RTK <=", value, "referenceSourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andReferenceSourceIdRtkLike(String value) {
            addCriterion("REFERENCE_SOURCE_ID_RTK like", value, "referenceSourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andReferenceSourceIdRtkNotLike(String value) {
            addCriterion("REFERENCE_SOURCE_ID_RTK not like", value, "referenceSourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andReferenceSourceIdRtkIn(List<String> values) {
            addCriterion("REFERENCE_SOURCE_ID_RTK in", values, "referenceSourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andReferenceSourceIdRtkNotIn(List<String> values) {
            addCriterion("REFERENCE_SOURCE_ID_RTK not in", values, "referenceSourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andReferenceSourceIdRtkBetween(String value1, String value2) {
            addCriterion("REFERENCE_SOURCE_ID_RTK between", value1, value2, "referenceSourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andReferenceSourceIdRtkNotBetween(String value1, String value2) {
            addCriterion("REFERENCE_SOURCE_ID_RTK not between", value1, value2, "referenceSourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andReferenceSourceIdRoidIsNull() {
            addCriterion("REFERENCE_SOURCE_ID_ROid is null");
            return (Criteria) this;
        }

        public Criteria andReferenceSourceIdRoidIsNotNull() {
            addCriterion("REFERENCE_SOURCE_ID_ROid is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceSourceIdRoidEqualTo(String value) {
            addCriterion("REFERENCE_SOURCE_ID_ROid =", value, "referenceSourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andReferenceSourceIdRoidNotEqualTo(String value) {
            addCriterion("REFERENCE_SOURCE_ID_ROid <>", value, "referenceSourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andReferenceSourceIdRoidGreaterThan(String value) {
            addCriterion("REFERENCE_SOURCE_ID_ROid >", value, "referenceSourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andReferenceSourceIdRoidGreaterThanOrEqualTo(String value) {
            addCriterion("REFERENCE_SOURCE_ID_ROid >=", value, "referenceSourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andReferenceSourceIdRoidLessThan(String value) {
            addCriterion("REFERENCE_SOURCE_ID_ROid <", value, "referenceSourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andReferenceSourceIdRoidLessThanOrEqualTo(String value) {
            addCriterion("REFERENCE_SOURCE_ID_ROid <=", value, "referenceSourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andReferenceSourceIdRoidLike(String value) {
            addCriterion("REFERENCE_SOURCE_ID_ROid like", value, "referenceSourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andReferenceSourceIdRoidNotLike(String value) {
            addCriterion("REFERENCE_SOURCE_ID_ROid not like", value, "referenceSourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andReferenceSourceIdRoidIn(List<String> values) {
            addCriterion("REFERENCE_SOURCE_ID_ROid in", values, "referenceSourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andReferenceSourceIdRoidNotIn(List<String> values) {
            addCriterion("REFERENCE_SOURCE_ID_ROid not in", values, "referenceSourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andReferenceSourceIdRoidBetween(String value1, String value2) {
            addCriterion("REFERENCE_SOURCE_ID_ROid between", value1, value2, "referenceSourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andReferenceSourceIdRoidNotBetween(String value1, String value2) {
            addCriterion("REFERENCE_SOURCE_ID_ROid not between", value1, value2, "referenceSourceIdRoid");
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

        public Criteria andSourceOrderRtkIsNull() {
            addCriterion("SOURCE_ORDER_RTK is null");
            return (Criteria) this;
        }

        public Criteria andSourceOrderRtkIsNotNull() {
            addCriterion("SOURCE_ORDER_RTK is not null");
            return (Criteria) this;
        }

        public Criteria andSourceOrderRtkEqualTo(String value) {
            addCriterion("SOURCE_ORDER_RTK =", value, "sourceOrderRtk");
            return (Criteria) this;
        }

        public Criteria andSourceOrderRtkNotEqualTo(String value) {
            addCriterion("SOURCE_ORDER_RTK <>", value, "sourceOrderRtk");
            return (Criteria) this;
        }

        public Criteria andSourceOrderRtkGreaterThan(String value) {
            addCriterion("SOURCE_ORDER_RTK >", value, "sourceOrderRtk");
            return (Criteria) this;
        }

        public Criteria andSourceOrderRtkGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_ORDER_RTK >=", value, "sourceOrderRtk");
            return (Criteria) this;
        }

        public Criteria andSourceOrderRtkLessThan(String value) {
            addCriterion("SOURCE_ORDER_RTK <", value, "sourceOrderRtk");
            return (Criteria) this;
        }

        public Criteria andSourceOrderRtkLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_ORDER_RTK <=", value, "sourceOrderRtk");
            return (Criteria) this;
        }

        public Criteria andSourceOrderRtkLike(String value) {
            addCriterion("SOURCE_ORDER_RTK like", value, "sourceOrderRtk");
            return (Criteria) this;
        }

        public Criteria andSourceOrderRtkNotLike(String value) {
            addCriterion("SOURCE_ORDER_RTK not like", value, "sourceOrderRtk");
            return (Criteria) this;
        }

        public Criteria andSourceOrderRtkIn(List<String> values) {
            addCriterion("SOURCE_ORDER_RTK in", values, "sourceOrderRtk");
            return (Criteria) this;
        }

        public Criteria andSourceOrderRtkNotIn(List<String> values) {
            addCriterion("SOURCE_ORDER_RTK not in", values, "sourceOrderRtk");
            return (Criteria) this;
        }

        public Criteria andSourceOrderRtkBetween(String value1, String value2) {
            addCriterion("SOURCE_ORDER_RTK between", value1, value2, "sourceOrderRtk");
            return (Criteria) this;
        }

        public Criteria andSourceOrderRtkNotBetween(String value1, String value2) {
            addCriterion("SOURCE_ORDER_RTK not between", value1, value2, "sourceOrderRtk");
            return (Criteria) this;
        }

        public Criteria andSourceOrderRoidIsNull() {
            addCriterion("SOURCE_ORDER_ROid is null");
            return (Criteria) this;
        }

        public Criteria andSourceOrderRoidIsNotNull() {
            addCriterion("SOURCE_ORDER_ROid is not null");
            return (Criteria) this;
        }

        public Criteria andSourceOrderRoidEqualTo(String value) {
            addCriterion("SOURCE_ORDER_ROid =", value, "sourceOrderRoid");
            return (Criteria) this;
        }

        public Criteria andSourceOrderRoidNotEqualTo(String value) {
            addCriterion("SOURCE_ORDER_ROid <>", value, "sourceOrderRoid");
            return (Criteria) this;
        }

        public Criteria andSourceOrderRoidGreaterThan(String value) {
            addCriterion("SOURCE_ORDER_ROid >", value, "sourceOrderRoid");
            return (Criteria) this;
        }

        public Criteria andSourceOrderRoidGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_ORDER_ROid >=", value, "sourceOrderRoid");
            return (Criteria) this;
        }

        public Criteria andSourceOrderRoidLessThan(String value) {
            addCriterion("SOURCE_ORDER_ROid <", value, "sourceOrderRoid");
            return (Criteria) this;
        }

        public Criteria andSourceOrderRoidLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_ORDER_ROid <=", value, "sourceOrderRoid");
            return (Criteria) this;
        }

        public Criteria andSourceOrderRoidLike(String value) {
            addCriterion("SOURCE_ORDER_ROid like", value, "sourceOrderRoid");
            return (Criteria) this;
        }

        public Criteria andSourceOrderRoidNotLike(String value) {
            addCriterion("SOURCE_ORDER_ROid not like", value, "sourceOrderRoid");
            return (Criteria) this;
        }

        public Criteria andSourceOrderRoidIn(List<String> values) {
            addCriterion("SOURCE_ORDER_ROid in", values, "sourceOrderRoid");
            return (Criteria) this;
        }

        public Criteria andSourceOrderRoidNotIn(List<String> values) {
            addCriterion("SOURCE_ORDER_ROid not in", values, "sourceOrderRoid");
            return (Criteria) this;
        }

        public Criteria andSourceOrderRoidBetween(String value1, String value2) {
            addCriterion("SOURCE_ORDER_ROid between", value1, value2, "sourceOrderRoid");
            return (Criteria) this;
        }

        public Criteria andSourceOrderRoidNotBetween(String value1, String value2) {
            addCriterion("SOURCE_ORDER_ROid not between", value1, value2, "sourceOrderRoid");
            return (Criteria) this;
        }

        public Criteria andSynergySourceIdRtkIsNull() {
            addCriterion("SYNERGY_SOURCE_ID_RTK is null");
            return (Criteria) this;
        }

        public Criteria andSynergySourceIdRtkIsNotNull() {
            addCriterion("SYNERGY_SOURCE_ID_RTK is not null");
            return (Criteria) this;
        }

        public Criteria andSynergySourceIdRtkEqualTo(String value) {
            addCriterion("SYNERGY_SOURCE_ID_RTK =", value, "synergySourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andSynergySourceIdRtkNotEqualTo(String value) {
            addCriterion("SYNERGY_SOURCE_ID_RTK <>", value, "synergySourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andSynergySourceIdRtkGreaterThan(String value) {
            addCriterion("SYNERGY_SOURCE_ID_RTK >", value, "synergySourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andSynergySourceIdRtkGreaterThanOrEqualTo(String value) {
            addCriterion("SYNERGY_SOURCE_ID_RTK >=", value, "synergySourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andSynergySourceIdRtkLessThan(String value) {
            addCriterion("SYNERGY_SOURCE_ID_RTK <", value, "synergySourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andSynergySourceIdRtkLessThanOrEqualTo(String value) {
            addCriterion("SYNERGY_SOURCE_ID_RTK <=", value, "synergySourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andSynergySourceIdRtkLike(String value) {
            addCriterion("SYNERGY_SOURCE_ID_RTK like", value, "synergySourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andSynergySourceIdRtkNotLike(String value) {
            addCriterion("SYNERGY_SOURCE_ID_RTK not like", value, "synergySourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andSynergySourceIdRtkIn(List<String> values) {
            addCriterion("SYNERGY_SOURCE_ID_RTK in", values, "synergySourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andSynergySourceIdRtkNotIn(List<String> values) {
            addCriterion("SYNERGY_SOURCE_ID_RTK not in", values, "synergySourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andSynergySourceIdRtkBetween(String value1, String value2) {
            addCriterion("SYNERGY_SOURCE_ID_RTK between", value1, value2, "synergySourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andSynergySourceIdRtkNotBetween(String value1, String value2) {
            addCriterion("SYNERGY_SOURCE_ID_RTK not between", value1, value2, "synergySourceIdRtk");
            return (Criteria) this;
        }

        public Criteria andSynergySourceIdRoidIsNull() {
            addCriterion("SYNERGY_SOURCE_ID_ROid is null");
            return (Criteria) this;
        }

        public Criteria andSynergySourceIdRoidIsNotNull() {
            addCriterion("SYNERGY_SOURCE_ID_ROid is not null");
            return (Criteria) this;
        }

        public Criteria andSynergySourceIdRoidEqualTo(String value) {
            addCriterion("SYNERGY_SOURCE_ID_ROid =", value, "synergySourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andSynergySourceIdRoidNotEqualTo(String value) {
            addCriterion("SYNERGY_SOURCE_ID_ROid <>", value, "synergySourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andSynergySourceIdRoidGreaterThan(String value) {
            addCriterion("SYNERGY_SOURCE_ID_ROid >", value, "synergySourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andSynergySourceIdRoidGreaterThanOrEqualTo(String value) {
            addCriterion("SYNERGY_SOURCE_ID_ROid >=", value, "synergySourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andSynergySourceIdRoidLessThan(String value) {
            addCriterion("SYNERGY_SOURCE_ID_ROid <", value, "synergySourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andSynergySourceIdRoidLessThanOrEqualTo(String value) {
            addCriterion("SYNERGY_SOURCE_ID_ROid <=", value, "synergySourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andSynergySourceIdRoidLike(String value) {
            addCriterion("SYNERGY_SOURCE_ID_ROid like", value, "synergySourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andSynergySourceIdRoidNotLike(String value) {
            addCriterion("SYNERGY_SOURCE_ID_ROid not like", value, "synergySourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andSynergySourceIdRoidIn(List<String> values) {
            addCriterion("SYNERGY_SOURCE_ID_ROid in", values, "synergySourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andSynergySourceIdRoidNotIn(List<String> values) {
            addCriterion("SYNERGY_SOURCE_ID_ROid not in", values, "synergySourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andSynergySourceIdRoidBetween(String value1, String value2) {
            addCriterion("SYNERGY_SOURCE_ID_ROid between", value1, value2, "synergySourceIdRoid");
            return (Criteria) this;
        }

        public Criteria andSynergySourceIdRoidNotBetween(String value1, String value2) {
            addCriterion("SYNERGY_SOURCE_ID_ROid not between", value1, value2, "synergySourceIdRoid");
            return (Criteria) this;
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