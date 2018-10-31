package com.xunqi.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ActivityInfo {
    private Integer id;

    private Integer activityId;

    private Integer views;

    private Integer relayNum;

    private Date startTime;

    private Date endTiem;

    private String fullAddress;

    private BigDecimal lng;

    private BigDecimal lat;

    private Integer applicantsNum;

    private Integer auditNum;
    
    private String phone;
    
    private String publisher;
 
    private String priceRange;

    private Integer totalLimit;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getRelayNum() {
        return relayNum;
    }

    public void setRelayNum(Integer relayNum) {
        this.relayNum = relayNum;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTiem() {
        return endTiem;
    }

    public void setEndTiem(Date endTiem) {
        this.endTiem = endTiem;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress == null ? null : fullAddress.trim();
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public Integer getApplicantsNum() {
        return applicantsNum;
    }

    public void setApplicantsNum(Integer applicantsNum) {
        this.applicantsNum = applicantsNum;
    }

    public Integer getAuditNum() {
        return auditNum;
    }

    public void setAuditNum(Integer auditNum) {
        this.auditNum = auditNum;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public Integer getTotalLimit() {
        return totalLimit;
    }

    public void setTotalLimit(Integer totalLimit) {
        this.totalLimit = totalLimit;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

	

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPriceRange() {
		return priceRange;
	}

	public void setPriceRange(String priceRange) {
		this.priceRange = priceRange;
	}
    
    
}