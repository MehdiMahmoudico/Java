<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	

	<h1>Customer Name : <c:out value="${name}"/></h1>
	<h4> Price : ${price} </h4>
	<h4> Description : ${description} </h4>
	<h4> Vendor : ${vendor} </h4>
</body>
</html>