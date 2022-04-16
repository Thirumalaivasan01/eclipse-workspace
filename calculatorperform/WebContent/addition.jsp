<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ADDITION</title>
</head>
<body bgcolor="Yellow">
	<center>
		<h3 style="font-family: sans-serif; color: green;">ADDITION</h3>

		<form action="result.jsp" method="post">
			<fieldset>

				<table>
					<tr>
						<td>First Number</td>
						<td><input type="text" name="a"></td>
					</tr>
					<tr>
						<td>Second Number</td>
						<td><input type="text" name="b"></td>
					</tr>

				</table>
				<button style="color: blue" type="submit" name="action" value="Addition">Add</button>
				<input type="button" value="Go back!" onclick="history.back()">
			</fieldset>
		</form>

	</center>

</body>
</html>