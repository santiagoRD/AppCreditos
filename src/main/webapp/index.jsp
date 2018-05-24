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

    <title>Jumbotron Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${pageContext.servletContext.contextPath}/css/home.css" rel="stylesheet">
  </head>

  <body>

    <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
      <a class="navbar-brand" href="#">Navbar</a>
      

      <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Link</a>
          </li>
          <li class="nav-item">
            <a class="nav-link disabled" href="#">Disabled</a>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="http://example.com" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Dropdown</a>
            <div class="dropdown-menu" aria-labelledby="dropdown01">
              <a class="dropdown-item" href="#">Action</a>
              <a class="dropdown-item" href="#">Another action</a>
              <a class="dropdown-item" href="#">Something else here</a>
            </div>
          </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
          <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
          <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
      </div>
    </nav>

    <main role="main">

      <!-- Main jumbotron for a primary marketing message or call to action -->

      <br>
      <br>
      
      <div class="container">
        <!-- Example row of columns -->
        <form method="post"
              action="${pageContext.servletContext.contextPath}/UsuarioServlet">
                <div class="form-row">
                            <div class="col">
                                <input name="txtdocumento" type="text" 
                                       class="form-control" 
                                       placeholder="Documento">
                            </div>
                            <div class="col"></div>
                        </div>
                        <div class="form-row">
                            <div class="col">
                                <input name="txtnombres" type="text" 
                                       class="form-control" 
                                       placeholder="Nombres">
                            </div>
                            <div class="col">
                                <input name="txtapellidos" type="text" 
                                       class="form-control" 
                                       placeholder="Apellidos">
                            </div>

                        </div>
                        <div class="form-row">
                            <div class="col">
                                <input name="txtnumcred" type="text" 
                                       class="form-control" 
                                       placeholder="numero credito">
                            </div>

                        </div>
                        <div class="form-row">
                            <div class="col">
                                <select name="txtmonto" id="inputState" class="form-control">
                                    <option value="activo" selected>500</option>
                                    <option value="inactivo" >3000</option>
                                </select>
                            </div>
                            <div class="col">
                                <select name="txttipotrab" id="inputState" class="form-control">
                                    <option value="activo" selected>Independiente</option>
                                    <option value="inactivo" >Dependiente</option>
                                </select>
                            </div>
                            <div class="col">
                                <select name="txttipocred" id="inputState" class="form-control">
                                    <option value="administrador" selected>Vivienda</option>
                                    <option value="consulta" >Estudio</option>
                                    <option value="visitante" >Libre inversion</option>
                                </select>
                            </div>
                            <div class="col">
                                <select name="txttrabaja" id="inputState" class="form-control">
                                    <option value="activo" selected>Si</option>
                                    <option value="inactivo" >No</option>
                                </select>
                            </div>

                        </div>
                        <div class="form-row">
                            <div class="col">
                                <button name="accion" value="crear" 
                                        type="submit" 
                                         class="btn btn-primary">
                                     Registrar</button>
                            </div>

                        </div>
        </form>
      </div> <!-- /container -->

    </main>

    <footer class="container">
      <p>&copy; Company 2017-2018</p>
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

