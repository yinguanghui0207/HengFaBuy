package com.xunqi.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xunqi.pojo.CircleMessage;
import com.xunqi.pojo.TebCollection;
import com.xunqi.pojo.TebFootprint;
import com.xunqi.pojo.UseImages;
import com.xunqi.pojo.XqActivity;
import com.xunqi.service.CircleService;
import com.xunqi.service.TebFootprintService;
import com.xunqi.service.UseImagesService;
import com.xunqi.service.XqActivityService;
import com.xunqi.tool.ReturnResult;

@Controller
@RequestMapping("/userevent")
public class MyEventController {
	@Autowired
	private CircleService circleService;
	@Autowired
	private XqActivityService xqActivityService;
	@Autowired
	private UseImagesService useImagesService;
	@Autowired
	private TebFootprintService tebFootprintService;
	/**
	 * 查询我的收藏
	 * @param tebCollection
	 * @return
	 */
	@RequestMapping("/findCollection")
	@ResponseBody
	public ReturnResult findCollection(@RequestBody TebCollection tebCollection){
		try {
			int page = tebCollection.getPage();
			List<TebCollection> findCollection = circleService.findCollection(tebCollection);
			if(findCollection.isEmpty()){
				return ReturnResult.success();
			}
			List<Integer> ids = new ArrayList<Integer>();
			for (TebCollection tebCollection2 : findCollection) {
				ids.add(tebCollection2.getCollectionId());
			}
			switch (tebCollection.getType()) {
			case 0:
				List<XqActivity> findByActivityIds = xqActivityService.findByActivityIds(ids,page);			
				return ReturnResult.success(findByActivityIds.size(),findByActivityIds);
			case 1:
				List<CircleMessage> findByMsgIds = circleService.findByMsgIds(ids,page);
				return ReturnResult.success(findByMsgIds.size(),findByMsgIds);

			case 2:
				List<UseImages> findByids = useImagesService.findByids(ids,page);
				return ReturnResult.success(findByids.size(),findByids);

			default:
				break;
			}
			return ReturnResult.success();
			
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	/**
	 * 查询我的足迹
	 * @param tebFootprint
	 * @return
	 */
	@RequestMapping("/findFootprint")
	@ResponseBody
	public ReturnResult findFootprint(@RequestBody TebFootprint tebFootprint ){
		try {
			int page = tebFootprint.getPage();
			List<TebFootprint> findFootprint = tebFootprintService.findFootprint(tebFootprint);
			if(findFootprint.isEmpty()){
				return ReturnResult.success();
			}
			List<Integer> ids = new ArrayList<Integer>();
			for (TebFootprint tebFootprint2 : findFootprint) {
			 	ids.add(tebFootprint2.getFootprintId());
			}
			switch (tebFootprint.getType()) {
			case 0:				
				List<XqActivity> findByActivityIds = xqActivityService.findByActivityIds(ids,page);			
				return ReturnResult.success(findByActivityIds.size(),findByActivityIds);
			case 2:				
				List<UseImages> findByids = useImagesService.findByids(ids,page);
				return ReturnResult.success(findByids.size(),findByids);
			default:
				break;
			}
			return ReturnResult.success();
		} catch (Exception e) {
			return ReturnResult.error("01",e.getMessage());
		}
	}
	
}
