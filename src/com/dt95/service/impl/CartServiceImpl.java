package com.dt95.service.impl;

import java.util.List;

import com.dt95.dao.impl.CartDaoImpl;
import com.dt95.pojo.ShoppingTrolley;
import com.dt95.service.CartService;

public class CartServiceImpl implements CartService{
	private CartDaoImpl cdi=new CartDaoImpl();

	@Override
	public List<ShoppingTrolley> getCartByUserId(int id) {
		return cdi.getCartByUserId(id);
	}

	@Override
	public int deleteCartByCartId(int id) {
		return cdi.deleteCartByCartId(id);
	}

	@Override
	public ShoppingTrolley getCartById(int id) {
		// TODO Auto-generated method stub
		return cdi.getCartById(id);
	}

	@Override
	public int updateCartNumber(int id,int num) {
		// TODO Auto-generated method stub
		return cdi.updateCartNumber(id ,num);
	}

}
