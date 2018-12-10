package com.xunqi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.xunqi.pojo.UseImages;
import com.xunqi.service.UseImagesService;
import com.xunqi.tool.ReturnResult;

@Controller
@RequestMapping("/UseImages")
public class UseImagesController {
	@Autowired
	private UseImagesService useImagesService;
	/**
	 * 添加图册
	 * @param useImages
	 * @return
	 */
	@RequestMapping("/insertUseImages")
	@ResponseBody
	public ReturnResult insertUseImages(@RequestBody UseImages useImages){
		try {
			
			UseImages insertUseImages = useImagesService.insertUseImages(useImages);
			return ReturnResult.success(insertUseImages);
			
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	/**
	 * 我的图册
	 * @param useImages useId state
	 * @return
	 */
	@RequestMapping("/findUseImagesByStateAndUseId")
	@ResponseBody
	public ReturnResult findUseImagesByStateAndUseId(@RequestBody UseImages useImages){
		try {
			List<UseImages> findUseImagesByStateAndUseId = useImagesService.findUseImagesByStateAndUseId(useImages);
			return ReturnResult.success(findUseImagesByStateAndUseId.size(),findUseImagesByStateAndUseId);
			 
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	/**
	 * 修改图册
	 * @param  useImages
	 * @return
	 */
	@RequestMapping("/updateUseImages")
	@ResponseBody
	public ReturnResult updateUseImages(@RequestBody UseImages useImages){
		try {
			 useImagesService.updateUseImages(useImages);
			return ReturnResult.success();
			
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	
	
}
