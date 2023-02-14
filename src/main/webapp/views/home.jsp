<%-- 
    Document   : home
    Created on : Feb 13, 2023, 11:00:42 PM
    Author     : zico
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="date" class="java.util.Date" /> 
        <p>日期为：<%= date %>
            
        <form action="players" method="post">
            
            <label>Jugador</label>
            <br/>
            <input type="text" name="nombre" placeholder="Ingrese el nombre del jugador">
            <br/>
            <label>Fecha de Admision</label>
           
            <br/><!-- breakline -->
            
            <input type="text" name="fecha" placeholder="Ingrese la fecha de admision del jugador"/>
            <br/>
            <input type="submit" value="Submit"/>
        </form>

    </body>
</html>
