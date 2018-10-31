package com.xunqi.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.xunqi.mapper.XqActivityMapper;

import com.xunqi.pojo.XqActivity;
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

}
