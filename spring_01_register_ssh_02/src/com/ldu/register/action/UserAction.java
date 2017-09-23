package com.ldu.register.action;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.ldu.register.model.User;
import com.ldu.register.service.UserManager;
import com.ldu.register.service.impl.UserManagerImpl;
import com.opensymphony.xwork2.ActionSupport;

@Component("register")
@Scope("prototype")
public class UserAction extends ActionSupport{
	private String userName;
	private String passWord;
	private String passWord2;
	UserManager um;

	public UserManager getUm() {
		return um;
	}
	@Resource(name="userManagerImpl")
	public void setUm(UserManager um) {
		this.um = um;
	}
	
	@Override
	public String execute() throws Exception {
		
		User user=new User();
		user.setUserName(userName);
		user.setPassWord(passWord);
		if (um.exists(user)) {	
			return "fail";
			
		}else
			um.add(user);
		return "success";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getPassWord2() {
		return passWord2;
	}
	public void setPassWord2(String passWord2) {
		this.passWord2 = passWord2;
	}
}
