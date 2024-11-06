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
        <title>Travel</title>
        <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
        <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
        
    </head>
<body class="container">
 <div class="mt-3 d-flex justify-content-between">
<h1 style="color: blue ;">Expense Details</h1>
<a href="/expenses">Go Back</a>
</div>
		<p>Expense Name: <c:out value = "${travel.expenseName}"/></p>
		<p>Expense Description: <c:out value = "${travel.description}"/></p>
		<p>Vendor: <c:out value = "${travel.vendor}"/></p>
		<p>Amount Spend: <c:out value = "${travel.amount}$"/></p>
</body>
</html>