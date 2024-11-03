<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Results</title>
</head>
<body>
    <div class="container">
        <p>In <c:out value="${formData.number}"/> years, you will live in <c:out value="${formData.city}"/> 
        with <c:out value="${formData.person}"/> as your roomate, <c:out value="${formData.hobby}"/> for a living.
        the next time you see a <c:out value="${formData.livingThing}"/> you will have good luck. Also, <c:out value="${formData.niceMessage}"/></p>
		<a href="/omikuji">Go Back !</a>
    </div>
</body>
</html>

