package ldu.test;

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
		User u = new User();
		userService.add(u);
	}

}
