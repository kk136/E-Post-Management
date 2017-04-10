package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ChangePassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/TopBar.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<link href=\"css/form.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"js/jquery-1.11.3.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/validator.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Change Password</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("    body, td, th {\n");
      out.write("        font-size: 18px;\n");
      out.write("    }\n");
      out.write("    body {\n");
      out.write("        padding-top: 65px;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("            <div class=\"navbar-header\"> <a class=\"navbar-brand\" href=\"#\">E-Post</a></div>\n");
      out.write("            <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li><a href=\"Product.jsp\">Product</a></li>\n");
      out.write("                    <li><a href=\"MobileOperators.jsp\">Mobile Operators</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    ");

                        String username = (String) session.getAttribute("UserName");
                        session.setAttribute("UserName", username);

                        if (username == null) {
                    
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <p class=\"navbar-text\">Already have an account?</p>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle \" data-toggle=\"dropdown\"><strong>Login</strong> <span class=\"caret\"></span></a>\n");
      out.write("                        <ul id=\"login-dp\" class=\"dropdown-menu\">\n");
      out.write("                            <li>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <form class=\"form\" role=\"form\" method=\"post\" action=\"/Epost_Web/loginServer\" accept-charset=\"UTF-8\" id=\"login-nav\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label class=\"sr-only\" for=\"exampleInputEmail2\">Email address</label>\n");
      out.write("                                                <input type=\"text\" name =\"UserName\" class=\"form-control\" id=\"exampleInputEmail2\" placeholder=\"UserName\" required>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label class=\"sr-only\" for=\"exampleInputPassword2\">Password</label>\n");
      out.write("                                                <input type=\"password\" class=\"form-control\" name=\"password\" id=\"exampleInputPassword2\" placeholder=\"Password\" required>\n");
      out.write("                                                <div class=\"help-block text-right\"><a href=\"\">Forget the password ?</a></div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-primary btn-block\">Sign in</button>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </form>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    ");
 } else {
                    
      out.write("\n");
      out.write("                    <li><p class=\"navbar-text\">Welcome </p></li>\n");
      out.write("                    <li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle \" data-toggle=\"dropdown\"><strong>");
      out.print(username);
      out.write("</strong> <span class=\"caret\"></span></a>\n");
      out.write("                        <ul  class=\"dropdown-menu\">\n");
      out.write("                            <li><a href=\"ViewOrders.jsp\">View Orders</a></li>\n");
      out.write("                            <li><a href=\"ChangePassword.jsp\">Change Password</a></li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li><a href=\"LogOut\">Logout</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.navbar-collapse -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container-fluid -->\n");
      out.write("    </nav>\n");
      out.write("        <div class=\"container \" id =\"form\">\n");
      out.write("            <div class=\"row centered-form wrapper\">\n");
      out.write("                <div class=\"form-register\">        \n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <form action=\"ChangePassword\" method=\"post\" role=\"form\" data-toggle=\"validator\">   \n");
      out.write("                            <h3 class=\"form-signin-heading\">Change Password</h3>\n");
      out.write("                            <hr class=\"colorgraph\"><br>\n");
      out.write("                            <div>\n");
      out.write("                                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"password\" class=\"form-control\" name=\"CPassword\" placeholder=\"Current Password\" required autofocus />\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input name=\"Npassword\" type=\"password\" required class=\"form-control\" id=\"inputPassword\" placeholder=\"Password\" data-minlength=\"6\">\n");
      out.write("                                \n");
      out.write("                            </div>\t  \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"password\" class=\"form-control\" id=\"inputPasswordConfirm\" data-match=\"#inputPassword\" data-match-error=\"These don't match\" placeholder=\"Confirm\" required>\n");
      out.write("                                <div class=\"help-block with-errors\"></div>\n");
      out.write("                                <div class=\"help-block\">\n");
      out.write("                                    <h5>Minimum of 6 characters</h5>\n");
      out.write("                                </div>\n");
      out.write("                            </div>  \n");
      out.write("\n");
      out.write("                            <button class=\"btn btn-lg btn-primary btn-block\"  name=\"Submit\" value=\"Login\" type=\"Submit\">Login</button>  \t\n");
      out.write("                            <div class=\"bottom text-center\"> New here ? <a href=\"Register.html\"><b>Join Us</b></a></div>\n");
      out.write("\n");
      out.write("                        </form>\t\t\t\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
