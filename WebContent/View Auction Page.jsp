<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<link href="style.css" rel="stylesheet">
</head>
<body>


    <nav class="navbar navbar-expand-lg bg-white">
      
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
          <div class="navbar-nav ml-auto">
            <a class="nav-item nav-link pr-5 active" href="#">Home</a>
            <a class="nav-item nav-link pr-5" href="#">View Bids</a>
            <a class="nav-item nav-link pr-5" href="#">Track Orders</a>
           
            <a class="nav-item nav-link pr-5" href="#">Login</a>
          </div>
          
        <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
     <button  class="btn btn-outline-primary" type="submit">Search</button>
    </form>
        </div>
      </nav>

	

<!--- Image Slider -->
<div id="slides" class="carousel slide" data-ride="carousel">

<!--dashes botom of the picture-->
<ul class="carousel-indicators">
	<li data-target="#slides" data-slide-to="0" class="active"></li>
	<li data-target="#slides" data-slide-to="1"></li>
	<li data-target="#slides" data-slide-to="2"></li>

</ul>


<!--images-->
	<div class="carousel-inner">
		<div class="carousel-item active">
			<img src="img/slide1.jpg" height="60%">
			
		    </div>
		<div class="carousel-item">
			<img src="img/slide2.png">
		</div>
		<div class="carousel-item">
			<img src="img/slide3.jpg">
		</div>

	</div>




</div>
<hr>


<!--- Cards -->




<section class="collection">
	<div class="container py-5">
		<h1 class="text-center">New Collection</h1>
		<div class="row py-5">
			<div class="col-lg-3">
				<div class="card mb-3">
				
				<!--- Watch Collection -->
					<img src="img/biditem4.png" class="img-fluid" alt="">
					<h5>Men Sport LED Watch </h5>
					
					<h5>3 bids </h5>
					
					<input type="button" value=" Place bid">
					<p><small><del>$2.05</del><span>$1</span></small></p>
				</div>
			</div>

			<div class="col-lg-3">
				<div class="card mb-3">
					<img src= "img/biditem5.jpg"class="img-fluid" alt="">
					<h5>SKMWI 11155B Sport Watch</h5>
				
					<h5>5 bids </h5>
					<input type="button" value="Place bid">
					<p><small><del>$10.05</del><span>$8</span></small></p>
				</div>
			</div>

			<div class="col-lg-3">
				<div class="card mb-3">
					<img src= "img/watch-1.73.jpg" class="img-fluid" alt="">
					<h5> Skmi Stylish Watch</h5>
					<h5>11 bids </h5>
					<input type="button" value="Place bid">
					<p><small><del>$2.05</del><span>$1</span></small></p>
				</div>
			</div>


			<div class="col-lg-3">
				<div class="card mb-3">
					<img src="img/watch-8.jpg" class="img-fluid" alt="">
					<h5>Big Digital Mens Watch</h5>
					<h5>6 bids </h5>
					<input type="button" value="Place bid">
					<p><small><del>$5.05</del><span>$3</span></small></p>
				</div>
			</div>
			
			
			
			<!--- books Collection -->
			<div class="col-lg-3">
				<div class="card mb-3">
				
					<img src="img/books-1.jpg" class="img-fluid" alt="">
					<h5>High-End Note Book</h5>
					<h5>1 bid</h5>
					
					<input type="button" value="place bid">
					<p><small><del>$2.05</del><span>$1</span></small></p>
				</div>
			</div>
			
			<div class="col-lg-3">
				<div class="card mb-3">
				
					<img src="img/books-2.jpg" class="img-fluid" alt="">
					<h5>Custom Note Book</h5>
					<h5>2 bid</h5>
					<input type="button" value="place bid">
					<p><small><del>$1.05</del><span>$1</span></small></p>
				</div>
			</div>
			
			<div class="col-lg-3">
				<div class="card mb-3">
				
					<img src="img/books-3.jpg" class="img-fluid" alt="">
					<h5>Photography Book</h5>
					<h5>4 bid</h5>
					<input type="button" value="place bid">
					<p><small><del>$1.55</del><span>$1</span></small></p>
				</div>
			</div>
			
			<div class="col-lg-3">
				<div class="card mb-3">
				
					<img src="img/books-4.jpg" class="img-fluid" alt="">
					<h5>High Quality Note Book</h5>
					<h5>5 bid</h5>
					<input class="btn btn-primary" type="button" value="Place Bid">
					<p><small><del>$2.05</del><span>$1</span></small></p>
				</div>
			</div>
			
			
			
			

		</div>
	</div>
	
	
	
	
</section>






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
                 <p>©Copyright 2020 proWeb All Rights Reserved</p>
                </div>
            </div>
        </div>
    </section>






</body>
</html>







