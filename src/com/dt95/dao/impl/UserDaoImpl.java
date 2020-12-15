package com.dt95.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dt95.dao.UserDao;
import com.dt95.pojo.User;
import com.dt95.util.C3P0Util;

public class UserDaoImpl implements UserDao {
	QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());//得到数据源
	@Override
	public int addUser(String email) {
		 int num = 0;
		try {
			String sql = "INSERT INTO USER VALUES(NULL,NULL,NULL,NULL,NULL,NULL,?)";
			num = qr.update(sql, email);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return num;
	}
	@Override
	public boolean findUserLoginInfo(String username,String password) {
		List<User> list = null;
		boolean b = false;
		try {
			String sql = "SELECT * FROM user WHERE username = ? AND password=?";
			list = qr.query(sql,new BeanListHandler<User>(User.class),username,password);
			if(list.size()>0){
				b = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}
	@Override
	public boolean findUserRegInfo(String email) {
		List<User> list = null;
		boolean b = false;
		try {
			String sql = "SELECT * FROM user WHERE email = ?";
			list = qr.query(sql,new BeanListHandler<User>(User.class),email);
			if(list.size()>0){
				b = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
			return b;
		}
	@Override
	public boolean findUserPhoneInfo(String phone) {
		List<User> list = null;
		boolean b = false;
		try {
			String sql = "SELECT * FROM user WHERE phone = ?";
			list = qr.query(sql,new BeanListHandler<User>(User.class),phone);
			if(list.size()>0){
				b = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
			return b;
	
	}}