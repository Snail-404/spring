package com.ldu.register.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ldu.register.action.UserAction;

public class UserActionTest {

	@Test
	public void testExecute() throws Exception {
		UserAction ua=new UserAction();
		
		
		String res=ua.execute();
		assertEquals("success", res);
	}

}
