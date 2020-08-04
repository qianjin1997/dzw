package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPjobidIsNull() {
            addCriterion("pjobid is null");
            return (Criteria) this;
        }

        public Criteria andPjobidIsNotNull() {
            addCriterion("pjobid is not null");
            return (Criteria) this;
        }

        public Criteria andPjobidEqualTo(String value) {
            addCriterion("pjobid =", value, "pjobid");
            return (Criteria) this;
        }

        public Criteria andPjobidNotEqualTo(String value) {
            addCriterion("pjobid <>", value, "pjobid");
            return (Criteria) this;
        }

        public Criteria andPjobidGreaterThan(String value) {
            addCriterion("pjobid >", value, "pjobid");
            return (Criteria) this;
        }

        public Criteria andPjobidGreaterThanOrEqualTo(String value) {
            addCriterion("pjobid >=", value, "pjobid");
            return (Criteria) this;
        }

        public Criteria andPjobidLessThan(String value) {
            addCriterion("pjobid <", value, "pjobid");
            return (Criteria) this;
        }

        public Criteria andPjobidLessThanOrEqualTo(String value) {
            addCriterion("pjobid <=", value, "pjobid");
            return (Criteria) this;
        }

        public Criteria andPjobidLike(String value) {
            addCriterion("pjobid like", value, "pjobid");
            return (Criteria) this;
        }

        public Criteria andPjobidNotLike(String value) {
            addCriterion("pjobid not like", value, "pjobid");
            return (Criteria) this;
        }

        public Criteria andPjobidIn(List<String> values) {
            addCriterion("pjobid in", values, "pjobid");
            return (Criteria) this;
        }

        public Criteria andPjobidNotIn(List<String> values) {
            addCriterion("pjobid not in", values, "pjobid");
            return (Criteria) this;
        }

        public Criteria andPjobidBetween(String value1, String value2) {
            addCriterion("pjobid between", value1, value2, "pjobid");
            return (Criteria) this;
        }

        public Criteria andPjobidNotBetween(String value1, String value2) {
            addCriterion("pjobid not between", value1, value2, "pjobid");
            return (Criteria) this;
        }

        public Criteria andPnameIsNull() {
            addCriterion("pname is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("pname is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("pname =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pname <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pname >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pname >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("pname <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pname <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("pname like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("pname not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("pname in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pname not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pname between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pname not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPsectionidIsNull() {
            addCriterion("psectionid is null");
            return (Criteria) this;
        }

        public Criteria andPsectionidIsNotNull() {
            addCriterion("psectionid is not null");
            return (Criteria) this;
        }

        public Criteria andPsectionidEqualTo(Integer value) {
            addCriterion("psectionid =", value, "psectionid");
            return (Criteria) this;
        }

        public Criteria andPsectionidNotEqualTo(Integer value) {
            addCriterion("psectionid <>", value, "psectionid");
            return (Criteria) this;
        }

        public Criteria andPsectionidGreaterThan(Integer value) {
            addCriterion("psectionid >", value, "psectionid");
            return (Criteria) this;
        }

        public Criteria andPsectionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("psectionid >=", value, "psectionid");
            return (Criteria) this;
        }

        public Criteria andPsectionidLessThan(Integer value) {
            addCriterion("psectionid <", value, "psectionid");
            return (Criteria) this;
        }

        public Criteria andPsectionidLessThanOrEqualTo(Integer value) {
            addCriterion("psectionid <=", value, "psectionid");
            return (Criteria) this;
        }

        public Criteria andPsectionidIn(List<Integer> values) {
            addCriterion("psectionid in", values, "psectionid");
            return (Criteria) this;
        }

        public Criteria andPsectionidNotIn(List<Integer> values) {
            addCriterion("psectionid not in", values, "psectionid");
            return (Criteria) this;
        }

        public Criteria andPsectionidBetween(Integer value1, Integer value2) {
            addCriterion("psectionid between", value1, value2, "psectionid");
            return (Criteria) this;
        }

        public Criteria andPsectionidNotBetween(Integer value1, Integer value2) {
            addCriterion("psectionid not between", value1, value2, "psectionid");
            return (Criteria) this;
        }

        public Criteria andPsexIsNull() {
            addCriterion("psex is null");
            return (Criteria) this;
        }

        public Criteria andPsexIsNotNull() {
            addCriterion("psex is not null");
            return (Criteria) this;
        }

        public Criteria andPsexEqualTo(String value) {
            addCriterion("psex =", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexNotEqualTo(String value) {
            addCriterion("psex <>", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexGreaterThan(String value) {
            addCriterion("psex >", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexGreaterThanOrEqualTo(String value) {
            addCriterion("psex >=", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexLessThan(String value) {
            addCriterion("psex <", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexLessThanOrEqualTo(String value) {
            addCriterion("psex <=", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexLike(String value) {
            addCriterion("psex like", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexNotLike(String value) {
            addCriterion("psex not like", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexIn(List<String> values) {
            addCriterion("psex in", values, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexNotIn(List<String> values) {
            addCriterion("psex not in", values, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexBetween(String value1, String value2) {
            addCriterion("psex between", value1, value2, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexNotBetween(String value1, String value2) {
            addCriterion("psex not between", value1, value2, "psex");
            return (Criteria) this;
        }

        public Criteria andPgjobidIsNull() {
            addCriterion("pgjobid is null");
            return (Criteria) this;
        }

        public Criteria andPgjobidIsNotNull() {
            addCriterion("pgjobid is not null");
            return (Criteria) this;
        }

        public Criteria andPgjobidEqualTo(Integer value) {
            addCriterion("pgjobid =", value, "pgjobid");
            return (Criteria) this;
        }

        public Criteria andPgjobidNotEqualTo(Integer value) {
            addCriterion("pgjobid <>", value, "pgjobid");
            return (Criteria) this;
        }

        public Criteria andPgjobidGreaterThan(Integer value) {
            addCriterion("pgjobid >", value, "pgjobid");
            return (Criteria) this;
        }

        public Criteria andPgjobidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pgjobid >=", value, "pgjobid");
            return (Criteria) this;
        }

        public Criteria andPgjobidLessThan(Integer value) {
            addCriterion("pgjobid <", value, "pgjobid");
            return (Criteria) this;
        }

        public Criteria andPgjobidLessThanOrEqualTo(Integer value) {
            addCriterion("pgjobid <=", value, "pgjobid");
            return (Criteria) this;
        }

        public Criteria andPgjobidIn(List<Integer> values) {
            addCriterion("pgjobid in", values, "pgjobid");
            return (Criteria) this;
        }

        public Criteria andPgjobidNotIn(List<Integer> values) {
            addCriterion("pgjobid not in", values, "pgjobid");
            return (Criteria) this;
        }

        public Criteria andPgjobidBetween(Integer value1, Integer value2) {
            addCriterion("pgjobid between", value1, value2, "pgjobid");
            return (Criteria) this;
        }

        public Criteria andPgjobidNotBetween(Integer value1, Integer value2) {
            addCriterion("pgjobid not between", value1, value2, "pgjobid");
            return (Criteria) this;
        }

        public Criteria andPbodystatusIsNull() {
            addCriterion("pbodystatus is null");
            return (Criteria) this;
        }

        public Criteria andPbodystatusIsNotNull() {
            addCriterion("pbodystatus is not null");
            return (Criteria) this;
        }

        public Criteria andPbodystatusEqualTo(String value) {
            addCriterion("pbodystatus =", value, "pbodystatus");
            return (Criteria) this;
        }

        public Criteria andPbodystatusNotEqualTo(String value) {
            addCriterion("pbodystatus <>", value, "pbodystatus");
            return (Criteria) this;
        }

        public Criteria andPbodystatusGreaterThan(String value) {
            addCriterion("pbodystatus >", value, "pbodystatus");
            return (Criteria) this;
        }

        public Criteria andPbodystatusGreaterThanOrEqualTo(String value) {
            addCriterion("pbodystatus >=", value, "pbodystatus");
            return (Criteria) this;
        }

        public Criteria andPbodystatusLessThan(String value) {
            addCriterion("pbodystatus <", value, "pbodystatus");
            return (Criteria) this;
        }

        public Criteria andPbodystatusLessThanOrEqualTo(String value) {
            addCriterion("pbodystatus <=", value, "pbodystatus");
            return (Criteria) this;
        }

        public Criteria andPbodystatusLike(String value) {
            addCriterion("pbodystatus like", value, "pbodystatus");
            return (Criteria) this;
        }

        public Criteria andPbodystatusNotLike(String value) {
            addCriterion("pbodystatus not like", value, "pbodystatus");
            return (Criteria) this;
        }

        public Criteria andPbodystatusIn(List<String> values) {
            addCriterion("pbodystatus in", values, "pbodystatus");
            return (Criteria) this;
        }

        public Criteria andPbodystatusNotIn(List<String> values) {
            addCriterion("pbodystatus not in", values, "pbodystatus");
            return (Criteria) this;
        }

        public Criteria andPbodystatusBetween(String value1, String value2) {
            addCriterion("pbodystatus between", value1, value2, "pbodystatus");
            return (Criteria) this;
        }

        public Criteria andPbodystatusNotBetween(String value1, String value2) {
            addCriterion("pbodystatus not between", value1, value2, "pbodystatus");
            return (Criteria) this;
        }

        public Criteria andPheightIsNull() {
            addCriterion("pheight is null");
            return (Criteria) this;
        }

        public Criteria andPheightIsNotNull() {
            addCriterion("pheight is not null");
            return (Criteria) this;
        }

        public Criteria andPheightEqualTo(String value) {
            addCriterion("pheight =", value, "pheight");
            return (Criteria) this;
        }

        public Criteria andPheightNotEqualTo(String value) {
            addCriterion("pheight <>", value, "pheight");
            return (Criteria) this;
        }

        public Criteria andPheightGreaterThan(String value) {
            addCriterion("pheight >", value, "pheight");
            return (Criteria) this;
        }

        public Criteria andPheightGreaterThanOrEqualTo(String value) {
            addCriterion("pheight >=", value, "pheight");
            return (Criteria) this;
        }

        public Criteria andPheightLessThan(String value) {
            addCriterion("pheight <", value, "pheight");
            return (Criteria) this;
        }

        public Criteria andPheightLessThanOrEqualTo(String value) {
            addCriterion("pheight <=", value, "pheight");
            return (Criteria) this;
        }

        public Criteria andPheightLike(String value) {
            addCriterion("pheight like", value, "pheight");
            return (Criteria) this;
        }

        public Criteria andPheightNotLike(String value) {
            addCriterion("pheight not like", value, "pheight");
            return (Criteria) this;
        }

        public Criteria andPheightIn(List<String> values) {
            addCriterion("pheight in", values, "pheight");
            return (Criteria) this;
        }

        public Criteria andPheightNotIn(List<String> values) {
            addCriterion("pheight not in", values, "pheight");
            return (Criteria) this;
        }

        public Criteria andPheightBetween(String value1, String value2) {
            addCriterion("pheight between", value1, value2, "pheight");
            return (Criteria) this;
        }

        public Criteria andPheightNotBetween(String value1, String value2) {
            addCriterion("pheight not between", value1, value2, "pheight");
            return (Criteria) this;
        }

        public Criteria andPorigoIsNull() {
            addCriterion("pOrigo is null");
            return (Criteria) this;
        }

        public Criteria andPorigoIsNotNull() {
            addCriterion("pOrigo is not null");
            return (Criteria) this;
        }

        public Criteria andPorigoEqualTo(String value) {
            addCriterion("pOrigo =", value, "porigo");
            return (Criteria) this;
        }

        public Criteria andPorigoNotEqualTo(String value) {
            addCriterion("pOrigo <>", value, "porigo");
            return (Criteria) this;
        }

        public Criteria andPorigoGreaterThan(String value) {
            addCriterion("pOrigo >", value, "porigo");
            return (Criteria) this;
        }

        public Criteria andPorigoGreaterThanOrEqualTo(String value) {
            addCriterion("pOrigo >=", value, "porigo");
            return (Criteria) this;
        }

        public Criteria andPorigoLessThan(String value) {
            addCriterion("pOrigo <", value, "porigo");
            return (Criteria) this;
        }

        public Criteria andPorigoLessThanOrEqualTo(String value) {
            addCriterion("pOrigo <=", value, "porigo");
            return (Criteria) this;
        }

        public Criteria andPorigoLike(String value) {
            addCriterion("pOrigo like", value, "porigo");
            return (Criteria) this;
        }

        public Criteria andPorigoNotLike(String value) {
            addCriterion("pOrigo not like", value, "porigo");
            return (Criteria) this;
        }

        public Criteria andPorigoIn(List<String> values) {
            addCriterion("pOrigo in", values, "porigo");
            return (Criteria) this;
        }

        public Criteria andPorigoNotIn(List<String> values) {
            addCriterion("pOrigo not in", values, "porigo");
            return (Criteria) this;
        }

        public Criteria andPorigoBetween(String value1, String value2) {
            addCriterion("pOrigo between", value1, value2, "porigo");
            return (Criteria) this;
        }

        public Criteria andPorigoNotBetween(String value1, String value2) {
            addCriterion("pOrigo not between", value1, value2, "porigo");
            return (Criteria) this;
        }

        public Criteria andPethnicIsNull() {
            addCriterion("pethnic is null");
            return (Criteria) this;
        }

        public Criteria andPethnicIsNotNull() {
            addCriterion("pethnic is not null");
            return (Criteria) this;
        }

        public Criteria andPethnicEqualTo(String value) {
            addCriterion("pethnic =", value, "pethnic");
            return (Criteria) this;
        }

        public Criteria andPethnicNotEqualTo(String value) {
            addCriterion("pethnic <>", value, "pethnic");
            return (Criteria) this;
        }

        public Criteria andPethnicGreaterThan(String value) {
            addCriterion("pethnic >", value, "pethnic");
            return (Criteria) this;
        }

        public Criteria andPethnicGreaterThanOrEqualTo(String value) {
            addCriterion("pethnic >=", value, "pethnic");
            return (Criteria) this;
        }

        public Criteria andPethnicLessThan(String value) {
            addCriterion("pethnic <", value, "pethnic");
            return (Criteria) this;
        }

        public Criteria andPethnicLessThanOrEqualTo(String value) {
            addCriterion("pethnic <=", value, "pethnic");
            return (Criteria) this;
        }

        public Criteria andPethnicLike(String value) {
            addCriterion("pethnic like", value, "pethnic");
            return (Criteria) this;
        }

        public Criteria andPethnicNotLike(String value) {
            addCriterion("pethnic not like", value, "pethnic");
            return (Criteria) this;
        }

        public Criteria andPethnicIn(List<String> values) {
            addCriterion("pethnic in", values, "pethnic");
            return (Criteria) this;
        }

        public Criteria andPethnicNotIn(List<String> values) {
            addCriterion("pethnic not in", values, "pethnic");
            return (Criteria) this;
        }

        public Criteria andPethnicBetween(String value1, String value2) {
            addCriterion("pethnic between", value1, value2, "pethnic");
            return (Criteria) this;
        }

        public Criteria andPethnicNotBetween(String value1, String value2) {
            addCriterion("pethnic not between", value1, value2, "pethnic");
            return (Criteria) this;
        }

        public Criteria andPmaritalstatusIsNull() {
            addCriterion("pmaritalstatus is null");
            return (Criteria) this;
        }

        public Criteria andPmaritalstatusIsNotNull() {
            addCriterion("pmaritalstatus is not null");
            return (Criteria) this;
        }

        public Criteria andPmaritalstatusEqualTo(String value) {
            addCriterion("pmaritalstatus =", value, "pmaritalstatus");
            return (Criteria) this;
        }

        public Criteria andPmaritalstatusNotEqualTo(String value) {
            addCriterion("pmaritalstatus <>", value, "pmaritalstatus");
            return (Criteria) this;
        }

        public Criteria andPmaritalstatusGreaterThan(String value) {
            addCriterion("pmaritalstatus >", value, "pmaritalstatus");
            return (Criteria) this;
        }

        public Criteria andPmaritalstatusGreaterThanOrEqualTo(String value) {
            addCriterion("pmaritalstatus >=", value, "pmaritalstatus");
            return (Criteria) this;
        }

        public Criteria andPmaritalstatusLessThan(String value) {
            addCriterion("pmaritalstatus <", value, "pmaritalstatus");
            return (Criteria) this;
        }

        public Criteria andPmaritalstatusLessThanOrEqualTo(String value) {
            addCriterion("pmaritalstatus <=", value, "pmaritalstatus");
            return (Criteria) this;
        }

        public Criteria andPmaritalstatusLike(String value) {
            addCriterion("pmaritalstatus like", value, "pmaritalstatus");
            return (Criteria) this;
        }

        public Criteria andPmaritalstatusNotLike(String value) {
            addCriterion("pmaritalstatus not like", value, "pmaritalstatus");
            return (Criteria) this;
        }

        public Criteria andPmaritalstatusIn(List<String> values) {
            addCriterion("pmaritalstatus in", values, "pmaritalstatus");
            return (Criteria) this;
        }

        public Criteria andPmaritalstatusNotIn(List<String> values) {
            addCriterion("pmaritalstatus not in", values, "pmaritalstatus");
            return (Criteria) this;
        }

        public Criteria andPmaritalstatusBetween(String value1, String value2) {
            addCriterion("pmaritalstatus between", value1, value2, "pmaritalstatus");
            return (Criteria) this;
        }

        public Criteria andPmaritalstatusNotBetween(String value1, String value2) {
            addCriterion("pmaritalstatus not between", value1, value2, "pmaritalstatus");
            return (Criteria) this;
        }

        public Criteria andPeducationIsNull() {
            addCriterion("peducation is null");
            return (Criteria) this;
        }

        public Criteria andPeducationIsNotNull() {
            addCriterion("peducation is not null");
            return (Criteria) this;
        }

        public Criteria andPeducationEqualTo(String value) {
            addCriterion("peducation =", value, "peducation");
            return (Criteria) this;
        }

        public Criteria andPeducationNotEqualTo(String value) {
            addCriterion("peducation <>", value, "peducation");
            return (Criteria) this;
        }

        public Criteria andPeducationGreaterThan(String value) {
            addCriterion("peducation >", value, "peducation");
            return (Criteria) this;
        }

        public Criteria andPeducationGreaterThanOrEqualTo(String value) {
            addCriterion("peducation >=", value, "peducation");
            return (Criteria) this;
        }

        public Criteria andPeducationLessThan(String value) {
            addCriterion("peducation <", value, "peducation");
            return (Criteria) this;
        }

        public Criteria andPeducationLessThanOrEqualTo(String value) {
            addCriterion("peducation <=", value, "peducation");
            return (Criteria) this;
        }

        public Criteria andPeducationLike(String value) {
            addCriterion("peducation like", value, "peducation");
            return (Criteria) this;
        }

        public Criteria andPeducationNotLike(String value) {
            addCriterion("peducation not like", value, "peducation");
            return (Criteria) this;
        }

        public Criteria andPeducationIn(List<String> values) {
            addCriterion("peducation in", values, "peducation");
            return (Criteria) this;
        }

        public Criteria andPeducationNotIn(List<String> values) {
            addCriterion("peducation not in", values, "peducation");
            return (Criteria) this;
        }

        public Criteria andPeducationBetween(String value1, String value2) {
            addCriterion("peducation between", value1, value2, "peducation");
            return (Criteria) this;
        }

        public Criteria andPeducationNotBetween(String value1, String value2) {
            addCriterion("peducation not between", value1, value2, "peducation");
            return (Criteria) this;
        }

        public Criteria andPschooltagIsNull() {
            addCriterion("pSchoolTag is null");
            return (Criteria) this;
        }

        public Criteria andPschooltagIsNotNull() {
            addCriterion("pSchoolTag is not null");
            return (Criteria) this;
        }

        public Criteria andPschooltagEqualTo(String value) {
            addCriterion("pSchoolTag =", value, "pschooltag");
            return (Criteria) this;
        }

        public Criteria andPschooltagNotEqualTo(String value) {
            addCriterion("pSchoolTag <>", value, "pschooltag");
            return (Criteria) this;
        }

        public Criteria andPschooltagGreaterThan(String value) {
            addCriterion("pSchoolTag >", value, "pschooltag");
            return (Criteria) this;
        }

        public Criteria andPschooltagGreaterThanOrEqualTo(String value) {
            addCriterion("pSchoolTag >=", value, "pschooltag");
            return (Criteria) this;
        }

        public Criteria andPschooltagLessThan(String value) {
            addCriterion("pSchoolTag <", value, "pschooltag");
            return (Criteria) this;
        }

        public Criteria andPschooltagLessThanOrEqualTo(String value) {
            addCriterion("pSchoolTag <=", value, "pschooltag");
            return (Criteria) this;
        }

        public Criteria andPschooltagLike(String value) {
            addCriterion("pSchoolTag like", value, "pschooltag");
            return (Criteria) this;
        }

        public Criteria andPschooltagNotLike(String value) {
            addCriterion("pSchoolTag not like", value, "pschooltag");
            return (Criteria) this;
        }

        public Criteria andPschooltagIn(List<String> values) {
            addCriterion("pSchoolTag in", values, "pschooltag");
            return (Criteria) this;
        }

        public Criteria andPschooltagNotIn(List<String> values) {
            addCriterion("pSchoolTag not in", values, "pschooltag");
            return (Criteria) this;
        }

        public Criteria andPschooltagBetween(String value1, String value2) {
            addCriterion("pSchoolTag between", value1, value2, "pschooltag");
            return (Criteria) this;
        }

        public Criteria andPschooltagNotBetween(String value1, String value2) {
            addCriterion("pSchoolTag not between", value1, value2, "pschooltag");
            return (Criteria) this;
        }

        public Criteria andPprofessionIsNull() {
            addCriterion("pprofession is null");
            return (Criteria) this;
        }

        public Criteria andPprofessionIsNotNull() {
            addCriterion("pprofession is not null");
            return (Criteria) this;
        }

        public Criteria andPprofessionEqualTo(String value) {
            addCriterion("pprofession =", value, "pprofession");
            return (Criteria) this;
        }

        public Criteria andPprofessionNotEqualTo(String value) {
            addCriterion("pprofession <>", value, "pprofession");
            return (Criteria) this;
        }

        public Criteria andPprofessionGreaterThan(String value) {
            addCriterion("pprofession >", value, "pprofession");
            return (Criteria) this;
        }

        public Criteria andPprofessionGreaterThanOrEqualTo(String value) {
            addCriterion("pprofession >=", value, "pprofession");
            return (Criteria) this;
        }

        public Criteria andPprofessionLessThan(String value) {
            addCriterion("pprofession <", value, "pprofession");
            return (Criteria) this;
        }

        public Criteria andPprofessionLessThanOrEqualTo(String value) {
            addCriterion("pprofession <=", value, "pprofession");
            return (Criteria) this;
        }

        public Criteria andPprofessionLike(String value) {
            addCriterion("pprofession like", value, "pprofession");
            return (Criteria) this;
        }

        public Criteria andPprofessionNotLike(String value) {
            addCriterion("pprofession not like", value, "pprofession");
            return (Criteria) this;
        }

        public Criteria andPprofessionIn(List<String> values) {
            addCriterion("pprofession in", values, "pprofession");
            return (Criteria) this;
        }

        public Criteria andPprofessionNotIn(List<String> values) {
            addCriterion("pprofession not in", values, "pprofession");
            return (Criteria) this;
        }

        public Criteria andPprofessionBetween(String value1, String value2) {
            addCriterion("pprofession between", value1, value2, "pprofession");
            return (Criteria) this;
        }

        public Criteria andPprofessionNotBetween(String value1, String value2) {
            addCriterion("pprofession not between", value1, value2, "pprofession");
            return (Criteria) this;
        }

        public Criteria andPqualificationIsNull() {
            addCriterion("pqualification is null");
            return (Criteria) this;
        }

        public Criteria andPqualificationIsNotNull() {
            addCriterion("pqualification is not null");
            return (Criteria) this;
        }

        public Criteria andPqualificationEqualTo(String value) {
            addCriterion("pqualification =", value, "pqualification");
            return (Criteria) this;
        }

        public Criteria andPqualificationNotEqualTo(String value) {
            addCriterion("pqualification <>", value, "pqualification");
            return (Criteria) this;
        }

        public Criteria andPqualificationGreaterThan(String value) {
            addCriterion("pqualification >", value, "pqualification");
            return (Criteria) this;
        }

        public Criteria andPqualificationGreaterThanOrEqualTo(String value) {
            addCriterion("pqualification >=", value, "pqualification");
            return (Criteria) this;
        }

        public Criteria andPqualificationLessThan(String value) {
            addCriterion("pqualification <", value, "pqualification");
            return (Criteria) this;
        }

        public Criteria andPqualificationLessThanOrEqualTo(String value) {
            addCriterion("pqualification <=", value, "pqualification");
            return (Criteria) this;
        }

        public Criteria andPqualificationLike(String value) {
            addCriterion("pqualification like", value, "pqualification");
            return (Criteria) this;
        }

        public Criteria andPqualificationNotLike(String value) {
            addCriterion("pqualification not like", value, "pqualification");
            return (Criteria) this;
        }

        public Criteria andPqualificationIn(List<String> values) {
            addCriterion("pqualification in", values, "pqualification");
            return (Criteria) this;
        }

        public Criteria andPqualificationNotIn(List<String> values) {
            addCriterion("pqualification not in", values, "pqualification");
            return (Criteria) this;
        }

        public Criteria andPqualificationBetween(String value1, String value2) {
            addCriterion("pqualification between", value1, value2, "pqualification");
            return (Criteria) this;
        }

        public Criteria andPqualificationNotBetween(String value1, String value2) {
            addCriterion("pqualification not between", value1, value2, "pqualification");
            return (Criteria) this;
        }

        public Criteria andPdegreeIsNull() {
            addCriterion("pdegree is null");
            return (Criteria) this;
        }

        public Criteria andPdegreeIsNotNull() {
            addCriterion("pdegree is not null");
            return (Criteria) this;
        }

        public Criteria andPdegreeEqualTo(String value) {
            addCriterion("pdegree =", value, "pdegree");
            return (Criteria) this;
        }

        public Criteria andPdegreeNotEqualTo(String value) {
            addCriterion("pdegree <>", value, "pdegree");
            return (Criteria) this;
        }

        public Criteria andPdegreeGreaterThan(String value) {
            addCriterion("pdegree >", value, "pdegree");
            return (Criteria) this;
        }

        public Criteria andPdegreeGreaterThanOrEqualTo(String value) {
            addCriterion("pdegree >=", value, "pdegree");
            return (Criteria) this;
        }

        public Criteria andPdegreeLessThan(String value) {
            addCriterion("pdegree <", value, "pdegree");
            return (Criteria) this;
        }

        public Criteria andPdegreeLessThanOrEqualTo(String value) {
            addCriterion("pdegree <=", value, "pdegree");
            return (Criteria) this;
        }

        public Criteria andPdegreeLike(String value) {
            addCriterion("pdegree like", value, "pdegree");
            return (Criteria) this;
        }

        public Criteria andPdegreeNotLike(String value) {
            addCriterion("pdegree not like", value, "pdegree");
            return (Criteria) this;
        }

        public Criteria andPdegreeIn(List<String> values) {
            addCriterion("pdegree in", values, "pdegree");
            return (Criteria) this;
        }

        public Criteria andPdegreeNotIn(List<String> values) {
            addCriterion("pdegree not in", values, "pdegree");
            return (Criteria) this;
        }

        public Criteria andPdegreeBetween(String value1, String value2) {
            addCriterion("pdegree between", value1, value2, "pdegree");
            return (Criteria) this;
        }

        public Criteria andPdegreeNotBetween(String value1, String value2) {
            addCriterion("pdegree not between", value1, value2, "pdegree");
            return (Criteria) this;
        }

        public Criteria andPstaffingIsNull() {
            addCriterion("pstaffing is null");
            return (Criteria) this;
        }

        public Criteria andPstaffingIsNotNull() {
            addCriterion("pstaffing is not null");
            return (Criteria) this;
        }

        public Criteria andPstaffingEqualTo(String value) {
            addCriterion("pstaffing =", value, "pstaffing");
            return (Criteria) this;
        }

        public Criteria andPstaffingNotEqualTo(String value) {
            addCriterion("pstaffing <>", value, "pstaffing");
            return (Criteria) this;
        }

        public Criteria andPstaffingGreaterThan(String value) {
            addCriterion("pstaffing >", value, "pstaffing");
            return (Criteria) this;
        }

        public Criteria andPstaffingGreaterThanOrEqualTo(String value) {
            addCriterion("pstaffing >=", value, "pstaffing");
            return (Criteria) this;
        }

        public Criteria andPstaffingLessThan(String value) {
            addCriterion("pstaffing <", value, "pstaffing");
            return (Criteria) this;
        }

        public Criteria andPstaffingLessThanOrEqualTo(String value) {
            addCriterion("pstaffing <=", value, "pstaffing");
            return (Criteria) this;
        }

        public Criteria andPstaffingLike(String value) {
            addCriterion("pstaffing like", value, "pstaffing");
            return (Criteria) this;
        }

        public Criteria andPstaffingNotLike(String value) {
            addCriterion("pstaffing not like", value, "pstaffing");
            return (Criteria) this;
        }

        public Criteria andPstaffingIn(List<String> values) {
            addCriterion("pstaffing in", values, "pstaffing");
            return (Criteria) this;
        }

        public Criteria andPstaffingNotIn(List<String> values) {
            addCriterion("pstaffing not in", values, "pstaffing");
            return (Criteria) this;
        }

        public Criteria andPstaffingBetween(String value1, String value2) {
            addCriterion("pstaffing between", value1, value2, "pstaffing");
            return (Criteria) this;
        }

        public Criteria andPstaffingNotBetween(String value1, String value2) {
            addCriterion("pstaffing not between", value1, value2, "pstaffing");
            return (Criteria) this;
        }

        public Criteria andPidnumberIsNull() {
            addCriterion("pidnumber is null");
            return (Criteria) this;
        }

        public Criteria andPidnumberIsNotNull() {
            addCriterion("pidnumber is not null");
            return (Criteria) this;
        }

        public Criteria andPidnumberEqualTo(String value) {
            addCriterion("pidnumber =", value, "pidnumber");
            return (Criteria) this;
        }

        public Criteria andPidnumberNotEqualTo(String value) {
            addCriterion("pidnumber <>", value, "pidnumber");
            return (Criteria) this;
        }

        public Criteria andPidnumberGreaterThan(String value) {
            addCriterion("pidnumber >", value, "pidnumber");
            return (Criteria) this;
        }

        public Criteria andPidnumberGreaterThanOrEqualTo(String value) {
            addCriterion("pidnumber >=", value, "pidnumber");
            return (Criteria) this;
        }

        public Criteria andPidnumberLessThan(String value) {
            addCriterion("pidnumber <", value, "pidnumber");
            return (Criteria) this;
        }

        public Criteria andPidnumberLessThanOrEqualTo(String value) {
            addCriterion("pidnumber <=", value, "pidnumber");
            return (Criteria) this;
        }

        public Criteria andPidnumberLike(String value) {
            addCriterion("pidnumber like", value, "pidnumber");
            return (Criteria) this;
        }

        public Criteria andPidnumberNotLike(String value) {
            addCriterion("pidnumber not like", value, "pidnumber");
            return (Criteria) this;
        }

        public Criteria andPidnumberIn(List<String> values) {
            addCriterion("pidnumber in", values, "pidnumber");
            return (Criteria) this;
        }

        public Criteria andPidnumberNotIn(List<String> values) {
            addCriterion("pidnumber not in", values, "pidnumber");
            return (Criteria) this;
        }

        public Criteria andPidnumberBetween(String value1, String value2) {
            addCriterion("pidnumber between", value1, value2, "pidnumber");
            return (Criteria) this;
        }

        public Criteria andPidnumberNotBetween(String value1, String value2) {
            addCriterion("pidnumber not between", value1, value2, "pidnumber");
            return (Criteria) this;
        }

        public Criteria andPaccountaddIsNull() {
            addCriterion("paccountadd is null");
            return (Criteria) this;
        }

        public Criteria andPaccountaddIsNotNull() {
            addCriterion("paccountadd is not null");
            return (Criteria) this;
        }

        public Criteria andPaccountaddEqualTo(String value) {
            addCriterion("paccountadd =", value, "paccountadd");
            return (Criteria) this;
        }

        public Criteria andPaccountaddNotEqualTo(String value) {
            addCriterion("paccountadd <>", value, "paccountadd");
            return (Criteria) this;
        }

        public Criteria andPaccountaddGreaterThan(String value) {
            addCriterion("paccountadd >", value, "paccountadd");
            return (Criteria) this;
        }

        public Criteria andPaccountaddGreaterThanOrEqualTo(String value) {
            addCriterion("paccountadd >=", value, "paccountadd");
            return (Criteria) this;
        }

        public Criteria andPaccountaddLessThan(String value) {
            addCriterion("paccountadd <", value, "paccountadd");
            return (Criteria) this;
        }

        public Criteria andPaccountaddLessThanOrEqualTo(String value) {
            addCriterion("paccountadd <=", value, "paccountadd");
            return (Criteria) this;
        }

        public Criteria andPaccountaddLike(String value) {
            addCriterion("paccountadd like", value, "paccountadd");
            return (Criteria) this;
        }

        public Criteria andPaccountaddNotLike(String value) {
            addCriterion("paccountadd not like", value, "paccountadd");
            return (Criteria) this;
        }

        public Criteria andPaccountaddIn(List<String> values) {
            addCriterion("paccountadd in", values, "paccountadd");
            return (Criteria) this;
        }

        public Criteria andPaccountaddNotIn(List<String> values) {
            addCriterion("paccountadd not in", values, "paccountadd");
            return (Criteria) this;
        }

        public Criteria andPaccountaddBetween(String value1, String value2) {
            addCriterion("paccountadd between", value1, value2, "paccountadd");
            return (Criteria) this;
        }

        public Criteria andPaccountaddNotBetween(String value1, String value2) {
            addCriterion("paccountadd not between", value1, value2, "paccountadd");
            return (Criteria) this;
        }

        public Criteria andPpostcodeIsNull() {
            addCriterion("ppostcode is null");
            return (Criteria) this;
        }

        public Criteria andPpostcodeIsNotNull() {
            addCriterion("ppostcode is not null");
            return (Criteria) this;
        }

        public Criteria andPpostcodeEqualTo(String value) {
            addCriterion("ppostcode =", value, "ppostcode");
            return (Criteria) this;
        }

        public Criteria andPpostcodeNotEqualTo(String value) {
            addCriterion("ppostcode <>", value, "ppostcode");
            return (Criteria) this;
        }

        public Criteria andPpostcodeGreaterThan(String value) {
            addCriterion("ppostcode >", value, "ppostcode");
            return (Criteria) this;
        }

        public Criteria andPpostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ppostcode >=", value, "ppostcode");
            return (Criteria) this;
        }

        public Criteria andPpostcodeLessThan(String value) {
            addCriterion("ppostcode <", value, "ppostcode");
            return (Criteria) this;
        }

        public Criteria andPpostcodeLessThanOrEqualTo(String value) {
            addCriterion("ppostcode <=", value, "ppostcode");
            return (Criteria) this;
        }

        public Criteria andPpostcodeLike(String value) {
            addCriterion("ppostcode like", value, "ppostcode");
            return (Criteria) this;
        }

        public Criteria andPpostcodeNotLike(String value) {
            addCriterion("ppostcode not like", value, "ppostcode");
            return (Criteria) this;
        }

        public Criteria andPpostcodeIn(List<String> values) {
            addCriterion("ppostcode in", values, "ppostcode");
            return (Criteria) this;
        }

        public Criteria andPpostcodeNotIn(List<String> values) {
            addCriterion("ppostcode not in", values, "ppostcode");
            return (Criteria) this;
        }

        public Criteria andPpostcodeBetween(String value1, String value2) {
            addCriterion("ppostcode between", value1, value2, "ppostcode");
            return (Criteria) this;
        }

        public Criteria andPpostcodeNotBetween(String value1, String value2) {
            addCriterion("ppostcode not between", value1, value2, "ppostcode");
            return (Criteria) this;
        }

        public Criteria andPphoneIsNull() {
            addCriterion("pphone is null");
            return (Criteria) this;
        }

        public Criteria andPphoneIsNotNull() {
            addCriterion("pphone is not null");
            return (Criteria) this;
        }

        public Criteria andPphoneEqualTo(String value) {
            addCriterion("pphone =", value, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneNotEqualTo(String value) {
            addCriterion("pphone <>", value, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneGreaterThan(String value) {
            addCriterion("pphone >", value, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneGreaterThanOrEqualTo(String value) {
            addCriterion("pphone >=", value, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneLessThan(String value) {
            addCriterion("pphone <", value, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneLessThanOrEqualTo(String value) {
            addCriterion("pphone <=", value, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneLike(String value) {
            addCriterion("pphone like", value, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneNotLike(String value) {
            addCriterion("pphone not like", value, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneIn(List<String> values) {
            addCriterion("pphone in", values, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneNotIn(List<String> values) {
            addCriterion("pphone not in", values, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneBetween(String value1, String value2) {
            addCriterion("pphone between", value1, value2, "pphone");
            return (Criteria) this;
        }

        public Criteria andPphoneNotBetween(String value1, String value2) {
            addCriterion("pphone not between", value1, value2, "pphone");
            return (Criteria) this;
        }

        public Criteria andPthisaddressIsNull() {
            addCriterion("pthisaddress is null");
            return (Criteria) this;
        }

        public Criteria andPthisaddressIsNotNull() {
            addCriterion("pthisaddress is not null");
            return (Criteria) this;
        }

        public Criteria andPthisaddressEqualTo(String value) {
            addCriterion("pthisaddress =", value, "pthisaddress");
            return (Criteria) this;
        }

        public Criteria andPthisaddressNotEqualTo(String value) {
            addCriterion("pthisaddress <>", value, "pthisaddress");
            return (Criteria) this;
        }

        public Criteria andPthisaddressGreaterThan(String value) {
            addCriterion("pthisaddress >", value, "pthisaddress");
            return (Criteria) this;
        }

        public Criteria andPthisaddressGreaterThanOrEqualTo(String value) {
            addCriterion("pthisaddress >=", value, "pthisaddress");
            return (Criteria) this;
        }

        public Criteria andPthisaddressLessThan(String value) {
            addCriterion("pthisaddress <", value, "pthisaddress");
            return (Criteria) this;
        }

        public Criteria andPthisaddressLessThanOrEqualTo(String value) {
            addCriterion("pthisaddress <=", value, "pthisaddress");
            return (Criteria) this;
        }

        public Criteria andPthisaddressLike(String value) {
            addCriterion("pthisaddress like", value, "pthisaddress");
            return (Criteria) this;
        }

        public Criteria andPthisaddressNotLike(String value) {
            addCriterion("pthisaddress not like", value, "pthisaddress");
            return (Criteria) this;
        }

        public Criteria andPthisaddressIn(List<String> values) {
            addCriterion("pthisaddress in", values, "pthisaddress");
            return (Criteria) this;
        }

        public Criteria andPthisaddressNotIn(List<String> values) {
            addCriterion("pthisaddress not in", values, "pthisaddress");
            return (Criteria) this;
        }

        public Criteria andPthisaddressBetween(String value1, String value2) {
            addCriterion("pthisaddress between", value1, value2, "pthisaddress");
            return (Criteria) this;
        }

        public Criteria andPthisaddressNotBetween(String value1, String value2) {
            addCriterion("pthisaddress not between", value1, value2, "pthisaddress");
            return (Criteria) this;
        }

        public Criteria andPtrialdateIsNull() {
            addCriterion("ptrialdate is null");
            return (Criteria) this;
        }

        public Criteria andPtrialdateIsNotNull() {
            addCriterion("ptrialdate is not null");
            return (Criteria) this;
        }

        public Criteria andPtrialdateEqualTo(Date value) {
            addCriterionForJDBCDate("ptrialdate =", value, "ptrialdate");
            return (Criteria) this;
        }

        public Criteria andPtrialdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ptrialdate <>", value, "ptrialdate");
            return (Criteria) this;
        }

        public Criteria andPtrialdateGreaterThan(Date value) {
            addCriterionForJDBCDate("ptrialdate >", value, "ptrialdate");
            return (Criteria) this;
        }

        public Criteria andPtrialdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ptrialdate >=", value, "ptrialdate");
            return (Criteria) this;
        }

        public Criteria andPtrialdateLessThan(Date value) {
            addCriterionForJDBCDate("ptrialdate <", value, "ptrialdate");
            return (Criteria) this;
        }

        public Criteria andPtrialdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ptrialdate <=", value, "ptrialdate");
            return (Criteria) this;
        }

        public Criteria andPtrialdateIn(List<Date> values) {
            addCriterionForJDBCDate("ptrialdate in", values, "ptrialdate");
            return (Criteria) this;
        }

        public Criteria andPtrialdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ptrialdate not in", values, "ptrialdate");
            return (Criteria) this;
        }

        public Criteria andPtrialdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ptrialdate between", value1, value2, "ptrialdate");
            return (Criteria) this;
        }

        public Criteria andPtrialdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ptrialdate not between", value1, value2, "ptrialdate");
            return (Criteria) this;
        }

        public Criteria andPentrydateIsNull() {
            addCriterion("pentrydate is null");
            return (Criteria) this;
        }

        public Criteria andPentrydateIsNotNull() {
            addCriterion("pentrydate is not null");
            return (Criteria) this;
        }

        public Criteria andPentrydateEqualTo(Date value) {
            addCriterionForJDBCDate("pentrydate =", value, "pentrydate");
            return (Criteria) this;
        }

        public Criteria andPentrydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pentrydate <>", value, "pentrydate");
            return (Criteria) this;
        }

        public Criteria andPentrydateGreaterThan(Date value) {
            addCriterionForJDBCDate("pentrydate >", value, "pentrydate");
            return (Criteria) this;
        }

        public Criteria andPentrydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pentrydate >=", value, "pentrydate");
            return (Criteria) this;
        }

        public Criteria andPentrydateLessThan(Date value) {
            addCriterionForJDBCDate("pentrydate <", value, "pentrydate");
            return (Criteria) this;
        }

        public Criteria andPentrydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pentrydate <=", value, "pentrydate");
            return (Criteria) this;
        }

        public Criteria andPentrydateIn(List<Date> values) {
            addCriterionForJDBCDate("pentrydate in", values, "pentrydate");
            return (Criteria) this;
        }

        public Criteria andPentrydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pentrydate not in", values, "pentrydate");
            return (Criteria) this;
        }

        public Criteria andPentrydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pentrydate between", value1, value2, "pentrydate");
            return (Criteria) this;
        }

        public Criteria andPentrydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pentrydate not between", value1, value2, "pentrydate");
            return (Criteria) this;
        }

        public Criteria andPbirthdateIsNull() {
            addCriterion("pbirthdate is null");
            return (Criteria) this;
        }

        public Criteria andPbirthdateIsNotNull() {
            addCriterion("pbirthdate is not null");
            return (Criteria) this;
        }

        public Criteria andPbirthdateEqualTo(Date value) {
            addCriterionForJDBCDate("pbirthdate =", value, "pbirthdate");
            return (Criteria) this;
        }

        public Criteria andPbirthdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pbirthdate <>", value, "pbirthdate");
            return (Criteria) this;
        }

        public Criteria andPbirthdateGreaterThan(Date value) {
            addCriterionForJDBCDate("pbirthdate >", value, "pbirthdate");
            return (Criteria) this;
        }

        public Criteria andPbirthdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pbirthdate >=", value, "pbirthdate");
            return (Criteria) this;
        }

        public Criteria andPbirthdateLessThan(Date value) {
            addCriterionForJDBCDate("pbirthdate <", value, "pbirthdate");
            return (Criteria) this;
        }

        public Criteria andPbirthdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pbirthdate <=", value, "pbirthdate");
            return (Criteria) this;
        }

        public Criteria andPbirthdateIn(List<Date> values) {
            addCriterionForJDBCDate("pbirthdate in", values, "pbirthdate");
            return (Criteria) this;
        }

        public Criteria andPbirthdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pbirthdate not in", values, "pbirthdate");
            return (Criteria) this;
        }

        public Criteria andPbirthdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pbirthdate between", value1, value2, "pbirthdate");
            return (Criteria) this;
        }

        public Criteria andPbirthdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pbirthdate not between", value1, value2, "pbirthdate");
            return (Criteria) this;
        }

        public Criteria andPbegindateIsNull() {
            addCriterion("pbegindate is null");
            return (Criteria) this;
        }

        public Criteria andPbegindateIsNotNull() {
            addCriterion("pbegindate is not null");
            return (Criteria) this;
        }

        public Criteria andPbegindateEqualTo(Date value) {
            addCriterionForJDBCDate("pbegindate =", value, "pbegindate");
            return (Criteria) this;
        }

        public Criteria andPbegindateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pbegindate <>", value, "pbegindate");
            return (Criteria) this;
        }

        public Criteria andPbegindateGreaterThan(Date value) {
            addCriterionForJDBCDate("pbegindate >", value, "pbegindate");
            return (Criteria) this;
        }

        public Criteria andPbegindateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pbegindate >=", value, "pbegindate");
            return (Criteria) this;
        }

        public Criteria andPbegindateLessThan(Date value) {
            addCriterionForJDBCDate("pbegindate <", value, "pbegindate");
            return (Criteria) this;
        }

        public Criteria andPbegindateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pbegindate <=", value, "pbegindate");
            return (Criteria) this;
        }

        public Criteria andPbegindateIn(List<Date> values) {
            addCriterionForJDBCDate("pbegindate in", values, "pbegindate");
            return (Criteria) this;
        }

        public Criteria andPbegindateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pbegindate not in", values, "pbegindate");
            return (Criteria) this;
        }

        public Criteria andPbegindateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pbegindate between", value1, value2, "pbegindate");
            return (Criteria) this;
        }

        public Criteria andPbegindateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pbegindate not between", value1, value2, "pbegindate");
            return (Criteria) this;
        }

        public Criteria andPoverdateIsNull() {
            addCriterion("poverdate is null");
            return (Criteria) this;
        }

        public Criteria andPoverdateIsNotNull() {
            addCriterion("poverdate is not null");
            return (Criteria) this;
        }

        public Criteria andPoverdateEqualTo(Date value) {
            addCriterionForJDBCDate("poverdate =", value, "poverdate");
            return (Criteria) this;
        }

        public Criteria andPoverdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("poverdate <>", value, "poverdate");
            return (Criteria) this;
        }

        public Criteria andPoverdateGreaterThan(Date value) {
            addCriterionForJDBCDate("poverdate >", value, "poverdate");
            return (Criteria) this;
        }

        public Criteria andPoverdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("poverdate >=", value, "poverdate");
            return (Criteria) this;
        }

        public Criteria andPoverdateLessThan(Date value) {
            addCriterionForJDBCDate("poverdate <", value, "poverdate");
            return (Criteria) this;
        }

        public Criteria andPoverdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("poverdate <=", value, "poverdate");
            return (Criteria) this;
        }

        public Criteria andPoverdateIn(List<Date> values) {
            addCriterionForJDBCDate("poverdate in", values, "poverdate");
            return (Criteria) this;
        }

        public Criteria andPoverdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("poverdate not in", values, "poverdate");
            return (Criteria) this;
        }

        public Criteria andPoverdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("poverdate between", value1, value2, "poverdate");
            return (Criteria) this;
        }

        public Criteria andPoverdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("poverdate not between", value1, value2, "poverdate");
            return (Criteria) this;
        }

        public Criteria andPbirthdayIsNull() {
            addCriterion("pbirthday is null");
            return (Criteria) this;
        }

        public Criteria andPbirthdayIsNotNull() {
            addCriterion("pbirthday is not null");
            return (Criteria) this;
        }

        public Criteria andPbirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("pbirthday =", value, "pbirthday");
            return (Criteria) this;
        }

        public Criteria andPbirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("pbirthday <>", value, "pbirthday");
            return (Criteria) this;
        }

        public Criteria andPbirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("pbirthday >", value, "pbirthday");
            return (Criteria) this;
        }

        public Criteria andPbirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pbirthday >=", value, "pbirthday");
            return (Criteria) this;
        }

        public Criteria andPbirthdayLessThan(Date value) {
            addCriterionForJDBCDate("pbirthday <", value, "pbirthday");
            return (Criteria) this;
        }

        public Criteria andPbirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pbirthday <=", value, "pbirthday");
            return (Criteria) this;
        }

        public Criteria andPbirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("pbirthday in", values, "pbirthday");
            return (Criteria) this;
        }

        public Criteria andPbirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("pbirthday not in", values, "pbirthday");
            return (Criteria) this;
        }

        public Criteria andPbirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pbirthday between", value1, value2, "pbirthday");
            return (Criteria) this;
        }

        public Criteria andPbirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pbirthday not between", value1, value2, "pbirthday");
            return (Criteria) this;
        }

        public Criteria andPageIsNull() {
            addCriterion("page is null");
            return (Criteria) this;
        }

        public Criteria andPageIsNotNull() {
            addCriterion("page is not null");
            return (Criteria) this;
        }

        public Criteria andPageEqualTo(Integer value) {
            addCriterion("page =", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotEqualTo(Integer value) {
            addCriterion("page <>", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageGreaterThan(Integer value) {
            addCriterion("page >", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageGreaterThanOrEqualTo(Integer value) {
            addCriterion("page >=", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageLessThan(Integer value) {
            addCriterion("page <", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageLessThanOrEqualTo(Integer value) {
            addCriterion("page <=", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageIn(List<Integer> values) {
            addCriterion("page in", values, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotIn(List<Integer> values) {
            addCriterion("page not in", values, "page");
            return (Criteria) this;
        }

        public Criteria andPageBetween(Integer value1, Integer value2) {
            addCriterion("page between", value1, value2, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotBetween(Integer value1, Integer value2) {
            addCriterion("page not between", value1, value2, "page");
            return (Criteria) this;
        }

        public Criteria andPuidIsNull() {
            addCriterion("puid is null");
            return (Criteria) this;
        }

        public Criteria andPuidIsNotNull() {
            addCriterion("puid is not null");
            return (Criteria) this;
        }

        public Criteria andPuidEqualTo(Integer value) {
            addCriterion("puid =", value, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidNotEqualTo(Integer value) {
            addCriterion("puid <>", value, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidGreaterThan(Integer value) {
            addCriterion("puid >", value, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("puid >=", value, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidLessThan(Integer value) {
            addCriterion("puid <", value, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidLessThanOrEqualTo(Integer value) {
            addCriterion("puid <=", value, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidIn(List<Integer> values) {
            addCriterion("puid in", values, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidNotIn(List<Integer> values) {
            addCriterion("puid not in", values, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidBetween(Integer value1, Integer value2) {
            addCriterion("puid between", value1, value2, "puid");
            return (Criteria) this;
        }

        public Criteria andPuidNotBetween(Integer value1, Integer value2) {
            addCriterion("puid not between", value1, value2, "puid");
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