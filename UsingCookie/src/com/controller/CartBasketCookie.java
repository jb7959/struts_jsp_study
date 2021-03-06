package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CartBasketCookie
 */
@WebServlet("/CartBasketCookie")
public class CartBasketCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartBasketCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=EUC-KR");
		PrintWriter out = response.getWriter();
		
		 out.print("<html><body>");
	     out.print("장바구니 리스트<br>");
	     
	     //기존 쿠키 얻기
	     
	     Cookie [] cookies = request.getCookies();
	     
	     if(cookies != null){
	    	 for (Cookie c : cookies){
	    		 out.print(c.getName() + ":" + c.getValue() +"<br>");
	    	 }
	     }else{
	    	 out.print("장바구니 비었음<br>");
	     }
	     
	        out.print("<a href='product.html'>상품선택페이지</a>");
	        out.print("<a href='CartDeleteCookie'>장바구니 비우기 </a>");
	        out.print("</body></html>");
	     
	}

}
