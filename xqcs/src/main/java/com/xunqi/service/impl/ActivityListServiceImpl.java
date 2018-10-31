package com.xunqi.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xunqi.mapper.ActivityListMapper;
import com.xunqi.pojo.ActivityList;
import com.xunqi.service.ActivityListService;

@Service
public class ActivityListServiceImpl implements ActivityListService{
	
	@Autowired
	private ActivityListMapper activityListMapper;

	@Override
	public List<ActivityList> findAll() {
		
		return activityListMapper.findAll();
	}

	@Override
	public int insertSelective( ActivityList activityList) {
		
		activityList.setCreateTime(new Date());
//	状态：审核中	
		activityList.setState(00);
		return activityListMapper.insertSelective(activityList);
	}

	@Override
	public List<ActivityList> findByAddres(String address) {
		
		return activityListMapper.findByAddress(address);
	}

	@Override
	public List<ActivityList> findByKeyword(ActivityList activityList) {
		
		 List<ActivityList> a = activityListMapper.findByKeyword(activityList);
		 return a;
	}
	

	
}
