/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.db.connect;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RegisterServer", urlPatterns = {"/RegisterServer"})
public class RegisterServer extends HttpServlet {

    public void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection con;
        response.setContentType("text/html;charset=UTF-8");
       
            connect obj = new connect();
            con = obj.conn();
            int i;

            try {
                PreparedStatement ps = con.prepareStatement("insert into EUSER values(?,?,?,?,?,?,?,?,?,?,?,?,?)");

                ps.setString(1, request.getParameter("first_name"));
                ps.setString(2, request.getParameter("last_name"));
                ps.setString(3, request.getParameter("email"));
                ps.setString(4, request.getParameter("address"));
                ps.setString(5, request.getParameter("Country"));
                ps.setString(6, request.getParameter("State"));
                ps.setString(7, request.getParameter("phone_number"));
                ps.setString(8, request.getParameter("pin_code"));
                ps.setString(9, request.getParameter("DOB"));
                ps.setString(10, request.getParameter("gender"));
                ps.setString(11, request.getParameter("password"));
                ps.setString(12, request.getParameter("UserName"));
                ps.setString(13, "user");

                i = ps.executeUpdate();

            } catch (SQLException ex) {
                Logger.getLogger(RegisterServer.class.getName()).log(Level.SEVERE, null, ex);
            }
          

        
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
    public void doGet(HttpServletRequest request, HttpServletResponse response)
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
    public void doPost(HttpServletRequest request, HttpServletResponse response)
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
