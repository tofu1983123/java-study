<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="UserServlet?action=login" method="post">
         姓名:<input type="text" name="username"/><br/>
         密码:<input type="password" name="password"/><br/>
        <input type="submit" value="登陆"/><br/>
	</form>
	<h1>${msg }</h1>
</body>
<br/>
<a href="UserServlet?action=registUI">如果未注册请先注册!</a>
</html>