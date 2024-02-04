<%@ page import="main.ViewAllOrders, main.ViewAllOrdersProxy, main.Order" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" />
    <title>Display All Orders</title>
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
                    <a class="nav-link" href="#"> <i class="fas fa-sign-out-alt"></i> Logout</a>
                </li>
                   
                </ul>
            </div>
        </nav>

<%
    ViewAllOrders bp = new ViewAllOrdersProxy().getViewAllOrders();
    Order[] orders = bp.getOrders();
%>

<h2>All Orders:</h2>
 <a style="margin: 20px 20px" class="btn btn-primary" href="./productsAdd.html"><i class="fa fa-cube"></i> Add Order</a>
 <div class="container-fluid">

   
    <table class="table">
        <thead class="thead-light">
        <tr>
            <th scope="col">Order ID</th>
            <th scope="col">Order Date</th>
            <th scope="col">Total Amount</th>
            <th scope="col">Order Status</th>
              </tr>
        </thead>
        <tbody>
<%
    for (Order order : orders) {
%>

        <tr>
            <th scope="row"><%= order.getOrderId() %></th>						
            <td><%= order.getOrderDate() %></td>
            <td><%= order.getTotalAmount() %> </td>
            <td><%= order.getOrderStatus() %></td>
        </tr>
       
<%
    }
%>
 </tbody>
    </table>
</div>

</body>
</html>
