<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>scope �ǽ�</title>
</head>
<body>
	<h1>scope �ǽ�</h1>
	
	<%
		pageContext.setAttribute("scopeName", "pageScope ��");
		request.setAttribute("scopeName", "requestScope ��");
		session.setAttribute("scopeName", "sessionScope ��");
		application.setAttribute("scopeName", "applicationScope ��");
	
	%>
		
		pageContext.setAttribute("scopeName", "pageScope ��") : ${pageScope.scopeName}<br>;
		request.setAttribute("scopeName", "requestScope ��") : ${requestScope.scopeName}<br>;
		session.setAttribute("scopeName", "sessionScope ��") : ${sessionScope.scopeName}<br>;
		application.setAttribute("scopeName", "applicationScope ��") : ${applicationScope.scopeName}<br>;
		

</body>
</html>