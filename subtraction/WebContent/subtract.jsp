<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>RESULT</title>
</head>
<body>
	<%
		Integer a = Integer.parseInt(request.getParameter("a"));
		Integer b = Integer.parseInt(request.getParameter("b"));
		Integer result = a - b;
		request.setAttribute("result", result);
		RequestDispatcher dispatcher = request.getRequestDispatcher("display.jsp");
		dispatcher.forward(request, response);
	%>

	<%-- <h1 style="font-family: fantasy; color: green">
		The result of
		<%=a%>-<%=b%>=<%=result%></h1> --%>
</body>
</html>