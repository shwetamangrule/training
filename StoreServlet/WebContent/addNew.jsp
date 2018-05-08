<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Enter Customer Details</h1>
</div>
<form action="StoreController"  method="post">
<table border=1 align="center">
			<tr>
				<td><label for="Customer_Id">Customer Id</label></td>
				<td>
					<input name="CustomGDDFG" required="true" placeholder="Customer ID" />
				</td>
			</tr>
			<tr>
				<td><label for="customer_Name">Customer Name</label></td>
				<td>
					<input  name="customer_Name" required="true" placeholder="Customer Name" />
				</td>
			</tr>
			<tr>
				<td><label for="customer_Address">Customer Address</label></td>
				<td>
					<input  name="customer_Address" required="true" placeholder="Customer Address" />
				</td>
			</tr>
			<tr>
				<td><label for="payment_Mode">paymentMode</label></td>
				<td>
<!-- 					<input type="text" name="paymentMode" value="Cash"/>Cash -->
<!-- 					<input type="radio" name="paymentMode" value="Card"/>Card -->
				<input  name="payment_Mode" required="true" placeholder="payment Mode" />

				</td>
			</tr>
			<tr>
				<td><label for="retailer_id">Retailer Id</label></td>
				<td>
					<input  name="retailer_id" required="true" placeholder="Retailer Id" />
				</td>
			</tr>
			<tr>
					<td><button type="submit">Add Customer</button></td>
			</tr>
			</table>
</form>
</body>
</html>