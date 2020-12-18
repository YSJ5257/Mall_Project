package com.dt95.pojo;

public class OrderShipping {
	private int order_id ;
	private String receiver_name;
	private String receiver_phone;
	private String receiver_province;
	private String receiver_city;
	private String receiver_district;
	private String receiver_address;
	private String receiver_zip;
	public OrderShipping() {
		super();
	}
	public OrderShipping(int order_id, String receiver_name, String receiver_phone, String receiver_province,
			String receiver_city, String receiver_district, String receiver_address, String receiver_zip) {
		super();
		this.order_id = order_id;
		this.receiver_name = receiver_name;
		this.receiver_phone = receiver_phone;
		this.receiver_province = receiver_province;
		this.receiver_city = receiver_city;
		this.receiver_district = receiver_district;
		this.receiver_address = receiver_address;
		this.receiver_zip = receiver_zip;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getReceiver_name() {
		return receiver_name;
	}
	public void setReceiver_name(String receiver_name) {
		this.receiver_name = receiver_name;
	}
	public String getReceiver_phone() {
		return receiver_phone;
	}
	public void setReceiver_phone(String receiver_phone) {
		this.receiver_phone = receiver_phone;
	}
	public String getReceiver_province() {
		return receiver_province;
	}
	public void setReceiver_province(String receiver_province) {
		this.receiver_province = receiver_province;
	}
	public String getReceiver_city() {
		return receiver_city;
	}
	public void setReceiver_city(String receiver_city) {
		this.receiver_city = receiver_city;
	}
	public String getReceiver_district() {
		return receiver_district;
	}
	public void setReceiver_district(String receiver_district) {
		this.receiver_district = receiver_district;
	}
	public String getReceiver_address() {
		return receiver_address;
	}
	public void setReceiver_address(String receiver_address) {
		this.receiver_address = receiver_address;
	}
	public String getReceiver_zip() {
		return receiver_zip;
	}
	public void setReceiver_zip(String receiver_zip) {
		this.receiver_zip = receiver_zip;
	}
	
	
}
