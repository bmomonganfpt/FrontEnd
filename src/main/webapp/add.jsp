<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Page</title>
</head>
<body>
	<s:form action="/item">
		<table>
			<tr>
				<td>Product Name:<s:textfield name="itemName" /></td>
			</tr>
			<tr>
				<td>Product Description:</td>
				<td><s:textfield name="itemDesc" /></td>
			</tr>
			<tr>
				<td>Initial Price:</td>
				<td><s:textfield name="itemInitPrice" /></td>
			</tr>
			<tr>
				<td><s:submit value="New Item" /></td>
			</tr>
		</table>
	</s:form>	
	
</body>
</html>