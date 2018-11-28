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
	 * 查询所有活动列表(状态大于0  即活动报名 进行中)
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
	/**
	 * 验票
	 * @param useOrder
	 * @return
	 */
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
/*************************************************************************************************************************************************************************/	
	/**
	 * 查询附近活动
	 * @param xqActivity
	 * @return
	 */
	@RequestMapping("/ActivityListByRange")
	@ResponseBody
	public ReturnResult ActivityListByRange(@RequestBody XqActivity xqActivity){		
		try {
			List<XqActivity> activity = xqActivityService.findActivityListByRange(xqActivity);
				return ReturnResult.success(activity.size(),activity);
			}catch (Exception e) {				
				return ReturnResult.error("01",e.getMessage());
			}

	}
	
	/**
	 * 分类查询活动
	 * @param xqActivity
	 * @return
	 */ 
	@RequestMapping("/ActivityListByType")
	@ResponseBody
	public ReturnResult ActivityListByType(@RequestBody XqActivity xqActivity){		
		try {
			List<XqActivity> activity = xqActivityService.findActivityListByType(xqActivity);
				return ReturnResult.success(activity.size(),activity);
			}catch (Exception e) {				
				return ReturnResult.error("01",e.getMessage());
			}

	}
	/**
	 * 强力推荐活动查询
	 * @param xqActivity
	 * @return
	 */
	@RequestMapping("/ActivityListByLevel")
	@ResponseBody
	public ReturnResult ActivityListByLevel(){		
		try {
			XqActivity xqActivity = new XqActivity();
			xqActivity.setActivityLevel(8);
			List<XqActivity> activity = xqActivityService.findActivityListByLevel(xqActivity);
				return ReturnResult.success(activity.size(),activity);
			}catch (Exception e) {				
				return ReturnResult.error("01",e.getMessage());
			}

	}
	/**
	 * 精选活动
	 * @param xqActivity
	 * @return
	 */
	@RequestMapping("/ActivityListAll")
	@ResponseBody
	public ReturnResult ActivityListAll(@RequestBody XqActivity xqActivity){		
		try {
			List<XqActivity> activity = xqActivityService.ActivityListAll(xqActivity);
				return ReturnResult.success(activity.size(),activity);
			}catch (Exception e) {				
				return ReturnResult.error("01",e.getMessage());
			}

	}
	/**
	 *搜索 
	 *@param id activityTitle lat lng 
	 * @return
	 */
	@RequestMapping("/activitySearch")
	@ResponseBody
	public ReturnResult ActivitySearch(@RequestBody XqActivity xqActivity){		
		try {
		List<XqActivity> activity = xqActivityService.ActivitySearch(xqActivity);
			return ReturnResult.success(activity.size(),activity);
		} catch (Exception e) {			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	
}