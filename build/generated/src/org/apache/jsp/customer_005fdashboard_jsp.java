package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customer_005fdashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\t<title>User Dashboard</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\" integrity=\"sha512-pZsRrY5+1zTtGYUy9V7Vv2tWT5ImN9hH8W4uXnDT6KX/kdux3AvXCJBFvl9pJ0H9QqZsUooCfR6NsIj+vklg2w==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/customer_dashboard.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<nav class=\"navbar\">\r\n");
      out.write("\t\t\t<a href=\"#\" class=\"logo\">User Dashboard</a>\r\n");
      out.write("\t\t\t<div class=\"menu-toggle\">\r\n");
      out.write("\t\t\t\t<i class=\"fas fa-bars\"></i>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<ul class=\"nav-menu\" >\r\n");
      out.write("                            <form action=\"MainController\" method=\"POST\">\r\n");
      out.write("\t\t\t\t<li><a href=\"order_history.jsp\">Order History</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"user_info.jsp\">Profile</a></li>\r\n");
      out.write("                                <li><a href=\"favorite_product.jsp\">Favorite Product</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"UpdatePassword\">Update Password</a></li>\r\n");
      out.write("                                <li><input id =\"Logout\" type=\"submit\" name=\"btAction\" value=\"Logout\"></li>\r\n");
      out.write("                            </form>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("\t<main class=\"container\">\r\n");
      out.write("\t\t<section class=\"card welcome-card\">\r\n");
      out.write("\t\t\t<h1>Welcome back, John!</h1>\r\n");
      out.write("\t\t\t<p>Here's what's been happening with your account:</p>\r\n");
      out.write("\t\t\t<ul class=\"summary-list\">\r\n");
      out.write("\t\t\t\t<li><i class=\"fas fa-chart-line\"></i> Your sales have increased by 25%.</li>\r\n");
      out.write("\t\t\t\t<li><i class=\"fas fa-wallet\"></i> You've earned $500 in commissions this month.</li>\r\n");
      out.write("\t\t\t\t<li><i class=\"fas fa-users\"></i> You have 10 new followers on social media.</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t<section class=\"card stats-card\">\r\n");
      out.write("\t\t\t<h2>Your Stats</h2>\r\n");
      out.write("\t\t\t<div class=\"stats-row\">\r\n");
      out.write("\t\t\t\t<div class=\"stat-box\">\r\n");
      out.write("\t\t\t\t\t<div class=\"icon\"><i class=\"fas fa-shopping-cart\"></i></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"stat-info\">\r\n");
      out.write("\t\t\t\t\t\t<p class=\"value\">245</p>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"label\">Orders Placed</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"stat-box\">\r\n");
      out.write("\t\t\t\t\t<div class=\"icon\"><i class=\"fas fa-dollar-sign\"></i></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"stat-info\">\r\n");
      out.write("\t\t\t\t\t\t<p class=\"value\">$12,345</p>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"label\">Total Revenue</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"stat-box\">\r\n");
      out.write("\t\t\t\t\t<div class=\"icon\"><i class=\"fas fa-users\"></i></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"stat-info\">\r\n");
      out.write("\t\t\t\t\t\t<p class=\"value\">1,234</p>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"label\">Customers</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"stat-box\">\r\n");
      out.write("\t\t\t\t\t<div class=\"icon\"><i class=\"fas fa-star\"></i></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"stat-info\">\r\n");
      out.write("\t\t\t\t\t\t<p class=\"value\">4.9</p>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"label\">Customer Rating</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t<section class=\"card activity-card\">\r\n");
      out.write("\t\t\t<h2>Your Recent Activity</h2>\r\n");
      out.write("\t\t\t<ul class=\"activity-list\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<i class=\"fas fa-shopping-cart\"></i>\r\n");
      out.write("\t\t\t\t\t<p class=\"activity-desc\">You placed an order for <strong>3 items</strong> on May 28th.</p>\r\n");
      out.write("\t\t\t\t\t<span class=\"activity-date\">May 28th, 2023</span>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<i class=\"fas fa-star\"></i>\r\n");
      out.write("\t\t\t\t\t<p class=\"activity-desc\">You left a review for <strong>Product Name</strong>.</p>\r\n");
      out.write("\t\t\t\t\t<span class=\"activity-date\">May 27th, 2023</span>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<i class=\"fas fa-file-alt\"></i>\r\n");
      out.write("\t\t\t\t\t<p class=\"activity-desc\">You updated your profile information.</p>\r\n");
      out.write("\t\t\t\t\t<span class=\"activity-date\">May 26");
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
