<%@ include file="includes/validateUser.jsp"%>
<html>

<head>
<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Update Item</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/poppear.js/1.12.9/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<!--social media icons-->
	<script src="https://use.fontawesome.com/releases/v5.0.8/js/all.js"></script>
	<link href="css/style.css" rel="stylesheet">
	
</head>

<body>

<jsp:include page="includes/navSeller.jsp"></jsp:include>

<!--- Cards -->




<section class="collection">
	<div class="container py-5">
	
		
		<div class="row py-5">
				<div class="col-lg-3">
				<div class="card mb-3">
					<img src= "img/watch-1.jpg"class="img-fluid" alt="">
					<h5>FASTRACK WATCH</h5>
				
					<h5>5 bids </h5>
					<p><small><del>$10.05</del><span>$8</span></small></p>
					<p><small>5d 14h left (Mon, 02:32 AM)</small></p>
					<button type="button" class="btn btn-outline-primary">Update Item</button>
					<button type="button" class="btn btn-outline-danger">Delete Item</button>
					
					
				</div>
				
			</div>

			<div class="col-lg-3">
				<div class="card mb-3">
					<img src= "img/biditem5.jpg"class="img-fluid" alt="">
					<h5>SKMWI Sport Watch</h5>
				
					<h5>5 bids </h5>
					<p><small><del>$10.05</del><span>$8</span></small></p>
					<p><small>5d 14h left (Mon, 02:32 AM)</small></p>
					<button type="button" class="btn btn-outline-primary">Update Item</button>
					<button type="button" class="btn btn-outline-danger">Delete Item</button>
					
				</div>
			</div>

			<div class="col-lg-3">
				<div class="card mb-3">
					<img src= "img/watch-1.73.jpg" class="img-fluid" alt="">
					<h5> Skmi Stylish Watch</h5>
					<h5>11 bids </h5>
				
					<p><small><del>$2.05</del><span>$1</span></small></p>
					<p><small>4d 14h left (Mon, 02:32 AM)</small></p>
					<button type="button" class="btn btn-outline-primary">Update  Item</button>
					<button type="button" class="btn btn-outline-danger">Delete Item</button>
				</div>
			</div>


			<div class="col-lg-3">
				<div class="card mb-3">
					<img src="img/watch-8.jpg" class="img-fluid" alt="">
					<h5>Big Digital Mens Watch</h5>
					<h5>6 bids </h5>
					
					<p><small><del>$5.05</del><span>$3</span></small></p>
					<p><small>1d 14h left (Mon, 02:32 AM)</small></p>
					<button type="button" class="btn btn-outline-primary">Publish Item</button>
					<button type="button" class="btn btn-outline-danger">Delete Item</button>
				
					
				</div>
			</div>
			
			
			
			<!--- books Collection -->
			<div class="col-lg-3">
				<div class="card mb-3">
				
					<img src="img/books-1.jpg" class="img-fluid" alt="">
					<h5>High-End Note Book</h5>
					<h5>1 bid</h5>
					
					
					<p><small><del>$2.05</del><span>$1</span></small></p>
					<p><small>9d 14h left (Mon, 02:32 AM)</small></p>
					<button type="button" class="btn btn-outline-primary">Publish Item</button>
					<button type="button" class="btn btn-outline-danger">Delete Item</button>
					
				</div>
			</div>
			
			<div class="col-lg-3">
				<div class="card mb-3">
				
					<img src="img/books-2.jpg" class="img-fluid" alt="">
					<h5>Custom Note Book</h5>
					<h5>2 bid</h5>
			
					<p><small><del>$1.05</del><span>$1</span></small></p>
					<p><small>4d 14h left (Mon, 02:32 AM)</small></p>
					<button type="button" class="btn btn-outline-primary">Update Item</button>
					<button type="button" class="btn btn-outline-danger">Delete Item</button>
				</div>
			</div>
			
			<div class="col-lg-3">
				<div class="card mb-3">
				
					<img src="img/books-3.jpg" class="img-fluid" alt="">
					<h5>Photography Book</h5>
					<h5>4 bid</h5>
					
					<p><small><del>$1.55</del><span>$1</span></small></p>
					<p><small>2d 14h left (Mon, 02:32 AM)</small></p>
					<button type="button" class="btn btn-outline-primary">Update Item</button>
					<button type="button" class="btn btn-outline-danger">Delete Item</button>
					
				</div>
			</div>
			
			<div class="col-lg-3">
				<div class="card mb-3">
				
					<img src="img/books-4.jpg" class="img-fluid" alt="">
					<h5>High Quality Note Book</h5>
					<h5>5 bid</h5>
					
					<p><small><del>$2.05</del><span>$1</span></small></p>
					<p><small>1d 14h left (Mon, 02:32 AM)</small></p>
					<button type="button" class="btn btn-outline-primary">Update Item</button>
					<button type="button" class="btn btn-outline-danger">Delete Item</button>
					
				</div>
			</div>
			
			
			
			

		</div>
	</div>
	
	
	
	
</section>
    
    <jsp:include page="includes/footer.jsp"></jsp:include> 
    
</body>

</html>