
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css" href="layout.css">
<title>HMS Login</title>
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
				<form id="form_login" name="loginform" action="LoginController" method="post" onsubmit="return loginValidate()">
					<br> ${message} <br> ${successMessage}<br>
					<table>
						<tr>
							<td style="text-align: right;"><label>Username :</label></td>
							<td><input type="text" name="username" id="username"></td>
						</tr>
						<tr>
							<td style="text-align: right;"><label>Password :</label></td>
							<td><input type="password" name="password" id="password"></td>
						</tr>
						<tr style="height: 23px;"></tr>
						<tr style="text-align: center;">
							<td colspan="2"><input type="submit" name="submit"
								value="Login"></td>
						</tr>
						<tr style="height: 15px;"></tr>
						<tr style="text-align: center;">
							<td colspan="2"><a href="register.jsp">Registration</a></td>
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
</body>
</html>