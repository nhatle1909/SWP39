package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Utility.OrderDetailDTO;
import Utility.OrderDetailDTO;
import java.util.List;
import DAO.DAO;

public final class orderList_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('t');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>BIFO</title>\n");
      out.write("        <!-- <link rel=\"shortcut icon\" type=\"image/png\" href=\"../assets/images/logos/favicon.png\" /> -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styles.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/product.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
DAO sql = new DAO();
            String username = "";
            List<OrderDetailDTO> orderDetailList = (List) session.getAttribute("SortedOrderList");
            if (orderDetailList == null) {
                sql.showOrderList(username);
                orderDetailList = sql.getListOrderDetail();
                session.setAttribute("SortedOrderList", orderDetailList);
            }
      out.write("\n");
      out.write("        %>\n");
      out.write("        <!--  Body Wrapper -->\n");
      out.write("        <div class=\"page-wrapper\" id=\"main-wrapper\" data-layout=\"vertical\" data-navbarbg=\"skin6\" data-sidebartype=\"full\"\n");
      out.write("             data-sidebar-position=\"fixed\" data-header-position=\"fixed\">\n");
      out.write("            <!-- Sidebar Start -->\n");
      out.write("            <aside class=\"left-sidebar\">\n");
      out.write("                <!-- Sidebar scroll-->\n");
      out.write("                <div>\n");
      out.write("                    <div class=\"brand-logo d-flex align-items-center justify-content-between\">\n");
      out.write("                        <a href=\"index.html\" class=\"text-nowrap logo-img\">\n");
      out.write("                            <img src=\"images/logo-removebg-preview.png\" width=\"180\" alt=\"\" />\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"close-btn d-xl-none d-block sidebartoggler cursor-pointer\" id=\"sidebarCollapse\">\n");
      out.write("                            <i class=\"ti ti-x fs-8\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Sidebar navigation-->\n");
      out.write("                    <nav class=\"sidebar-nav scroll-sidebar\" data-simplebar=\"\">\n");
      out.write("                        <ul id=\"sidebarnav\">\n");
      out.write("                          \n");
      out.write("                            <li class=\"nav-small-cap\">\n");
      out.write("                                <i class=\"ti ti-dots nav-small-cap-icon fs-4\"></i>\n");
      out.write("                                <span class=\"hide-menu\">UI COMPONENTS</span>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"sidebar-item\">\n");
      out.write("                                <a class=\"sidebar-link\" href=\"add-product.jsp\" aria-expanded=\"false\">\n");
      out.write("                                    <span>\n");
      out.write("                                        <i class=\"ti ti-file-description\"></i>\n");
      out.write("                                    </span>\n");
      out.write("                                    <span class=\"hide-menu\">Add Products</span>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"sidebar-item\">\n");
      out.write("                                <a class=\"sidebar-link\" href=\"dele-update.jsp\" aria-expanded=\"false\">\n");
      out.write("                                    <span>\n");
      out.write("                                        <i class=\"ti ti-file-description\"></i>\n");
      out.write("                                    </span>\n");
      out.write("                                    <span class=\"hide-menu\">Update & Delete</span>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"sidebar-item\">\n");
      out.write("                                <a class=\"sidebar-link\" href=\"product.jsp\" aria-expanded=\"false\">\n");
      out.write("                                    <span>\n");
      out.write("                                        <i class=\"ti ti-box\"></i>\n");
      out.write("                                    </span>\n");
      out.write("                                    <span class=\"hide-menu\">Product</span>\n");
      out.write("                                </a>\n");
      out.write("\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"sidebar-item\">\n");
      out.write("                                <a class=\"sidebar-link\" href=\"orderList.jsp\" aria-expanded=\"false\">\n");
      out.write("                                    <span>\n");
      out.write("                                        <i class=\"ti ti-box\"></i>\n");
      out.write("                                    </span>\n");
      out.write("                                    <span class=\"hide-menu\">Order List</span>\n");
      out.write("                                </a>\n");
      out.write("\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"sidebar-item\">\n");
      out.write("                                <a class=\"sidebar-link\" href=\"refundList.jsp\" aria-expanded=\"false\">\n");
      out.write("                                    <span>\n");
      out.write("                                        <i class=\"ti ti-box\"></i>\n");
      out.write("                                    </span>\n");
      out.write("                                    <span class=\"hide-menu\">Refund Request List</span>\n");
      out.write("                                </a>\n");
      out.write("\n");
      out.write("                            </li>\n");
      out.write("                    </nav>\n");
      out.write("                    <!-- End Sidebar navigation -->\n");
      out.write("                </div>\n");
      out.write("                <!-- End Sidebar scroll-->\n");
      out.write("            </aside>\n");
      out.write("            <!--  Sidebar End -->\n");
      out.write("\n");
      out.write("            <!--  Main wrapper -->\n");
      out.write("            <div class=\"body-wrapper\">\n");
      out.write("                <div class=\"app-container\">\n");
      out.write("                    <div class=\"app-content\">\n");
      out.write("                        <div class=\"app-content-header\">\n");
      out.write("                            <h1 class=\"app-content-headerText\">Products</h1>\n");
      out.write("                            <button class=\"mode-switch\" title=\"Switch Theme\">\n");
      out.write("                                <svg class=\"moon\" fill=\"none\" stroke=\"currentColor\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\">\n");
      out.write("                                <defs></defs>\n");
      out.write("                                <path d=\"M21 12.79A9 9 0 1111.21 3 7 7 0 0021 12.79z\"></path>\n");
      out.write("                                </svg>\n");
      out.write("                            </button>\n");
      out.write("                            <form action =\"MainController\" method=\"post\">\n");
      out.write("                            <input type='submit' name='btAction' value='Logout' class=\"app-content-headerButton\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"app-content-actions\">\n");
      out.write("                            <form action =\"MainController\" method=\"Post\">\n");
      out.write("                                <input class=\"search-bar\" placeholder=\"Search by username\" type=\"text\" name=\"txtUsername\">\n");
      out.write("                                <input type=\"submit\" name=\"btAction\" value=\"Search Order\" class =\"Button\">\n");
      out.write("                            </form>\n");
      out.write("                            <div class=\"app-content-actions-wrapper\">\n");
      out.write("                                <div class=\"filter-button-wrapper\">\n");
      out.write("                                    <button class=\"action-button filter jsFilter\"><span>Filter</span><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-filter\"><polygon points=\"22 3 2 3 10 12.46 10 19 14 21 14 12.46 22 3\"/></svg></button>\n");
      out.write("                                    <div class=\"filter-menu\">\n");
      out.write("                                        <label>Category</label>\n");
      out.write("                                        <select>\n");
      out.write("                                            <option>All Categories</option>\n");
      out.write("                                            <option>Bird</option>                 \n");
      out.write("                                            <option>Food</option>\n");
      out.write("                                        </select>\n");
      out.write("                                        <label>Status</label>\n");
      out.write("                                        <select>\n");
      out.write("                                            <option>All Status</option>\n");
      out.write("                                            <option>Active</option>\n");
      out.write("                                            <option>Disabled</option>\n");
      out.write("                                        </select>\n");
      out.write("                                        <div class=\"filter-menu-buttons\">\n");
      out.write("                                            <button class=\"filter-button reset\">\n");
      out.write("                                                Reset\n");
      out.write("                                            </button>\n");
      out.write("                                            <button class=\"filter-button apply\">\n");
      out.write("                                                Apply\n");
      out.write("                                            </button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <button class=\"action-button list active\" title=\"List View\">\n");
      out.write("                                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-list\"><line x1=\"8\" y1=\"6\" x2=\"21\" y2=\"6\"/><line x1=\"8\" y1=\"12\" x2=\"21\" y2=\"12\"/><line x1=\"8\" y1=\"18\" x2=\"21\" y2=\"18\"/><line x1=\"3\" y1=\"6\" x2=\"3.01\" y2=\"6\"/><line x1=\"3\" y1=\"12\" x2=\"3.01\" y2=\"12\"/><line x1=\"3\" y1=\"18\" x2=\"3.01\" y2=\"18\"/></svg>\n");
      out.write("                                </button>\n");
      out.write("                                <button class=\"action-button grid\" title=\"Grid View\">\n");
      out.write("                                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-grid\"><rect x=\"3\" y=\"3\" width=\"7\" height=\"7\"/><rect x=\"14\" y=\"3\" width=\"7\" height=\"7\"/><rect x=\"14\" y=\"14\" width=\"7\" height=\"7\"/><rect x=\"3\" y=\"14\" width=\"7\" height=\"7\"/></svg>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"products-area-wrapper tableView\">\n");
      out.write("                            <div class=\"products-header\">\n");
      out.write("                                <div class=\"product-cell image\">Order ID</div>\n");
      out.write("                                <div class=\"product-cell sales\">Username</div>\n");
      out.write("                                <div class=\"product-cell stock\">Phone Number</div>\n");
      out.write("                                <div class=\"product-cell price\">Address</div>\n");
      out.write("                                <div class=\"product-cell price\">Total Price</div>\n");
      out.write("                                <div class=\"product-cell status-cell\">Product List</div>\n");
      out.write("                                <div class=\"product-cell status-cell\">Status</div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            ");
if (orderDetailList != null && !orderDetailList.isEmpty()) {
                                    for (OrderDetailDTO orderDetailLists : orderDetailList) {
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"products-row\">\n");
      out.write("                                <button class=\"cell-more-button\">\n");
      out.write("                                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"18\" height=\"18\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-more-vertical\"><circle cx=\"12\" cy=\"12\" r=\"1\"/><circle cx=\"12\" cy=\"5\" r=\"1\"/><circle cx=\"12\" cy=\"19\" r=\"1\"/></svg>\n");
      out.write("                                </button>\n");
      out.write("                                <div class=\"product-cell category\"><span class=\"cell-label\">Order ID:</span>");
      out.print(orderDetailLists.getOrder_id());
      out.write("</div>\n");
      out.write("                                <div class=\"product-cell price\"><span class=\"cell-label\">Username:</span>");
      out.print(orderDetailLists.getUsername());
      out.write("</div>\n");
      out.write("                                <div class=\"product-cell price\"><span class=\"cell-label\">Phone Number:</span>");
      out.print(orderDetailLists.getPhoneNumber());
      out.write("</div>\n");
      out.write("                                <div class=\"product-cell price\"><span class=\"cell-label\">Address:</span>");
      out.print(orderDetailLists.getAddress());
      out.write("</div>\n");
      out.write("                                <div class=\"product-cell stock\"><span class=\"cell-label\">Price:</span>");
      out.print(orderDetailLists.getTotalPrice());
      out.write(".000 VND</div>\n");
      out.write("                                <div class=\"product-cell price\"><span class=\"cell-label\">Product List:</span>");
      out.print(orderDetailLists.getProductList());
      out.write("</div>\n");
      out.write("                                <div class=\"product-cell price\">\n");
      out.write("                                    <span class=\"cell-label\">");
      out.print(orderDetailLists.getStatus());
      out.write("</span>\n");
      out.write("                                    ");
      out.print(orderDetailLists.getStatus());
      out.write(" \n");
      out.write("                                    ");
 if (orderDetailLists.getStatus().equals("WAITING")) {
      out.write("\n");
      out.write("                                    <button id=\"order-status\" class=\"Button\"><a href = \"UpdateStatus?txtOrderID=");
      out.print(orderDetailLists.getOrder_id());
      out.write("\">Update Order</a></button>\n");
      out.write("                                    ");
}else if (orderDetailLists.getStatus().equals("DELIVERING")){
      out.write("\n");
      out.write("                                    <button id=\"order-status\" class=\"Button\"><a href = \"ConfirmOrder?txtOrderID=");
      out.print(orderDetailLists.getOrder_id());
      out.write("\">Confirm Order</a></button>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>      \n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <script src=\"js/libs/jquery/dist/jquery.min.js\"></script>\n");
      out.write("            <script src=\"js/libs/bootstrap/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("            <script src=\"js/sidebarmenu.js\"></script>\n");
      out.write("            <script src=\"js/app.min.js\"></script>\n");
      out.write("            <script src=\"js/libs/apexcharts/dist/apexcharts.min.js\"></script>\n");
      out.write("            <script src=\"js/libs/simplebar/dist/simplebar.js\"></script>\n");
      out.write("            <script src=\"js/dashboard.js\"></script>\n");
      out.write("            <script src=\"js/admin.js\"></script>\n");
      out.write("            ");
if (orderDetailList != null) {
                    orderDetailList.clear();
                    session.removeAttribute("SortedOrderList");
                }
            
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
