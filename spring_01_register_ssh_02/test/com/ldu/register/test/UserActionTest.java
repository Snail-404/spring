package com.ldu.register.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ldu.register.action.UserAction;

public class UserActionTest {

	@Test
	public void testExecute() throws Exception {
		UserAction ua=new UserAction();
		ua.setUserName("test4");
		ua.setPassWord("123");
		
		String res=ua.execute();
		assertEquals("success", res);
	}

}
