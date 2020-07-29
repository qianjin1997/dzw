package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CheckoutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckoutExample() {
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

        public Criteria andAlidIsNull() {
            addCriterion("alid is null");
            return (Criteria) this;
        }

        public Criteria andAlidIsNotNull() {
            addCriterion("alid is not null");
            return (Criteria) this;
        }

        public Criteria andAlidEqualTo(Integer value) {
            addCriterion("alid =", value, "alid");
            return (Criteria) this;
        }

        public Criteria andAlidNotEqualTo(Integer value) {
            addCriterion("alid <>", value, "alid");
            return (Criteria) this;
        }

        public Criteria andAlidGreaterThan(Integer value) {
            addCriterion("alid >", value, "alid");
            return (Criteria) this;
        }

        public Criteria andAlidGreaterThanOrEqualTo(Integer value) {
            addCriterion("alid >=", value, "alid");
            return (Criteria) this;
        }

        public Criteria andAlidLessThan(Integer value) {
            addCriterion("alid <", value, "alid");
            return (Criteria) this;
        }

        public Criteria andAlidLessThanOrEqualTo(Integer value) {
            addCriterion("alid <=", value, "alid");
            return (Criteria) this;
        }

        public Criteria andAlidIn(List<Integer> values) {
            addCriterion("alid in", values, "alid");
            return (Criteria) this;
        }

        public Criteria andAlidNotIn(List<Integer> values) {
            addCriterion("alid not in", values, "alid");
            return (Criteria) this;
        }

        public Criteria andAlidBetween(Integer value1, Integer value2) {
            addCriterion("alid between", value1, value2, "alid");
            return (Criteria) this;
        }

        public Criteria andAlidNotBetween(Integer value1, Integer value2) {
            addCriterion("alid not between", value1, value2, "alid");
            return (Criteria) this;
        }

        public Criteria andAlcaridIsNull() {
            addCriterion("alcarid is null");
            return (Criteria) this;
        }

        public Criteria andAlcaridIsNotNull() {
            addCriterion("alcarid is not null");
            return (Criteria) this;
        }

        public Criteria andAlcaridEqualTo(Integer value) {
            addCriterion("alcarid =", value, "alcarid");
            return (Criteria) this;
        }

        public Criteria andAlcaridNotEqualTo(Integer value) {
            addCriterion("alcarid <>", value, "alcarid");
            return (Criteria) this;
        }

        public Criteria andAlcaridGreaterThan(Integer value) {
            addCriterion("alcarid >", value, "alcarid");
            return (Criteria) this;
        }

        public Criteria andAlcaridGreaterThanOrEqualTo(Integer value) {
            addCriterion("alcarid >=", value, "alcarid");
            return (Criteria) this;
        }

        public Criteria andAlcaridLessThan(Integer value) {
            addCriterion("alcarid <", value, "alcarid");
            return (Criteria) this;
        }

        public Criteria andAlcaridLessThanOrEqualTo(Integer value) {
            addCriterion("alcarid <=", value, "alcarid");
            return (Criteria) this;
        }

        public Criteria andAlcaridIn(List<Integer> values) {
            addCriterion("alcarid in", values, "alcarid");
            return (Criteria) this;
        }

        public Criteria andAlcaridNotIn(List<Integer> values) {
            addCriterion("alcarid not in", values, "alcarid");
            return (Criteria) this;
        }

        public Criteria andAlcaridBetween(Integer value1, Integer value2) {
            addCriterion("alcarid between", value1, value2, "alcarid");
            return (Criteria) this;
        }

        public Criteria andAlcaridNotBetween(Integer value1, Integer value2) {
            addCriterion("alcarid not between", value1, value2, "alcarid");
            return (Criteria) this;
        }

        public Criteria andAlcarownernameIsNull() {
            addCriterion("alcarownername is null");
            return (Criteria) this;
        }

        public Criteria andAlcarownernameIsNotNull() {
            addCriterion("alcarownername is not null");
            return (Criteria) this;
        }

        public Criteria andAlcarownernameEqualTo(String value) {
            addCriterion("alcarownername =", value, "alcarownername");
            return (Criteria) this;
        }

        public Criteria andAlcarownernameNotEqualTo(String value) {
            addCriterion("alcarownername <>", value, "alcarownername");
            return (Criteria) this;
        }

        public Criteria andAlcarownernameGreaterThan(String value) {
            addCriterion("alcarownername >", value, "alcarownername");
            return (Criteria) this;
        }

        public Criteria andAlcarownernameGreaterThanOrEqualTo(String value) {
            addCriterion("alcarownername >=", value, "alcarownername");
            return (Criteria) this;
        }

        public Criteria andAlcarownernameLessThan(String value) {
            addCriterion("alcarownername <", value, "alcarownername");
            return (Criteria) this;
        }

        public Criteria andAlcarownernameLessThanOrEqualTo(String value) {
            addCriterion("alcarownername <=", value, "alcarownername");
            return (Criteria) this;
        }

        public Criteria andAlcarownernameLike(String value) {
            addCriterion("alcarownername like", value, "alcarownername");
            return (Criteria) this;
        }

        public Criteria andAlcarownernameNotLike(String value) {
            addCriterion("alcarownername not like", value, "alcarownername");
            return (Criteria) this;
        }

        public Criteria andAlcarownernameIn(List<String> values) {
            addCriterion("alcarownername in", values, "alcarownername");
            return (Criteria) this;
        }

        public Criteria andAlcarownernameNotIn(List<String> values) {
            addCriterion("alcarownername not in", values, "alcarownername");
            return (Criteria) this;
        }

        public Criteria andAlcarownernameBetween(String value1, String value2) {
            addCriterion("alcarownername between", value1, value2, "alcarownername");
            return (Criteria) this;
        }

        public Criteria andAlcarownernameNotBetween(String value1, String value2) {
            addCriterion("alcarownername not between", value1, value2, "alcarownername");
            return (Criteria) this;
        }

        public Criteria andAlbusinessidIsNull() {
            addCriterion("albusinessid is null");
            return (Criteria) this;
        }

        public Criteria andAlbusinessidIsNotNull() {
            addCriterion("albusinessid is not null");
            return (Criteria) this;
        }

        public Criteria andAlbusinessidEqualTo(Integer value) {
            addCriterion("albusinessid =", value, "albusinessid");
            return (Criteria) this;
        }

        public Criteria andAlbusinessidNotEqualTo(Integer value) {
            addCriterion("albusinessid <>", value, "albusinessid");
            return (Criteria) this;
        }

        public Criteria andAlbusinessidGreaterThan(Integer value) {
            addCriterion("albusinessid >", value, "albusinessid");
            return (Criteria) this;
        }

        public Criteria andAlbusinessidGreaterThanOrEqualTo(Integer value) {
            addCriterion("albusinessid >=", value, "albusinessid");
            return (Criteria) this;
        }

        public Criteria andAlbusinessidLessThan(Integer value) {
            addCriterion("albusinessid <", value, "albusinessid");
            return (Criteria) this;
        }

        public Criteria andAlbusinessidLessThanOrEqualTo(Integer value) {
            addCriterion("albusinessid <=", value, "albusinessid");
            return (Criteria) this;
        }

        public Criteria andAlbusinessidIn(List<Integer> values) {
            addCriterion("albusinessid in", values, "albusinessid");
            return (Criteria) this;
        }

        public Criteria andAlbusinessidNotIn(List<Integer> values) {
            addCriterion("albusinessid not in", values, "albusinessid");
            return (Criteria) this;
        }

        public Criteria andAlbusinessidBetween(Integer value1, Integer value2) {
            addCriterion("albusinessid between", value1, value2, "albusinessid");
            return (Criteria) this;
        }

        public Criteria andAlbusinessidNotBetween(Integer value1, Integer value2) {
            addCriterion("albusinessid not between", value1, value2, "albusinessid");
            return (Criteria) this;
        }

        public Criteria andAlclearingformIsNull() {
            addCriterion("alclearingform is null");
            return (Criteria) this;
        }

        public Criteria andAlclearingformIsNotNull() {
            addCriterion("alclearingform is not null");
            return (Criteria) this;
        }

        public Criteria andAlclearingformEqualTo(String value) {
            addCriterion("alclearingform =", value, "alclearingform");
            return (Criteria) this;
        }

        public Criteria andAlclearingformNotEqualTo(String value) {
            addCriterion("alclearingform <>", value, "alclearingform");
            return (Criteria) this;
        }

        public Criteria andAlclearingformGreaterThan(String value) {
            addCriterion("alclearingform >", value, "alclearingform");
            return (Criteria) this;
        }

        public Criteria andAlclearingformGreaterThanOrEqualTo(String value) {
            addCriterion("alclearingform >=", value, "alclearingform");
            return (Criteria) this;
        }

        public Criteria andAlclearingformLessThan(String value) {
            addCriterion("alclearingform <", value, "alclearingform");
            return (Criteria) this;
        }

        public Criteria andAlclearingformLessThanOrEqualTo(String value) {
            addCriterion("alclearingform <=", value, "alclearingform");
            return (Criteria) this;
        }

        public Criteria andAlclearingformLike(String value) {
            addCriterion("alclearingform like", value, "alclearingform");
            return (Criteria) this;
        }

        public Criteria andAlclearingformNotLike(String value) {
            addCriterion("alclearingform not like", value, "alclearingform");
            return (Criteria) this;
        }

        public Criteria andAlclearingformIn(List<String> values) {
            addCriterion("alclearingform in", values, "alclearingform");
            return (Criteria) this;
        }

        public Criteria andAlclearingformNotIn(List<String> values) {
            addCriterion("alclearingform not in", values, "alclearingform");
            return (Criteria) this;
        }

        public Criteria andAlclearingformBetween(String value1, String value2) {
            addCriterion("alclearingform between", value1, value2, "alclearingform");
            return (Criteria) this;
        }

        public Criteria andAlclearingformNotBetween(String value1, String value2) {
            addCriterion("alclearingform not between", value1, value2, "alclearingform");
            return (Criteria) this;
        }

        public Criteria andAldepartdateIsNull() {
            addCriterion("aldepartdate is null");
            return (Criteria) this;
        }

        public Criteria andAldepartdateIsNotNull() {
            addCriterion("aldepartdate is not null");
            return (Criteria) this;
        }

        public Criteria andAldepartdateEqualTo(Date value) {
            addCriterionForJDBCDate("aldepartdate =", value, "aldepartdate");
            return (Criteria) this;
        }

        public Criteria andAldepartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("aldepartdate <>", value, "aldepartdate");
            return (Criteria) this;
        }

        public Criteria andAldepartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("aldepartdate >", value, "aldepartdate");
            return (Criteria) this;
        }

        public Criteria andAldepartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("aldepartdate >=", value, "aldepartdate");
            return (Criteria) this;
        }

        public Criteria andAldepartdateLessThan(Date value) {
            addCriterionForJDBCDate("aldepartdate <", value, "aldepartdate");
            return (Criteria) this;
        }

        public Criteria andAldepartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("aldepartdate <=", value, "aldepartdate");
            return (Criteria) this;
        }

        public Criteria andAldepartdateIn(List<Date> values) {
            addCriterionForJDBCDate("aldepartdate in", values, "aldepartdate");
            return (Criteria) this;
        }

        public Criteria andAldepartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("aldepartdate not in", values, "aldepartdate");
            return (Criteria) this;
        }

        public Criteria andAldepartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("aldepartdate between", value1, value2, "aldepartdate");
            return (Criteria) this;
        }

        public Criteria andAldepartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("aldepartdate not between", value1, value2, "aldepartdate");
            return (Criteria) this;
        }

        public Criteria andAlroadworkdateIsNull() {
            addCriterion("alroadworkdate is null");
            return (Criteria) this;
        }

        public Criteria andAlroadworkdateIsNotNull() {
            addCriterion("alroadworkdate is not null");
            return (Criteria) this;
        }

        public Criteria andAlroadworkdateEqualTo(Date value) {
            addCriterionForJDBCDate("alroadworkdate =", value, "alroadworkdate");
            return (Criteria) this;
        }

        public Criteria andAlroadworkdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("alroadworkdate <>", value, "alroadworkdate");
            return (Criteria) this;
        }

        public Criteria andAlroadworkdateGreaterThan(Date value) {
            addCriterionForJDBCDate("alroadworkdate >", value, "alroadworkdate");
            return (Criteria) this;
        }

        public Criteria andAlroadworkdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("alroadworkdate >=", value, "alroadworkdate");
            return (Criteria) this;
        }

        public Criteria andAlroadworkdateLessThan(Date value) {
            addCriterionForJDBCDate("alroadworkdate <", value, "alroadworkdate");
            return (Criteria) this;
        }

        public Criteria andAlroadworkdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("alroadworkdate <=", value, "alroadworkdate");
            return (Criteria) this;
        }

        public Criteria andAlroadworkdateIn(List<Date> values) {
            addCriterionForJDBCDate("alroadworkdate in", values, "alroadworkdate");
            return (Criteria) this;
        }

        public Criteria andAlroadworkdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("alroadworkdate not in", values, "alroadworkdate");
            return (Criteria) this;
        }

        public Criteria andAlroadworkdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("alroadworkdate between", value1, value2, "alroadworkdate");
            return (Criteria) this;
        }

        public Criteria andAlroadworkdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("alroadworkdate not between", value1, value2, "alroadworkdate");
            return (Criteria) this;
        }

        public Criteria andAlestimatemoneyIsNull() {
            addCriterion("alestimatemoney is null");
            return (Criteria) this;
        }

        public Criteria andAlestimatemoneyIsNotNull() {
            addCriterion("alestimatemoney is not null");
            return (Criteria) this;
        }

        public Criteria andAlestimatemoneyEqualTo(Float value) {
            addCriterion("alestimatemoney =", value, "alestimatemoney");
            return (Criteria) this;
        }

        public Criteria andAlestimatemoneyNotEqualTo(Float value) {
            addCriterion("alestimatemoney <>", value, "alestimatemoney");
            return (Criteria) this;
        }

        public Criteria andAlestimatemoneyGreaterThan(Float value) {
            addCriterion("alestimatemoney >", value, "alestimatemoney");
            return (Criteria) this;
        }

        public Criteria andAlestimatemoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("alestimatemoney >=", value, "alestimatemoney");
            return (Criteria) this;
        }

        public Criteria andAlestimatemoneyLessThan(Float value) {
            addCriterion("alestimatemoney <", value, "alestimatemoney");
            return (Criteria) this;
        }

        public Criteria andAlestimatemoneyLessThanOrEqualTo(Float value) {
            addCriterion("alestimatemoney <=", value, "alestimatemoney");
            return (Criteria) this;
        }

        public Criteria andAlestimatemoneyIn(List<Float> values) {
            addCriterion("alestimatemoney in", values, "alestimatemoney");
            return (Criteria) this;
        }

        public Criteria andAlestimatemoneyNotIn(List<Float> values) {
            addCriterion("alestimatemoney not in", values, "alestimatemoney");
            return (Criteria) this;
        }

        public Criteria andAlestimatemoneyBetween(Float value1, Float value2) {
            addCriterion("alestimatemoney between", value1, value2, "alestimatemoney");
            return (Criteria) this;
        }

        public Criteria andAlestimatemoneyNotBetween(Float value1, Float value2) {
            addCriterion("alestimatemoney not between", value1, value2, "alestimatemoney");
            return (Criteria) this;
        }

        public Criteria andAldriveidIsNull() {
            addCriterion("aldriveid is null");
            return (Criteria) this;
        }

        public Criteria andAldriveidIsNotNull() {
            addCriterion("aldriveid is not null");
            return (Criteria) this;
        }

        public Criteria andAldriveidEqualTo(Integer value) {
            addCriterion("aldriveid =", value, "aldriveid");
            return (Criteria) this;
        }

        public Criteria andAldriveidNotEqualTo(Integer value) {
            addCriterion("aldriveid <>", value, "aldriveid");
            return (Criteria) this;
        }

        public Criteria andAldriveidGreaterThan(Integer value) {
            addCriterion("aldriveid >", value, "aldriveid");
            return (Criteria) this;
        }

        public Criteria andAldriveidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aldriveid >=", value, "aldriveid");
            return (Criteria) this;
        }

        public Criteria andAldriveidLessThan(Integer value) {
            addCriterion("aldriveid <", value, "aldriveid");
            return (Criteria) this;
        }

        public Criteria andAldriveidLessThanOrEqualTo(Integer value) {
            addCriterion("aldriveid <=", value, "aldriveid");
            return (Criteria) this;
        }

        public Criteria andAldriveidIn(List<Integer> values) {
            addCriterion("aldriveid in", values, "aldriveid");
            return (Criteria) this;
        }

        public Criteria andAldriveidNotIn(List<Integer> values) {
            addCriterion("aldriveid not in", values, "aldriveid");
            return (Criteria) this;
        }

        public Criteria andAldriveidBetween(Integer value1, Integer value2) {
            addCriterion("aldriveid between", value1, value2, "aldriveid");
            return (Criteria) this;
        }

        public Criteria andAldriveidNotBetween(Integer value1, Integer value2) {
            addCriterion("aldriveid not between", value1, value2, "aldriveid");
            return (Criteria) this;
        }

        public Criteria andAldivisionsIsNull() {
            addCriterion("aldivisions is null");
            return (Criteria) this;
        }

        public Criteria andAldivisionsIsNotNull() {
            addCriterion("aldivisions is not null");
            return (Criteria) this;
        }

        public Criteria andAldivisionsEqualTo(String value) {
            addCriterion("aldivisions =", value, "aldivisions");
            return (Criteria) this;
        }

        public Criteria andAldivisionsNotEqualTo(String value) {
            addCriterion("aldivisions <>", value, "aldivisions");
            return (Criteria) this;
        }

        public Criteria andAldivisionsGreaterThan(String value) {
            addCriterion("aldivisions >", value, "aldivisions");
            return (Criteria) this;
        }

        public Criteria andAldivisionsGreaterThanOrEqualTo(String value) {
            addCriterion("aldivisions >=", value, "aldivisions");
            return (Criteria) this;
        }

        public Criteria andAldivisionsLessThan(String value) {
            addCriterion("aldivisions <", value, "aldivisions");
            return (Criteria) this;
        }

        public Criteria andAldivisionsLessThanOrEqualTo(String value) {
            addCriterion("aldivisions <=", value, "aldivisions");
            return (Criteria) this;
        }

        public Criteria andAldivisionsLike(String value) {
            addCriterion("aldivisions like", value, "aldivisions");
            return (Criteria) this;
        }

        public Criteria andAldivisionsNotLike(String value) {
            addCriterion("aldivisions not like", value, "aldivisions");
            return (Criteria) this;
        }

        public Criteria andAldivisionsIn(List<String> values) {
            addCriterion("aldivisions in", values, "aldivisions");
            return (Criteria) this;
        }

        public Criteria andAldivisionsNotIn(List<String> values) {
            addCriterion("aldivisions not in", values, "aldivisions");
            return (Criteria) this;
        }

        public Criteria andAldivisionsBetween(String value1, String value2) {
            addCriterion("aldivisions between", value1, value2, "aldivisions");
            return (Criteria) this;
        }

        public Criteria andAldivisionsNotBetween(String value1, String value2) {
            addCriterion("aldivisions not between", value1, value2, "aldivisions");
            return (Criteria) this;
        }

        public Criteria andAlpkcompanyIsNull() {
            addCriterion("alpkcompany is null");
            return (Criteria) this;
        }

        public Criteria andAlpkcompanyIsNotNull() {
            addCriterion("alpkcompany is not null");
            return (Criteria) this;
        }

        public Criteria andAlpkcompanyEqualTo(String value) {
            addCriterion("alpkcompany =", value, "alpkcompany");
            return (Criteria) this;
        }

        public Criteria andAlpkcompanyNotEqualTo(String value) {
            addCriterion("alpkcompany <>", value, "alpkcompany");
            return (Criteria) this;
        }

        public Criteria andAlpkcompanyGreaterThan(String value) {
            addCriterion("alpkcompany >", value, "alpkcompany");
            return (Criteria) this;
        }

        public Criteria andAlpkcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("alpkcompany >=", value, "alpkcompany");
            return (Criteria) this;
        }

        public Criteria andAlpkcompanyLessThan(String value) {
            addCriterion("alpkcompany <", value, "alpkcompany");
            return (Criteria) this;
        }

        public Criteria andAlpkcompanyLessThanOrEqualTo(String value) {
            addCriterion("alpkcompany <=", value, "alpkcompany");
            return (Criteria) this;
        }

        public Criteria andAlpkcompanyLike(String value) {
            addCriterion("alpkcompany like", value, "alpkcompany");
            return (Criteria) this;
        }

        public Criteria andAlpkcompanyNotLike(String value) {
            addCriterion("alpkcompany not like", value, "alpkcompany");
            return (Criteria) this;
        }

        public Criteria andAlpkcompanyIn(List<String> values) {
            addCriterion("alpkcompany in", values, "alpkcompany");
            return (Criteria) this;
        }

        public Criteria andAlpkcompanyNotIn(List<String> values) {
            addCriterion("alpkcompany not in", values, "alpkcompany");
            return (Criteria) this;
        }

        public Criteria andAlpkcompanyBetween(String value1, String value2) {
            addCriterion("alpkcompany between", value1, value2, "alpkcompany");
            return (Criteria) this;
        }

        public Criteria andAlpkcompanyNotBetween(String value1, String value2) {
            addCriterion("alpkcompany not between", value1, value2, "alpkcompany");
            return (Criteria) this;
        }

        public Criteria andAldepartaddressIsNull() {
            addCriterion("aldepartaddress is null");
            return (Criteria) this;
        }

        public Criteria andAldepartaddressIsNotNull() {
            addCriterion("aldepartaddress is not null");
            return (Criteria) this;
        }

        public Criteria andAldepartaddressEqualTo(String value) {
            addCriterion("aldepartaddress =", value, "aldepartaddress");
            return (Criteria) this;
        }

        public Criteria andAldepartaddressNotEqualTo(String value) {
            addCriterion("aldepartaddress <>", value, "aldepartaddress");
            return (Criteria) this;
        }

        public Criteria andAldepartaddressGreaterThan(String value) {
            addCriterion("aldepartaddress >", value, "aldepartaddress");
            return (Criteria) this;
        }

        public Criteria andAldepartaddressGreaterThanOrEqualTo(String value) {
            addCriterion("aldepartaddress >=", value, "aldepartaddress");
            return (Criteria) this;
        }

        public Criteria andAldepartaddressLessThan(String value) {
            addCriterion("aldepartaddress <", value, "aldepartaddress");
            return (Criteria) this;
        }

        public Criteria andAldepartaddressLessThanOrEqualTo(String value) {
            addCriterion("aldepartaddress <=", value, "aldepartaddress");
            return (Criteria) this;
        }

        public Criteria andAldepartaddressLike(String value) {
            addCriterion("aldepartaddress like", value, "aldepartaddress");
            return (Criteria) this;
        }

        public Criteria andAldepartaddressNotLike(String value) {
            addCriterion("aldepartaddress not like", value, "aldepartaddress");
            return (Criteria) this;
        }

        public Criteria andAldepartaddressIn(List<String> values) {
            addCriterion("aldepartaddress in", values, "aldepartaddress");
            return (Criteria) this;
        }

        public Criteria andAldepartaddressNotIn(List<String> values) {
            addCriterion("aldepartaddress not in", values, "aldepartaddress");
            return (Criteria) this;
        }

        public Criteria andAldepartaddressBetween(String value1, String value2) {
            addCriterion("aldepartaddress between", value1, value2, "aldepartaddress");
            return (Criteria) this;
        }

        public Criteria andAldepartaddressNotBetween(String value1, String value2) {
            addCriterion("aldepartaddress not between", value1, value2, "aldepartaddress");
            return (Criteria) this;
        }

        public Criteria andAlrescueaddressIsNull() {
            addCriterion("alrescueaddress is null");
            return (Criteria) this;
        }

        public Criteria andAlrescueaddressIsNotNull() {
            addCriterion("alrescueaddress is not null");
            return (Criteria) this;
        }

        public Criteria andAlrescueaddressEqualTo(String value) {
            addCriterion("alrescueaddress =", value, "alrescueaddress");
            return (Criteria) this;
        }

        public Criteria andAlrescueaddressNotEqualTo(String value) {
            addCriterion("alrescueaddress <>", value, "alrescueaddress");
            return (Criteria) this;
        }

        public Criteria andAlrescueaddressGreaterThan(String value) {
            addCriterion("alrescueaddress >", value, "alrescueaddress");
            return (Criteria) this;
        }

        public Criteria andAlrescueaddressGreaterThanOrEqualTo(String value) {
            addCriterion("alrescueaddress >=", value, "alrescueaddress");
            return (Criteria) this;
        }

        public Criteria andAlrescueaddressLessThan(String value) {
            addCriterion("alrescueaddress <", value, "alrescueaddress");
            return (Criteria) this;
        }

        public Criteria andAlrescueaddressLessThanOrEqualTo(String value) {
            addCriterion("alrescueaddress <=", value, "alrescueaddress");
            return (Criteria) this;
        }

        public Criteria andAlrescueaddressLike(String value) {
            addCriterion("alrescueaddress like", value, "alrescueaddress");
            return (Criteria) this;
        }

        public Criteria andAlrescueaddressNotLike(String value) {
            addCriterion("alrescueaddress not like", value, "alrescueaddress");
            return (Criteria) this;
        }

        public Criteria andAlrescueaddressIn(List<String> values) {
            addCriterion("alrescueaddress in", values, "alrescueaddress");
            return (Criteria) this;
        }

        public Criteria andAlrescueaddressNotIn(List<String> values) {
            addCriterion("alrescueaddress not in", values, "alrescueaddress");
            return (Criteria) this;
        }

        public Criteria andAlrescueaddressBetween(String value1, String value2) {
            addCriterion("alrescueaddress between", value1, value2, "alrescueaddress");
            return (Criteria) this;
        }

        public Criteria andAlrescueaddressNotBetween(String value1, String value2) {
            addCriterion("alrescueaddress not between", value1, value2, "alrescueaddress");
            return (Criteria) this;
        }

        public Criteria andAlwxremakeIsNull() {
            addCriterion("alwxremake is null");
            return (Criteria) this;
        }

        public Criteria andAlwxremakeIsNotNull() {
            addCriterion("alwxremake is not null");
            return (Criteria) this;
        }

        public Criteria andAlwxremakeEqualTo(String value) {
            addCriterion("alwxremake =", value, "alwxremake");
            return (Criteria) this;
        }

        public Criteria andAlwxremakeNotEqualTo(String value) {
            addCriterion("alwxremake <>", value, "alwxremake");
            return (Criteria) this;
        }

        public Criteria andAlwxremakeGreaterThan(String value) {
            addCriterion("alwxremake >", value, "alwxremake");
            return (Criteria) this;
        }

        public Criteria andAlwxremakeGreaterThanOrEqualTo(String value) {
            addCriterion("alwxremake >=", value, "alwxremake");
            return (Criteria) this;
        }

        public Criteria andAlwxremakeLessThan(String value) {
            addCriterion("alwxremake <", value, "alwxremake");
            return (Criteria) this;
        }

        public Criteria andAlwxremakeLessThanOrEqualTo(String value) {
            addCriterion("alwxremake <=", value, "alwxremake");
            return (Criteria) this;
        }

        public Criteria andAlwxremakeLike(String value) {
            addCriterion("alwxremake like", value, "alwxremake");
            return (Criteria) this;
        }

        public Criteria andAlwxremakeNotLike(String value) {
            addCriterion("alwxremake not like", value, "alwxremake");
            return (Criteria) this;
        }

        public Criteria andAlwxremakeIn(List<String> values) {
            addCriterion("alwxremake in", values, "alwxremake");
            return (Criteria) this;
        }

        public Criteria andAlwxremakeNotIn(List<String> values) {
            addCriterion("alwxremake not in", values, "alwxremake");
            return (Criteria) this;
        }

        public Criteria andAlwxremakeBetween(String value1, String value2) {
            addCriterion("alwxremake between", value1, value2, "alwxremake");
            return (Criteria) this;
        }

        public Criteria andAlwxremakeNotBetween(String value1, String value2) {
            addCriterion("alwxremake not between", value1, value2, "alwxremake");
            return (Criteria) this;
        }

        public Criteria andAlphoneIsNull() {
            addCriterion("alphone is null");
            return (Criteria) this;
        }

        public Criteria andAlphoneIsNotNull() {
            addCriterion("alphone is not null");
            return (Criteria) this;
        }

        public Criteria andAlphoneEqualTo(String value) {
            addCriterion("alphone =", value, "alphone");
            return (Criteria) this;
        }

        public Criteria andAlphoneNotEqualTo(String value) {
            addCriterion("alphone <>", value, "alphone");
            return (Criteria) this;
        }

        public Criteria andAlphoneGreaterThan(String value) {
            addCriterion("alphone >", value, "alphone");
            return (Criteria) this;
        }

        public Criteria andAlphoneGreaterThanOrEqualTo(String value) {
            addCriterion("alphone >=", value, "alphone");
            return (Criteria) this;
        }

        public Criteria andAlphoneLessThan(String value) {
            addCriterion("alphone <", value, "alphone");
            return (Criteria) this;
        }

        public Criteria andAlphoneLessThanOrEqualTo(String value) {
            addCriterion("alphone <=", value, "alphone");
            return (Criteria) this;
        }

        public Criteria andAlphoneLike(String value) {
            addCriterion("alphone like", value, "alphone");
            return (Criteria) this;
        }

        public Criteria andAlphoneNotLike(String value) {
            addCriterion("alphone not like", value, "alphone");
            return (Criteria) this;
        }

        public Criteria andAlphoneIn(List<String> values) {
            addCriterion("alphone in", values, "alphone");
            return (Criteria) this;
        }

        public Criteria andAlphoneNotIn(List<String> values) {
            addCriterion("alphone not in", values, "alphone");
            return (Criteria) this;
        }

        public Criteria andAlphoneBetween(String value1, String value2) {
            addCriterion("alphone between", value1, value2, "alphone");
            return (Criteria) this;
        }

        public Criteria andAlphoneNotBetween(String value1, String value2) {
            addCriterion("alphone not between", value1, value2, "alphone");
            return (Criteria) this;
        }

        public Criteria andAlthemileageIsNull() {
            addCriterion("althemileage is null");
            return (Criteria) this;
        }

        public Criteria andAlthemileageIsNotNull() {
            addCriterion("althemileage is not null");
            return (Criteria) this;
        }

        public Criteria andAlthemileageEqualTo(Integer value) {
            addCriterion("althemileage =", value, "althemileage");
            return (Criteria) this;
        }

        public Criteria andAlthemileageNotEqualTo(Integer value) {
            addCriterion("althemileage <>", value, "althemileage");
            return (Criteria) this;
        }

        public Criteria andAlthemileageGreaterThan(Integer value) {
            addCriterion("althemileage >", value, "althemileage");
            return (Criteria) this;
        }

        public Criteria andAlthemileageGreaterThanOrEqualTo(Integer value) {
            addCriterion("althemileage >=", value, "althemileage");
            return (Criteria) this;
        }

        public Criteria andAlthemileageLessThan(Integer value) {
            addCriterion("althemileage <", value, "althemileage");
            return (Criteria) this;
        }

        public Criteria andAlthemileageLessThanOrEqualTo(Integer value) {
            addCriterion("althemileage <=", value, "althemileage");
            return (Criteria) this;
        }

        public Criteria andAlthemileageIn(List<Integer> values) {
            addCriterion("althemileage in", values, "althemileage");
            return (Criteria) this;
        }

        public Criteria andAlthemileageNotIn(List<Integer> values) {
            addCriterion("althemileage not in", values, "althemileage");
            return (Criteria) this;
        }

        public Criteria andAlthemileageBetween(Integer value1, Integer value2) {
            addCriterion("althemileage between", value1, value2, "althemileage");
            return (Criteria) this;
        }

        public Criteria andAlthemileageNotBetween(Integer value1, Integer value2) {
            addCriterion("althemileage not between", value1, value2, "althemileage");
            return (Criteria) this;
        }

        public Criteria andAldrivecarIsNull() {
            addCriterion("aldrivecar is null");
            return (Criteria) this;
        }

        public Criteria andAldrivecarIsNotNull() {
            addCriterion("aldrivecar is not null");
            return (Criteria) this;
        }

        public Criteria andAldrivecarEqualTo(String value) {
            addCriterion("aldrivecar =", value, "aldrivecar");
            return (Criteria) this;
        }

        public Criteria andAldrivecarNotEqualTo(String value) {
            addCriterion("aldrivecar <>", value, "aldrivecar");
            return (Criteria) this;
        }

        public Criteria andAldrivecarGreaterThan(String value) {
            addCriterion("aldrivecar >", value, "aldrivecar");
            return (Criteria) this;
        }

        public Criteria andAldrivecarGreaterThanOrEqualTo(String value) {
            addCriterion("aldrivecar >=", value, "aldrivecar");
            return (Criteria) this;
        }

        public Criteria andAldrivecarLessThan(String value) {
            addCriterion("aldrivecar <", value, "aldrivecar");
            return (Criteria) this;
        }

        public Criteria andAldrivecarLessThanOrEqualTo(String value) {
            addCriterion("aldrivecar <=", value, "aldrivecar");
            return (Criteria) this;
        }

        public Criteria andAldrivecarLike(String value) {
            addCriterion("aldrivecar like", value, "aldrivecar");
            return (Criteria) this;
        }

        public Criteria andAldrivecarNotLike(String value) {
            addCriterion("aldrivecar not like", value, "aldrivecar");
            return (Criteria) this;
        }

        public Criteria andAldrivecarIn(List<String> values) {
            addCriterion("aldrivecar in", values, "aldrivecar");
            return (Criteria) this;
        }

        public Criteria andAldrivecarNotIn(List<String> values) {
            addCriterion("aldrivecar not in", values, "aldrivecar");
            return (Criteria) this;
        }

        public Criteria andAldrivecarBetween(String value1, String value2) {
            addCriterion("aldrivecar between", value1, value2, "aldrivecar");
            return (Criteria) this;
        }

        public Criteria andAldrivecarNotBetween(String value1, String value2) {
            addCriterion("aldrivecar not between", value1, value2, "aldrivecar");
            return (Criteria) this;
        }

        public Criteria andAlcrewIsNull() {
            addCriterion("alcrew is null");
            return (Criteria) this;
        }

        public Criteria andAlcrewIsNotNull() {
            addCriterion("alcrew is not null");
            return (Criteria) this;
        }

        public Criteria andAlcrewEqualTo(String value) {
            addCriterion("alcrew =", value, "alcrew");
            return (Criteria) this;
        }

        public Criteria andAlcrewNotEqualTo(String value) {
            addCriterion("alcrew <>", value, "alcrew");
            return (Criteria) this;
        }

        public Criteria andAlcrewGreaterThan(String value) {
            addCriterion("alcrew >", value, "alcrew");
            return (Criteria) this;
        }

        public Criteria andAlcrewGreaterThanOrEqualTo(String value) {
            addCriterion("alcrew >=", value, "alcrew");
            return (Criteria) this;
        }

        public Criteria andAlcrewLessThan(String value) {
            addCriterion("alcrew <", value, "alcrew");
            return (Criteria) this;
        }

        public Criteria andAlcrewLessThanOrEqualTo(String value) {
            addCriterion("alcrew <=", value, "alcrew");
            return (Criteria) this;
        }

        public Criteria andAlcrewLike(String value) {
            addCriterion("alcrew like", value, "alcrew");
            return (Criteria) this;
        }

        public Criteria andAlcrewNotLike(String value) {
            addCriterion("alcrew not like", value, "alcrew");
            return (Criteria) this;
        }

        public Criteria andAlcrewIn(List<String> values) {
            addCriterion("alcrew in", values, "alcrew");
            return (Criteria) this;
        }

        public Criteria andAlcrewNotIn(List<String> values) {
            addCriterion("alcrew not in", values, "alcrew");
            return (Criteria) this;
        }

        public Criteria andAlcrewBetween(String value1, String value2) {
            addCriterion("alcrew between", value1, value2, "alcrew");
            return (Criteria) this;
        }

        public Criteria andAlcrewNotBetween(String value1, String value2) {
            addCriterion("alcrew not between", value1, value2, "alcrew");
            return (Criteria) this;
        }

        public Criteria andAlstaffidIsNull() {
            addCriterion("alstaffid is null");
            return (Criteria) this;
        }

        public Criteria andAlstaffidIsNotNull() {
            addCriterion("alstaffid is not null");
            return (Criteria) this;
        }

        public Criteria andAlstaffidEqualTo(Integer value) {
            addCriterion("alstaffid =", value, "alstaffid");
            return (Criteria) this;
        }

        public Criteria andAlstaffidNotEqualTo(Integer value) {
            addCriterion("alstaffid <>", value, "alstaffid");
            return (Criteria) this;
        }

        public Criteria andAlstaffidGreaterThan(Integer value) {
            addCriterion("alstaffid >", value, "alstaffid");
            return (Criteria) this;
        }

        public Criteria andAlstaffidGreaterThanOrEqualTo(Integer value) {
            addCriterion("alstaffid >=", value, "alstaffid");
            return (Criteria) this;
        }

        public Criteria andAlstaffidLessThan(Integer value) {
            addCriterion("alstaffid <", value, "alstaffid");
            return (Criteria) this;
        }

        public Criteria andAlstaffidLessThanOrEqualTo(Integer value) {
            addCriterion("alstaffid <=", value, "alstaffid");
            return (Criteria) this;
        }

        public Criteria andAlstaffidIn(List<Integer> values) {
            addCriterion("alstaffid in", values, "alstaffid");
            return (Criteria) this;
        }

        public Criteria andAlstaffidNotIn(List<Integer> values) {
            addCriterion("alstaffid not in", values, "alstaffid");
            return (Criteria) this;
        }

        public Criteria andAlstaffidBetween(Integer value1, Integer value2) {
            addCriterion("alstaffid between", value1, value2, "alstaffid");
            return (Criteria) this;
        }

        public Criteria andAlstaffidNotBetween(Integer value1, Integer value2) {
            addCriterion("alstaffid not between", value1, value2, "alstaffid");
            return (Criteria) this;
        }

        public Criteria andAldispatchdateIsNull() {
            addCriterion("aldispatchdate is null");
            return (Criteria) this;
        }

        public Criteria andAldispatchdateIsNotNull() {
            addCriterion("aldispatchdate is not null");
            return (Criteria) this;
        }

        public Criteria andAldispatchdateEqualTo(Date value) {
            addCriterionForJDBCDate("aldispatchdate =", value, "aldispatchdate");
            return (Criteria) this;
        }

        public Criteria andAldispatchdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("aldispatchdate <>", value, "aldispatchdate");
            return (Criteria) this;
        }

        public Criteria andAldispatchdateGreaterThan(Date value) {
            addCriterionForJDBCDate("aldispatchdate >", value, "aldispatchdate");
            return (Criteria) this;
        }

        public Criteria andAldispatchdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("aldispatchdate >=", value, "aldispatchdate");
            return (Criteria) this;
        }

        public Criteria andAldispatchdateLessThan(Date value) {
            addCriterionForJDBCDate("aldispatchdate <", value, "aldispatchdate");
            return (Criteria) this;
        }

        public Criteria andAldispatchdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("aldispatchdate <=", value, "aldispatchdate");
            return (Criteria) this;
        }

        public Criteria andAldispatchdateIn(List<Date> values) {
            addCriterionForJDBCDate("aldispatchdate in", values, "aldispatchdate");
            return (Criteria) this;
        }

        public Criteria andAldispatchdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("aldispatchdate not in", values, "aldispatchdate");
            return (Criteria) this;
        }

        public Criteria andAldispatchdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("aldispatchdate between", value1, value2, "aldispatchdate");
            return (Criteria) this;
        }

        public Criteria andAldispatchdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("aldispatchdate not between", value1, value2, "aldispatchdate");
            return (Criteria) this;
        }

        public Criteria andAlrangeIsNull() {
            addCriterion("alrange is null");
            return (Criteria) this;
        }

        public Criteria andAlrangeIsNotNull() {
            addCriterion("alrange is not null");
            return (Criteria) this;
        }

        public Criteria andAlrangeEqualTo(Integer value) {
            addCriterion("alrange =", value, "alrange");
            return (Criteria) this;
        }

        public Criteria andAlrangeNotEqualTo(Integer value) {
            addCriterion("alrange <>", value, "alrange");
            return (Criteria) this;
        }

        public Criteria andAlrangeGreaterThan(Integer value) {
            addCriterion("alrange >", value, "alrange");
            return (Criteria) this;
        }

        public Criteria andAlrangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("alrange >=", value, "alrange");
            return (Criteria) this;
        }

        public Criteria andAlrangeLessThan(Integer value) {
            addCriterion("alrange <", value, "alrange");
            return (Criteria) this;
        }

        public Criteria andAlrangeLessThanOrEqualTo(Integer value) {
            addCriterion("alrange <=", value, "alrange");
            return (Criteria) this;
        }

        public Criteria andAlrangeIn(List<Integer> values) {
            addCriterion("alrange in", values, "alrange");
            return (Criteria) this;
        }

        public Criteria andAlrangeNotIn(List<Integer> values) {
            addCriterion("alrange not in", values, "alrange");
            return (Criteria) this;
        }

        public Criteria andAlrangeBetween(Integer value1, Integer value2) {
            addCriterion("alrange between", value1, value2, "alrange");
            return (Criteria) this;
        }

        public Criteria andAlrangeNotBetween(Integer value1, Integer value2) {
            addCriterion("alrange not between", value1, value2, "alrange");
            return (Criteria) this;
        }

        public Criteria andAlcompletedateIsNull() {
            addCriterion("alcompletedate is null");
            return (Criteria) this;
        }

        public Criteria andAlcompletedateIsNotNull() {
            addCriterion("alcompletedate is not null");
            return (Criteria) this;
        }

        public Criteria andAlcompletedateEqualTo(Date value) {
            addCriterionForJDBCDate("alcompletedate =", value, "alcompletedate");
            return (Criteria) this;
        }

        public Criteria andAlcompletedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("alcompletedate <>", value, "alcompletedate");
            return (Criteria) this;
        }

        public Criteria andAlcompletedateGreaterThan(Date value) {
            addCriterionForJDBCDate("alcompletedate >", value, "alcompletedate");
            return (Criteria) this;
        }

        public Criteria andAlcompletedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("alcompletedate >=", value, "alcompletedate");
            return (Criteria) this;
        }

        public Criteria andAlcompletedateLessThan(Date value) {
            addCriterionForJDBCDate("alcompletedate <", value, "alcompletedate");
            return (Criteria) this;
        }

        public Criteria andAlcompletedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("alcompletedate <=", value, "alcompletedate");
            return (Criteria) this;
        }

        public Criteria andAlcompletedateIn(List<Date> values) {
            addCriterionForJDBCDate("alcompletedate in", values, "alcompletedate");
            return (Criteria) this;
        }

        public Criteria andAlcompletedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("alcompletedate not in", values, "alcompletedate");
            return (Criteria) this;
        }

        public Criteria andAlcompletedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("alcompletedate between", value1, value2, "alcompletedate");
            return (Criteria) this;
        }

        public Criteria andAlcompletedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("alcompletedate not between", value1, value2, "alcompletedate");
            return (Criteria) this;
        }

        public Criteria andAlstatementIsNull() {
            addCriterion("alstatement is null");
            return (Criteria) this;
        }

        public Criteria andAlstatementIsNotNull() {
            addCriterion("alstatement is not null");
            return (Criteria) this;
        }

        public Criteria andAlstatementEqualTo(String value) {
            addCriterion("alstatement =", value, "alstatement");
            return (Criteria) this;
        }

        public Criteria andAlstatementNotEqualTo(String value) {
            addCriterion("alstatement <>", value, "alstatement");
            return (Criteria) this;
        }

        public Criteria andAlstatementGreaterThan(String value) {
            addCriterion("alstatement >", value, "alstatement");
            return (Criteria) this;
        }

        public Criteria andAlstatementGreaterThanOrEqualTo(String value) {
            addCriterion("alstatement >=", value, "alstatement");
            return (Criteria) this;
        }

        public Criteria andAlstatementLessThan(String value) {
            addCriterion("alstatement <", value, "alstatement");
            return (Criteria) this;
        }

        public Criteria andAlstatementLessThanOrEqualTo(String value) {
            addCriterion("alstatement <=", value, "alstatement");
            return (Criteria) this;
        }

        public Criteria andAlstatementLike(String value) {
            addCriterion("alstatement like", value, "alstatement");
            return (Criteria) this;
        }

        public Criteria andAlstatementNotLike(String value) {
            addCriterion("alstatement not like", value, "alstatement");
            return (Criteria) this;
        }

        public Criteria andAlstatementIn(List<String> values) {
            addCriterion("alstatement in", values, "alstatement");
            return (Criteria) this;
        }

        public Criteria andAlstatementNotIn(List<String> values) {
            addCriterion("alstatement not in", values, "alstatement");
            return (Criteria) this;
        }

        public Criteria andAlstatementBetween(String value1, String value2) {
            addCriterion("alstatement between", value1, value2, "alstatement");
            return (Criteria) this;
        }

        public Criteria andAlstatementNotBetween(String value1, String value2) {
            addCriterion("alstatement not between", value1, value2, "alstatement");
            return (Criteria) this;
        }

        public Criteria andAliscompleteIsNull() {
            addCriterion("aliscomplete is null");
            return (Criteria) this;
        }

        public Criteria andAliscompleteIsNotNull() {
            addCriterion("aliscomplete is not null");
            return (Criteria) this;
        }

        public Criteria andAliscompleteEqualTo(Integer value) {
            addCriterion("aliscomplete =", value, "aliscomplete");
            return (Criteria) this;
        }

        public Criteria andAliscompleteNotEqualTo(Integer value) {
            addCriterion("aliscomplete <>", value, "aliscomplete");
            return (Criteria) this;
        }

        public Criteria andAliscompleteGreaterThan(Integer value) {
            addCriterion("aliscomplete >", value, "aliscomplete");
            return (Criteria) this;
        }

        public Criteria andAliscompleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("aliscomplete >=", value, "aliscomplete");
            return (Criteria) this;
        }

        public Criteria andAliscompleteLessThan(Integer value) {
            addCriterion("aliscomplete <", value, "aliscomplete");
            return (Criteria) this;
        }

        public Criteria andAliscompleteLessThanOrEqualTo(Integer value) {
            addCriterion("aliscomplete <=", value, "aliscomplete");
            return (Criteria) this;
        }

        public Criteria andAliscompleteIn(List<Integer> values) {
            addCriterion("aliscomplete in", values, "aliscomplete");
            return (Criteria) this;
        }

        public Criteria andAliscompleteNotIn(List<Integer> values) {
            addCriterion("aliscomplete not in", values, "aliscomplete");
            return (Criteria) this;
        }

        public Criteria andAliscompleteBetween(Integer value1, Integer value2) {
            addCriterion("aliscomplete between", value1, value2, "aliscomplete");
            return (Criteria) this;
        }

        public Criteria andAliscompleteNotBetween(Integer value1, Integer value2) {
            addCriterion("aliscomplete not between", value1, value2, "aliscomplete");
            return (Criteria) this;
        }

        public Criteria andAlweidanIsNull() {
            addCriterion("alweidan is null");
            return (Criteria) this;
        }

        public Criteria andAlweidanIsNotNull() {
            addCriterion("alweidan is not null");
            return (Criteria) this;
        }

        public Criteria andAlweidanEqualTo(String value) {
            addCriterion("alweidan =", value, "alweidan");
            return (Criteria) this;
        }

        public Criteria andAlweidanNotEqualTo(String value) {
            addCriterion("alweidan <>", value, "alweidan");
            return (Criteria) this;
        }

        public Criteria andAlweidanGreaterThan(String value) {
            addCriterion("alweidan >", value, "alweidan");
            return (Criteria) this;
        }

        public Criteria andAlweidanGreaterThanOrEqualTo(String value) {
            addCriterion("alweidan >=", value, "alweidan");
            return (Criteria) this;
        }

        public Criteria andAlweidanLessThan(String value) {
            addCriterion("alweidan <", value, "alweidan");
            return (Criteria) this;
        }

        public Criteria andAlweidanLessThanOrEqualTo(String value) {
            addCriterion("alweidan <=", value, "alweidan");
            return (Criteria) this;
        }

        public Criteria andAlweidanLike(String value) {
            addCriterion("alweidan like", value, "alweidan");
            return (Criteria) this;
        }

        public Criteria andAlweidanNotLike(String value) {
            addCriterion("alweidan not like", value, "alweidan");
            return (Criteria) this;
        }

        public Criteria andAlweidanIn(List<String> values) {
            addCriterion("alweidan in", values, "alweidan");
            return (Criteria) this;
        }

        public Criteria andAlweidanNotIn(List<String> values) {
            addCriterion("alweidan not in", values, "alweidan");
            return (Criteria) this;
        }

        public Criteria andAlweidanBetween(String value1, String value2) {
            addCriterion("alweidan between", value1, value2, "alweidan");
            return (Criteria) this;
        }

        public Criteria andAlweidanNotBetween(String value1, String value2) {
            addCriterion("alweidan not between", value1, value2, "alweidan");
            return (Criteria) this;
        }

        public Criteria andAldantypeIsNull() {
            addCriterion("aldantype is null");
            return (Criteria) this;
        }

        public Criteria andAldantypeIsNotNull() {
            addCriterion("aldantype is not null");
            return (Criteria) this;
        }

        public Criteria andAldantypeEqualTo(String value) {
            addCriterion("aldantype =", value, "aldantype");
            return (Criteria) this;
        }

        public Criteria andAldantypeNotEqualTo(String value) {
            addCriterion("aldantype <>", value, "aldantype");
            return (Criteria) this;
        }

        public Criteria andAldantypeGreaterThan(String value) {
            addCriterion("aldantype >", value, "aldantype");
            return (Criteria) this;
        }

        public Criteria andAldantypeGreaterThanOrEqualTo(String value) {
            addCriterion("aldantype >=", value, "aldantype");
            return (Criteria) this;
        }

        public Criteria andAldantypeLessThan(String value) {
            addCriterion("aldantype <", value, "aldantype");
            return (Criteria) this;
        }

        public Criteria andAldantypeLessThanOrEqualTo(String value) {
            addCriterion("aldantype <=", value, "aldantype");
            return (Criteria) this;
        }

        public Criteria andAldantypeLike(String value) {
            addCriterion("aldantype like", value, "aldantype");
            return (Criteria) this;
        }

        public Criteria andAldantypeNotLike(String value) {
            addCriterion("aldantype not like", value, "aldantype");
            return (Criteria) this;
        }

        public Criteria andAldantypeIn(List<String> values) {
            addCriterion("aldantype in", values, "aldantype");
            return (Criteria) this;
        }

        public Criteria andAldantypeNotIn(List<String> values) {
            addCriterion("aldantype not in", values, "aldantype");
            return (Criteria) this;
        }

        public Criteria andAldantypeBetween(String value1, String value2) {
            addCriterion("aldantype between", value1, value2, "aldantype");
            return (Criteria) this;
        }

        public Criteria andAldantypeNotBetween(String value1, String value2) {
            addCriterion("aldantype not between", value1, value2, "aldantype");
            return (Criteria) this;
        }

        public Criteria andAlwugongIsNull() {
            addCriterion("alwugong is null");
            return (Criteria) this;
        }

        public Criteria andAlwugongIsNotNull() {
            addCriterion("alwugong is not null");
            return (Criteria) this;
        }

        public Criteria andAlwugongEqualTo(String value) {
            addCriterion("alwugong =", value, "alwugong");
            return (Criteria) this;
        }

        public Criteria andAlwugongNotEqualTo(String value) {
            addCriterion("alwugong <>", value, "alwugong");
            return (Criteria) this;
        }

        public Criteria andAlwugongGreaterThan(String value) {
            addCriterion("alwugong >", value, "alwugong");
            return (Criteria) this;
        }

        public Criteria andAlwugongGreaterThanOrEqualTo(String value) {
            addCriterion("alwugong >=", value, "alwugong");
            return (Criteria) this;
        }

        public Criteria andAlwugongLessThan(String value) {
            addCriterion("alwugong <", value, "alwugong");
            return (Criteria) this;
        }

        public Criteria andAlwugongLessThanOrEqualTo(String value) {
            addCriterion("alwugong <=", value, "alwugong");
            return (Criteria) this;
        }

        public Criteria andAlwugongLike(String value) {
            addCriterion("alwugong like", value, "alwugong");
            return (Criteria) this;
        }

        public Criteria andAlwugongNotLike(String value) {
            addCriterion("alwugong not like", value, "alwugong");
            return (Criteria) this;
        }

        public Criteria andAlwugongIn(List<String> values) {
            addCriterion("alwugong in", values, "alwugong");
            return (Criteria) this;
        }

        public Criteria andAlwugongNotIn(List<String> values) {
            addCriterion("alwugong not in", values, "alwugong");
            return (Criteria) this;
        }

        public Criteria andAlwugongBetween(String value1, String value2) {
            addCriterion("alwugong between", value1, value2, "alwugong");
            return (Criteria) this;
        }

        public Criteria andAlwugongNotBetween(String value1, String value2) {
            addCriterion("alwugong not between", value1, value2, "alwugong");
            return (Criteria) this;
        }

        public Criteria andAlzhijianIsNull() {
            addCriterion("alzhijian is null");
            return (Criteria) this;
        }

        public Criteria andAlzhijianIsNotNull() {
            addCriterion("alzhijian is not null");
            return (Criteria) this;
        }

        public Criteria andAlzhijianEqualTo(String value) {
            addCriterion("alzhijian =", value, "alzhijian");
            return (Criteria) this;
        }

        public Criteria andAlzhijianNotEqualTo(String value) {
            addCriterion("alzhijian <>", value, "alzhijian");
            return (Criteria) this;
        }

        public Criteria andAlzhijianGreaterThan(String value) {
            addCriterion("alzhijian >", value, "alzhijian");
            return (Criteria) this;
        }

        public Criteria andAlzhijianGreaterThanOrEqualTo(String value) {
            addCriterion("alzhijian >=", value, "alzhijian");
            return (Criteria) this;
        }

        public Criteria andAlzhijianLessThan(String value) {
            addCriterion("alzhijian <", value, "alzhijian");
            return (Criteria) this;
        }

        public Criteria andAlzhijianLessThanOrEqualTo(String value) {
            addCriterion("alzhijian <=", value, "alzhijian");
            return (Criteria) this;
        }

        public Criteria andAlzhijianLike(String value) {
            addCriterion("alzhijian like", value, "alzhijian");
            return (Criteria) this;
        }

        public Criteria andAlzhijianNotLike(String value) {
            addCriterion("alzhijian not like", value, "alzhijian");
            return (Criteria) this;
        }

        public Criteria andAlzhijianIn(List<String> values) {
            addCriterion("alzhijian in", values, "alzhijian");
            return (Criteria) this;
        }

        public Criteria andAlzhijianNotIn(List<String> values) {
            addCriterion("alzhijian not in", values, "alzhijian");
            return (Criteria) this;
        }

        public Criteria andAlzhijianBetween(String value1, String value2) {
            addCriterion("alzhijian between", value1, value2, "alzhijian");
            return (Criteria) this;
        }

        public Criteria andAlzhijianNotBetween(String value1, String value2) {
            addCriterion("alzhijian not between", value1, value2, "alzhijian");
            return (Criteria) this;
        }

        public Criteria andAlzerenIsNull() {
            addCriterion("alzeren is null");
            return (Criteria) this;
        }

        public Criteria andAlzerenIsNotNull() {
            addCriterion("alzeren is not null");
            return (Criteria) this;
        }

        public Criteria andAlzerenEqualTo(String value) {
            addCriterion("alzeren =", value, "alzeren");
            return (Criteria) this;
        }

        public Criteria andAlzerenNotEqualTo(String value) {
            addCriterion("alzeren <>", value, "alzeren");
            return (Criteria) this;
        }

        public Criteria andAlzerenGreaterThan(String value) {
            addCriterion("alzeren >", value, "alzeren");
            return (Criteria) this;
        }

        public Criteria andAlzerenGreaterThanOrEqualTo(String value) {
            addCriterion("alzeren >=", value, "alzeren");
            return (Criteria) this;
        }

        public Criteria andAlzerenLessThan(String value) {
            addCriterion("alzeren <", value, "alzeren");
            return (Criteria) this;
        }

        public Criteria andAlzerenLessThanOrEqualTo(String value) {
            addCriterion("alzeren <=", value, "alzeren");
            return (Criteria) this;
        }

        public Criteria andAlzerenLike(String value) {
            addCriterion("alzeren like", value, "alzeren");
            return (Criteria) this;
        }

        public Criteria andAlzerenNotLike(String value) {
            addCriterion("alzeren not like", value, "alzeren");
            return (Criteria) this;
        }

        public Criteria andAlzerenIn(List<String> values) {
            addCriterion("alzeren in", values, "alzeren");
            return (Criteria) this;
        }

        public Criteria andAlzerenNotIn(List<String> values) {
            addCriterion("alzeren not in", values, "alzeren");
            return (Criteria) this;
        }

        public Criteria andAlzerenBetween(String value1, String value2) {
            addCriterion("alzeren between", value1, value2, "alzeren");
            return (Criteria) this;
        }

        public Criteria andAlzerenNotBetween(String value1, String value2) {
            addCriterion("alzeren not between", value1, value2, "alzeren");
            return (Criteria) this;
        }

        public Criteria andAlchufaIsNull() {
            addCriterion("alchufa is null");
            return (Criteria) this;
        }

        public Criteria andAlchufaIsNotNull() {
            addCriterion("alchufa is not null");
            return (Criteria) this;
        }

        public Criteria andAlchufaEqualTo(Float value) {
            addCriterion("alchufa =", value, "alchufa");
            return (Criteria) this;
        }

        public Criteria andAlchufaNotEqualTo(Float value) {
            addCriterion("alchufa <>", value, "alchufa");
            return (Criteria) this;
        }

        public Criteria andAlchufaGreaterThan(Float value) {
            addCriterion("alchufa >", value, "alchufa");
            return (Criteria) this;
        }

        public Criteria andAlchufaGreaterThanOrEqualTo(Float value) {
            addCriterion("alchufa >=", value, "alchufa");
            return (Criteria) this;
        }

        public Criteria andAlchufaLessThan(Float value) {
            addCriterion("alchufa <", value, "alchufa");
            return (Criteria) this;
        }

        public Criteria andAlchufaLessThanOrEqualTo(Float value) {
            addCriterion("alchufa <=", value, "alchufa");
            return (Criteria) this;
        }

        public Criteria andAlchufaIn(List<Float> values) {
            addCriterion("alchufa in", values, "alchufa");
            return (Criteria) this;
        }

        public Criteria andAlchufaNotIn(List<Float> values) {
            addCriterion("alchufa not in", values, "alchufa");
            return (Criteria) this;
        }

        public Criteria andAlchufaBetween(Float value1, Float value2) {
            addCriterion("alchufa between", value1, value2, "alchufa");
            return (Criteria) this;
        }

        public Criteria andAlchufaNotBetween(Float value1, Float value2) {
            addCriterion("alchufa not between", value1, value2, "alchufa");
            return (Criteria) this;
        }

        public Criteria andAlfanyuanIsNull() {
            addCriterion("alfanyuan is null");
            return (Criteria) this;
        }

        public Criteria andAlfanyuanIsNotNull() {
            addCriterion("alfanyuan is not null");
            return (Criteria) this;
        }

        public Criteria andAlfanyuanEqualTo(String value) {
            addCriterion("alfanyuan =", value, "alfanyuan");
            return (Criteria) this;
        }

        public Criteria andAlfanyuanNotEqualTo(String value) {
            addCriterion("alfanyuan <>", value, "alfanyuan");
            return (Criteria) this;
        }

        public Criteria andAlfanyuanGreaterThan(String value) {
            addCriterion("alfanyuan >", value, "alfanyuan");
            return (Criteria) this;
        }

        public Criteria andAlfanyuanGreaterThanOrEqualTo(String value) {
            addCriterion("alfanyuan >=", value, "alfanyuan");
            return (Criteria) this;
        }

        public Criteria andAlfanyuanLessThan(String value) {
            addCriterion("alfanyuan <", value, "alfanyuan");
            return (Criteria) this;
        }

        public Criteria andAlfanyuanLessThanOrEqualTo(String value) {
            addCriterion("alfanyuan <=", value, "alfanyuan");
            return (Criteria) this;
        }

        public Criteria andAlfanyuanLike(String value) {
            addCriterion("alfanyuan like", value, "alfanyuan");
            return (Criteria) this;
        }

        public Criteria andAlfanyuanNotLike(String value) {
            addCriterion("alfanyuan not like", value, "alfanyuan");
            return (Criteria) this;
        }

        public Criteria andAlfanyuanIn(List<String> values) {
            addCriterion("alfanyuan in", values, "alfanyuan");
            return (Criteria) this;
        }

        public Criteria andAlfanyuanNotIn(List<String> values) {
            addCriterion("alfanyuan not in", values, "alfanyuan");
            return (Criteria) this;
        }

        public Criteria andAlfanyuanBetween(String value1, String value2) {
            addCriterion("alfanyuan between", value1, value2, "alfanyuan");
            return (Criteria) this;
        }

        public Criteria andAlfanyuanNotBetween(String value1, String value2) {
            addCriterion("alfanyuan not between", value1, value2, "alfanyuan");
            return (Criteria) this;
        }

        public Criteria andAlfannumIsNull() {
            addCriterion("alfannum is null");
            return (Criteria) this;
        }

        public Criteria andAlfannumIsNotNull() {
            addCriterion("alfannum is not null");
            return (Criteria) this;
        }

        public Criteria andAlfannumEqualTo(Integer value) {
            addCriterion("alfannum =", value, "alfannum");
            return (Criteria) this;
        }

        public Criteria andAlfannumNotEqualTo(Integer value) {
            addCriterion("alfannum <>", value, "alfannum");
            return (Criteria) this;
        }

        public Criteria andAlfannumGreaterThan(Integer value) {
            addCriterion("alfannum >", value, "alfannum");
            return (Criteria) this;
        }

        public Criteria andAlfannumGreaterThanOrEqualTo(Integer value) {
            addCriterion("alfannum >=", value, "alfannum");
            return (Criteria) this;
        }

        public Criteria andAlfannumLessThan(Integer value) {
            addCriterion("alfannum <", value, "alfannum");
            return (Criteria) this;
        }

        public Criteria andAlfannumLessThanOrEqualTo(Integer value) {
            addCriterion("alfannum <=", value, "alfannum");
            return (Criteria) this;
        }

        public Criteria andAlfannumIn(List<Integer> values) {
            addCriterion("alfannum in", values, "alfannum");
            return (Criteria) this;
        }

        public Criteria andAlfannumNotIn(List<Integer> values) {
            addCriterion("alfannum not in", values, "alfannum");
            return (Criteria) this;
        }

        public Criteria andAlfannumBetween(Integer value1, Integer value2) {
            addCriterion("alfannum between", value1, value2, "alfannum");
            return (Criteria) this;
        }

        public Criteria andAlfannumNotBetween(Integer value1, Integer value2) {
            addCriterion("alfannum not between", value1, value2, "alfannum");
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