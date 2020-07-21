package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class GoodsdjExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsdjExample() {
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

        public Criteria andAiidIsNull() {
            addCriterion("aiid is null");
            return (Criteria) this;
        }

        public Criteria andAiidIsNotNull() {
            addCriterion("aiid is not null");
            return (Criteria) this;
        }

        public Criteria andAiidEqualTo(Integer value) {
            addCriterion("aiid =", value, "aiid");
            return (Criteria) this;
        }

        public Criteria andAiidNotEqualTo(Integer value) {
            addCriterion("aiid <>", value, "aiid");
            return (Criteria) this;
        }

        public Criteria andAiidGreaterThan(Integer value) {
            addCriterion("aiid >", value, "aiid");
            return (Criteria) this;
        }

        public Criteria andAiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aiid >=", value, "aiid");
            return (Criteria) this;
        }

        public Criteria andAiidLessThan(Integer value) {
            addCriterion("aiid <", value, "aiid");
            return (Criteria) this;
        }

        public Criteria andAiidLessThanOrEqualTo(Integer value) {
            addCriterion("aiid <=", value, "aiid");
            return (Criteria) this;
        }

        public Criteria andAiidIn(List<Integer> values) {
            addCriterion("aiid in", values, "aiid");
            return (Criteria) this;
        }

        public Criteria andAiidNotIn(List<Integer> values) {
            addCriterion("aiid not in", values, "aiid");
            return (Criteria) this;
        }

        public Criteria andAiidBetween(Integer value1, Integer value2) {
            addCriterion("aiid between", value1, value2, "aiid");
            return (Criteria) this;
        }

        public Criteria andAiidNotBetween(Integer value1, Integer value2) {
            addCriterion("aiid not between", value1, value2, "aiid");
            return (Criteria) this;
        }

        public Criteria andAinameIsNull() {
            addCriterion("ainame is null");
            return (Criteria) this;
        }

        public Criteria andAinameIsNotNull() {
            addCriterion("ainame is not null");
            return (Criteria) this;
        }

        public Criteria andAinameEqualTo(String value) {
            addCriterion("ainame =", value, "ainame");
            return (Criteria) this;
        }

        public Criteria andAinameNotEqualTo(String value) {
            addCriterion("ainame <>", value, "ainame");
            return (Criteria) this;
        }

        public Criteria andAinameGreaterThan(String value) {
            addCriterion("ainame >", value, "ainame");
            return (Criteria) this;
        }

        public Criteria andAinameGreaterThanOrEqualTo(String value) {
            addCriterion("ainame >=", value, "ainame");
            return (Criteria) this;
        }

        public Criteria andAinameLessThan(String value) {
            addCriterion("ainame <", value, "ainame");
            return (Criteria) this;
        }

        public Criteria andAinameLessThanOrEqualTo(String value) {
            addCriterion("ainame <=", value, "ainame");
            return (Criteria) this;
        }

        public Criteria andAinameLike(String value) {
            addCriterion("ainame like", value, "ainame");
            return (Criteria) this;
        }

        public Criteria andAinameNotLike(String value) {
            addCriterion("ainame not like", value, "ainame");
            return (Criteria) this;
        }

        public Criteria andAinameIn(List<String> values) {
            addCriterion("ainame in", values, "ainame");
            return (Criteria) this;
        }

        public Criteria andAinameNotIn(List<String> values) {
            addCriterion("ainame not in", values, "ainame");
            return (Criteria) this;
        }

        public Criteria andAinameBetween(String value1, String value2) {
            addCriterion("ainame between", value1, value2, "ainame");
            return (Criteria) this;
        }

        public Criteria andAinameNotBetween(String value1, String value2) {
            addCriterion("ainame not between", value1, value2, "ainame");
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