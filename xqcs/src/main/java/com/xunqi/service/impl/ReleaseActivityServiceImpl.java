package com.xunqi.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xunqi.mapper.ReleaseStringMapper;
import com.xunqi.mapper.TicketListMapper;
import com.xunqi.mapper.XqActivityMapper;
import com.xunqi.mapper.XqActivityinfoMapper;
import com.xunqi.pojo.Data;
import com.xunqi.pojo.TicketList;
import com.xunqi.service.ReleaseActivityService;
import com.xunqi.tool.RandomSixnum;
import com.xunqi.tool.ReturnResult;
@Service
public class ReleaseActivityServiceImpl implements ReleaseActivityService{
	@Autowired
	private XqActivityMapper xqActivityMapper;
	@Autowired
	private XqActivityinfoMapper xqActivityinfoMapper;
	@Autowired
	private TicketListMapper ticketListMapper;
	@Autowired
	private ReleaseStringMapper releaseStringMapper;
	@Override
	public ReturnResult insertActivity(Data data) {
		int activityId = RandomSixnum.generateCheckPass();
		//插入活动列表信息
		data.getXqActivity().setActivityId(activityId);
		data.getXqActivity().setCreateTime(new Date());
		xqActivityMapper.insertSelective(data.getXqActivity());
		//活动票设置
		int total=0;
		int a =0 ;
		for(TicketList tricket:data.getTicket()){
			tricket.setActivityId(activityId);
			tricket.setTicketId(RandomSixnum.generateCheckPass());
			tricket.setCreateTime(new Date());
			
			//设置活动总票数
			tricket.setTicketTips(tricket.getTicketNum());
			 total = total +ticketListMapper.insertSelective(tricket);
			 a = a+tricket.getTicketNum();
		}
		if(data.getTicket().size()!=total){
			return ReturnResult.error("10001", "活动票设置异常");
			}
		//插入活动详情信息
		data.getXqActivityinfo().setActivityId(activityId);
		data.getXqActivityinfo().setCreateTime(new Date());		
		data.getXqActivityinfo().setTotalLimit(a);
		xqActivityinfoMapper.insertSelective(data.getXqActivityinfo());
		//大字段插入
		data.getReleaseString().setActivityId(activityId);
		releaseStringMapper.insertSelective(data.getReleaseString());
		
		return ReturnResult.success();
		/*try {	
		int activityId = RandomSixnum.generateCheckPass();
		
		data.getXqactivity().setActivityId(activityId);
		data.getActivityInfo().setActivityId(activityId);
		data.getReleaseString().setActivityId(activityId);
		
		activityListService.insertSelective(data.getActivityList());

		activityInfotService.insertSelective(data.getActivityInfo());
		
		
		int tricketTotal = tricketService.insertTricket(data.getTicket(),activityId);
		if(data.getTicket().size()!=tricketTotal){
		return ReturnResult.error("10001", "活动票设置异常");
		}			
		//大字段插入
		releaseStringService.insertString(data.getReleaseString());
		return ReturnResult.success();
	} catch (Exception e) {
		e.getMessage();
		return ReturnResult.error(); 
	}
}*/
		
	}

}
