<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>User Edition</h3>
	<form action="UserServlet" method="post">
		${message}
	<input value="${form.username}">
	
	<input type="checkbox" ${form.remember?'checked':''}>
		<button>Create</button>
	</form>
	
</body>
</html>