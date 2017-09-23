package ldu.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import ldu.dao.UserDao;
import ldu.model.User;

@Component("userService")
public class UserService {
	private UserDao userDao;
	
	@PostConstruct
	public void init(){
		System.out.println("init!");
	}
	public void add(User user){
		
		userDao.save(user);
	}

	public UserDao getUserDao() {
		return userDao;
	}
	@Resource(name="u")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@PreDestroy
	public void destory(){
		System.out.println("destory!");
	}
}
