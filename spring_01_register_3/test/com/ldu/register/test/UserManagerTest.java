package com.ldu.register.test;

import org.junit.Assert;

import org.junit.Test;

import com.ldu.register.model.User;
import com.ldu.register.service.UserManager;

public class UserManagerTest {

	@Test
	public void testExists() throws Exception {
		UserManager um=new UserManager();
		User u=new User();
		u.setUserName("v");
		boolean exists=um.exists(u);
		Assert.assertEquals(true, exists);
	}

	@Test
	public void testAdd() {
		UserManager um=new UserManager();
		User u=new User();
		u.setUserName("ad");
		u.setPassWord("123");
		
		boolean add=um.add(u);
		Assert.assertEquals(true, add);
	}

}
