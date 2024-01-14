<%@ page import="main.*" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Order Information Provider</title>
<link rel="stylesheet" href="styles.css">
</head>
<body>
<h1>Order Information Provider</h1>
<br/>
<br/>
<%
	String orderIDString = request.getParameter("OrderID");
	int orderId = 0;
	orderId = Integer.parseInt(orderIDString);
	
	RetrieveOrderInformation bp = new RetrieveOrderInformationProxy().getRetrieveOrderInformation();
	Order result = bp.getOrderInformation(orderId);
	
	String orderDetails = (result != null) ? "<br/>Order ID: " + result.getOrderId() +
	        ",<br/> Order Date:     " + result.getOrderDate() +
	        ", <br/>Total Amount:    " + result.getTotalAmount() +
	        ",<br> Order Status:     " + result.getOrderStatus()
	        : "<h3>Order not found</h3>";
%>
<h2>Order Information:</h2>
<label id="result"><%= orderDetails %> </label>
</body>
</html>
