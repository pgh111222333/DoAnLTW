<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Manager xem Table List</title>
</head>
<body>
   <a href="">Them Ban</a>
<table border="1">
    <tr>
        <th style="text-align: center;">STT</th>
        <th style="text-align: center;">TableID</th>
        <th style="text-align: center;">Status</th>
        <th style="text-align: center;">Status</th>
        <th style="text-align: center;">TableNumber</th>           
    </tr>
    
    <c:forEach items="${tableList}" var="table" varStatus="stt">
        <tr>
            <td>${stt.index + 1}</td>
            <td>${table.tableId}</td>
            <td>${table.status}</td>
            <td>${table.status}</td>
            <td>${table.tableNumber}</td>
            <td>
                <a href="">Sửa</a> | 
				<a href="">Xóa</a>   
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
