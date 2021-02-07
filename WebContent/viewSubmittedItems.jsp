<%@ page import="java.util.List, com.hcl.seller.domain.AuctionItem"
	language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="includes/validateUser.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>View Auction Items</title>
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
				<a class="nav-item nav-link pr-5 active" href="viewAuctionItems">Home</a>
				<a class="nav-item nav-link pr-5 active" href="#">My Bids</a> <a
					class="nav-item nav-link pr-5" href="#">My Items</a> <a
					class="nav-item nav-link pr-5" href="#">Pending Items</a> <a
					class="nav-item nav-link pr-5" href="submitAuctionItem">Submit
					Item</a> <a class="nav-item nav-link pr-5" href="signout">Sign out</a>
			</div>


		</div>
	</nav>


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
			<h1 class="text-center">Bid Items</h1>

			<div class="row py-5">

				<% List<AuctionItem> auctionItems = (List<AuctionItem>) request.getAttribute("itemlist"); %>

				<% if(auctionItems != null){ %>

				<% for(AuctionItem i : auctionItems) { %>


				<div>
				<a href="viewAuctionItem?id=<%=i.getId() %>">

				<div class="col-lg-3">
					<div class="card mb-3">
						<img src="<%=i.getPhotoURL()%>" class="img-fluid" alt="">
						<h5><%=i.getTitle() %></h5>

						<h5>5 bids</h5>
						<input type="button" onclick="location.href='View Bids.jsp'"
							value=" Place bid">
						<p>
							<small><span>$<%=i.getStartingPrice()%></span></small>
						</p>
						<p>
							<small><%=i.getEndDate() %></small>
						</p>

					</div>
				</div>
				</a>
				<% } %>
				<% } else { %>
				<div>List is null</div>

				<% } %>
			</div>
		</div>




	</section>


	<jsp:include page="includes/footer.jsp"></jsp:include>



</body>
</html>







