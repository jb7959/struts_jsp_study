package com.test2;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebServlet;



/**
 * Servlet implementation class ContextListenerlmpl
 */
@WebServlet("/ContextListenerlmpl")
public class ContextListenerlmpl implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("웹 어플리케이션 제거");
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("웹 어플리케이션 초기화");
		
	}
	
   

}
