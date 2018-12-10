package com.xunqi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.xunqi.pojo.CircleComment;
import com.xunqi.pojo.CircleMessage;
import com.xunqi.pojo.Follower;
import com.xunqi.pojo.TebCollection;
import com.xunqi.pojo.TebPraise;
import com.xunqi.pojo.TebReply;
import com.xunqi.service.ActivityUsrService;
import com.xunqi.service.CircleService;
import com.xunqi.service.FollowerService;
import com.xunqi.tool.ReturnResult;

@Controller
@RequestMapping("/circle")
public class CircleController {
	@Autowired
	private CircleService circleService;
	@Autowired
	private FollowerService followerService;
	@Autowired
	private ActivityUsrService activityUsrService;
	/**
	 * 发布动态
	 * @param circleMessage
	 * @return
	 */
	@RequestMapping("/insertMassage")
	@ResponseBody
	public ReturnResult insertMassage(@RequestBody CircleMessage circleMessage){
		try {
			return circleService.insertMassage(circleMessage);
			
			 
			
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	
	/**
	 * 动态 热门
	 * @param circleMessage
	 * @return
	 */
	@RequestMapping("/findMassage")
	@ResponseBody
	public ReturnResult findMassage(@RequestBody CircleMessage circleMessage){
		try {
			List<CircleMessage> findMassage = circleService.findMassage(circleMessage);
			for (CircleMessage circleMessage2 : findMassage) {

				circleMessage2.setActivityUsr(activityUsrService.findByUseId(circleMessage2.getUseId()));
			}
			
			return ReturnResult.success(findMassage.size(),findMassage);
			
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
		
	 /**
	  * 动态 关注
	  * @param circleMessage
	  * @return
	  */
	@RequestMapping("/findMassageByFollower")
	@ResponseBody
	public ReturnResult findMassageByFollower(@RequestBody CircleMessage circleMessage){
		try {
			Follower follower = new Follower();
			follower.setUseId(circleMessage.getUseId());
			List<String> findFolloweringUseId = followerService.findFolloweringUseId(follower);
			
			List<CircleMessage> findMassageByFollower = circleService.findMassageByFollower(circleMessage,findFolloweringUseId);
			for (CircleMessage circleMessage2 : findMassageByFollower) {

				circleMessage2.setActivityUsr(activityUsrService.findByUseId(circleMessage2.getUseId()));
			}
			return ReturnResult.success(findMassageByFollower.size(),findMassageByFollower);
			
		} catch (Exception e) {			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	/**
	 * 插入评论
	 * @param circleComment
	 * @return
	 */
	@RequestMapping("/insertComment")
	@ResponseBody
	public ReturnResult insertComment(@RequestBody CircleComment circleComment){
		try {
			 circleService.insertComment(circleComment);

			 circleService.updateMsgreply(circleComment.getFcmid());
			 return ReturnResult.success();
			
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}	
 	/**
 	 * 插入回复
 	 * @param tebReply
 	 * @return
 	 */
	@RequestMapping("/insertReply")
	@ResponseBody
	public ReturnResult insertReply(@RequestBody TebReply tebReply){
		try {
			circleService.insertReply(tebReply);
			return ReturnResult.success();
			
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	/**
	 * 点赞/取消点赞
	 * @param tebPraise
	 * @return
	 */
	@RequestMapping("/ispraise")
	@ResponseBody
	public ReturnResult ispraise(@RequestBody TebPraise tebPraise){
		try {
			Boolean findIspraise = circleService.findIspraise(tebPraise);
			if(findIspraise){
				circleService.deletepraise(tebPraise);				
			}else{
				circleService.insertpraise(tebPraise);
			}			
			return ReturnResult.success();
			
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	/**
	 * 判断用户是否点赞
	 * @param tebPraise
	 * @return
	 */
	@RequestMapping("/findIspraise")
	@ResponseBody
	public ReturnResult findIspraise(@RequestBody TebPraise tebPraise){
		try {
			Boolean findIspraise = circleService.findIspraise(tebPraise);
			
			return ReturnResult.success(findIspraise);
			
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	
	
	/**
	 * 查看动态点赞数 
	 * @param circleMessage
	 * @return
	 */
	@RequestMapping("/findMsgCountPraise")
	@ResponseBody
	public ReturnResult findCountPraise(@RequestBody CircleMessage circleMessage){
		try {
			circleService.findCountPraise(circleMessage);
			return ReturnResult.success();
			
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	/**
	 * 查看评论的点赞数
	 * @param circleComment
	 * @return
	 */
	@RequestMapping("/findCommentCountPraise")
	@ResponseBody
	public ReturnResult findCommentCountPraise(@RequestBody CircleComment circleComment){
		try {
			circleService.findCommentCountPraise(circleComment);
			return ReturnResult.success();
			
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	
	/**
	 * 收藏
	 * @param tebCollection
	 * @return
	 */
	@RequestMapping("/insertTebCollection")
	@ResponseBody
	public ReturnResult insertTebCollection(@RequestBody TebCollection tebCollection){
		try {
			Boolean findIspraise = circleService.findIsCollection(tebCollection);
			if( findIspraise){
				return ReturnResult.error("00","您已收藏");
			}else{
				circleService.insertTebCollection(tebCollection);
				
				return ReturnResult.success();
			}
			
			
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	/**
	 * 判断是否收藏
	 * @param tebCollection
	 * @return
	 */
	@RequestMapping("/findIsCollection")
	@ResponseBody
	public ReturnResult findIsCollection(@RequestBody TebCollection tebCollection){
		try {
			Boolean findIspraise = circleService.findIsCollection(tebCollection);
			
			return ReturnResult.success(findIspraise);
			
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	/**
	 * 查看我的收藏
	 * @param tebCollection
	 * @return
	 */
	@RequestMapping("/findCollection")
	@ResponseBody
	public ReturnResult findCollection(@RequestBody TebCollection tebCollection){
		try {

			List<TebCollection> findCollection = circleService.findCollection(tebCollection);
			
			return ReturnResult.success(findCollection.size(),findCollection);
			
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	/**
	 * 查看动态详情
	 * @param circleMessage
	 * @return
	 */
	@RequestMapping("/findMassageInfo")
	@ResponseBody
	public ReturnResult findMassageInfo(@RequestBody CircleMessage circleMessage){
		try {			
			
			CircleMessage findMassageInfo = circleService.findMassageInfo(circleMessage);
			return ReturnResult.success(findMassageInfo);
			
		} catch (Exception e) {			
			return ReturnResult.error("01",e.getMessage());
		}
	}
}
