package com.xunqi.pojo;

public class ReleaseString {
    private Integer id;

    private Integer activityId;

    private String detailsString;

    private String fieldString;

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

    public String getDetailsString() {
        return detailsString;
    }

    public void setDetailsString(String detailsString) {
        this.detailsString = detailsString == null ? null : detailsString.trim();
    }

    public String getFieldString() {
        return fieldString;
    }

    public void setFieldString(String fieldString) {
        this.fieldString = fieldString == null ? null : fieldString.trim();
    }
}