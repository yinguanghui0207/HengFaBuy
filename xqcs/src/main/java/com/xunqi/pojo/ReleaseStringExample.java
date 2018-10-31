package com.xunqi.pojo;

import java.util.ArrayList;
import java.util.List;

public class ReleaseStringExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReleaseStringExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Integer value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Integer value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Integer value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Integer value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Integer> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Integer> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andDetailsStringIsNull() {
            addCriterion("details_string is null");
            return (Criteria) this;
        }

        public Criteria andDetailsStringIsNotNull() {
            addCriterion("details_string is not null");
            return (Criteria) this;
        }

        public Criteria andDetailsStringEqualTo(String value) {
            addCriterion("details_string =", value, "detailsString");
            return (Criteria) this;
        }

        public Criteria andDetailsStringNotEqualTo(String value) {
            addCriterion("details_string <>", value, "detailsString");
            return (Criteria) this;
        }

        public Criteria andDetailsStringGreaterThan(String value) {
            addCriterion("details_string >", value, "detailsString");
            return (Criteria) this;
        }

        public Criteria andDetailsStringGreaterThanOrEqualTo(String value) {
            addCriterion("details_string >=", value, "detailsString");
            return (Criteria) this;
        }

        public Criteria andDetailsStringLessThan(String value) {
            addCriterion("details_string <", value, "detailsString");
            return (Criteria) this;
        }

        public Criteria andDetailsStringLessThanOrEqualTo(String value) {
            addCriterion("details_string <=", value, "detailsString");
            return (Criteria) this;
        }

        public Criteria andDetailsStringLike(String value) {
            addCriterion("details_string like", value, "detailsString");
            return (Criteria) this;
        }

        public Criteria andDetailsStringNotLike(String value) {
            addCriterion("details_string not like", value, "detailsString");
            return (Criteria) this;
        }

        public Criteria andDetailsStringIn(List<String> values) {
            addCriterion("details_string in", values, "detailsString");
            return (Criteria) this;
        }

        public Criteria andDetailsStringNotIn(List<String> values) {
            addCriterion("details_string not in", values, "detailsString");
            return (Criteria) this;
        }

        public Criteria andDetailsStringBetween(String value1, String value2) {
            addCriterion("details_string between", value1, value2, "detailsString");
            return (Criteria) this;
        }

        public Criteria andDetailsStringNotBetween(String value1, String value2) {
            addCriterion("details_string not between", value1, value2, "detailsString");
            return (Criteria) this;
        }

        public Criteria andFieldStringIsNull() {
            addCriterion("field_string is null");
            return (Criteria) this;
        }

        public Criteria andFieldStringIsNotNull() {
            addCriterion("field_string is not null");
            return (Criteria) this;
        }

        public Criteria andFieldStringEqualTo(String value) {
            addCriterion("field_string =", value, "fieldString");
            return (Criteria) this;
        }

        public Criteria andFieldStringNotEqualTo(String value) {
            addCriterion("field_string <>", value, "fieldString");
            return (Criteria) this;
        }

        public Criteria andFieldStringGreaterThan(String value) {
            addCriterion("field_string >", value, "fieldString");
            return (Criteria) this;
        }

        public Criteria andFieldStringGreaterThanOrEqualTo(String value) {
            addCriterion("field_string >=", value, "fieldString");
            return (Criteria) this;
        }

        public Criteria andFieldStringLessThan(String value) {
            addCriterion("field_string <", value, "fieldString");
            return (Criteria) this;
        }

        public Criteria andFieldStringLessThanOrEqualTo(String value) {
            addCriterion("field_string <=", value, "fieldString");
            return (Criteria) this;
        }

        public Criteria andFieldStringLike(String value) {
            addCriterion("field_string like", value, "fieldString");
            return (Criteria) this;
        }

        public Criteria andFieldStringNotLike(String value) {
            addCriterion("field_string not like", value, "fieldString");
            return (Criteria) this;
        }

        public Criteria andFieldStringIn(List<String> values) {
            addCriterion("field_string in", values, "fieldString");
            return (Criteria) this;
        }

        public Criteria andFieldStringNotIn(List<String> values) {
            addCriterion("field_string not in", values, "fieldString");
            return (Criteria) this;
        }

        public Criteria andFieldStringBetween(String value1, String value2) {
            addCriterion("field_string between", value1, value2, "fieldString");
            return (Criteria) this;
        }

        public Criteria andFieldStringNotBetween(String value1, String value2) {
            addCriterion("field_string not between", value1, value2, "fieldString");
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