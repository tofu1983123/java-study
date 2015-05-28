<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp声明</title>
</head>
<body>
<%!
	class Circle{
	}
	int i = 100;
	int j = 200;
%>
<%
	int i = 300;
	i++;
	out.println(i);
%>
<br/><br/>
<%
	i++;
	out.println(i);
%>
<%
	j++;
	out.println(j);
%>
</body>
</html>