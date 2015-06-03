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
<jsp:useBean id="user" class="entity.User" scope="request"></jsp:useBean>
<jsp:setProperty property="name" name="user" value="张三"/>
<jsp:setProperty property="age" name="user" value="30"/>
<c:out value="helloworld"></c:out>
<br/>
<c:out value="${user.name }"></c:out>
<br/>
<c:out value="${user.age }"></c:out>
<br/>
</body>
</html>