package com.xunqi.service;

import com.xunqi.pojo.ActivityUsr;
import com.xunqi.tool.ReturnResult;

public interface ActivityUsrService {
	/**
	 * 存入用户信息
	 * @param activityUsr
	 * @return
	 */
	ReturnResult insert(ActivityUsr activityUsr);
	/**
	 * 修改用户信息
	 * @param activityUsr
	 * @return
	 */
	int update(ActivityUsr activityUsr);
	/**
	 * 根据用户Id查询用户信息
	 * @param publisher
	 * @return
	 */
	ActivityUsr findByUseId(String useId);	

}
