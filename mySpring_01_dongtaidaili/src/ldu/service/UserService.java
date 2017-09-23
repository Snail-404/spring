package ldu.service;

import java.lang.reflect.Proxy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import ldu.aop.LogIntercepter;
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
		LogIntercepter li=new LogIntercepter();
		li.setTarget(userDao);
		
		UserDao uesrDaoProxy=(UserDao)Proxy.newProxyInstance(userDao.getClass().getClassLoader(),userDao.getClass().getInterfaces(),li);
		
		
		uesrDaoProxy.save(user);
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
