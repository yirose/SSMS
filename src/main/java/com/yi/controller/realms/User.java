package com.yi.controller.realms;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class User {

	/**
	 * 用户登录
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping("/login")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password) {

		Subject currentUser = SecurityUtils.getSubject();
		if (!currentUser.isAuthenticated()) {
			UsernamePasswordToken token = new UsernamePasswordToken(username, password);
			token.setRememberMe(true);
			try {
				// 成功登录
				currentUser.login(token);
			} catch (AuthenticationException ae) {
				System.out.println("登录错误： " + ae.getMessage());
			}
		}
		// 页面跳转
		return "redirect:/list";
	}

	@RequestMapping("/list")
	public String list() {
		// 页面加载
		return "list";
	}
	
	public static void main(String[] args) {
		String hashAlgorithmName = "MD5";
		Object credentials = "123456";
		Object salt = "admin";
		int hashIterations =1024;
		Object result = new SimpleHash(hashAlgorithmName, credentials, salt, hashIterations);
		System.out.println(result);
	}

}