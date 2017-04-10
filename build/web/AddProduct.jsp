<!-- InstanceBegin template="/Templates/Top Bar.dwt" codeOutsideHTMLIsLocked="false" --><!DOCTYPE html>

<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/TopBar.css" rel="stylesheet" type="text/css">
<link href="css/form.css" rel="stylesheet" type="text/css">


<%@ page session="true" %>

<style type="text/css">
    body, td, th {
        font-size: 18px;
    }
    body {
        padding-top: 65px;
    }
</style>



<body>
    <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header"> <a class="navbar-brand" href="#">E-Post</a></div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li><a href="Product.jsp">Product</a></li>
                    <li><a href="MobileOperators.jsp">Mobile Operators</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <%
                        String username = (String) session.getAttribute("UserName");
                        session.setAttribute("UserName", username);

                        if (username == null) {
                    %>
                    <li>
                        <p class="navbar-text">Already have an account?</p>
                    </li>
                    <li class="dropdown"><a href="#" class="dropdown-toggle " data-toggle="dropdown"><strong>Login</strong> <span class="caret"></span></a>
                        <ul id="login-dp" class="dropdown-menu">
                            <li>
                                <div class="row">
                                    <div class="col-md-12">
                                        <form class="form" role="form" method="post" action="/Epost_Web/loginServer" accept-charset="UTF-8" id="login-nav">
                                            <div class="form-group">
                                                <label class="sr-only" for="exampleInputEmail2">Email address</label>
                                                <input type="text" name ="UserName" class="form-control" id="exampleInputEmail2" placeholder="UserName" required>
                                            </div>
                                            <div class="form-group">
                                                <label class="sr-only" for="exampleInputPassword2">Password</label>
                                                <input type="password" class="form-control" name="password" id="exampleInputPassword2" placeholder="Password" required>
                                                <div class="help-block text-right"><a href="">Forget the password ?</a></div>
                                            </div>
                                            <div class="form-group">
                                                <button type="submit" class="btn btn-primary btn-block">Sign in</button>
                                            </div>

                                        </form>
                                    </div>
                                    <div class="bottom text-center"> New here ? <a href="Register.jsp"><b>Join Us</b></a></div>
                                </div>
                            </li>
                        </ul>
                    </li>
                    <% } else {
                    %>
                    <li><p class="navbar-text">Welcome </p></li>
                    <li class="dropdown"><a href="#" class="dropdown-toggle " data-toggle="dropdown"><strong><%=username%></strong> <span class="caret"></span></a>
                        <ul  class="dropdown-menu">
                            <li><a href="ViewOrders.jsp">View Orders</a></li>
                            <li><a href="ChangePassword.jsp">Change Password</a></li>
                            <li class="divider"></li>
                            <li><a href="LogOut">Logout</a></li>
                        </ul>
                    </li>
                    <% }%>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>


    <!-- InstanceBeginEditable name="EditRegion1" -->
    <div class = "container">
        <div class="wrapper">
            <form action="/Epost_Web/addProduct" method="post" name="Item_form" class="form-signin">
                <h3 class="form-signin-heading">Add a Product</h3>
                <hr class="colorgraph">
                <br>
                <div class="form-group">
                    <input type="text" class="form-control" name="ProName" placeholder="Name" required="" autofocus />
                </div>
                <div class="form-group">
                    <textarea name="ProDesc" rows="5" class="form-control" id="comment" placeholder="Description"></textarea>
                </div>
                <div class="form-group">
                    <input type="number"  name="price"  class="form-control " placeholder="Price"  required>
                </div>
                <button class="btn btn-lg btn-primary btn-block"  name="Submit" value="Login" type="Submit">Add</button>
            </form>
        </div>
    </div>
    <!-- InstanceEndEditable -->
    <script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
    <script src="js/bootstrap.js" type="text/javascript"></script>
</body>
<!-- InstanceEnd -->