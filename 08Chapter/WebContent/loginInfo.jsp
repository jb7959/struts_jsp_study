<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>request ���� ��ü �ǽ�</title>
</head>
<body>
	<h1>�α��� �Է� �Ķ���� ���</h1>
	<%	//request ���� ��ü
		request.setCharacterEncoding("EUC-KR");
		
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
	%>
	���̵�: <%= userid %><br> <!-- expression tag -->
	��й�ȣ: <%= passwd %><br>
</body>
</html>