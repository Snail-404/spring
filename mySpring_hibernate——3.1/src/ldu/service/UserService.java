package ldu.service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import ldu.dao.UserDao;
import ldu.model.User;
@Component("userService")
public class UserService {
	UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}
	
	@Resource(name="userDao")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void add(User user){
		userDao.save(user);
	}
	
	@PostConstruct
	public void start(){
		System.out.println("start");
	}
}
