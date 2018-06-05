<%-- 
    Document   : mensaje
    Created on : 30/05/2018, 09:56:41 AM
    Author     : SANTIAGO
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../../../favicon.ico">

        <title>Mensaje</title>

        <!-- Bootstrap core CSS -->
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="${pageContext.servletContext.contextPath}/css/home.css" rel="stylesheet">

    </head>

    <body>

        <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
            <a class="navbar-brand" href="${pageContext.servletContext.contextPath}/index.jsp">App Creditos</a>
            <a class="navbar-brand" href="${pageContext.servletContext.contextPath}/RegistroServlet?accion=listar">Listar</a>
            <a class="navbar-brand" href="${pageContext.servletContext.contextPath}/RegistroServlet?accion=creditoMasUsado">Credito mas solicitado</a>
            <a class="navbar-brand" href="${pageContext.servletContext.contextPath}/RegistroServlet?accion=valorAcumulado">Credito con mayor numero de prestamos</a>
            <a class="navbar-brand" href="${pageContext.servletContext.contextPath}/RegistroServlet?accion=prestamos">Mayores prestadores</a>
        </nav>
        <h3>
            <c:out value="${sessionScope.MENSAJE}"></c:out><br>
            <a href="${pageContext.servletContext.contextPath}/index.jsp">Regresar</a>
        </h3>


        <footer class="container">
            <p>&copy;Politecnico JIC 2018-I</p>
        </footer>

        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery-slim.min.js"><\/script>')</script>
        <script src="../../assets/js/vendor/popper.min.js"></script>
        <script src="../../dist/js/bootstrap.min.js"></script>
    </body>
</html>

