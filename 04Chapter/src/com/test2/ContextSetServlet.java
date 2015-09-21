package com.test2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContextSetServlet
 */
@WebServlet("/ContextSet") //WebServlet ������̼� ���θ����� ContextSet�� �����Ѵ�.
public class ContextSetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContextSetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = "ȫ�浿";
		int age = 20;
		//ServletContext ��ü�� setAttribute(name,value) �޼��带 ����Ͽ� �Ӽ� ���� �����Ѵ�. ����� �Ӽ� ���� �� ���ø����̼��� ���ŵǱ� ������ ����ؼ������ �� �ִ�.
		getServletContext().setAttribute("name", name);
		getServletContext().setAttribute("age", age);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
