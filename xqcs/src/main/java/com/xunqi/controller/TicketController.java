package com.xunqi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xunqi.pojo.TicketList;
import com.xunqi.service.TicketService;
import com.xunqi.tool.ReturnResult;

@Controller
@RequestMapping("/activity")
public class TicketController {
	
	@Autowired
	private TicketService ticketService;
	/**
	 * 查询活动所有票的信息
	 * @param activityId
	 * @return
	 */
	@RequestMapping("/tricketList")
	@ResponseBody
	public ReturnResult ActivityinfoLsitView(@RequestBody TicketList tricketList){
		try {			
			List<TicketList> tricket = ticketService.findAll(tricketList.getActivityId());
			
			return ReturnResult.success(tricket.size(),tricket);
		} catch (Exception e) {
			e.getMessage();
			return ReturnResult.error();
		}
	}
	
}
 