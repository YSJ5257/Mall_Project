package com.dt95.pojo;

public class ShoppingTrolley {
	private int user_id;
	private int shopping_trolley_id;
	private int goods_id;
	private String goods_describe;
	private String specification_name;
	private int specification_price;
	private int specification_number;
	private String specification_photo;
	
	public ShoppingTrolley() {
		super();
	}

	public ShoppingTrolley(int user_id, int shopping_trolley_id, int goods_id, String goods_describe,
			String specification_name, int specification_price, int specification_number, String specification_photo) {
		super();
		this.user_id = user_id;
		this.shopping_trolley_id = shopping_trolley_id;
		this.goods_id = goods_id;
		this.goods_describe = goods_describe;
		this.specification_name = specification_name;
		this.specification_price = specification_price;
		this.specification_number = specification_number;
		this.specification_photo = specification_photo;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getShopping_trolley_id() {
		return shopping_trolley_id;
	}

	public void setShopping_trolley_id(int shopping_trolley_id) {
		this.shopping_trolley_id = shopping_trolley_id;
	}

	public int getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}

	public String getGoods_describe() {
		return goods_describe;
	}

	public void setGoods_describe(String goods_describe) {
		this.goods_describe = goods_describe;
	}

	public String getSpecification_name() {
		return specification_name;
	}

	public void setSpecification_name(String specification_name) {
		this.specification_name = specification_name;
	}

	public int getSpecification_price() {
		return specification_price;
	}

	public void setSpecification_price(int specification_price) {
		this.specification_price = specification_price;
	}

	public int getSpecification_number() {
		return specification_number;
	}

	public void setSpecification_number(int specification_number) {
		this.specification_number = specification_number;
	}

	public String getSpecification_photo() {
		return specification_photo;
	}

	public void setSpecification_photo(String specification_photo) {
		this.specification_photo = specification_photo;
	}
	
}
