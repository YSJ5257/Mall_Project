package com.dt95.pojo;

public class Address {
	private int adress_id;
	private int user_id;
	private String consignee_name;
	private String consignee_phone;
	private String provincer_name;
	private String city_name;
	private String quxian_name;
	private String minute_adress;
	private String postcode_adress;
	
	public Address() {
		super();
	}
	public Address(int adress_id, int user_id, String consignee_name, String consignee_phone, String provincer_name,
			String city_name, String quxian_name, String minute_adress, String postcode_adress) {
		super();
		this.adress_id = adress_id;
		this.user_id = user_id;
		this.consignee_name = consignee_name;
		this.consignee_phone = consignee_phone;
		this.provincer_name = provincer_name;
		this.city_name = city_name;
		this.quxian_name = quxian_name;
		this.minute_adress = minute_adress;
		this.postcode_adress = postcode_adress;
	}
	public int getAdress_id() {
		return adress_id;
	}
	public void setAdress_id(int adress_id) {
		this.adress_id = adress_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getConsignee_name() {
		return consignee_name;
	}
	public void setConsignee_name(String consignee_name) {
		this.consignee_name = consignee_name;
	}
	public String getConsignee_phone() {
		return consignee_phone;
	}
	public void setConsignee_phone(String consignee_phone) {
		this.consignee_phone = consignee_phone;
	}
	public String getProvincer_name() {
		return provincer_name;
	}
	public void setProvincer_name(String provincer_name) {
		this.provincer_name = provincer_name;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getQuxian_name() {
		return quxian_name;
	}
	public void setQuxian_name(String quxian_name) {
		this.quxian_name = quxian_name;
	}
	public String getMinute_adress() {
		return minute_adress;
	}
	public void setMinute_adress(String minute_adress) {
		this.minute_adress = minute_adress;
	}
	public String getPostcode_adress() {
		return postcode_adress;
	}
	public void setPostcode_adress(String postcode_adress) {
		this.postcode_adress = postcode_adress;
	}
	
	
}
