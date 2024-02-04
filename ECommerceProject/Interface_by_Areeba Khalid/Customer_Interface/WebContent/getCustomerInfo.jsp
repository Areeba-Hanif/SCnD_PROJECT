<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>E-Commerce Website</title>
</head>
<body>
<h1>SEARCH CUSTOMERS</h1>
<form action="getInfo.jsp">
	<label>Enter Customer ID (eg:c1,c2..) : </label>
		<input name="CustomerID" type="text"></input>
		<br>
		<br>
		<button type="submit">Display Info</button>
</form>
</body>
</html>