package com.xunqi.pojo;

import java.math.BigDecimal;
import java.util.Date;


/*@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)*/
public class XqActivity {
    private Integer id;

    private Integer activityId;

    private String cover;

    private String coverHight;

    private String coverWight;

    private String activityTitle;

    private String price;

    private String address;

    private String fullAddress;

    private BigDecimal lng;

    private BigDecimal lat;

    private String activityType;
    
    private Integer activityLevel;

    private Integer applicantsNum;

    private Integer state;
    
    private String failMassage;

    private String activityTime;

    private String startTime;

    private String endTime;

    private Integer isCertified;

    private String publisher;

    private Date createTime;

    private Date updateTime;
   
    //添加字段
    private BigDecimal ranges;
    
    private Integer page;

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

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public String getCoverHight() {
        return coverHight;
    }

    public void setCoverHight(String coverHight) {
        this.coverHight = coverHight == null ? null : coverHight.trim();
    }

    public String getCoverWight() {
        return coverWight;
    }

    public void setCoverWight(String coverWight) {
        this.coverWight = coverWight == null ? null : coverWight.trim();
    }

    public String getActivityTitle() {
        return activityTitle;
    }

    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle == null ? null : activityTitle.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType == null ? null : activityType.trim();
    }

    public Integer getApplicantsNum() {
        return applicantsNum;
    }

    public void setApplicantsNum(Integer applicantsNum) {
        this.applicantsNum = applicantsNum;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getActivityTime() {
        return activityTime;
    }

    public void setActivityTime(String activityTime) {
        this.activityTime = activityTime == null ? null : activityTime.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public Integer getIsCertified() {
        return isCertified;
    }

    public void setIsCertified(Integer isCertified) {
        this.isCertified = isCertified;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
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

	public String getFailMassage() {
		return failMassage;
	}

	public void setFailMassage(String failMassage) {
		this.failMassage = failMassage;
	}

	public BigDecimal getrangess() {
		return ranges;
	}

	public void setranges(BigDecimal ranges) {
		this.ranges = ranges;
	}

	public Integer getActivityLevel() {
		return activityLevel;
	}

	public void setActivityLevel(Integer activityLevel) {
		this.activityLevel = activityLevel;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}
}