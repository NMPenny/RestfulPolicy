<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Policy Dashboard</title>
</head>
<body>

	<form action="addPolicy">
		<label>Create or Update Policy</label><br>
		<label>Policy Number</label>
		<input type="text" name="policyNumber"><br>
		<label>First Name</label>
		<input type="text" name="firstName"><br>
		<label>Last Name</label>
		<input type="text" name="lastName"><br>
		<label>Start Date</label>
		<input type="text" name="startDate"><br>
		<label>End Date</label>
		<input type="text" name="endDate"><br>
		<label>Deductible in USD</label>
		<input type="text" name="deductible"><br>
		  <input type="submit"><br>
	</form>
	
	<form action="getPolicy">
		<label>Retrieve Policy</label><br>
		<label>Policy Number to View</label>
		<input type="text" name="policyNumber"><br>
		  <input type="submit"><br>
	</form>

	<form action="deletePolicy">
		<label>Delete Policy</label><br>
		<label>Policy Number to Delete</label>
		<input type="text" name="policyNumber"><br>
		  <input type="submit"><br>
	</form>
</body>
</html>