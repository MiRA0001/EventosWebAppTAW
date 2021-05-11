<%-- 
    Document   : menu
    Created on : 29-abr-2021, 11:20:13
    Author     : migue
--%>



<%@page import="eventoswebapp.entity.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu</title>
    </head>
    <body>
    <%
        Usuario usuario = (Usuario)session.getAttribute("usuario");
        
        if (usuario == null) {
            response.sendRedirect("login.jsp");  
            return;
        }
    %> 
       
       <h1>Bienvenido, <%= usuario.getUsuarioEventos()!=null 
               ? usuario.getUsuarioEventos().getNombre() : 
               usuario.getEmail() %>, al sistema
       </h1> 
       <br>        
               
       
    <%
        switch (usuario.getRol()) 
        {
            case 1://Administrador del sistema 
                
    %> 
    <h2>
        Administrador del Sistema
    </h2>
    <%
                    break;
            case 2://Creador de eventos  
    %>
    <h2>
        Creador de Eventos
    </h2>
                
    <%
                    break;
            case 3://Analistas de eventos  
    %> 
    
    <%
                    break;
            case 4://Usuario de eventos  
    %>
    
    <%
                    break;
            case 5://Teleoperadores  
    %>   
        <h1>Menu Teleoperadores:</h1> 
        <a href="ConversacionesListar">Ver conversaciones</a> <br/>
    <%
                    break;
            default:  
    %>
        <h1>Su ROL no esta definido, consulte con su administrador</h1>
    <%
                     break;
        }
    %>      
         <a href="Salir">Salir del sistema</a> <br/> 
    </body>
</html>