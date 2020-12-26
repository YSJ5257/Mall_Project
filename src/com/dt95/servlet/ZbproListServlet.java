package com.dt95.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dt95.dao.impl.ZhuangShiImpl;
import com.dt95.dao.impl.getZbProListImpl;
import com.dt95.pojo.Goods;

/**
 * Servlet implementation class ZbproListServlet
 */
@WebServlet("/zbproList")
public class ZbproListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ZbproListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getZbProListImpl zpi = new getZbProListImpl();
		List<Goods> list4 = zpi.getzbproList();
		request.setAttribute("list", list4);
		response.setContentType("application/json;charset=utf-8");

		request.getRequestDispatcher("visitor/zbproList.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
