package com.demo.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
       Class.forName("com.mysql.jdbc.Driver");
		
		String user_name="root";
		String password="Sinchana@26";
		String url="jdbc:mysql://localhost:3306/SCEM_DB";
		
		Connection con=DriverManager.getConnection(url,user_name,password);
		Statement st=con.createStatement();
		//update
		//String query="update Student set city='Kolkata' where id='121'";
		//insert
		//String query="insert into Student values(151,'E','Mumbai')";
		//delete
		//String query="delete from student where id='151'";
		//Taking query from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the query");
		String query=sc.nextLine();  //duplicates are allowed i should type query in console
		//if i give select*from student in console it will give exception because it is non select operation
		//when we donno the type of operation of query we should use execute()
		boolean result=st.execute(query);
		//int result=st.executeUpdate(query); //return type is integer
		if(result==true) {
			ResultSet rs=st.getResultSet();//statement obj is reposible to take obj from container(Result set)
			while(rs.next())
			{
				System.out.println("ID: "+rs.getInt(1)+"Name: "+rs.getString(2)+"City: "+rs.getString(3));
			}//select operation
		}
			else {//non select operation
				int result1=st.getUpdateCount();
				System.out.println(result1);
			}
		con.close();

	}

}
