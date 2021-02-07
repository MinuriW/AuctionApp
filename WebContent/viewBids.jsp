<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Bids Details</title>
<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Online Auction System</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/poppear.js/1.12.9/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<!--social media icons-->
	<script src="https://use.fontawesome.com/releases/v5.0.8/js/all.js"></script>
	<link href="css/viewBids.css" rel="stylesheet">
</head>
<body>

<jsp:include page="includes/nav.jsp"></jsp:include>

<section class="collection">
<h1>My Bids</h1>
	<div class="container py-5">
	<h1 class="text-center">Won Items</h1>
		<h1 class="text-center"></h1>
		<div class="row py-5">
			
			<div class="col-lg-3">
				<div class="card mb-3">
				
				
<!--- Won Bids -->
					<img src= "img/watch-1.jpg"class="img-fluid" alt="">
					<h5>FASTRACK X ANANYA PANDAY-LEATHER STRAP WATCH</h5>
				
					<h5>6 bids </h5>
					<p><small><span>$2</span></small></p>
					  <h4 style="color: red;">Won</h4>
					
				</div>
			</div>

			<div class="col-lg-3">
				<div class="card mb-3">
					<img src= "img/biditem5.jpg"class="img-fluid" alt="">
					<h5>SKMWI 11155B Sport Watch</h5>
				
					<h5>5 bids </h5>
					
					<p><small><span>$2</span></small></p>
					  <h4 style="color: red;">Won</h4>
					
				</div>
			</div>

			<div class="col-lg-3">
				<div class="card mb-3">
					<img src= "img/watch-1.73.jpg" class="img-fluid" alt="">
					<h5> Skmi Stylish Watch</h5>
					<h5>11 bids </h5>
					<p><small><span>$2</span></small></p>
					  <h4 style="color: red;">Won</h4>
					
				</div>
			</div>


			<div class="col-lg-3">
				<div class="card mb-3">
					<img src="img/watch-8.jpg" class="img-fluid" alt="">
					<h5>Big Digital Mens Watch</h5>
					<h5>6 bids </h5>
					<p><small><span>$2</span></small></p>
					  <h4 style="color: red;">Won</h4>
					
					
				</div>
			</div>
			
		</div>
	</div>
	
</section>

<hr>

<section class="collection">
	<div class="container py-5">
		<h1 class="text-center">Lost Items</h1>
		<div class="row py-5">
		<!--- Watch Collection -->
			<div class="col-lg-3">
				<div class="card mb-3">
				
				
					<img src="img/biditem4.png" class="img-fluid" alt="">
					<h5>Men Sport LED Watch </h5>
					
					<h5>3 bids </h5>
					
					<p><small><span>$2</span></small></p>
					  <h4 style="color: red;">Lost</h4>
				</div>
			</div>

			<div class="col-lg-3">
				<div class="card mb-3">
					<img src= "img/biditem5.jpg"class="img-fluid" alt="">
					<h5>SKMWI 11155B Sport Watch</h5>
				
					<h5>5 bids </h5>
					<p><small><span>$2</span></small></p>
					  <h4 style="color: red;">Lost</h4>
					
				</div>
			</div>

			<div class="col-lg-3">
				<div class="card mb-3">
					<img src= "img/watch-1.73.jpg" class="img-fluid" alt="">
					<h5> Skmi Stylish Watch</h5>
					<h5>11 bids </h5>
					<p><small><span>$2</span></small></p>
					  <h4 style="color: red;">Lost</h4>
					
				</div>
			</div>


			<div class="col-lg-3">
				<div class="card mb-3">
					<img src="img/watch-8.jpg" class="img-fluid" alt="">
					<h5>Big Digital Mens Watch</h5>
					<h5>6 bids </h5>
					<p><small><span>$2</span></small></p>
					  <h4 style="color: red;">Lost</h4>
					
					
				</div>
			</div>
				</div>
	</div>
	
</section>
<jsp:include page="includes/footer.jsp"></jsp:include>

</body>
</html>