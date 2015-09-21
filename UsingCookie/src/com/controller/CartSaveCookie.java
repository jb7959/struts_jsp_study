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
 * Servlet implementation class CartSaveCookie
 */
@WebServlet("/CartSaveCookie")
public class CartSaveCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartSaveCookie() {
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
		String product = request.getParameter("product");
		
		//���� ��Ű ���
		
		Cookie[] cookies = request.getCookies();
		Cookie c = null;
		
		if(cookies == null || cookies.length == 0){
			c = new Cookie("cookieId0", product); }
		else{
			c = new Cookie("cookieId"+(cookies.length+1), product);
		}
		
		//��� ����ó�� ����
		
		//c.setMaxAge(60*60)
		
		response.addCookie(c);
		
		    out.print("<html><body>");
	        out.print("Product �߰�");
	        out.print("<a href='CartBasketCookie'>��ٱ��� ���� </a>");
	        out.print("</body></html>");
		
			
		}
	}


