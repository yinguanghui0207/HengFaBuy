package com.xunqi.mapper;

import java.util.List;


import com.xunqi.pojo.ActivityList;

public interface ActivityListMapper {
 
	List<ActivityList> findAll();
	
	int insertSelective(ActivityList record);
	 
	int deleteByPrimaryKey(Integer id);
	
	List<ActivityList> findByAddress(String address);
	
	List<ActivityList> findByKeyword(ActivityList activityList);
}