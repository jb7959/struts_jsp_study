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
		System.out.println("�� ���ø����̼� ����");
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("�� ���ø����̼� �ʱ�ȭ");
		
	}
	
   

}
