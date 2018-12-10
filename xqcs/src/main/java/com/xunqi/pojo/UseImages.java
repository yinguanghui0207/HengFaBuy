package com.xunqi.pojo;

import java.util.Date;

public class UseImages {
    private Integer id;

    private String useId;

    private String name;

    private String imagesDescribe;

    private Integer imagesLimit;

    private String upImage;

    private String type;

    private String isCompany;

    private Integer viewNum;

    private Integer state;

    private Date createTime;

    private Date updateTime;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getImagesDescribe() {
        return imagesDescribe;
    }

    public void setImagesDescribe(String imagesDescribe) {
        this.imagesDescribe = imagesDescribe == null ? null : imagesDescribe.trim();
    }

    public Integer getImagesLimit() {
        return imagesLimit;
    }

    public void setImagesLimit(Integer imagesLimit) {
        this.imagesLimit = imagesLimit;
    }

    public String getUpImage() {
        return upImage;
    }

    public void setUpImage(String upImage) {
        this.upImage = upImage == null ? null : upImage.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getIsCompany() {
        return isCompany;
    }

    public void setIsCompany(String isCompany) {
        this.isCompany = isCompany == null ? null : isCompany.trim();
    }

    public Integer getViewNum() {
        return viewNum;
    }

    public void setViewNum(Integer viewNum) {
        this.viewNum = viewNum;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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