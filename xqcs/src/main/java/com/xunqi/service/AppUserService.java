package com.xunqi.service;

import java.util.List;

import com.xunqi.pojo.ActivityUsr;

public interface AppUserService {
	/**
	 * 查询所有用户
	 * @return
	 */
	List<ActivityUsr> findAllUser();

}
