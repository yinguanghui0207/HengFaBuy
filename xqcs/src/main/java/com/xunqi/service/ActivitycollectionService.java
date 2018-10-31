package com.xunqi.service;


import java.util.List;

import com.xunqi.pojo.ActivityCollection;
import com.xunqi.pojo.XqActivity;


public interface ActivitycollectionService {

	int insert(ActivityCollection activityCollection);

	int selectByActivityId(ActivityCollection activityCollection);

	List<XqActivity> findActivityCollectionByUserId(String useId);

}
