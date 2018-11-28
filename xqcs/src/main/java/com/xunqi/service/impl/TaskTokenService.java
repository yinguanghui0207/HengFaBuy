package com.xunqi.service.impl;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSONObject;
import com.xunqi.mapper.TokenMapper;
import com.xunqi.mapper.UseOrderMapper;
import com.xunqi.mapper.XqActivityMapper;
import com.xunqi.pojo.Token;
import com.xunqi.tool.HttpClientConnectionManager;
@Service
public class TaskTokenService {	
	@Autowired
	private XqActivityMapper xqActivityMapper; 
	@Autowired
	private TokenMapper tokenMapper;
	@Autowired
	private UseOrderMapper useOrderMapper;
	@Scheduled(cron="0 */60 * * * ?")
//	@Scheduled(cron="0 0/1 * * * ?")
	public  void updateTeskToken(){
		try {
			String appId ="wx8d167b0362172830";
	    	String appsecret ="031576620752be50bc76479874791205";
	        String url = "https://api.weixin.qq.com/cgi-bin/token";
	        String param ="grant_type=client_credential&appid=APPID&secret=APPSECRET";
	        param = param.replace("APPID", appId).replace("APPSECRET", appsecret);
	        String result = HttpClientConnectionManager.sendGet(url, param);
	        JSONObject json = JSONObject.parseObject(result);
	        String access_token = json.get("access_token").toString();
	        Token token = new Token();
	        token.setToken(access_token);
	        token.setUpdateTime(new Date());
	        tokenMapper.updateByPrimaryKey(token);
	    	System.out.println(access_token);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	@Scheduled(cron="0 */60 * * * ?")
//	@Scheduled(cron="0 0/1 * * * ?")
//	@Scheduled(cron="0 0/60 8-23 * * ?")
	
	public  void updateActivityState(){	
		
		int updateTaskOrderState = useOrderMapper.updateTaskOrderState();
		int updateTaskState2 = useOrderMapper.updateTaskState();
		int updateTaskState = xqActivityMapper.updateTaskState();
		System.out.println("xqActivity表更改了"+updateTaskState+"条数据\n"+"订单表更改了"+updateTaskOrderState+"条数据为完成状态\n"+"订单表更改了"+updateTaskState2+"条数据为进行中状态");
		
	}
	
	
}
