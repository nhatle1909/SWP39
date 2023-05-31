<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Verification Page</title>
    </head>

    <body>
        <%

            String status = (String) session.getAttribute("Status");
            if (status != null && status.equals("Verify"))  {
        %>
        <h2>Verification Page</h2>
        <p>A verification code has been sent to your email. Please enter the code below to complete:</p>

        <form action="MainController" method="post">
            <label for="code">Verification Code:</label><br>
            <input type="text" id="code" name="code"><br><br>
            <input type="submit" value="Verify" name="btAction">
        </form>
        <% } if (status == null ){ %>
        <h2>Verification Page</h2>
        <p>Please enter your email to receive code for resetting password:</p>

        <form action="MainController" method="post">
            <label for="code">Email:</label><br>
            <input type="text" id="mail" name="txtMail"><br><br>
            <input type="submit" value="Reset" name="btAction">
        </form>
        <%}%>
        <%if (status != null && status.equals("ForgetPassword")) {
        %>
        <h2>Verification Page</h2>
        <p>A verification code has been sent to your email. Please enter the code and new password below to complete:</p>

        <form action="MainController" method="post">
            <label for="code">Verification Code:</label><br>
            Verification Code:
            <input type="text" id="code" name="code"><br><br>
            New Password:
            <input type="password" id="password" name="txtPassword"/><br><br>
            <input type="submit" value="Verify" name="btAction">
        </form>
        <%}%>
    </body>
</html>