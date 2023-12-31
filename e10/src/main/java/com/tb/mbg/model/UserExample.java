package com.tb.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
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

        public Criteria andLogonnameIsNull() {
            addCriterion("LOGONNAME is null");
            return (Criteria) this;
        }

        public Criteria andLogonnameIsNotNull() {
            addCriterion("LOGONNAME is not null");
            return (Criteria) this;
        }

        public Criteria andLogonnameEqualTo(String value) {
            addCriterion("LOGONNAME =", value, "logonname");
            return (Criteria) this;
        }

        public Criteria andLogonnameNotEqualTo(String value) {
            addCriterion("LOGONNAME <>", value, "logonname");
            return (Criteria) this;
        }

        public Criteria andLogonnameGreaterThan(String value) {
            addCriterion("LOGONNAME >", value, "logonname");
            return (Criteria) this;
        }

        public Criteria andLogonnameGreaterThanOrEqualTo(String value) {
            addCriterion("LOGONNAME >=", value, "logonname");
            return (Criteria) this;
        }

        public Criteria andLogonnameLessThan(String value) {
            addCriterion("LOGONNAME <", value, "logonname");
            return (Criteria) this;
        }

        public Criteria andLogonnameLessThanOrEqualTo(String value) {
            addCriterion("LOGONNAME <=", value, "logonname");
            return (Criteria) this;
        }

        public Criteria andLogonnameLike(String value) {
            addCriterion("LOGONNAME like", value, "logonname");
            return (Criteria) this;
        }

        public Criteria andLogonnameNotLike(String value) {
            addCriterion("LOGONNAME not like", value, "logonname");
            return (Criteria) this;
        }

        public Criteria andLogonnameIn(List<String> values) {
            addCriterion("LOGONNAME in", values, "logonname");
            return (Criteria) this;
        }

        public Criteria andLogonnameNotIn(List<String> values) {
            addCriterion("LOGONNAME not in", values, "logonname");
            return (Criteria) this;
        }

        public Criteria andLogonnameBetween(String value1, String value2) {
            addCriterion("LOGONNAME between", value1, value2, "logonname");
            return (Criteria) this;
        }

        public Criteria andLogonnameNotBetween(String value1, String value2) {
            addCriterion("LOGONNAME not between", value1, value2, "logonname");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("USER_TYPE like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("USER_TYPE not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("USER_TYPE not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andSecurityidentityIsNull() {
            addCriterion("SECURITYIDENTITY is null");
            return (Criteria) this;
        }

        public Criteria andSecurityidentityIsNotNull() {
            addCriterion("SECURITYIDENTITY is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityidentityEqualTo(String value) {
            addCriterion("SECURITYIDENTITY =", value, "securityidentity");
            return (Criteria) this;
        }

        public Criteria andSecurityidentityNotEqualTo(String value) {
            addCriterion("SECURITYIDENTITY <>", value, "securityidentity");
            return (Criteria) this;
        }

        public Criteria andSecurityidentityGreaterThan(String value) {
            addCriterion("SECURITYIDENTITY >", value, "securityidentity");
            return (Criteria) this;
        }

        public Criteria andSecurityidentityGreaterThanOrEqualTo(String value) {
            addCriterion("SECURITYIDENTITY >=", value, "securityidentity");
            return (Criteria) this;
        }

        public Criteria andSecurityidentityLessThan(String value) {
            addCriterion("SECURITYIDENTITY <", value, "securityidentity");
            return (Criteria) this;
        }

        public Criteria andSecurityidentityLessThanOrEqualTo(String value) {
            addCriterion("SECURITYIDENTITY <=", value, "securityidentity");
            return (Criteria) this;
        }

        public Criteria andSecurityidentityLike(String value) {
            addCriterion("SECURITYIDENTITY like", value, "securityidentity");
            return (Criteria) this;
        }

        public Criteria andSecurityidentityNotLike(String value) {
            addCriterion("SECURITYIDENTITY not like", value, "securityidentity");
            return (Criteria) this;
        }

        public Criteria andSecurityidentityIn(List<String> values) {
            addCriterion("SECURITYIDENTITY in", values, "securityidentity");
            return (Criteria) this;
        }

        public Criteria andSecurityidentityNotIn(List<String> values) {
            addCriterion("SECURITYIDENTITY not in", values, "securityidentity");
            return (Criteria) this;
        }

        public Criteria andSecurityidentityBetween(String value1, String value2) {
            addCriterion("SECURITYIDENTITY between", value1, value2, "securityidentity");
            return (Criteria) this;
        }

        public Criteria andSecurityidentityNotBetween(String value1, String value2) {
            addCriterion("SECURITYIDENTITY not between", value1, value2, "securityidentity");
            return (Criteria) this;
        }

        public Criteria andDomainusernameIsNull() {
            addCriterion("DOMAINUSERNAME is null");
            return (Criteria) this;
        }

        public Criteria andDomainusernameIsNotNull() {
            addCriterion("DOMAINUSERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDomainusernameEqualTo(String value) {
            addCriterion("DOMAINUSERNAME =", value, "domainusername");
            return (Criteria) this;
        }

        public Criteria andDomainusernameNotEqualTo(String value) {
            addCriterion("DOMAINUSERNAME <>", value, "domainusername");
            return (Criteria) this;
        }

        public Criteria andDomainusernameGreaterThan(String value) {
            addCriterion("DOMAINUSERNAME >", value, "domainusername");
            return (Criteria) this;
        }

        public Criteria andDomainusernameGreaterThanOrEqualTo(String value) {
            addCriterion("DOMAINUSERNAME >=", value, "domainusername");
            return (Criteria) this;
        }

        public Criteria andDomainusernameLessThan(String value) {
            addCriterion("DOMAINUSERNAME <", value, "domainusername");
            return (Criteria) this;
        }

        public Criteria andDomainusernameLessThanOrEqualTo(String value) {
            addCriterion("DOMAINUSERNAME <=", value, "domainusername");
            return (Criteria) this;
        }

        public Criteria andDomainusernameLike(String value) {
            addCriterion("DOMAINUSERNAME like", value, "domainusername");
            return (Criteria) this;
        }

        public Criteria andDomainusernameNotLike(String value) {
            addCriterion("DOMAINUSERNAME not like", value, "domainusername");
            return (Criteria) this;
        }

        public Criteria andDomainusernameIn(List<String> values) {
            addCriterion("DOMAINUSERNAME in", values, "domainusername");
            return (Criteria) this;
        }

        public Criteria andDomainusernameNotIn(List<String> values) {
            addCriterion("DOMAINUSERNAME not in", values, "domainusername");
            return (Criteria) this;
        }

        public Criteria andDomainusernameBetween(String value1, String value2) {
            addCriterion("DOMAINUSERNAME between", value1, value2, "domainusername");
            return (Criteria) this;
        }

        public Criteria andDomainusernameNotBetween(String value1, String value2) {
            addCriterion("DOMAINUSERNAME not between", value1, value2, "domainusername");
            return (Criteria) this;
        }

        public Criteria andSecuritydomainusernameIsNull() {
            addCriterion("SECURITYDOMAINUSERNAME is null");
            return (Criteria) this;
        }

        public Criteria andSecuritydomainusernameIsNotNull() {
            addCriterion("SECURITYDOMAINUSERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSecuritydomainusernameEqualTo(String value) {
            addCriterion("SECURITYDOMAINUSERNAME =", value, "securitydomainusername");
            return (Criteria) this;
        }

        public Criteria andSecuritydomainusernameNotEqualTo(String value) {
            addCriterion("SECURITYDOMAINUSERNAME <>", value, "securitydomainusername");
            return (Criteria) this;
        }

        public Criteria andSecuritydomainusernameGreaterThan(String value) {
            addCriterion("SECURITYDOMAINUSERNAME >", value, "securitydomainusername");
            return (Criteria) this;
        }

        public Criteria andSecuritydomainusernameGreaterThanOrEqualTo(String value) {
            addCriterion("SECURITYDOMAINUSERNAME >=", value, "securitydomainusername");
            return (Criteria) this;
        }

        public Criteria andSecuritydomainusernameLessThan(String value) {
            addCriterion("SECURITYDOMAINUSERNAME <", value, "securitydomainusername");
            return (Criteria) this;
        }

        public Criteria andSecuritydomainusernameLessThanOrEqualTo(String value) {
            addCriterion("SECURITYDOMAINUSERNAME <=", value, "securitydomainusername");
            return (Criteria) this;
        }

        public Criteria andSecuritydomainusernameLike(String value) {
            addCriterion("SECURITYDOMAINUSERNAME like", value, "securitydomainusername");
            return (Criteria) this;
        }

        public Criteria andSecuritydomainusernameNotLike(String value) {
            addCriterion("SECURITYDOMAINUSERNAME not like", value, "securitydomainusername");
            return (Criteria) this;
        }

        public Criteria andSecuritydomainusernameIn(List<String> values) {
            addCriterion("SECURITYDOMAINUSERNAME in", values, "securitydomainusername");
            return (Criteria) this;
        }

        public Criteria andSecuritydomainusernameNotIn(List<String> values) {
            addCriterion("SECURITYDOMAINUSERNAME not in", values, "securitydomainusername");
            return (Criteria) this;
        }

        public Criteria andSecuritydomainusernameBetween(String value1, String value2) {
            addCriterion("SECURITYDOMAINUSERNAME between", value1, value2, "securitydomainusername");
            return (Criteria) this;
        }

        public Criteria andSecuritydomainusernameNotBetween(String value1, String value2) {
            addCriterion("SECURITYDOMAINUSERNAME not between", value1, value2, "securitydomainusername");
            return (Criteria) this;
        }

        public Criteria andLogontimeIsNull() {
            addCriterion("LOGONTIME is null");
            return (Criteria) this;
        }

        public Criteria andLogontimeIsNotNull() {
            addCriterion("LOGONTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLogontimeEqualTo(Date value) {
            addCriterion("LOGONTIME =", value, "logontime");
            return (Criteria) this;
        }

        public Criteria andLogontimeNotEqualTo(Date value) {
            addCriterion("LOGONTIME <>", value, "logontime");
            return (Criteria) this;
        }

        public Criteria andLogontimeGreaterThan(Date value) {
            addCriterion("LOGONTIME >", value, "logontime");
            return (Criteria) this;
        }

        public Criteria andLogontimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LOGONTIME >=", value, "logontime");
            return (Criteria) this;
        }

        public Criteria andLogontimeLessThan(Date value) {
            addCriterion("LOGONTIME <", value, "logontime");
            return (Criteria) this;
        }

        public Criteria andLogontimeLessThanOrEqualTo(Date value) {
            addCriterion("LOGONTIME <=", value, "logontime");
            return (Criteria) this;
        }

        public Criteria andLogontimeIn(List<Date> values) {
            addCriterion("LOGONTIME in", values, "logontime");
            return (Criteria) this;
        }

        public Criteria andLogontimeNotIn(List<Date> values) {
            addCriterion("LOGONTIME not in", values, "logontime");
            return (Criteria) this;
        }

        public Criteria andLogontimeBetween(Date value1, Date value2) {
            addCriterion("LOGONTIME between", value1, value2, "logontime");
            return (Criteria) this;
        }

        public Criteria andLogontimeNotBetween(Date value1, Date value2) {
            addCriterion("LOGONTIME not between", value1, value2, "logontime");
            return (Criteria) this;
        }

        public Criteria andAvailableDateIsNull() {
            addCriterion("AVAILABLE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAvailableDateIsNotNull() {
            addCriterion("AVAILABLE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableDateEqualTo(Date value) {
            addCriterion("AVAILABLE_DATE =", value, "availableDate");
            return (Criteria) this;
        }

        public Criteria andAvailableDateNotEqualTo(Date value) {
            addCriterion("AVAILABLE_DATE <>", value, "availableDate");
            return (Criteria) this;
        }

        public Criteria andAvailableDateGreaterThan(Date value) {
            addCriterion("AVAILABLE_DATE >", value, "availableDate");
            return (Criteria) this;
        }

        public Criteria andAvailableDateGreaterThanOrEqualTo(Date value) {
            addCriterion("AVAILABLE_DATE >=", value, "availableDate");
            return (Criteria) this;
        }

        public Criteria andAvailableDateLessThan(Date value) {
            addCriterion("AVAILABLE_DATE <", value, "availableDate");
            return (Criteria) this;
        }

        public Criteria andAvailableDateLessThanOrEqualTo(Date value) {
            addCriterion("AVAILABLE_DATE <=", value, "availableDate");
            return (Criteria) this;
        }

        public Criteria andAvailableDateIn(List<Date> values) {
            addCriterion("AVAILABLE_DATE in", values, "availableDate");
            return (Criteria) this;
        }

        public Criteria andAvailableDateNotIn(List<Date> values) {
            addCriterion("AVAILABLE_DATE not in", values, "availableDate");
            return (Criteria) this;
        }

        public Criteria andAvailableDateBetween(Date value1, Date value2) {
            addCriterion("AVAILABLE_DATE between", value1, value2, "availableDate");
            return (Criteria) this;
        }

        public Criteria andAvailableDateNotBetween(Date value1, Date value2) {
            addCriterion("AVAILABLE_DATE not between", value1, value2, "availableDate");
            return (Criteria) this;
        }

        public Criteria andUnavailableDateIsNull() {
            addCriterion("UNAVAILABLE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUnavailableDateIsNotNull() {
            addCriterion("UNAVAILABLE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUnavailableDateEqualTo(Date value) {
            addCriterion("UNAVAILABLE_DATE =", value, "unavailableDate");
            return (Criteria) this;
        }

        public Criteria andUnavailableDateNotEqualTo(Date value) {
            addCriterion("UNAVAILABLE_DATE <>", value, "unavailableDate");
            return (Criteria) this;
        }

        public Criteria andUnavailableDateGreaterThan(Date value) {
            addCriterion("UNAVAILABLE_DATE >", value, "unavailableDate");
            return (Criteria) this;
        }

        public Criteria andUnavailableDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UNAVAILABLE_DATE >=", value, "unavailableDate");
            return (Criteria) this;
        }

        public Criteria andUnavailableDateLessThan(Date value) {
            addCriterion("UNAVAILABLE_DATE <", value, "unavailableDate");
            return (Criteria) this;
        }

        public Criteria andUnavailableDateLessThanOrEqualTo(Date value) {
            addCriterion("UNAVAILABLE_DATE <=", value, "unavailableDate");
            return (Criteria) this;
        }

        public Criteria andUnavailableDateIn(List<Date> values) {
            addCriterion("UNAVAILABLE_DATE in", values, "unavailableDate");
            return (Criteria) this;
        }

        public Criteria andUnavailableDateNotIn(List<Date> values) {
            addCriterion("UNAVAILABLE_DATE not in", values, "unavailableDate");
            return (Criteria) this;
        }

        public Criteria andUnavailableDateBetween(Date value1, Date value2) {
            addCriterion("UNAVAILABLE_DATE between", value1, value2, "unavailableDate");
            return (Criteria) this;
        }

        public Criteria andUnavailableDateNotBetween(Date value1, Date value2) {
            addCriterion("UNAVAILABLE_DATE not between", value1, value2, "unavailableDate");
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

        public Criteria andDefLanguageIsNull() {
            addCriterion("DEF_LANGUAGE is null");
            return (Criteria) this;
        }

        public Criteria andDefLanguageIsNotNull() {
            addCriterion("DEF_LANGUAGE is not null");
            return (Criteria) this;
        }

        public Criteria andDefLanguageEqualTo(String value) {
            addCriterion("DEF_LANGUAGE =", value, "defLanguage");
            return (Criteria) this;
        }

        public Criteria andDefLanguageNotEqualTo(String value) {
            addCriterion("DEF_LANGUAGE <>", value, "defLanguage");
            return (Criteria) this;
        }

        public Criteria andDefLanguageGreaterThan(String value) {
            addCriterion("DEF_LANGUAGE >", value, "defLanguage");
            return (Criteria) this;
        }

        public Criteria andDefLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("DEF_LANGUAGE >=", value, "defLanguage");
            return (Criteria) this;
        }

        public Criteria andDefLanguageLessThan(String value) {
            addCriterion("DEF_LANGUAGE <", value, "defLanguage");
            return (Criteria) this;
        }

        public Criteria andDefLanguageLessThanOrEqualTo(String value) {
            addCriterion("DEF_LANGUAGE <=", value, "defLanguage");
            return (Criteria) this;
        }

        public Criteria andDefLanguageLike(String value) {
            addCriterion("DEF_LANGUAGE like", value, "defLanguage");
            return (Criteria) this;
        }

        public Criteria andDefLanguageNotLike(String value) {
            addCriterion("DEF_LANGUAGE not like", value, "defLanguage");
            return (Criteria) this;
        }

        public Criteria andDefLanguageIn(List<String> values) {
            addCriterion("DEF_LANGUAGE in", values, "defLanguage");
            return (Criteria) this;
        }

        public Criteria andDefLanguageNotIn(List<String> values) {
            addCriterion("DEF_LANGUAGE not in", values, "defLanguage");
            return (Criteria) this;
        }

        public Criteria andDefLanguageBetween(String value1, String value2) {
            addCriterion("DEF_LANGUAGE between", value1, value2, "defLanguage");
            return (Criteria) this;
        }

        public Criteria andDefLanguageNotBetween(String value1, String value2) {
            addCriterion("DEF_LANGUAGE not between", value1, value2, "defLanguage");
            return (Criteria) this;
        }

        public Criteria andItemShortcutIsNull() {
            addCriterion("ITEM_SHORTCUT is null");
            return (Criteria) this;
        }

        public Criteria andItemShortcutIsNotNull() {
            addCriterion("ITEM_SHORTCUT is not null");
            return (Criteria) this;
        }

        public Criteria andItemShortcutEqualTo(String value) {
            addCriterion("ITEM_SHORTCUT =", value, "itemShortcut");
            return (Criteria) this;
        }

        public Criteria andItemShortcutNotEqualTo(String value) {
            addCriterion("ITEM_SHORTCUT <>", value, "itemShortcut");
            return (Criteria) this;
        }

        public Criteria andItemShortcutGreaterThan(String value) {
            addCriterion("ITEM_SHORTCUT >", value, "itemShortcut");
            return (Criteria) this;
        }

        public Criteria andItemShortcutGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_SHORTCUT >=", value, "itemShortcut");
            return (Criteria) this;
        }

        public Criteria andItemShortcutLessThan(String value) {
            addCriterion("ITEM_SHORTCUT <", value, "itemShortcut");
            return (Criteria) this;
        }

        public Criteria andItemShortcutLessThanOrEqualTo(String value) {
            addCriterion("ITEM_SHORTCUT <=", value, "itemShortcut");
            return (Criteria) this;
        }

        public Criteria andItemShortcutLike(String value) {
            addCriterion("ITEM_SHORTCUT like", value, "itemShortcut");
            return (Criteria) this;
        }

        public Criteria andItemShortcutNotLike(String value) {
            addCriterion("ITEM_SHORTCUT not like", value, "itemShortcut");
            return (Criteria) this;
        }

        public Criteria andItemShortcutIn(List<String> values) {
            addCriterion("ITEM_SHORTCUT in", values, "itemShortcut");
            return (Criteria) this;
        }

        public Criteria andItemShortcutNotIn(List<String> values) {
            addCriterion("ITEM_SHORTCUT not in", values, "itemShortcut");
            return (Criteria) this;
        }

        public Criteria andItemShortcutBetween(String value1, String value2) {
            addCriterion("ITEM_SHORTCUT between", value1, value2, "itemShortcut");
            return (Criteria) this;
        }

        public Criteria andItemShortcutNotBetween(String value1, String value2) {
            addCriterion("ITEM_SHORTCUT not between", value1, value2, "itemShortcut");
            return (Criteria) this;
        }

        public Criteria andCustomerShortcutIsNull() {
            addCriterion("CUSTOMER_SHORTCUT is null");
            return (Criteria) this;
        }

        public Criteria andCustomerShortcutIsNotNull() {
            addCriterion("CUSTOMER_SHORTCUT is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerShortcutEqualTo(String value) {
            addCriterion("CUSTOMER_SHORTCUT =", value, "customerShortcut");
            return (Criteria) this;
        }

        public Criteria andCustomerShortcutNotEqualTo(String value) {
            addCriterion("CUSTOMER_SHORTCUT <>", value, "customerShortcut");
            return (Criteria) this;
        }

        public Criteria andCustomerShortcutGreaterThan(String value) {
            addCriterion("CUSTOMER_SHORTCUT >", value, "customerShortcut");
            return (Criteria) this;
        }

        public Criteria andCustomerShortcutGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_SHORTCUT >=", value, "customerShortcut");
            return (Criteria) this;
        }

        public Criteria andCustomerShortcutLessThan(String value) {
            addCriterion("CUSTOMER_SHORTCUT <", value, "customerShortcut");
            return (Criteria) this;
        }

        public Criteria andCustomerShortcutLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_SHORTCUT <=", value, "customerShortcut");
            return (Criteria) this;
        }

        public Criteria andCustomerShortcutLike(String value) {
            addCriterion("CUSTOMER_SHORTCUT like", value, "customerShortcut");
            return (Criteria) this;
        }

        public Criteria andCustomerShortcutNotLike(String value) {
            addCriterion("CUSTOMER_SHORTCUT not like", value, "customerShortcut");
            return (Criteria) this;
        }

        public Criteria andCustomerShortcutIn(List<String> values) {
            addCriterion("CUSTOMER_SHORTCUT in", values, "customerShortcut");
            return (Criteria) this;
        }

        public Criteria andCustomerShortcutNotIn(List<String> values) {
            addCriterion("CUSTOMER_SHORTCUT not in", values, "customerShortcut");
            return (Criteria) this;
        }

        public Criteria andCustomerShortcutBetween(String value1, String value2) {
            addCriterion("CUSTOMER_SHORTCUT between", value1, value2, "customerShortcut");
            return (Criteria) this;
        }

        public Criteria andCustomerShortcutNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_SHORTCUT not between", value1, value2, "customerShortcut");
            return (Criteria) this;
        }

        public Criteria andSupplierShortcutIsNull() {
            addCriterion("SUPPLIER_SHORTCUT is null");
            return (Criteria) this;
        }

        public Criteria andSupplierShortcutIsNotNull() {
            addCriterion("SUPPLIER_SHORTCUT is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierShortcutEqualTo(String value) {
            addCriterion("SUPPLIER_SHORTCUT =", value, "supplierShortcut");
            return (Criteria) this;
        }

        public Criteria andSupplierShortcutNotEqualTo(String value) {
            addCriterion("SUPPLIER_SHORTCUT <>", value, "supplierShortcut");
            return (Criteria) this;
        }

        public Criteria andSupplierShortcutGreaterThan(String value) {
            addCriterion("SUPPLIER_SHORTCUT >", value, "supplierShortcut");
            return (Criteria) this;
        }

        public Criteria andSupplierShortcutGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_SHORTCUT >=", value, "supplierShortcut");
            return (Criteria) this;
        }

        public Criteria andSupplierShortcutLessThan(String value) {
            addCriterion("SUPPLIER_SHORTCUT <", value, "supplierShortcut");
            return (Criteria) this;
        }

        public Criteria andSupplierShortcutLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_SHORTCUT <=", value, "supplierShortcut");
            return (Criteria) this;
        }

        public Criteria andSupplierShortcutLike(String value) {
            addCriterion("SUPPLIER_SHORTCUT like", value, "supplierShortcut");
            return (Criteria) this;
        }

        public Criteria andSupplierShortcutNotLike(String value) {
            addCriterion("SUPPLIER_SHORTCUT not like", value, "supplierShortcut");
            return (Criteria) this;
        }

        public Criteria andSupplierShortcutIn(List<String> values) {
            addCriterion("SUPPLIER_SHORTCUT in", values, "supplierShortcut");
            return (Criteria) this;
        }

        public Criteria andSupplierShortcutNotIn(List<String> values) {
            addCriterion("SUPPLIER_SHORTCUT not in", values, "supplierShortcut");
            return (Criteria) this;
        }

        public Criteria andSupplierShortcutBetween(String value1, String value2) {
            addCriterion("SUPPLIER_SHORTCUT between", value1, value2, "supplierShortcut");
            return (Criteria) this;
        }

        public Criteria andSupplierShortcutNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_SHORTCUT not between", value1, value2, "supplierShortcut");
            return (Criteria) this;
        }

        public Criteria andDateFormatIsNull() {
            addCriterion("DATE_FORMAT is null");
            return (Criteria) this;
        }

        public Criteria andDateFormatIsNotNull() {
            addCriterion("DATE_FORMAT is not null");
            return (Criteria) this;
        }

        public Criteria andDateFormatEqualTo(String value) {
            addCriterion("DATE_FORMAT =", value, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatNotEqualTo(String value) {
            addCriterion("DATE_FORMAT <>", value, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatGreaterThan(String value) {
            addCriterion("DATE_FORMAT >", value, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatGreaterThanOrEqualTo(String value) {
            addCriterion("DATE_FORMAT >=", value, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatLessThan(String value) {
            addCriterion("DATE_FORMAT <", value, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatLessThanOrEqualTo(String value) {
            addCriterion("DATE_FORMAT <=", value, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatLike(String value) {
            addCriterion("DATE_FORMAT like", value, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatNotLike(String value) {
            addCriterion("DATE_FORMAT not like", value, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatIn(List<String> values) {
            addCriterion("DATE_FORMAT in", values, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatNotIn(List<String> values) {
            addCriterion("DATE_FORMAT not in", values, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatBetween(String value1, String value2) {
            addCriterion("DATE_FORMAT between", value1, value2, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateFormatNotBetween(String value1, String value2) {
            addCriterion("DATE_FORMAT not between", value1, value2, "dateFormat");
            return (Criteria) this;
        }

        public Criteria andDateAreaIsNull() {
            addCriterion("DATE_AREA is null");
            return (Criteria) this;
        }

        public Criteria andDateAreaIsNotNull() {
            addCriterion("DATE_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andDateAreaEqualTo(String value) {
            addCriterion("DATE_AREA =", value, "dateArea");
            return (Criteria) this;
        }

        public Criteria andDateAreaNotEqualTo(String value) {
            addCriterion("DATE_AREA <>", value, "dateArea");
            return (Criteria) this;
        }

        public Criteria andDateAreaGreaterThan(String value) {
            addCriterion("DATE_AREA >", value, "dateArea");
            return (Criteria) this;
        }

        public Criteria andDateAreaGreaterThanOrEqualTo(String value) {
            addCriterion("DATE_AREA >=", value, "dateArea");
            return (Criteria) this;
        }

        public Criteria andDateAreaLessThan(String value) {
            addCriterion("DATE_AREA <", value, "dateArea");
            return (Criteria) this;
        }

        public Criteria andDateAreaLessThanOrEqualTo(String value) {
            addCriterion("DATE_AREA <=", value, "dateArea");
            return (Criteria) this;
        }

        public Criteria andDateAreaLike(String value) {
            addCriterion("DATE_AREA like", value, "dateArea");
            return (Criteria) this;
        }

        public Criteria andDateAreaNotLike(String value) {
            addCriterion("DATE_AREA not like", value, "dateArea");
            return (Criteria) this;
        }

        public Criteria andDateAreaIn(List<String> values) {
            addCriterion("DATE_AREA in", values, "dateArea");
            return (Criteria) this;
        }

        public Criteria andDateAreaNotIn(List<String> values) {
            addCriterion("DATE_AREA not in", values, "dateArea");
            return (Criteria) this;
        }

        public Criteria andDateAreaBetween(String value1, String value2) {
            addCriterion("DATE_AREA between", value1, value2, "dateArea");
            return (Criteria) this;
        }

        public Criteria andDateAreaNotBetween(String value1, String value2) {
            addCriterion("DATE_AREA not between", value1, value2, "dateArea");
            return (Criteria) this;
        }

        public Criteria andFirstDayOfWeekIsNull() {
            addCriterion("FIRST_DAY_OF_WEEK is null");
            return (Criteria) this;
        }

        public Criteria andFirstDayOfWeekIsNotNull() {
            addCriterion("FIRST_DAY_OF_WEEK is not null");
            return (Criteria) this;
        }

        public Criteria andFirstDayOfWeekEqualTo(String value) {
            addCriterion("FIRST_DAY_OF_WEEK =", value, "firstDayOfWeek");
            return (Criteria) this;
        }

        public Criteria andFirstDayOfWeekNotEqualTo(String value) {
            addCriterion("FIRST_DAY_OF_WEEK <>", value, "firstDayOfWeek");
            return (Criteria) this;
        }

        public Criteria andFirstDayOfWeekGreaterThan(String value) {
            addCriterion("FIRST_DAY_OF_WEEK >", value, "firstDayOfWeek");
            return (Criteria) this;
        }

        public Criteria andFirstDayOfWeekGreaterThanOrEqualTo(String value) {
            addCriterion("FIRST_DAY_OF_WEEK >=", value, "firstDayOfWeek");
            return (Criteria) this;
        }

        public Criteria andFirstDayOfWeekLessThan(String value) {
            addCriterion("FIRST_DAY_OF_WEEK <", value, "firstDayOfWeek");
            return (Criteria) this;
        }

        public Criteria andFirstDayOfWeekLessThanOrEqualTo(String value) {
            addCriterion("FIRST_DAY_OF_WEEK <=", value, "firstDayOfWeek");
            return (Criteria) this;
        }

        public Criteria andFirstDayOfWeekLike(String value) {
            addCriterion("FIRST_DAY_OF_WEEK like", value, "firstDayOfWeek");
            return (Criteria) this;
        }

        public Criteria andFirstDayOfWeekNotLike(String value) {
            addCriterion("FIRST_DAY_OF_WEEK not like", value, "firstDayOfWeek");
            return (Criteria) this;
        }

        public Criteria andFirstDayOfWeekIn(List<String> values) {
            addCriterion("FIRST_DAY_OF_WEEK in", values, "firstDayOfWeek");
            return (Criteria) this;
        }

        public Criteria andFirstDayOfWeekNotIn(List<String> values) {
            addCriterion("FIRST_DAY_OF_WEEK not in", values, "firstDayOfWeek");
            return (Criteria) this;
        }

        public Criteria andFirstDayOfWeekBetween(String value1, String value2) {
            addCriterion("FIRST_DAY_OF_WEEK between", value1, value2, "firstDayOfWeek");
            return (Criteria) this;
        }

        public Criteria andFirstDayOfWeekNotBetween(String value1, String value2) {
            addCriterion("FIRST_DAY_OF_WEEK not between", value1, value2, "firstDayOfWeek");
            return (Criteria) this;
        }

        public Criteria andDefCompanyIdIsNull() {
            addCriterion("DEF_COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andDefCompanyIdIsNotNull() {
            addCriterion("DEF_COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDefCompanyIdEqualTo(String value) {
            addCriterion("DEF_COMPANY_ID =", value, "defCompanyId");
            return (Criteria) this;
        }

        public Criteria andDefCompanyIdNotEqualTo(String value) {
            addCriterion("DEF_COMPANY_ID <>", value, "defCompanyId");
            return (Criteria) this;
        }

        public Criteria andDefCompanyIdGreaterThan(String value) {
            addCriterion("DEF_COMPANY_ID >", value, "defCompanyId");
            return (Criteria) this;
        }

        public Criteria andDefCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEF_COMPANY_ID >=", value, "defCompanyId");
            return (Criteria) this;
        }

        public Criteria andDefCompanyIdLessThan(String value) {
            addCriterion("DEF_COMPANY_ID <", value, "defCompanyId");
            return (Criteria) this;
        }

        public Criteria andDefCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("DEF_COMPANY_ID <=", value, "defCompanyId");
            return (Criteria) this;
        }

        public Criteria andDefCompanyIdLike(String value) {
            addCriterion("DEF_COMPANY_ID like", value, "defCompanyId");
            return (Criteria) this;
        }

        public Criteria andDefCompanyIdNotLike(String value) {
            addCriterion("DEF_COMPANY_ID not like", value, "defCompanyId");
            return (Criteria) this;
        }

        public Criteria andDefCompanyIdIn(List<String> values) {
            addCriterion("DEF_COMPANY_ID in", values, "defCompanyId");
            return (Criteria) this;
        }

        public Criteria andDefCompanyIdNotIn(List<String> values) {
            addCriterion("DEF_COMPANY_ID not in", values, "defCompanyId");
            return (Criteria) this;
        }

        public Criteria andDefCompanyIdBetween(String value1, String value2) {
            addCriterion("DEF_COMPANY_ID between", value1, value2, "defCompanyId");
            return (Criteria) this;
        }

        public Criteria andDefCompanyIdNotBetween(String value1, String value2) {
            addCriterion("DEF_COMPANY_ID not between", value1, value2, "defCompanyId");
            return (Criteria) this;
        }

        public Criteria andDefPlantIdIsNull() {
            addCriterion("DEF_PLANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDefPlantIdIsNotNull() {
            addCriterion("DEF_PLANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDefPlantIdEqualTo(String value) {
            addCriterion("DEF_PLANT_ID =", value, "defPlantId");
            return (Criteria) this;
        }

        public Criteria andDefPlantIdNotEqualTo(String value) {
            addCriterion("DEF_PLANT_ID <>", value, "defPlantId");
            return (Criteria) this;
        }

        public Criteria andDefPlantIdGreaterThan(String value) {
            addCriterion("DEF_PLANT_ID >", value, "defPlantId");
            return (Criteria) this;
        }

        public Criteria andDefPlantIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEF_PLANT_ID >=", value, "defPlantId");
            return (Criteria) this;
        }

        public Criteria andDefPlantIdLessThan(String value) {
            addCriterion("DEF_PLANT_ID <", value, "defPlantId");
            return (Criteria) this;
        }

        public Criteria andDefPlantIdLessThanOrEqualTo(String value) {
            addCriterion("DEF_PLANT_ID <=", value, "defPlantId");
            return (Criteria) this;
        }

        public Criteria andDefPlantIdLike(String value) {
            addCriterion("DEF_PLANT_ID like", value, "defPlantId");
            return (Criteria) this;
        }

        public Criteria andDefPlantIdNotLike(String value) {
            addCriterion("DEF_PLANT_ID not like", value, "defPlantId");
            return (Criteria) this;
        }

        public Criteria andDefPlantIdIn(List<String> values) {
            addCriterion("DEF_PLANT_ID in", values, "defPlantId");
            return (Criteria) this;
        }

        public Criteria andDefPlantIdNotIn(List<String> values) {
            addCriterion("DEF_PLANT_ID not in", values, "defPlantId");
            return (Criteria) this;
        }

        public Criteria andDefPlantIdBetween(String value1, String value2) {
            addCriterion("DEF_PLANT_ID between", value1, value2, "defPlantId");
            return (Criteria) this;
        }

        public Criteria andDefPlantIdNotBetween(String value1, String value2) {
            addCriterion("DEF_PLANT_ID not between", value1, value2, "defPlantId");
            return (Criteria) this;
        }

        public Criteria andDefSalesCenterIdIsNull() {
            addCriterion("DEF_SALES_CENTER_ID is null");
            return (Criteria) this;
        }

        public Criteria andDefSalesCenterIdIsNotNull() {
            addCriterion("DEF_SALES_CENTER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDefSalesCenterIdEqualTo(String value) {
            addCriterion("DEF_SALES_CENTER_ID =", value, "defSalesCenterId");
            return (Criteria) this;
        }

        public Criteria andDefSalesCenterIdNotEqualTo(String value) {
            addCriterion("DEF_SALES_CENTER_ID <>", value, "defSalesCenterId");
            return (Criteria) this;
        }

        public Criteria andDefSalesCenterIdGreaterThan(String value) {
            addCriterion("DEF_SALES_CENTER_ID >", value, "defSalesCenterId");
            return (Criteria) this;
        }

        public Criteria andDefSalesCenterIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEF_SALES_CENTER_ID >=", value, "defSalesCenterId");
            return (Criteria) this;
        }

        public Criteria andDefSalesCenterIdLessThan(String value) {
            addCriterion("DEF_SALES_CENTER_ID <", value, "defSalesCenterId");
            return (Criteria) this;
        }

        public Criteria andDefSalesCenterIdLessThanOrEqualTo(String value) {
            addCriterion("DEF_SALES_CENTER_ID <=", value, "defSalesCenterId");
            return (Criteria) this;
        }

        public Criteria andDefSalesCenterIdLike(String value) {
            addCriterion("DEF_SALES_CENTER_ID like", value, "defSalesCenterId");
            return (Criteria) this;
        }

        public Criteria andDefSalesCenterIdNotLike(String value) {
            addCriterion("DEF_SALES_CENTER_ID not like", value, "defSalesCenterId");
            return (Criteria) this;
        }

        public Criteria andDefSalesCenterIdIn(List<String> values) {
            addCriterion("DEF_SALES_CENTER_ID in", values, "defSalesCenterId");
            return (Criteria) this;
        }

        public Criteria andDefSalesCenterIdNotIn(List<String> values) {
            addCriterion("DEF_SALES_CENTER_ID not in", values, "defSalesCenterId");
            return (Criteria) this;
        }

        public Criteria andDefSalesCenterIdBetween(String value1, String value2) {
            addCriterion("DEF_SALES_CENTER_ID between", value1, value2, "defSalesCenterId");
            return (Criteria) this;
        }

        public Criteria andDefSalesCenterIdNotBetween(String value1, String value2) {
            addCriterion("DEF_SALES_CENTER_ID not between", value1, value2, "defSalesCenterId");
            return (Criteria) this;
        }

        public Criteria andDefServiceCenterIdIsNull() {
            addCriterion("DEF_SERVICE_CENTER_ID is null");
            return (Criteria) this;
        }

        public Criteria andDefServiceCenterIdIsNotNull() {
            addCriterion("DEF_SERVICE_CENTER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDefServiceCenterIdEqualTo(String value) {
            addCriterion("DEF_SERVICE_CENTER_ID =", value, "defServiceCenterId");
            return (Criteria) this;
        }

        public Criteria andDefServiceCenterIdNotEqualTo(String value) {
            addCriterion("DEF_SERVICE_CENTER_ID <>", value, "defServiceCenterId");
            return (Criteria) this;
        }

        public Criteria andDefServiceCenterIdGreaterThan(String value) {
            addCriterion("DEF_SERVICE_CENTER_ID >", value, "defServiceCenterId");
            return (Criteria) this;
        }

        public Criteria andDefServiceCenterIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEF_SERVICE_CENTER_ID >=", value, "defServiceCenterId");
            return (Criteria) this;
        }

        public Criteria andDefServiceCenterIdLessThan(String value) {
            addCriterion("DEF_SERVICE_CENTER_ID <", value, "defServiceCenterId");
            return (Criteria) this;
        }

        public Criteria andDefServiceCenterIdLessThanOrEqualTo(String value) {
            addCriterion("DEF_SERVICE_CENTER_ID <=", value, "defServiceCenterId");
            return (Criteria) this;
        }

        public Criteria andDefServiceCenterIdLike(String value) {
            addCriterion("DEF_SERVICE_CENTER_ID like", value, "defServiceCenterId");
            return (Criteria) this;
        }

        public Criteria andDefServiceCenterIdNotLike(String value) {
            addCriterion("DEF_SERVICE_CENTER_ID not like", value, "defServiceCenterId");
            return (Criteria) this;
        }

        public Criteria andDefServiceCenterIdIn(List<String> values) {
            addCriterion("DEF_SERVICE_CENTER_ID in", values, "defServiceCenterId");
            return (Criteria) this;
        }

        public Criteria andDefServiceCenterIdNotIn(List<String> values) {
            addCriterion("DEF_SERVICE_CENTER_ID not in", values, "defServiceCenterId");
            return (Criteria) this;
        }

        public Criteria andDefServiceCenterIdBetween(String value1, String value2) {
            addCriterion("DEF_SERVICE_CENTER_ID between", value1, value2, "defServiceCenterId");
            return (Criteria) this;
        }

        public Criteria andDefServiceCenterIdNotBetween(String value1, String value2) {
            addCriterion("DEF_SERVICE_CENTER_ID not between", value1, value2, "defServiceCenterId");
            return (Criteria) this;
        }

        public Criteria andDefSupplyCenterIdIsNull() {
            addCriterion("DEF_SUPPLY_CENTER_ID is null");
            return (Criteria) this;
        }

        public Criteria andDefSupplyCenterIdIsNotNull() {
            addCriterion("DEF_SUPPLY_CENTER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDefSupplyCenterIdEqualTo(String value) {
            addCriterion("DEF_SUPPLY_CENTER_ID =", value, "defSupplyCenterId");
            return (Criteria) this;
        }

        public Criteria andDefSupplyCenterIdNotEqualTo(String value) {
            addCriterion("DEF_SUPPLY_CENTER_ID <>", value, "defSupplyCenterId");
            return (Criteria) this;
        }

        public Criteria andDefSupplyCenterIdGreaterThan(String value) {
            addCriterion("DEF_SUPPLY_CENTER_ID >", value, "defSupplyCenterId");
            return (Criteria) this;
        }

        public Criteria andDefSupplyCenterIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEF_SUPPLY_CENTER_ID >=", value, "defSupplyCenterId");
            return (Criteria) this;
        }

        public Criteria andDefSupplyCenterIdLessThan(String value) {
            addCriterion("DEF_SUPPLY_CENTER_ID <", value, "defSupplyCenterId");
            return (Criteria) this;
        }

        public Criteria andDefSupplyCenterIdLessThanOrEqualTo(String value) {
            addCriterion("DEF_SUPPLY_CENTER_ID <=", value, "defSupplyCenterId");
            return (Criteria) this;
        }

        public Criteria andDefSupplyCenterIdLike(String value) {
            addCriterion("DEF_SUPPLY_CENTER_ID like", value, "defSupplyCenterId");
            return (Criteria) this;
        }

        public Criteria andDefSupplyCenterIdNotLike(String value) {
            addCriterion("DEF_SUPPLY_CENTER_ID not like", value, "defSupplyCenterId");
            return (Criteria) this;
        }

        public Criteria andDefSupplyCenterIdIn(List<String> values) {
            addCriterion("DEF_SUPPLY_CENTER_ID in", values, "defSupplyCenterId");
            return (Criteria) this;
        }

        public Criteria andDefSupplyCenterIdNotIn(List<String> values) {
            addCriterion("DEF_SUPPLY_CENTER_ID not in", values, "defSupplyCenterId");
            return (Criteria) this;
        }

        public Criteria andDefSupplyCenterIdBetween(String value1, String value2) {
            addCriterion("DEF_SUPPLY_CENTER_ID between", value1, value2, "defSupplyCenterId");
            return (Criteria) this;
        }

        public Criteria andDefSupplyCenterIdNotBetween(String value1, String value2) {
            addCriterion("DEF_SUPPLY_CENTER_ID not between", value1, value2, "defSupplyCenterId");
            return (Criteria) this;
        }

        public Criteria andDefOperationCenterIdIsNull() {
            addCriterion("DEF_OPERATION_CENTER_ID is null");
            return (Criteria) this;
        }

        public Criteria andDefOperationCenterIdIsNotNull() {
            addCriterion("DEF_OPERATION_CENTER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDefOperationCenterIdEqualTo(String value) {
            addCriterion("DEF_OPERATION_CENTER_ID =", value, "defOperationCenterId");
            return (Criteria) this;
        }

        public Criteria andDefOperationCenterIdNotEqualTo(String value) {
            addCriterion("DEF_OPERATION_CENTER_ID <>", value, "defOperationCenterId");
            return (Criteria) this;
        }

        public Criteria andDefOperationCenterIdGreaterThan(String value) {
            addCriterion("DEF_OPERATION_CENTER_ID >", value, "defOperationCenterId");
            return (Criteria) this;
        }

        public Criteria andDefOperationCenterIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEF_OPERATION_CENTER_ID >=", value, "defOperationCenterId");
            return (Criteria) this;
        }

        public Criteria andDefOperationCenterIdLessThan(String value) {
            addCriterion("DEF_OPERATION_CENTER_ID <", value, "defOperationCenterId");
            return (Criteria) this;
        }

        public Criteria andDefOperationCenterIdLessThanOrEqualTo(String value) {
            addCriterion("DEF_OPERATION_CENTER_ID <=", value, "defOperationCenterId");
            return (Criteria) this;
        }

        public Criteria andDefOperationCenterIdLike(String value) {
            addCriterion("DEF_OPERATION_CENTER_ID like", value, "defOperationCenterId");
            return (Criteria) this;
        }

        public Criteria andDefOperationCenterIdNotLike(String value) {
            addCriterion("DEF_OPERATION_CENTER_ID not like", value, "defOperationCenterId");
            return (Criteria) this;
        }

        public Criteria andDefOperationCenterIdIn(List<String> values) {
            addCriterion("DEF_OPERATION_CENTER_ID in", values, "defOperationCenterId");
            return (Criteria) this;
        }

        public Criteria andDefOperationCenterIdNotIn(List<String> values) {
            addCriterion("DEF_OPERATION_CENTER_ID not in", values, "defOperationCenterId");
            return (Criteria) this;
        }

        public Criteria andDefOperationCenterIdBetween(String value1, String value2) {
            addCriterion("DEF_OPERATION_CENTER_ID between", value1, value2, "defOperationCenterId");
            return (Criteria) this;
        }

        public Criteria andDefOperationCenterIdNotBetween(String value1, String value2) {
            addCriterion("DEF_OPERATION_CENTER_ID not between", value1, value2, "defOperationCenterId");
            return (Criteria) this;
        }

        public Criteria andDefUserMenuIdIsNull() {
            addCriterion("DEF_USER_MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andDefUserMenuIdIsNotNull() {
            addCriterion("DEF_USER_MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDefUserMenuIdEqualTo(String value) {
            addCriterion("DEF_USER_MENU_ID =", value, "defUserMenuId");
            return (Criteria) this;
        }

        public Criteria andDefUserMenuIdNotEqualTo(String value) {
            addCriterion("DEF_USER_MENU_ID <>", value, "defUserMenuId");
            return (Criteria) this;
        }

        public Criteria andDefUserMenuIdGreaterThan(String value) {
            addCriterion("DEF_USER_MENU_ID >", value, "defUserMenuId");
            return (Criteria) this;
        }

        public Criteria andDefUserMenuIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEF_USER_MENU_ID >=", value, "defUserMenuId");
            return (Criteria) this;
        }

        public Criteria andDefUserMenuIdLessThan(String value) {
            addCriterion("DEF_USER_MENU_ID <", value, "defUserMenuId");
            return (Criteria) this;
        }

        public Criteria andDefUserMenuIdLessThanOrEqualTo(String value) {
            addCriterion("DEF_USER_MENU_ID <=", value, "defUserMenuId");
            return (Criteria) this;
        }

        public Criteria andDefUserMenuIdLike(String value) {
            addCriterion("DEF_USER_MENU_ID like", value, "defUserMenuId");
            return (Criteria) this;
        }

        public Criteria andDefUserMenuIdNotLike(String value) {
            addCriterion("DEF_USER_MENU_ID not like", value, "defUserMenuId");
            return (Criteria) this;
        }

        public Criteria andDefUserMenuIdIn(List<String> values) {
            addCriterion("DEF_USER_MENU_ID in", values, "defUserMenuId");
            return (Criteria) this;
        }

        public Criteria andDefUserMenuIdNotIn(List<String> values) {
            addCriterion("DEF_USER_MENU_ID not in", values, "defUserMenuId");
            return (Criteria) this;
        }

        public Criteria andDefUserMenuIdBetween(String value1, String value2) {
            addCriterion("DEF_USER_MENU_ID between", value1, value2, "defUserMenuId");
            return (Criteria) this;
        }

        public Criteria andDefUserMenuIdNotBetween(String value1, String value2) {
            addCriterion("DEF_USER_MENU_ID not between", value1, value2, "defUserMenuId");
            return (Criteria) this;
        }

        public Criteria andDefShotcutMenuIdIsNull() {
            addCriterion("DEF_SHOTCUT_MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andDefShotcutMenuIdIsNotNull() {
            addCriterion("DEF_SHOTCUT_MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDefShotcutMenuIdEqualTo(String value) {
            addCriterion("DEF_SHOTCUT_MENU_ID =", value, "defShotcutMenuId");
            return (Criteria) this;
        }

        public Criteria andDefShotcutMenuIdNotEqualTo(String value) {
            addCriterion("DEF_SHOTCUT_MENU_ID <>", value, "defShotcutMenuId");
            return (Criteria) this;
        }

        public Criteria andDefShotcutMenuIdGreaterThan(String value) {
            addCriterion("DEF_SHOTCUT_MENU_ID >", value, "defShotcutMenuId");
            return (Criteria) this;
        }

        public Criteria andDefShotcutMenuIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEF_SHOTCUT_MENU_ID >=", value, "defShotcutMenuId");
            return (Criteria) this;
        }

        public Criteria andDefShotcutMenuIdLessThan(String value) {
            addCriterion("DEF_SHOTCUT_MENU_ID <", value, "defShotcutMenuId");
            return (Criteria) this;
        }

        public Criteria andDefShotcutMenuIdLessThanOrEqualTo(String value) {
            addCriterion("DEF_SHOTCUT_MENU_ID <=", value, "defShotcutMenuId");
            return (Criteria) this;
        }

        public Criteria andDefShotcutMenuIdLike(String value) {
            addCriterion("DEF_SHOTCUT_MENU_ID like", value, "defShotcutMenuId");
            return (Criteria) this;
        }

        public Criteria andDefShotcutMenuIdNotLike(String value) {
            addCriterion("DEF_SHOTCUT_MENU_ID not like", value, "defShotcutMenuId");
            return (Criteria) this;
        }

        public Criteria andDefShotcutMenuIdIn(List<String> values) {
            addCriterion("DEF_SHOTCUT_MENU_ID in", values, "defShotcutMenuId");
            return (Criteria) this;
        }

        public Criteria andDefShotcutMenuIdNotIn(List<String> values) {
            addCriterion("DEF_SHOTCUT_MENU_ID not in", values, "defShotcutMenuId");
            return (Criteria) this;
        }

        public Criteria andDefShotcutMenuIdBetween(String value1, String value2) {
            addCriterion("DEF_SHOTCUT_MENU_ID between", value1, value2, "defShotcutMenuId");
            return (Criteria) this;
        }

        public Criteria andDefShotcutMenuIdNotBetween(String value1, String value2) {
            addCriterion("DEF_SHOTCUT_MENU_ID not between", value1, value2, "defShotcutMenuId");
            return (Criteria) this;
        }

        public Criteria andDefShotcutProgramidIsNull() {
            addCriterion("DEF_SHOTCUT_PROGRAMID is null");
            return (Criteria) this;
        }

        public Criteria andDefShotcutProgramidIsNotNull() {
            addCriterion("DEF_SHOTCUT_PROGRAMID is not null");
            return (Criteria) this;
        }

        public Criteria andDefShotcutProgramidEqualTo(String value) {
            addCriterion("DEF_SHOTCUT_PROGRAMID =", value, "defShotcutProgramid");
            return (Criteria) this;
        }

        public Criteria andDefShotcutProgramidNotEqualTo(String value) {
            addCriterion("DEF_SHOTCUT_PROGRAMID <>", value, "defShotcutProgramid");
            return (Criteria) this;
        }

        public Criteria andDefShotcutProgramidGreaterThan(String value) {
            addCriterion("DEF_SHOTCUT_PROGRAMID >", value, "defShotcutProgramid");
            return (Criteria) this;
        }

        public Criteria andDefShotcutProgramidGreaterThanOrEqualTo(String value) {
            addCriterion("DEF_SHOTCUT_PROGRAMID >=", value, "defShotcutProgramid");
            return (Criteria) this;
        }

        public Criteria andDefShotcutProgramidLessThan(String value) {
            addCriterion("DEF_SHOTCUT_PROGRAMID <", value, "defShotcutProgramid");
            return (Criteria) this;
        }

        public Criteria andDefShotcutProgramidLessThanOrEqualTo(String value) {
            addCriterion("DEF_SHOTCUT_PROGRAMID <=", value, "defShotcutProgramid");
            return (Criteria) this;
        }

        public Criteria andDefShotcutProgramidLike(String value) {
            addCriterion("DEF_SHOTCUT_PROGRAMID like", value, "defShotcutProgramid");
            return (Criteria) this;
        }

        public Criteria andDefShotcutProgramidNotLike(String value) {
            addCriterion("DEF_SHOTCUT_PROGRAMID not like", value, "defShotcutProgramid");
            return (Criteria) this;
        }

        public Criteria andDefShotcutProgramidIn(List<String> values) {
            addCriterion("DEF_SHOTCUT_PROGRAMID in", values, "defShotcutProgramid");
            return (Criteria) this;
        }

        public Criteria andDefShotcutProgramidNotIn(List<String> values) {
            addCriterion("DEF_SHOTCUT_PROGRAMID not in", values, "defShotcutProgramid");
            return (Criteria) this;
        }

        public Criteria andDefShotcutProgramidBetween(String value1, String value2) {
            addCriterion("DEF_SHOTCUT_PROGRAMID between", value1, value2, "defShotcutProgramid");
            return (Criteria) this;
        }

        public Criteria andDefShotcutProgramidNotBetween(String value1, String value2) {
            addCriterion("DEF_SHOTCUT_PROGRAMID not between", value1, value2, "defShotcutProgramid");
            return (Criteria) this;
        }

        public Criteria andDefShotcutDisplaynameIsNull() {
            addCriterion("DEF_SHOTCUT_DISPLAYNAME is null");
            return (Criteria) this;
        }

        public Criteria andDefShotcutDisplaynameIsNotNull() {
            addCriterion("DEF_SHOTCUT_DISPLAYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDefShotcutDisplaynameEqualTo(String value) {
            addCriterion("DEF_SHOTCUT_DISPLAYNAME =", value, "defShotcutDisplayname");
            return (Criteria) this;
        }

        public Criteria andDefShotcutDisplaynameNotEqualTo(String value) {
            addCriterion("DEF_SHOTCUT_DISPLAYNAME <>", value, "defShotcutDisplayname");
            return (Criteria) this;
        }

        public Criteria andDefShotcutDisplaynameGreaterThan(String value) {
            addCriterion("DEF_SHOTCUT_DISPLAYNAME >", value, "defShotcutDisplayname");
            return (Criteria) this;
        }

        public Criteria andDefShotcutDisplaynameGreaterThanOrEqualTo(String value) {
            addCriterion("DEF_SHOTCUT_DISPLAYNAME >=", value, "defShotcutDisplayname");
            return (Criteria) this;
        }

        public Criteria andDefShotcutDisplaynameLessThan(String value) {
            addCriterion("DEF_SHOTCUT_DISPLAYNAME <", value, "defShotcutDisplayname");
            return (Criteria) this;
        }

        public Criteria andDefShotcutDisplaynameLessThanOrEqualTo(String value) {
            addCriterion("DEF_SHOTCUT_DISPLAYNAME <=", value, "defShotcutDisplayname");
            return (Criteria) this;
        }

        public Criteria andDefShotcutDisplaynameLike(String value) {
            addCriterion("DEF_SHOTCUT_DISPLAYNAME like", value, "defShotcutDisplayname");
            return (Criteria) this;
        }

        public Criteria andDefShotcutDisplaynameNotLike(String value) {
            addCriterion("DEF_SHOTCUT_DISPLAYNAME not like", value, "defShotcutDisplayname");
            return (Criteria) this;
        }

        public Criteria andDefShotcutDisplaynameIn(List<String> values) {
            addCriterion("DEF_SHOTCUT_DISPLAYNAME in", values, "defShotcutDisplayname");
            return (Criteria) this;
        }

        public Criteria andDefShotcutDisplaynameNotIn(List<String> values) {
            addCriterion("DEF_SHOTCUT_DISPLAYNAME not in", values, "defShotcutDisplayname");
            return (Criteria) this;
        }

        public Criteria andDefShotcutDisplaynameBetween(String value1, String value2) {
            addCriterion("DEF_SHOTCUT_DISPLAYNAME between", value1, value2, "defShotcutDisplayname");
            return (Criteria) this;
        }

        public Criteria andDefShotcutDisplaynameNotBetween(String value1, String value2) {
            addCriterion("DEF_SHOTCUT_DISPLAYNAME not between", value1, value2, "defShotcutDisplayname");
            return (Criteria) this;
        }

        public Criteria andDefShotcutHelpidIsNull() {
            addCriterion("DEF_SHOTCUT_HELPID is null");
            return (Criteria) this;
        }

        public Criteria andDefShotcutHelpidIsNotNull() {
            addCriterion("DEF_SHOTCUT_HELPID is not null");
            return (Criteria) this;
        }

        public Criteria andDefShotcutHelpidEqualTo(String value) {
            addCriterion("DEF_SHOTCUT_HELPID =", value, "defShotcutHelpid");
            return (Criteria) this;
        }

        public Criteria andDefShotcutHelpidNotEqualTo(String value) {
            addCriterion("DEF_SHOTCUT_HELPID <>", value, "defShotcutHelpid");
            return (Criteria) this;
        }

        public Criteria andDefShotcutHelpidGreaterThan(String value) {
            addCriterion("DEF_SHOTCUT_HELPID >", value, "defShotcutHelpid");
            return (Criteria) this;
        }

        public Criteria andDefShotcutHelpidGreaterThanOrEqualTo(String value) {
            addCriterion("DEF_SHOTCUT_HELPID >=", value, "defShotcutHelpid");
            return (Criteria) this;
        }

        public Criteria andDefShotcutHelpidLessThan(String value) {
            addCriterion("DEF_SHOTCUT_HELPID <", value, "defShotcutHelpid");
            return (Criteria) this;
        }

        public Criteria andDefShotcutHelpidLessThanOrEqualTo(String value) {
            addCriterion("DEF_SHOTCUT_HELPID <=", value, "defShotcutHelpid");
            return (Criteria) this;
        }

        public Criteria andDefShotcutHelpidLike(String value) {
            addCriterion("DEF_SHOTCUT_HELPID like", value, "defShotcutHelpid");
            return (Criteria) this;
        }

        public Criteria andDefShotcutHelpidNotLike(String value) {
            addCriterion("DEF_SHOTCUT_HELPID not like", value, "defShotcutHelpid");
            return (Criteria) this;
        }

        public Criteria andDefShotcutHelpidIn(List<String> values) {
            addCriterion("DEF_SHOTCUT_HELPID in", values, "defShotcutHelpid");
            return (Criteria) this;
        }

        public Criteria andDefShotcutHelpidNotIn(List<String> values) {
            addCriterion("DEF_SHOTCUT_HELPID not in", values, "defShotcutHelpid");
            return (Criteria) this;
        }

        public Criteria andDefShotcutHelpidBetween(String value1, String value2) {
            addCriterion("DEF_SHOTCUT_HELPID between", value1, value2, "defShotcutHelpid");
            return (Criteria) this;
        }

        public Criteria andDefShotcutHelpidNotBetween(String value1, String value2) {
            addCriterion("DEF_SHOTCUT_HELPID not between", value1, value2, "defShotcutHelpid");
            return (Criteria) this;
        }

        public Criteria andUserPreferencesIsNull() {
            addCriterion("User_Preferences is null");
            return (Criteria) this;
        }

        public Criteria andUserPreferencesIsNotNull() {
            addCriterion("User_Preferences is not null");
            return (Criteria) this;
        }

        public Criteria andUserPreferencesEqualTo(String value) {
            addCriterion("User_Preferences =", value, "userPreferences");
            return (Criteria) this;
        }

        public Criteria andUserPreferencesNotEqualTo(String value) {
            addCriterion("User_Preferences <>", value, "userPreferences");
            return (Criteria) this;
        }

        public Criteria andUserPreferencesGreaterThan(String value) {
            addCriterion("User_Preferences >", value, "userPreferences");
            return (Criteria) this;
        }

        public Criteria andUserPreferencesGreaterThanOrEqualTo(String value) {
            addCriterion("User_Preferences >=", value, "userPreferences");
            return (Criteria) this;
        }

        public Criteria andUserPreferencesLessThan(String value) {
            addCriterion("User_Preferences <", value, "userPreferences");
            return (Criteria) this;
        }

        public Criteria andUserPreferencesLessThanOrEqualTo(String value) {
            addCriterion("User_Preferences <=", value, "userPreferences");
            return (Criteria) this;
        }

        public Criteria andUserPreferencesLike(String value) {
            addCriterion("User_Preferences like", value, "userPreferences");
            return (Criteria) this;
        }

        public Criteria andUserPreferencesNotLike(String value) {
            addCriterion("User_Preferences not like", value, "userPreferences");
            return (Criteria) this;
        }

        public Criteria andUserPreferencesIn(List<String> values) {
            addCriterion("User_Preferences in", values, "userPreferences");
            return (Criteria) this;
        }

        public Criteria andUserPreferencesNotIn(List<String> values) {
            addCriterion("User_Preferences not in", values, "userPreferences");
            return (Criteria) this;
        }

        public Criteria andUserPreferencesBetween(String value1, String value2) {
            addCriterion("User_Preferences between", value1, value2, "userPreferences");
            return (Criteria) this;
        }

        public Criteria andUserPreferencesNotBetween(String value1, String value2) {
            addCriterion("User_Preferences not between", value1, value2, "userPreferences");
            return (Criteria) this;
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