<%-- 
    Document   : index
    Created on : 16 feb. 2023, 08:30:16
    Author     : ESTUDIANTE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hola careximbas</h1>
        <form action="MiServlet" method="post">
            <label>Digite usuario:</label>
            <input type="email" name="txtusuario" required="" placeholder="asda@correo.com"/>
            <label>Digite clave:</label>
            <input type="password" name="txtclave" required=""/>
            <input type="submit" name="btnreg" value="Send">
            <input type="reset" name="brnreset"/>
        </form>
    </body>
</html>
