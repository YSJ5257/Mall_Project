package com.dt95.dao;

import java.util.List;

import com.dt95.pojo.ShoppingTrolley;

//购物车接口
public interface CartDao {
	//获取购物车所有商品
	List<ShoppingTrolley> getCartByUserId(int id);
	int deleteCartByCartId(int id);//根据购物车id删除商品
	ShoppingTrolley getCartById(int id);//根据购物车id获取商品
	int updateCartNumber(int id,int num);//更新购物车中商品的数量
}
