package com.xunqi.pojo;

import java.util.Date;
import java.util.List;

public class ActivityMerchant {
    private Integer merchantId;

    private Integer activityId;

    private String merchantNo;

    private String merchantName;

    private String legalName;

    private String legalNo;

    private String businessLicense;

    private String cardOn;

    private Integer state;
    
    private String failMassage;

    private String merchantPortrait;

    private String merchantPhone;

    private String introduction;

    private Integer fans;

    private Integer activityNum;

    private Date authTime;

    private Date createTime;

    private Date updateTime;
    
  //添加字段
    private List<ActivityUsr> activityList;

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo == null ? null : merchantNo.trim();
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName == null ? null : legalName.trim();
    }

    public String getLegalNo() {
        return legalNo;
    }

    public void setLegalNo(String legalNo) {
        this.legalNo = legalNo == null ? null : legalNo.trim();
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense == null ? null : businessLicense.trim();
    }

    public String getCardOn() {
        return cardOn;
    }

    public void setCardOn(String cardOn) {
        this.cardOn = cardOn == null ? null : cardOn.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMerchantPortrait() {
        return merchantPortrait;
    }

    public void setMerchantPortrait(String merchantPortrait) {
        this.merchantPortrait = merchantPortrait == null ? null : merchantPortrait.trim();
    }

    public String getMerchantPhone() {
        return merchantPhone;
    }

    public void setMerchantPhone(String merchantPhone) {
        this.merchantPhone = merchantPhone == null ? null : merchantPhone.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public Integer getFans() {
        return fans;
    }

    public void setFans(Integer fans) {
        this.fans = fans;
    }

    public Integer getActivityNum() {
        return activityNum;
    }

    public void setActivityNum(Integer activityNum) {
        this.activityNum = activityNum;
    }

    public Date getAuthTime() {
        return authTime;
    }

    public void setAuthTime(Date authTime) {
        this.authTime = authTime;
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

	public List<ActivityUsr> getActivityList() {
		return activityList;
	}

	public void setActivityList(List<ActivityUsr> activityList) {
		this.activityList = activityList;
	}

	public String getFailMassage() {
		return failMassage;
	}

	public void setFailMassage(String failMassage) {
		this.failMassage = failMassage;
	}
}