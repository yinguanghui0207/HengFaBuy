package com.xunqi.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserAuthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAuthExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserTruenameIsNull() {
            addCriterion("user_truename is null");
            return (Criteria) this;
        }

        public Criteria andUserTruenameIsNotNull() {
            addCriterion("user_truename is not null");
            return (Criteria) this;
        }

        public Criteria andUserTruenameEqualTo(String value) {
            addCriterion("user_truename =", value, "userTruename");
            return (Criteria) this;
        }

        public Criteria andUserTruenameNotEqualTo(String value) {
            addCriterion("user_truename <>", value, "userTruename");
            return (Criteria) this;
        }

        public Criteria andUserTruenameGreaterThan(String value) {
            addCriterion("user_truename >", value, "userTruename");
            return (Criteria) this;
        }

        public Criteria andUserTruenameGreaterThanOrEqualTo(String value) {
            addCriterion("user_truename >=", value, "userTruename");
            return (Criteria) this;
        }

        public Criteria andUserTruenameLessThan(String value) {
            addCriterion("user_truename <", value, "userTruename");
            return (Criteria) this;
        }

        public Criteria andUserTruenameLessThanOrEqualTo(String value) {
            addCriterion("user_truename <=", value, "userTruename");
            return (Criteria) this;
        }

        public Criteria andUserTruenameLike(String value) {
            addCriterion("user_truename like", value, "userTruename");
            return (Criteria) this;
        }

        public Criteria andUserTruenameNotLike(String value) {
            addCriterion("user_truename not like", value, "userTruename");
            return (Criteria) this;
        }

        public Criteria andUserTruenameIn(List<String> values) {
            addCriterion("user_truename in", values, "userTruename");
            return (Criteria) this;
        }

        public Criteria andUserTruenameNotIn(List<String> values) {
            addCriterion("user_truename not in", values, "userTruename");
            return (Criteria) this;
        }

        public Criteria andUserTruenameBetween(String value1, String value2) {
            addCriterion("user_truename between", value1, value2, "userTruename");
            return (Criteria) this;
        }

        public Criteria andUserTruenameNotBetween(String value1, String value2) {
            addCriterion("user_truename not between", value1, value2, "userTruename");
            return (Criteria) this;
        }

        public Criteria andUserCardnoIsNull() {
            addCriterion("user_cardno is null");
            return (Criteria) this;
        }

        public Criteria andUserCardnoIsNotNull() {
            addCriterion("user_cardno is not null");
            return (Criteria) this;
        }

        public Criteria andUserCardnoEqualTo(String value) {
            addCriterion("user_cardno =", value, "userCardno");
            return (Criteria) this;
        }

        public Criteria andUserCardnoNotEqualTo(String value) {
            addCriterion("user_cardno <>", value, "userCardno");
            return (Criteria) this;
        }

        public Criteria andUserCardnoGreaterThan(String value) {
            addCriterion("user_cardno >", value, "userCardno");
            return (Criteria) this;
        }

        public Criteria andUserCardnoGreaterThanOrEqualTo(String value) {
            addCriterion("user_cardno >=", value, "userCardno");
            return (Criteria) this;
        }

        public Criteria andUserCardnoLessThan(String value) {
            addCriterion("user_cardno <", value, "userCardno");
            return (Criteria) this;
        }

        public Criteria andUserCardnoLessThanOrEqualTo(String value) {
            addCriterion("user_cardno <=", value, "userCardno");
            return (Criteria) this;
        }

        public Criteria andUserCardnoLike(String value) {
            addCriterion("user_cardno like", value, "userCardno");
            return (Criteria) this;
        }

        public Criteria andUserCardnoNotLike(String value) {
            addCriterion("user_cardno not like", value, "userCardno");
            return (Criteria) this;
        }

        public Criteria andUserCardnoIn(List<String> values) {
            addCriterion("user_cardno in", values, "userCardno");
            return (Criteria) this;
        }

        public Criteria andUserCardnoNotIn(List<String> values) {
            addCriterion("user_cardno not in", values, "userCardno");
            return (Criteria) this;
        }

        public Criteria andUserCardnoBetween(String value1, String value2) {
            addCriterion("user_cardno between", value1, value2, "userCardno");
            return (Criteria) this;
        }

        public Criteria andUserCardnoNotBetween(String value1, String value2) {
            addCriterion("user_cardno not between", value1, value2, "userCardno");
            return (Criteria) this;
        }

        public Criteria andCardOnIsNull() {
            addCriterion("card_on is null");
            return (Criteria) this;
        }

        public Criteria andCardOnIsNotNull() {
            addCriterion("card_on is not null");
            return (Criteria) this;
        }

        public Criteria andCardOnEqualTo(String value) {
            addCriterion("card_on =", value, "cardOn");
            return (Criteria) this;
        }

        public Criteria andCardOnNotEqualTo(String value) {
            addCriterion("card_on <>", value, "cardOn");
            return (Criteria) this;
        }

        public Criteria andCardOnGreaterThan(String value) {
            addCriterion("card_on >", value, "cardOn");
            return (Criteria) this;
        }

        public Criteria andCardOnGreaterThanOrEqualTo(String value) {
            addCriterion("card_on >=", value, "cardOn");
            return (Criteria) this;
        }

        public Criteria andCardOnLessThan(String value) {
            addCriterion("card_on <", value, "cardOn");
            return (Criteria) this;
        }

        public Criteria andCardOnLessThanOrEqualTo(String value) {
            addCriterion("card_on <=", value, "cardOn");
            return (Criteria) this;
        }

        public Criteria andCardOnLike(String value) {
            addCriterion("card_on like", value, "cardOn");
            return (Criteria) this;
        }

        public Criteria andCardOnNotLike(String value) {
            addCriterion("card_on not like", value, "cardOn");
            return (Criteria) this;
        }

        public Criteria andCardOnIn(List<String> values) {
            addCriterion("card_on in", values, "cardOn");
            return (Criteria) this;
        }

        public Criteria andCardOnNotIn(List<String> values) {
            addCriterion("card_on not in", values, "cardOn");
            return (Criteria) this;
        }

        public Criteria andCardOnBetween(String value1, String value2) {
            addCriterion("card_on between", value1, value2, "cardOn");
            return (Criteria) this;
        }

        public Criteria andCardOnNotBetween(String value1, String value2) {
            addCriterion("card_on not between", value1, value2, "cardOn");
            return (Criteria) this;
        }

        public Criteria andAuthStateIsNull() {
            addCriterion("auth_state is null");
            return (Criteria) this;
        }

        public Criteria andAuthStateIsNotNull() {
            addCriterion("auth_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuthStateEqualTo(String value) {
            addCriterion("auth_state =", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateNotEqualTo(String value) {
            addCriterion("auth_state <>", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateGreaterThan(String value) {
            addCriterion("auth_state >", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateGreaterThanOrEqualTo(String value) {
            addCriterion("auth_state >=", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateLessThan(String value) {
            addCriterion("auth_state <", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateLessThanOrEqualTo(String value) {
            addCriterion("auth_state <=", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateLike(String value) {
            addCriterion("auth_state like", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateNotLike(String value) {
            addCriterion("auth_state not like", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateIn(List<String> values) {
            addCriterion("auth_state in", values, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateNotIn(List<String> values) {
            addCriterion("auth_state not in", values, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateBetween(String value1, String value2) {
            addCriterion("auth_state between", value1, value2, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateNotBetween(String value1, String value2) {
            addCriterion("auth_state not between", value1, value2, "authState");
            return (Criteria) this;
        }

        public Criteria andFailMassageIsNull() {
            addCriterion("fail_massage is null");
            return (Criteria) this;
        }

        public Criteria andFailMassageIsNotNull() {
            addCriterion("fail_massage is not null");
            return (Criteria) this;
        }

        public Criteria andFailMassageEqualTo(String value) {
            addCriterion("fail_massage =", value, "failMassage");
            return (Criteria) this;
        }

        public Criteria andFailMassageNotEqualTo(String value) {
            addCriterion("fail_massage <>", value, "failMassage");
            return (Criteria) this;
        }

        public Criteria andFailMassageGreaterThan(String value) {
            addCriterion("fail_massage >", value, "failMassage");
            return (Criteria) this;
        }

        public Criteria andFailMassageGreaterThanOrEqualTo(String value) {
            addCriterion("fail_massage >=", value, "failMassage");
            return (Criteria) this;
        }

        public Criteria andFailMassageLessThan(String value) {
            addCriterion("fail_massage <", value, "failMassage");
            return (Criteria) this;
        }

        public Criteria andFailMassageLessThanOrEqualTo(String value) {
            addCriterion("fail_massage <=", value, "failMassage");
            return (Criteria) this;
        }

        public Criteria andFailMassageLike(String value) {
            addCriterion("fail_massage like", value, "failMassage");
            return (Criteria) this;
        }

        public Criteria andFailMassageNotLike(String value) {
            addCriterion("fail_massage not like", value, "failMassage");
            return (Criteria) this;
        }

        public Criteria andFailMassageIn(List<String> values) {
            addCriterion("fail_massage in", values, "failMassage");
            return (Criteria) this;
        }

        public Criteria andFailMassageNotIn(List<String> values) {
            addCriterion("fail_massage not in", values, "failMassage");
            return (Criteria) this;
        }

        public Criteria andFailMassageBetween(String value1, String value2) {
            addCriterion("fail_massage between", value1, value2, "failMassage");
            return (Criteria) this;
        }

        public Criteria andFailMassageNotBetween(String value1, String value2) {
            addCriterion("fail_massage not between", value1, value2, "failMassage");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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