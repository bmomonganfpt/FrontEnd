<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Page</title>
</head>
<body>
<a href="/FrontEnd/home">Home</a>
	<s:form action="/item">
		<table>
			<tr>
				<td><s:textfield name="itemName" label="Product Name" /></td>
			</tr>
			<tr>
				<td><s:textarea label="Product Description" style="width: 137px; height: 120px;" name="itemDesc" cols="" rows="" id="item_itemDesc" /></td>
			</tr>
			<tr>
				<td><s:textfield name="itemInitPrice" label="Initial Price" /></td>
			</tr>
			<tr>
				<td><s:submit value="Submit" /></td>
			</tr>
		</table>
	</s:form>

</body>
</html>

