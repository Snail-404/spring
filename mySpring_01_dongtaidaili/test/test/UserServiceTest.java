package test;

import java.lang.reflect.Proxy;

import ldu.aop.LogIntercepter;
import ldu.dao.UserDao;
import ldu.dao.impl.UserDaoImpl;
import ldu.model.User;
import ldu.service.UserService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {
	
	public void testAdd() throws Exception{
		
		ClassPathXmlApplicationContext atc=new ClassPathXmlApplicationContext("beans.xml");
		UserService userService=(UserService)atc.getBean("userService");
		User user=new User();
		
		userService.add(user); 
		atc.destroy();
				
	} 
	@Test
	public void testAop() throws Exception{
		UserDao userDao=new UserDaoImpl();
		LogIntercepter li=new LogIntercepter();
		li.setTarget(userDao);
		
		UserDao uesrDaoProxy=(UserDao)Proxy.newProxyInstance(userDao.getClass().getClassLoader(),userDao.getClass().getInterfaces(),li);
		uesrDaoProxy.save(new User());
		uesrDaoProxy.delete();
	}
	
}
