package com.dt95.dao;

public interface UserDao {
		//添加
		int addUser( String email);
		//查询账户密码
		//boolean findUserInfo(String username ,String email ,String phone,String password);
		//查询用户名密码
	    boolean findUserLoginInfo(String username ,String password);
	  //查询登录email
	    boolean findUserRegInfo(String email );
	  //查询phone
	    boolean findUserPhoneInfo(String phone );
	
	    
}
