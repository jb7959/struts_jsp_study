<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.Date" %> <!-- page 지시어를 사용하여 java.util.Date클래스를 import한다. -->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Scriptlet tag</title>
</head>
<body>
	<!-- Scriptlet 태그를 사용하여 Date 객체를 생성한다. -->
	<h1>현재 날짜 출력 실습</h1>
	<%
		Date d = new Date();
	%>
	<!-- expression 태그를 사용하여 웹브라우저에 출력한다. -->
	현재 날짜 : <%= d %>

</body>
</html>