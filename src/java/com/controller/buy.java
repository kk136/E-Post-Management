/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.db.connect;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "buy", urlPatterns = {"/buy"})
public class buy extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection con;
        connect obj = new connect();
        con = obj.conn();
        HttpSession session = request.getSession(true);
        String user = ((String) session.getAttribute("UserName"));
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO BUYPRODUCT(NAME, DESCRIPTION,PRICE)\n"
                    + "SELECT NAME, DESCRIPTION,PRICE FROM EPRODUCT\n"
                    + "WHERE NAME=?");
            ps.setString(1, request.getParameter("name"));
            ps.executeUpdate();
            
            ps = con.prepareStatement("UPDATE BUYPRODUCT set USERNAME=? where USERNAME IS NULL");
            ps.setString(1, user);
            ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

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
