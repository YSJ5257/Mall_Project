package com.dt95.servlet.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.dt95.pojo.User;
import com.dt95.pojo.UserOrderInfo;
import com.dt95.service.impl.OrderServiceImpl;

/**
 * Servlet implementation class MyOderAjaxServlet
 */
@WebServlet("/myOderAjax")
public class MyOderAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private OrderServiceImpl osi = new OrderServiceImpl();
    private int userId;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyOderAjaxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = (User) request.getSession().getAttribute("user");
		this.userId=user.getUser_id();
		
		String m = request.getParameter("method");
		String data = request.getParameter("jsonData");
		
		try {
			Method method = this.getClass().getDeclaredMethod(m, String.class);
			String jsonData = (String) method.invoke(this, data);
			
			PrintWriter out = response.getWriter();
			out.write(jsonData);
			out.flush();
			out.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private String getMyOrder(String data){
		List<UserOrderInfo> list = osi.getUserOrderInfo(this.userId);
		return JSONObject.toJSONString(list);
	}

}
