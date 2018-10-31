package com.xunqi.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.xunqi.pojo.ActivityUsr;
import com.xunqi.pojo.ReturnData;
import com.xunqi.pojo.UseOrder;
import com.xunqi.pojo.XqActivity;
import com.xunqi.service.ActivityUsrService;
import com.xunqi.service.ActivitycollectionService;
import com.xunqi.service.UseOrderService;
import com.xunqi.service.XqActivityService;
import com.xunqi.tool.ReturnResult;

@Controller
@RequestMapping("/use")
public class MyController {
	

	@Autowired
	private ActivityUsrService activityUsrService; 
	@Autowired
	private XqActivityService xqActivityService; 
	@Autowired
	private ActivitycollectionService activitycollectionService;
	@Autowired
	private UseOrderService useOrderService;
	

	/**
	 * 存入用户信息
	 * @param activityUsr
	 * @return
	 */
	@RequestMapping("/activityUser")
	@ResponseBody
	public ReturnResult AllActivityUser(@RequestBody ActivityUsr activityUsr){
		try {
		
			return  activityUsrService.insert(activityUsr);
			
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	/**
	 * 修改用户信息
	 * @param activityUsr
	 * @return
	 */
	@RequestMapping("/updateActivityUser")
	@ResponseBody
	public ReturnResult UpdateActivityUser(@RequestBody ActivityUsr activityUsr){
		try {
			activityUsrService.update(activityUsr);
			return ReturnResult.success();
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	/**
	 * 查询一个用户下的所有收藏的活动Id
	 * @param activityUsr
	 * @return
	 */
	@RequestMapping("/findActivityCollection")
	@ResponseBody
	public ReturnResult FindActivityCollection(@RequestBody ActivityUsr activityUsr){
		try {
			List<XqActivity> findActivityCollectionByUserId = activitycollectionService.findActivityCollectionByUserId(activityUsr.getUseId());
			if(findActivityCollectionByUserId==null){
				return ReturnResult.success();
			}
			return ReturnResult.success(findActivityCollectionByUserId.size(),findActivityCollectionByUserId);
		} catch (Exception e) {			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	/**
	 * 根据用户Id和状态查询活动
	 * @param xqActivity
	 * @return
	 */
	@RequestMapping("/findUseActivity")
	@ResponseBody
	public ReturnResult FindUseActivity(@RequestBody XqActivity xqActivity){
		try {
			List<XqActivity> xqActivityList =xqActivityService.findActivityByPS(xqActivity);
			
			return ReturnResult.success(xqActivityList.size(),xqActivityList);
		} catch (Exception e) {			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	/**
	 * 根据活动Id查询订单和报名人信息
	 * @param useOrder
	 * @return
	 */
	@RequestMapping("/findOrderByActivityId")
	@ResponseBody
	public ReturnResult FindOrderByActivityId(@RequestBody UseOrder useOrder){
		try {
			List<ReturnData> returnData = useOrderService.FindOrderByActivityId(useOrder.getActivityId());
			
			return ReturnResult.success(returnData);
		} catch (Exception e) {			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	/**
	 * 根据用户Id和状态查询订单和活动信息
	 * @param useOrder
	 * @return
	 */
	@RequestMapping("/findOrderByUseIdAndS")
	@ResponseBody
	public ReturnResult FindOrderByUseIdAndS(@RequestBody UseOrder useOrder){
		try {
			List<ReturnData> returnData = useOrderService.findOrderByUseAndS(useOrder);
			
			return ReturnResult.success(returnData);
		} catch (Exception e) {			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	
}
