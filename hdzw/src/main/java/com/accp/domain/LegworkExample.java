package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class LegworkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LegworkExample() {
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

        public Criteria andVidIsNull() {
            addCriterion("vid is null");
            return (Criteria) this;
        }

        public Criteria andVidIsNotNull() {
            addCriterion("vid is not null");
            return (Criteria) this;
        }

        public Criteria andVidEqualTo(Integer value) {
            addCriterion("vid =", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotEqualTo(Integer value) {
            addCriterion("vid <>", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThan(Integer value) {
            addCriterion("vid >", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vid >=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThan(Integer value) {
            addCriterion("vid <", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThanOrEqualTo(Integer value) {
            addCriterion("vid <=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidIn(List<Integer> values) {
            addCriterion("vid in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotIn(List<Integer> values) {
            addCriterion("vid not in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidBetween(Integer value1, Integer value2) {
            addCriterion("vid between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotBetween(Integer value1, Integer value2) {
            addCriterion("vid not between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andVcaridIsNull() {
            addCriterion("vcarid is null");
            return (Criteria) this;
        }

        public Criteria andVcaridIsNotNull() {
            addCriterion("vcarid is not null");
            return (Criteria) this;
        }

        public Criteria andVcaridEqualTo(Integer value) {
            addCriterion("vcarid =", value, "vcarid");
            return (Criteria) this;
        }

        public Criteria andVcaridNotEqualTo(Integer value) {
            addCriterion("vcarid <>", value, "vcarid");
            return (Criteria) this;
        }

        public Criteria andVcaridGreaterThan(Integer value) {
            addCriterion("vcarid >", value, "vcarid");
            return (Criteria) this;
        }

        public Criteria andVcaridGreaterThanOrEqualTo(Integer value) {
            addCriterion("vcarid >=", value, "vcarid");
            return (Criteria) this;
        }

        public Criteria andVcaridLessThan(Integer value) {
            addCriterion("vcarid <", value, "vcarid");
            return (Criteria) this;
        }

        public Criteria andVcaridLessThanOrEqualTo(Integer value) {
            addCriterion("vcarid <=", value, "vcarid");
            return (Criteria) this;
        }

        public Criteria andVcaridIn(List<Integer> values) {
            addCriterion("vcarid in", values, "vcarid");
            return (Criteria) this;
        }

        public Criteria andVcaridNotIn(List<Integer> values) {
            addCriterion("vcarid not in", values, "vcarid");
            return (Criteria) this;
        }

        public Criteria andVcaridBetween(Integer value1, Integer value2) {
            addCriterion("vcarid between", value1, value2, "vcarid");
            return (Criteria) this;
        }

        public Criteria andVcaridNotBetween(Integer value1, Integer value2) {
            addCriterion("vcarid not between", value1, value2, "vcarid");
            return (Criteria) this;
        }

        public Criteria andVteamidIsNull() {
            addCriterion("vteamid is null");
            return (Criteria) this;
        }

        public Criteria andVteamidIsNotNull() {
            addCriterion("vteamid is not null");
            return (Criteria) this;
        }

        public Criteria andVteamidEqualTo(Integer value) {
            addCriterion("vteamid =", value, "vteamid");
            return (Criteria) this;
        }

        public Criteria andVteamidNotEqualTo(Integer value) {
            addCriterion("vteamid <>", value, "vteamid");
            return (Criteria) this;
        }

        public Criteria andVteamidGreaterThan(Integer value) {
            addCriterion("vteamid >", value, "vteamid");
            return (Criteria) this;
        }

        public Criteria andVteamidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vteamid >=", value, "vteamid");
            return (Criteria) this;
        }

        public Criteria andVteamidLessThan(Integer value) {
            addCriterion("vteamid <", value, "vteamid");
            return (Criteria) this;
        }

        public Criteria andVteamidLessThanOrEqualTo(Integer value) {
            addCriterion("vteamid <=", value, "vteamid");
            return (Criteria) this;
        }

        public Criteria andVteamidIn(List<Integer> values) {
            addCriterion("vteamid in", values, "vteamid");
            return (Criteria) this;
        }

        public Criteria andVteamidNotIn(List<Integer> values) {
            addCriterion("vteamid not in", values, "vteamid");
            return (Criteria) this;
        }

        public Criteria andVteamidBetween(Integer value1, Integer value2) {
            addCriterion("vteamid between", value1, value2, "vteamid");
            return (Criteria) this;
        }

        public Criteria andVteamidNotBetween(Integer value1, Integer value2) {
            addCriterion("vteamid not between", value1, value2, "vteamid");
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