package com.xunqi.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xunqi.mapper.SystemUserMapper;
import com.xunqi.pojo.SystemUser;
import com.xunqi.service.UserService;
import com.xunqi.tool.MD5;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private SystemUserMapper systemUserMapper;
	
	@Override
	public SystemUser insertUser(SystemUser systemUser){
		systemUser.setCreateTime(new Date());
		String md5Encode = MD5.MD5Encode(systemUser.getPassword());
		systemUser.setPassword(md5Encode);
			systemUserMapper.insertSelective(systemUser);
			return systemUser;
	}

	@Override
	public SystemUser findUserByAP(SystemUser systemUser) {
		String md5Encode = MD5.MD5Encode(systemUser.getPassword());
		systemUser.setPassword(md5Encode);
		return systemUserMapper.selectByAP(systemUser);
	}

	@Override
	public int updateByAccount(SystemUser systemUser) {
		systemUser.setUpdateTime(new Date());
		String md5Encode = MD5.MD5Encode(systemUser.getPassword());
		systemUser.setPassword(md5Encode);
		return systemUserMapper.updatePasswordByAccount(systemUser);
	}

	@Override
	public Integer findUserByAccount(String account) {
		
		return systemUserMapper.findoneSystemUser(account);
	}

	@Override
	public int updateAuthorityByAccount(SystemUser systemUser) {
		
		systemUser.setUpdateTime(new Date());
		
		return systemUserMapper.updatePasswordByAccount(systemUser);
	}

	@Override
	public int updateStateByAccount(SystemUser systemUser) {
		systemUser.setUpdateTime(new Date());
		
		return systemUserMapper.updateState(systemUser);
	}

	@Override
	public List<SystemUser> findAllUser() {
		return systemUserMapper.selectAllUser();
		
	}
	
	

}
