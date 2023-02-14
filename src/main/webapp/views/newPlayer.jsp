<%-- 
    Document   : newPlayer
    Created on : Feb 13, 2023, 11:51:48 PM
    Author     : zico
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>User: <c:out value = "${newPlayer.name}"/> </h1>
        <span >ID: <c:out value = "${newPlayer.id}"/> </span>
        </br>
        <span >ID: <c:out value = "${newPlayer.joiningDate}"/> </span>
        
        </br>
        <a href="/full/players">Ver todo los registros en la DB</a>
    </body>
</html>
