package com.spring.demo.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.apache.catalina.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.spring.demo.security.user.SelfUser;

public class SelfUserService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String arg0)
			throws UsernameNotFoundException {
		System.out.println(arg0);
		// TODO Auto-generated method stub
		SelfUser selfUser=new SelfUser();
		selfUser.setUsername(arg0);
		if(arg0.equals("liuzhilong")){
			Set<GrantedAuthority>  a = new HashSet<GrantedAuthority>();
			a.add(new GrantedAuthorityImpl("ROLE_USER"));
			a.add(new GrantedAuthorityImpl("ROLE_ADMIN"));
			selfUser.setPassword("loveaiai");
			selfUser.setAuthorities(a);
			selfUser.setAccountNonExpired(true);
			selfUser.setEnabled(true);
			selfUser.setCredentialsNonExpired(true);
			selfUser.setAccountNonLocked(true);
			
		}else{
			selfUser.setAccountNonExpired(false);
			selfUser.setEnabled(false);
			selfUser.setCredentialsNonExpired(false);
			selfUser.setAccountNonLocked(false);
		}
		
		return selfUser;
	}

}
