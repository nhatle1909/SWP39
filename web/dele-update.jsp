<%-- 
    Document   : dele-update
    Created on : Jun 15, 2023, 9:15:43 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Modernize Free</title>
  <!-- <link rel="shortcut icon" type="image/png" href="../assets/images/logos/favicon.png" /> -->
  <link rel="stylesheet" href="css/styles.min.css" />
</head>

<body>
  <!--  Body Wrapper -->
  <div class="page-wrapper" id="main-wrapper" data-layout="vertical" data-navbarbg="skin6" data-sidebartype="full"
    data-sidebar-position="fixed" data-header-position="fixed">
    <!-- Sidebar Start -->
    <aside class="left-sidebar">
      <!-- Sidebar scroll-->
      <div>
        <div class="brand-logo d-flex align-items-center justify-content-between">
          <a href="index.html" class="text-nowrap logo-img">
            <img src="images/logo-removebg-preview.png" width="180" alt="" />
          </a>
          <div class="close-btn d-xl-none d-block sidebartoggler cursor-pointer" id="sidebarCollapse">
            <i class="ti ti-x fs-8"></i>
          </div>
        </div>
        <!-- Sidebar navigation-->
        <nav class="sidebar-nav scroll-sidebar" data-simplebar="">
          <ul id="sidebarnav">
            <li class="nav-small-cap">
              <i class="ti ti-dots nav-small-cap-icon fs-4"></i>
              <span class="hide-menu">Home</span>
            </li>
            <li class="sidebar-item">
                <a class="sidebar-link" href="AdminDashboard.jsp" aria-expanded="false">
                  <span>
                    <i class="ti ti-layout-dashboard"></i>
                  </span>
                  <span class="hide-menu">Dashboard</span>
                </a>
              </li>
              <li class="nav-small-cap">
                <i class="ti ti-dots nav-small-cap-icon fs-4"></i>
                <span class="hide-menu">UI COMPONENTS</span>
              </li>
              <li class="sidebar-item">
                <a class="sidebar-link" href="AccountController.jsp" aria-expanded="false">
                  <span>
                    <i class="ti ti-user"></i>
                  </span>
                  <span class="hide-menu">Account Controller</span>
                </a>
              </li>
              <li class="sidebar-item">
                <a class="sidebar-link" href="add-product.jsp" aria-expanded="false">
                  <span>
                    <i class="ti ti-file-description"></i>
                  </span>
                  <span class="hide-menu">Add Products</span>
                </a>
              </li>
              <li class="sidebar-item">
                <a class="sidebar-link" href="dele-update.jsp" aria-expanded="false">
                  <span>
                    <i class="ti ti-file-description"></i>
                  </span>
                  <span class="hide-menu">Update & Delete</span>
                </a>
              </li>
              <li class="sidebar-item">
                <a class="sidebar-link" href="product.jsp" aria-expanded="false">
                  <span>
                    <i class="ti ti-box"></i>
                  </span>
                  <span class="hide-menu">Product</span>
                </a>
              </li>
        </nav>
        <!-- End Sidebar navigation -->
      </div>
      <!-- End Sidebar scroll-->
    </aside>
    <!--  Sidebar End -->
    <!--  Main wrapper -->
    <div class="body-wrapper">
      <!--  Header Start -->
      <header class="app-header">
        <nav class="navbar navbar-expand-lg navbar-light">
          <ul class="navbar-nav">
            <li class="nav-item d-block d-xl-none">
              <a class="nav-link sidebartoggler nav-icon-hover" id="headerCollapse" href="javascript:void(0)">
                <i class="ti ti-menu-2"></i>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link nav-icon-hover" href="javascript:void(0)">
                <i class="ti ti-bell-ringing"></i>
                <div class="notification bg-primary rounded-circle"></div>
              </a>
            </li>
          </ul>
          <div class="navbar-collapse justify-content-end px-0" id="navbarNav">
            <ul class="navbar-nav flex-row ms-auto align-items-center justify-content-end">
              <a href="https://adminmart.com/product/modernize-free-bootstrap-admin-dashboard/" target="_blank" class="btn btn-primary">Download Free</a>
              <li class="nav-item dropdown">
                <a class="nav-link nav-icon-hover" href="javascript:void(0)" id="drop2" data-bs-toggle="dropdown"
                  aria-expanded="false">
                  <img src="#" alt="" width="35" height="35" class="rounded-circle">
                </a>
                <div class="dropdown-menu dropdown-menu-end dropdown-menu-animate-up" aria-labelledby="drop2">
                  <div class="message-body">
                    <a href="javascript:void(0)" class="d-flex align-items-center gap-2 dropdown-item">
                      <i class="ti ti-user fs-6"></i>
                      <p class="mb-0 fs-3">My Profile</p>
                    </a>
                    <a href="javascript:void(0)" class="d-flex align-items-center gap-2 dropdown-item">
                      <i class="ti ti-mail fs-6"></i>
                      <p class="mb-0 fs-3">My Account</p>
                    </a>
                    <a href="javascript:void(0)" class="d-flex align-items-center gap-2 dropdown-item">
                      <i class="ti ti-list-check fs-6"></i>
                      <p class="mb-0 fs-3">My Task</p>
                    </a>
                    <a href="./authentication-login.html" class="btn btn-outline-primary mx-3 mt-2 d-block">Logout</a>
                  </div>
                </div>
              </li>
            </ul>
          </div>
        </nav>
      </header>
      <!--  Header End -->
      <div class="container-fluid">
        <div class="container-fluid">
          <div class="card">
            <div class="card-body">
              <h5 class="card-title fw-semibold mb-4">Update</h5>
              <div class="card">
                <div class="card-body">
                  <form>

                    <div class="mb-3">
                        <label for="exampleInputID" class="form-label">Product ID</label>
                        <input type="id" class="form-control" id="inputID">
                      </div>
  
                      <div class="mb-3">
                        <label for="exampleInputName" class="form-label">Product Name</label>
                        <input type="name" class="form-control" id="exampleInputName">
                      </div>
  
                      <div class="mb-3">
                        <label for="exampleInputPassword1" class="form-label">Price</label>
                        <input type="number" class="form-control" id="exampleInputPassword1">
                      </div>
                      
                      <div class="mb-3">
                        <label for="exampleInputQuantity" class="form-label">Quantity</label>
                        <input type="number" class="form-control" id="exampleInputEmail1">
                      </div>
  
                      <div class="mb-3">
                        <label for="exampleInputDes" class="form-label">Description</label>
                        <input type="text" class="form-control" id="exampleInputDes">
                      </div>
  
                      <div class="mb-3">
                        <label for="exampleInputBird" class="form-label">Bird</label>
                        <input type="text" class="form-control" id="exampleInputBird">
                      </div>

                    <button type="submit" class="btn btn-primary">Save</button>

                  </form>
                </div>
              </div>
              <h5 class="card-title fw-semibold mb-4">Delete</h5>
              <div class="card mb-0">
                <div class="card-body">
                  <form>
                    <fieldset enable>
                        <div class="mb-3">
                            <label for="exampleInputID" class="form-label">Product ID</label>
                            <input type="id" class="form-control" id="inputID">
                          </div>
                      <button type="sumbit" class="btn btn-primary">Delete</button>
                    </fieldset>
                  </form>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <script src="js/libs/jquery/dist/jquery.min.js"></script>
  <script src="js/libs/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
  <script src="js/sidebarmenu.js"></script>
  <script src="js/app.min.js"></script>
  <script src="js/libs/simplebar/dist/simplebar.js"></script>
</body>

</html>