<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" isErrorPage="true"%> <!-- 11번째 라인 exception 내장객체 사용을 위해 isErrorPage="true"설정 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Error</title>
</head>
<body>
	
	<%
		response.setStatus(200); //브라우저에서 500으로 예외처리 하는 것을 막기 위한 설정 200은 정상
		out.print(exception.getMessage() +" 예외가 발생하였습니다.");
	%>
</body>
</html>