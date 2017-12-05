package com.yi.Controller.realms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class user {
	
	/**
	 * 用户登录
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping("/login")
	public String login(@RequestParam("username") String username,
			@RequestParam("password")String password){
		System.out.println(username+ " : "+ password);
		
		return "redirect:/list";
	}
	
	@RequestMapping("/list")
	public String list(){
		return "list";		
	} 
}