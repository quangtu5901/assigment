<%-- 
    Document   : login
    Created on : Feb 11, 2022, 12:41:33 PM
    Author     : thand
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>create account</title>
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <style>
            .signin {
                text-align: center;
                font-size: 30px;
            }
        </style>

    </head>
    <body>
        <div class="container">
            <form class="well form-horizontal" action="../createaccount" method="POST"  id="contact_form">
                <!-- Form Name -->
                <legend><center><h2><b>Registration</b></h2></center></legend><br>
                <!-- Text input-->

                <div class="form-group row">
                    <label class="col-md-4 control-label">E-Mail</label>  
                    <div class="col-md-4 inputGroupContainer">
                        <div class="input-group">
                            <input name="email" placeholder="E-Mail Address" class="form-control"  type="text">
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-md-4 control-label">phone number</label>  
                    <div class="col-md-4 inputGroupContainer">
                        <div class="input-group">

                            <input name="phone" placeholder="your phone" class="form-control" type="text">
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <label class="col-md-4 control-label">First Name</label>  
                    <div class="col-md-4 inputGroupContainer">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                            <input  name="firstname" placeholder="First Name" class="form-control"  type="text">
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-md-4 control-label" >Last Name</label> 
                    <div class="col-md-4 inputGroupContainer">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                            <input name="lastname" placeholder="Last Name" class="form-control"  type="text">
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-md-4 control-label" >Gender </label> 
                    <div class="col-md-4 inputGroupContainer">
                        <div class="input-group">
                            &nbsp&nbsp<input type="radio" name="gender" value="male"/> Male
                            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp              
                            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                            <input type="radio" name="gender" value="female"/> Female
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <label class="col-md-4 control-label" >Date of birth</label> 
                    <div class="col-md-4 inputGroupContainer">
                        <div class="input-group">
                            <input type="date" name="dob"/> <br/>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-md-4 control-label" >Password</label> 
                    <div class="col-md-4 inputGroupContainer">
                        <div class="input-group">
                            <input name="password" placeholder="Password" class="form-control"  type="password">
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-md-4 control-label" >Confirm Password</label> 
                    <div class="col-md-4 inputGroupContainer">
                        <div class="input-group">
                            <input name="confirm_password" placeholder="Confirm Password" class="form-control"  type="password">
                        </div>
                    </div>
                </div>
                <!-- Button -->
                <div class="form-group row">
                    <div class="col-md-4">
                    </div>
                    <div class="col-md-4"><br>
                        <button type="submit" class="btn btn-warning" >SUBMIT </button>
                    </div>
                </div>
            </form>
            <div class="signin">
                <p>Already have an account? <a href="login.jsp">Sign in</a>.</p>
            </div>
        </div>
    </div>
</body>
</html>
