<%@ page import="main.ViewAllOrders, main.ViewAllOrdersProxy, main.Order" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Display All Orders</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>

<%
    ViewAllOrders bp = new ViewAllOrdersProxy().getViewAllOrders();
    Order[] orders = bp.getOrders();
%>

<h2>All Orders:</h2>
<%
    for (Order order : orders) {
%>
    <p>Order ID: <%= order.getOrderId() %></p>
    <p>Order Date: <%= order.getOrderDate() %></p>
    <p>Total Amount: <%= order.getTotalAmount() %></p>
    <p>Order Status: <%= order.getOrderStatus() %></p>
    <hr>
<%
    }
%>

</body>
</html>
