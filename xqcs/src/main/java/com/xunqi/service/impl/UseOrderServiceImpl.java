package com.xunqi.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xunqi.mapper.ActivityUsrMapper;
import com.xunqi.mapper.TicketListMapper;
import com.xunqi.mapper.UseOrderMapper;
import com.xunqi.mapper.XqActivityMapper;
import com.xunqi.pojo.ActivityUsr;
import com.xunqi.pojo.ReturnData;
import com.xunqi.pojo.UseOrder;
import com.xunqi.pojo.XqActivity;
import com.xunqi.service.UseOrderService;
import com.xunqi.tool.RandomSixnum;
@Service
public class UseOrderServiceImpl implements UseOrderService {
	
	@Autowired
	private UseOrderMapper useOrderMapper;
	@Autowired
	private ActivityUsrMapper activityUsrMapper;
	@Autowired
	private XqActivityMapper xqActivityMapper;
	@Autowired
	private TicketListMapper ticketListMapper;

	@Override
	public UseOrder insertUseOrder(UseOrder useOrder) {
		String ticketNo =""+System.currentTimeMillis()+RandomSixnum.generateCheckPass();
		useOrder.setTicketNo(ticketNo);
		useOrder.setTicketInfo(ticketNo+"xunqi"+useOrder.getActivityId());
		useOrder.setTicketState(0);
		useOrder.setOrderState(0);
		useOrder.setCreateTime(new Date());
		 useOrderMapper.insertSelective(useOrder);
		 String ticket = useOrder.getTicket();
//		 {"ticketId":"12345678":"name":"免费","money":0}
		 String ticketIds = ticket.substring(12,20);
		 int ticketId = Integer.parseInt(ticketIds);
		 ticketListMapper.updateTicketNumByTicketIdSelective(ticketId);
		 //更新报名人数
		 xqActivityMapper.updateApplicantsNumByActivityId(useOrder.getActivityId());
		 
		 return useOrder;
		
	}

	@Override
	public List<ReturnData> FindOrderByActivityId(Integer activityId) {
		
		List<ReturnData> list = new ArrayList<ReturnData>();
		List<UseOrder> findOrderByActivityId = useOrderMapper.findOrderByActivityId(activityId);
		for(UseOrder a:findOrderByActivityId){
			ActivityUsr selectByUseId = activityUsrMapper.selectByUseId(a.getUseId());
			ReturnData returnData =new ReturnData();
			returnData.setUseOrder(a);
			returnData.setActivityUsr(selectByUseId);
			list.add(returnData);
		}
		
		return list;
	}

	@Override
	public List<ReturnData> findOrderByUseAndS(UseOrder useOrder) {		
		List<ReturnData> list = new ArrayList<ReturnData>();
		List<UseOrder> findOrderByUseId = useOrderMapper.findOrderByUseIdAndS(useOrder);
		for(UseOrder a:findOrderByUseId){
			XqActivity selectByActivityId = xqActivityMapper.selectByActivityId(a.getActivityId());
			ReturnData returnData =new ReturnData();
			returnData.setXqActivity(selectByActivityId);
			returnData.setUseOrder(a);
			list.add(returnData);			
		}	
		return list;
	}

	@Override
	public UseOrder findOrderByTicketNo(String ticketNo) {
		return useOrderMapper.selectByTicketNo(ticketNo);
		 
	}

	@Override
	public void updateState(String TicketNo){
		UseOrder useOrder = new UseOrder();
		useOrder.setTicketState(1);
		useOrder.setTicketNo(TicketNo);
		useOrderMapper.updateByTicketNo(useOrder);
		
	}
}
