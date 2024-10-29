<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<!-- for Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body class="container">
	<h1>Fruit Store</h1>

		<table class="table table-dark table-hover">
		<tr>
			<th>Name</th>
			<th>Price</th>
		</tr>
		<c:forEach var="item" items="${fruits}">
			<tr>
				<td><c:out value="${item.name }"></c:out></td>
				<td><c:out value="${item.price }"></c:out></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>