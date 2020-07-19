package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class CartypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CartypeExample() {
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

        public Criteria andJidIsNull() {
            addCriterion("jid is null");
            return (Criteria) this;
        }

        public Criteria andJidIsNotNull() {
            addCriterion("jid is not null");
            return (Criteria) this;
        }

        public Criteria andJidEqualTo(Integer value) {
            addCriterion("jid =", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotEqualTo(Integer value) {
            addCriterion("jid <>", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidGreaterThan(Integer value) {
            addCriterion("jid >", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jid >=", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidLessThan(Integer value) {
            addCriterion("jid <", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidLessThanOrEqualTo(Integer value) {
            addCriterion("jid <=", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidIn(List<Integer> values) {
            addCriterion("jid in", values, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotIn(List<Integer> values) {
            addCriterion("jid not in", values, "jid");
            return (Criteria) this;
        }

        public Criteria andJidBetween(Integer value1, Integer value2) {
            addCriterion("jid between", value1, value2, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotBetween(Integer value1, Integer value2) {
            addCriterion("jid not between", value1, value2, "jid");
            return (Criteria) this;
        }

        public Criteria andJtypenameIsNull() {
            addCriterion("jtypename is null");
            return (Criteria) this;
        }

        public Criteria andJtypenameIsNotNull() {
            addCriterion("jtypename is not null");
            return (Criteria) this;
        }

        public Criteria andJtypenameEqualTo(String value) {
            addCriterion("jtypename =", value, "jtypename");
            return (Criteria) this;
        }

        public Criteria andJtypenameNotEqualTo(String value) {
            addCriterion("jtypename <>", value, "jtypename");
            return (Criteria) this;
        }

        public Criteria andJtypenameGreaterThan(String value) {
            addCriterion("jtypename >", value, "jtypename");
            return (Criteria) this;
        }

        public Criteria andJtypenameGreaterThanOrEqualTo(String value) {
            addCriterion("jtypename >=", value, "jtypename");
            return (Criteria) this;
        }

        public Criteria andJtypenameLessThan(String value) {
            addCriterion("jtypename <", value, "jtypename");
            return (Criteria) this;
        }

        public Criteria andJtypenameLessThanOrEqualTo(String value) {
            addCriterion("jtypename <=", value, "jtypename");
            return (Criteria) this;
        }

        public Criteria andJtypenameLike(String value) {
            addCriterion("jtypename like", value, "jtypename");
            return (Criteria) this;
        }

        public Criteria andJtypenameNotLike(String value) {
            addCriterion("jtypename not like", value, "jtypename");
            return (Criteria) this;
        }

        public Criteria andJtypenameIn(List<String> values) {
            addCriterion("jtypename in", values, "jtypename");
            return (Criteria) this;
        }

        public Criteria andJtypenameNotIn(List<String> values) {
            addCriterion("jtypename not in", values, "jtypename");
            return (Criteria) this;
        }

        public Criteria andJtypenameBetween(String value1, String value2) {
            addCriterion("jtypename between", value1, value2, "jtypename");
            return (Criteria) this;
        }

        public Criteria andJtypenameNotBetween(String value1, String value2) {
            addCriterion("jtypename not between", value1, value2, "jtypename");
            return (Criteria) this;
        }

        public Criteria andJpriceIsNull() {
            addCriterion("jprice is null");
            return (Criteria) this;
        }

        public Criteria andJpriceIsNotNull() {
            addCriterion("jprice is not null");
            return (Criteria) this;
        }

        public Criteria andJpriceEqualTo(Float value) {
            addCriterion("jprice =", value, "jprice");
            return (Criteria) this;
        }

        public Criteria andJpriceNotEqualTo(Float value) {
            addCriterion("jprice <>", value, "jprice");
            return (Criteria) this;
        }

        public Criteria andJpriceGreaterThan(Float value) {
            addCriterion("jprice >", value, "jprice");
            return (Criteria) this;
        }

        public Criteria andJpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("jprice >=", value, "jprice");
            return (Criteria) this;
        }

        public Criteria andJpriceLessThan(Float value) {
            addCriterion("jprice <", value, "jprice");
            return (Criteria) this;
        }

        public Criteria andJpriceLessThanOrEqualTo(Float value) {
            addCriterion("jprice <=", value, "jprice");
            return (Criteria) this;
        }

        public Criteria andJpriceIn(List<Float> values) {
            addCriterion("jprice in", values, "jprice");
            return (Criteria) this;
        }

        public Criteria andJpriceNotIn(List<Float> values) {
            addCriterion("jprice not in", values, "jprice");
            return (Criteria) this;
        }

        public Criteria andJpriceBetween(Float value1, Float value2) {
            addCriterion("jprice between", value1, value2, "jprice");
            return (Criteria) this;
        }

        public Criteria andJpriceNotBetween(Float value1, Float value2) {
            addCriterion("jprice not between", value1, value2, "jprice");
            return (Criteria) this;
        }

        public Criteria andJmjIsNull() {
            addCriterion("jmj is null");
            return (Criteria) this;
        }

        public Criteria andJmjIsNotNull() {
            addCriterion("jmj is not null");
            return (Criteria) this;
        }

        public Criteria andJmjEqualTo(Float value) {
            addCriterion("jmj =", value, "jmj");
            return (Criteria) this;
        }

        public Criteria andJmjNotEqualTo(Float value) {
            addCriterion("jmj <>", value, "jmj");
            return (Criteria) this;
        }

        public Criteria andJmjGreaterThan(Float value) {
            addCriterion("jmj >", value, "jmj");
            return (Criteria) this;
        }

        public Criteria andJmjGreaterThanOrEqualTo(Float value) {
            addCriterion("jmj >=", value, "jmj");
            return (Criteria) this;
        }

        public Criteria andJmjLessThan(Float value) {
            addCriterion("jmj <", value, "jmj");
            return (Criteria) this;
        }

        public Criteria andJmjLessThanOrEqualTo(Float value) {
            addCriterion("jmj <=", value, "jmj");
            return (Criteria) this;
        }

        public Criteria andJmjIn(List<Float> values) {
            addCriterion("jmj in", values, "jmj");
            return (Criteria) this;
        }

        public Criteria andJmjNotIn(List<Float> values) {
            addCriterion("jmj not in", values, "jmj");
            return (Criteria) this;
        }

        public Criteria andJmjBetween(Float value1, Float value2) {
            addCriterion("jmj between", value1, value2, "jmj");
            return (Criteria) this;
        }

        public Criteria andJmjNotBetween(Float value1, Float value2) {
            addCriterion("jmj not between", value1, value2, "jmj");
            return (Criteria) this;
        }

        public Criteria andJgasIsNull() {
            addCriterion("jgas is null");
            return (Criteria) this;
        }

        public Criteria andJgasIsNotNull() {
            addCriterion("jgas is not null");
            return (Criteria) this;
        }

        public Criteria andJgasEqualTo(String value) {
            addCriterion("jgas =", value, "jgas");
            return (Criteria) this;
        }

        public Criteria andJgasNotEqualTo(String value) {
            addCriterion("jgas <>", value, "jgas");
            return (Criteria) this;
        }

        public Criteria andJgasGreaterThan(String value) {
            addCriterion("jgas >", value, "jgas");
            return (Criteria) this;
        }

        public Criteria andJgasGreaterThanOrEqualTo(String value) {
            addCriterion("jgas >=", value, "jgas");
            return (Criteria) this;
        }

        public Criteria andJgasLessThan(String value) {
            addCriterion("jgas <", value, "jgas");
            return (Criteria) this;
        }

        public Criteria andJgasLessThanOrEqualTo(String value) {
            addCriterion("jgas <=", value, "jgas");
            return (Criteria) this;
        }

        public Criteria andJgasLike(String value) {
            addCriterion("jgas like", value, "jgas");
            return (Criteria) this;
        }

        public Criteria andJgasNotLike(String value) {
            addCriterion("jgas not like", value, "jgas");
            return (Criteria) this;
        }

        public Criteria andJgasIn(List<String> values) {
            addCriterion("jgas in", values, "jgas");
            return (Criteria) this;
        }

        public Criteria andJgasNotIn(List<String> values) {
            addCriterion("jgas not in", values, "jgas");
            return (Criteria) this;
        }

        public Criteria andJgasBetween(String value1, String value2) {
            addCriterion("jgas between", value1, value2, "jgas");
            return (Criteria) this;
        }

        public Criteria andJgasNotBetween(String value1, String value2) {
            addCriterion("jgas not between", value1, value2, "jgas");
            return (Criteria) this;
        }

        public Criteria andJisdomesticIsNull() {
            addCriterion("jisdomestic is null");
            return (Criteria) this;
        }

        public Criteria andJisdomesticIsNotNull() {
            addCriterion("jisdomestic is not null");
            return (Criteria) this;
        }

        public Criteria andJisdomesticEqualTo(Integer value) {
            addCriterion("jisdomestic =", value, "jisdomestic");
            return (Criteria) this;
        }

        public Criteria andJisdomesticNotEqualTo(Integer value) {
            addCriterion("jisdomestic <>", value, "jisdomestic");
            return (Criteria) this;
        }

        public Criteria andJisdomesticGreaterThan(Integer value) {
            addCriterion("jisdomestic >", value, "jisdomestic");
            return (Criteria) this;
        }

        public Criteria andJisdomesticGreaterThanOrEqualTo(Integer value) {
            addCriterion("jisdomestic >=", value, "jisdomestic");
            return (Criteria) this;
        }

        public Criteria andJisdomesticLessThan(Integer value) {
            addCriterion("jisdomestic <", value, "jisdomestic");
            return (Criteria) this;
        }

        public Criteria andJisdomesticLessThanOrEqualTo(Integer value) {
            addCriterion("jisdomestic <=", value, "jisdomestic");
            return (Criteria) this;
        }

        public Criteria andJisdomesticIn(List<Integer> values) {
            addCriterion("jisdomestic in", values, "jisdomestic");
            return (Criteria) this;
        }

        public Criteria andJisdomesticNotIn(List<Integer> values) {
            addCriterion("jisdomestic not in", values, "jisdomestic");
            return (Criteria) this;
        }

        public Criteria andJisdomesticBetween(Integer value1, Integer value2) {
            addCriterion("jisdomestic between", value1, value2, "jisdomestic");
            return (Criteria) this;
        }

        public Criteria andJisdomesticNotBetween(Integer value1, Integer value2) {
            addCriterion("jisdomestic not between", value1, value2, "jisdomestic");
            return (Criteria) this;
        }

        public Criteria andJfuelidIsNull() {
            addCriterion("jfuelid is null");
            return (Criteria) this;
        }

        public Criteria andJfuelidIsNotNull() {
            addCriterion("jfuelid is not null");
            return (Criteria) this;
        }

        public Criteria andJfuelidEqualTo(Integer value) {
            addCriterion("jfuelid =", value, "jfuelid");
            return (Criteria) this;
        }

        public Criteria andJfuelidNotEqualTo(Integer value) {
            addCriterion("jfuelid <>", value, "jfuelid");
            return (Criteria) this;
        }

        public Criteria andJfuelidGreaterThan(Integer value) {
            addCriterion("jfuelid >", value, "jfuelid");
            return (Criteria) this;
        }

        public Criteria andJfuelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jfuelid >=", value, "jfuelid");
            return (Criteria) this;
        }

        public Criteria andJfuelidLessThan(Integer value) {
            addCriterion("jfuelid <", value, "jfuelid");
            return (Criteria) this;
        }

        public Criteria andJfuelidLessThanOrEqualTo(Integer value) {
            addCriterion("jfuelid <=", value, "jfuelid");
            return (Criteria) this;
        }

        public Criteria andJfuelidIn(List<Integer> values) {
            addCriterion("jfuelid in", values, "jfuelid");
            return (Criteria) this;
        }

        public Criteria andJfuelidNotIn(List<Integer> values) {
            addCriterion("jfuelid not in", values, "jfuelid");
            return (Criteria) this;
        }

        public Criteria andJfuelidBetween(Integer value1, Integer value2) {
            addCriterion("jfuelid between", value1, value2, "jfuelid");
            return (Criteria) this;
        }

        public Criteria andJfuelidNotBetween(Integer value1, Integer value2) {
            addCriterion("jfuelid not between", value1, value2, "jfuelid");
            return (Criteria) this;
        }

        public Criteria andJfourtypeIsNull() {
            addCriterion("jfourType is null");
            return (Criteria) this;
        }

        public Criteria andJfourtypeIsNotNull() {
            addCriterion("jfourType is not null");
            return (Criteria) this;
        }

        public Criteria andJfourtypeEqualTo(String value) {
            addCriterion("jfourType =", value, "jfourtype");
            return (Criteria) this;
        }

        public Criteria andJfourtypeNotEqualTo(String value) {
            addCriterion("jfourType <>", value, "jfourtype");
            return (Criteria) this;
        }

        public Criteria andJfourtypeGreaterThan(String value) {
            addCriterion("jfourType >", value, "jfourtype");
            return (Criteria) this;
        }

        public Criteria andJfourtypeGreaterThanOrEqualTo(String value) {
            addCriterion("jfourType >=", value, "jfourtype");
            return (Criteria) this;
        }

        public Criteria andJfourtypeLessThan(String value) {
            addCriterion("jfourType <", value, "jfourtype");
            return (Criteria) this;
        }

        public Criteria andJfourtypeLessThanOrEqualTo(String value) {
            addCriterion("jfourType <=", value, "jfourtype");
            return (Criteria) this;
        }

        public Criteria andJfourtypeLike(String value) {
            addCriterion("jfourType like", value, "jfourtype");
            return (Criteria) this;
        }

        public Criteria andJfourtypeNotLike(String value) {
            addCriterion("jfourType not like", value, "jfourtype");
            return (Criteria) this;
        }

        public Criteria andJfourtypeIn(List<String> values) {
            addCriterion("jfourType in", values, "jfourtype");
            return (Criteria) this;
        }

        public Criteria andJfourtypeNotIn(List<String> values) {
            addCriterion("jfourType not in", values, "jfourtype");
            return (Criteria) this;
        }

        public Criteria andJfourtypeBetween(String value1, String value2) {
            addCriterion("jfourType between", value1, value2, "jfourtype");
            return (Criteria) this;
        }

        public Criteria andJfourtypeNotBetween(String value1, String value2) {
            addCriterion("jfourType not between", value1, value2, "jfourtype");
            return (Criteria) this;
        }

        public Criteria andJbrandidIsNull() {
            addCriterion("jbrandid is null");
            return (Criteria) this;
        }

        public Criteria andJbrandidIsNotNull() {
            addCriterion("jbrandid is not null");
            return (Criteria) this;
        }

        public Criteria andJbrandidEqualTo(Integer value) {
            addCriterion("jbrandid =", value, "jbrandid");
            return (Criteria) this;
        }

        public Criteria andJbrandidNotEqualTo(Integer value) {
            addCriterion("jbrandid <>", value, "jbrandid");
            return (Criteria) this;
        }

        public Criteria andJbrandidGreaterThan(Integer value) {
            addCriterion("jbrandid >", value, "jbrandid");
            return (Criteria) this;
        }

        public Criteria andJbrandidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jbrandid >=", value, "jbrandid");
            return (Criteria) this;
        }

        public Criteria andJbrandidLessThan(Integer value) {
            addCriterion("jbrandid <", value, "jbrandid");
            return (Criteria) this;
        }

        public Criteria andJbrandidLessThanOrEqualTo(Integer value) {
            addCriterion("jbrandid <=", value, "jbrandid");
            return (Criteria) this;
        }

        public Criteria andJbrandidIn(List<Integer> values) {
            addCriterion("jbrandid in", values, "jbrandid");
            return (Criteria) this;
        }

        public Criteria andJbrandidNotIn(List<Integer> values) {
            addCriterion("jbrandid not in", values, "jbrandid");
            return (Criteria) this;
        }

        public Criteria andJbrandidBetween(Integer value1, Integer value2) {
            addCriterion("jbrandid between", value1, value2, "jbrandid");
            return (Criteria) this;
        }

        public Criteria andJbrandidNotBetween(Integer value1, Integer value2) {
            addCriterion("jbrandid not between", value1, value2, "jbrandid");
            return (Criteria) this;
        }

        public Criteria andJeidIsNull() {
            addCriterion("jeid is null");
            return (Criteria) this;
        }

        public Criteria andJeidIsNotNull() {
            addCriterion("jeid is not null");
            return (Criteria) this;
        }

        public Criteria andJeidEqualTo(Integer value) {
            addCriterion("jeid =", value, "jeid");
            return (Criteria) this;
        }

        public Criteria andJeidNotEqualTo(Integer value) {
            addCriterion("jeid <>", value, "jeid");
            return (Criteria) this;
        }

        public Criteria andJeidGreaterThan(Integer value) {
            addCriterion("jeid >", value, "jeid");
            return (Criteria) this;
        }

        public Criteria andJeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jeid >=", value, "jeid");
            return (Criteria) this;
        }

        public Criteria andJeidLessThan(Integer value) {
            addCriterion("jeid <", value, "jeid");
            return (Criteria) this;
        }

        public Criteria andJeidLessThanOrEqualTo(Integer value) {
            addCriterion("jeid <=", value, "jeid");
            return (Criteria) this;
        }

        public Criteria andJeidIn(List<Integer> values) {
            addCriterion("jeid in", values, "jeid");
            return (Criteria) this;
        }

        public Criteria andJeidNotIn(List<Integer> values) {
            addCriterion("jeid not in", values, "jeid");
            return (Criteria) this;
        }

        public Criteria andJeidBetween(Integer value1, Integer value2) {
            addCriterion("jeid between", value1, value2, "jeid");
            return (Criteria) this;
        }

        public Criteria andJeidNotBetween(Integer value1, Integer value2) {
            addCriterion("jeid not between", value1, value2, "jeid");
            return (Criteria) this;
        }

        public Criteria andJpowerIsNull() {
            addCriterion("jpower is null");
            return (Criteria) this;
        }

        public Criteria andJpowerIsNotNull() {
            addCriterion("jpower is not null");
            return (Criteria) this;
        }

        public Criteria andJpowerEqualTo(String value) {
            addCriterion("jpower =", value, "jpower");
            return (Criteria) this;
        }

        public Criteria andJpowerNotEqualTo(String value) {
            addCriterion("jpower <>", value, "jpower");
            return (Criteria) this;
        }

        public Criteria andJpowerGreaterThan(String value) {
            addCriterion("jpower >", value, "jpower");
            return (Criteria) this;
        }

        public Criteria andJpowerGreaterThanOrEqualTo(String value) {
            addCriterion("jpower >=", value, "jpower");
            return (Criteria) this;
        }

        public Criteria andJpowerLessThan(String value) {
            addCriterion("jpower <", value, "jpower");
            return (Criteria) this;
        }

        public Criteria andJpowerLessThanOrEqualTo(String value) {
            addCriterion("jpower <=", value, "jpower");
            return (Criteria) this;
        }

        public Criteria andJpowerLike(String value) {
            addCriterion("jpower like", value, "jpower");
            return (Criteria) this;
        }

        public Criteria andJpowerNotLike(String value) {
            addCriterion("jpower not like", value, "jpower");
            return (Criteria) this;
        }

        public Criteria andJpowerIn(List<String> values) {
            addCriterion("jpower in", values, "jpower");
            return (Criteria) this;
        }

        public Criteria andJpowerNotIn(List<String> values) {
            addCriterion("jpower not in", values, "jpower");
            return (Criteria) this;
        }

        public Criteria andJpowerBetween(String value1, String value2) {
            addCriterion("jpower between", value1, value2, "jpower");
            return (Criteria) this;
        }

        public Criteria andJpowerNotBetween(String value1, String value2) {
            addCriterion("jpower not between", value1, value2, "jpower");
            return (Criteria) this;
        }

        public Criteria andJloadIsNull() {
            addCriterion("jload is null");
            return (Criteria) this;
        }

        public Criteria andJloadIsNotNull() {
            addCriterion("jload is not null");
            return (Criteria) this;
        }

        public Criteria andJloadEqualTo(Integer value) {
            addCriterion("jload =", value, "jload");
            return (Criteria) this;
        }

        public Criteria andJloadNotEqualTo(Integer value) {
            addCriterion("jload <>", value, "jload");
            return (Criteria) this;
        }

        public Criteria andJloadGreaterThan(Integer value) {
            addCriterion("jload >", value, "jload");
            return (Criteria) this;
        }

        public Criteria andJloadGreaterThanOrEqualTo(Integer value) {
            addCriterion("jload >=", value, "jload");
            return (Criteria) this;
        }

        public Criteria andJloadLessThan(Integer value) {
            addCriterion("jload <", value, "jload");
            return (Criteria) this;
        }

        public Criteria andJloadLessThanOrEqualTo(Integer value) {
            addCriterion("jload <=", value, "jload");
            return (Criteria) this;
        }

        public Criteria andJloadIn(List<Integer> values) {
            addCriterion("jload in", values, "jload");
            return (Criteria) this;
        }

        public Criteria andJloadNotIn(List<Integer> values) {
            addCriterion("jload not in", values, "jload");
            return (Criteria) this;
        }

        public Criteria andJloadBetween(Integer value1, Integer value2) {
            addCriterion("jload between", value1, value2, "jload");
            return (Criteria) this;
        }

        public Criteria andJloadNotBetween(Integer value1, Integer value2) {
            addCriterion("jload not between", value1, value2, "jload");
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