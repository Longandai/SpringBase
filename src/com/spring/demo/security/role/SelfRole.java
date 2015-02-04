package com.spring.demo.security.role;

import org.springframework.security.core.GrantedAuthority;

public class SelfRole  implements GrantedAuthority{
	public SelfRole(){
	}
	public SelfRole(String authority){
		this.authority = authority;
	}
	private String authority;
	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return this.authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}

}
