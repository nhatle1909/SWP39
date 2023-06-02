package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.HttpSession;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"viewport\" content=\"initial-scale=1, maximum-scale=1\">\n");
      out.write("    <title>BIFO shop</title>\n");
      out.write("    <meta name=\"keywords\" content=\"\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style_login.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("</head>\n");
      out.write("<body class=\"main-layout inner_page\">\n");
      out.write("    ");
  String role = (String) session.getAttribute("txtRole");
        if (role != null) {
            if (role.equals("CUSTOMER")) {
                response.sendRedirect("customer_dashboard.html");
            } else if (role.equals("ADMIN")) {
                response.sendRedirect("admin.jsp");
            } else if (role.equals("STAFF")) {
                response.sendRedirect("staff.jsp");
            }
        } else {
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <!-- loader  -->\n");
      out.write("    <div class=\"loader_bg\">\n");
      out.write("        <div class=\"loader\"><img src=\"images/loading.gif\" alt=\"\" /></div>\n");
      out.write("    </div>\n");
      out.write("    <!-- end loader -->\n");
      out.write("    <div id=\"mySidepanel\" class=\"sidepanel\">\n");
      out.write("        <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">×</a>\n");
      out.write("        <a href=\"index.html\">Home</a>\n");
      out.write("        <a class=\"active\" href=\"about.html\">About</a>\n");
      out.write("        <a href=\"birds.html\">Our products</a>\n");
      out.write("        <a href=\"items_page.html\">Shop</a>\n");
      out.write("        <a href=\"contact.html\">Contact</a>\n");
      out.write("    </div>\n");
      out.write("    <!-- header -->\n");
      out.write("    <header>\n");
      out.write("        <!-- header inner -->\n");
      out.write("        <div class=\"head-top\">\n");
      out.write("            <div class=\"container-fluid\" style=\"width: 100%; padding-right: 30px; padding-left: 30px; margin-top: auto; margin-bottom: auto;\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\" style=\"padding: 0;\">\n");
      out.write("                        <div class=\"logo\">\n");
      out.write("                            <a href=\"index.html\"><img src=\"images/logo-removebg-preview.png\" /></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-9\" style=\"padding: 0; margin-top: 35px;\">\n");
      out.write("                        <ul class=\"email text_align_right\">\n");
      out.write("                            <li class=\"d_none\"><i class=\"fa fa-search\" style=\"cursor: pointer;\" aria-hidden=\"true\"></i></li>\n");
      out.write("                            <li> <button class=\"openbtn\" onclick=\"openNav()\"><img src=\"images/menu_btn.png\"></button></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("    <!--end header-->\n");
      out.write("    <!--Loginform-->\n");
      out.write("    <form action=\"MainController\" method=\"POST\">\n");
      out.write("        <div class=\"box-form\">\n");
      out.write("            <div class=\"left\">\n");
      out.write("                <div class=\"overlay\">\n");
      out.write("                    <h1>Welcome</h1>\n");
      out.write("                    <span>\n");
      out.write("                        <p>Login with social media</p>\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-facebook\" aria-hidden=\"true\">Login with Facebook</i></a>\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i> Login with Twitter</a>\n");
      out.write("                    </span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"right\">\n");
      out.write("                <h5>Login</h5>\n");
      out.write("                <p>Don't have an account? <a href=\"signup1.html\">Create Your Account</a> it takes less than a minute</p>\n");
      out.write("                <div class=\"inputs\">\n");
      out.write("                    <input type=\"text\" name=\"txtMail\" placeholder=\"Mail\">\n");
      out.write("                    <br>\n");
      out.write("                    <input type=\"password\" name=\"txtPassword\" placeholder=\"Password\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"remember-me--forget-password\">\n");
      out.write("\n");
      out.write("                    <label>\n");
      out.write("                        <input type=\"checkbox\" checked=\"checked\" name=\"item\"/>\n");
      out.write("                        <span class=\"text-checkbox\">Remember me</span>\n");
      out.write("                    </label>\n");
      out.write("\n");
      out.write("                    <a href=\"verify.jsp\">Forget password?</a>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <input id=\"LoginButton\" type=\"submit\" name=\"btAction\" value=\"Login\">\n");
      out.write("                <p>Want to return to the homepage? <a href=\"index.html\">Press Here</a></p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</form>\n");
      out.write("<!--end loginform-->\n");
      out.write("<!-- Javascript files-->\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.bundle.min.js\"></script>\n");
      out.write("<script src=\"js/jquery-3.0.0.min.js\"></script>\n");
      out.write("<script src=\"js/custom.js\"></script>\n");
      out.write("<script>\n");
      out.write("</script>\n");
}
      out.write("\n");
      out.write("</body>\n");
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
