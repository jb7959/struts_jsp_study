<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" isErrorPage="true"%> <!-- 11��° ���� exception ���尴ü ����� ���� isErrorPage="true"���� -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Error</title>
</head>
<body>
	
	<%
		response.setStatus(200); //���������� 500���� ����ó�� �ϴ� ���� ���� ���� ���� 200�� ����
		out.print(exception.getMessage() +" ���ܰ� �߻��Ͽ����ϴ�.");
	%>
</body>
</html>