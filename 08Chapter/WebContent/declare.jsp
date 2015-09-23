<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>메인화면페이지</title>
</head>
<body>
	<h1>Declaration 태그를 이용한 JSP LifeCycle 메서드</h1>
	<%!
		String initMesg = "jspInit 메서드";
		String delMesg = "jspDestroy 메서드";
		
		//JSP LifeCycle 메서드 오버라이딩
		
		public void jspInit(){
			System.out.println(initMesg);
		}
		
		public void jspDestroy(){
			System.out.println(delMesg);
		}
	
	%>
	
</body>
</html>