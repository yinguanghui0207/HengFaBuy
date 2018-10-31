package com.xunqi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xunqi.pojo.UseOrder;
import com.xunqi.pojo.XqActivity;
import com.xunqi.service.UseOrderService;
import com.xunqi.service.XqActivityService;
import com.xunqi.tool.ReturnResult;

@Controller
@RequestMapping("/activity")
public class ActivityListController {
	
	@Autowired
	private XqActivityService xqActivityService;
	@Autowired
	private UseOrderService useOrderService; 
	
	/**
	 * 查询所有活动列表
	 * @return
	 */
	@RequestMapping("/activityList")
	@ResponseBody
	public ReturnResult ActivityLsitView(){
		try {
			
			List<XqActivity> allActivity= xqActivityService.findAll();
			
			
			return ReturnResult.success(allActivity.size(),allActivity);
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	
	/**
	 * 根据地址查询
	 * @param activityList
	 * @return
	 */
	@RequestMapping("/activityListByAddress")
	@ResponseBody
	public ReturnResult ActivityListByAddress(@RequestBody XqActivity xqActivity){		
		try {	

			List<XqActivity> activity = xqActivityService.findByAddres(xqActivity.getAddress());
			return ReturnResult.success(activity.size(),activity);
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	
	/**
	 *根据地址和关键字查询
	 * @return
	 */
	@RequestMapping("/activityListByKeyword")
	@ResponseBody
	public ReturnResult ActivityListByKeyword(@RequestBody XqActivity xqActivity){		
		try {
			List<XqActivity> activity = xqActivityService.findByKeyword(xqActivity);
			return ReturnResult.success(activity.size(),activity);
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}	
	@RequestMapping("/checkEWM")
	@ResponseBody
	public ReturnResult CheckEWM(@RequestBody UseOrder useOrder){		
		try {
		XqActivity findByActivityId = xqActivityService.findByActivityId(useOrder.getActivityId());
		if(useOrder.getUseId().equals(findByActivityId.getPublisher())){
			UseOrder findOrderByTicketNo = useOrderService.findOrderByTicketNo(useOrder.getTicketNo());
			if(0==findOrderByTicketNo.getTicketState()){
				useOrderService.updateState(useOrder.getTicketNo());
				return ReturnResult.success();
			}else{
				return ReturnResult.error("10006","此票已过期");
			}
			
		}  else{
			
			return ReturnResult.error("10005","非指定扫描方");
		}
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}		
}

