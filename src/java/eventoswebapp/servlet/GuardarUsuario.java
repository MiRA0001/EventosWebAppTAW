/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoswebapp.servlet;

import eventoswebapp.dao.UsuarioEventosFacade;
import eventoswebapp.dao.UsuarioFacade;
import eventoswebapp.entity.Usuario;
import eventoswebapp.entity.UsuarioEventos;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mira
 */
@WebServlet(name = "GuardarUsuario", urlPatterns = {"/GuardarUsuario"})
public class GuardarUsuario extends HttpServlet {

    @EJB
    private UsuarioEventosFacade usuarioEventosFacade;

    @EJB
    private UsuarioFacade usuarioFacade;
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        String email = request.getParameter("email");
        Integer rol = request.getParameter("rol").isEmpty() ? 4 : new Integer(request.getParameter("rol"));
        String password = request.getParameter("password");
        String nombre = request.getParameter("nombre");
        String apellidos = request.getParameter("apellidos");
        char sexo = request.getParameter("sexo").isEmpty() ? 'N' : request.getParameter("sexo").charAt(0);
        Integer edad = request.getParameter("edad").isEmpty() ? 0 : new Integer(request.getParameter("edad"));
        String ciudad = request.getParameter("ciudad");
        String domicilio = request.getParameter("domicilio");
        Usuario usu;
        UsuarioEventos usuEventos;
        boolean crearSoloUsuario=false;
        if(id!=null && !id.isEmpty()){ //Cargamos el usuario
          usu = usuarioFacade.find(new Integer(id));
          usuEventos = usu.getUsuarioEventos();
           if (rol!=4){
               crearSoloUsuario = true;
           }
        }else{ //Creamos uno nuevo
            //Integer newID = usuarioFacade.findLastID()+1;
            usuEventos= new UsuarioEventos();
        }
        
        usuEventos.setEmail(email);
        usuEventos.setRol(rol);
        usuEventos.setPassword(password);
        usuEventos.setNombre(nombre);
        usuEventos.setApellidos(apellidos);
        usuEventos.setSexo(sexo);
        usuEventos.setEdad(edad);
        usuEventos.setCiudad(ciudad);
        usuEventos.setDomicilio(domicilio);
        
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
