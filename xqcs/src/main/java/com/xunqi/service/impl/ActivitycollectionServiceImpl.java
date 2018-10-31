package com.xunqi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xunqi.mapper.ActivityCollectionMapper;
import com.xunqi.mapper.XqActivityMapper;
import com.xunqi.pojo.ActivityCollection;
import com.xunqi.pojo.XqActivity;
import com.xunqi.service.ActivitycollectionService;

@Service
public class ActivitycollectionServiceImpl implements ActivitycollectionService{
	@Autowired
	private ActivityCollectionMapper activityCollectionMapper;
	@Autowired
	private XqActivityMapper xqActivityMapper;
	@Override
	public int insert(ActivityCollection activityCollection) {
		
		return activityCollectionMapper.insertSelective(activityCollection);
		 
	}

	@Override
	public int selectByActivityId(ActivityCollection activityCollection) {
		int total =0 ;
		List<ActivityCollection> list  = activityCollectionMapper.selectByActivityId(activityCollection.getActivityId());
		for (ActivityCollection a:list) {
			if(a.getUseId().equals(activityCollection.getUseId())){
				return total =1;
			}
		}
		return total;	
	}

	@Override
	public List<XqActivity> findActivityCollectionByUserId(String useId) {
		List<ActivityCollection> list  = activityCollectionMapper.selectByUserId(useId);
		if(list.isEmpty()){
			return null;
		}
		List<Integer> activityIdList = new ArrayList<Integer>();
		for(ActivityCollection a: list){
			activityIdList.add(a.getActivityId());
			
		}
		List<XqActivity> selectByActivityIdList = xqActivityMapper.selectByActivityIdList(activityIdList);
		return selectByActivityIdList;
	}
	
	
}
