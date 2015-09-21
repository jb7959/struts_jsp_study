package com.controller.Cart;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CartBasket
 */
@WebServlet("/CartBasket")
public class CartBasket extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartBasket() {
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
		out.print("��ٱ��ϸ���Ʈ");
		HttpSession session = request.getSession(false);
		if(session != null){
			ArrayList<String> list = (ArrayList<String>) session.getAttribute("sessionID=1"); 
			out.print("��ǰ : "+list+"<br>");
		}else{
			out.print("���� ����"+"<br>");
		}
		
		out.print("<a href='product.html'>��ǰ����������</a>");
		out.print("<a href='CartDelete'>��ٱ��� ���� </a>");
		out.print("</body></html>");
	}

}