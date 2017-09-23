package ldu.dao.impl;

import org.springframework.stereotype.Component;

import ldu.dao.UserDao;
import ldu.model.User;

@Component("u")
public class UserDaoImpl implements UserDao{

	@Override
	public void save(User user) {
		System.out.println("save successful");
		
	}

	@Override
	public void delete() {
		System.out.println("delete successful");
		
	}
	
}
