/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.model.RegisterServer;
import com.db.connect;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "addOperator", urlPatterns = {"/addOperator"})
public class addOperator extends HttpServlet {

    public void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection con;
        response.setContentType("text/html;charset=UTF-8");

        connect obj = new connect();
        con = obj.conn();
        int i;

        try {
            PreparedStatement ps = con.prepareStatement("insert into EMOBILE values(?,?)");

            ps.setString(1, request.getParameter("OpName"));
            ps.setString(2, request.getParameter("OpDesc"));

            i = ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(RegisterServer.class.getName()).log(Level.SEVERE, null, ex);
        }

        RequestDispatcher rd = request.getRequestDispatcher("MobileOperators.jsp");
        rd.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
