package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import SQLCommand.DAO;
import Utility.UserDTO;
import javax.servlet.http.HttpSession;

public final class AccountList_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>BIFO</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styles.min.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/accountcontroller.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            DAO sql = new DAO();
            sql.showAllUser();
            List<UserDTO> userDTO = sql.getListAccount(); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!--  Body Wrapper -->\r\n");
      out.write("        <div class=\"page-wrapper\" id=\"main-wrapper\" data-layout=\"vertical\" data-navbarbg=\"skin6\" data-sidebartype=\"full\"\r\n");
      out.write("             data-sidebar-position=\"fixed\" data-header-position=\"fixed\">\r\n");
      out.write("            <!-- Sidebar Start -->\r\n");
      out.write("            <aside class=\"left-sidebar\">\r\n");
      out.write("                <!-- Sidebar scroll-->\r\n");
      out.write("                <div>\r\n");
      out.write("                    <div class=\"brand-logo d-flex align-items-center justify-content-between\">\r\n");
      out.write("                        <a href=\"index.html\" class=\"text-nowrap logo-img\">\r\n");
      out.write("\r\n");
      out.write("                            <img src=\"images/logo-removebg-preview.png\" width=\"180\" alt=\"\" />\r\n");
      out.write("\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div class=\"close-btn d-xl-none d-block sidebartoggler cursor-pointer\" id=\"sidebarCollapse\">\r\n");
      out.write("                            <i class=\"ti ti-x fs-8\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- Sidebar navigation-->\r\n");
      out.write("                    <nav class=\"sidebar-nav scroll-sidebar\" data-simplebar=\"\">\r\n");
      out.write("                        <ul id=\"sidebarnav\">\r\n");
      out.write("                            <li class=\"nav-small-cap\">\r\n");
      out.write("                                <i class=\"ti ti-dots nav-small-cap-icon fs-4\"></i>\r\n");
      out.write("                                <span class=\"hide-menu\">Home</span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"sidebar-item\">\r\n");
      out.write("                                <a class=\"sidebar-link\" href=\"AdminDashboard.jsp\" aria-expanded=\"false\">\r\n");
      out.write("                                    <span>\r\n");
      out.write("                                        <i class=\"ti ti-layout-dashboard\"></i>\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                    <span class=\"hide-menu\">Dashboard</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-small-cap\">\r\n");
      out.write("                                <i class=\"ti ti-dots nav-small-cap-icon fs-4\"></i>\r\n");
      out.write("                                <span class=\"hide-menu\">UI COMPONENTS</span>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"sidebar-item\">\r\n");
      out.write("                                <a class=\"sidebar-link\" href=\"AccountController.jsp\" aria-expanded=\"false\">\r\n");
      out.write("                                    <span>\r\n");
      out.write("                                        <i class=\"ti ti-user\"></i>\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                    <span class=\"hide-menu\">Account Controller</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"sidebar-item\">\r\n");
      out.write("                                <a class=\"sidebar-link\" href=\"Add-DeleAccount.jsp\" aria-expanded=\"false\">\r\n");
      out.write("                                    <span>\r\n");
      out.write("                                        <i class=\"ti ti-file-description\"></i>\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                    <span class=\"hide-menu\">Add & Delete Staff</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                    <!-- End Sidebar navigation -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- End Sidebar scroll-->\r\n");
      out.write("            </aside>\r\n");
      out.write("            <!--  Sidebar End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!--  Main wrapper -->\r\n");
      out.write("            <div class=\"body-wrapper\">\r\n");
      out.write("                <div class=\"app-container\">\r\n");
      out.write("                    <div class=\"app-content\">\r\n");
      out.write("                        <div class=\"app-content-header\">\r\n");
      out.write("                            <h1 class=\"app-content-headerText\">Account List</h1>\r\n");
      out.write("                            <button class=\"mode-switch\" title=\"Switch Theme\">\r\n");
      out.write("                                <svg class=\"moon\" fill=\"none\" stroke=\"currentColor\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\">\r\n");
      out.write("                                <defs></defs>\r\n");
      out.write("                                <path d=\"M21 12.79A9 9 0 1111.21 3 7 7 0 0021 12.79z\"></path>\r\n");
      out.write("                                </svg>\r\n");
      out.write("                            </button>\r\n");
      out.write("                            <!-- <button class=\"app-content-headerButton\">Add Product</button> -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"app-content-actions\">\r\n");
      out.write("                            <input class=\"search-bar\" placeholder=\"Search...\" type=\"text\">\r\n");
      out.write("                            <div class=\"app-content-actions-wrapper\">\r\n");
      out.write("                                <div class=\"filter-button-wrapper\">\r\n");
      out.write("                                    <button class=\"action-button filter jsFilter\"><span>Filter</span><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-filter\"><polygon points=\"22 3 2 3 10 12.46 10 19 14 21 14 12.46 22 3\"/></svg></button>\r\n");
      out.write("                                    <div class=\"filter-menu\">\r\n");
      out.write("                                        <label>Category</label>\r\n");
      out.write("                                        <select>\r\n");
      out.write("                                            <option>All</option>\r\n");
      out.write("                                            <option>Staff</option>                 \r\n");
      out.write("                                            <option>User</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                        <label>Status</label>\r\n");
      out.write("                                        <select>\r\n");
      out.write("                                            <option>All Status</option>\r\n");
      out.write("                                            <option>Active</option>\r\n");
      out.write("                                            <option>Disabled</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                        <div class=\"filter-menu-buttons\">\r\n");
      out.write("                                            <button class=\"filter-button reset\">\r\n");
      out.write("                                                Reset\r\n");
      out.write("                                            </button>\r\n");
      out.write("                                            <button class=\"filter-button apply\">\r\n");
      out.write("                                                Apply\r\n");
      out.write("                                            </button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <button class=\"action-button list active\" title=\"List View\">\r\n");
      out.write("                                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-list\"><line x1=\"8\" y1=\"6\" x2=\"21\" y2=\"6\"/><line x1=\"8\" y1=\"12\" x2=\"21\" y2=\"12\"/><line x1=\"8\" y1=\"18\" x2=\"21\" y2=\"18\"/><line x1=\"3\" y1=\"6\" x2=\"3.01\" y2=\"6\"/><line x1=\"3\" y1=\"12\" x2=\"3.01\" y2=\"12\"/><line x1=\"3\" y1=\"18\" x2=\"3.01\" y2=\"18\"/></svg>\r\n");
      out.write("                                </button>\r\n");
      out.write("                                <button class=\"action-button grid\" title=\"Grid View\">\r\n");
      out.write("                                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-grid\"><rect x=\"3\" y=\"3\" width=\"7\" height=\"7\"/><rect x=\"14\" y=\"3\" width=\"7\" height=\"7\"/><rect x=\"14\" y=\"14\" width=\"7\" height=\"7\"/><rect x=\"3\" y=\"14\" width=\"7\" height=\"7\"/></svg>\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"products-area-wrapper tableView\">\r\n");
      out.write("                            <div class=\"products-header\">\r\n");
      out.write("                                <div class=\"product-cell image\">\r\n");
      out.write("                                    Account ID\r\n");
      out.write("                                    <button class=\"sort-button\">\r\n");
      out.write("                                        <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" viewBox=\"0 0 512 512\"><path fill=\"currentColor\" d=\"M496.1 138.3L375.7 17.9c-7.9-7.9-20.6-7.9-28.5 0L226.9 138.3c-7.9 7.9-7.9 20.6 0 28.5 7.9 7.9 20.6 7.9 28.5 0l85.7-85.7v352.8c0 11.3 9.1 20.4 20.4 20.4 11.3 0 20.4-9.1 20.4-20.4V81.1l85.7 85.7c7.9 7.9 20.6 7.9 28.5 0 7.9-7.8 7.9-20.6 0-28.5zM287.1 347.2c-7.9-7.9-20.6-7.9-28.5 0l-85.7 85.7V80.1c0-11.3-9.1-20.4-20.4-20.4-11.3 0-20.4 9.1-20.4 20.4v352.8l-85.7-85.7c-7.9-7.9-20.6-7.9-28.5 0-7.9 7.9-7.9 20.6 0 28.5l120.4 120.4c7.9 7.9 20.6 7.9 28.5 0l120.4-120.4c7.8-7.9 7.8-20.7-.1-28.5z\"/></svg>\r\n");
      out.write("                                    </button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"product-cell category\">Username<button class=\"sort-button\">\r\n");
      out.write("                                        <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" viewBox=\"0 0 512 512\"><path fill=\"currentColor\" d=\"M496.1 138.3L375.7 17.9c-7.9-7.9-20.6-7.9-28.5 0L226.9 138.3c-7.9 7.9-7.9 20.6 0 28.5 7.9 7.9 20.6 7.9 28.5 0l85.7-85.7v352.8c0 11.3 9.1 20.4 20.4 20.4 11.3 0 20.4-9.1 20.4-20.4V81.1l85.7 85.7c7.9 7.9 20.6 7.9 28.5 0 7.9-7.8 7.9-20.6 0-28.5zM287.1 347.2c-7.9-7.9-20.6-7.9-28.5 0l-85.7 85.7V80.1c0-11.3-9.1-20.4-20.4-20.4-11.3 0-20.4 9.1-20.4 20.4v352.8l-85.7-85.7c-7.9-7.9-20.6-7.9-28.5 0-7.9 7.9-7.9 20.6 0 28.5l120.4 120.4c7.9 7.9 20.6 7.9 28.5 0l120.4-120.4c7.8-7.9 7.8-20.7-.1-28.5z\"/></svg>\r\n");
      out.write("                                    </button></div>\r\n");
      out.write("                                <div class=\"product-cell status-cell\">Email<button class=\"sort-button\">\r\n");
      out.write("                                        <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" viewBox=\"0 0 512 512\"><path fill=\"currentColor\" d=\"M496.1 138.3L375.7 17.9c-7.9-7.9-20.6-7.9-28.5 0L226.9 138.3c-7.9 7.9-7.9 20.6 0 28.5 7.9 7.9 20.6 7.9 28.5 0l85.7-85.7v352.8c0 11.3 9.1 20.4 20.4 20.4 11.3 0 20.4-9.1 20.4-20.4V81.1l85.7 85.7c7.9 7.9 20.6 7.9 28.5 0 7.9-7.8 7.9-20.6 0-28.5zM287.1 347.2c-7.9-7.9-20.6-7.9-28.5 0l-85.7 85.7V80.1c0-11.3-9.1-20.4-20.4-20.4-11.3 0-20.4 9.1-20.4 20.4v352.8l-85.7-85.7c-7.9-7.9-20.6-7.9-28.5 0-7.9 7.9-7.9 20.6 0 28.5l120.4 120.4c7.9 7.9 20.6 7.9 28.5 0l120.4-120.4c7.8-7.9 7.8-20.7-.1-28.5z\"/></svg>\r\n");
      out.write("                                    </button></div>\r\n");
      out.write("                                <div class=\"product-cell sales\">Address<button class=\"sort-button\">\r\n");
      out.write("                                        <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" viewBox=\"0 0 512 512\"><path fill=\"currentColor\" d=\"M496.1 138.3L375.7 17.9c-7.9-7.9-20.6-7.9-28.5 0L226.9 138.3c-7.9 7.9-7.9 20.6 0 28.5 7.9 7.9 20.6 7.9 28.5 0l85.7-85.7v352.8c0 11.3 9.1 20.4 20.4 20.4 11.3 0 20.4-9.1 20.4-20.4V81.1l85.7 85.7c7.9 7.9 20.6 7.9 28.5 0 7.9-7.8 7.9-20.6 0-28.5zM287.1 347.2c-7.9-7.9-20.6-7.9-28.5 0l-85.7 85.7V80.1c0-11.3-9.1-20.4-20.4-20.4-11.3 0-20.4 9.1-20.4 20.4v352.8l-85.7-85.7c-7.9-7.9-20.6-7.9-28.5 0-7.9 7.9-7.9 20.6 0 28.5l120.4 120.4c7.9 7.9 20.6 7.9 28.5 0l120.4-120.4c7.8-7.9 7.8-20.7-.1-28.5z\"/></svg>\r\n");
      out.write("                                    </button></div>\r\n");
      out.write("                                <div class=\"product-cell stock\">Phone Number<button class=\"sort-button\">\r\n");
      out.write("                                        <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" viewBox=\"0 0 512 512\"><path fill=\"currentColor\" d=\"M496.1 138.3L375.7 17.9c-7.9-7.9-20.6-7.9-28.5 0L226.9 138.3c-7.9 7.9-7.9 20.6 0 28.5 7.9 7.9 20.6 7.9 28.5 0l85.7-85.7v352.8c0 11.3 9.1 20.4 20.4 20.4 11.3 0 20.4-9.1 20.4-20.4V81.1l85.7 85.7c7.9 7.9 20.6 7.9 28.5 0 7.9-7.8 7.9-20.6 0-28.5zM287.1 347.2c-7.9-7.9-20.6-7.9-28.5 0l-85.7 85.7V80.1c0-11.3-9.1-20.4-20.4-20.4-11.3 0-20.4 9.1-20.4 20.4v352.8l-85.7-85.7c-7.9-7.9-20.6-7.9-28.5 0-7.9 7.9-7.9 20.6 0 28.5l120.4 120.4c7.9 7.9 20.6 7.9 28.5 0l120.4-120.4c7.8-7.9 7.8-20.7-.1-28.5z\"/></svg>\r\n");
      out.write("                                    </button></div>\r\n");
      out.write("                                <div class=\"product-cell stock\">Role<button class=\"sort-button\">\r\n");
      out.write("                                        <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" viewBox=\"0 0 512 512\"><path fill=\"currentColor\" d=\"M496.1 138.3L375.7 17.9c-7.9-7.9-20.6-7.9-28.5 0L226.9 138.3c-7.9 7.9-7.9 20.6 0 28.5 7.9 7.9 20.6 7.9 28.5 0l85.7-85.7v352.8c0 11.3 9.1 20.4 20.4 20.4 11.3 0 20.4-9.1 20.4-20.4V81.1l85.7 85.7c7.9 7.9 20.6 7.9 28.5 0 7.9-7.8 7.9-20.6 0-28.5zM287.1 347.2c-7.9-7.9-20.6-7.9-28.5 0l-85.7 85.7V80.1c0-11.3-9.1-20.4-20.4-20.4-11.3 0-20.4 9.1-20.4 20.4v352.8l-85.7-85.7c-7.9-7.9-20.6-7.9-28.5 0-7.9 7.9-7.9 20.6 0 28.5l120.4 120.4c7.9 7.9 20.6 7.9 28.5 0l120.4-120.4c7.8-7.9 7.8-20.7-.1-28.5z\"/></svg>\r\n");
      out.write("                                    </button></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            ");
if (userDTO != null && !userDTO.isEmpty()) {
                                    for (UserDTO users : userDTO) {
      out.write("\r\n");
      out.write("                            <div class=\"products-row\">\r\n");
      out.write("                                <button class=\"cell-more-button\">\r\n");
      out.write("                                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"18\" height=\"18\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-more-vertical\"><circle cx=\"12\" cy=\"12\" r=\"1\"/><circle cx=\"12\" cy=\"5\" r=\"1\"/><circle cx=\"12\" cy=\"19\" r=\"1\"/></svg>\r\n");
      out.write("                                </button>\r\n");
      out.write("                                <div class=\"product-cell image\">\r\n");
      out.write("                                    <img src=\"https://images.unsplash.com/photo-1555041469-a586c61ea9bc?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1950&q=80\" alt=\"product\">\r\n");
      out.write("                                    <span>");
      out.print(users.getUser_id());
      out.write("</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"product-cell category\"><span class=\"cell-label\">Category:</span>");
      out.print(users.getUsername());
      out.write("</div>\r\n");
      out.write("                                <div class=\"product-cell sales\"><span class=\"cell-label\">Sales:</span>");
      out.print(users.getMail());
      out.write("</div>\r\n");
      out.write("                                <div class=\"product-cell sales\"><span class=\"cell-label\">Sales:</span>");
      out.print(users.getAddress());
      out.write("</div>\r\n");
      out.write("                                <div class=\"product-cell stock\"><span class=\"cell-label\">Stock:</span>");
      out.print(users.getPhone_number());
      out.write("</div>\r\n");
      out.write("                                <div class=\"product-cell price\"><span class=\"cell-label\">Price:</span>");
      out.print(users.getRole());
      out.write("</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            ");
}
                                }
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <script src=\"js/libs/jquery/dist/jquery.min.js\"></script>\r\n");
      out.write("            <script src=\"js/libs/bootstrap/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("            <script src=\"js/sidebarmenu.js\"></script>\r\n");
      out.write("            <script src=\"js/app.min.js\"></script>\r\n");
      out.write("            <script src=\"js/libs/apexcharts/dist/apexcharts.min.js\"></script>\r\n");
      out.write("            <script src=\"js/libs/simplebar/dist/simplebar.js\"></script>\r\n");
      out.write("            <script src=\"js/dashboard.js\"></script>\r\n");
      out.write("            <script src=\"js/admin.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
