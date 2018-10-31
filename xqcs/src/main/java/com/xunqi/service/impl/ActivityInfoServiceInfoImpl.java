package com.xunqi.service.impl;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xunqi.mapper.ActivityInfoMapper;
import com.xunqi.pojo.ActivityInfo;
import com.xunqi.service.ActivityInfoService;

@Service
public class ActivityInfoServiceInfoImpl implements ActivityInfoService{
	@Autowired
	private ActivityInfoMapper activityInfoMapper;
	
	@Override
	public int insertSelective(ActivityInfo activityInfo) {
		
		activityInfo.setCreateTime(new Date());
		
		return activityInfoMapper.insertSelective(activityInfo);
	}
	@Override
	public ActivityInfo selectByActivityId(Integer activityId) {
	
		return activityInfoMapper.selectByActivityId(activityId);
	}

}
