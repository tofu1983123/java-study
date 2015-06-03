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
	<c:set var="aa" value="helloworld" scope="request"></c:set>
	<c:out value="${aa }"></c:out>
	<br/>
	<br/>
	<jsp:useBean id="user" class="entity.User" scope="request"></jsp:useBean>
	<c:set target="${user }" property="name" value="helloworldbye-bye"></c:set>
	<br/>
	<c:out value="${user.name }"></c:out>
</body>
</html>