package com.demo.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class Demo5 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");  // Updated driver
        String user_name = "root";
        String password = "Sinchana@26";
        String url = "jdbc:mysql://localhost:3306/SCEM_DB";

        Connection con = DriverManager.getConnection(url, user_name, password);

        CallableStatement cst = con.prepareCall("{call getStudent(?,?)}");  //procedure name
        cst.setInt(1, 131);
        //cst.setString(2, "Kolkata");
        cst.registerOutParameter(2, Types.VARCHAR);
        cst.execute();
        System.out.println("Name: "+cst.getString(2));

        con.close();
    }
}
