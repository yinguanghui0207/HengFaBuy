package com.xunqi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xunqi.pojo.ActivityUsr;
import com.xunqi.pojo.Follower;
import com.xunqi.service.FollowerService;
import com.xunqi.tool.ReturnResult;

@Controller
@RequestMapping("/follower")
public class FollowerController {
	@Autowired
	private FollowerService followerService;
	/**
	 * 添加关注
	 * @param follower
	 * @return
	 */
	@RequestMapping("/insert")
	@ResponseBody
	public ReturnResult insert(@RequestBody Follower follower){
		try {
			followerService.insert(follower);
			return ReturnResult.success();
			
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	
	/**
	 * 判断用户已经关注
	 * @param follower
	 * @return 0 未关注 1 关注  2 正向互相关注 3反向互相关注
	 */
	@RequestMapping("/findIsFollower")
	@ResponseBody
	public ReturnResult findIsFollower(@RequestBody Follower follower){
		try {
			 int findIsFollower = followerService.findIsFollower(follower);
			
			return ReturnResult.success(findIsFollower);
			
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	
	/**
	 * 取消关注
	 * @param follower
	 * @return
	 */
	@RequestMapping("/update")
	@ResponseBody
	public ReturnResult update(@RequestBody Follower follower){
		try {
			return followerService.update(follower);
			
			
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	/**
	 * 查询粉丝
	 * @param follower
	 * @return
	 */
	@RequestMapping("/findFollowering")
	@ResponseBody
	public ReturnResult findFollowering(@RequestBody Follower follower){
		try {
			 List<ActivityUsr> findIsFollower = followerService.findFollowering(follower);
			
			return ReturnResult.success(findIsFollower.size(),findIsFollower);
			
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	/**
	 * 查询我的关注
	 * @param follower
	 * @return
	 */
	@RequestMapping("/findFollowered")
	@ResponseBody
	public ReturnResult findFollowered(@RequestBody Follower follower){
		try {
			 List<ActivityUsr> findIsFollower = followerService.findFollowered(follower);
			
			return ReturnResult.success(findIsFollower.size(),findIsFollower);
			
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	/**
	 * 查询粉丝Id
	 * @param follower
	 * @return
	 */
	@RequestMapping("/findFolloweringUseId")
	@ResponseBody
	public ReturnResult findFolloweringUseId(@RequestBody Follower follower){
		try {
			List<String> findFolloweringUseId = followerService.findFolloweringUseId(follower);
			
			return ReturnResult.success(findFolloweringUseId.size(),findFolloweringUseId);
			
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
}
