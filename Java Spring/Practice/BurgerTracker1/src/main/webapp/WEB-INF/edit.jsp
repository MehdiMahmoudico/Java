
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
<div>
 <div class="mt-3 d-flex justify-content-between">
<h1 style="color: blue ;">Edit Burger</h1>
<a href="/">Go Back</a>
</div>
<form:form action="/burgers/${burger.id }" method="post" modelAttribute="burger">
	    <input type="hidden" name="_method" value="PUT"/>
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