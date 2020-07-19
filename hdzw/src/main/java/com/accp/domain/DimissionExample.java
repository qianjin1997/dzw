package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DimissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DimissionExample() {
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

        public Criteria andAmidIsNull() {
            addCriterion("amid is null");
            return (Criteria) this;
        }

        public Criteria andAmidIsNotNull() {
            addCriterion("amid is not null");
            return (Criteria) this;
        }

        public Criteria andAmidEqualTo(Integer value) {
            addCriterion("amid =", value, "amid");
            return (Criteria) this;
        }

        public Criteria andAmidNotEqualTo(Integer value) {
            addCriterion("amid <>", value, "amid");
            return (Criteria) this;
        }

        public Criteria andAmidGreaterThan(Integer value) {
            addCriterion("amid >", value, "amid");
            return (Criteria) this;
        }

        public Criteria andAmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("amid >=", value, "amid");
            return (Criteria) this;
        }

        public Criteria andAmidLessThan(Integer value) {
            addCriterion("amid <", value, "amid");
            return (Criteria) this;
        }

        public Criteria andAmidLessThanOrEqualTo(Integer value) {
            addCriterion("amid <=", value, "amid");
            return (Criteria) this;
        }

        public Criteria andAmidIn(List<Integer> values) {
            addCriterion("amid in", values, "amid");
            return (Criteria) this;
        }

        public Criteria andAmidNotIn(List<Integer> values) {
            addCriterion("amid not in", values, "amid");
            return (Criteria) this;
        }

        public Criteria andAmidBetween(Integer value1, Integer value2) {
            addCriterion("amid between", value1, value2, "amid");
            return (Criteria) this;
        }

        public Criteria andAmidNotBetween(Integer value1, Integer value2) {
            addCriterion("amid not between", value1, value2, "amid");
            return (Criteria) this;
        }

        public Criteria andAmbidIsNull() {
            addCriterion("ambid is null");
            return (Criteria) this;
        }

        public Criteria andAmbidIsNotNull() {
            addCriterion("ambid is not null");
            return (Criteria) this;
        }

        public Criteria andAmbidEqualTo(Integer value) {
            addCriterion("ambid =", value, "ambid");
            return (Criteria) this;
        }

        public Criteria andAmbidNotEqualTo(Integer value) {
            addCriterion("ambid <>", value, "ambid");
            return (Criteria) this;
        }

        public Criteria andAmbidGreaterThan(Integer value) {
            addCriterion("ambid >", value, "ambid");
            return (Criteria) this;
        }

        public Criteria andAmbidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ambid >=", value, "ambid");
            return (Criteria) this;
        }

        public Criteria andAmbidLessThan(Integer value) {
            addCriterion("ambid <", value, "ambid");
            return (Criteria) this;
        }

        public Criteria andAmbidLessThanOrEqualTo(Integer value) {
            addCriterion("ambid <=", value, "ambid");
            return (Criteria) this;
        }

        public Criteria andAmbidIn(List<Integer> values) {
            addCriterion("ambid in", values, "ambid");
            return (Criteria) this;
        }

        public Criteria andAmbidNotIn(List<Integer> values) {
            addCriterion("ambid not in", values, "ambid");
            return (Criteria) this;
        }

        public Criteria andAmbidBetween(Integer value1, Integer value2) {
            addCriterion("ambid between", value1, value2, "ambid");
            return (Criteria) this;
        }

        public Criteria andAmbidNotBetween(Integer value1, Integer value2) {
            addCriterion("ambid not between", value1, value2, "ambid");
            return (Criteria) this;
        }

        public Criteria andAmyidIsNull() {
            addCriterion("amyid is null");
            return (Criteria) this;
        }

        public Criteria andAmyidIsNotNull() {
            addCriterion("amyid is not null");
            return (Criteria) this;
        }

        public Criteria andAmyidEqualTo(Integer value) {
            addCriterion("amyid =", value, "amyid");
            return (Criteria) this;
        }

        public Criteria andAmyidNotEqualTo(Integer value) {
            addCriterion("amyid <>", value, "amyid");
            return (Criteria) this;
        }

        public Criteria andAmyidGreaterThan(Integer value) {
            addCriterion("amyid >", value, "amyid");
            return (Criteria) this;
        }

        public Criteria andAmyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("amyid >=", value, "amyid");
            return (Criteria) this;
        }

        public Criteria andAmyidLessThan(Integer value) {
            addCriterion("amyid <", value, "amyid");
            return (Criteria) this;
        }

        public Criteria andAmyidLessThanOrEqualTo(Integer value) {
            addCriterion("amyid <=", value, "amyid");
            return (Criteria) this;
        }

        public Criteria andAmyidIn(List<Integer> values) {
            addCriterion("amyid in", values, "amyid");
            return (Criteria) this;
        }

        public Criteria andAmyidNotIn(List<Integer> values) {
            addCriterion("amyid not in", values, "amyid");
            return (Criteria) this;
        }

        public Criteria andAmyidBetween(Integer value1, Integer value2) {
            addCriterion("amyid between", value1, value2, "amyid");
            return (Criteria) this;
        }

        public Criteria andAmyidNotBetween(Integer value1, Integer value2) {
            addCriterion("amyid not between", value1, value2, "amyid");
            return (Criteria) this;
        }

        public Criteria andAmcauseIsNull() {
            addCriterion("amcause is null");
            return (Criteria) this;
        }

        public Criteria andAmcauseIsNotNull() {
            addCriterion("amcause is not null");
            return (Criteria) this;
        }

        public Criteria andAmcauseEqualTo(String value) {
            addCriterion("amcause =", value, "amcause");
            return (Criteria) this;
        }

        public Criteria andAmcauseNotEqualTo(String value) {
            addCriterion("amcause <>", value, "amcause");
            return (Criteria) this;
        }

        public Criteria andAmcauseGreaterThan(String value) {
            addCriterion("amcause >", value, "amcause");
            return (Criteria) this;
        }

        public Criteria andAmcauseGreaterThanOrEqualTo(String value) {
            addCriterion("amcause >=", value, "amcause");
            return (Criteria) this;
        }

        public Criteria andAmcauseLessThan(String value) {
            addCriterion("amcause <", value, "amcause");
            return (Criteria) this;
        }

        public Criteria andAmcauseLessThanOrEqualTo(String value) {
            addCriterion("amcause <=", value, "amcause");
            return (Criteria) this;
        }

        public Criteria andAmcauseLike(String value) {
            addCriterion("amcause like", value, "amcause");
            return (Criteria) this;
        }

        public Criteria andAmcauseNotLike(String value) {
            addCriterion("amcause not like", value, "amcause");
            return (Criteria) this;
        }

        public Criteria andAmcauseIn(List<String> values) {
            addCriterion("amcause in", values, "amcause");
            return (Criteria) this;
        }

        public Criteria andAmcauseNotIn(List<String> values) {
            addCriterion("amcause not in", values, "amcause");
            return (Criteria) this;
        }

        public Criteria andAmcauseBetween(String value1, String value2) {
            addCriterion("amcause between", value1, value2, "amcause");
            return (Criteria) this;
        }

        public Criteria andAmcauseNotBetween(String value1, String value2) {
            addCriterion("amcause not between", value1, value2, "amcause");
            return (Criteria) this;
        }

        public Criteria andAmldateIsNull() {
            addCriterion("amldate is null");
            return (Criteria) this;
        }

        public Criteria andAmldateIsNotNull() {
            addCriterion("amldate is not null");
            return (Criteria) this;
        }

        public Criteria andAmldateEqualTo(Date value) {
            addCriterionForJDBCDate("amldate =", value, "amldate");
            return (Criteria) this;
        }

        public Criteria andAmldateNotEqualTo(Date value) {
            addCriterionForJDBCDate("amldate <>", value, "amldate");
            return (Criteria) this;
        }

        public Criteria andAmldateGreaterThan(Date value) {
            addCriterionForJDBCDate("amldate >", value, "amldate");
            return (Criteria) this;
        }

        public Criteria andAmldateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("amldate >=", value, "amldate");
            return (Criteria) this;
        }

        public Criteria andAmldateLessThan(Date value) {
            addCriterionForJDBCDate("amldate <", value, "amldate");
            return (Criteria) this;
        }

        public Criteria andAmldateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("amldate <=", value, "amldate");
            return (Criteria) this;
        }

        public Criteria andAmldateIn(List<Date> values) {
            addCriterionForJDBCDate("amldate in", values, "amldate");
            return (Criteria) this;
        }

        public Criteria andAmldateNotIn(List<Date> values) {
            addCriterionForJDBCDate("amldate not in", values, "amldate");
            return (Criteria) this;
        }

        public Criteria andAmldateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("amldate between", value1, value2, "amldate");
            return (Criteria) this;
        }

        public Criteria andAmldateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("amldate not between", value1, value2, "amldate");
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