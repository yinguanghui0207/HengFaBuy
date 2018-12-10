package com.xunqi.pojo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class CircleMessage {
    private Integer id;

    private String useId;

    private String content;

    private String picture;

    private BigDecimal lng;

    private BigDecimal lat;

    private Integer msgLimit;

    private String msgType;

    private String msgCompany;

    private Integer msgView;

    private Integer msgReply;

    private Integer msgPraise;

    private Integer msgState;

    private Date createTime;
    
    //添加字段
    private BigDecimal ranges;
    //接收字段
    private ActivityUsr activityUsr;
    private List<CircleComment> circleCommentList;
   
    private Integer page;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUseId() {
        return useId;
    }

    public void setUseId(String useId) {
        this.useId = useId == null ? null : useId.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
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

    public Integer getMsgLimit() {
        return msgLimit;
    }

    public void setMsgLimit(Integer msgLimit) {
        this.msgLimit = msgLimit;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType == null ? null : msgType.trim();
    }

    public String getMsgCompany() {
        return msgCompany;
    }

    public void setMsgCompany(String msgCompany) {
        this.msgCompany = msgCompany == null ? null : msgCompany.trim();
    }

    public Integer getMsgView() {
        return msgView;
    }

    public void setMsgView(Integer msgView) {
        this.msgView = msgView;
    }

    public Integer getMsgReply() {
        return msgReply;
    }

    public void setMsgReply(Integer msgReply) {
        this.msgReply = msgReply;
    }

    public Integer getMsgPraise() {
        return msgPraise;
    }

    public void setMsgPraise(Integer msgPraise) {
        this.msgPraise = msgPraise;
    }

    public Integer getMsgState() {
        return msgState;
    }

    public void setMsgState(Integer msgState) {
        this.msgState = msgState;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	public BigDecimal getRanges() {
		return ranges;
	}

	public void setRanges(BigDecimal ranges) {
		this.ranges = ranges;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public ActivityUsr getActivityUsr() {
		return activityUsr;
	}

	public void setActivityUsr(ActivityUsr activityUsr) {
		this.activityUsr = activityUsr;
	}

	public List<CircleComment> getCircleCommentList() {
		return circleCommentList;
	}

	public void setCircleCommentList(List<CircleComment> circleCommentList) {
		this.circleCommentList = circleCommentList;
	}
}