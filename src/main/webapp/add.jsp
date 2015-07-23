<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Page</title>
</head>
<body>
	<form action="/ItemWS/add" method="post">
		<table>
			<tr>
				<td>Id:</td>
				<td><input type="text" id="id" name="id" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" id="email" name="email"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="New Item" /></td>
			</tr>
		</table>
	</form>
</body>
</html>