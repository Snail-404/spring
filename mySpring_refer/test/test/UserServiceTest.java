package test;

import ldu.model.User;
import ldu.service.UserService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {
	@Test
	public void testAdd(){
		ApplicationContext atc=new ClassPathXmlApplicationContext("beans.xml");
		UserService userService=(UserService)atc.getBean("userService");
		User user=new User();
		user.setUserName("kkk");
		user.setPassWord("123456");
		userService.add(user);
	}

}
