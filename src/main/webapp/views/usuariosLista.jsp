<%-- 
    Document   : usuariosLista
    Created on : 30/05/2018, 02:45:01 PM
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

    <title>App Cursos</title>

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

    <main role="main">

      <!-- Main jumbotron for a primary marketing message or call to action -->
        <div class="jumbotron">
                <div class="container">
                    <center>
                        <img src="http://noticias.universia.net.co/net/images/educacion/8/8-/8-c/8-cursos-online-gratuitos-de-harvard-sobre-la-historia-del-libro.jpg" height="125" width="200">
                        <br>
                        <h2>App Creditos</h2>
                        <h3>PROGRAMACIÓN DISTRIBUIDA Y PARALELA</h3>
                        
                    </center>
                    </div>
      <br>
      <br>
      
      <div class="container">
        <!-- Example row of columns -->
            <table class="table">
                        <caption>Lista de Usuarios</caption>
                        <thead>
                            <tr>
                                <th scope="col">Documento</th>
                                <th scope="col">Nombres</th>
                                <th scope="col">Apellidos</th>
                                <th scope="col">Numero Credito</th>
                                <th scope="col">Monto</th>
                                <th scope="col">Tipo Trabajador</th>
                                <th scope="col">Tipo credito</th>
                                <th scope="col">Trabaja en la compañia</th>
                            </tr>
                        </thead>
                        <tbody>
                            
                            <c:forEach var="usuario" items="${sessionScope.LISTADO}">
                               
                                <tr>
                                    <td><c:out value="${usuario.getDocumento()}"/></td>
                                    <td><c:out value="${usuario.getNombres()}"/></td>
                                    <td><c:out value="${usuario.getApellidos()}"/></td>
                                    <td><c:out value="${usuario.getNumCredito()}"/></td>
                                    <td><c:out value="${usuario.getMonto()}"/></td>
                                    <td><c:out value="${usuario.getTipoTrabajador()}"/></td>
                                    <td><c:out value="${usuario.getTipoCredito()}"/></td>
                                    <td><c:out value="${usuario.getTrabajaCompania()}"/></td>
                                </tr>
                                
                            </c:forEach>
                        </tbody>
                    </table>
        
      </div> <!-- /container -->
        </div>

      

    </main>

    <footer class="container">
        <center>
            <br>
            <br>
      <p>&copy;Politecnico JIC 2018-I</p>
      </center>
    </footer>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script>window.jQuery || document.write('<script src="../../../../assets/js/vendor/jquery-slim.min.js"><\/script>')</script>
    <script src="../../../../assets/js/vendor/popper.min.js"></script>
    <script src="../../../../dist/js/bootstrap.min.js"></script>
  </body>
</html>


