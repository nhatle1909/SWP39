<%-- 
    Document   : ProductPage
    Created on : Jun 7, 2023, 6:41:19 PM
    Author     : ADMIN
--%>

<%@page import="java.util.List"%>
<%@page import="Utility.ProductListDTO"%>
<%@page import="SQLCommand.DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="font-size: 16px;" lang="en"><head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta charset="utf-8">
        <meta name="keywords" content="">
        <meta name="description" content="">
        <title>Products</title>

        <link rel="stylesheet" href="css/nicepage.css" media="screen">
        <link rel="stylesheet" href="css/productList.css" media="screen">
        <script class="u-script" type="text/javascript" src="js/jquery.js" defer=""></script>
        <script class="u-script" type="text/javascript" src="js/nicepage.js" defer=""></script>
        <meta name="generator" content="Nicepage 5.10.10, nicepage.com">
        <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i">


        <script type="application/ld+json">{
            "@context": "http://schema.org",
            "@type": "Organization",
            "name": "Site1",
            "logo": "images/logo-removebg-preview.png"
            }</script>
        <meta name="theme-color" content="#478ac9">
        <meta property="og:title" content="productList">
        <meta property="og:description" content="">
        <meta property="og:type" content="website">
        <meta data-intl-tel-input-cdn-path="intlTelInput/"></head>
    <body class="u-body u-xl-mode" data-lang="en"><header class="u-clearfix u-header u-header" id="sec-72fc"><div class="u-clearfix u-sheet u-sheet-1">
                <a href="https://nicepage.com" class="u-image u-logo u-image-1" data-image-width="300" data-image-height="140">
                    <img src="images/logo-removebg-preview.png" class="u-logo-image u-logo-image-1">
                </a>

                <!-- JSP Scriptlet - Declare and Call Function -->
                <% DAO sql = new DAO();
                    String product_name = "";
                    List<ProductListDTO> productLists = (List) session.getAttribute("SortedProductList");
                    if (productLists == null) {
                        sql.searchProduct(product_name);
                        productLists = sql.getListProduct();
                        session.setAttribute("SortedProductList",productLists);
                    }
                    String mail = (String) session.getAttribute("txtMail");
                %>
                <!-- JSP Scriptlet - Declare and Call Function -->




                <nav class="u-menu u-menu-one-level u-offcanvas u-menu-1">
                    <div class="menu-collapse" style="font-size: 1rem; letter-spacing: 0px;">
                        <a class="u-button-style u-custom-left-right-menu-spacing u-custom-padding-bottom u-custom-top-bottom-menu-spacing u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="#">
                            <svg class="u-svg-link" viewBox="0 0 24 24"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#menu-hamburger"></use></svg>
                            <svg class="u-svg-content" version="1.1" id="menu-hamburger" viewBox="0 0 16 16" x="0px" y="0px" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns="http://www.w3.org/2000/svg"><g><rect y="1" width="16" height="2"></rect><rect y="7" width="16" height="2"></rect><rect y="13" width="16" height="2"></rect>
                            </g></svg>
                        </a>
                    </div>
                    <div class="u-custom-menu u-nav-container">
                        <ul class="u-nav u-unstyled u-nav-1">
                            </li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="index.html" style="padding: 10px 20px;">Home</a>

                                <% if (mail == null) {%>
                            </li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="login.jsp" style="padding: 10px 20px;">Login</a>
                                <%} else {%>
                            </li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="user_info.jsp" style="padding: 10px 20px;">Profile</a>
                                <%}%>
                            </li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="bird.jsp" style="padding: 10px 20px;">Bird</a>
                            </li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="Contact.html" style="padding: 10px 20px;">Contact</a>
                            </li></ul>
                    </div>
                    <div class="u-custom-menu u-nav-container-collapse">
                        <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
                    </div>
                </nav>
            </div></header>
        <section class="u-align-center u-clearfix u-section-1" id="sec-fe3c">
            <div class="u-clearfix u-sheet u-valign-middle u-sheet-1"><!--products--><!--products_options_json--><!--{"type":"Recent","source":"","tags":"","count":""}--><!--/products_options_json-->
                <div class="u-expanded-width u-products u-sorting-right u-products-1">
                    <div class="has-sorting u-list-control">
                        <div class="u-sorting">
                            <form action ="MainController" method="POST">
                                <select name="Sort" class="u-input u-select-sorting">
                                    <option value="SortPrice">Sort by price ( Low to High )</option>
                                    <option value="SortQuantity">Sort by quantity ( Low to High )</option>
                                    <option value="SortName">Sort by Name ( A to Z )</option>
                                </select>
                                <input class="u-border-2 u-border-black u-btn u-button-style u-hover-black u-none u-text-black u-text-hover-white"type="submit" name="btAction" value="Sort"/>
                            </form>
                            <svg class="u-caret u-caret-svg" version="1.1" id="Layer_1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" width="16px" height="16px" viewBox="0 0 16 16" style="fill:currentColor;" xml:space="preserve"><polygon class="st0" points="8,12 2,4 14,4 "></polygon></svg>
                        </div>
                    </div>

                    <div class="u-repeater u-repeater-1"><!--product_item-->

                        <!-- JSP Scriptlet - Loop for Product List -->
                        <%if (productLists != null && !productLists.isEmpty()) {
                            int count=-1;
                            for (ProductListDTO productList : productLists) {%>

                        <div class="u-align-center u-container-style u-products-item u-repeater-item u-shape-rectangle">
                           
                                <div class="u-container-layout u-similar-container u-valign-bottom u-container-layout-1"><!--product_image-->
                                    <img alt="" class="u-image u-product-control u-image-1" src="<%= productList.getImage_url()%>" data-animation-name="customAnimationIn" data-animation-duration="1000"><!--/product_image-->
                                    <h4 class="u-text u-text-default u-text-1" data-animation-name="customAnimationIn" data-animation-duration="1000">
                                        <a class="u-active-none u-border-none u-btn u-button-link u-button-style u-hover-none u-none u-text-body-color u-btn" href="Mazuri.html"><%= productList.getProduct_name()%></a>
                                    </h4>
                                    <p class="u-text u-text-default u-text-palette-2-base u-text" data-animation-name="customAnimationIn" data-animation-duration="1000"><%= productList.getPrice()%>.000 VND</p>
                                    <p class="u-text u-text-default u-text-palette-2-base u-text" data-animation-name="customAnimationIn" data-animation-duration="1000">
                                        <% if (productList.getQuantity() <= 0) {%>    
                                        Out Of Stock</p>
                                        <%} else {%>
                                    Quantity : <%= productList.getQuantity()%></p>
                                    <%}%>
                                    <% if (sql.getRole(mail).equals("CUSTOMER")) {%> 
                                    <a href="AddToFavorite?txtProductId=<%= productList.getProduct_id()%>" class="u-border-2 u-border-black u-btn u-button-style u-hover-black u-none u-text-black u-text-hover-white" data-animation-name="customAnimationIn" data-animation-duration="1000">Add To Favorite</a>
                                   <form/>
                                    <%}%>
                                    <a href="Mazuri.html" class="u-border-2 u-border-black u-btn u-button-style u-hover-black u-none u-text-black u-text-hover-white" data-animation-name="customAnimationIn" data-animation-duration="1000">GO TO PRODUCT</a>
                                </div>
                                
                        </div><!--/product_item--><!--product_item-->
                        <%}%>
                        <%}%>
                    </div>

                </div><!--/products-->
            </div>
        </section>



    </body></html>