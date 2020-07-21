package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class MaintainxmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaintainxmExample() {
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

        public Criteria andXidIsNull() {
            addCriterion("xid is null");
            return (Criteria) this;
        }

        public Criteria andXidIsNotNull() {
            addCriterion("xid is not null");
            return (Criteria) this;
        }

        public Criteria andXidEqualTo(Integer value) {
            addCriterion("xid =", value, "xid");
            return (Criteria) this;
        }

        public Criteria andXidNotEqualTo(Integer value) {
            addCriterion("xid <>", value, "xid");
            return (Criteria) this;
        }

        public Criteria andXidGreaterThan(Integer value) {
            addCriterion("xid >", value, "xid");
            return (Criteria) this;
        }

        public Criteria andXidGreaterThanOrEqualTo(Integer value) {
            addCriterion("xid >=", value, "xid");
            return (Criteria) this;
        }

        public Criteria andXidLessThan(Integer value) {
            addCriterion("xid <", value, "xid");
            return (Criteria) this;
        }

        public Criteria andXidLessThanOrEqualTo(Integer value) {
            addCriterion("xid <=", value, "xid");
            return (Criteria) this;
        }

        public Criteria andXidIn(List<Integer> values) {
            addCriterion("xid in", values, "xid");
            return (Criteria) this;
        }

        public Criteria andXidNotIn(List<Integer> values) {
            addCriterion("xid not in", values, "xid");
            return (Criteria) this;
        }

        public Criteria andXidBetween(Integer value1, Integer value2) {
            addCriterion("xid between", value1, value2, "xid");
            return (Criteria) this;
        }

        public Criteria andXidNotBetween(Integer value1, Integer value2) {
            addCriterion("xid not between", value1, value2, "xid");
            return (Criteria) this;
        }

        public Criteria andXmaintainnameIsNull() {
            addCriterion("xmaintainname is null");
            return (Criteria) this;
        }

        public Criteria andXmaintainnameIsNotNull() {
            addCriterion("xmaintainname is not null");
            return (Criteria) this;
        }

        public Criteria andXmaintainnameEqualTo(String value) {
            addCriterion("xmaintainname =", value, "xmaintainname");
            return (Criteria) this;
        }

        public Criteria andXmaintainnameNotEqualTo(String value) {
            addCriterion("xmaintainname <>", value, "xmaintainname");
            return (Criteria) this;
        }

        public Criteria andXmaintainnameGreaterThan(String value) {
            addCriterion("xmaintainname >", value, "xmaintainname");
            return (Criteria) this;
        }

        public Criteria andXmaintainnameGreaterThanOrEqualTo(String value) {
            addCriterion("xmaintainname >=", value, "xmaintainname");
            return (Criteria) this;
        }

        public Criteria andXmaintainnameLessThan(String value) {
            addCriterion("xmaintainname <", value, "xmaintainname");
            return (Criteria) this;
        }

        public Criteria andXmaintainnameLessThanOrEqualTo(String value) {
            addCriterion("xmaintainname <=", value, "xmaintainname");
            return (Criteria) this;
        }

        public Criteria andXmaintainnameLike(String value) {
            addCriterion("xmaintainname like", value, "xmaintainname");
            return (Criteria) this;
        }

        public Criteria andXmaintainnameNotLike(String value) {
            addCriterion("xmaintainname not like", value, "xmaintainname");
            return (Criteria) this;
        }

        public Criteria andXmaintainnameIn(List<String> values) {
            addCriterion("xmaintainname in", values, "xmaintainname");
            return (Criteria) this;
        }

        public Criteria andXmaintainnameNotIn(List<String> values) {
            addCriterion("xmaintainname not in", values, "xmaintainname");
            return (Criteria) this;
        }

        public Criteria andXmaintainnameBetween(String value1, String value2) {
            addCriterion("xmaintainname between", value1, value2, "xmaintainname");
            return (Criteria) this;
        }

        public Criteria andXmaintainnameNotBetween(String value1, String value2) {
            addCriterion("xmaintainname not between", value1, value2, "xmaintainname");
            return (Criteria) this;
        }

        public Criteria andXparentidIsNull() {
            addCriterion("xparentid is null");
            return (Criteria) this;
        }

        public Criteria andXparentidIsNotNull() {
            addCriterion("xparentid is not null");
            return (Criteria) this;
        }

        public Criteria andXparentidEqualTo(Integer value) {
            addCriterion("xparentid =", value, "xparentid");
            return (Criteria) this;
        }

        public Criteria andXparentidNotEqualTo(Integer value) {
            addCriterion("xparentid <>", value, "xparentid");
            return (Criteria) this;
        }

        public Criteria andXparentidGreaterThan(Integer value) {
            addCriterion("xparentid >", value, "xparentid");
            return (Criteria) this;
        }

        public Criteria andXparentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("xparentid >=", value, "xparentid");
            return (Criteria) this;
        }

        public Criteria andXparentidLessThan(Integer value) {
            addCriterion("xparentid <", value, "xparentid");
            return (Criteria) this;
        }

        public Criteria andXparentidLessThanOrEqualTo(Integer value) {
            addCriterion("xparentid <=", value, "xparentid");
            return (Criteria) this;
        }

        public Criteria andXparentidIn(List<Integer> values) {
            addCriterion("xparentid in", values, "xparentid");
            return (Criteria) this;
        }

        public Criteria andXparentidNotIn(List<Integer> values) {
            addCriterion("xparentid not in", values, "xparentid");
            return (Criteria) this;
        }

        public Criteria andXparentidBetween(Integer value1, Integer value2) {
            addCriterion("xparentid between", value1, value2, "xparentid");
            return (Criteria) this;
        }

        public Criteria andXparentidNotBetween(Integer value1, Integer value2) {
            addCriterion("xparentid not between", value1, value2, "xparentid");
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