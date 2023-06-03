<%-- 
    Document   : user_info
    Created on : May 31, 2023, 8:06:51 PM
    Author     : ADMIN
--%>

<%@page import="java.util.List"%>
<%@page import="Utility.DTO"%>
<%@page import="SQLCommand.DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />

        <title>Customer Info</title>
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
            rel="stylesheet"
            />
        <link rel="stylesheet" href="css/user.css" />
    </head>
    <body>
        <%  String user_mail = (String) session.getAttribute("txtMail");
            String role = (String) session.getAttribute("txtRole");
            String url = ""; 
            if (role != null){
            if (role.equals("CUSTOMER")) {
                url = "customer_dashboard.jsp";
            } else if (role.equals("ADMIN")) {
              url ="admin.jsp";
            } else if (role.equals("STAFF")) {
                url ="staff.jsp";
            }
            }
            if (user_mail != null) {
                DAO sql = new DAO();
                sql.searchUser(user_mail);
                List<DTO> result = sql.getListAccount();
                DTO dto = result.get(0);
        %>
        <!--dang link-->
        <div class="container">
            <div class="main-body">
                <nav aria-label="breadcrumb" class="main-breadcrumb">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item"><a href="index.html">Home</a></li>
                        <li class="breadcrumb-item">
                            <a href="<%=url%>">User</a>
                        </li>
                        <li class="breadcrumb-item active" aria-current="page">
                            User Info
                        </li>
                    </ol>
                </nav>

                <div class="row gutters-sm">
                    <div class="col-md-4 mb-3">
                        <div class="card">
                            <div class="card-body">
                                <div class="d-flex flex-column align-items-center text-center">            
                                    <div class="mt-3">
                                        <h4>Username : <%= dto.getUsername()%></h4>
                                        <img src="images/bg.jpg"/>
                                        <p class="text-secondary mb-1"><%= dto.getRole()%></p>
                                        <p class="text-muted font-size-sm">UserID : <%= dto.getUser_id()%></p>
                                        <button class="btn btn-primary">Follow</button>
                                        <button class="btn btn-outline-primary">Message</button>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>

                    <div class="col-md-8">
                        <div class="card mb-3">
                            <div class="card-body">
                                <div class="row">
                                    <div class="col-sm-3">
                                        <h6 class="mb-0">Full Name</h6>
                                    </div>
                                    <div class="col-sm-9 text-secondary"></div>
                                </div>
                                <hr />

                                <div class="row">
                                    <div class="col-sm-3">
                                        <h6 class="mb-0">Email</h6>
                                    </div>
                                    <div class="col-sm-9 text-secondary">
                                        <a
                                            href="/cdn-cgi/l/email-protection"
                                            class="__cf_email__"
                                            data-cfemail="fa9c938aba908f91978f92d49b96"
                                            ><%= dto.getMail()%></a
                                        >
                                    </div>
                                </div>
                                <hr />
                                <div class="row">
                                    <div class="col-sm-3">
                                        <h6 class="mb-0">Phone Number</h6>
                                    </div>
                                    <div class="col-sm-9 text-secondary"><%= dto.getPhone_number()%></div>
                                </div>
                                <hr />
                                <div class="row">
                                    <div class="col-sm-3">
                                        <h6 class="mb-0">Address</h6>
                                    </div>
                                    <div class="col-sm-9 text-secondary"><%= dto.getAddress()%></div>
                                </div>
                                <hr />
                                <div class="row">
                                    <div class="col-sm-12">
                                        <a
                                            class="btn btn-info"
                                            target="__blank"
                                            href="https://www.bootdey.com/snippets/view/profile-edit-data-and-skills"
                                            >Edit</a
                                        >
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="row gutters-sm">
                            <div class="col-sm-12 mb-3">
                                <div class="card h-100">
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script
            data-cfasync="false"
            src="/cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js"
        ></script>
        <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.bundle.min.js"></script>
        <script type="text/javascript"></script>
        <%} else {
          response.sendRedirect("login.jsp");
      }%>
    </body>
</html>
