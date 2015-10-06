<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Scope 데이터 보기</title>
</head>
<body>
		pageContext.setAttribute("scopeName", "pageScope 값") : ${pageScope.scopeName}<br>;
		request.setAttribute("scopeName", "requestScope 값") : ${requestScope.scopeName}<br>;
		session.setAttribute("scopeName", "sessionScope 값") : ${sessionScope.scopeName}<br>;
		application.setAttribute("scopeName", "applicationScope 값") : ${applicationScope.scopeName}<br>;

</body>
</html>