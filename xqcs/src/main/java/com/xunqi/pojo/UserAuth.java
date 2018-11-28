package com.xunqi.pojo;

import java.util.Date;

public class UserAuth {
    private String userId;

    private String userTruename;

    private String userCardno;

    private String cardOn;

    private Integer authState;

    private String failMassage;

    private Date createTime;

    private Date updateTime;
    
    //添加字段
    private String phone;
    
    private String portrait;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserTruename() {
        return userTruename;
    }

    public void setUserTruename(String userTruename) {
        this.userTruename = userTruename == null ? null : userTruename.trim();
    }

    public String getUserCardno() {
        return userCardno;
    }

    public void setUserCardno(String userCardno) {
        this.userCardno = userCardno == null ? null : userCardno.trim();
    }

    public String getCardOn() {
        return cardOn;
    }

    public void setCardOn(String cardOn) {
        this.cardOn = cardOn == null ? null : cardOn.trim();
    }

    public Integer getAuthState() {
        return authState;
    }

    public void setAuthState(Integer authState) {
        this.authState = authState;
    }

    public String getFailMassage() {
        return failMassage;
    }

    public void setFailMassage(String failMassage) {
        this.failMassage = failMassage == null ? null : failMassage.trim();
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

	public String getPortrait() {
		return portrait;
	}

	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}
}