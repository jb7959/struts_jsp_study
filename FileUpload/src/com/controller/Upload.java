package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class Upload
 */
@WebServlet("/Upload")
@MultipartConfig(maxFileSize=1024*1024*2, location="c:\\upload") // �ִ����� ũ��(�ִ� 2mb), ���� ���丮 "c:\\upload"
public class Upload extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Upload() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");
		
		Part part = request.getPart("theFile");
		String fileName = getFilename(part);
		if(fileName != null && !fileName.isEmpty()){
			part.write(fileName);}
		
		String author = request.getParameter("theAuthor");
		author = new String(author.getBytes("iso-8859-1"), "EUC-KR");
		
		response.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = response.getWriter();
		
		out.print("�ۼ���:"+author+"<br>");
		out.print("���ϸ�:<a href='FileDown?file_name="+fileName+"'>"+fileName+"<br>"); // �ٿ�ε� �߰�
		out.print("����ũ��:"+part.getSize()+"<br>");
	
	}
	
	
	

	//���ϸ� ���	
	private String getFilename(Part part){
		String fileName = null;		
		String contentDispositionHeader = part.getHeader("content-disposition");
		System.out.println(" part.getHeader :"+part.getHeader("content-disposition"));
		//part.getHeader :form-data; name="theFile"; 
		//filename="RHDSetup.log" ó�� ����� ���� ���� �����ݷи��� ������ �� �ʿ伺�� ����
		String [] elements = contentDispositionHeader.split(";");
		
		
		
		for(String element: elements){
			System.out.println("���꽺Ʈ�� ��:" +element);
			fileName = element.substring(element.indexOf('=')+1);
			System.out.println("Ʈ�� ��:"+fileName);
			fileName = fileName.trim().replace("\""," "); // " <- �ֵ���ǥ ����
			System.out.println("Ʈ�� ��:"+fileName);
		}		
		return fileName;		
	}
}
