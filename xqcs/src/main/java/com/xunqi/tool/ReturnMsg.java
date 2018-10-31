package com.xunqi.tool;

public enum ReturnMsg {
 
	SUCCESS("00","成功"),
	EXCEPTION1("10001","活动票设置异常"),
	EXCEPTION2("10002","活动详情设置异常"),
	EXCEPTION3("10003","活动已收藏"),
	ERROR("01","失败");
	
	private String code;
	private String msg;
	
	private ReturnMsg (String code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
