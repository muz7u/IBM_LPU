<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Hello Muzzu in Spring MVC!!
<br>
<br>

Student Name: ${param.studentName}

<a href="/processFormVersion2">version 2</a>
<a href="/processFormVersion3">version 3</a>

<br><br>

</body>
</html>