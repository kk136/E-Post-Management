

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

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Orders</title>
    </head>
    <style type="text/css">
    body, td, th {
        font-size: 18px;
    }
    body {
        padding-top: 65px;
    }
</style>
    <%
        String userType = (String) session.getAttribute("Type");

        if (userType.equals("Admin")) {
            RequestDispatcher rd = request.getRequestDispatcher("AdminHome.jsp");
            rd.forward(request, response);
        }
    %>
    <body>
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
        <div class="container">
            <div class="wrapper">
                <h2>Orders</h2>
                <table id = "proTable" class="table table-striped">
                    <thead>
                        <tr>
                            <th>Product Name</th>
                            <th>Product Description </th>
                            <th>Price </th>
                        </tr>
                    </thead>
                </table>

                <h2>Recharges</h2>
                <table id = "recTable" class="table table-striped">
                    <thead>
                        <tr>
                            <th>Operator Name</th>
                            <th>Mobile Number</th>
                            <th>Amount</th>
                        </tr>
                    </thead>
                </table>


            </div>
        </div>

        <script>
            var selected = [];
            var table;
            $(document).ready(function () {
                $('.dropdown-toggle').dropdown();
                table = $('#proTable').DataTable(
                        {
                            "paging": false,
                            select: true,
                            "processing": true,
                            ajax: {
                                "url": "ViewOrder",
                                "dataSrc": "ResponseData",
                                "type": "POST"
                            }
                        });
                        
                        $('#recTable').DataTable(
                        {
                            "paging": false,
                            select: true,
                            "processing": true,
                            ajax: {
                                "url": "RechargeOrders",
                                "dataSrc": "ResponseData",
                                "type": "POST"
                            }
                        });

            });
        </script>
    </body>
</html>
