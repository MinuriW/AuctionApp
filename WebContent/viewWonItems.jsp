<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="includes/validateUser.jsp"%>    


<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Online Auction System</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/poppear.js/1.12.9/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<!--social media icons-->
	<script src="https://use.fontawesome.com/releases/v5.0.8/js/all.js"></script>
	<link href="css/style.css" rel="stylesheet">
</head>
<body>

      

<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<jsp:include page="includes/nav.jsp"></jsp:include>
<section class="collection">
	<div class="container py-5">
		<h1 class="text-center">Won Items</h1>
		<div class="row py-5">
			<div class="col-lg-3">
				<div class="card mb-3">
				
				<!--- Watch Collection -->
					<img src= "img/watch-1.jpg"class="img-fluid" alt="">
					<h5>FASTRACK X ANANYA PANDAY-LEATHER STRAP WATCH</h5>
				
					<h5> bids </h5>
					<h5>3 bids </h5>
					
					<p><small><del>$2.05</del><span>$1</span></small></p>
					<p><small>4d 14h left (Mon, 02:32 AM)</small></p>
					
				
				</div>
			</div>


			<div class="col-lg-3">
				<div class="card mb-3">
					<img src= "img/watch-1.73.jpg" class="img-fluid" alt="">
					<h5> Skmi Stylish Watch</h5>
					<h5>11 bids </h5>
					
					<p><small><del>$2.05</del><span>$1</span></small></p>
					<p><small>4d 14h left (Mon, 02:32 AM)</small></p>
					
				</div>
			</div>


			<div class="col-lg-3">
				<div class="card mb-3">
					<img src="img/books-2.jpg" class="img-fluid" alt="">
					<h5>Big Digital Mens Watch</h5>
					<h5>6 bids </h5>
					
					<p><small><del>$5.05</del><span>$3</span></small></p>
					<p><small>1d 14h left (Mon, 02:32 AM)</small></p>
					
					
				</div>
			</div>

			<div class="col-lg-3">
				<div class="card mb-3">
					<img src= "img/books-4.jpg" class="img-fluid" alt="">
					<h5> Skmi Stylish Watch</h5>
					<h5>11 bids </h5>
					
					<p><small><del>$2.05</del><span>$1</span></small></p>
					<p><small>4d 14h left (Mon, 02:32 AM)</small></p>
					
				</div>
			</div>

		</div>
	</div>

</section>


<jsp:include page="includes/footer.jsp"></jsp:include>


</body>
</html>







