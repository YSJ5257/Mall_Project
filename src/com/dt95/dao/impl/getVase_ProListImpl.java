package com.dt95.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dt95.dao.getVase_ProList;
import com.dt95.pojo.Goods;
import com.dt95.util.C3P0Util;

public class getVase_ProListImpl implements getVase_ProList{

	@Override
	public List<Goods> getvase_proList() {
		// TODO Auto-generated method stub
		List<Goods> list=new ArrayList<Goods>();
		QueryRunner qr=new QueryRunner(C3P0Util.getDataSource());
		try {
			String sql="SELECT * FROM goods WHERE goods_id>38";
			list = qr.query(sql, new BeanListHandler<Goods>(Goods.class));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	
}
