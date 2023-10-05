<!DOCTYPE html>
<html>
<head>
	<title>Sign In</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<style>
		body {
			background-color: #F5F5F5;
		}
		.card {
			border-radius: 0;
			box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
		}
		.card-header {
			background-color: #007BFF;
			color: #FFFFFF;
			font-size: 24px;
			font-weight: bold;
			text-align: center;
			text-shadow: 1px 1px 2px rgba(0, 0, 0, 0.5);
		}
		.card-body {
			padding: 30px;
		}
		.form-control:focus {
			border-color: #007BFF;
			box-shadow: none;
		}
		.btn-primary {
			background-color: #007BFF;
			border-color: #007BFF;
			box-shadow: none;
		}
		.btn-primary:hover {
			background-color: #0062CC;
			border-color: #0062CC;
		}
		.btn-primary:focus {
			box-shadow: 0 0 0 0.2rem rgba(0, 123, 255, 0.5);
		}
	</style>
</head>
<body>

	<div class="container mt-4">
		<div class="row">
				<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<form action="signin_process.jsp" method="post">
							<div class="form-group">
								<label for="username">Username:</label>
								<input type="text" class="form-control" id="username" name="username" required>
							</div>
							<div class="form-group">
								<label for="password">Password:</label>
								<input type="password" class="form-control" id="password" name="password" required>
							</div>
							<button type="submit" class="btn btn-primary btn-block">Sign In</button>
						</form>
						<div class="text-center mt-3">
							<p>Don't have an account? <a href="signup">Sign Up</a></p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>
