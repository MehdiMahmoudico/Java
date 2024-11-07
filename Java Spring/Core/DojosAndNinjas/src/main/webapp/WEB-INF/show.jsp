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
        <title>Dojo</title>
        <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
        <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
        
    </head>
<body class="container">
 <div class="mt-3 d-flex justify-content-between">
<h1 style="color: blue ;">${dojo.name}</h1>
</div>
		<p>First Name: <c:out value = "${ninja.firstName}"/></p>
		<p>Last Name: <c:out value = "${ninja.lastName}"/></p>
		<p>Age: <c:out value = "${ninja.age}"/></p>
		
</body>
</html>