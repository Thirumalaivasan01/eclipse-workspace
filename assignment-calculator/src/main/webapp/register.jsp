<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="skyblue">
	<center>
		<h1>Register</h1>
		<form action="<%=request.getContextPath() %>/Register" method="post">
			<table>
				<tr>
					<td>FullName</td>
					<td><input type="text" name="fullName"></td>
				</tr>
				<tr>
					<td>User Name</td>
					<td><input type="text" name="userName"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"></td>
				</tr>

			</table>
			<button type="button">Submit</button>
		</form>
	</center>
</body>
</html>