<%@page import="com.entity.RestaurantEntity"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>List Restaurants</h2>
	<%
		List<RestaurantEntity> restaurants=(List<RestaurantEntity>)request.getAttribute("restaurants");
	%>
	
	<table border="1">
		<tr>
			<th>RestaurantId</th>
			<th>Name</th>
			<th>Category</th>
			<th>Action</th>
		</tr>
		<%
		for (RestaurantEntity r : restaurants) {
			out.print("<tr>");
			out.print("<td>" + r.getRestaurantId() + "</td>");
			out.print("<td>" + r.getName() + "</td>");
			out.print("<td>" + r.getCategory() + "</td>");
			out.print("<td><a href='deleterestaurant?restaurantId="+r.getRestaurantId()+"'>Delete</a>");
			out.print(" | <a href='editrestaurant?restaurantId="+r.getRestaurantId()+"'>Edit</a></td>");
			out.print("</tr>");
		}
		%>
	</table>
</body>
</html>