package com.ldu.register.service.impl;

import java.sql.*;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import com.ldu.register.dao.UserDao;
import com.ldu.register.dao.impl.UserDaoImpl;
import com.ldu.register.model.User;
import com.ldu.register.service.UserManager;
import com.ldu.register.util.HibernateUtil;

public class UserManagerImpl implements UserManager{
	UserDao dao=new UserDaoImpl();
	
	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	/* (non-Javadoc)
	 * @see com.ldu.register.service.UserManager#exists(com.ldu.register.model.User)
	 */
	public boolean exists(User u) throws Exception{
		boolean judge=dao.checkName(u.getUserName());
		return judge;
	}
	
	/* (non-Javadoc)
	 * @see com.ldu.register.service.UserManager#add(com.ldu.register.model.User)
	 */
	public boolean add(User u){
		boolean judge=dao.save(u);
		return judge;
	}
	
}
