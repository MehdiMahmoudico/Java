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
        <title>Book</title>
        <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
        <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
        
    </head>
<body class="container">
<div>
<h1 style="color: blue ;">New Book</h1>
<form:form action="/books/update/${book.id}" method="post" modelAttribute="book">
<input type="hidden" name="_method" value="PUT"/>
    <div class="mb-3">
        <form:label class="form-label" path="title">Title</form:label>
        <form:errors style="color: red ;"  path="title"/>
        <form:input class="form-control" path="title"/>
    </div>
    <div class="mb-3">
        <form:label class="form-label" path="author">Author</form:label>
        <form:errors style="color: red ;"  path="author"/>
        <form:input class="form-control" path="author"/>
    </div>
    <div class="mb-3">
        <form:label class="form-label" path="thoughts">My Thoughts</form:label>
        <form:errors style="color: red ;"  path="thoughts"/>     
        <form:textarea class="form-control" path="thoughts"/>
    </div >  
  
    <input  class="btn btn-primary" type="submit" value="Submit"/>
</form:form>
</div>
</body>
</html>