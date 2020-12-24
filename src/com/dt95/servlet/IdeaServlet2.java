package com.dt95.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dt95.pojo.Goods;
import com.dt95.service.GoodsIdService;
import com.dt95.service.impl.GoodsIdServiceImpl;
import com.google.gson.Gson;

/**
 * Servlet implementation class IdeaServlet2
 */
@WebServlet("/ideaServlet2")
public class IdeaServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IdeaServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		GoodsIdService gd = new GoodsIdServiceImpl();
		List<Goods> list1 = gd.queryGoods1();
		List<Goods> list2 = gd.queryGoods2();
		List<Goods> list3 = gd.queryGoods3();
		
		List<List<Goods>> lists = new ArrayList<List<Goods>>();
		lists.add(list1);
		lists.add(list2);
		lists.add(list3);
		Gson gson  = new Gson();
		String ea = gson.toJson(lists);
		PrintWriter out = response.getWriter();
		out.write(ea);
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
