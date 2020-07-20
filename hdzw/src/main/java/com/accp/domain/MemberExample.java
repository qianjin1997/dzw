package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
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

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Integer value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Integer value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Integer value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Integer value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Integer value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Integer> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Integer> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Integer value1, Integer value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Integer value1, Integer value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGcardIsNull() {
            addCriterion("gcard is null");
            return (Criteria) this;
        }

        public Criteria andGcardIsNotNull() {
            addCriterion("gcard is not null");
            return (Criteria) this;
        }

        public Criteria andGcardEqualTo(String value) {
            addCriterion("gcard =", value, "gcard");
            return (Criteria) this;
        }

        public Criteria andGcardNotEqualTo(String value) {
            addCriterion("gcard <>", value, "gcard");
            return (Criteria) this;
        }

        public Criteria andGcardGreaterThan(String value) {
            addCriterion("gcard >", value, "gcard");
            return (Criteria) this;
        }

        public Criteria andGcardGreaterThanOrEqualTo(String value) {
            addCriterion("gcard >=", value, "gcard");
            return (Criteria) this;
        }

        public Criteria andGcardLessThan(String value) {
            addCriterion("gcard <", value, "gcard");
            return (Criteria) this;
        }

        public Criteria andGcardLessThanOrEqualTo(String value) {
            addCriterion("gcard <=", value, "gcard");
            return (Criteria) this;
        }

        public Criteria andGcardLike(String value) {
            addCriterion("gcard like", value, "gcard");
            return (Criteria) this;
        }

        public Criteria andGcardNotLike(String value) {
            addCriterion("gcard not like", value, "gcard");
            return (Criteria) this;
        }

        public Criteria andGcardIn(List<String> values) {
            addCriterion("gcard in", values, "gcard");
            return (Criteria) this;
        }

        public Criteria andGcardNotIn(List<String> values) {
            addCriterion("gcard not in", values, "gcard");
            return (Criteria) this;
        }

        public Criteria andGcardBetween(String value1, String value2) {
            addCriterion("gcard between", value1, value2, "gcard");
            return (Criteria) this;
        }

        public Criteria andGcardNotBetween(String value1, String value2) {
            addCriterion("gcard not between", value1, value2, "gcard");
            return (Criteria) this;
        }

        public Criteria andGadmissiondateIsNull() {
            addCriterion("gadmissiondate is null");
            return (Criteria) this;
        }

        public Criteria andGadmissiondateIsNotNull() {
            addCriterion("gadmissiondate is not null");
            return (Criteria) this;
        }

        public Criteria andGadmissiondateEqualTo(Date value) {
            addCriterionForJDBCDate("gadmissiondate =", value, "gadmissiondate");
            return (Criteria) this;
        }

        public Criteria andGadmissiondateNotEqualTo(Date value) {
            addCriterionForJDBCDate("gadmissiondate <>", value, "gadmissiondate");
            return (Criteria) this;
        }

        public Criteria andGadmissiondateGreaterThan(Date value) {
            addCriterionForJDBCDate("gadmissiondate >", value, "gadmissiondate");
            return (Criteria) this;
        }

        public Criteria andGadmissiondateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gadmissiondate >=", value, "gadmissiondate");
            return (Criteria) this;
        }

        public Criteria andGadmissiondateLessThan(Date value) {
            addCriterionForJDBCDate("gadmissiondate <", value, "gadmissiondate");
            return (Criteria) this;
        }

        public Criteria andGadmissiondateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gadmissiondate <=", value, "gadmissiondate");
            return (Criteria) this;
        }

        public Criteria andGadmissiondateIn(List<Date> values) {
            addCriterionForJDBCDate("gadmissiondate in", values, "gadmissiondate");
            return (Criteria) this;
        }

        public Criteria andGadmissiondateNotIn(List<Date> values) {
            addCriterionForJDBCDate("gadmissiondate not in", values, "gadmissiondate");
            return (Criteria) this;
        }

        public Criteria andGadmissiondateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gadmissiondate between", value1, value2, "gadmissiondate");
            return (Criteria) this;
        }

        public Criteria andGadmissiondateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gadmissiondate not between", value1, value2, "gadmissiondate");
            return (Criteria) this;
        }

        public Criteria andGmembershipdueIsNull() {
            addCriterion("gmembershipdue is null");
            return (Criteria) this;
        }

        public Criteria andGmembershipdueIsNotNull() {
            addCriterion("gmembershipdue is not null");
            return (Criteria) this;
        }

        public Criteria andGmembershipdueEqualTo(Date value) {
            addCriterionForJDBCDate("gmembershipdue =", value, "gmembershipdue");
            return (Criteria) this;
        }

        public Criteria andGmembershipdueNotEqualTo(Date value) {
            addCriterionForJDBCDate("gmembershipdue <>", value, "gmembershipdue");
            return (Criteria) this;
        }

        public Criteria andGmembershipdueGreaterThan(Date value) {
            addCriterionForJDBCDate("gmembershipdue >", value, "gmembershipdue");
            return (Criteria) this;
        }

        public Criteria andGmembershipdueGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gmembershipdue >=", value, "gmembershipdue");
            return (Criteria) this;
        }

        public Criteria andGmembershipdueLessThan(Date value) {
            addCriterionForJDBCDate("gmembershipdue <", value, "gmembershipdue");
            return (Criteria) this;
        }

        public Criteria andGmembershipdueLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gmembershipdue <=", value, "gmembershipdue");
            return (Criteria) this;
        }

        public Criteria andGmembershipdueIn(List<Date> values) {
            addCriterionForJDBCDate("gmembershipdue in", values, "gmembershipdue");
            return (Criteria) this;
        }

        public Criteria andGmembershipdueNotIn(List<Date> values) {
            addCriterionForJDBCDate("gmembershipdue not in", values, "gmembershipdue");
            return (Criteria) this;
        }

        public Criteria andGmembershipdueBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gmembershipdue between", value1, value2, "gmembershipdue");
            return (Criteria) this;
        }

        public Criteria andGmembershipdueNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gmembershipdue not between", value1, value2, "gmembershipdue");
            return (Criteria) this;
        }

        public Criteria andGcustomertypeidIsNull() {
            addCriterion("gcustomertypeid is null");
            return (Criteria) this;
        }

        public Criteria andGcustomertypeidIsNotNull() {
            addCriterion("gcustomertypeid is not null");
            return (Criteria) this;
        }

        public Criteria andGcustomertypeidEqualTo(Integer value) {
            addCriterion("gcustomertypeid =", value, "gcustomertypeid");
            return (Criteria) this;
        }

        public Criteria andGcustomertypeidNotEqualTo(Integer value) {
            addCriterion("gcustomertypeid <>", value, "gcustomertypeid");
            return (Criteria) this;
        }

        public Criteria andGcustomertypeidGreaterThan(Integer value) {
            addCriterion("gcustomertypeid >", value, "gcustomertypeid");
            return (Criteria) this;
        }

        public Criteria andGcustomertypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gcustomertypeid >=", value, "gcustomertypeid");
            return (Criteria) this;
        }

        public Criteria andGcustomertypeidLessThan(Integer value) {
            addCriterion("gcustomertypeid <", value, "gcustomertypeid");
            return (Criteria) this;
        }

        public Criteria andGcustomertypeidLessThanOrEqualTo(Integer value) {
            addCriterion("gcustomertypeid <=", value, "gcustomertypeid");
            return (Criteria) this;
        }

        public Criteria andGcustomertypeidIn(List<Integer> values) {
            addCriterion("gcustomertypeid in", values, "gcustomertypeid");
            return (Criteria) this;
        }

        public Criteria andGcustomertypeidNotIn(List<Integer> values) {
            addCriterion("gcustomertypeid not in", values, "gcustomertypeid");
            return (Criteria) this;
        }

        public Criteria andGcustomertypeidBetween(Integer value1, Integer value2) {
            addCriterion("gcustomertypeid between", value1, value2, "gcustomertypeid");
            return (Criteria) this;
        }

        public Criteria andGcustomertypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("gcustomertypeid not between", value1, value2, "gcustomertypeid");
            return (Criteria) this;
        }

        public Criteria andGtypeidIsNull() {
            addCriterion("gtypeid is null");
            return (Criteria) this;
        }

        public Criteria andGtypeidIsNotNull() {
            addCriterion("gtypeid is not null");
            return (Criteria) this;
        }

        public Criteria andGtypeidEqualTo(Integer value) {
            addCriterion("gtypeid =", value, "gtypeid");
            return (Criteria) this;
        }

        public Criteria andGtypeidNotEqualTo(Integer value) {
            addCriterion("gtypeid <>", value, "gtypeid");
            return (Criteria) this;
        }

        public Criteria andGtypeidGreaterThan(Integer value) {
            addCriterion("gtypeid >", value, "gtypeid");
            return (Criteria) this;
        }

        public Criteria andGtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gtypeid >=", value, "gtypeid");
            return (Criteria) this;
        }

        public Criteria andGtypeidLessThan(Integer value) {
            addCriterion("gtypeid <", value, "gtypeid");
            return (Criteria) this;
        }

        public Criteria andGtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("gtypeid <=", value, "gtypeid");
            return (Criteria) this;
        }

        public Criteria andGtypeidIn(List<Integer> values) {
            addCriterion("gtypeid in", values, "gtypeid");
            return (Criteria) this;
        }

        public Criteria andGtypeidNotIn(List<Integer> values) {
            addCriterion("gtypeid not in", values, "gtypeid");
            return (Criteria) this;
        }

        public Criteria andGtypeidBetween(Integer value1, Integer value2) {
            addCriterion("gtypeid between", value1, value2, "gtypeid");
            return (Criteria) this;
        }

        public Criteria andGtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("gtypeid not between", value1, value2, "gtypeid");
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