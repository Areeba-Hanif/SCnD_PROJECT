<%@page import="main.*"%>

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

<h2>SignUP Status:</h2>
<%
    String name = request.getParameter("userName");
    String email = request.getParameter("userEmail");
    String password = request.getParameter("password");

   SignupService bp= new SignupServiceProxy().getSignupService();
   boolean result= bp.signUp(name, password, email);
   String message;
   
   if(result==true){
	  message="User is Registered SUccessfully " ;
   }
   else{
	   message="User Is Already Registered " ;
   }
%>
<label id="result"><%= message %> </label>


</body>
</html>