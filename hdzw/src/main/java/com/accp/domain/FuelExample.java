package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class FuelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FuelExample() {
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

        public Criteria andKidIsNull() {
            addCriterion("kid is null");
            return (Criteria) this;
        }

        public Criteria andKidIsNotNull() {
            addCriterion("kid is not null");
            return (Criteria) this;
        }

        public Criteria andKidEqualTo(Integer value) {
            addCriterion("kid =", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidNotEqualTo(Integer value) {
            addCriterion("kid <>", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidGreaterThan(Integer value) {
            addCriterion("kid >", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidGreaterThanOrEqualTo(Integer value) {
            addCriterion("kid >=", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidLessThan(Integer value) {
            addCriterion("kid <", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidLessThanOrEqualTo(Integer value) {
            addCriterion("kid <=", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidIn(List<Integer> values) {
            addCriterion("kid in", values, "kid");
            return (Criteria) this;
        }

        public Criteria andKidNotIn(List<Integer> values) {
            addCriterion("kid not in", values, "kid");
            return (Criteria) this;
        }

        public Criteria andKidBetween(Integer value1, Integer value2) {
            addCriterion("kid between", value1, value2, "kid");
            return (Criteria) this;
        }

        public Criteria andKidNotBetween(Integer value1, Integer value2) {
            addCriterion("kid not between", value1, value2, "kid");
            return (Criteria) this;
        }

        public Criteria andKfuelidIsNull() {
            addCriterion("kfuelid is null");
            return (Criteria) this;
        }

        public Criteria andKfuelidIsNotNull() {
            addCriterion("kfuelid is not null");
            return (Criteria) this;
        }

        public Criteria andKfuelidEqualTo(String value) {
            addCriterion("kfuelid =", value, "kfuelid");
            return (Criteria) this;
        }

        public Criteria andKfuelidNotEqualTo(String value) {
            addCriterion("kfuelid <>", value, "kfuelid");
            return (Criteria) this;
        }

        public Criteria andKfuelidGreaterThan(String value) {
            addCriterion("kfuelid >", value, "kfuelid");
            return (Criteria) this;
        }

        public Criteria andKfuelidGreaterThanOrEqualTo(String value) {
            addCriterion("kfuelid >=", value, "kfuelid");
            return (Criteria) this;
        }

        public Criteria andKfuelidLessThan(String value) {
            addCriterion("kfuelid <", value, "kfuelid");
            return (Criteria) this;
        }

        public Criteria andKfuelidLessThanOrEqualTo(String value) {
            addCriterion("kfuelid <=", value, "kfuelid");
            return (Criteria) this;
        }

        public Criteria andKfuelidLike(String value) {
            addCriterion("kfuelid like", value, "kfuelid");
            return (Criteria) this;
        }

        public Criteria andKfuelidNotLike(String value) {
            addCriterion("kfuelid not like", value, "kfuelid");
            return (Criteria) this;
        }

        public Criteria andKfuelidIn(List<String> values) {
            addCriterion("kfuelid in", values, "kfuelid");
            return (Criteria) this;
        }

        public Criteria andKfuelidNotIn(List<String> values) {
            addCriterion("kfuelid not in", values, "kfuelid");
            return (Criteria) this;
        }

        public Criteria andKfuelidBetween(String value1, String value2) {
            addCriterion("kfuelid between", value1, value2, "kfuelid");
            return (Criteria) this;
        }

        public Criteria andKfuelidNotBetween(String value1, String value2) {
            addCriterion("kfuelid not between", value1, value2, "kfuelid");
            return (Criteria) this;
        }

        public Criteria andKfuelnameIsNull() {
            addCriterion("kfuelname is null");
            return (Criteria) this;
        }

        public Criteria andKfuelnameIsNotNull() {
            addCriterion("kfuelname is not null");
            return (Criteria) this;
        }

        public Criteria andKfuelnameEqualTo(String value) {
            addCriterion("kfuelname =", value, "kfuelname");
            return (Criteria) this;
        }

        public Criteria andKfuelnameNotEqualTo(String value) {
            addCriterion("kfuelname <>", value, "kfuelname");
            return (Criteria) this;
        }

        public Criteria andKfuelnameGreaterThan(String value) {
            addCriterion("kfuelname >", value, "kfuelname");
            return (Criteria) this;
        }

        public Criteria andKfuelnameGreaterThanOrEqualTo(String value) {
            addCriterion("kfuelname >=", value, "kfuelname");
            return (Criteria) this;
        }

        public Criteria andKfuelnameLessThan(String value) {
            addCriterion("kfuelname <", value, "kfuelname");
            return (Criteria) this;
        }

        public Criteria andKfuelnameLessThanOrEqualTo(String value) {
            addCriterion("kfuelname <=", value, "kfuelname");
            return (Criteria) this;
        }

        public Criteria andKfuelnameLike(String value) {
            addCriterion("kfuelname like", value, "kfuelname");
            return (Criteria) this;
        }

        public Criteria andKfuelnameNotLike(String value) {
            addCriterion("kfuelname not like", value, "kfuelname");
            return (Criteria) this;
        }

        public Criteria andKfuelnameIn(List<String> values) {
            addCriterion("kfuelname in", values, "kfuelname");
            return (Criteria) this;
        }

        public Criteria andKfuelnameNotIn(List<String> values) {
            addCriterion("kfuelname not in", values, "kfuelname");
            return (Criteria) this;
        }

        public Criteria andKfuelnameBetween(String value1, String value2) {
            addCriterion("kfuelname between", value1, value2, "kfuelname");
            return (Criteria) this;
        }

        public Criteria andKfuelnameNotBetween(String value1, String value2) {
            addCriterion("kfuelname not between", value1, value2, "kfuelname");
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