package com.dt95.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dt95.pojo.Address;
import com.dt95.pojo.ShoppingTrolley;
import com.dt95.service.impl.AddressServiceImpl;
import com.dt95.service.impl.CartServiceImpl;

/**
 * Servlet implementation class OrderServlet
 */
@WebServlet("/order")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CartServiceImpl csi=new CartServiceImpl();
	private AddressServiceImpl asi=new AddressServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取要购买商品 的  ---->  购物车id
		String[] buygoods = request.getParameterValues("shoppingList");
			
		if(buygoods!=null){
			List<ShoppingTrolley > list=new ArrayList<>();
			int total=0;
			for (String good : buygoods) {
				int id=Integer.parseInt(good);
				ShoppingTrolley trolley = csi.getCartById(id);
				total+=trolley.getSpecification_price()*trolley.getSpecification_number();
				list.add(trolley);
				//csi.deleteCartByCartId(id);
			}
			request.setAttribute("indentGoods", list);//订单
			request.setAttribute("total", total);//订单
			
			List<Address> address = asi.getAllByUserId(1);
			request.setAttribute("addressList", address);
		}
		
		
		request.getRequestDispatcher("admin/order.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
