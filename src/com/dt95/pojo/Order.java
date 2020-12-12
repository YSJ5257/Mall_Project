package com.dt95.pojo;

import java.util.Date;

public class Order {
	private int order_id;
	private int goods_id;
	private int user_id;
	private Date order_time;
	private int order_num;
	private String order_type;
	private int order_money;
	
	public Order() {
		super();
	}
	public Order(int order_id, int goods_id, int user_id, Date order_time, int order_num, String order_type,
			int order_money) {
		super();
		this.order_id = order_id;
		this.goods_id = goods_id;
		this.user_id = user_id;
		this.order_time = order_time;
		this.order_num = order_num;
		this.order_type = order_type;
		this.order_money = order_money;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Date getOrder_time() {
		return order_time;
	}
	public void setOrder_time(Date order_time) {
		this.order_time = order_time;
	}
	public int getOrder_num() {
		return order_num;
	}
	public void setOrder_num(int order_num) {
		this.order_num = order_num;
	}
	public String getOrder_type() {
		return order_type;
	}
	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}
	public int getOrder_money() {
		return order_money;
	}
	public void setOrder_money(int order_money) {
		this.order_money = order_money;
	}
	
}
