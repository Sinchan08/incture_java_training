package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo4 {
	public static void main(String[] args)throws ClassNotFoundException, SQLException {
	       Class.forName("com.mysql.jdbc.Driver");
			
			String user_name="root";
			String password="****";
			String url="jdbc:mysql://localhost:3306/SCEM_DB";
			
			Connection con=DriverManager.getConnection(url,user_name,password);
			//String query="insert into Student values(161,'S','Chennai')";
			String query="insert into Student values(?,?,?)";
			PreparedStatement p=con.prepareStatement(query);
			p.setInt(1, 765);
			p.setString(2, "L");
			p.setString(3, "Banglore");
			int result=p.executeUpdate();
			System.out.println(result);
			con.close();
}
}