<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.Date" %> <!-- page ���þ ����Ͽ� java.util.DateŬ������ import�Ѵ�. -->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Scriptlet tag</title>
</head>
<body>
	<!-- Scriptlet �±׸� ����Ͽ� Date ��ü�� �����Ѵ�. -->
	<h1>���� ��¥ ��� �ǽ�</h1>
	<%
		Date d = new Date();
	%>
	<!-- expression �±׸� ����Ͽ� ���������� ����Ѵ�. -->
	���� ��¥ : <%= d %>

</body>
</html>