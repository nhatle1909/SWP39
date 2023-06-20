package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Utility.ProductListDTO;
import SQLCommand.DAO;

public final class ProductPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>BIFO Shop</title>\n");
      out.write("        <!--Link to CSS-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/ProductPage.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <!--Link to Box Icons-->\n");
      out.write("        <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!-- Java Scriplet ->\n");
      out.write("        ");
 DAO sql = new DAO();
            String product_name = "";
            List<ProductListDTO> productLists = (List) session.getAttribute("SortedProductList");
            if (productLists == null) {
                sql.searchProduct(product_name);
                productLists = sql.getListProduct();
                session.setAttribute("SortedProductList", productLists);
            }
            String mail = (String) session.getAttribute("txtMail");
        
      out.write("\n");
      out.write("        <!-- Java Scriplet -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Header -->\n");
      out.write("        <header>\n");
      out.write("            <!-- Nav -->\n");
      out.write("            <div class=\"nav container\">\n");
      out.write("                <img src=\"images/logo-removebg-preview.png\" href=\"#\" class=\"logo\"></img>\n");
      out.write("                <!-- Cart-Icon -->\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"index.html\" class=\"header-title\">Home</a></li>\n");
      out.write("                    <li><a href=\"ProductPage.jsp\" class=\"header-title\">Product</a></li>\n");
      out.write("                    <li><a href=\"bird.jsp\" class=\"header-title\">Bird</a></li>\n");
      out.write("                    <li><a href=\"productList.html\" class=\"header-title\">Contact</a></li>\n");
      out.write("                        ");
 if (mail == null) {
      out.write("\n");
      out.write("                    <li><a href=\"login.jsp\" class=\"header-title\">Login</a></li>\n");
      out.write("                        ");
} else {
      out.write("\n");
      out.write("                    <li><a href=\"user_info.jsp\" class=\"header-title\">Profile</a></li>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    <li><i class='bx bxs-cart-alt' id=\"cart-icon\" data-quantity=\"0\"></i></li>\n");
      out.write("                </ul>\n");
      out.write("                <!-- Cart -->\n");
      out.write("                <div class=\"cart\">\n");
      out.write("                    <h2 class=\"cart-title\">Your cart</h2>\n");
      out.write("                    <!-- Content -->\n");
      out.write("                    <div class=\"cart-content\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Total -->\n");
      out.write("                    <div class=\"total\">\n");
      out.write("                        <div class=\"total-title\">Total</div>\n");
      out.write("                        <div class=\"total-price\">$0</div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Buy Button -->\n");
      out.write("                    <button type=\"button\" class=\"btn-buy\">Buy Now</button>\n");
      out.write("                    <!-- Cart Close -->\n");
      out.write("                    <i class='bx bx-x' id=\"close-cart\"></i>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <!-- Shop -->\n");
      out.write("        <section class=\"shop container\">\n");
      out.write("            <h2 class=\"section-title\">Shop Products</h2>\n");
      out.write("            <!-- Content -->\n");
      out.write("            <div>\n");
      out.write("                <form action=\"MainController\" method=\"post\">\n");
      out.write("                    <div class=\"search_wrap search_wrap_1\">\n");
      out.write("                        <div class=\"search_box\">\n");
      out.write("                            <input type=\"text\" value=\"\" name=\"txtProductName\" class=\"input\" placeholder=\"search...\">\n");
      out.write("                            <input type=\"submit\" name=\"btAction\" value=\"Search\" class=\"searchButton\"/>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"filter-condition\">\n");
      out.write("                        <select name=\"Sort\" id=\"select\">\n");
      out.write("                            <option value=\"SortPrice\">Price (Low to High)</option>                  \n");
      out.write("                            <option value=\"SortQuantity\">Quantity (Low to High)</option>                 \n");
      out.write("                            <option value=\"SortName\">Name (A to Z)</option>       \n");
      out.write("                        </select>\n");
      out.write("                        <input type=\"submit\" name=\"btAction\" Value=\"Sort\" class=\"button\"/>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"shop-content\">\n");
      out.write("                <div class=\"row justify-content-center\">\n");
      out.write("                    ");
if (productLists != null && !productLists.isEmpty()) {
                            for (ProductListDTO productList : productLists) {
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4 col-sm-6 mb-4\">\n");
      out.write("                        <!-- Box 1 -->\n");
      out.write("                        <div class=\"product-box\">\n");
      out.write("                            <img src=\"");
      out.print( productList.getImage_url());
      out.write("\" alt=\"img\" class=\"product-img\">\n");
      out.write("                            <h2 class=\"product-title\">");
      out.print( productList.getProduct_name());
      out.write("</h2>\n");
      out.write("                            <br/>\n");
      out.write("                            <p class =\"price\">");
      out.print( productList.getPrice());
      out.write(".000 VND</p>\n");
      out.write("                            <p class = \"product-text\">\n");
      out.write("                                ");
 if (productList.getQuantity() <= 0) {
      out.write("    \n");
      out.write("                                Out Of Stock</p>\n");
      out.write("                                ");
} else {
      out.write("\n");
      out.write("                            Quantity : ");
      out.print( productList.getQuantity());
      out.write("</p>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                            ");
 if (sql.getRole(mail).equals("CUSTOMER")) {
      out.write(" </p>\n");
      out.write("                            <a href=\"AddToFavorite?txtProductId=");
      out.print( productList.getProduct_id());
      out.write("\" class=\"learn-more\">Add To Favorite</a>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                            <a href=\"ProductDetail?txtProductId=");
      out.print( productList.getProduct_id());
      out.write("\">\n");
      out.write("                                <h2 class=\"learn-more\">Go To Product</h2>\n");
      out.write("                            </a>\n");
      out.write("                            <i class='bx bxs-cart-alt add-cart'></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Featured Products-->\n");
      out.write("        <div class=\"small-container\">\n");
      out.write("            <h2 class=\"title\">Featured Products</h2>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"product-box\">\n");
      out.write("                        <img src=\"img/food01.png\" alt=\"img\" class=\"product-img\">\n");
      out.write("                        <h2 class=\"product-title\">MAZURI S</h2>\n");
      out.write("                        <p class =\"price\">Price</p>\n");
      out.write("                        <p class = \"product-text\">Quantity</p>\n");
      out.write("                        <a href=\"mazuriS.html\">\n");
      out.write("                            <h2 class=\"learn-more\">LEARN MORE</h2>\n");
      out.write("                        </a>\n");
      out.write("                        <i class='bx bxs-cart-alt add-cart'></i>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Lastest Products-->\n");
      out.write("        <div class=\"small-container\">\n");
      out.write("            <h2 class=\"title\">Lastest Products</h2>\n");
      out.write("            <div class=\"row\">          \n");
      out.write("                <div class=\"col-sm-6 col-md-3\">\n");
      out.write("                    <div class=\"product-box\">\n");
      out.write("                        <img src=\"img/food08.png\" alt=\"img\" class=\"product-img\">\n");
      out.write("                        <h2 class=\"product-title\">ZUPREEM N</h2>\n");
      out.write("                        <p class =\"price\">Price</p>\n");
      out.write("                        <p class = \"product-text\">Quantity</p>\n");
      out.write("                        <a  href=\"zupreemN.html\">\n");
      out.write("                            <h2 class=\"learn-more\">LEARN MORE</h2>\n");
      out.write("                        </a>\n");
      out.write("                        <i class='bx bxs-cart-alt add-cart'></i>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- Offer -->\n");
      out.write("    <div class=\"offer\">\n");
      out.write("        <div class=\"small-container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-6\">\n");
      out.write("                    <img src=\"images/body_bird_food1/bird_food5.png\" class=\"offer-img\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-6 offer-content\">\n");
      out.write("                    <p>Exclusively Available on BIFO Shop</p>\n");
      out.write("                    <h1>ZUPREEM PURE FUN</h1>\n");
      out.write("                    <small>\n");
      out.write("                        Our ZuPreem Pure Fun is 39.9% more nutrious than other product which can only found on BIFO Shop\n");
      out.write("                        <p>Want to see more information about the product?</p>\n");
      out.write("                        <a href=\"\" class=\"btn-offer\">See More &#8594;</a>\n");
      out.write("                    </small>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Brands -->\n");
      out.write("    <div class=\"brands\">\n");
      out.write("        <div class=\"small-container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <img src=\"images/paypal.png\" class=\"brands\">\n");
      out.write("                <img src=\"images/visa.png\" class=\"brands\">\n");
      out.write("                <img src=\"images/mastercard.png\" class=\"brands\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Footer -->\n");
      out.write("    <div class=\"footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3 footer-content\">\n");
      out.write("                    <h3>Download Our App</h3>\n");
      out.write("                    <p>Download App For Android and ios mobile phone.</p>\n");
      out.write("                    <div class=\"app-logo\">\n");
      out.write("                        <img src=\"images/app-store.png\" alt=\"\">\n");
      out.write("                        <img src=\"images/play-store.png\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 footer-content\">\n");
      out.write("                    <img src=\"images/logo-removebg-preview.png\">\n");
      out.write("                    <p>Our Purpose Is To Sustainably Make the Pleasure and Benefits of Bird Food to Many.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 footer-content\">\n");
      out.write("                    <h3>Useful Links</h3>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Coupon</li>\n");
      out.write("                        <li>Blog Post</li>\n");
      out.write("                        <li>Return Policy</li>\n");
      out.write("                        <li>Join Affiliate</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 footer-content\">\n");
      out.write("                    <h3>Follow Us</h3>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Facebook</li>\n");
      out.write("                        <li>Twitter</li>\n");
      out.write("                        <li>Instagram</li>\n");
      out.write("                        <li>Youtube</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <hr>\n");
      out.write("            <p class=\"copyright\">Copyright 2023 - BIFO Shop</p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    ");
if (productLists != null){
        productLists.clear();
        session.removeAttribute("SortedProductList");
    }
    
      out.write("\n");
      out.write("    <!-- Link to JS -->\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
