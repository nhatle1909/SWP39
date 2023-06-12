<%@page import="Utility.FavoriteDTO"%>
<%@page import="Utility.OrderDTO"%>
<%@page import="java.util.List"%>
<%@page import="Utility.UserDTO"%>
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
        <%
            String user_mail = (String) session.getAttribute("txtMail");
            if (user_mail != null) {
                DAO sql = new DAO();
                sql.searchUser(user_mail);
                List<UserDTO> result = sql.getListAccount();
                UserDTO userDTO = result.get(0);
        %>
        <!--dang link-->
        <div class="container">
            <div class="main-body">
                <nav aria-label="breadcrumb" class="main-breadcrumb">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item"><a href="index.html">Home</a></li>
                        <li class="breadcrumb-item">
                            <a href="ProductPage.jsp">Shop</a>
                        </li>
                        <li class="breadcrumb-item active" aria-current="page">
                            User Info
                        </li>
                    </ol>
                </nav>

                <!-- Add the tab navigation -->
                <ul class="nav nav-tabs mb-4" id="myTab" role="tablist">
                    <li class="nav-item">
                        <a class="nav-link active" id="user-info-tab" data-toggle="tab" href="#user-info"
                           role="tab" aria-controls="user-info" aria-selected="true">User Information</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" id="order-history-tab" data-toggle="tab" href="#order-history" role="tab"
                           aria-controls="order-history" aria-selected="false">Order History</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" id="favorite-products-tab" data-toggle="tab" href="#favorite-products"
                           role="tab" aria-controls="favorite-products" aria-selected="false">Favorite Product List</a>
                    </li>
                </ul>

                <div class="tab-content" id="myTabContent">
                    <div class="tab-pane fade show active" id="user-info" role="tabpanel"
                         aria-labelledby="user-info-tab">

                        <div class="row gutters-sm">
                            <div class="col-md-4 mb-3">
                                <div class="card">
                                    <div class="card-body">
                                        <div class="d-flex flex-column align-items-center text-center">
                                            <div class="mt-3">
                                                <p class="text-secondary mb-1"><%= userDTO.getRole()%></p>
                                                <p class="text-muted font-size-sm">UserID : <%= userDTO.getUser_id()%>
                                                </p>
                                                <br/>
                                                <a class="btn btn-primary" href="UpdatePassword.jsp">Update Password</a>
                                                <form action="MainController" method="post">
                                                    <br/>
                                                    <input class="btn btn-success btn-sm mr-2"
                                                           type="submit" name="btAction" value="Logout" />
                                                </form>
                                                <br><br />        
                                            </div>
                                        </div>
                                    </div>
                                </div>

                            </div>

                            <div class="col-md-8">

                                <div class="card mb-3">
                                    <form action="MainController" method="POST">
                                        <div class="card-body">
                                            <div class="row">
                                                <div class="col-sm-3">
                                                    <h6 class="mb-0">Username</h6>
                                                </div>
                                                <div class="col-sm-9 text-secondary"><%= userDTO.getUsername()%></div>
                                            </div>
                                            <hr />

                                            <div class="row">
                                                <div class="col-sm-3">
                                                    <h6 class="mb-0">Email</h6>
                                                </div>
                                                <div class="col-sm-9 text-secondary">
                                                    <a href="/cdn-cgi/l/email-protection"
                                                       class="cf_email"
                                                       data-cfemail="fa9c938aba908f91978f92d49b96"><%= userDTO.getMail()%></a>
                                                </div>
                                            </div>
                                            <hr />
                                            <div class="row">
                                                <div class="col-sm-3">
                                                    <h6 class="mb-0">Phone Number</h6>
                                                </div>
                                                <div class="col-sm-9 text-secondary">
                                                    <%= userDTO.getPhone_number()%>

                                                    <input type="text" name="txtPhoneNumber"
                                                           class="form-control form-control-sm mb-2"
                                                           value="<%= userDTO.getPhone_number()%>" required
                                                           style="display:none;">

                                                </div>
                                            </div>
                                            <hr />
                                            <div class="row">
                                                <div class="col-sm-3">
                                                    <h6 class="mb-0">Address</h6>
                                                </div>
                                                <div class="col-sm-9 text-secondary">
                                                    <%= userDTO.getAddress()%>

                                                    <input type="text" name="txtAddress"
                                                           class="form-control form-control-sm mb-2"
                                                           value="<%= userDTO.getAddress()%>" required
                                                           style="display:none;">

                                                </div>
                                            </div>
                                            <hr />
                                            <div class="row">
                                                <div class="col-sm-12">
                                                    <button type="button" class="btn btn-info" onclick="editInfo()">Edit</button>
                                                    <button type="button" class="btn btn-secondary btn-sm" onclick="cancelEdit()"
                                                            style="display:none;">Cancel</button>
                                                    <br /><br />
                                                    <input id="save" class="btn btn-success btn-sm mr-2"
                                                           style="display:none;" type="submit" name="btAction" value="Save" />
                                                </div>
                                            </div>
                                        </div>
                                    </form>

                                </div>

                            </div>
                        </div>
                    </div>

                    <!-- Add the order history tab content -->
                    <div class="tab-pane fade" id="order-history" role="tabpanel" aria-labelledby="order-history-tab">
                        <div class="row gutters-sm">
                            <div class="col-sm-12 mb-3">
                                <div class="card h-100">
                                    <div class="card-body">
                                        <h5 class="card-title">Order History</h5>
                                        <div class="table-responsive">
                                            <table class="table table-hover">
                                                <thead>
                                                    <tr>
                                                        <th>Order ID</th>
                                                        <th>Date</th>
                                                        <th>Total Amount</th>
                                                        <th>Status</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <%  sql.orderHistory(userDTO.getUser_id());
                                                        List<OrderDTO> orders = sql.getListOrder();
                                                        if (orders != null && !orders.isEmpty()) {
                                                            for (OrderDTO order : orders) {%>
                                                    <tr>
                                                        <td><%= order.getOrder_id()%></td>
                                                        <td><%= order.getOrder_date()%></td>
                                                        <td>$<%= order.getTotal_price()%></td>
                                                        <td><%= order.getStatus()%></td>
                                                    </tr>
                                                    <% }
                                                    } else { %>
                                                    <tr>
                                                        <td colspan="4" class="text-center">No orders found.</td>
                                                    </tr>
                                                    <%}%>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- Add the favorite products tab content -->
                    <div class="tab-pane fade" id="favorite-products" role="tabpanel"
                         aria-labelledby="favorite-products-tab">
                        <div class="row gutters-sm">
                            <div class="col-sm-12 mb-3">
                                <div class="card h-100">
                                    <div class="card-body">
                                        <h5 class="card-title">Favorite Products</h5>
                                        <div class="table-responsive">
                                            <table class="table table-hover">
                                                <thead>
                                                    <tr>
                                                        <th>No.</th>
                                                        <th>Product ID</th>
                                                        <th>Product Name</th>
                                                        <th>Price</th>
                                                        <th></th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <% int count = 0;
                                                        sql.searchFavoriteProduct(userDTO.getUser_id());
                                                        List<FavoriteDTO> favorites = sql.getListFavorite();
                                                        if (favorites != null && !favorites.isEmpty()) {
                                                            for (FavoriteDTO favorite : favorites) {%>
                                                    <tr>
                                                        <td><%= ++count%></td>
                                                        <td><%= favorite.getProduct_id()%></td>
                                                        <td><%= favorite.getProduct_name()%></td>
                                                        <td><%= favorite.getPrice()%></td>

                                                        <td>
                                                            <form action="MainController" method="post">
                                                                <input type="hidden" name="txtUserID" value="<%= userDTO.getUser_id()%>">
                                                                <input type="hidden" name="txtProductID" value="<%= favorite.getProduct_id()%>"/>
                                                                <input class="btn btn-success btn-sm mr-2" type="submit" name="btAction" value="Remove" />
                                                            </form>
                                                        </td>
                                                    </tr>
                                                    <% }
                                                    } else { %>
                                                    <tr>
                                                        <td colspan="4" class="text-center">No orders found.</td>
                                                    </tr>
                                                    <%}%>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script data-cfasync="false"
        src="/cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js"></script>
        <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.bundle.min.js"></script>
        <script type="text/javascript">
                                                        // Function to show the form for editing phone number and hide the Edit button
                                                        function editInfo() {
                                                            document.getElementsByName("txtPhoneNumber")[0].style.display = "block";
                                                            document.getElementsByName("txtAddress")[0].style.display = "block";
                                                            document.getElementsByTagName("button")[0].style.display = "none";
                                                            document.getElementsByTagName("button")[1].style.display = "inline-block";
                                                            document.querySelector('input[type="submit"][name="btAction"][value="Save"]').style.display = "inline-block"
                                                        }

                                                        // Function to cancel editing of phone number and show the Edit button
                                                        function cancelEdit() {
                                                            document.getElementsByName("txtPhoneNumber")[0].value = "<%= userDTO.getPhone_number()%>";
                                                            document.getElementsByName("txtAddress")[0].value = "<%= userDTO.getAddress()%>";
                                                            document.getElementsByName("txtPhoneNumber")[0].style.display = "none";
                                                            document.getElementsByName("txtAddress")[0].style.display = "none";
                                                            document.getElementsByTagName("button")[0].style.display = "block";
                                                            document.getElementsByTagName("button")[1].style.display = "none";
                                                            document.querySelector('input[type="submit"][name="btAction"][value="Save"]').style.display = "none";
                                                        }

                                                        // Function to display the Save button on form submit
                                                        $("form").submit(function () {
                                                            $("#save").css("display", "inline-block");
                                                        });
        </script>
        <script type="text/javascript">
            // Retrieve the last selected tab from local storage, or default to the first tab
            const selectedTab = localStorage.getItem('selectedTab') || '#user-info';

            // Set the last selected tab as active
            $(function () {
                $('a[href="' + selectedTab + '"]').tab('show');
            });

            // Store the currently selected tab in local storage when a new tab is selected
            $('a[data-toggle="tab"]').on('shown.bs.tab', function (e) {
                localStorage.setItem('selectedTab', e.target.hash);
            });
        </script>
        <%} else {
                response.sendRedirect("login.jsp");
            }%>
    </body>

</html>

