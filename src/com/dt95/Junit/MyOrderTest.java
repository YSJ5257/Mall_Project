package com.dt95.Junit;


import java.util.List;

import org.junit.Test;

import com.dt95.pojo.UserOrderInfo;
import com.dt95.service.impl.OrderServiceImpl;

public class MyOrderTest {
	
	private OrderServiceImpl osi = new OrderServiceImpl();
	@Test
	public void test() {
		List<UserOrderInfo> list = osi.getUserOrderInfo(1);
		for (UserOrderInfo u : list) {
			System.out.println(u.getTitle());
		}
	}

}
