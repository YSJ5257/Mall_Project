package com.dt95.servlet.ajax;

import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSONObject;
import com.dt95.pojo.Order;
import com.dt95.pojo.OrderItem;
import com.dt95.pojo.OrderShipping;
import com.dt95.pojo.ShoppingTrolley;
import com.dt95.pojo.User;
import com.dt95.service.impl.AddressServiceImpl;
import com.dt95.service.impl.OrderServiceImpl;

/**
 * Servlet implementation class OrderAjaxServlet
 */
@WebServlet("/orderAjax")
public class OrderAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private OrderServiceImpl osi =new OrderServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderAjaxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String type = request.getParameter("payment_type"); //支付方式
		String shipping = request.getParameter("shipping_name");//物流
		Integer total = (Integer) session.getAttribute("total");//订单总金额
		
		//配送地址
		String address = request.getParameter("address"); 
		OrderShipping orderShipping = JSONObject.parseObject(address).toJavaObject(OrderShipping.class);
		
		//订单详情
		List<ShoppingTrolley> buyGoods = (List<ShoppingTrolley>) session.getAttribute("indentGoods");
		List<OrderItem> orderItemlist =new ArrayList<OrderItem>();
		for (ShoppingTrolley g : buyGoods) {
			orderItemlist.add(new OrderItem(
					0, //订单详情id 自增长
					g.getGoods_id(),
					0, //订单id
					g.getGoods_describe()+g.getSpecification_name(),
					g.getSpecification_number(),
					g.getSpecification_price(),
					g.getSpecification_number()*g.getSpecification_price(),//单个商品总金额
					g.getSpecification_photo()
					));
		};
		//订单表
		User user = (User) session.getAttribute("user");
		String orderNumber = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		Order order=new Order(
				 0,//订单id 自增长
				 total,//付款总金额
				 type,//支付类型
				 0,//邮费
				 4,//订单支付状态：1，未付款，2，已付款3，未发货4，已发货，5，交易成功，6交易关闭
				 new Date(),//订单创建时间
				 shipping,//物流名称
				 user.getUser_id(),//用户ID
				 0,//用户是否评论
				 new Date(),//付款时间
				 new Date(),//发货时间
				 new Date(),//交易完成事件
				 new Date(),//交易关闭时间
				 orderNumber//订单编号
				);
		osi.addOrder(order, orderItemlist, orderShipping);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	

}
