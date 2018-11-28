package com.xunqi.pojo;

public class Recommend {
    private Integer id;

    private String recommendid;

    private String userid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRecommendid() {
        return recommendid;
    }

    public void setRecommendid(String recommendid) {
        this.recommendid = recommendid == null ? null : recommendid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
}