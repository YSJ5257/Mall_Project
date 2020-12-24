package com.dt95.service.impl;

import java.util.List;

import com.dt95.dao.GoodsIdDao;
import com.dt95.dao.impl.GoodsIaImpl;
import com.dt95.pojo.Goods;
import com.dt95.service.GoodsIdService;

public class GoodsIdServiceImpl implements GoodsIdService{
	GoodsIdDao gd = new GoodsIaImpl();
	@Override
	public List<Goods> queryGoods1() {
		// TODO Auto-generated method stub
		return gd.queryGoods1();
	}
	@Override
	public List<Goods> queryGoods2() {
		// TODO Auto-generated method stub
		return gd.queryGoods2();
	}
	@Override
	public List<Goods> queryGoods3() {
		// TODO Auto-generated method stub
		return gd.queryGoods3();
	}

	

}
