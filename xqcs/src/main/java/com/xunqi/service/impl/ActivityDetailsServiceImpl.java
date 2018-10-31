package com.xunqi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xunqi.mapper.ActivityDetailsMapper;
import com.xunqi.pojo.ActivityDetails;
import com.xunqi.service.ActivityDetailsService;
@Service
public class ActivityDetailsServiceImpl implements ActivityDetailsService{
	@Autowired
	private ActivityDetailsMapper activityDetailsMapper;
	@Override
	public List<ActivityDetails> findByActivityId(Integer activityId) {
		
		
		return activityDetailsMapper.selectByActivityId(activityId);


	}
	@Override
	public int insertDetails(List<ActivityDetails> ActivityDetailsList) {
		int total = 0;
		for (ActivityDetails activityDetails:ActivityDetailsList) {
			total = total+activityDetailsMapper.insertSelective(activityDetails);
		}
		return total;
	}

}
