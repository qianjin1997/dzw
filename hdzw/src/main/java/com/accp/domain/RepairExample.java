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

        public Criteria andWsumIsNull() {
            addCriterion("wsum is null");
            return (Criteria) this;
        }

        public Criteria andWsumIsNotNull() {
            addCriterion("wsum is not null");
            return (Criteria) this;
        }

        public Criteria andWsumEqualTo(Integer value) {
            addCriterion("wsum =", value, "wsum");
            return (Criteria) this;
        }

        public Criteria andWsumNotEqualTo(Integer value) {
            addCriterion("wsum <>", value, "wsum");
            return (Criteria) this;
        }

        public Criteria andWsumGreaterThan(Integer value) {
            addCriterion("wsum >", value, "wsum");
            return (Criteria) this;
        }

        public Criteria andWsumGreaterThanOrEqualTo(Integer value) {
            addCriterion("wsum >=", value, "wsum");
            return (Criteria) this;
        }

        public Criteria andWsumLessThan(Integer value) {
            addCriterion("wsum <", value, "wsum");
            return (Criteria) this;
        }

        public Criteria andWsumLessThanOrEqualTo(Integer value) {
            addCriterion("wsum <=", value, "wsum");
            return (Criteria) this;
        }

        public Criteria andWsumIn(List<Integer> values) {
            addCriterion("wsum in", values, "wsum");
            return (Criteria) this;
        }

        public Criteria andWsumNotIn(List<Integer> values) {
            addCriterion("wsum not in", values, "wsum");
            return (Criteria) this;
        }

        public Criteria andWsumBetween(Integer value1, Integer value2) {
            addCriterion("wsum between", value1, value2, "wsum");
            return (Criteria) this;
        }

        public Criteria andWsumNotBetween(Integer value1, Integer value2) {
            addCriterion("wsum not between", value1, value2, "wsum");
            return (Criteria) this;
        }

        public Criteria andWpriceclassIsNull() {
            addCriterion("wpriceclass is null");
            return (Criteria) this;
        }

        public Criteria andWpriceclassIsNotNull() {
            addCriterion("wpriceclass is not null");
            return (Criteria) this;
        }

        public Criteria andWpriceclassEqualTo(String value) {
            addCriterion("wpriceclass =", value, "wpriceclass");
            return (Criteria) this;
        }

        public Criteria andWpriceclassNotEqualTo(String value) {
            addCriterion("wpriceclass <>", value, "wpriceclass");
            return (Criteria) this;
        }

        public Criteria andWpriceclassGreaterThan(String value) {
            addCriterion("wpriceclass >", value, "wpriceclass");
            return (Criteria) this;
        }

        public Criteria andWpriceclassGreaterThanOrEqualTo(String value) {
            addCriterion("wpriceclass >=", value, "wpriceclass");
            return (Criteria) this;
        }

        public Criteria andWpriceclassLessThan(String value) {
            addCriterion("wpriceclass <", value, "wpriceclass");
            return (Criteria) this;
        }

        public Criteria andWpriceclassLessThanOrEqualTo(String value) {
            addCriterion("wpriceclass <=", value, "wpriceclass");
            return (Criteria) this;
        }

        public Criteria andWpriceclassLike(String value) {
            addCriterion("wpriceclass like", value, "wpriceclass");
            return (Criteria) this;
        }

        public Criteria andWpriceclassNotLike(String value) {
            addCriterion("wpriceclass not like", value, "wpriceclass");
            return (Criteria) this;
        }

        public Criteria andWpriceclassIn(List<String> values) {
            addCriterion("wpriceclass in", values, "wpriceclass");
            return (Criteria) this;
        }

        public Criteria andWpriceclassNotIn(List<String> values) {
            addCriterion("wpriceclass not in", values, "wpriceclass");
            return (Criteria) this;
        }

        public Criteria andWpriceclassBetween(String value1, String value2) {
            addCriterion("wpriceclass between", value1, value2, "wpriceclass");
            return (Criteria) this;
        }

        public Criteria andWpriceclassNotBetween(String value1, String value2) {
            addCriterion("wpriceclass not between", value1, value2, "wpriceclass");
            return (Criteria) this;
        }

        public Criteria andWyhqianpriceIsNull() {
            addCriterion("wyhqianprice is null");
            return (Criteria) this;
        }

        public Criteria andWyhqianpriceIsNotNull() {
            addCriterion("wyhqianprice is not null");
            return (Criteria) this;
        }

        public Criteria andWyhqianpriceEqualTo(Integer value) {
            addCriterion("wyhqianprice =", value, "wyhqianprice");
            return (Criteria) this;
        }

        public Criteria andWyhqianpriceNotEqualTo(Integer value) {
            addCriterion("wyhqianprice <>", value, "wyhqianprice");
            return (Criteria) this;
        }

        public Criteria andWyhqianpriceGreaterThan(Integer value) {
            addCriterion("wyhqianprice >", value, "wyhqianprice");
            return (Criteria) this;
        }

        public Criteria andWyhqianpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("wyhqianprice >=", value, "wyhqianprice");
            return (Criteria) this;
        }

        public Criteria andWyhqianpriceLessThan(Integer value) {
            addCriterion("wyhqianprice <", value, "wyhqianprice");
            return (Criteria) this;
        }

        public Criteria andWyhqianpriceLessThanOrEqualTo(Integer value) {
            addCriterion("wyhqianprice <=", value, "wyhqianprice");
            return (Criteria) this;
        }

        public Criteria andWyhqianpriceIn(List<Integer> values) {
            addCriterion("wyhqianprice in", values, "wyhqianprice");
            return (Criteria) this;
        }

        public Criteria andWyhqianpriceNotIn(List<Integer> values) {
            addCriterion("wyhqianprice not in", values, "wyhqianprice");
            return (Criteria) this;
        }

        public Criteria andWyhqianpriceBetween(Integer value1, Integer value2) {
            addCriterion("wyhqianprice between", value1, value2, "wyhqianprice");
            return (Criteria) this;
        }

        public Criteria andWyhqianpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("wyhqianprice not between", value1, value2, "wyhqianprice");
            return (Criteria) this;
        }

        public Criteria andWthhoupriceIsNull() {
            addCriterion("wthhouprice is null");
            return (Criteria) this;
        }

        public Criteria andWthhoupriceIsNotNull() {
            addCriterion("wthhouprice is not null");
            return (Criteria) this;
        }

        public Criteria andWthhoupriceEqualTo(Integer value) {
            addCriterion("wthhouprice =", value, "wthhouprice");
            return (Criteria) this;
        }

        public Criteria andWthhoupriceNotEqualTo(Integer value) {
            addCriterion("wthhouprice <>", value, "wthhouprice");
            return (Criteria) this;
        }

        public Criteria andWthhoupriceGreaterThan(Integer value) {
            addCriterion("wthhouprice >", value, "wthhouprice");
            return (Criteria) this;
        }

        public Criteria andWthhoupriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("wthhouprice >=", value, "wthhouprice");
            return (Criteria) this;
        }

        public Criteria andWthhoupriceLessThan(Integer value) {
            addCriterion("wthhouprice <", value, "wthhouprice");
            return (Criteria) this;
        }

        public Criteria andWthhoupriceLessThanOrEqualTo(Integer value) {
            addCriterion("wthhouprice <=", value, "wthhouprice");
            return (Criteria) this;
        }

        public Criteria andWthhoupriceIn(List<Integer> values) {
            addCriterion("wthhouprice in", values, "wthhouprice");
            return (Criteria) this;
        }

        public Criteria andWthhoupriceNotIn(List<Integer> values) {
            addCriterion("wthhouprice not in", values, "wthhouprice");
            return (Criteria) this;
        }

        public Criteria andWthhoupriceBetween(Integer value1, Integer value2) {
            addCriterion("wthhouprice between", value1, value2, "wthhouprice");
            return (Criteria) this;
        }

        public Criteria andWthhoupriceNotBetween(Integer value1, Integer value2) {
            addCriterion("wthhouprice not between", value1, value2, "wthhouprice");
            return (Criteria) this;
        }

        public Criteria andWyhhouamountIsNull() {
            addCriterion("wyhhouamount is null");
            return (Criteria) this;
        }

        public Criteria andWyhhouamountIsNotNull() {
            addCriterion("wyhhouamount is not null");
            return (Criteria) this;
        }

        public Criteria andWyhhouamountEqualTo(Integer value) {
            addCriterion("wyhhouamount =", value, "wyhhouamount");
            return (Criteria) this;
        }

        public Criteria andWyhhouamountNotEqualTo(Integer value) {
            addCriterion("wyhhouamount <>", value, "wyhhouamount");
            return (Criteria) this;
        }

        public Criteria andWyhhouamountGreaterThan(Integer value) {
            addCriterion("wyhhouamount >", value, "wyhhouamount");
            return (Criteria) this;
        }

        public Criteria andWyhhouamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("wyhhouamount >=", value, "wyhhouamount");
            return (Criteria) this;
        }

        public Criteria andWyhhouamountLessThan(Integer value) {
            addCriterion("wyhhouamount <", value, "wyhhouamount");
            return (Criteria) this;
        }

        public Criteria andWyhhouamountLessThanOrEqualTo(Integer value) {
            addCriterion("wyhhouamount <=", value, "wyhhouamount");
            return (Criteria) this;
        }

        public Criteria andWyhhouamountIn(List<Integer> values) {
            addCriterion("wyhhouamount in", values, "wyhhouamount");
            return (Criteria) this;
        }

        public Criteria andWyhhouamountNotIn(List<Integer> values) {
            addCriterion("wyhhouamount not in", values, "wyhhouamount");
            return (Criteria) this;
        }

        public Criteria andWyhhouamountBetween(Integer value1, Integer value2) {
            addCriterion("wyhhouamount between", value1, value2, "wyhhouamount");
            return (Criteria) this;
        }

        public Criteria andWyhhouamountNotBetween(Integer value1, Integer value2) {
            addCriterion("wyhhouamount not between", value1, value2, "wyhhouamount");
            return (Criteria) this;
        }

        public Criteria andWproblemIsNull() {
            addCriterion("wproblem is null");
            return (Criteria) this;
        }

        public Criteria andWproblemIsNotNull() {
            addCriterion("wproblem is not null");
            return (Criteria) this;
        }

        public Criteria andWproblemEqualTo(String value) {
            addCriterion("wproblem =", value, "wproblem");
            return (Criteria) this;
        }

        public Criteria andWproblemNotEqualTo(String value) {
            addCriterion("wproblem <>", value, "wproblem");
            return (Criteria) this;
        }

        public Criteria andWproblemGreaterThan(String value) {
            addCriterion("wproblem >", value, "wproblem");
            return (Criteria) this;
        }

        public Criteria andWproblemGreaterThanOrEqualTo(String value) {
            addCriterion("wproblem >=", value, "wproblem");
            return (Criteria) this;
        }

        public Criteria andWproblemLessThan(String value) {
            addCriterion("wproblem <", value, "wproblem");
            return (Criteria) this;
        }

        public Criteria andWproblemLessThanOrEqualTo(String value) {
            addCriterion("wproblem <=", value, "wproblem");
            return (Criteria) this;
        }

        public Criteria andWproblemLike(String value) {
            addCriterion("wproblem like", value, "wproblem");
            return (Criteria) this;
        }

        public Criteria andWproblemNotLike(String value) {
            addCriterion("wproblem not like", value, "wproblem");
            return (Criteria) this;
        }

        public Criteria andWproblemIn(List<String> values) {
            addCriterion("wproblem in", values, "wproblem");
            return (Criteria) this;
        }

        public Criteria andWproblemNotIn(List<String> values) {
            addCriterion("wproblem not in", values, "wproblem");
            return (Criteria) this;
        }

        public Criteria andWproblemBetween(String value1, String value2) {
            addCriterion("wproblem between", value1, value2, "wproblem");
            return (Criteria) this;
        }

        public Criteria andWproblemNotBetween(String value1, String value2) {
            addCriterion("wproblem not between", value1, value2, "wproblem");
            return (Criteria) this;
        }

        public Criteria andWdescribeIsNull() {
            addCriterion("wdescribe is null");
            return (Criteria) this;
        }

        public Criteria andWdescribeIsNotNull() {
            addCriterion("wdescribe is not null");
            return (Criteria) this;
        }

        public Criteria andWdescribeEqualTo(String value) {
            addCriterion("wdescribe =", value, "wdescribe");
            return (Criteria) this;
        }

        public Criteria andWdescribeNotEqualTo(String value) {
            addCriterion("wdescribe <>", value, "wdescribe");
            return (Criteria) this;
        }

        public Criteria andWdescribeGreaterThan(String value) {
            addCriterion("wdescribe >", value, "wdescribe");
            return (Criteria) this;
        }

        public Criteria andWdescribeGreaterThanOrEqualTo(String value) {
            addCriterion("wdescribe >=", value, "wdescribe");
            return (Criteria) this;
        }

        public Criteria andWdescribeLessThan(String value) {
            addCriterion("wdescribe <", value, "wdescribe");
            return (Criteria) this;
        }

        public Criteria andWdescribeLessThanOrEqualTo(String value) {
            addCriterion("wdescribe <=", value, "wdescribe");
            return (Criteria) this;
        }

        public Criteria andWdescribeLike(String value) {
            addCriterion("wdescribe like", value, "wdescribe");
            return (Criteria) this;
        }

        public Criteria andWdescribeNotLike(String value) {
            addCriterion("wdescribe not like", value, "wdescribe");
            return (Criteria) this;
        }

        public Criteria andWdescribeIn(List<String> values) {
            addCriterion("wdescribe in", values, "wdescribe");
            return (Criteria) this;
        }

        public Criteria andWdescribeNotIn(List<String> values) {
            addCriterion("wdescribe not in", values, "wdescribe");
            return (Criteria) this;
        }

        public Criteria andWdescribeBetween(String value1, String value2) {
            addCriterion("wdescribe between", value1, value2, "wdescribe");
            return (Criteria) this;
        }

        public Criteria andWdescribeNotBetween(String value1, String value2) {
            addCriterion("wdescribe not between", value1, value2, "wdescribe");
            return (Criteria) this;
        }

        public Criteria andBjidIsNull() {
            addCriterion("bjid is null");
            return (Criteria) this;
        }

        public Criteria andBjidIsNotNull() {
            addCriterion("bjid is not null");
            return (Criteria) this;
        }

        public Criteria andBjidEqualTo(Integer value) {
            addCriterion("bjid =", value, "bjid");
            return (Criteria) this;
        }

        public Criteria andBjidNotEqualTo(Integer value) {
            addCriterion("bjid <>", value, "bjid");
            return (Criteria) this;
        }

        public Criteria andBjidGreaterThan(Integer value) {
            addCriterion("bjid >", value, "bjid");
            return (Criteria) this;
        }

        public Criteria andBjidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bjid >=", value, "bjid");
            return (Criteria) this;
        }

        public Criteria andBjidLessThan(Integer value) {
            addCriterion("bjid <", value, "bjid");
            return (Criteria) this;
        }

        public Criteria andBjidLessThanOrEqualTo(Integer value) {
            addCriterion("bjid <=", value, "bjid");
            return (Criteria) this;
        }

        public Criteria andBjidIn(List<Integer> values) {
            addCriterion("bjid in", values, "bjid");
            return (Criteria) this;
        }

        public Criteria andBjidNotIn(List<Integer> values) {
            addCriterion("bjid not in", values, "bjid");
            return (Criteria) this;
        }

        public Criteria andBjidBetween(Integer value1, Integer value2) {
            addCriterion("bjid between", value1, value2, "bjid");
            return (Criteria) this;
        }

        public Criteria andBjidNotBetween(Integer value1, Integer value2) {
            addCriterion("bjid not between", value1, value2, "bjid");
            return (Criteria) this;
        }

        public Criteria andYgidIsNull() {
            addCriterion("ygid is null");
            return (Criteria) this;
        }

        public Criteria andYgidIsNotNull() {
            addCriterion("ygid is not null");
            return (Criteria) this;
        }

        public Criteria andYgidEqualTo(Integer value) {
            addCriterion("ygid =", value, "ygid");
            return (Criteria) this;
        }

        public Criteria andYgidNotEqualTo(Integer value) {
            addCriterion("ygid <>", value, "ygid");
            return (Criteria) this;
        }

        public Criteria andYgidGreaterThan(Integer value) {
            addCriterion("ygid >", value, "ygid");
            return (Criteria) this;
        }

        public Criteria andYgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ygid >=", value, "ygid");
            return (Criteria) this;
        }

        public Criteria andYgidLessThan(Integer value) {
            addCriterion("ygid <", value, "ygid");
            return (Criteria) this;
        }

        public Criteria andYgidLessThanOrEqualTo(Integer value) {
            addCriterion("ygid <=", value, "ygid");
            return (Criteria) this;
        }

        public Criteria andYgidIn(List<Integer> values) {
            addCriterion("ygid in", values, "ygid");
            return (Criteria) this;
        }

        public Criteria andYgidNotIn(List<Integer> values) {
            addCriterion("ygid not in", values, "ygid");
            return (Criteria) this;
        }

        public Criteria andYgidBetween(Integer value1, Integer value2) {
            addCriterion("ygid between", value1, value2, "ygid");
            return (Criteria) this;
        }

        
        public Criteria andWuidIsNull() {
            addCriterion("wuid is null");
            return (Criteria) this;
        }

        public Criteria andWuidIsNotNull() {
            addCriterion("wuid is not null");
            return (Criteria) this;
        }

        public Criteria andWuidEqualTo(Integer value) {
            addCriterion("wuid =", value, "wuid");
            return (Criteria) this;
        }

        public Criteria andWuidNotEqualTo(Integer value) {
            addCriterion("wuid <>", value, "wuid");
            return (Criteria) this;
        }

        public Criteria andWuidGreaterThan(Integer value) {
            addCriterion("wuid >", value, "wuid");
            return (Criteria) this;
        }

        public Criteria andWuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wuid >=", value, "wuid");
            return (Criteria) this;
        }

        public Criteria andWuidLessThan(Integer value) {
            addCriterion("wuid <", value, "wuid");
            return (Criteria) this;
        }

        public Criteria andWuidLessThanOrEqualTo(Integer value) {
            addCriterion("wuid <=", value, "wuid");
            return (Criteria) this;
        }

        public Criteria andWuidIn(List<Integer> values) {
            addCriterion("wuid in", values, "wuid");
            return (Criteria) this;
        }

        public Criteria andWuidNotIn(List<Integer> values) {
            addCriterion("wuid not in", values, "wuid");
            return (Criteria) this;
        }

        public Criteria andWuidBetween(Integer value1, Integer value2) {
            addCriterion("wuid between", value1, value2, "wuid");
            return (Criteria) this;
        }

        public Criteria andWuidNotBetween(Integer value1, Integer value2) {
            addCriterion("wuid not between", value1, value2, "wuid");
            return (Criteria) this;
        }

        public Criteria andWzidIsNull() {
            addCriterion("wzid is null");
            return (Criteria) this;
        }

        public Criteria andWzidIsNotNull() {
            addCriterion("wzid is not null");
            return (Criteria) this;
        }

        public Criteria andWzidEqualTo(Integer value) {
            addCriterion("wzid =", value, "wzid");
            return (Criteria) this;
        }

        public Criteria andWzidNotEqualTo(Integer value) {
            addCriterion("wzid <>", value, "wzid");
            return (Criteria) this;
        }

        public Criteria andWzidGreaterThan(Integer value) {
            addCriterion("wzid >", value, "wzid");
            return (Criteria) this;
        }

        public Criteria andWzidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wzid >=", value, "wzid");
            return (Criteria) this;
        }

        public Criteria andWzidLessThan(Integer value) {
            addCriterion("wzid <", value, "wzid");
            return (Criteria) this;
        }

        public Criteria andWzidLessThanOrEqualTo(Integer value) {
            addCriterion("wzid <=", value, "wzid");
            return (Criteria) this;
        }

        public Criteria andWzidIn(List<Integer> values) {
            addCriterion("wzid in", values, "wzid");
            return (Criteria) this;
        }

        public Criteria andWzidNotIn(List<Integer> values) {
            addCriterion("wzid not in", values, "wzid");
            return (Criteria) this;
        }

        public Criteria andWzidBetween(Integer value1, Integer value2) {
            addCriterion("wzid between", value1, value2, "wzid");
            return (Criteria) this;
        }

        public Criteria andWzidNotBetween(Integer value1, Integer value2) {
            addCriterion("wzid not between", value1, value2, "wzid");
            return (Criteria) this;
        }

        public Criteria andWcaridIsNull() {
            addCriterion("wcarid is null");
            return (Criteria) this;
        }

        public Criteria andWcaridIsNotNull() {
            addCriterion("wcarid is not null");
            return (Criteria) this;
        }

        public Criteria andWcaridEqualTo(Integer value) {
            addCriterion("wcarid =", value, "wcarid");
            return (Criteria) this;
        }

        public Criteria andWcaridNotEqualTo(Integer value) {
            addCriterion("wcarid <>", value, "wcarid");
            return (Criteria) this;
        }

        public Criteria andWcaridGreaterThan(Integer value) {
            addCriterion("wcarid >", value, "wcarid");
            return (Criteria) this;
        }

        public Criteria andWcaridGreaterThanOrEqualTo(Integer value) {
            addCriterion("wcarid >=", value, "wcarid");
            return (Criteria) this;
        }

        public Criteria andWcaridLessThan(Integer value) {
            addCriterion("wcarid <", value, "wcarid");
            return (Criteria) this;
        }

        public Criteria andWcaridLessThanOrEqualTo(Integer value) {
            addCriterion("wcarid <=", value, "wcarid");
            return (Criteria) this;
        }

        public Criteria andWcaridIn(List<Integer> values) {
            addCriterion("wcarid in", values, "wcarid");
            return (Criteria) this;
        }

        public Criteria andWcaridNotIn(List<Integer> values) {
            addCriterion("wcarid not in", values, "wcarid");
            return (Criteria) this;
        }

        public Criteria andWcaridBetween(Integer value1, Integer value2) {
            addCriterion("wcarid between", value1, value2, "wcarid");
            return (Criteria) this;
        }

        public Criteria andWcaridNotBetween(Integer value1, Integer value2) {
            addCriterion("wcarid not between", value1, value2, "wcarid");
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