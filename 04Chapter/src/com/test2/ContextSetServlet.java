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
@WebServlet("/ContextSet") //WebServlet 어노테이션 맵핑명으로 ContextSet을 지정한다.
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
		String name = "홍길동";
		int age = 20;
		//ServletContext 객체의 setAttribute(name,value) 메서드를 사용하여 속성 값을 저장한다. 저장된 속성 값은 웹 어플리케이션이 제거되기 전까지 계속해서사용할 수 있다.
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
