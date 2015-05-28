<%@page import="entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp useBean动作</title>
</head>
<body>
<%
	User user = new User();
	user.setId(1000);
	user.setName("zhangsan");
	out.println(user.getId()+","+user.getName());
%>
<br/>
<jsp:useBean id="user1" class="entity.User" scope="session"></jsp:useBean>
<%
	user1.setId(1001);
	user1.setName("wangwu");
	out.println(user1.getId()+","+user1.getName());
%>
<br/>
<jsp:getProperty property="id" name="user1"/>&nbsp;
<jsp:getProperty property="name" name="user1"/>
<br/>
<jsp:setProperty property="id" name="user1" value="1010"/>
<jsp:getProperty property="id" name="user1"/>
<br/>
<a href="10.jsp">jsp useBean 范围测试</a>
</body>
</html>