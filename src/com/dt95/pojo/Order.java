package com.dt95.pojo;

import java.util.Date;

public class Order {
	private int order_id;
	private int payment;
	private String payment_type;
	private int post_fee;
	private int status; //订单支付状态：1，未付款，2，已付款3，未发货4，已发货，5，交易成功，6交易关闭
	private Date create_time;
	private String shipping_name;
	private int user_id;
	private int buy_rate; //买家是否评论 0 ，1
	private Date payment_time;
	private Date consign_time;
	private Date end_time;
	private Date closse_time;
	public Order() {
		super();
	}
	public Order(int order_id, int payment, String payment_type, int post_fee, int status, Date create_time,
			String shipping_name, int user_id, int buy_rate, Date payment_time, Date consign_time, Date end_time,
			Date closse_time) {
		super();
		this.order_id = order_id;
		this.payment = payment;
		this.payment_type = payment_type;
		this.post_fee = post_fee;
		this.status = status;
		this.create_time = create_time;
		this.shipping_name = shipping_name;
		this.user_id = user_id;
		this.buy_rate = buy_rate;
		this.payment_time = payment_time;
		this.consign_time = consign_time;
		this.end_time = end_time;
		this.closse_time = closse_time;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getPayment() {
		return payment;
	}
	public void setPayment(int payment) {
		this.payment = payment;
	}
	public String getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}
	public int getPost_fee() {
		return post_fee;
	}
	public void setPost_fee(int post_fee) {
		this.post_fee = post_fee;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getShipping_name() {
		return shipping_name;
	}
	public void setShipping_name(String shipping_name) {
		this.shipping_name = shipping_name;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getBuy_rate() {
		return buy_rate;
	}
	public void setBuy_rate(int buy_rate) {
		this.buy_rate = buy_rate;
	}
	public Date getPayment_time() {
		return payment_time;
	}
	public void setPayment_time(Date payment_time) {
		this.payment_time = payment_time;
	}
	public Date getConsign_time() {
		return consign_time;
	}
	public void setConsign_time(Date consign_time) {
		this.consign_time = consign_time;
	}
	public Date getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
	public Date getClosse_time() {
		return closse_time;
	}
	public void setClosse_time(Date closse_time) {
		this.closse_time = closse_time;
	}
	
	
}
