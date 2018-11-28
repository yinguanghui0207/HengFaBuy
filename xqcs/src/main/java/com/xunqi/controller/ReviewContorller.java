package com.xunqi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xunqi.pojo.ActivityMerchant;
import com.xunqi.pojo.Data;
import com.xunqi.pojo.UserAuth;
import com.xunqi.pojo.XqActivity;
import com.xunqi.service.MerchantService;
import com.xunqi.service.UserAuthService;
import com.xunqi.service.XqActivityService;
import com.xunqi.service.XqActivityinfoService;
import com.xunqi.tool.ReturnResult;
@Controller
@RequestMapping("/review")
public class ReviewContorller {
	@Autowired
	private UserAuthService userAuthService;
	@Autowired
	private MerchantService merchantService;
	@Autowired
	private XqActivityinfoService xqActivityinfoService;
	@Autowired
	private XqActivityService xqActivityService;
	/**
	 * 查询所有审核中的实名用户
	 * @return
	 */
	@RequestMapping("/findReviewUser")
	@ResponseBody
	public ReturnResult findReviewUser(){
		try {
			List<UserAuth> findReviewUser = userAuthService.findReviewUser();
										
			return ReturnResult.success(findReviewUser.size(),findReviewUser);			
		} catch (Exception e) {
			return ReturnResult.error("01", "请求异常，请稍后重试");
		}
	}
	/**
	 * 修改实名认证状态
	 * @return
	 */
	@RequestMapping("/updateTrueUserState")
	@ResponseBody
	public ReturnResult updateState(@RequestBody UserAuth userAuth){
		try {			
			userAuthService.updateState(userAuth);
			
			return ReturnResult.success();			
		} catch (Exception e) {
			return ReturnResult.error("01", "请求异常，请稍后重试");
		}
	}
	/**
	 * 查询审核中的商户
	 * @return
	 */
	@RequestMapping("/findMerchantByState")
	@ResponseBody
	public ReturnResult findMerchantByState(){
		try {			
			List<ActivityMerchant> findMerchantByState = merchantService.findMerchantByState();
			
			return ReturnResult.success(findMerchantByState.size(),findMerchantByState);			
		} catch (Exception e) {
			return ReturnResult.error("01", "请求异常，请稍后重试");
		}
	}
	/**
	 * 发起商户审核
	 * @param activityMerchant
	 * @return
	 */
	@RequestMapping("/updateMerchantState")
	@ResponseBody
	public ReturnResult updateMerchantState(@RequestBody ActivityMerchant activityMerchant){
		try {
			if(activityMerchant.getMerchantId()==null||activityMerchant.getState()==null){
				return ReturnResult.error("01", "商户和状态不能为空"); 
			}
			merchantService.updateState(activityMerchant);
			
			return ReturnResult.success();			
		} catch (Exception e) {
			return ReturnResult.error("01", "请求异常，请稍后重试");
		}
	}
	/**
	 * 查询审核活动
	 * @return
	 */
	@RequestMapping("/findReviewActivity")
	@ResponseBody
	public ReturnResult findReviewActivity(@RequestBody XqActivity xqActivity){
		try {
			List<Data> findReviewActivity = xqActivityinfoService.findReviewActivity(xqActivity.getState());		
			return ReturnResult.success(findReviewActivity.size(),findReviewActivity);			
		} catch (Exception e) {
			return ReturnResult.error("01", "请求异常，请稍后重试");
		}
	}
	/**
	 * 更新活动状态	
	 * @param xqActivity
	 * @return
	 */
	@RequestMapping("/updateActivityState")
	@ResponseBody
	public ReturnResult updateActivityState(@RequestBody XqActivity xqActivity){
		try {						
			xqActivityService.updateActivityState(xqActivity);
			return ReturnResult.success();			
		} catch (Exception e) {
			return ReturnResult.error("01", "请求异常，请稍后重试");
		}
	}
}
