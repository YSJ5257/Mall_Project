package com.dt95.pojo;

public class User {
	private int user_id;
	private int username;
	private int password;
	private int sex;
	private int brith;
	public User() {
		super();
	}
	public User(int user_id, int username, int password, int sex, int brith) {
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
	public int getUsername() {
		return username;
	}
	public void setUsername(int username) {
		this.username = username;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getBrith() {
		return brith;
	}
	public void setBrith(int brith) {
		this.brith = brith;
	}
	
}
