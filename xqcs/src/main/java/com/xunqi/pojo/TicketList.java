package com.xunqi.pojo;

import java.util.Date;

public class TicketList {
    private Integer id;

    private Integer activityId;

    private Integer ticketId;

    private String ticketName;

    private String ticketPrice;

    private Integer ticketNum;

    private Integer canbuyNum;

    private Integer examine;

    private Integer ticketTips;

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

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName == null ? null : ticketName.trim();
    }

    public String getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(String ticketPrice) {
        this.ticketPrice = ticketPrice == null ? null : ticketPrice.trim();
    }

    public Integer getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(Integer ticketNum) {
        this.ticketNum = ticketNum;
    }

    public Integer getCanbuyNum() {
        return canbuyNum;
    }

    public void setCanbuyNum(Integer canbuyNum) {
        this.canbuyNum = canbuyNum;
    }

    public Integer getExamine() {
        return examine;
    }

    public void setExamine(Integer examine) {
        this.examine = examine;
    }

    public Integer getTicketTips() {
        return ticketTips;
    }

    public void setTicketTips(Integer ticketTips) {
        this.ticketTips = ticketTips;
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
}