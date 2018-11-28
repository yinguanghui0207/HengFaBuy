package com.xunqi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xunqi.pojo.ActivityMerchant;
import com.xunqi.pojo.ActivityUsr;
import com.xunqi.service.AppUserService;
import com.xunqi.service.MerchantService;
import com.xunqi.tool.ReturnResult;

@Controller
@RequestMapping("/appuser")
public class AppUserController {
	@Autowired
	private AppUserService appUserService;
	@Autowired
	private MerchantService merchantService; 
	/***
	 * 查询所有个人用户
	 * @return
	 */
	@RequestMapping("/findUser")
	@ResponseBody
	public ReturnResult findAppUser(){		
		try {
			List<ActivityUsr> findAllUser = appUserService.findAllUser();
			return ReturnResult.success(findAllUser.size(),findAllUser);
		} catch (Exception e) {
			return ReturnResult.error("01", "请求异常，请稍后重试");
		}			
	}
	/**
	 * 查询所有企业
	 * @return
	 */
	@RequestMapping("/findAllMerchant")
	@ResponseBody
	public ReturnResult findAllMerchant(){		
		try {
			List<ActivityMerchant> finfAllMerchant = merchantService.finfAllMerchant(); 
			return ReturnResult.success(finfAllMerchant.size(),finfAllMerchant);
		} catch (Exception e) {
			return ReturnResult.error("01", "请求异常，请稍后重试");
		}			
	}

}
