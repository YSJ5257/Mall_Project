package com.dt95.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dt95.dao.AddressDao;
import com.dt95.pojo.Address;
import com.dt95.util.C3P0Util;

public class AddressDaoImpl implements AddressDao{

	private QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
	
	@Override
	public List<Address> getAllByUserId(int userId) {
		String sql="SELECT * FROM `adress` WHERE user_id=?";
		List<Address> list=null;
		try {
			list = qr.query(sql,  new BeanListHandler<>(Address.class),userId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int removeByAddressId(int adressId) {
		int result=0;
		String sql="DELETE FROM `adress` WHERE adress_id=?";
		try {
			result = qr.update(sql, adressId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int addAddress(Address address) {
		int update=0;
		try {
			String sql="INSERT INTO adress VALUES(null,?,?,?,?,?,?,?,?)";
			update = qr.update(sql,
					address.getUser_id(),
					address.getConsignee_name(),
					address.getConsignee_phone(),
					address.getProvincer_name(),
					address.getCity_name(),
					address.getQuxian_name(),
					address.getMinute_adress(),
					address.getPostcode_adress());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return update;
	}

	@Override
	public int modifyAddress(Address address) {
		int update=0;
		try {
			String sql="UPDATE adress SET Consignee_name=?, Consignee_phone=?,Provincer_name=?,City_name=?,Quxian_name=?,Minute_adress=?,Postcode_adress=? WHERE adress_id=?";
			update = qr.update(sql,
					address.getConsignee_name(),
					address.getConsignee_phone(),
					address.getProvincer_name(),
					address.getCity_name(),
					address.getQuxian_name(),
					address.getMinute_adress(),
					address.getPostcode_adress(),
					address.getAdress_id());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return update;
	}

	

}
