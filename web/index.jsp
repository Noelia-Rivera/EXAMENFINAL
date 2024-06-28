<%-- 
    Document   : index
    Created on : 27 jun. 2024, 17:59:42
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="recursos/css/bootstrap.min.css"/>
    </head>
         <body class="d-flex justify-content-center align-items-center">
        <div class="container w-25 border border-1 p-5 rounded-5 mt-5">
            <form action="login" method="post">
                <div class="mb-3">
                    <label for="email" class=""> USUARIO:</label>
                    <input type="text" class="form-control" id="email" placeholder="Inserta usuario" name="username">
                </div>
                <div class="mb-3">
                    <label for="password" class=""> CONTRASEÑA:</label>
                    <input type="password" class="form-control" id="password" placeholder="Inserta contraseña" name="clave">
                </div>
                <button type="submit" class="btn btn-primary">Iniciar Sesion</button>
            </form>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

    </body>
</html>
