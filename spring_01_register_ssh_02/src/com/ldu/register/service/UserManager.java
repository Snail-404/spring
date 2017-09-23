package com.ldu.register.service;

import com.ldu.register.model.User;

public interface UserManager {

	public abstract boolean exists(User u) throws Exception;

	public abstract boolean add(User u);

}