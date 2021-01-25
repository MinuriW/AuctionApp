<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Online Auction System</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/poppear.js/1.12.9/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<!--social media icons-->
<script src="https://use.fontawesome.com/releases/v5.0.8/js/all.js"></script>
<link href="css/style.css" rel="stylesheet">
</head>
<body>


	<nav class="navbar navbar-expand-lg bg-white">

		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
			<div class="navbar-nav ml-auto">
				<a class="nav-item nav-link pr-5 active" href="#">Home</a> <a
					class="nav-item nav-link pr-5" href="#">View Bids</a> <a
					class="nav-item nav-link pr-5" href="#">Track Orders</a> <a
					class="nav-item nav-link pr-5" href="#">Login</a>
			</div>

			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-primary" type="submit">Search</button>
			</form>
		</div>
	</nav>


	<div class="container101">

		<div class="row">
			<div class="col-md-5">

				<div id="carouselExampleControls" class="carousel slide"
					data-ride="carousel">
					<div class="carousel-inner">
						<div class="carousel-item active">
							<img class="d-block w-100" src="img/biditem4.png"
								alt="First slide">
						</div>

						<div class="carousel-item">
							<img class="d-block w-100" src="img/Capture1.PNG"
								alt="Second slide">
						</div>
						<div class="carousel-item">
							<img class="d-block w-100" src="img/Capture2.PNG"
								" alt="Third slide">
						</div>
					</div>
					<a class="carousel-control-prev" href="#carouselExampleControls"
						role="button" data-slide="prev"> <span
						class="carousel-control-prev-icon" aria-hidden="true"></span> <span
						class="sr-only">Previous</span>
					</a> <a class="carousel-control-next" href="#carouselExampleControls"
						role="button" data-slide="next"> <span
						class="carousel-control-next-icon" aria-hidden="true"></span> <span
						class="sr-only">Next</span>
					</a>
				</div>

			</div>
			<div class="col-md-7">

				<h2>Men Sport LED Watch</h2>
				<h4>US $1</h4>
				<h4>3 bids</h4>

				<label for="bid">Enter $1.50 or more</label> <input type="text"
					id="bid" name="bid">


				<p>
					<small>6d 14h left (Mon, 02:32 AM)</small>
				</p>
				<p>
					<small>From United States</small>
				</p>

			</div>

		</div>

	</div>


	<hr>
	<section class="subs">
		<div class="container py-5 text-white ">
			<div class="row">
				<div class="col-lg-3 col-md-6 col-sm-6 col-12">
					<div class="row pt-2">
						<div class="col-lg-2 col-md-2 col-sm-2 col-2">
							<span><i class="fas fa-sync"></i></span>
						</div>
						<div class="col-lg-10 col-md-10 col-sm-10 col-10">
							<h5>Return & Exchange</h5>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-md-6 col-sm-6 col-12">
					<div class="row pt-2">
						<div class="col-lg-2 col-md-2 col-sm-2 col-2">
							<span><i class="fas fa-gift"></i></span>
						</div>
						<div class="col-lg-10 col-md-10 col-sm-10 col-10">
							<h5>Receive Gift cards</h5>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-md-6 col-sm-6 col-12">
					<div class="row pt-2">
						<div class="col-lg-2 col-md-2 col-sm-2 col-2">
							<span><i class="fas fa-user-shield"></i></span>
						</div>
						<div class="col-lg-10 col-md-10 col-sm-10 col-10">
							<h5>Online Support</h5>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-md-6 col-sm-6 col-12">
					<div class="row">
						<input type="text" placeholder="Your Email">
						<button class="btn1">SUBSCRIBE</button>
					</div>
				</div>

			</div>

		</div>
	</section>
	<section class="contact  bg-light pt-5 text-center">
		<div class="container bg-light">
			<div class="row py-3">
				<div class="col-lg-7 mx-auto">
					<input type="text" placeholder="Enter Your Email Address">
					<button class="btn4 my-5">GET NOTIFIED</button>
					<p>©Copyright 2021 All Rights Reserved</p>
				</div>
			</div>
		</div>
	</section>
</body>
</html>
