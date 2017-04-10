<html>
    <%@page contentType="text/html" pageEncoding="UTF-8"%>
    <!DOCTYPE html>

    <link rel="stylesheet" type="text/css" href="css/datatables.css">
    <link href="css/buttons.dataTables.min.css" rel="stylesheet" type="text/css"/>
    <link href="css/select.dataTables.min.css" rel="stylesheet" type="text/css"/>
    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/TopBar.css" rel="stylesheet" type="text/css">
    <link href="css/form.css" rel="stylesheet" type="text/css">
    <script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
    <script src="js/bootstrap.js" type="text/javascript"></script>
    <script type="text/javascript" src="js/datatables.js"></script>
    <script src="js/dataTables.select.min.js" type="text/javascript"></script>
    <script src="js/dataTables.buttons.min.js" type="text/javascript"></script>

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

        <div class = "container">
            <div class="wrapper">
                <form action="/Epost_Web/Recharge" method="POST" name="Recharge_form" class="form-signin">
                    <h3 class="form-signin-heading">Recharge</h3>
                    <hr class="colorgraph">
                    <br>
                    <div class="form-group">
                        <input type="text" id="OpName" class="form-control" name="OpName" placeholder="Mobile Operator Name" readonly="readonly" autofocus />
                    </div>
                    <div class="form-group">
                        <input type="number"  class="form-control" name="PhoneNo" placeholder="Mobile Number"/>
                    </div>
                    <div class="form-group">
                        <input type="number"  class="form-control" name="RecAmt" placeholder="Recharge Amount"/>
                    </div>
                    <h4> <center> Card Details </center></h4>
                    <div class="form-group">
                        <div>
                            <input type="text" class="form-control" name="card-holder-name" id="card-holder-name" placeholder="Card Holder's Name">
                        </div>
                    </div>
                    <div class="form-group">
                            <input type="number" class="form-control"  id="card-number" placeholder="Debit/Credit Card Number">
                       
                    </div>
                    <div class="form-group">
                            <div class="row">
                                <div class="col-xs-6 col-sm-6 col-md-6">
                                    <select class="form-control col-sm-2" name="expiry-month" id="expiry-month">
                                        <option>Month</option>
                                        <option value="01">Jan (01)</option>
                                        <option value="02">Feb (02)</option>
                                        <option value="03">Mar (03)</option>
                                        <option value="04">Apr (04)</option>
                                        <option value="05">May (05)</option>
                                        <option value="06">June (06)</option>
                                        <option value="07">July (07)</option>
                                        <option value="08">Aug (08)</option>
                                        <option value="09">Sep (09)</option>
                                        <option value="10">Oct (10)</option>
                                        <option value="11">Nov (11)</option>
                                        <option value="12">Dec (12)</option>
                                    </select>
                                </div>
                               <div class="col-xs-6 col-sm-6 col-md-6">
                                    <select class="form-control" name="expiry-year">
                                        <option>Year</option>
                                        
                                        <option value="17">2017</option>
                                        <option value="18">2018</option>
                                        <option value="19">2019</option>
                                        <option value="20">2020</option>
                                        <option value="21">2021</option>
                                        <option value="22">2022</option>
                                        <option value="23">2023</option>
                                        <option value="24">2023</option>
                                        <option value="25">2023</option>
                                        <option value="26">2023</option>
                                        <option value="27">2023</option>
                                    </select>
                                </div>
                            </div>
                        
                    </div>
                    <div class="form-group">
                     
                        
                            <input type="number" class="form-control" name="cvv" id="cvv" placeholder="Security Code">
                       
                    </div>

                    <button class="btn btn-lg btn-primary btn-block"  name="Submit" value="Login" type="Submit">Recharge</button>
                </form>
            </div>
        </div>


    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recharge</title>
    </head>
    <body>
        <script>

            var pair = window.location.search.substring(1).split("=");
            var opSelect = pair[1];
            $(document).ready(function () {
                $('.dropdown-toggle').dropdown();
                document.getElementById("OpName").value = opSelect;

            });

        </script>
    </body>
</html>
