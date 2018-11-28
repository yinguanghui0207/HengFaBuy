package com.xunqi.service;

import java.util.List;

import com.xunqi.pojo.ActivityMerchant;

public interface MerchantService {
	/**
	 * 查询所有的商户
	 * @return
	 */
	List<ActivityMerchant> finfAllMerchant();
	/**
	 * 查询审核中的商户
	 * @return
	 */
	List<ActivityMerchant> findMerchantByState();
	/**
	 * 修改商户状态
	 * @param activityMerchant
	 * @return
	 */
	int updateState(ActivityMerchant activityMerchant);

}
