package com.dt95.servlet.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dt95.pojo.Address;
import com.dt95.pojo.User;
import com.dt95.service.impl.AddressServiceImpl;

/**
 * Servlet implementation class AddressAjaxServlet
 */
@WebServlet("/addressAjax")
public class AddressAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private AddressServiceImpl asi=new AddressServiceImpl();
	 private int userId;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddressAjaxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			User user = (User) request.getSession().getAttribute("user");
			this.userId = user.getUser_id();
			
			
			String m = request.getParameter("method");
			String data = request.getParameter("jsonData");
			
			Method method = this.getClass().getDeclaredMethod(m,String.class);
			String jsonString = (String) method.invoke(this,data);
			
			
			PrintWriter out = response.getWriter();
			out.write(jsonString);
			out.flush();
			out.close();
			
		} catch (Exception e) {
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
	
	private String getAddress(String data){
		List<Address> address = asi.getAllByUserId( this.userId);
		return JSON.toJSONString(address);
	}
	private String addAdderss(String data){
		Address address = JSONObject.parseObject(data).toJavaObject(Address.class);
		
		//address.setUser_id(this.userId);
		
		int address2 = asi.addAddress(address);
		return address2+"";
	}
	private String delAddress(String data){
		int result = asi.removeByAddressId(Integer.parseInt(data));
		return result+"";
	}
	private String modifyAdderss(String data){
		Address address = JSONObject.parseObject(data).toJavaObject(Address.class);
		int result = asi.modifyAddress(address);
		return result +"";
 	}

}
