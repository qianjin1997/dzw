package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class RepairExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepairExample() {
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

        public Criteria andWidIsNull() {
            addCriterion("wid is null");
            return (Criteria) this;
        }

        public Criteria andWidIsNotNull() {
            addCriterion("wid is not null");
            return (Criteria) this;
        }

        public Criteria andWidEqualTo(Integer value) {
            addCriterion("wid =", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotEqualTo(Integer value) {
            addCriterion("wid <>", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThan(Integer value) {
            addCriterion("wid >", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wid >=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThan(Integer value) {
            addCriterion("wid <", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThanOrEqualTo(Integer value) {
            addCriterion("wid <=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidIn(List<Integer> values) {
            addCriterion("wid in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotIn(List<Integer> values) {
            addCriterion("wid not in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidBetween(Integer value1, Integer value2) {
            addCriterion("wid between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotBetween(Integer value1, Integer value2) {
            addCriterion("wid not between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andWmidIsNull() {
            addCriterion("wmid is null");
            return (Criteria) this;
        }

        public Criteria andWmidIsNotNull() {
            addCriterion("wmid is not null");
            return (Criteria) this;
        }

        public Criteria andWmidEqualTo(Integer value) {
            addCriterion("wmid =", value, "wmid");
            return (Criteria) this;
        }

        public Criteria andWmidNotEqualTo(Integer value) {
            addCriterion("wmid <>", value, "wmid");
            return (Criteria) this;
        }

        public Criteria andWmidGreaterThan(Integer value) {
            addCriterion("wmid >", value, "wmid");
            return (Criteria) this;
        }

        public Criteria andWmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wmid >=", value, "wmid");
            return (Criteria) this;
        }

        public Criteria andWmidLessThan(Integer value) {
            addCriterion("wmid <", value, "wmid");
            return (Criteria) this;
        }

        public Criteria andWmidLessThanOrEqualTo(Integer value) {
            addCriterion("wmid <=", value, "wmid");
            return (Criteria) this;
        }

        public Criteria andWmidIn(List<Integer> values) {
            addCriterion("wmid in", values, "wmid");
            return (Criteria) this;
        }

        public Criteria andWmidNotIn(List<Integer> values) {
            addCriterion("wmid not in", values, "wmid");
            return (Criteria) this;
        }

        public Criteria andWmidBetween(Integer value1, Integer value2) {
            addCriterion("wmid between", value1, value2, "wmid");
            return (Criteria) this;
        }

        public Criteria andWmidNotBetween(Integer value1, Integer value2) {
            addCriterion("wmid not between", value1, value2, "wmid");
            return (Criteria) this;
        }

        public Criteria andWmnameIsNull() {
            addCriterion("wmname is null");
            return (Criteria) this;
        }

        public Criteria andWmnameIsNotNull() {
            addCriterion("wmname is not null");
            return (Criteria) this;
        }

        public Criteria andWmnameEqualTo(String value) {
            addCriterion("wmname =", value, "wmname");
            return (Criteria) this;
        }

        public Criteria andWmnameNotEqualTo(String value) {
            addCriterion("wmname <>", value, "wmname");
            return (Criteria) this;
        }

        public Criteria andWmnameGreaterThan(String value) {
            addCriterion("wmname >", value, "wmname");
            return (Criteria) this;
        }

        public Criteria andWmnameGreaterThanOrEqualTo(String value) {
            addCriterion("wmname >=", value, "wmname");
            return (Criteria) this;
        }

        public Criteria andWmnameLessThan(String value) {
            addCriterion("wmname <", value, "wmname");
            return (Criteria) this;
        }

        public Criteria andWmnameLessThanOrEqualTo(String value) {
            addCriterion("wmname <=", value, "wmname");
            return (Criteria) this;
        }

        public Criteria andWmnameLike(String value) {
            addCriterion("wmname like", value, "wmname");
            return (Criteria) this;
        }

        public Criteria andWmnameNotLike(String value) {
            addCriterion("wmname not like", value, "wmname");
            return (Criteria) this;
        }

        public Criteria andWmnameIn(List<String> values) {
            addCriterion("wmname in", values, "wmname");
            return (Criteria) this;
        }

        public Criteria andWmnameNotIn(List<String> values) {
            addCriterion("wmname not in", values, "wmname");
            return (Criteria) this;
        }

        public Criteria andWmnameBetween(String value1, String value2) {
            addCriterion("wmname between", value1, value2, "wmname");
            return (Criteria) this;
        }

        public Criteria andWmnameNotBetween(String value1, String value2) {
            addCriterion("wmname not between", value1, value2, "wmname");
            return (Criteria) this;
        }

        public Criteria andWincomeidIsNull() {
            addCriterion("wincomeid is null");
            return (Criteria) this;
        }

        public Criteria andWincomeidIsNotNull() {
            addCriterion("wincomeid is not null");
            return (Criteria) this;
        }

        public Criteria andWincomeidEqualTo(Integer value) {
            addCriterion("wincomeid =", value, "wincomeid");
            return (Criteria) this;
        }

        public Criteria andWincomeidNotEqualTo(Integer value) {
            addCriterion("wincomeid <>", value, "wincomeid");
            return (Criteria) this;
        }

        public Criteria andWincomeidGreaterThan(Integer value) {
            addCriterion("wincomeid >", value, "wincomeid");
            return (Criteria) this;
        }

        public Criteria andWincomeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wincomeid >=", value, "wincomeid");
            return (Criteria) this;
        }

        public Criteria andWincomeidLessThan(Integer value) {
            addCriterion("wincomeid <", value, "wincomeid");
            return (Criteria) this;
        }

        public Criteria andWincomeidLessThanOrEqualTo(Integer value) {
            addCriterion("wincomeid <=", value, "wincomeid");
            return (Criteria) this;
        }

        public Criteria andWincomeidIn(List<Integer> values) {
            addCriterion("wincomeid in", values, "wincomeid");
            return (Criteria) this;
        }

        public Criteria andWincomeidNotIn(List<Integer> values) {
            addCriterion("wincomeid not in", values, "wincomeid");
            return (Criteria) this;
        }

        public Criteria andWincomeidBetween(Integer value1, Integer value2) {
            addCriterion("wincomeid between", value1, value2, "wincomeid");
            return (Criteria) this;
        }

        public Criteria andWincomeidNotBetween(Integer value1, Integer value2) {
            addCriterion("wincomeid not between", value1, value2, "wincomeid");
            return (Criteria) this;
        }

        public Criteria andWremarkIsNull() {
            addCriterion("wremark is null");
            return (Criteria) this;
        }

        public Criteria andWremarkIsNotNull() {
            addCriterion("wremark is not null");
            return (Criteria) this;
        }

        public Criteria andWremarkEqualTo(String value) {
            addCriterion("wremark =", value, "wremark");
            return (Criteria) this;
        }

        public Criteria andWremarkNotEqualTo(String value) {
            addCriterion("wremark <>", value, "wremark");
            return (Criteria) this;
        }

        public Criteria andWremarkGreaterThan(String value) {
            addCriterion("wremark >", value, "wremark");
            return (Criteria) this;
        }

        public Criteria andWremarkGreaterThanOrEqualTo(String value) {
            addCriterion("wremark >=", value, "wremark");
            return (Criteria) this;
        }

        public Criteria andWremarkLessThan(String value) {
            addCriterion("wremark <", value, "wremark");
            return (Criteria) this;
        }

        public Criteria andWremarkLessThanOrEqualTo(String value) {
            addCriterion("wremark <=", value, "wremark");
            return (Criteria) this;
        }

        public Criteria andWremarkLike(String value) {
            addCriterion("wremark like", value, "wremark");
            return (Criteria) this;
        }

        public Criteria andWremarkNotLike(String value) {
            addCriterion("wremark not like", value, "wremark");
            return (Criteria) this;
        }

        public Criteria andWremarkIn(List<String> values) {
            addCriterion("wremark in", values, "wremark");
            return (Criteria) this;
        }

        public Criteria andWremarkNotIn(List<String> values) {
            addCriterion("wremark not in", values, "wremark");
            return (Criteria) this;
        }

        public Criteria andWremarkBetween(String value1, String value2) {
            addCriterion("wremark between", value1, value2, "wremark");
            return (Criteria) this;
        }

        public Criteria andWremarkNotBetween(String value1, String value2) {
            addCriterion("wremark not between", value1, value2, "wremark");
            return (Criteria) this;
        }

        public Criteria andWspriceIsNull() {
            addCriterion("wsprice is null");
            return (Criteria) this;
        }

        public Criteria andWspriceIsNotNull() {
            addCriterion("wsprice is not null");
            return (Criteria) this;
        }

        public Criteria andWspriceEqualTo(Float value) {
            addCriterion("wsprice =", value, "wsprice");
            return (Criteria) this;
        }

        public Criteria andWspriceNotEqualTo(Float value) {
            addCriterion("wsprice <>", value, "wsprice");
            return (Criteria) this;
        }

        public Criteria andWspriceGreaterThan(Float value) {
            addCriterion("wsprice >", value, "wsprice");
            return (Criteria) this;
        }

        public Criteria andWspriceGreaterThanOrEqualTo(Float value) {
            addCriterion("wsprice >=", value, "wsprice");
            return (Criteria) this;
        }

        public Criteria andWspriceLessThan(Float value) {
            addCriterion("wsprice <", value, "wsprice");
            return (Criteria) this;
        }

        public Criteria andWspriceLessThanOrEqualTo(Float value) {
            addCriterion("wsprice <=", value, "wsprice");
            return (Criteria) this;
        }

        public Criteria andWspriceIn(List<Float> values) {
            addCriterion("wsprice in", values, "wsprice");
            return (Criteria) this;
        }

        public Criteria andWspriceNotIn(List<Float> values) {
            addCriterion("wsprice not in", values, "wsprice");
            return (Criteria) this;
        }

        public Criteria andWspriceBetween(Float value1, Float value2) {
            addCriterion("wsprice between", value1, value2, "wsprice");
            return (Criteria) this;
        }

        public Criteria andWspriceNotBetween(Float value1, Float value2) {
            addCriterion("wsprice not between", value1, value2, "wsprice");
            return (Criteria) this;
        }

        public Criteria andWmemberpriceIsNull() {
            addCriterion("wmemberprice is null");
            return (Criteria) this;
        }

        public Criteria andWmemberpriceIsNotNull() {
            addCriterion("wmemberprice is not null");
            return (Criteria) this;
        }

        public Criteria andWmemberpriceEqualTo(Float value) {
            addCriterion("wmemberprice =", value, "wmemberprice");
            return (Criteria) this;
        }

        public Criteria andWmemberpriceNotEqualTo(Float value) {
            addCriterion("wmemberprice <>", value, "wmemberprice");
            return (Criteria) this;
        }

        public Criteria andWmemberpriceGreaterThan(Float value) {
            addCriterion("wmemberprice >", value, "wmemberprice");
            return (Criteria) this;
        }

        public Criteria andWmemberpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("wmemberprice >=", value, "wmemberprice");
            return (Criteria) this;
        }

        public Criteria andWmemberpriceLessThan(Float value) {
            addCriterion("wmemberprice <", value, "wmemberprice");
            return (Criteria) this;
        }

        public Criteria andWmemberpriceLessThanOrEqualTo(Float value) {
            addCriterion("wmemberprice <=", value, "wmemberprice");
            return (Criteria) this;
        }

        public Criteria andWmemberpriceIn(List<Float> values) {
            addCriterion("wmemberprice in", values, "wmemberprice");
            return (Criteria) this;
        }

        public Criteria andWmemberpriceNotIn(List<Float> values) {
            addCriterion("wmemberprice not in", values, "wmemberprice");
            return (Criteria) this;
        }

        public Criteria andWmemberpriceBetween(Float value1, Float value2) {
            addCriterion("wmemberprice between", value1, value2, "wmemberprice");
            return (Criteria) this;
        }

        public Criteria andWmemberpriceNotBetween(Float value1, Float value2) {
            addCriterion("wmemberprice not between", value1, value2, "wmemberprice");
            return (Criteria) this;
        }

        public Criteria andWvipiceIsNull() {
            addCriterion("wvipice is null");
            return (Criteria) this;
        }

        public Criteria andWvipiceIsNotNull() {
            addCriterion("wvipice is not null");
            return (Criteria) this;
        }

        public Criteria andWvipiceEqualTo(Float value) {
            addCriterion("wvipice =", value, "wvipice");
            return (Criteria) this;
        }

        public Criteria andWvipiceNotEqualTo(Float value) {
            addCriterion("wvipice <>", value, "wvipice");
            return (Criteria) this;
        }

        public Criteria andWvipiceGreaterThan(Float value) {
            addCriterion("wvipice >", value, "wvipice");
            return (Criteria) this;
        }

        public Criteria andWvipiceGreaterThanOrEqualTo(Float value) {
            addCriterion("wvipice >=", value, "wvipice");
            return (Criteria) this;
        }

        public Criteria andWvipiceLessThan(Float value) {
            addCriterion("wvipice <", value, "wvipice");
            return (Criteria) this;
        }

        public Criteria andWvipiceLessThanOrEqualTo(Float value) {
            addCriterion("wvipice <=", value, "wvipice");
            return (Criteria) this;
        }

        public Criteria andWvipiceIn(List<Float> values) {
            addCriterion("wvipice in", values, "wvipice");
            return (Criteria) this;
        }

        public Criteria andWvipiceNotIn(List<Float> values) {
            addCriterion("wvipice not in", values, "wvipice");
            return (Criteria) this;
        }

        public Criteria andWvipiceBetween(Float value1, Float value2) {
            addCriterion("wvipice between", value1, value2, "wvipice");
            return (Criteria) this;
        }

        public Criteria andWvipiceNotBetween(Float value1, Float value2) {
            addCriterion("wvipice not between", value1, value2, "wvipice");
            return (Criteria) this;
        }

        public Criteria andWdealIsNull() {
            addCriterion("wdeal is null");
            return (Criteria) this;
        }

        public Criteria andWdealIsNotNull() {
            addCriterion("wdeal is not null");
            return (Criteria) this;
        }

        public Criteria andWdealEqualTo(Float value) {
            addCriterion("wdeal =", value, "wdeal");
            return (Criteria) this;
        }

        public Criteria andWdealNotEqualTo(Float value) {
            addCriterion("wdeal <>", value, "wdeal");
            return (Criteria) this;
        }

        public Criteria andWdealGreaterThan(Float value) {
            addCriterion("wdeal >", value, "wdeal");
            return (Criteria) this;
        }

        public Criteria andWdealGreaterThanOrEqualTo(Float value) {
            addCriterion("wdeal >=", value, "wdeal");
            return (Criteria) this;
        }

        public Criteria andWdealLessThan(Float value) {
            addCriterion("wdeal <", value, "wdeal");
            return (Criteria) this;
        }

        public Criteria andWdealLessThanOrEqualTo(Float value) {
            addCriterion("wdeal <=", value, "wdeal");
            return (Criteria) this;
        }

        public Criteria andWdealIn(List<Float> values) {
            addCriterion("wdeal in", values, "wdeal");
            return (Criteria) this;
        }

        public Criteria andWdealNotIn(List<Float> values) {
            addCriterion("wdeal not in", values, "wdeal");
            return (Criteria) this;
        }

        public Criteria andWdealBetween(Float value1, Float value2) {
            addCriterion("wdeal between", value1, value2, "wdeal");
            return (Criteria) this;
        }

        public Criteria andWdealNotBetween(Float value1, Float value2) {
            addCriterion("wdeal not between", value1, value2, "wdeal");
            return (Criteria) this;
        }

        public Criteria andWclaimIsNull() {
            addCriterion("wclaim is null");
            return (Criteria) this;
        }

        public Criteria andWclaimIsNotNull() {
            addCriterion("wclaim is not null");
            return (Criteria) this;
        }

        public Criteria andWclaimEqualTo(Float value) {
            addCriterion("wclaim =", value, "wclaim");
            return (Criteria) this;
        }

        public Criteria andWclaimNotEqualTo(Float value) {
            addCriterion("wclaim <>", value, "wclaim");
            return (Criteria) this;
        }

        public Criteria andWclaimGreaterThan(Float value) {
            addCriterion("wclaim >", value, "wclaim");
            return (Criteria) this;
        }

        public Criteria andWclaimGreaterThanOrEqualTo(Float value) {
            addCriterion("wclaim >=", value, "wclaim");
            return (Criteria) this;
        }

        public Criteria andWclaimLessThan(Float value) {
            addCriterion("wclaim <", value, "wclaim");
            return (Criteria) this;
        }

        public Criteria andWclaimLessThanOrEqualTo(Float value) {
            addCriterion("wclaim <=", value, "wclaim");
            return (Criteria) this;
        }

        public Criteria andWclaimIn(List<Float> values) {
            addCriterion("wclaim in", values, "wclaim");
            return (Criteria) this;
        }

        public Criteria andWclaimNotIn(List<Float> values) {
            addCriterion("wclaim not in", values, "wclaim");
            return (Criteria) this;
        }

        public Criteria andWclaimBetween(Float value1, Float value2) {
            addCriterion("wclaim between", value1, value2, "wclaim");
            return (Criteria) this;
        }

        public Criteria andWclaimNotBetween(Float value1, Float value2) {
            addCriterion("wclaim not between", value1, value2, "wclaim");
            return (Criteria) this;
        }

        public Criteria andWicbcpriceIsNull() {
            addCriterion("wicbcprice is null");
            return (Criteria) this;
        }

        public Criteria andWicbcpriceIsNotNull() {
            addCriterion("wicbcprice is not null");
            return (Criteria) this;
        }

        public Criteria andWicbcpriceEqualTo(Float value) {
            addCriterion("wicbcprice =", value, "wicbcprice");
            return (Criteria) this;
        }

        public Criteria andWicbcpriceNotEqualTo(Float value) {
            addCriterion("wicbcprice <>", value, "wicbcprice");
            return (Criteria) this;
        }

        public Criteria andWicbcpriceGreaterThan(Float value) {
            addCriterion("wicbcprice >", value, "wicbcprice");
            return (Criteria) this;
        }

        public Criteria andWicbcpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("wicbcprice >=", value, "wicbcprice");
            return (Criteria) this;
        }

        public Criteria andWicbcpriceLessThan(Float value) {
            addCriterion("wicbcprice <", value, "wicbcprice");
            return (Criteria) this;
        }

        public Criteria andWicbcpriceLessThanOrEqualTo(Float value) {
            addCriterion("wicbcprice <=", value, "wicbcprice");
            return (Criteria) this;
        }

        public Criteria andWicbcpriceIn(List<Float> values) {
            addCriterion("wicbcprice in", values, "wicbcprice");
            return (Criteria) this;
        }

        public Criteria andWicbcpriceNotIn(List<Float> values) {
            addCriterion("wicbcprice not in", values, "wicbcprice");
            return (Criteria) this;
        }

        public Criteria andWicbcpriceBetween(Float value1, Float value2) {
            addCriterion("wicbcprice between", value1, value2, "wicbcprice");
            return (Criteria) this;
        }

        public Criteria andWicbcpriceNotBetween(Float value1, Float value2) {
            addCriterion("wicbcprice not between", value1, value2, "wicbcprice");
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