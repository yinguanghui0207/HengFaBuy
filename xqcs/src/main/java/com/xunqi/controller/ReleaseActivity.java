package com.xunqi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.xunqi.pojo.Data;
import com.xunqi.service.ReleaseActivityService;
import com.xunqi.tool.ReturnResult;

@Controller
public class ReleaseActivity {
@Autowired	
private ReleaseActivityService releaseActivityService;
	
	/**
	 *  
	 * @param activityList
	 * @return
	 */
	@RequestMapping("/saveActivityList")
	@ResponseBody
	public ReturnResult saveActivityList( @RequestBody Data data){
		try {
			return 	releaseActivityService.insertActivity(data);
			
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage()); 
		}
	}
}
