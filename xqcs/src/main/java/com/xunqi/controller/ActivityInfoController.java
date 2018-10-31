package com.xunqi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.xunqi.pojo.ActivityCollection;
import com.xunqi.pojo.ActivityMerchant;
import com.xunqi.pojo.ActivityUsr;
import com.xunqi.pojo.Data;
import com.xunqi.pojo.UseOrder;
import com.xunqi.pojo.XqActivity;
import com.xunqi.pojo.XqActivityinfo;
import com.xunqi.service.ActivityMerchantService;
import com.xunqi.service.ActivityUsrService;
import com.xunqi.service.ActivitycollectionService;
import com.xunqi.service.UseOrderService;
import com.xunqi.service.XqActivityinfoService;
import com.xunqi.tool.OssClienUtils;
import com.xunqi.tool.ReturnResult;

@Controller
@RequestMapping("/activity")
public class ActivityInfoController {	
	@Autowired
	private XqActivityinfoService xqActivityinfoService;	
	@Autowired
	private ActivityMerchantService activityMerchantService;
	@Autowired
	private ActivitycollectionService activitycollectionService;
	@Autowired
	private ActivityUsrService activityUsrService; 
	@Autowired
	private UseOrderService useOrderService; 
	
	/**
	 * 根据详情Id获取详情信息
	 * @return
	 */	
	@RequestMapping("/activityInfo")
	@ResponseBody
	public ReturnResult ActivityinfoLsitView(@RequestBody XqActivityinfo xqActivityinfo){
		try {
			Data data= xqActivityinfoService.findAllByActivityId(xqActivityinfo.getActivityId());
			
			xqActivityinfoService.updateViewsNum(xqActivityinfo);
			
			return ReturnResult.success(data);
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	
	/**
	 * 根据活动Id获取商家信息
	 * @param activityId
	 * @return
	 */
	@RequestMapping("/activityMerchantview")
	@ResponseBody
	public ReturnResult ActivityMerchantview(@RequestBody ActivityMerchant activityMerchant){
		try {
			ActivityMerchant Merchants = activityMerchantService.findByActivityId(activityMerchant.getActivityId());
			
			return ReturnResult.success(Merchants);
		} catch (Exception e) {
			e.getMessage();
			return ReturnResult.error();
		}
	}
	
	/**
	 * 查询活动发布者信息
	 * @param xqActivityinfo
	 * @return
	 */
	@RequestMapping("/activityUseview")
	@ResponseBody
	public ReturnResult ActivityUsrview(@RequestBody XqActivity xqActivity){
		try {
			ActivityUsr findByUseId = activityUsrService.findByUseId(xqActivity.getPublisher());
			
			return ReturnResult.success(findByUseId);
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	
	/**
	 * 用户收藏
	 * @param activityCollection
	 * @return
	 */
	@RequestMapping("/activityCollection")
	@ResponseBody
	public ReturnResult Activitycollection(@RequestBody ActivityCollection activityCollection){
		
		try {
			//判断活动是否已收藏
			
			if( 1==activitycollectionService.selectByActivityId(activityCollection)){
				return ReturnResult.error("10003","活动已收藏");
			}						
			activitycollectionService.insert(activityCollection);
			return ReturnResult.success();
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
		
	}
	/**
	 * 判断用户收藏
	 * @param activityCollection
	 * @return
	 */
	@RequestMapping("/activityCollectionState")
	@ResponseBody
	public ReturnResult ActivitycollectionState(@RequestBody ActivityCollection activityCollection){
		
		try {
			//判断活动是否已收藏
			
			if( 1==activitycollectionService.selectByActivityId(activityCollection)){
				return ReturnResult.error("10003","活动已收藏");
			}						
			return ReturnResult.success();
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
		
	}
	/**
	 * 更新分享人数
	 * @param useOrder
	 * @return
	 */
	@RequestMapping("/updateRelayNum")
	@ResponseBody
	public ReturnResult updateRelayNum(@RequestBody XqActivityinfo xqActivityinfo){
		try {
			
			xqActivityinfoService.updateRelayNum(xqActivityinfo);
			
			return ReturnResult.success();
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	
	/**
	 * 插入用户订单信息
	 * @param useOrder
	 * @return
	 */
	@RequestMapping("/insertUseOrder")
	@ResponseBody
	public ReturnResult InsertUseOrder(@RequestBody UseOrder useOrder){
		try {
			UseOrder insertUseOrder = useOrderService.insertUseOrder(useOrder);
			
			return ReturnResult.success(insertUseOrder);
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	/**
	 * 删除图片
	 * @param xqActivity
	 * @return
	 */
	 @RequestMapping("/deleteSingleObect")
	    @ResponseBody
	    public  ReturnResult deleteSingleObect(@RequestBody XqActivity xqActivity) {
	        //创建OSSClient实例
	    	OssClienUtils ossClient = new OssClienUtils();
	        try {
	            ossClient.delFile( xqActivity.getCover());
	            return ReturnResult.success();
	        } catch (Exception e) {	            
	        	return ReturnResult.error("01",e.getMessage());
	        } finally {
	        	ossClient.destory();// 关闭client
	        }
	    }	
}
