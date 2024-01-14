<%@ page import="main.*" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Order Response Page</title>
<link rel="stylesheet" href="styles.css">
</head>
<body>


<h2> Order Update Status:</h2>

<%
	String orderIDString = request.getParameter("OrderID");
	int OrderId = 0;
	OrderId = Integer.parseInt(orderIDString);
	
	String newOrderDate = request.getParameter("OrderDate");
	String newTotalAmount = request.getParameter("TotalAmount");
	String newOrderStatus = request.getParameter("OrderStatus");
	
	UpdateOrderInformation bp = new UpdateOrderInformationProxy().getUpdateOrderInformation();
	String message=bp.updateOrder(OrderId, newOrderDate, newTotalAmount, newOrderStatus);


%>

<label id="result"><%=message  %> </label>
</body>
</html>