package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andAbidIsNull() {
            addCriterion("abid is null");
            return (Criteria) this;
        }

        public Criteria andAbidIsNotNull() {
            addCriterion("abid is not null");
            return (Criteria) this;
        }

        public Criteria andAbidEqualTo(Integer value) {
            addCriterion("abid =", value, "abid");
            return (Criteria) this;
        }

        public Criteria andAbidNotEqualTo(Integer value) {
            addCriterion("abid <>", value, "abid");
            return (Criteria) this;
        }

        public Criteria andAbidGreaterThan(Integer value) {
            addCriterion("abid >", value, "abid");
            return (Criteria) this;
        }

        public Criteria andAbidGreaterThanOrEqualTo(Integer value) {
            addCriterion("abid >=", value, "abid");
            return (Criteria) this;
        }

        public Criteria andAbidLessThan(Integer value) {
            addCriterion("abid <", value, "abid");
            return (Criteria) this;
        }

        public Criteria andAbidLessThanOrEqualTo(Integer value) {
            addCriterion("abid <=", value, "abid");
            return (Criteria) this;
        }

        public Criteria andAbidIn(List<Integer> values) {
            addCriterion("abid in", values, "abid");
            return (Criteria) this;
        }

        public Criteria andAbidNotIn(List<Integer> values) {
            addCriterion("abid not in", values, "abid");
            return (Criteria) this;
        }

        public Criteria andAbidBetween(Integer value1, Integer value2) {
            addCriterion("abid between", value1, value2, "abid");
            return (Criteria) this;
        }

        public Criteria andAbidNotBetween(Integer value1, Integer value2) {
            addCriterion("abid not between", value1, value2, "abid");
            return (Criteria) this;
        }

        public Criteria andAbregisterstoresIsNull() {
            addCriterion("abregisterstores is null");
            return (Criteria) this;
        }

        public Criteria andAbregisterstoresIsNotNull() {
            addCriterion("abregisterstores is not null");
            return (Criteria) this;
        }

        public Criteria andAbregisterstoresEqualTo(String value) {
            addCriterion("abregisterstores =", value, "abregisterstores");
            return (Criteria) this;
        }

        public Criteria andAbregisterstoresNotEqualTo(String value) {
            addCriterion("abregisterstores <>", value, "abregisterstores");
            return (Criteria) this;
        }

        public Criteria andAbregisterstoresGreaterThan(String value) {
            addCriterion("abregisterstores >", value, "abregisterstores");
            return (Criteria) this;
        }

        public Criteria andAbregisterstoresGreaterThanOrEqualTo(String value) {
            addCriterion("abregisterstores >=", value, "abregisterstores");
            return (Criteria) this;
        }

        public Criteria andAbregisterstoresLessThan(String value) {
            addCriterion("abregisterstores <", value, "abregisterstores");
            return (Criteria) this;
        }

        public Criteria andAbregisterstoresLessThanOrEqualTo(String value) {
            addCriterion("abregisterstores <=", value, "abregisterstores");
            return (Criteria) this;
        }

        public Criteria andAbregisterstoresLike(String value) {
            addCriterion("abregisterstores like", value, "abregisterstores");
            return (Criteria) this;
        }

        public Criteria andAbregisterstoresNotLike(String value) {
            addCriterion("abregisterstores not like", value, "abregisterstores");
            return (Criteria) this;
        }

        public Criteria andAbregisterstoresIn(List<String> values) {
            addCriterion("abregisterstores in", values, "abregisterstores");
            return (Criteria) this;
        }

        public Criteria andAbregisterstoresNotIn(List<String> values) {
            addCriterion("abregisterstores not in", values, "abregisterstores");
            return (Criteria) this;
        }

        public Criteria andAbregisterstoresBetween(String value1, String value2) {
            addCriterion("abregisterstores between", value1, value2, "abregisterstores");
            return (Criteria) this;
        }

        public Criteria andAbregisterstoresNotBetween(String value1, String value2) {
            addCriterion("abregisterstores not between", value1, value2, "abregisterstores");
            return (Criteria) this;
        }

        public Criteria andAbimagenameIsNull() {
            addCriterion("abimagename is null");
            return (Criteria) this;
        }

        public Criteria andAbimagenameIsNotNull() {
            addCriterion("abimagename is not null");
            return (Criteria) this;
        }

        public Criteria andAbimagenameEqualTo(String value) {
            addCriterion("abimagename =", value, "abimagename");
            return (Criteria) this;
        }

        public Criteria andAbimagenameNotEqualTo(String value) {
            addCriterion("abimagename <>", value, "abimagename");
            return (Criteria) this;
        }

        public Criteria andAbimagenameGreaterThan(String value) {
            addCriterion("abimagename >", value, "abimagename");
            return (Criteria) this;
        }

        public Criteria andAbimagenameGreaterThanOrEqualTo(String value) {
            addCriterion("abimagename >=", value, "abimagename");
            return (Criteria) this;
        }

        public Criteria andAbimagenameLessThan(String value) {
            addCriterion("abimagename <", value, "abimagename");
            return (Criteria) this;
        }

        public Criteria andAbimagenameLessThanOrEqualTo(String value) {
            addCriterion("abimagename <=", value, "abimagename");
            return (Criteria) this;
        }

        public Criteria andAbimagenameLike(String value) {
            addCriterion("abimagename like", value, "abimagename");
            return (Criteria) this;
        }

        public Criteria andAbimagenameNotLike(String value) {
            addCriterion("abimagename not like", value, "abimagename");
            return (Criteria) this;
        }

        public Criteria andAbimagenameIn(List<String> values) {
            addCriterion("abimagename in", values, "abimagename");
            return (Criteria) this;
        }

        public Criteria andAbimagenameNotIn(List<String> values) {
            addCriterion("abimagename not in", values, "abimagename");
            return (Criteria) this;
        }

        public Criteria andAbimagenameBetween(String value1, String value2) {
            addCriterion("abimagename between", value1, value2, "abimagename");
            return (Criteria) this;
        }

        public Criteria andAbimagenameNotBetween(String value1, String value2) {
            addCriterion("abimagename not between", value1, value2, "abimagename");
            return (Criteria) this;
        }

        public Criteria andAbcodeIsNull() {
            addCriterion("abcode is null");
            return (Criteria) this;
        }

        public Criteria andAbcodeIsNotNull() {
            addCriterion("abcode is not null");
            return (Criteria) this;
        }

        public Criteria andAbcodeEqualTo(String value) {
            addCriterion("abcode =", value, "abcode");
            return (Criteria) this;
        }

        public Criteria andAbcodeNotEqualTo(String value) {
            addCriterion("abcode <>", value, "abcode");
            return (Criteria) this;
        }

        public Criteria andAbcodeGreaterThan(String value) {
            addCriterion("abcode >", value, "abcode");
            return (Criteria) this;
        }

        public Criteria andAbcodeGreaterThanOrEqualTo(String value) {
            addCriterion("abcode >=", value, "abcode");
            return (Criteria) this;
        }

        public Criteria andAbcodeLessThan(String value) {
            addCriterion("abcode <", value, "abcode");
            return (Criteria) this;
        }

        public Criteria andAbcodeLessThanOrEqualTo(String value) {
            addCriterion("abcode <=", value, "abcode");
            return (Criteria) this;
        }

        public Criteria andAbcodeLike(String value) {
            addCriterion("abcode like", value, "abcode");
            return (Criteria) this;
        }

        public Criteria andAbcodeNotLike(String value) {
            addCriterion("abcode not like", value, "abcode");
            return (Criteria) this;
        }

        public Criteria andAbcodeIn(List<String> values) {
            addCriterion("abcode in", values, "abcode");
            return (Criteria) this;
        }

        public Criteria andAbcodeNotIn(List<String> values) {
            addCriterion("abcode not in", values, "abcode");
            return (Criteria) this;
        }

        public Criteria andAbcodeBetween(String value1, String value2) {
            addCriterion("abcode between", value1, value2, "abcode");
            return (Criteria) this;
        }

        public Criteria andAbcodeNotBetween(String value1, String value2) {
            addCriterion("abcode not between", value1, value2, "abcode");
            return (Criteria) this;
        }

        public Criteria andAbshopnameIsNull() {
            addCriterion("abshopname is null");
            return (Criteria) this;
        }

        public Criteria andAbshopnameIsNotNull() {
            addCriterion("abshopname is not null");
            return (Criteria) this;
        }

        public Criteria andAbshopnameEqualTo(String value) {
            addCriterion("abshopname =", value, "abshopname");
            return (Criteria) this;
        }

        public Criteria andAbshopnameNotEqualTo(String value) {
            addCriterion("abshopname <>", value, "abshopname");
            return (Criteria) this;
        }

        public Criteria andAbshopnameGreaterThan(String value) {
            addCriterion("abshopname >", value, "abshopname");
            return (Criteria) this;
        }

        public Criteria andAbshopnameGreaterThanOrEqualTo(String value) {
            addCriterion("abshopname >=", value, "abshopname");
            return (Criteria) this;
        }

        public Criteria andAbshopnameLessThan(String value) {
            addCriterion("abshopname <", value, "abshopname");
            return (Criteria) this;
        }

        public Criteria andAbshopnameLessThanOrEqualTo(String value) {
            addCriterion("abshopname <=", value, "abshopname");
            return (Criteria) this;
        }

        public Criteria andAbshopnameLike(String value) {
            addCriterion("abshopname like", value, "abshopname");
            return (Criteria) this;
        }

        public Criteria andAbshopnameNotLike(String value) {
            addCriterion("abshopname not like", value, "abshopname");
            return (Criteria) this;
        }

        public Criteria andAbshopnameIn(List<String> values) {
            addCriterion("abshopname in", values, "abshopname");
            return (Criteria) this;
        }

        public Criteria andAbshopnameNotIn(List<String> values) {
            addCriterion("abshopname not in", values, "abshopname");
            return (Criteria) this;
        }

        public Criteria andAbshopnameBetween(String value1, String value2) {
            addCriterion("abshopname between", value1, value2, "abshopname");
            return (Criteria) this;
        }

        public Criteria andAbshopnameNotBetween(String value1, String value2) {
            addCriterion("abshopname not between", value1, value2, "abshopname");
            return (Criteria) this;
        }

        public Criteria andAbshopbrandidIsNull() {
            addCriterion("abshopbrandid is null");
            return (Criteria) this;
        }

        public Criteria andAbshopbrandidIsNotNull() {
            addCriterion("abshopbrandid is not null");
            return (Criteria) this;
        }

        public Criteria andAbshopbrandidEqualTo(Integer value) {
            addCriterion("abshopbrandid =", value, "abshopbrandid");
            return (Criteria) this;
        }

        public Criteria andAbshopbrandidNotEqualTo(Integer value) {
            addCriterion("abshopbrandid <>", value, "abshopbrandid");
            return (Criteria) this;
        }

        public Criteria andAbshopbrandidGreaterThan(Integer value) {
            addCriterion("abshopbrandid >", value, "abshopbrandid");
            return (Criteria) this;
        }

        public Criteria andAbshopbrandidGreaterThanOrEqualTo(Integer value) {
            addCriterion("abshopbrandid >=", value, "abshopbrandid");
            return (Criteria) this;
        }

        public Criteria andAbshopbrandidLessThan(Integer value) {
            addCriterion("abshopbrandid <", value, "abshopbrandid");
            return (Criteria) this;
        }

        public Criteria andAbshopbrandidLessThanOrEqualTo(Integer value) {
            addCriterion("abshopbrandid <=", value, "abshopbrandid");
            return (Criteria) this;
        }

        public Criteria andAbshopbrandidIn(List<Integer> values) {
            addCriterion("abshopbrandid in", values, "abshopbrandid");
            return (Criteria) this;
        }

        public Criteria andAbshopbrandidNotIn(List<Integer> values) {
            addCriterion("abshopbrandid not in", values, "abshopbrandid");
            return (Criteria) this;
        }

        public Criteria andAbshopbrandidBetween(Integer value1, Integer value2) {
            addCriterion("abshopbrandid between", value1, value2, "abshopbrandid");
            return (Criteria) this;
        }

        public Criteria andAbshopbrandidNotBetween(Integer value1, Integer value2) {
            addCriterion("abshopbrandid not between", value1, value2, "abshopbrandid");
            return (Criteria) this;
        }

        public Criteria andAbarcticIsNull() {
            addCriterion("abarctic is null");
            return (Criteria) this;
        }

        public Criteria andAbarcticIsNotNull() {
            addCriterion("abarctic is not null");
            return (Criteria) this;
        }

        public Criteria andAbarcticEqualTo(String value) {
            addCriterion("abarctic =", value, "abarctic");
            return (Criteria) this;
        }

        public Criteria andAbarcticNotEqualTo(String value) {
            addCriterion("abarctic <>", value, "abarctic");
            return (Criteria) this;
        }

        public Criteria andAbarcticGreaterThan(String value) {
            addCriterion("abarctic >", value, "abarctic");
            return (Criteria) this;
        }

        public Criteria andAbarcticGreaterThanOrEqualTo(String value) {
            addCriterion("abarctic >=", value, "abarctic");
            return (Criteria) this;
        }

        public Criteria andAbarcticLessThan(String value) {
            addCriterion("abarctic <", value, "abarctic");
            return (Criteria) this;
        }

        public Criteria andAbarcticLessThanOrEqualTo(String value) {
            addCriterion("abarctic <=", value, "abarctic");
            return (Criteria) this;
        }

        public Criteria andAbarcticLike(String value) {
            addCriterion("abarctic like", value, "abarctic");
            return (Criteria) this;
        }

        public Criteria andAbarcticNotLike(String value) {
            addCriterion("abarctic not like", value, "abarctic");
            return (Criteria) this;
        }

        public Criteria andAbarcticIn(List<String> values) {
            addCriterion("abarctic in", values, "abarctic");
            return (Criteria) this;
        }

        public Criteria andAbarcticNotIn(List<String> values) {
            addCriterion("abarctic not in", values, "abarctic");
            return (Criteria) this;
        }

        public Criteria andAbarcticBetween(String value1, String value2) {
            addCriterion("abarctic between", value1, value2, "abarctic");
            return (Criteria) this;
        }

        public Criteria andAbarcticNotBetween(String value1, String value2) {
            addCriterion("abarctic not between", value1, value2, "abarctic");
            return (Criteria) this;
        }

        public Criteria andAbuoqIsNull() {
            addCriterion("abuoq is null");
            return (Criteria) this;
        }

        public Criteria andAbuoqIsNotNull() {
            addCriterion("abuoq is not null");
            return (Criteria) this;
        }

        public Criteria andAbuoqEqualTo(Integer value) {
            addCriterion("abuoq =", value, "abuoq");
            return (Criteria) this;
        }

        public Criteria andAbuoqNotEqualTo(Integer value) {
            addCriterion("abuoq <>", value, "abuoq");
            return (Criteria) this;
        }

        public Criteria andAbuoqGreaterThan(Integer value) {
            addCriterion("abuoq >", value, "abuoq");
            return (Criteria) this;
        }

        public Criteria andAbuoqGreaterThanOrEqualTo(Integer value) {
            addCriterion("abuoq >=", value, "abuoq");
            return (Criteria) this;
        }

        public Criteria andAbuoqLessThan(Integer value) {
            addCriterion("abuoq <", value, "abuoq");
            return (Criteria) this;
        }

        public Criteria andAbuoqLessThanOrEqualTo(Integer value) {
            addCriterion("abuoq <=", value, "abuoq");
            return (Criteria) this;
        }

        public Criteria andAbuoqIn(List<Integer> values) {
            addCriterion("abuoq in", values, "abuoq");
            return (Criteria) this;
        }

        public Criteria andAbuoqNotIn(List<Integer> values) {
            addCriterion("abuoq not in", values, "abuoq");
            return (Criteria) this;
        }

        public Criteria andAbuoqBetween(Integer value1, Integer value2) {
            addCriterion("abuoq between", value1, value2, "abuoq");
            return (Criteria) this;
        }

        public Criteria andAbuoqNotBetween(Integer value1, Integer value2) {
            addCriterion("abuoq not between", value1, value2, "abuoq");
            return (Criteria) this;
        }

        public Criteria andAbshoplidIsNull() {
            addCriterion("abshoplid is null");
            return (Criteria) this;
        }

        public Criteria andAbshoplidIsNotNull() {
            addCriterion("abshoplid is not null");
            return (Criteria) this;
        }

        public Criteria andAbshoplidEqualTo(Integer value) {
            addCriterion("abshoplid =", value, "abshoplid");
            return (Criteria) this;
        }

        public Criteria andAbshoplidNotEqualTo(Integer value) {
            addCriterion("abshoplid <>", value, "abshoplid");
            return (Criteria) this;
        }

        public Criteria andAbshoplidGreaterThan(Integer value) {
            addCriterion("abshoplid >", value, "abshoplid");
            return (Criteria) this;
        }

        public Criteria andAbshoplidGreaterThanOrEqualTo(Integer value) {
            addCriterion("abshoplid >=", value, "abshoplid");
            return (Criteria) this;
        }

        public Criteria andAbshoplidLessThan(Integer value) {
            addCriterion("abshoplid <", value, "abshoplid");
            return (Criteria) this;
        }

        public Criteria andAbshoplidLessThanOrEqualTo(Integer value) {
            addCriterion("abshoplid <=", value, "abshoplid");
            return (Criteria) this;
        }

        public Criteria andAbshoplidIn(List<Integer> values) {
            addCriterion("abshoplid in", values, "abshoplid");
            return (Criteria) this;
        }

        public Criteria andAbshoplidNotIn(List<Integer> values) {
            addCriterion("abshoplid not in", values, "abshoplid");
            return (Criteria) this;
        }

        public Criteria andAbshoplidBetween(Integer value1, Integer value2) {
            addCriterion("abshoplid between", value1, value2, "abshoplid");
            return (Criteria) this;
        }

        public Criteria andAbshoplidNotBetween(Integer value1, Integer value2) {
            addCriterion("abshoplid not between", value1, value2, "abshoplid");
            return (Criteria) this;
        }

        public Criteria andAbincomeIsNull() {
            addCriterion("abincome is null");
            return (Criteria) this;
        }

        public Criteria andAbincomeIsNotNull() {
            addCriterion("abincome is not null");
            return (Criteria) this;
        }

        public Criteria andAbincomeEqualTo(Integer value) {
            addCriterion("abincome =", value, "abincome");
            return (Criteria) this;
        }

        public Criteria andAbincomeNotEqualTo(Integer value) {
            addCriterion("abincome <>", value, "abincome");
            return (Criteria) this;
        }

        public Criteria andAbincomeGreaterThan(Integer value) {
            addCriterion("abincome >", value, "abincome");
            return (Criteria) this;
        }

        public Criteria andAbincomeGreaterThanOrEqualTo(Integer value) {
            addCriterion("abincome >=", value, "abincome");
            return (Criteria) this;
        }

        public Criteria andAbincomeLessThan(Integer value) {
            addCriterion("abincome <", value, "abincome");
            return (Criteria) this;
        }

        public Criteria andAbincomeLessThanOrEqualTo(Integer value) {
            addCriterion("abincome <=", value, "abincome");
            return (Criteria) this;
        }

        public Criteria andAbincomeIn(List<Integer> values) {
            addCriterion("abincome in", values, "abincome");
            return (Criteria) this;
        }

        public Criteria andAbincomeNotIn(List<Integer> values) {
            addCriterion("abincome not in", values, "abincome");
            return (Criteria) this;
        }

        public Criteria andAbincomeBetween(Integer value1, Integer value2) {
            addCriterion("abincome between", value1, value2, "abincome");
            return (Criteria) this;
        }

        public Criteria andAbincomeNotBetween(Integer value1, Integer value2) {
            addCriterion("abincome not between", value1, value2, "abincome");
            return (Criteria) this;
        }

        public Criteria andAboriginalIsNull() {
            addCriterion("abOriginal is null");
            return (Criteria) this;
        }

        public Criteria andAboriginalIsNotNull() {
            addCriterion("abOriginal is not null");
            return (Criteria) this;
        }

        public Criteria andAboriginalEqualTo(Integer value) {
            addCriterion("abOriginal =", value, "aboriginal");
            return (Criteria) this;
        }

        public Criteria andAboriginalNotEqualTo(Integer value) {
            addCriterion("abOriginal <>", value, "aboriginal");
            return (Criteria) this;
        }

        public Criteria andAboriginalGreaterThan(Integer value) {
            addCriterion("abOriginal >", value, "aboriginal");
            return (Criteria) this;
        }

        public Criteria andAboriginalGreaterThanOrEqualTo(Integer value) {
            addCriterion("abOriginal >=", value, "aboriginal");
            return (Criteria) this;
        }

        public Criteria andAboriginalLessThan(Integer value) {
            addCriterion("abOriginal <", value, "aboriginal");
            return (Criteria) this;
        }

        public Criteria andAboriginalLessThanOrEqualTo(Integer value) {
            addCriterion("abOriginal <=", value, "aboriginal");
            return (Criteria) this;
        }

        public Criteria andAboriginalIn(List<Integer> values) {
            addCriterion("abOriginal in", values, "aboriginal");
            return (Criteria) this;
        }

        public Criteria andAboriginalNotIn(List<Integer> values) {
            addCriterion("abOriginal not in", values, "aboriginal");
            return (Criteria) this;
        }

        public Criteria andAboriginalBetween(Integer value1, Integer value2) {
            addCriterion("abOriginal between", value1, value2, "aboriginal");
            return (Criteria) this;
        }

        public Criteria andAboriginalNotBetween(Integer value1, Integer value2) {
            addCriterion("abOriginal not between", value1, value2, "aboriginal");
            return (Criteria) this;
        }

        public Criteria andAbshopgradeIsNull() {
            addCriterion("abshopgrade is null");
            return (Criteria) this;
        }

        public Criteria andAbshopgradeIsNotNull() {
            addCriterion("abshopgrade is not null");
            return (Criteria) this;
        }

        public Criteria andAbshopgradeEqualTo(Integer value) {
            addCriterion("abshopgrade =", value, "abshopgrade");
            return (Criteria) this;
        }

        public Criteria andAbshopgradeNotEqualTo(Integer value) {
            addCriterion("abshopgrade <>", value, "abshopgrade");
            return (Criteria) this;
        }

        public Criteria andAbshopgradeGreaterThan(Integer value) {
            addCriterion("abshopgrade >", value, "abshopgrade");
            return (Criteria) this;
        }

        public Criteria andAbshopgradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("abshopgrade >=", value, "abshopgrade");
            return (Criteria) this;
        }

        public Criteria andAbshopgradeLessThan(Integer value) {
            addCriterion("abshopgrade <", value, "abshopgrade");
            return (Criteria) this;
        }

        public Criteria andAbshopgradeLessThanOrEqualTo(Integer value) {
            addCriterion("abshopgrade <=", value, "abshopgrade");
            return (Criteria) this;
        }

        public Criteria andAbshopgradeIn(List<Integer> values) {
            addCriterion("abshopgrade in", values, "abshopgrade");
            return (Criteria) this;
        }

        public Criteria andAbshopgradeNotIn(List<Integer> values) {
            addCriterion("abshopgrade not in", values, "abshopgrade");
            return (Criteria) this;
        }

        public Criteria andAbshopgradeBetween(Integer value1, Integer value2) {
            addCriterion("abshopgrade between", value1, value2, "abshopgrade");
            return (Criteria) this;
        }

        public Criteria andAbshopgradeNotBetween(Integer value1, Integer value2) {
            addCriterion("abshopgrade not between", value1, value2, "abshopgrade");
            return (Criteria) this;
        }

        public Criteria andAbshopareaIsNull() {
            addCriterion("abshoparea is null");
            return (Criteria) this;
        }

        public Criteria andAbshopareaIsNotNull() {
            addCriterion("abshoparea is not null");
            return (Criteria) this;
        }

        public Criteria andAbshopareaEqualTo(Integer value) {
            addCriterion("abshoparea =", value, "abshoparea");
            return (Criteria) this;
        }

        public Criteria andAbshopareaNotEqualTo(Integer value) {
            addCriterion("abshoparea <>", value, "abshoparea");
            return (Criteria) this;
        }

        public Criteria andAbshopareaGreaterThan(Integer value) {
            addCriterion("abshoparea >", value, "abshoparea");
            return (Criteria) this;
        }

        public Criteria andAbshopareaGreaterThanOrEqualTo(Integer value) {
            addCriterion("abshoparea >=", value, "abshoparea");
            return (Criteria) this;
        }

        public Criteria andAbshopareaLessThan(Integer value) {
            addCriterion("abshoparea <", value, "abshoparea");
            return (Criteria) this;
        }

        public Criteria andAbshopareaLessThanOrEqualTo(Integer value) {
            addCriterion("abshoparea <=", value, "abshoparea");
            return (Criteria) this;
        }

        public Criteria andAbshopareaIn(List<Integer> values) {
            addCriterion("abshoparea in", values, "abshoparea");
            return (Criteria) this;
        }

        public Criteria andAbshopareaNotIn(List<Integer> values) {
            addCriterion("abshoparea not in", values, "abshoparea");
            return (Criteria) this;
        }

        public Criteria andAbshopareaBetween(Integer value1, Integer value2) {
            addCriterion("abshoparea between", value1, value2, "abshoparea");
            return (Criteria) this;
        }

        public Criteria andAbshopareaNotBetween(Integer value1, Integer value2) {
            addCriterion("abshoparea not between", value1, value2, "abshoparea");
            return (Criteria) this;
        }

        public Criteria andAbtradenameIsNull() {
            addCriterion("abtradename is null");
            return (Criteria) this;
        }

        public Criteria andAbtradenameIsNotNull() {
            addCriterion("abtradename is not null");
            return (Criteria) this;
        }

        public Criteria andAbtradenameEqualTo(Integer value) {
            addCriterion("abtradename =", value, "abtradename");
            return (Criteria) this;
        }

        public Criteria andAbtradenameNotEqualTo(Integer value) {
            addCriterion("abtradename <>", value, "abtradename");
            return (Criteria) this;
        }

        public Criteria andAbtradenameGreaterThan(Integer value) {
            addCriterion("abtradename >", value, "abtradename");
            return (Criteria) this;
        }

        public Criteria andAbtradenameGreaterThanOrEqualTo(Integer value) {
            addCriterion("abtradename >=", value, "abtradename");
            return (Criteria) this;
        }

        public Criteria andAbtradenameLessThan(Integer value) {
            addCriterion("abtradename <", value, "abtradename");
            return (Criteria) this;
        }

        public Criteria andAbtradenameLessThanOrEqualTo(Integer value) {
            addCriterion("abtradename <=", value, "abtradename");
            return (Criteria) this;
        }

        public Criteria andAbtradenameIn(List<Integer> values) {
            addCriterion("abtradename in", values, "abtradename");
            return (Criteria) this;
        }

        public Criteria andAbtradenameNotIn(List<Integer> values) {
            addCriterion("abtradename not in", values, "abtradename");
            return (Criteria) this;
        }

        public Criteria andAbtradenameBetween(Integer value1, Integer value2) {
            addCriterion("abtradename between", value1, value2, "abtradename");
            return (Criteria) this;
        }

        public Criteria andAbtradenameNotBetween(Integer value1, Integer value2) {
            addCriterion("abtradename not between", value1, value2, "abtradename");
            return (Criteria) this;
        }

        public Criteria andAbofcodeIsNull() {
            addCriterion("abofcode is null");
            return (Criteria) this;
        }

        public Criteria andAbofcodeIsNotNull() {
            addCriterion("abofcode is not null");
            return (Criteria) this;
        }

        public Criteria andAbofcodeEqualTo(String value) {
            addCriterion("abofcode =", value, "abofcode");
            return (Criteria) this;
        }

        public Criteria andAbofcodeNotEqualTo(String value) {
            addCriterion("abofcode <>", value, "abofcode");
            return (Criteria) this;
        }

        public Criteria andAbofcodeGreaterThan(String value) {
            addCriterion("abofcode >", value, "abofcode");
            return (Criteria) this;
        }

        public Criteria andAbofcodeGreaterThanOrEqualTo(String value) {
            addCriterion("abofcode >=", value, "abofcode");
            return (Criteria) this;
        }

        public Criteria andAbofcodeLessThan(String value) {
            addCriterion("abofcode <", value, "abofcode");
            return (Criteria) this;
        }

        public Criteria andAbofcodeLessThanOrEqualTo(String value) {
            addCriterion("abofcode <=", value, "abofcode");
            return (Criteria) this;
        }

        public Criteria andAbofcodeLike(String value) {
            addCriterion("abofcode like", value, "abofcode");
            return (Criteria) this;
        }

        public Criteria andAbofcodeNotLike(String value) {
            addCriterion("abofcode not like", value, "abofcode");
            return (Criteria) this;
        }

        public Criteria andAbofcodeIn(List<String> values) {
            addCriterion("abofcode in", values, "abofcode");
            return (Criteria) this;
        }

        public Criteria andAbofcodeNotIn(List<String> values) {
            addCriterion("abofcode not in", values, "abofcode");
            return (Criteria) this;
        }

        public Criteria andAbofcodeBetween(String value1, String value2) {
            addCriterion("abofcode between", value1, value2, "abofcode");
            return (Criteria) this;
        }

        public Criteria andAbofcodeNotBetween(String value1, String value2) {
            addCriterion("abofcode not between", value1, value2, "abofcode");
            return (Criteria) this;
        }

        public Criteria andAbbarcodeIsNull() {
            addCriterion("abbarcode is null");
            return (Criteria) this;
        }

        public Criteria andAbbarcodeIsNotNull() {
            addCriterion("abbarcode is not null");
            return (Criteria) this;
        }

        public Criteria andAbbarcodeEqualTo(String value) {
            addCriterion("abbarcode =", value, "abbarcode");
            return (Criteria) this;
        }

        public Criteria andAbbarcodeNotEqualTo(String value) {
            addCriterion("abbarcode <>", value, "abbarcode");
            return (Criteria) this;
        }

        public Criteria andAbbarcodeGreaterThan(String value) {
            addCriterion("abbarcode >", value, "abbarcode");
            return (Criteria) this;
        }

        public Criteria andAbbarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("abbarcode >=", value, "abbarcode");
            return (Criteria) this;
        }

        public Criteria andAbbarcodeLessThan(String value) {
            addCriterion("abbarcode <", value, "abbarcode");
            return (Criteria) this;
        }

        public Criteria andAbbarcodeLessThanOrEqualTo(String value) {
            addCriterion("abbarcode <=", value, "abbarcode");
            return (Criteria) this;
        }

        public Criteria andAbbarcodeLike(String value) {
            addCriterion("abbarcode like", value, "abbarcode");
            return (Criteria) this;
        }

        public Criteria andAbbarcodeNotLike(String value) {
            addCriterion("abbarcode not like", value, "abbarcode");
            return (Criteria) this;
        }

        public Criteria andAbbarcodeIn(List<String> values) {
            addCriterion("abbarcode in", values, "abbarcode");
            return (Criteria) this;
        }

        public Criteria andAbbarcodeNotIn(List<String> values) {
            addCriterion("abbarcode not in", values, "abbarcode");
            return (Criteria) this;
        }

        public Criteria andAbbarcodeBetween(String value1, String value2) {
            addCriterion("abbarcode between", value1, value2, "abbarcode");
            return (Criteria) this;
        }

        public Criteria andAbbarcodeNotBetween(String value1, String value2) {
            addCriterion("abbarcode not between", value1, value2, "abbarcode");
            return (Criteria) this;
        }

        public Criteria andAbsizeIsNull() {
            addCriterion("absize is null");
            return (Criteria) this;
        }

        public Criteria andAbsizeIsNotNull() {
            addCriterion("absize is not null");
            return (Criteria) this;
        }

        public Criteria andAbsizeEqualTo(String value) {
            addCriterion("absize =", value, "absize");
            return (Criteria) this;
        }

        public Criteria andAbsizeNotEqualTo(String value) {
            addCriterion("absize <>", value, "absize");
            return (Criteria) this;
        }

        public Criteria andAbsizeGreaterThan(String value) {
            addCriterion("absize >", value, "absize");
            return (Criteria) this;
        }

        public Criteria andAbsizeGreaterThanOrEqualTo(String value) {
            addCriterion("absize >=", value, "absize");
            return (Criteria) this;
        }

        public Criteria andAbsizeLessThan(String value) {
            addCriterion("absize <", value, "absize");
            return (Criteria) this;
        }

        public Criteria andAbsizeLessThanOrEqualTo(String value) {
            addCriterion("absize <=", value, "absize");
            return (Criteria) this;
        }

        public Criteria andAbsizeLike(String value) {
            addCriterion("absize like", value, "absize");
            return (Criteria) this;
        }

        public Criteria andAbsizeNotLike(String value) {
            addCriterion("absize not like", value, "absize");
            return (Criteria) this;
        }

        public Criteria andAbsizeIn(List<String> values) {
            addCriterion("absize in", values, "absize");
            return (Criteria) this;
        }

        public Criteria andAbsizeNotIn(List<String> values) {
            addCriterion("absize not in", values, "absize");
            return (Criteria) this;
        }

        public Criteria andAbsizeBetween(String value1, String value2) {
            addCriterion("absize between", value1, value2, "absize");
            return (Criteria) this;
        }

        public Criteria andAbsizeNotBetween(String value1, String value2) {
            addCriterion("absize not between", value1, value2, "absize");
            return (Criteria) this;
        }

        public Criteria andAbbulkIsNull() {
            addCriterion("abbulk is null");
            return (Criteria) this;
        }

        public Criteria andAbbulkIsNotNull() {
            addCriterion("abbulk is not null");
            return (Criteria) this;
        }

        public Criteria andAbbulkEqualTo(String value) {
            addCriterion("abbulk =", value, "abbulk");
            return (Criteria) this;
        }

        public Criteria andAbbulkNotEqualTo(String value) {
            addCriterion("abbulk <>", value, "abbulk");
            return (Criteria) this;
        }

        public Criteria andAbbulkGreaterThan(String value) {
            addCriterion("abbulk >", value, "abbulk");
            return (Criteria) this;
        }

        public Criteria andAbbulkGreaterThanOrEqualTo(String value) {
            addCriterion("abbulk >=", value, "abbulk");
            return (Criteria) this;
        }

        public Criteria andAbbulkLessThan(String value) {
            addCriterion("abbulk <", value, "abbulk");
            return (Criteria) this;
        }

        public Criteria andAbbulkLessThanOrEqualTo(String value) {
            addCriterion("abbulk <=", value, "abbulk");
            return (Criteria) this;
        }

        public Criteria andAbbulkLike(String value) {
            addCriterion("abbulk like", value, "abbulk");
            return (Criteria) this;
        }

        public Criteria andAbbulkNotLike(String value) {
            addCriterion("abbulk not like", value, "abbulk");
            return (Criteria) this;
        }

        public Criteria andAbbulkIn(List<String> values) {
            addCriterion("abbulk in", values, "abbulk");
            return (Criteria) this;
        }

        public Criteria andAbbulkNotIn(List<String> values) {
            addCriterion("abbulk not in", values, "abbulk");
            return (Criteria) this;
        }

        public Criteria andAbbulkBetween(String value1, String value2) {
            addCriterion("abbulk between", value1, value2, "abbulk");
            return (Criteria) this;
        }

        public Criteria andAbbulkNotBetween(String value1, String value2) {
            addCriterion("abbulk not between", value1, value2, "abbulk");
            return (Criteria) this;
        }

        public Criteria andAbroughweightIsNull() {
            addCriterion("abroughweight is null");
            return (Criteria) this;
        }

        public Criteria andAbroughweightIsNotNull() {
            addCriterion("abroughweight is not null");
            return (Criteria) this;
        }

        public Criteria andAbroughweightEqualTo(Float value) {
            addCriterion("abroughweight =", value, "abroughweight");
            return (Criteria) this;
        }

        public Criteria andAbroughweightNotEqualTo(Float value) {
            addCriterion("abroughweight <>", value, "abroughweight");
            return (Criteria) this;
        }

        public Criteria andAbroughweightGreaterThan(Float value) {
            addCriterion("abroughweight >", value, "abroughweight");
            return (Criteria) this;
        }

        public Criteria andAbroughweightGreaterThanOrEqualTo(Float value) {
            addCriterion("abroughweight >=", value, "abroughweight");
            return (Criteria) this;
        }

        public Criteria andAbroughweightLessThan(Float value) {
            addCriterion("abroughweight <", value, "abroughweight");
            return (Criteria) this;
        }

        public Criteria andAbroughweightLessThanOrEqualTo(Float value) {
            addCriterion("abroughweight <=", value, "abroughweight");
            return (Criteria) this;
        }

        public Criteria andAbroughweightIn(List<Float> values) {
            addCriterion("abroughweight in", values, "abroughweight");
            return (Criteria) this;
        }

        public Criteria andAbroughweightNotIn(List<Float> values) {
            addCriterion("abroughweight not in", values, "abroughweight");
            return (Criteria) this;
        }

        public Criteria andAbroughweightBetween(Float value1, Float value2) {
            addCriterion("abroughweight between", value1, value2, "abroughweight");
            return (Criteria) this;
        }

        public Criteria andAbroughweightNotBetween(Float value1, Float value2) {
            addCriterion("abroughweight not between", value1, value2, "abroughweight");
            return (Criteria) this;
        }

        public Criteria andAbsuttleIsNull() {
            addCriterion("absuttle is null");
            return (Criteria) this;
        }

        public Criteria andAbsuttleIsNotNull() {
            addCriterion("absuttle is not null");
            return (Criteria) this;
        }

        public Criteria andAbsuttleEqualTo(Float value) {
            addCriterion("absuttle =", value, "absuttle");
            return (Criteria) this;
        }

        public Criteria andAbsuttleNotEqualTo(Float value) {
            addCriterion("absuttle <>", value, "absuttle");
            return (Criteria) this;
        }

        public Criteria andAbsuttleGreaterThan(Float value) {
            addCriterion("absuttle >", value, "absuttle");
            return (Criteria) this;
        }

        public Criteria andAbsuttleGreaterThanOrEqualTo(Float value) {
            addCriterion("absuttle >=", value, "absuttle");
            return (Criteria) this;
        }

        public Criteria andAbsuttleLessThan(Float value) {
            addCriterion("absuttle <", value, "absuttle");
            return (Criteria) this;
        }

        public Criteria andAbsuttleLessThanOrEqualTo(Float value) {
            addCriterion("absuttle <=", value, "absuttle");
            return (Criteria) this;
        }

        public Criteria andAbsuttleIn(List<Float> values) {
            addCriterion("absuttle in", values, "absuttle");
            return (Criteria) this;
        }

        public Criteria andAbsuttleNotIn(List<Float> values) {
            addCriterion("absuttle not in", values, "absuttle");
            return (Criteria) this;
        }

        public Criteria andAbsuttleBetween(Float value1, Float value2) {
            addCriterion("absuttle between", value1, value2, "absuttle");
            return (Criteria) this;
        }

        public Criteria andAbsuttleNotBetween(Float value1, Float value2) {
            addCriterion("absuttle not between", value1, value2, "absuttle");
            return (Criteria) this;
        }

        public Criteria andAbpercentageIsNull() {
            addCriterion("abpercentage is null");
            return (Criteria) this;
        }

        public Criteria andAbpercentageIsNotNull() {
            addCriterion("abpercentage is not null");
            return (Criteria) this;
        }

        public Criteria andAbpercentageEqualTo(Float value) {
            addCriterion("abpercentage =", value, "abpercentage");
            return (Criteria) this;
        }

        public Criteria andAbpercentageNotEqualTo(Float value) {
            addCriterion("abpercentage <>", value, "abpercentage");
            return (Criteria) this;
        }

        public Criteria andAbpercentageGreaterThan(Float value) {
            addCriterion("abpercentage >", value, "abpercentage");
            return (Criteria) this;
        }

        public Criteria andAbpercentageGreaterThanOrEqualTo(Float value) {
            addCriterion("abpercentage >=", value, "abpercentage");
            return (Criteria) this;
        }

        public Criteria andAbpercentageLessThan(Float value) {
            addCriterion("abpercentage <", value, "abpercentage");
            return (Criteria) this;
        }

        public Criteria andAbpercentageLessThanOrEqualTo(Float value) {
            addCriterion("abpercentage <=", value, "abpercentage");
            return (Criteria) this;
        }

        public Criteria andAbpercentageIn(List<Float> values) {
            addCriterion("abpercentage in", values, "abpercentage");
            return (Criteria) this;
        }

        public Criteria andAbpercentageNotIn(List<Float> values) {
            addCriterion("abpercentage not in", values, "abpercentage");
            return (Criteria) this;
        }

        public Criteria andAbpercentageBetween(Float value1, Float value2) {
            addCriterion("abpercentage between", value1, value2, "abpercentage");
            return (Criteria) this;
        }

        public Criteria andAbpercentageNotBetween(Float value1, Float value2) {
            addCriterion("abpercentage not between", value1, value2, "abpercentage");
            return (Criteria) this;
        }

        public Criteria andAbpcodeIsNull() {
            addCriterion("abpcode is null");
            return (Criteria) this;
        }

        public Criteria andAbpcodeIsNotNull() {
            addCriterion("abpcode is not null");
            return (Criteria) this;
        }

        public Criteria andAbpcodeEqualTo(String value) {
            addCriterion("abpcode =", value, "abpcode");
            return (Criteria) this;
        }

        public Criteria andAbpcodeNotEqualTo(String value) {
            addCriterion("abpcode <>", value, "abpcode");
            return (Criteria) this;
        }

        public Criteria andAbpcodeGreaterThan(String value) {
            addCriterion("abpcode >", value, "abpcode");
            return (Criteria) this;
        }

        public Criteria andAbpcodeGreaterThanOrEqualTo(String value) {
            addCriterion("abpcode >=", value, "abpcode");
            return (Criteria) this;
        }

        public Criteria andAbpcodeLessThan(String value) {
            addCriterion("abpcode <", value, "abpcode");
            return (Criteria) this;
        }

        public Criteria andAbpcodeLessThanOrEqualTo(String value) {
            addCriterion("abpcode <=", value, "abpcode");
            return (Criteria) this;
        }

        public Criteria andAbpcodeLike(String value) {
            addCriterion("abpcode like", value, "abpcode");
            return (Criteria) this;
        }

        public Criteria andAbpcodeNotLike(String value) {
            addCriterion("abpcode not like", value, "abpcode");
            return (Criteria) this;
        }

        public Criteria andAbpcodeIn(List<String> values) {
            addCriterion("abpcode in", values, "abpcode");
            return (Criteria) this;
        }

        public Criteria andAbpcodeNotIn(List<String> values) {
            addCriterion("abpcode not in", values, "abpcode");
            return (Criteria) this;
        }

        public Criteria andAbpcodeBetween(String value1, String value2) {
            addCriterion("abpcode between", value1, value2, "abpcode");
            return (Criteria) this;
        }

        public Criteria andAbpcodeNotBetween(String value1, String value2) {
            addCriterion("abpcode not between", value1, value2, "abpcode");
            return (Criteria) this;
        }

        public Criteria andAbaccordingIsNull() {
            addCriterion("abaccording is null");
            return (Criteria) this;
        }

        public Criteria andAbaccordingIsNotNull() {
            addCriterion("abaccording is not null");
            return (Criteria) this;
        }

        public Criteria andAbaccordingEqualTo(String value) {
            addCriterion("abaccording =", value, "abaccording");
            return (Criteria) this;
        }

        public Criteria andAbaccordingNotEqualTo(String value) {
            addCriterion("abaccording <>", value, "abaccording");
            return (Criteria) this;
        }

        public Criteria andAbaccordingGreaterThan(String value) {
            addCriterion("abaccording >", value, "abaccording");
            return (Criteria) this;
        }

        public Criteria andAbaccordingGreaterThanOrEqualTo(String value) {
            addCriterion("abaccording >=", value, "abaccording");
            return (Criteria) this;
        }

        public Criteria andAbaccordingLessThan(String value) {
            addCriterion("abaccording <", value, "abaccording");
            return (Criteria) this;
        }

        public Criteria andAbaccordingLessThanOrEqualTo(String value) {
            addCriterion("abaccording <=", value, "abaccording");
            return (Criteria) this;
        }

        public Criteria andAbaccordingLike(String value) {
            addCriterion("abaccording like", value, "abaccording");
            return (Criteria) this;
        }

        public Criteria andAbaccordingNotLike(String value) {
            addCriterion("abaccording not like", value, "abaccording");
            return (Criteria) this;
        }

        public Criteria andAbaccordingIn(List<String> values) {
            addCriterion("abaccording in", values, "abaccording");
            return (Criteria) this;
        }

        public Criteria andAbaccordingNotIn(List<String> values) {
            addCriterion("abaccording not in", values, "abaccording");
            return (Criteria) this;
        }

        public Criteria andAbaccordingBetween(String value1, String value2) {
            addCriterion("abaccording between", value1, value2, "abaccording");
            return (Criteria) this;
        }

        public Criteria andAbaccordingNotBetween(String value1, String value2) {
            addCriterion("abaccording not between", value1, value2, "abaccording");
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