<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<li><a href="#"></a></li>

				<ul class="nav navbar-nav navbar-right">
					<li><a href="Welcome.jsp"><span
							class="glyphicon glyphicon-user"></span> Home</a></li>
					<li><a href="index.jsp"><span
							class="glyphicon glyphicon-user"></span>Register</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div>
		<div class="container">
			<form action="register.doc" method="post">
				<div class="form-group" col-sm-3>
					<label for="place"></label> <input name="place" type="text"
						class="form-control" placeholder="Placename" id="PLACENAME">
				</div>

				<div class="form-group" col-sm-3>
					<label for="date"></label> <input name="date" type="text"
						class="form-control" placeholder="Date" id="DATE">
				</div>

				<div class="form-group" col-sm-3>
					<label for="capturedby"></label> <input name="capturedBy"
						type="text" class="form-control" placeholder="CapturedBy"
						id="CAPTUREDBY">
				</div>

				<div class="form-group" col-sm-3>
					<label for="calamityType"></label> <input name="calamityType"
						type="text" class="form-control" placeholder="calamityType"
						id="CAPTUREDTYPE">
				</div>

				<div class="form-group" col-sm-3>
					<label for="AREA"></label> <input name="area" type="text"
						class="form-control" placeholder="area" id="AREA">
				</div>

				<div class="form-group" col-sm-3>
					<label for="AvgLoss"></label> <input name="avgLoss" type="text"
						class="form-control" placeholder="avgLoss" id="AVGLOSS">
				</div>

				<div class="form-group" col-sm-3>
					<label for="Deaths"></label> <input name="deaths" type="text"
						class="form-control" placeholder="deaths" id="DEATHS">
				</div>

				<div class="form-group" col-sm-3>
					<label for="Injured"></label> <input name="injured" type="text"
						class="form-control" placeholder="injured" id="INJURED">
				</div>

				<button type="Register" class="btn btn-success">register</button>

				<span style="color: green; font-family: cursive;">${success}</span>
				<span style="color: red; font-family: cursive;">${failure}</span>
		</div>
		</form>
	</div>
	</div>
</body>
</html>
