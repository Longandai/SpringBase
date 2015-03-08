package com.spring.demo.user.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.spring.demo.security.user.SelfUser;
import com.spring.demo.user.dao.UserDao;
import com.spring.demo.user.service.UserService;
@Service
@Component("userService")
public class UserServiceImpl implements UserService {

	
	@Resource(name="userDao")
	UserDao userDao;
	
	
	
	public UserDao getUserDao() {
		return userDao;
	}



	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}



	@Override
	public SelfUser getUserByName(String userName) {
		// TODO Auto-generated method stub
		
		return userDao.getUserByName(userName);
	}

}
