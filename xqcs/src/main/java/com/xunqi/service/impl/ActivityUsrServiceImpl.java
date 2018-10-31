package com.xunqi.service.impl;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.xunqi.mapper.ActivityUsrMapper;
import com.xunqi.pojo.ActivityUsr;
import com.xunqi.service.ActivityUsrService;
import com.xunqi.tool.HttpClientConnectionManager;
import com.xunqi.tool.ReturnResult;
@Service
public class ActivityUsrServiceImpl implements ActivityUsrService{
	@Autowired
	private ActivityUsrMapper activityUsrMapper;
	@Override
	public ReturnResult insert(ActivityUsr activityUsr) {
		//生成useId
		/*Random ran = new Random();
		String useId = ""+System.currentTimeMillis() +ran.nextInt(10);
		activityUsr.setUseId(useId);
		activityUsr.setCreateTime(new Date());*/
		String appId ="wx8d167b0362172830";
    	String appsecret ="031576620752be50bc76479874791205";
    	//授权（必填）
        String grant_type = "authorization_code";
        String url = "https://api.weixin.qq.com/sns/jscode2session";
        String params = "appid=" + appId + "&secret=" + appsecret + "&js_code=" + activityUsr.getUseId() + "&grant_type=" + grant_type;
        String result = HttpClientConnectionManager.sendGet(url, params);
        JSONObject json = JSONObject.parseObject(result);
        String Openid =String.valueOf(json.get("openid"));
        if(Openid==null||Openid.isEmpty()||Openid.equals("null")){
        	return  ReturnResult.error("01","Openid未查找到");
        }
          activityUsr.setUseId(Openid);
         
          ActivityUsr selectByUseId = activityUsrMapper.selectByUseId(Openid);
			
  		if(selectByUseId!=null)
  			{
  			return  ReturnResult.success(1, activityUsr, "00", "用户已存在");
  		}
		
		activityUsrMapper.insertSelective(activityUsr);
		
		return ReturnResult.success(activityUsr);
	}
	@Override
	public int update(ActivityUsr activityUsr) {
		
		activityUsr.setUpdateTime(new Date());
		return activityUsrMapper.updateByPrimaryKeySelective(activityUsr);
	}
	@Override
	public ActivityUsr findByUseId(String useId) {
		
		return activityUsrMapper.selectByUseId(useId);
	}

}
