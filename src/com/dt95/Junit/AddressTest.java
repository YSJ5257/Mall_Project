package com.dt95.Junit;



import java.util.List;

import org.junit.Test;

import com.dt95.pojo.Address;
import com.dt95.service.impl.AddressServiceImpl;

public class AddressTest {
	private AddressServiceImpl asi=new AddressServiceImpl();
	@Test
	public void test() {
		List<Address> list = asi.getAllByUserId(1);
		for (Address address : list) {
			System.out.println(address.getCity_name());
		}
	}

}
