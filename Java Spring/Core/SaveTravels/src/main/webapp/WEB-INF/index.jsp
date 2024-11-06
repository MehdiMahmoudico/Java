
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
        <title>Save Travels</title>
        <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
        <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
        
    </head>
<body class="container"> 
<div class="mt-3">
<h1 style="color: blue ;">Save Travels</h1>
	<table class="table table-hover">
 <thead>
	<tr>
      <th scope="col">Expense</th>
      <th scope="col">Vendor</th>
      <th scope="col">Amount</th>
      <th scope="col">Actions</th>
    </tr>
  </thead>
  	<tbody>
  		
		<c:forEach items="${travels}" var="travel">
		<tr>
		<td><a href="expenses/${travel.id}"><c:out value = "${travel.expenseName}"/></a></td>
		<td><c:out value = "${travel.vendor}"/></td>
		<td><c:out value = "${travel.amount}"/></td>
		<td class=" d-flex"><a class="btn btn-primary" href="/travels/edit/${travel.id}">Edit</a>&nbsp;
			<form action="/travels/delete/${travel.id}" method="post">
			    <input type="hidden" name="_method" value="delete">
			    <input class="btn btn-danger"  type="submit" value="Delete">
			</form>
		</td>
		</tr>
		</c:forEach>
		
	</tbody>
</table>
</div>
<div>
<h1 style="color: blue ;">Add an Expense</h1>
<form:form action="/travels" method="post" modelAttribute="travel">
    <div class="mb-3">
        <form:label class="form-label" path="expenseName">Expense Name</form:label>
        <form:errors style="color: red ;"  path="expenseName"/>
        <form:input class="form-control" path="expenseName"/>
    </div>
    <div class="mb-3">
        <form:label class="form-label" path="vendor">Vendor</form:label>
        <form:errors style="color: red ;"  path="vendor"/>
        <form:input class="form-control" path="vendor"/>
    </div>
    <div class="mb-3">
        <form:label class="form-label" path="amount">Amount</form:label>
        <form:errors style="color: red ;"  path="amount"/>     
        <form:input class="form-control" type="amount" path="amount"/>
    </div >  
        <div class="mb-3">
        <form:label class="form-label" path="description">Description</form:label>
        <form:errors style="color: red ;"  path="description"/>
        <form:textarea class="form-control" path="description"/>
    </div>  
    <input  class="btn btn-primary" type="submit" value="Submit"/>
</form:form>
</div>
</body>
</html>