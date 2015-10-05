package com.test2;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("Myfilter����");

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("MyFilter ��û���� �ڵ��۾�");
		request.setCharacterEncoding("EUC-KR");
		chain.doFilter(request, response);
		System.out.println("MyFilter �������� �ڵ��۾�");

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("Myfilter �ʱ�ȭ");

	}

}
