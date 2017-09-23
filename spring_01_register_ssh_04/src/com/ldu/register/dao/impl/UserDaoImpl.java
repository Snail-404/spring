package com.ldu.register.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.ldu.register.dao.UserDao;
import com.ldu.register.model.User;
import com.ldu.register.util.HibernateUtil;

@Component("userDaoImol")
public class UserDaoImpl implements UserDao{
	private HibernateTemplate hibernateTemplate;
	public boolean checkName(String userName) {
		List<User> list=hibernateTemplate.find("from User u where u.userName = '" + userName + "'");
		if (list!=null && list.size()>0) {
			return true;
		}
		return false;
	}

	public boolean save(User u) {
		hibernateTemplate.save(u);
		return true;
	}
	
	public List<User> getUsers(){
		return (List<User>)hibernateTemplate.find("from User");
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}
