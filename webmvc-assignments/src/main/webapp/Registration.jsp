<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#pageBody{
	
	margin:0px;
	background-color:green;
	text-align:center;
	font-style:Caslon;
}

#head1{
	margin-top:10px;
}
#head5{
	font-style:Italic;	
}
#btn{
	border:4px solid black;
	padding:5px;
	margin:10px;
	color:blue;
	
}
</style>
</head>
<body>
<h1>Registration Form</h1>
<form action="register" method="post">

Fullname<br>
<input type="text" name="fullname"><br>
Email<br>
<input type="email" name="email"><br>
Password<br>
<input type="password" name="password"><br>
Mobile<br>
<input type="number" name="mobile"><br><br>
<input id="btn" type="submit"><input id="btn" type="reset">
</form>
</body>
</html>