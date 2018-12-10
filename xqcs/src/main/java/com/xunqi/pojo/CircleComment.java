package com.xunqi.pojo;

import java.util.Date;
import java.util.List;

public class CircleComment {
    private Integer id;

    private Integer fcmid;

    private String useId;

    private String content;

    private Date createTime;

    private Integer likeCount;

    private Integer commentState;
    
    //返回字段
    private List<TebReply> tebReplyList;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getCommentState() {
        return commentState;
    }

    public void setCommentState(Integer commentState) {
        this.commentState = commentState;
    }

	public List<TebReply> getTebReplyList() {
		return tebReplyList;
	}

	public void setTebReplyList(List<TebReply> tebReplyList) {
		this.tebReplyList = tebReplyList;
	}

}