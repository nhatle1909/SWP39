<%-- 
    Document   : customer_dashboard
    Created on : Jun 2, 2023, 12:50:06 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>User Dashboard</title>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha512-pZsRrY5+1zTtGYUy9V7Vv2tWT5ImN9hH8W4uXnDT6KX/kdux3AvXCJBFvl9pJ0H9QqZsUooCfR6NsIj+vklg2w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="test/test.css">
</head>
<body>
	<header>
		<nav class="navbar">
			<a href="#" class="logo">User Dashboard</a>
			<div class="menu-toggle">
				<i class="fas fa-bars"></i>
			</div>
			<ul class="nav-menu" >
                            <form action="MainController" method="POST">
				<li><a href="order_history.jsp">Order History</a></li>
				<li><a href="user_info.jsp">Profile</a></li>
                                <li><a href="favorite_product.jsp">Favorite Product</a></li>
				<li><a href="update_password.html">Update Password</a></li>
                                <li><input id ="Logout" type="submit" name="btAction" value="Logout"></li>
                            </form>
			</ul>
		</nav>
	</header>

	<main class="container">
		<section class="card welcome-card">
			<h1>Welcome back, John!</h1>
			<p>Here's what's been happening with your account:</p>
			<ul class="summary-list">
				<li><i class="fas fa-chart-line"></i> Your sales have increased by 25%.</li>
				<li><i class="fas fa-wallet"></i> You've earned $500 in commissions this month.</li>
				<li><i class="fas fa-users"></i> You have 10 new followers on social media.</li>
			</ul>
		</section>

		<section class="card stats-card">
			<h2>Your Stats</h2>
			<div class="stats-row">
				<div class="stat-box">
					<div class="icon"><i class="fas fa-shopping-cart"></i></div>
					<div class="stat-info">
						<p class="value">245</p>
						<p class="label">Orders Placed</p>
					</div>
				</div>
				<div class="stat-box">
					<div class="icon"><i class="fas fa-dollar-sign"></i></div>
					<div class="stat-info">
						<p class="value">$12,345</p>
						<p class="label">Total Revenue</p>
					</div>
				</div>
				<div class="stat-box">
					<div class="icon"><i class="fas fa-users"></i></div>
					<div class="stat-info">
						<p class="value">1,234</p>
						<p class="label">Customers</p>
					</div>
				</div>
				<div class="stat-box">
					<div class="icon"><i class="fas fa-star"></i></div>
					<div class="stat-info">
						<p class="value">4.9</p>
						<p class="label">Customer Rating</p>
					</div>
				</div>
			</div>
		</section>

		<section class="card activity-card">
			<h2>Your Recent Activity</h2>
			<ul class="activity-list">
				<li>
					<i class="fas fa-shopping-cart"></i>
					<p class="activity-desc">You placed an order for <strong>3 items</strong> on May 28th.</p>
					<span class="activity-date">May 28th, 2023</span>
				</li>
				<li>
					<i class="fas fa-star"></i>
					<p class="activity-desc">You left a review for <strong>Product Name</strong>.</p>
					<span class="activity-date">May 27th, 2023</span>
				</li>
				<li>
					<i class="fas fa-file-alt"></i>
					<p class="activity-desc">You updated your profile information.</p>
					<span class="activity-date">May 26