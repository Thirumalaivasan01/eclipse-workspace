<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Result</title>
</head>
<body bgcolor="skyblue">
<%!int result = 0; %>
	<%
		
		String action = (String)request.getParameter("action");
		Integer a = Integer.parseInt(request.getParameter("a"));
		Integer b = Integer.parseInt(request.getParameter("b"));
	    
		 if(action.equals("Addition")) {
			result = a + b;
		} else if(action.equals("Subtraction")) {
			result=a-b;
		} else if(action.equals("Multiplication")){
			result=a*b;
		}
		else if(action.equals("Division")){
			result=a/b;
		}
	%>
	<center>
	<form action="index.jsp" method="get">
		<h1 style="font-size: large; font-family: inherit; color: green">
			The result of
			<%=action%>
			between
			<%=a%>
			and
			<%=b%>
			is =<a></a>
			<%=result%></h1>
		<button>Return</button>
		</form>
	</center>
</body>
</html>