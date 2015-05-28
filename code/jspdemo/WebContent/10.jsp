<%@page import="entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	User user = (User)session.getAttribute("user1");
	out.println(user.getId()+","+user.getName());
%>
<br/><br/><br/>
<jsp:useBean id="user1" class="entity.User" scope="session"></jsp:useBean>
<%=user1.getId() %>,<%=user1.getName() %>
<br/><br/><br/>
<%
	out.println(user1.getId()+","+user1.getName());
%>
<br/><br/><br/>
<jsp:getProperty property="id" name="user1"/>,
<jsp:getProperty property="name" name="user1"/>
</body>
</html>