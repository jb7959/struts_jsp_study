<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>����ȭ��������</title>
</head>
<body>
	<h1>Declaration �±׸� �̿��� JSP LifeCycle �޼���</h1>
	<%!
		String initMesg = "jspInit �޼���";
		String delMesg = "jspDestroy �޼���";
		
		//JSP LifeCycle �޼��� �������̵�
		
		public void jspInit(){
			System.out.println(initMesg);
		}
		
		public void jspDestroy(){
			System.out.println(delMesg);
		}
	
	%>
	
</body>
</html>