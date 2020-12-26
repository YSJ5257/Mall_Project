package com.dt95.dao.impl;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.dt95.dao.OrderDao;
import com.dt95.pojo.Order;
import com.dt95.pojo.OrderItem;
import com.dt95.pojo.OrderShipping;
import com.dt95.pojo.UserOrderInfo;
import com.dt95.util.C3P0Util;

public class OrderDaoImpl implements OrderDao{
	private QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
	@Override
	public int addOrder(Order order,List<OrderItem> OrderItemList, OrderShipping os) {
		int result01=0;
		int result02=0;
		int result03=0;
		try {
			String sql01="INSERT INTO `order` VALUES(NULL,?,?,?,?,now(),?,?,?,?,?,?,?,?);";
			result01 = qr.update(sql01,
					order.getPayment(),
					order.getPayment_type(),
					order.getPost_fee(),
					order.getStatus(),
					order.getShipping_name(),
					order.getUser_id(),
					order.getBuy_rate(),
					order.getPayment_time(),
					order.getConsign_time(),
					order.getEnd_time(),
					order.getClosse_time(),
					order.getOrder_number());
			String sql02="SELECT MAX(order_id) FROM `order`;";
			Object query = qr.query(sql02, new ScalarHandler());
			for (OrderItem item : OrderItemList) {
				String sql03="INSERT INTO `order_item` VALUES(NULL,?,?,?,?,?,?,?)";
				result02 = qr.update(sql03,
						item.getGoods_id(),
						query,
						item.getTitle(),
						item.getNum(),
						item.getPrice(),
						item.getTotal_fee(),
						item.getPic_path());
			}
			String sql04="INSERT INTO `order_shipping` VALUES(?,?,?,?,?,?,?,?)";
			result03 = qr.update(sql04,
					query,
					os.getConsignee_name(),
					os.getConsignee_phone(),
					os.getProvince_name(),
					os.getCity_name(),
					os.getQuxian_name(),
					os.getMinute_adress(),
					os.getPostcode_adress());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result01+result02+result03;
	}
	@Override
	public List<UserOrderInfo> getUserOrderInfo(int userId) {
		List<UserOrderInfo> list=null;
		try {
			String sql="SELECT (SELECT STATUS  FROM`order_status` WHERE id = o.`status`) AS STATUS,o.`create_time`,"
					+ "os.`consignee_name`,o.`order_number`, o.`payment_type`, o.`payment`, oi.*,o.`buy_rate` "
					+ "FROM`order` o INNER JOIN `order_item` oi ON o.`order_id` = oi.`order_id` INNER JOIN `order_shipping` os ON os.`order_id` = o.`order_id` "
					+ "WHERE o.`user_id` = ? ORDER BY o.`order_id` DESC " ;
			list= qr.query(sql, new BeanListHandler<>(UserOrderInfo.class),userId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
