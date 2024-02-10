<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" />
    <link rel="stylesheet" href="style.css">
    <title>SIGN UP</title>
</head>

<body>
<form action="SignUpResponse.jsp">

        <nav class="navbar navbar-expand-lg navbar-light">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">
                    <img src="logo2.png" width="90" height="70" />
                </a>

                <ul class="navbar-nav mr-auto"></ul>
                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <a class="nav-link" href=""><i class="fas fa-home"></i> Home</a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="">
                            <i class="fa fa-shopping-bag"></i> Shop</a>
                    </li>
                    <li class="nav-item active">
                    <a class="nav-link"  href="./login.html"><i class="fas fa-sign-in-alt"></i> Login</a>
                </li>
                </ul>
            </div>
        </nav><div class="container">
    <div class="col-sm-6">
        <h3 style="margin-top: 10px">Sign Up Now</h3>
        <p>Please fill out this to register</p>
      
            <div class="form-group">
                <label >First Name</label>
                <input type="text" name="firstName" id="firstName"  placeholder="Your Firstname" class="form-control form-control-lg" required>
            </div>
            <div class="form-group">
                <label >Last Name</label>
                <input type="text" name="lastName" id="lastName"  placeholder="Your Lastname" class="form-control form-control-lg">
            </div>
            <div class="form-group">
                <label >Email address</label>
                <input type="email" class="form-control form-control-lg"  minlength="6" placeholder="Email" name="email" id="email" aria-describedby="emailHelp"  required>
                <small id="emailHelp" class="form-text text-muted">We'll never share your email with
                    anyone else.</small>
            </div>
            <div class="form-group">
                <label >Password</label>
                <input type="password" class="form-control form-control-lg" required placeholder="Password" name="password"
                       id="password" required>
            </div>

             <button type="submit"  class="btn btn-primary btn-block" id="Register">Register</button>
            
            <span style="margin-top: 20px">Already have an account <a class="linkControl" href="./login.html">Login here</a></span>
 
  
    </div>
</div>



</form>

</body>
</html>