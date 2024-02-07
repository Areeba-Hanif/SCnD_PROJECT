<%@ page import="ecommerceWebsite.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>E-Commerce Website</title>
</head>
<body>
<h1>SEARCHED CUSTOMER INFORMATION</h1>

<%
String customerID = request.getParameter("CustomerID");
SearchCustomer searchObj = new SearchCustomerProxy();
String customerInfo = searchObj.searchCustomerInfo(customerID);
%>

<p>Customer Information : <%= (customerInfo != null && !customerInfo.isEmpty()) ? customerInfo : "ID Not Found!" %></p>

</body>
</html>
