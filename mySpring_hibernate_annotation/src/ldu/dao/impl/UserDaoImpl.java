package ldu.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import org.springframework.stereotype.Component;

import ldu.dao.UserDao;
import ldu.model.User;

@Component("userDao")
public class UserDaoImpl implements UserDao{
	
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	

	@Override
	public void save(User user) {
	
		Session session=sessionFactory.getCurrentSession();
		
		session.save(user);

		
					
		System.out.println("save successful");
		
	}

	

}
