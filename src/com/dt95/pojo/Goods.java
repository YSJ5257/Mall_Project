package com.dt95.pojo;

import java.util.Date;

public class Goods {
	private int goods_id;
	private String goods_name;
	private String goods_describe;
	private int goods_price;
	private int big_goodstype_id;
	private int small_goodstype_id;
	private int style_id;
	private String goods_photo;
	private Date time_to_market;
	private int sales_num;
	
	public Goods() {
		super();
	}
	public Goods(int goods_id, String goods_name, String goods_describe, int goods_price, int big_goodstype_id,
			int small_goodstype_id, int style_id, String goods_photo, Date time_to_market, int sales_num) {
		super();
		this.goods_id = goods_id;
		this.goods_name = goods_name;
		this.goods_describe = goods_describe;
		this.goods_price = goods_price;
		this.big_goodstype_id = big_goodstype_id;
		this.small_goodstype_id = small_goodstype_id;
		this.style_id = style_id;
		this.goods_photo = goods_photo;
		this.time_to_market = time_to_market;
		this.sales_num = sales_num;
	}
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public String getGoods_describe() {
		return goods_describe;
	}
	public void setGoods_describe(String goods_describe) {
		this.goods_describe = goods_describe;
	}
	public int getGoods_price() {
		return goods_price;
	}
	public void setGoods_price(int goods_price) {
		this.goods_price = goods_price;
	}
	public int getBig_goodstype_id() {
		return big_goodstype_id;
	}
	public void setBig_goodstype_id(int big_goodstype_id) {
		this.big_goodstype_id = big_goodstype_id;
	}
	public int getSmall_goodstype_id() {
		return small_goodstype_id;
	}
	public void setSmall_goodstype_id(int small_goodstype_id) {
		this.small_goodstype_id = small_goodstype_id;
	}
	public int getStyle_id() {
		return style_id;
	}
	public void setStyle_id(int style_id) {
		this.style_id = style_id;
	}
	public String getGoods_photo() {
		return goods_photo;
	}
	public void setGoods_photo(String goods_photo) {
		this.goods_photo = goods_photo;
	}
	public Date getTime_to_market() {
		return time_to_market;
	}
	public void setTime_to_market(Date time_to_market) {
		this.time_to_market = time_to_market;
	}
	public int getSales_num() {
		return sales_num;
	}
	public void setSales_num(int sales_num) {
		this.sales_num = sales_num;
	}
	
}
