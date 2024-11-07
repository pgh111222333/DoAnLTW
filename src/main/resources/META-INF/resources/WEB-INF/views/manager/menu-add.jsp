<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<form action="/manager/restaurant/insert" method="post">
	<label for="first"> Anh? </label> 
	<input type="text"  name="image" placeholder="Enter your Username" required> 
	<label for="text"> Ten mon an </label> 
	<input type="text" name="itemName" placeholder="Enter your Password" required>
	<label for="first"> Gia </label> 
	<input type="text" id="first" name="price" placeholder="Enter your Username" required> 
	<label for="text"> Loai </label> 
	<input type="text" name="type" placeholder="Enter your Password" required>
	<label for="first"> Mo ta </label> 
	<input type="text" name="description" placeholder="Enter your Username" required> 
	<label for="text"> Available </label> 
	<input type="text" name="available" placeholder="Enter your Password" required>

	<div class="wrap">
		<button type="submit" onclick="solve()">Them mon</button>
	</div>
	
</form>
	