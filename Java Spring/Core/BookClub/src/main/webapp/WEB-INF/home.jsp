<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>Welcome</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body class="container"> 
<div class="mt-3">
    <h1 style="color: blue;">Welcome ${user.userName}!</h1>
    <p><a href="/books">New Book</a></p>
    <p><a href="/logout">Logout</a></p>

    <!-- Search Bar Section -->
    <nav class="navbar bg-body-tertiary">
        <div class="container">
            <form class="d-flex w-100" role="search" action="/search" method="get">
                <!-- Search Input -->
                <input class="form-control w-75" type="search" placeholder="Search by title" aria-label="Search" name="title">
                
                <!-- Search Button -->
                <button class="btn btn-outline-success ms-2" type="submit">Search</button>
            </form>
        </div>
    </nav>

    <!-- Book List Table -->
    <table class="table table-hover mt-3">
        <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Title</th>
                <th scope="col">Author</th>
                <th scope="col">Thoughts</th>
                <th scope="col">Posted By</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${books}" var="book">
                <tr>
                    <th scope="row"><c:out value="${book.id}"/></th>
                    <td><a href="books/${book.id}"><c:out value="${book.title}"/></a></td>
                    <td><c:out value="${book.author}"/></td>
                    <td><c:out value="${book.thoughts}"/></td>
                    <td><c:out value="${book.userc.userName}"/></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
