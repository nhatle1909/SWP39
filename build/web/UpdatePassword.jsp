<%-- 
    Document   : UpdatePassword
    Created on : Jun 2, 2023, 11:00:54 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Update Password</title>
    <link rel="stylesheet" href="test/style.css" />
    </head>
    <body>
        <div class="container">
          <h1>Register</h1>
          <form action="MainController" method ="POST">
            <div class="form-control">
              <input type="password" id="password" class="input" name="txtPassword"/>
              <label for="" class="label">Password</label>
              <span></span>
              <small></small>
            </div>

            <div class="form-control">
              <input type="password" id="password2" class="input" name="txtConfirmPassword"/>
              <label for="" class="label">Confirm Password</label>
              <span></span>
              <small></small>
            </div>
            <input type="submit" class="submitBtn" name="btAction" value="Update Password">
             
            <p>Want to return to the homepage? <a href="index.html">Press Here</a></p>
          </form>
        </div>
    
        <script src="app.js"></script>
      </body>
</html>
