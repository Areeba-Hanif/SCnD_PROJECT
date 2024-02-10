
<%@ page import="main.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>E-Commerce Website</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            max-width: 600px;
            padding: 20px;
            background-color: #E6E6FA;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0,0,0,0.1);
            text-align: center;
        }
        h1 {
            color: #333;
        }
        p {
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>SEARCHED CUSTOMER INFORMATION</h1>

        <%
        String customerID = request.getParameter("CustomerID");
        SearchCustomer searchObj = new SearchCustomerProxy();
        String customerInfo = searchObj.searchCustomerInfo(customerID);
        %>

        <p>Customer Information : <%= (customerInfo != null && !customerInfo.isEmpty()) ? customerInfo : "ID Not Found!" %></p>
    </div>
</body>
</html>
