<!-- InstanceBegin template="/Templates/Top Bar.dwt" codeOutsideHTMLIsLocked="false" -->
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/TopBar.css" rel="stylesheet" type="text/css">
<link href="css/form.css" rel="stylesheet" type="text/css">


<style type="text/css">
    body, td, th {
        font-size: 18px;
    }
    body {
        padding-top: 65px;
    }
</style>

<body>
    
    <%@ page session="true" %>





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

    <div class="container " id ="form">
        <div class="row centered-form wrapper">
            <div class="form-register">        
                <div class="panel-body">
                    <form action="/Epost_Web/RegisterServer" method="post" role="form" data-toggle="validator">
                    <h3 class="form-signin-heading">Register Now <small>Its Free</small></h3>
			  <hr class="colorgraph"><br>
                          <div class="form-group">
                            <input type="text" name="UserName" class="form-control " placeholder="UserName" required>
                        </div>
                          <div class="form-group">
                            <input type="email" name="email" id="email" class="form-control " placeholder="Email Address" required>
                        </div>
                        <div class="row">
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group">
                                    <input type="text" name="first_name" id="first_name" class="form-control " placeholder="First Name" required>
                                </div>
                            </div>
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group">
                                    <input type="text" name="last_name" id="last_name" class="form-control " placeholder="Last Name" required>
                                </div>
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <input type="text" name="address" class="form-control " placeholder="Address" required>
                        </div>
                        <div class="row">
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group">
                                    <input type="text" name="Country" id="Country" class="form-control " placeholder="Country" required>
                                </div>
                            </div>
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group">
                                    <input type="text" name="State" id="State" class="form-control " placeholder="State" required>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-6 col-sm-6 col-md-6">
                              <div class="form-group">
                                <input type="number" name="pin_code" id="fax_number" class="form-control " placeholder="Pin Code">
                              </div>
                            </div>
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group">
                                    <input type="number"  name="phone_number" id="phone_number" class="form-control " placeholder="Phone Number"  required>
                                </div>
                            </div>
</div>
                        <div class="row">
                            <div class="col-md-5">
                                <div class="form-group">
                                    <h4>Date of Birth </h4>
                                </div>
                            </div>
                            <div class="col-md-7">
                                <div class="form-group">
                                    <input type="date" name="DOB" id="date" class="form-control"  required>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-5">
                                <div class="form-group">
                                    <h4>Gender</h4>
                                </div>
                            </div>
                            <div class="col-md-7">
                                <label class="radio-inline">
                                    <input name="gender" type="radio" required value="Male">
                                    Male</label>
                                <label class="radio-inline">
                                    <input name="gender" type="radio" required value="Female">
                                    Female</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group">
                                    <input name="password" type="password" required class="form-control" id="inputPassword" placeholder="Password" data-minlength="6">
                                    <div class="help-block">
                                        <h5>Minimum of 6 characters</h5>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <div class="form-group">
                                    <input type="password" class="form-control" id="inputPasswordConfirm" data-match="#inputPassword" data-match-error="These don't match" placeholder="Confirm" required>
                                    <div class="help-block with-errors"></div>
                                </div>
                            </div>
                        </div>
                        <input type="submit" value="Register" class="btn btn-info btn-block">
                    </form>
                </div>
            </div>
        </div>
    </div>
    <script src="js/validator.js" type="text/javascript"></script>
    <!-- InstanceEndEditable -->
<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="js/bootstrap.js" type="text/javascript"></script>
</body>
<!-- InstanceEnd -->