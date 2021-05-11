<%-- 
    Document   : usuarioCU
    Created on : 07-may-2021, 18:53:45
    Author     : mira
--%>

<%@page import="eventoswebapp.entity.UsuarioEventos"%>
<%@page import="eventoswebapp.entity.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestion del Usuario</title>
        <%
            Usuario admin = (Usuario) request.getSession().getAttribute("usuario");
            String log = admin.getEmail();
            Usuario usu = (Usuario) request.getAttribute("usuario");
            String email = "", nombre = "",password="", apellidos = "", ciudad = "", domicilio = "",
                    sexo = "", id = "", rol = "", edad = "";
            if (usu != null) {
                id = usu.getUsuarioId().toString();
                email = usu.getEmail();
                rol = usu.getRol().toString();
                password =usu.getPassword();
                UsuarioEventos usuEventos = usu.getUsuarioEventos();
                if (usuEventos != null) {
                    nombre = usuEventos.getNombre();
                    apellidos = usuEventos.getApellidos();
                    ciudad = usuEventos.getCiudad();
                    domicilio = usuEventos.getDomicilio();
                    sexo = usuEventos.getSexo().toString();
                    edad = usuEventos.getEdad().toString();
                }
            }
        %>
    </head>
    <body>
        <h1>Estas logeado como ( <%=log%> )</h1>
        <h2>Panel de Datos de Usuario</h2>

        <form method="POST" action="GuardarUsuario"  >
            <input type="hidden" name="id" value="<%=id%>"><br>
            <label for="email" >Email</label><br>
            <input type="text" name="email" value="<%=email%>"><br
            <label for="password" >Contraseña</label><br>
            <input type="text" name="password" value="<%=password%>"><br>
            <label for="rol">Rol</label><br>
            <input type="text"  name="rol" value="<%=rol%>"><br><br><br>
            <label for="nombre" >Nombre</label><br>
            <input type="text" name="nombre" value="<%=nombre%>"><br>
            <label for="apellidos">Apellidos</label><br>
            <input type="text"  name="apellidos" value="<%=apellidos%>"><br>
            <label for="edad" >Edad</label><br>
            <input type="text" name="edad" value="<%=edad%>"><br>
            <label for="sexo">Sexo</label><br>
            <input type="text"  name="sexo" value="<%=sexo%>"><br>
            <label for="ciudad" >Ciudad</label><br>
            <input type="text" name="ciudad" value="<%=ciudad%>"><br>
            <label for="domicilio">Domicilio</label><br>
            <input type="text"  name="domicilio" value="<%=domicilio%>"><br><br>
            <input type="submit" value="Guardar">
        </form>
        <button><a href="ListarUsuarios">Cancelar</a></button>
    </body>
</html>
