package ldu.dao.impl;

import org.springframework.stereotype.Component;

import ldu.aop.LogIntercepter;
import ldu.dao.UserDao;
import ldu.model.User;
@Component("u2")
public class UerDaoImpl3 implements UserDao{
	UserDao userDao=new UserDaoImpl();

	@Override
	public void save(User user) {
		new LogIntercepter().beforeSave();
		userDao.save(user);
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	

}
