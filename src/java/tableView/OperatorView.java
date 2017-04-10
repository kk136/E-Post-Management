package tableView;

import com.db.connect;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "OperatorView", urlPatterns = {"/OperatorView"})
public class OperatorView extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        JsonObject data = null;
        try {
            OpResultSetConverter rsc = new OpResultSetConverter();
            Connection con;

            connect obj = new connect();
            con = obj.conn();
            String query = "Select * from EMOBILE";
            Statement st = con.createStatement();
            ResultSet rSet = st.executeQuery(query);
            data = rsc.RsetToJson(rSet);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        PrintWriter out = response.getWriter();

        out.println(data);
    }
}
