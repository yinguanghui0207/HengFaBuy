package com.xunqi.service;

import java.util.List;

import com.xunqi.pojo.CircleComment;
import com.xunqi.pojo.CircleMessage;
import com.xunqi.pojo.TebCollection;
import com.xunqi.pojo.TebPraise;
import com.xunqi.pojo.TebReply;
import com.xunqi.tool.ReturnResult;

public interface CircleService {
	/**
	 * 插入动态表信息
	 * @param circleMessage
	 * @return
	 */
	ReturnResult insertMassage(CircleMessage circleMessage);

	List<CircleMessage> findMassage(CircleMessage circleMessage);

	List<CircleMessage> findMassageByFollower(CircleMessage circleMessage,List<String> findFolloweringUseId);
	/**
	 * 增加浏览数
	 * @param id
	 */
	void updateMsgview(int id);
	/**
	 * 增加回复数
	 * @param id
	 */
	void updateMsgreply(int id);
	/**
	 * 增加点赞数
	 * @param id
	 */
	void updateMsgpraise(int id);
	/**
	 * 添加评论
	 * @param circleComment
	 * @return
	 */
	int insertComment(CircleComment circleComment);
	/**
	 * 添加回复
	 * @param tebReply
	 * @return
	 */
	int insertReply(TebReply tebReply);
	/**
	 * 添加点赞
	 * @param tebPraise
	 * @return
	 */
	int insertpraise(TebPraise tebPraise);
	/**
	 * 判断是否点赞
	 * @param tebPraise
	 * @return
	 */
	Boolean findIspraise(TebPraise tebPraise);
	/**
	 * 删除点赞
	 * @param tebPraise
	 * @return
	 */
	int deletepraise(TebPraise tebPraise);
	
	/**
	 * 查看动态点赞数
	 * @param circleMessage
	 * @return
	 */
	int findCountPraise(CircleMessage circleMessage);
	/**
	 * 查看评论的点赞数
	 * @param circleComment
	 * @return
	 */
	int findCommentCountPraise(CircleComment circleComment);
	/**
	 * 插入收藏数据
	 * @param tebCollection
	 * @return
	 */
	int insertTebCollection(TebCollection tebCollection);
	/**
	 * 查看是否收藏
	 * @param tebCollection
	 * @return
	 */
	Boolean findIsCollection(TebCollection tebCollection);
	/**
	 * 查看我的收藏
	 * @param tebCollection
	 * @return
	 */
	List<TebCollection> findCollection(TebCollection tebCollection);
	/**
	 * 查看动态详情
	 * @param circleMessage
	 * @return
	 */
	CircleMessage findMassageInfo(CircleMessage circleMessage);
	/**
	 * 根据 Ids 查询动态
	 * @param ids
	 * @param page
	 * @return
	 */
	List<CircleMessage> findByMsgIds(List<Integer> ids, int page);

}
