package com.xunqi.service;

import java.util.List;

import com.xunqi.pojo.SystemUser;

public interface UserService {
	/**
	 * 添加用户
	 * @param systemUser
	 * @return
	 */
	SystemUser insertUser(SystemUser systemUser);
	/**
	 * 根据账号和密码查询用户
	 * @param systemUser
	 * @return
	 */
	SystemUser findUserByAP(SystemUser systemUser);
	/**
	 * 根据账号修改用户
	 * @param systemUser
	 * @return
	 */
	int updateByAccount(SystemUser systemUser);
	/**
	 * 查看是否有此账号
	 * @param account
	 * @return
	 */
	Integer findUserByAccount(String account);
	/**
	 * 修改用户权限
	 * @param account
	 * @return
	 */
	int updateAuthorityByAccount(SystemUser systemUser);
	/**
	 * 修改用户状态
	 * @param systemUser
	 * @return
	 */
	int updateStateByAccount(SystemUser systemUser);
	/**
	 * 按照停用启用排练系统用户
	 * @return
	 */
	List<SystemUser> findAllUser();
	
}
