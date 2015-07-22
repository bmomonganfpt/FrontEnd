<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Page</title>
</head>
<body>
	<form action="/ItemWS/add" method="post">
		ID<input type="text" name="id"/>
		<br>
		Email <input type="text" name="email" />
		<br> <br> <br>
		<input type="submit" value="Register"/>

	</form>




	<%-- <s:form action="ItemWS/add">
		<s:textfield name="id" label="id"></s:textfield>
		<s:textfield name="email" label="email"></s:textfield>
		<br>
		<br>
		<br>
		<s:submit value="register"></s:submit>
	</s:form> --%>
</body>
</html>