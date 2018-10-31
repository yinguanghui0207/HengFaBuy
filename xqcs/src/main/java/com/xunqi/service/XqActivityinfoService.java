package com.xunqi.service;

import com.xunqi.pojo.Data;
import com.xunqi.pojo.XqActivityinfo;


public interface XqActivityinfoService {

	Data findAllByActivityId(Integer activityId);
	/**
	 * 查看是否包含scene
	 * @param imei
	 * @return
	 */
	Integer findQrcode(String imei);
	/**
	 * 添加scene
	 * @param imei
	 */
	void insertQrcode(String imei);
	/**
	 * 修改浏览人数
	 * @param xqActivityinfo
	 */
	void updateViewsNum(XqActivityinfo xqActivityinfo);
	
	/**
	 * 修改转发人数
	 * @param imei
	 */
	void updateRelayNum(XqActivityinfo xqActivityinfo);

}
