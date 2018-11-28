package com.xunqi.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xunqi.mapper.ActivityUsrMapper;
import com.xunqi.mapper.UserAuthMapper;
import com.xunqi.pojo.ActivityUsr;
import com.xunqi.pojo.UserAuth;
import com.xunqi.service.UserAuthService;
@Service
public class UserAuthServiceImpl implements UserAuthService {
	@Autowired
	private UserAuthMapper userAuthMapper;
	@Autowired
	private ActivityUsrMapper activityUsrMapper;
	@Override
	public List<UserAuth> findReviewUser() {
		int authState = 1;
		List<UserAuth> selectByAuthState = userAuthMapper.selectByAuthState(authState);
		for(UserAuth u:selectByAuthState){
			ActivityUsr selectByUseId = activityUsrMapper.selectByUseId(u.getUserId());
			u.setPhone(selectByUseId.getPhone());
			u.setPortrait(selectByUseId.getPortrait());
			 
		}
		
		return selectByAuthState;
	}
	@Override
	public int updateState(UserAuth userAuth) {
		userAuth.setUpdateTime(new Date());
		return userAuthMapper.updateByPrimaryKeySelective(userAuth);
	}

}
