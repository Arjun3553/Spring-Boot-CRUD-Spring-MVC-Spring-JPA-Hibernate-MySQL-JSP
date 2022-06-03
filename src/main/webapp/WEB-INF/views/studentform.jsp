<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>

	<div class="row justify-content-center align-items-center h-100">
		<div class="col col-sm-6 col-md-6 col-lg-4 col-xl-3">
			<h3>Student Form</h3>
			<form:form action="studentsubmit" method="post" modelAttribute="myapp">
				<form:hidden path="id" />
				<div class="form-group">
					<form:label path="name">Name</form:label>
					<form:input path="name" class="form-control" />

				</div>
				<div class="form-group">
					<form:label path="number">Number</form:label>
					<form:input path="number" class="form-control" />
				</div>
				<div class="form-group">
					<form:label path="email">Email</form:label>
					<form:input path="email" class="form-control" />
					<small id="emailHelp" class="form-text text-muted">We'll
						never share your email with anyone else.</small>
				</div>
				<button type="submit" class="btn btn-primary">Submit</button>
			</form:form>
		</div>
	</div>
</body>
</html>