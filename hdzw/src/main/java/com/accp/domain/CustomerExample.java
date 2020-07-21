package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andEidIsNull() {
            addCriterion("eid is null");
            return (Criteria) this;
        }

        public Criteria andEidIsNotNull() {
            addCriterion("eid is not null");
            return (Criteria) this;
        }

        public Criteria andEidEqualTo(Integer value) {
            addCriterion("eid =", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotEqualTo(Integer value) {
            addCriterion("eid <>", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThan(Integer value) {
            addCriterion("eid >", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThanOrEqualTo(Integer value) {
            addCriterion("eid >=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThan(Integer value) {
            addCriterion("eid <", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThanOrEqualTo(Integer value) {
            addCriterion("eid <=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidIn(List<Integer> values) {
            addCriterion("eid in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotIn(List<Integer> values) {
            addCriterion("eid not in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidBetween(Integer value1, Integer value2) {
            addCriterion("eid between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotBetween(Integer value1, Integer value2) {
            addCriterion("eid not between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEcustomeridIsNull() {
            addCriterion("ecustomerid is null");
            return (Criteria) this;
        }

        public Criteria andEcustomeridIsNotNull() {
            addCriterion("ecustomerid is not null");
            return (Criteria) this;
        }

        public Criteria andEcustomeridEqualTo(String value) {
            addCriterion("ecustomerid =", value, "ecustomerid");
            return (Criteria) this;
        }

        public Criteria andEcustomeridNotEqualTo(String value) {
            addCriterion("ecustomerid <>", value, "ecustomerid");
            return (Criteria) this;
        }

        public Criteria andEcustomeridGreaterThan(String value) {
            addCriterion("ecustomerid >", value, "ecustomerid");
            return (Criteria) this;
        }

        public Criteria andEcustomeridGreaterThanOrEqualTo(String value) {
            addCriterion("ecustomerid >=", value, "ecustomerid");
            return (Criteria) this;
        }

        public Criteria andEcustomeridLessThan(String value) {
            addCriterion("ecustomerid <", value, "ecustomerid");
            return (Criteria) this;
        }

        public Criteria andEcustomeridLessThanOrEqualTo(String value) {
            addCriterion("ecustomerid <=", value, "ecustomerid");
            return (Criteria) this;
        }

        public Criteria andEcustomeridLike(String value) {
            addCriterion("ecustomerid like", value, "ecustomerid");
            return (Criteria) this;
        }

        public Criteria andEcustomeridNotLike(String value) {
            addCriterion("ecustomerid not like", value, "ecustomerid");
            return (Criteria) this;
        }

        public Criteria andEcustomeridIn(List<String> values) {
            addCriterion("ecustomerid in", values, "ecustomerid");
            return (Criteria) this;
        }

        public Criteria andEcustomeridNotIn(List<String> values) {
            addCriterion("ecustomerid not in", values, "ecustomerid");
            return (Criteria) this;
        }

        public Criteria andEcustomeridBetween(String value1, String value2) {
            addCriterion("ecustomerid between", value1, value2, "ecustomerid");
            return (Criteria) this;
        }

        public Criteria andEcustomeridNotBetween(String value1, String value2) {
            addCriterion("ecustomerid not between", value1, value2, "ecustomerid");
            return (Criteria) this;
        }

        public Criteria andEcustomernameIsNull() {
            addCriterion("ecustomername is null");
            return (Criteria) this;
        }

        public Criteria andEcustomernameIsNotNull() {
            addCriterion("ecustomername is not null");
            return (Criteria) this;
        }

        public Criteria andEcustomernameEqualTo(String value) {
            addCriterion("ecustomername =", value, "ecustomername");
            return (Criteria) this;
        }

        public Criteria andEcustomernameNotEqualTo(String value) {
            addCriterion("ecustomername <>", value, "ecustomername");
            return (Criteria) this;
        }

        public Criteria andEcustomernameGreaterThan(String value) {
            addCriterion("ecustomername >", value, "ecustomername");
            return (Criteria) this;
        }

        public Criteria andEcustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("ecustomername >=", value, "ecustomername");
            return (Criteria) this;
        }

        public Criteria andEcustomernameLessThan(String value) {
            addCriterion("ecustomername <", value, "ecustomername");
            return (Criteria) this;
        }

        public Criteria andEcustomernameLessThanOrEqualTo(String value) {
            addCriterion("ecustomername <=", value, "ecustomername");
            return (Criteria) this;
        }

        public Criteria andEcustomernameLike(String value) {
            addCriterion("ecustomername like", value, "ecustomername");
            return (Criteria) this;
        }

        public Criteria andEcustomernameNotLike(String value) {
            addCriterion("ecustomername not like", value, "ecustomername");
            return (Criteria) this;
        }

        public Criteria andEcustomernameIn(List<String> values) {
            addCriterion("ecustomername in", values, "ecustomername");
            return (Criteria) this;
        }

        public Criteria andEcustomernameNotIn(List<String> values) {
            addCriterion("ecustomername not in", values, "ecustomername");
            return (Criteria) this;
        }

        public Criteria andEcustomernameBetween(String value1, String value2) {
            addCriterion("ecustomername between", value1, value2, "ecustomername");
            return (Criteria) this;
        }

        public Criteria andEcustomernameNotBetween(String value1, String value2) {
            addCriterion("ecustomername not between", value1, value2, "ecustomername");
            return (Criteria) this;
        }

        public Criteria andEaddressIsNull() {
            addCriterion("eaddress is null");
            return (Criteria) this;
        }

        public Criteria andEaddressIsNotNull() {
            addCriterion("eaddress is not null");
            return (Criteria) this;
        }

        public Criteria andEaddressEqualTo(String value) {
            addCriterion("eaddress =", value, "eaddress");
            return (Criteria) this;
        }

        public Criteria andEaddressNotEqualTo(String value) {
            addCriterion("eaddress <>", value, "eaddress");
            return (Criteria) this;
        }

        public Criteria andEaddressGreaterThan(String value) {
            addCriterion("eaddress >", value, "eaddress");
            return (Criteria) this;
        }

        public Criteria andEaddressGreaterThanOrEqualTo(String value) {
            addCriterion("eaddress >=", value, "eaddress");
            return (Criteria) this;
        }

        public Criteria andEaddressLessThan(String value) {
            addCriterion("eaddress <", value, "eaddress");
            return (Criteria) this;
        }

        public Criteria andEaddressLessThanOrEqualTo(String value) {
            addCriterion("eaddress <=", value, "eaddress");
            return (Criteria) this;
        }

        public Criteria andEaddressLike(String value) {
            addCriterion("eaddress like", value, "eaddress");
            return (Criteria) this;
        }

        public Criteria andEaddressNotLike(String value) {
            addCriterion("eaddress not like", value, "eaddress");
            return (Criteria) this;
        }

        public Criteria andEaddressIn(List<String> values) {
            addCriterion("eaddress in", values, "eaddress");
            return (Criteria) this;
        }

        public Criteria andEaddressNotIn(List<String> values) {
            addCriterion("eaddress not in", values, "eaddress");
            return (Criteria) this;
        }

        public Criteria andEaddressBetween(String value1, String value2) {
            addCriterion("eaddress between", value1, value2, "eaddress");
            return (Criteria) this;
        }

        public Criteria andEaddressNotBetween(String value1, String value2) {
            addCriterion("eaddress not between", value1, value2, "eaddress");
            return (Criteria) this;
        }

        public Criteria andElinkmanIsNull() {
            addCriterion("elinkman is null");
            return (Criteria) this;
        }

        public Criteria andElinkmanIsNotNull() {
            addCriterion("elinkman is not null");
            return (Criteria) this;
        }

        public Criteria andElinkmanEqualTo(String value) {
            addCriterion("elinkman =", value, "elinkman");
            return (Criteria) this;
        }

        public Criteria andElinkmanNotEqualTo(String value) {
            addCriterion("elinkman <>", value, "elinkman");
            return (Criteria) this;
        }

        public Criteria andElinkmanGreaterThan(String value) {
            addCriterion("elinkman >", value, "elinkman");
            return (Criteria) this;
        }

        public Criteria andElinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("elinkman >=", value, "elinkman");
            return (Criteria) this;
        }

        public Criteria andElinkmanLessThan(String value) {
            addCriterion("elinkman <", value, "elinkman");
            return (Criteria) this;
        }

        public Criteria andElinkmanLessThanOrEqualTo(String value) {
            addCriterion("elinkman <=", value, "elinkman");
            return (Criteria) this;
        }

        public Criteria andElinkmanLike(String value) {
            addCriterion("elinkman like", value, "elinkman");
            return (Criteria) this;
        }

        public Criteria andElinkmanNotLike(String value) {
            addCriterion("elinkman not like", value, "elinkman");
            return (Criteria) this;
        }

        public Criteria andElinkmanIn(List<String> values) {
            addCriterion("elinkman in", values, "elinkman");
            return (Criteria) this;
        }

        public Criteria andElinkmanNotIn(List<String> values) {
            addCriterion("elinkman not in", values, "elinkman");
            return (Criteria) this;
        }

        public Criteria andElinkmanBetween(String value1, String value2) {
            addCriterion("elinkman between", value1, value2, "elinkman");
            return (Criteria) this;
        }

        public Criteria andElinkmanNotBetween(String value1, String value2) {
            addCriterion("elinkman not between", value1, value2, "elinkman");
            return (Criteria) this;
        }

        public Criteria andEphoneIsNull() {
            addCriterion("ephone is null");
            return (Criteria) this;
        }

        public Criteria andEphoneIsNotNull() {
            addCriterion("ephone is not null");
            return (Criteria) this;
        }

        public Criteria andEphoneEqualTo(String value) {
            addCriterion("ephone =", value, "ephone");
            return (Criteria) this;
        }

        public Criteria andEphoneNotEqualTo(String value) {
            addCriterion("ephone <>", value, "ephone");
            return (Criteria) this;
        }

        public Criteria andEphoneGreaterThan(String value) {
            addCriterion("ephone >", value, "ephone");
            return (Criteria) this;
        }

        public Criteria andEphoneGreaterThanOrEqualTo(String value) {
            addCriterion("ephone >=", value, "ephone");
            return (Criteria) this;
        }

        public Criteria andEphoneLessThan(String value) {
            addCriterion("ephone <", value, "ephone");
            return (Criteria) this;
        }

        public Criteria andEphoneLessThanOrEqualTo(String value) {
            addCriterion("ephone <=", value, "ephone");
            return (Criteria) this;
        }

        public Criteria andEphoneLike(String value) {
            addCriterion("ephone like", value, "ephone");
            return (Criteria) this;
        }

        public Criteria andEphoneNotLike(String value) {
            addCriterion("ephone not like", value, "ephone");
            return (Criteria) this;
        }

        public Criteria andEphoneIn(List<String> values) {
            addCriterion("ephone in", values, "ephone");
            return (Criteria) this;
        }

        public Criteria andEphoneNotIn(List<String> values) {
            addCriterion("ephone not in", values, "ephone");
            return (Criteria) this;
        }

        public Criteria andEphoneBetween(String value1, String value2) {
            addCriterion("ephone between", value1, value2, "ephone");
            return (Criteria) this;
        }

        public Criteria andEphoneNotBetween(String value1, String value2) {
            addCriterion("ephone not between", value1, value2, "ephone");
            return (Criteria) this;
        }

        public Criteria andEbirthdayIsNull() {
            addCriterion("ebirthday is null");
            return (Criteria) this;
        }

        public Criteria andEbirthdayIsNotNull() {
            addCriterion("ebirthday is not null");
            return (Criteria) this;
        }

        public Criteria andEbirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("ebirthday =", value, "ebirthday");
            return (Criteria) this;
        }

        public Criteria andEbirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("ebirthday <>", value, "ebirthday");
            return (Criteria) this;
        }

        public Criteria andEbirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("ebirthday >", value, "ebirthday");
            return (Criteria) this;
        }

        public Criteria andEbirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ebirthday >=", value, "ebirthday");
            return (Criteria) this;
        }

        public Criteria andEbirthdayLessThan(Date value) {
            addCriterionForJDBCDate("ebirthday <", value, "ebirthday");
            return (Criteria) this;
        }

        public Criteria andEbirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ebirthday <=", value, "ebirthday");
            return (Criteria) this;
        }

        public Criteria andEbirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("ebirthday in", values, "ebirthday");
            return (Criteria) this;
        }

        public Criteria andEbirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("ebirthday not in", values, "ebirthday");
            return (Criteria) this;
        }

        public Criteria andEbirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ebirthday between", value1, value2, "ebirthday");
            return (Criteria) this;
        }

        public Criteria andEbirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ebirthday not between", value1, value2, "ebirthday");
            return (Criteria) this;
        }

        public Criteria andEmemberidIsNull() {
            addCriterion("ememberid is null");
            return (Criteria) this;
        }

        public Criteria andEmemberidIsNotNull() {
            addCriterion("ememberid is not null");
            return (Criteria) this;
        }

        public Criteria andEmemberidEqualTo(Integer value) {
            addCriterion("ememberid =", value, "ememberid");
            return (Criteria) this;
        }

        public Criteria andEmemberidNotEqualTo(Integer value) {
            addCriterion("ememberid <>", value, "ememberid");
            return (Criteria) this;
        }

        public Criteria andEmemberidGreaterThan(Integer value) {
            addCriterion("ememberid >", value, "ememberid");
            return (Criteria) this;
        }

        public Criteria andEmemberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ememberid >=", value, "ememberid");
            return (Criteria) this;
        }

        public Criteria andEmemberidLessThan(Integer value) {
            addCriterion("ememberid <", value, "ememberid");
            return (Criteria) this;
        }

        public Criteria andEmemberidLessThanOrEqualTo(Integer value) {
            addCriterion("ememberid <=", value, "ememberid");
            return (Criteria) this;
        }

        public Criteria andEmemberidIn(List<Integer> values) {
            addCriterion("ememberid in", values, "ememberid");
            return (Criteria) this;
        }

        public Criteria andEmemberidNotIn(List<Integer> values) {
            addCriterion("ememberid not in", values, "ememberid");
            return (Criteria) this;
        }

        public Criteria andEmemberidBetween(Integer value1, Integer value2) {
            addCriterion("ememberid between", value1, value2, "ememberid");
            return (Criteria) this;
        }

        public Criteria andEmemberidNotBetween(Integer value1, Integer value2) {
            addCriterion("ememberid not between", value1, value2, "ememberid");
            return (Criteria) this;
        }

        public Criteria andEremarkIsNull() {
            addCriterion("eremark is null");
            return (Criteria) this;
        }

        public Criteria andEremarkIsNotNull() {
            addCriterion("eremark is not null");
            return (Criteria) this;
        }

        public Criteria andEremarkEqualTo(String value) {
            addCriterion("eremark =", value, "eremark");
            return (Criteria) this;
        }

        public Criteria andEremarkNotEqualTo(String value) {
            addCriterion("eremark <>", value, "eremark");
            return (Criteria) this;
        }

        public Criteria andEremarkGreaterThan(String value) {
            addCriterion("eremark >", value, "eremark");
            return (Criteria) this;
        }

        public Criteria andEremarkGreaterThanOrEqualTo(String value) {
            addCriterion("eremark >=", value, "eremark");
            return (Criteria) this;
        }

        public Criteria andEremarkLessThan(String value) {
            addCriterion("eremark <", value, "eremark");
            return (Criteria) this;
        }

        public Criteria andEremarkLessThanOrEqualTo(String value) {
            addCriterion("eremark <=", value, "eremark");
            return (Criteria) this;
        }

        public Criteria andEremarkLike(String value) {
            addCriterion("eremark like", value, "eremark");
            return (Criteria) this;
        }

        public Criteria andEremarkNotLike(String value) {
            addCriterion("eremark not like", value, "eremark");
            return (Criteria) this;
        }

        public Criteria andEremarkIn(List<String> values) {
            addCriterion("eremark in", values, "eremark");
            return (Criteria) this;
        }

        public Criteria andEremarkNotIn(List<String> values) {
            addCriterion("eremark not in", values, "eremark");
            return (Criteria) this;
        }

        public Criteria andEremarkBetween(String value1, String value2) {
            addCriterion("eremark between", value1, value2, "eremark");
            return (Criteria) this;
        }

        public Criteria andEremarkNotBetween(String value1, String value2) {
            addCriterion("eremark not between", value1, value2, "eremark");
            return (Criteria) this;
        }

        public Criteria andEdocumentdateIsNull() {
            addCriterion("edocumentdate is null");
            return (Criteria) this;
        }

        public Criteria andEdocumentdateIsNotNull() {
            addCriterion("edocumentdate is not null");
            return (Criteria) this;
        }

        public Criteria andEdocumentdateEqualTo(Date value) {
            addCriterionForJDBCDate("edocumentdate =", value, "edocumentdate");
            return (Criteria) this;
        }

        public Criteria andEdocumentdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("edocumentdate <>", value, "edocumentdate");
            return (Criteria) this;
        }

        public Criteria andEdocumentdateGreaterThan(Date value) {
            addCriterionForJDBCDate("edocumentdate >", value, "edocumentdate");
            return (Criteria) this;
        }

        public Criteria andEdocumentdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("edocumentdate >=", value, "edocumentdate");
            return (Criteria) this;
        }

        public Criteria andEdocumentdateLessThan(Date value) {
            addCriterionForJDBCDate("edocumentdate <", value, "edocumentdate");
            return (Criteria) this;
        }

        public Criteria andEdocumentdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("edocumentdate <=", value, "edocumentdate");
            return (Criteria) this;
        }

        public Criteria andEdocumentdateIn(List<Date> values) {
            addCriterionForJDBCDate("edocumentdate in", values, "edocumentdate");
            return (Criteria) this;
        }

        public Criteria andEdocumentdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("edocumentdate not in", values, "edocumentdate");
            return (Criteria) this;
        }

        public Criteria andEdocumentdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("edocumentdate between", value1, value2, "edocumentdate");
            return (Criteria) this;
        }

        public Criteria andEdocumentdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("edocumentdate not between", value1, value2, "edocumentdate");
            return (Criteria) this;
        }

        public Criteria andEconsultantidIsNull() {
            addCriterion("econsultantid is null");
            return (Criteria) this;
        }

        public Criteria andEconsultantidIsNotNull() {
            addCriterion("econsultantid is not null");
            return (Criteria) this;
        }

        public Criteria andEconsultantidEqualTo(Integer value) {
            addCriterion("econsultantid =", value, "econsultantid");
            return (Criteria) this;
        }

        public Criteria andEconsultantidNotEqualTo(Integer value) {
            addCriterion("econsultantid <>", value, "econsultantid");
            return (Criteria) this;
        }

        public Criteria andEconsultantidGreaterThan(Integer value) {
            addCriterion("econsultantid >", value, "econsultantid");
            return (Criteria) this;
        }

        public Criteria andEconsultantidGreaterThanOrEqualTo(Integer value) {
            addCriterion("econsultantid >=", value, "econsultantid");
            return (Criteria) this;
        }

        public Criteria andEconsultantidLessThan(Integer value) {
            addCriterion("econsultantid <", value, "econsultantid");
            return (Criteria) this;
        }

        public Criteria andEconsultantidLessThanOrEqualTo(Integer value) {
            addCriterion("econsultantid <=", value, "econsultantid");
            return (Criteria) this;
        }

        public Criteria andEconsultantidIn(List<Integer> values) {
            addCriterion("econsultantid in", values, "econsultantid");
            return (Criteria) this;
        }

        public Criteria andEconsultantidNotIn(List<Integer> values) {
            addCriterion("econsultantid not in", values, "econsultantid");
            return (Criteria) this;
        }

        public Criteria andEconsultantidBetween(Integer value1, Integer value2) {
            addCriterion("econsultantid between", value1, value2, "econsultantid");
            return (Criteria) this;
        }

        public Criteria andEconsultantidNotBetween(Integer value1, Integer value2) {
            addCriterion("econsultantid not between", value1, value2, "econsultantid");
            return (Criteria) this;
        }

        public Criteria andEsalesphoneIsNull() {
            addCriterion("esalesphone is null");
            return (Criteria) this;
        }

        public Criteria andEsalesphoneIsNotNull() {
            addCriterion("esalesphone is not null");
            return (Criteria) this;
        }

        public Criteria andEsalesphoneEqualTo(String value) {
            addCriterion("esalesphone =", value, "esalesphone");
            return (Criteria) this;
        }

        public Criteria andEsalesphoneNotEqualTo(String value) {
            addCriterion("esalesphone <>", value, "esalesphone");
            return (Criteria) this;
        }

        public Criteria andEsalesphoneGreaterThan(String value) {
            addCriterion("esalesphone >", value, "esalesphone");
            return (Criteria) this;
        }

        public Criteria andEsalesphoneGreaterThanOrEqualTo(String value) {
            addCriterion("esalesphone >=", value, "esalesphone");
            return (Criteria) this;
        }

        public Criteria andEsalesphoneLessThan(String value) {
            addCriterion("esalesphone <", value, "esalesphone");
            return (Criteria) this;
        }

        public Criteria andEsalesphoneLessThanOrEqualTo(String value) {
            addCriterion("esalesphone <=", value, "esalesphone");
            return (Criteria) this;
        }

        public Criteria andEsalesphoneLike(String value) {
            addCriterion("esalesphone like", value, "esalesphone");
            return (Criteria) this;
        }

        public Criteria andEsalesphoneNotLike(String value) {
            addCriterion("esalesphone not like", value, "esalesphone");
            return (Criteria) this;
        }

        public Criteria andEsalesphoneIn(List<String> values) {
            addCriterion("esalesphone in", values, "esalesphone");
            return (Criteria) this;
        }

        public Criteria andEsalesphoneNotIn(List<String> values) {
            addCriterion("esalesphone not in", values, "esalesphone");
            return (Criteria) this;
        }

        public Criteria andEsalesphoneBetween(String value1, String value2) {
            addCriterion("esalesphone between", value1, value2, "esalesphone");
            return (Criteria) this;
        }

        public Criteria andEsalesphoneNotBetween(String value1, String value2) {
            addCriterion("esalesphone not between", value1, value2, "esalesphone");
            return (Criteria) this;
        }

        public Criteria andEpaymentdaysIsNull() {
            addCriterion("epaymentdays is null");
            return (Criteria) this;
        }

        public Criteria andEpaymentdaysIsNotNull() {
            addCriterion("epaymentdays is not null");
            return (Criteria) this;
        }

        public Criteria andEpaymentdaysEqualTo(Integer value) {
            addCriterion("epaymentdays =", value, "epaymentdays");
            return (Criteria) this;
        }

        public Criteria andEpaymentdaysNotEqualTo(Integer value) {
            addCriterion("epaymentdays <>", value, "epaymentdays");
            return (Criteria) this;
        }

        public Criteria andEpaymentdaysGreaterThan(Integer value) {
            addCriterion("epaymentdays >", value, "epaymentdays");
            return (Criteria) this;
        }

        public Criteria andEpaymentdaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("epaymentdays >=", value, "epaymentdays");
            return (Criteria) this;
        }

        public Criteria andEpaymentdaysLessThan(Integer value) {
            addCriterion("epaymentdays <", value, "epaymentdays");
            return (Criteria) this;
        }

        public Criteria andEpaymentdaysLessThanOrEqualTo(Integer value) {
            addCriterion("epaymentdays <=", value, "epaymentdays");
            return (Criteria) this;
        }

        public Criteria andEpaymentdaysIn(List<Integer> values) {
            addCriterion("epaymentdays in", values, "epaymentdays");
            return (Criteria) this;
        }

        public Criteria andEpaymentdaysNotIn(List<Integer> values) {
            addCriterion("epaymentdays not in", values, "epaymentdays");
            return (Criteria) this;
        }

        public Criteria andEpaymentdaysBetween(Integer value1, Integer value2) {
            addCriterion("epaymentdays between", value1, value2, "epaymentdays");
            return (Criteria) this;
        }

        public Criteria andEpaymentdaysNotBetween(Integer value1, Integer value2) {
            addCriterion("epaymentdays not between", value1, value2, "epaymentdays");
            return (Criteria) this;
        }

        public Criteria andEpaymentamountIsNull() {
            addCriterion("epaymentamount is null");
            return (Criteria) this;
        }

        public Criteria andEpaymentamountIsNotNull() {
            addCriterion("epaymentamount is not null");
            return (Criteria) this;
        }

        public Criteria andEpaymentamountEqualTo(Float value) {
            addCriterion("epaymentamount =", value, "epaymentamount");
            return (Criteria) this;
        }

        public Criteria andEpaymentamountNotEqualTo(Float value) {
            addCriterion("epaymentamount <>", value, "epaymentamount");
            return (Criteria) this;
        }

        public Criteria andEpaymentamountGreaterThan(Float value) {
            addCriterion("epaymentamount >", value, "epaymentamount");
            return (Criteria) this;
        }

        public Criteria andEpaymentamountGreaterThanOrEqualTo(Float value) {
            addCriterion("epaymentamount >=", value, "epaymentamount");
            return (Criteria) this;
        }

        public Criteria andEpaymentamountLessThan(Float value) {
            addCriterion("epaymentamount <", value, "epaymentamount");
            return (Criteria) this;
        }

        public Criteria andEpaymentamountLessThanOrEqualTo(Float value) {
            addCriterion("epaymentamount <=", value, "epaymentamount");
            return (Criteria) this;
        }

        public Criteria andEpaymentamountIn(List<Float> values) {
            addCriterion("epaymentamount in", values, "epaymentamount");
            return (Criteria) this;
        }

        public Criteria andEpaymentamountNotIn(List<Float> values) {
            addCriterion("epaymentamount not in", values, "epaymentamount");
            return (Criteria) this;
        }

        public Criteria andEpaymentamountBetween(Float value1, Float value2) {
            addCriterion("epaymentamount between", value1, value2, "epaymentamount");
            return (Criteria) this;
        }

        public Criteria andEpaymentamountNotBetween(Float value1, Float value2) {
            addCriterion("epaymentamount not between", value1, value2, "epaymentamount");
            return (Criteria) this;
        }

        public Criteria andEcumtrapzIsNull() {
            addCriterion("ecumtrapz is null");
            return (Criteria) this;
        }

        public Criteria andEcumtrapzIsNotNull() {
            addCriterion("ecumtrapz is not null");
            return (Criteria) this;
        }

        public Criteria andEcumtrapzEqualTo(Integer value) {
            addCriterion("ecumtrapz =", value, "ecumtrapz");
            return (Criteria) this;
        }

        public Criteria andEcumtrapzNotEqualTo(Integer value) {
            addCriterion("ecumtrapz <>", value, "ecumtrapz");
            return (Criteria) this;
        }

        public Criteria andEcumtrapzGreaterThan(Integer value) {
            addCriterion("ecumtrapz >", value, "ecumtrapz");
            return (Criteria) this;
        }

        public Criteria andEcumtrapzGreaterThanOrEqualTo(Integer value) {
            addCriterion("ecumtrapz >=", value, "ecumtrapz");
            return (Criteria) this;
        }

        public Criteria andEcumtrapzLessThan(Integer value) {
            addCriterion("ecumtrapz <", value, "ecumtrapz");
            return (Criteria) this;
        }

        public Criteria andEcumtrapzLessThanOrEqualTo(Integer value) {
            addCriterion("ecumtrapz <=", value, "ecumtrapz");
            return (Criteria) this;
        }

        public Criteria andEcumtrapzIn(List<Integer> values) {
            addCriterion("ecumtrapz in", values, "ecumtrapz");
            return (Criteria) this;
        }

        public Criteria andEcumtrapzNotIn(List<Integer> values) {
            addCriterion("ecumtrapz not in", values, "ecumtrapz");
            return (Criteria) this;
        }

        public Criteria andEcumtrapzBetween(Integer value1, Integer value2) {
            addCriterion("ecumtrapz between", value1, value2, "ecumtrapz");
            return (Criteria) this;
        }

        public Criteria andEcumtrapzNotBetween(Integer value1, Integer value2) {
            addCriterion("ecumtrapz not between", value1, value2, "ecumtrapz");
            return (Criteria) this;
        }

        public Criteria andEbalanceIsNull() {
            addCriterion("ebalance is null");
            return (Criteria) this;
        }

        public Criteria andEbalanceIsNotNull() {
            addCriterion("ebalance is not null");
            return (Criteria) this;
        }

        public Criteria andEbalanceEqualTo(Float value) {
            addCriterion("ebalance =", value, "ebalance");
            return (Criteria) this;
        }

        public Criteria andEbalanceNotEqualTo(Float value) {
            addCriterion("ebalance <>", value, "ebalance");
            return (Criteria) this;
        }

        public Criteria andEbalanceGreaterThan(Float value) {
            addCriterion("ebalance >", value, "ebalance");
            return (Criteria) this;
        }

        public Criteria andEbalanceGreaterThanOrEqualTo(Float value) {
            addCriterion("ebalance >=", value, "ebalance");
            return (Criteria) this;
        }

        public Criteria andEbalanceLessThan(Float value) {
            addCriterion("ebalance <", value, "ebalance");
            return (Criteria) this;
        }

        public Criteria andEbalanceLessThanOrEqualTo(Float value) {
            addCriterion("ebalance <=", value, "ebalance");
            return (Criteria) this;
        }

        public Criteria andEbalanceIn(List<Float> values) {
            addCriterion("ebalance in", values, "ebalance");
            return (Criteria) this;
        }

        public Criteria andEbalanceNotIn(List<Float> values) {
            addCriterion("ebalance not in", values, "ebalance");
            return (Criteria) this;
        }

        public Criteria andEbalanceBetween(Float value1, Float value2) {
            addCriterion("ebalance between", value1, value2, "ebalance");
            return (Criteria) this;
        }

        public Criteria andEbalanceNotBetween(Float value1, Float value2) {
            addCriterion("ebalance not between", value1, value2, "ebalance");
            return (Criteria) this;
        }

        public Criteria andEprovinceIsNull() {
            addCriterion("eprovince is null");
            return (Criteria) this;
        }

        public Criteria andEprovinceIsNotNull() {
            addCriterion("eprovince is not null");
            return (Criteria) this;
        }

        public Criteria andEprovinceEqualTo(String value) {
            addCriterion("eprovince =", value, "eprovince");
            return (Criteria) this;
        }

        public Criteria andEprovinceNotEqualTo(String value) {
            addCriterion("eprovince <>", value, "eprovince");
            return (Criteria) this;
        }

        public Criteria andEprovinceGreaterThan(String value) {
            addCriterion("eprovince >", value, "eprovince");
            return (Criteria) this;
        }

        public Criteria andEprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("eprovince >=", value, "eprovince");
            return (Criteria) this;
        }

        public Criteria andEprovinceLessThan(String value) {
            addCriterion("eprovince <", value, "eprovince");
            return (Criteria) this;
        }

        public Criteria andEprovinceLessThanOrEqualTo(String value) {
            addCriterion("eprovince <=", value, "eprovince");
            return (Criteria) this;
        }

        public Criteria andEprovinceLike(String value) {
            addCriterion("eprovince like", value, "eprovince");
            return (Criteria) this;
        }

        public Criteria andEprovinceNotLike(String value) {
            addCriterion("eprovince not like", value, "eprovince");
            return (Criteria) this;
        }

        public Criteria andEprovinceIn(List<String> values) {
            addCriterion("eprovince in", values, "eprovince");
            return (Criteria) this;
        }

        public Criteria andEprovinceNotIn(List<String> values) {
            addCriterion("eprovince not in", values, "eprovince");
            return (Criteria) this;
        }

        public Criteria andEprovinceBetween(String value1, String value2) {
            addCriterion("eprovince between", value1, value2, "eprovince");
            return (Criteria) this;
        }

        public Criteria andEprovinceNotBetween(String value1, String value2) {
            addCriterion("eprovince not between", value1, value2, "eprovince");
            return (Criteria) this;
        }

        public Criteria andEcityIsNull() {
            addCriterion("ecity is null");
            return (Criteria) this;
        }

        public Criteria andEcityIsNotNull() {
            addCriterion("ecity is not null");
            return (Criteria) this;
        }

        public Criteria andEcityEqualTo(String value) {
            addCriterion("ecity =", value, "ecity");
            return (Criteria) this;
        }

        public Criteria andEcityNotEqualTo(String value) {
            addCriterion("ecity <>", value, "ecity");
            return (Criteria) this;
        }

        public Criteria andEcityGreaterThan(String value) {
            addCriterion("ecity >", value, "ecity");
            return (Criteria) this;
        }

        public Criteria andEcityGreaterThanOrEqualTo(String value) {
            addCriterion("ecity >=", value, "ecity");
            return (Criteria) this;
        }

        public Criteria andEcityLessThan(String value) {
            addCriterion("ecity <", value, "ecity");
            return (Criteria) this;
        }

        public Criteria andEcityLessThanOrEqualTo(String value) {
            addCriterion("ecity <=", value, "ecity");
            return (Criteria) this;
        }

        public Criteria andEcityLike(String value) {
            addCriterion("ecity like", value, "ecity");
            return (Criteria) this;
        }

        public Criteria andEcityNotLike(String value) {
            addCriterion("ecity not like", value, "ecity");
            return (Criteria) this;
        }

        public Criteria andEcityIn(List<String> values) {
            addCriterion("ecity in", values, "ecity");
            return (Criteria) this;
        }

        public Criteria andEcityNotIn(List<String> values) {
            addCriterion("ecity not in", values, "ecity");
            return (Criteria) this;
        }

        public Criteria andEcityBetween(String value1, String value2) {
            addCriterion("ecity between", value1, value2, "ecity");
            return (Criteria) this;
        }

        public Criteria andEcityNotBetween(String value1, String value2) {
            addCriterion("ecity not between", value1, value2, "ecity");
            return (Criteria) this;
        }

        public Criteria andEdistrictIsNull() {
            addCriterion("edistrict is null");
            return (Criteria) this;
        }

        public Criteria andEdistrictIsNotNull() {
            addCriterion("edistrict is not null");
            return (Criteria) this;
        }

        public Criteria andEdistrictEqualTo(String value) {
            addCriterion("edistrict =", value, "edistrict");
            return (Criteria) this;
        }

        public Criteria andEdistrictNotEqualTo(String value) {
            addCriterion("edistrict <>", value, "edistrict");
            return (Criteria) this;
        }

        public Criteria andEdistrictGreaterThan(String value) {
            addCriterion("edistrict >", value, "edistrict");
            return (Criteria) this;
        }

        public Criteria andEdistrictGreaterThanOrEqualTo(String value) {
            addCriterion("edistrict >=", value, "edistrict");
            return (Criteria) this;
        }

        public Criteria andEdistrictLessThan(String value) {
            addCriterion("edistrict <", value, "edistrict");
            return (Criteria) this;
        }

        public Criteria andEdistrictLessThanOrEqualTo(String value) {
            addCriterion("edistrict <=", value, "edistrict");
            return (Criteria) this;
        }

        public Criteria andEdistrictLike(String value) {
            addCriterion("edistrict like", value, "edistrict");
            return (Criteria) this;
        }

        public Criteria andEdistrictNotLike(String value) {
            addCriterion("edistrict not like", value, "edistrict");
            return (Criteria) this;
        }

        public Criteria andEdistrictIn(List<String> values) {
            addCriterion("edistrict in", values, "edistrict");
            return (Criteria) this;
        }

        public Criteria andEdistrictNotIn(List<String> values) {
            addCriterion("edistrict not in", values, "edistrict");
            return (Criteria) this;
        }

        public Criteria andEdistrictBetween(String value1, String value2) {
            addCriterion("edistrict between", value1, value2, "edistrict");
            return (Criteria) this;
        }

        public Criteria andEdistrictNotBetween(String value1, String value2) {
            addCriterion("edistrict not between", value1, value2, "edistrict");
            return (Criteria) this;
        }

        public Criteria andEtaxpayerIsNull() {
            addCriterion("etaxpayer is null");
            return (Criteria) this;
        }

        public Criteria andEtaxpayerIsNotNull() {
            addCriterion("etaxpayer is not null");
            return (Criteria) this;
        }

        public Criteria andEtaxpayerEqualTo(String value) {
            addCriterion("etaxpayer =", value, "etaxpayer");
            return (Criteria) this;
        }

        public Criteria andEtaxpayerNotEqualTo(String value) {
            addCriterion("etaxpayer <>", value, "etaxpayer");
            return (Criteria) this;
        }

        public Criteria andEtaxpayerGreaterThan(String value) {
            addCriterion("etaxpayer >", value, "etaxpayer");
            return (Criteria) this;
        }

        public Criteria andEtaxpayerGreaterThanOrEqualTo(String value) {
            addCriterion("etaxpayer >=", value, "etaxpayer");
            return (Criteria) this;
        }

        public Criteria andEtaxpayerLessThan(String value) {
            addCriterion("etaxpayer <", value, "etaxpayer");
            return (Criteria) this;
        }

        public Criteria andEtaxpayerLessThanOrEqualTo(String value) {
            addCriterion("etaxpayer <=", value, "etaxpayer");
            return (Criteria) this;
        }

        public Criteria andEtaxpayerLike(String value) {
            addCriterion("etaxpayer like", value, "etaxpayer");
            return (Criteria) this;
        }

        public Criteria andEtaxpayerNotLike(String value) {
            addCriterion("etaxpayer not like", value, "etaxpayer");
            return (Criteria) this;
        }

        public Criteria andEtaxpayerIn(List<String> values) {
            addCriterion("etaxpayer in", values, "etaxpayer");
            return (Criteria) this;
        }

        public Criteria andEtaxpayerNotIn(List<String> values) {
            addCriterion("etaxpayer not in", values, "etaxpayer");
            return (Criteria) this;
        }

        public Criteria andEtaxpayerBetween(String value1, String value2) {
            addCriterion("etaxpayer between", value1, value2, "etaxpayer");
            return (Criteria) this;
        }

        public Criteria andEtaxpayerNotBetween(String value1, String value2) {
            addCriterion("etaxpayer not between", value1, value2, "etaxpayer");
            return (Criteria) this;
        }

        public Criteria andEregisterphoneIsNull() {
            addCriterion("eregisterphone is null");
            return (Criteria) this;
        }

        public Criteria andEregisterphoneIsNotNull() {
            addCriterion("eregisterphone is not null");
            return (Criteria) this;
        }

        public Criteria andEregisterphoneEqualTo(String value) {
            addCriterion("eregisterphone =", value, "eregisterphone");
            return (Criteria) this;
        }

        public Criteria andEregisterphoneNotEqualTo(String value) {
            addCriterion("eregisterphone <>", value, "eregisterphone");
            return (Criteria) this;
        }

        public Criteria andEregisterphoneGreaterThan(String value) {
            addCriterion("eregisterphone >", value, "eregisterphone");
            return (Criteria) this;
        }

        public Criteria andEregisterphoneGreaterThanOrEqualTo(String value) {
            addCriterion("eregisterphone >=", value, "eregisterphone");
            return (Criteria) this;
        }

        public Criteria andEregisterphoneLessThan(String value) {
            addCriterion("eregisterphone <", value, "eregisterphone");
            return (Criteria) this;
        }

        public Criteria andEregisterphoneLessThanOrEqualTo(String value) {
            addCriterion("eregisterphone <=", value, "eregisterphone");
            return (Criteria) this;
        }

        public Criteria andEregisterphoneLike(String value) {
            addCriterion("eregisterphone like", value, "eregisterphone");
            return (Criteria) this;
        }

        public Criteria andEregisterphoneNotLike(String value) {
            addCriterion("eregisterphone not like", value, "eregisterphone");
            return (Criteria) this;
        }

        public Criteria andEregisterphoneIn(List<String> values) {
            addCriterion("eregisterphone in", values, "eregisterphone");
            return (Criteria) this;
        }

        public Criteria andEregisterphoneNotIn(List<String> values) {
            addCriterion("eregisterphone not in", values, "eregisterphone");
            return (Criteria) this;
        }

        public Criteria andEregisterphoneBetween(String value1, String value2) {
            addCriterion("eregisterphone between", value1, value2, "eregisterphone");
            return (Criteria) this;
        }

        public Criteria andEregisterphoneNotBetween(String value1, String value2) {
            addCriterion("eregisterphone not between", value1, value2, "eregisterphone");
            return (Criteria) this;
        }

        public Criteria andEdepositbankIsNull() {
            addCriterion("edepositbank is null");
            return (Criteria) this;
        }

        public Criteria andEdepositbankIsNotNull() {
            addCriterion("edepositbank is not null");
            return (Criteria) this;
        }

        public Criteria andEdepositbankEqualTo(String value) {
            addCriterion("edepositbank =", value, "edepositbank");
            return (Criteria) this;
        }

        public Criteria andEdepositbankNotEqualTo(String value) {
            addCriterion("edepositbank <>", value, "edepositbank");
            return (Criteria) this;
        }

        public Criteria andEdepositbankGreaterThan(String value) {
            addCriterion("edepositbank >", value, "edepositbank");
            return (Criteria) this;
        }

        public Criteria andEdepositbankGreaterThanOrEqualTo(String value) {
            addCriterion("edepositbank >=", value, "edepositbank");
            return (Criteria) this;
        }

        public Criteria andEdepositbankLessThan(String value) {
            addCriterion("edepositbank <", value, "edepositbank");
            return (Criteria) this;
        }

        public Criteria andEdepositbankLessThanOrEqualTo(String value) {
            addCriterion("edepositbank <=", value, "edepositbank");
            return (Criteria) this;
        }

        public Criteria andEdepositbankLike(String value) {
            addCriterion("edepositbank like", value, "edepositbank");
            return (Criteria) this;
        }

        public Criteria andEdepositbankNotLike(String value) {
            addCriterion("edepositbank not like", value, "edepositbank");
            return (Criteria) this;
        }

        public Criteria andEdepositbankIn(List<String> values) {
            addCriterion("edepositbank in", values, "edepositbank");
            return (Criteria) this;
        }

        public Criteria andEdepositbankNotIn(List<String> values) {
            addCriterion("edepositbank not in", values, "edepositbank");
            return (Criteria) this;
        }

        public Criteria andEdepositbankBetween(String value1, String value2) {
            addCriterion("edepositbank between", value1, value2, "edepositbank");
            return (Criteria) this;
        }

        public Criteria andEdepositbankNotBetween(String value1, String value2) {
            addCriterion("edepositbank not between", value1, value2, "edepositbank");
            return (Criteria) this;
        }

        public Criteria andEbankaccountIsNull() {
            addCriterion("ebankaccount is null");
            return (Criteria) this;
        }

        public Criteria andEbankaccountIsNotNull() {
            addCriterion("ebankaccount is not null");
            return (Criteria) this;
        }

        public Criteria andEbankaccountEqualTo(String value) {
            addCriterion("ebankaccount =", value, "ebankaccount");
            return (Criteria) this;
        }

        public Criteria andEbankaccountNotEqualTo(String value) {
            addCriterion("ebankaccount <>", value, "ebankaccount");
            return (Criteria) this;
        }

        public Criteria andEbankaccountGreaterThan(String value) {
            addCriterion("ebankaccount >", value, "ebankaccount");
            return (Criteria) this;
        }

        public Criteria andEbankaccountGreaterThanOrEqualTo(String value) {
            addCriterion("ebankaccount >=", value, "ebankaccount");
            return (Criteria) this;
        }

        public Criteria andEbankaccountLessThan(String value) {
            addCriterion("ebankaccount <", value, "ebankaccount");
            return (Criteria) this;
        }

        public Criteria andEbankaccountLessThanOrEqualTo(String value) {
            addCriterion("ebankaccount <=", value, "ebankaccount");
            return (Criteria) this;
        }

        public Criteria andEbankaccountLike(String value) {
            addCriterion("ebankaccount like", value, "ebankaccount");
            return (Criteria) this;
        }

        public Criteria andEbankaccountNotLike(String value) {
            addCriterion("ebankaccount not like", value, "ebankaccount");
            return (Criteria) this;
        }

        public Criteria andEbankaccountIn(List<String> values) {
            addCriterion("ebankaccount in", values, "ebankaccount");
            return (Criteria) this;
        }

        public Criteria andEbankaccountNotIn(List<String> values) {
            addCriterion("ebankaccount not in", values, "ebankaccount");
            return (Criteria) this;
        }

        public Criteria andEbankaccountBetween(String value1, String value2) {
            addCriterion("ebankaccount between", value1, value2, "ebankaccount");
            return (Criteria) this;
        }

        public Criteria andEbankaccountNotBetween(String value1, String value2) {
            addCriterion("ebankaccount not between", value1, value2, "ebankaccount");
            return (Criteria) this;
        }

        public Criteria andEregisteraddressIsNull() {
            addCriterion("eregisteraddress is null");
            return (Criteria) this;
        }

        public Criteria andEregisteraddressIsNotNull() {
            addCriterion("eregisteraddress is not null");
            return (Criteria) this;
        }

        public Criteria andEregisteraddressEqualTo(String value) {
            addCriterion("eregisteraddress =", value, "eregisteraddress");
            return (Criteria) this;
        }

        public Criteria andEregisteraddressNotEqualTo(String value) {
            addCriterion("eregisteraddress <>", value, "eregisteraddress");
            return (Criteria) this;
        }

        public Criteria andEregisteraddressGreaterThan(String value) {
            addCriterion("eregisteraddress >", value, "eregisteraddress");
            return (Criteria) this;
        }

        public Criteria andEregisteraddressGreaterThanOrEqualTo(String value) {
            addCriterion("eregisteraddress >=", value, "eregisteraddress");
            return (Criteria) this;
        }

        public Criteria andEregisteraddressLessThan(String value) {
            addCriterion("eregisteraddress <", value, "eregisteraddress");
            return (Criteria) this;
        }

        public Criteria andEregisteraddressLessThanOrEqualTo(String value) {
            addCriterion("eregisteraddress <=", value, "eregisteraddress");
            return (Criteria) this;
        }

        public Criteria andEregisteraddressLike(String value) {
            addCriterion("eregisteraddress like", value, "eregisteraddress");
            return (Criteria) this;
        }

        public Criteria andEregisteraddressNotLike(String value) {
            addCriterion("eregisteraddress not like", value, "eregisteraddress");
            return (Criteria) this;
        }

        public Criteria andEregisteraddressIn(List<String> values) {
            addCriterion("eregisteraddress in", values, "eregisteraddress");
            return (Criteria) this;
        }

        public Criteria andEregisteraddressNotIn(List<String> values) {
            addCriterion("eregisteraddress not in", values, "eregisteraddress");
            return (Criteria) this;
        }

        public Criteria andEregisteraddressBetween(String value1, String value2) {
            addCriterion("eregisteraddress between", value1, value2, "eregisteraddress");
            return (Criteria) this;
        }

        public Criteria andEregisteraddressNotBetween(String value1, String value2) {
            addCriterion("eregisteraddress not between", value1, value2, "eregisteraddress");
            return (Criteria) this;
        }

        public Criteria andErestsoneIsNull() {
            addCriterion("erestsone is null");
            return (Criteria) this;
        }

        public Criteria andErestsoneIsNotNull() {
            addCriterion("erestsone is not null");
            return (Criteria) this;
        }

        public Criteria andErestsoneEqualTo(String value) {
            addCriterion("erestsone =", value, "erestsone");
            return (Criteria) this;
        }

        public Criteria andErestsoneNotEqualTo(String value) {
            addCriterion("erestsone <>", value, "erestsone");
            return (Criteria) this;
        }

        public Criteria andErestsoneGreaterThan(String value) {
            addCriterion("erestsone >", value, "erestsone");
            return (Criteria) this;
        }

        public Criteria andErestsoneGreaterThanOrEqualTo(String value) {
            addCriterion("erestsone >=", value, "erestsone");
            return (Criteria) this;
        }

        public Criteria andErestsoneLessThan(String value) {
            addCriterion("erestsone <", value, "erestsone");
            return (Criteria) this;
        }

        public Criteria andErestsoneLessThanOrEqualTo(String value) {
            addCriterion("erestsone <=", value, "erestsone");
            return (Criteria) this;
        }

        public Criteria andErestsoneLike(String value) {
            addCriterion("erestsone like", value, "erestsone");
            return (Criteria) this;
        }

        public Criteria andErestsoneNotLike(String value) {
            addCriterion("erestsone not like", value, "erestsone");
            return (Criteria) this;
        }

        public Criteria andErestsoneIn(List<String> values) {
            addCriterion("erestsone in", values, "erestsone");
            return (Criteria) this;
        }

        public Criteria andErestsoneNotIn(List<String> values) {
            addCriterion("erestsone not in", values, "erestsone");
            return (Criteria) this;
        }

        public Criteria andErestsoneBetween(String value1, String value2) {
            addCriterion("erestsone between", value1, value2, "erestsone");
            return (Criteria) this;
        }

        public Criteria andErestsoneNotBetween(String value1, String value2) {
            addCriterion("erestsone not between", value1, value2, "erestsone");
            return (Criteria) this;
        }

        public Criteria andEreststwoIsNull() {
            addCriterion("ereststwo is null");
            return (Criteria) this;
        }

        public Criteria andEreststwoIsNotNull() {
            addCriterion("ereststwo is not null");
            return (Criteria) this;
        }

        public Criteria andEreststwoEqualTo(String value) {
            addCriterion("ereststwo =", value, "ereststwo");
            return (Criteria) this;
        }

        public Criteria andEreststwoNotEqualTo(String value) {
            addCriterion("ereststwo <>", value, "ereststwo");
            return (Criteria) this;
        }

        public Criteria andEreststwoGreaterThan(String value) {
            addCriterion("ereststwo >", value, "ereststwo");
            return (Criteria) this;
        }

        public Criteria andEreststwoGreaterThanOrEqualTo(String value) {
            addCriterion("ereststwo >=", value, "ereststwo");
            return (Criteria) this;
        }

        public Criteria andEreststwoLessThan(String value) {
            addCriterion("ereststwo <", value, "ereststwo");
            return (Criteria) this;
        }

        public Criteria andEreststwoLessThanOrEqualTo(String value) {
            addCriterion("ereststwo <=", value, "ereststwo");
            return (Criteria) this;
        }

        public Criteria andEreststwoLike(String value) {
            addCriterion("ereststwo like", value, "ereststwo");
            return (Criteria) this;
        }

        public Criteria andEreststwoNotLike(String value) {
            addCriterion("ereststwo not like", value, "ereststwo");
            return (Criteria) this;
        }

        public Criteria andEreststwoIn(List<String> values) {
            addCriterion("ereststwo in", values, "ereststwo");
            return (Criteria) this;
        }

        public Criteria andEreststwoNotIn(List<String> values) {
            addCriterion("ereststwo not in", values, "ereststwo");
            return (Criteria) this;
        }

        public Criteria andEreststwoBetween(String value1, String value2) {
            addCriterion("ereststwo between", value1, value2, "ereststwo");
            return (Criteria) this;
        }

        public Criteria andEreststwoNotBetween(String value1, String value2) {
            addCriterion("ereststwo not between", value1, value2, "ereststwo");
            return (Criteria) this;
        }

        public Criteria andEreststhreeIsNull() {
            addCriterion("ereststhree is null");
            return (Criteria) this;
        }

        public Criteria andEreststhreeIsNotNull() {
            addCriterion("ereststhree is not null");
            return (Criteria) this;
        }

        public Criteria andEreststhreeEqualTo(String value) {
            addCriterion("ereststhree =", value, "ereststhree");
            return (Criteria) this;
        }

        public Criteria andEreststhreeNotEqualTo(String value) {
            addCriterion("ereststhree <>", value, "ereststhree");
            return (Criteria) this;
        }

        public Criteria andEreststhreeGreaterThan(String value) {
            addCriterion("ereststhree >", value, "ereststhree");
            return (Criteria) this;
        }

        public Criteria andEreststhreeGreaterThanOrEqualTo(String value) {
            addCriterion("ereststhree >=", value, "ereststhree");
            return (Criteria) this;
        }

        public Criteria andEreststhreeLessThan(String value) {
            addCriterion("ereststhree <", value, "ereststhree");
            return (Criteria) this;
        }

        public Criteria andEreststhreeLessThanOrEqualTo(String value) {
            addCriterion("ereststhree <=", value, "ereststhree");
            return (Criteria) this;
        }

        public Criteria andEreststhreeLike(String value) {
            addCriterion("ereststhree like", value, "ereststhree");
            return (Criteria) this;
        }

        public Criteria andEreststhreeNotLike(String value) {
            addCriterion("ereststhree not like", value, "ereststhree");
            return (Criteria) this;
        }

        public Criteria andEreststhreeIn(List<String> values) {
            addCriterion("ereststhree in", values, "ereststhree");
            return (Criteria) this;
        }

        public Criteria andEreststhreeNotIn(List<String> values) {
            addCriterion("ereststhree not in", values, "ereststhree");
            return (Criteria) this;
        }

        public Criteria andEreststhreeBetween(String value1, String value2) {
            addCriterion("ereststhree between", value1, value2, "ereststhree");
            return (Criteria) this;
        }

        public Criteria andEreststhreeNotBetween(String value1, String value2) {
            addCriterion("ereststhree not between", value1, value2, "ereststhree");
            return (Criteria) this;
        }

        public Criteria andErestsfourIsNull() {
            addCriterion("erestsfour is null");
            return (Criteria) this;
        }

        public Criteria andErestsfourIsNotNull() {
            addCriterion("erestsfour is not null");
            return (Criteria) this;
        }

        public Criteria andErestsfourEqualTo(String value) {
            addCriterion("erestsfour =", value, "erestsfour");
            return (Criteria) this;
        }

        public Criteria andErestsfourNotEqualTo(String value) {
            addCriterion("erestsfour <>", value, "erestsfour");
            return (Criteria) this;
        }

        public Criteria andErestsfourGreaterThan(String value) {
            addCriterion("erestsfour >", value, "erestsfour");
            return (Criteria) this;
        }

        public Criteria andErestsfourGreaterThanOrEqualTo(String value) {
            addCriterion("erestsfour >=", value, "erestsfour");
            return (Criteria) this;
        }

        public Criteria andErestsfourLessThan(String value) {
            addCriterion("erestsfour <", value, "erestsfour");
            return (Criteria) this;
        }

        public Criteria andErestsfourLessThanOrEqualTo(String value) {
            addCriterion("erestsfour <=", value, "erestsfour");
            return (Criteria) this;
        }

        public Criteria andErestsfourLike(String value) {
            addCriterion("erestsfour like", value, "erestsfour");
            return (Criteria) this;
        }

        public Criteria andErestsfourNotLike(String value) {
            addCriterion("erestsfour not like", value, "erestsfour");
            return (Criteria) this;
        }

        public Criteria andErestsfourIn(List<String> values) {
            addCriterion("erestsfour in", values, "erestsfour");
            return (Criteria) this;
        }

        public Criteria andErestsfourNotIn(List<String> values) {
            addCriterion("erestsfour not in", values, "erestsfour");
            return (Criteria) this;
        }

        public Criteria andErestsfourBetween(String value1, String value2) {
            addCriterion("erestsfour between", value1, value2, "erestsfour");
            return (Criteria) this;
        }

        public Criteria andErestsfourNotBetween(String value1, String value2) {
            addCriterion("erestsfour not between", value1, value2, "erestsfour");
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