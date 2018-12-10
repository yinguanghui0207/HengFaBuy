package com.xunqi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xunqi.pojo.Banner;
import com.xunqi.service.BannerService;
import com.xunqi.tool.ReturnResult;

@Controller
@RequestMapping("/banner")
public class BannerController {
	@Autowired
	 private BannerService bannerService;
	/**
	 * 添加banner图
	 * @param banner
	 * @return
	 */
	@RequestMapping("/insertBanner")
	@ResponseBody
	public ReturnResult insertBanner(@RequestBody Banner banner){
		try {
			bannerService.insertBanner(banner);
			return ReturnResult.success();
			
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	/**
	 * 查询banner图
	 * @param banner
	 * @return
	 */
	@RequestMapping("/findBannerByState")
	@ResponseBody
	public ReturnResult findBannerByState(@RequestBody Banner banner){
		try {
			List<Banner> findBannerByState = bannerService.findBannerByState(banner);
			return ReturnResult.success(findBannerByState.size(),findBannerByState);
			
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
}
