package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Recharge_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("    \n");
      out.write("    <!DOCTYPE html>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/datatables.css\">\n");
      out.write("    <link href=\"css/buttons.dataTables.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link href=\"css/select.dataTables.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/TopBar.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"css/form.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <script src=\"js/jquery-1.11.3.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/datatables.js\"></script>\n");
      out.write("    <script src=\"js/dataTables.select.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"js/dataTables.buttons.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        body, td, th {\n");
      out.write("            font-size: 18px;\n");
      out.write("        }\n");
      out.write("        body {\n");
      out.write("            padding-top: 65px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
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
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"bottom text-center\"> New here ? <a href=\"Register.html\"><b>Join Us</b></a></div>\n");
      out.write("                                </div>\n");
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
      out.write("\n");
      out.write("        <div class = \"container\">\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("                <form action=\"/Epost_Web/Recharge\" method=\"POST\" name=\"Recharge_form\" class=\"form-signin\">\n");
      out.write("                    <h3 class=\"form-signin-heading\">Recharge</h3>\n");
      out.write("                    <hr class=\"colorgraph\">\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"text\" id=\"OpName\" class=\"form-control\" name=\"OpName\" placeholder=\"Mobile Operator Name\" readonly=\"readonly\" autofocus />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"number\"  class=\"form-control\" name=\"PhoneNo\" placeholder=\"Mobile Number\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <input type=\"number\"  class=\"form-control\" name=\"RecAmt\" placeholder=\"Recharge Amount\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <h4> <center> Card Details </center></h4>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"card-holder-name\" id=\"card-holder-name\" placeholder=\"Card Holder's Name\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                            <input type=\"number\" class=\"form-control\"  id=\"card-number\" placeholder=\"Debit/Credit Card Number\">\n");
      out.write("                       \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-xs-6 col-sm-6 col-md-6\">\n");
      out.write("                                    <select class=\"form-control col-sm-2\" name=\"expiry-month\" id=\"expiry-month\">\n");
      out.write("                                        <option>Month</option>\n");
      out.write("                                        <option value=\"01\">Jan (01)</option>\n");
      out.write("                                        <option value=\"02\">Feb (02)</option>\n");
      out.write("                                        <option value=\"03\">Mar (03)</option>\n");
      out.write("                                        <option value=\"04\">Apr (04)</option>\n");
      out.write("                                        <option value=\"05\">May (05)</option>\n");
      out.write("                                        <option value=\"06\">June (06)</option>\n");
      out.write("                                        <option value=\"07\">July (07)</option>\n");
      out.write("                                        <option value=\"08\">Aug (08)</option>\n");
      out.write("                                        <option value=\"09\">Sep (09)</option>\n");
      out.write("                                        <option value=\"10\">Oct (10)</option>\n");
      out.write("                                        <option value=\"11\">Nov (11)</option>\n");
      out.write("                                        <option value=\"12\">Dec (12)</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                               <div class=\"col-xs-6 col-sm-6 col-md-6\">\n");
      out.write("                                    <select class=\"form-control\" name=\"expiry-year\">\n");
      out.write("                                        <option>Year</option>\n");
      out.write("                                        \n");
      out.write("                                        <option value=\"17\">2017</option>\n");
      out.write("                                        <option value=\"18\">2018</option>\n");
      out.write("                                        <option value=\"19\">2019</option>\n");
      out.write("                                        <option value=\"20\">2020</option>\n");
      out.write("                                        <option value=\"21\">2021</option>\n");
      out.write("                                        <option value=\"22\">2022</option>\n");
      out.write("                                        <option value=\"23\">2023</option>\n");
      out.write("                                        <option value=\"24\">2023</option>\n");
      out.write("                                        <option value=\"25\">2023</option>\n");
      out.write("                                        <option value=\"26\">2023</option>\n");
      out.write("                                        <option value=\"27\">2023</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                     \n");
      out.write("                        \n");
      out.write("                            <input type=\"number\" class=\"form-control\" name=\"cvv\" id=\"cvv\" placeholder=\"Security Code\">\n");
      out.write("                       \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <button class=\"btn btn-lg btn-primary btn-block\"  name=\"Submit\" value=\"Login\" type=\"Submit\">Recharge</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Recharge</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            var pair = window.location.search.substring(1).split(\"=\");\n");
      out.write("            var opSelect = pair[1];\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('.dropdown-toggle').dropdown();\n");
      out.write("                document.getElementById(\"OpName\").value = opSelect;\n");
      out.write("\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        </script>\n");
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
