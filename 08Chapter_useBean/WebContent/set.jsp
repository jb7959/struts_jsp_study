<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="com.bean.LoginBean"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>List �ǽ�</title>
</head>
<body>
	<h1>List �ǽ�</h1>

	<%
	LoginBean oneBean = new LoginBean();
	oneBean.setUserid("aaa");
	oneBean.setPasswd("1234");
	
	LoginBean twoBean = new LoginBean();
	twoBean.setUserid("bbb");
	twoBean.setPasswd("1234");
	
	ArrayList<LoginBean> list = new ArrayList<LoginBean>();
	list.add(oneBean);
	list.add(twoBean);
	
	request.setAttribute("beanName", list);
	
	%>
	
	<jsp:forward page="get.jsp" />
	
</body>
</html>