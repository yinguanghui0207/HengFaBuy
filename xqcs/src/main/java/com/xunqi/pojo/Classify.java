package com.xunqi.pojo;

import java.util.Date;

public class Classify {
    private Integer id;

    private Integer classifyType;

    private String classifyName;

    private Integer classifyState;

    private String classifyPortrait;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassifyType() {
        return classifyType;
    }

    public void setClassifyType(Integer classifyType) {
        this.classifyType = classifyType;
    }

    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName == null ? null : classifyName.trim();
    }

    public Integer getClassifyState() {
        return classifyState;
    }

    public void setClassifyState(Integer classifyState) {
        this.classifyState = classifyState;
    }

    public String getClassifyPortrait() {
        return classifyPortrait;
    }

    public void setClassifyPortrait(String classifyPortrait) {
        this.classifyPortrait = classifyPortrait == null ? null : classifyPortrait.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}