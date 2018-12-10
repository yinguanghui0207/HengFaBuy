package com.xunqi.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CircleMessageExample {
	private int pageNum;
	private int pageSize;
	private int beginRow;
	
    public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getBeginRow() {
		// 在mapper.xml使用begin属性时，对其进行计算
		return (pageNum - 1) * pageSize;
	}

	public void setBeginRow(int beginRow) {
		this.beginRow = beginRow;
	}
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CircleMessageExample() {
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

        public Criteria andUseIdIsNull() {
            addCriterion("use_id is null");
            return (Criteria) this;
        }

        public Criteria andUseIdIsNotNull() {
            addCriterion("use_id is not null");
            return (Criteria) this;
        }

        public Criteria andUseIdEqualTo(String value) {
            addCriterion("use_id =", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdNotEqualTo(String value) {
            addCriterion("use_id <>", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdGreaterThan(String value) {
            addCriterion("use_id >", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdGreaterThanOrEqualTo(String value) {
            addCriterion("use_id >=", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdLessThan(String value) {
            addCriterion("use_id <", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdLessThanOrEqualTo(String value) {
            addCriterion("use_id <=", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdLike(String value) {
            addCriterion("use_id like", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdNotLike(String value) {
            addCriterion("use_id not like", value, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdIn(List<String> values) {
            addCriterion("use_id in", values, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdNotIn(List<String> values) {
            addCriterion("use_id not in", values, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdBetween(String value1, String value2) {
            addCriterion("use_id between", value1, value2, "useId");
            return (Criteria) this;
        }

        public Criteria andUseIdNotBetween(String value1, String value2) {
            addCriterion("use_id not between", value1, value2, "useId");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andLngIsNull() {
            addCriterion("lng is null");
            return (Criteria) this;
        }

        public Criteria andLngIsNotNull() {
            addCriterion("lng is not null");
            return (Criteria) this;
        }

        public Criteria andLngEqualTo(BigDecimal value) {
            addCriterion("lng =", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotEqualTo(BigDecimal value) {
            addCriterion("lng <>", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThan(BigDecimal value) {
            addCriterion("lng >", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lng >=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThan(BigDecimal value) {
            addCriterion("lng <", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lng <=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngIn(List<BigDecimal> values) {
            addCriterion("lng in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotIn(List<BigDecimal> values) {
            addCriterion("lng not in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lng between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lng not between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(BigDecimal value) {
            addCriterion("lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(BigDecimal value) {
            addCriterion("lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(BigDecimal value) {
            addCriterion("lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(BigDecimal value) {
            addCriterion("lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<BigDecimal> values) {
            addCriterion("lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<BigDecimal> values) {
            addCriterion("lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andMsgLimitIsNull() {
            addCriterion("msg_limit is null");
            return (Criteria) this;
        }

        public Criteria andMsgLimitIsNotNull() {
            addCriterion("msg_limit is not null");
            return (Criteria) this;
        }

        public Criteria andMsgLimitEqualTo(Integer value) {
            addCriterion("msg_limit =", value, "msgLimit");
            return (Criteria) this;
        }

        public Criteria andMsgLimitNotEqualTo(Integer value) {
            addCriterion("msg_limit <>", value, "msgLimit");
            return (Criteria) this;
        }

        public Criteria andMsgLimitGreaterThan(Integer value) {
            addCriterion("msg_limit >", value, "msgLimit");
            return (Criteria) this;
        }

        public Criteria andMsgLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_limit >=", value, "msgLimit");
            return (Criteria) this;
        }

        public Criteria andMsgLimitLessThan(Integer value) {
            addCriterion("msg_limit <", value, "msgLimit");
            return (Criteria) this;
        }

        public Criteria andMsgLimitLessThanOrEqualTo(Integer value) {
            addCriterion("msg_limit <=", value, "msgLimit");
            return (Criteria) this;
        }

        public Criteria andMsgLimitIn(List<Integer> values) {
            addCriterion("msg_limit in", values, "msgLimit");
            return (Criteria) this;
        }

        public Criteria andMsgLimitNotIn(List<Integer> values) {
            addCriterion("msg_limit not in", values, "msgLimit");
            return (Criteria) this;
        }

        public Criteria andMsgLimitBetween(Integer value1, Integer value2) {
            addCriterion("msg_limit between", value1, value2, "msgLimit");
            return (Criteria) this;
        }

        public Criteria andMsgLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_limit not between", value1, value2, "msgLimit");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIsNull() {
            addCriterion("msg_type is null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIsNotNull() {
            addCriterion("msg_type is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeEqualTo(String value) {
            addCriterion("msg_type =", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotEqualTo(String value) {
            addCriterion("msg_type <>", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeGreaterThan(String value) {
            addCriterion("msg_type >", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeGreaterThanOrEqualTo(String value) {
            addCriterion("msg_type >=", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLessThan(String value) {
            addCriterion("msg_type <", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLessThanOrEqualTo(String value) {
            addCriterion("msg_type <=", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLike(String value) {
            addCriterion("msg_type like", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotLike(String value) {
            addCriterion("msg_type not like", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIn(List<String> values) {
            addCriterion("msg_type in", values, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotIn(List<String> values) {
            addCriterion("msg_type not in", values, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeBetween(String value1, String value2) {
            addCriterion("msg_type between", value1, value2, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotBetween(String value1, String value2) {
            addCriterion("msg_type not between", value1, value2, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgCompanyIsNull() {
            addCriterion("msg_company is null");
            return (Criteria) this;
        }

        public Criteria andMsgCompanyIsNotNull() {
            addCriterion("msg_company is not null");
            return (Criteria) this;
        }

        public Criteria andMsgCompanyEqualTo(String value) {
            addCriterion("msg_company =", value, "msgCompany");
            return (Criteria) this;
        }

        public Criteria andMsgCompanyNotEqualTo(String value) {
            addCriterion("msg_company <>", value, "msgCompany");
            return (Criteria) this;
        }

        public Criteria andMsgCompanyGreaterThan(String value) {
            addCriterion("msg_company >", value, "msgCompany");
            return (Criteria) this;
        }

        public Criteria andMsgCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("msg_company >=", value, "msgCompany");
            return (Criteria) this;
        }

        public Criteria andMsgCompanyLessThan(String value) {
            addCriterion("msg_company <", value, "msgCompany");
            return (Criteria) this;
        }

        public Criteria andMsgCompanyLessThanOrEqualTo(String value) {
            addCriterion("msg_company <=", value, "msgCompany");
            return (Criteria) this;
        }

        public Criteria andMsgCompanyLike(String value) {
            addCriterion("msg_company like", value, "msgCompany");
            return (Criteria) this;
        }

        public Criteria andMsgCompanyNotLike(String value) {
            addCriterion("msg_company not like", value, "msgCompany");
            return (Criteria) this;
        }

        public Criteria andMsgCompanyIn(List<String> values) {
            addCriterion("msg_company in", values, "msgCompany");
            return (Criteria) this;
        }

        public Criteria andMsgCompanyNotIn(List<String> values) {
            addCriterion("msg_company not in", values, "msgCompany");
            return (Criteria) this;
        }

        public Criteria andMsgCompanyBetween(String value1, String value2) {
            addCriterion("msg_company between", value1, value2, "msgCompany");
            return (Criteria) this;
        }

        public Criteria andMsgCompanyNotBetween(String value1, String value2) {
            addCriterion("msg_company not between", value1, value2, "msgCompany");
            return (Criteria) this;
        }

        public Criteria andMsgViewIsNull() {
            addCriterion("msg_view is null");
            return (Criteria) this;
        }

        public Criteria andMsgViewIsNotNull() {
            addCriterion("msg_view is not null");
            return (Criteria) this;
        }

        public Criteria andMsgViewEqualTo(Integer value) {
            addCriterion("msg_view =", value, "msgView");
            return (Criteria) this;
        }

        public Criteria andMsgViewNotEqualTo(Integer value) {
            addCriterion("msg_view <>", value, "msgView");
            return (Criteria) this;
        }

        public Criteria andMsgViewGreaterThan(Integer value) {
            addCriterion("msg_view >", value, "msgView");
            return (Criteria) this;
        }

        public Criteria andMsgViewGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_view >=", value, "msgView");
            return (Criteria) this;
        }

        public Criteria andMsgViewLessThan(Integer value) {
            addCriterion("msg_view <", value, "msgView");
            return (Criteria) this;
        }

        public Criteria andMsgViewLessThanOrEqualTo(Integer value) {
            addCriterion("msg_view <=", value, "msgView");
            return (Criteria) this;
        }

        public Criteria andMsgViewIn(List<Integer> values) {
            addCriterion("msg_view in", values, "msgView");
            return (Criteria) this;
        }

        public Criteria andMsgViewNotIn(List<Integer> values) {
            addCriterion("msg_view not in", values, "msgView");
            return (Criteria) this;
        }

        public Criteria andMsgViewBetween(Integer value1, Integer value2) {
            addCriterion("msg_view between", value1, value2, "msgView");
            return (Criteria) this;
        }

        public Criteria andMsgViewNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_view not between", value1, value2, "msgView");
            return (Criteria) this;
        }

        public Criteria andMsgReplyIsNull() {
            addCriterion("msg_reply is null");
            return (Criteria) this;
        }

        public Criteria andMsgReplyIsNotNull() {
            addCriterion("msg_reply is not null");
            return (Criteria) this;
        }

        public Criteria andMsgReplyEqualTo(Integer value) {
            addCriterion("msg_reply =", value, "msgReply");
            return (Criteria) this;
        }

        public Criteria andMsgReplyNotEqualTo(Integer value) {
            addCriterion("msg_reply <>", value, "msgReply");
            return (Criteria) this;
        }

        public Criteria andMsgReplyGreaterThan(Integer value) {
            addCriterion("msg_reply >", value, "msgReply");
            return (Criteria) this;
        }

        public Criteria andMsgReplyGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_reply >=", value, "msgReply");
            return (Criteria) this;
        }

        public Criteria andMsgReplyLessThan(Integer value) {
            addCriterion("msg_reply <", value, "msgReply");
            return (Criteria) this;
        }

        public Criteria andMsgReplyLessThanOrEqualTo(Integer value) {
            addCriterion("msg_reply <=", value, "msgReply");
            return (Criteria) this;
        }

        public Criteria andMsgReplyIn(List<Integer> values) {
            addCriterion("msg_reply in", values, "msgReply");
            return (Criteria) this;
        }

        public Criteria andMsgReplyNotIn(List<Integer> values) {
            addCriterion("msg_reply not in", values, "msgReply");
            return (Criteria) this;
        }

        public Criteria andMsgReplyBetween(Integer value1, Integer value2) {
            addCriterion("msg_reply between", value1, value2, "msgReply");
            return (Criteria) this;
        }

        public Criteria andMsgReplyNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_reply not between", value1, value2, "msgReply");
            return (Criteria) this;
        }

        public Criteria andMsgPraiseIsNull() {
            addCriterion("msg_praise is null");
            return (Criteria) this;
        }

        public Criteria andMsgPraiseIsNotNull() {
            addCriterion("msg_praise is not null");
            return (Criteria) this;
        }

        public Criteria andMsgPraiseEqualTo(Integer value) {
            addCriterion("msg_praise =", value, "msgPraise");
            return (Criteria) this;
        }

        public Criteria andMsgPraiseNotEqualTo(Integer value) {
            addCriterion("msg_praise <>", value, "msgPraise");
            return (Criteria) this;
        }

        public Criteria andMsgPraiseGreaterThan(Integer value) {
            addCriterion("msg_praise >", value, "msgPraise");
            return (Criteria) this;
        }

        public Criteria andMsgPraiseGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_praise >=", value, "msgPraise");
            return (Criteria) this;
        }

        public Criteria andMsgPraiseLessThan(Integer value) {
            addCriterion("msg_praise <", value, "msgPraise");
            return (Criteria) this;
        }

        public Criteria andMsgPraiseLessThanOrEqualTo(Integer value) {
            addCriterion("msg_praise <=", value, "msgPraise");
            return (Criteria) this;
        }

        public Criteria andMsgPraiseIn(List<Integer> values) {
            addCriterion("msg_praise in", values, "msgPraise");
            return (Criteria) this;
        }

        public Criteria andMsgPraiseNotIn(List<Integer> values) {
            addCriterion("msg_praise not in", values, "msgPraise");
            return (Criteria) this;
        }

        public Criteria andMsgPraiseBetween(Integer value1, Integer value2) {
            addCriterion("msg_praise between", value1, value2, "msgPraise");
            return (Criteria) this;
        }

        public Criteria andMsgPraiseNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_praise not between", value1, value2, "msgPraise");
            return (Criteria) this;
        }

        public Criteria andMsgStateIsNull() {
            addCriterion("msg_state is null");
            return (Criteria) this;
        }

        public Criteria andMsgStateIsNotNull() {
            addCriterion("msg_state is not null");
            return (Criteria) this;
        }

        public Criteria andMsgStateEqualTo(Integer value) {
            addCriterion("msg_state =", value, "msgState");
            return (Criteria) this;
        }

        public Criteria andMsgStateNotEqualTo(Integer value) {
            addCriterion("msg_state <>", value, "msgState");
            return (Criteria) this;
        }

        public Criteria andMsgStateGreaterThan(Integer value) {
            addCriterion("msg_state >", value, "msgState");
            return (Criteria) this;
        }

        public Criteria andMsgStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_state >=", value, "msgState");
            return (Criteria) this;
        }

        public Criteria andMsgStateLessThan(Integer value) {
            addCriterion("msg_state <", value, "msgState");
            return (Criteria) this;
        }

        public Criteria andMsgStateLessThanOrEqualTo(Integer value) {
            addCriterion("msg_state <=", value, "msgState");
            return (Criteria) this;
        }

        public Criteria andMsgStateIn(List<Integer> values) {
            addCriterion("msg_state in", values, "msgState");
            return (Criteria) this;
        }

        public Criteria andMsgStateNotIn(List<Integer> values) {
            addCriterion("msg_state not in", values, "msgState");
            return (Criteria) this;
        }

        public Criteria andMsgStateBetween(Integer value1, Integer value2) {
            addCriterion("msg_state between", value1, value2, "msgState");
            return (Criteria) this;
        }

        public Criteria andMsgStateNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_state not between", value1, value2, "msgState");
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