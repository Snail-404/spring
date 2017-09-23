package com.bjsxt.service;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;



public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		ApplicationContext atc = new ClassPathXmlApplicationContext("beans.xml");
		
		
		UserService service = (UserService)atc.getBean("userService");
		
		
		
		
		
		User u = new User();
		/*u.setUsername("zhangsan");
		u.setPassword("zhangsan");*/
		service.add(u);
	}

}
