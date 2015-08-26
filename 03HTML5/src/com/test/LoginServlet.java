package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(name="Login",urlPatterns={"/Login","/Sport"})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		
		response.setContentType("text/html; charset=EUC-KR");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("���̵� : "+ userid + "<br>");
		out.print("��й�ȣ��:" + passwd + "<br>");
		out.print("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");
		String [] sports = request.getParameterValues("sports");
		String sex = request.getParameter("sex");
		response.setContentType("text/html; charset=EUC-KR");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		for(String sport : sports){
			out.print("�����ϴ� �: "+ sport + "<br>");
		}		
		out.print("����:" + sex + "<br>");
		out.print("</body></html>");
		
	}
	
	

}
