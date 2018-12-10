package com.xunqi.pojo;

import java.util.Date;

public class TebReply {
    private Integer id;

    private Integer commentId;

    private String useId1;

    private String name1;

    private String useId2;

    private String name2;

    private String content;

    private Integer state;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getUseId1() {
        return useId1;
    }

    public void setUseId1(String useId1) {
        this.useId1 = useId1 == null ? null : useId1.trim();
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1 == null ? null : name1.trim();
    }

    public String getUseId2() {
        return useId2;
    }

    public void setUseId2(String useId2) {
        this.useId2 = useId2 == null ? null : useId2.trim();
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2 == null ? null : name2.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
}