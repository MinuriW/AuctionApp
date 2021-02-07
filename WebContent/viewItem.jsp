<%@ page import="java.util.List, com.hcl.seller.domain.AuctionItem"
	language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>View Auction System</title>
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
	<jsp:include page="includes/nav.jsp"></jsp:include>

	<div class="container101">
		<%
			AuctionItem i = (AuctionItem) request.getAttribute("item");
		%>

		<%
			if (i != null) {
		%>

		<div class="row">
			<div class="col-md-5">

				<div id="carouselExampleControls" class="carousel slide"
					data-ride="carousel">
					<div class="carousel-inner">
						<div class="carousel-item active">
							<img class="d-block w-100" src="<%=i.getPhotoURL()%>"
								alt="First slide">
						</div>
					</div>
				</div>
			</div>

			<div class="col-md-7">

				<h2><%=i.getTitle()%></h2>
				<h4>Price: <%=i.getStartingPrice()%></h4>
				<h5>Condition: <%=i.getDescription() %></h5>
				<p>Description: <%=i.getCondition() %></p>
				
				<!--  		<h5>Enter $10.50 or more</h5> -->
				<form action="placeBid" method="post">
					<input type="button" name="amount" value=" Place bid"> <input
						type="text" id="bid" name="bid"> <input type="hidden"
						name="id" value="<%=i.getId()%>">
				</form>
				<p>
					<small>Auction ends: <%=i.getEndDate()%></small>
				</p>



			</div>

		</div>
		<%
			}
		%>

	</div>



	</div>
	<jsp:include page="includes/footer.jsp"></jsp:include>

</body>
</html>







