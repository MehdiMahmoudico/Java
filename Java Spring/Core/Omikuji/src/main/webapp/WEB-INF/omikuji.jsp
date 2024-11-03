<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <form:form action="/omikuji/process" method="POST" modelAttribute="command">
            <div class="form-group">
                <form:label path="number">Pick any number from 5 to 25:</form:label>
                <form:input path="number" type="number" class="form-control" min="5" max="25" placeholder="Enter Number"/>
            </div>
            <div class="form-group">
                <form:label path="city">Enter the name of any city:</form:label>
                <form:input path="city" class="form-control" placeholder="Enter City Name"/>
            </div>
            <div class="form-group">
                <form:label path="person">Enter the name of any real person:</form:label>
                <form:input path="person" class="form-control" placeholder="Enter Name"/>
            </div>
            <div class="form-group">
                <form:label path="hobby">Enter Professional endeavor or hobby:</form:label>
                <form:input path="hobby" class="form-control" placeholder="Enter endeavor or hobby"/>
            </div>
            <div class="form-group">
                <form:label path="livingThing">Enter any type of living thing:</form:label>
                <form:input path="livingThing" class="form-control" placeholder="Enter living type"/>
            </div>
            <div class="form-group">
                <form:label path="niceMessage">Say something nice to someone:</form:label>
                <form:textarea path="niceMessage" class="form-control" placeholder="Enter something nice"></form:textarea>
            </div>
            <div class="form-group">
                <input type="submit" class="btn btn-primary" value="Send and show a friend"/>
            </div>
        </form:form>
    </div>
</body>
</html>
