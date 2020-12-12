package com.dt95.pojo;

import java.util.Date;

public class User {
	private int user_id;
	private String username;
	private String password;
	private char sex;
	private Date brith;
	public User() {
		super();
	}
	public User(int user_id, String username, String password, char sex, Date brith) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.brith = brith;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public Date getBrith() {
		return brith;
	}
	public void setBrith(Date brith) {
		this.brith = brith;
	}
	
	
	
}
