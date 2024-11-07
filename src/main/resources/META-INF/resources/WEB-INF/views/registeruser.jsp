<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>




<html lang="en">
<head>
    <link rel="stylesheet" href="style.css">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="/css/login.css">
    <link href="https://fonts.googleapis.com/css2?family=Jomhuria&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Alata&display=swap" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

	<style>	
		#registerName {
    height: 36px; 
    align-self: stretch; 
    color: #000000; 
    font-family: "Javanese Text"; 
    font-size: 20px;
    font-style: normal;
    font-weight: 400;
    line-height: normal;
    border: none;
    outline: none;
}
#register-title {
    height: 81px;
    width: 100%; 
    display: flex;
    justify-content: center;  
    align-items: center;      
    color: #000000;
    text-align: center;
    font-family: "Javanese Text";
    font-size: 48px;
    font-weight: 400;
    letter-spacing: 3.84px;
}
.signup-form-container {
    display: flex;
    width: 370px;
    flex-direction: column;
    align-items: center;
    gap: 26px;
    position: absolute;
    left: 78px;
    top: 11.5px;
}
.form-label {
    height: 40px;
    align-self: stretch;
    color: #000;
    font-family: "Javanese Text";
    font-size: 24px;
    font-style: normal;
    font-weight: 400;
    line-height: normal;
}

.input {
    display: flex;
    flex-direction: column;
    align-items: flex-start;
    gap: 10px;
    align-self: stretch;
}

#registerName {
    height: 36px; 
    align-self: stretch; 
    color: #000000; 
    font-family: "Javanese Text"; 
    font-size: 20px;
    font-style: normal;
    font-weight: 400;
    line-height: normal;
    border: none;
    outline: none;
}

#registerEmail {
    height: 36px; 
    align-self: stretch; 
    color: #000000; 
    font-family: "Javanese Text"; 
    font-size: 20px;
    font-style: normal;
    font-weight: 400;
    line-height: normal;
    border: none;
    outline: none;
}

#registerPassword {
    height: 36px; 
    align-self: stretch; 
    color: #000000; 
    font-family: "Javanese Text"; 
    font-size: 20px;
    font-style: normal;
    font-weight: 400;
    line-height: normal;
    border: none;
    outline: none;
}

.signupButton {
    
    display: flex;
    width: 100%;
    padding: 1px 0px 13px 0px;
    justify-content: center;
    align-items: center;
    align-self: stretch;
    border-radius: 15px;
    background: #1877F2;
    border: none;
    outline: none;
}


	</style>
</head>    



<form action="/restaurant/registerUser" method="post">
<!-- 	<label for="first"> Username: </label> 
	<input type="text"  name="username" placeholder="Enter your Username" required> 
	<label for="password"> Password: </label> 
	<input type="password" name="password" placeholder="Enter your Password" required>
	<label for="first"> Name: </label> 
	<input type="text" id="first" name="name" placeholder="Enter your Username" required> 
	<label for="password"> Email: </label> 
	<input type="text" name="email" placeholder="Enter your Password" required>
	<label for="first"> Phone: </label> 
	<input type="text" name="phone" placeholder="Enter your Username" required> 
	<label for="password"> Age: </label> 
	<input type="text" name="age" placeholder="Enter your Password" required>
CUA KHANH LAM -->


	<div id="signup-popup-container">
	        <div class="signup-form-container">
	            <a id="register-title">Register</a>
	            <form id="signup-input">
	                <div class="input">
	                    <label for="registerName" class="form-label">Name</label>
	                    <input type="text" class="form-control" id="registerName" placeholder="Enter your name"  name="name" required>
	                </div>
	                <div class="input">
	                    <label for="registerEmail" class="form-label">Email/Username</label>
	                    <input type="text" class="form-control" id="registerEmail" placeholder="Enter your email/username" name="username" required>
	                </div>
	                <div class="input">
	                    <label for="confirmPassword" class="form-label">Password</label>
	                    <input type="password" class="form-control" id="registerPassword" placeholder="Enter your password" name="password"  required>
	                </div>
	                <button type="submit" class="signupButton">Sign Up</button>
	            </form>
	        </div>
	    </div>
	
</form>
	
	
	