package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!-- InstanceBegin template=\"/Templates/Top Bar.dwt\" codeOutsideHTMLIsLocked=\"false\" --><!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/TopBar.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"css/form.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("    body, td, th {\r\n");
      out.write("        font-size: 18px;\r\n");
      out.write("    }\r\n");
      out.write("    body {\r\n");
      out.write("        padding-top: 65px;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <nav class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("            <div class=\"navbar-header\"> <a class=\"navbar-brand\" href=\"#\">E-Post</a></div>\r\n");
      out.write("            <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <li><a href=\"Product.jsp\">Product</a></li>\r\n");
      out.write("                    <li><a href=\"MobileOperators.jsp\">Mobile Operators</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                    ");

                        String username = (String) session.getAttribute("UserName");
                        session.setAttribute("UserName", username);

                        if (username == null) {
                    
      out.write("\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <p class=\"navbar-text\">Already have an account?</p>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle \" data-toggle=\"dropdown\"><strong>Login</strong> <span class=\"caret\"></span></a>\r\n");
      out.write("                        <ul id=\"login-dp\" class=\"dropdown-menu\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-md-12\">\r\n");
      out.write("                                        <form class=\"form\" role=\"form\" method=\"post\" action=\"/Epost_Web/loginServer\" accept-charset=\"UTF-8\" id=\"login-nav\">\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label class=\"sr-only\" for=\"exampleInputEmail2\">Email address</label>\r\n");
      out.write("                                                <input type=\"text\" name =\"UserName\" class=\"form-control\" id=\"exampleInputEmail2\" placeholder=\"UserName\" required>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label class=\"sr-only\" for=\"exampleInputPassword2\">Password</label>\r\n");
      out.write("                                                <input type=\"password\" class=\"form-control\" name=\"password\" id=\"exampleInputPassword2\" placeholder=\"Password\" required>\r\n");
      out.write("                                                <div class=\"help-block text-right\"><a href=\"\">Forget the password ?</a></div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-primary btn-block\">Sign in</button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"bottom text-center\"> New here ? <a href=\"Register.html\"><b>Join Us</b></a></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    ");
 } else {
                    
      out.write("\r\n");
      out.write("                    <li><p class=\"navbar-text\">Welcome </p></li>\r\n");
      out.write("                    <li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle \" data-toggle=\"dropdown\"><strong>");
      out.print(username);
      out.write("</strong> <span class=\"caret\"></span></a>\r\n");
      out.write("                        <ul  class=\"dropdown-menu\">\r\n");
      out.write("                            <li><a href=\"ViewOrders.jsp\">View Orders</a></li>\r\n");
      out.write("                            <li><a href=\"ChangePassword.jsp\">Change Password</a></li>\r\n");
      out.write("                            <li class=\"divider\"></li>\r\n");
      out.write("                            <li><a href=\"LogOut\">Logout</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    ");
 }
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.navbar-collapse -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.container-fluid -->\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- InstanceBeginEditable name=\"EditRegion1\" -->\r\n");
      out.write("    <div class = \"container\">\r\n");
      out.write("        <div class=\"wrapper\">\r\n");
      out.write("            <form action=\"/Epost_Web/addProduct\" method=\"post\" name=\"Item_form\" class=\"form-signin\">\r\n");
      out.write("                <h3 class=\"form-signin-heading\">Add a Product</h3>\r\n");
      out.write("                <hr class=\"colorgraph\">\r\n");
      out.write("                <br>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"ProName\" placeholder=\"Name\" required=\"\" autofocus />\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <textarea name=\"ProDesc\" rows=\"5\" class=\"form-control\" id=\"comment\" placeholder=\"Description\"></textarea>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"number\"  name=\"price\"  class=\"form-control \" placeholder=\"Price\"  required>\r\n");
      out.write("                </div>\r\n");
      out.write("                <button class=\"btn btn-lg btn-primary btn-block\"  name=\"Submit\" value=\"Login\" type=\"Submit\">Add</button>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- InstanceEndEditable -->\r\n");
      out.write("    <script src=\"js/jquery-1.11.3.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.js\" type=\"text/javascript\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("<!-- InstanceEnd -->");
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
