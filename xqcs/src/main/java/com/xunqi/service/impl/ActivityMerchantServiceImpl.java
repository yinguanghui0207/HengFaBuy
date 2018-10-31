package com.xunqi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xunqi.mapper.ActivityMerchantMapper;
import com.xunqi.pojo.ActivityMerchant;
import com.xunqi.service.ActivityMerchantService;
@Service
public class ActivityMerchantServiceImpl implements ActivityMerchantService{
	@Autowired
	private ActivityMerchantMapper activityMerchantMapper;
	@Override
	public ActivityMerchant findByActivityId(Integer activityId) {
		
		return activityMerchantMapper.selectByActivityId(activityId);
	}

}
