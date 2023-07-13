package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Add_002dDeleAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <title>Modernize Free</title>\n");
      out.write("  <!-- <link rel=\"shortcut icon\" type=\"image/png\" href=\"../assets/images/logos/favicon.png\" /> -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/styles.min.css\" />\n");
      out.write("</head>\n");
  String role = (String) session.getAttribute("txtRole");
        if (role != null) {
             if (role.equals("ADMIN")) {
              
      out.write("\n");
      out.write("<body>\n");
      out.write("  <!--  Body Wrapper -->\n");
      out.write("  <div class=\"page-wrapper\" id=\"main-wrapper\" data-layout=\"vertical\" data-navbarbg=\"skin6\" data-sidebartype=\"full\"\n");
      out.write("    data-sidebar-position=\"fixed\" data-header-position=\"fixed\">\n");
      out.write("    <!-- Sidebar Start -->\n");
      out.write("    <aside class=\"left-sidebar\">\n");
      out.write("      <!-- Sidebar scroll-->\n");
      out.write("      <div>\n");
      out.write("        <div class=\"brand-logo d-flex align-items-center justify-content-between\">\n");
      out.write("          <a href=\"index.html\" class=\"text-nowrap logo-img\">\n");
      out.write("            <img src=\"images/logo-removebg-preview.png\" width=\"180\" alt=\"\" />\n");
      out.write("          </a>\n");
      out.write("          <div class=\"close-btn d-xl-none d-block sidebartoggler cursor-pointer\" id=\"sidebarCollapse\">\n");
      out.write("            <i class=\"ti ti-x fs-8\"></i>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Sidebar navigation-->\n");
      out.write("        <nav class=\"sidebar-nav scroll-sidebar\" data-simplebar=\"\">\n");
      out.write("          <ul id=\"sidebarnav\">\n");
      out.write("            <li class=\"nav-small-cap\">\n");
      out.write("              <i class=\"ti ti-dots nav-small-cap-icon fs-4\"></i>\n");
      out.write("              <span class=\"hide-menu\">Home</span>\n");
      out.write("            </li>\n");
      out.write("              <li class=\"sidebar-item\">\n");
      out.write("              <a class=\"sidebar-link\" href=\"AdminDashboard.jsp\" aria-expanded=\"false\">\n");
      out.write("                <span>\n");
      out.write("                  <i class=\"ti ti-layout-dashboard\"></i>\n");
      out.write("                </span>\n");
      out.write("                <span class=\"hide-menu\">Dashboard</span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-small-cap\">\n");
      out.write("              <i class=\"ti ti-dots nav-small-cap-icon fs-4\"></i>\n");
      out.write("              <span class=\"hide-menu\">UI COMPONENTS</span>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"sidebar-item\">\n");
      out.write("              <a class=\"sidebar-link\" href=\"AccountList.jsp\" aria-expanded=\"false\">\n");
      out.write("                <span>\n");
      out.write("                  <i class=\"ti ti-user\"></i>\n");
      out.write("                </span>\n");
      out.write("                <span class=\"hide-menu\">Account List</span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"sidebar-item\">\n");
      out.write("              <a class=\"sidebar-link\" href=\"Add-DeleAccount.jsp\" aria-expanded=\"false\">\n");
      out.write("                <span>\n");
      out.write("                  <i class=\"ti ti-file-description\"></i>\n");
      out.write("                </span>\n");
      out.write("                <span class=\"hide-menu\">Add & Delete Staff</span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            \n");
      out.write("        </nav>\n");
      out.write("        <!-- End Sidebar navigation -->\n");
      out.write("      </div>\n");
      out.write("      <!-- End Sidebar scroll-->\n");
      out.write("    </aside>\n");
      out.write("    <!--  Sidebar End -->\n");
      out.write("    <!--  Main wrapper -->\n");
      out.write("    <div class=\"body-wrapper\">\n");
      out.write("      <!--  Header Start -->\n");
      out.write("      <header class=\"app-header\">\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light\">\n");
      out.write("          <ul class=\"navbar-nav\">\n");
      out.write("            <li class=\"nav-item d-block d-xl-none\">\n");
      out.write("              <a class=\"nav-link sidebartoggler nav-icon-hover\" id=\"headerCollapse\" href=\"javascript:void(0)\">\n");
      out.write("                <i class=\"ti ti-menu-2\"></i>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link nav-icon-hover\" href=\"javascript:void(0)\">\n");
      out.write("                <i class=\"ti ti-bell-ringing\"></i>\n");
      out.write("                <div class=\"notification bg-primary rounded-circle\"></div>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("          <div class=\"navbar-collapse justify-content-end px-0\" id=\"navbarNav\">\n");
      out.write("            <ul class=\"navbar-nav flex-row ms-auto align-items-center justify-content-end\">\n");
      out.write("              <a href=\"https://adminmart.com/product/modernize-free-bootstrap-admin-dashboard/\" target=\"_blank\" class=\"btn btn-primary\">Download Free</a>\n");
      out.write("              <li class=\"nav-item dropdown\">\n");
      out.write("                <a class=\"nav-link nav-icon-hover\" href=\"javascript:void(0)\" id=\"drop2\" data-bs-toggle=\"dropdown\"\n");
      out.write("                  aria-expanded=\"false\">\n");
      out.write("                  <img src=\"#\" alt=\"\" width=\"35\" height=\"35\" class=\"rounded-circle\">\n");
      out.write("                </a>\n");
      out.write("                <div class=\"dropdown-menu dropdown-menu-end dropdown-menu-animate-up\" aria-labelledby=\"drop2\">\n");
      out.write("                  <div class=\"message-body\">\n");
      out.write("                    <a href=\"javascript:void(0)\" class=\"d-flex align-items-center gap-2 dropdown-item\">\n");
      out.write("                      <i class=\"ti ti-user fs-6\"></i>\n");
      out.write("                      <p class=\"mb-0 fs-3\">My Profile</p>\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"javascript:void(0)\" class=\"d-flex align-items-center gap-2 dropdown-item\">\n");
      out.write("                      <i class=\"ti ti-mail fs-6\"></i>\n");
      out.write("                      <p class=\"mb-0 fs-3\">My Account</p>\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"javascript:void(0)\" class=\"d-flex align-items-center gap-2 dropdown-item\">\n");
      out.write("                      <i class=\"ti ti-list-check fs-6\"></i>\n");
      out.write("                      <p class=\"mb-0 fs-3\">My Task</p>\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"./authentication-login.html\" class=\"btn btn-outline-primary mx-3 mt-2 d-block\">Logout</a>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </nav>\n");
      out.write("      </header>\n");
      out.write("      <!--  Header End -->\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("          <div class=\"card\">\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("              <h5 class=\"card-title fw-semibold mb-4\">Add Staff</h5>\n");
      out.write("              <div class=\"card\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <form action=\"MainController\" method=\"Post\">\n");
      out.write("  \n");
      out.write("                      <div class=\"mb-3\">\n");
      out.write("                        <label for=\"exampleInputName\" class=\"form-label\">Username</label>\n");
      out.write("                        <input type=\"text\" name = \"txtUsername\"class=\"form-control\" id=\"exampleInputName\">\n");
      out.write("                      </div>\n");
      out.write("  \n");
      out.write("                      <div class=\"mb-3\">\n");
      out.write("                        <label for=\"exampleInputPassword1\" class=\"form-label\">Password</label>\n");
      out.write("                        <input type=\"text\" name=\"txtPassword\" class=\"form-control\" id=\"exampleInputPassword1\">\n");
      out.write("                      </div>\n");
      out.write("                      \n");
      out.write("                      <div class=\"mb-3\">\n");
      out.write("                        <label for=\"exampleInputQuantity\" class=\"form-label\">Email</label>\n");
      out.write("                        <input type=\"text\" name=\"txtEmail\"class=\"form-control\" id=\"exampleInputEmail1\">\n");
      out.write("                      </div>\n");
      out.write("  \n");
      out.write("                      <div class=\"mb-3\">\n");
      out.write("                        <label for=\"exampleInputDes\" class=\"form-label\">Address</label>\n");
      out.write("                        <input type=\"text\" name=\"txtAddress\" class=\"form-control\" id=\"exampleInputDes\">\n");
      out.write("                      </div>\n");
      out.write("  \n");
      out.write("                      <div class=\"mb-3\">\n");
      out.write("                        <label for=\"exampleInputBird\" class=\"form-label\">PhoneNumber</label>\n");
      out.write("                        <input type=\"text\" name=\"txtPhoneNumber\" class=\"form-control\" id=\"exampleInputBird\">\n");
      out.write("                      </div>\n");
      out.write("\n");
      out.write("                    <input type=\"submit\" name=\"btAction\" value =\"Add Staff Account\" class=\"btn btn-primary\">\n");
      out.write("\n");
      out.write("                  </form>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <h5 class=\"card-title fw-semibold mb-4\">Delete Staff</h5>\n");
      out.write("              <div class=\"card mb-0\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <form action=\"MainController\" method=\"Post\">\n");
      out.write("                    <fieldset enable>\n");
      out.write("                        <div class=\"mb-3\">\n");
      out.write("                            <label for=\"exampleInputID\" class=\"form-label\">User_ID</label>\n");
      out.write("                            <input type=\"text\" name=\"txtUserID\" class=\"form-control\" id=\"inputID\">\n");
      out.write("                          </div>\n");
      out.write("                      <input type=\"submit\" value=\"Delete Staff\" name=\"btAction\" class=\"btn btn-primary\">\n");
      out.write("                    </fieldset>\n");
      out.write("                  </form>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <script src=\"js/libs/jquery/dist/jquery.min.js\"></script>\n");
      out.write("  <script src=\"js/libs/bootstrap/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("  <script src=\"js/sidebarmenu.js\"></script>\n");
      out.write("  <script src=\"js/app.min.js\"></script>\n");
      out.write("  <script src=\"js/libs/simplebar/dist/simplebar.js\"></script>\n");
      out.write("   ");
 }}else {
                response.sendRedirect("login.jsp");
                }
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
