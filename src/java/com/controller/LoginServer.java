package com.controller;

import com.db.connect;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "loginServer", urlPatterns = {"/loginServer"})
public class LoginServer extends HttpServlet {

    public void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection con;
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(true);
        try (PrintWriter out = response.getWriter()) {
            connect obj = new connect();
            con = obj.conn();
            boolean check = obj.Check(request.getParameter("UserName"), request.getParameter("password"));

            if (check) {

                String username = (String) request.getParameter("UserName");
                session.setAttribute("UserName", username);
                session.setAttribute("Type", obj.getUserType(username));
                if (check && obj.getUserType(username).equals("Admin")) {
                    response.sendRedirect("AdminHome.jsp");
                } else if (check) {
                    response.sendRedirect("ViewOrders.jsp");
                }
            } else {
                request.setAttribute("errorMessage", "Invalid Login Details");
                request.getRequestDispatcher("Login.jsp").forward(request, response);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
