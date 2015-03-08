package com.spring.demo.user.dao.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.spring.demo.security.role.SelfRole;
import com.spring.demo.security.user.SelfUser;
import com.spring.demo.user.dao.UserDao;
@Component("userDao")
public class UserDaoImpl implements UserDao {
	@Resource
	JdbcTemplate jdbcTemplate;
	
	@Override
	public SelfUser getUserByName(String userName) {
		// TODO Auto-generated method stub
		String sql = "select u.user_name,r.role_name,u.user_password  from"
				+ " org_role r,org_user u,org_role_map m  "
				+ "where m.role_id = r.role_id and m.user_id= u.user_id and u.user_name = '"+userName+"'";
		SqlRowSet row= jdbcTemplate.queryForRowSet(sql);
		SelfUser f=new SelfUser();
		f.setUsername(userName);
		Set<SelfRole> roleSet = new HashSet<SelfRole>();
		while(row.next()){
			f.setPassword(row.getString("user_password"));
			roleSet.add(new SelfRole(row.getString("role_name")));
		}
		f.setAuthorities(roleSet);
		f.setAccountNonExpired(true);
		f.setEnabled(true);
		f.setCredentialsNonExpired(true);
		f.setAccountNonLocked(true);
		return f;
	}

}
