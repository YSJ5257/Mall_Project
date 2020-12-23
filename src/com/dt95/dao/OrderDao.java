package com.dt95.dao;

import java.util.List;

import com.dt95.pojo.Order;
import com.dt95.pojo.OrderItem;
import com.dt95.pojo.OrderShipping;
import com.dt95.pojo.UserOrderInfo;

public interface OrderDao {
	int addOrder(Order order,List<OrderItem> OrderItem,OrderShipping orderShipping);
	List<UserOrderInfo> getUserOrderInfo (int userId);
}
