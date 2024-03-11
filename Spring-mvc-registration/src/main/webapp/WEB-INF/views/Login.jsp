<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Login Page</h1><br>
<form:form action="http://localhost:2023/Spring-mvc-registration/user/loginUser" method="post">
Email <input type="text" name="email"><br>
Password <input type="password" name="pword"><br><br>
<input type="submit">
<input type="reset">
</form:form>
</body>
</html>