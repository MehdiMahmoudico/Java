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
<table class="table table-hover">
 <thead>
	<tr>
		<th scope="col">ID</th>
      <th scope="col">title</th>
      <th scope="col">Description</th>
      <th scope="col">Language</th>
      <th scope="col">Number Of Pages</th>
    </tr>
  </thead>
  	<tbody>
  		
		<c:forEach items="${books}" var="book">
		<tr>
		<th scope="row"><c:out value = "${book.id}"/></th>
		<td><a href="books/${book.id}"><c:out value = "${book.title}"/></td></a>
		<td><c:out value = "${book.description}"/></td>
		<td><c:out value = "${book.language}"/></td>
		<td><c:out value = "${book.numberOfPages}"/></td>
		</tr>
		</c:forEach>
		
	</tbody>
</table>
</body>
</html>