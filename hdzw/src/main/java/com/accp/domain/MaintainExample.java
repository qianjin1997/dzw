package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MaintainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaintainExample() {
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

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Integer value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Integer value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Integer value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Integer value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Integer value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Integer> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Integer> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Integer value1, Integer value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Integer value1, Integer value2) {
            addCriterion("rid not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRinvoicestypeIsNull() {
            addCriterion("rinvoicestype is null");
            return (Criteria) this;
        }

        public Criteria andRinvoicestypeIsNotNull() {
            addCriterion("rinvoicestype is not null");
            return (Criteria) this;
        }

        public Criteria andRinvoicestypeEqualTo(String value) {
            addCriterion("rinvoicestype =", value, "rinvoicestype");
            return (Criteria) this;
        }

        public Criteria andRinvoicestypeNotEqualTo(String value) {
            addCriterion("rinvoicestype <>", value, "rinvoicestype");
            return (Criteria) this;
        }

        public Criteria andRinvoicestypeGreaterThan(String value) {
            addCriterion("rinvoicestype >", value, "rinvoicestype");
            return (Criteria) this;
        }

        public Criteria andRinvoicestypeGreaterThanOrEqualTo(String value) {
            addCriterion("rinvoicestype >=", value, "rinvoicestype");
            return (Criteria) this;
        }

        public Criteria andRinvoicestypeLessThan(String value) {
            addCriterion("rinvoicestype <", value, "rinvoicestype");
            return (Criteria) this;
        }

        public Criteria andRinvoicestypeLessThanOrEqualTo(String value) {
            addCriterion("rinvoicestype <=", value, "rinvoicestype");
            return (Criteria) this;
        }

        public Criteria andRinvoicestypeLike(String value) {
            addCriterion("rinvoicestype like", value, "rinvoicestype");
            return (Criteria) this;
        }

        public Criteria andRinvoicestypeNotLike(String value) {
            addCriterion("rinvoicestype not like", value, "rinvoicestype");
            return (Criteria) this;
        }

        public Criteria andRinvoicestypeIn(List<String> values) {
            addCriterion("rinvoicestype in", values, "rinvoicestype");
            return (Criteria) this;
        }

        public Criteria andRinvoicestypeNotIn(List<String> values) {
            addCriterion("rinvoicestype not in", values, "rinvoicestype");
            return (Criteria) this;
        }

        public Criteria andRinvoicestypeBetween(String value1, String value2) {
            addCriterion("rinvoicestype between", value1, value2, "rinvoicestype");
            return (Criteria) this;
        }

        public Criteria andRinvoicestypeNotBetween(String value1, String value2) {
            addCriterion("rinvoicestype not between", value1, value2, "rinvoicestype");
            return (Criteria) this;
        }

        public Criteria andRsalenoIsNull() {
            addCriterion("rsaleno is null");
            return (Criteria) this;
        }

        public Criteria andRsalenoIsNotNull() {
            addCriterion("rsaleno is not null");
            return (Criteria) this;
        }

        public Criteria andRsalenoEqualTo(String value) {
            addCriterion("rsaleno =", value, "rsaleno");
            return (Criteria) this;
        }

        public Criteria andRsalenoNotEqualTo(String value) {
            addCriterion("rsaleno <>", value, "rsaleno");
            return (Criteria) this;
        }

        public Criteria andRsalenoGreaterThan(String value) {
            addCriterion("rsaleno >", value, "rsaleno");
            return (Criteria) this;
        }

        public Criteria andRsalenoGreaterThanOrEqualTo(String value) {
            addCriterion("rsaleno >=", value, "rsaleno");
            return (Criteria) this;
        }

        public Criteria andRsalenoLessThan(String value) {
            addCriterion("rsaleno <", value, "rsaleno");
            return (Criteria) this;
        }

        public Criteria andRsalenoLessThanOrEqualTo(String value) {
            addCriterion("rsaleno <=", value, "rsaleno");
            return (Criteria) this;
        }

        public Criteria andRsalenoLike(String value) {
            addCriterion("rsaleno like", value, "rsaleno");
            return (Criteria) this;
        }

        public Criteria andRsalenoNotLike(String value) {
            addCriterion("rsaleno not like", value, "rsaleno");
            return (Criteria) this;
        }

        public Criteria andRsalenoIn(List<String> values) {
            addCriterion("rsaleno in", values, "rsaleno");
            return (Criteria) this;
        }

        public Criteria andRsalenoNotIn(List<String> values) {
            addCriterion("rsaleno not in", values, "rsaleno");
            return (Criteria) this;
        }

        public Criteria andRsalenoBetween(String value1, String value2) {
            addCriterion("rsaleno between", value1, value2, "rsaleno");
            return (Criteria) this;
        }

        public Criteria andRsalenoNotBetween(String value1, String value2) {
            addCriterion("rsaleno not between", value1, value2, "rsaleno");
            return (Criteria) this;
        }

        public Criteria andRlicensenoIsNull() {
            addCriterion("rlicenseno is null");
            return (Criteria) this;
        }

        public Criteria andRlicensenoIsNotNull() {
            addCriterion("rlicenseno is not null");
            return (Criteria) this;
        }

        public Criteria andRlicensenoEqualTo(String value) {
            addCriterion("rlicenseno =", value, "rlicenseno");
            return (Criteria) this;
        }

        public Criteria andRlicensenoNotEqualTo(String value) {
            addCriterion("rlicenseno <>", value, "rlicenseno");
            return (Criteria) this;
        }

        public Criteria andRlicensenoGreaterThan(String value) {
            addCriterion("rlicenseno >", value, "rlicenseno");
            return (Criteria) this;
        }

        public Criteria andRlicensenoGreaterThanOrEqualTo(String value) {
            addCriterion("rlicenseno >=", value, "rlicenseno");
            return (Criteria) this;
        }

        public Criteria andRlicensenoLessThan(String value) {
            addCriterion("rlicenseno <", value, "rlicenseno");
            return (Criteria) this;
        }

        public Criteria andRlicensenoLessThanOrEqualTo(String value) {
            addCriterion("rlicenseno <=", value, "rlicenseno");
            return (Criteria) this;
        }

        public Criteria andRlicensenoLike(String value) {
            addCriterion("rlicenseno like", value, "rlicenseno");
            return (Criteria) this;
        }

        public Criteria andRlicensenoNotLike(String value) {
            addCriterion("rlicenseno not like", value, "rlicenseno");
            return (Criteria) this;
        }

        public Criteria andRlicensenoIn(List<String> values) {
            addCriterion("rlicenseno in", values, "rlicenseno");
            return (Criteria) this;
        }

        public Criteria andRlicensenoNotIn(List<String> values) {
            addCriterion("rlicenseno not in", values, "rlicenseno");
            return (Criteria) this;
        }

        public Criteria andRlicensenoBetween(String value1, String value2) {
            addCriterion("rlicenseno between", value1, value2, "rlicenseno");
            return (Criteria) this;
        }

        public Criteria andRlicensenoNotBetween(String value1, String value2) {
            addCriterion("rlicenseno not between", value1, value2, "rlicenseno");
            return (Criteria) this;
        }

        public Criteria andRfactorydateIsNull() {
            addCriterion("rfactorydate is null");
            return (Criteria) this;
        }

        public Criteria andRfactorydateIsNotNull() {
            addCriterion("rfactorydate is not null");
            return (Criteria) this;
        }

        public Criteria andRfactorydateEqualTo(Date value) {
            addCriterionForJDBCDate("rfactorydate =", value, "rfactorydate");
            return (Criteria) this;
        }

        public Criteria andRfactorydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("rfactorydate <>", value, "rfactorydate");
            return (Criteria) this;
        }

        public Criteria andRfactorydateGreaterThan(Date value) {
            addCriterionForJDBCDate("rfactorydate >", value, "rfactorydate");
            return (Criteria) this;
        }

        public Criteria andRfactorydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rfactorydate >=", value, "rfactorydate");
            return (Criteria) this;
        }

        public Criteria andRfactorydateLessThan(Date value) {
            addCriterionForJDBCDate("rfactorydate <", value, "rfactorydate");
            return (Criteria) this;
        }

        public Criteria andRfactorydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rfactorydate <=", value, "rfactorydate");
            return (Criteria) this;
        }

        public Criteria andRfactorydateIn(List<Date> values) {
            addCriterionForJDBCDate("rfactorydate in", values, "rfactorydate");
            return (Criteria) this;
        }

        public Criteria andRfactorydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("rfactorydate not in", values, "rfactorydate");
            return (Criteria) this;
        }

        public Criteria andRfactorydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rfactorydate between", value1, value2, "rfactorydate");
            return (Criteria) this;
        }

        public Criteria andRfactorydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rfactorydate not between", value1, value2, "rfactorydate");
            return (Criteria) this;
        }

        public Criteria andRokdateIsNull() {
            addCriterion("rokdate is null");
            return (Criteria) this;
        }

        public Criteria andRokdateIsNotNull() {
            addCriterion("rokdate is not null");
            return (Criteria) this;
        }

        public Criteria andRokdateEqualTo(Date value) {
            addCriterionForJDBCDate("rokdate =", value, "rokdate");
            return (Criteria) this;
        }

        public Criteria andRokdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("rokdate <>", value, "rokdate");
            return (Criteria) this;
        }

        public Criteria andRokdateGreaterThan(Date value) {
            addCriterionForJDBCDate("rokdate >", value, "rokdate");
            return (Criteria) this;
        }

        public Criteria andRokdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rokdate >=", value, "rokdate");
            return (Criteria) this;
        }

        public Criteria andRokdateLessThan(Date value) {
            addCriterionForJDBCDate("rokdate <", value, "rokdate");
            return (Criteria) this;
        }

        public Criteria andRokdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rokdate <=", value, "rokdate");
            return (Criteria) this;
        }

        public Criteria andRokdateIn(List<Date> values) {
            addCriterionForJDBCDate("rokdate in", values, "rokdate");
            return (Criteria) this;
        }

        public Criteria andRokdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("rokdate not in", values, "rokdate");
            return (Criteria) this;
        }

        public Criteria andRokdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rokdate between", value1, value2, "rokdate");
            return (Criteria) this;
        }

        public Criteria andRokdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rokdate not between", value1, value2, "rokdate");
            return (Criteria) this;
        }

        public Criteria andRclosedateIsNull() {
            addCriterion("rclosedate is null");
            return (Criteria) this;
        }

        public Criteria andRclosedateIsNotNull() {
            addCriterion("rclosedate is not null");
            return (Criteria) this;
        }

        public Criteria andRclosedateEqualTo(Date value) {
            addCriterionForJDBCDate("rclosedate =", value, "rclosedate");
            return (Criteria) this;
        }

        public Criteria andRclosedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("rclosedate <>", value, "rclosedate");
            return (Criteria) this;
        }

        public Criteria andRclosedateGreaterThan(Date value) {
            addCriterionForJDBCDate("rclosedate >", value, "rclosedate");
            return (Criteria) this;
        }

        public Criteria andRclosedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rclosedate >=", value, "rclosedate");
            return (Criteria) this;
        }

        public Criteria andRclosedateLessThan(Date value) {
            addCriterionForJDBCDate("rclosedate <", value, "rclosedate");
            return (Criteria) this;
        }

        public Criteria andRclosedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rclosedate <=", value, "rclosedate");
            return (Criteria) this;
        }

        public Criteria andRclosedateIn(List<Date> values) {
            addCriterionForJDBCDate("rclosedate in", values, "rclosedate");
            return (Criteria) this;
        }

        public Criteria andRclosedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("rclosedate not in", values, "rclosedate");
            return (Criteria) this;
        }

        public Criteria andRclosedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rclosedate between", value1, value2, "rclosedate");
            return (Criteria) this;
        }

        public Criteria andRclosedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rclosedate not between", value1, value2, "rclosedate");
            return (Criteria) this;
        }

        public Criteria andRclosemoneyIsNull() {
            addCriterion("rclosemoney is null");
            return (Criteria) this;
        }

        public Criteria andRclosemoneyIsNotNull() {
            addCriterion("rclosemoney is not null");
            return (Criteria) this;
        }

        public Criteria andRclosemoneyEqualTo(Float value) {
            addCriterion("rclosemoney =", value, "rclosemoney");
            return (Criteria) this;
        }

        public Criteria andRclosemoneyNotEqualTo(Float value) {
            addCriterion("rclosemoney <>", value, "rclosemoney");
            return (Criteria) this;
        }

        public Criteria andRclosemoneyGreaterThan(Float value) {
            addCriterion("rclosemoney >", value, "rclosemoney");
            return (Criteria) this;
        }

        public Criteria andRclosemoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("rclosemoney >=", value, "rclosemoney");
            return (Criteria) this;
        }

        public Criteria andRclosemoneyLessThan(Float value) {
            addCriterion("rclosemoney <", value, "rclosemoney");
            return (Criteria) this;
        }

        public Criteria andRclosemoneyLessThanOrEqualTo(Float value) {
            addCriterion("rclosemoney <=", value, "rclosemoney");
            return (Criteria) this;
        }

        public Criteria andRclosemoneyIn(List<Float> values) {
            addCriterion("rclosemoney in", values, "rclosemoney");
            return (Criteria) this;
        }

        public Criteria andRclosemoneyNotIn(List<Float> values) {
            addCriterion("rclosemoney not in", values, "rclosemoney");
            return (Criteria) this;
        }

        public Criteria andRclosemoneyBetween(Float value1, Float value2) {
            addCriterion("rclosemoney between", value1, value2, "rclosemoney");
            return (Criteria) this;
        }

        public Criteria andRclosemoneyNotBetween(Float value1, Float value2) {
            addCriterion("rclosemoney not between", value1, value2, "rclosemoney");
            return (Criteria) this;
        }

        public Criteria andRcaridIsNull() {
            addCriterion("rcarid is null");
            return (Criteria) this;
        }

        public Criteria andRcaridIsNotNull() {
            addCriterion("rcarid is not null");
            return (Criteria) this;
        }

        public Criteria andRcaridEqualTo(Integer value) {
            addCriterion("rcarid =", value, "rcarid");
            return (Criteria) this;
        }

        public Criteria andRcaridNotEqualTo(Integer value) {
            addCriterion("rcarid <>", value, "rcarid");
            return (Criteria) this;
        }

        public Criteria andRcaridGreaterThan(Integer value) {
            addCriterion("rcarid >", value, "rcarid");
            return (Criteria) this;
        }

        public Criteria andRcaridGreaterThanOrEqualTo(Integer value) {
            addCriterion("rcarid >=", value, "rcarid");
            return (Criteria) this;
        }

        public Criteria andRcaridLessThan(Integer value) {
            addCriterion("rcarid <", value, "rcarid");
            return (Criteria) this;
        }

        public Criteria andRcaridLessThanOrEqualTo(Integer value) {
            addCriterion("rcarid <=", value, "rcarid");
            return (Criteria) this;
        }

        public Criteria andRcaridIn(List<Integer> values) {
            addCriterion("rcarid in", values, "rcarid");
            return (Criteria) this;
        }

        public Criteria andRcaridNotIn(List<Integer> values) {
            addCriterion("rcarid not in", values, "rcarid");
            return (Criteria) this;
        }

        public Criteria andRcaridBetween(Integer value1, Integer value2) {
            addCriterion("rcarid between", value1, value2, "rcarid");
            return (Criteria) this;
        }

        public Criteria andRcaridNotBetween(Integer value1, Integer value2) {
            addCriterion("rcarid not between", value1, value2, "rcarid");
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