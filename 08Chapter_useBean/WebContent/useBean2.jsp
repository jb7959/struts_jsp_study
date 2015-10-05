<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:useBean id="myBean" class="com.bean.LoginBean" scope="session" /> <!-- 액션태그 사용 -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	<title>useBean 실습</title>
</head>
<body>
	<h1>useBean 사용 실습 : 다른세션</h1>
		
	사용자 아이디: <%= myBean.getUserid() %>
	사용자 비밀번호: <%= myBean.getPasswd() %>
</body>
</html>