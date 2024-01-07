<%@ page import="main.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ECOMMERCE PROJECT</title>
</head>
<body>
<h1>Stock Availability Checker</h1>
<%
Information bp= new InformationProxy().getInformation();
%>
<label>Stock Info: </label>
<%=(request.getParameter("prodName")) %>
<br/>
<br/>
</body>
</html>

