package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class CarbrandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarbrandExample() {
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

        public Criteria andIidIsNull() {
            addCriterion("iid is null");
            return (Criteria) this;
        }

        public Criteria andIidIsNotNull() {
            addCriterion("iid is not null");
            return (Criteria) this;
        }

        public Criteria andIidEqualTo(Integer value) {
            addCriterion("iid =", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotEqualTo(Integer value) {
            addCriterion("iid <>", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThan(Integer value) {
            addCriterion("iid >", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThanOrEqualTo(Integer value) {
            addCriterion("iid >=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThan(Integer value) {
            addCriterion("iid <", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThanOrEqualTo(Integer value) {
            addCriterion("iid <=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidIn(List<Integer> values) {
            addCriterion("iid in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotIn(List<Integer> values) {
            addCriterion("iid not in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidBetween(Integer value1, Integer value2) {
            addCriterion("iid between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotBetween(Integer value1, Integer value2) {
            addCriterion("iid not between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andIbrandnameIsNull() {
            addCriterion("ibrandname is null");
            return (Criteria) this;
        }

        public Criteria andIbrandnameIsNotNull() {
            addCriterion("ibrandname is not null");
            return (Criteria) this;
        }

        public Criteria andIbrandnameEqualTo(String value) {
            addCriterion("ibrandname =", value, "ibrandname");
            return (Criteria) this;
        }

        public Criteria andIbrandnameNotEqualTo(String value) {
            addCriterion("ibrandname <>", value, "ibrandname");
            return (Criteria) this;
        }

        public Criteria andIbrandnameGreaterThan(String value) {
            addCriterion("ibrandname >", value, "ibrandname");
            return (Criteria) this;
        }

        public Criteria andIbrandnameGreaterThanOrEqualTo(String value) {
            addCriterion("ibrandname >=", value, "ibrandname");
            return (Criteria) this;
        }

        public Criteria andIbrandnameLessThan(String value) {
            addCriterion("ibrandname <", value, "ibrandname");
            return (Criteria) this;
        }

        public Criteria andIbrandnameLessThanOrEqualTo(String value) {
            addCriterion("ibrandname <=", value, "ibrandname");
            return (Criteria) this;
        }

        public Criteria andIbrandnameLike(String value) {
            addCriterion("ibrandname like", value, "ibrandname");
            return (Criteria) this;
        }

        public Criteria andIbrandnameNotLike(String value) {
            addCriterion("ibrandname not like", value, "ibrandname");
            return (Criteria) this;
        }

        public Criteria andIbrandnameIn(List<String> values) {
            addCriterion("ibrandname in", values, "ibrandname");
            return (Criteria) this;
        }

        public Criteria andIbrandnameNotIn(List<String> values) {
            addCriterion("ibrandname not in", values, "ibrandname");
            return (Criteria) this;
        }

        public Criteria andIbrandnameBetween(String value1, String value2) {
            addCriterion("ibrandname between", value1, value2, "ibrandname");
            return (Criteria) this;
        }

        public Criteria andIbrandnameNotBetween(String value1, String value2) {
            addCriterion("ibrandname not between", value1, value2, "ibrandname");
            return (Criteria) this;
        }

        public Criteria andIinitialIsNull() {
            addCriterion("iinitial is null");
            return (Criteria) this;
        }

        public Criteria andIinitialIsNotNull() {
            addCriterion("iinitial is not null");
            return (Criteria) this;
        }

        public Criteria andIinitialEqualTo(String value) {
            addCriterion("iinitial =", value, "iinitial");
            return (Criteria) this;
        }

        public Criteria andIinitialNotEqualTo(String value) {
            addCriterion("iinitial <>", value, "iinitial");
            return (Criteria) this;
        }

        public Criteria andIinitialGreaterThan(String value) {
            addCriterion("iinitial >", value, "iinitial");
            return (Criteria) this;
        }

        public Criteria andIinitialGreaterThanOrEqualTo(String value) {
            addCriterion("iinitial >=", value, "iinitial");
            return (Criteria) this;
        }

        public Criteria andIinitialLessThan(String value) {
            addCriterion("iinitial <", value, "iinitial");
            return (Criteria) this;
        }

        public Criteria andIinitialLessThanOrEqualTo(String value) {
            addCriterion("iinitial <=", value, "iinitial");
            return (Criteria) this;
        }

        public Criteria andIinitialLike(String value) {
            addCriterion("iinitial like", value, "iinitial");
            return (Criteria) this;
        }

        public Criteria andIinitialNotLike(String value) {
            addCriterion("iinitial not like", value, "iinitial");
            return (Criteria) this;
        }

        public Criteria andIinitialIn(List<String> values) {
            addCriterion("iinitial in", values, "iinitial");
            return (Criteria) this;
        }

        public Criteria andIinitialNotIn(List<String> values) {
            addCriterion("iinitial not in", values, "iinitial");
            return (Criteria) this;
        }

        public Criteria andIinitialBetween(String value1, String value2) {
            addCriterion("iinitial between", value1, value2, "iinitial");
            return (Criteria) this;
        }

        public Criteria andIinitialNotBetween(String value1, String value2) {
            addCriterion("iinitial not between", value1, value2, "iinitial");
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