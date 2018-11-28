package com.xunqi.service;

import com.xunqi.pojo.ActivityUsr;
import com.xunqi.pojo.UserIdentity;

public interface UserIdentityService {
	/**
	 * 根据 识别标识和授权凭证验证用户是否存在
	 * @param userIdentity
	 * @return
	 */
	UserIdentity findUserIdentity(UserIdentity userIdentity);
	/**
	 * 新建用户
	 * @param userIdentity
	 * @return
	 */
	ActivityUsr insertUserIdentity(UserIdentity userIdentity);
	/**
	 * 微信绑定
	 * @param userIdentity
	 */
	UserIdentity updateWXNext(UserIdentity userIdentity);
	/**
	 * 修改手机号
	 * @param userIdentity 
	 * @return
	 */
	int updatePhone(UserIdentity userIdentity);

}
