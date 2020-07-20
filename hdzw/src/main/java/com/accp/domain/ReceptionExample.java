package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReceptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReceptionExample() {
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

        public Criteria andAkidIsNull() {
            addCriterion("akid is null");
            return (Criteria) this;
        }

        public Criteria andAkidIsNotNull() {
            addCriterion("akid is not null");
            return (Criteria) this;
        }

        public Criteria andAkidEqualTo(Integer value) {
            addCriterion("akid =", value, "akid");
            return (Criteria) this;
        }

        public Criteria andAkidNotEqualTo(Integer value) {
            addCriterion("akid <>", value, "akid");
            return (Criteria) this;
        }

        public Criteria andAkidGreaterThan(Integer value) {
            addCriterion("akid >", value, "akid");
            return (Criteria) this;
        }

        public Criteria andAkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("akid >=", value, "akid");
            return (Criteria) this;
        }

        public Criteria andAkidLessThan(Integer value) {
            addCriterion("akid <", value, "akid");
            return (Criteria) this;
        }

        public Criteria andAkidLessThanOrEqualTo(Integer value) {
            addCriterion("akid <=", value, "akid");
            return (Criteria) this;
        }

        public Criteria andAkidIn(List<Integer> values) {
            addCriterion("akid in", values, "akid");
            return (Criteria) this;
        }

        public Criteria andAkidNotIn(List<Integer> values) {
            addCriterion("akid not in", values, "akid");
            return (Criteria) this;
        }

        public Criteria andAkidBetween(Integer value1, Integer value2) {
            addCriterion("akid between", value1, value2, "akid");
            return (Criteria) this;
        }

        public Criteria andAkidNotBetween(Integer value1, Integer value2) {
            addCriterion("akid not between", value1, value2, "akid");
            return (Criteria) this;
        }

        public Criteria andAkstateidIsNull() {
            addCriterion("akstateid is null");
            return (Criteria) this;
        }

        public Criteria andAkstateidIsNotNull() {
            addCriterion("akstateid is not null");
            return (Criteria) this;
        }

        public Criteria andAkstateidEqualTo(Integer value) {
            addCriterion("akstateid =", value, "akstateid");
            return (Criteria) this;
        }

        public Criteria andAkstateidNotEqualTo(Integer value) {
            addCriterion("akstateid <>", value, "akstateid");
            return (Criteria) this;
        }

        public Criteria andAkstateidGreaterThan(Integer value) {
            addCriterion("akstateid >", value, "akstateid");
            return (Criteria) this;
        }

        public Criteria andAkstateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("akstateid >=", value, "akstateid");
            return (Criteria) this;
        }

        public Criteria andAkstateidLessThan(Integer value) {
            addCriterion("akstateid <", value, "akstateid");
            return (Criteria) this;
        }

        public Criteria andAkstateidLessThanOrEqualTo(Integer value) {
            addCriterion("akstateid <=", value, "akstateid");
            return (Criteria) this;
        }

        public Criteria andAkstateidIn(List<Integer> values) {
            addCriterion("akstateid in", values, "akstateid");
            return (Criteria) this;
        }

        public Criteria andAkstateidNotIn(List<Integer> values) {
            addCriterion("akstateid not in", values, "akstateid");
            return (Criteria) this;
        }

        public Criteria andAkstateidBetween(Integer value1, Integer value2) {
            addCriterion("akstateid between", value1, value2, "akstateid");
            return (Criteria) this;
        }

        public Criteria andAkstateidNotBetween(Integer value1, Integer value2) {
            addCriterion("akstateid not between", value1, value2, "akstateid");
            return (Criteria) this;
        }

        public Criteria andAkbusinesstypeidIsNull() {
            addCriterion("akbusinesstypeid is null");
            return (Criteria) this;
        }

        public Criteria andAkbusinesstypeidIsNotNull() {
            addCriterion("akbusinesstypeid is not null");
            return (Criteria) this;
        }

        public Criteria andAkbusinesstypeidEqualTo(Integer value) {
            addCriterion("akbusinesstypeid =", value, "akbusinesstypeid");
            return (Criteria) this;
        }

        public Criteria andAkbusinesstypeidNotEqualTo(Integer value) {
            addCriterion("akbusinesstypeid <>", value, "akbusinesstypeid");
            return (Criteria) this;
        }

        public Criteria andAkbusinesstypeidGreaterThan(Integer value) {
            addCriterion("akbusinesstypeid >", value, "akbusinesstypeid");
            return (Criteria) this;
        }

        public Criteria andAkbusinesstypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("akbusinesstypeid >=", value, "akbusinesstypeid");
            return (Criteria) this;
        }

        public Criteria andAkbusinesstypeidLessThan(Integer value) {
            addCriterion("akbusinesstypeid <", value, "akbusinesstypeid");
            return (Criteria) this;
        }

        public Criteria andAkbusinesstypeidLessThanOrEqualTo(Integer value) {
            addCriterion("akbusinesstypeid <=", value, "akbusinesstypeid");
            return (Criteria) this;
        }

        public Criteria andAkbusinesstypeidIn(List<Integer> values) {
            addCriterion("akbusinesstypeid in", values, "akbusinesstypeid");
            return (Criteria) this;
        }

        public Criteria andAkbusinesstypeidNotIn(List<Integer> values) {
            addCriterion("akbusinesstypeid not in", values, "akbusinesstypeid");
            return (Criteria) this;
        }

        public Criteria andAkbusinesstypeidBetween(Integer value1, Integer value2) {
            addCriterion("akbusinesstypeid between", value1, value2, "akbusinesstypeid");
            return (Criteria) this;
        }

        public Criteria andAkbusinesstypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("akbusinesstypeid not between", value1, value2, "akbusinesstypeid");
            return (Criteria) this;
        }

        public Criteria andAkcustomeridIsNull() {
            addCriterion("akcustomerid is null");
            return (Criteria) this;
        }

        public Criteria andAkcustomeridIsNotNull() {
            addCriterion("akcustomerid is not null");
            return (Criteria) this;
        }

        public Criteria andAkcustomeridEqualTo(Integer value) {
            addCriterion("akcustomerid =", value, "akcustomerid");
            return (Criteria) this;
        }

        public Criteria andAkcustomeridNotEqualTo(Integer value) {
            addCriterion("akcustomerid <>", value, "akcustomerid");
            return (Criteria) this;
        }

        public Criteria andAkcustomeridGreaterThan(Integer value) {
            addCriterion("akcustomerid >", value, "akcustomerid");
            return (Criteria) this;
        }

        public Criteria andAkcustomeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("akcustomerid >=", value, "akcustomerid");
            return (Criteria) this;
        }

        public Criteria andAkcustomeridLessThan(Integer value) {
            addCriterion("akcustomerid <", value, "akcustomerid");
            return (Criteria) this;
        }

        public Criteria andAkcustomeridLessThanOrEqualTo(Integer value) {
            addCriterion("akcustomerid <=", value, "akcustomerid");
            return (Criteria) this;
        }

        public Criteria andAkcustomeridIn(List<Integer> values) {
            addCriterion("akcustomerid in", values, "akcustomerid");
            return (Criteria) this;
        }

        public Criteria andAkcustomeridNotIn(List<Integer> values) {
            addCriterion("akcustomerid not in", values, "akcustomerid");
            return (Criteria) this;
        }

        public Criteria andAkcustomeridBetween(Integer value1, Integer value2) {
            addCriterion("akcustomerid between", value1, value2, "akcustomerid");
            return (Criteria) this;
        }

        public Criteria andAkcustomeridNotBetween(Integer value1, Integer value2) {
            addCriterion("akcustomerid not between", value1, value2, "akcustomerid");
            return (Criteria) this;
        }

        public Criteria andAkcaridIsNull() {
            addCriterion("akcarid is null");
            return (Criteria) this;
        }

        public Criteria andAkcaridIsNotNull() {
            addCriterion("akcarid is not null");
            return (Criteria) this;
        }

        public Criteria andAkcaridEqualTo(Integer value) {
            addCriterion("akcarid =", value, "akcarid");
            return (Criteria) this;
        }

        public Criteria andAkcaridNotEqualTo(Integer value) {
            addCriterion("akcarid <>", value, "akcarid");
            return (Criteria) this;
        }

        public Criteria andAkcaridGreaterThan(Integer value) {
            addCriterion("akcarid >", value, "akcarid");
            return (Criteria) this;
        }

        public Criteria andAkcaridGreaterThanOrEqualTo(Integer value) {
            addCriterion("akcarid >=", value, "akcarid");
            return (Criteria) this;
        }

        public Criteria andAkcaridLessThan(Integer value) {
            addCriterion("akcarid <", value, "akcarid");
            return (Criteria) this;
        }

        public Criteria andAkcaridLessThanOrEqualTo(Integer value) {
            addCriterion("akcarid <=", value, "akcarid");
            return (Criteria) this;
        }

        public Criteria andAkcaridIn(List<Integer> values) {
            addCriterion("akcarid in", values, "akcarid");
            return (Criteria) this;
        }

        public Criteria andAkcaridNotIn(List<Integer> values) {
            addCriterion("akcarid not in", values, "akcarid");
            return (Criteria) this;
        }

        public Criteria andAkcaridBetween(Integer value1, Integer value2) {
            addCriterion("akcarid between", value1, value2, "akcarid");
            return (Criteria) this;
        }

        public Criteria andAkcaridNotBetween(Integer value1, Integer value2) {
            addCriterion("akcarid not between", value1, value2, "akcarid");
            return (Criteria) this;
        }

        public Criteria andAkbilltypeIsNull() {
            addCriterion("akbilltype is null");
            return (Criteria) this;
        }

        public Criteria andAkbilltypeIsNotNull() {
            addCriterion("akbilltype is not null");
            return (Criteria) this;
        }

        public Criteria andAkbilltypeEqualTo(String value) {
            addCriterion("akbilltype =", value, "akbilltype");
            return (Criteria) this;
        }

        public Criteria andAkbilltypeNotEqualTo(String value) {
            addCriterion("akbilltype <>", value, "akbilltype");
            return (Criteria) this;
        }

        public Criteria andAkbilltypeGreaterThan(String value) {
            addCriterion("akbilltype >", value, "akbilltype");
            return (Criteria) this;
        }

        public Criteria andAkbilltypeGreaterThanOrEqualTo(String value) {
            addCriterion("akbilltype >=", value, "akbilltype");
            return (Criteria) this;
        }

        public Criteria andAkbilltypeLessThan(String value) {
            addCriterion("akbilltype <", value, "akbilltype");
            return (Criteria) this;
        }

        public Criteria andAkbilltypeLessThanOrEqualTo(String value) {
            addCriterion("akbilltype <=", value, "akbilltype");
            return (Criteria) this;
        }

        public Criteria andAkbilltypeLike(String value) {
            addCriterion("akbilltype like", value, "akbilltype");
            return (Criteria) this;
        }

        public Criteria andAkbilltypeNotLike(String value) {
            addCriterion("akbilltype not like", value, "akbilltype");
            return (Criteria) this;
        }

        public Criteria andAkbilltypeIn(List<String> values) {
            addCriterion("akbilltype in", values, "akbilltype");
            return (Criteria) this;
        }

        public Criteria andAkbilltypeNotIn(List<String> values) {
            addCriterion("akbilltype not in", values, "akbilltype");
            return (Criteria) this;
        }

        public Criteria andAkbilltypeBetween(String value1, String value2) {
            addCriterion("akbilltype between", value1, value2, "akbilltype");
            return (Criteria) this;
        }

        public Criteria andAkbilltypeNotBetween(String value1, String value2) {
            addCriterion("akbilltype not between", value1, value2, "akbilltype");
            return (Criteria) this;
        }

        public Criteria andAkbillingdateIsNull() {
            addCriterion("akbillingdate is null");
            return (Criteria) this;
        }

        public Criteria andAkbillingdateIsNotNull() {
            addCriterion("akbillingdate is not null");
            return (Criteria) this;
        }

        public Criteria andAkbillingdateEqualTo(Date value) {
            addCriterionForJDBCDate("akbillingdate =", value, "akbillingdate");
            return (Criteria) this;
        }

        public Criteria andAkbillingdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("akbillingdate <>", value, "akbillingdate");
            return (Criteria) this;
        }

        public Criteria andAkbillingdateGreaterThan(Date value) {
            addCriterionForJDBCDate("akbillingdate >", value, "akbillingdate");
            return (Criteria) this;
        }

        public Criteria andAkbillingdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("akbillingdate >=", value, "akbillingdate");
            return (Criteria) this;
        }

        public Criteria andAkbillingdateLessThan(Date value) {
            addCriterionForJDBCDate("akbillingdate <", value, "akbillingdate");
            return (Criteria) this;
        }

        public Criteria andAkbillingdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("akbillingdate <=", value, "akbillingdate");
            return (Criteria) this;
        }

        public Criteria andAkbillingdateIn(List<Date> values) {
            addCriterionForJDBCDate("akbillingdate in", values, "akbillingdate");
            return (Criteria) this;
        }

        public Criteria andAkbillingdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("akbillingdate not in", values, "akbillingdate");
            return (Criteria) this;
        }

        public Criteria andAkbillingdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("akbillingdate between", value1, value2, "akbillingdate");
            return (Criteria) this;
        }

        public Criteria andAkbillingdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("akbillingdate not between", value1, value2, "akbillingdate");
            return (Criteria) this;
        }

        public Criteria andAkftcIsNull() {
            addCriterion("akftc is null");
            return (Criteria) this;
        }

        public Criteria andAkftcIsNotNull() {
            addCriterion("akftc is not null");
            return (Criteria) this;
        }

        public Criteria andAkftcEqualTo(Date value) {
            addCriterionForJDBCDate("akftc =", value, "akftc");
            return (Criteria) this;
        }

        public Criteria andAkftcNotEqualTo(Date value) {
            addCriterionForJDBCDate("akftc <>", value, "akftc");
            return (Criteria) this;
        }

        public Criteria andAkftcGreaterThan(Date value) {
            addCriterionForJDBCDate("akftc >", value, "akftc");
            return (Criteria) this;
        }

        public Criteria andAkftcGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("akftc >=", value, "akftc");
            return (Criteria) this;
        }

        public Criteria andAkftcLessThan(Date value) {
            addCriterionForJDBCDate("akftc <", value, "akftc");
            return (Criteria) this;
        }

        public Criteria andAkftcLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("akftc <=", value, "akftc");
            return (Criteria) this;
        }

        public Criteria andAkftcIn(List<Date> values) {
            addCriterionForJDBCDate("akftc in", values, "akftc");
            return (Criteria) this;
        }

        public Criteria andAkftcNotIn(List<Date> values) {
            addCriterionForJDBCDate("akftc not in", values, "akftc");
            return (Criteria) this;
        }

        public Criteria andAkftcBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("akftc between", value1, value2, "akftc");
            return (Criteria) this;
        }

        public Criteria andAkftcNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("akftc not between", value1, value2, "akftc");
            return (Criteria) this;
        }

        public Criteria andAkftcdateIsNull() {
            addCriterion("akftcdate is null");
            return (Criteria) this;
        }

        public Criteria andAkftcdateIsNotNull() {
            addCriterion("akftcdate is not null");
            return (Criteria) this;
        }

        public Criteria andAkftcdateEqualTo(Date value) {
            addCriterionForJDBCDate("akftcdate =", value, "akftcdate");
            return (Criteria) this;
        }

        public Criteria andAkftcdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("akftcdate <>", value, "akftcdate");
            return (Criteria) this;
        }

        public Criteria andAkftcdateGreaterThan(Date value) {
            addCriterionForJDBCDate("akftcdate >", value, "akftcdate");
            return (Criteria) this;
        }

        public Criteria andAkftcdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("akftcdate >=", value, "akftcdate");
            return (Criteria) this;
        }

        public Criteria andAkftcdateLessThan(Date value) {
            addCriterionForJDBCDate("akftcdate <", value, "akftcdate");
            return (Criteria) this;
        }

        public Criteria andAkftcdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("akftcdate <=", value, "akftcdate");
            return (Criteria) this;
        }

        public Criteria andAkftcdateIn(List<Date> values) {
            addCriterionForJDBCDate("akftcdate in", values, "akftcdate");
            return (Criteria) this;
        }

        public Criteria andAkftcdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("akftcdate not in", values, "akftcdate");
            return (Criteria) this;
        }

        public Criteria andAkftcdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("akftcdate between", value1, value2, "akftcdate");
            return (Criteria) this;
        }

        public Criteria andAkftcdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("akftcdate not between", value1, value2, "akftcdate");
            return (Criteria) this;
        }

        public Criteria andAkcleardateIsNull() {
            addCriterion("akcleardate is null");
            return (Criteria) this;
        }

        public Criteria andAkcleardateIsNotNull() {
            addCriterion("akcleardate is not null");
            return (Criteria) this;
        }

        public Criteria andAkcleardateEqualTo(Date value) {
            addCriterionForJDBCDate("akcleardate =", value, "akcleardate");
            return (Criteria) this;
        }

        public Criteria andAkcleardateNotEqualTo(Date value) {
            addCriterionForJDBCDate("akcleardate <>", value, "akcleardate");
            return (Criteria) this;
        }

        public Criteria andAkcleardateGreaterThan(Date value) {
            addCriterionForJDBCDate("akcleardate >", value, "akcleardate");
            return (Criteria) this;
        }

        public Criteria andAkcleardateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("akcleardate >=", value, "akcleardate");
            return (Criteria) this;
        }

        public Criteria andAkcleardateLessThan(Date value) {
            addCriterionForJDBCDate("akcleardate <", value, "akcleardate");
            return (Criteria) this;
        }

        public Criteria andAkcleardateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("akcleardate <=", value, "akcleardate");
            return (Criteria) this;
        }

        public Criteria andAkcleardateIn(List<Date> values) {
            addCriterionForJDBCDate("akcleardate in", values, "akcleardate");
            return (Criteria) this;
        }

        public Criteria andAkcleardateNotIn(List<Date> values) {
            addCriterionForJDBCDate("akcleardate not in", values, "akcleardate");
            return (Criteria) this;
        }

        public Criteria andAkcleardateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("akcleardate between", value1, value2, "akcleardate");
            return (Criteria) this;
        }

        public Criteria andAkcleardateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("akcleardate not between", value1, value2, "akcleardate");
            return (Criteria) this;
        }

        public Criteria andAkestimateIsNull() {
            addCriterion("akestimate is null");
            return (Criteria) this;
        }

        public Criteria andAkestimateIsNotNull() {
            addCriterion("akestimate is not null");
            return (Criteria) this;
        }

        public Criteria andAkestimateEqualTo(Float value) {
            addCriterion("akestimate =", value, "akestimate");
            return (Criteria) this;
        }

        public Criteria andAkestimateNotEqualTo(Float value) {
            addCriterion("akestimate <>", value, "akestimate");
            return (Criteria) this;
        }

        public Criteria andAkestimateGreaterThan(Float value) {
            addCriterion("akestimate >", value, "akestimate");
            return (Criteria) this;
        }

        public Criteria andAkestimateGreaterThanOrEqualTo(Float value) {
            addCriterion("akestimate >=", value, "akestimate");
            return (Criteria) this;
        }

        public Criteria andAkestimateLessThan(Float value) {
            addCriterion("akestimate <", value, "akestimate");
            return (Criteria) this;
        }

        public Criteria andAkestimateLessThanOrEqualTo(Float value) {
            addCriterion("akestimate <=", value, "akestimate");
            return (Criteria) this;
        }

        public Criteria andAkestimateIn(List<Float> values) {
            addCriterion("akestimate in", values, "akestimate");
            return (Criteria) this;
        }

        public Criteria andAkestimateNotIn(List<Float> values) {
            addCriterion("akestimate not in", values, "akestimate");
            return (Criteria) this;
        }

        public Criteria andAkestimateBetween(Float value1, Float value2) {
            addCriterion("akestimate between", value1, value2, "akestimate");
            return (Criteria) this;
        }

        public Criteria andAkestimateNotBetween(Float value1, Float value2) {
            addCriterion("akestimate not between", value1, value2, "akestimate");
            return (Criteria) this;
        }

        public Criteria andAkadvisorIsNull() {
            addCriterion("akAdvisor is null");
            return (Criteria) this;
        }

        public Criteria andAkadvisorIsNotNull() {
            addCriterion("akAdvisor is not null");
            return (Criteria) this;
        }

        public Criteria andAkadvisorEqualTo(Integer value) {
            addCriterion("akAdvisor =", value, "akadvisor");
            return (Criteria) this;
        }

        public Criteria andAkadvisorNotEqualTo(Integer value) {
            addCriterion("akAdvisor <>", value, "akadvisor");
            return (Criteria) this;
        }

        public Criteria andAkadvisorGreaterThan(Integer value) {
            addCriterion("akAdvisor >", value, "akadvisor");
            return (Criteria) this;
        }

        public Criteria andAkadvisorGreaterThanOrEqualTo(Integer value) {
            addCriterion("akAdvisor >=", value, "akadvisor");
            return (Criteria) this;
        }

        public Criteria andAkadvisorLessThan(Integer value) {
            addCriterion("akAdvisor <", value, "akadvisor");
            return (Criteria) this;
        }

        public Criteria andAkadvisorLessThanOrEqualTo(Integer value) {
            addCriterion("akAdvisor <=", value, "akadvisor");
            return (Criteria) this;
        }

        public Criteria andAkadvisorIn(List<Integer> values) {
            addCriterion("akAdvisor in", values, "akadvisor");
            return (Criteria) this;
        }

        public Criteria andAkadvisorNotIn(List<Integer> values) {
            addCriterion("akAdvisor not in", values, "akadvisor");
            return (Criteria) this;
        }

        public Criteria andAkadvisorBetween(Integer value1, Integer value2) {
            addCriterion("akAdvisor between", value1, value2, "akadvisor");
            return (Criteria) this;
        }

        public Criteria andAkadvisorNotBetween(Integer value1, Integer value2) {
            addCriterion("akAdvisor not between", value1, value2, "akadvisor");
            return (Criteria) this;
        }

        public Criteria andAkpickoneIsNull() {
            addCriterion("akpickone is null");
            return (Criteria) this;
        }

        public Criteria andAkpickoneIsNotNull() {
            addCriterion("akpickone is not null");
            return (Criteria) this;
        }

        public Criteria andAkpickoneEqualTo(String value) {
            addCriterion("akpickone =", value, "akpickone");
            return (Criteria) this;
        }

        public Criteria andAkpickoneNotEqualTo(String value) {
            addCriterion("akpickone <>", value, "akpickone");
            return (Criteria) this;
        }

        public Criteria andAkpickoneGreaterThan(String value) {
            addCriterion("akpickone >", value, "akpickone");
            return (Criteria) this;
        }

        public Criteria andAkpickoneGreaterThanOrEqualTo(String value) {
            addCriterion("akpickone >=", value, "akpickone");
            return (Criteria) this;
        }

        public Criteria andAkpickoneLessThan(String value) {
            addCriterion("akpickone <", value, "akpickone");
            return (Criteria) this;
        }

        public Criteria andAkpickoneLessThanOrEqualTo(String value) {
            addCriterion("akpickone <=", value, "akpickone");
            return (Criteria) this;
        }

        public Criteria andAkpickoneLike(String value) {
            addCriterion("akpickone like", value, "akpickone");
            return (Criteria) this;
        }

        public Criteria andAkpickoneNotLike(String value) {
            addCriterion("akpickone not like", value, "akpickone");
            return (Criteria) this;
        }

        public Criteria andAkpickoneIn(List<String> values) {
            addCriterion("akpickone in", values, "akpickone");
            return (Criteria) this;
        }

        public Criteria andAkpickoneNotIn(List<String> values) {
            addCriterion("akpickone not in", values, "akpickone");
            return (Criteria) this;
        }

        public Criteria andAkpickoneBetween(String value1, String value2) {
            addCriterion("akpickone between", value1, value2, "akpickone");
            return (Criteria) this;
        }

        public Criteria andAkpickoneNotBetween(String value1, String value2) {
            addCriterion("akpickone not between", value1, value2, "akpickone");
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