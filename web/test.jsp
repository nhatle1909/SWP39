<%-- 
    Document   : test
    Created on : Jun 11, 2023, 2:06:41 AM
    Author     : ADMIN
--%>


jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Paypal Checkout Example</title>
</head>
<body>
<h1>Paypal Checkout Example</h1>

<form action="MainController" method="post">
    <input type="hidden" name="action" value="createPayment">

    <!-- Add any fields for the payment details, such as amount, description, etc. -->
    <label for="amount">Amount:</label>
    <input type="number" name="amount" id="amount" required><br>

    <label for="description">Description:</label>
    <input type="text" name="description" id="description"><br>

    <input type="submit" name ="btAction" value="TestPaypal">
</form>

<%-- Display a message after the payment is completed --%>
<% if(request.getParameter("paymentId") != null && request.getParameter("PayerID") != null) { %>
    <div style="border: 1px solid green; padding: 10px; margin-top: 20px;">
        Payment Completed Successfully!
    </div>
<% } %>

</body>
</html>