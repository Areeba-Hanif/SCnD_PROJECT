<%@ page import="main.*" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN </title>
<link rel="stylesheet" href="styles.css">
</head>
<body>
<%
		String Email = request.getParameter("email");
		String Password = request.getParameter("password");
		
		
		LoginService bp = new LoginServiceProxy().getLoginService();
		String message="";
		boolean  result = bp.login(Email,Password);
		if(result==true){
			message="YOU ARE LOGGED IN SUCCESSFULLY";
		}
		else{
			message="WRONG EMAIL OR PASSWORD";
		}
%>
<h2>Login Results:</h2>
<label id="result"><%=message  %> </label>
</body>
</html>