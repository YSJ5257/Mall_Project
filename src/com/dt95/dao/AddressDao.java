package com.dt95.dao;

import java.util.List;

import com.dt95.pojo.Address;

public interface AddressDao {
	List<Address> getAllByUserId(int userId);//根据用户id获取所有的地址信息
	int removeByAddressId(int adressId);//根据地址id删除地址信息
	int addAddress(Address address); //添加
	int modifyAddress(Address address);
}
