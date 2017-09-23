package test;

import ldu.model.User;
import ldu.service.UserService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {
	@Test
	public void testAdd() throws Exception{
		ClassPathXmlApplicationContext atc=new ClassPathXmlApplicationContext("beans.xml");
		UserService userService=(UserService)atc.getBean("userService");
		User user=new User();
		
		userService.add(user); 
		atc.destroy();
		
		
		
	} 
	
}
