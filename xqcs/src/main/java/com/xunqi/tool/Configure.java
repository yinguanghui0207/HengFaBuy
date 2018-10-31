package com.xunqi.tool;

public class Configure {
	private static String key = "ZHENGZHOUxunqi666618749562177zjl";

	//小程序ID	
	private static String appID = "wx8d167b0362172830";
	//商户号
	private static String mch_id = "1516467061";
	//
	private static String secret = "031576620752be50bc76479874791205";
	
	//支付成功后的服务器回调url
		public static final String notify_url ="http://4awaax.natappfree.cc/Wxpay/payResult";
		//签名方式，固定值
		public static final String SIGNTYPE = "MD5";
		//交易类型，小程序支付的固定值为JSAPI
		public static final String TRADETYPE = "JSAPI";
		//微信统一下单接口地址
		public static final String pay_url = "https://api.mch.weixin.qq.com/pay/unifiedorder";


	public static String getSecret() {
		return secret;
	}

	public static void setSecret(String secret) {
		Configure.secret = secret;
	}

	public static String getKey() {
		return key;
	}

	public static void setKey(String key) {
		Configure.key = key;
	}

	public static String getAppID() {
		return appID;
	}

	public static void setAppID(String appID) {
		Configure.appID = appID;
	}

	public static String getMch_id() {
		return mch_id;
	}

	public static void setMch_id(String mch_id) {
		Configure.mch_id = mch_id;
	}

	public static String getNotifyUrl() {
		return notify_url;
	}

	public static String getSigntype() {
		return SIGNTYPE;
	}

	public static String getTradetype() {
		return TRADETYPE;
	}

	public static String getPayUrl() {
		return pay_url;
	}
	
	
}
