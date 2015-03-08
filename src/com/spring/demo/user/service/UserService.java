package com.spring.demo.user.service;

import com.spring.demo.security.user.SelfUser;

public interface UserService {
	public SelfUser getUserByName(String userName);
}
