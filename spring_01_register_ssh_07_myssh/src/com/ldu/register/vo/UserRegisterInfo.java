package com.ldu.register.vo;

public class UserRegisterInfo {
	private int id;
	private String userName;
	private String passWord;
	private String passWord2;
	
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
