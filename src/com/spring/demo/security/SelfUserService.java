package com.spring.demo.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.spring.demo.security.role.SelfRole;
import com.spring.demo.security.user.SelfUser;
import com.spring.demo.user.dao.UserDao;
import com.spring.demo.user.service.UserService;

public class SelfUserService implements UserDetailsService {
	@Resource
	UserDao userDao;
	@Override
	public UserDetails loadUserByUsername(String arg0)
			throws UsernameNotFoundException {
////		System.out.println(request.getContextPath());
//		System.out.println(arg0);
//		// TODO Auto-generated method stub
//		SelfUser selfUser=new SelfUser();
//		selfUser.setUsername(arg0);
//		if(arg0.equals("liuzhilong")){
//			Set<GrantedAuthority>  a = new HashSet<GrantedAuthority>();
//			a.add(new SelfRole("ROLE_USER"));
//			a.add(new SelfRole("ROLE_ADMIN"));
//			selfUser.setPassword("loveaiai");
//			selfUser.setAuthorities(a);
//			selfUser.setAccountNonExpired(true);
//			selfUser.setEnabled(true);
//			selfUser.setCredentialsNonExpired(true);
//			selfUser.setAccountNonLocked(true);
//			
//		}else{
//			return  null;
//		}
//		
//		return selfUser;
		
		return userDao.getUserByName(arg0);
	}

}
