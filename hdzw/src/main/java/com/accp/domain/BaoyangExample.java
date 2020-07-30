package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BaoyangExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaoyangExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andByidIsNull() {
            addCriterion("byid is null");
            return (Criteria) this;
        }

        public Criteria andByidIsNotNull() {
            addCriterion("byid is not null");
            return (Criteria) this;
        }

        public Criteria andByidEqualTo(Integer value) {
            addCriterion("byid =", value, "byid");
            return (Criteria) this;
        }

        public Criteria andByidNotEqualTo(Integer value) {
            addCriterion("byid <>", value, "byid");
            return (Criteria) this;
        }

        public Criteria andByidGreaterThan(Integer value) {
            addCriterion("byid >", value, "byid");
            return (Criteria) this;
        }

        public Criteria andByidGreaterThanOrEqualTo(Integer value) {
            addCriterion("byid >=", value, "byid");
            return (Criteria) this;
        }

        public Criteria andByidLessThan(Integer value) {
            addCriterion("byid <", value, "byid");
            return (Criteria) this;
        }

        public Criteria andByidLessThanOrEqualTo(Integer value) {
            addCriterion("byid <=", value, "byid");
            return (Criteria) this;
        }

        public Criteria andByidIn(List<Integer> values) {
            addCriterion("byid in", values, "byid");
            return (Criteria) this;
        }

        public Criteria andByidNotIn(List<Integer> values) {
            addCriterion("byid not in", values, "byid");
            return (Criteria) this;
        }

        public Criteria andByidBetween(Integer value1, Integer value2) {
            addCriterion("byid between", value1, value2, "byid");
            return (Criteria) this;
        }

        public Criteria andByidNotBetween(Integer value1, Integer value2) {
            addCriterion("byid not between", value1, value2, "byid");
            return (Criteria) this;
        }

        public Criteria andBycaridIsNull() {
            addCriterion("bycarid is null");
            return (Criteria) this;
        }

        public Criteria andBycaridIsNotNull() {
            addCriterion("bycarid is not null");
            return (Criteria) this;
        }

        public Criteria andBycaridEqualTo(Integer value) {
            addCriterion("bycarid =", value, "bycarid");
            return (Criteria) this;
        }

        public Criteria andBycaridNotEqualTo(Integer value) {
            addCriterion("bycarid <>", value, "bycarid");
            return (Criteria) this;
        }

        public Criteria andBycaridGreaterThan(Integer value) {
            addCriterion("bycarid >", value, "bycarid");
            return (Criteria) this;
        }

        public Criteria andBycaridGreaterThanOrEqualTo(Integer value) {
            addCriterion("bycarid >=", value, "bycarid");
            return (Criteria) this;
        }

        public Criteria andBycaridLessThan(Integer value) {
            addCriterion("bycarid <", value, "bycarid");
            return (Criteria) this;
        }

        public Criteria andBycaridLessThanOrEqualTo(Integer value) {
            addCriterion("bycarid <=", value, "bycarid");
            return (Criteria) this;
        }

        public Criteria andBycaridIn(List<Integer> values) {
            addCriterion("bycarid in", values, "bycarid");
            return (Criteria) this;
        }

        public Criteria andBycaridNotIn(List<Integer> values) {
            addCriterion("bycarid not in", values, "bycarid");
            return (Criteria) this;
        }

        public Criteria andBycaridBetween(Integer value1, Integer value2) {
            addCriterion("bycarid between", value1, value2, "bycarid");
            return (Criteria) this;
        }

        public Criteria andBycaridNotBetween(Integer value1, Integer value2) {
            addCriterion("bycarid not between", value1, value2, "bycarid");
            return (Criteria) this;
        }

        public Criteria andBybaonameIsNull() {
            addCriterion("bybaoname is null");
            return (Criteria) this;
        }

        public Criteria andBybaonameIsNotNull() {
            addCriterion("bybaoname is not null");
            return (Criteria) this;
        }

        public Criteria andBybaonameEqualTo(String value) {
            addCriterion("bybaoname =", value, "bybaoname");
            return (Criteria) this;
        }

        public Criteria andBybaonameNotEqualTo(String value) {
            addCriterion("bybaoname <>", value, "bybaoname");
            return (Criteria) this;
        }

        public Criteria andBybaonameGreaterThan(String value) {
            addCriterion("bybaoname >", value, "bybaoname");
            return (Criteria) this;
        }

        public Criteria andBybaonameGreaterThanOrEqualTo(String value) {
            addCriterion("bybaoname >=", value, "bybaoname");
            return (Criteria) this;
        }

        public Criteria andBybaonameLessThan(String value) {
            addCriterion("bybaoname <", value, "bybaoname");
            return (Criteria) this;
        }

        public Criteria andBybaonameLessThanOrEqualTo(String value) {
            addCriterion("bybaoname <=", value, "bybaoname");
            return (Criteria) this;
        }

        public Criteria andBybaonameLike(String value) {
            addCriterion("bybaoname like", value, "bybaoname");
            return (Criteria) this;
        }

        public Criteria andBybaonameNotLike(String value) {
            addCriterion("bybaoname not like", value, "bybaoname");
            return (Criteria) this;
        }

        public Criteria andBybaonameIn(List<String> values) {
            addCriterion("bybaoname in", values, "bybaoname");
            return (Criteria) this;
        }

        public Criteria andBybaonameNotIn(List<String> values) {
            addCriterion("bybaoname not in", values, "bybaoname");
            return (Criteria) this;
        }

        public Criteria andBybaonameBetween(String value1, String value2) {
            addCriterion("bybaoname between", value1, value2, "bybaoname");
            return (Criteria) this;
        }

        public Criteria andBybaonameNotBetween(String value1, String value2) {
            addCriterion("bybaoname not between", value1, value2, "bybaoname");
            return (Criteria) this;
        }

        public Criteria andBylichengIsNull() {
            addCriterion("bylicheng is null");
            return (Criteria) this;
        }

        public Criteria andBylichengIsNotNull() {
            addCriterion("bylicheng is not null");
            return (Criteria) this;
        }

        public Criteria andBylichengEqualTo(String value) {
            addCriterion("bylicheng =", value, "bylicheng");
            return (Criteria) this;
        }

        public Criteria andBylichengNotEqualTo(String value) {
            addCriterion("bylicheng <>", value, "bylicheng");
            return (Criteria) this;
        }

        public Criteria andBylichengGreaterThan(String value) {
            addCriterion("bylicheng >", value, "bylicheng");
            return (Criteria) this;
        }

        public Criteria andBylichengGreaterThanOrEqualTo(String value) {
            addCriterion("bylicheng >=", value, "bylicheng");
            return (Criteria) this;
        }

        public Criteria andBylichengLessThan(String value) {
            addCriterion("bylicheng <", value, "bylicheng");
            return (Criteria) this;
        }

        public Criteria andBylichengLessThanOrEqualTo(String value) {
            addCriterion("bylicheng <=", value, "bylicheng");
            return (Criteria) this;
        }

        public Criteria andBylichengLike(String value) {
            addCriterion("bylicheng like", value, "bylicheng");
            return (Criteria) this;
        }

        public Criteria andBylichengNotLike(String value) {
            addCriterion("bylicheng not like", value, "bylicheng");
            return (Criteria) this;
        }

        public Criteria andBylichengIn(List<String> values) {
            addCriterion("bylicheng in", values, "bylicheng");
            return (Criteria) this;
        }

        public Criteria andBylichengNotIn(List<String> values) {
            addCriterion("bylicheng not in", values, "bylicheng");
            return (Criteria) this;
        }

        public Criteria andBylichengBetween(String value1, String value2) {
            addCriterion("bylicheng between", value1, value2, "bylicheng");
            return (Criteria) this;
        }

        public Criteria andBylichengNotBetween(String value1, String value2) {
            addCriterion("bylicheng not between", value1, value2, "bylicheng");
            return (Criteria) this;
        }

        public Criteria andBysjlichengIsNull() {
            addCriterion("bysjlicheng is null");
            return (Criteria) this;
        }

        public Criteria andBysjlichengIsNotNull() {
            addCriterion("bysjlicheng is not null");
            return (Criteria) this;
        }

        public Criteria andBysjlichengEqualTo(String value) {
            addCriterion("bysjlicheng =", value, "bysjlicheng");
            return (Criteria) this;
        }

        public Criteria andBysjlichengNotEqualTo(String value) {
            addCriterion("bysjlicheng <>", value, "bysjlicheng");
            return (Criteria) this;
        }

        public Criteria andBysjlichengGreaterThan(String value) {
            addCriterion("bysjlicheng >", value, "bysjlicheng");
            return (Criteria) this;
        }

        public Criteria andBysjlichengGreaterThanOrEqualTo(String value) {
            addCriterion("bysjlicheng >=", value, "bysjlicheng");
            return (Criteria) this;
        }

        public Criteria andBysjlichengLessThan(String value) {
            addCriterion("bysjlicheng <", value, "bysjlicheng");
            return (Criteria) this;
        }

        public Criteria andBysjlichengLessThanOrEqualTo(String value) {
            addCriterion("bysjlicheng <=", value, "bysjlicheng");
            return (Criteria) this;
        }

        public Criteria andBysjlichengLike(String value) {
            addCriterion("bysjlicheng like", value, "bysjlicheng");
            return (Criteria) this;
        }

        public Criteria andBysjlichengNotLike(String value) {
            addCriterion("bysjlicheng not like", value, "bysjlicheng");
            return (Criteria) this;
        }

        public Criteria andBysjlichengIn(List<String> values) {
            addCriterion("bysjlicheng in", values, "bysjlicheng");
            return (Criteria) this;
        }

        public Criteria andBysjlichengNotIn(List<String> values) {
            addCriterion("bysjlicheng not in", values, "bysjlicheng");
            return (Criteria) this;
        }

        public Criteria andBysjlichengBetween(String value1, String value2) {
            addCriterion("bysjlicheng between", value1, value2, "bysjlicheng");
            return (Criteria) this;
        }

        public Criteria andBysjlichengNotBetween(String value1, String value2) {
            addCriterion("bysjlicheng not between", value1, value2, "bysjlicheng");
            return (Criteria) this;
        }

        public Criteria andBysjtimeIsNull() {
            addCriterion("bysjtime is null");
            return (Criteria) this;
        }

        public Criteria andBysjtimeIsNotNull() {
            addCriterion("bysjtime is not null");
            return (Criteria) this;
        }

        public Criteria andBysjtimeEqualTo(Date value) {
            addCriterionForJDBCDate("bysjtime =", value, "bysjtime");
            return (Criteria) this;
        }

        public Criteria andBysjtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("bysjtime <>", value, "bysjtime");
            return (Criteria) this;
        }

        public Criteria andBysjtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("bysjtime >", value, "bysjtime");
            return (Criteria) this;
        }

        public Criteria andBysjtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bysjtime >=", value, "bysjtime");
            return (Criteria) this;
        }

        public Criteria andBysjtimeLessThan(Date value) {
            addCriterionForJDBCDate("bysjtime <", value, "bysjtime");
            return (Criteria) this;
        }

        public Criteria andBysjtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bysjtime <=", value, "bysjtime");
            return (Criteria) this;
        }

        public Criteria andBysjtimeIn(List<Date> values) {
            addCriterionForJDBCDate("bysjtime in", values, "bysjtime");
            return (Criteria) this;
        }

        public Criteria andBysjtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("bysjtime not in", values, "bysjtime");
            return (Criteria) this;
        }

        public Criteria andBysjtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bysjtime between", value1, value2, "bysjtime");
            return (Criteria) this;
        }

        public Criteria andBysjtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bysjtime not between", value1, value2, "bysjtime");
            return (Criteria) this;
        }

        public Criteria andByjhtimeIsNull() {
            addCriterion("byjhtime is null");
            return (Criteria) this;
        }

        public Criteria andByjhtimeIsNotNull() {
            addCriterion("byjhtime is not null");
            return (Criteria) this;
        }

        public Criteria andByjhtimeEqualTo(Date value) {
            addCriterionForJDBCDate("byjhtime =", value, "byjhtime");
            return (Criteria) this;
        }

        public Criteria andByjhtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("byjhtime <>", value, "byjhtime");
            return (Criteria) this;
        }

        public Criteria andByjhtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("byjhtime >", value, "byjhtime");
            return (Criteria) this;
        }

        public Criteria andByjhtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("byjhtime >=", value, "byjhtime");
            return (Criteria) this;
        }

        public Criteria andByjhtimeLessThan(Date value) {
            addCriterionForJDBCDate("byjhtime <", value, "byjhtime");
            return (Criteria) this;
        }

        public Criteria andByjhtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("byjhtime <=", value, "byjhtime");
            return (Criteria) this;
        }

        public Criteria andByjhtimeIn(List<Date> values) {
            addCriterionForJDBCDate("byjhtime in", values, "byjhtime");
            return (Criteria) this;
        }

        public Criteria andByjhtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("byjhtime not in", values, "byjhtime");
            return (Criteria) this;
        }

        public Criteria andByjhtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("byjhtime between", value1, value2, "byjhtime");
            return (Criteria) this;
        }

        public Criteria andByjhtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("byjhtime not between", value1, value2, "byjhtime");
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