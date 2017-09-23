package com.ldu.register.dao;

import java.util.List;

import com.ldu.register.model.User;

public interface UserDao {
	public boolean checkName(String userName); 
	public boolean save(User u);
	public List<User> getUsers();
}
