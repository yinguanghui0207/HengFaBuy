package com.xunqi.service;

import java.util.List;

import com.xunqi.pojo.XqActivity;

public interface XqActivityService {
	/**
	 * 查询首页的活动列表
	 * @return
	 */
	List<XqActivity> findAll();
	/**
	 * 根据模糊地址查询活动列表
	 * @param address
	 * @return
	 */
	List<XqActivity> findByAddres(String address);
	/**
	 * 根据模糊地址和关键字查询活动列表
	 * @param xqActivity
	 * @return
	 */
	List<XqActivity> findByKeyword(XqActivity xqActivity);
	
	/**
	 * 根据发布者和状态查询活动
	 * @param xqActivity
	 * @return
	 */
	List<XqActivity> findActivityByPS(XqActivity xqActivity);
	/**
	 * 根据活动Id查询活动
	 * @param activityId
	 * @return
	 */
	XqActivity findByActivityId(Integer activityId);
	/**
	 * 修改活动状态
	 * @param xqActivity
	 * @return
	 */
	int updateActivityState(XqActivity xqActivity);
	/**
	 * 根据经纬度查询活动
	 * @param xqActivity
	 * @return
	 */
	List<XqActivity> findActivityListByRange(XqActivity xqActivity);
	/**
	 * 根据活动的类型查询活动
	 * @param xqActivity
	 * @return
	 */
	List<XqActivity> findActivityListByType(XqActivity xqActivity);
	/**
	 * 根据活动的等级查询活动
	 * @param xqActivity
	 * @return
	 */
	List<XqActivity> findActivityListByLevel(XqActivity xqActivity);
	/**
	 * 查询报名中进行中的活动
	 * @param xqActivity
	 * @return
	 */
	List<XqActivity> ActivityListAll(XqActivity xqActivity);
	
	/**
	 * 关键字查询活动列表
	 * @param xqActivity
	 * @return
	 */
	List<XqActivity> ActivitySearch(XqActivity xqActivity);
	/**
	 * 根据活动ids查询活动
	 * @param ids
	 * @return
	 */
	List<XqActivity> findByActivityIds(List<Integer> ids,int page);

}
