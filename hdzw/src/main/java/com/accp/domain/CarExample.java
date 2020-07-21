package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarExample() {
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

        public Criteria andHidIsNull() {
            addCriterion("hid is null");
            return (Criteria) this;
        }

        public Criteria andHidIsNotNull() {
            addCriterion("hid is not null");
            return (Criteria) this;
        }

        public Criteria andHidEqualTo(Integer value) {
            addCriterion("hid =", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotEqualTo(Integer value) {
            addCriterion("hid <>", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThan(Integer value) {
            addCriterion("hid >", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hid >=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThan(Integer value) {
            addCriterion("hid <", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThanOrEqualTo(Integer value) {
            addCriterion("hid <=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidIn(List<Integer> values) {
            addCriterion("hid in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotIn(List<Integer> values) {
            addCriterion("hid not in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidBetween(Integer value1, Integer value2) {
            addCriterion("hid between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotBetween(Integer value1, Integer value2) {
            addCriterion("hid not between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andHlicensenoIsNull() {
            addCriterion("hlicenseno is null");
            return (Criteria) this;
        }

        public Criteria andHlicensenoIsNotNull() {
            addCriterion("hlicenseno is not null");
            return (Criteria) this;
        }

        public Criteria andHlicensenoEqualTo(String value) {
            addCriterion("hlicenseno =", value, "hlicenseno");
            return (Criteria) this;
        }

        public Criteria andHlicensenoNotEqualTo(String value) {
            addCriterion("hlicenseno <>", value, "hlicenseno");
            return (Criteria) this;
        }

        public Criteria andHlicensenoGreaterThan(String value) {
            addCriterion("hlicenseno >", value, "hlicenseno");
            return (Criteria) this;
        }

        public Criteria andHlicensenoGreaterThanOrEqualTo(String value) {
            addCriterion("hlicenseno >=", value, "hlicenseno");
            return (Criteria) this;
        }

        public Criteria andHlicensenoLessThan(String value) {
            addCriterion("hlicenseno <", value, "hlicenseno");
            return (Criteria) this;
        }

        public Criteria andHlicensenoLessThanOrEqualTo(String value) {
            addCriterion("hlicenseno <=", value, "hlicenseno");
            return (Criteria) this;
        }

        public Criteria andHlicensenoLike(String value) {
            addCriterion("hlicenseno like", value, "hlicenseno");
            return (Criteria) this;
        }

        public Criteria andHlicensenoNotLike(String value) {
            addCriterion("hlicenseno not like", value, "hlicenseno");
            return (Criteria) this;
        }

        public Criteria andHlicensenoIn(List<String> values) {
            addCriterion("hlicenseno in", values, "hlicenseno");
            return (Criteria) this;
        }

        public Criteria andHlicensenoNotIn(List<String> values) {
            addCriterion("hlicenseno not in", values, "hlicenseno");
            return (Criteria) this;
        }

        public Criteria andHlicensenoBetween(String value1, String value2) {
            addCriterion("hlicenseno between", value1, value2, "hlicenseno");
            return (Criteria) this;
        }

        public Criteria andHlicensenoNotBetween(String value1, String value2) {
            addCriterion("hlicenseno not between", value1, value2, "hlicenseno");
            return (Criteria) this;
        }

        public Criteria andHbrandidIsNull() {
            addCriterion("hbrandid is null");
            return (Criteria) this;
        }

        public Criteria andHbrandidIsNotNull() {
            addCriterion("hbrandid is not null");
            return (Criteria) this;
        }

        public Criteria andHbrandidEqualTo(Integer value) {
            addCriterion("hbrandid =", value, "hbrandid");
            return (Criteria) this;
        }

        public Criteria andHbrandidNotEqualTo(Integer value) {
            addCriterion("hbrandid <>", value, "hbrandid");
            return (Criteria) this;
        }

        public Criteria andHbrandidGreaterThan(Integer value) {
            addCriterion("hbrandid >", value, "hbrandid");
            return (Criteria) this;
        }

        public Criteria andHbrandidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hbrandid >=", value, "hbrandid");
            return (Criteria) this;
        }

        public Criteria andHbrandidLessThan(Integer value) {
            addCriterion("hbrandid <", value, "hbrandid");
            return (Criteria) this;
        }

        public Criteria andHbrandidLessThanOrEqualTo(Integer value) {
            addCriterion("hbrandid <=", value, "hbrandid");
            return (Criteria) this;
        }

        public Criteria andHbrandidIn(List<Integer> values) {
            addCriterion("hbrandid in", values, "hbrandid");
            return (Criteria) this;
        }

        public Criteria andHbrandidNotIn(List<Integer> values) {
            addCriterion("hbrandid not in", values, "hbrandid");
            return (Criteria) this;
        }

        public Criteria andHbrandidBetween(Integer value1, Integer value2) {
            addCriterion("hbrandid between", value1, value2, "hbrandid");
            return (Criteria) this;
        }

        public Criteria andHbrandidNotBetween(Integer value1, Integer value2) {
            addCriterion("hbrandid not between", value1, value2, "hbrandid");
            return (Criteria) this;
        }

        public Criteria andHtypeidIsNull() {
            addCriterion("htypeid is null");
            return (Criteria) this;
        }

        public Criteria andHtypeidIsNotNull() {
            addCriterion("htypeid is not null");
            return (Criteria) this;
        }

        public Criteria andHtypeidEqualTo(Integer value) {
            addCriterion("htypeid =", value, "htypeid");
            return (Criteria) this;
        }

        public Criteria andHtypeidNotEqualTo(Integer value) {
            addCriterion("htypeid <>", value, "htypeid");
            return (Criteria) this;
        }

        public Criteria andHtypeidGreaterThan(Integer value) {
            addCriterion("htypeid >", value, "htypeid");
            return (Criteria) this;
        }

        public Criteria andHtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("htypeid >=", value, "htypeid");
            return (Criteria) this;
        }

        public Criteria andHtypeidLessThan(Integer value) {
            addCriterion("htypeid <", value, "htypeid");
            return (Criteria) this;
        }

        public Criteria andHtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("htypeid <=", value, "htypeid");
            return (Criteria) this;
        }

        public Criteria andHtypeidIn(List<Integer> values) {
            addCriterion("htypeid in", values, "htypeid");
            return (Criteria) this;
        }

        public Criteria andHtypeidNotIn(List<Integer> values) {
            addCriterion("htypeid not in", values, "htypeid");
            return (Criteria) this;
        }

        public Criteria andHtypeidBetween(Integer value1, Integer value2) {
            addCriterion("htypeid between", value1, value2, "htypeid");
            return (Criteria) this;
        }

        public Criteria andHtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("htypeid not between", value1, value2, "htypeid");
            return (Criteria) this;
        }

        public Criteria andHdriveridIsNull() {
            addCriterion("hdriverid is null");
            return (Criteria) this;
        }

        public Criteria andHdriveridIsNotNull() {
            addCriterion("hdriverid is not null");
            return (Criteria) this;
        }

        public Criteria andHdriveridEqualTo(Integer value) {
            addCriterion("hdriverid =", value, "hdriverid");
            return (Criteria) this;
        }

        public Criteria andHdriveridNotEqualTo(Integer value) {
            addCriterion("hdriverid <>", value, "hdriverid");
            return (Criteria) this;
        }

        public Criteria andHdriveridGreaterThan(Integer value) {
            addCriterion("hdriverid >", value, "hdriverid");
            return (Criteria) this;
        }

        public Criteria andHdriveridGreaterThanOrEqualTo(Integer value) {
            addCriterion("hdriverid >=", value, "hdriverid");
            return (Criteria) this;
        }

        public Criteria andHdriveridLessThan(Integer value) {
            addCriterion("hdriverid <", value, "hdriverid");
            return (Criteria) this;
        }

        public Criteria andHdriveridLessThanOrEqualTo(Integer value) {
            addCriterion("hdriverid <=", value, "hdriverid");
            return (Criteria) this;
        }

        public Criteria andHdriveridIn(List<Integer> values) {
            addCriterion("hdriverid in", values, "hdriverid");
            return (Criteria) this;
        }

        public Criteria andHdriveridNotIn(List<Integer> values) {
            addCriterion("hdriverid not in", values, "hdriverid");
            return (Criteria) this;
        }

        public Criteria andHdriveridBetween(Integer value1, Integer value2) {
            addCriterion("hdriverid between", value1, value2, "hdriverid");
            return (Criteria) this;
        }

        public Criteria andHdriveridNotBetween(Integer value1, Integer value2) {
            addCriterion("hdriverid not between", value1, value2, "hdriverid");
            return (Criteria) this;
        }

        public Criteria andHvehicleownershipIsNull() {
            addCriterion("hvehicleownership is null");
            return (Criteria) this;
        }

        public Criteria andHvehicleownershipIsNotNull() {
            addCriterion("hvehicleownership is not null");
            return (Criteria) this;
        }

        public Criteria andHvehicleownershipEqualTo(Integer value) {
            addCriterion("hvehicleownership =", value, "hvehicleownership");
            return (Criteria) this;
        }

        public Criteria andHvehicleownershipNotEqualTo(Integer value) {
            addCriterion("hvehicleownership <>", value, "hvehicleownership");
            return (Criteria) this;
        }

        public Criteria andHvehicleownershipGreaterThan(Integer value) {
            addCriterion("hvehicleownership >", value, "hvehicleownership");
            return (Criteria) this;
        }

        public Criteria andHvehicleownershipGreaterThanOrEqualTo(Integer value) {
            addCriterion("hvehicleownership >=", value, "hvehicleownership");
            return (Criteria) this;
        }

        public Criteria andHvehicleownershipLessThan(Integer value) {
            addCriterion("hvehicleownership <", value, "hvehicleownership");
            return (Criteria) this;
        }

        public Criteria andHvehicleownershipLessThanOrEqualTo(Integer value) {
            addCriterion("hvehicleownership <=", value, "hvehicleownership");
            return (Criteria) this;
        }

        public Criteria andHvehicleownershipIn(List<Integer> values) {
            addCriterion("hvehicleownership in", values, "hvehicleownership");
            return (Criteria) this;
        }

        public Criteria andHvehicleownershipNotIn(List<Integer> values) {
            addCriterion("hvehicleownership not in", values, "hvehicleownership");
            return (Criteria) this;
        }

        public Criteria andHvehicleownershipBetween(Integer value1, Integer value2) {
            addCriterion("hvehicleownership between", value1, value2, "hvehicleownership");
            return (Criteria) this;
        }

        public Criteria andHvehicleownershipNotBetween(Integer value1, Integer value2) {
            addCriterion("hvehicleownership not between", value1, value2, "hvehicleownership");
            return (Criteria) this;
        }

        public Criteria andHvinIsNull() {
            addCriterion("hvin is null");
            return (Criteria) this;
        }

        public Criteria andHvinIsNotNull() {
            addCriterion("hvin is not null");
            return (Criteria) this;
        }

        public Criteria andHvinEqualTo(String value) {
            addCriterion("hvin =", value, "hvin");
            return (Criteria) this;
        }

        public Criteria andHvinNotEqualTo(String value) {
            addCriterion("hvin <>", value, "hvin");
            return (Criteria) this;
        }

        public Criteria andHvinGreaterThan(String value) {
            addCriterion("hvin >", value, "hvin");
            return (Criteria) this;
        }

        public Criteria andHvinGreaterThanOrEqualTo(String value) {
            addCriterion("hvin >=", value, "hvin");
            return (Criteria) this;
        }

        public Criteria andHvinLessThan(String value) {
            addCriterion("hvin <", value, "hvin");
            return (Criteria) this;
        }

        public Criteria andHvinLessThanOrEqualTo(String value) {
            addCriterion("hvin <=", value, "hvin");
            return (Criteria) this;
        }

        public Criteria andHvinLike(String value) {
            addCriterion("hvin like", value, "hvin");
            return (Criteria) this;
        }

        public Criteria andHvinNotLike(String value) {
            addCriterion("hvin not like", value, "hvin");
            return (Criteria) this;
        }

        public Criteria andHvinIn(List<String> values) {
            addCriterion("hvin in", values, "hvin");
            return (Criteria) this;
        }

        public Criteria andHvinNotIn(List<String> values) {
            addCriterion("hvin not in", values, "hvin");
            return (Criteria) this;
        }

        public Criteria andHvinBetween(String value1, String value2) {
            addCriterion("hvin between", value1, value2, "hvin");
            return (Criteria) this;
        }

        public Criteria andHvinNotBetween(String value1, String value2) {
            addCriterion("hvin not between", value1, value2, "hvin");
            return (Criteria) this;
        }

        public Criteria andHengineidIsNull() {
            addCriterion("hengineid is null");
            return (Criteria) this;
        }

        public Criteria andHengineidIsNotNull() {
            addCriterion("hengineid is not null");
            return (Criteria) this;
        }

        public Criteria andHengineidEqualTo(Integer value) {
            addCriterion("hengineid =", value, "hengineid");
            return (Criteria) this;
        }

        public Criteria andHengineidNotEqualTo(Integer value) {
            addCriterion("hengineid <>", value, "hengineid");
            return (Criteria) this;
        }

        public Criteria andHengineidGreaterThan(Integer value) {
            addCriterion("hengineid >", value, "hengineid");
            return (Criteria) this;
        }

        public Criteria andHengineidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hengineid >=", value, "hengineid");
            return (Criteria) this;
        }

        public Criteria andHengineidLessThan(Integer value) {
            addCriterion("hengineid <", value, "hengineid");
            return (Criteria) this;
        }

        public Criteria andHengineidLessThanOrEqualTo(Integer value) {
            addCriterion("hengineid <=", value, "hengineid");
            return (Criteria) this;
        }

        public Criteria andHengineidIn(List<Integer> values) {
            addCriterion("hengineid in", values, "hengineid");
            return (Criteria) this;
        }

        public Criteria andHengineidNotIn(List<Integer> values) {
            addCriterion("hengineid not in", values, "hengineid");
            return (Criteria) this;
        }

        public Criteria andHengineidBetween(Integer value1, Integer value2) {
            addCriterion("hengineid between", value1, value2, "hengineid");
            return (Criteria) this;
        }

        public Criteria andHengineidNotBetween(Integer value1, Integer value2) {
            addCriterion("hengineid not between", value1, value2, "hengineid");
            return (Criteria) this;
        }

        public Criteria andHenginenoIsNull() {
            addCriterion("hengineno is null");
            return (Criteria) this;
        }

        public Criteria andHenginenoIsNotNull() {
            addCriterion("hengineno is not null");
            return (Criteria) this;
        }

        public Criteria andHenginenoEqualTo(String value) {
            addCriterion("hengineno =", value, "hengineno");
            return (Criteria) this;
        }

        public Criteria andHenginenoNotEqualTo(String value) {
            addCriterion("hengineno <>", value, "hengineno");
            return (Criteria) this;
        }

        public Criteria andHenginenoGreaterThan(String value) {
            addCriterion("hengineno >", value, "hengineno");
            return (Criteria) this;
        }

        public Criteria andHenginenoGreaterThanOrEqualTo(String value) {
            addCriterion("hengineno >=", value, "hengineno");
            return (Criteria) this;
        }

        public Criteria andHenginenoLessThan(String value) {
            addCriterion("hengineno <", value, "hengineno");
            return (Criteria) this;
        }

        public Criteria andHenginenoLessThanOrEqualTo(String value) {
            addCriterion("hengineno <=", value, "hengineno");
            return (Criteria) this;
        }

        public Criteria andHenginenoLike(String value) {
            addCriterion("hengineno like", value, "hengineno");
            return (Criteria) this;
        }

        public Criteria andHenginenoNotLike(String value) {
            addCriterion("hengineno not like", value, "hengineno");
            return (Criteria) this;
        }

        public Criteria andHenginenoIn(List<String> values) {
            addCriterion("hengineno in", values, "hengineno");
            return (Criteria) this;
        }

        public Criteria andHenginenoNotIn(List<String> values) {
            addCriterion("hengineno not in", values, "hengineno");
            return (Criteria) this;
        }

        public Criteria andHenginenoBetween(String value1, String value2) {
            addCriterion("hengineno between", value1, value2, "hengineno");
            return (Criteria) this;
        }

        public Criteria andHenginenoNotBetween(String value1, String value2) {
            addCriterion("hengineno not between", value1, value2, "hengineno");
            return (Criteria) this;
        }

        public Criteria andHcarmjIsNull() {
            addCriterion("hcarmj is null");
            return (Criteria) this;
        }

        public Criteria andHcarmjIsNotNull() {
            addCriterion("hcarmj is not null");
            return (Criteria) this;
        }

        public Criteria andHcarmjEqualTo(Float value) {
            addCriterion("hcarmj =", value, "hcarmj");
            return (Criteria) this;
        }

        public Criteria andHcarmjNotEqualTo(Float value) {
            addCriterion("hcarmj <>", value, "hcarmj");
            return (Criteria) this;
        }

        public Criteria andHcarmjGreaterThan(Float value) {
            addCriterion("hcarmj >", value, "hcarmj");
            return (Criteria) this;
        }

        public Criteria andHcarmjGreaterThanOrEqualTo(Float value) {
            addCriterion("hcarmj >=", value, "hcarmj");
            return (Criteria) this;
        }

        public Criteria andHcarmjLessThan(Float value) {
            addCriterion("hcarmj <", value, "hcarmj");
            return (Criteria) this;
        }

        public Criteria andHcarmjLessThanOrEqualTo(Float value) {
            addCriterion("hcarmj <=", value, "hcarmj");
            return (Criteria) this;
        }

        public Criteria andHcarmjIn(List<Float> values) {
            addCriterion("hcarmj in", values, "hcarmj");
            return (Criteria) this;
        }

        public Criteria andHcarmjNotIn(List<Float> values) {
            addCriterion("hcarmj not in", values, "hcarmj");
            return (Criteria) this;
        }

        public Criteria andHcarmjBetween(Float value1, Float value2) {
            addCriterion("hcarmj between", value1, value2, "hcarmj");
            return (Criteria) this;
        }

        public Criteria andHcarmjNotBetween(Float value1, Float value2) {
            addCriterion("hcarmj not between", value1, value2, "hcarmj");
            return (Criteria) this;
        }

        public Criteria andHmileageIsNull() {
            addCriterion("hmileage is null");
            return (Criteria) this;
        }

        public Criteria andHmileageIsNotNull() {
            addCriterion("hmileage is not null");
            return (Criteria) this;
        }

        public Criteria andHmileageEqualTo(Integer value) {
            addCriterion("hmileage =", value, "hmileage");
            return (Criteria) this;
        }

        public Criteria andHmileageNotEqualTo(Integer value) {
            addCriterion("hmileage <>", value, "hmileage");
            return (Criteria) this;
        }

        public Criteria andHmileageGreaterThan(Integer value) {
            addCriterion("hmileage >", value, "hmileage");
            return (Criteria) this;
        }

        public Criteria andHmileageGreaterThanOrEqualTo(Integer value) {
            addCriterion("hmileage >=", value, "hmileage");
            return (Criteria) this;
        }

        public Criteria andHmileageLessThan(Integer value) {
            addCriterion("hmileage <", value, "hmileage");
            return (Criteria) this;
        }

        public Criteria andHmileageLessThanOrEqualTo(Integer value) {
            addCriterion("hmileage <=", value, "hmileage");
            return (Criteria) this;
        }

        public Criteria andHmileageIn(List<Integer> values) {
            addCriterion("hmileage in", values, "hmileage");
            return (Criteria) this;
        }

        public Criteria andHmileageNotIn(List<Integer> values) {
            addCriterion("hmileage not in", values, "hmileage");
            return (Criteria) this;
        }

        public Criteria andHmileageBetween(Integer value1, Integer value2) {
            addCriterion("hmileage between", value1, value2, "hmileage");
            return (Criteria) this;
        }

        public Criteria andHmileageNotBetween(Integer value1, Integer value2) {
            addCriterion("hmileage not between", value1, value2, "hmileage");
            return (Criteria) this;
        }

        public Criteria andHcarseriesIsNull() {
            addCriterion("hcarseries is null");
            return (Criteria) this;
        }

        public Criteria andHcarseriesIsNotNull() {
            addCriterion("hcarseries is not null");
            return (Criteria) this;
        }

        public Criteria andHcarseriesEqualTo(String value) {
            addCriterion("hcarseries =", value, "hcarseries");
            return (Criteria) this;
        }

        public Criteria andHcarseriesNotEqualTo(String value) {
            addCriterion("hcarseries <>", value, "hcarseries");
            return (Criteria) this;
        }

        public Criteria andHcarseriesGreaterThan(String value) {
            addCriterion("hcarseries >", value, "hcarseries");
            return (Criteria) this;
        }

        public Criteria andHcarseriesGreaterThanOrEqualTo(String value) {
            addCriterion("hcarseries >=", value, "hcarseries");
            return (Criteria) this;
        }

        public Criteria andHcarseriesLessThan(String value) {
            addCriterion("hcarseries <", value, "hcarseries");
            return (Criteria) this;
        }

        public Criteria andHcarseriesLessThanOrEqualTo(String value) {
            addCriterion("hcarseries <=", value, "hcarseries");
            return (Criteria) this;
        }

        public Criteria andHcarseriesLike(String value) {
            addCriterion("hcarseries like", value, "hcarseries");
            return (Criteria) this;
        }

        public Criteria andHcarseriesNotLike(String value) {
            addCriterion("hcarseries not like", value, "hcarseries");
            return (Criteria) this;
        }

        public Criteria andHcarseriesIn(List<String> values) {
            addCriterion("hcarseries in", values, "hcarseries");
            return (Criteria) this;
        }

        public Criteria andHcarseriesNotIn(List<String> values) {
            addCriterion("hcarseries not in", values, "hcarseries");
            return (Criteria) this;
        }

        public Criteria andHcarseriesBetween(String value1, String value2) {
            addCriterion("hcarseries between", value1, value2, "hcarseries");
            return (Criteria) this;
        }

        public Criteria andHcarseriesNotBetween(String value1, String value2) {
            addCriterion("hcarseries not between", value1, value2, "hcarseries");
            return (Criteria) this;
        }

        public Criteria andHbuydateIsNull() {
            addCriterion("hbuydate is null");
            return (Criteria) this;
        }

        public Criteria andHbuydateIsNotNull() {
            addCriterion("hbuydate is not null");
            return (Criteria) this;
        }

        public Criteria andHbuydateEqualTo(Date value) {
            addCriterionForJDBCDate("hbuydate =", value, "hbuydate");
            return (Criteria) this;
        }

        public Criteria andHbuydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("hbuydate <>", value, "hbuydate");
            return (Criteria) this;
        }

        public Criteria andHbuydateGreaterThan(Date value) {
            addCriterionForJDBCDate("hbuydate >", value, "hbuydate");
            return (Criteria) this;
        }

        public Criteria andHbuydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hbuydate >=", value, "hbuydate");
            return (Criteria) this;
        }

        public Criteria andHbuydateLessThan(Date value) {
            addCriterionForJDBCDate("hbuydate <", value, "hbuydate");
            return (Criteria) this;
        }

        public Criteria andHbuydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hbuydate <=", value, "hbuydate");
            return (Criteria) this;
        }

        public Criteria andHbuydateIn(List<Date> values) {
            addCriterionForJDBCDate("hbuydate in", values, "hbuydate");
            return (Criteria) this;
        }

        public Criteria andHbuydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("hbuydate not in", values, "hbuydate");
            return (Criteria) this;
        }

        public Criteria andHbuydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hbuydate between", value1, value2, "hbuydate");
            return (Criteria) this;
        }

        public Criteria andHbuydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hbuydate not between", value1, value2, "hbuydate");
            return (Criteria) this;
        }

        public Criteria andHbldateIsNull() {
            addCriterion("hbldate is null");
            return (Criteria) this;
        }

        public Criteria andHbldateIsNotNull() {
            addCriterion("hbldate is not null");
            return (Criteria) this;
        }

        public Criteria andHbldateEqualTo(Date value) {
            addCriterionForJDBCDate("hbldate =", value, "hbldate");
            return (Criteria) this;
        }

        public Criteria andHbldateNotEqualTo(Date value) {
            addCriterionForJDBCDate("hbldate <>", value, "hbldate");
            return (Criteria) this;
        }

        public Criteria andHbldateGreaterThan(Date value) {
            addCriterionForJDBCDate("hbldate >", value, "hbldate");
            return (Criteria) this;
        }

        public Criteria andHbldateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hbldate >=", value, "hbldate");
            return (Criteria) this;
        }

        public Criteria andHbldateLessThan(Date value) {
            addCriterionForJDBCDate("hbldate <", value, "hbldate");
            return (Criteria) this;
        }

        public Criteria andHbldateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hbldate <=", value, "hbldate");
            return (Criteria) this;
        }

        public Criteria andHbldateIn(List<Date> values) {
            addCriterionForJDBCDate("hbldate in", values, "hbldate");
            return (Criteria) this;
        }

        public Criteria andHbldateNotIn(List<Date> values) {
            addCriterionForJDBCDate("hbldate not in", values, "hbldate");
            return (Criteria) this;
        }

        public Criteria andHbldateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hbldate between", value1, value2, "hbldate");
            return (Criteria) this;
        }

        public Criteria andHbldateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hbldate not between", value1, value2, "hbldate");
            return (Criteria) this;
        }

        public Criteria andHsoidateIsNull() {
            addCriterion("hsoidate is null");
            return (Criteria) this;
        }

        public Criteria andHsoidateIsNotNull() {
            addCriterion("hsoidate is not null");
            return (Criteria) this;
        }

        public Criteria andHsoidateEqualTo(Date value) {
            addCriterionForJDBCDate("hsoidate =", value, "hsoidate");
            return (Criteria) this;
        }

        public Criteria andHsoidateNotEqualTo(Date value) {
            addCriterionForJDBCDate("hsoidate <>", value, "hsoidate");
            return (Criteria) this;
        }

        public Criteria andHsoidateGreaterThan(Date value) {
            addCriterionForJDBCDate("hsoidate >", value, "hsoidate");
            return (Criteria) this;
        }

        public Criteria andHsoidateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hsoidate >=", value, "hsoidate");
            return (Criteria) this;
        }

        public Criteria andHsoidateLessThan(Date value) {
            addCriterionForJDBCDate("hsoidate <", value, "hsoidate");
            return (Criteria) this;
        }

        public Criteria andHsoidateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hsoidate <=", value, "hsoidate");
            return (Criteria) this;
        }

        public Criteria andHsoidateIn(List<Date> values) {
            addCriterionForJDBCDate("hsoidate in", values, "hsoidate");
            return (Criteria) this;
        }

        public Criteria andHsoidateNotIn(List<Date> values) {
            addCriterionForJDBCDate("hsoidate not in", values, "hsoidate");
            return (Criteria) this;
        }

        public Criteria andHsoidateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hsoidate between", value1, value2, "hsoidate");
            return (Criteria) this;
        }

        public Criteria andHsoidateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hsoidate not between", value1, value2, "hsoidate");
            return (Criteria) this;
        }

        public Criteria andHjqxicbcIsNull() {
            addCriterion("hjqxicbc is null");
            return (Criteria) this;
        }

        public Criteria andHjqxicbcIsNotNull() {
            addCriterion("hjqxicbc is not null");
            return (Criteria) this;
        }

        public Criteria andHjqxicbcEqualTo(Integer value) {
            addCriterion("hjqxicbc =", value, "hjqxicbc");
            return (Criteria) this;
        }

        public Criteria andHjqxicbcNotEqualTo(Integer value) {
            addCriterion("hjqxicbc <>", value, "hjqxicbc");
            return (Criteria) this;
        }

        public Criteria andHjqxicbcGreaterThan(Integer value) {
            addCriterion("hjqxicbc >", value, "hjqxicbc");
            return (Criteria) this;
        }

        public Criteria andHjqxicbcGreaterThanOrEqualTo(Integer value) {
            addCriterion("hjqxicbc >=", value, "hjqxicbc");
            return (Criteria) this;
        }

        public Criteria andHjqxicbcLessThan(Integer value) {
            addCriterion("hjqxicbc <", value, "hjqxicbc");
            return (Criteria) this;
        }

        public Criteria andHjqxicbcLessThanOrEqualTo(Integer value) {
            addCriterion("hjqxicbc <=", value, "hjqxicbc");
            return (Criteria) this;
        }

        public Criteria andHjqxicbcIn(List<Integer> values) {
            addCriterion("hjqxicbc in", values, "hjqxicbc");
            return (Criteria) this;
        }

        public Criteria andHjqxicbcNotIn(List<Integer> values) {
            addCriterion("hjqxicbc not in", values, "hjqxicbc");
            return (Criteria) this;
        }

        public Criteria andHjqxicbcBetween(Integer value1, Integer value2) {
            addCriterion("hjqxicbc between", value1, value2, "hjqxicbc");
            return (Criteria) this;
        }

        public Criteria andHjqxicbcNotBetween(Integer value1, Integer value2) {
            addCriterion("hjqxicbc not between", value1, value2, "hjqxicbc");
            return (Criteria) this;
        }

        public Criteria andHjqxexpireIsNull() {
            addCriterion("hjqxexpire is null");
            return (Criteria) this;
        }

        public Criteria andHjqxexpireIsNotNull() {
            addCriterion("hjqxexpire is not null");
            return (Criteria) this;
        }

        public Criteria andHjqxexpireEqualTo(Date value) {
            addCriterionForJDBCDate("hjqxexpire =", value, "hjqxexpire");
            return (Criteria) this;
        }

        public Criteria andHjqxexpireNotEqualTo(Date value) {
            addCriterionForJDBCDate("hjqxexpire <>", value, "hjqxexpire");
            return (Criteria) this;
        }

        public Criteria andHjqxexpireGreaterThan(Date value) {
            addCriterionForJDBCDate("hjqxexpire >", value, "hjqxexpire");
            return (Criteria) this;
        }

        public Criteria andHjqxexpireGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hjqxexpire >=", value, "hjqxexpire");
            return (Criteria) this;
        }

        public Criteria andHjqxexpireLessThan(Date value) {
            addCriterionForJDBCDate("hjqxexpire <", value, "hjqxexpire");
            return (Criteria) this;
        }

        public Criteria andHjqxexpireLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hjqxexpire <=", value, "hjqxexpire");
            return (Criteria) this;
        }

        public Criteria andHjqxexpireIn(List<Date> values) {
            addCriterionForJDBCDate("hjqxexpire in", values, "hjqxexpire");
            return (Criteria) this;
        }

        public Criteria andHjqxexpireNotIn(List<Date> values) {
            addCriterionForJDBCDate("hjqxexpire not in", values, "hjqxexpire");
            return (Criteria) this;
        }

        public Criteria andHjqxexpireBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hjqxexpire between", value1, value2, "hjqxexpire");
            return (Criteria) this;
        }

        public Criteria andHjqxexpireNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hjqxexpire not between", value1, value2, "hjqxexpire");
            return (Criteria) this;
        }

        public Criteria andHsyxicbcIsNull() {
            addCriterion("hsyxicbc is null");
            return (Criteria) this;
        }

        public Criteria andHsyxicbcIsNotNull() {
            addCriterion("hsyxicbc is not null");
            return (Criteria) this;
        }

        public Criteria andHsyxicbcEqualTo(Integer value) {
            addCriterion("hsyxicbc =", value, "hsyxicbc");
            return (Criteria) this;
        }

        public Criteria andHsyxicbcNotEqualTo(Integer value) {
            addCriterion("hsyxicbc <>", value, "hsyxicbc");
            return (Criteria) this;
        }

        public Criteria andHsyxicbcGreaterThan(Integer value) {
            addCriterion("hsyxicbc >", value, "hsyxicbc");
            return (Criteria) this;
        }

        public Criteria andHsyxicbcGreaterThanOrEqualTo(Integer value) {
            addCriterion("hsyxicbc >=", value, "hsyxicbc");
            return (Criteria) this;
        }

        public Criteria andHsyxicbcLessThan(Integer value) {
            addCriterion("hsyxicbc <", value, "hsyxicbc");
            return (Criteria) this;
        }

        public Criteria andHsyxicbcLessThanOrEqualTo(Integer value) {
            addCriterion("hsyxicbc <=", value, "hsyxicbc");
            return (Criteria) this;
        }

        public Criteria andHsyxicbcIn(List<Integer> values) {
            addCriterion("hsyxicbc in", values, "hsyxicbc");
            return (Criteria) this;
        }

        public Criteria andHsyxicbcNotIn(List<Integer> values) {
            addCriterion("hsyxicbc not in", values, "hsyxicbc");
            return (Criteria) this;
        }

        public Criteria andHsyxicbcBetween(Integer value1, Integer value2) {
            addCriterion("hsyxicbc between", value1, value2, "hsyxicbc");
            return (Criteria) this;
        }

        public Criteria andHsyxicbcNotBetween(Integer value1, Integer value2) {
            addCriterion("hsyxicbc not between", value1, value2, "hsyxicbc");
            return (Criteria) this;
        }

        public Criteria andHsyxlastdateIsNull() {
            addCriterion("hsyxlastdate is null");
            return (Criteria) this;
        }

        public Criteria andHsyxlastdateIsNotNull() {
            addCriterion("hsyxlastdate is not null");
            return (Criteria) this;
        }

        public Criteria andHsyxlastdateEqualTo(Date value) {
            addCriterionForJDBCDate("hsyxlastdate =", value, "hsyxlastdate");
            return (Criteria) this;
        }

        public Criteria andHsyxlastdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("hsyxlastdate <>", value, "hsyxlastdate");
            return (Criteria) this;
        }

        public Criteria andHsyxlastdateGreaterThan(Date value) {
            addCriterionForJDBCDate("hsyxlastdate >", value, "hsyxlastdate");
            return (Criteria) this;
        }

        public Criteria andHsyxlastdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hsyxlastdate >=", value, "hsyxlastdate");
            return (Criteria) this;
        }

        public Criteria andHsyxlastdateLessThan(Date value) {
            addCriterionForJDBCDate("hsyxlastdate <", value, "hsyxlastdate");
            return (Criteria) this;
        }

        public Criteria andHsyxlastdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hsyxlastdate <=", value, "hsyxlastdate");
            return (Criteria) this;
        }

        public Criteria andHsyxlastdateIn(List<Date> values) {
            addCriterionForJDBCDate("hsyxlastdate in", values, "hsyxlastdate");
            return (Criteria) this;
        }

        public Criteria andHsyxlastdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("hsyxlastdate not in", values, "hsyxlastdate");
            return (Criteria) this;
        }

        public Criteria andHsyxlastdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hsyxlastdate between", value1, value2, "hsyxlastdate");
            return (Criteria) this;
        }

        public Criteria andHsyxlastdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hsyxlastdate not between", value1, value2, "hsyxlastdate");
            return (Criteria) this;
        }

        public Criteria andHicarIsNull() {
            addCriterion("hicar is null");
            return (Criteria) this;
        }

        public Criteria andHicarIsNotNull() {
            addCriterion("hicar is not null");
            return (Criteria) this;
        }

        public Criteria andHicarEqualTo(Integer value) {
            addCriterion("hicar =", value, "hicar");
            return (Criteria) this;
        }

        public Criteria andHicarNotEqualTo(Integer value) {
            addCriterion("hicar <>", value, "hicar");
            return (Criteria) this;
        }

        public Criteria andHicarGreaterThan(Integer value) {
            addCriterion("hicar >", value, "hicar");
            return (Criteria) this;
        }

        public Criteria andHicarGreaterThanOrEqualTo(Integer value) {
            addCriterion("hicar >=", value, "hicar");
            return (Criteria) this;
        }

        public Criteria andHicarLessThan(Integer value) {
            addCriterion("hicar <", value, "hicar");
            return (Criteria) this;
        }

        public Criteria andHicarLessThanOrEqualTo(Integer value) {
            addCriterion("hicar <=", value, "hicar");
            return (Criteria) this;
        }

        public Criteria andHicarIn(List<Integer> values) {
            addCriterion("hicar in", values, "hicar");
            return (Criteria) this;
        }

        public Criteria andHicarNotIn(List<Integer> values) {
            addCriterion("hicar not in", values, "hicar");
            return (Criteria) this;
        }

        public Criteria andHicarBetween(Integer value1, Integer value2) {
            addCriterion("hicar between", value1, value2, "hicar");
            return (Criteria) this;
        }

        public Criteria andHicarNotBetween(Integer value1, Integer value2) {
            addCriterion("hicar not between", value1, value2, "hicar");
            return (Criteria) this;
        }

        public Criteria andHfueltypeIsNull() {
            addCriterion("hfueltype is null");
            return (Criteria) this;
        }

        public Criteria andHfueltypeIsNotNull() {
            addCriterion("hfueltype is not null");
            return (Criteria) this;
        }

        public Criteria andHfueltypeEqualTo(Integer value) {
            addCriterion("hfueltype =", value, "hfueltype");
            return (Criteria) this;
        }

        public Criteria andHfueltypeNotEqualTo(Integer value) {
            addCriterion("hfueltype <>", value, "hfueltype");
            return (Criteria) this;
        }

        public Criteria andHfueltypeGreaterThan(Integer value) {
            addCriterion("hfueltype >", value, "hfueltype");
            return (Criteria) this;
        }

        public Criteria andHfueltypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("hfueltype >=", value, "hfueltype");
            return (Criteria) this;
        }

        public Criteria andHfueltypeLessThan(Integer value) {
            addCriterion("hfueltype <", value, "hfueltype");
            return (Criteria) this;
        }

        public Criteria andHfueltypeLessThanOrEqualTo(Integer value) {
            addCriterion("hfueltype <=", value, "hfueltype");
            return (Criteria) this;
        }

        public Criteria andHfueltypeIn(List<Integer> values) {
            addCriterion("hfueltype in", values, "hfueltype");
            return (Criteria) this;
        }

        public Criteria andHfueltypeNotIn(List<Integer> values) {
            addCriterion("hfueltype not in", values, "hfueltype");
            return (Criteria) this;
        }

        public Criteria andHfueltypeBetween(Integer value1, Integer value2) {
            addCriterion("hfueltype between", value1, value2, "hfueltype");
            return (Criteria) this;
        }

        public Criteria andHfueltypeNotBetween(Integer value1, Integer value2) {
            addCriterion("hfueltype not between", value1, value2, "hfueltype");
            return (Criteria) this;
        }

        public Criteria andHnextmileageIsNull() {
            addCriterion("hnextmileage is null");
            return (Criteria) this;
        }

        public Criteria andHnextmileageIsNotNull() {
            addCriterion("hnextmileage is not null");
            return (Criteria) this;
        }

        public Criteria andHnextmileageEqualTo(Integer value) {
            addCriterion("hnextmileage =", value, "hnextmileage");
            return (Criteria) this;
        }

        public Criteria andHnextmileageNotEqualTo(Integer value) {
            addCriterion("hnextmileage <>", value, "hnextmileage");
            return (Criteria) this;
        }

        public Criteria andHnextmileageGreaterThan(Integer value) {
            addCriterion("hnextmileage >", value, "hnextmileage");
            return (Criteria) this;
        }

        public Criteria andHnextmileageGreaterThanOrEqualTo(Integer value) {
            addCriterion("hnextmileage >=", value, "hnextmileage");
            return (Criteria) this;
        }

        public Criteria andHnextmileageLessThan(Integer value) {
            addCriterion("hnextmileage <", value, "hnextmileage");
            return (Criteria) this;
        }

        public Criteria andHnextmileageLessThanOrEqualTo(Integer value) {
            addCriterion("hnextmileage <=", value, "hnextmileage");
            return (Criteria) this;
        }

        public Criteria andHnextmileageIn(List<Integer> values) {
            addCriterion("hnextmileage in", values, "hnextmileage");
            return (Criteria) this;
        }

        public Criteria andHnextmileageNotIn(List<Integer> values) {
            addCriterion("hnextmileage not in", values, "hnextmileage");
            return (Criteria) this;
        }

        public Criteria andHnextmileageBetween(Integer value1, Integer value2) {
            addCriterion("hnextmileage between", value1, value2, "hnextmileage");
            return (Criteria) this;
        }

        public Criteria andHnextmileageNotBetween(Integer value1, Integer value2) {
            addCriterion("hnextmileage not between", value1, value2, "hnextmileage");
            return (Criteria) this;
        }

        public Criteria andHmileagedateIsNull() {
            addCriterion("hmileagedate is null");
            return (Criteria) this;
        }

        public Criteria andHmileagedateIsNotNull() {
            addCriterion("hmileagedate is not null");
            return (Criteria) this;
        }

        public Criteria andHmileagedateEqualTo(Date value) {
            addCriterionForJDBCDate("hmileagedate =", value, "hmileagedate");
            return (Criteria) this;
        }

        public Criteria andHmileagedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("hmileagedate <>", value, "hmileagedate");
            return (Criteria) this;
        }

        public Criteria andHmileagedateGreaterThan(Date value) {
            addCriterionForJDBCDate("hmileagedate >", value, "hmileagedate");
            return (Criteria) this;
        }

        public Criteria andHmileagedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hmileagedate >=", value, "hmileagedate");
            return (Criteria) this;
        }

        public Criteria andHmileagedateLessThan(Date value) {
            addCriterionForJDBCDate("hmileagedate <", value, "hmileagedate");
            return (Criteria) this;
        }

        public Criteria andHmileagedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hmileagedate <=", value, "hmileagedate");
            return (Criteria) this;
        }

        public Criteria andHmileagedateIn(List<Date> values) {
            addCriterionForJDBCDate("hmileagedate in", values, "hmileagedate");
            return (Criteria) this;
        }

        public Criteria andHmileagedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("hmileagedate not in", values, "hmileagedate");
            return (Criteria) this;
        }

        public Criteria andHmileagedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hmileagedate between", value1, value2, "hmileagedate");
            return (Criteria) this;
        }

        public Criteria andHmileagedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hmileagedate not between", value1, value2, "hmileagedate");
            return (Criteria) this;
        }

        public Criteria andHuidIsNull() {
            addCriterion("huid is null");
            return (Criteria) this;
        }

        public Criteria andHuidIsNotNull() {
            addCriterion("huid is not null");
            return (Criteria) this;
        }

        public Criteria andHuidEqualTo(Integer value) {
            addCriterion("huid =", value, "huid");
            return (Criteria) this;
        }

        public Criteria andHuidNotEqualTo(Integer value) {
            addCriterion("huid <>", value, "huid");
            return (Criteria) this;
        }

        public Criteria andHuidGreaterThan(Integer value) {
            addCriterion("huid >", value, "huid");
            return (Criteria) this;
        }

        public Criteria andHuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("huid >=", value, "huid");
            return (Criteria) this;
        }

        public Criteria andHuidLessThan(Integer value) {
            addCriterion("huid <", value, "huid");
            return (Criteria) this;
        }

        public Criteria andHuidLessThanOrEqualTo(Integer value) {
            addCriterion("huid <=", value, "huid");
            return (Criteria) this;
        }

        public Criteria andHuidIn(List<Integer> values) {
            addCriterion("huid in", values, "huid");
            return (Criteria) this;
        }

        public Criteria andHuidNotIn(List<Integer> values) {
            addCriterion("huid not in", values, "huid");
            return (Criteria) this;
        }

        public Criteria andHuidBetween(Integer value1, Integer value2) {
            addCriterion("huid between", value1, value2, "huid");
            return (Criteria) this;
        }

        public Criteria andHuidNotBetween(Integer value1, Integer value2) {
            addCriterion("huid not between", value1, value2, "huid");
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