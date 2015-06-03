<%@page import="java.util.HashSet"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	ArrayList list = new ArrayList();
	HashSet set = new HashSet();
	list.add("aaa");
	list.add("bbb");
	list.add("ccc");
	set.add("ddd");
	set.add("eee");
	set.add("fff");
	request.setAttribute("list", list);
	request.setAttribute("set", set);
%>
<c:forEach var="str" items="${list }" >
	<c:out value="${str }"></c:out><br/>
</c:forEach>
<br/>
<c:forEach var="i" begin="1" end="10" step="2">
	<c:out value="${i }"></c:out>
</c:forEach>
<br/>
<br/>
<c:forEach var="str1" items="${set }">
	<c:out value="${str1 }"></c:out><br/>
</c:forEach>
</body>
</html>