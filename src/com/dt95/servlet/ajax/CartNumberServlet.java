package com.dt95.servlet.ajax;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dt95.service.impl.CartServiceImpl;

/**
 * Servlet implementation class CartNumberServlet
 */
@WebServlet("/cartNumber")
public class CartNumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private CartServiceImpl csi=new CartServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartNumberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id =Integer.parseInt( request.getParameter("cartId"));
		int num =Integer.parseInt( request.getParameter("number"));
		int result = csi.updateCartNumber(id,num);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
