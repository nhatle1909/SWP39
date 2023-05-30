<%-- 
    Document   : staff
    Created on : May 30, 2023, 11:17:00 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
    <%
         String role = (String) session.getAttribute("txtRole");
    if (session != null && session.getAttribute("txtMail") != null && role.equals("STAFF")) {
       
        
        // TODO: Display protected resources for the authenticated user
        
    } else {
        response.sendRedirect("index.html"); // Redirect user to login page if not logged in
    }
%>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! STAFF PAGE</h1>
    </body>
</html>
