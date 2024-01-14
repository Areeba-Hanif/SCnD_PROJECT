<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SIGN UP</title>
<link rel="stylesheet" href="styles.css">
</head>
<body>

<h1>SIGN UP HERE </h1>
<form action="SignUpResponse.jsp">
<br/>

<label class="heading">Name</label><br/>
<input type="text" name="userName" required>
<br/>
<label class="heading">Password</label><br/>
<input type="text" name="userEmail" required>
<br/>
<label class="heading">Email</label><br/>
<input type="text" name="password" required>
<br/>
<button type="submit">SIGN UP</button>

</form>

</body>
</html>