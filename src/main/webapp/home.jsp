<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search Page</title>

<script src="jquery-2.1.4.min.js"></script>
<script>
	function doSearch() {
		$.get("/ItemWS/all", 
				
			function(data) {
			$('#result').text('');
			var output = '<ol>';
			$.each(data, function(key, val) {
				output += '<li>';
				output +=  val.itemName;
				output += '</li>';
			});
			output += '</ol>';
			$('#result').append(output);
		});
	}
</script>
</head>
<body>
	<a href="FrontEnd/addGet">Add Item</a>
	<h3>Search name:</h3>
	<input type="submit" onclick="doSearch();" />
	
	<br>
	<br>
	<div id="result"></div>
	
	
</body>
</html>