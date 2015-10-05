package com.controller;

import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FileDown
 */
@WebServlet("/FileDown")
public class FileDown extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileDown() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fileName = request.getParameter("file_name"); //get���� ���� ���� �ޱ�
		String sDownloadPath = "C:\\upload\\";
		String sFilePath = sDownloadPath + fileName;
		
		byte b[] = new byte[4096];
		FileInputStream fileInputStream = new FileInputStream(sFilePath);
		
		String sMimeType = getServletContext().getMimeType(sFilePath);
		
		if(sMimeType == null) sMimeType = "application/octet-stream";
		
		response.setContentType(sMimeType);
		
		//�ѱ۾��ε�
		String sEncoding = new String(fileName.getBytes("euc-kr"),"8859_1");
		response.setHeader("Content-Disposition", "attachment; filename= " + sEncoding);
		
		ServletOutputStream servletOutStream = response.getOutputStream();
		
		int numRead;
		while((numRead = fileInputStream.read(b,0,b.length))!= -1){
			servletOutStream.write(b,0,numRead);			
		}
		
		servletOutStream.flush();
		servletOutStream.close();
		fileInputStream.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
