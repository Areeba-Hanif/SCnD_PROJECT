<%@page import="main.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" />
<title>SIGN UP</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light" >
    <div class="container-fluid">
        <a class="navbar-brand" href="#">
            <img   src="logo2.png" width="90" height="70" />
        </a>
      
            <ul class="navbar-nav mr-auto"></ul>
            <ul class="navbar-nav">
                <li class="nav-item active">
                    <a class="nav-link" href="./index.html"><i class="fas fa-home"></i> Home</a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link"  href="./shop.html">  <i class="fa fa-shopping-bag"></i> Shop</a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link"  href="./login.html"><i class="fas fa-sign-in-alt"></i> Login</a>
                </li>
               
               
                 <li class="nav-item active">
                    <a class="nav-link"  href="./cart.html"><i class="fas fa-shopping-cart"></i> Cart</a>
                </li>
            </ul>

        
    </div>
</nav>


<h2>SignUp Status:</h2>
<%
    String name = request.getParameter("firstName")+" "+request.getParameter("lastName");
    String email = request.getParameter("email");
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
<h3 id="result"><%= message %> </h3>


</body>
</html>