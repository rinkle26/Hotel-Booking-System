<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="layout.css">
<title>Add Room</title>
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
				<form id="form_add_room" name="addRoomform" action="AddRoom" method="post" onsubmit="return addValidate()">
					<br> ${message} <br> ${successMessage}<br>
					<table>
						<tr>
							<td style="text-align: right;"><label>Number of rooms :</label></td>
							<td><input type="text" name="NumberOfRooms" id="NumberOfRooms"></td>
						</tr>
						<tr>
							<td style="text-align: right;"><label>Room Number :</label></td>
							<td><input type="text" name="RoomNumber" id="RoomNumber"></td>
						</tr>
						<tr>
							<td style="text-align: right;"><label>Room type :</label></td>
							<td><input type="text" name="RoomType" id="RoomType"></td>
						</tr>
						<tr style="height: 23px;"></tr>
						<tr style="text-align: center;">
							<td colspan="2"><input type="submit" name="submit"
								value="Add"></td>
						</tr>
					</table>
				</form>
			</div>
		</div>

		<div class="right_panel"></div>
	</div>


</body>
</html>