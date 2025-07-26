package com.demo.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		
		String user_name="root";
		String password="Sinchana@26";
		String url="jdbc:mysql://localhost:3306/SCEM_DB";
		
		Connection con=DriverManager.getConnection(url,user_name,password);
//		if(con!=null)
//		{
//			System.out.println("Connection is established");
//		}
//		else {
//			System.out.println("Connection Failed");
//		}
		//creation of statement object with the help of connection object and it is present in con
		Statement st=con.createStatement();
		//query
		String query="select*from Student";
		//execute the query with help of statement object and store in resultset
		ResultSet rs=st.executeQuery(query);
		//fetch result from resultset using loop
		while(rs.next())
		{
			//System.out.println(rs.getInt(2)+" "+rs.getString(1)+" "+rs.getString(3)); //exception java.sql.SQLDataException
			//System.out.println(rs.getInt(1)+" "+rs.getString(3)+" "+rs.getString(2));//mismatched column
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)); //it wont start from 0 index so for id column 1 so inorder to get integer we will use getInt(),string-getString()
		}
		con.close(); //we should close connection object

	}

}
