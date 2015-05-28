<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp基本语法</title>
</head>
<body>
<a href="1.jsp">1.jsp</a>
<br/>
<%
	String s = "helloWorld";
	out.println(s);
%>
<br/>
<p>aaaa</p>
<br/><br/>
<%
	int a = 10000;
	out.println("<h1>"+a+"</h1>");
%>
<%
	class Person{
		private String name;
		private int age;
		public Person(String name,int age){
			this.name = name;
			this.age = age;
		}
		public void print(){
			System.out.println(name+","+age);
		}
	}
	Person p1 = new Person("aaa",30);
	p1.print();
%>
<%
	int b = 101;
    if(b > 100){%>
    	<h1>Hello</h1>
    <%}
    else{%>
    	<h6>hello</h6>
    <% }
%>
<br/><br/><br/>
	<table border="1" align="center" width="50%">
    <%
    	for(int i = 0; i < 20;i++){
    %>
    	<tr>
        	<td>张三</td>
        	<td>0001</td>
        </tr>
    <%	}
    %>
   </table>
</body>
</html>