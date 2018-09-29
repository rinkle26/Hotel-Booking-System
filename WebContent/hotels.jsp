<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	var db_hotels = HotelController.gethotels();
</script>
<body>

	<div class="top_panel">
		<div class="div_logo">
			<img id="logo" alt="HMS" src="logo.png">
		</div>

		<div class="div_name">
			<h1>WELCOME</h1>
		</div>

		<div class="div_logout">
			<a href="logout.jsp">Logout</a>
		</div>
	</div>
	<div class="middle_panel">
		<div id="blur_img"></div>
		<div class="left_panel">
			<table>
				<tr>
					<td><a >Book room</a></td>
				</tr>
				<tr>
					<td><a href="#">My booking</a></td>
				</tr>
				<tr>
					<td><a href="#">Add room</a></td>
				</tr>
				<tr>
					<td><a href="#">Hotel Details</a></td>
				</tr>
			</table>
		</div>

		<div class="center_panel">
			<h1>HOTELS</h1>
			<div id="hotels">
				
			</div>
		</div>

		<div class="right_panel"></div>
	</div>


	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<script type="text/javascript" src="script.js"></script>
</body>
</html>