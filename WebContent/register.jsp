<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="layout.css">
<title>HMS Registration</title>

</head>
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
		<div class="left_panel"></div>

		<div class="center_panel">
			<div style="padding-left: 18%; width: fit-content;">
				<br> <br>${message}<br>
				<form name="regform" action="LoginController" method="post"
					onsubmit="return regValidate()">
					<table>
						<tr>
							<td style="text-align: right;"><label>Name :</label></td>
							<td><input type="text" name="name"></td>
						</tr>
						<tr>
							<td style="text-align: right;"><label>Username :</label></td>
							<td><input type="text" name="username"></td>
							<!-- <td><div id="username_error"></div></td> -->
						</tr>
						<tr>
							<td style="text-align: right;"><label>Password :</label></td>
							<td><input type="password" name="password" id="password"></td>
						</tr>
						<tr>
							<td style="text-align: right;"><label>Re-enterPassword
									:</label></td>
							<td><input type="password" name="retry-password"
								id="retry-password"></td>
							<!-- <td><div id="password_error"></div></td> -->
						</tr>
						<!-- <tr>
							<td style="text-align: right;"><label>Contact number :</label></td>
							<td><input type="text" name="contact_no"></td>
						</tr>
						<tr>
							<td style="text-align: right;"><label>Email id :</label></td>
							<td><input type="email" name="email"></td>
						</tr> -->
						<tr>
							<td style="text-align: right;"><label>User Type :</label></td>
							<td>
								<div>
									<input type="radio" class="user_type" name="user_type"
										id="type_customer">Customer
								</div>
								<div>
									<input type="radio" class="user_type" name="user_type"
										id="type_manager">Manager
								</div>
							</td>
						</tr>
						<tr class="hotel_details">
							<td><label><u>Hotel Details</u></label></td>
						</tr>
						<tr class="hotel_details">
							<td style="text-align: right;"><label>Name :</label></td>
							<td><input type="text" name="hotel_name"></td>
						</tr>
						<tr class="hotel_details">
							<td style="text-align: right;"><label>Location :</label></td>
							<td><input type="text" name="hotel_location"></td>
						</tr>
						<tr class="hotel_details">
							<td style="text-align: right;"><label>Details :</label></td>
							<td><input type="text" name="hotel_details"></td>
						</tr>
						<tr class="hotel_details">
							<td style="text-align: right;"><label>No. of rooms :</label></td>
							<td><input type="number" name="hotel_rooms"></td>
						</tr>
						<tr style="height: 23px;"></tr>
						<tr>
							<td style="text-align: center;"><input type="reset"
								name="Reset"></td>
							<td style="text-align: right;"><input type="submit"
								name="submit" value="Register"></td>
						</tr>
					</table>
				</form>

			</div>
		</div>

		<div class="right_panel"></div>
	</div>


	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script type="text/javascript" src="script.js"></script>
	<script type="text/javascript" src="register.js"></script>
</body>
</html>