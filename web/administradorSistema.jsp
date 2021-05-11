<%-- 
    Document   : administradorSistema
    Created on : 07-may-2021, 9:45:57
    Author     : mira
--%>

<%@page import="eventoswebapp.entity.UsuarioEventos"%>
<%@page import="javax.persistence.Table"%>
<%@page import="eventoswebapp.entity.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #ddddd1;
}
</style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administracion del Sistema</title>
        
        <% 
           Usuario usuario;
           List<Usuario> lista_usuarios;
           usuario = (Usuario) session.getAttribute("usuario");
           lista_usuarios = (List<Usuario>) request.getAttribute("lista");
        %>
    </head>
    <body>
        <h1>Bienvenido usuario administrador ( <%= usuario.getEmail() %> )</h1>
        
        <table>
            <tr>
                <td>ID</td>
                <td>Email</td>
                <td>Rol</td>
                <td>Nombre</td>
                <td>Apellidos</td>
                <td>Edad</td>
                <td>Sexo</td>
                <td>Ciudad</td>
                <td>Domicilio</td>
                <td>Borrar Usuario</td>
                <td>Editar Usuario</td>
            </tr>
        <%  for(Usuario usu : lista_usuarios){
            UsuarioEventos usuEvento = usu.getUsuarioEventos();
        %>
        
             
            <tr>
                <td><%= usu.getUsuarioId() %></td>
                <td><%= usu.getEmail() %></td>
                <td><%= usu.getRol()%></td>
                <td><%= usuEvento!=null ? usuEvento.getNombre() : ""%></td>
                <td><%= usuEvento!=null ? usuEvento.getApellidos() :"" %></td>
                <td><%= usuEvento!=null ? usuEvento.getEdad():"" %></td>
                <td><%= usuEvento!=null ? usuEvento.getSexo():"" %></td>
                <td><%= usuEvento!=null ? usuEvento.getCiudad() : "" %></td>
                <td><%= usuEvento!=null ? usuEvento.getDomicilio() : "" %></td>
                <td>
                    <a href="">Borrar</a>
                </td>
                <td>
                    <a href="EditarUsuario?id=<%=usu.getUsuarioId()%>" >Editar</a>
                </td>
            </tr>
        
        <%
            }
        %>
        </table>
        <button> <a href="CrearUsuario"> Crear Usuario</a> </button>
        
        <br>
         <a href="Salir">Salir del sistema</a> <br/> 
    </body>
    
</html>
