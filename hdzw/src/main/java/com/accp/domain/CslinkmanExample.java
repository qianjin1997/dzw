package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class CslinkmanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CslinkmanExample() {
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

        public Criteria andAoidIsNull() {
            addCriterion("aoid is null");
            return (Criteria) this;
        }

        public Criteria andAoidIsNotNull() {
            addCriterion("aoid is not null");
            return (Criteria) this;
        }

        public Criteria andAoidEqualTo(Integer value) {
            addCriterion("aoid =", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidNotEqualTo(Integer value) {
            addCriterion("aoid <>", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidGreaterThan(Integer value) {
            addCriterion("aoid >", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aoid >=", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidLessThan(Integer value) {
            addCriterion("aoid <", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidLessThanOrEqualTo(Integer value) {
            addCriterion("aoid <=", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidIn(List<Integer> values) {
            addCriterion("aoid in", values, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidNotIn(List<Integer> values) {
            addCriterion("aoid not in", values, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidBetween(Integer value1, Integer value2) {
            addCriterion("aoid between", value1, value2, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidNotBetween(Integer value1, Integer value2) {
            addCriterion("aoid not between", value1, value2, "aoid");
            return (Criteria) this;
        }

        public Criteria andAocontactnameIsNull() {
            addCriterion("aocontactName is null");
            return (Criteria) this;
        }

        public Criteria andAocontactnameIsNotNull() {
            addCriterion("aocontactName is not null");
            return (Criteria) this;
        }

        public Criteria andAocontactnameEqualTo(String value) {
            addCriterion("aocontactName =", value, "aocontactname");
            return (Criteria) this;
        }

        public Criteria andAocontactnameNotEqualTo(String value) {
            addCriterion("aocontactName <>", value, "aocontactname");
            return (Criteria) this;
        }

        public Criteria andAocontactnameGreaterThan(String value) {
            addCriterion("aocontactName >", value, "aocontactname");
            return (Criteria) this;
        }

        public Criteria andAocontactnameGreaterThanOrEqualTo(String value) {
            addCriterion("aocontactName >=", value, "aocontactname");
            return (Criteria) this;
        }

        public Criteria andAocontactnameLessThan(String value) {
            addCriterion("aocontactName <", value, "aocontactname");
            return (Criteria) this;
        }

        public Criteria andAocontactnameLessThanOrEqualTo(String value) {
            addCriterion("aocontactName <=", value, "aocontactname");
            return (Criteria) this;
        }

        public Criteria andAocontactnameLike(String value) {
            addCriterion("aocontactName like", value, "aocontactname");
            return (Criteria) this;
        }

        public Criteria andAocontactnameNotLike(String value) {
            addCriterion("aocontactName not like", value, "aocontactname");
            return (Criteria) this;
        }

        public Criteria andAocontactnameIn(List<String> values) {
            addCriterion("aocontactName in", values, "aocontactname");
            return (Criteria) this;
        }

        public Criteria andAocontactnameNotIn(List<String> values) {
            addCriterion("aocontactName not in", values, "aocontactname");
            return (Criteria) this;
        }

        public Criteria andAocontactnameBetween(String value1, String value2) {
            addCriterion("aocontactName between", value1, value2, "aocontactname");
            return (Criteria) this;
        }

        public Criteria andAocontactnameNotBetween(String value1, String value2) {
            addCriterion("aocontactName not between", value1, value2, "aocontactname");
            return (Criteria) this;
        }

        public Criteria andAopositionIsNull() {
            addCriterion("aoposition is null");
            return (Criteria) this;
        }

        public Criteria andAopositionIsNotNull() {
            addCriterion("aoposition is not null");
            return (Criteria) this;
        }

        public Criteria andAopositionEqualTo(String value) {
            addCriterion("aoposition =", value, "aoposition");
            return (Criteria) this;
        }

        public Criteria andAopositionNotEqualTo(String value) {
            addCriterion("aoposition <>", value, "aoposition");
            return (Criteria) this;
        }

        public Criteria andAopositionGreaterThan(String value) {
            addCriterion("aoposition >", value, "aoposition");
            return (Criteria) this;
        }

        public Criteria andAopositionGreaterThanOrEqualTo(String value) {
            addCriterion("aoposition >=", value, "aoposition");
            return (Criteria) this;
        }

        public Criteria andAopositionLessThan(String value) {
            addCriterion("aoposition <", value, "aoposition");
            return (Criteria) this;
        }

        public Criteria andAopositionLessThanOrEqualTo(String value) {
            addCriterion("aoposition <=", value, "aoposition");
            return (Criteria) this;
        }

        public Criteria andAopositionLike(String value) {
            addCriterion("aoposition like", value, "aoposition");
            return (Criteria) this;
        }

        public Criteria andAopositionNotLike(String value) {
            addCriterion("aoposition not like", value, "aoposition");
            return (Criteria) this;
        }

        public Criteria andAopositionIn(List<String> values) {
            addCriterion("aoposition in", values, "aoposition");
            return (Criteria) this;
        }

        public Criteria andAopositionNotIn(List<String> values) {
            addCriterion("aoposition not in", values, "aoposition");
            return (Criteria) this;
        }

        public Criteria andAopositionBetween(String value1, String value2) {
            addCriterion("aoposition between", value1, value2, "aoposition");
            return (Criteria) this;
        }

        public Criteria andAopositionNotBetween(String value1, String value2) {
            addCriterion("aoposition not between", value1, value2, "aoposition");
            return (Criteria) this;
        }

        public Criteria andAophoneIsNull() {
            addCriterion("aophone is null");
            return (Criteria) this;
        }

        public Criteria andAophoneIsNotNull() {
            addCriterion("aophone is not null");
            return (Criteria) this;
        }

        public Criteria andAophoneEqualTo(Integer value) {
            addCriterion("aophone =", value, "aophone");
            return (Criteria) this;
        }

        public Criteria andAophoneNotEqualTo(Integer value) {
            addCriterion("aophone <>", value, "aophone");
            return (Criteria) this;
        }

        public Criteria andAophoneGreaterThan(Integer value) {
            addCriterion("aophone >", value, "aophone");
            return (Criteria) this;
        }

        public Criteria andAophoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("aophone >=", value, "aophone");
            return (Criteria) this;
        }

        public Criteria andAophoneLessThan(Integer value) {
            addCriterion("aophone <", value, "aophone");
            return (Criteria) this;
        }

        public Criteria andAophoneLessThanOrEqualTo(Integer value) {
            addCriterion("aophone <=", value, "aophone");
            return (Criteria) this;
        }

        public Criteria andAophoneIn(List<Integer> values) {
            addCriterion("aophone in", values, "aophone");
            return (Criteria) this;
        }

        public Criteria andAophoneNotIn(List<Integer> values) {
            addCriterion("aophone not in", values, "aophone");
            return (Criteria) this;
        }

        public Criteria andAophoneBetween(Integer value1, Integer value2) {
            addCriterion("aophone between", value1, value2, "aophone");
            return (Criteria) this;
        }

        public Criteria andAophoneNotBetween(Integer value1, Integer value2) {
            addCriterion("aophone not between", value1, value2, "aophone");
            return (Criteria) this;
        }

        public Criteria andAocallIsNull() {
            addCriterion("aocall is null");
            return (Criteria) this;
        }

        public Criteria andAocallIsNotNull() {
            addCriterion("aocall is not null");
            return (Criteria) this;
        }

        public Criteria andAocallEqualTo(Integer value) {
            addCriterion("aocall =", value, "aocall");
            return (Criteria) this;
        }

        public Criteria andAocallNotEqualTo(Integer value) {
            addCriterion("aocall <>", value, "aocall");
            return (Criteria) this;
        }

        public Criteria andAocallGreaterThan(Integer value) {
            addCriterion("aocall >", value, "aocall");
            return (Criteria) this;
        }

        public Criteria andAocallGreaterThanOrEqualTo(Integer value) {
            addCriterion("aocall >=", value, "aocall");
            return (Criteria) this;
        }

        public Criteria andAocallLessThan(Integer value) {
            addCriterion("aocall <", value, "aocall");
            return (Criteria) this;
        }

        public Criteria andAocallLessThanOrEqualTo(Integer value) {
            addCriterion("aocall <=", value, "aocall");
            return (Criteria) this;
        }

        public Criteria andAocallIn(List<Integer> values) {
            addCriterion("aocall in", values, "aocall");
            return (Criteria) this;
        }

        public Criteria andAocallNotIn(List<Integer> values) {
            addCriterion("aocall not in", values, "aocall");
            return (Criteria) this;
        }

        public Criteria andAocallBetween(Integer value1, Integer value2) {
            addCriterion("aocall between", value1, value2, "aocall");
            return (Criteria) this;
        }

        public Criteria andAocallNotBetween(Integer value1, Integer value2) {
            addCriterion("aocall not between", value1, value2, "aocall");
            return (Criteria) this;
        }

        public Criteria andAoemailIsNull() {
            addCriterion("aoemail is null");
            return (Criteria) this;
        }

        public Criteria andAoemailIsNotNull() {
            addCriterion("aoemail is not null");
            return (Criteria) this;
        }

        public Criteria andAoemailEqualTo(String value) {
            addCriterion("aoemail =", value, "aoemail");
            return (Criteria) this;
        }

        public Criteria andAoemailNotEqualTo(String value) {
            addCriterion("aoemail <>", value, "aoemail");
            return (Criteria) this;
        }

        public Criteria andAoemailGreaterThan(String value) {
            addCriterion("aoemail >", value, "aoemail");
            return (Criteria) this;
        }

        public Criteria andAoemailGreaterThanOrEqualTo(String value) {
            addCriterion("aoemail >=", value, "aoemail");
            return (Criteria) this;
        }

        public Criteria andAoemailLessThan(String value) {
            addCriterion("aoemail <", value, "aoemail");
            return (Criteria) this;
        }

        public Criteria andAoemailLessThanOrEqualTo(String value) {
            addCriterion("aoemail <=", value, "aoemail");
            return (Criteria) this;
        }

        public Criteria andAoemailLike(String value) {
            addCriterion("aoemail like", value, "aoemail");
            return (Criteria) this;
        }

        public Criteria andAoemailNotLike(String value) {
            addCriterion("aoemail not like", value, "aoemail");
            return (Criteria) this;
        }

        public Criteria andAoemailIn(List<String> values) {
            addCriterion("aoemail in", values, "aoemail");
            return (Criteria) this;
        }

        public Criteria andAoemailNotIn(List<String> values) {
            addCriterion("aoemail not in", values, "aoemail");
            return (Criteria) this;
        }

        public Criteria andAoemailBetween(String value1, String value2) {
            addCriterion("aoemail between", value1, value2, "aoemail");
            return (Criteria) this;
        }

        public Criteria andAoemailNotBetween(String value1, String value2) {
            addCriterion("aoemail not between", value1, value2, "aoemail");
            return (Criteria) this;
        }

        public Criteria andAofactoryidIsNull() {
            addCriterion("aofactoryId is null");
            return (Criteria) this;
        }

        public Criteria andAofactoryidIsNotNull() {
            addCriterion("aofactoryId is not null");
            return (Criteria) this;
        }

        public Criteria andAofactoryidEqualTo(Integer value) {
            addCriterion("aofactoryId =", value, "aofactoryid");
            return (Criteria) this;
        }

        public Criteria andAofactoryidNotEqualTo(Integer value) {
            addCriterion("aofactoryId <>", value, "aofactoryid");
            return (Criteria) this;
        }

        public Criteria andAofactoryidGreaterThan(Integer value) {
            addCriterion("aofactoryId >", value, "aofactoryid");
            return (Criteria) this;
        }

        public Criteria andAofactoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aofactoryId >=", value, "aofactoryid");
            return (Criteria) this;
        }

        public Criteria andAofactoryidLessThan(Integer value) {
            addCriterion("aofactoryId <", value, "aofactoryid");
            return (Criteria) this;
        }

        public Criteria andAofactoryidLessThanOrEqualTo(Integer value) {
            addCriterion("aofactoryId <=", value, "aofactoryid");
            return (Criteria) this;
        }

        public Criteria andAofactoryidIn(List<Integer> values) {
            addCriterion("aofactoryId in", values, "aofactoryid");
            return (Criteria) this;
        }

        public Criteria andAofactoryidNotIn(List<Integer> values) {
            addCriterion("aofactoryId not in", values, "aofactoryid");
            return (Criteria) this;
        }

        public Criteria andAofactoryidBetween(Integer value1, Integer value2) {
            addCriterion("aofactoryId between", value1, value2, "aofactoryid");
            return (Criteria) this;
        }

        public Criteria andAofactoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("aofactoryId not between", value1, value2, "aofactoryid");
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