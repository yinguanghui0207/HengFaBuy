package com.xunqi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xunqi.mapper.TicketListMapper;
import com.xunqi.pojo.TicketList;
import com.xunqi.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {
	@Autowired
	private TicketListMapper ticketListMapper;

	@Override
	public List<TicketList> findAll(Integer activityId) {
		
		return ticketListMapper.selectByActivityId(activityId);
		
	}

}
