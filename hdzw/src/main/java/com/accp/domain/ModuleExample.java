package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ModuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ModuleExample() {
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

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("did not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDenameIsNull() {
            addCriterion("dename is null");
            return (Criteria) this;
        }

        public Criteria andDenameIsNotNull() {
            addCriterion("dename is not null");
            return (Criteria) this;
        }

        public Criteria andDenameEqualTo(String value) {
            addCriterion("dename =", value, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameNotEqualTo(String value) {
            addCriterion("dename <>", value, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameGreaterThan(String value) {
            addCriterion("dename >", value, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameGreaterThanOrEqualTo(String value) {
            addCriterion("dename >=", value, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameLessThan(String value) {
            addCriterion("dename <", value, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameLessThanOrEqualTo(String value) {
            addCriterion("dename <=", value, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameLike(String value) {
            addCriterion("dename like", value, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameNotLike(String value) {
            addCriterion("dename not like", value, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameIn(List<String> values) {
            addCriterion("dename in", values, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameNotIn(List<String> values) {
            addCriterion("dename not in", values, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameBetween(String value1, String value2) {
            addCriterion("dename between", value1, value2, "dename");
            return (Criteria) this;
        }

        public Criteria andDenameNotBetween(String value1, String value2) {
            addCriterion("dename not between", value1, value2, "dename");
            return (Criteria) this;
        }

        public Criteria andDcnameIsNull() {
            addCriterion("dcname is null");
            return (Criteria) this;
        }

        public Criteria andDcnameIsNotNull() {
            addCriterion("dcname is not null");
            return (Criteria) this;
        }

        public Criteria andDcnameEqualTo(String value) {
            addCriterion("dcname =", value, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameNotEqualTo(String value) {
            addCriterion("dcname <>", value, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameGreaterThan(String value) {
            addCriterion("dcname >", value, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameGreaterThanOrEqualTo(String value) {
            addCriterion("dcname >=", value, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameLessThan(String value) {
            addCriterion("dcname <", value, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameLessThanOrEqualTo(String value) {
            addCriterion("dcname <=", value, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameLike(String value) {
            addCriterion("dcname like", value, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameNotLike(String value) {
            addCriterion("dcname not like", value, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameIn(List<String> values) {
            addCriterion("dcname in", values, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameNotIn(List<String> values) {
            addCriterion("dcname not in", values, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameBetween(String value1, String value2) {
            addCriterion("dcname between", value1, value2, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameNotBetween(String value1, String value2) {
            addCriterion("dcname not between", value1, value2, "dcname");
            return (Criteria) this;
        }

        public Criteria andDpathIsNull() {
            addCriterion("dpath is null");
            return (Criteria) this;
        }

        public Criteria andDpathIsNotNull() {
            addCriterion("dpath is not null");
            return (Criteria) this;
        }

        public Criteria andDpathEqualTo(String value) {
            addCriterion("dpath =", value, "dpath");
            return (Criteria) this;
        }

        public Criteria andDpathNotEqualTo(String value) {
            addCriterion("dpath <>", value, "dpath");
            return (Criteria) this;
        }

        public Criteria andDpathGreaterThan(String value) {
            addCriterion("dpath >", value, "dpath");
            return (Criteria) this;
        }

        public Criteria andDpathGreaterThanOrEqualTo(String value) {
            addCriterion("dpath >=", value, "dpath");
            return (Criteria) this;
        }

        public Criteria andDpathLessThan(String value) {
            addCriterion("dpath <", value, "dpath");
            return (Criteria) this;
        }

        public Criteria andDpathLessThanOrEqualTo(String value) {
            addCriterion("dpath <=", value, "dpath");
            return (Criteria) this;
        }

        public Criteria andDpathLike(String value) {
            addCriterion("dpath like", value, "dpath");
            return (Criteria) this;
        }

        public Criteria andDpathNotLike(String value) {
            addCriterion("dpath not like", value, "dpath");
            return (Criteria) this;
        }

        public Criteria andDpathIn(List<String> values) {
            addCriterion("dpath in", values, "dpath");
            return (Criteria) this;
        }

        public Criteria andDpathNotIn(List<String> values) {
            addCriterion("dpath not in", values, "dpath");
            return (Criteria) this;
        }

        public Criteria andDpathBetween(String value1, String value2) {
            addCriterion("dpath between", value1, value2, "dpath");
            return (Criteria) this;
        }

        public Criteria andDpathNotBetween(String value1, String value2) {
            addCriterion("dpath not between", value1, value2, "dpath");
            return (Criteria) this;
        }

        public Criteria andDcatalogIsNull() {
            addCriterion("dcatalog is null");
            return (Criteria) this;
        }

        public Criteria andDcatalogIsNotNull() {
            addCriterion("dcatalog is not null");
            return (Criteria) this;
        }

        public Criteria andDcatalogEqualTo(Integer value) {
            addCriterion("dcatalog =", value, "dcatalog");
            return (Criteria) this;
        }

        public Criteria andDcatalogNotEqualTo(Integer value) {
            addCriterion("dcatalog <>", value, "dcatalog");
            return (Criteria) this;
        }

        public Criteria andDcatalogGreaterThan(Integer value) {
            addCriterion("dcatalog >", value, "dcatalog");
            return (Criteria) this;
        }

        public Criteria andDcatalogGreaterThanOrEqualTo(Integer value) {
            addCriterion("dcatalog >=", value, "dcatalog");
            return (Criteria) this;
        }

        public Criteria andDcatalogLessThan(Integer value) {
            addCriterion("dcatalog <", value, "dcatalog");
            return (Criteria) this;
        }

        public Criteria andDcatalogLessThanOrEqualTo(Integer value) {
            addCriterion("dcatalog <=", value, "dcatalog");
            return (Criteria) this;
        }

        public Criteria andDcatalogIn(List<Integer> values) {
            addCriterion("dcatalog in", values, "dcatalog");
            return (Criteria) this;
        }

        public Criteria andDcatalogNotIn(List<Integer> values) {
            addCriterion("dcatalog not in", values, "dcatalog");
            return (Criteria) this;
        }

        public Criteria andDcatalogBetween(Integer value1, Integer value2) {
            addCriterion("dcatalog between", value1, value2, "dcatalog");
            return (Criteria) this;
        }

        public Criteria andDcatalogNotBetween(Integer value1, Integer value2) {
            addCriterion("dcatalog not between", value1, value2, "dcatalog");
            return (Criteria) this;
        }

        public Criteria andDparentidIsNull() {
            addCriterion("dparentid is null");
            return (Criteria) this;
        }

        public Criteria andDparentidIsNotNull() {
            addCriterion("dparentid is not null");
            return (Criteria) this;
        }

        public Criteria andDparentidEqualTo(Integer value) {
            addCriterion("dparentid =", value, "dparentid");
            return (Criteria) this;
        }

        public Criteria andDparentidNotEqualTo(Integer value) {
            addCriterion("dparentid <>", value, "dparentid");
            return (Criteria) this;
        }

        public Criteria andDparentidGreaterThan(Integer value) {
            addCriterion("dparentid >", value, "dparentid");
            return (Criteria) this;
        }

        public Criteria andDparentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dparentid >=", value, "dparentid");
            return (Criteria) this;
        }

        public Criteria andDparentidLessThan(Integer value) {
            addCriterion("dparentid <", value, "dparentid");
            return (Criteria) this;
        }

        public Criteria andDparentidLessThanOrEqualTo(Integer value) {
            addCriterion("dparentid <=", value, "dparentid");
            return (Criteria) this;
        }

        public Criteria andDparentidIn(List<Integer> values) {
            addCriterion("dparentid in", values, "dparentid");
            return (Criteria) this;
        }

        public Criteria andDparentidNotIn(List<Integer> values) {
            addCriterion("dparentid not in", values, "dparentid");
            return (Criteria) this;
        }

        public Criteria andDparentidBetween(Integer value1, Integer value2) {
            addCriterion("dparentid between", value1, value2, "dparentid");
            return (Criteria) this;
        }

        public Criteria andDparentidNotBetween(Integer value1, Integer value2) {
            addCriterion("dparentid not between", value1, value2, "dparentid");
            return (Criteria) this;
        }

        public Criteria andDmethIsNull() {
            addCriterion("dmeth is null");
            return (Criteria) this;
        }

        public Criteria andDmethIsNotNull() {
            addCriterion("dmeth is not null");
            return (Criteria) this;
        }

        public Criteria andDmethEqualTo(String value) {
            addCriterion("dmeth =", value, "dmeth");
            return (Criteria) this;
        }

        public Criteria andDmethNotEqualTo(String value) {
            addCriterion("dmeth <>", value, "dmeth");
            return (Criteria) this;
        }

        public Criteria andDmethGreaterThan(String value) {
            addCriterion("dmeth >", value, "dmeth");
            return (Criteria) this;
        }

        public Criteria andDmethGreaterThanOrEqualTo(String value) {
            addCriterion("dmeth >=", value, "dmeth");
            return (Criteria) this;
        }

        public Criteria andDmethLessThan(String value) {
            addCriterion("dmeth <", value, "dmeth");
            return (Criteria) this;
        }

        public Criteria andDmethLessThanOrEqualTo(String value) {
            addCriterion("dmeth <=", value, "dmeth");
            return (Criteria) this;
        }

        public Criteria andDmethLike(String value) {
            addCriterion("dmeth like", value, "dmeth");
            return (Criteria) this;
        }

        public Criteria andDmethNotLike(String value) {
            addCriterion("dmeth not like", value, "dmeth");
            return (Criteria) this;
        }

        public Criteria andDmethIn(List<String> values) {
            addCriterion("dmeth in", values, "dmeth");
            return (Criteria) this;
        }

        public Criteria andDmethNotIn(List<String> values) {
            addCriterion("dmeth not in", values, "dmeth");
            return (Criteria) this;
        }

        public Criteria andDmethBetween(String value1, String value2) {
            addCriterion("dmeth between", value1, value2, "dmeth");
            return (Criteria) this;
        }

        public Criteria andDmethNotBetween(String value1, String value2) {
            addCriterion("dmeth not between", value1, value2, "dmeth");
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