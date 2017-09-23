package com.ldu.register.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.support.OpenSessionInViewFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ContextLoaderListener;

import com.ldu.register.model.User;
import com.ldu.register.service.UserManager;
import com.ldu.register.service.impl.UserManagerImpl;
import com.ldu.register.vo.UserRegisterInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Component("register")
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven{
	private UserRegisterInfo info =new UserRegisterInfo();
	private UserManager um;
	private List<User> users;
	private User user;
	
	public UserManager getUm() {
		return um;
	}
	@Resource(name="userManagerImpl")
	public void setUm(UserManager um) {
		this.um = um;
	}
	
	public String list(){
		this.users=this.um.getUsers();
		return "list";
	}
	public String findUser(){
		user=um.findUser(43);
		return "find";
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println(info.getUserName());
		User user=new User();
		user.setUserName(info.getUserName());
		user.setPassWord(info.getPassWord());
		if (um.exists(user)) {	
			return "fail";
			
		}else
			um.add(user);
		return "success";
	}
	
	public Object getModel() {
		
		return info;
	}
	public UserRegisterInfo getInfo() {
		return info;
	}
	public void setInfo(UserRegisterInfo info) {
		this.info = info;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
