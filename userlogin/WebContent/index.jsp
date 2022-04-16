<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LoginPage</title>
</head>
<body>

	<fieldset style="background-color: yellow;">
		<form action="welcome.jsp" method="post">
			<center>
				<table style="background-color: gray;">
					<tr>
						<td><input type="text" placeholder="Enter Username here"
							name="username"></td>
					</tr>
					<tr>
						<td><input type="password" placeholder="Enter Password here"
							name="password"></td>

					</tr>
				</table>
				<button type="submit">Login</button>
			</center>

		</form>

	</fieldset>
</body>
</html>