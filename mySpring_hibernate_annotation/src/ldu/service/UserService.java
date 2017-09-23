package ldu.service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import ldu.dao.LogDao;
import ldu.dao.UserDao;
import ldu.model.Log;
import ldu.model.User;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("userService")
public class UserService {
	UserDao userDao;
	LogDao logDao;
	
	


	public LogDao getLogDao() {
		return logDao;
	}
	@Resource(name="logDaoImpl")
	public void setLogDao(LogDao logDao) {
		this.logDao = logDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}
	
	@Resource(name="userDao")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Transactional
	public void add(User user){
		userDao.save(user);
		Log log=new Log();
		log.setMsg("make log");
		logDao.save(log);
		
	}
	
	@PostConstruct
	public void start(){
		System.out.println("start");
	}
}
