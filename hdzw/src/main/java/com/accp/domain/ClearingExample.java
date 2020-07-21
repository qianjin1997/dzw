package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ClearingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClearingExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSsellnoIsNull() {
            addCriterion("ssellno is null");
            return (Criteria) this;
        }

        public Criteria andSsellnoIsNotNull() {
            addCriterion("ssellno is not null");
            return (Criteria) this;
        }

        public Criteria andSsellnoEqualTo(String value) {
            addCriterion("ssellno =", value, "ssellno");
            return (Criteria) this;
        }

        public Criteria andSsellnoNotEqualTo(String value) {
            addCriterion("ssellno <>", value, "ssellno");
            return (Criteria) this;
        }

        public Criteria andSsellnoGreaterThan(String value) {
            addCriterion("ssellno >", value, "ssellno");
            return (Criteria) this;
        }

        public Criteria andSsellnoGreaterThanOrEqualTo(String value) {
            addCriterion("ssellno >=", value, "ssellno");
            return (Criteria) this;
        }

        public Criteria andSsellnoLessThan(String value) {
            addCriterion("ssellno <", value, "ssellno");
            return (Criteria) this;
        }

        public Criteria andSsellnoLessThanOrEqualTo(String value) {
            addCriterion("ssellno <=", value, "ssellno");
            return (Criteria) this;
        }

        public Criteria andSsellnoLike(String value) {
            addCriterion("ssellno like", value, "ssellno");
            return (Criteria) this;
        }

        public Criteria andSsellnoNotLike(String value) {
            addCriterion("ssellno not like", value, "ssellno");
            return (Criteria) this;
        }

        public Criteria andSsellnoIn(List<String> values) {
            addCriterion("ssellno in", values, "ssellno");
            return (Criteria) this;
        }

        public Criteria andSsellnoNotIn(List<String> values) {
            addCriterion("ssellno not in", values, "ssellno");
            return (Criteria) this;
        }

        public Criteria andSsellnoBetween(String value1, String value2) {
            addCriterion("ssellno between", value1, value2, "ssellno");
            return (Criteria) this;
        }

        public Criteria andSsellnoNotBetween(String value1, String value2) {
            addCriterion("ssellno not between", value1, value2, "ssellno");
            return (Criteria) this;
        }

        public Criteria andSbillstypenoIsNull() {
            addCriterion("sbillstypeno is null");
            return (Criteria) this;
        }

        public Criteria andSbillstypenoIsNotNull() {
            addCriterion("sbillstypeno is not null");
            return (Criteria) this;
        }

        public Criteria andSbillstypenoEqualTo(Integer value) {
            addCriterion("sbillstypeno =", value, "sbillstypeno");
            return (Criteria) this;
        }

        public Criteria andSbillstypenoNotEqualTo(Integer value) {
            addCriterion("sbillstypeno <>", value, "sbillstypeno");
            return (Criteria) this;
        }

        public Criteria andSbillstypenoGreaterThan(Integer value) {
            addCriterion("sbillstypeno >", value, "sbillstypeno");
            return (Criteria) this;
        }

        public Criteria andSbillstypenoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sbillstypeno >=", value, "sbillstypeno");
            return (Criteria) this;
        }

        public Criteria andSbillstypenoLessThan(Integer value) {
            addCriterion("sbillstypeno <", value, "sbillstypeno");
            return (Criteria) this;
        }

        public Criteria andSbillstypenoLessThanOrEqualTo(Integer value) {
            addCriterion("sbillstypeno <=", value, "sbillstypeno");
            return (Criteria) this;
        }

        public Criteria andSbillstypenoIn(List<Integer> values) {
            addCriterion("sbillstypeno in", values, "sbillstypeno");
            return (Criteria) this;
        }

        public Criteria andSbillstypenoNotIn(List<Integer> values) {
            addCriterion("sbillstypeno not in", values, "sbillstypeno");
            return (Criteria) this;
        }

        public Criteria andSbillstypenoBetween(Integer value1, Integer value2) {
            addCriterion("sbillstypeno between", value1, value2, "sbillstypeno");
            return (Criteria) this;
        }

        public Criteria andSbillstypenoNotBetween(Integer value1, Integer value2) {
            addCriterion("sbillstypeno not between", value1, value2, "sbillstypeno");
            return (Criteria) this;
        }

        public Criteria andSclearingformIsNull() {
            addCriterion("sclearingform is null");
            return (Criteria) this;
        }

        public Criteria andSclearingformIsNotNull() {
            addCriterion("sclearingform is not null");
            return (Criteria) this;
        }

        public Criteria andSclearingformEqualTo(String value) {
            addCriterion("sclearingform =", value, "sclearingform");
            return (Criteria) this;
        }

        public Criteria andSclearingformNotEqualTo(String value) {
            addCriterion("sclearingform <>", value, "sclearingform");
            return (Criteria) this;
        }

        public Criteria andSclearingformGreaterThan(String value) {
            addCriterion("sclearingform >", value, "sclearingform");
            return (Criteria) this;
        }

        public Criteria andSclearingformGreaterThanOrEqualTo(String value) {
            addCriterion("sclearingform >=", value, "sclearingform");
            return (Criteria) this;
        }

        public Criteria andSclearingformLessThan(String value) {
            addCriterion("sclearingform <", value, "sclearingform");
            return (Criteria) this;
        }

        public Criteria andSclearingformLessThanOrEqualTo(String value) {
            addCriterion("sclearingform <=", value, "sclearingform");
            return (Criteria) this;
        }

        public Criteria andSclearingformLike(String value) {
            addCriterion("sclearingform like", value, "sclearingform");
            return (Criteria) this;
        }

        public Criteria andSclearingformNotLike(String value) {
            addCriterion("sclearingform not like", value, "sclearingform");
            return (Criteria) this;
        }

        public Criteria andSclearingformIn(List<String> values) {
            addCriterion("sclearingform in", values, "sclearingform");
            return (Criteria) this;
        }

        public Criteria andSclearingformNotIn(List<String> values) {
            addCriterion("sclearingform not in", values, "sclearingform");
            return (Criteria) this;
        }

        public Criteria andSclearingformBetween(String value1, String value2) {
            addCriterion("sclearingform between", value1, value2, "sclearingform");
            return (Criteria) this;
        }

        public Criteria andSclearingformNotBetween(String value1, String value2) {
            addCriterion("sclearingform not between", value1, value2, "sclearingform");
            return (Criteria) this;
        }

        public Criteria andSstatusidIsNull() {
            addCriterion("sstatusid is null");
            return (Criteria) this;
        }

        public Criteria andSstatusidIsNotNull() {
            addCriterion("sstatusid is not null");
            return (Criteria) this;
        }

        public Criteria andSstatusidEqualTo(Integer value) {
            addCriterion("sstatusid =", value, "sstatusid");
            return (Criteria) this;
        }

        public Criteria andSstatusidNotEqualTo(Integer value) {
            addCriterion("sstatusid <>", value, "sstatusid");
            return (Criteria) this;
        }

        public Criteria andSstatusidGreaterThan(Integer value) {
            addCriterion("sstatusid >", value, "sstatusid");
            return (Criteria) this;
        }

        public Criteria andSstatusidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sstatusid >=", value, "sstatusid");
            return (Criteria) this;
        }

        public Criteria andSstatusidLessThan(Integer value) {
            addCriterion("sstatusid <", value, "sstatusid");
            return (Criteria) this;
        }

        public Criteria andSstatusidLessThanOrEqualTo(Integer value) {
            addCriterion("sstatusid <=", value, "sstatusid");
            return (Criteria) this;
        }

        public Criteria andSstatusidIn(List<Integer> values) {
            addCriterion("sstatusid in", values, "sstatusid");
            return (Criteria) this;
        }

        public Criteria andSstatusidNotIn(List<Integer> values) {
            addCriterion("sstatusid not in", values, "sstatusid");
            return (Criteria) this;
        }

        public Criteria andSstatusidBetween(Integer value1, Integer value2) {
            addCriterion("sstatusid between", value1, value2, "sstatusid");
            return (Criteria) this;
        }

        public Criteria andSstatusidNotBetween(Integer value1, Integer value2) {
            addCriterion("sstatusid not between", value1, value2, "sstatusid");
            return (Criteria) this;
        }

        public Criteria andSsettlementstatusIsNull() {
            addCriterion("ssettlementstatus is null");
            return (Criteria) this;
        }

        public Criteria andSsettlementstatusIsNotNull() {
            addCriterion("ssettlementstatus is not null");
            return (Criteria) this;
        }

        public Criteria andSsettlementstatusEqualTo(String value) {
            addCriterion("ssettlementstatus =", value, "ssettlementstatus");
            return (Criteria) this;
        }

        public Criteria andSsettlementstatusNotEqualTo(String value) {
            addCriterion("ssettlementstatus <>", value, "ssettlementstatus");
            return (Criteria) this;
        }

        public Criteria andSsettlementstatusGreaterThan(String value) {
            addCriterion("ssettlementstatus >", value, "ssettlementstatus");
            return (Criteria) this;
        }

        public Criteria andSsettlementstatusGreaterThanOrEqualTo(String value) {
            addCriterion("ssettlementstatus >=", value, "ssettlementstatus");
            return (Criteria) this;
        }

        public Criteria andSsettlementstatusLessThan(String value) {
            addCriterion("ssettlementstatus <", value, "ssettlementstatus");
            return (Criteria) this;
        }

        public Criteria andSsettlementstatusLessThanOrEqualTo(String value) {
            addCriterion("ssettlementstatus <=", value, "ssettlementstatus");
            return (Criteria) this;
        }

        public Criteria andSsettlementstatusLike(String value) {
            addCriterion("ssettlementstatus like", value, "ssettlementstatus");
            return (Criteria) this;
        }

        public Criteria andSsettlementstatusNotLike(String value) {
            addCriterion("ssettlementstatus not like", value, "ssettlementstatus");
            return (Criteria) this;
        }

        public Criteria andSsettlementstatusIn(List<String> values) {
            addCriterion("ssettlementstatus in", values, "ssettlementstatus");
            return (Criteria) this;
        }

        public Criteria andSsettlementstatusNotIn(List<String> values) {
            addCriterion("ssettlementstatus not in", values, "ssettlementstatus");
            return (Criteria) this;
        }

        public Criteria andSsettlementstatusBetween(String value1, String value2) {
            addCriterion("ssettlementstatus between", value1, value2, "ssettlementstatus");
            return (Criteria) this;
        }

        public Criteria andSsettlementstatusNotBetween(String value1, String value2) {
            addCriterion("ssettlementstatus not between", value1, value2, "ssettlementstatus");
            return (Criteria) this;
        }

        public Criteria andSsettlementdateIsNull() {
            addCriterion("ssettlementdate is null");
            return (Criteria) this;
        }

        public Criteria andSsettlementdateIsNotNull() {
            addCriterion("ssettlementdate is not null");
            return (Criteria) this;
        }

        public Criteria andSsettlementdateEqualTo(Date value) {
            addCriterionForJDBCDate("ssettlementdate =", value, "ssettlementdate");
            return (Criteria) this;
        }

        public Criteria andSsettlementdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ssettlementdate <>", value, "ssettlementdate");
            return (Criteria) this;
        }

        public Criteria andSsettlementdateGreaterThan(Date value) {
            addCriterionForJDBCDate("ssettlementdate >", value, "ssettlementdate");
            return (Criteria) this;
        }

        public Criteria andSsettlementdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ssettlementdate >=", value, "ssettlementdate");
            return (Criteria) this;
        }

        public Criteria andSsettlementdateLessThan(Date value) {
            addCriterionForJDBCDate("ssettlementdate <", value, "ssettlementdate");
            return (Criteria) this;
        }

        public Criteria andSsettlementdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ssettlementdate <=", value, "ssettlementdate");
            return (Criteria) this;
        }

        public Criteria andSsettlementdateIn(List<Date> values) {
            addCriterionForJDBCDate("ssettlementdate in", values, "ssettlementdate");
            return (Criteria) this;
        }

        public Criteria andSsettlementdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ssettlementdate not in", values, "ssettlementdate");
            return (Criteria) this;
        }

        public Criteria andSsettlementdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ssettlementdate between", value1, value2, "ssettlementdate");
            return (Criteria) this;
        }

        public Criteria andSsettlementdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ssettlementdate not between", value1, value2, "ssettlementdate");
            return (Criteria) this;
        }

        public Criteria andSsettlementpeopleIsNull() {
            addCriterion("ssettlementpeople is null");
            return (Criteria) this;
        }

        public Criteria andSsettlementpeopleIsNotNull() {
            addCriterion("ssettlementpeople is not null");
            return (Criteria) this;
        }

        public Criteria andSsettlementpeopleEqualTo(String value) {
            addCriterion("ssettlementpeople =", value, "ssettlementpeople");
            return (Criteria) this;
        }

        public Criteria andSsettlementpeopleNotEqualTo(String value) {
            addCriterion("ssettlementpeople <>", value, "ssettlementpeople");
            return (Criteria) this;
        }

        public Criteria andSsettlementpeopleGreaterThan(String value) {
            addCriterion("ssettlementpeople >", value, "ssettlementpeople");
            return (Criteria) this;
        }

        public Criteria andSsettlementpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("ssettlementpeople >=", value, "ssettlementpeople");
            return (Criteria) this;
        }

        public Criteria andSsettlementpeopleLessThan(String value) {
            addCriterion("ssettlementpeople <", value, "ssettlementpeople");
            return (Criteria) this;
        }

        public Criteria andSsettlementpeopleLessThanOrEqualTo(String value) {
            addCriterion("ssettlementpeople <=", value, "ssettlementpeople");
            return (Criteria) this;
        }

        public Criteria andSsettlementpeopleLike(String value) {
            addCriterion("ssettlementpeople like", value, "ssettlementpeople");
            return (Criteria) this;
        }

        public Criteria andSsettlementpeopleNotLike(String value) {
            addCriterion("ssettlementpeople not like", value, "ssettlementpeople");
            return (Criteria) this;
        }

        public Criteria andSsettlementpeopleIn(List<String> values) {
            addCriterion("ssettlementpeople in", values, "ssettlementpeople");
            return (Criteria) this;
        }

        public Criteria andSsettlementpeopleNotIn(List<String> values) {
            addCriterion("ssettlementpeople not in", values, "ssettlementpeople");
            return (Criteria) this;
        }

        public Criteria andSsettlementpeopleBetween(String value1, String value2) {
            addCriterion("ssettlementpeople between", value1, value2, "ssettlementpeople");
            return (Criteria) this;
        }

        public Criteria andSsettlementpeopleNotBetween(String value1, String value2) {
            addCriterion("ssettlementpeople not between", value1, value2, "ssettlementpeople");
            return (Criteria) this;
        }

        public Criteria andSsettlementmoneyIsNull() {
            addCriterion("ssettlementmoney is null");
            return (Criteria) this;
        }

        public Criteria andSsettlementmoneyIsNotNull() {
            addCriterion("ssettlementmoney is not null");
            return (Criteria) this;
        }

        public Criteria andSsettlementmoneyEqualTo(Float value) {
            addCriterion("ssettlementmoney =", value, "ssettlementmoney");
            return (Criteria) this;
        }

        public Criteria andSsettlementmoneyNotEqualTo(Float value) {
            addCriterion("ssettlementmoney <>", value, "ssettlementmoney");
            return (Criteria) this;
        }

        public Criteria andSsettlementmoneyGreaterThan(Float value) {
            addCriterion("ssettlementmoney >", value, "ssettlementmoney");
            return (Criteria) this;
        }

        public Criteria andSsettlementmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("ssettlementmoney >=", value, "ssettlementmoney");
            return (Criteria) this;
        }

        public Criteria andSsettlementmoneyLessThan(Float value) {
            addCriterion("ssettlementmoney <", value, "ssettlementmoney");
            return (Criteria) this;
        }

        public Criteria andSsettlementmoneyLessThanOrEqualTo(Float value) {
            addCriterion("ssettlementmoney <=", value, "ssettlementmoney");
            return (Criteria) this;
        }

        public Criteria andSsettlementmoneyIn(List<Float> values) {
            addCriterion("ssettlementmoney in", values, "ssettlementmoney");
            return (Criteria) this;
        }

        public Criteria andSsettlementmoneyNotIn(List<Float> values) {
            addCriterion("ssettlementmoney not in", values, "ssettlementmoney");
            return (Criteria) this;
        }

        public Criteria andSsettlementmoneyBetween(Float value1, Float value2) {
            addCriterion("ssettlementmoney between", value1, value2, "ssettlementmoney");
            return (Criteria) this;
        }

        public Criteria andSsettlementmoneyNotBetween(Float value1, Float value2) {
            addCriterion("ssettlementmoney not between", value1, value2, "ssettlementmoney");
            return (Criteria) this;
        }

        public Criteria andSbusinesstypenoIsNull() {
            addCriterion("sbusinesstypeno is null");
            return (Criteria) this;
        }

        public Criteria andSbusinesstypenoIsNotNull() {
            addCriterion("sbusinesstypeno is not null");
            return (Criteria) this;
        }

        public Criteria andSbusinesstypenoEqualTo(Integer value) {
            addCriterion("sbusinesstypeno =", value, "sbusinesstypeno");
            return (Criteria) this;
        }

        public Criteria andSbusinesstypenoNotEqualTo(Integer value) {
            addCriterion("sbusinesstypeno <>", value, "sbusinesstypeno");
            return (Criteria) this;
        }

        public Criteria andSbusinesstypenoGreaterThan(Integer value) {
            addCriterion("sbusinesstypeno >", value, "sbusinesstypeno");
            return (Criteria) this;
        }

        public Criteria andSbusinesstypenoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sbusinesstypeno >=", value, "sbusinesstypeno");
            return (Criteria) this;
        }

        public Criteria andSbusinesstypenoLessThan(Integer value) {
            addCriterion("sbusinesstypeno <", value, "sbusinesstypeno");
            return (Criteria) this;
        }

        public Criteria andSbusinesstypenoLessThanOrEqualTo(Integer value) {
            addCriterion("sbusinesstypeno <=", value, "sbusinesstypeno");
            return (Criteria) this;
        }

        public Criteria andSbusinesstypenoIn(List<Integer> values) {
            addCriterion("sbusinesstypeno in", values, "sbusinesstypeno");
            return (Criteria) this;
        }

        public Criteria andSbusinesstypenoNotIn(List<Integer> values) {
            addCriterion("sbusinesstypeno not in", values, "sbusinesstypeno");
            return (Criteria) this;
        }

        public Criteria andSbusinesstypenoBetween(Integer value1, Integer value2) {
            addCriterion("sbusinesstypeno between", value1, value2, "sbusinesstypeno");
            return (Criteria) this;
        }

        public Criteria andSbusinesstypenoNotBetween(Integer value1, Integer value2) {
            addCriterion("sbusinesstypeno not between", value1, value2, "sbusinesstypeno");
            return (Criteria) this;
        }

        public Criteria andScusnoIsNull() {
            addCriterion("scusno is null");
            return (Criteria) this;
        }

        public Criteria andScusnoIsNotNull() {
            addCriterion("scusno is not null");
            return (Criteria) this;
        }

        public Criteria andScusnoEqualTo(Integer value) {
            addCriterion("scusno =", value, "scusno");
            return (Criteria) this;
        }

        public Criteria andScusnoNotEqualTo(Integer value) {
            addCriterion("scusno <>", value, "scusno");
            return (Criteria) this;
        }

        public Criteria andScusnoGreaterThan(Integer value) {
            addCriterion("scusno >", value, "scusno");
            return (Criteria) this;
        }

        public Criteria andScusnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("scusno >=", value, "scusno");
            return (Criteria) this;
        }

        public Criteria andScusnoLessThan(Integer value) {
            addCriterion("scusno <", value, "scusno");
            return (Criteria) this;
        }

        public Criteria andScusnoLessThanOrEqualTo(Integer value) {
            addCriterion("scusno <=", value, "scusno");
            return (Criteria) this;
        }

        public Criteria andScusnoIn(List<Integer> values) {
            addCriterion("scusno in", values, "scusno");
            return (Criteria) this;
        }

        public Criteria andScusnoNotIn(List<Integer> values) {
            addCriterion("scusno not in", values, "scusno");
            return (Criteria) this;
        }

        public Criteria andScusnoBetween(Integer value1, Integer value2) {
            addCriterion("scusno between", value1, value2, "scusno");
            return (Criteria) this;
        }

        public Criteria andScusnoNotBetween(Integer value1, Integer value2) {
            addCriterion("scusno not between", value1, value2, "scusno");
            return (Criteria) this;
        }

        public Criteria andScarnoIsNull() {
            addCriterion("scarno is null");
            return (Criteria) this;
        }

        public Criteria andScarnoIsNotNull() {
            addCriterion("scarno is not null");
            return (Criteria) this;
        }

        public Criteria andScarnoEqualTo(Integer value) {
            addCriterion("scarno =", value, "scarno");
            return (Criteria) this;
        }

        public Criteria andScarnoNotEqualTo(Integer value) {
            addCriterion("scarno <>", value, "scarno");
            return (Criteria) this;
        }

        public Criteria andScarnoGreaterThan(Integer value) {
            addCriterion("scarno >", value, "scarno");
            return (Criteria) this;
        }

        public Criteria andScarnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("scarno >=", value, "scarno");
            return (Criteria) this;
        }

        public Criteria andScarnoLessThan(Integer value) {
            addCriterion("scarno <", value, "scarno");
            return (Criteria) this;
        }

        public Criteria andScarnoLessThanOrEqualTo(Integer value) {
            addCriterion("scarno <=", value, "scarno");
            return (Criteria) this;
        }

        public Criteria andScarnoIn(List<Integer> values) {
            addCriterion("scarno in", values, "scarno");
            return (Criteria) this;
        }

        public Criteria andScarnoNotIn(List<Integer> values) {
            addCriterion("scarno not in", values, "scarno");
            return (Criteria) this;
        }

        public Criteria andScarnoBetween(Integer value1, Integer value2) {
            addCriterion("scarno between", value1, value2, "scarno");
            return (Criteria) this;
        }

        public Criteria andScarnoNotBetween(Integer value1, Integer value2) {
            addCriterion("scarno not between", value1, value2, "scarno");
            return (Criteria) this;
        }

        public Criteria andSinsurancenoIsNull() {
            addCriterion("sinsuranceno is null");
            return (Criteria) this;
        }

        public Criteria andSinsurancenoIsNotNull() {
            addCriterion("sinsuranceno is not null");
            return (Criteria) this;
        }

        public Criteria andSinsurancenoEqualTo(Integer value) {
            addCriterion("sinsuranceno =", value, "sinsuranceno");
            return (Criteria) this;
        }

        public Criteria andSinsurancenoNotEqualTo(Integer value) {
            addCriterion("sinsuranceno <>", value, "sinsuranceno");
            return (Criteria) this;
        }

        public Criteria andSinsurancenoGreaterThan(Integer value) {
            addCriterion("sinsuranceno >", value, "sinsuranceno");
            return (Criteria) this;
        }

        public Criteria andSinsurancenoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sinsuranceno >=", value, "sinsuranceno");
            return (Criteria) this;
        }

        public Criteria andSinsurancenoLessThan(Integer value) {
            addCriterion("sinsuranceno <", value, "sinsuranceno");
            return (Criteria) this;
        }

        public Criteria andSinsurancenoLessThanOrEqualTo(Integer value) {
            addCriterion("sinsuranceno <=", value, "sinsuranceno");
            return (Criteria) this;
        }

        public Criteria andSinsurancenoIn(List<Integer> values) {
            addCriterion("sinsuranceno in", values, "sinsuranceno");
            return (Criteria) this;
        }

        public Criteria andSinsurancenoNotIn(List<Integer> values) {
            addCriterion("sinsuranceno not in", values, "sinsuranceno");
            return (Criteria) this;
        }

        public Criteria andSinsurancenoBetween(Integer value1, Integer value2) {
            addCriterion("sinsuranceno between", value1, value2, "sinsuranceno");
            return (Criteria) this;
        }

        public Criteria andSinsurancenoNotBetween(Integer value1, Integer value2) {
            addCriterion("sinsuranceno not between", value1, value2, "sinsuranceno");
            return (Criteria) this;
        }

        public Criteria andSindemnitycompanyIsNull() {
            addCriterion("sindemnitycompany is null");
            return (Criteria) this;
        }

        public Criteria andSindemnitycompanyIsNotNull() {
            addCriterion("sindemnitycompany is not null");
            return (Criteria) this;
        }

        public Criteria andSindemnitycompanyEqualTo(String value) {
            addCriterion("sindemnitycompany =", value, "sindemnitycompany");
            return (Criteria) this;
        }

        public Criteria andSindemnitycompanyNotEqualTo(String value) {
            addCriterion("sindemnitycompany <>", value, "sindemnitycompany");
            return (Criteria) this;
        }

        public Criteria andSindemnitycompanyGreaterThan(String value) {
            addCriterion("sindemnitycompany >", value, "sindemnitycompany");
            return (Criteria) this;
        }

        public Criteria andSindemnitycompanyGreaterThanOrEqualTo(String value) {
            addCriterion("sindemnitycompany >=", value, "sindemnitycompany");
            return (Criteria) this;
        }

        public Criteria andSindemnitycompanyLessThan(String value) {
            addCriterion("sindemnitycompany <", value, "sindemnitycompany");
            return (Criteria) this;
        }

        public Criteria andSindemnitycompanyLessThanOrEqualTo(String value) {
            addCriterion("sindemnitycompany <=", value, "sindemnitycompany");
            return (Criteria) this;
        }

        public Criteria andSindemnitycompanyLike(String value) {
            addCriterion("sindemnitycompany like", value, "sindemnitycompany");
            return (Criteria) this;
        }

        public Criteria andSindemnitycompanyNotLike(String value) {
            addCriterion("sindemnitycompany not like", value, "sindemnitycompany");
            return (Criteria) this;
        }

        public Criteria andSindemnitycompanyIn(List<String> values) {
            addCriterion("sindemnitycompany in", values, "sindemnitycompany");
            return (Criteria) this;
        }

        public Criteria andSindemnitycompanyNotIn(List<String> values) {
            addCriterion("sindemnitycompany not in", values, "sindemnitycompany");
            return (Criteria) this;
        }

        public Criteria andSindemnitycompanyBetween(String value1, String value2) {
            addCriterion("sindemnitycompany between", value1, value2, "sindemnitycompany");
            return (Criteria) this;
        }

        public Criteria andSindemnitycompanyNotBetween(String value1, String value2) {
            addCriterion("sindemnitycompany not between", value1, value2, "sindemnitycompany");
            return (Criteria) this;
        }

        public Criteria andScompletedateIsNull() {
            addCriterion("scompletedate is null");
            return (Criteria) this;
        }

        public Criteria andScompletedateIsNotNull() {
            addCriterion("scompletedate is not null");
            return (Criteria) this;
        }

        public Criteria andScompletedateEqualTo(Date value) {
            addCriterionForJDBCDate("scompletedate =", value, "scompletedate");
            return (Criteria) this;
        }

        public Criteria andScompletedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("scompletedate <>", value, "scompletedate");
            return (Criteria) this;
        }

        public Criteria andScompletedateGreaterThan(Date value) {
            addCriterionForJDBCDate("scompletedate >", value, "scompletedate");
            return (Criteria) this;
        }

        public Criteria andScompletedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("scompletedate >=", value, "scompletedate");
            return (Criteria) this;
        }

        public Criteria andScompletedateLessThan(Date value) {
            addCriterionForJDBCDate("scompletedate <", value, "scompletedate");
            return (Criteria) this;
        }

        public Criteria andScompletedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("scompletedate <=", value, "scompletedate");
            return (Criteria) this;
        }

        public Criteria andScompletedateIn(List<Date> values) {
            addCriterionForJDBCDate("scompletedate in", values, "scompletedate");
            return (Criteria) this;
        }

        public Criteria andScompletedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("scompletedate not in", values, "scompletedate");
            return (Criteria) this;
        }

        public Criteria andScompletedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("scompletedate between", value1, value2, "scompletedate");
            return (Criteria) this;
        }

        public Criteria andScompletedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("scompletedate not between", value1, value2, "scompletedate");
            return (Criteria) this;
        }

        public Criteria andSremarkIsNull() {
            addCriterion("sremark is null");
            return (Criteria) this;
        }

        public Criteria andSremarkIsNotNull() {
            addCriterion("sremark is not null");
            return (Criteria) this;
        }

        public Criteria andSremarkEqualTo(String value) {
            addCriterion("sremark =", value, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkNotEqualTo(String value) {
            addCriterion("sremark <>", value, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkGreaterThan(String value) {
            addCriterion("sremark >", value, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkGreaterThanOrEqualTo(String value) {
            addCriterion("sremark >=", value, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkLessThan(String value) {
            addCriterion("sremark <", value, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkLessThanOrEqualTo(String value) {
            addCriterion("sremark <=", value, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkLike(String value) {
            addCriterion("sremark like", value, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkNotLike(String value) {
            addCriterion("sremark not like", value, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkIn(List<String> values) {
            addCriterion("sremark in", values, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkNotIn(List<String> values) {
            addCriterion("sremark not in", values, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkBetween(String value1, String value2) {
            addCriterion("sremark between", value1, value2, "sremark");
            return (Criteria) this;
        }

        public Criteria andSremarkNotBetween(String value1, String value2) {
            addCriterion("sremark not between", value1, value2, "sremark");
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