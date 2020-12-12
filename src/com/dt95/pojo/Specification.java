package com.dt95.pojo;

public class Specification {
	private int specification_id;
	private int goods_id;
	private String specification_name;
	private int specification_number;
	private int specification_price;
	private String specification_photo;
	
	public Specification() {
		super();
	}

	public Specification(int specification_id, int goods_id, String specification_name, int specification_number,
			int specification_price, String specification_photo) {
		super();
		this.specification_id = specification_id;
		this.goods_id = goods_id;
		this.specification_name = specification_name;
		this.specification_number = specification_number;
		this.specification_price = specification_price;
		this.specification_photo = specification_photo;
	}

	public int getSpecification_id() {
		return specification_id;
	}

	public void setSpecification_id(int specification_id) {
		this.specification_id = specification_id;
	}

	public int getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}

	public String getSpecification_name() {
		return specification_name;
	}

	public void setSpecification_name(String specification_name) {
		this.specification_name = specification_name;
	}

	public int getSpecification_number() {
		return specification_number;
	}

	public void setSpecification_number(int specification_number) {
		this.specification_number = specification_number;
	}

	public int getSpecification_price() {
		return specification_price;
	}

	public void setSpecification_price(int specification_price) {
		this.specification_price = specification_price;
	}

	public String getSpecification_photo() {
		return specification_photo;
	}

	public void setSpecification_photo(String specification_photo) {
		this.specification_photo = specification_photo;
	}
	
}
