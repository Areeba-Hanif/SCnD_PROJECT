<%@ page import="main.InsertOrderInformation, main.InsertOrderInformationProxy" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Order Update Status</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>

<h2>Insert Order Status:</h2>

<%
    String orderDate = request.getParameter("OrderDate");
    String totalAmount = request.getParameter("TotalAmount");
    String orderStatus = request.getParameter("OrderStatus");

   InsertOrderInformation bp= new InsertOrderInformationProxy().getInsertOrderInformation();
   String message= bp.setOrderInformation(orderDate, totalAmount, orderStatus);

%>

<label id="result"><%= message %> </label>

</body>
</html>
