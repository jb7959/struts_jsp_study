<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>session 실습</title>
</head>
<body>
	<h1>로그인 정보 보기</h1>
	
	<%
		String id = (String)session.getAttribute("userid");
		
		if(id == null){
			response.sendRedirect("loginForm.html");
		}else{
			String pw = (String)session.getAttribute("passwd");
			out.print("사용자 아이디 값:" + id + "<br>");
			out.print("사용자 비밀번호 값 :"+pw+"<br>");
			out.print("<a href='logout.jsp'>로그아웃</a>");		
		}
	
	
	%>

</body>
</html>