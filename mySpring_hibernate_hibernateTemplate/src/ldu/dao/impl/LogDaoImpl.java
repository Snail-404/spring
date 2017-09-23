package ldu.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import ldu.dao.LogDao;
import ldu.model.Log;

@Component("logDaoImpl")
public class LogDaoImpl implements LogDao{

	private HibernateTemplate hibernateTemplate;


	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	@Override
	public void save(Log log) {

		hibernateTemplate.save(log);
		System.out.println("log hibernateTemp success");


	}


}
