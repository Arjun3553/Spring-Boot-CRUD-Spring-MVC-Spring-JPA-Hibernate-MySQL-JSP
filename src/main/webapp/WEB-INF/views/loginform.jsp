<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>

	<div class="row justify-content-center align-items-center h-100">
		<div class="col col-sm-6 col-md-6 col-lg-4 col-xl-3">
			<h3 style="color: red">${errormsg }</h3>
			<h3>LOGIN FORM</h3>
			<form action="loginform" method="post">
				<div class="form-group">
					<label>Username</label> <input type="text" name="username"
						class="form-control">
				</div>
				<div class="form-group">
					<label>Password</label> <input type="password" name="password"
						class="form-control">
				</div>
				<button type="submit" class="btn btn-primary">Submit</button>
			</form>
		</div>
	</div>
</body>
</html>