package com.dt95.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dt95.dao.GoodsIdDao;
import com.dt95.pojo.Goods;
import com.dt95.util.C3P0Util;

public class GoodsIaImpl implements GoodsIdDao{
		QueryRunner qr = new  QueryRunner(C3P0Util.getDataSource());
	@Override
	public List<Goods> queryGoods1() {
		List<Goods> list = null;
		try {
			String sql = "SELECT  * FROM`goods` WHERE style_id = 12 ";
			list = qr.query(sql, new BeanListHandler<Goods>(Goods.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List<Goods> queryGoods2() {
		List<Goods> list2 = null;
		try {
			String sql = "SELECT  * FROM`goods` WHERE style_id = 13";
			list2 = qr.query(sql, new BeanListHandler<Goods>(Goods.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(list2);
		return list2;
	}
	@Override
	public List<Goods> queryGoods3() {
		List<Goods> list3 = null;
		try {
			String sql = "SELECT  * FROM`goods` WHERE style_id =14";
			list3 = qr.query(sql, new BeanListHandler<Goods>(Goods.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list3;
	}

	

}
