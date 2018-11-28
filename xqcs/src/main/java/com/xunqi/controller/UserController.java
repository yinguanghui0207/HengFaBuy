package com.xunqi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xunqi.pojo.SystemUser;
import com.xunqi.service.UserService;
import com.xunqi.tool.ReturnResult;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	/**
	 * 注册
	 * @param systemUser
	 * @return
	 */
	@RequestMapping("/register")
	@ResponseBody
	public ReturnResult register(@RequestBody SystemUser systemUser){
		try {
			if(systemUser.getAccount().isEmpty()||systemUser.getPassword().isEmpty()){
				return ReturnResult.error("03","用户名和密码不能为空");
			}
			Integer a = 1;
			if(a.equals(userService.findUserByAccount(systemUser.getAccount()))){
				return ReturnResult.error("02","用户名已存在");
				
			}
			SystemUser insertUser = userService.insertUser(systemUser);
			
			return ReturnResult.success(insertUser);
		} catch (Exception e) {
			return ReturnResult.error("01", "请求异常，请稍后重试");
		}
	}
	/**
	 * 登录
	 * @param systemUser
	 * @return
	 */
	@RequestMapping("/login")
	@ResponseBody
	public ReturnResult login(@RequestBody SystemUser systemUser){
		try {
			if(StringUtils.isEmpty(systemUser.getAccount()) || StringUtils.isEmpty(systemUser.getPassword())){
				return ReturnResult.error("01","用户名和密码不能为空");
			}
			SystemUser findUserByAP = userService.findUserByAP(systemUser);
			
			if(findUserByAP==null){
				return ReturnResult.error("01","用户名账号或密码错误");
			}else{
				if(findUserByAP.getState()==1){
					return ReturnResult.error("01","该账号已停用");
				}
				return ReturnResult.success(findUserByAP);
			}
		} catch (Exception e) {
			return ReturnResult.error("01", "请求异常，请稍后重试");
		}
	}
	/**
	 * 修改密码
	 * @param systemUser
	 * @return
	 */
	@RequestMapping("/updatePassword")
	@ResponseBody
	public ReturnResult updatePassword(@RequestBody SystemUser systemUser){
		try {
			 userService.updateByAccount(systemUser);
			
				
				return ReturnResult.success();			
		} catch (Exception e) {
			return ReturnResult.error("01", "请求异常，请稍后重试");
		}
	}
	/**
	 * 修改用户权限
	 * @param systemUser
	 * @return
	 */
	@RequestMapping("/updateAuthority")
	@ResponseBody
	public ReturnResult updateAuthority(@RequestBody SystemUser systemUser){
		try {
			 userService.updateAuthorityByAccount(systemUser);							
				return ReturnResult.success();			
		} catch (Exception e) {
			return ReturnResult.error("01","请求异常，请稍后重试");
		}
	}
	
	/**
	 * 修改用户状态(启用)
	 * @param systemUser
	 * @return
	 */
	@RequestMapping("/toState")
	@ResponseBody
	public ReturnResult toState(@RequestBody SystemUser systemUser){
		try {
			systemUser.setState(0);
			userService.updateStateByAccount(systemUser);							
				return ReturnResult.success();			
		} catch (Exception e) {
			return ReturnResult.error("01", "请求异常，请稍后重试");
		}
	}
	/**
	 * 修改用户状态(停用)
	 * @param systemUser
	 * @return
	 */
	@RequestMapping("/toStop")
	@ResponseBody
	public ReturnResult toStop(@RequestBody SystemUser systemUser){
		try {
			systemUser.setState(1);
			userService.updateStateByAccount(systemUser);							
			return ReturnResult.success();			
		} catch (Exception e) {
			return ReturnResult.error("01", "请求异常，请稍后重试");
		}
	}
	
	@RequestMapping("/findAllUser")
	@ResponseBody
	public ReturnResult findAllUser(){
		try {
			
			List<SystemUser> findAllUser = userService.findAllUser();							
			return ReturnResult.success(findAllUser.size(),findAllUser);			
		} catch (Exception e) {
			return ReturnResult.error("01", "请求异常，请稍后重试");
		}
	}
	
}
