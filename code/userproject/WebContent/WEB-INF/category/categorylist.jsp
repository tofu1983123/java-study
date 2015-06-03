<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
	#welcome{
		color:red;
		font-size:16px;
	}
</style>
<title>Insert title here</title>
</head>
<body>
欢迎<span id="welcome">${user.loginName }</span>大驾光临
&nbsp;&nbsp;&nbsp;
<a href="UserServlet?action=changePasswordUI">修改密码</a>
<a href="UserServlet?action=logon">退出</a><br/>
<!-- ${categorys } -->
<table border="1" width="50%" align="center">
    <tr><td>版块名称</td><td>操作</td></tr>
    <c:forEach var="category"   items="${categorys }">
       <tr>
          <td>${category.name }</td>
          <td><a href="CategoryServlet?action=updateUI&categoryId=${category.id }">修改</a></td>
       </tr>
    </c:forEach>
</table>
</body>
</html>