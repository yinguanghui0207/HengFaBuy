package com.xunqi.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xunqi.mapper.ActivityMerchantMapper;
import com.xunqi.mapper.ActivityUsrMapper;
import com.xunqi.pojo.ActivityMerchant;
import com.xunqi.pojo.ActivityUsr;
import com.xunqi.service.MerchantService;
@Service
public class MerchantServiceImpl implements MerchantService {
	@Autowired
	private ActivityMerchantMapper activityMerchantMapper;
	@Autowired
	private ActivityUsrMapper activityUsrMapper;
	
	@Override
	public List<ActivityMerchant> finfAllMerchant() {
		List<ActivityMerchant> selectByExample = activityMerchantMapper.selectByExample(null);
		for (ActivityMerchant a:selectByExample ) {			
			List<ActivityUsr> selectPhone = activityUsrMapper.selectPhone(a.getMerchantName());
			a.setActivityList(selectPhone);		
		}				
		return selectByExample;		
	}

	@Override
	public List<ActivityMerchant> findMerchantByState() {
		int state = 1;
		return activityMerchantMapper.selectByState(state);
		 
	}

	@Override
	public int updateState(ActivityMerchant activityMerchant) {
		
		activityMerchant.setUpdateTime(new Date());
		activityMerchant.setAuthTime(new Date());
		
		return activityMerchantMapper.updateByPrimaryKeySelective(activityMerchant);
	}

}
