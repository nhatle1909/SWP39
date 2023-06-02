<%-- 
    Document   : order_history
    Created on : Jun 2, 2023, 9:28:38 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Order History</title>
        <link rel="stylesheet" type="text/css" href="test/test_1.css">
</head>
<body>
	<header>
		<nav class="navbar">
			<div class="logo">
				<a href="#">
                                    <img src="images/logo-removebg-preview.png" alt="Company Logo">
				</a>
			</div>
			<ul class="nav-links">
				<li><a href="#">Home</a></li>
				<li><a href="#">About Us</a></li>
				<li><a href="#">Services</a></li>
				<li><a href="#">Contact Us</a></li>
				<li><a href="#" class="active">Order History</a></li>
			</ul>
		</nav>
	</header>
	<main class="container">
		<h1>Order History</h1>
		<table>
			<thead>
				<tr>
					<th>Order No.</th>
					<th>Order Date</th>
					<th>Total Amount</th>
					<th>Status</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>001</td>
					<td>01/01/2023</td>
					<td>$200.00</td>
					<td><span class="status delivered">Delivered</span></td>
				</tr>
				<tr>
					<td>002</td>
					<td>02/15/2023</td>
					<td>$150.00</td>
					<td><span class="status in-transit">In Transit</span></td>
				</tr>
				<tr>
					<td>003</td>
					<td>03/30/2023</td>
					<td>$75.00</td>
					<td><span class="status cancelled">Cancelled</span></td>
				</tr>
			</tbody>
		</table>
		<div class="pagination">
			<a href="#" class="disabled">&#171;</a>
			<a href="#" class="active">1</a>
			<a href="#">2</a>
			<a href="#">3</a>
			<a href="#">4</a>
			<a href="#">5</a>
			<a href="#">&#187;</a>
		</div>
	</main>
	<footer class="footer">
		<p>&copy; 2023 Company Name.</p>
	</footer>
</body>
</html>

