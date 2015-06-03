<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>版块修改</title>
</head>
<body>
<form action="CategoryServlet?action=update&categoryId=${category.id }" method="post">
	版块名称<input type="text" value="${category.name }" name="category" />
	<input type="submit" value="修改" />
</form>
</body>
</html>