<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<p>you have visited this website <c:out value="${count }"></c:out> times </p>
<a href="/" target="_blank" onclick="refreshPage()">home</a>
<a href="/2" target="_blank" onclick="refreshPage()">increment by 2</a>
<a href="/reset" target="_blank" onclick="refreshPage()">reset</a>
    <script>
        function refreshPage() {
        	 setTimeout(() => {
                 window.location.reload();
             }, 500);
        }
    </script>
</body>
</html>