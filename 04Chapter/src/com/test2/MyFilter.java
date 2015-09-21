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
		System.out.println("Myfilter제거");

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("MyFilter 요청필터 코드작업");
		request.setCharacterEncoding("EUC-KR");
		chain.doFilter(request, response);
		System.out.println("MyFilter 응답필터 코드작업");

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("Myfilter 초기화");

	}

}
