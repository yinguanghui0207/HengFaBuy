package com.xunqi.service;

import java.util.List;

import com.xunqi.pojo.TicketList;


public interface TicketService {
	/**
	 * 查询活动所有票的信息
	 * @param activityId
	 * @return
	 */
	List<TicketList> findAll(Integer activityId);
	

}
