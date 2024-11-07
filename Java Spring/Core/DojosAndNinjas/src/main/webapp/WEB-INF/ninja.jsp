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
        <title>Ninja</title>
        <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
        <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
        
    </head>
<body class="container">
<div>
<h1 style="color: blue ;">New Ninja</h1>
<form:form action="/ninjas" method="post" modelAttribute="ninja">
      <div class="mb-3">
        <form:label class="form-label" path="dojo">Dojo</form:label>
        <form:errors style="color: red ;"  path="dojo"/>
        <form:select class="form-control" path="dojo">
					<form:option value="0" label="Select Dojo" />
					<c:forEach var="dojo" items="${dojos}">
						<form:option value="${dojo.id}" label="${dojo.name}" />
					</c:forEach>
				</form:select>
    </div>  
    <div class="mb-3">
        <form:label class="form-label" path="firstName">First Name</form:label>
        <form:errors style="color: red ;"  path="firstName"/>
        <form:input class="form-control" path="firstName"/>
    </div>
    <div class="mb-3">
        <form:label class="form-label" path="lastName">Last Name</form:label>
        <form:errors style="color: red ;"  path="lastName"/>
        <form:input class="form-control" path="lastName"/>
    </div>
    <div class="mb-3">
        <form:label class="form-label" path="age">Age</form:label>
        <form:errors style="color: red ;"  path="age"/>     
        <form:input class="form-control" type="number" path="age"/>
    </div >  
  
    <input  class="btn btn-primary" type="submit" value="Submit"/>
</form:form>
</div>
</body>
</html>