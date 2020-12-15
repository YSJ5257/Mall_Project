package com.dt95.service.impl;
import com.dt95.dao.UserDao;
import com.dt95.dao.impl.UserDaoImpl;
import com.dt95.pojo.User;
import com.dt95.service.UserService;

public class UserServiceImpl implements UserService{
	UserDao ud = new UserDaoImpl();
	@Override
	public int addUser(String email) {
		// TODO Auto-generated method stub
		return ud.addUser(email);
	}
	
	@Override
	public boolean findUserLoginInfo(String username, String password) {
		// TODO Auto-generated method stub
		return ud.findUserLoginInfo(username, password);
	}

	@Override
	public boolean findUserRegInfo(String email) {
		// TODO Auto-generated method stub
		return ud.findUserRegInfo(email);
	}

	@Override
	public boolean findUserPhoneInfo(String phone) {
		// TODO Auto-generated method stub
		return ud.findUserPhoneInfo(phone);
	}

	

}
