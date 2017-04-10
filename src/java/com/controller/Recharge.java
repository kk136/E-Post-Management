/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.db.connect;
import com.model.RegisterServer;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author kk
 */
@WebServlet(name = "Recharge", urlPatterns = {"/Recharge"})
public class Recharge extends HttpServlet {

    public void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Connection con;
        response.setContentType("text/html;charset=UTF-8");

        connect obj = new connect();
        con = obj.conn();

        HttpSession session = request.getSession(true);
        String user = ((String) session.getAttribute("UserName"));


        try {
            PreparedStatement ps = con.prepareStatement("insert into MOBREC values(?,?,?,?)");

            ps.setString(1, request.getParameter("OpName"));
            ps.setString(2, request.getParameter("PhoneNo"));
            ps.setString(3, request.getParameter("RecAmt"));
            ps.setString(4, user);

            ps.executeUpdate();
             
            request.getRequestDispatcher("ViewOrders.jsp").forward(request, response);

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
