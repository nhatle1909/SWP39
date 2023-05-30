h<!DOCTYPE html>
<html>
<head>
	<title>Verification Page</title>
</head>

<body>
	<h2>Verification Page</h2>
	<p>A verification code has been sent to your email. Please enter the code below to complete your registration:</p>
	
	<form action="MainController" method="post">
		<label for="code">Verification Code:</label><br>
		<input type="text" id="code" name="code"><br><br>
		
		<input type="hidden" name="txtUsername" value="${username}">
		<input type="hidden" name="txtMail" value="${email}">
		<input type="submit" value="Verify" name="btAction">
	</form>
</body>
</html>