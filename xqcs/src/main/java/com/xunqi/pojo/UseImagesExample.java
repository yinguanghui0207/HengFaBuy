package com.xunqi.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UseImagesExample {
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

    public UseImagesExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andImagesDescribeIsNull() {
            addCriterion("images_describe is null");
            return (Criteria) this;
        }

        public Criteria andImagesDescribeIsNotNull() {
            addCriterion("images_describe is not null");
            return (Criteria) this;
        }

        public Criteria andImagesDescribeEqualTo(String value) {
            addCriterion("images_describe =", value, "imagesDescribe");
            return (Criteria) this;
        }

        public Criteria andImagesDescribeNotEqualTo(String value) {
            addCriterion("images_describe <>", value, "imagesDescribe");
            return (Criteria) this;
        }

        public Criteria andImagesDescribeGreaterThan(String value) {
            addCriterion("images_describe >", value, "imagesDescribe");
            return (Criteria) this;
        }

        public Criteria andImagesDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("images_describe >=", value, "imagesDescribe");
            return (Criteria) this;
        }

        public Criteria andImagesDescribeLessThan(String value) {
            addCriterion("images_describe <", value, "imagesDescribe");
            return (Criteria) this;
        }

        public Criteria andImagesDescribeLessThanOrEqualTo(String value) {
            addCriterion("images_describe <=", value, "imagesDescribe");
            return (Criteria) this;
        }

        public Criteria andImagesDescribeLike(String value) {
            addCriterion("images_describe like", value, "imagesDescribe");
            return (Criteria) this;
        }

        public Criteria andImagesDescribeNotLike(String value) {
            addCriterion("images_describe not like", value, "imagesDescribe");
            return (Criteria) this;
        }

        public Criteria andImagesDescribeIn(List<String> values) {
            addCriterion("images_describe in", values, "imagesDescribe");
            return (Criteria) this;
        }

        public Criteria andImagesDescribeNotIn(List<String> values) {
            addCriterion("images_describe not in", values, "imagesDescribe");
            return (Criteria) this;
        }

        public Criteria andImagesDescribeBetween(String value1, String value2) {
            addCriterion("images_describe between", value1, value2, "imagesDescribe");
            return (Criteria) this;
        }

        public Criteria andImagesDescribeNotBetween(String value1, String value2) {
            addCriterion("images_describe not between", value1, value2, "imagesDescribe");
            return (Criteria) this;
        }

        public Criteria andImagesLimitIsNull() {
            addCriterion("images_limit is null");
            return (Criteria) this;
        }

        public Criteria andImagesLimitIsNotNull() {
            addCriterion("images_limit is not null");
            return (Criteria) this;
        }

        public Criteria andImagesLimitEqualTo(Integer value) {
            addCriterion("images_limit =", value, "imagesLimit");
            return (Criteria) this;
        }

        public Criteria andImagesLimitNotEqualTo(Integer value) {
            addCriterion("images_limit <>", value, "imagesLimit");
            return (Criteria) this;
        }

        public Criteria andImagesLimitGreaterThan(Integer value) {
            addCriterion("images_limit >", value, "imagesLimit");
            return (Criteria) this;
        }

        public Criteria andImagesLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("images_limit >=", value, "imagesLimit");
            return (Criteria) this;
        }

        public Criteria andImagesLimitLessThan(Integer value) {
            addCriterion("images_limit <", value, "imagesLimit");
            return (Criteria) this;
        }

        public Criteria andImagesLimitLessThanOrEqualTo(Integer value) {
            addCriterion("images_limit <=", value, "imagesLimit");
            return (Criteria) this;
        }

        public Criteria andImagesLimitIn(List<Integer> values) {
            addCriterion("images_limit in", values, "imagesLimit");
            return (Criteria) this;
        }

        public Criteria andImagesLimitNotIn(List<Integer> values) {
            addCriterion("images_limit not in", values, "imagesLimit");
            return (Criteria) this;
        }

        public Criteria andImagesLimitBetween(Integer value1, Integer value2) {
            addCriterion("images_limit between", value1, value2, "imagesLimit");
            return (Criteria) this;
        }

        public Criteria andImagesLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("images_limit not between", value1, value2, "imagesLimit");
            return (Criteria) this;
        }

        public Criteria andUpImageIsNull() {
            addCriterion("up_image is null");
            return (Criteria) this;
        }

        public Criteria andUpImageIsNotNull() {
            addCriterion("up_image is not null");
            return (Criteria) this;
        }

        public Criteria andUpImageEqualTo(String value) {
            addCriterion("up_image =", value, "upImage");
            return (Criteria) this;
        }

        public Criteria andUpImageNotEqualTo(String value) {
            addCriterion("up_image <>", value, "upImage");
            return (Criteria) this;
        }

        public Criteria andUpImageGreaterThan(String value) {
            addCriterion("up_image >", value, "upImage");
            return (Criteria) this;
        }

        public Criteria andUpImageGreaterThanOrEqualTo(String value) {
            addCriterion("up_image >=", value, "upImage");
            return (Criteria) this;
        }

        public Criteria andUpImageLessThan(String value) {
            addCriterion("up_image <", value, "upImage");
            return (Criteria) this;
        }

        public Criteria andUpImageLessThanOrEqualTo(String value) {
            addCriterion("up_image <=", value, "upImage");
            return (Criteria) this;
        }

        public Criteria andUpImageLike(String value) {
            addCriterion("up_image like", value, "upImage");
            return (Criteria) this;
        }

        public Criteria andUpImageNotLike(String value) {
            addCriterion("up_image not like", value, "upImage");
            return (Criteria) this;
        }

        public Criteria andUpImageIn(List<String> values) {
            addCriterion("up_image in", values, "upImage");
            return (Criteria) this;
        }

        public Criteria andUpImageNotIn(List<String> values) {
            addCriterion("up_image not in", values, "upImage");
            return (Criteria) this;
        }

        public Criteria andUpImageBetween(String value1, String value2) {
            addCriterion("up_image between", value1, value2, "upImage");
            return (Criteria) this;
        }

        public Criteria andUpImageNotBetween(String value1, String value2) {
            addCriterion("up_image not between", value1, value2, "upImage");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andIsCompanyIsNull() {
            addCriterion("is_company is null");
            return (Criteria) this;
        }

        public Criteria andIsCompanyIsNotNull() {
            addCriterion("is_company is not null");
            return (Criteria) this;
        }

        public Criteria andIsCompanyEqualTo(String value) {
            addCriterion("is_company =", value, "isCompany");
            return (Criteria) this;
        }

        public Criteria andIsCompanyNotEqualTo(String value) {
            addCriterion("is_company <>", value, "isCompany");
            return (Criteria) this;
        }

        public Criteria andIsCompanyGreaterThan(String value) {
            addCriterion("is_company >", value, "isCompany");
            return (Criteria) this;
        }

        public Criteria andIsCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("is_company >=", value, "isCompany");
            return (Criteria) this;
        }

        public Criteria andIsCompanyLessThan(String value) {
            addCriterion("is_company <", value, "isCompany");
            return (Criteria) this;
        }

        public Criteria andIsCompanyLessThanOrEqualTo(String value) {
            addCriterion("is_company <=", value, "isCompany");
            return (Criteria) this;
        }

        public Criteria andIsCompanyLike(String value) {
            addCriterion("is_company like", value, "isCompany");
            return (Criteria) this;
        }

        public Criteria andIsCompanyNotLike(String value) {
            addCriterion("is_company not like", value, "isCompany");
            return (Criteria) this;
        }

        public Criteria andIsCompanyIn(List<String> values) {
            addCriterion("is_company in", values, "isCompany");
            return (Criteria) this;
        }

        public Criteria andIsCompanyNotIn(List<String> values) {
            addCriterion("is_company not in", values, "isCompany");
            return (Criteria) this;
        }

        public Criteria andIsCompanyBetween(String value1, String value2) {
            addCriterion("is_company between", value1, value2, "isCompany");
            return (Criteria) this;
        }

        public Criteria andIsCompanyNotBetween(String value1, String value2) {
            addCriterion("is_company not between", value1, value2, "isCompany");
            return (Criteria) this;
        }

        public Criteria andViewNumIsNull() {
            addCriterion("view_num is null");
            return (Criteria) this;
        }

        public Criteria andViewNumIsNotNull() {
            addCriterion("view_num is not null");
            return (Criteria) this;
        }

        public Criteria andViewNumEqualTo(Integer value) {
            addCriterion("view_num =", value, "viewNum");
            return (Criteria) this;
        }

        public Criteria andViewNumNotEqualTo(Integer value) {
            addCriterion("view_num <>", value, "viewNum");
            return (Criteria) this;
        }

        public Criteria andViewNumGreaterThan(Integer value) {
            addCriterion("view_num >", value, "viewNum");
            return (Criteria) this;
        }

        public Criteria andViewNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("view_num >=", value, "viewNum");
            return (Criteria) this;
        }

        public Criteria andViewNumLessThan(Integer value) {
            addCriterion("view_num <", value, "viewNum");
            return (Criteria) this;
        }

        public Criteria andViewNumLessThanOrEqualTo(Integer value) {
            addCriterion("view_num <=", value, "viewNum");
            return (Criteria) this;
        }

        public Criteria andViewNumIn(List<Integer> values) {
            addCriterion("view_num in", values, "viewNum");
            return (Criteria) this;
        }

        public Criteria andViewNumNotIn(List<Integer> values) {
            addCriterion("view_num not in", values, "viewNum");
            return (Criteria) this;
        }

        public Criteria andViewNumBetween(Integer value1, Integer value2) {
            addCriterion("view_num between", value1, value2, "viewNum");
            return (Criteria) this;
        }

        public Criteria andViewNumNotBetween(Integer value1, Integer value2) {
            addCriterion("view_num not between", value1, value2, "viewNum");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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