package com.dt95.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dt95.service.UserService;
import com.dt95.service.impl.UserServiceImpl;

/**
 * Servlet implementation class UserRegServlet
 */
@WebServlet("/userRegServlet")
public class UserRegServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		HttpSession re = request.getSession();
		//email
		String emails =  request.getParameter("emails");
		String pwds = request.getParameter("pwds");
		String pwdes = request.getParameter("pwdes");
		String verification = request.getParameter("verification");
		System.out.println(emails);
		System.out.println(pwds);
		System.out.println(pwdes);
		System.out.println(verification);
		re.setAttribute("emails", emails);
		re.setAttribute("pwds", pwds);
		re.setAttribute("pwdes", pwdes);
		re.setAttribute("verification_code", verification);
		UserService us = new UserServiceImpl();
		//查询是否注册过邮箱
		boolean findUserRegInfo = us.findUserRegInfo(emails);
		String string = "";
		if(findUserRegInfo){
			string = "账户已注册，请重新输入！";
			request.getRequestDispatcher("reg").forward(request, response);
		}else {
			System.out.println("欢迎重新注册！");
			//注册用户
			int addUser = us.addUser(emails);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		PrintWriter out = response.getWriter();
		out.write(string);
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
