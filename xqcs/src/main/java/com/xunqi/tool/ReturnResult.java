 package com.xunqi.tool;

public class ReturnResult {
 
	private long total;
	private Object data;
	private String code;
	private String msg;
 
	private ReturnResult(long total, Object data, String code, String msg) {
		this.total = total;
		this.data = data;
		this.code = code;
		this.msg = msg;
	}
 
	private ReturnResult(Object data) {
		this.data = data;
		this.code = ReturnMsg.SUCCESS.getCode();
		this.msg = ReturnMsg.SUCCESS.getMsg();
	}
 
	private ReturnResult(long total, Object data) {
		this.total = total;
		this.data = data;
		this.code = ReturnMsg.SUCCESS.getCode();
		this.msg = ReturnMsg.SUCCESS.getMsg();
	}
 
	private ReturnResult(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}
 
	private ReturnResult() {
		this.code = ReturnMsg.ERROR.getCode();
		this.msg = ReturnMsg.ERROR.getMsg();
	}
 

	public static ReturnResult success(long total, Object data, String code, String msg) {
		return new ReturnResult(total, data, code, msg);
	}
 
	
	public static ReturnResult success(long total, Object data) {
		return new ReturnResult(total, data);
	}
 
	
	public static ReturnResult success(Object data) {
		return new ReturnResult(data);
	}
 
	
	public static ReturnResult success() {
		return new ReturnResult("");
	}
 
	
	public static ReturnResult error() {
		return new ReturnResult();
	}
 
	public static ReturnResult error(String code, String msg) {
		return new ReturnResult(code, msg);
	}
 
	public long getTotal() {
		return total;
	}
 
	public void setTotal(long total) {
		this.total = total;
	}
 
	public Object getData() {
		return data;
	}
 
	public void setData(Object data) {
		this.data = data;
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
