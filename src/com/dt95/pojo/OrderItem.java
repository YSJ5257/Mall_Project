package com.dt95.pojo;

public class OrderItem {
	private int id;
	private int goods_id;
	private int order_id;
	private String title;
	private int num;
	private int price;
	private long total_fee;
	private String pic_path;
	public OrderItem() {
		super();
	}
	public OrderItem(int id, int goods_id, int order_id, String title, int num, int price, long total_fee,
			String pic_path) {
		super();
		this.id = id;
		this.goods_id = goods_id;
		this.order_id = order_id;
		this.title = title;
		this.num = num;
		this.price = price;
		this.total_fee = total_fee;
		this.pic_path = pic_path;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public long getTotal_fee() {
		return total_fee;
	}
	public void setTotal_fee(long total_fee) {
		this.total_fee = total_fee;
	}
	public String getPic_path() {
		return pic_path;
	}
	public void setPic_path(String pic_path) {
		this.pic_path = pic_path;
	}
	
}
