<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Page</title>

<script src="jquery-2.1.4.min.js"></script>
<script>
	function doSearch() {
		$.post("/ItemWS/all", function(data) {
			$('#result').text('');
			var output = '<ol>';
			$.each(data, function(key, val) {
				output += '<li>';
				output +=  val.email;
				output += '</li>';
			});
			output += '</ol>';
			$('#result').append(output);
		});
	}
</script>
</head>
<body>
	<h3>Search name:</h3>
	<input type="submit" onclick="doSearch();" />

	<br>
	<br>
	<div id="result"></div>
</body>
</html>