package com.dt95.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dt95.dao.impl.getVase_ProListImpl;
import com.dt95.pojo.Goods;

/**
 * Servlet implementation class Vase_proListServlet
 */
@WebServlet("/vase_proList")
public class Vase_proListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Vase_proListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getVase_ProListImpl vpi = new getVase_ProListImpl();
		List<Goods> list3 = vpi.getvase_proList();
		request.setAttribute("list", list3);
		response.setContentType("application/json;charset=utf-8");
		
		request.getRequestDispatcher("visitor/vase_proList.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
