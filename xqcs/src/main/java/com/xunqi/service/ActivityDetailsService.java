package com.xunqi.service;

import java.util.List;

import com.xunqi.pojo.ActivityDetails;

public interface ActivityDetailsService {
	
	List<ActivityDetails> findByActivityId(Integer activityId);

	
	int insertDetails(List<ActivityDetails> ActivityDetailsList);
	

}
