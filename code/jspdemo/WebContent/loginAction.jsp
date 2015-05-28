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
	request.setCharacterEncoding("utf-8");
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	// out.println(username+","+password);
	session.setAttribute("username",username);
	request.setAttribute("username", username);
	application.setAttribute("username", username);
	response.sendRedirect("result.jsp");
%>
</body>
</html>