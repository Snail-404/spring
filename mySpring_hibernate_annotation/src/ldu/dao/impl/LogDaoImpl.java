package ldu.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Component;

import ldu.dao.LogDao;
import ldu.model.Log;

@Component("logDaoImpl")
public class LogDaoImpl implements LogDao{

private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	

	@Override
	public void save(Log log) {
	
		Session session=sessionFactory.getCurrentSession();		
		session.save(log);
		//throw new RuntimeException("error");
					
		
	}
	
	
}
