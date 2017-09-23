package com.ldu.register.action;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

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
		user.setUserName(info.getUserName());
		user.setPassWord(info.getUserName());
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
}
