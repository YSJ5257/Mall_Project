package com.dt95.pojo;

public class Adress {
	private int adress_id;
	private int user_id;
	private String user_name;
	private int user_phone;
	private String provincer_name;
	private String city_name;
	private String quxian_name;
	private String minute_adress;
	private String postcode_adress;
	
	public Adress() {
		super();
	}
	public Adress(int adress_id, int user_id, String user_name, int user_phone, String provincer_name, String city_name,
			String quxian_name, String minute_adress, String postcode_adress) {
		super();
		this.adress_id = adress_id;
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_phone = user_phone;
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
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public int getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(int user_phone) {
		this.user_phone = user_phone;
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
