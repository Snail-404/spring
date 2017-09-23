package com.ldu.register.service.impl;

import java.sql.*;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Component;

import com.ldu.register.dao.UserDao;
import com.ldu.register.dao.impl.UserDaoImpl;
import com.ldu.register.model.User;
import com.ldu.register.service.UserManager;
import com.ldu.register.util.HibernateUtil;

@Component("userManagerImpl")
public class UserManagerImpl implements UserManager{
	UserDao dao;
	
	public UserDao getDao() {
		return dao;
	}
	@Resource(name="userDaoImol")
	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	
	public boolean exists(User u) throws Exception{
		boolean judge=dao.checkName(u.getUserName());
		return judge;
	}
	
	
	public boolean add(User u){
		boolean judge=dao.save(u);
		return judge;
	}
	
	public List<User> getUsers(){
		return dao.getUsers();
	}
	public User findUser(int id) {
		
		return dao.loadUser(id);
	}
	
}
