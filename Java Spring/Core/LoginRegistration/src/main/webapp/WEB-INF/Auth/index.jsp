
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
        <title>login</title>
        <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
        <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
        
    </head>
<body class="container"> 
<div class="mt-3">
<h1 style="color: blue ;">Welcome !</h1>
</div>
<div>
<h1 style="color: blue ;">Register</h1>
<form:form action="/register" method="post" modelAttribute="user">
    <div class="mb-3">
        <form:label class="form-label" path="userName">Username</form:label>
        <form:errors style="color: red ;"  path="userName"/>
        <form:input class="form-control" path="userName"/>
    </div>
    <div class="mb-3">
        <form:label class="form-label" path="email">Email</form:label>
        <form:errors style="color: red ;"  path="email"/>
        <form:input class="form-control" path="email"/>
    </div>
    <div class="mb-3">
        <form:label class="form-label" path="password">Password</form:label>
        <form:errors style="color: red ;"  path="password"/>     
        <form:input type="password" class="form-control"  path="password"/>
    </div > 
       <div class="mb-3">
        <form:label class="form-label" path="confirm">Confirm Password</form:label>
        <form:errors style="color: red ;"  path="confirm"/>     
        <form:input type="password" class="form-control"  path="confirm"/>
    </div >   

    <input  class="btn btn-primary" type="submit" value="Submit"/>
</form:form>
</div>
<div>
<h1 style="color: blue ;">Login</h1>
<form:form action="/login" method="post" modelAttribute="LoginUser">
    <div class="mb-3">
        <form:label class="form-label" path="email">Email</form:label>
        <form:errors style="color: red ;"  path="email"/>
        <form:input class="form-control" path="email"/>
    </div>
    <div class="mb-3">
        <form:label class="form-label" path="password">Password</form:label>
        <form:errors style="color: red ;"  path="password"/>     
        <form:input type="password" class="form-control"  path="password"/>
    </div > 

    <input  class="btn btn-primary" type="submit" value="Submit"/>
</form:form>
</div>
</body>
</html>