package com.ldu.register.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import com.ldu.register.dao.UserDao;
import com.ldu.register.model.User;
import com.ldu.register.util.HibernateUtil;

public class UserDaoImpl implements UserDao{
	private Query query;
	public boolean checkName(String userName) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session s=sf.getCurrentSession();
		s.beginTransaction();

		String hsql="from User as u where u.userName=?";
		
		query=s.createQuery(hsql);
		query.setParameter(0, userName);
		List<User> list=query.list();
		s.getTransaction().commit();
		
		if (list.size()>0) {
			return true;
		}
		return false;
	}

	public boolean save(User u) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session s=sf.getCurrentSession();
		s.beginTransaction();
		int count=(Integer)s.save(u);
		s.getTransaction().commit();
		if (count>0) {
			return true;
		}else
			return false;
	}
	
}
