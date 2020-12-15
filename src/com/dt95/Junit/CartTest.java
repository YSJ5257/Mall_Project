package com.dt95.Junit;


import java.util.List;

import org.junit.Test;

import com.dt95.pojo.ShoppingTrolley;
import com.dt95.service.impl.CartServiceImpl;

public class CartTest {

	@Test
	public void test() {
		CartServiceImpl csi=new CartServiceImpl();
		List<ShoppingTrolley> list = csi.getCartByUserId(1);
		System.out.print(list);
	}

}
