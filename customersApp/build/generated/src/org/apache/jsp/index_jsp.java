package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/includes/header.jsp");
    _jspx_dependants.add("/includes/menu.jsp");
    _jspx_dependants.add("/includes/footer.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Customer Database</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\"\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrap\">\n");
      out.write("\n");
      out.write("            ");
      out.write("<div class=\"header\">\n");
      out.write("\t\t<div class=\"headerImg\">\n");
      out.write("\t\t\t<img src=\"images/customers.png\" width=\"150px\" />\n");
      out.write("\t\t</div>\t\t\n");
      out.write("\t\t<div class=\"headerText\">\n");
      out.write("\t\t<h1> Database of Our Customers </h1>\n");
      out.write("\t\t</div>\t\t\n");
      out.write("\t\t\t\t<br clear=\"all\">\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");
      out.write("<div class=\"menu\">\n");
      out.write("<div class=\"navcontainer\"> <!-- menu div - Fat Erik's Pipelist -->\n");
      out.write("    <ul class=\"navlist\">\n");
      out.write("        <li class=\"active\"><a href=\"index.jsp\" id=\"current\">Home</a></li>\n");
      out.write("        <li><a href=\"read\">View Customers</a></li>\n");
      out.write("        <li><a href=\"add\">Add a Customer</a></li>\n");
      out.write("        <li><a href=\"https://www.youtube.com/watch?v=2HQaBWziYvY\">Party?</a></li>\n");
      out.write("    </ul>\n");
      out.write("</div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"main\">\n");
      out.write("                <h1>Customer Database</h1>\n");
      out.write("                <div class=\"d1\">        \n");
      out.write("                    <img src=\"music.jpeg\" width=\"1000px\">\n");
      out.write("                </div>     \n");
      out.write("                </div> <!--main-->\n");
      out.write("                ");
      out.write("<div class=\"footer\">\n");
      out.write("    &copy; Copyright 2015 SoftwareDesignAndDevelopment.com | All rights reserved | Alejandro Murguia-Ortiz\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div> <!-- wrap -->\n");
      out.write("    </body>\n");
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
