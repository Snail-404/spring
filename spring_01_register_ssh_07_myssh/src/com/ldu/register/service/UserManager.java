package com.ldu.register.service;

import java.util.List;

import com.ldu.register.model.User;

public interface UserManager {

	public abstract boolean exists(User u) throws Exception;

	public abstract boolean add(User u);
	public List<User> getUsers();
	public User findUser(int id);
}