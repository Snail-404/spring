package ldu.dao.impl;

import javax.annotation.Resource;

import ldu.dao.UserDao;
import ldu.model.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component("userDaoImpl")
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
		// TODO Auto-generated method stub
		hibernateTemplate.save(user);
		
	}
	/*private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(User user) {
		Session session=sessionFactory.openSession();
		//session.beginTransaction();
		session.save(user);
		//session.getTransaction().commit();
		System.out.println("save success!!!");
		
	}
*/
}
