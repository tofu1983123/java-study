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
	out.println(page+"<br/>");

    pageContext.setAttribute("aa", "bb");//只在当前页面有效
    String ss = (String)pageContext.getAttribute("aa");
    out.println(ss+"<br/>");
    /*pageContext.getRequest();
    pageContext.getSession()
    pageContext.getServletContext()
    pageContext.getOut()
    pageContext.getServletConfig()*/
    
    //config.getServletContext()
	out.println(config.getServletName());
   
%>
</body>
</html>