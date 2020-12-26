package com.dt95.service.impl;

import java.util.List;

import com.dt95.dao.impl.AddressDaoImpl;
import com.dt95.pojo.Address;
import com.dt95.service.AddressService;

public class AddressServiceImpl implements AddressService{
	private AddressDaoImpl adi=new AddressDaoImpl();
	@Override
	public List<Address> getAllByUserId(int userId) {
		// TODO Auto-generated method stub
		return adi.getAllByUserId(userId);
	}

	@Override
	public int removeByAddressId(int adressId) {
		// TODO Auto-generated method stub
		return adi.removeByAddressId(adressId);
	}

	@Override
	public int addAddress(Address address) {
		// TODO Auto-generated method stub
		return adi.addAddress(address);
	}

	@Override
	public int modifyAddress(Address address) {
		// TODO Auto-generated method stub
		return adi.modifyAddress(address);
	}

}
