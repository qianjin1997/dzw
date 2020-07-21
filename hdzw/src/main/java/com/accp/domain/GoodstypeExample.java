package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class GoodstypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodstypeExample() {
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

        public Criteria andAeidIsNull() {
            addCriterion("aeid is null");
            return (Criteria) this;
        }

        public Criteria andAeidIsNotNull() {
            addCriterion("aeid is not null");
            return (Criteria) this;
        }

        public Criteria andAeidEqualTo(Integer value) {
            addCriterion("aeid =", value, "aeid");
            return (Criteria) this;
        }

        public Criteria andAeidNotEqualTo(Integer value) {
            addCriterion("aeid <>", value, "aeid");
            return (Criteria) this;
        }

        public Criteria andAeidGreaterThan(Integer value) {
            addCriterion("aeid >", value, "aeid");
            return (Criteria) this;
        }

        public Criteria andAeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aeid >=", value, "aeid");
            return (Criteria) this;
        }

        public Criteria andAeidLessThan(Integer value) {
            addCriterion("aeid <", value, "aeid");
            return (Criteria) this;
        }

        public Criteria andAeidLessThanOrEqualTo(Integer value) {
            addCriterion("aeid <=", value, "aeid");
            return (Criteria) this;
        }

        public Criteria andAeidIn(List<Integer> values) {
            addCriterion("aeid in", values, "aeid");
            return (Criteria) this;
        }

        public Criteria andAeidNotIn(List<Integer> values) {
            addCriterion("aeid not in", values, "aeid");
            return (Criteria) this;
        }

        public Criteria andAeidBetween(Integer value1, Integer value2) {
            addCriterion("aeid between", value1, value2, "aeid");
            return (Criteria) this;
        }

        public Criteria andAeidNotBetween(Integer value1, Integer value2) {
            addCriterion("aeid not between", value1, value2, "aeid");
            return (Criteria) this;
        }

        public Criteria andAelnameIsNull() {
            addCriterion("aelname is null");
            return (Criteria) this;
        }

        public Criteria andAelnameIsNotNull() {
            addCriterion("aelname is not null");
            return (Criteria) this;
        }

        public Criteria andAelnameEqualTo(String value) {
            addCriterion("aelname =", value, "aelname");
            return (Criteria) this;
        }

        public Criteria andAelnameNotEqualTo(String value) {
            addCriterion("aelname <>", value, "aelname");
            return (Criteria) this;
        }

        public Criteria andAelnameGreaterThan(String value) {
            addCriterion("aelname >", value, "aelname");
            return (Criteria) this;
        }

        public Criteria andAelnameGreaterThanOrEqualTo(String value) {
            addCriterion("aelname >=", value, "aelname");
            return (Criteria) this;
        }

        public Criteria andAelnameLessThan(String value) {
            addCriterion("aelname <", value, "aelname");
            return (Criteria) this;
        }

        public Criteria andAelnameLessThanOrEqualTo(String value) {
            addCriterion("aelname <=", value, "aelname");
            return (Criteria) this;
        }

        public Criteria andAelnameLike(String value) {
            addCriterion("aelname like", value, "aelname");
            return (Criteria) this;
        }

        public Criteria andAelnameNotLike(String value) {
            addCriterion("aelname not like", value, "aelname");
            return (Criteria) this;
        }

        public Criteria andAelnameIn(List<String> values) {
            addCriterion("aelname in", values, "aelname");
            return (Criteria) this;
        }

        public Criteria andAelnameNotIn(List<String> values) {
            addCriterion("aelname not in", values, "aelname");
            return (Criteria) this;
        }

        public Criteria andAelnameBetween(String value1, String value2) {
            addCriterion("aelname between", value1, value2, "aelname");
            return (Criteria) this;
        }

        public Criteria andAelnameNotBetween(String value1, String value2) {
            addCriterion("aelname not between", value1, value2, "aelname");
            return (Criteria) this;
        }

        public Criteria andAeparentidIsNull() {
            addCriterion("aeparentid is null");
            return (Criteria) this;
        }

        public Criteria andAeparentidIsNotNull() {
            addCriterion("aeparentid is not null");
            return (Criteria) this;
        }

        public Criteria andAeparentidEqualTo(Integer value) {
            addCriterion("aeparentid =", value, "aeparentid");
            return (Criteria) this;
        }

        public Criteria andAeparentidNotEqualTo(Integer value) {
            addCriterion("aeparentid <>", value, "aeparentid");
            return (Criteria) this;
        }

        public Criteria andAeparentidGreaterThan(Integer value) {
            addCriterion("aeparentid >", value, "aeparentid");
            return (Criteria) this;
        }

        public Criteria andAeparentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aeparentid >=", value, "aeparentid");
            return (Criteria) this;
        }

        public Criteria andAeparentidLessThan(Integer value) {
            addCriterion("aeparentid <", value, "aeparentid");
            return (Criteria) this;
        }

        public Criteria andAeparentidLessThanOrEqualTo(Integer value) {
            addCriterion("aeparentid <=", value, "aeparentid");
            return (Criteria) this;
        }

        public Criteria andAeparentidIn(List<Integer> values) {
            addCriterion("aeparentid in", values, "aeparentid");
            return (Criteria) this;
        }

        public Criteria andAeparentidNotIn(List<Integer> values) {
            addCriterion("aeparentid not in", values, "aeparentid");
            return (Criteria) this;
        }

        public Criteria andAeparentidBetween(Integer value1, Integer value2) {
            addCriterion("aeparentid between", value1, value2, "aeparentid");
            return (Criteria) this;
        }

        public Criteria andAeparentidNotBetween(Integer value1, Integer value2) {
            addCriterion("aeparentid not between", value1, value2, "aeparentid");
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