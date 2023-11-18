<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="../css/style.css" rel="stylesheet" type="text/css">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="header">
			<h1>Online Shopping Mall</h1>
		</div>
		<jsp:include page="menu.jsp">
			<jsp:param name="menu" value="menu" />
		</jsp:include>
		<div class="nav">

			<jsp:include page="item.jsp">
				<jsp:param name="name" value="name" />
				<jsp:param name="anh" value="anh" />
			</jsp:include>


			<div class="navbar">
				<jsp:include page="login.jsp">
					<jsp:param name="login" value="login" />
				</jsp:include>

				<jsp:include page="category.jsp">
					<jsp:param name="category" value="category" />
				</jsp:include>
			</div>

		</div>

	</div>
</body>
</html>