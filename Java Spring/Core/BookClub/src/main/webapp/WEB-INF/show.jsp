<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <!-- c:out ; c:forEach etc. --> 
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <!-- Formatting (dates) --> 
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
    <!-- form:form -->
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <!-- for rendering errors on PUT routes -->
    <%@ page isErrorPage="true" %>
    <!DOCTYPE html>
    <html>
    <head>
  <meta charset="UTF-8">
        <title>Dashboard</title>
        <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
        <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
        
    </head>
<body class="container">

		<h1><c:out value = "${book.title}"/></h1>
				<a href="/home">Go Back</a>
		<c:if test="${book.userc.id == userId }">
		<h2>you read <c:out value = "${book.title}"/>  and here are your thoughts"/></h2>
		</c:if>	
		<c:if test="${book.userc.id != userId }">
		<h2><c:out value = "${user.userName}"/> read <c:out value = "${book.title}"/>  by <c:out value = "${book.userc.userName}"/></h2>
		</c:if>
		
		<p>here are <c:out value = "${book.author}"/> thoughts</p>
		<p><c:out value = "${book.thoughts}"/></p>
		<c:if test="${book.userc.id == userId }">
			<a class="btn btn-primary" href="/books/lib/${book.id}">Edit</a>
			<form action="/books/delete/${book.id}" method="post">
			    <input type="hidden" name="_method" value="delete">
			    <input class="btn btn-danger"  type="submit" value="Delete">
			</form>
		</c:if>	
</body>
</html>