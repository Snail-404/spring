package com.ldu.register.service;

import java.sql.*;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import com.ldu.register.model.User;
import com.ldu.register.util.HibernateUtil;

public class UserManager{
	private Query query;
	public boolean exists(User u) throws Exception{
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session s=sf.getCurrentSession();
		s.beginTransaction();
//		long count = (Long)s.createQuery("select count(*) from User u where u.userName = :userName")
//				.setString("userName", u.getUserName())
//				.uniqueResult();
		String hsql="from User as u where u.userName=?";
		
		query=s.createQuery(hsql);
		query.setParameter(0, u.getUserName());
		List<User> list=query.list();
		s.getTransaction().commit();
		
		if (list.size()>0) {
			return true;
		}
		return false;
	}
	
	public boolean add(User u){
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
