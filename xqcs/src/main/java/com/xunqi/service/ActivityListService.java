package com.xunqi.service;

import java.util.List;

import com.xunqi.pojo.ActivityList;

public interface ActivityListService {
	
	public List<ActivityList> findAll() ;
	
	public int insertSelective( ActivityList activityList);
	
	public List<ActivityList> findByAddres(String address) ;
	
	public List<ActivityList> findByKeyword(ActivityList activityList); 
	
	 
	
}
