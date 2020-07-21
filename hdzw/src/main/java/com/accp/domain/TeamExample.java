package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class TeamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUteamidIsNull() {
            addCriterion("uteamid is null");
            return (Criteria) this;
        }

        public Criteria andUteamidIsNotNull() {
            addCriterion("uteamid is not null");
            return (Criteria) this;
        }

        public Criteria andUteamidEqualTo(Integer value) {
            addCriterion("uteamid =", value, "uteamid");
            return (Criteria) this;
        }

        public Criteria andUteamidNotEqualTo(Integer value) {
            addCriterion("uteamid <>", value, "uteamid");
            return (Criteria) this;
        }

        public Criteria andUteamidGreaterThan(Integer value) {
            addCriterion("uteamid >", value, "uteamid");
            return (Criteria) this;
        }

        public Criteria andUteamidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uteamid >=", value, "uteamid");
            return (Criteria) this;
        }

        public Criteria andUteamidLessThan(Integer value) {
            addCriterion("uteamid <", value, "uteamid");
            return (Criteria) this;
        }

        public Criteria andUteamidLessThanOrEqualTo(Integer value) {
            addCriterion("uteamid <=", value, "uteamid");
            return (Criteria) this;
        }

        public Criteria andUteamidIn(List<Integer> values) {
            addCriterion("uteamid in", values, "uteamid");
            return (Criteria) this;
        }

        public Criteria andUteamidNotIn(List<Integer> values) {
            addCriterion("uteamid not in", values, "uteamid");
            return (Criteria) this;
        }

        public Criteria andUteamidBetween(Integer value1, Integer value2) {
            addCriterion("uteamid between", value1, value2, "uteamid");
            return (Criteria) this;
        }

        public Criteria andUteamidNotBetween(Integer value1, Integer value2) {
            addCriterion("uteamid not between", value1, value2, "uteamid");
            return (Criteria) this;
        }

        public Criteria andUznbaiIsNull() {
            addCriterion("uZnbai is null");
            return (Criteria) this;
        }

        public Criteria andUznbaiIsNotNull() {
            addCriterion("uZnbai is not null");
            return (Criteria) this;
        }

        public Criteria andUznbaiEqualTo(Float value) {
            addCriterion("uZnbai =", value, "uznbai");
            return (Criteria) this;
        }

        public Criteria andUznbaiNotEqualTo(Float value) {
            addCriterion("uZnbai <>", value, "uznbai");
            return (Criteria) this;
        }

        public Criteria andUznbaiGreaterThan(Float value) {
            addCriterion("uZnbai >", value, "uznbai");
            return (Criteria) this;
        }

        public Criteria andUznbaiGreaterThanOrEqualTo(Float value) {
            addCriterion("uZnbai >=", value, "uznbai");
            return (Criteria) this;
        }

        public Criteria andUznbaiLessThan(Float value) {
            addCriterion("uZnbai <", value, "uznbai");
            return (Criteria) this;
        }

        public Criteria andUznbaiLessThanOrEqualTo(Float value) {
            addCriterion("uZnbai <=", value, "uznbai");
            return (Criteria) this;
        }

        public Criteria andUznbaiIn(List<Float> values) {
            addCriterion("uZnbai in", values, "uznbai");
            return (Criteria) this;
        }

        public Criteria andUznbaiNotIn(List<Float> values) {
            addCriterion("uZnbai not in", values, "uznbai");
            return (Criteria) this;
        }

        public Criteria andUznbaiBetween(Float value1, Float value2) {
            addCriterion("uZnbai between", value1, value2, "uznbai");
            return (Criteria) this;
        }

        public Criteria andUznbaiNotBetween(Float value1, Float value2) {
            addCriterion("uZnbai not between", value1, value2, "uznbai");
            return (Criteria) this;
        }

        public Criteria andUznwanIsNull() {
            addCriterion("uZnwan is null");
            return (Criteria) this;
        }

        public Criteria andUznwanIsNotNull() {
            addCriterion("uZnwan is not null");
            return (Criteria) this;
        }

        public Criteria andUznwanEqualTo(Float value) {
            addCriterion("uZnwan =", value, "uznwan");
            return (Criteria) this;
        }

        public Criteria andUznwanNotEqualTo(Float value) {
            addCriterion("uZnwan <>", value, "uznwan");
            return (Criteria) this;
        }

        public Criteria andUznwanGreaterThan(Float value) {
            addCriterion("uZnwan >", value, "uznwan");
            return (Criteria) this;
        }

        public Criteria andUznwanGreaterThanOrEqualTo(Float value) {
            addCriterion("uZnwan >=", value, "uznwan");
            return (Criteria) this;
        }

        public Criteria andUznwanLessThan(Float value) {
            addCriterion("uZnwan <", value, "uznwan");
            return (Criteria) this;
        }

        public Criteria andUznwanLessThanOrEqualTo(Float value) {
            addCriterion("uZnwan <=", value, "uznwan");
            return (Criteria) this;
        }

        public Criteria andUznwanIn(List<Float> values) {
            addCriterion("uZnwan in", values, "uznwan");
            return (Criteria) this;
        }

        public Criteria andUznwanNotIn(List<Float> values) {
            addCriterion("uZnwan not in", values, "uznwan");
            return (Criteria) this;
        }

        public Criteria andUznwanBetween(Float value1, Float value2) {
            addCriterion("uZnwan between", value1, value2, "uznwan");
            return (Criteria) this;
        }

        public Criteria andUznwanNotBetween(Float value1, Float value2) {
            addCriterion("uZnwan not between", value1, value2, "uznwan");
            return (Criteria) this;
        }

        public Criteria andUzwbaiIsNull() {
            addCriterion("uZwbai is null");
            return (Criteria) this;
        }

        public Criteria andUzwbaiIsNotNull() {
            addCriterion("uZwbai is not null");
            return (Criteria) this;
        }

        public Criteria andUzwbaiEqualTo(Float value) {
            addCriterion("uZwbai =", value, "uzwbai");
            return (Criteria) this;
        }

        public Criteria andUzwbaiNotEqualTo(Float value) {
            addCriterion("uZwbai <>", value, "uzwbai");
            return (Criteria) this;
        }

        public Criteria andUzwbaiGreaterThan(Float value) {
            addCriterion("uZwbai >", value, "uzwbai");
            return (Criteria) this;
        }

        public Criteria andUzwbaiGreaterThanOrEqualTo(Float value) {
            addCriterion("uZwbai >=", value, "uzwbai");
            return (Criteria) this;
        }

        public Criteria andUzwbaiLessThan(Float value) {
            addCriterion("uZwbai <", value, "uzwbai");
            return (Criteria) this;
        }

        public Criteria andUzwbaiLessThanOrEqualTo(Float value) {
            addCriterion("uZwbai <=", value, "uzwbai");
            return (Criteria) this;
        }

        public Criteria andUzwbaiIn(List<Float> values) {
            addCriterion("uZwbai in", values, "uzwbai");
            return (Criteria) this;
        }

        public Criteria andUzwbaiNotIn(List<Float> values) {
            addCriterion("uZwbai not in", values, "uzwbai");
            return (Criteria) this;
        }

        public Criteria andUzwbaiBetween(Float value1, Float value2) {
            addCriterion("uZwbai between", value1, value2, "uzwbai");
            return (Criteria) this;
        }

        public Criteria andUzwbaiNotBetween(Float value1, Float value2) {
            addCriterion("uZwbai not between", value1, value2, "uzwbai");
            return (Criteria) this;
        }

        public Criteria andUzwwanIsNull() {
            addCriterion("uZwwan is null");
            return (Criteria) this;
        }

        public Criteria andUzwwanIsNotNull() {
            addCriterion("uZwwan is not null");
            return (Criteria) this;
        }

        public Criteria andUzwwanEqualTo(Float value) {
            addCriterion("uZwwan =", value, "uzwwan");
            return (Criteria) this;
        }

        public Criteria andUzwwanNotEqualTo(Float value) {
            addCriterion("uZwwan <>", value, "uzwwan");
            return (Criteria) this;
        }

        public Criteria andUzwwanGreaterThan(Float value) {
            addCriterion("uZwwan >", value, "uzwwan");
            return (Criteria) this;
        }

        public Criteria andUzwwanGreaterThanOrEqualTo(Float value) {
            addCriterion("uZwwan >=", value, "uzwwan");
            return (Criteria) this;
        }

        public Criteria andUzwwanLessThan(Float value) {
            addCriterion("uZwwan <", value, "uzwwan");
            return (Criteria) this;
        }

        public Criteria andUzwwanLessThanOrEqualTo(Float value) {
            addCriterion("uZwwan <=", value, "uzwwan");
            return (Criteria) this;
        }

        public Criteria andUzwwanIn(List<Float> values) {
            addCriterion("uZwwan in", values, "uzwwan");
            return (Criteria) this;
        }

        public Criteria andUzwwanNotIn(List<Float> values) {
            addCriterion("uZwwan not in", values, "uzwwan");
            return (Criteria) this;
        }

        public Criteria andUzwwanBetween(Float value1, Float value2) {
            addCriterion("uZwwan between", value1, value2, "uzwwan");
            return (Criteria) this;
        }

        public Criteria andUzwwanNotBetween(Float value1, Float value2) {
            addCriterion("uZwwan not between", value1, value2, "uzwwan");
            return (Criteria) this;
        }

        public Criteria andUztbaiIsNull() {
            addCriterion("uZtbai is null");
            return (Criteria) this;
        }

        public Criteria andUztbaiIsNotNull() {
            addCriterion("uZtbai is not null");
            return (Criteria) this;
        }

        public Criteria andUztbaiEqualTo(Float value) {
            addCriterion("uZtbai =", value, "uztbai");
            return (Criteria) this;
        }

        public Criteria andUztbaiNotEqualTo(Float value) {
            addCriterion("uZtbai <>", value, "uztbai");
            return (Criteria) this;
        }

        public Criteria andUztbaiGreaterThan(Float value) {
            addCriterion("uZtbai >", value, "uztbai");
            return (Criteria) this;
        }

        public Criteria andUztbaiGreaterThanOrEqualTo(Float value) {
            addCriterion("uZtbai >=", value, "uztbai");
            return (Criteria) this;
        }

        public Criteria andUztbaiLessThan(Float value) {
            addCriterion("uZtbai <", value, "uztbai");
            return (Criteria) this;
        }

        public Criteria andUztbaiLessThanOrEqualTo(Float value) {
            addCriterion("uZtbai <=", value, "uztbai");
            return (Criteria) this;
        }

        public Criteria andUztbaiIn(List<Float> values) {
            addCriterion("uZtbai in", values, "uztbai");
            return (Criteria) this;
        }

        public Criteria andUztbaiNotIn(List<Float> values) {
            addCriterion("uZtbai not in", values, "uztbai");
            return (Criteria) this;
        }

        public Criteria andUztbaiBetween(Float value1, Float value2) {
            addCriterion("uZtbai between", value1, value2, "uztbai");
            return (Criteria) this;
        }

        public Criteria andUztbaiNotBetween(Float value1, Float value2) {
            addCriterion("uZtbai not between", value1, value2, "uztbai");
            return (Criteria) this;
        }

        public Criteria andUztwanIsNull() {
            addCriterion("uZtwan is null");
            return (Criteria) this;
        }

        public Criteria andUztwanIsNotNull() {
            addCriterion("uZtwan is not null");
            return (Criteria) this;
        }

        public Criteria andUztwanEqualTo(Float value) {
            addCriterion("uZtwan =", value, "uztwan");
            return (Criteria) this;
        }

        public Criteria andUztwanNotEqualTo(Float value) {
            addCriterion("uZtwan <>", value, "uztwan");
            return (Criteria) this;
        }

        public Criteria andUztwanGreaterThan(Float value) {
            addCriterion("uZtwan >", value, "uztwan");
            return (Criteria) this;
        }

        public Criteria andUztwanGreaterThanOrEqualTo(Float value) {
            addCriterion("uZtwan >=", value, "uztwan");
            return (Criteria) this;
        }

        public Criteria andUztwanLessThan(Float value) {
            addCriterion("uZtwan <", value, "uztwan");
            return (Criteria) this;
        }

        public Criteria andUztwanLessThanOrEqualTo(Float value) {
            addCriterion("uZtwan <=", value, "uztwan");
            return (Criteria) this;
        }

        public Criteria andUztwanIn(List<Float> values) {
            addCriterion("uZtwan in", values, "uztwan");
            return (Criteria) this;
        }

        public Criteria andUztwanNotIn(List<Float> values) {
            addCriterion("uZtwan not in", values, "uztwan");
            return (Criteria) this;
        }

        public Criteria andUztwanBetween(Float value1, Float value2) {
            addCriterion("uZtwan between", value1, value2, "uztwan");
            return (Criteria) this;
        }

        public Criteria andUztwanNotBetween(Float value1, Float value2) {
            addCriterion("uZtwan not between", value1, value2, "uztwan");
            return (Criteria) this;
        }

        public Criteria andUranyoufIsNull() {
            addCriterion("uRanyouf is null");
            return (Criteria) this;
        }

        public Criteria andUranyoufIsNotNull() {
            addCriterion("uRanyouf is not null");
            return (Criteria) this;
        }

        public Criteria andUranyoufEqualTo(Float value) {
            addCriterion("uRanyouf =", value, "uranyouf");
            return (Criteria) this;
        }

        public Criteria andUranyoufNotEqualTo(Float value) {
            addCriterion("uRanyouf <>", value, "uranyouf");
            return (Criteria) this;
        }

        public Criteria andUranyoufGreaterThan(Float value) {
            addCriterion("uRanyouf >", value, "uranyouf");
            return (Criteria) this;
        }

        public Criteria andUranyoufGreaterThanOrEqualTo(Float value) {
            addCriterion("uRanyouf >=", value, "uranyouf");
            return (Criteria) this;
        }

        public Criteria andUranyoufLessThan(Float value) {
            addCriterion("uRanyouf <", value, "uranyouf");
            return (Criteria) this;
        }

        public Criteria andUranyoufLessThanOrEqualTo(Float value) {
            addCriterion("uRanyouf <=", value, "uranyouf");
            return (Criteria) this;
        }

        public Criteria andUranyoufIn(List<Float> values) {
            addCriterion("uRanyouf in", values, "uranyouf");
            return (Criteria) this;
        }

        public Criteria andUranyoufNotIn(List<Float> values) {
            addCriterion("uRanyouf not in", values, "uranyouf");
            return (Criteria) this;
        }

        public Criteria andUranyoufBetween(Float value1, Float value2) {
            addCriterion("uRanyouf between", value1, value2, "uranyouf");
            return (Criteria) this;
        }

        public Criteria andUranyoufNotBetween(Float value1, Float value2) {
            addCriterion("uRanyouf not between", value1, value2, "uranyouf");
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