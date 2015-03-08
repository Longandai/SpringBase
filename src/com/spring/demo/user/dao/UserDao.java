package com.spring.demo.user.dao;

import com.spring.demo.security.user.SelfUser;

public interface UserDao {
	public SelfUser getUserByName(String userName);
}
