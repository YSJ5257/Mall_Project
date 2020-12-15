package com.dt95.pojo;

import java.util.Date;

public class User {
	private int user_id;
	private String username;
	private String password;
	private String sex;
	private Date brith;
	private String  phone;
	private String email;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int user_id, String username, String password, String sex, Date brith, String phone, String email) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.brith = brith;
		this.phone = phone;
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBrith() {
		return brith;
	}
	public void setBrith(Date brith) {
		this.brith = brith;
	}
	
	
	
}
