package com.yi.Controller.realms;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping()
public class user {
	@RequestMapping(value="/login")
	public String login(@RequestParam("username") String username,
			@RequestParam("password")String password){
		return null;
	}
}