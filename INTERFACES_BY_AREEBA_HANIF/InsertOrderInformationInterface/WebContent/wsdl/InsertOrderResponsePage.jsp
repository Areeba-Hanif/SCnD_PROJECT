<%@ page import="main.InsertOrderInformation, main.InsertOrderInformationProxy" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Order Insert Response</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" />
    <link rel="stylesheet" href="style.css">
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">
                <img src="logo2.png" width="100" height="90" />
            </a>

            <ul class="navbar-nav mr-auto"></ul>
            <ul class="navbar-nav">
                <li class="nav-item active">
                    <a class="nav-link" href="./index.html"><i class="fas fa-home"></i> Home</a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="./shop.html">
                        <i class="fas fa-shopping-bag"></i> Shop</a>
                </li>
                 <li class="nav-item active">
                    <a class="nav-link"  href="./cart.html"><i class="fas fa-shopping-cart"></i> Cart</a>
                </li>
                
                 <li class="nav-item active">
                    <a class="nav-link" href="#"> <i class="fas fa-sign-out-alt"></i> Logout</a>
                </li>
            </ul>
        </div>
    </nav>
<br/>


<%
    String orderDate = request.getParameter("OrderDate");
    String totalAmount = request.getParameter("TotalAmount");
    String orderStatus = request.getParameter("OrderStatus");

   InsertOrderInformation bp= new InsertOrderInformationProxy().getInsertOrderInformation();
   String message= bp.setOrderInformation(orderDate, totalAmount, orderStatus);

%>

<h2>Insert Order Status:</h2>
<h3 id="result"><%= message %> </h3>

</body>
</html>
