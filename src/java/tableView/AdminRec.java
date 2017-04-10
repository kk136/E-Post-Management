/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableView;

import com.db.connect;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kk
 */
@WebServlet(name = "AdminRec", urlPatterns = {"/AdminRec"})
public class AdminRec extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        JsonObject data = null;

        ProResultSetConvertor rsc = new ProResultSetConvertor();
        Connection con;
        connect obj = new connect();
        con = obj.conn();

        try {
            PreparedStatement ps = con.prepareStatement("Select * from MOBREC");

            ResultSet rSet = ps.executeQuery();
            data = rsc.OpRsetToJsonAdmin(rSet);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        PrintWriter out = response.getWriter();
        
        out.println(data);

    }
}
