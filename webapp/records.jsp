<%@page import="myWallet.DAO.*" import = "java.util.Base64" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="x" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Records</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<table class="table table-bordered table-striped" >
	
		<thead class="thead-dark">
			<tr>
			
				<th>Payment Price</th>
				<th>Description</th>
				<th>Payment Date</th>
				<th>Payment Time</th>
				<th>Payment Type</th>
				<th>Category</th>
				<th>Payment Recipt</th>
				<th>Edit Options</th>
			
			</tr>
			
		</thead>
		
		<tbody>
		
			<%
    			// Assuming 'variableName' is set in the servlet
    			String userName = (String)request.getAttribute("userName");
			%>
		
			<x:forEach var="wallet" items="<%=HomePageDAO.display(userName) %>" >
			
			<tr>
			
				<td> ${wallet.price } </td>
				<td> ${wallet.description } </td>
				<td> ${wallet.paymentDate } </td>
				<td> ${wallet.paymentTime } </td>
				<td> ${wallet.paymentType } </td>
				<td> ${wallet.category } </td>
				<td> <img alt="Product Image" src="data:image/jpeg;base64,${ Base64.getEncoder().encodeToString(wallet.paymentRecipt) }"
				style="max-width: 150px; max-height: 150px"> </td>
				
				<td>
					<form action="./DeleteServlet" method="post" >
						<input type="hidden" name="price" value="${wallet.price }"/>
						<input type="hidden" name="description" value="${wallet.description }"/>
						<!-- <input type="hidden" name="paymentDate" value="${wallet.paymentDate }"/>  -->
						<input type="hidden" name="paymentTime" value="${wallet.paymentTime }"/>
						<input type="hidden" name="paymentType" value="${wallet.paymentType }"/>
						<input type="hidden" name="category" value="${wallet.category }"/>
						<input type="hidden" name="userName" value="<%= request.getAttribute("userName") %>"/>
						<button type="submit"><span class="glyphicon glyphicon-trash"></span></button>
					</form>
				</td>
				
			</tr>
			
			</x:forEach>
		
		</tbody>
	
	</table>

</body>
</html>