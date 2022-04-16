<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Display</title>
</head>
<body bgcolor="yellow">
	<%
		Integer result = (Integer) request.getAttribute("result");
		/* String action=(String)request.getAttribute("action");
		Integer a=(Integer) request.getAttribute("a");
		Integer b=(Integer) request.getAttribute("b"); */
	%>
	<center>
		<h1 style="font-size: large; font-family: inherit; color: green">
			The result of < a-b =
			<%=result%></h1>
	</center>
</body>
</html>