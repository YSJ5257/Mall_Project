package com.dt95.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dt95.dao.CartDao;
import com.dt95.pojo.ShoppingTrolley;
import com.dt95.util.C3P0Util;

public class CartDaoImpl implements CartDao{
	//得到数据源
	private QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
	
	@Override
	public List<ShoppingTrolley> getCartByUserId(int id) {  //获取用户购物车数据
		List<ShoppingTrolley> list=null;
		String sql="SELECT * FROM shopping_trolley WHERE user_id=?";
		try {
			 list = qr.query(sql, new BeanListHandler<>(ShoppingTrolley.class), id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int deleteCartByCartId(int id) {
		int result=0;
		String sql="DELETE FROM `shopping_trolley` WHERE shopping_trolley_id=?";
		try {
			result = qr.update(sql, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public ShoppingTrolley getCartById(int id) {
		String sql="SELECT * FROM shopping_trolley WHERE shopping_trolley_id = ?";
		List<ShoppingTrolley> list=null;
		try {
			list = qr.query(sql,new BeanListHandler<>(ShoppingTrolley.class),id );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list.get(0);
	}

	@Override
	public int updateCartNumber(int id,int num) {
		int result=0;
		String sql="UPDATE `shopping_trolley` SET specification_number=? WHERE shopping_trolley_id=?";
		try {
			result = qr.update(sql, num,id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
