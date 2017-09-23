package com.ldu.register.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ldu.register.action.UserAction;

public class UserActionTest {

	@Test
	public void testExecute() throws Exception {
		UserAction ua=new UserAction();
		
		
		String res=ua.execute();
		assertEquals("success", res);
	}
	
	@Test
	public void testlist(){
		ApplicationContext act=new ClassPathXmlApplicationContext("beans.xml");
		UserAction ua=(UserAction) act.getBean("register");
		ua.list();
		assertTrue(ua.getUsers().size()>0);
	}
}
