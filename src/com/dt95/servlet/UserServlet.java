package com.dt95.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dt95.pojo.User;
import com.dt95.service.UserService;
import com.dt95.service.impl.UserServiceImpl;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/userServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		HttpSession re = request.getSession();
		//登录
		String uname =  request.getParameter("uname");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String pwd = request.getParameter("pwd");
		/*System.err.println(phone+pwd);*/
		
		re.setAttribute("uname", uname);
		re.setAttribute("email", email);
		re.setAttribute("phone", phone);
		re.setAttribute("pwd", pwd);
		UserService us = new UserServiceImpl();
		//验证登录
		boolean findUserLoginInfo = us.findUserLoginInfo(uname, pwd);
		boolean findUserName = us.findUserName(uname);
		if(findUserName){
			System.out.println("密码错误请重新输入！");
			request.getRequestDispatcher("login").forward(request, response);
			return;
		}else if(findUserLoginInfo){
			request.getRequestDispatcher("index.jsp").forward(request, response);
			return;
		}else{
			/*string = "welcome！"+parameter;*/
			response.sendRedirect("reg");
		}
		
		PrintWriter out = response.getWriter();
		out.write(11);
		out.flush();
		out.close();
}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
