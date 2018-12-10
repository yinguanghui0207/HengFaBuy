package com.xunqi.service.impl;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.xunqi.mapper.XqActivityMapper;

import com.xunqi.pojo.XqActivity;
import com.xunqi.pojo.XqActivityExample;
import com.xunqi.service.XqActivityService;
@Service
public class XqActivityServiceImpl implements XqActivityService{	
	@Autowired
	private XqActivityMapper xqActivityMapper; 
	

	@Override
	public List<XqActivity> findAll() {
		

		
		return xqActivityMapper.findAll();
	}

	@Override
	public List<XqActivity> findByAddres(String address) {
		
		return xqActivityMapper.findByAddress(address);
	}

	@Override
	public List<XqActivity> findByKeyword(XqActivity xqActivity) {
		
		return xqActivityMapper.findByKeyword(xqActivity);
	}

	@Override
	public List<XqActivity> findActivityByPS(XqActivity xqActivity) {
		return xqActivityMapper.findByPs(xqActivity);
		 
	}

	@Override
	public XqActivity findByActivityId(Integer activityId) {
		
		return xqActivityMapper.selectByActivityId(activityId);
		
	}

	@Override
	public int updateActivityState(XqActivity xqActivity) {
		xqActivity.setUpdateTime(new Date());
		
		return xqActivityMapper.updateActivityState(xqActivity);
	}

	@Override
	public List<XqActivity> findActivityListByRange(XqActivity xqActivity) {
		XqActivityExample xqActivityExample = new XqActivityExample();
		XqActivityExample.Criteria criteria= xqActivityExample.createCriteria();
		xqActivityExample.setPageNum(xqActivity.getPage());
		xqActivityExample.setPageSize(8);
		criteria.andStateBetween(1, 2);
		xqActivityExample.setOrderByClause("create_time");

		return xqActivityMapper.findByRange(xqActivity,xqActivityExample);
	}

	@Override
	public List<XqActivity> findActivityListByType(XqActivity xqActivity) {
		XqActivityExample xqActivityExample = new XqActivityExample();
		XqActivityExample.Criteria criteria= xqActivityExample.createCriteria();
		xqActivityExample.setPageNum(xqActivity.getPage());
		xqActivityExample.setPageSize(8);
		criteria.andActivityTypeEqualTo(xqActivity.getActivityType());
		criteria.andStateBetween(1, 2);
		switch (xqActivity.getId()) {
		case 1:
			//综合排序
			xqActivityExample.setOrderByClause("create_time");
			return	xqActivityMapper.selectByExample(xqActivityExample);
		case 2:
			//最新发布
			xqActivityExample.setOrderByClause("start_time desc");
			return	xqActivityMapper.selectByExample(xqActivityExample);
		case 3:
			//距离最近
			return xqActivityMapper.findActivitySearch4(xqActivity,xqActivityExample);
		case 4:
			// 热门点击			
			return	xqActivityMapper.findActivitySearch3(xqActivity,xqActivityExample);
		case 5:
			//最多参与
			xqActivityExample.setOrderByClause("applicants_num");
			return	xqActivityMapper.selectByExample(xqActivityExample);
		case 6:
			//综合排序 全价格
			xqActivityExample.setOrderByClause("start_time desc");
			return	xqActivityMapper.selectByExample(xqActivityExample);
		case 7:
			//免费
			xqActivityExample.setOrderByClause("start_time desc");
			criteria.andPriceEqualTo("0.00");
			return	xqActivityMapper.selectByExample(xqActivityExample);
		case 8:
			//收费
			return	xqActivityMapper.findActivityMoney(xqActivity, xqActivityExample);
		case 9:
			//今天
			return xqActivityMapper.findActivityTime(xqActivity, xqActivityExample);
		case 10:
			//明天
			return xqActivityMapper.findActivityTime(xqActivity, xqActivityExample);
		case 11:
			//近七天
			return xqActivityMapper.findActivityTime(xqActivity, xqActivityExample);
		case 12:
			//近一个月
			return xqActivityMapper.findActivityTime(xqActivity, xqActivityExample);			
		default:
			return null;
		}
	}
	
	@Override
	public List<XqActivity> findActivityListByLevel(XqActivity xqActivity) {
		XqActivityExample xqActivityExample = new XqActivityExample();
		XqActivityExample.Criteria criteria= xqActivityExample.createCriteria();
		xqActivityExample.setPageNum(1);
		xqActivityExample.setPageSize(8);
		xqActivityExample.setOrderByClause("create_time");
		criteria.andActivityLevelEqualTo(xqActivity.getActivityLevel());
		
		return xqActivityMapper.selectByExample(xqActivityExample);
	}

	@Override
	public List<XqActivity> ActivityListAll(XqActivity xqActivity) {
		XqActivityExample xqActivityExample = new XqActivityExample();
		XqActivityExample.Criteria criteria= xqActivityExample.createCriteria();
		xqActivityExample.setPageNum(xqActivity.getPage());
		xqActivityExample.setPageSize(8);
		xqActivityExample.setOrderByClause("create_time");
		criteria.andStateBetween(1, 2);
		return xqActivityMapper.selectByExample(xqActivityExample); 
	}

	@Override
	public List<XqActivity> ActivitySearch(XqActivity xqActivity) {
		XqActivityExample xqActivityExample = new XqActivityExample();
//		XqActivityExample.Criteria criteria= xqActivityExample.createCriteria();
		xqActivityExample.setPageNum(xqActivity.getPage());
		xqActivityExample.setPageSize(8);
		if(xqActivity.getId()==1|| xqActivity.getId()==2){			
			//综合排序 最新排序
			return xqActivityMapper.findActivitySearch1(xqActivity,xqActivityExample);			
		}else if(xqActivity.getId()==4){
			//最近排序
			return xqActivityMapper.findActivitySearch4(xqActivity,xqActivityExample);
		}else if(xqActivity.getId()==3){
			//最热排序
			return	xqActivityMapper.findActivitySearch3(xqActivity,xqActivityExample);
		}
		return xqActivityMapper.findActivitySearch1(xqActivity,xqActivityExample);
	}

	@Override
	public List<XqActivity> findByActivityIds(List<Integer> ids,int page) {
		XqActivityExample xqActivityExample = new XqActivityExample();
		xqActivityExample.setPageNum(page);
		xqActivityExample.setPageSize(8);
		return xqActivityMapper.findByActivityIds(ids,xqActivityExample);
	}

}
