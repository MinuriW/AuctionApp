<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link href="../css/searchItems.css" rel="stylesheet">
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
			<a class="nav-item nav-link pr-5 active" href="searchItem.jsp">Home</a>
			<a class="nav-item nav-link pr-5" href="#">View Bids</a> <a
				class="nav-item nav-link pr-5" href="#">My Bids</a> <a
				class="nav-item nav-link pr-5" href="#">Log out</a>
		</div>

	</div>
</nav>

<div class="dropdown">
  <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
    My Bids
  </button>
  <div class="dropdown-menu">
    <a class="dropdown-item" href="#won items">Won Items</a>
    <a class="dropdown-item" href="#lost items">Lost Items</a>
    <a class="dropdown-item" href="#ongoing bids">Ongoing Bids</a>
  </div>
</div>

<section class="collection">
	<div class="container py-5">
	<h1 class="text-center" id="won items">Won Items</h1>
		<h1 class="text-center"></h1>
		<div class="row py-5">
			
			<div class="col-lg-3">
				<div class="card mb-3">
				
				
<!--- Won Bids -->
					<img src= "img/watch-1.jpg"class="img-fluid" alt="">
					<h5>FASTRACK X ANANYA PANDAY-LEATHER STRAP WATCH</h5>
				
					<h5>6 bids </h5>
					<p><small><span>$2</span></small></p>
					 <h3 style="color: #8db0f2;">Won</h3>
					
				</div>
			</div>

			
			<div class="col-lg-3">
				<div class="card mb-3">
					<img src="img/biditem4.png" class="img-fluid" alt="">
					<h5> Skmi Stylish iWatch</h5>
					<h5>11 bids </h5>
					<p><small><span>$2</span></small></p>
					  <h3 style="color: #8db0f2;">Won</h3>
					
				</div>
			</div>
			
			<div class="col-lg-3">
				<div class="card mb-3">
					<img src= "img/watch-1.73.jpg" class="img-fluid" alt="">
					<h5> Skmi Stylish Watch</h5>
					<h5>11 bids </h5>
					<p><small><span>$2</span></small></p>
					  <h3 style="color: #8db0f2;">Won</h3>
					
				</div>
			</div>


			<div class="col-lg-3">
				<div class="card mb-3">
					<img src="img/watch-8.jpg" class="img-fluid" alt="">
					<h5>Big Digital Mens Watch</h5>
					<h5>6 bids </h5>
					<p><small><span>$2</span></small></p>
					   <h3 style="color: #8db0f2;">Won</h3>
					
					
				</div>
			</div>
			
		</div>
	</div>
	
</section>

<hr>

<section class="collection">
	<div class="container py-5">
		<h1 class="text-center"id="lost items">Lost Items</h1>
		<div class="row py-5">
		<!--- Watch Collection -->
			<div class="col-lg-3">
				<div class="card mb-3">
				
				
					<img src="img/books-1.jpg" class="img-fluid" alt="">
					<h5>Photography Book</h5>
					
					<h5>3 bids </h5>
					
					<p><small><span>$2</span></small></p>
					  <h3 style="color: #8db0f2;">Lost</h3>
				</div>
			</div>

			

			<div class="col-lg-3">
				<div class="card mb-3">
					<img src= "img/books-2.jpg" class="img-fluid" alt="">
					<h5>High Quality Note Book</h5>
					<h5>11 bids </h5>
					<p><small><span>$2</span></small></p>
					   <h3 style="color: #8db0f2;">Lost</h3>
					
				</div>
			</div>
			
			<div class="col-lg-3">
				<div class="card mb-3">
					<img src= "img/books-3.jpg" class="img-fluid" alt="">
					<h5>High-End Note Book</h5>
					<h5>11 bids </h5>
					<p><small><span>$2</span></small></p>
					   <h3 style="color: #8db0f2;">Lost</h3>
					
				</div>
			</div>


			<div class="col-lg-3">
				<div class="card mb-3">
					<img src="img/books-4.jpg" class="img-fluid" alt="">
					<h5>Phy-Note Book</h5>
					<h5>6 bids </h5>
					<p><small><span>$2</span></small></p>
					  <h3 style="color: #8db0f2;">Lost</h3>
					
					
				</div>
			</div>
				</div>
	</div>
	
</section>

<section class="collection">
	<div class="container py-5">
		<h1 class="text-center"id="ongoing bids">Ongoing Bids</h1>
		<div class="row py-5">
		<!--- Watch Collection -->
			<div class="col-lg-3">
				<div class="card mb-3">
					<img src= "img/heels.jpg" class="img-fluid" alt="">
					<h5>Ladies Heels</h5>
				
					<h5>5 bids </h5>
					<input type="button" onclick="location.href='View Bids.jsp'" value=" Place bid">
					<p><small><span>$2</span></small></p>
					  
					
				</div>
			</div>
			
			<div class="col-lg-3">
				<div class="card mb-3">
					<img src= "img/Capture1.PNG" class="img-fluid" alt="">
					<h5> iWatch -232921i</h5>
					<h5>11 bids </h5>
					<input type="button" onclick="location.href='View Bids.jsp'" value=" Place bid">
					<p><small><span>$2</span></small></p>
					  
					
				</div>
			</div>
			
			<div class="col-lg-3">
				<div class="card mb-3">
					<img src= "img/Capture2.PNG" class="img-fluid" alt="">
					<h5>Stylish iWatch</h5>
					<h5>11 bids </h5>
					<input type="button" onclick="location.href='View Bids.jsp'" value=" Place bid">
					<p><small><span>$2</span></small></p>
					
					
				</div>
			</div>


<div class="col-lg-3">
				<div class="card mb-3">
					<img src="img/Submit items.jpg" class="img-fluid" alt="">
					<h5>Rose Gold Watch</h5>
				
					<h5>5 bids </h5>
					<input type="button" onclick="location.href='View Bids.jsp'" value=" Place bid">
					<p><small><span>$4</span></small></p>
					 
					
				</div>
			</div>
				</div>
	</div>
	
</section>

<hr>
<jsp:include page="../includes/footer.jsp"></jsp:include>



</body>
</html>
