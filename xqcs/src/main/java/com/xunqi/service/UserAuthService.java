package com.xunqi.service;

import java.util.List;
import com.xunqi.pojo.UserAuth;
public interface UserAuthService {
	/**
	 * 查询需审核的用户
	 * @return
	 */
	List<UserAuth> findReviewUser();
	/**
	 * 审核结果录入
	 * @param userAuth
	 * @return
	 */
	int updateState(UserAuth userAuth);

}
