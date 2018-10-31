package com.xunqi.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TicketListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TicketListExample() {
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

        public Criteria andTicketIdIsNull() {
            addCriterion("ticket_id is null");
            return (Criteria) this;
        }

        public Criteria andTicketIdIsNotNull() {
            addCriterion("ticket_id is not null");
            return (Criteria) this;
        }

        public Criteria andTicketIdEqualTo(Integer value) {
            addCriterion("ticket_id =", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotEqualTo(Integer value) {
            addCriterion("ticket_id <>", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdGreaterThan(Integer value) {
            addCriterion("ticket_id >", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticket_id >=", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdLessThan(Integer value) {
            addCriterion("ticket_id <", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdLessThanOrEqualTo(Integer value) {
            addCriterion("ticket_id <=", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdIn(List<Integer> values) {
            addCriterion("ticket_id in", values, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotIn(List<Integer> values) {
            addCriterion("ticket_id not in", values, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdBetween(Integer value1, Integer value2) {
            addCriterion("ticket_id between", value1, value2, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ticket_id not between", value1, value2, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketNameIsNull() {
            addCriterion("ticket_name is null");
            return (Criteria) this;
        }

        public Criteria andTicketNameIsNotNull() {
            addCriterion("ticket_name is not null");
            return (Criteria) this;
        }

        public Criteria andTicketNameEqualTo(String value) {
            addCriterion("ticket_name =", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameNotEqualTo(String value) {
            addCriterion("ticket_name <>", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameGreaterThan(String value) {
            addCriterion("ticket_name >", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_name >=", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameLessThan(String value) {
            addCriterion("ticket_name <", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameLessThanOrEqualTo(String value) {
            addCriterion("ticket_name <=", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameLike(String value) {
            addCriterion("ticket_name like", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameNotLike(String value) {
            addCriterion("ticket_name not like", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameIn(List<String> values) {
            addCriterion("ticket_name in", values, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameNotIn(List<String> values) {
            addCriterion("ticket_name not in", values, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameBetween(String value1, String value2) {
            addCriterion("ticket_name between", value1, value2, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameNotBetween(String value1, String value2) {
            addCriterion("ticket_name not between", value1, value2, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketPriceIsNull() {
            addCriterion("ticket_price is null");
            return (Criteria) this;
        }

        public Criteria andTicketPriceIsNotNull() {
            addCriterion("ticket_price is not null");
            return (Criteria) this;
        }

        public Criteria andTicketPriceEqualTo(String value) {
            addCriterion("ticket_price =", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceNotEqualTo(String value) {
            addCriterion("ticket_price <>", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceGreaterThan(String value) {
            addCriterion("ticket_price >", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_price >=", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceLessThan(String value) {
            addCriterion("ticket_price <", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceLessThanOrEqualTo(String value) {
            addCriterion("ticket_price <=", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceLike(String value) {
            addCriterion("ticket_price like", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceNotLike(String value) {
            addCriterion("ticket_price not like", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceIn(List<String> values) {
            addCriterion("ticket_price in", values, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceNotIn(List<String> values) {
            addCriterion("ticket_price not in", values, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceBetween(String value1, String value2) {
            addCriterion("ticket_price between", value1, value2, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceNotBetween(String value1, String value2) {
            addCriterion("ticket_price not between", value1, value2, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketNumIsNull() {
            addCriterion("ticket_num is null");
            return (Criteria) this;
        }

        public Criteria andTicketNumIsNotNull() {
            addCriterion("ticket_num is not null");
            return (Criteria) this;
        }

        public Criteria andTicketNumEqualTo(Integer value) {
            addCriterion("ticket_num =", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumNotEqualTo(Integer value) {
            addCriterion("ticket_num <>", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumGreaterThan(Integer value) {
            addCriterion("ticket_num >", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticket_num >=", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumLessThan(Integer value) {
            addCriterion("ticket_num <", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumLessThanOrEqualTo(Integer value) {
            addCriterion("ticket_num <=", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumIn(List<Integer> values) {
            addCriterion("ticket_num in", values, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumNotIn(List<Integer> values) {
            addCriterion("ticket_num not in", values, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumBetween(Integer value1, Integer value2) {
            addCriterion("ticket_num between", value1, value2, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumNotBetween(Integer value1, Integer value2) {
            addCriterion("ticket_num not between", value1, value2, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andCanbuyNumIsNull() {
            addCriterion("canbuy_num is null");
            return (Criteria) this;
        }

        public Criteria andCanbuyNumIsNotNull() {
            addCriterion("canbuy_num is not null");
            return (Criteria) this;
        }

        public Criteria andCanbuyNumEqualTo(Integer value) {
            addCriterion("canbuy_num =", value, "canbuyNum");
            return (Criteria) this;
        }

        public Criteria andCanbuyNumNotEqualTo(Integer value) {
            addCriterion("canbuy_num <>", value, "canbuyNum");
            return (Criteria) this;
        }

        public Criteria andCanbuyNumGreaterThan(Integer value) {
            addCriterion("canbuy_num >", value, "canbuyNum");
            return (Criteria) this;
        }

        public Criteria andCanbuyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("canbuy_num >=", value, "canbuyNum");
            return (Criteria) this;
        }

        public Criteria andCanbuyNumLessThan(Integer value) {
            addCriterion("canbuy_num <", value, "canbuyNum");
            return (Criteria) this;
        }

        public Criteria andCanbuyNumLessThanOrEqualTo(Integer value) {
            addCriterion("canbuy_num <=", value, "canbuyNum");
            return (Criteria) this;
        }

        public Criteria andCanbuyNumIn(List<Integer> values) {
            addCriterion("canbuy_num in", values, "canbuyNum");
            return (Criteria) this;
        }

        public Criteria andCanbuyNumNotIn(List<Integer> values) {
            addCriterion("canbuy_num not in", values, "canbuyNum");
            return (Criteria) this;
        }

        public Criteria andCanbuyNumBetween(Integer value1, Integer value2) {
            addCriterion("canbuy_num between", value1, value2, "canbuyNum");
            return (Criteria) this;
        }

        public Criteria andCanbuyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("canbuy_num not between", value1, value2, "canbuyNum");
            return (Criteria) this;
        }

        public Criteria andExamineIsNull() {
            addCriterion("examine is null");
            return (Criteria) this;
        }

        public Criteria andExamineIsNotNull() {
            addCriterion("examine is not null");
            return (Criteria) this;
        }

        public Criteria andExamineEqualTo(Integer value) {
            addCriterion("examine =", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineNotEqualTo(Integer value) {
            addCriterion("examine <>", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineGreaterThan(Integer value) {
            addCriterion("examine >", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineGreaterThanOrEqualTo(Integer value) {
            addCriterion("examine >=", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineLessThan(Integer value) {
            addCriterion("examine <", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineLessThanOrEqualTo(Integer value) {
            addCriterion("examine <=", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineIn(List<Integer> values) {
            addCriterion("examine in", values, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineNotIn(List<Integer> values) {
            addCriterion("examine not in", values, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineBetween(Integer value1, Integer value2) {
            addCriterion("examine between", value1, value2, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineNotBetween(Integer value1, Integer value2) {
            addCriterion("examine not between", value1, value2, "examine");
            return (Criteria) this;
        }

        public Criteria andTicketTipsIsNull() {
            addCriterion("ticket_tips is null");
            return (Criteria) this;
        }

        public Criteria andTicketTipsIsNotNull() {
            addCriterion("ticket_tips is not null");
            return (Criteria) this;
        }

        public Criteria andTicketTipsEqualTo(Integer value) {
            addCriterion("ticket_tips =", value, "ticketTips");
            return (Criteria) this;
        }

        public Criteria andTicketTipsNotEqualTo(Integer value) {
            addCriterion("ticket_tips <>", value, "ticketTips");
            return (Criteria) this;
        }

        public Criteria andTicketTipsGreaterThan(Integer value) {
            addCriterion("ticket_tips >", value, "ticketTips");
            return (Criteria) this;
        }

        public Criteria andTicketTipsGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticket_tips >=", value, "ticketTips");
            return (Criteria) this;
        }

        public Criteria andTicketTipsLessThan(Integer value) {
            addCriterion("ticket_tips <", value, "ticketTips");
            return (Criteria) this;
        }

        public Criteria andTicketTipsLessThanOrEqualTo(Integer value) {
            addCriterion("ticket_tips <=", value, "ticketTips");
            return (Criteria) this;
        }

        public Criteria andTicketTipsIn(List<Integer> values) {
            addCriterion("ticket_tips in", values, "ticketTips");
            return (Criteria) this;
        }

        public Criteria andTicketTipsNotIn(List<Integer> values) {
            addCriterion("ticket_tips not in", values, "ticketTips");
            return (Criteria) this;
        }

        public Criteria andTicketTipsBetween(Integer value1, Integer value2) {
            addCriterion("ticket_tips between", value1, value2, "ticketTips");
            return (Criteria) this;
        }

        public Criteria andTicketTipsNotBetween(Integer value1, Integer value2) {
            addCriterion("ticket_tips not between", value1, value2, "ticketTips");
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