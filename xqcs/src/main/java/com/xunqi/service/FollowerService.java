package com.xunqi.service;

import java.util.List;

import com.xunqi.pojo.ActivityUsr;
import com.xunqi.pojo.Follower;
import com.xunqi.tool.ReturnResult;

public interface FollowerService {

	ReturnResult insert(Follower follower);

	int findIsFollower(Follower follower);

	ReturnResult update(Follower follower);
	/**
	 * 查询粉丝
	 * @param follower
	 * @return
	 */
	List<ActivityUsr> findFollowering(Follower follower);
	/**
	 * 查询我的关注
	 * @param follower
	 * @return
	 */
	List<ActivityUsr> findFollowered(Follower follower);
	/**
	 * 查询和用户互相关注
	 * @param follower
	 * @return
	 */
	List<Follower> findFollowerEach(Follower follower);
	/**
	 * 查询所有粉丝use_id
	 * @param follower
	 * @return
	 */
	List<String> findFolloweringUseId(Follower follower);
	
}
