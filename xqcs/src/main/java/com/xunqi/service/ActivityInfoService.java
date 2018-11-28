package com.xunqi.service;

import com.xunqi.pojo.ActivityInfo;

public interface ActivityInfoService {
	
	/**
	 * 插入详情信息
	 * @param activityList
	 * @return
	 */
	
	int insertSelective(ActivityInfo activityInfo);
	
	/**
	 * 根据活动Id查询详情信息
	 * @param activityId
	 * @return
	 */
	ActivityInfo selectByActivityId(Integer activityId);
	
	

}
