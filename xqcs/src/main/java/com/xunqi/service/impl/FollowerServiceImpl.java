package com.xunqi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xunqi.mapper.ActivityUsrMapper;
import com.xunqi.mapper.FollowerMapper;
import com.xunqi.pojo.ActivityUsr;
import com.xunqi.pojo.Follower;
import com.xunqi.pojo.FollowerExample;
import com.xunqi.service.FollowerService;
import com.xunqi.tool.ReturnResult;

@Service
public class FollowerServiceImpl implements FollowerService {
	@Autowired
	private FollowerMapper followerMapper;
	@Autowired
	private ActivityUsrMapper activityUsrMapper;
	@Override
	public ReturnResult insert(Follower follower) {
		//判断是否反向关注
		int findIsFollower = this.findIsFollower(follower);
		
		switch (findIsFollower) {
		case 0:
			followerMapper.insertSelective(follower);
			return ReturnResult.success(follower);
		case 1:
			return ReturnResult.error("01","已关注");
		case 2:
			return ReturnResult.error("01","已关注");
		case 3:
			Follower record = new Follower();
			record.setUseId(follower.getOperateObject());
			record.setOperateObject(follower.getUseId());
			record.setStatus(1);
			followerMapper.updateStateByUseId(record);
		case 4:
			return ReturnResult.error("01","已关注");

		default:
			return ReturnResult.error("01","可能由于网络波动，发生未知错误请重试");
		}
	}

	@Override
	public int findIsFollower(Follower follower) {
		
		FollowerExample followerExample = new FollowerExample();
		FollowerExample.Criteria criteria = followerExample.createCriteria();
		criteria.andUseIdEqualTo(follower.getUseId());
		criteria.andOperateObjectEqualTo(follower.getOperateObject());
		List<Follower> selectByExample = followerMapper.selectByExample(followerExample);
		
		//反向查询
		FollowerExample followerExample2 = new FollowerExample();
		FollowerExample.Criteria criteria2 = followerExample2.createCriteria();
		criteria2.andUseIdEqualTo(follower.getOperateObject());
		criteria2.andOperateObjectEqualTo(follower.getUseId());
		List<Follower> selectByExample2 = followerMapper.selectByExample(followerExample2);
		if(selectByExample.isEmpty()){
			
			if(selectByExample2.isEmpty()){
				return 0;//互不关注
			}else{
				if(0 == selectByExample2.get(0).getStatus()){
					return 3; //反向关注
				}else{
					
					return 4;//反向互相关注
				}
			}
		}else{
			if(0 == selectByExample.get(0).getStatus()){
				return 1; //正向关注
			}else{
				
				return 2;//正向互相关注
			}
			
		} 
	}

	@Override
	public ReturnResult update(Follower follower) {
		int findIsFollower = this.findIsFollower(follower);		
		FollowerExample followerExample = new FollowerExample();
		FollowerExample.Criteria criteria = followerExample.createCriteria();
		switch (findIsFollower) {
		case 0:
			return ReturnResult.error("01","用户未关注");
		case 1:
			criteria.andUseIdEqualTo(follower.getUseId());
			criteria.andOperateObjectEqualTo(follower.getOperateObject());
			 followerMapper.deleteByExample(followerExample);
			 return ReturnResult.success();			
		case 2:
			follower.setStatus(0);
			followerMapper.updateStateByUseId(follower);
			
		case 3:
			return ReturnResult.error("01","用户未关注");
		case 4:
			criteria.andUseIdEqualTo(follower.getOperateObject());
			criteria.andOperateObjectEqualTo(follower.getUseId());
			Follower record = new Follower();
			record.setUseId(follower.getUseId());
			record.setOperateObject(follower.getOperateObject());
			record.setStatus(0);
			
			followerMapper.updateByExampleSelective(record, followerExample);
			return ReturnResult.success();
		default:
			return ReturnResult.error("01","可能由于网络波动，发生未知错误请重试");
		}
	
	}

	@Override
	public List<ActivityUsr> findFollowering(Follower follower) {
		FollowerExample followerExample = new FollowerExample();
		FollowerExample.Criteria criteria = followerExample.createCriteria();
		criteria.andUseIdEqualTo(follower.getUseId()); 
		List<Follower> selectByExample = followerMapper.selectByExample(followerExample);
		
		List<String> list2 = new ArrayList<String>();
		for (Follower follower2 : selectByExample) {
			list2.add(follower2.getOperateObject());
		}
	
		FollowerExample followerExample1 = new FollowerExample();
		FollowerExample.Criteria criteria1 = followerExample1.createCriteria();
		criteria1.andOperateObjectEqualTo(follower.getUseId()); 
		criteria1.andStatusEqualTo(1);
		List<Follower> selectByExample2 = followerMapper.selectByExample(followerExample1);
		for (Follower follower2 : selectByExample2) {
			
			list2.add(follower2.getUseId());
		}
		List<ActivityUsr> selectByUserIdList = new ArrayList<ActivityUsr>();
		if(0 == list2.size()){
			return  selectByUserIdList;
		}
		 selectByUserIdList = activityUsrMapper.selectByUserIdList(list2);
		return selectByUserIdList;
	}

	@Override
	public List<ActivityUsr> findFollowered(Follower follower) {
		List<Follower> findFollowerEach = this.findFollowerEach(follower);
		//优化互相关注
//		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		for (Follower follower2 : findFollowerEach) {
			list2.add(follower2.getOperateObject());
		}
		
		/*List<ActivityUsr> selectByUserIdList1 = new ArrayList<ActivityUsr>();
		if(0 == list1.size()){
			selectByUserIdList1 = null;
		}
		selectByUserIdList1 = activityUsrMapper.selectByUserIdList(list1);*/
		
		FollowerExample followerExample = new FollowerExample();
		FollowerExample.Criteria criteria = followerExample.createCriteria();
		criteria.andOperateObjectEqualTo(follower.getUseId());  
		criteria.andStatusEqualTo(0);
		List<Follower> selectByExample = followerMapper.selectByExample(followerExample);
		for (Follower follower2 : selectByExample) {
			list2.add(follower2.getUseId());
		}
		List<ActivityUsr> selectByUserIdList = new ArrayList<ActivityUsr>();
		
		if(0 == list2.size()){
			return  selectByUserIdList;
		}
		 selectByUserIdList = activityUsrMapper.selectByUserIdList(list2);
		return selectByUserIdList;
	}

	@Override
	public List<Follower> findFollowerEach(Follower follower) {
		FollowerExample followerExample = new FollowerExample();
		FollowerExample.Criteria criteria = followerExample.createCriteria();
		criteria.andUseIdEqualTo(follower.getUseId()); 
		criteria.andStatusEqualTo(1);
		List<Follower> selectByExample = followerMapper.selectByExample(followerExample);
		FollowerExample followerExample1 = new FollowerExample();
		FollowerExample.Criteria criteria1 = followerExample1.createCriteria();
		criteria1.andOperateObjectEqualTo(follower.getUseId()); 
		criteria1.andStatusEqualTo(1);
		List<Follower> selectByExample2 = followerMapper.selectByExample(followerExample1);
		for (Follower follower2 : selectByExample2) {
			Follower follower3 = new Follower();
			follower3.setId(follower2.getId());
			follower3.setUseId(follower2.getOperateObject());
			follower3.setOperateObject(follower2.getUseId());
			follower3.setStatus(follower2.getStatus());
			selectByExample.add(follower3);
		}
		
		return selectByExample;
	}

	@Override
	public  List<String> findFolloweringUseId(Follower follower) {
		
		FollowerExample followerExample = new FollowerExample();
		FollowerExample.Criteria criteria = followerExample.createCriteria();
		criteria.andOperateObjectEqualTo(follower.getUseId());   

		List<Follower> selectByExample = followerMapper.selectByExample(followerExample);
		
		List<String> list2 = new ArrayList<String>();
		for (Follower follower2 : selectByExample) {
			list2.add(follower2.getUseId());
		}
	
		FollowerExample followerExample1 = new FollowerExample();
		FollowerExample.Criteria criteria1 = followerExample1.createCriteria();
		criteria1.andUseIdEqualTo(follower.getUseId()); 
		criteria1.andStatusEqualTo(1);
		List<Follower> selectByExample2 = followerMapper.selectByExample(followerExample1);
		for (Follower follower2 : selectByExample2) {			
			list2.add(follower2.getOperateObject());
		}
		
		
		return list2;
		
	}
		
}
