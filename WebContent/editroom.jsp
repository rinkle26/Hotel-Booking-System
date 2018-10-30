
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

		<div class="left_panel">
				<form id="form_CancelRoom" name="cancelroomform" action="EditRoom" method="post" >		
					<br> ${successMessage}<br>
			<table>
				<tr>
				<td style="text-align: right;"><label>Enter Room number to edit :</label></td>
				<td><input type="text" name="oldRoomNumber" id="enteredRoomNumber"></td>
				
				<td style="text-align: right;"><label>Enter Room number to edit to :</label></td>
				<td><input type="text" name="updatedRoomNumber" id="toEditRoomNumber"></td>
				</tr>
						<tr style="height: 23px;"></tr>
						<tr style="text-align: center;">
							<td colspan="2"><input type="submit" name="Edit Room"
								value="Edit"></td>
						</tr>
				</table>
				</form>
				<table>
				<tr>
					<td><a href="#">My booking</a></td>
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