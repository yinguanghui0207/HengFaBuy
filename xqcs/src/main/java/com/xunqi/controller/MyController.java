package com.xunqi.controller;



import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.xunqi.pojo.ActivityUsr;
import com.xunqi.pojo.ReturnData;
import com.xunqi.pojo.UseOrder;
import com.xunqi.pojo.UserIdentity;
import com.xunqi.pojo.XqActivity;
import com.xunqi.service.ActivityUsrService;
import com.xunqi.service.ActivitycollectionService;
import com.xunqi.service.UseOrderService;
import com.xunqi.service.UserIdentityService;
import com.xunqi.service.XqActivityService;
import com.xunqi.tool.MD5;
import com.xunqi.tool.ReturnResult;
@Controller
@RequestMapping("/use")
public class MyController {
	

	@Autowired
	private ActivityUsrService activityUsrService; 
	@Autowired
	private XqActivityService xqActivityService; 
	@Autowired
	private ActivitycollectionService activitycollectionService;
	@Autowired
	private UseOrderService useOrderService;
	@Autowired
	private UserIdentityService userIdentityService;
	

	/**
	 * 存入用户信息
	 * @param activityUsr
	 * @return
	 */
	@RequestMapping("/activityUser")
	@ResponseBody
	public ReturnResult AllActivityUser(@RequestBody ActivityUsr activityUsr){
		try {
		
			return  activityUsrService.insert(activityUsr);
			
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	/**
	 * 修改用户信息
	 * @param activityUsr
	 * @return
	 */
	@RequestMapping("/updateActivityUser")
	@ResponseBody
	public ReturnResult UpdateActivityUser(@RequestBody ActivityUsr activityUsr){
		try {
			activityUsrService.update(activityUsr);
			return ReturnResult.success();
		} catch (Exception e) {
			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	/**
	 * 查询一个用户下的所有收藏的活动Id
	 * @param activityUsr
	 * @return
	 */
	@RequestMapping("/findActivityCollection")
	@ResponseBody
	public ReturnResult FindActivityCollection(@RequestBody ActivityUsr activityUsr){
		try {
			List<XqActivity> findActivityCollectionByUserId = activitycollectionService.findActivityCollectionByUserId(activityUsr.getUseId());
			if(findActivityCollectionByUserId==null){
				return ReturnResult.success();
			}
			return ReturnResult.success(findActivityCollectionByUserId.size(),findActivityCollectionByUserId);
		} catch (Exception e) {			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	/**
	 * 根据用户Id和状态查询活动
	 * @param xqActivity
	 * @return
	 */
	@RequestMapping("/findUseActivity")
	@ResponseBody
	public ReturnResult FindUseActivity(@RequestBody XqActivity xqActivity){
		try {
			List<XqActivity> xqActivityList =xqActivityService.findActivityByPS(xqActivity);
			
			return ReturnResult.success(xqActivityList.size(),xqActivityList);
		} catch (Exception e) {			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	/**
	 * 根据活动Id查询订单和报名人信息
	 * @param useOrder
	 * @return
	 */
	@RequestMapping("/findOrderByActivityId")
	@ResponseBody
	public ReturnResult FindOrderByActivityId(@RequestBody UseOrder useOrder){
		try {
			List<ReturnData> returnData = useOrderService.FindOrderByActivityId(useOrder.getActivityId());
			
			return ReturnResult.success(returnData);
		} catch (Exception e) {			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	/**
	 * 根据用户Id和状态查询订单和活动信息
	 * @param useOrder
	 * @return
	 */
	@RequestMapping("/findOrderByUseIdAndS")
	@ResponseBody
	public ReturnResult FindOrderByUseIdAndS(@RequestBody UseOrder useOrder){
		try {
			List<ReturnData> returnData = useOrderService.findOrderByUseAndS(useOrder);
			
			return ReturnResult.success(returnData);
		} catch (Exception e) {			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	/**
	 * 查询推荐人
	 * @return
	 */
	@RequestMapping("/FindRecommend")
	@ResponseBody
	public ReturnResult FindRecommend(@RequestBody ActivityUsr activityUsr){
		try {
			List<ActivityUsr> findRecommend = activityUsrService.FindRecommend(activityUsr.getUseId());
			
			return ReturnResult.success(findRecommend.size(),findRecommend);
		} catch (Exception e) {			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	
/*************************************************************************************************************************************************************/
	/**
	 * 用户登录	
	 * @param userIdentity
	 * @return
	 */
	@RequestMapping("/Applogin")
	@ResponseBody
	public ReturnResult Applogin( @RequestBody UserIdentity userIdentity ,HttpServletRequest httpRequest){
		try {
			if("sysUser".equals(userIdentity.getIdentityType())){
				UserIdentity findUserIdentity = userIdentityService.findUserIdentity(userIdentity);
				if(findUserIdentity == null){
					return  ReturnResult.error("02", "用户不存在，请先注册");
				}else{
					ActivityUsr findByUseId = activityUsrService.findByUseId(findUserIdentity.getUseId());
					if((MD5.getMd5HashPasswod(userIdentity.getCredential())).equals(findByUseId.getPassword())){
						
						return ReturnResult.success(findByUseId);
						
					}else{
						return  ReturnResult.error("03", "用户名和密码错误");
					}
				}
				
			}else if("phoneUser".equals(userIdentity.getIdentityType())){
								
				HttpSession session = httpRequest.getSession();
				String attribute = (String) session.getAttribute("YZM");
				if(attribute == null){
					return  ReturnResult.error("05", "验证码已失效，请从新发送验证码");
				}
				if(userIdentity.getVcode().equals(attribute)){
					UserIdentity findUserIdentity = userIdentityService.findUserIdentity(userIdentity);
					ActivityUsr findByUseId;
					if(findUserIdentity== null){
						 ActivityUsr insertUserIdentity = userIdentityService.insertUserIdentity(userIdentity);
						findByUseId = insertUserIdentity;
					}else{
						/*if(userIdentity.getJson() != null){
							//微信第一次登陆 微信绑定
							userIdentityService.updateWXNext(userIdentity);
						}*/
						 findByUseId = activityUsrService.findByUseId(findUserIdentity.getUseId());
					}
					// 删除session中存的验证码
					session.removeAttribute("YZM");
					return ReturnResult.success(findByUseId);
				}else{
					return  ReturnResult.error("04", "验证码错误，请重试");
				}
				
			}else if("WX".equals(userIdentity.getIdentityType())){				
			/* JSONObject json = WXUtil.UtilgetTeskToken("wxdd2aa0d1263b3961", "0ec204a9912a6e142bef08ef5fbcfcc5", userIdentity.getIdentifier());
			 String openid = json.get("openid").toString();
			 userIdentity.setCredential(openid);
			 UserIdentity findUserIdentity = userIdentityService.findUserIdentity(userIdentity);
			 if(findUserIdentity == null){
				 return ReturnResult.success(0, json, "10", "由于您是首次登陆，请输入手机号");
			 }else{
				 ActivityUsr findByUseId = activityUsrService.findByUseId(findUserIdentity.getUseId());
				 return ReturnResult.success(findByUseId);
			 }*/
				
				UserIdentity findUserIdentity = userIdentityService.findUserIdentity(userIdentity);
				 if(findUserIdentity == null){
					 return  ReturnResult.error("10", "由于您是首次登陆，请输入手机号");
				 }else{
					 ActivityUsr findByUseId = activityUsrService.findByUseId(findUserIdentity.getUseId());
					 return ReturnResult.success(findByUseId);
				 }
				
			}
			return ReturnResult.error("06","未知错误，请重新登录");
		} catch (Exception e) {			
			return ReturnResult.error("01",e.getMessage());
		} 
	}
	
	
	/**
	 * 发送验证码
	 * @param userIdentity
	 * @param httpRequest
	 * @return
	 */
	@RequestMapping("/SendYZMMsg")
	@ResponseBody
	public ReturnResult SendYZMMassage(@RequestBody UserIdentity userIdentity, HttpServletRequest httpRequest){
		try {
			/*String yzm = RandomStringGenerator.getYZM();
			
			System.out.println(yzm);
			ALMassageUtil.sendMassage(userIdentity.getIdentifier(), "SMS_150770296", "{\"code\":\""+yzm+"\"}");*/
			
			String yzm ="123456";
			HttpSession session = httpRequest.getSession();
			session.setAttribute("YZM", yzm);
			
			final Timer timer = new Timer();
			timer.schedule(new TimerTask() {
				@Override
				public void run() {
					// 删除session中存的验证码
					session.removeAttribute("YZM");
					timer.cancel();
				}
			},5 * 60 * 1000);
			return ReturnResult.success();
		} catch (Exception e) {			
			return ReturnResult.error("01",e.getMessage());
		}
	}
	
	
	/**
	 * 注册
	 * @param userIdentity
	 * @return
	 */
	@RequestMapping("/register")
	@ResponseBody
	public ReturnResult register(@RequestBody UserIdentity userIdentity){
			try {
			ActivityUsr insertUserIdentity = userIdentityService.insertUserIdentity(userIdentity);
			return ReturnResult.success(insertUserIdentity);
		} catch (Exception e) {			
			return ReturnResult.error();
		}
	}
	/**
	 * 修改密码
	 * @param userIdentity（手机号 ，密码，  验证码）
	 * @return
	 */
	@RequestMapping("/updatePassword")
	@ResponseBody
	public ReturnResult updatePassword(@RequestBody UserIdentity userIdentity, HttpServletRequest httpRequest){
			try {
				HttpSession session = httpRequest.getSession();
				String attribute = (String) session.getAttribute("YZM");
				if(attribute == null){
					return  ReturnResult.error("05", "验证码已失效，请从新发送验证码");
				}
				if(userIdentity.getVcode().equals(attribute)){
					if(null == userIdentity.getUseId()){
						
						this.register(userIdentity);
						
					}else{
						
						activityUsrService.updatePassword(userIdentity);
					}
					// 删除session中存的验证码
					session.removeAttribute("YZM");
					return ReturnResult.success();
				}else{
					return  ReturnResult.error("04", "验证码错误，请重试");
				}
		} catch (Exception e) {			
			return ReturnResult.error();
		}
	}
	/**
	 * 绑定微信
	 * @param userIdentity（手机号 ，Info，  验证码）
	 * @return
	 */
	@RequestMapping("/UpdateWXNext")
	@ResponseBody
	public ReturnResult UpdateWXNext(@RequestBody UserIdentity userIdentity, HttpServletRequest httpRequest){
		try {
			HttpSession session = httpRequest.getSession();
			String attribute = (String) session.getAttribute("YZM");
			if(attribute == null){
				return  ReturnResult.error("05", "验证码已失效，请从新发送验证码");
			}
			if(userIdentity.getVcode().equals(attribute)){
				if(null == userIdentity.getUseId()){					
					this.register(userIdentity);
				}else{
					
					userIdentityService.updateWXNext(userIdentity);
				}
				// 删除session中存的验证码
				session.removeAttribute("YZM");
				return ReturnResult.success();
			}else{
				return  ReturnResult.error("04", "验证码错误，请重试");
			}
		} catch (Exception e) {			
			return ReturnResult.error();
		}
	}
	
	/**
	 * 验证当前手机
	 * @param userIdentity（手机号 ，密码，  验证码）
	 * @return
	 */
	@RequestMapping("/checkOldPhone")
	@ResponseBody
	public ReturnResult checkOldPhone(@RequestBody UserIdentity userIdentity, HttpServletRequest httpRequest){
			try {
				HttpSession session = httpRequest.getSession();
				String attribute = (String) session.getAttribute("YZM");
				if(attribute == null){
					return  ReturnResult.error("05", "验证码已失效，请从新发送验证码");
				}
				if(userIdentity.getCredential().equals(attribute)){
					// 删除session中存的验证码
					session.removeAttribute("YZM");
					return ReturnResult.success();
				}else{
					return  ReturnResult.error("04", "验证码错误，请重试");
				}
		} catch (Exception e) {			
			return ReturnResult.error();
		}
	}
	/**
	 * 修改手机号
	 * @param userIdentity（手机号 ，密码，  验证码）
	 * @return
	 */
	@RequestMapping("/updatePhone")
	@ResponseBody
	public ReturnResult updatePhone(@RequestBody UserIdentity userIdentity, HttpServletRequest httpRequest){
		try {
			HttpSession session = httpRequest.getSession();
			String attribute = (String) session.getAttribute("YZM");
			if(attribute == null){
				return  ReturnResult.error("05", "验证码已失效，请从新发送验证码");
			}
			if(userIdentity.getCredential().equals(attribute)){
				
				userIdentityService.updatePhone(userIdentity);				
				// 删除session中存的验证码
				session.removeAttribute("YZM");
				return ReturnResult.success();
			}else{
				return  ReturnResult.error("04", "验证码错误，请重试");
			}
		} catch (Exception e) {			
			return ReturnResult.error();
		}
	}
	
	
}






























