package com.yi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yi.bean.User;
import com.yi.dao.UserMapper;


@Service
public class UserService {

	@Autowired
	UserMapper userMapper;

	/**
	 * 查询登录用户信息
	 * @param username
	 * @return
	 */
	public User getUser(String username) {
		User   user =  userMapper.selectByUserName(username);			
		return user;
	}
}