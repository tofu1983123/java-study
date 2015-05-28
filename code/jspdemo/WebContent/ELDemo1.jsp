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
	pageContext.setAttribute("page", "page");
	request.setAttribute("request", "request");
	session.setAttribute("session","session" );
	application.setAttribute("application", "application");
	//pageContext.setAttribute("aa", "pageContext");
	request.setAttribute("aa", "request");
	session.setAttribute("aa", "session");
%>
<br/><br/><br/><br/>
${pageScope.page }<br/>
${requestScope.request }<br/>
${sessionScope.session }<br/>
${applicationScope.application }
<br/>
<jsp:useBean id="user" class="entity.User" scope="session" />
<jsp:setProperty property="id" name="user" value="1000"/>
<h1>${sessionScope.user.id }</h1>
<br/><br/><br/><br/><br/><br/>
<h1>${aa }</h1>
<br/><br/><br/><br/>
${5==5 }   <br/>
${5 eq 5 }
</body>
</html>