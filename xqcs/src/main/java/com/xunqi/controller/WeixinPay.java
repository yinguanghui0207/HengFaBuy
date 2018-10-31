package com.xunqi.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.thoughtworks.xstream.XStream;
import com.alibaba.fastjson.JSONObject;
import com.xunqi.pojo.OrderInfo;
import com.xunqi.pojo.OrderReturnInfo;
import com.xunqi.pojo.SignInfo;
import com.xunqi.tool.Configure;
import com.xunqi.tool.HttpRequest;
import com.xunqi.tool.RandomStringGenerator;
import com.xunqi.tool.ReturnResult;
import com.xunqi.tool.Signature;
import com.xunqi.tool.StreamUtil;

@Controller
@RequestMapping("/Wxpay")
public class WeixinPay {

	@RequestMapping("/createorder")
	@ResponseBody
	public ReturnResult AllActivityUser(@RequestBody OrderInfo order ){
		try {
			String openid = order.getOpenid();

			order.setAppid(Configure.getAppID());
			order.setMch_id(Configure.getMch_id());
			order.setNonce_str(RandomStringGenerator.getRandomStringByLength(32));
			order.setBody(order.getBody());
			order.setOut_trade_no(RandomStringGenerator.getRandomStringByLength(32));
			order.setTotal_fee(order.getTotal_fee());
			order.setSpbill_create_ip("47.105.82.94");
			order.setNotify_url(Configure.getNotifyUrl());
			order.setTrade_type(Configure.getTradetype());
			order.setOpenid(openid);
			order.setSign_type(Configure.getSigntype());
			//生成签名
			String sign = Signature.getSign(order);
			order.setSign(sign);						
			String result = HttpRequest.sendPost(Configure.getPayUrl(), order);					
			XStream xStream = new XStream();
			xStream.alias("xml", OrderReturnInfo.class); 	
			OrderReturnInfo returnInfo = (OrderReturnInfo)xStream.fromXML(result);
			//在签名
			String Prepay_id = returnInfo.getPrepay_id();
			SignInfo signInfo = new SignInfo();
			signInfo.setAppId(Configure.getAppID());
			long time = System.currentTimeMillis()/1000;
			signInfo.setTimeStamp(String.valueOf(time));
			signInfo.setNonceStr(RandomStringGenerator.getRandomStringByLength(32));
			signInfo.setRepay_id("prepay_id="+Prepay_id);
			signInfo.setSignType(Configure.getSigntype());
			//生成签名
			String sign2 = Signature.getSign(signInfo);
			JSONObject json = new JSONObject();
			json.put("timeStamp", signInfo.getTimeStamp());
			json.put("nonceStr", signInfo.getNonceStr());
			json.put("package", signInfo.getRepay_id());
			json.put("signType", signInfo.getSignType());
			json.put("paySign", sign2);
						
			return  ReturnResult.success(json);
			
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	

	@RequestMapping("/payResult")
	@ResponseBody
	public void payResult(HttpServletRequest request){
		try {
		
			String reqParams = StreamUtil.read(request.getInputStream());
			System.out.println(reqParams);				
		} catch (Exception e) {
			
			e.getMessage();
		}
	}
}
