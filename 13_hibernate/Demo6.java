package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo6 {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.jdbc.Driver");
		
		String user_name="root";
		String password="Sinchana@26";
		String url="jdbc:mysql://localhost:3306/SCEM_DB";
		
		Connection con=DriverManager.getConnection(url,user_name,password);
		
		Statement st=con.createStatement();
		
		String query1="insert into Student values(888,'Parneet','shimla')";
		String query2="delete from student where id=777";
		String query3="update Student set city='Pune' where id=131";
		
		st.addBatch(query1);
		st.addBatch(query2);           //when we encounter exception/error before that line queries will be executed after that error we will not get any output
		st.addBatch(query3);           //with help of batch updat ewe can group them and send them at once 
		
		int result[]=st.executeBatch();
		
		con.close();

	}

}
