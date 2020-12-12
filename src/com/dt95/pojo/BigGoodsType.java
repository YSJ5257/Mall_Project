package com.dt95.pojo;

public class BigGoodsType {
	private int big_goodstype_id;
	private String big_goodstype;
	
	public BigGoodsType() {
		super();
	}
	public BigGoodsType(int big_goodstype_id, String big_goodstype) {
		super();
		this.big_goodstype_id = big_goodstype_id;
		this.big_goodstype = big_goodstype;
	}
	public int getBig_goodstype_id() {
		return big_goodstype_id;
	}
	public void setBig_goodstype_id(int big_goodstype_id) {
		this.big_goodstype_id = big_goodstype_id;
	}
	public String getBig_goodstype() {
		return big_goodstype;
	}
	public void setBig_goodstype(String big_goodstype) {
		this.big_goodstype = big_goodstype;
	}
	
}
