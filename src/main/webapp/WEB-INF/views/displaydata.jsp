<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Details</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<h3>Display Details</h3>
	<table class="table table-striped table-bordered table-dark">
		<thead>
			<tr>
				<th>Name</th>
				<th>Number</th>
				<th>Email</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${myapplist}" var="myapplist">
				<tr>
					<td>${myapplist.name }</td>
					<td>${myapplist.number }</td>
					<td>${myapplist.email }</td>
					<td><a href="/update?id=${myapplist.id }"
						class="btn btn-primary" role="button" aria-pressed="true">Update</a>
						<a href="/delete?id=${myapplist.id }" class="btn btn-danger"
						role="button" aria-pressed="true">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="/studentform" class="btn btn-success" role="button" aria-pressed="true">Add</a>
</body>
</html>