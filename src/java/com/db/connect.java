package com.db;

import java.sql.*;
import java.util.Properties;


public class connect {

    public Connection conn() {
        Connection con = null;
        try {
            Driver d = (Driver) (Class.forName("oracle.jdbc.OracleDriver")
                    .newInstance());
            Properties pro = new Properties();
            pro.put("user", "system");
            pro.put("password", "pass");
            con = d.connect("jdbc:oracle:thin:@127.0.0.1:1521:xe", pro);

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public boolean Check(String UserName, String pwd) {
        boolean result = false;

        try {
            Connection cn = conn();
            PreparedStatement ps = cn.prepareCall("Select * from EUSER where UserName=? and password=?");
            ps.setString(1, UserName);
            ps.setString(2, pwd);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                result = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

    }
    public String getUserType(String UserName) {
        String result = "";

        try {
            Connection cn = conn();
            PreparedStatement ps = cn.prepareCall("Select TYPE from EUSER where UserName=?");
            ps.setString(1, UserName);
         
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                result = rs.getString("Type");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

    }

}
