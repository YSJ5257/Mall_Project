package com.dt95.service.impl;

import java.util.List;

import com.dt95.dao.impl.OrderDaoImpl;
import com.dt95.pojo.Order;
import com.dt95.pojo.OrderItem;
import com.dt95.pojo.OrderShipping;
import com.dt95.pojo.UserOrderInfo;
import com.dt95.service.OrderService;

public class OrderServiceImpl implements OrderService{
	private OrderDaoImpl odi=new OrderDaoImpl();

	@Override
	public int addOrder(Order order, List<OrderItem> OrderItem, OrderShipping orderShipping) {
		// TODO Auto-generated method stub
		return odi.addOrder(order, OrderItem, orderShipping);
	}

	@Override
	public List<UserOrderInfo> getUserOrderInfo(int userId) {
		// TODO Auto-generated method stub
		return odi.getUserOrderInfo(userId);
	}
	
	
}
