<%-- 
    Document   : login.jsp
    Created on : May 29, 2023, 2:54:41 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">


	<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous"><link rel="stylesheet" href="css/style_login.css">
	
	<head>
		<meta charset="UTF-8">
		<body>
			<div class="box-form">
			<div class="left">
				<div class="overlay">
				<h1>Welcome Customer</h1>
				<span>
					<p>login with social media</p>
					<a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a>
					<a href="#"><i class="fa fa-twitter" aria-hidden="true"></i> Login with Twitter</a>
				</span>
				</div>
			</div>
			
			
				<div class="right">
					<form action="MainController" method="post">
				<h5>Login</h5>
				<p>Don't have an account? <a href="signup1.html">Create Your Account</a> it takes less than a minute</p>
				<div class="inputs">
					<input type="text" name="txtMail" value="" placeholder="Email">
					<br>
					<input type="password" name="txtPassword" value="" placeholder="Password">
				</div>,
					
					<br><br>

					
				<div class="remember-me--forget-password">
						<!-- Angular -->
			<label>
				<input type="checkbox" name="item" checked/>
				<span class="text-checkbox">Remember me</span>
			</label>
					<p>Forget password?</p>
				</div>
				<br>
				
				<input type="submit" value="Login"name="btAction"/>
                                
				<p>Want to return to the homepage? <a href="index.html">Press Here</a></p>
			</form>
			</div>
			
		</div>
		</body>
	</head>
</html>