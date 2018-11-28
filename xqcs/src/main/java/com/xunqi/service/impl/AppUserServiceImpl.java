package com.xunqi.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xunqi.mapper.ActivityUsrMapper;
import com.xunqi.pojo.ActivityUsr;
import com.xunqi.service.AppUserService;

@Service
public class AppUserServiceImpl implements AppUserService{
	@Autowired
	private ActivityUsrMapper activityUsrMapper;	
	@Override
	public List<ActivityUsr> findAllUser() {		
		return activityUsrMapper.selectByExample(null);		
	}
}
