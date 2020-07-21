package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class GhaddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GhaddressExample() {
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

        public Criteria andAnidIsNull() {
            addCriterion("anid is null");
            return (Criteria) this;
        }

        public Criteria andAnidIsNotNull() {
            addCriterion("anid is not null");
            return (Criteria) this;
        }

        public Criteria andAnidEqualTo(Integer value) {
            addCriterion("anid =", value, "anid");
            return (Criteria) this;
        }

        public Criteria andAnidNotEqualTo(Integer value) {
            addCriterion("anid <>", value, "anid");
            return (Criteria) this;
        }

        public Criteria andAnidGreaterThan(Integer value) {
            addCriterion("anid >", value, "anid");
            return (Criteria) this;
        }

        public Criteria andAnidGreaterThanOrEqualTo(Integer value) {
            addCriterion("anid >=", value, "anid");
            return (Criteria) this;
        }

        public Criteria andAnidLessThan(Integer value) {
            addCriterion("anid <", value, "anid");
            return (Criteria) this;
        }

        public Criteria andAnidLessThanOrEqualTo(Integer value) {
            addCriterion("anid <=", value, "anid");
            return (Criteria) this;
        }

        public Criteria andAnidIn(List<Integer> values) {
            addCriterion("anid in", values, "anid");
            return (Criteria) this;
        }

        public Criteria andAnidNotIn(List<Integer> values) {
            addCriterion("anid not in", values, "anid");
            return (Criteria) this;
        }

        public Criteria andAnidBetween(Integer value1, Integer value2) {
            addCriterion("anid between", value1, value2, "anid");
            return (Criteria) this;
        }

        public Criteria andAnidNotBetween(Integer value1, Integer value2) {
            addCriterion("anid not between", value1, value2, "anid");
            return (Criteria) this;
        }

        public Criteria andAnaddressIsNull() {
            addCriterion("anaddress is null");
            return (Criteria) this;
        }

        public Criteria andAnaddressIsNotNull() {
            addCriterion("anaddress is not null");
            return (Criteria) this;
        }

        public Criteria andAnaddressEqualTo(String value) {
            addCriterion("anaddress =", value, "anaddress");
            return (Criteria) this;
        }

        public Criteria andAnaddressNotEqualTo(String value) {
            addCriterion("anaddress <>", value, "anaddress");
            return (Criteria) this;
        }

        public Criteria andAnaddressGreaterThan(String value) {
            addCriterion("anaddress >", value, "anaddress");
            return (Criteria) this;
        }

        public Criteria andAnaddressGreaterThanOrEqualTo(String value) {
            addCriterion("anaddress >=", value, "anaddress");
            return (Criteria) this;
        }

        public Criteria andAnaddressLessThan(String value) {
            addCriterion("anaddress <", value, "anaddress");
            return (Criteria) this;
        }

        public Criteria andAnaddressLessThanOrEqualTo(String value) {
            addCriterion("anaddress <=", value, "anaddress");
            return (Criteria) this;
        }

        public Criteria andAnaddressLike(String value) {
            addCriterion("anaddress like", value, "anaddress");
            return (Criteria) this;
        }

        public Criteria andAnaddressNotLike(String value) {
            addCriterion("anaddress not like", value, "anaddress");
            return (Criteria) this;
        }

        public Criteria andAnaddressIn(List<String> values) {
            addCriterion("anaddress in", values, "anaddress");
            return (Criteria) this;
        }

        public Criteria andAnaddressNotIn(List<String> values) {
            addCriterion("anaddress not in", values, "anaddress");
            return (Criteria) this;
        }

        public Criteria andAnaddressBetween(String value1, String value2) {
            addCriterion("anaddress between", value1, value2, "anaddress");
            return (Criteria) this;
        }

        public Criteria andAnaddressNotBetween(String value1, String value2) {
            addCriterion("anaddress not between", value1, value2, "anaddress");
            return (Criteria) this;
        }

        public Criteria andAnparentidIsNull() {
            addCriterion("anparentid is null");
            return (Criteria) this;
        }

        public Criteria andAnparentidIsNotNull() {
            addCriterion("anparentid is not null");
            return (Criteria) this;
        }

        public Criteria andAnparentidEqualTo(Integer value) {
            addCriterion("anparentid =", value, "anparentid");
            return (Criteria) this;
        }

        public Criteria andAnparentidNotEqualTo(Integer value) {
            addCriterion("anparentid <>", value, "anparentid");
            return (Criteria) this;
        }

        public Criteria andAnparentidGreaterThan(Integer value) {
            addCriterion("anparentid >", value, "anparentid");
            return (Criteria) this;
        }

        public Criteria andAnparentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("anparentid >=", value, "anparentid");
            return (Criteria) this;
        }

        public Criteria andAnparentidLessThan(Integer value) {
            addCriterion("anparentid <", value, "anparentid");
            return (Criteria) this;
        }

        public Criteria andAnparentidLessThanOrEqualTo(Integer value) {
            addCriterion("anparentid <=", value, "anparentid");
            return (Criteria) this;
        }

        public Criteria andAnparentidIn(List<Integer> values) {
            addCriterion("anparentid in", values, "anparentid");
            return (Criteria) this;
        }

        public Criteria andAnparentidNotIn(List<Integer> values) {
            addCriterion("anparentid not in", values, "anparentid");
            return (Criteria) this;
        }

        public Criteria andAnparentidBetween(Integer value1, Integer value2) {
            addCriterion("anparentid between", value1, value2, "anparentid");
            return (Criteria) this;
        }

        public Criteria andAnparentidNotBetween(Integer value1, Integer value2) {
            addCriterion("anparentid not between", value1, value2, "anparentid");
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