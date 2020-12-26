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
		re.setAttribute("emails", emails);
		re.setAttribute("pwds", pwds);
		re.setAttribute("pwdes", pwdes);
		re.setAttribute("verification_code", verification);
		boolean aa = ("pwds".equals(pwdes));
		
		//判断输入邮箱是否为空，为空当前页刷新
		System.out.println(emails.toString());
		System.out.println(pwds.toString());
		System.out.println(pwdes.toString());
		if(emails.length()==0||!aa){
			//response.setIntHeader("刷新",2);
			System.out.println("密码不一致");
			request.getRequestDispatcher("reg").forward(request, response);
			return;
		}
		UserService us = new UserServiceImpl();
		//查询是否注册过邮箱
		boolean findUserLoginInfo = us.findUserLoginInfo(emails, pwds);
		String str = "";
		if(findUserLoginInfo){
			str = "账户存在，请登录！";
			request.getRequestDispatcher("login").forward(request, response);
		}else{
			int addUser = us.addUser(emails);
			if(addUser>0){
				str = "注册成功！";
				System.out.println("注册成功");
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		}
			
		
		//request.getRequestDispatcher("reg").forward(request, response);
		PrintWriter out = response.getWriter();
		out.write(1111);
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