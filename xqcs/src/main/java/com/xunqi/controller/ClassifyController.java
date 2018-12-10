package com.xunqi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.xunqi.pojo.Classify;
import com.xunqi.service.ClassifyService;
import com.xunqi.tool.ReturnResult;

@Controller
public class ClassifyController  {
	@Autowired
	private ClassifyService classifyService;
	/**
	 * 创建分类
	 * @param classify
	 * @return
	 */
	@RequestMapping("/insertClassify")
	@ResponseBody
	public ReturnResult insertClassify(@RequestBody Classify classify){
		try {
			classifyService.insert(classify);
			return ReturnResult.success();
			
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	/**
	 * 查询在用的动态分类
	 * @param classify
	 * @return
	 */
	@RequestMapping("/findDynClassify")
	@ResponseBody
	public ReturnResult findDynClassify(){
		try {
			 List<Classify> findDynClassify = classifyService.findDynClassify();
			return ReturnResult.success(findDynClassify.size(),findDynClassify);
			
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
}
