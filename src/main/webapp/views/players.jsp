<%-- 
    Document   : players
    Created on : Feb 13, 2023, 11:18:46 PM
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
        <h1>Players View Loaded</h1>



        <table border="1" cellpadding="2" cellspacing="2">
            <tr>
                <th>Id</th>
                <th>Nombre</th>
                <th>Fecha de Ingreso</th>
            </tr>
            <c:forEach var="player" items="${players }">

                <tr>
                    <td>${player.id}</td>
                    <td>${player.name}</td>
                    <td>${player.joiningDate}</td>
                </tr>

            </c:forEach>
        </table>
        
        <a href="/full">Crear nuevo registro</a>
    </body>
</html>
