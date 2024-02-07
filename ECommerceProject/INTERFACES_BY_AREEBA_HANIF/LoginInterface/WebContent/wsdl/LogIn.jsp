<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" />
    <title>LOGIN PAGE</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <form  action="loginPage.jsp">
        <nav class="navbar navbar-expand-lg navbar-light">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">
                    <img src="logo2.png" width="100" height="90" />
                </a>

                <ul class="navbar-nav mr-auto"></ul>
                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <a class="nav-link" href="./index.html"><i class="fas fa-home"></i> Home</a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="./shop.html">
                            <i class="fa fa-shopping-bag"></i> Shop</a>
                    </li>
                    <li class="nav-item active">
                       
                        <a class="nav-link" href="/SignUpInterFace/WebContent/wsdl/Signup.jsp">
                            <i class="fas fa-user-plus"></i> Sign Up</a>
                    </li>
                </ul>
            </div>
        </nav>
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                    <h2>Login</h2>
                    <p>Please fill out this form to login</p>

                    <div class="form-group">
                        <label >Email</label>
                        <input type="email" name="email" id="email" placeholder="Your Email" class="form-control form-control-lg" required />
                    </div>

                    <div class="form-group">
                        <label >Password</label>
                        <input type="password" class="form-control form-control-lg" placeholder="Password"
                            name="password" id="password" required/>
                    </div>

                    <button type="submit"  class="btn btn-primary btn-block" id="Login" >LogIn</button>
                    <br />
                    <span>Don't have an account
                       
                        <a class="linkControl" href="http://localhost:8080/SignUpInterFace/wsdl/Signup.jsp" >Register here</a></span>
                    <br />
                    <a href="">Forgot password ?</a>

                    <br />
                    <h3>OR</h3>
                    <a href="" class="btn btn-primary">Sign-In with google </a>
                </div>
            </div>
        </div>
    </form>
</body>
</html>
