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
 * Servlet implementation class CartDeleteCookie
 */
@WebServlet("/CartDeleteCookie")
public class CartDeleteCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartDeleteCookie() {
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
	     out.print("��ٱ��� �����!!");
	     
	     //���� ��Ű ���
	     
	     Cookie [] cookies = request.getCookies();
	     
	     if(cookies !=null){
	    	 for(Cookie c:cookies){
	    		 c.setMaxAge(1); //��Ű ����ð��� 1�� �����Ѵ�.
	    		 response.addCookie(c);
	    	 }
	     }
		
	     out.print("<a href='product.html'>��ǰ����������</a>");        
	     out.print("</body></html>");
	     
	}

}
