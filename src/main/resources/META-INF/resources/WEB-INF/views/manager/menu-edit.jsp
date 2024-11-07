<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<form action="/manager/restaurant/save" method="post">
    <input type="hidden" name="itemId" value="${menu.itemId}" />

	<label for="first"> Anh? </label> 
	<input type="text"  name="image" placeholder="Enter your Username" required value="${menu.image}"> 
	<label for="text"> Ten mon an </label> 
	<input type="text" name="itemName" placeholder="Enter your Password" required value="${menu.itemName}">
	<label for="first"> Gia </label> 
	<input type="text" id="first" name="price" placeholder="Enter your Username" required value="${menu.price}"> 
	<label for="text"> Loai </label> 
	<input type="text" name="type" placeholder="Enter your Password" required value="${menu.type}">
	<label for="first"> Mo ta </label> 
	<input type="text" name="description" placeholder="Enter your Username" required value="${menu.description}"> 
	<label for="text"> Available </label> 
	<input type="text" name="available" placeholder="Enter your Password" required value="${menu.available}">

	<div class="wrap">
		<button type="submit" onclick="solve()">Hoan thanh</button>
	</div>
	
</form>
	