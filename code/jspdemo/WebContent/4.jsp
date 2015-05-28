<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp表达式</title>
</head>
<body>
<%!
   int i = 10; 
   String s = "helloworld";
%>
<%
  out.println(i+","+s);
%>
<br/>
<%=i %>,<%=s %>
<table border="1">
<%
   for(int i = 1; i <= 100;i++){
	   %><tr>
	      <td><%=i %></td>
	      <td><%=i+1000 %></td>
	   </tr>
   <%}
%>
</table>
</body>
</html>