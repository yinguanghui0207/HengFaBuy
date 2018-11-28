package com.xunqi.tool;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;

public class WXUtil {
	
	public static String GetUserOpenid(String code){			
	
		String appId ="wx8d167b0362172830";	
		String appsecret ="031576620752be50bc76479874791205";
	//授权（必填）
		String grant_type = "authorization_code";    
		String url = "https://api.weixin.qq.com/sns/jscode2session";    
		String params = "appid=" + appId + "&secret=" + appsecret + "&js_code=" + code + "&grant_type=" + grant_type;    
		String result = HttpClientConnectionManager.sendGet(url, params);    
		JSONObject json = JSONObject.parseObject(result); 
		String Openid =String.valueOf(json.get("openid"));    
		return  Openid;
	}
	
	public  static String getTeskToken(){
		String appId ="wx8d167b0362172830";
    	String appsecret ="031576620752be50bc76479874791205";
        String url = "https://api.weixin.qq.com/cgi-bin/token";
        String param ="grant_type=client_credential&appid=APPID&secret=APPSECRET";
        param = param.replace("APPID", appId).replace("APPSECRET", appsecret);
        String result = HttpClientConnectionManager.sendGet(url, param);
        JSONObject json = JSONObject.parseObject(result);
        String access_token = json.get("access_token").toString();
    	return access_token;
	}
	
	public static String UtilGetUserOpenid(String appId,String appsecret,String code){					
	//授权（必填）
		String grant_type = "authorization_code";    
		String url = "https://api.weixin.qq.com/sns/jscode2session";    
		String params = "appid=" + appId + "&secret=" + appsecret + "&js_code=" + code + "&grant_type=" + grant_type;    
		String result = HttpClientConnectionManager.sendGet(url, params);    
		JSONObject json = JSONObject.parseObject(result); 
		String Openid =String.valueOf(json.get("openid"));    
		return  Openid;
	}
	/**
	 * 授权 token
	 * @param appId
	 * @param appsecret
	 * @param code
	 * @return
	 */
	public  static JSONObject UtilgetTeskToken(String appId,String appsecret,String code){
		
        String url = "https://api.weixin.qq.com/sns/oauth2/access_token";
        String param ="appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code";
        param = param.replace("APPID", appId).replace("SECRET", appsecret).replace("CODE", code);
        String result = HttpClientConnectionManager.sendGet(url, param);
        JSONObject json = JSONObject.parseObject(result);
      /*  String access_token = json.get("access_token").toString();
        String openid = json.get("openid").toString();*/
        
    	return json;
	}
	
	
public  static JSONObject GetWXUser(String openid,String access_token){
		
        String url = "https://api.weixin.qq.com/sns/userinfo";
        String param ="access_token=ACCESS_TOKEN&openid=OPENID";
        param = param.replace("ACCESS_TOKEN", access_token).replace("OPENID", openid);
        String result = HttpClientConnectionManager.sendGet(url, param);
        JSONObject json = JSONObject.parseObject(result);
      /*  String nickname = json.get("nickname").toString();
        String headimgurl = json.get("headimgurl").toString();*/
        
    	return json;
	}
	
}
