package com.dt95.Junit;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.dt95.dao.impl.OrderDaoImpl;
import com.dt95.pojo.Order;
import com.dt95.pojo.OrderItem;
import com.dt95.pojo.OrderShipping;

public class OrderTest {
	private OrderDaoImpl odi=new OrderDaoImpl();
	@Test
	public void test() {
		OrderItem oi=new OrderItem(1,13,4,"wewf",4,45,234,"qweqr");
		OrderShipping os=new OrderShipping(1,"阿杰","12312321","湖北省","武汉市","洪山区","关公社区","123123");
		Order o=new Order(1,300,"微信支付",0,1,null,"顺丰快递",1,0,null,null,null,null,"87812389141");
	}
	@Test
	public void test01(){
		String format = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		System.out.println(format);
	}
}
