package com.dt95.pojo;

public class SmallGoodstype {
	private int small_goodstype_id;
	private int big_goodstype_id;
	private String small_name;
	public SmallGoodstype() {
		super();
	}
	public SmallGoodstype(int small_goodstype_id, int big_goodstype_id, String small_name) {
		super();
		this.small_goodstype_id = small_goodstype_id;
		this.big_goodstype_id = big_goodstype_id;
		this.small_name = small_name;
	}
	public int getSmall_goodstype_id() {
		return small_goodstype_id;
	}
	public void setSmall_goodstype_id(int small_goodstype_id) {
		this.small_goodstype_id = small_goodstype_id;
	}
	public int getBig_goodstype_id() {
		return big_goodstype_id;
	}
	public void setBig_goodstype_id(int big_goodstype_id) {
		this.big_goodstype_id = big_goodstype_id;
	}
	public String getSmall_name() {
		return small_name;
	}
	public void setSmall_name(String small_name) {
		this.small_name = small_name;
	}
	
	
	
}
