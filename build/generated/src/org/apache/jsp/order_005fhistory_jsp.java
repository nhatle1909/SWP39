package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class order_005fhistory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Order History</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"test/test_1.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<header>\n");
      out.write("\t\t<nav class=\"navbar\">\n");
      out.write("\t\t\t<div class=\"logo\">\n");
      out.write("\t\t\t\t<a href=\"#\">\n");
      out.write("                                    <img src=\"images/logo-removebg-preview.png\" alt=\"Company Logo\">\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<ul class=\"nav-links\">\n");
      out.write("\t\t\t\t<li><a href=\"#\">Home</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">About Us</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Services</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Contact Us</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\" class=\"active\">Order History</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</nav>\n");
      out.write("\t</header>\n");
      out.write("\t<main class=\"container\">\n");
      out.write("\t\t<h1>Order History</h1>\n");
      out.write("\t\t<table>\n");
      out.write("\t\t\t<thead>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th>Order No.</th>\n");
      out.write("\t\t\t\t\t<th>Order Date</th>\n");
      out.write("\t\t\t\t\t<th>Total Amount</th>\n");
      out.write("\t\t\t\t\t<th>Status</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</thead>\n");
      out.write("\t\t\t<tbody>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>001</td>\n");
      out.write("\t\t\t\t\t<td>01/01/2023</td>\n");
      out.write("\t\t\t\t\t<td>$200.00</td>\n");
      out.write("\t\t\t\t\t<td><span class=\"status delivered\">Delivered</span></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>002</td>\n");
      out.write("\t\t\t\t\t<td>02/15/2023</td>\n");
      out.write("\t\t\t\t\t<td>$150.00</td>\n");
      out.write("\t\t\t\t\t<td><span class=\"status in-transit\">In Transit</span></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>003</td>\n");
      out.write("\t\t\t\t\t<td>03/30/2023</td>\n");
      out.write("\t\t\t\t\t<td>$75.00</td>\n");
      out.write("\t\t\t\t\t<td><span class=\"status cancelled\">Cancelled</span></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</tbody>\n");
      out.write("\t\t</table>\n");
      out.write("\t\t<div class=\"pagination\">\n");
      out.write("\t\t\t<a href=\"#\" class=\"disabled\">&#171;</a>\n");
      out.write("\t\t\t<a href=\"#\" class=\"active\">1</a>\n");
      out.write("\t\t\t<a href=\"#\">2</a>\n");
      out.write("\t\t\t<a href=\"#\">3</a>\n");
      out.write("\t\t\t<a href=\"#\">4</a>\n");
      out.write("\t\t\t<a href=\"#\">5</a>\n");
      out.write("\t\t\t<a href=\"#\">&#187;</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</main>\n");
      out.write("\t<footer class=\"footer\">\n");
      out.write("\t\t<p>&copy; 2023 Company Name.</p>\n");
      out.write("\t</footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
