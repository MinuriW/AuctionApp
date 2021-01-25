<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Submit Item</title>
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
<!-- Jquery JS-->
<script src="vendor/jquery/jquery.min.js"></script>
<!-- Vendor JS-->
<script src="vendor/select2/select2.min.js"></script>
<script src="vendor/datepicker/moment.min.js"></script>
<script src="vendor/datepicker/daterangepicker.js"></script>

<!-- Main JS-->

<link href="css/formstyle.css" rel="stylesheet">
<script type="text/javascript" src="js/sellerform.js"></script>
</head>
<body>
	<div style="background-image: url('img/heels.jpg')"
		class="page-wrapper bg-red p-t-180 p-b-100 font-robo">
		<div class="wrapper wrapper--w960">
			<div class="card card-6">

				<div class="card-body">
					
					<form method="POST">
					
						<div class="form-group">
						<h2 class="card-heading">Submit item</h2>
							    <input required class="form-control" type="text" placeholder="Title"name="Title"><br> 
								<input required class="form-control" type="text" placeholder="Item Condition" name="itemcondition"><br> 
								<input required class="form-control" type="text" placeholder="Item Description" name="itemdescription"><br>
								<input required class="form-control" type="text" placeholder="Bid starting price" name="bid"> <br>
								<input required class="form-control" type="text" placeholder="Auction time" name="auction">
						</div>


						<!-- container -->
						<br>
						<div style="width: 350%" class="container">
							<div class="row">
								<div class="col-sm-2 imgUp">
									<div class="imagePreview"></div>
									<label class="btn btn-primary"> Upload<input
										type="file" class="uploadFile img" value="Upload Photo"
										style="width: 0px; height: 0px; overflow: hidden;">
									</label>
								</div>

								<div class="col-sm-2 imgUp">
									<div class="imagePreview"></div>
									<label class="btn btn-primary"> Upload<input
										type="file" class="uploadFile img" value="Upload Photo"
										style="width: 0px; height: 0px; overflow: hidden;">
									</label>
								</div>
								<!-- col-2 -->
							</div>
							<!-- row -->
						</div>
						<div class="p-t-30">
							<button class="btn btn--radius btn--green" type="submit">Submit
								Item</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>


</body>
</html>



