<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ECOMMERCE PROJECT</title>
</head>
<body>
<h1>Stock Availability Checker</h1>
<form action="RetrieveProduct.jsp">
     <label>Product Name</label>
     <select name="prodName">
         <option value="Skirt">Skirt</option> 
         <option value="Shirt">Shirt</option> 
         <option value="Jeans">Jeans</option> 
         <option value="Tops">Tops</option> 
         <option value="Jacket">Jacket</option> 
     </select>
     <br/>
     <br/>
     <label>Product Quantity</label>
     <input name="prodQuantity" type="text"></input>
     <br/>
     <br/>
     <button type="submit">Get Stock Info</button>
</form>
</body>
</html>