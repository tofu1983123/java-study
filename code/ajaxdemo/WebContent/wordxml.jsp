<%@ page language="java" contentType="text/xml; charset=UTF-8" pageEncoding="UTF-8"%>
<words>
<%
	String word = request.getParameter("word");
%>
<%
  if("abstract".startsWith(word)){%>
	    <word>abstract</word>
  <%}
%>
<%
  if("absolute".startsWith(word)){%>
	    <word>absolute</word>
  <%}
%>
<%
  if("abc".startsWith(word)){%>
	    <word>abc</word>
  <%}
%>
<%
  if("apple".startsWith(word)){%>
	    <word>apple</word>
  <%}
%>
  <%
  if("break".startsWith(word)){%>
	    <word>break</word>
  <%}
%>
<%
  if("breath".startsWith(word)){%>
	    <word>breath</word>
  <%}
%>
<%
  if("banana".startsWith(word)){%>
	    <word>banana</word>
  <%}
%>
<%
  if("bird".startsWith(word)){%>
	    <word>bird</word>
  <%}
%>
</words>