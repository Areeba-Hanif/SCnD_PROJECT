<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Order Response</title>
<link rel="stylesheet" href="styles.css">
</head>
<body>

<h1>Insert Orders Information</h1>
<form action="InsertOrderResponsePage.jsp">
<br/>


<label class="heading">Order Date</label><br/>
<input type="text" name="OrderDate" required>
<br/>
<label class="heading">Order Amount</label><br/>
<input type="text" name="TotalAmount" required>
<br/>
<label class="heading">Order Status</label><br/>
<input type="text" name="OrderStatus" required>
<br/>
<button type="submit">Insert</button>

</form>


</body>
</html>