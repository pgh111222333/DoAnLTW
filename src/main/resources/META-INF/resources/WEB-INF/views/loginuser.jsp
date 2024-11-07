<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="style.css">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link href="https://fonts.googleapis.com/css2?family=Jomhuria&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Alata&display=swap" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	
	<script>
        window.onload = function() {
            const urlParams = new URLSearchParams(window.location.search);
            const alertMessage = urlParams.get('alert');
            if (alertMessage) {
                alert(alertMessage); // Hiển thị thông báo nếu có
            }
        };
    </script>
        <style>
				html, body {
				    height: 100%;
				    margin: 0;
				    font-family: 'Jomhuria', cursive;
				}
				
				body {
				    background: url('/img/another.jpg') lightgray 50% / cover no-repeat;
				    display: flex;
				    justify-content: center;
				}
				
				#Login_Text {
				    color: #FFF;
				    font-family: Jomhuria;
				    font-size: 128px;
				    font-weight: 400;
				    line-height: normal;
				    letter-spacing: 10.24px;
				    margin-top: 144px;
				    text-align: center;
				    display: flex;
				    height: 176px;
				    flex-direction: column;
				    justify-content: center;
				}
				
				.login-container {
				    display: flex;
				    width: 400px;
				    flex-direction: column;
				    align-items: center;
				}
				
				#userEmail, #userPassword {
				    display: flex;
				    width: 400px;
				    height: 40px;
				    flex-direction: column;
				    justify-content: center;
				    align-self: stretch;
				    color: #e9e9e9;
				    font-family: Alata;
				    font-size: 20px;
				    letter-spacing: 3.8px;
				    margin-top: 30px;
				}
				
				#userEmail::placeholder, #userPassword::placeholder {
				    color: #ffffff;
				    text-align: center;
				    font-family: Alata;
				    font-size: 20px;
				    letter-spacing: 3.8px;  
				}
				
				.line {
				    width: 400px;
				    height: 2px;
				    background-color: white;
				}
				
				.login-input {
				    background: transparent;
				    border: none;
				}
				
				.forgotPassword {
				    display: flex;
				    justify-content: space-between;
				    align-items: center;
				    align-self: stretch;
				}
				
				#forgotPasswordLink, #registerLink {
				    display: flex;
				    height: 24px;
				    color: #b6b6b6;
				    font-family: Alata;
				    font-size: 13px;
				    letter-spacing: 2.47px;
				    text-decoration: underline;
				}
				
				.btnLogin {
				    margin-top: 20px;
				    display: flex;
				    width: 400px;
				    height: 50px;
				    justify-content: center;
				    align-items: center;
				    border-radius: 15px;
				    background: #FFF;
				    color: #000;
				    font-family: Alata;
				    font-size: 30px;
				}
				
				#form-check {
				    margin-top: 20px;
				}

    </style>
    
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-8"></div>
            <div class="col">
                <div class="login-container">
                    <div id="Login_Text">
                        Login
                    </div>
                    <form class="input"  method="Post">
                        <div class="login-input">
                            <input type="text" class="login-input" id="userEmail" aria-describedby="emailHelp" placeholder="Enter email/username" name="username">
                            <div class="line"></div>
                        </div>
                        <div class="login-input">
                            <input type="password" class="login-input" id="userPassword" placeholder="Password" name="password" >
                            <div class="line"></div>
                        </div>
                        <div class="forgotPassword">
                            <a id="forgotPasswordLink" href="https://www.facebook.com/huy222s/" target="forgotPasswordLink">Forgotten password</a>
                            <a id="registerLink" href="/restaurant/register">Register</a>
                        </div>
                        <div class="form-check">
                            <input type="checkbox" class="form-check-input" id="exampleCheck1">
                            <label class="form-check-label" for="exampleCheck1">Remember me</label>
                        </div>
                        <button type="submit" class="btnLogin">Login</button>
                    </form>
                </div> 
            </div>
        </div>
    </div>
</body>
</html>
