package ldu.dao.impl;

import javax.annotation.Resource;

import ldu.dao.UserDao;
import ldu.model.User;

import org.hibernate.classic.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDaoImpl implements UserDao{
	
	private HibernateTemplate hibernateTemplate;
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	@Override
	public void save(User user) {
	
		hibernateTemplate.save(user);					
		System.out.println("hibernateTemplate successful");
		
	}

	

}
