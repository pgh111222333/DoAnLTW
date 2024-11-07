<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User xem menu</title>
</head>
<body>
   <a>Menu</a>
<table border="1">
    <tr>
        <th style="text-align: center;">STT</th>
        <th style="text-align: center;">Image</th>
        <th style="text-align: center;">Item name</th>
        <th style="text-align: center;">Price</th>
        <th style="text-align: center;">Type</th>
        <th style="text-align: center;">Description</th>
        <th style="text-align: center;">Available</th> 
    </tr>
    
    <c:forEach items="${menuList}" var="item" varStatus="stt">
        <tr>
            <td>${stt.index + 1}</td>
            <td>${item.image}</td>
            <td>${item.itemName}</td>
            <td>${item.price}</td>
            <td>${item.type}</td>
            <td>${item.description}</td>
            <td>${item.available}</td>
            

        </tr>
    </c:forEach>
</table>






</body>
</html>
