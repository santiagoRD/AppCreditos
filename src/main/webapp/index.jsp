<%-- 
    Document   : index
    Created on : 23/05/2018, 08:02:15 PM
    Author     : SANTIAGO
--%>

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
            </div>

      <br>
      <br>
      
      <div class="container">
        <!-- Example row of columns -->
        <form method="post"
              action="${pageContext.servletContext.contextPath}/RegistroServlet">
                
                <div class="form-row">
                            <div class="col">
                                <input name="txtdocumento" type="text" id="inputState" class="form-control"
                                       class="form-control"  required
                                       placeholder="Documento">
                            </div>
                            <div class="col"></div>
                        </div>
                        <div class="form-row">
                            <div class="col">
                                <input name="txtnombres" type="text" id="inputState" class="form-control"
                                       class="form-control" required 
                                       placeholder="Nombres">
                            </div>
                            <div class="col">
                                <input name="txtapellidos" type="text" id="inputState" class="form-control"
                                       class="form-control" required 
                                       placeholder="Apellidos">
                            </div>

                        </div>
                        <div class="form-row">
                            <div class="col-md-6">
                                <input name="txtnumcred" type="text" id="inputState" required
                                       class="form-control" 
                                       placeholder="numero credito">
                            </div>

                        </div>
                        <div class="form-row">
                            <div class="col-md-6">
                                <select name="txtmonto" id="inputState" class="form-control" required>
                                    <option value="" selected>Monto</option>
                                    <option value="500">500</option>
                                    <option value="1000">1000</option>
                                    <option value="1500">1500</option>
                                    <option value="2000">2000</option>
                                    <option value="2500">2500</option>
                                    <option value="3000" >3000</option>
                                </select>
                            </div>
                            <div class="col-md-6">
                                <select name="txttipotrab" id="inputState" class="form-control" required>
                                    <option value="" selected>Tipo Trabajo</option>
                                    <option value="Independiente" >Independiente</option>
                                    <option value="Dependiente" >Dependiente</option>
                                </select>
                            </div>
                            <div class="col-md-6">
                                <select name="txttipocred" id="inputState" class="form-control" required>
                                    <option value="" selected>Tipo Credito</option>
                                    <option value="Vivienda" >Vivienda</option>
                                    <option value="Estudio" >Estudio</option>
                                    <option value="Libre Inversion" >Libre inversion</option>
                                </select>
                            </div>
                            <div class="col-md-6">
                                <select name="txttrabaja" id="inputState" class="form-control" required>
                                    <option value="" selected>Trabaja</option>
                                    <option value="Si" >Si</option>
                                    <option value="No" >No</option>
                                </select>
                            </div>

                        </div>
                <br>
                
                        <div class="form-row">
                            <div class="col">
                                <center>
                                <button name="accion" value="crear" 
                                        type="submit" 
                                         class="btn btn-primary">
                                     Registrar</button>
                                    </center>
                            </div>

                        </div>
        </form>
      </div> <!-- /container -->

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

