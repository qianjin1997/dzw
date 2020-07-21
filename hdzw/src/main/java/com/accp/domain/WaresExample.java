package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class WaresExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WaresExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andAfidIsNull() {
            addCriterion("afid is null");
            return (Criteria) this;
        }

        public Criteria andAfidIsNotNull() {
            addCriterion("afid is not null");
            return (Criteria) this;
        }

        public Criteria andAfidEqualTo(Integer value) {
            addCriterion("afid =", value, "afid");
            return (Criteria) this;
        }

        public Criteria andAfidNotEqualTo(Integer value) {
            addCriterion("afid <>", value, "afid");
            return (Criteria) this;
        }

        public Criteria andAfidGreaterThan(Integer value) {
            addCriterion("afid >", value, "afid");
            return (Criteria) this;
        }

        public Criteria andAfidGreaterThanOrEqualTo(Integer value) {
            addCriterion("afid >=", value, "afid");
            return (Criteria) this;
        }

        public Criteria andAfidLessThan(Integer value) {
            addCriterion("afid <", value, "afid");
            return (Criteria) this;
        }

        public Criteria andAfidLessThanOrEqualTo(Integer value) {
            addCriterion("afid <=", value, "afid");
            return (Criteria) this;
        }

        public Criteria andAfidIn(List<Integer> values) {
            addCriterion("afid in", values, "afid");
            return (Criteria) this;
        }

        public Criteria andAfidNotIn(List<Integer> values) {
            addCriterion("afid not in", values, "afid");
            return (Criteria) this;
        }

        public Criteria andAfidBetween(Integer value1, Integer value2) {
            addCriterion("afid between", value1, value2, "afid");
            return (Criteria) this;
        }

        public Criteria andAfidNotBetween(Integer value1, Integer value2) {
            addCriterion("afid not between", value1, value2, "afid");
            return (Criteria) this;
        }

        public Criteria andAfvendorcodeIsNull() {
            addCriterion("afvendorcode is null");
            return (Criteria) this;
        }

        public Criteria andAfvendorcodeIsNotNull() {
            addCriterion("afvendorcode is not null");
            return (Criteria) this;
        }

        public Criteria andAfvendorcodeEqualTo(String value) {
            addCriterion("afvendorcode =", value, "afvendorcode");
            return (Criteria) this;
        }

        public Criteria andAfvendorcodeNotEqualTo(String value) {
            addCriterion("afvendorcode <>", value, "afvendorcode");
            return (Criteria) this;
        }

        public Criteria andAfvendorcodeGreaterThan(String value) {
            addCriterion("afvendorcode >", value, "afvendorcode");
            return (Criteria) this;
        }

        public Criteria andAfvendorcodeGreaterThanOrEqualTo(String value) {
            addCriterion("afvendorcode >=", value, "afvendorcode");
            return (Criteria) this;
        }

        public Criteria andAfvendorcodeLessThan(String value) {
            addCriterion("afvendorcode <", value, "afvendorcode");
            return (Criteria) this;
        }

        public Criteria andAfvendorcodeLessThanOrEqualTo(String value) {
            addCriterion("afvendorcode <=", value, "afvendorcode");
            return (Criteria) this;
        }

        public Criteria andAfvendorcodeLike(String value) {
            addCriterion("afvendorcode like", value, "afvendorcode");
            return (Criteria) this;
        }

        public Criteria andAfvendorcodeNotLike(String value) {
            addCriterion("afvendorcode not like", value, "afvendorcode");
            return (Criteria) this;
        }

        public Criteria andAfvendorcodeIn(List<String> values) {
            addCriterion("afvendorcode in", values, "afvendorcode");
            return (Criteria) this;
        }

        public Criteria andAfvendorcodeNotIn(List<String> values) {
            addCriterion("afvendorcode not in", values, "afvendorcode");
            return (Criteria) this;
        }

        public Criteria andAfvendorcodeBetween(String value1, String value2) {
            addCriterion("afvendorcode between", value1, value2, "afvendorcode");
            return (Criteria) this;
        }

        public Criteria andAfvendorcodeNotBetween(String value1, String value2) {
            addCriterion("afvendorcode not between", value1, value2, "afvendorcode");
            return (Criteria) this;
        }

        public Criteria andAftradenameIsNull() {
            addCriterion("aftradename is null");
            return (Criteria) this;
        }

        public Criteria andAftradenameIsNotNull() {
            addCriterion("aftradename is not null");
            return (Criteria) this;
        }

        public Criteria andAftradenameEqualTo(String value) {
            addCriterion("aftradename =", value, "aftradename");
            return (Criteria) this;
        }

        public Criteria andAftradenameNotEqualTo(String value) {
            addCriterion("aftradename <>", value, "aftradename");
            return (Criteria) this;
        }

        public Criteria andAftradenameGreaterThan(String value) {
            addCriterion("aftradename >", value, "aftradename");
            return (Criteria) this;
        }

        public Criteria andAftradenameGreaterThanOrEqualTo(String value) {
            addCriterion("aftradename >=", value, "aftradename");
            return (Criteria) this;
        }

        public Criteria andAftradenameLessThan(String value) {
            addCriterion("aftradename <", value, "aftradename");
            return (Criteria) this;
        }

        public Criteria andAftradenameLessThanOrEqualTo(String value) {
            addCriterion("aftradename <=", value, "aftradename");
            return (Criteria) this;
        }

        public Criteria andAftradenameLike(String value) {
            addCriterion("aftradename like", value, "aftradename");
            return (Criteria) this;
        }

        public Criteria andAftradenameNotLike(String value) {
            addCriterion("aftradename not like", value, "aftradename");
            return (Criteria) this;
        }

        public Criteria andAftradenameIn(List<String> values) {
            addCriterion("aftradename in", values, "aftradename");
            return (Criteria) this;
        }

        public Criteria andAftradenameNotIn(List<String> values) {
            addCriterion("aftradename not in", values, "aftradename");
            return (Criteria) this;
        }

        public Criteria andAftradenameBetween(String value1, String value2) {
            addCriterion("aftradename between", value1, value2, "aftradename");
            return (Criteria) this;
        }

        public Criteria andAftradenameNotBetween(String value1, String value2) {
            addCriterion("aftradename not between", value1, value2, "aftradename");
            return (Criteria) this;
        }

        public Criteria andAfaddressIsNull() {
            addCriterion("afaddress is null");
            return (Criteria) this;
        }

        public Criteria andAfaddressIsNotNull() {
            addCriterion("afaddress is not null");
            return (Criteria) this;
        }

        public Criteria andAfaddressEqualTo(String value) {
            addCriterion("afaddress =", value, "afaddress");
            return (Criteria) this;
        }

        public Criteria andAfaddressNotEqualTo(String value) {
            addCriterion("afaddress <>", value, "afaddress");
            return (Criteria) this;
        }

        public Criteria andAfaddressGreaterThan(String value) {
            addCriterion("afaddress >", value, "afaddress");
            return (Criteria) this;
        }

        public Criteria andAfaddressGreaterThanOrEqualTo(String value) {
            addCriterion("afaddress >=", value, "afaddress");
            return (Criteria) this;
        }

        public Criteria andAfaddressLessThan(String value) {
            addCriterion("afaddress <", value, "afaddress");
            return (Criteria) this;
        }

        public Criteria andAfaddressLessThanOrEqualTo(String value) {
            addCriterion("afaddress <=", value, "afaddress");
            return (Criteria) this;
        }

        public Criteria andAfaddressLike(String value) {
            addCriterion("afaddress like", value, "afaddress");
            return (Criteria) this;
        }

        public Criteria andAfaddressNotLike(String value) {
            addCriterion("afaddress not like", value, "afaddress");
            return (Criteria) this;
        }

        public Criteria andAfaddressIn(List<String> values) {
            addCriterion("afaddress in", values, "afaddress");
            return (Criteria) this;
        }

        public Criteria andAfaddressNotIn(List<String> values) {
            addCriterion("afaddress not in", values, "afaddress");
            return (Criteria) this;
        }

        public Criteria andAfaddressBetween(String value1, String value2) {
            addCriterion("afaddress between", value1, value2, "afaddress");
            return (Criteria) this;
        }

        public Criteria andAfaddressNotBetween(String value1, String value2) {
            addCriterion("afaddress not between", value1, value2, "afaddress");
            return (Criteria) this;
        }

        public Criteria andAfoperationIsNull() {
            addCriterion("afoperation is null");
            return (Criteria) this;
        }

        public Criteria andAfoperationIsNotNull() {
            addCriterion("afoperation is not null");
            return (Criteria) this;
        }

        public Criteria andAfoperationEqualTo(String value) {
            addCriterion("afoperation =", value, "afoperation");
            return (Criteria) this;
        }

        public Criteria andAfoperationNotEqualTo(String value) {
            addCriterion("afoperation <>", value, "afoperation");
            return (Criteria) this;
        }

        public Criteria andAfoperationGreaterThan(String value) {
            addCriterion("afoperation >", value, "afoperation");
            return (Criteria) this;
        }

        public Criteria andAfoperationGreaterThanOrEqualTo(String value) {
            addCriterion("afoperation >=", value, "afoperation");
            return (Criteria) this;
        }

        public Criteria andAfoperationLessThan(String value) {
            addCriterion("afoperation <", value, "afoperation");
            return (Criteria) this;
        }

        public Criteria andAfoperationLessThanOrEqualTo(String value) {
            addCriterion("afoperation <=", value, "afoperation");
            return (Criteria) this;
        }

        public Criteria andAfoperationLike(String value) {
            addCriterion("afoperation like", value, "afoperation");
            return (Criteria) this;
        }

        public Criteria andAfoperationNotLike(String value) {
            addCriterion("afoperation not like", value, "afoperation");
            return (Criteria) this;
        }

        public Criteria andAfoperationIn(List<String> values) {
            addCriterion("afoperation in", values, "afoperation");
            return (Criteria) this;
        }

        public Criteria andAfoperationNotIn(List<String> values) {
            addCriterion("afoperation not in", values, "afoperation");
            return (Criteria) this;
        }

        public Criteria andAfoperationBetween(String value1, String value2) {
            addCriterion("afoperation between", value1, value2, "afoperation");
            return (Criteria) this;
        }

        public Criteria andAfoperationNotBetween(String value1, String value2) {
            addCriterion("afoperation not between", value1, value2, "afoperation");
            return (Criteria) this;
        }

        public Criteria andAfurlIsNull() {
            addCriterion("afurl is null");
            return (Criteria) this;
        }

        public Criteria andAfurlIsNotNull() {
            addCriterion("afurl is not null");
            return (Criteria) this;
        }

        public Criteria andAfurlEqualTo(String value) {
            addCriterion("afurl =", value, "afurl");
            return (Criteria) this;
        }

        public Criteria andAfurlNotEqualTo(String value) {
            addCriterion("afurl <>", value, "afurl");
            return (Criteria) this;
        }

        public Criteria andAfurlGreaterThan(String value) {
            addCriterion("afurl >", value, "afurl");
            return (Criteria) this;
        }

        public Criteria andAfurlGreaterThanOrEqualTo(String value) {
            addCriterion("afurl >=", value, "afurl");
            return (Criteria) this;
        }

        public Criteria andAfurlLessThan(String value) {
            addCriterion("afurl <", value, "afurl");
            return (Criteria) this;
        }

        public Criteria andAfurlLessThanOrEqualTo(String value) {
            addCriterion("afurl <=", value, "afurl");
            return (Criteria) this;
        }

        public Criteria andAfurlLike(String value) {
            addCriterion("afurl like", value, "afurl");
            return (Criteria) this;
        }

        public Criteria andAfurlNotLike(String value) {
            addCriterion("afurl not like", value, "afurl");
            return (Criteria) this;
        }

        public Criteria andAfurlIn(List<String> values) {
            addCriterion("afurl in", values, "afurl");
            return (Criteria) this;
        }

        public Criteria andAfurlNotIn(List<String> values) {
            addCriterion("afurl not in", values, "afurl");
            return (Criteria) this;
        }

        public Criteria andAfurlBetween(String value1, String value2) {
            addCriterion("afurl between", value1, value2, "afurl");
            return (Criteria) this;
        }

        public Criteria andAfurlNotBetween(String value1, String value2) {
            addCriterion("afurl not between", value1, value2, "afurl");
            return (Criteria) this;
        }

        public Criteria andAfopeningbankIsNull() {
            addCriterion("afopeningbank is null");
            return (Criteria) this;
        }

        public Criteria andAfopeningbankIsNotNull() {
            addCriterion("afopeningbank is not null");
            return (Criteria) this;
        }

        public Criteria andAfopeningbankEqualTo(String value) {
            addCriterion("afopeningbank =", value, "afopeningbank");
            return (Criteria) this;
        }

        public Criteria andAfopeningbankNotEqualTo(String value) {
            addCriterion("afopeningbank <>", value, "afopeningbank");
            return (Criteria) this;
        }

        public Criteria andAfopeningbankGreaterThan(String value) {
            addCriterion("afopeningbank >", value, "afopeningbank");
            return (Criteria) this;
        }

        public Criteria andAfopeningbankGreaterThanOrEqualTo(String value) {
            addCriterion("afopeningbank >=", value, "afopeningbank");
            return (Criteria) this;
        }

        public Criteria andAfopeningbankLessThan(String value) {
            addCriterion("afopeningbank <", value, "afopeningbank");
            return (Criteria) this;
        }

        public Criteria andAfopeningbankLessThanOrEqualTo(String value) {
            addCriterion("afopeningbank <=", value, "afopeningbank");
            return (Criteria) this;
        }

        public Criteria andAfopeningbankLike(String value) {
            addCriterion("afopeningbank like", value, "afopeningbank");
            return (Criteria) this;
        }

        public Criteria andAfopeningbankNotLike(String value) {
            addCriterion("afopeningbank not like", value, "afopeningbank");
            return (Criteria) this;
        }

        public Criteria andAfopeningbankIn(List<String> values) {
            addCriterion("afopeningbank in", values, "afopeningbank");
            return (Criteria) this;
        }

        public Criteria andAfopeningbankNotIn(List<String> values) {
            addCriterion("afopeningbank not in", values, "afopeningbank");
            return (Criteria) this;
        }

        public Criteria andAfopeningbankBetween(String value1, String value2) {
            addCriterion("afopeningbank between", value1, value2, "afopeningbank");
            return (Criteria) this;
        }

        public Criteria andAfopeningbankNotBetween(String value1, String value2) {
            addCriterion("afopeningbank not between", value1, value2, "afopeningbank");
            return (Criteria) this;
        }

        public Criteria andAfbankaccountIsNull() {
            addCriterion("afbankaccount is null");
            return (Criteria) this;
        }

        public Criteria andAfbankaccountIsNotNull() {
            addCriterion("afbankaccount is not null");
            return (Criteria) this;
        }

        public Criteria andAfbankaccountEqualTo(String value) {
            addCriterion("afbankaccount =", value, "afbankaccount");
            return (Criteria) this;
        }

        public Criteria andAfbankaccountNotEqualTo(String value) {
            addCriterion("afbankaccount <>", value, "afbankaccount");
            return (Criteria) this;
        }

        public Criteria andAfbankaccountGreaterThan(String value) {
            addCriterion("afbankaccount >", value, "afbankaccount");
            return (Criteria) this;
        }

        public Criteria andAfbankaccountGreaterThanOrEqualTo(String value) {
            addCriterion("afbankaccount >=", value, "afbankaccount");
            return (Criteria) this;
        }

        public Criteria andAfbankaccountLessThan(String value) {
            addCriterion("afbankaccount <", value, "afbankaccount");
            return (Criteria) this;
        }

        public Criteria andAfbankaccountLessThanOrEqualTo(String value) {
            addCriterion("afbankaccount <=", value, "afbankaccount");
            return (Criteria) this;
        }

        public Criteria andAfbankaccountLike(String value) {
            addCriterion("afbankaccount like", value, "afbankaccount");
            return (Criteria) this;
        }

        public Criteria andAfbankaccountNotLike(String value) {
            addCriterion("afbankaccount not like", value, "afbankaccount");
            return (Criteria) this;
        }

        public Criteria andAfbankaccountIn(List<String> values) {
            addCriterion("afbankaccount in", values, "afbankaccount");
            return (Criteria) this;
        }

        public Criteria andAfbankaccountNotIn(List<String> values) {
            addCriterion("afbankaccount not in", values, "afbankaccount");
            return (Criteria) this;
        }

        public Criteria andAfbankaccountBetween(String value1, String value2) {
            addCriterion("afbankaccount between", value1, value2, "afbankaccount");
            return (Criteria) this;
        }

        public Criteria andAfbankaccountNotBetween(String value1, String value2) {
            addCriterion("afbankaccount not between", value1, value2, "afbankaccount");
            return (Criteria) this;
        }

        public Criteria andAffkmethodIsNull() {
            addCriterion("affkmethod is null");
            return (Criteria) this;
        }

        public Criteria andAffkmethodIsNotNull() {
            addCriterion("affkmethod is not null");
            return (Criteria) this;
        }

        public Criteria andAffkmethodEqualTo(String value) {
            addCriterion("affkmethod =", value, "affkmethod");
            return (Criteria) this;
        }

        public Criteria andAffkmethodNotEqualTo(String value) {
            addCriterion("affkmethod <>", value, "affkmethod");
            return (Criteria) this;
        }

        public Criteria andAffkmethodGreaterThan(String value) {
            addCriterion("affkmethod >", value, "affkmethod");
            return (Criteria) this;
        }

        public Criteria andAffkmethodGreaterThanOrEqualTo(String value) {
            addCriterion("affkmethod >=", value, "affkmethod");
            return (Criteria) this;
        }

        public Criteria andAffkmethodLessThan(String value) {
            addCriterion("affkmethod <", value, "affkmethod");
            return (Criteria) this;
        }

        public Criteria andAffkmethodLessThanOrEqualTo(String value) {
            addCriterion("affkmethod <=", value, "affkmethod");
            return (Criteria) this;
        }

        public Criteria andAffkmethodLike(String value) {
            addCriterion("affkmethod like", value, "affkmethod");
            return (Criteria) this;
        }

        public Criteria andAffkmethodNotLike(String value) {
            addCriterion("affkmethod not like", value, "affkmethod");
            return (Criteria) this;
        }

        public Criteria andAffkmethodIn(List<String> values) {
            addCriterion("affkmethod in", values, "affkmethod");
            return (Criteria) this;
        }

        public Criteria andAffkmethodNotIn(List<String> values) {
            addCriterion("affkmethod not in", values, "affkmethod");
            return (Criteria) this;
        }

        public Criteria andAffkmethodBetween(String value1, String value2) {
            addCriterion("affkmethod between", value1, value2, "affkmethod");
            return (Criteria) this;
        }

        public Criteria andAffkmethodNotBetween(String value1, String value2) {
            addCriterion("affkmethod not between", value1, value2, "affkmethod");
            return (Criteria) this;
        }

        public Criteria andAfvendorratingIsNull() {
            addCriterion("afvendorrating is null");
            return (Criteria) this;
        }

        public Criteria andAfvendorratingIsNotNull() {
            addCriterion("afvendorrating is not null");
            return (Criteria) this;
        }

        public Criteria andAfvendorratingEqualTo(String value) {
            addCriterion("afvendorrating =", value, "afvendorrating");
            return (Criteria) this;
        }

        public Criteria andAfvendorratingNotEqualTo(String value) {
            addCriterion("afvendorrating <>", value, "afvendorrating");
            return (Criteria) this;
        }

        public Criteria andAfvendorratingGreaterThan(String value) {
            addCriterion("afvendorrating >", value, "afvendorrating");
            return (Criteria) this;
        }

        public Criteria andAfvendorratingGreaterThanOrEqualTo(String value) {
            addCriterion("afvendorrating >=", value, "afvendorrating");
            return (Criteria) this;
        }

        public Criteria andAfvendorratingLessThan(String value) {
            addCriterion("afvendorrating <", value, "afvendorrating");
            return (Criteria) this;
        }

        public Criteria andAfvendorratingLessThanOrEqualTo(String value) {
            addCriterion("afvendorrating <=", value, "afvendorrating");
            return (Criteria) this;
        }

        public Criteria andAfvendorratingLike(String value) {
            addCriterion("afvendorrating like", value, "afvendorrating");
            return (Criteria) this;
        }

        public Criteria andAfvendorratingNotLike(String value) {
            addCriterion("afvendorrating not like", value, "afvendorrating");
            return (Criteria) this;
        }

        public Criteria andAfvendorratingIn(List<String> values) {
            addCriterion("afvendorrating in", values, "afvendorrating");
            return (Criteria) this;
        }

        public Criteria andAfvendorratingNotIn(List<String> values) {
            addCriterion("afvendorrating not in", values, "afvendorrating");
            return (Criteria) this;
        }

        public Criteria andAfvendorratingBetween(String value1, String value2) {
            addCriterion("afvendorrating between", value1, value2, "afvendorrating");
            return (Criteria) this;
        }

        public Criteria andAfvendorratingNotBetween(String value1, String value2) {
            addCriterion("afvendorrating not between", value1, value2, "afvendorrating");
            return (Criteria) this;
        }

        public Criteria andAfrunbrandIsNull() {
            addCriterion("afrunbrand is null");
            return (Criteria) this;
        }

        public Criteria andAfrunbrandIsNotNull() {
            addCriterion("afrunbrand is not null");
            return (Criteria) this;
        }

        public Criteria andAfrunbrandEqualTo(String value) {
            addCriterion("afrunbrand =", value, "afrunbrand");
            return (Criteria) this;
        }

        public Criteria andAfrunbrandNotEqualTo(String value) {
            addCriterion("afrunbrand <>", value, "afrunbrand");
            return (Criteria) this;
        }

        public Criteria andAfrunbrandGreaterThan(String value) {
            addCriterion("afrunbrand >", value, "afrunbrand");
            return (Criteria) this;
        }

        public Criteria andAfrunbrandGreaterThanOrEqualTo(String value) {
            addCriterion("afrunbrand >=", value, "afrunbrand");
            return (Criteria) this;
        }

        public Criteria andAfrunbrandLessThan(String value) {
            addCriterion("afrunbrand <", value, "afrunbrand");
            return (Criteria) this;
        }

        public Criteria andAfrunbrandLessThanOrEqualTo(String value) {
            addCriterion("afrunbrand <=", value, "afrunbrand");
            return (Criteria) this;
        }

        public Criteria andAfrunbrandLike(String value) {
            addCriterion("afrunbrand like", value, "afrunbrand");
            return (Criteria) this;
        }

        public Criteria andAfrunbrandNotLike(String value) {
            addCriterion("afrunbrand not like", value, "afrunbrand");
            return (Criteria) this;
        }

        public Criteria andAfrunbrandIn(List<String> values) {
            addCriterion("afrunbrand in", values, "afrunbrand");
            return (Criteria) this;
        }

        public Criteria andAfrunbrandNotIn(List<String> values) {
            addCriterion("afrunbrand not in", values, "afrunbrand");
            return (Criteria) this;
        }

        public Criteria andAfrunbrandBetween(String value1, String value2) {
            addCriterion("afrunbrand between", value1, value2, "afrunbrand");
            return (Criteria) this;
        }

        public Criteria andAfrunbrandNotBetween(String value1, String value2) {
            addCriterion("afrunbrand not between", value1, value2, "afrunbrand");
            return (Criteria) this;
        }

        public Criteria andAfvendortypeIsNull() {
            addCriterion("afvendortype is null");
            return (Criteria) this;
        }

        public Criteria andAfvendortypeIsNotNull() {
            addCriterion("afvendortype is not null");
            return (Criteria) this;
        }

        public Criteria andAfvendortypeEqualTo(String value) {
            addCriterion("afvendortype =", value, "afvendortype");
            return (Criteria) this;
        }

        public Criteria andAfvendortypeNotEqualTo(String value) {
            addCriterion("afvendortype <>", value, "afvendortype");
            return (Criteria) this;
        }

        public Criteria andAfvendortypeGreaterThan(String value) {
            addCriterion("afvendortype >", value, "afvendortype");
            return (Criteria) this;
        }

        public Criteria andAfvendortypeGreaterThanOrEqualTo(String value) {
            addCriterion("afvendortype >=", value, "afvendortype");
            return (Criteria) this;
        }

        public Criteria andAfvendortypeLessThan(String value) {
            addCriterion("afvendortype <", value, "afvendortype");
            return (Criteria) this;
        }

        public Criteria andAfvendortypeLessThanOrEqualTo(String value) {
            addCriterion("afvendortype <=", value, "afvendortype");
            return (Criteria) this;
        }

        public Criteria andAfvendortypeLike(String value) {
            addCriterion("afvendortype like", value, "afvendortype");
            return (Criteria) this;
        }

        public Criteria andAfvendortypeNotLike(String value) {
            addCriterion("afvendortype not like", value, "afvendortype");
            return (Criteria) this;
        }

        public Criteria andAfvendortypeIn(List<String> values) {
            addCriterion("afvendortype in", values, "afvendortype");
            return (Criteria) this;
        }

        public Criteria andAfvendortypeNotIn(List<String> values) {
            addCriterion("afvendortype not in", values, "afvendortype");
            return (Criteria) this;
        }

        public Criteria andAfvendortypeBetween(String value1, String value2) {
            addCriterion("afvendortype between", value1, value2, "afvendortype");
            return (Criteria) this;
        }

        public Criteria andAfvendortypeNotBetween(String value1, String value2) {
            addCriterion("afvendortype not between", value1, value2, "afvendortype");
            return (Criteria) this;
        }

        public Criteria andAflinkmanIsNull() {
            addCriterion("aflinkman is null");
            return (Criteria) this;
        }

        public Criteria andAflinkmanIsNotNull() {
            addCriterion("aflinkman is not null");
            return (Criteria) this;
        }

        public Criteria andAflinkmanEqualTo(String value) {
            addCriterion("aflinkman =", value, "aflinkman");
            return (Criteria) this;
        }

        public Criteria andAflinkmanNotEqualTo(String value) {
            addCriterion("aflinkman <>", value, "aflinkman");
            return (Criteria) this;
        }

        public Criteria andAflinkmanGreaterThan(String value) {
            addCriterion("aflinkman >", value, "aflinkman");
            return (Criteria) this;
        }

        public Criteria andAflinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("aflinkman >=", value, "aflinkman");
            return (Criteria) this;
        }

        public Criteria andAflinkmanLessThan(String value) {
            addCriterion("aflinkman <", value, "aflinkman");
            return (Criteria) this;
        }

        public Criteria andAflinkmanLessThanOrEqualTo(String value) {
            addCriterion("aflinkman <=", value, "aflinkman");
            return (Criteria) this;
        }

        public Criteria andAflinkmanLike(String value) {
            addCriterion("aflinkman like", value, "aflinkman");
            return (Criteria) this;
        }

        public Criteria andAflinkmanNotLike(String value) {
            addCriterion("aflinkman not like", value, "aflinkman");
            return (Criteria) this;
        }

        public Criteria andAflinkmanIn(List<String> values) {
            addCriterion("aflinkman in", values, "aflinkman");
            return (Criteria) this;
        }

        public Criteria andAflinkmanNotIn(List<String> values) {
            addCriterion("aflinkman not in", values, "aflinkman");
            return (Criteria) this;
        }

        public Criteria andAflinkmanBetween(String value1, String value2) {
            addCriterion("aflinkman between", value1, value2, "aflinkman");
            return (Criteria) this;
        }

        public Criteria andAflinkmanNotBetween(String value1, String value2) {
            addCriterion("aflinkman not between", value1, value2, "aflinkman");
            return (Criteria) this;
        }

        public Criteria andAfcallIsNull() {
            addCriterion("afcall is null");
            return (Criteria) this;
        }

        public Criteria andAfcallIsNotNull() {
            addCriterion("afcall is not null");
            return (Criteria) this;
        }

        public Criteria andAfcallEqualTo(String value) {
            addCriterion("afcall =", value, "afcall");
            return (Criteria) this;
        }

        public Criteria andAfcallNotEqualTo(String value) {
            addCriterion("afcall <>", value, "afcall");
            return (Criteria) this;
        }

        public Criteria andAfcallGreaterThan(String value) {
            addCriterion("afcall >", value, "afcall");
            return (Criteria) this;
        }

        public Criteria andAfcallGreaterThanOrEqualTo(String value) {
            addCriterion("afcall >=", value, "afcall");
            return (Criteria) this;
        }

        public Criteria andAfcallLessThan(String value) {
            addCriterion("afcall <", value, "afcall");
            return (Criteria) this;
        }

        public Criteria andAfcallLessThanOrEqualTo(String value) {
            addCriterion("afcall <=", value, "afcall");
            return (Criteria) this;
        }

        public Criteria andAfcallLike(String value) {
            addCriterion("afcall like", value, "afcall");
            return (Criteria) this;
        }

        public Criteria andAfcallNotLike(String value) {
            addCriterion("afcall not like", value, "afcall");
            return (Criteria) this;
        }

        public Criteria andAfcallIn(List<String> values) {
            addCriterion("afcall in", values, "afcall");
            return (Criteria) this;
        }

        public Criteria andAfcallNotIn(List<String> values) {
            addCriterion("afcall not in", values, "afcall");
            return (Criteria) this;
        }

        public Criteria andAfcallBetween(String value1, String value2) {
            addCriterion("afcall between", value1, value2, "afcall");
            return (Criteria) this;
        }

        public Criteria andAfcallNotBetween(String value1, String value2) {
            addCriterion("afcall not between", value1, value2, "afcall");
            return (Criteria) this;
        }

        public Criteria andAfphoneIsNull() {
            addCriterion("afphone is null");
            return (Criteria) this;
        }

        public Criteria andAfphoneIsNotNull() {
            addCriterion("afphone is not null");
            return (Criteria) this;
        }

        public Criteria andAfphoneEqualTo(String value) {
            addCriterion("afphone =", value, "afphone");
            return (Criteria) this;
        }

        public Criteria andAfphoneNotEqualTo(String value) {
            addCriterion("afphone <>", value, "afphone");
            return (Criteria) this;
        }

        public Criteria andAfphoneGreaterThan(String value) {
            addCriterion("afphone >", value, "afphone");
            return (Criteria) this;
        }

        public Criteria andAfphoneGreaterThanOrEqualTo(String value) {
            addCriterion("afphone >=", value, "afphone");
            return (Criteria) this;
        }

        public Criteria andAfphoneLessThan(String value) {
            addCriterion("afphone <", value, "afphone");
            return (Criteria) this;
        }

        public Criteria andAfphoneLessThanOrEqualTo(String value) {
            addCriterion("afphone <=", value, "afphone");
            return (Criteria) this;
        }

        public Criteria andAfphoneLike(String value) {
            addCriterion("afphone like", value, "afphone");
            return (Criteria) this;
        }

        public Criteria andAfphoneNotLike(String value) {
            addCriterion("afphone not like", value, "afphone");
            return (Criteria) this;
        }

        public Criteria andAfphoneIn(List<String> values) {
            addCriterion("afphone in", values, "afphone");
            return (Criteria) this;
        }

        public Criteria andAfphoneNotIn(List<String> values) {
            addCriterion("afphone not in", values, "afphone");
            return (Criteria) this;
        }

        public Criteria andAfphoneBetween(String value1, String value2) {
            addCriterion("afphone between", value1, value2, "afphone");
            return (Criteria) this;
        }

        public Criteria andAfphoneNotBetween(String value1, String value2) {
            addCriterion("afphone not between", value1, value2, "afphone");
            return (Criteria) this;
        }

        public Criteria andAfemailIsNull() {
            addCriterion("afemail is null");
            return (Criteria) this;
        }

        public Criteria andAfemailIsNotNull() {
            addCriterion("afemail is not null");
            return (Criteria) this;
        }

        public Criteria andAfemailEqualTo(String value) {
            addCriterion("afemail =", value, "afemail");
            return (Criteria) this;
        }

        public Criteria andAfemailNotEqualTo(String value) {
            addCriterion("afemail <>", value, "afemail");
            return (Criteria) this;
        }

        public Criteria andAfemailGreaterThan(String value) {
            addCriterion("afemail >", value, "afemail");
            return (Criteria) this;
        }

        public Criteria andAfemailGreaterThanOrEqualTo(String value) {
            addCriterion("afemail >=", value, "afemail");
            return (Criteria) this;
        }

        public Criteria andAfemailLessThan(String value) {
            addCriterion("afemail <", value, "afemail");
            return (Criteria) this;
        }

        public Criteria andAfemailLessThanOrEqualTo(String value) {
            addCriterion("afemail <=", value, "afemail");
            return (Criteria) this;
        }

        public Criteria andAfemailLike(String value) {
            addCriterion("afemail like", value, "afemail");
            return (Criteria) this;
        }

        public Criteria andAfemailNotLike(String value) {
            addCriterion("afemail not like", value, "afemail");
            return (Criteria) this;
        }

        public Criteria andAfemailIn(List<String> values) {
            addCriterion("afemail in", values, "afemail");
            return (Criteria) this;
        }

        public Criteria andAfemailNotIn(List<String> values) {
            addCriterion("afemail not in", values, "afemail");
            return (Criteria) this;
        }

        public Criteria andAfemailBetween(String value1, String value2) {
            addCriterion("afemail between", value1, value2, "afemail");
            return (Criteria) this;
        }

        public Criteria andAfemailNotBetween(String value1, String value2) {
            addCriterion("afemail not between", value1, value2, "afemail");
            return (Criteria) this;
        }

        public Criteria andAfpaymentdaysIsNull() {
            addCriterion("afpaymentdays is null");
            return (Criteria) this;
        }

        public Criteria andAfpaymentdaysIsNotNull() {
            addCriterion("afpaymentdays is not null");
            return (Criteria) this;
        }

        public Criteria andAfpaymentdaysEqualTo(Integer value) {
            addCriterion("afpaymentdays =", value, "afpaymentdays");
            return (Criteria) this;
        }

        public Criteria andAfpaymentdaysNotEqualTo(Integer value) {
            addCriterion("afpaymentdays <>", value, "afpaymentdays");
            return (Criteria) this;
        }

        public Criteria andAfpaymentdaysGreaterThan(Integer value) {
            addCriterion("afpaymentdays >", value, "afpaymentdays");
            return (Criteria) this;
        }

        public Criteria andAfpaymentdaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("afpaymentdays >=", value, "afpaymentdays");
            return (Criteria) this;
        }

        public Criteria andAfpaymentdaysLessThan(Integer value) {
            addCriterion("afpaymentdays <", value, "afpaymentdays");
            return (Criteria) this;
        }

        public Criteria andAfpaymentdaysLessThanOrEqualTo(Integer value) {
            addCriterion("afpaymentdays <=", value, "afpaymentdays");
            return (Criteria) this;
        }

        public Criteria andAfpaymentdaysIn(List<Integer> values) {
            addCriterion("afpaymentdays in", values, "afpaymentdays");
            return (Criteria) this;
        }

        public Criteria andAfpaymentdaysNotIn(List<Integer> values) {
            addCriterion("afpaymentdays not in", values, "afpaymentdays");
            return (Criteria) this;
        }

        public Criteria andAfpaymentdaysBetween(Integer value1, Integer value2) {
            addCriterion("afpaymentdays between", value1, value2, "afpaymentdays");
            return (Criteria) this;
        }

        public Criteria andAfpaymentdaysNotBetween(Integer value1, Integer value2) {
            addCriterion("afpaymentdays not between", value1, value2, "afpaymentdays");
            return (Criteria) this;
        }

        public Criteria andAfremarkIsNull() {
            addCriterion("afremark is null");
            return (Criteria) this;
        }

        public Criteria andAfremarkIsNotNull() {
            addCriterion("afremark is not null");
            return (Criteria) this;
        }

        public Criteria andAfremarkEqualTo(String value) {
            addCriterion("afremark =", value, "afremark");
            return (Criteria) this;
        }

        public Criteria andAfremarkNotEqualTo(String value) {
            addCriterion("afremark <>", value, "afremark");
            return (Criteria) this;
        }

        public Criteria andAfremarkGreaterThan(String value) {
            addCriterion("afremark >", value, "afremark");
            return (Criteria) this;
        }

        public Criteria andAfremarkGreaterThanOrEqualTo(String value) {
            addCriterion("afremark >=", value, "afremark");
            return (Criteria) this;
        }

        public Criteria andAfremarkLessThan(String value) {
            addCriterion("afremark <", value, "afremark");
            return (Criteria) this;
        }

        public Criteria andAfremarkLessThanOrEqualTo(String value) {
            addCriterion("afremark <=", value, "afremark");
            return (Criteria) this;
        }

        public Criteria andAfremarkLike(String value) {
            addCriterion("afremark like", value, "afremark");
            return (Criteria) this;
        }

        public Criteria andAfremarkNotLike(String value) {
            addCriterion("afremark not like", value, "afremark");
            return (Criteria) this;
        }

        public Criteria andAfremarkIn(List<String> values) {
            addCriterion("afremark in", values, "afremark");
            return (Criteria) this;
        }

        public Criteria andAfremarkNotIn(List<String> values) {
            addCriterion("afremark not in", values, "afremark");
            return (Criteria) this;
        }

        public Criteria andAfremarkBetween(String value1, String value2) {
            addCriterion("afremark between", value1, value2, "afremark");
            return (Criteria) this;
        }

        public Criteria andAfremarkNotBetween(String value1, String value2) {
            addCriterion("afremark not between", value1, value2, "afremark");
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