
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
        <title>Burger Tracker</title>
        <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
        <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
        
    </head>
<body class="container"> 
<div class="mt-3">
<h1 style="color: blue ;">Burger Tracker</h1>
	<table class="table table-hover">
 <thead>
	<tr>
      <th scope="col">Burger Name</th>
      <th scope="col">Restaurant Name</th>
      <th scope="col">Rating (out of 5)</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  	<tbody>
  		
		<c:forEach items="${burgers}" var="burger">
		<tr>
		<td><c:out value = "${burger.name}"/></td>
		<td><c:out value = "${burger.restaurant}"/></td>
		<td><c:out value = "${burger.rates}"/></td>
		<td><a href="/burgers/edit/${burger.id}">Edit</a></td>
		</tr>
		</c:forEach>
		
	</tbody>
</table>
</div>
<div>
<h1 style="color: blue ;">Add a Burger</h1>
<form:form action="/burgers" method="post" modelAttribute="burger">
    <div class="mb-3">
        <form:label class="form-label" path="name">Name</form:label>
        <form:errors style="color: red ;"  path="name"/>
        <form:input class="form-control" path="name"/>
    </div>
    <div class="mb-3">
        <form:label class="form-label" path="restaurant">Restaurant Name</form:label>
        <form:errors style="color: red ;"  path="restaurant"/>
        <form:input class="form-control" path="restaurant"/>
    </div>
    <div class="mb-3">
        <form:label class="form-label" path="rates">Rating</form:label>
        <form:errors style="color: red ;"  path="rates"/>     
        <form:input class="form-control" type="rates" path="rates"/>
    </div >  
        <div class="mb-3">
        <form:label class="form-label" path="notes">Notes</form:label>
        <form:errors style="color: red ;"  path="notes"/>
        <form:textarea class="form-control" path="notes"/>
    </div>  
    <input  class="btn btn-primary" type="submit" value="Submit"/>
</form:form>
</div>
</body>
</html>