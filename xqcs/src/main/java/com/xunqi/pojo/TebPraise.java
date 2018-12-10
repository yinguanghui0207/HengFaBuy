package com.xunqi.pojo;

import java.util.Date;

public class TebPraise {
    private Integer id;

    private Integer fcmid;

    private String useId;

    private Integer type;

    private Date createTime;
    
    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFcmid() {
        return fcmid;
    }

    public void setFcmid(Integer fcmid) {
        this.fcmid = fcmid;
    }

    public String getUseId() {
        return useId;
    }

    public void setUseId(String useId) {
        this.useId = useId == null ? null : useId.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}
}