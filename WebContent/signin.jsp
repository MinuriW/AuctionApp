<%@page import="com.hcl.controller.notification.Notification"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Login</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/poppear.js/1.12.9/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="js/submitpage.js"></script>
<!--social media icons-->
<script src="https://use.fontawesome.com/releases/v5.0.8/js/all.js"></script>
<link href="css/style2.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/login.js"></script>

<style>
body {
	font-family: 'poppins', sans-serif;
}
</style>


</head>



<body>
	<div class="wrapper">
		<div class="container">
			
			<%
			Notification error = (Notification) request.getAttribute("ERROR");
				
			if(error != null) {
		%>
			
			<div id="warning"
				class="alert alert-warning alert-dismissible fade in">
				<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
				<strong><%=error.getMessage() %></strong> 
				
			</div>
			
			<%
			}
		%>
		<h1>Sign in</h1>
			<form class="form" action="signIn" method="post">
				<input required id="username" name="username" type="text"
					placeholder="Username"> <input required id="password"
					name="password" type="password" placeholder="Password">
				<button type="submit" id="signup-button">Sign in</button>
			</form>
		</div>

		<ul class="bg-bubbles">
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>
	</div>

</body>
</html>







