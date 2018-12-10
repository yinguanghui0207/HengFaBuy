package com.xunqi.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xunqi.mapper.ActivityUsrMapper;
import com.xunqi.mapper.UserIdentityMapper;
import com.xunqi.pojo.ActivityUsr;
import com.xunqi.pojo.UserIdentity;
import com.xunqi.pojo.UserIdentityExample;
import com.xunqi.service.UserIdentityService;
import com.xunqi.tool.MD5;
@Service
public class UserIdentityServiceImpl implements UserIdentityService {	
	@Autowired
	private UserIdentityMapper userIdentityMapper;
	@Autowired
	private ActivityUsrMapper activityUsrMapper;
	@Override
	public UserIdentity findUserIdentity(UserIdentity userIdentity) {
		UserIdentityExample userIdentityExample = new UserIdentityExample();
		UserIdentityExample.Criteria criteria = userIdentityExample.createCriteria();
		
		if("WX".equals(userIdentity.getIdentityType())){
			criteria.andCredentialEqualTo(userIdentity.getCredential());
		}else{
			criteria.andIdentifierEqualTo(userIdentity.getIdentifier());
		}		
		List<UserIdentity> selectByExample = userIdentityMapper.selectByExample(userIdentityExample);
		if(selectByExample.size()==0){
			return null;
		}
		return selectByExample.get(0);
	}
	@Override
	public ActivityUsr insertUserIdentity(UserIdentity userIdentity) {
		//生成useId
				Random ran = new Random();
				String useId = ""+System.currentTimeMillis() +ran.nextInt(100);
				userIdentity.setUseId(useId);
			
				ActivityUsr activityUsr = new ActivityUsr();
				
				if(null == userIdentity.getInfo()){
			//	userIdentity.setCredential(null);
			}else{
			//	userIdentity.setCredential(userIdentity.getJson().get("openid").toString());
			//	userIdentity.setCredential(userIdentity.getInfo().get("unionid").toString());
			/*	JSONObject userJson = WXUtil.GetWXUser(userIdentity.getJson().get("openid").toString(), userIdentity.getJson().get("access_token").toString());
				activityUsr.setNickname(userJson.get("nickname").toString());
				activityUsr.setPortrait(userJson.get("headimgurl").toString());*/
				activityUsr.setIsWx(1);
				activityUsr.setNickname(userIdentity.getInfo().get("nickname").toString());
				activityUsr.setPortrait(userIdentity.getInfo().get("headimgurl").toString());
			}
		userIdentityMapper.insertSelective(userIdentity);
		
		
		/*if(userIdentity.getNickname() != null){
			activityUsr.setNickname(userIdentity.getNickname());
		}*/
		if(null != userIdentity.getPassword()){			
			activityUsr.setPassword(MD5.getMd5HashPasswod(userIdentity.getPassword()));
			activityUsr.setNickname(userIdentity.getNickname());
		}
		
		activityUsr.setUseId(useId);
		activityUsr.setPhone(userIdentity.getIdentifier());		
		activityUsr.setCreateTime(new Date());
		activityUsrMapper.insertSelective(activityUsr);
		
		
		return activityUsr;
	}
	@Override
	public UserIdentity updateWXNext(UserIdentity userIdentity) {
		UserIdentityExample userIdentityExample = new UserIdentityExample();
		UserIdentityExample.Criteria criteria = userIdentityExample.createCriteria();
		criteria.andIdentifierEqualTo(userIdentity.getIdentifier());		
		UserIdentity userIdentity2 = new UserIdentity();
		userIdentity2.setCredential(userIdentity.getInfo().get("unionid").toString());
		userIdentityMapper.updateByExampleSelective(userIdentity2, userIdentityExample);
		
		ActivityUsr activityUsr = new ActivityUsr();
		activityUsr.setUseId(userIdentity.getUseId());
		activityUsr.setIsWx(1);
		activityUsrMapper.updateByUseIdSelective(activityUsr);
		userIdentity.setCredential(userIdentity.getInfo().get("unionid").toString());
		return userIdentity;
	}
	@Override
	public int updatePhone(UserIdentity userIdentity) {
		ActivityUsr activityUsr = new ActivityUsr();
		activityUsr.setUseId(userIdentity.getUseId());
		activityUsr.setPhone(userIdentity.getIdentifier());
		activityUsr.setUpdateTime(new Date());
		
		 activityUsrMapper.updateByUseIdSelective(activityUsr);
		 UserIdentityExample userIdentityExample = new UserIdentityExample();
			UserIdentityExample.Criteria criteria = userIdentityExample.createCriteria();
			criteria.andUseIdEqualTo(userIdentity.getUseId());		
		 userIdentityMapper.updateByExampleSelective(userIdentity, userIdentityExample);
		
		return 0;
	
		
	}

}
