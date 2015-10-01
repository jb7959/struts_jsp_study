<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<jsp:useBean id="myBean" class="com.bean.LoginBean" />
<jsp:setProperty property="*" name="myBean" />


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h1>setProperty Param test</h1>
		
	User's ID: <jsp:getProperty property="userid" name="myBean"/> <!--<%= myBean.getUserid() %>  -->
	User's Password :  <jsp:getProperty property="passwd" name="myBean"/> <!-- <%= myBean.getPasswd() %>  -->

</body>
</html>