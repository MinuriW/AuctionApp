<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Sign up</title>
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
<script src="js/signup.js"></script>

<style>
 body{
  font-family: 'poppins',sans-serif;
 
 }

</style>
</head>
<body>
	<div class="wrapper">
    <div class="container">
        <h1>Signup</h1>

        <form class="form" method="post" action="signup">
        	<input required type="text" name="username" placeholder="Username">
            <input required type="text" name="firstname" placeholder="First name">
            <input required type="text" name="lastname" placeholder="Last name">
            <input required type="email" name="email" placeholder="Email">
            <input required type="password" name="password" placeholder="Password">
            <button type="submit" id="signup-button">Signup</button>
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







