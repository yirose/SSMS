package com.yi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yi.bean.User;
import com.yi.bean.UserExample;
import com.yi.bean.UserExample.Criteria;
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
	/*public User getUser(String username){
		User user = userMapper.selectByUserName(username);			
		return user;
	}*/

	public List<User> getUser(String username){
		UserExample userExample =new UserExample();
		Criteria criteria = userExample.createCriteria();
		
		//查询
		criteria.andUsernameEqualTo(username);
		
		// 模糊查询
		//criteria.andUsernameLike("%"+username+"%");
		
		List<User> users = userMapper.selectByExample(userExample);
		return users;
	}
}