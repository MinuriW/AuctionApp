<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">    // Animations initialization
new WOW().init();</script>
	<!-- Navbar -->
	<div
		style="background: linear-gradient(to bottom right, #011f77 0%, #6fdbff 100%)">
		<div class="container">


			<!-- Collapse -->
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<!-- Links -->
			<div class="collapse navbar-collapse" id="navbarSupportedContent">

				<!-- Left -->
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a class="nav-link waves-effect"
						href="#">Home <span class="sr-only">(current)</span>
					</a></li>
					<li class="nav-item"><a class="nav-link waves-effect"
						href="https://mdbootstrap.com/docs/jquery/" target="_blank">About
							MDB</a></li>
					<li class="nav-item"><a class="nav-link waves-effect"
						href="https://mdbootstrap.com/docs/jquery/getting-started/download/"
						target="_blank">Free download</a></li>
					<li class="nav-item"><a class="nav-link waves-effect"
						href="https://mdbootstrap.com/education/bootstrap/"
						target="_blank">Free tutorials</a></li>
				</ul>

				<!-- Right -->
				<ul class="navbar-nav nav-flex-icons">
					<li class="nav-item"><a class="nav-link waves-effect"> <span
							class="badge red z-depth-1 mr-1"> 1 </span> <i
							class="fas fa-shopping-cart"></i> <span
							class="clearfix d-none d-sm-inline-block"> Cart </span>
					</a></li>
					<li class="nav-item"><a
						href="https://www.facebook.com/mdbootstrap"
						class="nav-link waves-effect" target="_blank"> <i
							class="fab fa-facebook-f"></i>
					</a></li>
					<li class="nav-item"><a href="https://twitter.com/MDBootstrap"
						class="nav-link waves-effect" target="_blank"> <i
							class="fab fa-twitter"></i>
					</a></li>
					<li class="nav-item"><a
						href="https://github.com/mdbootstrap/bootstrap-material-design"
						class="nav-link border border-light rounded waves-effect"
						target="_blank"> <i class="fab fa-github mr-2"></i>MDB GitHub
					</a></li>
				</ul>

			</div>

		</div>

		<!-- Navbar -->

		<!--Main layout-->
		<main class="mt-5 pt-4">
		<div class="container wow fadeIn">

			<!-- Heading -->
			<div style="color: white">
				<h2 class="my-5 h2 text-center">Checkout form</h2>
			</div>
			<!--Grid row-->
			<div class="row">

				<!--Grid column-->
				<div class="col-md-8 mb-4">

					<!--Card-->
					<div class="card">

						<!--Card content-->
						<form class="card-body">

							<!--Grid row-->
							<div class="row">

								<!--Grid column-->
								<div class="col-md-6 mb-2">

									<!--firstName-->
									<div class="md-form ">
										<input type="text" id="firstName" class="form-control">
										<label for="firstName" class="">First name</label>
									</div>

								</div>
								<!--Grid column-->

								<!--Grid column-->
								<div class="col-md-6 mb-2">

									<!--lastName-->
									<div class="md-form">
										<input type="text" id="lastName" class="form-control">
										<label for="lastName" class="">Last name</label>
									</div>

								</div>
								<!--Grid column-->

							</div>
							<!--Grid row-->

							<!--Username-->
							<div class="md-form input-group pl-0 mb-5">
								<div class="input-group-prepend">
									<span class="input-group-text" id="basic-addon1">@</span>
								</div>
								<input type="text" class="form-control py-0"
									placeholder="Username" aria-describedby="basic-addon1">
							</div>

							<!--email-->
							<div class="md-form mb-5">
								<input type="text" id="email" class="form-control"
									placeholder="youremail@example.com"> <label for="email"
									class="">Email (optional)</label>
							</div>

							<!--address-->
							<div class="md-form mb-5">
								<input type="text" id="address" class="form-control"
									placeholder="1234 Main St"> <label for="address"
									class="">Address</label>
							</div>

							<!--address-2-->
							<div class="md-form mb-5">
								<input type="text" id="address-2" class="form-control"
									placeholder="Apartment or suite"> <label
									for="address-2" class="">Address 2 (optional)</label>
							</div>

							<!--Grid row-->
							<div class="row">

								<!--Grid column-->
								<div class="col-lg-4 col-md-12 mb-4">

									<label for="country">Country</label> <select
										class="custom-select d-block w-100" id="country" required>
										<option value="">Choose...</option>
										<option>United States</option>
									</select>
									<div class="invalid-feedback">Please select a valid
										country.</div>

								</div>
								<!--Grid column-->

								<!--Grid column-->
								<div class="col-lg-4 col-md-6 mb-4">

									<label for="state">State</label> <select
										class="custom-select d-block w-100" id="state" required>
										<option value="">Choose...</option>
										<option>California</option>
									</select>
									<div class="invalid-feedback">Please provide a valid
										state.</div>

								</div>
								<!--Grid column-->

								<!--Grid column-->
								<div class="col-lg-4 col-md-6 mb-4">

									<label for="zip">Zip</label> <input type="text"
										class="form-control" id="zip" placeholder="" required>
									<div class="invalid-feedback">Zip code required.</div>

								</div>
								<!--Grid column-->

							</div>
							<!--Grid row-->

							<hr>

							<div class="custom-control custom-checkbox">
								<input type="checkbox" class="custom-control-input"
									id="same-address"> <label class="custom-control-label"
									for="same-address">Shipping address is the same as my
									billing address</label>
							</div>
							<div class="custom-control custom-checkbox">
								<input type="checkbox" class="custom-control-input"
									id="save-info"> <label class="custom-control-label"
									for="save-info">Save this information for next time</label>
							</div>

							<hr>

							<div class="d-block my-3">
								<div class="custom-control custom-radio">
									<input id="credit" name="paymentMethod" type="radio"
										class="custom-control-input" checked required> <label
										class="custom-control-label" for="credit">Credit card</label>
								</div>
								<div class="custom-control custom-radio">
									<input id="debit" name="paymentMethod" type="radio"
										class="custom-control-input" required> <label
										class="custom-control-label" for="debit">Debit card</label>
								</div>
								<div class="custom-control custom-radio">
									<input id="paypal" name="paymentMethod" type="radio"
										class="custom-control-input" required> <label
										class="custom-control-label" for="paypal">Paypal</label>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6 mb-3">
									<label for="cc-name">Name on card</label> <input type="text"
										class="form-control" id="cc-name" placeholder="" required>
									<small class="text-muted">Full name as displayed on
										card</small>
									<div class="invalid-feedback">Name on card is required</div>
								</div>
								<div class="col-md-6 mb-3">
									<label for="cc-number">Credit card number</label> <input
										type="text" class="form-control" id="cc-number" placeholder=""
										required>
									<div class="invalid-feedback">Credit card number is
										required</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-3 mb-3">
									<label for="cc-expiration">Expiration</label> <input
										type="text" class="form-control" id="cc-expiration"
										placeholder="" required>
									<div class="invalid-feedback">Expiration date required</div>
								</div>
								<div class="col-md-3 mb-3">
									<label for="cc-expiration">CVV</label> <input type="text"
										class="form-control" id="cc-cvv" placeholder="" required>
									<div class="invalid-feedback">Security code required</div>
								</div>
							</div>
							<hr class="mb-4">
							<button class="btn btn-primary btn-lg btn-block" type="submit">Continue
								to checkout</button>

						</form>

					</div>
					<!--/.Card-->

				</div>
				<!--Grid column-->

				<!--Grid column-->
				<div class="col-md-4 mb-4">

					<!-- Heading -->

					<h4 class="d-flex justify-content-between align-items-center mb-3">
						<span>Your cart</span> <span
							class="badge badge-secondary badge-pill">3</span>
					</h4>

					<!-- Cart -->
					<ul class="list-group mb-3 z-depth-1">
						<li
							class="list-group-item d-flex justify-content-between lh-condensed">
							<div>
								<h6 class="my-0">Product name</h6>
								<small class="text-muted">Brief description</small>
							</div> <span class="text-muted">$12</span>
						</li>
						<li
							class="list-group-item d-flex justify-content-between lh-condensed">
							<div>
								<h6 class="my-0">Second product</h6>
								<small class="text-muted">Brief description</small>
							</div> <span class="text-muted">$8</span>
						</li>
						<li
							class="list-group-item d-flex justify-content-between lh-condensed">
							<div>
								<h6 class="my-0">Third item</h6>
								<small class="text-muted">Brief description</small>
							</div> <span class="text-muted">$5</span>
						</li>
						<li
							class="list-group-item d-flex justify-content-between bg-light">
							<div class="text-success">
								<h6 class="my-0">Promo code</h6>
								<small>EXAMPLECODE</small>
							</div> <span class="text-success">-$5</span>
						</li>
						<li class="list-group-item d-flex justify-content-between"><span>Total
								(USD)</span> <strong>$20</strong></li>
					</ul>
					<!-- Cart -->

					<!-- Promo code -->
					<form class="card p-2">
						<div class="input-group">
							<input type="text" class="form-control" placeholder="Promo code"
								aria-label="Recipient's username"
								aria-describedby="basic-addon2">
							<div class="input-group-append">
								<button class="btn btn-secondary btn-md waves-effect m-0"
									type="button">Redeem</button>
							</div>
						</div>
					</form>
					<!-- Promo code -->

				</div>
				<!--Grid column-->

			</div>
			<!--Grid row-->

		</div>
		</main>
		<!--Main layout-->
	</div>
</body>
</html>