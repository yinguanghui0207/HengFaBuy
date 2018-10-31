package com.xunqi.service;

import java.util.List;

import com.xunqi.pojo.ReturnData;
import com.xunqi.pojo.UseOrder;

public interface UseOrderService {

	UseOrder insertUseOrder(UseOrder useOrder);

	List<ReturnData> FindOrderByActivityId(Integer activityId);

	List<ReturnData> findOrderByUseAndS(UseOrder useOrder);

	UseOrder findOrderByTicketNo(String ticketNo);

	void updateState(String TicketNo);

}
